package com.caldoric.crystalomancy.item;

import com.caldoric.crystalomancy.Crystalomancy;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Crystalomancy.MOD_ID);

    public static final RegistryObject<Item> DEV_ITEM_TEMPLATE = ITEMS.register("dev_item_template",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CRYSTALOMANCY_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
