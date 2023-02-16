package com.spacedave.davebuildingmod.fabric;

import com.spacedave.davebuildingmod.DavesBuildingExtended;
import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import com.spacedave.davebuildingmod.ExampleBlocks;
import net.fabricmc.api.ModInitializer;

public class DavesBuildingExtendedFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        DavesBuildingExtended.init();
        DavesBuildingExtended.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), DavesBuildingExtended.NAME);
        // on fabric, Registrates must be explicitly finalized and registered.
        ExampleBlocks.REGISTRATE.register();
    }
}
