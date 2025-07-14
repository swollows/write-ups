package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;

public abstract class CarouselStrategy {
    private float smallSizeMax;
    private float smallSizeMin;

    /* access modifiers changed from: package-private */
    public abstract KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view);

    /* access modifiers changed from: package-private */
    public void initialize(Context context) {
        this.smallSizeMin = this.smallSizeMin > 0.0f ? this.smallSizeMin : CarouselStrategyHelper.getSmallSizeMin(context);
        this.smallSizeMax = this.smallSizeMax > 0.0f ? this.smallSizeMax : CarouselStrategyHelper.getSmallSizeMax(context);
    }

    static float getChildMaskPercentage(float maskedSize, float unmaskedSize, float childMargins) {
        return 1.0f - ((maskedSize - childMargins) / (unmaskedSize - childMargins));
    }

    static int[] doubleCounts(int[] count) {
        int[] doubledCount = new int[count.length];
        for (int i = 0; i < doubledCount.length; i++) {
            doubledCount[i] = count[i] * 2;
        }
        return doubledCount;
    }

    /* access modifiers changed from: package-private */
    public boolean isContained() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldRefreshKeylineState(Carousel carousel, int oldItemCount) {
        return false;
    }

    public void setSmallItemSizeMin(float minSmallItemSize) {
        this.smallSizeMin = minSmallItemSize;
    }

    public void setSmallItemSizeMax(float maxSmallItemSize) {
        this.smallSizeMax = maxSmallItemSize;
    }

    public float getSmallItemSizeMin() {
        return this.smallSizeMin;
    }

    public float getSmallItemSizeMax() {
        return this.smallSizeMax;
    }
}
