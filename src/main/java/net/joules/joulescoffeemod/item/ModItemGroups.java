package net.joules.joulescoffeemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.joules.joulescoffeemod.JoulesOverlyComplexCoffeeMod;
import net.joules.joulescoffeemod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup JOULES_COFFEE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(JoulesOverlyComplexCoffeeMod.MOD_ID, "joulescoffee"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.joulescoffee"))
                    .icon(() -> new ItemStack(ModItems.COFFEE_BEAN_A_LR)).entries((displayContext, entries) -> {



                        entries.add(ModItems.COFFEE_CHERRY_A);
                        entries.add(ModItems.COFFEE_BEAN_A_RAW);
                        entries.add(ModItems.COFFEE_BEAN_A_LR);
                        entries.add(ModItems.COFFEE_BEAN_A_MR);
                        entries.add(ModItems.COFFEE_BEAN_A_DR);
                        entries.add(ModItems.COFFEE_BEAN_A_XR);



                        entries.add(ModBlocks.COFFEE_A_RAW_BLOCK);
                        entries.add(ModBlocks.COFFEE_A_LR_BLOCK);



                    }).build());

    public static void registerItemGroups() {
        JoulesOverlyComplexCoffeeMod.LOGGER.info("Registering Item Groups for " + JoulesOverlyComplexCoffeeMod.MOD_ID);
    }
}
