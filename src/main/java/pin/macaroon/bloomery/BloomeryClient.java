package pin.macaroon.bloomery;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import pin.macaroon.bloomery.block.ModBlocks;
import pin.macaroon.bloomery.datagen.ModModelPredicateProvider;

public class BloomeryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BOXED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRATE_BLOCK, RenderLayer.getTranslucent());

        regModelPredicateProviders();
    }

    public static void  regModelPredicateProviders(){
        //TODO TODO TODO !!!!!!!!!!!!!!!
    /*    ModelPredicateProviderRegistry.register(Items.CROSSBOW, new Identifier("butter"), (stack, world, entity, seed) ->{
            if (stack.)
        }
                );*/
    }
}
