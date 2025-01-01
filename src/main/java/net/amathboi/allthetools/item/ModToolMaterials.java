package net.amathboi.allthetools.item;

import com.google.common.base.Suppliers;
import net.amathboi.allthetools.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    QUARTZ(ModTags.Blocks.INCORRECT_FOR_QUARTZ_TOOL,
            200, 5.0F, 0.0F, 16, () -> Ingredient.ofItems(Items.QUARTZ)),

    LAPIS(ModTags.Blocks.INCORRECT_FOR_LAPIS_TOOL,
            125, 2.0F, 0.0F, 30, () -> Ingredient.ofItems(Items.LAPIS_LAZULI)),

    COPPER(ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL,
            400, 3.0f, 0.0f, 12, () -> Ingredient.ofItems(Items.COPPER_INGOT));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability, final float miningSpeed,
                     final float attackDamage, final int enchantability, final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}

