package com.janossik.mcruby.items;

import com.janossik.mcruby.McRubyMod;
import com.janossik.mcruby.material.RubyArmorMaterial;
import com.janossik.mcruby.material.RubyToolsMaterial;
import com.janossik.mcruby.util.Registration;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    public static RegistryObject<Item> RUBY = Registration.ITEMS.register("ruby", ()-> new Item(new Item.Properties().group(McRubyMod.TAB_MOD)));

    //FOOD
    public static RegistryObject<Item> RUBY_APPLE = Registration.ITEMS.register(
            "ruby_apple",
            ()-> new RubyApple()
    );

    //TOOLS
    public static RegistryObject<Item> RUBY_AXE
            = Registration.ITEMS.register(
                    "ruby_axe", ()->
                    new AxeItem(RubyToolsMaterial.RUBY,
                            7,
                            -3.5f,
                            new Item.Properties()
                                    .addToolType(ToolType.AXE,2)
                                    .group(McRubyMod.TAB_MOD)
                    )
    );

    public static RegistryObject<Item> RUBY_PICKAXE
            = Registration.ITEMS.register(
            "ruby_pickaxe", ()->
                    new PickaxeItem(RubyToolsMaterial.RUBY,
                            4,
                            -3.4f,
                            new Item.Properties()
                                    .addToolType(ToolType.PICKAXE,2)
                                    .group(McRubyMod.TAB_MOD)
                    )
    );

    public static RegistryObject<Item> RUBY_SHOVEL
            = Registration.ITEMS.register(
            "ruby_shovel", ()->
                    new ShovelItem(RubyToolsMaterial.RUBY,
                            2f,
                            -3.0f,
                            new Item.Properties()
                                    .addToolType(ToolType.SHOVEL,2)
                                    .group(McRubyMod.TAB_MOD)
                    )
    );

    public static RegistryObject<Item> RUBY_HOE
            = Registration.ITEMS.register(
            "ruby_hoe", ()->
                    new HoeItem(RubyToolsMaterial.RUBY,
                            0,
                            -2.0f,
                            new Item.Properties()
                                    .addToolType(ToolType.HOE,2)
                                    .group(McRubyMod.TAB_MOD)
                    )
    );

    //WEAPONS

    public static RegistryObject<Item> RUBY_SWORD
            = Registration.ITEMS.register(
            "ruby_sword", ()->
                    new SwordItem(RubyToolsMaterial.RUBY,
                            4,
                            -2.6f,
                            new Item.Properties()
                                    .group(McRubyMod.TAB_MOD)
                    )
    );
    public static RegistryObject<Item> RUBY_GREATSWORD
            = Registration.ITEMS.register(
            "ruby_greatsword", ()->
                    new SwordItem(RubyToolsMaterial.RUBY,
                            9,
                            -3.2f,
                            new Item.Properties()
                                    .group(McRubyMod.TAB_MOD)
                    )
    );

    //ARMOR
    public static final RegistryObject<Item> RUBY_HELMET =
            Registration.ITEMS.register("ruby_helmet",
                    ()-> new ArmorItem(RubyArmorMaterial.RUBY, EquipmentSlotType.HEAD,
                            new Item.Properties().group(McRubyMod.TAB_MOD))
            );

    public static final RegistryObject<Item> RUBY_CHESTPLATE =
            Registration.ITEMS.register("ruby_chestplate",
                    ()-> new ArmorItem(RubyArmorMaterial.RUBY, EquipmentSlotType.CHEST,
                            new Item.Properties().group(McRubyMod.TAB_MOD))
            );

    public static final RegistryObject<Item> RUBY_LEGGINGS =
            Registration.ITEMS.register("ruby_leggings",
                    ()-> new ArmorItem(RubyArmorMaterial.RUBY, EquipmentSlotType.LEGS,
                            new Item.Properties().group(McRubyMod.TAB_MOD))
            );

    public static final RegistryObject<Item> RUBY_BOOTS =
            Registration.ITEMS.register("ruby_boots",
                    ()-> new ArmorItem(RubyArmorMaterial.RUBY, EquipmentSlotType.FEET,
                            new Item.Properties().group(McRubyMod.TAB_MOD))
            );

    public static void register(){}
}
