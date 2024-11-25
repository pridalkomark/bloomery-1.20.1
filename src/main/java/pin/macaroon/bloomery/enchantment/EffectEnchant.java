package pin.macaroon.bloomery.enchantment;

import com.mojang.brigadier.ParseResults;
import net.minecraft.client.sound.Sound;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import pin.macaroon.bloomery.Bloomery;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class EffectEnchant extends Enchantment {

    private static String epicBoxedCommand = "particle minecraft:dust_color_transition 1.0 0.0 1 3 1.0 0.1 10 ^ ^1.5 ^5 1 0.0 1.0 1 50 force";

    protected EffectEnchant(double sigma) {
        super(Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
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
        if(target instanceof LivingEntity){
            List effects = new ArrayList(user.getStatusEffects());
            user.clearStatusEffects();
            for(int i = 0; effects.size() > i; i++){
                Bloomery.LOGGER.info(effects.get(i).toString());
                ((LivingEntity) target).setStatusEffect((StatusEffectInstance) effects.get(i), user);
            }
            //user.getServer().getCommandManager().execute(, this.epicBoxedCommand);
            //user.getWorld().
            user.getWorld().playSound(null, user.getBlockPos(),SoundEvents.ITEM_TRIDENT_THROW, SoundCategory.PLAYERS, 1F, 1.4F);
        }
        super.onTargetDamaged(user, target, level);
    }
}
