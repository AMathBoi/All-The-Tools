package net.amathboi.allthetools.util;

import net.amathboi.allthetools.AllTheTools;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_QUARTZ_TOOL = createTag("incorrect_for_quartz_tool");
        public static final TagKey<Block> INCORRECT_FOR_LAPIS_TOOL = createTag("incorrect_for_lapis_tool");
        public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = createTag("incorrect_for_copper_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(AllTheTools.MOD_ID, name));
        }

        public static void registerModTags() {
            AllTheTools.LOGGER.info("Registering Tags for " + AllTheTools.MOD_ID);
        }
    }
}
