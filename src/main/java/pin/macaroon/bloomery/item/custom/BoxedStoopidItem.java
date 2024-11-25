package pin.macaroon.bloomery.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.StackReference;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ClickType;
import net.minecraft.util.math.BlockPos;

public class BoxedStoopidItem extends ToolItem {
    private BlockPos pos1 = null;
    private BlockPos pos2 = null;

    public BoxedStoopidItem(ToolMaterial material, Settings settings) {
        super(material, settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        //context.getBlockPos()
        return ActionResult.SUCCESS;
    }


}
