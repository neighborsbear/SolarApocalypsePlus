package com.ife.sap.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VanillaItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");
    //DIRT
    public static final RegistryObject<Item> GRASS_BLOCK = REGISTRY.register("grass_block", () -> new BlockItem(VanillaBlocks.GRASS_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PODZOL = REGISTRY.register("podzol", () -> new BlockItem(VanillaBlocks.PODZOL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MYCELIUM = REGISTRY.register("mycelium", () -> new BlockItem(VanillaBlocks.MYCELIUM.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROOTED_DIRT = REGISTRY.register("rooted_dirt", () -> new BlockItem(VanillaBlocks.ROOTED_DIRT.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUD = REGISTRY.register("mud", () -> new BlockItem(VanillaBlocks.MUD.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIRT = REGISTRY.register("dirt", () -> new BlockItem(VanillaBlocks.DIRT.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIRT_PATH = REGISTRY.register("dirt_path", () -> new BlockItem(VanillaBlocks.DIRT_PATH.get(), new Item.Properties()));
    public static final RegistryObject<Item> FARMLAND = REGISTRY.register("farmland", () -> new BlockItem(VanillaBlocks.FARMLAND.get(), new Item.Properties()));
    public static final RegistryObject<Item> COARSE_DIRT = REGISTRY.register("coarse_dirt", () -> new BlockItem(VanillaBlocks.COARSE_DIRT.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAND = REGISTRY.register("sand", () -> new BlockItem(VanillaBlocks.SAND.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SAND = REGISTRY.register("red_sand", () -> new BlockItem(VanillaBlocks.RED_SAND.get(), new Item.Properties()));
    //ICE
    public static final RegistryObject<Item> ICE = REGISTRY.register("ice", () -> new BlockItem(VanillaBlocks.ICE.get(), new Item.Properties()));
    public static final RegistryObject<Item> FROSTED_ICE = REGISTRY.register("frosted_ice", () -> new BlockItem(VanillaBlocks.FROSTED_ICE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PACKED_ICE = REGISTRY.register("packed_ice", () -> new BlockItem(VanillaBlocks.PACKED_ICE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_ICE = REGISTRY.register("blue_ice", () -> new BlockItem(VanillaBlocks.BLUE_ICE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SNOW = REGISTRY.register("snow", () -> new BlockItem(VanillaBlocks.SNOW.get(), new Item.Properties()));
    public static final RegistryObject<Item> SNOW_BLOCK = REGISTRY.register("snow_block", () -> new BlockItem(VanillaBlocks.SNOW_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> POWDER_SNOW = REGISTRY.register("powder_snow", () -> new BlockItem(VanillaBlocks.POWDER_SNOW.get(), new Item.Properties()));
    //public static final RegistryObject<Item> WATER = REGISTRY.register("water", () -> new BlockItem(VanillaBlocks.WATER, new Item.Properties()));
    //LEAVES

    //CORAL
    //wall
}