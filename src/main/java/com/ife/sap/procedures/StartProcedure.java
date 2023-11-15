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
		if (SapModVariables.MapVariables.get(world).SolarFlare == 0 && world.dayTime() >= 0) {
			SapModVariables.MapVariables.get(world).SolarFlare = 1;
			SapModVariables.MapVariables.get(world).syncData(world);
		} else if (SapModVariables.MapVariables.get(world).SolarFlare == 1 && world.dayTime() >= 144000) {
			SapModVariables.MapVariables.get(world).SolarFlare = 2;
			SapModVariables.MapVariables.get(world).syncData(world);
		} else if (SapModVariables.MapVariables.get(world).SolarFlare == 2 && world.dayTime() >= 312000) {
			SapModVariables.MapVariables.get(world).SolarFlare = 3;
			SapModVariables.MapVariables.get(world).syncData(world);
		} else if (SapModVariables.MapVariables.get(world).SolarFlare == 3 && world.dayTime() >= 480000) {
			SapModVariables.MapVariables.get(world).SolarFlare = 4;
			SapModVariables.MapVariables.get(world).syncData(world);
		} else if (SapModVariables.MapVariables.get(world).SolarFlare == 4 && world.dayTime() >= 648000) {
			SapModVariables.MapVariables.get(world).SolarFlare = 5;
			SapModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
