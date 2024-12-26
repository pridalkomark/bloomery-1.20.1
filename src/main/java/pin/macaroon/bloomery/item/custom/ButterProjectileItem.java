package pin.macaroon.bloomery.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import pin.macaroon.bloomery.entity.ButterArrowEntity;

public class ButterProjectileItem extends ArrowItem {
    public ButterProjectileItem(Settings settings) {
        super(settings);
    }

    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        ButterArrowEntity arrowEntity = new ButterArrowEntity(world, shooter);
        arrowEntity.initFromStack(stack);
        return arrowEntity;
    }
}
