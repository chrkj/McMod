package com.cromix.mymcmod;

import com.cromix.mymcmod.registry.ModBlocks;
import com.cromix.mymcmod.registry.ModEntitiesRenderes;
import com.cromix.mymcmod.registry.ModItems;
import com.cromix.mymcmod.registry.ModOreSpawn;
import net.fabricmc.api.ModInitializer;

public class MyMcMod implements ModInitializer
{
    public static final String MOD_ID = "mymcmod";

    @Override
    public void onInitialize()
    {
        ModItems.register();
        ModBlocks.register();
        ModOreSpawn.register();
        ModEntitiesRenderes.register();
    }

}
