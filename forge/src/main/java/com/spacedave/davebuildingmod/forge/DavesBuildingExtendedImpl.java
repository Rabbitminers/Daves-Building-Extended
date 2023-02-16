package com.spacedave.davebuildingmod.forge;

import com.spacedave.davebuildingmod.DavesBuildingExtended;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DavesBuildingExtended.MOD_ID)
public class DavesBuildingExtendedImpl {
    static IEventBus bus;
    public DavesBuildingExtendedImpl() {
        // registrate must be given the mod event bus on forge before registration
        bus = FMLJavaModLoadingContext.get().getModEventBus();
        DavesBuildingExtended.init();
    }

    public static void finalizeRegistrate() {
        DavesBuildingExtended.registrate().registerEventListeners(bus);
    }
}
