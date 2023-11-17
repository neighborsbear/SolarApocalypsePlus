
package com.ife.sap.block;

import com.ife.sap.procedures.WitheredLeavesBlockFProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class WitheredLeavesBlock extends LeavesBlock {
	public WitheredLeavesBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().mapColor(MapColor.PLANT).sound(SoundType.GRASS)
				.strength(0.1f).noCollission().speedFactor(0.25f).jumpFactor(0.9f).randomTicks());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 5;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel level, BlockPos pos, RandomSource random) {
		super.randomTick(blockstate, level, pos, random);
		Player entity = Minecraft.getInstance().player;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		WitheredLeavesBlockFProcedure.execute(level, x, y, z);
	}
}
