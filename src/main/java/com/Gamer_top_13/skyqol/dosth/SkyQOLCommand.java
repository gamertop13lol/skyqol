package com.Gamer_top_13.skyqol.dosth;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.network.chat.Component;
import com.Gamer_top_13.skyqol.dosth.CoordUtils;

import static com.Gamer_top_13.skyqol.dosth.CoordUtils.getc;
import static com.Gamer_top_13.skyqol.dosth.CoordUtils.savc;

public class SkyQOLCommand {
    public static void splitAndInterpret(String text) {
        String[] args = text.split(" ");
        if (args.length >= 2) {
            switch (args[1]) {
                case "help" -> help();
                case "savc" -> savc(args);
                case "getc" -> getc(args);
            }
        } else {
            Gui gui = Minecraft.getInstance().gui;
            gui.getChat().addMessage(Component.translatable("skyqol.command.nea"));
        }
    }

    private static void help() {
        Gui gui = Minecraft.getInstance().gui;
        gui.getChat().addMessage(Component.translatable("skyqol.help.title"));
        gui.getChat().addMessage(Component.translatable("skyqol.help.savc"));
        gui.getChat().addMessage(Component.translatable("skyqol.help.getc"));
    }
}
