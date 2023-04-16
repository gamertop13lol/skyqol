package com.Gamer_top_13.skyqol;

import com.Gamer_top_13.skyqol.block.ModBlocks;
import com.Gamer_top_13.skyqol.item.ModCreativeModeTabs;
import com.Gamer_top_13.skyqol.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.CreativeModeTabEvent;

public class SetupCreativeTabs {
    public static void SetupTabs (CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == ModCreativeModeTabs.SKYQOLTAB) {
            event.accept(ModItems.RAW_ZIRCON);
            event.accept(ModItems.ZIRCON);
            event.accept(ModBlocks.ZIRCON_ORE);
            event.accept(ModBlocks.DEEPSLATE_ZIRCON_ORE);
            event.accept(ModBlocks.NETHERRACK_ZIRCON_ORE);
            event.accept(ModBlocks.ENDSTONE_ZIRCON_ORE);
            event.accept(ModBlocks.ZIRCON_BLOCK);
        }
        if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.ZIRCON_BLOCK);
        }
        if (event.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.ZIRCON_ORE);
            event.accept(ModBlocks.DEEPSLATE_ZIRCON_ORE);
            event.accept(ModBlocks.NETHERRACK_ZIRCON_ORE);
            event.accept(ModBlocks.ENDSTONE_ZIRCON_ORE);
        }
    }
}
