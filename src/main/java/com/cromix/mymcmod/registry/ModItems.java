package com.cromix.mymcmod.registry;

import com.cromix.mymcmod.MyMcMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    // Items
    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    // Ingots
    public static final Item TUNGSTEN_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    // Blocks
    public static final BlockItem TUNGSTEN_ORE = new BlockItem(ModBlocks.TUNGSTEN_ORE, new Item.Settings().group(ItemGroup.MATERIALS));

    public static void register()
    {
        Registry.register(Registry.ITEM, new Identifier(MyMcMod.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(MyMcMod.MOD_ID, "tungsten_ore"), TUNGSTEN_ORE);
        Registry.register(Registry.ITEM, new Identifier(MyMcMod.MOD_ID, "tungsten_ingot"), TUNGSTEN_INGOT);
    }
}
