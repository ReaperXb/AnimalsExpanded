package com.cainmod.animalsexpanded.setup;

import com.cainmod.animalsexpanded.AnimalsExpanded;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AnimalsExpanded.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AnimalsExpanded.MOD_ID);
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, AnimalsExpanded.MOD_ID); 

	public static void register() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		BLOCKS.register(modEventBus);
		ITEMS.register(modEventBus);
		
		ModItems.register();
	}
}
