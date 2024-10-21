package net.tribush.overlord;

import net.fabricmc.api.ModInitializer;

import net.tribush.overlord.item.ModItemGroups;
import net.tribush.overlord.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Overlord implements ModInitializer {
	public static final String MOD_ID = "overlord";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}