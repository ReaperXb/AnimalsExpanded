package com.cainmod.animalsexpanded.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
	public static final RegistryObject<Item> SPAWN_EX_SHEEP_EGG = Registration.ITEMS.register("spawn_ex_sheep_egg", () ->
				new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	static void register() {
		//empty
	}
}
