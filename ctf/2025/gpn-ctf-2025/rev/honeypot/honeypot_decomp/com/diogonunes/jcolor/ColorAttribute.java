/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.diogonunes.jcolor;

import com.diogonunes.jcolor.Attribute;

abstract class ColorAttribute
extends Attribute {
    protected final String[] _color;

    ColorAttribute(int colorNumber) {
        if (0 > colorNumber || colorNumber > 255) {
            throw new IllegalArgumentException("Color must be a number inside range [0-255]. Received: " + colorNumber);
        }
        this._color = new String[]{String.valueOf(colorNumber)};
    }

    ColorAttribute(int r, int g, int b) {
        if (0 > r || r > 255 || 0 > g || g > 255 || 0 > b || b > 255) {
            throw new IllegalArgumentException(String.format("Color components must be a number inside range [0-255]. Received: %d, %d, %d", r, g, b));
        }
        this._color = new String[]{String.valueOf(r), String.valueOf(g), String.valueOf(b)};
    }

    protected boolean isTrueColor() {
        return this._color.length == 3;
    }

    protected abstract String getColorAnsiPrefix();

    protected String getColorAnsiCode() {
        if (this.isTrueColor()) {
            return this._color[0] + ";" + this._color[1] + ";" + this._color[2];
        }
        return this._color[0];
    }

    @Override
    public String toString() {
        return this.getColorAnsiPrefix() + this.getColorAnsiCode();
    }
}

