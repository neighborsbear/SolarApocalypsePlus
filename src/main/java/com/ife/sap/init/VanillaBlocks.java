package com.ife.sap.init;

import com.ife.sap.block.vanilla.dirtgroup.*;
import com.ife.sap.block.vanilla.icegroup.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VanillaBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");
    //DIRT
    public static final RegistryObject<Block> GRASS_BLOCK = REGISTRY.register("grass_block", () -> new GrassBlock());
    public static final RegistryObject<Block> PODZOL = REGISTRY.register("podzol", () -> new Podzol());
    public static final RegistryObject<Block> MYCELIUM = REGISTRY.register("mycelium", () -> new Mycelium());
    public static final RegistryObject<Block> ROOTED_DIRT = REGISTRY.register("rooted_dirt", () -> new RootedDirt());
    public static final RegistryObject<Block> MUD = REGISTRY.register("mud", () -> new Mud());
    public static final RegistryObject<Block> DIRT = REGISTRY.register("dirt", () -> new Dirt());
    public static final RegistryObject<Block> DIRT_PATH = REGISTRY.register("dirt_path", () -> new DirtPath());
    public static final RegistryObject<Block> FARMLAND = REGISTRY.register("farmland", () -> new Farmland());
    public static final RegistryObject<Block> COARSE_DIRT = REGISTRY.register("coarse_dirt", () -> new CoarseDirt());
    public static final RegistryObject<Block> SAND = REGISTRY.register("sand", () -> new Sand());
    public static final RegistryObject<Block> RED_SAND = REGISTRY.register("red_sand", () -> new RedSand());
    //ICE
    public static final RegistryObject<Block> ICE = REGISTRY.register("ice", () -> new Ice());
    public static final RegistryObject<Block> FROSTED_ICE = REGISTRY.register("frosted_ice", () -> new FrostedIce());
    public static final RegistryObject<Block> PACKED_ICE = REGISTRY.register("packed_ice", () -> new PackedIce());
    public static final RegistryObject<Block> BLUE_ICE = REGISTRY.register("blue_ice", () -> new BlueIce());
    public static final RegistryObject<Block> SNOW = REGISTRY.register("snow", () -> new Snow());
    public static final RegistryObject<Block> SNOW_BLOCK = REGISTRY.register("snow_block", () -> new SnowBlock());
    public static final RegistryObject<Block> POWDER_SNOW = REGISTRY.register("powder_snow", () -> new PowderSnow());
    //public static final Block WATER = register("water", () -> new Water(Fluids.WATER, BlockBehaviour.Properties.of().mapColor(MapColor.WATER).replaceable().noCollission().strength(100.0F).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY)));
    public static final RegistryObject<Block> WATER = REGISTRY.register("water", () -> new Water());
    public static final RegistryObject<Block> FLOWING_WATER = REGISTRY.register("flowing_water", () -> new FlowingWater());
    public static final RegistryObject<Block> BUBBLE_COLUMN = REGISTRY.register("bubble_column", () -> new BubbleColumn());
    //LEAVES
    //SAPLING
    //BUSHGROUP
    //UNDERWATER
    ////CORAL
    ////WATERBLOCKS
    //wall

}
