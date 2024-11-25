package pin.macaroon.bloomery.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import pin.macaroon.bloomery.Bloomery;
import pin.macaroon.bloomery.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_STEEL_ORE_KEY = registerKey("deepslate_steel_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest deepslateReplacable = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldSteelOres = List.of(OreFeatureConfig.createTarget(deepslateReplacable, ModBlocks.DEEPSLATE_STEEL_ORE.getDefaultState()));

        register(context, DEEPSLATE_STEEL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSteelOres, 7)); // size: vein size
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Bloomery.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
