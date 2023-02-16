package com.spacedave.davebuildingmod.registry.forge;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;

public class DavesBuildingExtendedItemsImpl {
    public static TagKey<Item> getTag(DyeColor color) {
        return color.getTag();
    }

    public static int nextTabId() {
        return CreativeModeTab.getGroupCountSafe();
    }
}
