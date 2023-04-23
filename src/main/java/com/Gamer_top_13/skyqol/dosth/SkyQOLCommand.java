package com.Gamer_top_13.skyqol.dosth;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.network.chat.Component;
import com.Gamer_top_13.skyqol.dosth.CoordUtils;

import java.io.IOException;
import java.net.URISyntaxException;

import static com.Gamer_top_13.skyqol.dosth.BazaarStuff.gexpies;
import static com.Gamer_top_13.skyqol.dosth.CoordUtils.*;
import static com.Gamer_top_13.skyqol.dosth.SetApiKey.setkey;

public class SkyQOLCommand {
    public static void splitAndInterpret(String text) throws URISyntaxException, IOException, InterruptedException {
        String[] args = text.split(" ");
        if (args.length >= 2) {
            switch (args[1]) {
                case "help" -> help(args);
                case "savc" -> savc(args);
                case "getc" -> getc(args);
                case "savcother" -> savcother(args);
                case "delc" -> delc(args);
                case "allc" -> allc(args);
            }
        } else {
            Gui gui = Minecraft.getInstance().gui;
            gui.getChat().addMessage(Component.translatable("skyqol.command.nea"));
        }
    }

    private static void help(String[] args) {
        Gui gui = Minecraft.getInstance().gui;
        if (args.length >= 3) {
            switch (args[3]) {
                case "savc" -> gui.getChat().addMessage(Component.translatable("skyqol.help.savc"));
                case "getc" -> gui.getChat().addMessage(Component.translatable("skyqol.help.getc"));
                case "savcother" -> gui.getChat().addMessage(Component.translatable("skyqol.help.savcother"));
                case "delc" -> gui.getChat().addMessage(Component.translatable("skyqol.help.delc"));
                case "allc" -> gui.getChat().addMessage(Component.translatable("skyqol.help.allc"));
            }
        } else {
            gui.getChat().addMessage(Component.translatable("skyqol.help.title"));
            gui.getChat().addMessage(Component.translatable("skyqol.help.savc"));
            gui.getChat().addMessage(Component.translatable("skyqol.help.getc"));
            gui.getChat().addMessage(Component.translatable("skyqol.help.savcother"));
            gui.getChat().addMessage(Component.translatable("skyqol.help.delc"));
        }
    }
}
