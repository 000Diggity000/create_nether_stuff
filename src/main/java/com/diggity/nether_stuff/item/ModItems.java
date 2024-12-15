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
	public static final ItemEntry<Item> TEST_ITEM =
			taggedIngredient("test_item", forgeItemTag("copper_plates"), PLATES.tag);

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
