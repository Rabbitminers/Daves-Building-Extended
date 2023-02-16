package com.spacedave.davebuildingmod.registry;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.spacedave.davebuildingmod.DavesBuildingExtended;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class DavesBuildingExtendedItems {
    private static final CreateRegistrate REGISTRATE = DavesBuildingExtended.registrate();
    public static final CreativeModeTab itemGroup = new CreativeModeTab(nextTabId(), DavesBuildingExtended.MOD_ID) {
        @Override
        @Nonnull
        public ItemStack makeIcon() {
            return DavesBuildingExtendedBlocks.EXAMPLE_BLOCK.asStack();
        }
    };

    @ExpectPlatform
    public static int nextTabId() {
        throw new AssertionError();
    }

    @SuppressWarnings("EmptyMethod")
    public static void init() {
        DavesBuildingExtended.LOGGER.info("Registering items for " + DavesBuildingExtended.NAME);
    }
}
