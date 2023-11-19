package com.ife.sap.block.vanilla.plantgroup.leavesgroup;

import com.ife.sap.procedures.WitheredLeavesBlockFProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;

public class FloweringAzaleaLeaves extends LeavesBlock {

    public FloweringAzaleaLeaves() {
        super(Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES).randomTicks());
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        super.randomTick(state, level, pos, random);
        Player entity = Minecraft.getInstance().player;
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        WitheredLeavesBlockFProcedure.execute(level, x, y, z);
    }

}
