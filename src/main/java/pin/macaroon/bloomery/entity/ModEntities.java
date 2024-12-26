package pin.macaroon.bloomery.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pin.macaroon.bloomery.Bloomery;

public class ModEntities {
    /*public static final EntityType<ButterArrowEntity> BUTERPROJECTILEENTITY = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Bloomery.MOD_ID, "butter_projectile"), FabricEntityTypeBuilder.create(SpawnGroup.MISC,
                    ButterArrowEntity::new).build());*/

    public static void registerEntities() {
        Bloomery.LOGGER.info("ents pls work i cant take it anymore");
    }
}
