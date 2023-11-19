package com.ife.sap.init;

import com.ife.sap.SapMod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class SapModTags {
    public static class Blocks {
        public static final TagKey<Block> WITHERABLE_LEAVES = BlockTags.create(new ResourceLocation(SapMod.MODID, "witherable_leaves"));
        public static final TagKey<Block> BURN_PLANKS = BlockTags.create(new ResourceLocation(SapMod.MODID, "burn_planks"));
    }
}
