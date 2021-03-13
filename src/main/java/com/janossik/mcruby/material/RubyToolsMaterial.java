package com.janossik.mcruby.material;

import com.janossik.mcruby.items.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;

public enum RubyToolsMaterial implements IItemTier {
    RUBY(
            2031,
            8.0F,
            2f,
            2,
            14,
            Ingredient.fromStacks(new ItemStack(ModItems.RUBY.get()))
    );

    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int harvestLevel;
    private final int enchantability;
    private final Ingredient repairMaterial;

    RubyToolsMaterial(int maxUses, float efficiency, float attackDamage, int harvestLevel, int enchantability, Ingredient repairMaterial) {
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial;
    }
}
