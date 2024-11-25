package pin.macaroon.bloomery.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import pin.macaroon.bloomery.entity.effect.ModStatusEffects;

public class ModFoodComponents {
    public static  final FoodComponent STEEL_APPLE = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 0), 1f)
            .build();
    public static  final FoodComponent SPORT_SZELET = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 300, 0), 0.7f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200, 0), 0.4f)
            .build();
    public static  final FoodComponent CREEPER_COOKIE = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(ModStatusEffects.EXPLOSIVE, 1, 75), 0.5f) //amplifier a szazalek
            .build();
}
