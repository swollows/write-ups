package com.google.android.material.color.utilities;

public final class ContrastCurve {
    private final double high;
    private final double low;
    private final double medium;
    private final double normal;

    public ContrastCurve(double low2, double normal2, double medium2, double high2) {
        this.low = low2;
        this.normal = normal2;
        this.medium = medium2;
        this.high = high2;
    }

    public double getContrast(double contrastLevel) {
        if (contrastLevel <= -1.0d) {
            return this.low;
        }
        if (contrastLevel < 0.0d) {
            return MathUtils.lerp(this.low, this.normal, (contrastLevel - -1.0d) / 1.0d);
        }
        if (contrastLevel < 0.5d) {
            return MathUtils.lerp(this.normal, this.medium, (contrastLevel - 0.0d) / 0.5d);
        }
        if (contrastLevel < 1.0d) {
            return MathUtils.lerp(this.medium, this.high, (contrastLevel - 0.5d) / 0.5d);
        }
        return this.high;
    }
}
