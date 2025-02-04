package net.joules.joulescoffeemod;

import net.fabricmc.api.ModInitializer;

import net.joules.joulescoffeemod.item.ModItemGroups;
import net.joules.joulescoffeemod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JoulesOverlyComplexCoffeeMod implements ModInitializer {

	public static final String MOD_ID = "joules-coffee-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}