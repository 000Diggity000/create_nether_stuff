package com.diggity.nether_stuff.item;

import com.diggity.nether_stuff.NetherStuffMod;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

import org.intellij.lang.annotations.Identifier;

public class ModItems {
	public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

	private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
		entries.add(RUBY);
		entries.add(RAW_RUBY);
	}

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(NetherStuffMod.ID, name), item);
	}

	public static void registerModItems() {
		TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
	}
}
