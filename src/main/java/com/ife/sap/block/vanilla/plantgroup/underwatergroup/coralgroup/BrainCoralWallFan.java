package com.ife.sap.block.vanilla.plantgroup.underwatergroup.coralgroup;

import com.ife.sap.init.VanillaBlocks;
import com.ife.sap.procedures.SimpleDeleteProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CoralWallFanBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.PushReaction;

import static net.minecraft.world.level.block.Blocks.BRAIN_CORAL_FAN;
import static net.minecraft.world.level.block.Blocks.DEAD_BRAIN_CORAL_WALL_FAN;

public class BrainCoralWallFan extends CoralWallFanBlock {
    public BrainCoralWallFan() {
        super(VanillaBlocks.DEAD_BRAIN_CORAL_WALL_FAN.get(), Properties.copy(Blocks.BRAIN_CORAL_WALL_FAN).randomTicks());
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        super.randomTick(state, level, pos, random);
        Player entity = Minecraft.getInstance().player;
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        SimpleDeleteProcedure.execute(level, x, y, z);
    }
}
