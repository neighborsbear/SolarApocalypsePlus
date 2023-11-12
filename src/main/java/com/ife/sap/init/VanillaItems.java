package com.ife.sap.init;


import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VanillaItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");
    public static final RegistryObject<Item> GRASS_BLOCK = REGISTRY.register("grass_block", () -> new BlockItem(VanillaBlocks.GRASS_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAND = REGISTRY.register("sand", () -> new BlockItem(VanillaBlocks.SAND.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIRT = REGISTRY.register("dirt", () -> new BlockItem(VanillaBlocks.DIRT.get(), new Item.Properties()));
    public static final RegistryObject<Item> COARSE_DIRT = REGISTRY.register("coarse_dirt", () -> new BlockItem(VanillaBlocks.COARSE_DIRT.get(), new Item.Properties()));
}