package com.spacedave.davebuildingmod.registry;

import com.simibubi.create.foundation.block.DyedBlockList;
import com.simibubi.create.foundation.data.BlockStateGen;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.simibubi.create.foundation.data.TagGen;
import com.spacedave.davebuildingmod.DavesBuildingExtended;
import com.spacedave.davebuildingmod.content.boiler.BoilerBlock;
import com.tterrag.registrate.util.entry.BlockEntry;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class DavesBuildingExtendedBlocks {
	private static final CreateRegistrate REGISTRATE = DavesBuildingExtended.registrate().creativeModeTab(
			() -> DavesBuildingExtendedItems.itemGroup
	);
	public static final BlockEntry<Block> EXAMPLE_BLOCK = REGISTRATE.block("example_block", Block::new)
			.onRegister(e -> System.out.println("Registered Example Block!")).register();

	public static final DyedBlockList<BoilerBlock> BOILERS = new DyedBlockList<>(colour -> {
		String colourName = colour.getSerializedName();
		return REGISTRATE.block(colourName + "_boiler", p -> BoilerBlock.plain(p, colour))
				.initialProperties(SharedProperties::copperMetal)
				.properties(p -> p.sound(SoundType.METAL))
				.properties(p -> p.color(colour.getMaterialColor()))
				.transform(TagGen.pickaxeOnly())
				.blockstate(BlockStateGen.axisBlockProvider(false))
				.simpleItem()
				.register();
	});

	public static final DyedBlockList<BoilerBlock> GILDED_BOILERS = new DyedBlockList<>(colour -> {
		String colourName = colour.getSerializedName();
		return REGISTRATE.block(colourName + "_gilded_boiler", p -> BoilerBlock.gilded(p, colour))
				.initialProperties(SharedProperties::copperMetal)
				.properties(p -> p.sound(SoundType.METAL))
				.properties(p -> p.color(colour.getMaterialColor()))
				.transform(TagGen.pickaxeOnly())
				.blockstate(BlockStateGen.axisBlockProvider(false))
				.simpleItem()
				.register();
	});

	@ExpectPlatform
	public static TagKey<Item> getTag(DyeColor color) {
		throw new AssertionError();
	}

	@SuppressWarnings("EmptyMethod")
	public static void register() {
		DavesBuildingExtended.LOGGER.info("Registering blocks for " + DavesBuildingExtended.NAME);
	}
}
