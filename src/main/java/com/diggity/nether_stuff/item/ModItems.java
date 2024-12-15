package com.diggity.nether_stuff.item;

import com.diggity.nether_stuff.NetherStuffMod;


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
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;

import org.intellij.lang.annotations.Identifier;

import static com.diggity.nether_stuff.NetherStuffMod.REGISTRATE;


public class ModItems {
	public static final ResourceKey<CreativeModeTab> BASE = ResourceKey.create(Registries.CREATIVE_MODE_TAB, NetherStuffMod.id("base"));
	public static final CreativeModeTab BASE_CREATIVE_TAB =
			Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, BASE,
					FabricItemGroup.builder()
							.title(Components.translatable("itemGroup.nether_stuff.base"))
							.icon(Items.ANVIL::getDefaultInstance)
							.build());
	static {
		REGISTRATE.setCreativeTab(BASE);
	}
	public static final ItemEntry<TestItem> TEST_ITEM =
			REGISTRATE.item("test_item", TestItem::new)
					.properties(p -> p.stacksTo(16)
							.rarity(Rarity.UNCOMMON)
							.fireResistant())
					.register();

	public static void register()
	{

	}
}
