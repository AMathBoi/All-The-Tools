package net.amathboi.allthetools.datagen;

import net.amathboi.allthetools.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.QUARTZ_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.QUARTZ_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.QUARTZ_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.QUARTZ_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.QUARTZ_HOE);
    }
}
