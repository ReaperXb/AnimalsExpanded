package com.cainmod.animalsexpanded.client.entity;


import com.cainmod.animalsexpanded.AnimalsExpanded;
import com.cainmod.animalsexpanded.client.entity.model.SheepExModel;
import com.cainmod.animalsexpanded.common.entity.SheepEx;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.culling.ClippingHelper;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SheepExRenderer extends MobRenderer<SheepEx, SheepExModel<SheepEx>>{

	public static final ResourceLocation TEXTURE = new ResourceLocation(AnimalsExpanded.MOD_ID, "textures/entity/sheep_ex/SheepExTexture.png");
	
	public SheepExRenderer(EntityRendererManager manager) {
		super(manager, new SheepExModel<>(), 1.0f);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ResourceLocation getTextureLocation(SheepEx p_110775_1_) {
		// TODO Auto-generated method stub
		return TEXTURE;
	}
	
	@Override
	public boolean shouldRender(SheepEx p_225626_1_, ClippingHelper p_225626_2_, double p_225626_3_, double p_225626_5_, double p_225626_7_) {
      if (super.shouldRender(p_225626_1_, p_225626_2_, p_225626_3_, p_225626_5_, p_225626_7_)) {
         return true;
      }
      return false;

   }

	@Override
   public void render(SheepEx p_225623_1_, float p_225623_2_, float p_225623_3_, MatrixStack p_225623_4_, IRenderTypeBuffer p_225623_5_, int p_225623_6_) {
      super.render(p_225623_1_, p_225623_2_, p_225623_3_, p_225623_4_, p_225623_5_, p_225623_6_);
      
   }
	
}