package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;

public final class ClampedCornerSize implements CornerSize {
    private final float target;

    public static ClampedCornerSize createFromCornerSize(AbsoluteCornerSize cornerSize) {
        return new ClampedCornerSize(cornerSize.getCornerSize());
    }

    private static float getMaxCornerSize(RectF bounds) {
        return Math.min(bounds.width() / 2.0f, bounds.height() / 2.0f);
    }

    public ClampedCornerSize(float target2) {
        this.target = target2;
    }

    public float getCornerSize(RectF bounds) {
        return Math.min(this.target, getMaxCornerSize(bounds));
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClampedCornerSize)) {
            return false;
        }
        if (this.target == ((ClampedCornerSize) o).target) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.target)});
    }
}
