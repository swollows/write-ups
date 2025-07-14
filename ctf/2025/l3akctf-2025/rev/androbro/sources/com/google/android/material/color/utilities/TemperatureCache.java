package com.google.android.material.color.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class TemperatureCache {
    private final Hct input;
    private Hct precomputedComplement;
    private List<Hct> precomputedHctsByHue;
    private List<Hct> precomputedHctsByTemp;
    private Map<Hct, Double> precomputedTempsByHct;

    private TemperatureCache() {
        throw new UnsupportedOperationException();
    }

    public TemperatureCache(Hct input2) {
        this.input = input2;
    }

    public Hct getComplement() {
        double directionOfRotation;
        double startHue;
        if (this.precomputedComplement != null) {
            return this.precomputedComplement;
        }
        double coldestHue = getColdest().getHue();
        double coldestTemp = getTempsByHct().get(getColdest()).doubleValue();
        double warmestHue = getWarmest().getHue();
        double range = getTempsByHct().get(getWarmest()).doubleValue() - coldestTemp;
        boolean startHueIsColdestToWarmest = isBetween(this.input.getHue(), coldestHue, warmestHue);
        double startHue2 = startHueIsColdestToWarmest ? warmestHue : coldestHue;
        double endHue = startHueIsColdestToWarmest ? coldestHue : warmestHue;
        double directionOfRotation2 = 1.0d;
        boolean z = startHueIsColdestToWarmest;
        Hct answer = getHctsByHue().get((int) Math.round(this.input.getHue()));
        double complementRelativeTemp = 1.0d - getRelativeTemperature(this.input);
        double smallestError = 1000.0d;
        double hueAddend = 0.0d;
        while (hueAddend <= 360.0d) {
            double hue = MathUtils.sanitizeDegreesDouble(startHue2 + (directionOfRotation2 * hueAddend));
            if (!isBetween(hue, startHue2, endHue)) {
                startHue = startHue2;
                directionOfRotation = directionOfRotation2;
            } else {
                startHue = startHue2;
                directionOfRotation = directionOfRotation2;
                Hct possibleAnswer = getHctsByHue().get((int) Math.round(hue));
                double error = Math.abs(complementRelativeTemp - ((getTempsByHct().get(possibleAnswer).doubleValue() - coldestTemp) / range));
                if (error < smallestError) {
                    smallestError = error;
                    answer = possibleAnswer;
                }
            }
            hueAddend += 1.0d;
            startHue2 = startHue;
            directionOfRotation2 = directionOfRotation;
        }
        this.precomputedComplement = answer;
        return this.precomputedComplement;
    }

    public List<Hct> getAnalogousColors() {
        return getAnalogousColors(5, 12);
    }

    public List<Hct> getAnalogousColors(int count, int divisions) {
        int i = count;
        int i2 = divisions;
        int startHue = (int) Math.round(this.input.getHue());
        Hct startHct = getHctsByHue().get(startHue);
        double lastTemp = getRelativeTemperature(startHct);
        List<Hct> allColors = new ArrayList<>();
        allColors.add(startHct);
        double absoluteTotalTempDelta = 0.0d;
        for (int i3 = 0; i3 < 360; i3++) {
            double temp = getRelativeTemperature(getHctsByHue().get(MathUtils.sanitizeDegreesInt(startHue + i3)));
            lastTemp = temp;
            absoluteTotalTempDelta += Math.abs(temp - lastTemp);
        }
        int hueAddend = 1;
        double tempStep = absoluteTotalTempDelta / ((double) i2);
        double totalTempDelta = 0.0d;
        double desiredTotalTempDeltaForIndex = getRelativeTemperature(startHct);
        while (true) {
            Hct startHct2 = startHct;
            if (allColors.size() >= i2) {
                double d = desiredTotalTempDeltaForIndex;
                break;
            }
            Hct hct = getHctsByHue().get(MathUtils.sanitizeDegreesInt(startHue + hueAddend));
            double temp2 = getRelativeTemperature(hct);
            totalTempDelta += Math.abs(temp2 - desiredTotalTempDeltaForIndex);
            int startHue2 = startHue;
            double d2 = desiredTotalTempDeltaForIndex;
            double desiredTotalTempDeltaForIndex2 = ((double) allColors.size()) * tempStep;
            boolean indexSatisfied = totalTempDelta >= desiredTotalTempDeltaForIndex2;
            int indexAddend = 1;
            while (true) {
                if (!indexSatisfied) {
                    double d3 = desiredTotalTempDeltaForIndex2;
                    break;
                }
                boolean z = indexSatisfied;
                if (allColors.size() >= i2) {
                    double d4 = desiredTotalTempDeltaForIndex2;
                    break;
                }
                allColors.add(hct);
                double d5 = desiredTotalTempDeltaForIndex2;
                desiredTotalTempDeltaForIndex2 = ((double) (allColors.size() + indexAddend)) * tempStep;
                indexSatisfied = totalTempDelta >= desiredTotalTempDeltaForIndex2;
                indexAddend++;
            }
            desiredTotalTempDeltaForIndex = temp2;
            hueAddend++;
            if (hueAddend > 360) {
                while (allColors.size() < i2) {
                    allColors.add(hct);
                }
            } else {
                startHct = startHct2;
                startHue = startHue2;
            }
        }
        List<Hct> answers = new ArrayList<>();
        answers.add(this.input);
        double d6 = desiredTotalTempDeltaForIndex;
        int ccwCount = (int) Math.floor((((double) i) - 1.0d) / 2.0d);
        int i4 = 1;
        while (i4 < ccwCount + 1) {
            int index = 0 - i4;
            while (index < 0) {
                index += allColors.size();
            }
            if (index >= allColors.size()) {
                index %= allColors.size();
            }
            answers.add(0, allColors.get(index));
            i4++;
        }
        int cwCount = (i - ccwCount) - 1;
        for (int i5 = 1; i5 < cwCount + 1; i5++) {
            int index2 = i5;
            while (index2 < 0) {
                index2 += allColors.size();
            }
            if (index2 >= allColors.size()) {
                index2 %= allColors.size();
            }
            answers.add(allColors.get(index2));
        }
        return answers;
    }

    public double getRelativeTemperature(Hct hct) {
        double range = getTempsByHct().get(getWarmest()).doubleValue() - getTempsByHct().get(getColdest()).doubleValue();
        double differenceFromColdest = getTempsByHct().get(hct).doubleValue() - getTempsByHct().get(getColdest()).doubleValue();
        if (range == 0.0d) {
            return 0.5d;
        }
        return differenceFromColdest / range;
    }

    public static double rawTemperature(Hct color) {
        double[] lab = ColorUtils.labFromArgb(color.toInt());
        return ((Math.pow(Math.hypot(lab[1], lab[2]), 1.07d) * 0.02d) * Math.cos(Math.toRadians(MathUtils.sanitizeDegreesDouble(MathUtils.sanitizeDegreesDouble(Math.toDegrees(Math.atan2(lab[2], lab[1]))) - 50.0d)))) - 8.0d;
    }

    private Hct getColdest() {
        return getHctsByTemp().get(0);
    }

    private List<Hct> getHctsByHue() {
        if (this.precomputedHctsByHue != null) {
            return this.precomputedHctsByHue;
        }
        List<Hct> hcts = new ArrayList<>();
        for (double hue = 0.0d; hue <= 360.0d; hue += 1.0d) {
            hcts.add(Hct.from(hue, this.input.getChroma(), this.input.getTone()));
        }
        this.precomputedHctsByHue = Collections.unmodifiableList(hcts);
        return this.precomputedHctsByHue;
    }

    private List<Hct> getHctsByTemp() {
        if (this.precomputedHctsByTemp != null) {
            return this.precomputedHctsByTemp;
        }
        List<Hct> hcts = new ArrayList<>(getHctsByHue());
        hcts.add(this.input);
        Collections.sort(hcts, Comparator.comparing(new TemperatureCache$$ExternalSyntheticLambda0(this), new TemperatureCache$$ExternalSyntheticLambda1()));
        this.precomputedHctsByTemp = hcts;
        return this.precomputedHctsByTemp;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$getHctsByTemp$0$com-google-android-material-color-utilities-TemperatureCache  reason: not valid java name */
    public /* synthetic */ Double m233lambda$getHctsByTemp$0$comgoogleandroidmaterialcolorutilitiesTemperatureCache(Hct arg) {
        return getTempsByHct().get(arg);
    }

    private Map<Hct, Double> getTempsByHct() {
        if (this.precomputedTempsByHct != null) {
            return this.precomputedTempsByHct;
        }
        List<Hct> allHcts = new ArrayList<>(getHctsByHue());
        allHcts.add(this.input);
        Map<Hct, Double> temperaturesByHct = new HashMap<>();
        for (Hct hct : allHcts) {
            temperaturesByHct.put(hct, Double.valueOf(rawTemperature(hct)));
        }
        this.precomputedTempsByHct = temperaturesByHct;
        return this.precomputedTempsByHct;
    }

    private Hct getWarmest() {
        return getHctsByTemp().get(getHctsByTemp().size() - 1);
    }

    private static boolean isBetween(double angle, double a, double b) {
        if (a < b) {
            if (a > angle || angle > b) {
                return false;
            }
            return true;
        } else if (a <= angle || angle <= b) {
            return true;
        } else {
            return false;
        }
    }
}
