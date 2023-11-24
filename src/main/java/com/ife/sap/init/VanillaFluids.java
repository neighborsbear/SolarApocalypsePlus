package com.ife.sap.init;

import com.ife.sap.block.vanilla.icegroup.Water;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import com.ife.sap.SapMod;

import static com.ife.sap.init.VanillaBlocks.REGISTRY;


public class VanillaFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, "minecraft");
    //public static final Fluid EMPTY = register("empty", new EmptyFluid());
    //public static final FlowingFluid FLOWING_WATER = register("flowing_water", new WaterFluid.Flowing());
    //public static final FlowingFluid WATER = FLUIDS.DeferredRegister("water", () -> new Water.Source());
    //public static final FlowingFluid FLOWING_LAVA = register("flowing_lava", new LavaFluid.Flowing());
    //public static final FlowingFluid LAVA = register("lava", new LavaFluid.Source());

    //public static final RegistryObject<FlowingFluid> WATER = REGISTRY.register("water", () -> new Water().Source());
    //public static final RegistryObject<FlowingFluid> FLOWING_TEEEST = REGISTRY.register("flowing_teeest", () -> new TEEESTFluid.Flowing());



    //
}