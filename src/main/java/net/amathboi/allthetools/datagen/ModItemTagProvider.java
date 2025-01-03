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
                .add(ModItems.BONE_SWORD)
                .add(ModItems.FLINT_SWORD)
                .add(ModItems.AMETHYST_SWORD)
                .add(ModItems.COPPER_SWORD)
                .add(ModItems.LAPIS_SWORD)
                .add(ModItems.QUARTZ_SWORD);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.AMETHYST_PICKAXE)
                .add(ModItems.BONE_PICKAXE)
                .add(ModItems.FLINT_PICKAXE)
                .add(ModItems.COPPER_PICKAXE)
                .add(ModItems.LAPIS_PICKAXE)
                .add(ModItems.QUARTZ_PICKAXE);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.AMETHYST_AXE)
                .add(ModItems.BONE_AXE)
                .add(ModItems.FLINT_AXE)
                .add(ModItems.COPPER_AXE)
                .add(ModItems.LAPIS_AXE)
                .add(ModItems.QUARTZ_AXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.AMETHYST_SHOVEL)
                .add(ModItems.BONE_SHOVEL)
                .add(ModItems.FLINT_SHOVEL)
                .add(ModItems.COPPER_SHOVEL)
                .add(ModItems.LAPIS_SHOVEL)
                .add(ModItems.QUARTZ_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.BONE_HOE)
                .add(ModItems.FLINT_HOE)
                .add(ModItems.AMETHYST_HOE)
                .add(ModItems.COPPER_HOE)
                .add(ModItems.LAPIS_HOE)
                .add(ModItems.QUARTZ_HOE);
    }
}
