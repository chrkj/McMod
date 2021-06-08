package com.cromix.mymcmod.registry;

import com.cromix.mymcmod.MyMcMod;
import com.cromix.mymcmod.entity.CubeEntity;
import com.cromix.mymcmod.entity.renderer.CubeEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@Environment(EnvType.CLIENT)
public class ModEntitiesRenderes implements ClientModInitializer
{
    // Cube Entity
    public static final EntityType<CubeEntity> CUBE = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(MyMcMod.MOD_ID, "cube"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CubeEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build());

    public static void register()
    {
        // Cube Entity
        FabricDefaultAttributeRegistry.register(CUBE, CubeEntity.createCubeEntityAttributes());
        EntityRendererRegistry.INSTANCE.register(CUBE, (dispatcher, context) -> new CubeEntityRenderer(dispatcher));
    }

    @Override
    public void onInitializeClient()
    {
        register();
    }
}
