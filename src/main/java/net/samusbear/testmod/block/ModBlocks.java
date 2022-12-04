package net.samusbear.testmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.samusbear.testmod.TestMod;
import net.samusbear.testmod.item.ModItemGroup;

public class ModBlocks {

    public static final Block BING_CHILLING_BLOCK = registerBlock("bing_chilling_block",
        new Block(FabricBlockSettings.of(Material.CAKE).strength(1f)), ModItemGroup.TEST_MOD_ITEMS);

    public static final Block BING_CHILLING_ORE = registerBlock("bing_chilling_ore",
            new OreBlock(FabricBlockSettings.of(Material.CAKE).strength(1f), UniformIntProvider.create(0,1)), ModItemGroup.TEST_MOD_ITEMS);
    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name,block,tab);
        return Registry.register(Registry.BLOCK, new Identifier(TestMod.MOD_ID,name),block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM,new Identifier(TestMod.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks(){
        TestMod.LOGGER.debug("Registering ModBlocks for" + TestMod.MOD_ID);
    }
}