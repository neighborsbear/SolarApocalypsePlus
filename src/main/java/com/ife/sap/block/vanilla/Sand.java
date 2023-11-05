package com.ife.sap.block.vanilla;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.util.RandomSource;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;
import net.minecraft.world.level.block.Blocks;
import com.ife.sap.procedures.SandTCDustProcedure;

public class Sand extends FallingBlock {

    public Sand() {
        super(BlockBehaviour.Properties.copy(Blocks.SAND).randomTicks());
    }

    @Override
    public void randomTick(BlockState blockstate, ServerLevel level, BlockPos pos, RandomSource random) {
        super.randomTick(blockstate, level, pos, random);
        Player entity = Minecraft.getInstance().player;
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        SandTCDustProcedure.execute(level, x, y, z);
    }

}
