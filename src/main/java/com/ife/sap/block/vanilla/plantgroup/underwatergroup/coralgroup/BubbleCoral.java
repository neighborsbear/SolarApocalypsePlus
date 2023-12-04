package com.ife.sap.block.vanilla.plantgroup.underwatergroup.coralgroup;

import com.ife.sap.init.VanillaBlocks;
import com.ife.sap.procedures.SimpleDeleteProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CoralPlantBlock;
import net.minecraft.world.level.block.state.BlockState;

import static net.minecraft.world.level.block.Blocks.DEAD_BUBBLE_CORAL;

public class BubbleCoral extends CoralPlantBlock {
    public BubbleCoral() {
        super(VanillaBlocks.DEAD_BUBBLE_CORAL.get(), Properties.copy(Blocks.BUBBLE_CORAL).randomTicks());
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
