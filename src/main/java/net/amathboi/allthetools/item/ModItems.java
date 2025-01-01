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
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.QUARTZ, 8, -2.2f))));
    public static final Item LAPIS_SWORD = registerItem("lapis_sword",
            new SwordItem(ModToolMaterials.LAPIS, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.LAPIS, 5, -2.8f))));

    //Pickaxes
    public static final Item QUARTZ_PICKAXE = registerItem("quartz_pickaxe",
            new PickaxeItem(ModToolMaterials.QUARTZ, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.QUARTZ, 5, -2.4f))));
    public static final Item LAPIS_PICKAXE = registerItem("lapis_pickaxe",
            new PickaxeItem(ModToolMaterials.LAPIS, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.LAPIS, 4, -3.0f))));

    //Shovels
    public static final Item QUARTZ_SHOVEL = registerItem("quartz_shovel",
            new ShovelItem(ModToolMaterials.QUARTZ, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.QUARTZ, 5, -2.4f))));
    public static final Item LAPIS_SHOVEL = registerItem("lapis_shovel",
            new ShovelItem(ModToolMaterials.LAPIS, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.LAPIS, 4, -3.0f))));

    //Axes
    public static final Item QUARTZ_AXE = registerItem("quartz_axe",
            new AxeItem(ModToolMaterials.QUARTZ, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.QUARTZ, 9, -2.6f))));
    public static final Item LAPIS_AXE = registerItem("lapis_axe",
            new AxeItem(ModToolMaterials.LAPIS, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.LAPIS, 6, -3.4f))));

    //Hoes
    public static final Item QUARTZ_HOE = registerItem("quartz_hoe",
            new HoeItem(ModToolMaterials.QUARTZ, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.QUARTZ, 0, 0.0f))));
    public static final Item LAPIS_HOE = registerItem("lapis_hoe",
            new HoeItem(ModToolMaterials.LAPIS, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.LAPIS, 0, -3.0f))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AllTheTools.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AllTheTools.LOGGER.info("Registering Mod Items for " + AllTheTools.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

        });
    }
}
