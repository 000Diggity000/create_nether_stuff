package com.diggity.nether_stuff;

import com.diggity.nether_stuff.fluid.ModFluids;
import com.diggity.nether_stuff.item.ModItems;
import com.diggity.nether_stuff.item.TestItem;
import com.simibubi.create.Create;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;


import net.minecraft.world.item.Rarity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.IDN;

import static com.simibubi.create.Create.REGISTRATE;

public class NetherStuffMod implements ModInitializer {
	public static final String ID = "nether_stuff";
	public static final String NAME = "Nether Stuff";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(ID);


	@Override
	public void onInitialize() {

		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);
		ModItems.register();
		REGISTRATE.register();
		ModFluids.register();
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(ID, path);
	}
}
