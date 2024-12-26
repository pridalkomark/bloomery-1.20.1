package pin.macaroon.bloomery.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.world.World;
import pin.macaroon.bloomery.Bloomery;

public class ButterArrowEntity extends ArrowEntity {
    public ButterArrowEntity(EntityType<? extends ArrowEntity> entityType, World world) {
        super(entityType, world);
    }

    public ButterArrowEntity(World world, LivingEntity owner) {
        super(world, owner);
    }

    public ButterArrowEntity(World world, double x, double y, double z) {
        super(world, x, y, z);
    }

    @Override
    protected void onHit(LivingEntity target) {
        if(target != null){
            int idk = (int)Math.pow((double) this.age, 1.3d);
            Bloomery.LOGGER.info(Integer.toString(idk));
            target.setOnFireFor(idk);
        }
    }

}
