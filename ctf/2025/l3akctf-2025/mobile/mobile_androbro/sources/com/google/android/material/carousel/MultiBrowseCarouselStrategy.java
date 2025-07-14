package com.google.android.material.carousel;

import android.view.View;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

public final class MultiBrowseCarouselStrategy extends CarouselStrategy {
    private static final int[] MEDIUM_COUNTS = {1, 0};
    private static final int[] SMALL_COUNTS = {1};
    private int keylineCount = 0;

    /* access modifiers changed from: package-private */
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View child) {
        float measuredChildSize;
        float childMargins;
        int[] mediumCounts;
        int[] smallCounts;
        float availableSpace = (float) carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            availableSpace = (float) carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams childLayoutParams = (RecyclerView.LayoutParams) child.getLayoutParams();
        float childMargins2 = (float) (childLayoutParams.topMargin + childLayoutParams.bottomMargin);
        float measuredChildSize2 = (float) child.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            childMargins = (float) (childLayoutParams.leftMargin + childLayoutParams.rightMargin);
            measuredChildSize = (float) child.getMeasuredWidth();
        } else {
            childMargins = childMargins2;
            measuredChildSize = measuredChildSize2;
        }
        float smallChildSizeMin = getSmallItemSizeMin() + childMargins;
        float smallChildSizeMax = Math.max(getSmallItemSizeMax() + childMargins, smallChildSizeMin);
        float targetLargeChildSize = Math.min(measuredChildSize + childMargins, availableSpace);
        float targetSmallChildSize = MathUtils.clamp((measuredChildSize / 3.0f) + childMargins, smallChildSizeMin + childMargins, smallChildSizeMax + childMargins);
        float targetMediumChildSize = (targetLargeChildSize + targetSmallChildSize) / 2.0f;
        int[] smallCounts2 = SMALL_COUNTS;
        if (availableSpace < 2.0f * smallChildSizeMin) {
            smallCounts2 = new int[]{0};
        }
        int[] mediumCounts2 = MEDIUM_COUNTS;
        if (carousel.getCarouselAlignment() == 1) {
            smallCounts = doubleCounts(smallCounts2);
            mediumCounts = doubleCounts(mediumCounts2);
        } else {
            smallCounts = smallCounts2;
            mediumCounts = mediumCounts2;
        }
        int largeCountMin = (int) Math.max(1.0d, Math.floor((double) (((availableSpace - (((float) CarouselStrategyHelper.maxValue(mediumCounts)) * targetMediumChildSize)) - (((float) CarouselStrategyHelper.maxValue(smallCounts)) * smallChildSizeMax)) / targetLargeChildSize)));
        int largeCountMax = (int) Math.ceil((double) (availableSpace / targetLargeChildSize));
        int[] largeCounts = new int[((largeCountMax - largeCountMin) + 1)];
        for (int i = 0; i < largeCounts.length; i++) {
            largeCounts[i] = largeCountMax - i;
        }
        int i2 = largeCountMax;
        int i3 = largeCountMin;
        Arrangement arrangement = Arrangement.findLowestCostArrangement(availableSpace, targetSmallChildSize, smallChildSizeMin, smallChildSizeMax, smallCounts, targetMediumChildSize, mediumCounts, targetLargeChildSize, largeCounts);
        this.keylineCount = arrangement.getItemCount();
        if (ensureArrangementFitsItemCount(arrangement, carousel.getItemCount())) {
            Arrangement arrangement2 = arrangement;
            arrangement = Arrangement.findLowestCostArrangement(availableSpace, targetSmallChildSize, smallChildSizeMin, smallChildSizeMax, new int[]{arrangement.smallCount}, targetMediumChildSize, new int[]{arrangement.mediumCount}, targetLargeChildSize, new int[]{arrangement.largeCount});
        } else {
            Arrangement arrangement3 = arrangement;
        }
        return CarouselStrategyHelper.createKeylineState(child.getContext(), childMargins, availableSpace, arrangement, carousel.getCarouselAlignment());
    }

    /* access modifiers changed from: package-private */
    public boolean ensureArrangementFitsItemCount(Arrangement arrangement, int carouselItemCount) {
        int keylineSurplus = arrangement.getItemCount() - carouselItemCount;
        boolean changed = keylineSurplus > 0 && (arrangement.smallCount > 0 || arrangement.mediumCount > 1);
        while (keylineSurplus > 0) {
            if (arrangement.smallCount > 0) {
                arrangement.smallCount--;
            } else if (arrangement.mediumCount > 1) {
                arrangement.mediumCount--;
            }
            keylineSurplus--;
        }
        return changed;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldRefreshKeylineState(Carousel carousel, int oldItemCount) {
        return (oldItemCount < this.keylineCount && carousel.getItemCount() >= this.keylineCount) || (oldItemCount >= this.keylineCount && carousel.getItemCount() < this.keylineCount);
    }
}
