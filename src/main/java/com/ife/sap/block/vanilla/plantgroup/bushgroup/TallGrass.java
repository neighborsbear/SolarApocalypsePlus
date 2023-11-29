package com.ife.sap.block.vanilla.plantgroup.bushgroup;

import com.ife.sap.procedures.SimpleDeleteProcedure;
import com.ife.sap.procedures.SmallPlantDeleteProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.BlockState;

public class TallGrass extends DoublePlantBlock {
    public TallGrass() {
        super(Properties.copy(Blocks.TALL_GRASS).randomTicks());
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
        SmallPlantDeleteProcedure.execute(level, x, y, z);
    }
}
