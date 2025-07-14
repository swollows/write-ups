package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.KeylineState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CarouselLayoutManager extends RecyclerView.LayoutManager implements Carousel, RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final int ALIGNMENT_CENTER = 1;
    public static final int ALIGNMENT_START = 0;
    public static final int HORIZONTAL = 0;
    private static final String TAG = "CarouselLayoutManager";
    public static final int VERTICAL = 1;
    private int carouselAlignment;
    private CarouselStrategy carouselStrategy;
    private int currentEstimatedPosition;
    private int currentFillStartPosition;
    private KeylineState currentKeylineState;
    private final DebugItemDecoration debugItemDecoration;
    private boolean isDebuggingEnabled;
    /* access modifiers changed from: private */
    public KeylineStateList keylineStateList;
    private Map<Integer, KeylineState> keylineStatePositionMap;
    private int lastItemCount;
    int maxScroll;
    int minScroll;
    private CarouselOrientationHelper orientationHelper;
    private final View.OnLayoutChangeListener recyclerViewSizeChangeListener;
    int scrollOffset;

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$new$0$com-google-android-material-carousel-CarouselLayoutManager  reason: not valid java name */
    public /* synthetic */ void m188lambda$new$0$comgoogleandroidmaterialcarouselCarouselLayoutManager(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        if (left != oldLeft || top != oldTop || right != oldRight || bottom != oldBottom) {
            v.post(new CarouselLayoutManager$$ExternalSyntheticLambda0(this));
        }
    }

    private static final class ChildCalculations {
        final float center;
        final View child;
        final float offsetCenter;
        final KeylineRange range;

        ChildCalculations(View child2, float center2, float offsetCenter2, KeylineRange range2) {
            this.child = child2;
            this.center = center2;
            this.offsetCenter = offsetCenter2;
            this.range = range2;
        }
    }

    public CarouselLayoutManager() {
        this(new MultiBrowseCarouselStrategy());
    }

    public CarouselLayoutManager(CarouselStrategy strategy) {
        this(strategy, 0);
    }

    public CarouselLayoutManager(CarouselStrategy strategy, int orientation) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new CarouselLayoutManager$$ExternalSyntheticLambda1(this);
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(strategy);
        setOrientation(orientation);
    }

    public CarouselLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new CarouselLayoutManager$$ExternalSyntheticLambda1(this);
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(new MultiBrowseCarouselStrategy());
        setCarouselAttributes(context, attrs);
    }

    private void setCarouselAttributes(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.Carousel);
            setCarouselAlignment(a.getInt(R.styleable.Carousel_carousel_alignment, 0));
            setOrientation(a.getInt(R.styleable.RecyclerView_android_orientation, 0));
            a.recycle();
        }
    }

    public void setCarouselAlignment(int alignment) {
        this.carouselAlignment = alignment;
        refreshKeylineState();
    }

    public int getCarouselAlignment() {
        return this.carouselAlignment;
    }

    private int getLeftOrTopPaddingForKeylineShift() {
        if (getClipToPadding() || !this.carouselStrategy.isContained()) {
            return 0;
        }
        if (getOrientation() == 1) {
            return getPaddingTop();
        }
        return getPaddingLeft();
    }

    private int getRightOrBottomPaddingForKeylineShift() {
        if (getClipToPadding() || !this.carouselStrategy.isContained()) {
            return 0;
        }
        if (getOrientation() == 1) {
            return getPaddingBottom();
        }
        return getPaddingRight();
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public void setCarouselStrategy(CarouselStrategy carouselStrategy2) {
        this.carouselStrategy = carouselStrategy2;
        refreshKeylineState();
    }

    public void onAttachedToWindow(RecyclerView view) {
        super.onAttachedToWindow(view);
        this.carouselStrategy.initialize(view.getContext());
        refreshKeylineState();
        view.addOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    public void onDetachedFromWindow(RecyclerView view, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(view, recycler);
        view.removeOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() <= 0 || ((float) getContainerSize()) <= 0.0f) {
            removeAndRecycleAllViews(recycler);
            this.currentFillStartPosition = 0;
            return;
        }
        boolean isRtl = isLayoutRtl();
        boolean isInitialLoad = this.keylineStateList == null;
        if (isInitialLoad) {
            recalculateKeylineStateList(recycler);
        }
        int startScroll = calculateStartScroll(this.keylineStateList);
        int endScroll = calculateEndScroll(state, this.keylineStateList);
        this.minScroll = isRtl ? endScroll : startScroll;
        this.maxScroll = isRtl ? startScroll : endScroll;
        if (isInitialLoad) {
            this.scrollOffset = startScroll;
            this.keylineStatePositionMap = this.keylineStateList.getKeylineStateForPositionMap(getItemCount(), this.minScroll, this.maxScroll, isLayoutRtl());
            if (this.currentEstimatedPosition != -1) {
                this.scrollOffset = getScrollOffsetForPosition(this.currentEstimatedPosition, getKeylineStateForPosition(this.currentEstimatedPosition));
            }
        }
        this.scrollOffset += calculateShouldScrollBy(0, this.scrollOffset, this.minScroll, this.maxScroll);
        this.currentFillStartPosition = MathUtils.clamp(this.currentFillStartPosition, 0, state.getItemCount());
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        detachAndScrapAttachedViews(recycler);
        fill(recycler, state);
        this.lastItemCount = getItemCount();
    }

    public boolean isAutoMeasureEnabled() {
        return true;
    }

    private void recalculateKeylineStateList(RecyclerView.Recycler recycler) {
        View firstChild = recycler.getViewForPosition(0);
        measureChildWithMargins(firstChild, 0, 0);
        KeylineState keylineState = this.carouselStrategy.onFirstChildMeasuredWithMargins(this, firstChild);
        this.keylineStateList = KeylineStateList.from(this, isLayoutRtl() ? KeylineState.reverse(keylineState, (float) getContainerSize()) : keylineState, (float) getItemMargins(), (float) getLeftOrTopPaddingForKeylineShift(), (float) getRightOrBottomPaddingForKeylineShift());
    }

    private int getItemMargins() {
        if (getChildCount() <= 0) {
            return 0;
        }
        RecyclerView.LayoutParams lp = (RecyclerView.LayoutParams) getChildAt(0).getLayoutParams();
        if (this.orientationHelper.orientation == 0) {
            return lp.leftMargin + lp.rightMargin;
        }
        return lp.topMargin + lp.bottomMargin;
    }

    /* access modifiers changed from: private */
    public void refreshKeylineState() {
        this.keylineStateList = null;
        requestLayout();
    }

    private void fill(RecyclerView.Recycler recycler, RecyclerView.State state) {
        removeAndRecycleOutOfBoundsViews(recycler);
        if (getChildCount() == 0) {
            addViewsStart(recycler, this.currentFillStartPosition - 1);
            addViewsEnd(recycler, state, this.currentFillStartPosition);
        } else {
            int firstPosition = getPosition(getChildAt(0));
            int lastPosition = getPosition(getChildAt(getChildCount() - 1));
            addViewsStart(recycler, firstPosition - 1);
            addViewsEnd(recycler, state, lastPosition + 1);
        }
        validateChildOrderIfDebugging();
    }

    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        if (getChildCount() == 0) {
            this.currentFillStartPosition = 0;
        } else {
            this.currentFillStartPosition = getPosition(getChildAt(0));
        }
        validateChildOrderIfDebugging();
    }

    private void addViewsStart(RecyclerView.Recycler recycler, int startPosition) {
        float start = calculateChildStartForFill(startPosition);
        int i = startPosition;
        while (i >= 0) {
            ChildCalculations calculations = makeChildCalculations(recycler, start, i);
            if (!isLocOffsetOutOfFillBoundsStart(calculations.offsetCenter, calculations.range)) {
                start = addStart(start, this.currentKeylineState.getItemSize());
                if (!isLocOffsetOutOfFillBoundsEnd(calculations.offsetCenter, calculations.range)) {
                    addAndLayoutView(calculations.child, 0, calculations);
                }
                i--;
            } else {
                return;
            }
        }
    }

    private void addViewAtPosition(RecyclerView.Recycler recycler, int startPosition, int childIndex) {
        if (startPosition >= 0 && startPosition < getItemCount()) {
            ChildCalculations calculations = makeChildCalculations(recycler, calculateChildStartForFill(startPosition), startPosition);
            addAndLayoutView(calculations.child, childIndex, calculations);
        }
    }

    private void addViewsEnd(RecyclerView.Recycler recycler, RecyclerView.State state, int startPosition) {
        float start = calculateChildStartForFill(startPosition);
        int i = startPosition;
        while (i < state.getItemCount()) {
            ChildCalculations calculations = makeChildCalculations(recycler, start, i);
            if (!isLocOffsetOutOfFillBoundsEnd(calculations.offsetCenter, calculations.range)) {
                start = addEnd(start, this.currentKeylineState.getItemSize());
                if (!isLocOffsetOutOfFillBoundsStart(calculations.offsetCenter, calculations.range)) {
                    addAndLayoutView(calculations.child, -1, calculations);
                }
                i++;
            } else {
                return;
            }
        }
    }

    private void logChildrenIfDebugging() {
        if (this.isDebuggingEnabled && Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "internal representation of views on the screen");
            for (int i = 0; i < getChildCount(); i++) {
                View child = getChildAt(i);
                Log.d(TAG, "item position " + getPosition(child) + ", center:" + getDecoratedCenterWithMargins(child) + ", child index:" + i);
            }
            Log.d(TAG, "==============");
        }
    }

    private void validateChildOrderIfDebugging() {
        if (this.isDebuggingEnabled && getChildCount() >= 1) {
            int i = 0;
            while (i < getChildCount() - 1) {
                int currPos = getPosition(getChildAt(i));
                int nextPos = getPosition(getChildAt(i + 1));
                if (currPos <= nextPos) {
                    i++;
                } else {
                    logChildrenIfDebugging();
                    throw new IllegalStateException("Detected invalid child order. Child at index [" + i + "] had adapter position [" + currPos + "] and child at index [" + (i + 1) + "] had adapter position [" + nextPos + "].");
                }
            }
        }
    }

    private ChildCalculations makeChildCalculations(RecyclerView.Recycler recycler, float start, int position) {
        View child = recycler.getViewForPosition(position);
        measureChildWithMargins(child, 0, 0);
        float center = addEnd(start, this.currentKeylineState.getItemSize() / 2.0f);
        KeylineRange range = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), center, false);
        return new ChildCalculations(child, center, calculateChildOffsetCenterForLocation(child, center, range), range);
    }

    private void addAndLayoutView(View child, int index, ChildCalculations calculations) {
        float halfItemSize = this.currentKeylineState.getItemSize() / 2.0f;
        addView(child, index);
        this.orientationHelper.layoutDecoratedWithMargins(child, (int) (calculations.offsetCenter - halfItemSize), (int) (calculations.offsetCenter + halfItemSize));
        updateChildMaskForLocation(child, calculations.center, calculations.range);
    }

    private boolean isLocOffsetOutOfFillBoundsStart(float locOffset, KeylineRange range) {
        float maskedEnd = addEnd(locOffset, getMaskedItemSizeForLocOffset(locOffset, range) / 2.0f);
        if (isLayoutRtl()) {
            if (maskedEnd > ((float) getContainerSize())) {
                return true;
            }
        } else if (maskedEnd < 0.0f) {
            return true;
        }
        return false;
    }

    public boolean isHorizontal() {
        return this.orientationHelper.orientation == 0;
    }

    private boolean isLocOffsetOutOfFillBoundsEnd(float locOffset, KeylineRange range) {
        float maskedStart = addStart(locOffset, getMaskedItemSizeForLocOffset(locOffset, range) / 2.0f);
        if (isLayoutRtl()) {
            if (maskedStart < 0.0f) {
                return true;
            }
        } else if (maskedStart > ((float) getContainerSize())) {
            return true;
        }
        return false;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect outBounds) {
        super.getDecoratedBoundsWithMargins(view, outBounds);
        float center = (float) outBounds.centerY();
        if (isHorizontal()) {
            center = (float) outBounds.centerX();
        }
        float maskedSize = getMaskedItemSizeForLocOffset(center, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), center, true));
        float f = 0.0f;
        float deltaX = isHorizontal() ? (((float) outBounds.width()) - maskedSize) / 2.0f : 0.0f;
        if (!isHorizontal()) {
            f = (((float) outBounds.height()) - maskedSize) / 2.0f;
        }
        float deltaY = f;
        outBounds.set((int) (((float) outBounds.left) + deltaX), (int) (((float) outBounds.top) + deltaY), (int) (((float) outBounds.right) - deltaX), (int) (((float) outBounds.bottom) - deltaY));
    }

    private float getDecoratedCenterWithMargins(View child) {
        Rect bounds = new Rect();
        super.getDecoratedBoundsWithMargins(child, bounds);
        if (isHorizontal()) {
            return (float) bounds.centerX();
        }
        return (float) bounds.centerY();
    }

    private void removeAndRecycleOutOfBoundsViews(RecyclerView.Recycler recycler) {
        while (getChildCount() > 0) {
            View child = getChildAt(0);
            float center = getDecoratedCenterWithMargins(child);
            if (!isLocOffsetOutOfFillBoundsStart(center, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), center, true))) {
                break;
            }
            removeAndRecycleView(child, recycler);
        }
        while (getChildCount() - 1 >= 0) {
            View child2 = getChildAt(getChildCount() - 1);
            float center2 = getDecoratedCenterWithMargins(child2);
            if (isLocOffsetOutOfFillBoundsEnd(center2, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), center2, true))) {
                removeAndRecycleView(child2, recycler);
            } else {
                return;
            }
        }
    }

    private static KeylineRange getSurroundingKeylineRange(List<KeylineState.Keyline> keylines, float location, boolean isOffset) {
        int startMinDistanceIndex = -1;
        float startMinDistance = Float.MAX_VALUE;
        int startMostIndex = -1;
        float startMostX = Float.MAX_VALUE;
        int endMinDistanceIndex = -1;
        float endMinDistance = Float.MAX_VALUE;
        int endMostIndex = -1;
        float endMostX = -3.4028235E38f;
        for (int i = 0; i < keylines.size(); i++) {
            KeylineState.Keyline keyline = keylines.get(i);
            float currentLoc = isOffset ? keyline.locOffset : keyline.loc;
            float delta = Math.abs(currentLoc - location);
            if (currentLoc <= location && delta <= startMinDistance) {
                startMinDistance = delta;
                startMinDistanceIndex = i;
            }
            if (currentLoc > location && delta <= endMinDistance) {
                endMinDistance = delta;
                endMinDistanceIndex = i;
            }
            if (currentLoc <= startMostX) {
                startMostIndex = i;
                startMostX = currentLoc;
            }
            if (currentLoc > endMostX) {
                endMostIndex = i;
                endMostX = currentLoc;
            }
        }
        if (startMinDistanceIndex == -1) {
            startMinDistanceIndex = startMostIndex;
        }
        if (endMinDistanceIndex == -1) {
            endMinDistanceIndex = endMostIndex;
        }
        return new KeylineRange(keylines.get(startMinDistanceIndex), keylines.get(endMinDistanceIndex));
    }

    private void updateCurrentKeylineStateForScrollOffset(KeylineStateList keylineStateList2) {
        if (this.maxScroll <= this.minScroll) {
            this.currentKeylineState = isLayoutRtl() ? keylineStateList2.getEndState() : keylineStateList2.getStartState();
        } else {
            this.currentKeylineState = keylineStateList2.getShiftedState((float) this.scrollOffset, (float) this.minScroll, (float) this.maxScroll);
        }
        this.debugItemDecoration.setKeylines(this.currentKeylineState.getKeylines());
    }

    private static int calculateShouldScrollBy(int delta, int currentScroll, int minScroll2, int maxScroll2) {
        int targetScroll = currentScroll + delta;
        if (targetScroll < minScroll2) {
            return minScroll2 - currentScroll;
        }
        if (targetScroll > maxScroll2) {
            return maxScroll2 - currentScroll;
        }
        return delta;
    }

    private int calculateStartScroll(KeylineStateList stateList) {
        boolean isRtl = isLayoutRtl();
        KeylineState startState = isRtl ? stateList.getEndState() : stateList.getStartState();
        return (int) (((float) getParentStart()) - addStart((isRtl ? startState.getLastFocalKeyline() : startState.getFirstFocalKeyline()).loc, startState.getItemSize() / 2.0f));
    }

    private int calculateEndScroll(RecyclerView.State state, KeylineStateList stateList) {
        boolean isRtl = isLayoutRtl();
        KeylineState endState = isRtl ? stateList.getStartState() : stateList.getEndState();
        KeylineState.Keyline endFocalKeyline = isRtl ? endState.getFirstFocalKeyline() : endState.getLastFocalKeyline();
        int endScroll = (int) ((((((float) (state.getItemCount() - 1)) * endState.getItemSize()) * (isRtl ? -1.0f : 1.0f)) - (endFocalKeyline.loc - ((float) getParentStart()))) + (((float) getParentEnd()) - endFocalKeyline.loc) + (isRtl ? -endFocalKeyline.leftOrTopPaddingShift : endFocalKeyline.rightOrBottomPaddingShift));
        return isRtl ? Math.min(0, endScroll) : Math.max(0, endScroll);
    }

    private float calculateChildStartForFill(int startPosition) {
        return addEnd((float) (getParentStart() - this.scrollOffset), this.currentKeylineState.getItemSize() * ((float) startPosition));
    }

    private float calculateChildOffsetCenterForLocation(View child, float childCenterLocation, KeylineRange range) {
        float offsetCenter = AnimationUtils.lerp(range.leftOrTop.locOffset, range.rightOrBottom.locOffset, range.leftOrTop.loc, range.rightOrBottom.loc, childCenterLocation);
        if (range.rightOrBottom != this.currentKeylineState.getFirstKeyline() && range.leftOrTop != this.currentKeylineState.getLastKeyline()) {
            return offsetCenter;
        }
        return offsetCenter + ((childCenterLocation - range.rightOrBottom.loc) * ((1.0f - range.rightOrBottom.mask) + (this.orientationHelper.getMaskMargins((RecyclerView.LayoutParams) child.getLayoutParams()) / this.currentKeylineState.getItemSize())));
    }

    private float getMaskedItemSizeForLocOffset(float locOffset, KeylineRange range) {
        return AnimationUtils.lerp(range.leftOrTop.maskedItemSize, range.rightOrBottom.maskedItemSize, range.leftOrTop.locOffset, range.rightOrBottom.locOffset, locOffset);
    }

    private void updateChildMaskForLocation(View child, float childCenterLocation, KeylineRange range) {
        View view = child;
        KeylineRange keylineRange = range;
        if (view instanceof Maskable) {
            float maskProgress = AnimationUtils.lerp(keylineRange.leftOrTop.mask, keylineRange.rightOrBottom.mask, keylineRange.leftOrTop.loc, keylineRange.rightOrBottom.loc, childCenterLocation);
            float childHeight = (float) child.getHeight();
            float childWidth = (float) child.getWidth();
            float maskWidth = AnimationUtils.lerp(0.0f, childWidth / 2.0f, 0.0f, 1.0f, maskProgress);
            RectF maskRect = this.orientationHelper.getMaskRect(childHeight, childWidth, AnimationUtils.lerp(0.0f, childHeight / 2.0f, 0.0f, 1.0f, maskProgress), maskWidth);
            float offsetCenter = calculateChildOffsetCenterForLocation(child, childCenterLocation, range);
            RectF offsetMaskRect = new RectF(offsetCenter - (maskRect.width() / 2.0f), offsetCenter - (maskRect.height() / 2.0f), (maskRect.width() / 2.0f) + offsetCenter, (maskRect.height() / 2.0f) + offsetCenter);
            float f = maskProgress;
            float f2 = childHeight;
            float f3 = childWidth;
            RectF parentBoundsRect = new RectF((float) getParentLeft(), (float) getParentTop(), (float) getParentRight(), (float) getParentBottom());
            if (this.carouselStrategy.isContained()) {
                this.orientationHelper.containMaskWithinBounds(maskRect, offsetMaskRect, parentBoundsRect);
            }
            this.orientationHelper.moveMaskOnEdgeOutsideBounds(maskRect, offsetMaskRect, parentBoundsRect);
            ((Maskable) view).setMaskRectF(maskRect);
        }
    }

    public void measureChildWithMargins(View child, int widthUsed, int heightUsed) {
        float childWidthDimension;
        float childHeightDimension;
        if (child instanceof Maskable) {
            RecyclerView.LayoutParams lp = (RecyclerView.LayoutParams) child.getLayoutParams();
            Rect insets = new Rect();
            calculateItemDecorationsForChild(child, insets);
            int widthUsed2 = widthUsed + insets.left + insets.right;
            int heightUsed2 = heightUsed + insets.top + insets.bottom;
            if (this.keylineStateList == null || this.orientationHelper.orientation != 0) {
                childWidthDimension = (float) lp.width;
            } else {
                childWidthDimension = this.keylineStateList.getDefaultState().getItemSize();
            }
            if (this.keylineStateList == null || this.orientationHelper.orientation != 1) {
                childHeightDimension = (float) lp.height;
            } else {
                childHeightDimension = this.keylineStateList.getDefaultState().getItemSize();
            }
            child.measure(getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + lp.leftMargin + lp.rightMargin + widthUsed2, (int) childWidthDimension, canScrollHorizontally()), getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + lp.topMargin + lp.bottomMargin + heightUsed2, (int) childHeightDimension, canScrollVertically()));
            return;
        }
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    /* access modifiers changed from: private */
    public int getParentLeft() {
        return this.orientationHelper.getParentLeft();
    }

    private int getParentStart() {
        return this.orientationHelper.getParentStart();
    }

    /* access modifiers changed from: private */
    public int getParentRight() {
        return this.orientationHelper.getParentRight();
    }

    private int getParentEnd() {
        return this.orientationHelper.getParentEnd();
    }

    /* access modifiers changed from: private */
    public int getParentTop() {
        return this.orientationHelper.getParentTop();
    }

    /* access modifiers changed from: private */
    public int getParentBottom() {
        return this.orientationHelper.getParentBottom();
    }

    public int getContainerWidth() {
        return getWidth();
    }

    public int getContainerHeight() {
        return getHeight();
    }

    private int getContainerSize() {
        if (isHorizontal()) {
            return getContainerWidth();
        }
        return getContainerHeight();
    }

    /* access modifiers changed from: package-private */
    public boolean isLayoutRtl() {
        return isHorizontal() && getLayoutDirection() == 1;
    }

    private float addStart(float value, float amount) {
        return isLayoutRtl() ? value + amount : value - amount;
    }

    private float addEnd(float value, float amount) {
        return isLayoutRtl() ? value - amount : value + amount;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        if (getChildCount() > 0) {
            event.setFromIndex(getPosition(getChildAt(0)));
            event.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    private int getScrollOffsetForPosition(int position, KeylineState keylineState) {
        if (isLayoutRtl()) {
            return (int) (((((float) getContainerSize()) - keylineState.getLastFocalKeyline().loc) - (((float) position) * keylineState.getItemSize())) - (keylineState.getItemSize() / 2.0f));
        }
        return (int) (((((float) position) * keylineState.getItemSize()) - keylineState.getFirstFocalKeyline().loc) + (keylineState.getItemSize() / 2.0f));
    }

    private int getSmallestScrollOffsetToFocalKeyline(int position, KeylineState keylineState) {
        int positionOffsetDistanceFromKeyline;
        int smallestScrollOffset = Integer.MAX_VALUE;
        for (KeylineState.Keyline keyline : keylineState.getFocalKeylines()) {
            float offsetWithKeylines = (((float) position) * keylineState.getItemSize()) + (keylineState.getItemSize() / 2.0f);
            if (isLayoutRtl()) {
                positionOffsetDistanceFromKeyline = (int) ((((float) getContainerSize()) - keyline.loc) - offsetWithKeylines);
            } else {
                positionOffsetDistanceFromKeyline = (int) (offsetWithKeylines - keyline.loc);
            }
            int positionOffsetDistanceFromKeyline2 = positionOffsetDistanceFromKeyline - this.scrollOffset;
            if (Math.abs(smallestScrollOffset) > Math.abs(positionOffsetDistanceFromKeyline2)) {
                smallestScrollOffset = positionOffsetDistanceFromKeyline2;
            }
        }
        return smallestScrollOffset;
    }

    public PointF computeScrollVectorForPosition(int targetPosition) {
        if (this.keylineStateList == null) {
            return null;
        }
        int offset = getOffsetToScrollToPosition(targetPosition, getKeylineStateForPosition(targetPosition));
        if (isHorizontal()) {
            return new PointF((float) offset, 0.0f);
        }
        return new PointF(0.0f, (float) offset);
    }

    /* access modifiers changed from: package-private */
    public int getOffsetToScrollToPosition(int position, KeylineState keylineState) {
        return getScrollOffsetForPosition(position, keylineState) - this.scrollOffset;
    }

    /* access modifiers changed from: package-private */
    public int getOffsetToScrollToPositionForSnap(int position, boolean partialSnap) {
        int targetSnapOffset = getOffsetToScrollToPosition(position, this.keylineStateList.getShiftedState((float) this.scrollOffset, (float) this.minScroll, (float) this.maxScroll, true));
        int positionOffset = targetSnapOffset;
        if (this.keylineStatePositionMap != null) {
            positionOffset = getOffsetToScrollToPosition(position, getKeylineStateForPosition(position));
        }
        if (!partialSnap) {
            return targetSnapOffset;
        }
        if (Math.abs(positionOffset) < Math.abs(targetSnapOffset)) {
            return positionOffset;
        }
        return targetSnapOffset;
    }

    private KeylineState getKeylineStateForPosition(int position) {
        KeylineState keylineState;
        if (this.keylineStatePositionMap == null || (keylineState = this.keylineStatePositionMap.get(Integer.valueOf(MathUtils.clamp(position, 0, Math.max(0, getItemCount() - 1))))) == null) {
            return this.keylineStateList.getDefaultState();
        }
        return keylineState;
    }

    public void scrollToPosition(int position) {
        this.currentEstimatedPosition = position;
        if (this.keylineStateList != null) {
            this.scrollOffset = getScrollOffsetForPosition(position, getKeylineStateForPosition(position));
            this.currentFillStartPosition = MathUtils.clamp(position, 0, Math.max(0, getItemCount() - 1));
            updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
            requestLayout();
        }
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int position) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) {
            public PointF computeScrollVectorForPosition(int targetPosition) {
                return CarouselLayoutManager.this.computeScrollVectorForPosition(targetPosition);
            }

            public int calculateDxToMakeVisible(View view, int snapPreference) {
                if (CarouselLayoutManager.this.keylineStateList == null || !CarouselLayoutManager.this.isHorizontal()) {
                    return 0;
                }
                return CarouselLayoutManager.this.calculateScrollDeltaToMakePositionVisible(CarouselLayoutManager.this.getPosition(view));
            }

            public int calculateDyToMakeVisible(View view, int snapPreference) {
                if (CarouselLayoutManager.this.keylineStateList == null || CarouselLayoutManager.this.isHorizontal()) {
                    return 0;
                }
                return CarouselLayoutManager.this.calculateScrollDeltaToMakePositionVisible(CarouselLayoutManager.this.getPosition(view));
            }
        };
        linearSmoothScroller.setTargetPosition(position);
        startSmoothScroll(linearSmoothScroller);
    }

    /* access modifiers changed from: package-private */
    public int calculateScrollDeltaToMakePositionVisible(int position) {
        return (int) (((float) this.scrollOffset) - ((float) getScrollOffsetForPosition(position, getKeylineStateForPosition(position))));
    }

    public boolean canScrollHorizontally() {
        return isHorizontal();
    }

    public int scrollHorizontallyBy(int dx, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollHorizontally()) {
            return scrollBy(dx, recycler, state);
        }
        return 0;
    }

    public boolean canScrollVertically() {
        return !isHorizontal();
    }

    public int scrollVerticallyBy(int dy, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollVertically()) {
            return scrollBy(dy, recycler, state);
        }
        return 0;
    }

    private static class LayoutDirection {
        private static final int INVALID_LAYOUT = Integer.MIN_VALUE;
        private static final int LAYOUT_END = 1;
        private static final int LAYOUT_START = -1;

        private LayoutDirection() {
        }
    }

    private int convertFocusDirectionToLayoutDirection(int focusDirection) {
        int orientation = getOrientation();
        switch (focusDirection) {
            case 1:
                return -1;
            case 2:
                return 1;
            case 17:
                if (orientation != 0) {
                    return Integer.MIN_VALUE;
                }
                if (isLayoutRtl()) {
                    return 1;
                }
                return -1;
            case 33:
                if (orientation == 1) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT:
                if (orientation != 0) {
                    return Integer.MIN_VALUE;
                }
                if (isLayoutRtl()) {
                    return -1;
                }
                return 1;
            case 130:
                if (orientation == 1) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            default:
                Log.d(TAG, "Unknown focus request:" + focusDirection);
                return Integer.MIN_VALUE;
        }
    }

    public View onFocusSearchFailed(View focused, int focusDirection, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int layoutDir;
        if (getChildCount() == 0 || (layoutDir = convertFocusDirectionToLayoutDirection(focusDirection)) == Integer.MIN_VALUE) {
            return null;
        }
        if (layoutDir == -1) {
            if (getPosition(focused) == 0) {
                return null;
            }
            addViewAtPosition(recycler, getPosition(getChildAt(0)) - 1, 0);
            return getChildClosestToStart();
        } else if (getPosition(focused) == getItemCount() - 1) {
            return null;
        } else {
            addViewAtPosition(recycler, getPosition(getChildAt(getChildCount() - 1)) + 1, -1);
            return getChildClosestToEnd();
        }
    }

    private View getChildClosestToStart() {
        return getChildAt(isLayoutRtl() ? getChildCount() - 1 : 0);
    }

    private View getChildClosestToEnd() {
        return getChildAt(isLayoutRtl() ? 0 : getChildCount() - 1);
    }

    public boolean requestChildRectangleOnScreen(RecyclerView parent, View child, Rect rect, boolean immediate, boolean focusedChildVisible) {
        int delta;
        if (this.keylineStateList == null || (delta = getSmallestScrollOffsetToFocalKeyline(getPosition(child), getKeylineStateForPosition(getPosition(child)))) == 0) {
            return false;
        }
        scrollBy(parent, getSmallestScrollOffsetToFocalKeyline(getPosition(child), this.keylineStateList.getShiftedState((float) (this.scrollOffset + calculateShouldScrollBy(delta, this.scrollOffset, this.minScroll, this.maxScroll)), (float) this.minScroll, (float) this.maxScroll)));
        return true;
    }

    private void scrollBy(RecyclerView recyclerView, int delta) {
        if (isHorizontal()) {
            recyclerView.scrollBy(delta, 0);
        } else {
            recyclerView.scrollBy(0, delta);
        }
    }

    private int scrollBy(int distance, RecyclerView.Recycler recycler, RecyclerView.State state) {
        float firstFocalKeylineLoc;
        if (getChildCount() == 0 || distance == 0) {
            return 0;
        }
        if (this.keylineStateList == null) {
            recalculateKeylineStateList(recycler);
        }
        int scrolledBy = calculateShouldScrollBy(distance, this.scrollOffset, this.minScroll, this.maxScroll);
        this.scrollOffset += scrolledBy;
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        float halfItemSize = this.currentKeylineState.getItemSize() / 2.0f;
        float start = calculateChildStartForFill(getPosition(getChildAt(0)));
        Rect boundsRect = new Rect();
        if (isLayoutRtl()) {
            firstFocalKeylineLoc = this.currentKeylineState.getLastFocalKeyline().locOffset;
        } else {
            firstFocalKeylineLoc = this.currentKeylineState.getFirstFocalKeyline().locOffset;
        }
        float absDistanceToFirstFocal = Float.MAX_VALUE;
        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            float distanceToFirstFocal = Math.abs(firstFocalKeylineLoc - offsetChild(child, start, halfItemSize, boundsRect));
            if (child != null && distanceToFirstFocal < absDistanceToFirstFocal) {
                absDistanceToFirstFocal = distanceToFirstFocal;
                this.currentEstimatedPosition = getPosition(child);
            }
            start = addEnd(start, this.currentKeylineState.getItemSize());
        }
        fill(recycler, state);
        return scrolledBy;
    }

    private float offsetChild(View child, float startOffset, float halfItemSize, Rect boundsRect) {
        float center = addEnd(startOffset, halfItemSize);
        KeylineRange range = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), center, false);
        float offsetCenter = calculateChildOffsetCenterForLocation(child, center, range);
        super.getDecoratedBoundsWithMargins(child, boundsRect);
        updateChildMaskForLocation(child, center, range);
        this.orientationHelper.offsetChild(child, boundsRect, halfItemSize, offsetCenter);
        return offsetCenter;
    }

    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return this.scrollOffset;
    }

    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0 || this.keylineStateList == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (((float) getWidth()) * (this.keylineStateList.getDefaultState().getItemSize() / ((float) computeHorizontalScrollRange(state))));
    }

    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return this.maxScroll - this.minScroll;
    }

    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return this.scrollOffset;
    }

    public int computeVerticalScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0 || this.keylineStateList == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (((float) getHeight()) * (this.keylineStateList.getDefaultState().getItemSize() / ((float) computeVerticalScrollRange(state))));
    }

    public int computeVerticalScrollRange(RecyclerView.State state) {
        return this.maxScroll - this.minScroll;
    }

    public int getOrientation() {
        return this.orientationHelper.orientation;
    }

    public void setOrientation(int orientation) {
        if (orientation == 0 || orientation == 1) {
            assertNotInLayoutOrScroll((String) null);
            if (this.orientationHelper == null || orientation != this.orientationHelper.orientation) {
                this.orientationHelper = CarouselOrientationHelper.createOrientationHelper(this, orientation);
                refreshKeylineState();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + orientation);
    }

    public void onItemsAdded(RecyclerView recyclerView, int positionStart, int itemCount) {
        super.onItemsAdded(recyclerView, positionStart, itemCount);
        updateItemCount();
    }

    public void onItemsRemoved(RecyclerView recyclerView, int positionStart, int itemCount) {
        super.onItemsRemoved(recyclerView, positionStart, itemCount);
        updateItemCount();
    }

    private void updateItemCount() {
        int newItemCount = getItemCount();
        if (newItemCount != this.lastItemCount && this.keylineStateList != null) {
            if (this.carouselStrategy.shouldRefreshKeylineState(this, this.lastItemCount)) {
                refreshKeylineState();
            }
            this.lastItemCount = newItemCount;
        }
    }

    public void setDebuggingEnabled(RecyclerView recyclerView, boolean enabled) {
        this.isDebuggingEnabled = enabled;
        recyclerView.removeItemDecoration(this.debugItemDecoration);
        if (enabled) {
            recyclerView.addItemDecoration(this.debugItemDecoration);
        }
        recyclerView.invalidateItemDecorations();
    }

    private static class KeylineRange {
        final KeylineState.Keyline leftOrTop;
        final KeylineState.Keyline rightOrBottom;

        KeylineRange(KeylineState.Keyline leftOrTop2, KeylineState.Keyline rightOrBottom2) {
            Preconditions.checkArgument(leftOrTop2.loc <= rightOrBottom2.loc);
            this.leftOrTop = leftOrTop2;
            this.rightOrBottom = rightOrBottom2;
        }
    }

    private static class DebugItemDecoration extends RecyclerView.ItemDecoration {
        private List<KeylineState.Keyline> keylines = Collections.unmodifiableList(new ArrayList());
        private final Paint linePaint = new Paint();

        DebugItemDecoration() {
            this.linePaint.setStrokeWidth(5.0f);
            this.linePaint.setColor(-65281);
        }

        /* access modifiers changed from: package-private */
        public void setKeylines(List<KeylineState.Keyline> keylines2) {
            this.keylines = Collections.unmodifiableList(keylines2);
        }

        public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
            super.onDrawOver(c, parent, state);
            this.linePaint.setStrokeWidth(parent.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (KeylineState.Keyline keyline : this.keylines) {
                this.linePaint.setColor(ColorUtils.blendARGB(-65281, -16776961, keyline.mask));
                if (((CarouselLayoutManager) parent.getLayoutManager()).isHorizontal()) {
                    c.drawLine(keyline.locOffset, (float) ((CarouselLayoutManager) parent.getLayoutManager()).getParentTop(), keyline.locOffset, (float) ((CarouselLayoutManager) parent.getLayoutManager()).getParentBottom(), this.linePaint);
                } else {
                    c.drawLine((float) ((CarouselLayoutManager) parent.getLayoutManager()).getParentLeft(), keyline.locOffset, (float) ((CarouselLayoutManager) parent.getLayoutManager()).getParentRight(), keyline.locOffset, this.linePaint);
                }
            }
        }
    }
}
