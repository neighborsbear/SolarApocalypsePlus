package com.ife.sap.mixin;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

import com.ife.sap.BlockBehaviourAccessor;
import com.ife.sap.SapMod;
import com.ife.sap.SapMod.Procedure;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

@Mixin(BlockBehaviour.class)
public abstract class BlockBehaviourMixin implements BlockBehaviourAccessor {

    @Final
    @Mutable
    @Shadow
    protected boolean isRandomlyTicking;

    @Unique
    protected Procedure sap$procedure;

    @Override
    public void sap$initCaches() {
        Block block = (Block) (Object) this;
        this.sap$procedure = SapMod.getProcedure(block);
        this.isRandomlyTicking = this.sap$procedure != null;
    }

    @Override
    public Procedure sap$getProcedure() {
        return this.sap$procedure;
    }
}
