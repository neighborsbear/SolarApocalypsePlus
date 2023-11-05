package com.ife.sap.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

public class DirtTCCoarseDirtProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.dayTime() >= 72000 && !world.getLevelData().isRaining() && Mth.nextInt(RandomSource.create(), 1, 10) == 1) {
            world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
            world.setBlock(BlockPos.containing(x, y, z), Blocks.COARSE_DIRT.defaultBlockState(), 3);
        }
    }
}
