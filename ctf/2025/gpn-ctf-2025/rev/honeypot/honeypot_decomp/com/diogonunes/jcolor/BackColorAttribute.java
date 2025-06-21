/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.diogonunes.jcolor;

import com.diogonunes.jcolor.ColorAttribute;

class BackColorAttribute
extends ColorAttribute {
    BackColorAttribute(int colorNumber) {
        super(colorNumber);
    }

    BackColorAttribute(int r, int g, int b) {
        super(r, g, b);
    }

    @Override
    protected String getColorAnsiPrefix() {
        String ANSI_8BIT_COLOR_PREFIX = "48;5;";
        String ANSI_TRUE_COLOR_PREFIX = "48;2;";
        return this.isTrueColor() ? ANSI_TRUE_COLOR_PREFIX : ANSI_8BIT_COLOR_PREFIX;
    }
}

