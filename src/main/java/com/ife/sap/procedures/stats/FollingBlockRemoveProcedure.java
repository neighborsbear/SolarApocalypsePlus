package com.ife.sap.procedures.stats;

import com.ife.sap.SapMod;

import com.ife.sap.network.SapModVariables;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FollingBlockRemoveProcedure {
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
		if (entity instanceof Player)
			return;
		if (entity instanceof FallingBlockEntity
				&& SapModVariables.MapVariables.get(world).SolarFlare < 6
				&& y >= 32) {
			SapMod.queueServerWork(1, () -> {
				entity.remove(Entity.RemovalReason.KILLED);
			});
		}
	}
}
