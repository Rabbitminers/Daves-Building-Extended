package com.spacedave.davebuildingmod.fabric.datagen;

import com.spacedave.davebuildingmod.DavesBuildingExtended;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DavesBuildingExtendedData implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        ExistingFileHelper helper = ExistingFileHelper.standard();
        DavesBuildingExtended.registrate().setupDatagen(fabricDataGenerator, helper);
    }
}
