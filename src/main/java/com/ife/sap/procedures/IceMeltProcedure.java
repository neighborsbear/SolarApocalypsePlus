package com.ife.sap.procedures;

import com.ife.sap.init.SapModBlocks;
import com.ife.sap.network.SapModVariables;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

public class IceMeltProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld")))
				&& !(SapModVariables.MapVariables.get(world).TodayTime > 12566 && SapModVariables.MapVariables.get(world).TodayTime < 23450)) {
			if ((((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ICE) || ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FROSTED_ICE))) {
				if (Mth.nextDouble(RandomSource.create(), 0, 10) <= (world.dayTime() / 24000) / 1.5
						&& SapModVariables.MapVariables.get(world).SolarFlare == 1 && SapModVariables.MapVariables.get(world).SolarFlare < 6) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.WATER.defaultBlockState(), 3);
				}
				if (Mth.nextDouble(RandomSource.create(), 0, 10) <= (world.dayTime() / 24000) / 1.5
						&& SapModVariables.MapVariables.get(world).SolarFlare >= 2 && SapModVariables.MapVariables.get(world).SolarFlare < 6
						&& y >= 63) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if (Mth.nextDouble(RandomSource.create(), 0, 10) <= (world.dayTime() / 24000) / 1.5
						&& SapModVariables.MapVariables.get(world).SolarFlare >= 2 && SapModVariables.MapVariables.get(world).SolarFlare < 6
						&& y < 63 && y >= 8) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.WATER.defaultBlockState(), 3);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.PACKED_ICE) {
				if (Mth.nextDouble(RandomSource.create(), 0, 15) <= (world.dayTime() / 24000) / 1.5
						&& SapModVariables.MapVariables.get(world).SolarFlare == 2) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.ICE.defaultBlockState(), 3);
				} else if (Mth.nextDouble(RandomSource.create(), 0, 15) <= (world.dayTime() / 24000) / 1.5
						&& SapModVariables.MapVariables.get(world).SolarFlare >= 3 && SapModVariables.MapVariables.get(world).SolarFlare < 6
						&& y >= 63) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.WATER.defaultBlockState(), 3);
				} else if (Mth.nextDouble(RandomSource.create(), 0, 15) <= (world.dayTime() / 24000) / 1.5
						&& SapModVariables.MapVariables.get(world).SolarFlare >= 3 && SapModVariables.MapVariables.get(world).SolarFlare < 6
						&& y < 63 && y >= 8) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.ICE.defaultBlockState(), 3);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BLUE_ICE) {
				if (Mth.nextDouble(RandomSource.create(), 0, 20) <= (world.dayTime() / 24000) / 1.5
						&& SapModVariables.MapVariables.get(world).SolarFlare == 3) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.PACKED_ICE.defaultBlockState(), 3);
				} else if (Mth.nextDouble(RandomSource.create(), 0, 20) <= (world.dayTime() / 24000) / 1.5
						&& SapModVariables.MapVariables.get(world).SolarFlare >= 4 && SapModVariables.MapVariables.get(world).SolarFlare < 6
						&& y >= 63) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.ICE.defaultBlockState(), 3);
				} else if (Mth.nextDouble(RandomSource.create(), 0, 20) <= (world.dayTime() / 24000) / 1.5
						&& SapModVariables.MapVariables.get(world).SolarFlare >= 4 && SapModVariables.MapVariables.get(world).SolarFlare < 6
						&& y < 63 && y >= 8) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.PACKED_ICE.defaultBlockState(), 3);
				}
			}
		}
		if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld")))
				&& SapModVariables.MapVariables.get(world).SolarFlare == 5
				&& y >= 63) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}

