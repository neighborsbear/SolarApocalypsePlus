package com.ife.sap.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class GrassBlockTCDirtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld"))) && world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) >= 10
				&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) && world.dayTime() >= 1000 && !world.getLevelData().isRaining() && Mth.nextInt(RandomSource.create(), 1, 10) == 1) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.DIRT.defaultBlockState(), 3);
		}
	}
}
