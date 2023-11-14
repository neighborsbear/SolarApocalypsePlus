package com.ife.sap.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import com.ife.sap.network.SapModVariables;

public class GrassBlockTCDirtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (SapModVariables.MapVariables.get(world).SolarFlare == 1) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld")))
					&& !(SapModVariables.MapVariables.get(world).TodayTime > 12566 && SapModVariables.MapVariables.get(world).TodayTime < 23450) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z)) && !world.getLevelData().isRaining()
					&& world.dayTime() >= 1000 && Mth.nextDouble(RandomSource.create(), 0, 10) <= world.dayTime() / 24000 + 1) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y, z), Blocks.DIRT.defaultBlockState(), 3);
			}
		} else if (SapModVariables.MapVariables.get(world).SolarFlare >= 2 && SapModVariables.MapVariables.get(world).SolarFlare < 4) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld"))) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z))) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y, z), Blocks.DIRT.defaultBlockState(), 3);
			}
		}
	}
}

