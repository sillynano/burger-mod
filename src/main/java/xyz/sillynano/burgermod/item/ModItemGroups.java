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
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BURGER))
                    .displayName(Text.translatable("itemgroup.burgermod.burger_item_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BURGER);
                        entries.add(ModItems.RAW_BURGER);

                    }).build());

    public static final ItemGroup BURGER_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BurgerMod.MOD_ID, "burger_block_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.BURGER_BLOCK))
                    .displayName(Text.translatable("itemgroup.burgermod.burger_block_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BURGER_BLOCK);
                        entries.add(ModBlocks.RAW_BURGER_BLOCK);
                        entries.add(ModBlocks.BURGER_ORE);
                        entries.add(ModBlocks.BURGER_DEEPSLATE_ORE);
                        entries.add(ModBlocks.MAGIC_BURGER_BLOCK);
                    }).build());



    public static void registerItemGroups() {
        BurgerMod.LOGGER.info("Registering Item Groups for " + BurgerMod.MOD_ID);
    }
}
