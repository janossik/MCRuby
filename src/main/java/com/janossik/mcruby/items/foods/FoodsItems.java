package com.janossik.mcruby.items.foods;

import com.janossik.mcruby.util.Registration;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class FoodsItems {
    public static RegistryObject<Item> RUBY_APPLE = Registration.ITEMS.register(
            "ruby_apple",
            RubyApple::new
    );

    public static RegistryObject<Item> BRACTEATUS_YIELD = Registration.ITEMS.register(
            "bracteatus_yield",
            BracteatusYield::new
    );
    public static void register(){}
}
