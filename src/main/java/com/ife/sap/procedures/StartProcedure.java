package com.ife.sap.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

import com.ife.sap.network.SapModVariables;

@Mod.EventBusSubscriber
public class StartProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (SapModVariables.MapVariables.get(world).SolarFlare == 0 && world.dayTime() <= 10) {
			SapModVariables.MapVariables.get(world).SolarFlare = 1;
			SapModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
