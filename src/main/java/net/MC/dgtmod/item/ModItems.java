package net.MC.dgtmod.item;
import net.MC.dgtmod.item.ModItems;

import net.MC.dgtmod.DTGMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, DTGMod.MOD_ID);


    // () -> is a supplier, enables stuff to happen in the correct order
    public static final RegistryObject<Item> BLACK_OPAL = Items.register("black_opal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_BLACK_OPAL = Items.register("raw_black_opal",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus)
    {
        Items.register(eventBus);
    }
}