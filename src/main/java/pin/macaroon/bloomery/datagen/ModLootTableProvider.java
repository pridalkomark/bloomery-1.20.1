package pin.macaroon.bloomery.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.data.server.loottable.LootTableProvider;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import pin.macaroon.bloomery.block.ModBlocks;
import net.minecraft.loot.LootTable;
import pin.macaroon.bloomery.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.DEEPSLATE_STEEL_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_STEEL_ORE, ModItems.RAW_STEEL));
        addDrop(ModBlocks.STEEL_BLOCK);
        addDrop(ModBlocks.RAW_STEEL_BLOCK);
    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(1.0f, 3.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
}}
