package com.spacedave.davebuildingmod.content.blocks.logpile;

import com.google.common.collect.ImmutableMap;
import com.spacedave.davebuildingmod.content.blockstate.DavesBuildingExtendedBlockStates;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.LightBlock;
import net.minecraft.world.level.block.entity.CampfireBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;

import static com.spacedave.davebuildingmod.content.blockstate.DavesBuildingExtendedBlockStates.IS_UPPER;

public class LogPileBlock extends HorizontalDirectionalBlock {
    public static final IntegerProperty LOG_PILE_TYPE = DavesBuildingExtendedBlockStates.LOG_PILE_TYPE;
    public static final BooleanProperty IS_UPPER = DavesBuildingExtendedBlockStates.IS_UPPER;
    protected LogPileBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull ImmutableMap<BlockState, VoxelShape> getShapeForEachState(Function<BlockState, VoxelShape> stateToShape) {
        return super.getShapeForEachState(stateToShape);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand,
                                 BlockHitResult hit) {
        if (level.isClientSide())
            return InteractionResult.SUCCESS;

        if (player.isShiftKeyDown()) {
            boolean isUpper = state.getValue(IS_UPPER);
            level.setBlock(pos, defaultBlockState().setValue(IS_UPPER, !isUpper), 3);
            player.displayClientMessage(new TextComponent("Flipped Log Pile!"), true);
            return InteractionResult.CONSUME;
        } else {
            Collection<Integer> allowedValues = LOG_PILE_TYPE.getPossibleValues();
            int type = state.getValue(LOG_PILE_TYPE) + 1;

            level.setBlock(pos, defaultBlockState().setValue(LOG_PILE_TYPE, type), 3);
            player.displayClientMessage(new TextComponent("Changed Type!"), true);
            return InteractionResult.CONSUME;
        }
    }

    @Override
    public boolean isPathfindable(BlockState state, BlockGetter level, BlockPos pos, PathComputationType type) {
        return false;
    }

    public boolean isUpper(BlockState state) {
        return state.hasProperty(IS_UPPER) && state.getValue(IS_UPPER);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter level, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, level, tooltip, flag);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LOG_PILE_TYPE);
        builder.add(IS_UPPER);
        super.createBlockStateDefinition(builder);
    }
}
