package com.cromix.mymcmod.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.sound.BlockSoundGroup;

public class TungstenOre extends Block
{
    public TungstenOre()
    {
        super(FabricBlockSettings
                .of(Material.STONE, MaterialColor.RED)
                .breakByTool(FabricToolTags.PICKAXES, 2)
                .requiresTool()
                .strength(5.0F, 6.0F)
                .sounds(BlockSoundGroup.STONE));
    }
}
