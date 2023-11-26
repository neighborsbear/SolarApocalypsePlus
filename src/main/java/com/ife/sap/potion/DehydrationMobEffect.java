package com.ife.sap.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import com.ife.sap.procedures.DehydrationActiveProcedure;

public class DehydrationMobEffect extends MobEffect {
	public DehydrationMobEffect() {
		super(MobEffectCategory.HARMFUL, -2847380);
	}

	@Override
	public String getDescriptionId() {
		return "effect.sap.dehydration";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DehydrationActiveProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
