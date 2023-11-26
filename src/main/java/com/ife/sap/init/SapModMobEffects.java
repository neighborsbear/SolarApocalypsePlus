
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.ife.sap.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import com.ife.sap.potion.DehydrationMobEffect;
import com.ife.sap.SapMod;

public class SapModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SapMod.MODID);
	public static final RegistryObject<MobEffect> DEHYDRATION = REGISTRY.register("dehydration", () -> new DehydrationMobEffect());
}
