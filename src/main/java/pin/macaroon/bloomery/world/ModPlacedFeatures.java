package pin.macaroon.bloomery.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import pin.macaroon.bloomery.Bloomery;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> DEEPSLATE_STEEL_ORE_PLACED_KEY = registerKey("deepslate_steel_ore_placed_key");

    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, DEEPSLATE_STEEL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_STEEL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, // veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-59), YOffset.fixed(-6)))); //from x to y
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Bloomery.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
