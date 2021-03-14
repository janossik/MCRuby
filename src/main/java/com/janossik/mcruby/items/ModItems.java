package com.janossik.mcruby.items;

import com.janossik.mcruby.McRubyMod;
import com.janossik.mcruby.items.armors.ArmorsItems;
import com.janossik.mcruby.items.foods.FoodsItems;
import com.janossik.mcruby.items.seeds.SeedsItems;
import com.janossik.mcruby.items.tools.ToolsItems;
import com.janossik.mcruby.items.weapons.WeaponsItems;
import com.janossik.mcruby.util.Registration;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;


public class ModItems {
    public static RegistryObject<Item> RUBY = Registration.ITEMS.register("ruby", ()-> new Item(new Item.Properties().group(McRubyMod.TAB_MOD)));
    public static void register(){
        ArmorsItems.register();
        ToolsItems.register();
        FoodsItems.register();
        WeaponsItems.register();
        SeedsItems.register();
    }
}
