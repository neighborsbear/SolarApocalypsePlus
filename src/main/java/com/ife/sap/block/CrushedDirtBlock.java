package com.ife.sap.block;

import net.minecraft.server.level.ServerLevel;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.util.RandomSource;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import java.util.List;
import java.util.Collections;

import com.ife.sap.procedures.CrushedDirtTCSandProcedure;
import com.ife.sap.init.SapModBlocks;

public class CrushedDirtBlock extends FallingBlock {
	public CrushedDirtBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL)
				.strength(0.6f, 0.6f).speedFactor(0.95f).jumpFactor(0.95f).randomTicks());
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
		return Collections.singletonList(new ItemStack(SapModBlocks.CRUSHED_DIRT.get()));
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel level, BlockPos pos, RandomSource random) {
		super.randomTick(blockstate, level, pos, random);
		Player entity = Minecraft.getInstance().player;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		CrushedDirtTCSandProcedure.execute(level, x, y, z);
	}
}
