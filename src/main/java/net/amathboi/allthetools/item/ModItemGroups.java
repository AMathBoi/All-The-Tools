package net.amathboi.allthetools.item;

import net.amathboi.allthetools.AllTheTools;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ALL_THE_TOOLS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AllTheTools.MOD_ID, "all_the_tools_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.QUARTZ_PICKAXE))
                    .displayName(Text.translatable("itemgroup.allthetools.all_the_tools_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.QUARTZ_SWORD);
                        entries.add(ModItems.QUARTZ_PICKAXE);
                        entries.add(ModItems.QUARTZ_AXE);
                        entries.add(ModItems.QUARTZ_SHOVEL);
                        entries.add(ModItems.QUARTZ_HOE);

                        entries.add(ModItems.LAPIS_SWORD);
                        entries.add(ModItems.LAPIS_PICKAXE);
                        entries.add(ModItems.LAPIS_AXE);
                        entries.add(ModItems.LAPIS_SHOVEL);
                        entries.add(ModItems.LAPIS_HOE);

                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_HOE);

                        entries.add(ModItems.AMETHYST_SWORD);
                        entries.add(ModItems.AMETHYST_PICKAXE);
                        entries.add(ModItems.AMETHYST_AXE);
                        entries.add(ModItems.AMETHYST_SHOVEL);
                        entries.add(ModItems.AMETHYST_HOE);

                        entries.add(ModItems.BONE_SWORD);
                        entries.add(ModItems.BONE_PICKAXE);
                        entries.add(ModItems.BONE_AXE);
                        entries.add(ModItems.BONE_SHOVEL);
                        entries.add(ModItems.BONE_HOE);

                        entries.add(ModItems.FLINT_SWORD);
                        entries.add(ModItems.FLINT_PICKAXE);
                        entries.add(ModItems.FLINT_AXE);
                        entries.add(ModItems.FLINT_SHOVEL);
                        entries.add(ModItems.FLINT_HOE);
                    }).build());

    public static void registerItemGroups() {
        AllTheTools.LOGGER.info("Registering Item Groups for " + AllTheTools.MOD_ID);
    }
}
