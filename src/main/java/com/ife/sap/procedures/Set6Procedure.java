package com.ife.sap.procedures;

import com.ife.sap.network.SapModVariables;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;

public class Set6Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		SapModVariables.MapVariables.get(world).SolarFlare = 6;
		SapModVariables.MapVariables.get(world).syncData(world);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Step:" + SapModVariables.MapVariables.get(world).SolarFlare)), false);
	}
}
