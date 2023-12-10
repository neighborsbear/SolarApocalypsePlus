package com.ife.sap.block.vanilla.plantgroup.wallgroup;

import com.ife.sap.procedures.SimpleDeleteProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CaveVinesPlantBlock;
import net.minecraft.world.level.block.GlowLichenBlock;
import net.minecraft.world.level.block.state.BlockState;

public class CaveVinesPlant extends CaveVinesPlantBlock {
    public CaveVinesPlant() {
        super(Properties.copy(Blocks.CAVE_VINES_PLANT).randomTicks());
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
