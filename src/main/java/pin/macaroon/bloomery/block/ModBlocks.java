package pin.macaroon.bloomery.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import pin.macaroon.bloomery.Bloomery;

public class ModBlocks {

    public static final Block BOXED_GLASS = registerBlock("boxed_glass",
            new Block(AbstractBlock.Settings.create()
                    .instrument(Instrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)));
    public static final Block GRATE_BLOCK = registerBlock("grate",
            new Block(AbstractBlock.Settings.create()
                    .instrument(Instrument.HAT)
                    .strength(0.7F)
                    .sounds(BlockSoundGroup.METAL)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)));
    public static final Block DEEPSLATE_STEEL_ORE = registerBlock("deepslate_steel_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));
    public static final Block RAW_STEEL_BLOCK = registerBlock("raw_steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_COPPER_BLOCK)));
    public static final Block TESTBLOCK = registerBlock("test",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(-1.0F, 3600000.0F)
                    .dropsNothing()));

    //Blocks

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Bloomery.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM,
                new Identifier(Bloomery.MOD_ID, name),
                new BlockItem(block,
                        new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Bloomery.LOGGER.info("registering blocks for " + Bloomery.MOD_ID);
    }
}
