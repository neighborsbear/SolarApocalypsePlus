package com.ife.sap.block.vanilla.icegroup;

import com.ife.sap.procedures.SimpleDeleteProcedure;
import com.ife.sap.procedures.WaterEvaporateProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;

public class Water extends LiquidBlock {

    public Water() {
        super(Properties.copy(Blocks.WATER).randomTicks());
    }

    @Override
    public void randomTick(BlockState blockstate, ServerLevel level, BlockPos pos, RandomSource random) {
        super.randomTick(blockstate, level, pos, random);
        Player entity = Minecraft.getInstance().player;
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        WaterEvaporateProcedure.execute(level, x, y, z);
    }

}