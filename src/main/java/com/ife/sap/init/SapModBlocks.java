package com.ife.sap.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.ife.sap.block.DustBlock;
import com.ife.sap.block.CrushedDirtBlock;
import com.ife.sap.SapMod;

public class SapModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SapMod.MODID);
	public static final RegistryObject<Block> CRUSHED_DIRT = REGISTRY.register("crushed_dirt", () -> new CrushedDirtBlock());
	public static final RegistryObject<Block> DUST = REGISTRY.register("dust", () -> new DustBlock());
}
