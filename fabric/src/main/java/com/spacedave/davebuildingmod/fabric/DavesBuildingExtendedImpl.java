package com.spacedave.davebuildingmod.fabric;

import com.spacedave.davebuildingmod.DavesBuildingExtended;
import net.fabricmc.api.ModInitializer;

public class DavesBuildingExtendedImpl implements ModInitializer {
    @Override
    public void onInitialize() {
        DavesBuildingExtended.init();
    }

    public static void finalizeRegistrate() {
        DavesBuildingExtended.registrate().register();
    }
}
