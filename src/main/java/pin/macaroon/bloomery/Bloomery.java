package pin.macaroon.bloomery;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pin.macaroon.bloomery.block.ModBlocks;
import pin.macaroon.bloomery.datagen.ModLootTableProvider;
import pin.macaroon.bloomery.enchantment.ModEnchants;
import pin.macaroon.bloomery.entity.effect.ModStatusEffects;
import pin.macaroon.bloomery.item.ModItemGroups;
import pin.macaroon.bloomery.item.ModItems;
import pin.macaroon.bloomery.world.gen.ModWorldGeneration;

public class Bloomery implements ModInitializer {
	public static final String MOD_ID = "bloomery";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModWorldGeneration.genModWorldGen();
		ModStatusEffects.registerModEffects();
		ModEnchants.registerModEnchantments();
		//pin.macaroon.bloomery.datagen.ModLootTableProvider.
	}
}