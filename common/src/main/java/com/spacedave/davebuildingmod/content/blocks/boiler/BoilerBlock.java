package com.spacedave.davebuildingmod.content.blocks.boiler;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.RotatedPillarBlock;

public class BoilerBlock extends RotatedPillarBlock {
    private final DyeColor colour;
    private final boolean isGilded;

    public BoilerBlock(Properties properties, DyeColor colour, boolean isGilded) {
        super(properties);
        this.colour = colour;
        this.isGilded = isGilded;
    }

    public static BoilerBlock plain(Properties properties, DyeColor colour) {
        return new BoilerBlock(properties, colour, false);
    }
    public static BoilerBlock gilded(Properties properties, DyeColor colour) {
        return new BoilerBlock(properties, colour, true);
    }
}
