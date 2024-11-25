package pin.macaroon.bloomery.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pin.macaroon.bloomery.Bloomery;

public class ModEnchants {
    public static Enchantment GRAPPLING = register("grappling", new GrapplingEnchant());
    public static Enchantment EFFETSIDK = register("effectsidk", new EffectEnchant(1));

    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(Bloomery.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {

        Bloomery.LOGGER.debug("enchantments stuff lmao xdxd");
    }
}
