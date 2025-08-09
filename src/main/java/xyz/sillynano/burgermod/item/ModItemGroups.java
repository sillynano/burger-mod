package xyz.sillynano.burgermod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import xyz.sillynano.burgermod.block.ModBlocks;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xyz.sillynano.burgermod.BurgerMod;

public class ModItemGroups {
    public static final ItemGroup BURGER_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BurgerMod.MOD_ID, "burger_item_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.Burger))
                    .displayName(Text.translatable("itemgroup.burgermod.burger_item_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.Burger);
                        entries.add(ModItems.Raw_Burger);

                    }).build());

    public static final ItemGroup BURGER_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BurgerMod.MOD_ID, "burger_block_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.Burger_Block))
                    .displayName(Text.translatable("itemgroup.burgermod.burger_block_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.Burger_Block);
                        entries.add(ModBlocks.Raw_Burger_Block);
                    }).build());



    public static void registerItemGroups() {
        BurgerMod.LOGGER.info("Registering Item Groups for " + BurgerMod.MOD_ID);
    }
}
