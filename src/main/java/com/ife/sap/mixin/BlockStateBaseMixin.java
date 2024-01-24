package com.ife.sap.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.google.common.collect.ImmutableMap;
import com.ife.sap.BlockBehaviourAccessor;
import com.ife.sap.SapMod.Procedure;
import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour.BlockStateBase;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateHolder;
import net.minecraft.world.level.block.state.properties.Property;

@Mixin(BlockStateBase.class)
public abstract class BlockStateBaseMixin extends StateHolder<Block, BlockState> {

    @Shadow
    private boolean isRandomlyTicking;

    protected BlockStateBaseMixin(Block p_61117_, ImmutableMap<Property<?>, Comparable<?>> p_61118_, MapCodec<BlockState> p_61119_) {
        super(p_61117_, p_61118_, p_61119_);
    }

    @Inject(method = "initCache", at = @At("HEAD"))
    private void initCacheHead(CallbackInfo callbackInfo) {
        if (this.getBlock() instanceof BlockBehaviourAccessor accessor) {
            accessor.sap$initCaches();
        }
    }

    @Inject(method = "initCache", at = @At("TAIL"))
    private void initCacheTail(CallbackInfo callbackInfo) {
        if (this.getBlock() instanceof BlockBehaviourAccessor accessor) {
            this.isRandomlyTicking = this.isRandomlyTicking || accessor.sap$getProcedure() != null;
        }
    }

    @Inject(method = "randomTick", at = @At("TAIL"))
    private void randomTick(ServerLevel level, BlockPos pos, RandomSource random, CallbackInfo callbackInfo) {
        if (this.getBlock() instanceof BlockBehaviourAccessor accessor) {
            Procedure procedure = accessor.sap$getProcedure();
            if (procedure != null) {
                int x = pos.getX();
                int y = pos.getY();
                int z = pos.getZ();
                procedure.call(level, x, y, z);
            }
        }
    }

    @Shadow
    private Block getBlock() {
        return null;
    }
}
