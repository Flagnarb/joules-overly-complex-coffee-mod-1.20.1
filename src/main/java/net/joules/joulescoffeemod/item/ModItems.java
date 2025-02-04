package net.joules.joulescoffeemod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.joules.joulescoffeemod.JoulesOverlyComplexCoffeeMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item COFFEE_BEAN_A = registerItem("coffee_bean_a", new Item(new FabricItemSettings()));
    public static Item RAW_COFFEE_BEAN_A = registerItem("raw_coffee_bean_a", new Item(new FabricItemSettings()));

    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries) {
        entries.add(COFFEE_BEAN_A);
        entries.add(RAW_COFFEE_BEAN_A);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(JoulesOverlyComplexCoffeeMod.MOD_ID, name), item);
    }

    public static void  registerModItems() {
        JoulesOverlyComplexCoffeeMod.LOGGER.info("Registering Mod Items for " + JoulesOverlyComplexCoffeeMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);

    }
}
