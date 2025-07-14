package com.google.android.material.internal;

import android.animation.TimeInterpolator;

public class ReversableAnimatedValueInterpolator implements TimeInterpolator {
    private final TimeInterpolator sourceInterpolator;

    public ReversableAnimatedValueInterpolator(TimeInterpolator sourceInterpolator2) {
        this.sourceInterpolator = sourceInterpolator2;
    }

    public static TimeInterpolator of(boolean useSourceInterpolator, TimeInterpolator sourceInterpolator2) {
        if (useSourceInterpolator) {
            return sourceInterpolator2;
        }
        return new ReversableAnimatedValueInterpolator(sourceInterpolator2);
    }

    public float getInterpolation(float input) {
        return 1.0f - this.sourceInterpolator.getInterpolation(input);
    }
}
