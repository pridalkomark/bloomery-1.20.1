package pin.macaroon.bloomery.datagen;

import com.google.common.collect.Maps;
import net.minecraft.client.item.ClampedModelPredicateProvider;
import net.minecraft.client.item.ModelPredicateProvider;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import pin.macaroon.bloomery.Bloomery;
import pin.macaroon.bloomery.item.ModItems;

import java.util.Map;

public class ModModelPredicateProvider {

    public static void regModModels(){
        Bloomery.LOGGER.info("doing regModModels() stuff");
        regCrossbow(ModItems.BUTTERBOW);
    }

    // wtf is this method bruh
    private static void regCrossbow(Item crossbow){
        ModelPredicateProviderRegistry.register(crossbow, new Identifier("pull"),
                (stack, world, entity, seed) -> {
                    if (entity == null){
                        return 0.0F;
                    } if (entity.getActiveItem() != stack){
                        return 0.0F;
                    } return (float)stack.getMaxUseTime() - entity.getItemUseTimeLeft() / 20.0F;
                }
                );

        ModelPredicateProviderRegistry.register(crossbow, new Identifier("pulling"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F
                );

        ModelPredicateProviderRegistry.register(crossbow, new Identifier("charged"), (stack, world, entity, seed) -> CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
    }
}
