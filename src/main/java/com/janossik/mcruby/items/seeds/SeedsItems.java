package com.janossik.mcruby.items.seeds;

import com.janossik.mcruby.McRubyMod;
import com.janossik.mcruby.blocks.crops.CropsBlocks;
import com.janossik.mcruby.util.Registration;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class SeedsItems {
    public static final RegistryObject<Item> BRACTEATUS_SEED = Registration.ITEMS.register("bracteatus_seed",
            ()-> new BlockItem(CropsBlocks.BRACTEATUS_CROP.get(), new Item.Properties().group(McRubyMod.TAB_MOD)));

    public static void register(){}
}
