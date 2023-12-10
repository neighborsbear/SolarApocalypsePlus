package com.ife.sap.init;


import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PlaceOnWaterBlockItem;
import net.minecraft.world.item.StandingAndWallBlockItem;
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
    //BUSH
    public static final RegistryObject<Item> GRASS = REGISTRY.register("grass", () -> new BlockItem(VanillaBlocks.Grass.get(), new Item.Properties()));
    public static final RegistryObject<Item> TALL_GRASS = REGISTRY.register("tall_grass", () -> new BlockItem(VanillaBlocks.TALL_Grass.get(), new Item.Properties()));
    public static final RegistryObject<Item> FERN = REGISTRY.register("fern", () -> new BlockItem(VanillaBlocks.FERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARGE_FERN = REGISTRY.register("large_fern", () -> new BlockItem(VanillaBlocks.LARGE_FERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> LILY_PAD = REGISTRY.register("lily_pad", () -> new PlaceOnWaterBlockItem(VanillaBlocks.LILY_PAD.get(), new Item.Properties()));
    //CORAL
    public static final RegistryObject<Item> TUBE_CORAL = REGISTRY.register("tube_coral", () -> new BlockItem(VanillaBlocks.TUBE_CORAL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRAIN_CORAL = REGISTRY.register("brain_coral", () -> new BlockItem(VanillaBlocks.BRAIN_CORAL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BUBBLE_CORAL = REGISTRY.register("bubble_coral", () -> new BlockItem(VanillaBlocks.BUBBLE_CORAL.get(), new Item.Properties()));
    public static final RegistryObject<Item> FIRE_CORAL = REGISTRY.register("fire_coral", () -> new BlockItem(VanillaBlocks.FIRE_CORAL.get(), new Item.Properties()));
    public static final RegistryObject<Item> HORN_CORAL = REGISTRY.register("horn_coral", () -> new BlockItem(VanillaBlocks.HORN_CORAL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_TUBE_CORAL = REGISTRY.register("dead_tube_coral", () -> new BlockItem(VanillaBlocks.DEAD_TUBE_CORAL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_BRAIN_CORAL = REGISTRY.register("dead_brain_coral", () -> new BlockItem(VanillaBlocks.DEAD_BRAIN_CORAL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_BUBBLE_CORAL = REGISTRY.register("dead_bubble_coral", () -> new BlockItem(VanillaBlocks.DEAD_BUBBLE_CORAL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_FIRE_CORAL = REGISTRY.register("dead_fire_coral", () -> new BlockItem(VanillaBlocks.DEAD_FIRE_CORAL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_HORN_CORAL = REGISTRY.register("dead_horn_coral", () -> new BlockItem(VanillaBlocks.DEAD_HORN_CORAL.get(), new Item.Properties()));
    public static final RegistryObject<Item> TUBE_CORAL_FAN = REGISTRY.register("tube_coral_fan", () -> new StandingAndWallBlockItem(VanillaBlocks.TUBE_CORAL_FAN.get(), VanillaBlocks.TUBE_CORAL_WALL_FAN.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> BRAIN_CORAL_FAN = REGISTRY.register("brain_coral_fan", () -> new StandingAndWallBlockItem(VanillaBlocks.BRAIN_CORAL_FAN.get(), VanillaBlocks.BRAIN_CORAL_WALL_FAN.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> BUBBLE_CORAL_FAN = REGISTRY.register("bubble_coral_fan", () -> new StandingAndWallBlockItem(VanillaBlocks.BUBBLE_CORAL_FAN.get(), VanillaBlocks.BUBBLE_CORAL_WALL_FAN.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> FIRE_CORAL_FAN = REGISTRY.register("fire_coral_fan", () -> new StandingAndWallBlockItem(VanillaBlocks.FIRE_CORAL_FAN.get(), VanillaBlocks.FIRE_CORAL_WALL_FAN.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> HORN_CORAL_FAN = REGISTRY.register("horn_coral_fan", () -> new StandingAndWallBlockItem(VanillaBlocks.HORN_CORAL_FAN.get(), VanillaBlocks.HORN_CORAL_WALL_FAN.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DEAD_TUBE_CORAL_FAN = REGISTRY.register("dead_tube_coral_fan", () -> new StandingAndWallBlockItem(VanillaBlocks.DEAD_TUBE_CORAL_FAN.get(), VanillaBlocks.DEAD_TUBE_CORAL_WALL_FAN.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DEAD_BRAIN_CORAL_FAN = REGISTRY.register("dead_brain_coral_fan", () -> new StandingAndWallBlockItem(VanillaBlocks.DEAD_BRAIN_CORAL_FAN.get(), VanillaBlocks.DEAD_BRAIN_CORAL_WALL_FAN.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DEAD_BUBBLE_CORAL_FAN = REGISTRY.register("dead_bubble_coral_fan", () -> new StandingAndWallBlockItem(VanillaBlocks.DEAD_BUBBLE_CORAL_FAN.get(), VanillaBlocks.DEAD_BUBBLE_CORAL_WALL_FAN.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DEAD_FIRE_CORAL_FAN = REGISTRY.register("dead_fire_coral_fan", () -> new StandingAndWallBlockItem(VanillaBlocks.DEAD_FIRE_CORAL_FAN.get(), VanillaBlocks.DEAD_FIRE_CORAL_WALL_FAN.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> DEAD_HORN_CORAL_FAN = REGISTRY.register("dead_horn_coral_fan", () -> new StandingAndWallBlockItem(VanillaBlocks.DEAD_HORN_CORAL_FAN.get(), VanillaBlocks.DEAD_HORN_CORAL_WALL_FAN.get(), new Item.Properties(), Direction.DOWN));
    //wall
    public static final RegistryObject<Item> VINE = REGISTRY.register("vine", () -> new BlockItem(VanillaBlocks.VINE.get(), new Item.Properties()));
}