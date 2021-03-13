package com.janossik.mcruby.blocks;

import com.janossik.mcruby.McRubyMod;
import com.janossik.mcruby.util.Registration;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import java.util.function.Supplier;

public class ModBlocks {

    public static RegistryObject<Block> RUBY_BLOCK =
            register("ruby_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3f, 10f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static RegistryObject<Block> RUBY_ORE =
            register("ruby_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3f, 10f).setLightLevel(s->3)
                    .harvestLevel(3).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUBY_STAIRS =
            register("ruby_stairs", () -> new StairsBlock(() -> ModBlocks.RUBY_BLOCK.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK)
                            .hardnessAndResistance(3f, 10f)
                            .harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUBY_FENCE =
            register("ruby_fence", () -> new FenceBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3f, 10f)
                    .harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUBY_FENCE_GATE =
            register("ruby_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(3f, 10f)
                    .harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUBY_BUTTON =
            register("ruby_button", () -> new StoneButtonBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3f, 10f)
                    .harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUBY_PRESSURE_PLATE =
            register("ruby_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.create(Material.ROCK)
                            .hardnessAndResistance(3f, 10f)
                            .harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUBY_SLAB =
            register("ruby_slab", () -> new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3f, 10f)
                    .harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUBY_WALL =
            register("ruby_wall", () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3f, 10f)
                    .harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));


    public static void register() { }

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().group(McRubyMod.TAB_MOD)));
        return toReturn;
    }
}
