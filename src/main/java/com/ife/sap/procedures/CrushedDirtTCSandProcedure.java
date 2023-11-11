package com.ife.sap.procedures;

import com.ife.sap.init.SapModBlocks;
import com.ife.sap.network.SapModVariables;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class CrushedDirtTCSandProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld")))
				&& SapModVariables.MapVariables.get(world).SolarFlare == 1
				&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z)) && world.dayTime() >= 36000
				&& !world.getLevelData().isRaining() && Mth.nextInt(RandomSource.create(), 1, 15) == 1) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.SAND.defaultBlockState(), 3);
		}
	}
}
