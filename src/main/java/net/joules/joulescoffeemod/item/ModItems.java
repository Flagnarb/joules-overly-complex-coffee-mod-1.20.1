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
    public static Item COFFEE_BEAN_A_LR = registerItem("coffee_bean_a_lr", new Item(new FabricItemSettings()));
    public static Item COFFEE_BEAN_A_MR = registerItem("coffee_bean_a_mr", new Item(new FabricItemSettings()));
    public static Item COFFEE_BEAN_A_DR = registerItem("coffee_bean_a_dr", new Item(new FabricItemSettings()));
    public static Item COFFEE_BEAN_A_XR = registerItem("coffee_bean_a_xr", new Item(new FabricItemSettings()));
    public static Item COFFEE_BEAN_A_RAW = registerItem("coffee_bean_a_raw", new Item(new FabricItemSettings()));
    public static Item COFFEE_CHERRY_A = registerItem("coffee_cherry_a", new Item(new FabricItemSettings()));

    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries) {
        entries.add(COFFEE_BEAN_A_LR);
        entries.add(COFFEE_BEAN_A_MR);
        entries.add(COFFEE_BEAN_A_DR);
        entries.add(COFFEE_BEAN_A_XR);
        entries.add(COFFEE_BEAN_A_RAW);
        entries.add(COFFEE_CHERRY_A);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(JoulesOverlyComplexCoffeeMod.MOD_ID, name), item);
    }

    public static void  registerModItems() {
        JoulesOverlyComplexCoffeeMod.LOGGER.info("Registering Mod Items for " + JoulesOverlyComplexCoffeeMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);

    }
}
