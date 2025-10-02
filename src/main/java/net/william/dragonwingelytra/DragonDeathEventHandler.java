package net.william.dragonwingelytra;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.william.dragonwingelytra.item.ModItems;

public class DragonDeathEventHandler {

    @SubscribeEvent
    public static void onDragonDeath(LivingDeathEvent event) {
        LivingEntity entity = event.getEntity();
        Level level = entity.level();

        if (!level.isClientSide() && entity instanceof EnderDragon) {
            ItemStack dragonscale = new ItemStack(ModItems.DRAGONSCALE.get());
            ItemEntity itemEntity = new ItemEntity(
                    level,
                    entity.getX(), entity.getY(), entity.getZ(),
                    dragonscale
            );
            level.addFreshEntity(itemEntity);
        }
    }
}
