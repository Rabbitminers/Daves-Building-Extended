package com.spacedave.davebuildingmod.fabric;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;

// https://github.com/Layers-of-Railways/Railway/blob/1.18/multiloader/fabric/src/main/java/com/railwayteam/railways/registry/fabric/CRItemsImpl.java
public class ItemGroupUtil {
    public static final ResourceLocation ERROR_ID = new ResourceLocation("oh", "no");

    public static int expandArrayAndGetId() {
        return FabricItemGroupBuilder.build(ERROR_ID, Items.AIR::getDefaultInstance).getId();
    }
}
