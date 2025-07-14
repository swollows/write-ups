package com.google.android.material.color.utilities;

import java.util.HashMap;
import java.util.Map;

public final class TonalPalette {
    Map<Integer, Integer> cache = new HashMap();
    double chroma;
    double hue;
    Hct keyColor;

    public static TonalPalette fromInt(int argb) {
        return fromHct(Hct.fromInt(argb));
    }

    public static TonalPalette fromHct(Hct hct) {
        return new TonalPalette(hct.getHue(), hct.getChroma(), hct);
    }

    public static TonalPalette fromHueAndChroma(double hue2, double chroma2) {
        return new TonalPalette(hue2, chroma2, createKeyColor(hue2, chroma2));
    }

    private TonalPalette(double hue2, double chroma2, Hct keyColor2) {
        this.hue = hue2;
        this.chroma = chroma2;
        this.keyColor = keyColor2;
    }

    private static Hct createKeyColor(double hue2, double chroma2) {
        Hct smallestDeltaHct = Hct.from(hue2, chroma2, 50.0d);
        Hct smallestDeltaHct2 = smallestDeltaHct;
        double smallestDelta = Math.abs(smallestDeltaHct.getChroma() - chroma2);
        for (double delta = 1.0d; delta < 50.0d && Math.round(chroma2) != Math.round(smallestDeltaHct2.getChroma()); delta += 1.0d) {
            Hct hctAdd = Hct.from(hue2, chroma2, 50.0d + delta);
            double hctAddDelta = Math.abs(hctAdd.getChroma() - chroma2);
            if (hctAddDelta < smallestDelta) {
                smallestDelta = hctAddDelta;
                smallestDeltaHct2 = hctAdd;
            }
            Hct hctSubtract = Hct.from(hue2, chroma2, 50.0d - delta);
            double hctSubtractDelta = Math.abs(hctSubtract.getChroma() - chroma2);
            if (hctSubtractDelta < smallestDelta) {
                smallestDelta = hctSubtractDelta;
                smallestDeltaHct2 = hctSubtract;
            }
        }
        return smallestDeltaHct2;
    }

    public int tone(int tone) {
        Integer color = this.cache.get(Integer.valueOf(tone));
        if (color == null) {
            color = Integer.valueOf(Hct.from(this.hue, this.chroma, (double) tone).toInt());
            this.cache.put(Integer.valueOf(tone), color);
        }
        return color.intValue();
    }

    public Hct getHct(double tone) {
        return Hct.from(this.hue, this.chroma, tone);
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }

    public Hct getKeyColor() {
        return this.keyColor;
    }
}
