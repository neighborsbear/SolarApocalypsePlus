package com.ife.sap.block.vanilla.dirtgroup;

import com.ife.sap.procedures.DirtTCCoarseDirtProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DirtPathBlock;
import net.minecraft.world.level.block.state.BlockState;

public class DirtPath extends DirtPathBlock {

    public DirtPath() {
        super(Properties.copy(Blocks.DIRT_PATH).randomTicks());
    }

    @Override
    public void randomTick(BlockState blockstate, ServerLevel level, BlockPos pos, RandomSource random) {
        super.randomTick(blockstate, level, pos, random);
        Player entity = Minecraft.getInstance().player;
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        DirtTCCoarseDirtProcedure.execute(level, x, y, z);
    }

}
