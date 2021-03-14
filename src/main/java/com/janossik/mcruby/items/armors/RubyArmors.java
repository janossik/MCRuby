package com.janossik.mcruby.items.armors;

import com.janossik.mcruby.McRubyMod;
import com.janossik.mcruby.material.RubyArmorMaterial;
import com.janossik.mcruby.util.Registration;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class RubyArmors {
    public static final RegistryObject<Item> RUBY_HELMET =
            RegistryArmorElement("ruby_helmet", EquipmentSlotType.HEAD);

    public static final RegistryObject<Item> RUBY_CHESTPLATE =
            RegistryArmorElement("ruby_chestplate", EquipmentSlotType.CHEST);

    public static final RegistryObject<Item> RUBY_LEGGINGS =
            RegistryArmorElement("ruby_leggings", EquipmentSlotType.LEGS);

    public static final RegistryObject<Item> RUBY_BOOTS =
            RegistryArmorElement("ruby_boots", EquipmentSlotType.FEET);

    public static RegistryObject<Item> RegistryArmorElement(String name, EquipmentSlotType slot){
        return Registration.ITEMS.register(name,
                ()-> new ArmorItem(RubyArmorMaterial.RUBY, slot,
                        new Item.Properties().group(McRubyMod.TAB_MOD))
        );
    };

    public static void register(){}
}
