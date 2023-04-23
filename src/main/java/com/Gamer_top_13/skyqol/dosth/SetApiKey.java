package com.Gamer_top_13.skyqol.dosth;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

import java.util.ArrayList;
import java.util.List;

public class SetApiKey {
    static List<String> apikey = new ArrayList<>(List.of(new String[]{"a"}));
    public static void setkey(String[] args) {
        if (args.length >= 2) {
            apikey.set(0, args[2]);
        } else {
            Minecraft.getInstance().gui.getChat().addMessage(Component.translatable("skyqol.command.setkey.nea"));
        }
    }
    public String getkey() {return apikey.get(0);}
}
