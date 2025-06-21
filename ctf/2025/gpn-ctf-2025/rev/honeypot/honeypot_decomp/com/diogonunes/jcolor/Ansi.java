/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.diogonunes.jcolor;

import com.diogonunes.jcolor.AnsiFormat;
import com.diogonunes.jcolor.Attribute;
import com.diogonunes.jcolor.Command;

public class Ansi {
    private static final char ESC = '\u001b';
    private static final String NEWLINE = System.getProperty("line.separator");
    public static final String PREFIX = "\u001b[";
    public static final String SEPARATOR = ";";
    public static final String POSTFIX = "m";
    public static final String RESET = "\u001b[" + Attribute.CLEAR() + "m";

    public static String generateCode(Attribute ... attributes) {
        StringBuilder builder = new StringBuilder();
        builder.append(PREFIX);
        for (Attribute option : attributes) {
            String code2 = ((Object)option).toString();
            if (code2.equals("")) continue;
            builder.append(code2);
            builder.append(SEPARATOR);
        }
        builder.append(POSTFIX);
        return builder.toString().replace(";m", POSTFIX);
    }

    public static String generateCode(AnsiFormat attributes) {
        return Ansi.generateCode(attributes.toArray());
    }

    public static String generateCode(Command command) {
        return PREFIX + command;
    }

    public static String colorize(Command command) {
        return Ansi.generateCode(command);
    }

    public static String colorize(String text, String ansiCode) {
        StringBuilder output = new StringBuilder();
        output.append(ansiCode);
        String enclosedFormatting = text.replace(NEWLINE, RESET + NEWLINE + ansiCode);
        output.append(enclosedFormatting);
        output.append(RESET);
        return output.toString();
    }

    public static String colorize(String text, Attribute ... attributes) {
        String ansiCode = Ansi.generateCode(attributes);
        return Ansi.colorize(text, ansiCode);
    }

    public static String colorize(String text, AnsiFormat attributes) {
        return Ansi.colorize(text, attributes.toArray());
    }

    public static String makeItFabulous(String text, Attribute ... attributes) {
        return Ansi.colorize(text, attributes);
    }
}

