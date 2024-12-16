package com.diggity.nether_stuff;

import io.github.fabricators_of_create.porting_lib.data.ExistingFileHelper;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import java.nio.file.Path;

import static com.diggity.nether_stuff.NetherStuffMod.REGISTRATE;

public class DataGen implements DataGeneratorEntrypoint{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		ExistingFileHelper helper = ExistingFileHelper.withResourcesFromArg();
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		NetherStuffMod.REGISTRATE.setupDatagen(pack, helper);
 	}
}
