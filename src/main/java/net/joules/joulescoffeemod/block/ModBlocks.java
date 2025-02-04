package net.joules.joulescoffeemod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.joules.joulescoffeemod.JoulesOverlyComplexCoffeeMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block COFFEE_A_BLOCK = registerBlock("coffee_a_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block RAW_COFFEE_A_BLOCK = registerBlock("raw_coffee_a_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).sounds(BlockSoundGroup.WART_BLOCK)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(JoulesOverlyComplexCoffeeMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(JoulesOverlyComplexCoffeeMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

    }

    public static void registerModBlocks() {
        JoulesOverlyComplexCoffeeMod.LOGGER.info("Registering Modded Blocks for " + JoulesOverlyComplexCoffeeMod.MOD_ID);

    }
}
