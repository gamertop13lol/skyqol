package net.gamer_top_13.skyqol;

import net.fabricmc.api.ModInitializer;

import net.gamer_top_13.skyqol.block.ModBlocks;
import net.gamer_top_13.skyqol.item.ModItemGroups;
import net.gamer_top_13.skyqol.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkyQOL implements ModInitializer {
	public static final String MOD_ID = "skyqol";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("skyQOL is up");
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}
}