/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.diogonunes.jcolor;

public class Command {
    private final String _code;

    Command(String code2) {
        this._code = code2;
    }

    public static Command CLEAR_SCREEN() {
        return new Command("H\\033[2J\"");
    }

    public String toString() {
        return this._code;
    }
}

