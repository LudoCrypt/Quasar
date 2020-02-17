package net.ludocrypt.quasar.world;

import net.ludocrypt.quasar.init.BlockInit;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGen {
	public static void generateOre() {
		for (Biome biome : ForgeRegistries.BIOMES) 
			{
			//TALC
			if (biome.getCategory() != Biome.Category.THEEND) {
				if (biome.getCategory() != Biome.Category.NETHER) 
				{
					ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 5, 5, 53));
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.talc_ore.getDefaultState(), 5)).withPlacement(customConfig));

				}	
			}
			
			
			//GNEISS
			if (biome.getCategory() != Biome.Category.THEEND) {
				if (biome.getCategory() != Biome.Category.NETHER) 
				{
					ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(25, 20, 20, 63));
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.gneiss.getDefaultState(), 5)).withPlacement(customConfig));

				}	
			}
			
			
			//BRECCIA
			if (biome.getCategory() != Biome.Category.THEEND) {
				if (biome.getCategory() != Biome.Category.NETHER) 
				{
					ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 3, 3, 47));
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.breccia.getDefaultState(), 5)).withPlacement(customConfig));

				}	
			
			
			}
		}
	}
}
