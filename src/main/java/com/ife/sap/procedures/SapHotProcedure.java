package com.ife.sap.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import com.ife.sap.network.SapModVariables;
import com.ife.sap.init.SapModMobEffects;

@Mod.EventBusSubscriber
public class SapHotProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("SapStack") >= 200
				&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(SapModMobEffects.DEHYDRATION.get()) ? _livEnt.getEffect(SapModMobEffects.DEHYDRATION.get()).getDuration() : 0) < entity.getPersistentData().getDouble("SapStack")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(SapModMobEffects.DEHYDRATION.get(), (int) entity.getPersistentData().getDouble("SapStack"), 0));
		}
		if (entity.getPersistentData().getDouble("SapStack") > 1200) {
			entity.getPersistentData().putDouble("SapStack", 1200);
		}
		if (entity.getPersistentData().getDouble("SapStack") < 0) {
			entity.getPersistentData().putDouble("SapStack", 0);
		}
		if (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)) {
			entity.getPersistentData().putDouble("SapStack", 0);
		}
		if (SapModVariables.MapVariables.get(world).SolarFlare == 1 && !(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)) && world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld")))
				&& !(SapModVariables.MapVariables.get(world).TodayTime > 12566 && SapModVariables.MapVariables.get(world).TodayTime < 23450) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z)) && !world.getLevelData().isRaining()
				&& !entity.isInWaterRainOrBubble()) {
			if (entity.getPersistentData().getDouble("SapStack") < 1200) {
				entity.getPersistentData().putDouble("SapStack", (entity.getPersistentData().getDouble("SapStack") + 1));
			}
		}
		if (SapModVariables.MapVariables.get(world).SolarFlare == 1 && (!world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld")))
				|| SapModVariables.MapVariables.get(world).TodayTime > 12566 && SapModVariables.MapVariables.get(world).TodayTime < 23450 || !world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z)) || world.getLevelData().isRaining()
				|| entity.isInWaterRainOrBubble())) {
			if (entity.getPersistentData().getDouble("SapStack") > 0) {
				entity.getPersistentData().putDouble("SapStack", (entity.getPersistentData().getDouble("SapStack") - 1));
			}
		}
		if (SapModVariables.MapVariables.get(world).SolarFlare == 2 && !(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)) && world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld")))
				&& !(SapModVariables.MapVariables.get(world).TodayTime > 12566 && SapModVariables.MapVariables.get(world).TodayTime < 23450) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z)) && !world.getLevelData().isRaining()
				&& !entity.isInWaterRainOrBubble()) {
			entity.setSecondsOnFire(1);
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.ON_FIRE)), (float) (world.dayTime() / 48000));
		} else if (SapModVariables.MapVariables.get(world).SolarFlare == 2 && !(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)) && world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld"))) && y >= 63 && !world.getLevelData().isRaining() && !entity.isInWaterRainOrBubble()) {
			if (entity.getPersistentData().getDouble("SapStack") < 1200) {
				entity.getPersistentData().putDouble("SapStack", (entity.getPersistentData().getDouble("SapStack") + 1));
			}
		}
		if (SapModVariables.MapVariables.get(world).SolarFlare == 2
				&& (!world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld"))) || y < 63 || world.getLevelData().isRaining() || entity.isInWaterRainOrBubble())) {
			if (entity.getPersistentData().getDouble("SapStack") > 0) {
				entity.getPersistentData().putDouble("SapStack", (entity.getPersistentData().getDouble("SapStack") - 1));
			}
		}
		if (SapModVariables.MapVariables.get(world).SolarFlare == 3 && !(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)) && world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld"))) && y >= 63 && !entity.isInWaterRainOrBubble()) {
			entity.setSecondsOnFire(2);
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.ON_FIRE)), (float) (world.dayTime() / 48000));
		} else if (SapModVariables.MapVariables.get(world).SolarFlare == 3 && !(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)) && world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld"))) && y >= 8 && !entity.isInWaterRainOrBubble()) {
			if (entity.getPersistentData().getDouble("SapStack") < 1200) {
				entity.getPersistentData().putDouble("SapStack", (entity.getPersistentData().getDouble("SapStack") + 1));
			}
		}
		if (SapModVariables.MapVariables.get(world).SolarFlare == 3 && (!world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld"))) || y < 8 || entity.isInWaterRainOrBubble())) {
			if (entity.getPersistentData().getDouble("SapStack") > 0) {
				entity.getPersistentData().putDouble("SapStack", (entity.getPersistentData().getDouble("SapStack") - 1));
			}
		}
		if (SapModVariables.MapVariables.get(world).SolarFlare == 4 && !(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)) && world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld"))) && y >= 8 && !entity.isInWaterRainOrBubble()) {
			entity.setSecondsOnFire(3);
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.ON_FIRE)), (float) (world.dayTime() / 48000));
		} else if (SapModVariables.MapVariables.get(world).SolarFlare == 4 && !(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)) && world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld"))) && y >= -32 && !entity.isInWaterRainOrBubble()) {
			if (entity.getPersistentData().getDouble("SapStack") < 1200) {
				entity.getPersistentData().putDouble("SapStack", (entity.getPersistentData().getDouble("SapStack") + 1));
			}
		}
		if (SapModVariables.MapVariables.get(world).SolarFlare == 4 && (!world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld"))) || entity.isInWaterRainOrBubble() || y < -32)) {
			if (entity.getPersistentData().getDouble("SapStack") > 0) {
				entity.getPersistentData().putDouble("SapStack", (entity.getPersistentData().getDouble("SapStack") - 1));
			}
		}
		if (SapModVariables.MapVariables.get(world).SolarFlare == 5 && !(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)) && world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld"))) && y >= 8 && !entity.isInWaterRainOrBubble()) {
			entity.setSecondsOnFire(4);
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.ON_FIRE)), (float) (world.dayTime() / 48000));
		} else if (SapModVariables.MapVariables.get(world).SolarFlare == 5 && !(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)) && world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld"))) && !entity.isInWaterRainOrBubble()) {
			if (entity.getPersistentData().getDouble("SapStack") < 1200) {
				entity.getPersistentData().putDouble("SapStack", (entity.getPersistentData().getDouble("SapStack") + 1));
			}
		}
		if (SapModVariables.MapVariables.get(world).SolarFlare == 5 && (!world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld"))) || entity.isInWaterRainOrBubble())) {
			if (entity.getPersistentData().getDouble("SapStack") > 0) {
				entity.getPersistentData().putDouble("SapStack", (entity.getPersistentData().getDouble("SapStack") - 1));
			}
		}
	}
}
