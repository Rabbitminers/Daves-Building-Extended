package com.spacedave.davebuildingmod;

import com.simibubi.create.Create;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.spacedave.davebuildingmod.registry.DavesBuildingExtendedBlocks;
import com.spacedave.davebuildingmod.registry.DavesBuildingExtendedItems;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DavesBuildingExtended {
    public static final String MOD_ID = "davebuildingmod";
    public static final String NAME = "Dave's Building Extended";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    private static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MOD_ID);

    public static void init() {
        LOGGER.info("{} initializing! Create version: {} on platform: {}", NAME, Create.VERSION, ExampleExpectPlatform.platformName());
        setup();
        finalizeRegistrate();
    }

    public static void setup() {
        DavesBuildingExtendedBlocks.register();
        DavesBuildingExtendedItems.register();
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static CreateRegistrate registrate() {
        return REGISTRATE;
    }

    @ExpectPlatform
    public static void finalizeRegistrate() {
        throw new AssertionError();
    }
}
