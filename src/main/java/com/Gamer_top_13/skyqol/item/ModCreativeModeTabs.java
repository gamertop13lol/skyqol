package com.Gamer_top_13.skyqol.item;

import com.Gamer_top_13.skyqol.SkyQOL;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SkyQOL.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab SKYQOLTAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        SKYQOLTAB = event.registerCreativeModeTab(new ResourceLocation(SkyQOL.MOD_ID, "skyqol_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.ZIRCON.get())).title(Component.translatable("creativemodetab.skyqol_tab")));
    }
}
