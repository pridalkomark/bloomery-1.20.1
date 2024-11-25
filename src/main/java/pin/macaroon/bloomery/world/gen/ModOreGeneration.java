package pin.macaroon.bloomery.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import pin.macaroon.bloomery.world.ModPlacedFeatures;

public class ModOreGeneration {
    public static void genOres(){
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DEEPSLATE_STEEL_ORE_PLACED_KEY);
    }
}
