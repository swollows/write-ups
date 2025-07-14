package com.google.android.material.color.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

public final class DynamicColor {
    public final Function<DynamicScheme, DynamicColor> background;
    public final ContrastCurve contrastCurve;
    private final HashMap<DynamicScheme, Hct> hctCache = new HashMap<>();
    public final boolean isBackground;
    public final String name;
    public final Function<DynamicScheme, Double> opacity;
    public final Function<DynamicScheme, TonalPalette> palette;
    public final Function<DynamicScheme, DynamicColor> secondBackground;
    public final Function<DynamicScheme, Double> tone;
    public final Function<DynamicScheme, ToneDeltaPair> toneDeltaPair;

    public DynamicColor(String name2, Function<DynamicScheme, TonalPalette> palette2, Function<DynamicScheme, Double> tone2, boolean isBackground2, Function<DynamicScheme, DynamicColor> background2, Function<DynamicScheme, DynamicColor> secondBackground2, ContrastCurve contrastCurve2, Function<DynamicScheme, ToneDeltaPair> toneDeltaPair2) {
        this.name = name2;
        this.palette = palette2;
        this.tone = tone2;
        this.isBackground = isBackground2;
        this.background = background2;
        this.secondBackground = secondBackground2;
        this.contrastCurve = contrastCurve2;
        this.toneDeltaPair = toneDeltaPair2;
        this.opacity = null;
    }

    public DynamicColor(String name2, Function<DynamicScheme, TonalPalette> palette2, Function<DynamicScheme, Double> tone2, boolean isBackground2, Function<DynamicScheme, DynamicColor> background2, Function<DynamicScheme, DynamicColor> secondBackground2, ContrastCurve contrastCurve2, Function<DynamicScheme, ToneDeltaPair> toneDeltaPair2, Function<DynamicScheme, Double> opacity2) {
        this.name = name2;
        this.palette = palette2;
        this.tone = tone2;
        this.isBackground = isBackground2;
        this.background = background2;
        this.secondBackground = secondBackground2;
        this.contrastCurve = contrastCurve2;
        this.toneDeltaPair = toneDeltaPair2;
        this.opacity = opacity2;
    }

    public static DynamicColor fromPalette(String name2, Function<DynamicScheme, TonalPalette> palette2, Function<DynamicScheme, Double> tone2) {
        return new DynamicColor(name2, palette2, tone2, false, (Function<DynamicScheme, DynamicColor>) null, (Function<DynamicScheme, DynamicColor>) null, (ContrastCurve) null, (Function<DynamicScheme, ToneDeltaPair>) null);
    }

    public static DynamicColor fromPalette(String name2, Function<DynamicScheme, TonalPalette> palette2, Function<DynamicScheme, Double> tone2, boolean isBackground2) {
        return new DynamicColor(name2, palette2, tone2, isBackground2, (Function<DynamicScheme, DynamicColor>) null, (Function<DynamicScheme, DynamicColor>) null, (ContrastCurve) null, (Function<DynamicScheme, ToneDeltaPair>) null);
    }

    public static DynamicColor fromArgb(String name2, int argb) {
        return fromPalette(name2, new DynamicColor$$ExternalSyntheticLambda0(TonalPalette.fromInt(argb)), new DynamicColor$$ExternalSyntheticLambda1(Hct.fromInt(argb)));
    }

    static /* synthetic */ TonalPalette lambda$fromArgb$0(TonalPalette palette2, DynamicScheme s) {
        return palette2;
    }

    public int getArgb(DynamicScheme scheme) {
        int argb = getHct(scheme).toInt();
        if (this.opacity == null) {
            return argb;
        }
        return (16777215 & argb) | (MathUtils.clampInt(0, 255, (int) Math.round(255.0d * this.opacity.apply(scheme).doubleValue())) << 24);
    }

    public Hct getHct(DynamicScheme scheme) {
        Hct cachedAnswer = this.hctCache.get(scheme);
        if (cachedAnswer != null) {
            return cachedAnswer;
        }
        Hct answer = this.palette.apply(scheme).getHct(getTone(scheme));
        if (this.hctCache.size() > 4) {
            this.hctCache.clear();
        }
        this.hctCache.put(scheme, answer);
        return answer;
    }

    public double getTone(DynamicScheme scheme) {
        ArrayList<Double> availables;
        double nTone;
        double fTone;
        double fInitialTone;
        DynamicScheme dynamicScheme = scheme;
        boolean decreasingContrast = dynamicScheme.contrastLevel < 0.0d;
        if (this.toneDeltaPair != null) {
            ToneDeltaPair toneDeltaPair2 = this.toneDeltaPair.apply(dynamicScheme);
            DynamicColor roleA = toneDeltaPair2.getRoleA();
            DynamicColor roleB = toneDeltaPair2.getRoleB();
            double delta = toneDeltaPair2.getDelta();
            TonePolarity polarity = toneDeltaPair2.getPolarity();
            boolean stayTogether = toneDeltaPair2.getStayTogether();
            DynamicColor bg = this.background.apply(dynamicScheme);
            double bgTone = bg.getTone(dynamicScheme);
            boolean aIsNearer = polarity == TonePolarity.NEARER || (polarity == TonePolarity.LIGHTER && !dynamicScheme.isDark) || (polarity == TonePolarity.DARKER && dynamicScheme.isDark);
            DynamicColor nearer = aIsNearer ? roleA : roleB;
            DynamicColor farther = aIsNearer ? roleB : roleA;
            boolean amNearer = this.name.equals(nearer.name);
            double expansionDir = dynamicScheme.isDark ? 1.0d : -1.0d;
            double nContrast = nearer.contrastCurve.getContrast(dynamicScheme.contrastLevel);
            DynamicColor dynamicColor = bg;
            DynamicColor farther2 = farther;
            TonePolarity tonePolarity = polarity;
            ToneDeltaPair toneDeltaPair3 = toneDeltaPair2;
            double fContrast = farther2.contrastCurve.getContrast(dynamicScheme.contrastLevel);
            boolean z = aIsNearer;
            double nInitialTone = nearer.tone.apply(dynamicScheme).doubleValue();
            if (Contrast.ratioOfTones(bgTone, nInitialTone) >= nContrast) {
                nTone = nInitialTone;
            } else {
                nTone = foregroundTone(bgTone, nContrast);
            }
            double d = nInitialTone;
            double fInitialTone2 = farther2.tone.apply(dynamicScheme).doubleValue();
            if (Contrast.ratioOfTones(bgTone, fInitialTone2) >= fContrast) {
                fTone = fInitialTone2;
            } else {
                fTone = foregroundTone(bgTone, fContrast);
            }
            if (decreasingContrast) {
                nTone = foregroundTone(bgTone, nContrast);
                fTone = foregroundTone(bgTone, fContrast);
            }
            if ((fTone - nTone) * expansionDir < delta) {
                double fTone2 = MathUtils.clampDouble(0.0d, 100.0d, nTone + (delta * expansionDir));
                if ((fTone2 - nTone) * expansionDir < delta) {
                    nTone = MathUtils.clampDouble(0.0d, 100.0d, fTone2 - (delta * expansionDir));
                    double d2 = fInitialTone2;
                    fInitialTone = fTone2;
                    double fTone3 = d2;
                } else {
                    double d3 = fInitialTone2;
                    fInitialTone = fTone2;
                    double fTone4 = d3;
                }
            } else {
                double d4 = fInitialTone2;
                fInitialTone = fTone;
                double fTone5 = d4;
            }
            if (50.0d > nTone || nTone >= 60.0d) {
                double d5 = fContrast;
                if (50.0d <= fInitialTone && fInitialTone < 60.0d) {
                    if (stayTogether) {
                        if (expansionDir > 0.0d) {
                            nTone = 60.0d;
                            fInitialTone = Math.max(fInitialTone, 60.0d + (delta * expansionDir));
                        } else {
                            nTone = 49.0d;
                            fInitialTone = Math.min(fInitialTone, 49.0d + (delta * expansionDir));
                        }
                    } else if (expansionDir > 0.0d) {
                        fInitialTone = 60.0d;
                    } else {
                        fInitialTone = 49.0d;
                    }
                }
            } else if (expansionDir > 0.0d) {
                nTone = 60.0d;
                DynamicColor dynamicColor2 = nearer;
                double d6 = fContrast;
                fInitialTone = Math.max(fInitialTone, 60.0d + (delta * expansionDir));
            } else {
                double d7 = fContrast;
                nTone = 49.0d;
                fInitialTone = Math.min(fInitialTone, 49.0d + (delta * expansionDir));
            }
            return amNearer ? nTone : fInitialTone;
        }
        double answer = this.tone.apply(dynamicScheme).doubleValue();
        if (this.background == null) {
            return answer;
        }
        double bgTone2 = this.background.apply(dynamicScheme).getTone(dynamicScheme);
        double desiredRatio = this.contrastCurve.getContrast(dynamicScheme.contrastLevel);
        if (Contrast.ratioOfTones(bgTone2, answer) < desiredRatio) {
            answer = foregroundTone(bgTone2, desiredRatio);
        }
        if (decreasingContrast) {
            answer = foregroundTone(bgTone2, desiredRatio);
        }
        if (this.isBackground && 50.0d <= answer && answer < 60.0d) {
            if (Contrast.ratioOfTones(49.0d, bgTone2) >= desiredRatio) {
                answer = 49.0d;
            } else {
                answer = 60.0d;
            }
        }
        if (this.secondBackground == null) {
            return answer;
        }
        double bgTone1 = this.background.apply(dynamicScheme).getTone(dynamicScheme);
        double bgTone22 = this.secondBackground.apply(dynamicScheme).getTone(dynamicScheme);
        double upper = Math.max(bgTone1, bgTone22);
        double lower = Math.min(bgTone1, bgTone22);
        if (Contrast.ratioOfTones(upper, answer) >= desiredRatio && Contrast.ratioOfTones(lower, answer) >= desiredRatio) {
            return answer;
        }
        double lightOption = Contrast.lighter(upper, desiredRatio);
        double darkOption = Contrast.darker(lower, desiredRatio);
        ArrayList<Double> availables2 = new ArrayList<>();
        if (lightOption != -1.0d) {
            double d8 = lower;
            availables = availables2;
            availables.add(Double.valueOf(lightOption));
        } else {
            availables = availables2;
        }
        if (darkOption != -1.0d) {
            availables.add(Double.valueOf(darkOption));
        }
        boolean prefersLight = tonePrefersLightForeground(bgTone1) || tonePrefersLightForeground(bgTone22);
        if (!prefersLight) {
            boolean z2 = prefersLight;
            boolean z3 = decreasingContrast;
            if (availables.size() == 1) {
                return availables.get(0).doubleValue();
            }
            if (darkOption == -1.0d) {
                return 0.0d;
            }
            return darkOption;
        } else if (lightOption == -1.0d) {
            return 100.0d;
        } else {
            return lightOption;
        }
    }

    public static double foregroundTone(double bgTone, double ratio) {
        double d = bgTone;
        double lighterTone = Contrast.lighterUnsafe(bgTone, ratio);
        double darkerTone = Contrast.darkerUnsafe(bgTone, ratio);
        double lighterRatio = Contrast.ratioOfTones(lighterTone, d);
        double darkerRatio = Contrast.ratioOfTones(darkerTone, d);
        if (!tonePrefersLightForeground(bgTone)) {
            return (darkerRatio >= ratio || darkerRatio >= lighterRatio) ? darkerTone : lighterTone;
        }
        boolean negligibleDifference = Math.abs(lighterRatio - darkerRatio) < 0.1d && lighterRatio < ratio && darkerRatio < ratio;
        if (lighterRatio >= ratio || lighterRatio >= darkerRatio || negligibleDifference) {
            return lighterTone;
        }
        return darkerTone;
    }

    public static double enableLightForeground(double tone2) {
        if (!tonePrefersLightForeground(tone2) || toneAllowsLightForeground(tone2)) {
            return tone2;
        }
        return 49.0d;
    }

    public static boolean tonePrefersLightForeground(double tone2) {
        return Math.round(tone2) < 60;
    }

    public static boolean toneAllowsLightForeground(double tone2) {
        return Math.round(tone2) <= 49;
    }
}
