package xyz.sillynano.burgermod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import xyz.sillynano.burgermod.item.ModItems;

import java.util.List;

// in other words, this is a custom block that converts beef when its on top of a block, and converts beef to a burger

public class MagicBurgerBlock extends Block {
    public MagicBurgerBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player,
                                 BlockHitResult hit) {
        world.playSound(player, pos, SoundEvents.BLOCK_BAMBOO_HIT, SoundCategory.BLOCKS, 1f, 1f);
        return ActionResult.SUCCESS;
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(entity instanceof ItemEntity itemEntity) {
            if(itemEntity.getStack().getItem() == Items.COOKED_BEEF) {
                itemEntity.setStack(new ItemStack(ModItems.BURGER, itemEntity.getStack().getCount()));
            }
        }

        super.onSteppedOn(world, pos, state, entity);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.burgermod.magic_burger_block.shift_down"));
        } else {
            tooltip.add(Text.translatable("tooltip.burgermod.magic_burger_block"));
        }

        super.appendTooltip(stack, context, tooltip, type);
    }
}
