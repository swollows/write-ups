package com.google.android.material.color.utilities;

public final class Hct {
    private int argb;
    private double chroma;
    private double hue;
    private double tone;

    public static Hct from(double hue2, double chroma2, double tone2) {
        return new Hct(HctSolver.solveToInt(hue2, chroma2, tone2));
    }

    public static Hct fromInt(int argb2) {
        return new Hct(argb2);
    }

    private Hct(int argb2) {
        setInternalState(argb2);
    }

    public double getHue() {
        return this.hue;
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getTone() {
        return this.tone;
    }

    public int toInt() {
        return this.argb;
    }

    public void setHue(double newHue) {
        setInternalState(HctSolver.solveToInt(newHue, this.chroma, this.tone));
    }

    public void setChroma(double newChroma) {
        setInternalState(HctSolver.solveToInt(this.hue, newChroma, this.tone));
    }

    public void setTone(double newTone) {
        setInternalState(HctSolver.solveToInt(this.hue, this.chroma, newTone));
    }

    public Hct inViewingConditions(ViewingConditions vc) {
        double[] viewedInVc = Cam16.fromInt(toInt()).xyzInViewingConditions(vc, (double[]) null);
        Cam16 recastInVc = Cam16.fromXyzInViewingConditions(viewedInVc[0], viewedInVc[1], viewedInVc[2], ViewingConditions.DEFAULT);
        return from(recastInVc.getHue(), recastInVc.getChroma(), ColorUtils.lstarFromY(viewedInVc[1]));
    }

    private void setInternalState(int argb2) {
        this.argb = argb2;
        Cam16 cam = Cam16.fromInt(argb2);
        this.hue = cam.getHue();
        this.chroma = cam.getChroma();
        this.tone = ColorUtils.lstarFromArgb(argb2);
    }
}
