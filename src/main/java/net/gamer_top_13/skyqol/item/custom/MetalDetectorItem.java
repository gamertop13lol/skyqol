package net.gamer_top_13.skyqol.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class MetalDetectorItem extends Item {

    public static final HashSet<Block> VALUABLES = new HashSet<>(Arrays.asList(Blocks.DIAMOND_ORE, Blocks.EMERALD_ORE, Blocks.GOLD_ORE, Blocks.DEEPSLATE_DIAMOND_ORE, Blocks.DEEPSLATE_EMERALD_ORE, Blocks.DEEPSLATE_GOLD_ORE));

    public MetalDetectorItem(Settings settings) {
        super(settings);
    }

    private boolean isValuableBlock(BlockState state) {
        return VALUABLES.contains(state.getBlock());
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient()) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            ArrayList<BlockState> foundBlocks = new ArrayList<>();
            ArrayList<BlockPos> foundPositions = new ArrayList<>();

            for (int i=0; i <= positionClicked.getY() + 64; i++) {
                BlockState state = context.getWorld().getBlockState(positionClicked.down(i));
                if (isValuableBlock(state)) {
                    foundBlocks.add(state);
                    foundPositions.add(positionClicked.down(i));
                }
            }
            if (foundBlocks.size()!=0) {
                player.sendMessage(Text.translatable("skyqol.metaldetector.found", "false"));
                for (int i=0; i <=foundBlocks.size(); i++) {
                    player.sendMessage(Text.translatable("skyqol.metaldetector.block", foundBlocks.get(i).getBlock().asItem().getName().getString(), foundPositions.get(i).getY()));
                }
            } else {
                player.sendMessage(Text.translatable("skyqol.metaldetector.nothingfound"));
            }
            context.getStack().damage(1, context.getPlayer(), playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));

        }

        return ActionResult.SUCCESS;
    }
}
