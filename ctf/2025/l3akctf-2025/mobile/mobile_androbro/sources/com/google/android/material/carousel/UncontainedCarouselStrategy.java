package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.KeylineState;

public final class UncontainedCarouselStrategy extends CarouselStrategy {
    private static final float MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD = 0.85f;

    /* access modifiers changed from: package-private */
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View child) {
        float measuredChildSize;
        float childMargins;
        int mediumCount;
        float availableSpace = (float) (carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight());
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
        float largeChildSize = measuredChildSize + childMargins;
        float mediumChildSize = CarouselStrategyHelper.getExtraSmallSize(child.getContext()) + childMargins;
        float xSmallChildSize = CarouselStrategyHelper.getExtraSmallSize(child.getContext()) + childMargins;
        boolean isCenter = true;
        int largeCount = Math.max(1, (int) Math.floor((double) (availableSpace / largeChildSize)));
        float remainingSpace = availableSpace - (((float) largeCount) * largeChildSize);
        if (carousel.getCarouselAlignment() != 1) {
            isCenter = false;
        }
        if (isCenter) {
            float remainingSpace2 = remainingSpace / 2.0f;
            float smallChildSizeMin = getSmallItemSizeMin() + childMargins;
            float f = smallChildSizeMin;
            return createCenterAlignedKeylineState(availableSpace, childMargins, largeChildSize, largeCount, Math.max(Math.min(3.0f * remainingSpace2, largeChildSize), smallChildSizeMin), xSmallChildSize, remainingSpace2);
        }
        if (remainingSpace > 0.0f) {
            mediumCount = 1;
        } else {
            mediumCount = 0;
        }
        float f2 = remainingSpace;
        return createLeftAlignedKeylineState(child.getContext(), childMargins, availableSpace, largeChildSize, largeCount, calculateMediumChildSize(mediumChildSize, largeChildSize, remainingSpace), mediumCount, xSmallChildSize);
    }

    private float calculateMediumChildSize(float mediumChildSize, float largeChildSize, float remainingSpace) {
        float mediumChildSize2 = Math.max(1.5f * remainingSpace, mediumChildSize);
        float largeItemThreshold = MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD * largeChildSize;
        if (mediumChildSize2 > largeItemThreshold) {
            mediumChildSize2 = Math.max(largeItemThreshold, 1.2f * remainingSpace);
        }
        return Math.min(largeChildSize, mediumChildSize2);
    }

    private KeylineState createCenterAlignedKeylineState(float availableSpace, float childMargins, float largeSize, int largeCount, float mediumSize, float xSmallSize, float remainingSpace) {
        float f = childMargins;
        float f2 = largeSize;
        float f3 = mediumSize;
        float xSmallSize2 = Math.min(xSmallSize, f2);
        float extraSmallMask = getChildMaskPercentage(xSmallSize2, f2, f);
        float mediumMask = getChildMaskPercentage(f3, f2, f);
        float firstMediumCenterX = (0.0f + remainingSpace) - (f3 / 2.0f);
        float start = (f3 / 2.0f) + firstMediumCenterX;
        float largeStartCenterX = start + (f2 / 2.0f);
        float start2 = start + (((float) largeCount) * f2);
        KeylineState.Builder builder = new KeylineState.Builder(f2, availableSpace).addAnchorKeyline((firstMediumCenterX - (f3 / 2.0f)) - (xSmallSize2 / 2.0f), extraSmallMask, xSmallSize2).addKeyline(firstMediumCenterX, mediumMask, f3, false).addKeylineRange(largeStartCenterX, 0.0f, largeSize, largeCount, true);
        builder.addKeyline(start2 + (f3 / 2.0f), mediumMask, f3, false);
        builder.addAnchorKeyline(start2 + f3 + (xSmallSize2 / 2.0f), extraSmallMask, xSmallSize2);
        return builder.build();
    }

    private KeylineState createLeftAlignedKeylineState(Context context, float childMargins, float availableSpace, float largeSize, int largeCount, float mediumSize, int mediumCount, float xSmallSize) {
        float f = childMargins;
        float f2 = largeSize;
        float f3 = mediumSize;
        float xSmallSize2 = Math.min(xSmallSize, f2);
        float leftAnchorSize = Math.max(xSmallSize2, 0.5f * f3);
        float leftAnchorMask = getChildMaskPercentage(leftAnchorSize, f2, f);
        float extraSmallMask = getChildMaskPercentage(xSmallSize2, f2, f);
        float mediumMask = getChildMaskPercentage(f3, f2, f);
        float leftAnchorCenterX = 0.0f - (leftAnchorSize / 2.0f);
        int i = largeCount;
        float start = 0.0f + (((float) i) * f2);
        float f4 = leftAnchorCenterX;
        KeylineState.Builder builder = new KeylineState.Builder(f2, availableSpace).addAnchorKeyline(leftAnchorCenterX, leftAnchorMask, leftAnchorSize).addKeylineRange(f2 / 2.0f, 0.0f, largeSize, i, true);
        if (mediumCount > 0) {
            float mediumCenterX = start + (f3 / 2.0f);
            start += f3;
            builder.addKeyline(mediumCenterX, mediumMask, f3, false);
        }
        builder.addAnchorKeyline(start + (CarouselStrategyHelper.getExtraSmallSize(context) / 2.0f), extraSmallMask, xSmallSize2);
        return builder.build();
    }

    /* access modifiers changed from: package-private */
    public boolean isContained() {
        return false;
    }
}
