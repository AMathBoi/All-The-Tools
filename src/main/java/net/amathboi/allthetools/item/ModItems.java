package net.amathboi.allthetools.item;

import net.amathboi.allthetools.AllTheTools;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //Swords
    public static final Item QUARTZ_SWORD = registerItem("quartz_sword",
            new SwordItem(ModToolMaterials.QUARTZ, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.QUARTZ, 3, -2.4f))));

    //Pickaxes
    public static final Item QUARTZ_PICKAXE = registerItem("quartz_pickaxe",
            new PickaxeItem(ModToolMaterials.QUARTZ, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.QUARTZ, 1, -2.8f))));

    //Shovels
    public static final Item QUARTZ_SHOVEL = registerItem("quartz_shovel",
            new ShovelItem(ModToolMaterials.QUARTZ, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.QUARTZ, 1.5f, -3.0f))));

    //Axes
    public static final Item QUARTZ_AXE = registerItem("quartz_axe",
            new AxeItem(ModToolMaterials.QUARTZ, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.QUARTZ, 6, -3.2f))));

    //Hoes
    public static final Item QUARTZ_HOE = registerItem("quartz_hoe",
            new HoeItem(ModToolMaterials.QUARTZ, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.QUARTZ, 0, -3.0f))));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AllTheTools.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AllTheTools.LOGGER.info("Registering Mod Items for " + AllTheTools.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

        });
    }
}
