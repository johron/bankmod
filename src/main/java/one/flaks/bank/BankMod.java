package one.flaks.bank;

import net.fabricmc.api.ModInitializer;

import one.flaks.bank.block.ModBlocks;
import one.flaks.bank.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankMod implements ModInitializer {
	public static final String MOD_ID = "bankmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItem();
		ModBlocks.registerModBLocks();
	}
}