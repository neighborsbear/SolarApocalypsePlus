package com.ife.sap;

import com.ife.sap.init.*;
import com.ife.sap.procedures.*;
import net.minecraft.world.level.block.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Holder.Reference;
import net.minecraft.network.FriendlyByteBuf;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

import com.ife.sap.init.SapModTabs;
import com.ife.sap.init.SapModItems;
import com.ife.sap.init.SapModBlocks;

@Mod("sap")
public class SapMod {
    public static final Logger LOGGER = LogManager.getLogger(SapMod.class);
    public static final String MODID = "sap";

    public SapMod() {
        MinecraftForge.EVENT_BUS.register(this);
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        VanillaBlocks.REGISTRY.register(bus);

        VanillaItems.REGISTRY.register(bus);

        VanillaFluids.FLUIDS.register(bus);

        SapModBlocks.REGISTRY.register(bus);

        SapModItems.REGISTRY.register(bus);

        SapModMobEffects.REGISTRY.register(bus);

        SapModTabs.REGISTRY.register(bus);

    }

    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
    private static int messageID = 0;

    public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
        PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
        messageID++;
    }

    private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

    public static void queueServerWork(int tick, Runnable action) {
        workQueue.add(new AbstractMap.SimpleEntry(action, tick));
    }

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
            workQueue.forEach(work -> {
                work.setValue(work.getValue() - 1);
                if (work.getValue() == 0)
                    actions.add(work);
            });
            actions.forEach(e -> e.getKey().run());
            workQueue.removeAll(actions);
        }
    }

    public static Procedure getProcedure(Block block) {
        Reference<Block> builtInRegistryHolder = block.builtInRegistryHolder();
        //사소한 오브
        if (builtInRegistryHolder.is(SapModTags.Blocks.SIMPLE_DELETE)
                || builtInRegistryHolder.is(BlockTags.REPLACEABLE_BY_TREES)
                || builtInRegistryHolder.is(BlockTags.SWORD_EFFICIENT)
                || builtInRegistryHolder.is(BlockTags.MINEABLE_WITH_HOE)
                || builtInRegistryHolder.is(BlockTags.FLOWERS)
                || builtInRegistryHolder.is(BlockTags.BANNERS)
                || builtInRegistryHolder.is(BlockTags.CANDLES)
                || builtInRegistryHolder.is(BlockTags.CANDLE_CAKES)
                || builtInRegistryHolder.is(BlockTags.BEDS)
                || block instanceof BushBlock
                || block instanceof WaterlilyBlock
                || block instanceof CoralBlock
                || block instanceof CoralPlantBlock
                || block instanceof BaseCoralPlantBlock
                || block instanceof BaseCoralFanBlock
                || block instanceof BaseCoralWallFanBlock
                || block instanceof CoralFanBlock
                || block instanceof CoralWallFanBlock
                || block instanceof CactusBlock
                || block instanceof FrogspawnBlock
                || block instanceof WebBlock
                || block instanceof HoneyBlock
                || block instanceof SlimeBlock) {
            if (!builtInRegistryHolder.is(SapModTags.Blocks.FIRE_RESISTANCE)
                    && !builtInRegistryHolder.is(BlockTags.LEAVES)
                    && !(block instanceof SpongeBlock)
                    && !(block instanceof WetSpongeBlock)
                    && !(block instanceof SculkBlock)
                    && !(block instanceof SculkSensorBlock)
                    && !(block instanceof SculkVeinBlock)
                    && !(block instanceof SculkCatalystBlock)
                    && !(block instanceof SculkShriekerBlock)
                    && !(block instanceof LeavesBlock)) {
                return SimpleDeleteProcedure::execute;
            }
        }
        //작은 식물
        if (builtInRegistryHolder.is(BlockTags.SAPLINGS)
                || block instanceof BambooSaplingBlock
                || block instanceof BambooStalkBlock) {
            if (!builtInRegistryHolder.is(BlockTags.LEAVES)
                    && !builtInRegistryHolder.is(SapModTags.Blocks.FIRE_RESISTANCE)) {
                return SmallPlantDeleteProcedure::execute;
            }
        }
        //불타는계열
        if (builtInRegistryHolder.is(BlockTags.LOGS)
                || builtInRegistryHolder.is(BlockTags.PLANKS)
                || builtInRegistryHolder.is(BlockTags.WOODEN_BUTTONS)
                || builtInRegistryHolder.is(BlockTags.WOODEN_DOORS)
                || builtInRegistryHolder.is(BlockTags.WOODEN_STAIRS)
                || builtInRegistryHolder.is(BlockTags.WOODEN_SLABS)
                || builtInRegistryHolder.is(BlockTags.WOODEN_FENCES)
                || builtInRegistryHolder.is(BlockTags.WOODEN_PRESSURE_PLATES)
                || builtInRegistryHolder.is(BlockTags.WOODEN_TRAPDOORS)
                || builtInRegistryHolder.is(BlockTags.BAMBOO_BLOCKS)
                || builtInRegistryHolder.is(BlockTags.MINEABLE_WITH_AXE)
                || builtInRegistryHolder.is(BlockTags.WOOL)
                || builtInRegistryHolder.is(BlockTags.WOOL_CARPETS)) {
            if (!builtInRegistryHolder.is(SapModTags.Blocks.FIRE_RESISTANCE)
                    && !builtInRegistryHolder.is(BlockTags.LEAVES)) {
                return WoodBlockFProcedure::execute;
            }
        }
        //나뭇잎
        if (builtInRegistryHolder.is(BlockTags.LEAVES)
                || block instanceof LeavesBlock
                || block instanceof CherryLeavesBlock
                || block instanceof MangroveLeavesBlock) {
            if (!builtInRegistryHolder.is(SapModTags.Blocks.FIRE_RESISTANCE)) {
                return WitheredLeavesBlockFProcedure::execute;
            }
        }
        //액체
        if (block instanceof LiquidBlock) {
            return IceMeltProcedure::execute;
        }
        //스폰지
        if (block instanceof SpongeBlock
                || block instanceof WetSpongeBlock) {
            if  (!builtInRegistryHolder.is(SapModTags.Blocks.FIRE_RESISTANCE)) {
                return SpongeDeleteProcedure::execute;
            }
        }

        return null;
    }

    @FunctionalInterface
    public static interface Procedure {
        void call(LevelAccessor world, double x, double y, double z);
    }
}
