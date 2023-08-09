package one.flaks.bank.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import one.flaks.bank.BankMod;

public class ModItems {
    public static final Item MELTED_COIN = registerItem("melted_coin", new Item(new FabricItemSettings()));
    public static final Item MELTED_COIN_PILE = registerItem("melted_coin_pile", new Item(new FabricItemSettings()));
    public static final Item COIN = registerItem("coin", new Item(new FabricItemSettings()));
    public static final Item COIN_PILE = registerItem("coin_pile", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(MELTED_COIN);
        entries.add(MELTED_COIN_PILE);
        entries.add(COIN);
        entries.add(COIN_PILE);
    }

    private static void addItemToFunctionalItemGroup(FabricItemGroupEntries entries) {
        // Nothing here
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BankMod.MOD_ID, name), item);
    }

    public static void registerModItem() {
        BankMod.LOGGER.info("Registering mod items for " + BankMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addItemToFunctionalItemGroup);
    }
}
