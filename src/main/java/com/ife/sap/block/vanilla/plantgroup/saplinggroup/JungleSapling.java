package com.ife.sap.block.vanilla.plantgroup.saplinggroup;

import com.ife.sap.procedures.SmallPlantDeleteProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockState;

public class JungleSapling extends SaplingBlock {

    public JungleSapling(AbstractTreeGrower JungleTreeGrower) {
        super(JungleTreeGrower, Properties.copy(Blocks.ACACIA_SAPLING).randomTicks());
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
