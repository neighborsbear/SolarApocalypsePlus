package com.ife.sap.init;

import com.ife.sap.block.*;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.ife.sap.SapMod;

public class SapModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SapMod.MODID);
	public static final RegistryObject<Block> CRUSHED_DIRT = REGISTRY.register("crushed_dirt", () -> new CrushedDirtBlock());
	public static final RegistryObject<Block> DUST = REGISTRY.register("dust", () -> new DustBlock());
	public static final RegistryObject<Block> WITHERED_LEAVES = REGISTRY.register("withered_leaves", () -> new WitheredLeavesBlock());
	public static final RegistryObject<Block> HIGH_DENSITY_METAL = REGISTRY.register("high_density_metal", () -> new HighDensityMetalBlock());
	public static final RegistryObject<Block> REDSTONE_COATED_METAL = REGISTRY.register("redstone_coated_metal", () -> new RedstoneCoatedMetalBlock());
	public static final RegistryObject<Block> HEAT_RESISTANT_HIGH_STRENGTH_METAL = REGISTRY.register("heat_resistant_high_strength_metal", () -> new HeatResistantHighStrengthMetalBlock());
	public static final RegistryObject<Block> MEASURING_INSTRUMENT = REGISTRY.register("measuring_instrument", () -> new MeasuringInstrumentBlock());
}
