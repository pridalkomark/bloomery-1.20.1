package pin.macaroon.bloomery.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import pin.macaroon.bloomery.block.ModBlocks;
import pin.macaroon.bloomery.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BOXED_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_STEEL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TESTBLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRATE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_STEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPORT_SZELET, Models.GENERATED);
        itemModelGenerator.register(ModItems.CREEPER_COOKIE, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);

        //itemModelGenerator.register(ModItems.SYTHE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ELEMENTITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ELEMENTITE_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.AEROBLADE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.CRYSTAL_METH, Models.GENERATED);

        // no default datagen for crossbow :(
        //itemModelGenerator.register(ModItems.BUTTERBOW, Models.HANDHELD);

        itemModelGenerator.register(ModItems.BUTTERPROJECTILE, Models.HANDHELD);
    }
}
