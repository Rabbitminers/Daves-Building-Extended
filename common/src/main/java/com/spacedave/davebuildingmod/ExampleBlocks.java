package com.spacedave.davebuildingmod;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.Block;

public class ExampleBlocks {
	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(DavesBuildingExtended.MOD_ID);

	public static final BlockEntry<Block> EXAMPLE_BLOCK = REGISTRATE.block("example_block", Block::new).register();

	public static void init() {
		// load the class and register everything
		DavesBuildingExtended.LOGGER.info("Registering blocks for " + DavesBuildingExtended.NAME);
	}
}
