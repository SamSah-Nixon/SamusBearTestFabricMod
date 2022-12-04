package net.samusbear.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.samusbear.testmod.TestMod;

public class ModItems {

    public static final Item BING_CHILLING = registerItem("bing_chilling",
            new Item(new FabricItemSettings().group(ModItemGroup.TEST_MOD_ITEMS)));
    public static final Item RAW_BING_CHILLING = registerItem("raw_bing_chilling",
            new Item(new FabricItemSettings().group(ModItemGroup.TEST_MOD_ITEMS)));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID,name),item);
    }
    public static void registerModItems(){
        TestMod.LOGGER.debug("Registering Mod Items for "+TestMod.MOD_ID);
    }
}
