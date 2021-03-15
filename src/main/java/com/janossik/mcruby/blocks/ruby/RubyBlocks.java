package com.janossik.mcruby.blocks.ruby;

import com.janossik.mcruby.blocks.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;


public class RubyBlocks {
    public static RegistryObject<Block> RUBY_BLOCK =
            ModBlocks.register("ruby_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3f, 10f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static RegistryObject<Block> RUBY_ORE =
            ModBlocks.register("ruby_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3.0F, 3.0F).setLightLevel( s -> 3)
                    .harvestLevel(3).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUBY_STAIRS =
            ModBlocks.register("ruby_stairs", () -> new StairsBlock(() -> RUBY_BLOCK.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK)
                            .hardnessAndResistance(3f, 10f)
                            .harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUBY_FENCE =
            ModBlocks.register("ruby_fence", () -> new FenceBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3f, 10f)
                    .harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUBY_FENCE_GATE =
            ModBlocks.register("ruby_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(3f, 10f)
                    .harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUBY_BUTTON =
            ModBlocks.register("ruby_button", () -> new StoneButtonBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3f, 10f)
                    .harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUBY_PRESSURE_PLATE =
            ModBlocks.register("ruby_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.create(Material.ROCK)
                            .hardnessAndResistance(3f, 10f)
                            .harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUBY_SLAB =
            ModBlocks.register("ruby_slab", () -> new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3f, 10f)
                    .harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUBY_WALL =
            ModBlocks.register("ruby_wall", () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3f, 10f)
                    .harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static void register(){}
}
