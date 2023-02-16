package com.spacedave.davebuildingmod.forge;

import com.spacedave.davebuildingmod.DavesBuildingExtended;
import com.spacedave.davebuildingmod.ExampleBlocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DavesBuildingExtended.MOD_ID)
public class DavesBuildingExtendedForge {
    public DavesBuildingExtendedForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ExampleBlocks.REGISTRATE.registerEventListeners(eventBus);
        DavesBuildingExtended.init();
    }
}
