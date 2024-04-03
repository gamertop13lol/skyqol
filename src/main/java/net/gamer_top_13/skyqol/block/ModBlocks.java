package net.gamer_top_13.skyqol.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gamer_top_13.skyqol.SkyQOL;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_COPPER_BLOCK).sounds(BlockSoundGroup.ANCIENT_DEBRIS)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).strength(2.5f)));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).strength(3.5f)));
    public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore", new ExperienceDroppingBlock(UniformIntProvider.create(5, 8), FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).strength(2f)));
    public static final Block END_STONE_RUBY_ORE = registerBlock("end_stone_ruby_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 15), FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).strength(3f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SkyQOL.MOD_ID, name), block);
    } private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SkyQOL.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        SkyQOL.LOGGER.info("SkyQOL registering blocks");
    }
}
