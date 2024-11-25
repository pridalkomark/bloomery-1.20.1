package pin.macaroon.bloomery.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import pin.macaroon.bloomery.Bloomery;
import pin.macaroon.bloomery.block.ModBlocks;

public class ModItemGroups {



    public static void registerItemGroups(){
        Bloomery.LOGGER.info("doing them item groups B-)");
        /*
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addAfter(Items.GLASS, ModBlocks.BOXED_GLASS);
        });
         */
    }
}
