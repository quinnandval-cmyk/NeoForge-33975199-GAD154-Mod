package net.william.dragonwingelytra.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.william.dragonwingelytra.dragonwingelytra;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(dragonwingelytra.MOD_ID);

    public static final DeferredItem<Item> DRAGONSCALE = ITEMS.registerItem("dragonscale",
           Item::new, new Item.Properties());



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
