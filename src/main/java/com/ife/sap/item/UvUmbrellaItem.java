
package com.ife.sap.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UvUmbrellaItem extends Item {
	public UvUmbrellaItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
