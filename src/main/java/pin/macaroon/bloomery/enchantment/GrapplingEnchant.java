package pin.macaroon.bloomery.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

public class GrapplingEnchant extends Enchantment {

    private static double knockbackPower = 0.4;

    protected GrapplingEnchant(double sigma) {
        super(Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
        knockbackPower = sigma;
    }

    protected GrapplingEnchant() {
        super(Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
        knockbackPower = 1.4;
    }

    @Override
    public int getMinPower(int level) {
        return 5;
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof Entity){
            target.addVelocity(knockbackPower,target.getX() - user.getX(), target.getZ() - user.getZ());
        }
        super.onTargetDamaged(user, target, level);
    }
}
