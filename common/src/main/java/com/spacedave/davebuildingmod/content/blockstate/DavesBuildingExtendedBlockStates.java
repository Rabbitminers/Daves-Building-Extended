package com.spacedave.davebuildingmod.content.blockstate;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class DavesBuildingExtendedBlockStates {
    public static final IntegerProperty LOG_PILE_TYPE = IntegerProperty.create("log_pile_type", 0, 1);
    public static final BooleanProperty IS_UPPER = BooleanProperty.create("is_upper");
}
