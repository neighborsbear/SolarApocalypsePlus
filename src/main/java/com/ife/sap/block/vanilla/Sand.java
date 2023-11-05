package com.ife.sap.block.vanilla;

import net.minecraft.world.level.block.FallingBlock;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.util.RandomSource;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.Collections;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import com.ife.sap.procedures.SandTCDustProcedure;

public class Sand extends FallingBlock {

    public Sand() {
        super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.SNARE).sound(SoundType.SAND).strength(0.5f, 10f));
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 15;
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(Blocks.SAND));
    }


    @Override
    public void animateTick(BlockState blockstate, Level world, BlockPos pos, RandomSource random) {
        super.animateTick(blockstate, world, pos, random);
        Player entity = Minecraft.getInstance().player;
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        SandTCDustProcedure.execute(world, x, y, z);
    }

}
