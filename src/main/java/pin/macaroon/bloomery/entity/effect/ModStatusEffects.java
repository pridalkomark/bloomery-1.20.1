package pin.macaroon.bloomery.entity.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pin.macaroon.bloomery.Bloomery;

public class ModStatusEffects {

    public static final StatusEffect EXPLOSIVE = registerEffect("explosive", new ExplosiveStatusEffect());

    private static StatusEffect registerEffect(String name, StatusEffect statusEffect){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Bloomery.MOD_ID, name), statusEffect);
    }

    public static void registerModEffects(){
        Bloomery.LOGGER.info("registering effects");
    }
}
