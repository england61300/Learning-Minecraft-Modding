package net.tribush.overlord.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldView;
import net.tribush.overlord.item.ModItems;
import net.tribush.overlord.item.SeedItem;

public class CropBlock extends Block {
    public static final IntegerProperty AGE = Properties.INTEGER_8.range(0, 7);

    public CropBlock(Settings settings) {
        super(settings.noCollision().ticksRandomly());
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getLightLevel(pos) >= 9 && canGrow(state, world, pos)) {
            int age = state.get(AGE);
            if (age < getMaxAge()) {
                world.setBlockState(pos, state.with(AGE, age + 1), 2);
            } else {
                world.setBlockState(pos, Blocks.AIR.getDefaultState(), 2);
                world.spawnEntity(new ItemEntity(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(ModItems.TOMATO))); // Drop seeds when fully grown
            }
        }
    }

    private boolean canGrow(BlockState state, WorldView world, BlockPos pos) {
        // Implement your growth conditions here, e.g., checking for water nearby
        return true;
    }

    public int getMaxAge() {
        return 7; // Adjust this based on desired growth time
    }
}