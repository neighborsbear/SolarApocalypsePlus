package com.ife.sap.procedures.stones;

import com.ife.sap.network.SapModVariables;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

public class StoneTCCobblestoneWallProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (SapModVariables.MapVariables.get(world).SolarFlare >= 2 && SapModVariables.MapVariables.get(world).SolarFlare < 6) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld")))
					&& (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z))
					|| ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.LAVA)
					|| ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.LAVA)
					|| ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.LAVA)
					|| ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.LAVA)
					|| ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.LAVA)
					|| ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.LAVA))
					&& y >= -16
					&& Mth.nextDouble(RandomSource.create(), 0, (world.dayTime() / 24000) + 5) <= (world.dayTime() / 16000)) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.COBBLESTONE_WALL.defaultBlockState(), 3);
			}
		}
		if (SapModVariables.MapVariables.get(world).SolarFlare == 3) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld")))
					&& y >= 63
					&& Mth.nextDouble(RandomSource.create(), 0, (world.dayTime() / 24000) + 5) <= (world.dayTime() / 16000)) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.COBBLESTONE_WALL.defaultBlockState(), 3);
			}
		}
		if (SapModVariables.MapVariables.get(world).SolarFlare >= 4  && SapModVariables.MapVariables.get(world).SolarFlare < 6) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld")))
					&& y >= 8) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.COBBLESTONE_WALL.defaultBlockState(), 3);
			}
		}
	}
}

