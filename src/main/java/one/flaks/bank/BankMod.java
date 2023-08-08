package one.flaks.bank;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankMod implements ModInitializer {
	public static final String VERSION = "0.0.1-1.20.1-DEV";
	public static final String MOD_ID = "flaks-bank";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}