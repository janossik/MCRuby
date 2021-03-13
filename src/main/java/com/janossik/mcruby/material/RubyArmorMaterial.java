package com.janossik.mcruby.material;

import com.janossik.mcruby.McRubyMod;
import com.janossik.mcruby.items.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum RubyArmorMaterial implements IArmorMaterial {
    RUBY(McRubyMod.MOD_ID +":ruby", 55, new int[]{2, 5, 7, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F, 0.1F, Ingredient.fromStacks(new ItemStack(ModItems.RUBY.get())));

    public final int durability;
    private final int[] damageReductionAmountArray;
    public final int enchantability;
    public final SoundEvent soundEvent;
    public final Ingredient repairMaterial;
    public final String name;
    public final float toughness;
    public final float knockbackResistance;

    RubyArmorMaterial(String name, int durability,int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Ingredient repairMaterial) {
        this.name = name;
        this.durability = durability;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return durability;
    }

    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return knockbackResistance;
    }
}
