package com.diggity.nether_stuff;

import com.simibubi.create.Create;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Identifier;

import net.minecraft.world.item.Item;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.IDN;

public class NetherStuffMod implements ModInitializer {
	public static final String ID = "nether_stuff";
	public static final String NAME = "Nether Stuff";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
	public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings());

	@Override
	public void onInitialize() {

		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);
		Registry.register(Registries.ITEM, new Identifier(ID, "custom_item"), CUSTOM_ITEM);
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(ID, path);
	}
}
