package com.spacedave.davebuildingmod.registry;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.spacedave.davebuildingmod.DavesBuildingExtended;
import com.tterrag.registrate.util.entry.BlockEntry;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class DavesBuildingExtendedBlocks {
	private static final CreateRegistrate REGISTRATE = DavesBuildingExtended.registrate().creativeModeTab(
			() -> DavesBuildingExtendedItems.itemGroup
	);
	public static final BlockEntry<Block> EXAMPLE_BLOCK = REGISTRATE.block("example_block", Block::new)
			.onRegister(e -> System.out.println("Registered Example Block!")).register();

	@ExpectPlatform
	public static TagKey<Item> getTag(DyeColor color) {
		throw new AssertionError();
	}

	@SuppressWarnings("EmptyMethod")
	public static void init() {
		DavesBuildingExtended.LOGGER.info("Registering blocks for " + DavesBuildingExtended.NAME);
	}
}
