package com.ife.sap.mixin;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

@Mixin(BlockBehaviour.class)
public abstract class BlockBehaviourMixin {

    @Final
    @Mutable
    @Shadow
    protected boolean isRandomlyTicking;

    @Inject(method = "<init>", at = @At("TAIL"))
    private void init(BlockBehaviour.Properties properties, CallbackInfo callbackInfo) {
        Block block = (Block) (Object) this;
        if (block instanceof SaplingBlock) {
            this.isRandomlyTicking = true;
        }
    }
}
