package com.ife.sap.procedures.stats;

import com.ife.sap.SapMod;
import com.ife.sap.network.SapModVariables;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.allay.Allay;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

import static net.minecraft.world.entity.MobCategory.*;

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
		if (entity instanceof LivingEntity)
			return;
		if (entity instanceof FallingBlockEntity)
			return;
		if (entity instanceof Player)
			return;
		if (entity instanceof Snowball
				&& SapModVariables.MapVariables.get(world).SolarFlare < 6) {
			entity.setSecondsOnFire(1);
			SapMod.queueServerWork(20, () -> {
				entity.remove(Entity.RemovalReason.KILLED);
			});
		}
		if (entity instanceof Projectile
				&& SapModVariables.MapVariables.get(world).SolarFlare < 6) {
			if (!(entity instanceof Snowball)) {
				entity.setSecondsOnFire(5);
				SapMod.queueServerWork(100, () -> {
					entity.remove(Entity.RemovalReason.KILLED);
				});
			}
		}
		if (!(entity instanceof Projectile)) {
			SapMod.queueServerWork(1, () -> {
				if (SapModVariables.MapVariables.get(world).SolarFlare == 2
						&& !(SapModVariables.MapVariables.get(world).TodayTime > 12566 && SapModVariables.MapVariables.get(world).TodayTime < 23450)
						&& !world.getLevelData().isRaining()) {
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z))) {
						entity.setSecondsOnFire(10);
						SapMod.queueServerWork(20, () -> {
							entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (1));
							SapMod.queueServerWork(20, () -> {
								entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (1));
								SapMod.queueServerWork(20, () -> {
									entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (1));
									SapMod.queueServerWork(20, () -> {
										entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (1));
										SapMod.queueServerWork(20, () -> {
											entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (10));
										});
									});
								});
							});
						});
					} else if (y >= 63) {
						entity.setSecondsOnFire(10);
						SapMod.queueServerWork(20, () -> {
							entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (1));
							SapMod.queueServerWork(20, () -> {
								entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (1));
								SapMod.queueServerWork(20, () -> {
									entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (1));
									SapMod.queueServerWork(20, () -> {
										entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (1));
										SapMod.queueServerWork(120, () -> {
											entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (10));
										});
									});
								});
							});
						});
					}
				}
				if (SapModVariables.MapVariables.get(world).SolarFlare >= 3 && SapModVariables.MapVariables.get(world).SolarFlare < 6
						&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z))) {
					entity.setSecondsOnFire(5);
					SapMod.queueServerWork(5, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (0.5));
						SapMod.queueServerWork(5, () -> {
							entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (10));
						});
					});
				}
				if (SapModVariables.MapVariables.get(world).SolarFlare == 3
						&& y >= 32) {
					entity.setSecondsOnFire(5);
					SapMod.queueServerWork(20, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (1));
						SapMod.queueServerWork(20, () -> {
							entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (1));
							SapMod.queueServerWork(20, () -> {
								entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (1));
								SapMod.queueServerWork(20, () -> {
									entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (1));
									SapMod.queueServerWork(20, () -> {
										entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (10));
									});
								});
							});
						});
					});
					if (y >= 63) {
						SapMod.queueServerWork(5, () -> {
							entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (1));
							SapMod.queueServerWork(5, () -> {
								entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (10));
							});
						});
					}
				}
				if (SapModVariables.MapVariables.get(world).SolarFlare == 4
						&& y >= 8) {
					entity.setSecondsOnFire(5);
					SapMod.queueServerWork(20, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (1));
						SapMod.queueServerWork(20, () -> {
							entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (1));
							SapMod.queueServerWork(10, () -> {
								entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (10));
							});
						});
					});
					if (y >= 32) {
						SapMod.queueServerWork(5, () -> {
							entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (1));
							SapMod.queueServerWork(5, () -> {
								entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (10));
							});
						});
					}
				}
				if (SapModVariables.MapVariables.get(world).SolarFlare == 5
						&& y >= -16) {
					entity.setSecondsOnFire(5);
					SapMod.queueServerWork(5, () -> {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (1));
						SapMod.queueServerWork(5, () -> {
							entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (10));
						});
					});
					if (y >= 8) {
						SapMod.queueServerWork(1, () -> {
							entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (1));
							SapMod.queueServerWork(1, () -> {
								entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE)), (float) (10));
							});
						});
					}
				}
			});
		}
	}
}
