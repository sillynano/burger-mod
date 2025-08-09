package xyz.sillynano.burgermod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import xyz.sillynano.burgermod.BurgerMod;
import xyz.sillynano.burgermod.block.custom.MagicBurgerBlock;

public class ModBlocks {

    public static final Block BURGER_BLOCK = registerBlock("burger_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block RAW_BURGER_BLOCK = registerBlock("raw_burger_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block BURGER_ORE = registerBlock("burger_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block BURGER_DEEPSLATE_ORE = registerBlock("burger_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block MAGIC_BURGER_BLOCK = registerBlock("magic_burger_block",
            new MagicBurgerBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BurgerMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BurgerMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        BurgerMod.LOGGER.info("Registering Mod Blocks for " + BurgerMod.MOD_ID);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
//            entries.add(ModBlocks.Burger_Block);
//            entries.add(ModBlocks.Raw_Burger_Block);
//        });
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
//            entries.add(ModBlocks.BURGER_ORE);
//            entries.add(ModBlocks.BURGER_DEEPSLATE_ORE);
//        });
    }
}
