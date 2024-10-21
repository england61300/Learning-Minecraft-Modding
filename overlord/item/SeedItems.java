import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

public class SeedItems extends Item {
    public SeedItems(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canSurvive(BlockState state, WorldView world, BlockPos pos) {
        return state.getBlock() == Blocks.FARMLAND;
    }
}