package net.william.dragonwingelytra.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;
import net.william.dragonwingelytra.dragonwingelytra;
import net.william.dragonwingelytra.item.ModItems;
import net.william.dragonwingelytra.loot.AddItemModifier;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, dragonwingelytra.MOD_ID);
    }

    @Override
    protected void start() {

        this.add("dragonscale_from_ender_dragon",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/enderman")).build()
                }, ModItems.DRAGONSCALE.get()));

    }
}
