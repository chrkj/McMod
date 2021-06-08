package com.cromix.mymcmod.registry;

import com.cromix.mymcmod.MyMcMod;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModOreSpawn
{
    // Tungsten ore
    private static final ConfiguredFeature<?, ?> ORE_TUNGSTEN_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            ModBlocks.TUNGSTEN_ORE.getDefaultState(),
            3)) // Vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(5,20,64))) // Spawn position (range)
            .spreadHorizontally()
            .repeat(3); // Number of veins per chunk

    public static void register()
    {
        // Tungsten ore
        RegistryKey<ConfiguredFeature<?, ?>> oreTungstenOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(MyMcMod.MOD_ID, "ore_tungsten_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTungstenOverworld.getValue(), ORE_TUNGSTEN_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTungstenOverworld);
    }
}
