package com.google.android.material.color.utilities;

public class DynamicScheme {
    public final double contrastLevel;
    public final TonalPalette errorPalette = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    public final boolean isDark;
    public final TonalPalette neutralPalette;
    public final TonalPalette neutralVariantPalette;
    public final TonalPalette primaryPalette;
    public final TonalPalette secondaryPalette;
    public final int sourceColorArgb;
    public final Hct sourceColorHct;
    public final TonalPalette tertiaryPalette;
    public final Variant variant;

    public DynamicScheme(Hct sourceColorHct2, Variant variant2, boolean isDark2, double contrastLevel2, TonalPalette primaryPalette2, TonalPalette secondaryPalette2, TonalPalette tertiaryPalette2, TonalPalette neutralPalette2, TonalPalette neutralVariantPalette2) {
        this.sourceColorArgb = sourceColorHct2.toInt();
        this.sourceColorHct = sourceColorHct2;
        this.variant = variant2;
        this.isDark = isDark2;
        this.contrastLevel = contrastLevel2;
        this.primaryPalette = primaryPalette2;
        this.secondaryPalette = secondaryPalette2;
        this.tertiaryPalette = tertiaryPalette2;
        this.neutralPalette = neutralPalette2;
        this.neutralVariantPalette = neutralVariantPalette2;
    }

    public static double getRotatedHue(Hct sourceColorHct2, double[] hues, double[] rotations) {
        double sourceHue = sourceColorHct2.getHue();
        if (rotations.length == 1) {
            return MathUtils.sanitizeDegreesDouble(rotations[0] + sourceHue);
        }
        int size = hues.length;
        for (int i = 0; i <= size - 2; i++) {
            double thisHue = hues[i];
            double nextHue = hues[i + 1];
            if (thisHue < sourceHue && sourceHue < nextHue) {
                return MathUtils.sanitizeDegreesDouble(rotations[i] + sourceHue);
            }
        }
        return sourceHue;
    }
}
