package com.spacedave.davebuildingmod.base.data.types;

import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

public class DyedBlockList<T extends Block> extends EnumBoundList<T, DyeColor> {
    public DyedBlockList(Function<DyeColor, BlockEntry<? extends T>> filler) {
        super(DyeColor.class, filler);
    }
}
