package com.ife.sap.block.vanilla.dirtgroup;

import com.ife.sap.procedures.GrassBlockTCDirtProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.MudBlock;
import net.minecraft.world.level.block.state.BlockState;


public class Mud extends MudBlock {

    public Mud() {
        super(Properties.copy(Blocks.MUD).randomTicks());
    }

        @Override
    public void randomTick(BlockState blockstate, ServerLevel level, BlockPos pos, RandomSource random) {
        super.randomTick(blockstate, level, pos, random);
        Player entity = Minecraft.getInstance().player;
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        GrassBlockTCDirtProcedure.execute(level, x, y, z);
    }

}
