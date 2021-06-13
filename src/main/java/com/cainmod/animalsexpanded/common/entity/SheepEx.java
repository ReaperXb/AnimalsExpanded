package com.cainmod.animalsexpanded.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class SheepEx extends MobEntity {

	public SheepEx(EntityType<? extends MobEntity> type, World worldIn) {
		super(type, worldIn);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getExperienceReward(PlayerEntity player) {
		return 5000;
	}
	
	public static AttributeModifierMap.MutableAttribute createMobAttributes() {
	    return LivingEntity.createLivingAttributes().add(Attributes.FOLLOW_RANGE, 16.0D).add(Attributes.ATTACK_KNOCKBACK);
	}

}
