package net.gamer_top_13.skyqol.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gamer_top_13.skyqol.SkyQOL;
import net.gamer_top_13.skyqol.block.ModBlocks;
import net.gamer_top_13.skyqol.item.custom.MetalDetectorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));
    private static void addItemsToIngredients(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
        entries.add(ModBlocks.RUBY_BLOCK);
        entries.add(ModBlocks.RAW_RUBY_BLOCK);
        entries.add(ModBlocks.RUBY_ORE);
        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
        entries.add(ModBlocks.NETHER_RUBY_ORE);
        entries.add(ModBlocks.END_STONE_RUBY_ORE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SkyQOL.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SkyQOL.LOGGER.info("SkyQOL registering items");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredients);
    }
}
