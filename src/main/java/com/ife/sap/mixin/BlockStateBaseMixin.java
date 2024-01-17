package com.ife.sap.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.google.common.collect.ImmutableMap;
import com.ife.sap.procedures.SmallPlantDeleteProcedure;
import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateHolder;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockBehaviour.BlockStateBase;

@Mixin(BlockStateBase.class)
public abstract class BlockStateBaseMixin extends StateHolder<Block, BlockState> {

    protected BlockStateBaseMixin(Block p_61117_, ImmutableMap<Property<?>, Comparable<?>> p_61118_, MapCodec<BlockState> p_61119_) {
        super(p_61117_, p_61118_, p_61119_);
    }

    @Inject(method = "randomTick", at = @At("TAIL"))
    private void randomTick(ServerLevel level, BlockPos pos, RandomSource random, CallbackInfo callbackInfo) {
        Block block = this.getBlock();
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        if (block instanceof SaplingBlock) {
            SmallPlantDeleteProcedure.execute(level, x, y, z);
        }
    }

    @Shadow
    private Block getBlock() {
        return null;
    }
}
