package com.Gamer_top_13.skyqol.dosth;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.network.chat.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoordUtils {
    static List savedcoords = new ArrayList();
    public static void savc(String[] args) {
        if (args.length >= 3) {
            Gui gui = Minecraft.getInstance().gui;
            String name = args[2];
            String x = String.valueOf(Minecraft.getInstance().player.getBlockX());
            String y = String.valueOf(Minecraft.getInstance().player.getBlockY());
            String z = String.valueOf(Minecraft.getInstance().player.getBlockZ());
            List<String> putcoords = Arrays.asList(name, x, y, z);
            savedcoords.add(putcoords);
            gui.getChat().addMessage(Component.translatable("skyqol.command.savc.confirm", name, x, y, z));
        } else {
            Minecraft.getInstance().gui.getChat().addMessage(Component.translatable("skyqol.command.savc.nea"));
        }
    }
    public static void getc(String[] args) {
        if (args.length >= 3) {
            for (int i=0;i<savedcoords.size();i++) {
                List a = (List) savedcoords.get(i);
                if (a.get(0).equals(args[2])) {
                    Gui gui = Minecraft.getInstance().gui;
                    String name = (String) a.get(0);
                    String x = (String) a.get(1);
                    String y = (String) a.get(2);
                    String z = (String) a.get(3);
                    gui.getChat().addMessage(Component.translatable("skyqol.command.getc.out", name, x, y, z));
                }
            }
        } else {
            Minecraft.getInstance().gui.getChat().addMessage(Component.translatable("skyqol.command.getc.nea"));
        }
    }
    public static void savcother(String[] args) {
        if (args.length >= 6) {
            Gui gui = Minecraft.getInstance().gui;
            String name = args[2];
            String x = args[3];
            String y = args[4];
            String z = args[5];
            List<String> putcoords = Arrays.asList(name, x, y, z);
            savedcoords.add(putcoords);
            gui.getChat().addMessage(Component.translatable("skyqol.command.savcother.confirm", name, x, y, z));
        } else {
            Minecraft.getInstance().gui.getChat().addMessage(Component.translatable("skyqol.command.savcother.nea"));
        }
    }
    public static void delc(String[] args) {
        if (args.length >= 3) {
            for (int i=0;i<savedcoords.size();i++) {
                List a = (List) savedcoords.get(i);
                if (a.get(0).equals(args[2])) {
                    Gui gui = Minecraft.getInstance().gui;
                    String name = (String) a.get(0);
                    String x = (String) a.get(1);
                    String y = (String) a.get(2);
                    String z = (String) a.get(3);
                    savedcoords.remove(i);
                    gui.getChat().addMessage(Component.translatable("skyqol.command.delc.confirm", name, x, y, z));
                }
            }
        } else {
            Minecraft.getInstance().gui.getChat().addMessage(Component.translatable("skyqol.command.delc.nea"));
        }
    }
    public static void allc(String[] args) {
        Gui gui = Minecraft.getInstance().gui;
        gui.getChat().addMessage(Component.translatable("skyqol.command.allc.title"));
        for (int i=0;i<savedcoords.size();i++) {
            List a = (List) savedcoords.get(i);
            String name = (String) a.get(0);
            String x = (String) a.get(1);
            String y = (String) a.get(2);
            String z = (String) a.get(3);
            gui.getChat().addMessage(Component.translatable("skyqol.command.allc.out", name, x, y, z));
        }
    }
}
