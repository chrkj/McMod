package com.cromix.mymcmod.registry;

import com.cromix.mymcmod.MyMcMod;
import com.cromix.mymcmod.blocks.TungstenOre;
import net.minecraft.block.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks
{
    // Ore
    public static final Block TUNGSTEN_ORE = new TungstenOre();

    public static void register()
    {
        Registry.register(Registry.BLOCK, new Identifier(MyMcMod.MOD_ID, "tungsten_ore"), TUNGSTEN_ORE);
    }
}
