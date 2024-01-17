package com.ife.sap.init;

import com.ife.sap.item.*;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.ife.sap.SapMod;

public class SapModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SapMod.MODID);
	public static final RegistryObject<Item> CRUSHED_DIRT = block(SapModBlocks.CRUSHED_DIRT);
	public static final RegistryObject<Item> DUST = block(SapModBlocks.DUST);
	public static final RegistryObject<Item> WITHERED_LEAVES = block(SapModBlocks.WITHERED_LEAVES);
	public static final RegistryObject<Item> UV_UMBRELLA = REGISTRY.register("uv_umbrella", () -> new UvUmbrellaItem());



	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
