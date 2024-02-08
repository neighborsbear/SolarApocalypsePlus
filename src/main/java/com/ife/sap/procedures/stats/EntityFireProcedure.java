package com.ife.sap.procedures.stats;

import com.ife.sap.SapMod;
import com.ife.sap.network.SapModVariables;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EntityFireProcedure {
	@SubscribeEvent
	public static void onEntityJoin(EntityJoinLevelEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("Living") != 1) {
			if (SapModVariables.MapVariables.get(world).SolarFlare == 2
					&& !(SapModVariables.MapVariables.get(world).TodayTime > 12566 && SapModVariables.MapVariables.get(world).TodayTime < 23450)
					&& !world.getLevelData().isRaining()
					&& y >= 63) {
				entity.setSecondsOnFire(10);
				SapMod.queueServerWork(20, () -> {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (2));
				});
				SapMod.queueServerWork(20, () -> {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (2));
				});
				SapMod.queueServerWork(20, () -> {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (2));
				});
				SapMod.queueServerWork(20, () -> {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (2));
				});
				SapMod.queueServerWork(20, () -> {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (2));
				});
				SapMod.queueServerWork(20, () -> {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (2));
					entity.lavaHurt();
				});

			}
			if (SapModVariables.MapVariables.get(world).SolarFlare == 3
					&& y >= 32) {
				entity.setSecondsOnFire(10);

				if (y >= 63) {
					entity.lavaHurt();
				}
			}
			if (SapModVariables.MapVariables.get(world).SolarFlare == 4
					&& y >= 8) {
				entity.setSecondsOnFire(10);
				if (y >= 32) {
					entity.lavaHurt();
				}
			}
			if (SapModVariables.MapVariables.get(world).SolarFlare == 5
					&& y >= -16) {
				entity.setSecondsOnFire(10);
				if (y >= 8) {
					entity.lavaHurt();
				}
			}
			//entity.setSecondsOnFire(2147483647);
		}
	}
}
