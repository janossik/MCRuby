package com.janossik.mcruby.items;

import com.janossik.mcruby.McRubyMod;
import com.janossik.mcruby.util.Config;
import com.janossik.mcruby.util.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class RubyApple extends Item {
    public RubyApple(){
        super(new Item.Properties().group(McRubyMod.TAB_MOD).food(new Food.Builder()
                .hunger(5)
                .saturation(1.5f)
                .effect(() -> new EffectInstance(Effects.LUCK, Config.RUBY_LUCK_DURATION.get(), 1), 0.3f)
                .build()));
    }

    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltip,
                               ITooltipFlag flag)
    {
        if(KeyboardHelper.isHoldingShift())
        {
            tooltip.add(new TranslationTextComponent("mcruby.item.tooltip.appleRuby"));
        }
        else
        {
            tooltip.add(new TranslationTextComponent("mcruby.item.tooltip.shift"));
        }

        super.addInformation(stack, world, tooltip, flag);
    }
}
