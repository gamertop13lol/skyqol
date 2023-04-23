package com.Gamer_top_13.skyqol.dosth;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.network.chat.Component;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static com.Gamer_top_13.skyqol.dosth.SetApiKey.apikey;

public class BazaarStuff {
    public static void gexpies() throws URISyntaxException, IOException, InterruptedException {
        if (apikey.size()==1) {
            String uri = "https://api.hypixel.net/skyblock/bazaar?key=".concat(apikey.get(0));
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(uri))
                    .GET()
                    .build();
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            Gui gui = Minecraft.getInstance().gui;
            System.out.println();
        } else {
            Gui gui = Minecraft.getInstance().gui;
            gui.getChat().addMessage(Component.translatable("skyqol.command.gexpies.nak"));
        }
    }
}
