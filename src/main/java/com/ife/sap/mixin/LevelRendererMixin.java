package com.ife.sap.mixin;

import com.ife.sap.network.SapModVariables;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Camera;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@OnlyIn(Dist.CLIENT)
@Mixin(LevelRenderer.class)
public abstract class LevelRendererMixin {
    @Unique
    private Matrix4f originalCelestialMatrix;

    @ModifyVariable(method = "Lnet/minecraft/client/renderer/LevelRenderer;renderSky(Lcom/mojang/blaze3d/vertex/PoseStack;Lcom/mojang/math/Matrix4f;FLnet/minecraft/client/Camera;ZLjava/lang/Runnable;)V", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;setShaderTexture(ILnet/minecraft/resources/ResourceLocation;)V", ordinal = 0), ordinal = 1)
    private Matrix4f celesteConfig$scaleSun(Matrix4f in) {
        originalCelestialMatrix = new Matrix4f(in);
        Matrix4f copy = new Matrix4f(in);
        copy.scale(2.0F, 1.0F, 2.0F);
        return copy;
    }

    @ModifyVariable(method = "Lnet/minecraft/client/renderer/LevelRenderer;renderSky(Lcom/mojang/blaze3d/vertex/PoseStack;Lcom/mojang/math/Matrix4f;FLnet/minecraft/client/Camera;ZLjava/lang/Runnable;)V", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;setShaderTexture(ILnet/minecraft/resources/ResourceLocation;)V", ordinal = 1), ordinal = 1)
    private Matrix4f celesteConfig$scaleMoon(Matrix4f in) {
        Matrix4f copy = new Matrix4f(originalCelestialMatrix);
        copy.scale(10.0F, 1.0F, 10.0F);
        originalCelestialMatrix = null;
        return copy;
    }
}
