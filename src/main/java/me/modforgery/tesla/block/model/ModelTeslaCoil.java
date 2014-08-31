package me.modforgery.tesla.block.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTeslaCoil extends ModelBase
{
    ModelRenderer top;
    ModelRenderer pole;
    ModelRenderer ring1;
    ModelRenderer ring2;
  
  public ModelTeslaCoil()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      top = new ModelRenderer(this, 0, 0);
      top.addBox(0F, 0F, 0F, 12, 4, 12);
      top.setRotationPoint(-6F, 8F, -6F);
      top.setTextureSize(64, 32);
      top.mirror = true;
      setRotation(top, 0F, 0F, 0F);
      pole = new ModelRenderer(this, 0, 0);
      pole.addBox(0F, 0F, 0F, 6, 12, 6);
      pole.setRotationPoint(-3F, 12F, -3F);
      pole.setTextureSize(64, 32);
      pole.mirror = true;
      setRotation(pole, 0F, 0F, 0F);
      ring1 = new ModelRenderer(this, 0, 0);
      ring1.addBox(0F, 0F, 0F, 10, 1, 10);
      ring1.setRotationPoint(-5F, 19F, -5F);
      ring1.setTextureSize(64, 32);
      ring1.mirror = true;
      setRotation(ring1, 0F, 0F, 0F);
      ring2 = new ModelRenderer(this, 0, 0);
      ring2.addBox(0F, 0F, 0F, 10, 1, 10);
      ring2.setRotationPoint(-5F, 21F, -5F);
      ring2.setTextureSize(64, 32);
      ring2.mirror = true;
      setRotation(ring2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    top.render(f5);
    pole.render(f5);
    ring1.render(f5);
    ring2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
