package com.diggity.nether_stuff.item;

import com.diggity.nether_stuff.NetherStuffMod;


import com.diggity.nether_stuff.creative_tab.RegisterTab;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.foundation.utility.Components;
import com.tterrag.registrate.util.entry.ItemEntry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import com.simibubi.create.foundation.item.TagDependentIngredientItem;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;

import org.intellij.lang.annotations.Identifier;

import static com.diggity.nether_stuff.NetherStuffMod.REGISTRATE;
import static com.simibubi.create.AllTags.AllItemTags.CRUSHED_RAW_MATERIALS;
import static com.simibubi.create.AllTags.AllItemTags.PLATES;
import static com.simibubi.create.AllTags.forgeItemTag;


public class ModItems {

	static {
		REGISTRATE.setCreativeTab(RegisterTab.BASE_CREATIVE_TAB.key());
	}
	public static final ItemEntry<Item> SOUL =
			taggedIngredient("soul", forgeItemTag("soul"));

	@SafeVarargs
	private static ItemEntry<Item> taggedIngredient(String name, TagKey<Item>... tags) {
		return REGISTRATE.item(name, Item::new)
				.tag(tags)
				.register();
	}
	public static void register()
	{

	}
}
