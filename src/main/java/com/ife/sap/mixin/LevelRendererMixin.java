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
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@OnlyIn(Dist.CLIENT)
@Mixin(LevelRenderer.class)
public abstract class LevelRendererMixin {
    @Shadow
    @Final
    @Mutable
    public static ResourceLocation SUN_LOCATION;
    public LevelAccessor world;

    @Inject(method="renderSky", at = @At("HEAD"))
    private void onRendersky(PoseStack p_202424_, Matrix4f p_254034_, float p_202426_, Camera p_202427_, boolean p_202428_, Runnable p_202429_, CallbackInfo ci){
        if (SapModVariables.MapVariables.get(world).SolarFlare == 1){
            SUN_LOCATION = new ResourceLocation("sap:textures/environment/sun_step1.png");
        }
        if (SapModVariables.MapVariables.get(world).SolarFlare == 2){
            SUN_LOCATION = new ResourceLocation("sap:textures/environment/sun_step2.png");
        }
        if (SapModVariables.MapVariables.get(world).SolarFlare == 3){
            SUN_LOCATION = new ResourceLocation("sap:textures/environment/sun_step3.png");
        }
        if (SapModVariables.MapVariables.get(world).SolarFlare == 4){
            SUN_LOCATION = new ResourceLocation("sap:textures/environment/sun_step4.png");
        }
        if (SapModVariables.MapVariables.get(world).SolarFlare == 5){
            SUN_LOCATION = new ResourceLocation("sap:textures/environment/sun_step5.png");
        }
        if (SapModVariables.MapVariables.get(world).SolarFlare == 6){
            SUN_LOCATION = new ResourceLocation("sap:textures/environment/sun_step6.png");
        }
    }
}
