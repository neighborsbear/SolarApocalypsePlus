package com.ife.sap.init;

import com.ife.sap.SapMod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class SapModTags {
    public static class Blocks {
        public static final TagKey<Block> SIMPLE_DELETE = BlockTags.create(new ResourceLocation(SapMod.MODID, "simple_delete"));
        public static final TagKey<Block> FIRE_RESISTANCE = BlockTags.create(new ResourceLocation(SapMod.MODID, "fire_resistance"));
        public static final TagKey<Block> MOIST_DIRT = BlockTags.create(new ResourceLocation(SapMod.MODID, "moist_dirt"));
        public static final TagKey<Block> DIRT = BlockTags.create(new ResourceLocation(SapMod.MODID, "dirt"));
        public static final TagKey<Block> HARD_DIRT = BlockTags.create(new ResourceLocation(SapMod.MODID, "hard_dirt"));
        public static final TagKey<Block> POWDER = BlockTags.create(new ResourceLocation(SapMod.MODID, "powder"));
        public static final TagKey<Block> MOSSY = BlockTags.create(new ResourceLocation(SapMod.MODID, "mossy"));
        public static final TagKey<Block> TNT = BlockTags.create(new ResourceLocation(SapMod.MODID, "tnt"));
        public static final TagKey<Block> DEEPSLATE = BlockTags.create(new ResourceLocation(SapMod.MODID, "deepslate"));
        public static final TagKey<Block> COBBLESTONE = BlockTags.create(new ResourceLocation(SapMod.MODID, "cobblestone"));
        public static final TagKey<Block> SANDSTONE = BlockTags.create(new ResourceLocation(SapMod.MODID, "sandstone"));
        public static final TagKey<Block> CLAY = BlockTags.create(new ResourceLocation(SapMod.MODID, "clay"));
    }
}
