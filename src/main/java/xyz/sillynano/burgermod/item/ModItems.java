package xyz.sillynano.burgermod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.sillynano.burgermod.BurgerMod;

public class ModItems {
    public static final Item BURGER = registerItem("burger", new Item(new Item.Settings()));

    public static final Item RAW_BURGER = registerItem("raw_burger", new Item(new Item.Settings()));

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
