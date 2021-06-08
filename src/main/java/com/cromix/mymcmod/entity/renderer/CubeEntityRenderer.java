package com.cromix.mymcmod.entity.renderer;

import com.cromix.mymcmod.MyMcMod;
import net.minecraft.util.Identifier;
import com.cromix.mymcmod.entity.CubeEntity;
import com.cromix.mymcmod.entity.model.CubeEntityModel;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;

/*
 * A renderer is used to provide an entity model, shadow size, and texture.
 */
public class CubeEntityRenderer extends MobEntityRenderer<CubeEntity, CubeEntityModel> {

    public CubeEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new CubeEntityModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(CubeEntity entity) {
        return new Identifier(MyMcMod.MOD_ID, "textures/entity/cube/cube.png");
    }
}