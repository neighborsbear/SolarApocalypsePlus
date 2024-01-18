package com.ife.sap.procedures;

import com.ife.sap.network.SapModVariables;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import com.ife.sap.init.SapModBlocks;

public class SandTCDustProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld")))
                && SapModVariables.MapVariables.get(world).SolarFlare >= 1 && SapModVariables.MapVariables.get(world).SolarFlare < 6
                && !(SapModVariables.MapVariables.get(world).TodayTime > 12566 && SapModVariables.MapVariables.get(world).TodayTime < 23450)
                && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z)) && world.dayTime() >= 72000
                && !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER)
                && !world.getLevelData().isRaining() && Mth.nextInt(RandomSource.create(), 1, 10) == 1) {
            world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
            world.setBlock(BlockPos.containing(x, y, z), SapModBlocks.DUST.get().defaultBlockState(), 3);
        }
        if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld")))
                && SapModVariables.MapVariables.get(world).SolarFlare == 3
                && !(SapModVariables.MapVariables.get(world).TodayTime > 12566 && SapModVariables.MapVariables.get(world).TodayTime < 23450)
                && !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER)
                && y >= 63
                && Mth.nextInt(RandomSource.create(), 1, 10) == 2) {
            world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
            world.setBlock(BlockPos.containing(x, y, z), SapModBlocks.DUST.get().defaultBlockState(), 3);
        }
        if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld")))
                && SapModVariables.MapVariables.get(world).SolarFlare >= 4 && SapModVariables.MapVariables.get(world).SolarFlare < 6
                && y >= 8
                && Mth.nextInt(RandomSource.create(), 1, 10) == 4) {
            world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
            world.setBlock(BlockPos.containing(x, y, z), SapModBlocks.DUST.get().defaultBlockState(), 3);
        }
        if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld")))
                && SapModVariables.MapVariables.get(world).SolarFlare == 5
                && y >= 8) {
            world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
        }
    }
}
