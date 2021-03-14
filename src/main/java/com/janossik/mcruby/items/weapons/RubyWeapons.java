package com.janossik.mcruby.items.weapons;

import com.janossik.mcruby.McRubyMod;
import com.janossik.mcruby.material.RubyToolsMaterial;
import com.janossik.mcruby.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;

public class RubyWeapons {
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
    public static void register() {}
}
