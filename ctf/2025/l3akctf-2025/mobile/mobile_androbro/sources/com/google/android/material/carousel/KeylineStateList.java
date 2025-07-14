package com.google.android.material.carousel;

import androidx.core.math.MathUtils;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.KeylineState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class KeylineStateList {
    private static final int NO_INDEX = -1;
    private final KeylineState defaultState;
    private final float endShiftRange;
    private final List<KeylineState> endStateSteps;
    private final float[] endStateStepsInterpolationPoints;
    private final float startShiftRange;
    private final List<KeylineState> startStateSteps;
    private final float[] startStateStepsInterpolationPoints;

    private KeylineStateList(KeylineState defaultState2, List<KeylineState> startStateSteps2, List<KeylineState> endStateSteps2) {
        this.defaultState = defaultState2;
        this.startStateSteps = Collections.unmodifiableList(startStateSteps2);
        this.endStateSteps = Collections.unmodifiableList(endStateSteps2);
        this.startShiftRange = startStateSteps2.get(startStateSteps2.size() - 1).getFirstKeyline().loc - defaultState2.getFirstKeyline().loc;
        this.endShiftRange = defaultState2.getLastKeyline().loc - endStateSteps2.get(endStateSteps2.size() - 1).getLastKeyline().loc;
        this.startStateStepsInterpolationPoints = getStateStepInterpolationPoints(this.startShiftRange, startStateSteps2, true);
        this.endStateStepsInterpolationPoints = getStateStepInterpolationPoints(this.endShiftRange, endStateSteps2, false);
    }

    static KeylineStateList from(Carousel carousel, KeylineState state, float itemMargins, float leftOrTopPadding, float rightOrBottomPadding) {
        return new KeylineStateList(state, getStateStepsStart(carousel, state, itemMargins, leftOrTopPadding), getStateStepsEnd(carousel, state, itemMargins, rightOrBottomPadding));
    }

    /* access modifiers changed from: package-private */
    public KeylineState getDefaultState() {
        return this.defaultState;
    }

    /* access modifiers changed from: package-private */
    public KeylineState getStartState() {
        return this.startStateSteps.get(this.startStateSteps.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public KeylineState getEndState() {
        return this.endStateSteps.get(this.endStateSteps.size() - 1);
    }

    public KeylineState getShiftedState(float scrollOffset, float minScrollOffset, float maxScrollOffset) {
        return getShiftedState(scrollOffset, minScrollOffset, maxScrollOffset, false);
    }

    /* access modifiers changed from: package-private */
    public KeylineState getShiftedState(float scrollOffset, float minScrollOffset, float maxScrollOffset, boolean roundToNearestStep) {
        float[] interpolationPoints;
        List<KeylineState> steps;
        float interpolation;
        float startShiftOffset = this.startShiftRange + minScrollOffset;
        float endShiftOffset = maxScrollOffset - this.endShiftRange;
        float startPaddingShift = getStartState().getFirstFocalKeyline().leftOrTopPaddingShift;
        float endPaddingShift = getEndState().getLastFocalKeyline().rightOrBottomPaddingShift;
        if (this.startShiftRange == startPaddingShift) {
            startShiftOffset += startPaddingShift;
        }
        if (this.endShiftRange == endPaddingShift) {
            endShiftOffset -= endPaddingShift;
        }
        if (scrollOffset < startShiftOffset) {
            interpolation = AnimationUtils.lerp(1.0f, 0.0f, minScrollOffset, startShiftOffset, scrollOffset);
            steps = this.startStateSteps;
            interpolationPoints = this.startStateStepsInterpolationPoints;
        } else if (scrollOffset <= endShiftOffset) {
            return this.defaultState;
        } else {
            interpolation = AnimationUtils.lerp(0.0f, 1.0f, endShiftOffset, maxScrollOffset, scrollOffset);
            steps = this.endStateSteps;
            interpolationPoints = this.endStateStepsInterpolationPoints;
        }
        if (roundToNearestStep) {
            return closestStateStepFromInterpolation(steps, interpolation, interpolationPoints);
        }
        return lerp(steps, interpolation, interpolationPoints);
    }

    private static KeylineState lerp(List<KeylineState> stateSteps, float interpolation, float[] stateStepsInterpolationPoints) {
        float[] stateStepsRange = getStateStepsRange(stateSteps, interpolation, stateStepsInterpolationPoints);
        return KeylineState.lerp(stateSteps.get((int) stateStepsRange[1]), stateSteps.get((int) stateStepsRange[2]), stateStepsRange[0]);
    }

    private static float[] getStateStepsRange(List<KeylineState> stateSteps, float interpolation, float[] stateStepsInterpolationPoints) {
        int numberOfSteps = stateSteps.size();
        float lowerBounds = stateStepsInterpolationPoints[0];
        for (int i = 1; i < numberOfSteps; i++) {
            float upperBounds = stateStepsInterpolationPoints[i];
            if (interpolation <= upperBounds) {
                return new float[]{AnimationUtils.lerp(0.0f, 1.0f, lowerBounds, upperBounds, interpolation), (float) (i - 1), (float) i};
            }
            lowerBounds = upperBounds;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private KeylineState closestStateStepFromInterpolation(List<KeylineState> stateSteps, float interpolation, float[] stateStepsInterpolationPoints) {
        float[] stateStepsRange = getStateStepsRange(stateSteps, interpolation, stateStepsInterpolationPoints);
        if (stateStepsRange[0] >= 0.5f) {
            return stateSteps.get((int) stateStepsRange[2]);
        }
        return stateSteps.get((int) stateStepsRange[1]);
    }

    private static float[] getStateStepInterpolationPoints(float shiftRange, List<KeylineState> stateSteps, boolean isShiftingLeft) {
        float distanceShifted;
        int numberOfSteps = stateSteps.size();
        float[] stateStepsInterpolationPoints = new float[numberOfSteps];
        int i = 1;
        while (i < numberOfSteps) {
            KeylineState prevState = stateSteps.get(i - 1);
            KeylineState currState = stateSteps.get(i);
            if (isShiftingLeft) {
                distanceShifted = currState.getFirstKeyline().loc - prevState.getFirstKeyline().loc;
            } else {
                distanceShifted = prevState.getLastKeyline().loc - currState.getLastKeyline().loc;
            }
            stateStepsInterpolationPoints[i] = i == numberOfSteps + -1 ? 1.0f : stateStepsInterpolationPoints[i - 1] + (distanceShifted / shiftRange);
            i++;
        }
        return stateStepsInterpolationPoints;
    }

    private static boolean isFirstFocalItemAtLeftOfContainer(KeylineState state) {
        return state.getFirstFocalKeyline().locOffset - (state.getFirstFocalKeyline().maskedItemSize / 2.0f) >= 0.0f && state.getFirstFocalKeyline() == state.getFirstNonAnchorKeyline();
    }

    private static boolean isLastFocalItemVisibleAtRightOfContainer(Carousel carousel, KeylineState state) {
        int containerSize = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerSize = carousel.getContainerWidth();
        }
        return state.getLastFocalKeyline().locOffset + (state.getLastFocalKeyline().maskedItemSize / 2.0f) <= ((float) containerSize) && state.getLastFocalKeyline() == state.getLastNonAnchorKeyline();
    }

    private static KeylineState shiftKeylineStateForPadding(KeylineState keylineState, float padding, float carouselSize, boolean leftShift, float childMargins) {
        List<KeylineState.Keyline> tmpKeylines = new ArrayList<>(keylineState.getKeylines());
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), carouselSize);
        float toDecreaseBy = padding / ((float) keylineState.getNumberOfNonAnchorKeylines());
        float nextOffset = 0.0f;
        if (leftShift) {
            nextOffset = padding;
        }
        float nextOffset2 = nextOffset;
        int j = 0;
        while (j < tmpKeylines.size()) {
            KeylineState.Keyline k = tmpKeylines.get(j);
            if (k.isAnchor) {
                builder.addKeyline(k.locOffset, k.mask, k.maskedItemSize, false, true, k.cutoff);
                float f = childMargins;
            } else {
                boolean isFocal = j >= keylineState.getFirstFocalKeylineIndex() && j <= keylineState.getLastFocalKeylineIndex();
                float maskedItemSize = k.maskedItemSize - toDecreaseBy;
                float mask = CarouselStrategy.getChildMaskPercentage(maskedItemSize, keylineState.getItemSize(), childMargins);
                float locOffset = (maskedItemSize / 2.0f) + nextOffset2;
                float actualPaddingShift = locOffset - k.locOffset;
                builder.addKeyline(locOffset, mask, maskedItemSize, isFocal, false, k.cutoff, leftShift ? actualPaddingShift : 0.0f, leftShift ? 0.0f : actualPaddingShift);
                nextOffset2 += maskedItemSize;
            }
            j++;
        }
        float f2 = childMargins;
        return builder.build();
    }

    private static List<KeylineState> getStateStepsStart(Carousel carousel, KeylineState defaultState2, float itemMargins, float leftOrTopPaddingForKeylineShift) {
        int dstIndex;
        KeylineState keylineState = defaultState2;
        float f = itemMargins;
        float f2 = leftOrTopPaddingForKeylineShift;
        List<KeylineState> steps = new ArrayList<>();
        steps.add(keylineState);
        int firstNonAnchorKeylineIndex = findFirstNonAnchorKeylineIndex(defaultState2);
        float carouselSize = (float) (carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight());
        int i = 1;
        if (isFirstFocalItemAtLeftOfContainer(defaultState2) || firstNonAnchorKeylineIndex == -1) {
            if (f2 > 0.0f) {
                steps.add(shiftKeylineStateForPadding(keylineState, f2, carouselSize, true, f));
            }
            return steps;
        }
        int start = firstNonAnchorKeylineIndex;
        int numberOfSteps = defaultState2.getFirstFocalKeylineIndex() - start;
        float originalStart = defaultState2.getFirstKeyline().locOffset - (defaultState2.getFirstKeyline().maskedItemSize / 2.0f);
        if (numberOfSteps > 0 || defaultState2.getFirstFocalKeyline().cutoff <= 0.0f) {
            float cutoffs = 0.0f;
            int i2 = 0;
            while (i2 < numberOfSteps) {
                KeylineState prevStepState = steps.get(steps.size() - i);
                int itemOrigIndex = start + i2;
                int dstIndex2 = defaultState2.getKeylines().size() - i;
                float cutoffs2 = cutoffs + defaultState2.getKeylines().get(itemOrigIndex).cutoff;
                if (itemOrigIndex - 1 >= 0) {
                    dstIndex = findFirstIndexAfterLastFocalKeylineWithMask(prevStepState, defaultState2.getKeylines().get(itemOrigIndex - 1).mask) - 1;
                } else {
                    dstIndex = dstIndex2;
                }
                int i3 = itemOrigIndex;
                KeylineState keylineState2 = prevStepState;
                int i4 = i2;
                int numberOfSteps2 = numberOfSteps;
                KeylineState shifted = moveKeylineAndCreateKeylineState(prevStepState, firstNonAnchorKeylineIndex, dstIndex, originalStart + cutoffs2, (defaultState2.getFirstFocalKeylineIndex() - i2) - 1, (defaultState2.getLastFocalKeylineIndex() - i2) - 1, carouselSize);
                if (i4 == numberOfSteps2 - 1 && f2 > 0.0f) {
                    shifted = shiftKeylineStateForPadding(shifted, f2, carouselSize, true, f);
                }
                steps.add(shifted);
                i2 = i4 + 1;
                cutoffs = cutoffs2;
                numberOfSteps = numberOfSteps2;
                i = 1;
            }
            return steps;
        }
        steps.add(shiftKeylinesAndCreateKeylineState(keylineState, originalStart + defaultState2.getFirstFocalKeyline().cutoff, carouselSize));
        return steps;
    }

    private static List<KeylineState> getStateStepsEnd(Carousel carousel, KeylineState defaultState2, float itemMargins, float rightOrBottomPaddingForKeylineShift) {
        int dstIndex;
        KeylineState keylineState = defaultState2;
        float f = itemMargins;
        float f2 = rightOrBottomPaddingForKeylineShift;
        List<KeylineState> steps = new ArrayList<>();
        steps.add(keylineState);
        int lastNonAnchorKeylineIndex = findLastNonAnchorKeylineIndex(defaultState2);
        float carouselSize = (float) (carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight());
        if (isLastFocalItemVisibleAtRightOfContainer(carousel, defaultState2) || lastNonAnchorKeylineIndex == -1) {
            if (f2 > 0.0f) {
                steps.add(shiftKeylineStateForPadding(keylineState, f2, carouselSize, false, f));
            }
            return steps;
        }
        int end = lastNonAnchorKeylineIndex;
        int numberOfSteps = end - defaultState2.getLastFocalKeylineIndex();
        float originalStart = defaultState2.getFirstKeyline().locOffset - (defaultState2.getFirstKeyline().maskedItemSize / 2.0f);
        if (numberOfSteps > 0 || defaultState2.getLastFocalKeyline().cutoff <= 0.0f) {
            float cutoffs = 0.0f;
            int i = 0;
            while (i < numberOfSteps) {
                KeylineState prevStepState = steps.get(steps.size() - 1);
                int itemOrigIndex = end - i;
                float cutoffs2 = cutoffs + defaultState2.getKeylines().get(itemOrigIndex).cutoff;
                if (itemOrigIndex + 1 < defaultState2.getKeylines().size()) {
                    dstIndex = findLastIndexBeforeFirstFocalKeylineWithMask(prevStepState, defaultState2.getKeylines().get(itemOrigIndex + 1).mask) + 1;
                } else {
                    dstIndex = 0;
                }
                int i2 = itemOrigIndex;
                KeylineState keylineState2 = prevStepState;
                int i3 = i;
                int numberOfSteps2 = numberOfSteps;
                KeylineState shifted = moveKeylineAndCreateKeylineState(prevStepState, lastNonAnchorKeylineIndex, dstIndex, originalStart - cutoffs2, defaultState2.getFirstFocalKeylineIndex() + i + 1, defaultState2.getLastFocalKeylineIndex() + i + 1, carouselSize);
                if (i3 == numberOfSteps2 - 1 && f2 > 0.0f) {
                    shifted = shiftKeylineStateForPadding(shifted, f2, carouselSize, false, f);
                }
                steps.add(shifted);
                i = i3 + 1;
                cutoffs = cutoffs2;
                numberOfSteps = numberOfSteps2;
            }
            return steps;
        }
        steps.add(shiftKeylinesAndCreateKeylineState(keylineState, originalStart - defaultState2.getLastFocalKeyline().cutoff, carouselSize));
        return steps;
    }

    private static KeylineState shiftKeylinesAndCreateKeylineState(KeylineState state, float startOffset, float carouselSize) {
        return moveKeylineAndCreateKeylineState(state, 0, 0, startOffset, state.getFirstFocalKeylineIndex(), state.getLastFocalKeylineIndex(), carouselSize);
    }

    private static KeylineState moveKeylineAndCreateKeylineState(KeylineState state, int keylineSrcIndex, int keylineDstIndex, float startOffset, int newFirstFocalIndex, int newLastFocalIndex, float carouselSize) {
        boolean isFocal;
        List<KeylineState.Keyline> tmpKeylines = new ArrayList<>(state.getKeylines());
        tmpKeylines.add(keylineDstIndex, tmpKeylines.remove(keylineSrcIndex));
        KeylineState.Builder builder = new KeylineState.Builder(state.getItemSize(), carouselSize);
        float startOffset2 = startOffset;
        int j = 0;
        while (j < tmpKeylines.size()) {
            KeylineState.Keyline k = (KeylineState.Keyline) tmpKeylines.get(j);
            float offset = startOffset2 + (k.maskedItemSize / 2.0f);
            if (j < newFirstFocalIndex) {
                int i = newLastFocalIndex;
            } else if (j <= newLastFocalIndex) {
                isFocal = true;
                builder.addKeyline(offset, k.mask, k.maskedItemSize, isFocal, k.isAnchor, k.cutoff);
                startOffset2 += k.maskedItemSize;
                j++;
                tmpKeylines = tmpKeylines;
            }
            isFocal = false;
            builder.addKeyline(offset, k.mask, k.maskedItemSize, isFocal, k.isAnchor, k.cutoff);
            startOffset2 += k.maskedItemSize;
            j++;
            tmpKeylines = tmpKeylines;
        }
        return builder.build();
    }

    private static int findFirstIndexAfterLastFocalKeylineWithMask(KeylineState state, float mask) {
        for (int i = state.getLastFocalKeylineIndex(); i < state.getKeylines().size(); i++) {
            if (mask == state.getKeylines().get(i).mask) {
                return i;
            }
        }
        return state.getKeylines().size() - 1;
    }

    private static int findLastIndexBeforeFirstFocalKeylineWithMask(KeylineState state, float mask) {
        for (int i = state.getFirstFocalKeylineIndex() - 1; i >= 0; i--) {
            if (mask == state.getKeylines().get(i).mask) {
                return i;
            }
        }
        return 0;
    }

    private static int findFirstNonAnchorKeylineIndex(KeylineState state) {
        for (int i = 0; i < state.getKeylines().size(); i++) {
            if (!state.getKeylines().get(i).isAnchor) {
                return i;
            }
        }
        return -1;
    }

    private static int findLastNonAnchorKeylineIndex(KeylineState state) {
        for (int i = state.getKeylines().size() - 1; i >= 0; i--) {
            if (!state.getKeylines().get(i).isAnchor) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public Map<Integer, KeylineState> getKeylineStateForPositionMap(int itemCount, int minHorizontalScroll, int maxHorizontalScroll, boolean isRTL) {
        int i = itemCount;
        float itemSize = this.defaultState.getItemSize();
        Map<Integer, KeylineState> keylineStates = new HashMap<>();
        int endStepsIndex = 0;
        int startStepsIndex = 0;
        for (int i2 = 0; i2 < i; i2++) {
            int position = isRTL ? (i - i2) - 1 : i2;
            if (((float) position) * itemSize * ((float) (isRTL ? -1 : 1)) > ((float) maxHorizontalScroll) - this.endShiftRange || i2 >= i - this.endStateSteps.size()) {
                keylineStates.put(Integer.valueOf(position), this.endStateSteps.get(MathUtils.clamp(endStepsIndex, 0, this.endStateSteps.size() - 1)));
                endStepsIndex++;
            }
        }
        int i3 = maxHorizontalScroll;
        for (int i4 = i - 1; i4 >= 0; i4--) {
            int position2 = isRTL ? (i - i4) - 1 : i4;
            if (((float) position2) * itemSize * ((float) (isRTL ? -1 : 1)) < ((float) minHorizontalScroll) + this.startShiftRange || i4 < this.startStateSteps.size()) {
                keylineStates.put(Integer.valueOf(position2), this.startStateSteps.get(MathUtils.clamp(startStepsIndex, 0, this.startStateSteps.size() - 1)));
                startStepsIndex++;
            }
        }
        int i5 = minHorizontalScroll;
        return keylineStates;
    }
}
