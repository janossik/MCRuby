package com.janossik.mcruby.blocks.crops;

import com.janossik.mcruby.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;

public class CropsBlocks {
    public static final RegistryObject<Block> BRACTEATUS_CROP = Registration.BLOCKS.register("bracteatus_crop",
            ()-> new BracteatusCrop(AbstractBlock.Properties.from(Blocks.WHEAT)));

    public static void register() {}
}
