package com.cainmod.animalsexpanded.setup;

import com.cainmod.animalsexpanded.AnimalsExpanded;
import com.cainmod.animalsexpanded.common.entity.SheepEx;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

public class ModEntities {
	public static final RegistryObject<EntityType<SheepEx>> SHEEPEX = Registration.ENTITY_TYPES.register("sheep_ex", 
			() -> EntityType.Builder.of(SheepEx::new, EntityClassification.CREATURE).sized(1.0f, 1.0f)
			.build(new ResourceLocation(AnimalsExpanded.MOD_ID, "sheep_ex").toString()));
	
	static void register() {
		//empty
	}
}
