package net.amathboi.allthetools;

import net.amathboi.allthetools.component.ModDataComponentTypes;
import net.amathboi.allthetools.item.ModItemGroups;
import net.amathboi.allthetools.item.ModItems;
import net.amathboi.allthetools.util.ModTags;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AllTheTools implements ModInitializer {
	public static final String MOD_ID = "allthetools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModDataComponentTypes.registerDataComponentTypes();
		ModTags.Blocks.registerModTags();
	}
}