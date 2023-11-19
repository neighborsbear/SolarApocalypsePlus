package com.ife.sap.block.vanilla.dirtgroup;

import com.ife.sap.procedures.GrassBlockTCDirtProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.MyceliumBlock;
import net.minecraft.world.level.block.state.BlockState;


public class Mycelium extends MyceliumBlock {

    public Mycelium() {
        super(Properties.copy(Blocks.MYCELIUM).randomTicks());
    }

        @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        super.randomTick(state, level, pos, random);
        Player entity = Minecraft.getInstance().player;
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        GrassBlockTCDirtProcedure.execute(level, x, y, z);
    }

}
