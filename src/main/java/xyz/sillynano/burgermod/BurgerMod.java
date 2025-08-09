package xyz.sillynano.burgermod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.sillynano.burgermod.block.ModBlocks;
import xyz.sillynano.burgermod.item.ModItemGroups;
import xyz.sillynano.burgermod.item.ModItems;

public class BurgerMod implements ModInitializer {
	public static final String MOD_ID = "burgermod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}