package com.janossik.mcruby.blocks;


import com.janossik.mcruby.McRubyMod;
import com.janossik.mcruby.blocks.crops.CropsBlocks;
import com.janossik.mcruby.blocks.ruby.RubyBlocks;
import com.janossik.mcruby.util.Registration;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {


    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().group(McRubyMod.TAB_MOD)));
        return toReturn;
    }

    public static void register(){
        RubyBlocks.register();
        CropsBlocks.register();
    }

}
