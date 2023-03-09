package com.caldoric.crystalomancy.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CRYSTALOMANCY_TAB = new CreativeModeTab("crystalomancytab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DEV_ITEM_TEMPLATE.get());
        }
    };
}
