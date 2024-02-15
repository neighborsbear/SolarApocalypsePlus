package com.ife.sap.mixin;

import com.ife.sap.network.SapModVariables;
import com.ife.sap.procedures.StartProcedure;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Camera;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.Event;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
@Mixin(LevelRenderer.class)
public abstract class LevelRendererMixin {
    @Shadow
    @Final
    @Mutable
    public static ResourceLocation SUN_LOCATION;
    public LevelAccessor world;

    //    private static final ResourceLocation SUN_LOCATION = new ResourceLocation("sap:textures/environment/sun_step1.png");
//    @Final
//    public LevelAccessor world;
//    @Unique
//    private VertexConsumer bigSunGenerator(BufferBuilder instance, Matrix4f matrix, float x, float y, float z, Test<VertexConsumer> original) {
//        if (world == null) return original.call(instance, matrix, x, y, z);
//        original.call(instance, matrix, x * Math.abs(12f), y, z * Math.abs(12f));
//        if (SapModVariables.MapVariables.get(world).SolarFlare == 1) {
//            ResourceLocation SUN_LOCATION = new ResourceLocation("sap:textures/environment/sun_step1.png");
//        } else if (SapModVariables.MapVariables.get(world).SolarFlare == 2) {
//            ResourceLocation SUN_LOCATION = new ResourceLocation("sap:textures/environment/sun_step2.png");
//        } else if (SapModVariables.MapVariables.get(world).SolarFlare == 3) {
//            ResourceLocation SUN_LOCATION = new ResourceLocation("sap:textures/environment/sun_step3.png");
//        } else if (SapModVariables.MapVariables.get(world).SolarFlare == 4) {
//            ResourceLocation SUN_LOCATION = new ResourceLocation("sap:textures/environment/sun_step4.png");
//        } else if (SapModVariables.MapVariables.get(world).SolarFlare == 5) {
//            ResourceLocation SUN_LOCATION = new ResourceLocation("sap:textures/environment/sun_step5.png");
//        } else if (SapModVariables.MapVariables.get(world).SolarFlare == 6) {
//            ResourceLocation SUN_LOCATION = new ResourceLocation("sap:textures/environment/sun_step6.png");
//        }
//        return original.call(instance, matrix, x, y, z);
//    }
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
