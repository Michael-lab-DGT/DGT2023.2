package net.MC.dgtmod.item;

import net.MC.dgtmod.DTGMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

//Creating new Creative Mode Tab
@Mod.EventBusSubscriber(modid = DTGMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab DGT_TAB;

    //Icon and Name of Mod Creative Mode Tab
    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        DGT_TAB = event.registerCreativeModeTab(new ResourceLocation(DTGMod.MOD_ID, "dgt_tab"),
            builder -> builder.icon(() -> new ItemStack(ModItems.BLACK_OPAL.get()))
                    .title(Component.translatable("creativemodetab.dgt_tab")));
    }

}

