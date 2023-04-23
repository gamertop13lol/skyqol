package com.Gamer_top_13.skyqol.events;

import ca.weblite.objc.Client;
import com.Gamer_top_13.skyqol.SkyQOL;
import com.Gamer_top_13.skyqol.dosth.SkyQOLCommand;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.IModBusEvent;

import java.io.IOException;
import java.net.URISyntaxException;

public class ModEvents {
    @SubscribeEvent
    public void chatMessage(ClientChatEvent event) throws URISyntaxException, IOException, InterruptedException {
        if (event.getOriginalMessage().startsWith(".skyqol")) {
            event.setCanceled(true);
            SkyQOLCommand.splitAndInterpret(event.getOriginalMessage());
        }
    }
}
