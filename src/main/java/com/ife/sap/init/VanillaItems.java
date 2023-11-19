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
    //LEAVES
    public static final RegistryObject<Item> ACACIA_LEAVES = REGISTRY.register("acacia_leaves", () -> new BlockItem(VanillaBlocks.ACACIA_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> AZALEA_LEAVES = REGISTRY.register("azalea_leaves", () -> new BlockItem(VanillaBlocks.AZALEA_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_LEAVES = REGISTRY.register("birch_leaves", () -> new BlockItem(VanillaBlocks.BIRCH_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_LEAVES = REGISTRY.register("cherry_leaves", () -> new BlockItem(VanillaBlocks.CHERRY_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_LEAVES = REGISTRY.register("dark_oak_leaves", () -> new BlockItem(VanillaBlocks.DARK_OAK_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLOWERING_AZALEA_LEAVES = REGISTRY.register("flowering_azalea_leaves", () -> new BlockItem(VanillaBlocks.FLOWERING_AZALEA_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_LEAVES = REGISTRY.register("jungle_leaves", () -> new BlockItem(VanillaBlocks.JUNGLE_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_LEAVES = REGISTRY.register("mangrove_leaves", () -> new BlockItem(VanillaBlocks.MANGROVE_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_LEAVES = REGISTRY.register("oak_leaves", () -> new BlockItem(VanillaBlocks.OAK_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_LEAVES = REGISTRY.register("spruce_leaves", () -> new BlockItem(VanillaBlocks.SPRUCE_LEAVES.get(), new Item.Properties()));
}