package net.samusbear.testmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.samusbear.testmod.TestMod;

public class ModItemGroup {
    public static final ItemGroup TEST_MOD_ITEMS = FabricItemGroupBuilder.build(
            new Identifier(TestMod.MOD_ID,"test_mod_items"),() -> new ItemStack(ModItems.BING_CHILLING));
}
