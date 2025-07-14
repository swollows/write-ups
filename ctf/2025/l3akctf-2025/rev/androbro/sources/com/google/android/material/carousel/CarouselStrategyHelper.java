package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.R;
import com.google.android.material.carousel.KeylineState;

final class CarouselStrategyHelper {
    private CarouselStrategyHelper() {
    }

    static float getExtraSmallSize(Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_gone_size);
    }

    static float getSmallSizeMin(Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
    }

    static float getSmallSizeMax(Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
    }

    static KeylineState createKeylineState(Context context, float childMargins, float availableSpace, Arrangement arrangement, int alignment) {
        if (alignment == 1) {
            return createCenterAlignedKeylineState(context, childMargins, availableSpace, arrangement);
        }
        return createLeftAlignedKeylineState(context, childMargins, availableSpace, arrangement);
    }

    static KeylineState createLeftAlignedKeylineState(Context context, float childHorizontalMargins, float availableSpace, Arrangement arrangement) {
        float f = childHorizontalMargins;
        float f2 = availableSpace;
        Arrangement arrangement2 = arrangement;
        float extraSmallChildWidth = Math.min(getExtraSmallSize(context) + f, arrangement2.largeSize);
        float largeStartCenterX = addStart(0.0f, arrangement2.largeSize, arrangement2.largeCount);
        float start = updateCurPosition(0.0f, addEnd(largeStartCenterX, arrangement2.largeSize, arrangement2.largeCount), arrangement2.largeSize, arrangement2.largeCount);
        float mediumCenterX = addStart(start, arrangement2.mediumSize, arrangement2.mediumCount);
        float smallStartCenterX = addStart(updateCurPosition(start, mediumCenterX, arrangement2.mediumSize, arrangement2.mediumCount), arrangement2.smallSize, arrangement2.smallCount);
        float extraSmallTailCenterX = (extraSmallChildWidth / 2.0f) + f2;
        float extraSmallMask = CarouselStrategy.getChildMaskPercentage(extraSmallChildWidth, arrangement2.largeSize, f);
        float smallMask = CarouselStrategy.getChildMaskPercentage(arrangement2.smallSize, arrangement2.largeSize, f);
        float mediumMask = CarouselStrategy.getChildMaskPercentage(arrangement2.mediumSize, arrangement2.largeSize, f);
        float mediumMask2 = mediumMask;
        float smallMask2 = smallMask;
        float extraSmallMask2 = extraSmallMask;
        float smallStartCenterX2 = smallStartCenterX;
        KeylineState.Builder builder = new KeylineState.Builder(arrangement2.largeSize, f2).addAnchorKeyline(0.0f - (extraSmallChildWidth / 2.0f), extraSmallMask, extraSmallChildWidth).addKeylineRange(largeStartCenterX, 0.0f, arrangement2.largeSize, arrangement2.largeCount, true);
        if (arrangement2.mediumCount > 0) {
            builder.addKeyline(mediumCenterX, mediumMask2, arrangement2.mediumSize);
        }
        if (arrangement2.smallCount > 0) {
            builder.addKeylineRange(smallStartCenterX2, smallMask2, arrangement2.smallSize, arrangement2.smallCount);
        }
        builder.addAnchorKeyline(extraSmallTailCenterX, extraSmallMask2, extraSmallChildWidth);
        return builder.build();
    }

    static KeylineState createCenterAlignedKeylineState(Context context, float childHorizontalMargins, float availableSpace, Arrangement arrangement) {
        float extraSmallMask;
        float f = childHorizontalMargins;
        float f2 = availableSpace;
        Arrangement arrangement2 = arrangement;
        float extraSmallChildWidth = Math.min(getExtraSmallSize(context) + f, arrangement2.largeSize);
        float halfSmallStartCenterX = addStart(0.0f, arrangement2.smallSize, arrangement2.smallCount);
        float halfSmallEndCenterX = addEnd(halfSmallStartCenterX, arrangement2.smallSize, (int) Math.floor((double) (((float) arrangement2.smallCount) / 2.0f)));
        float start = updateCurPosition(0.0f, halfSmallEndCenterX, arrangement2.smallSize, arrangement2.smallCount);
        float halfMediumStartCenterX = addStart(start, arrangement2.mediumSize, arrangement2.mediumCount);
        float halfMediumEndCenterX = addEnd(halfMediumStartCenterX, arrangement2.mediumSize, (int) Math.floor((double) (((float) arrangement2.mediumCount) / 2.0f)));
        float start2 = updateCurPosition(start, halfMediumEndCenterX, arrangement2.mediumSize, arrangement2.mediumCount);
        float largeStartCenterX = addStart(start2, arrangement2.largeSize, arrangement2.largeCount);
        float largeEndCenterX = addEnd(largeStartCenterX, arrangement2.largeSize, arrangement2.largeCount);
        float start3 = updateCurPosition(start2, largeEndCenterX, arrangement2.largeSize, arrangement2.largeCount);
        float secondHalfMediumStartCenterX = addStart(start3, arrangement2.mediumSize, arrangement2.mediumCount);
        float secondHalfMediumEndCenterX = addEnd(secondHalfMediumStartCenterX, arrangement2.mediumSize, (int) Math.ceil((double) (((float) arrangement2.mediumCount) / 2.0f)));
        float start4 = updateCurPosition(start3, secondHalfMediumEndCenterX, arrangement2.mediumSize, arrangement2.mediumCount);
        float secondHalfSmallStartCenterX = addStart(start4, arrangement2.smallSize, arrangement2.smallCount);
        float extraSmallTailCenterX = (extraSmallChildWidth / 2.0f) + f2;
        float extraSmallMask2 = CarouselStrategy.getChildMaskPercentage(extraSmallChildWidth, arrangement2.largeSize, f);
        float f3 = start4;
        float f4 = secondHalfMediumEndCenterX;
        float smallMask = CarouselStrategy.getChildMaskPercentage(arrangement2.smallSize, arrangement2.largeSize, f);
        float f5 = halfSmallEndCenterX;
        float mediumMask = CarouselStrategy.getChildMaskPercentage(arrangement2.mediumSize, arrangement2.largeSize, f);
        float f6 = halfMediumEndCenterX;
        float extraSmallHeadCenterX = 0.0f - (extraSmallChildWidth / 2.0f);
        KeylineState.Builder builder = new KeylineState.Builder(arrangement2.largeSize, f2).addAnchorKeyline(extraSmallHeadCenterX, extraSmallMask2, extraSmallChildWidth);
        if (arrangement2.smallCount > 0) {
            float f7 = extraSmallHeadCenterX;
            float f8 = largeEndCenterX;
            extraSmallMask = extraSmallMask2;
            builder.addKeylineRange(halfSmallStartCenterX, smallMask, arrangement2.smallSize, (int) Math.floor((double) (((float) arrangement2.smallCount) / 2.0f)));
        } else {
            float f9 = largeEndCenterX;
            extraSmallMask = extraSmallMask2;
        }
        if (arrangement2.mediumCount > 0) {
            builder.addKeylineRange(halfMediumStartCenterX, mediumMask, arrangement2.mediumSize, (int) Math.floor((double) (((float) arrangement2.mediumCount) / 2.0f)));
        }
        float extraSmallMask3 = extraSmallMask;
        float f10 = halfSmallStartCenterX;
        float extraSmallTailCenterX2 = extraSmallTailCenterX;
        float f11 = halfMediumStartCenterX;
        float secondHalfMediumStartCenterX2 = secondHalfMediumStartCenterX;
        builder.addKeylineRange(largeStartCenterX, 0.0f, arrangement2.largeSize, arrangement2.largeCount, true);
        if (arrangement2.mediumCount > 0) {
            builder.addKeylineRange(secondHalfMediumStartCenterX2, mediumMask, arrangement2.mediumSize, (int) Math.ceil((double) (((float) arrangement2.mediumCount) / 2.0f)));
        }
        if (arrangement2.smallCount > 0) {
            builder.addKeylineRange(secondHalfSmallStartCenterX, smallMask, arrangement2.smallSize, (int) Math.ceil((double) (((float) arrangement2.smallCount) / 2.0f)));
        }
        builder.addAnchorKeyline(extraSmallTailCenterX2, extraSmallMask3, extraSmallChildWidth);
        return builder.build();
    }

    static int maxValue(int[] array) {
        int largest = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > largest) {
                largest = j;
            }
        }
        return largest;
    }

    static float addStart(float start, float itemSize, int count) {
        if (count > 0) {
            return (itemSize / 2.0f) + start;
        }
        return start;
    }

    static float addEnd(float startKeylinePos, float itemSize, int count) {
        return (((float) Math.max(0, count - 1)) * itemSize) + startKeylinePos;
    }

    static float updateCurPosition(float curPosition, float lastEndKeyline, float itemSize, int count) {
        if (count > 0) {
            return (itemSize / 2.0f) + lastEndKeyline;
        }
        return curPosition;
    }
}
