package com.janossik.mcruby.items.tools;

import com.janossik.mcruby.McRubyMod;
import com.janossik.mcruby.material.RubyToolsMaterial;
import com.janossik.mcruby.util.Registration;
import net.minecraft.item.*;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class RubyTools {

    public static RegistryObject<Item> RUBY_AXE
            = RegistryTool("ruby_axe",6,-3.5f, ToolType.PICKAXE,2);

    public static RegistryObject<Item> RUBY_PICKAXE
            = RegistryTool("ruby_pickaxe",3,-3.2f, ToolType.PICKAXE,2);

    public static RegistryObject<Item> RUBY_SHOVEL
            = RegistryTool("ruby_shovel",1,-3.0f, ToolType.SHOVEL,2);

    public static RegistryObject<Item> RUBY_HOE
            = RegistryTool("ruby_hoe",0,-2.0f, ToolType.HOE,2);

    public static RegistryObject<Item> RegistryTool(String name, int attackDamage, float attackSpeed, ToolType type, int toolLevel) {
        return Registration.ITEMS.register(
                name, () -> new HoeItem(RubyToolsMaterial.RUBY, attackDamage, attackSpeed,
                        new Item.Properties()
                                .addToolType(type, toolLevel)
                                .group(McRubyMod.TAB_MOD)
                )
        );
    }

    public static void register() {}
}
