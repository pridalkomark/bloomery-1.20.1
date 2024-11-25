package pin.macaroon.bloomery.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import pin.macaroon.bloomery.Bloomery;
import pin.macaroon.bloomery.block.ModBlocks;
import pin.macaroon.bloomery.item.custom.AerobladeItem;
import pin.macaroon.bloomery.item.custom.SytheItem;

public class ModItems {

    public static final Item RAW_STEEL = registerItem("raw_steel", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_APPLE = registerItem("steel_apple", new Item(new FabricItemSettings().food(ModFoodComponents.STEEL_APPLE).maxCount(16).rarity(Rarity.RARE)));
    public static final Item SPORT_SZELET = registerItem("sport_szelet", new Item(new FabricItemSettings().food(ModFoodComponents.SPORT_SZELET).maxCount(8)));
    public static final Item CREEPER_COOKIE = registerItem("creeper_cookie", new Item(new FabricItemSettings().food(ModFoodComponents.CREEPER_COOKIE).maxCount(64)));
    // FoodComponents

    public static final Item STEEL_SWORD = registerItem("steel_sword", new SwordItem(ModToolMaterial.STEEL, 3, -2.4F, new Item.Settings()));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel", new ShovelItem(ModToolMaterial.STEEL, 1.5F, -3.0F, new Item.Settings()));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe", new PickaxeItem(ModToolMaterial.STEEL, 1, -2.8F, new Item.Settings()));
    public static final Item STEEL_AXE = registerItem("steel_axe", new AxeItem(ModToolMaterial.STEEL, 6.0F, -3.1F, new Item.Settings()));
    public static final Item STEEL_HOE = registerItem("steel_hoe", new HoeItem(ModToolMaterial.STEEL, -2, -1.0F, new Item.Settings()));

    public static final Item ELEMENTITE = registerItem("elementite_ingot", new Item(new FabricItemSettings().fireproof().rarity(Rarity.RARE)));

    public static final Item ELEMENTITE_TEMPLATE = registerItem("elementite_smithing_template", new Item(new FabricItemSettings().fireproof().rarity(Rarity.RARE)));

    public static final Item SYTHE = registerItem("elementite_scythe", new SytheItem(
            ModToolMaterial.SCYTHE_MATERIAL,
            -3F,
            new FabricItemSettings(),
            10));

    public static final Item AEROBLADE = registerItem("aeroblade", new AerobladeItem(ModToolMaterial.STEEL, 3, -2.7F, new Item.Settings().rarity(Rarity.EPIC), 150, 1.5F));

    private static void addItemsToBuildingBlockItemGroup(FabricItemGroupEntries entries){
        //TODO reorder the stuff to different categories
        entries.addAfter(Items.GLASS, ModBlocks.BOXED_GLASS);
        entries.addAfter(Items.DEEPSLATE_IRON_ORE, ModBlocks.DEEPSLATE_STEEL_ORE);
        entries.addAfter(Items.RAW_IRON_BLOCK, ModBlocks.RAW_STEEL_BLOCK);
        entries.addAfter(Items.IRON_BLOCK, ModBlocks.STEEL_BLOCK);
    }

    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries){
        entries.addAfter(Items.IRON_INGOT, ModItems.RAW_STEEL);
        entries.addAfter(Items.RAW_IRON, ModItems.STEEL_INGOT);
        entries.addAfter(Items.NETHERITE_INGOT, ModItems.ELEMENTITE);
    }

    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries){
        entries.addAfter(Items.GOLDEN_APPLE, ModItems.STEEL_APPLE);
        entries.addAfter(ModItems.CREEPER_COOKIE, ModItems.SPORT_SZELET);
        entries.addAfter(Items.COOKIE, ModItems.CREEPER_COOKIE);
        //entries.add();
    }

    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries){
        entries.addAfter(Items.IRON_HOE, ModItems.STEEL_SHOVEL);
        entries.addAfter(ModItems.STEEL_SHOVEL, ModItems.STEEL_PICKAXE);
        entries.addAfter(ModItems.STEEL_PICKAXE, ModItems.STEEL_AXE);
        entries.addAfter(ModItems.STEEL_AXE, ModItems.STEEL_HOE);
        //entries.add();
    }

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries){
        entries.addAfter(Items.IRON_SWORD, ModItems.STEEL_SWORD);
        entries.addAfter(Items.TRIDENT, ModItems.SYTHE);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Bloomery.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Bloomery.LOGGER.info("items");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlockItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    }
}
