package com.ife.sap.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.ife.sap.init.SapModBlocks;
import com.ife.sap.init.SapModTags;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;

@Mixin(LeavesBlock.class)
public abstract class LeaveBlocksMixin extends Block {

	public LeaveBlocksMixin(Properties p_49795_) {
		super(p_49795_);
		// Ignore this
	}

	@Inject(method = "isRandomlyTicking", at = @At(value = "HEAD"), cancellable = true)
	private void isRandomlyTicking(BlockState state, CallbackInfoReturnable<Boolean> cir) {
		// Call randomTick() always
		cir.setReturnValue(true);
	}

	@Inject(method = "randomTick", at = @At(value = "HEAD"), cancellable = true)
	private void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random, CallbackInfo ci) {
		if (state.is(SapModTags.Blocks.WITHERABLE_LEAVES)) {
			level.setBlock(pos, SapModBlocks.WITHERED_LEAVES.get().defaultBlockState(), Block.UPDATE_ALL);
			ci.cancel();
		}
	}
}
