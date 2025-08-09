package xyz.sillynano.burgermod.item;

import net.minecraft.item.Item;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.sillynano.burgermod.BurgerMod;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import java.util.List;

public class ModItems {
    public static final Item BURGER = registerItem("burger", new Item(new Item.Settings()
    .food(ModFoodComponents.BURGER)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.burgermod.burger"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item RAW_BURGER = registerItem("raw_burger", new Item(new Item.Settings()
    .food(ModFoodComponents.RAW_BURGER)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.burgermod.raw_burger"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BurgerMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BurgerMod.LOGGER.info("Registering Mod Items for " + BurgerMod.MOD_ID);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
//           entries.add(BURGER);
//           entries.add(RAW_BURGER);
//        });
    }
}
