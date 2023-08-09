package one.flaks.bank.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import one.flaks.bank.BankMod;

public class ModBlocks {
    // Not used anymore (*arrow down*)
    /*public static final Block COIN_PRESS = registerBlock("coin_press",
            new Block(FabricBlockSettings.copyOf(Blocks.ANVIL)));*/

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BankMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BankMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBLocks() {
        BankMod.LOGGER.info("Registering mod blocks for " + BankMod.MOD_ID);
    }
}
