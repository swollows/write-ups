package androidx.slidingpanelayout.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import androidx.slidingpanelayout.widget.FoldingFeatureObserver;
import androidx.transition.ChangeBounds;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SlidingPaneLayout extends ViewGroup implements Openable {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.slidingpanelayout.widget.SlidingPaneLayout";
    public static final int LOCK_MODE_LOCKED = 3;
    public static final int LOCK_MODE_LOCKED_CLOSED = 2;
    public static final int LOCK_MODE_LOCKED_OPEN = 1;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final String TAG = "SlidingPaneLayout";
    private static boolean sEdgeSizeUsingSystemGestureInsets = (Build.VERSION.SDK_INT >= 29);
    private boolean mCanSlide;
    private int mCoveredFadeColor;
    private boolean mDisplayListReflectionLoaded;
    final ViewDragHelper mDragHelper;
    private boolean mFirstLayout;
    FoldingFeature mFoldingFeature;
    private FoldingFeatureObserver mFoldingFeatureObserver;
    private Method mGetDisplayList;
    private float mInitialMotionX;
    private float mInitialMotionY;
    boolean mIsUnableToDrag;
    private int mLockMode;
    private FoldingFeatureObserver.OnFoldingFeatureChangeListener mOnFoldingFeatureChangeListener;
    private PanelSlideListener mPanelSlideListener;
    private final List<PanelSlideListener> mPanelSlideListeners;
    private int mParallaxBy;
    private float mParallaxOffset;
    final ArrayList<DisableLayerRunnable> mPostedRunnables;
    boolean mPreservedOpenState;
    private Field mRecreateDisplayList;
    private Drawable mShadowDrawableLeft;
    private Drawable mShadowDrawableRight;
    float mSlideOffset;
    int mSlideRange;
    View mSlideableView;
    private int mSliderFadeColor;
    private final Rect mTmpRect;

    public interface PanelSlideListener {
        void onPanelClosed(View view);

        void onPanelOpened(View view);

        void onPanelSlide(View view, float f);
    }

    public final void setLockMode(int lockMode) {
        this.mLockMode = lockMode;
    }

    public final int getLockMode() {
        return this.mLockMode;
    }

    public static class SimplePanelSlideListener implements PanelSlideListener {
        public void onPanelSlide(View panel, float slideOffset) {
        }

        public void onPanelOpened(View panel) {
        }

        public void onPanelClosed(View panel) {
        }
    }

    public SlidingPaneLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public SlidingPaneLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.mSliderFadeColor = 0;
        this.mSlideOffset = 1.0f;
        this.mPanelSlideListeners = new CopyOnWriteArrayList();
        this.mFirstLayout = true;
        this.mTmpRect = new Rect();
        this.mPostedRunnables = new ArrayList<>();
        this.mOnFoldingFeatureChangeListener = new FoldingFeatureObserver.OnFoldingFeatureChangeListener() {
            public void onFoldingFeatureChange(FoldingFeature foldingFeature) {
                SlidingPaneLayout.this.mFoldingFeature = foldingFeature;
                Transition changeBounds = new ChangeBounds();
                changeBounds.setDuration(300);
                changeBounds.setInterpolator(PathInterpolatorCompat.create(0.2f, 0.0f, 0.0f, 1.0f));
                TransitionManager.beginDelayedTransition(SlidingPaneLayout.this, changeBounds);
                SlidingPaneLayout.this.requestLayout();
            }
        };
        float density = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate());
        ViewCompat.setImportantForAccessibility(this, 1);
        this.mDragHelper = ViewDragHelper.create(this, 0.5f, new DragHelperCallback());
        this.mDragHelper.setMinVelocity(400.0f * density);
        setFoldingFeatureObserver(new FoldingFeatureObserver(WindowInfoTracker.getOrCreate(context), ContextCompat.getMainExecutor(context)));
    }

    private void setFoldingFeatureObserver(FoldingFeatureObserver foldingFeatureObserver) {
        this.mFoldingFeatureObserver = foldingFeatureObserver;
        this.mFoldingFeatureObserver.setOnFoldingFeatureChangeListener(this.mOnFoldingFeatureChangeListener);
    }

    public void setParallaxDistance(int parallaxBy) {
        this.mParallaxBy = parallaxBy;
        requestLayout();
    }

    public int getParallaxDistance() {
        return this.mParallaxBy;
    }

    @Deprecated
    public void setSliderFadeColor(int color) {
        this.mSliderFadeColor = color;
    }

    @Deprecated
    public int getSliderFadeColor() {
        return this.mSliderFadeColor;
    }

    @Deprecated
    public void setCoveredFadeColor(int color) {
        this.mCoveredFadeColor = color;
    }

    @Deprecated
    public int getCoveredFadeColor() {
        return this.mCoveredFadeColor;
    }

    @Deprecated
    public void setPanelSlideListener(PanelSlideListener listener) {
        if (this.mPanelSlideListener != null) {
            removePanelSlideListener(this.mPanelSlideListener);
        }
        if (listener != null) {
            addPanelSlideListener(listener);
        }
        this.mPanelSlideListener = listener;
    }

    public void addPanelSlideListener(PanelSlideListener listener) {
        this.mPanelSlideListeners.add(listener);
    }

    public void removePanelSlideListener(PanelSlideListener listener) {
        this.mPanelSlideListeners.remove(listener);
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnPanelSlide(View panel) {
        for (PanelSlideListener listener : this.mPanelSlideListeners) {
            listener.onPanelSlide(panel, this.mSlideOffset);
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnPanelOpened(View panel) {
        for (PanelSlideListener listener : this.mPanelSlideListeners) {
            listener.onPanelOpened(panel);
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnPanelClosed(View panel) {
        for (PanelSlideListener listener : this.mPanelSlideListeners) {
            listener.onPanelClosed(panel);
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: package-private */
    public void updateObscuredViewsVisibility(View panel) {
        int bottom;
        int top;
        int right;
        int left;
        boolean isLayoutRtl;
        int clampedChildRight;
        View view = panel;
        boolean isLayoutRtl2 = isLayoutRtlSupport();
        int startBound = isLayoutRtl2 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int endBound = isLayoutRtl2 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int topBound = getPaddingTop();
        int bottomBound = getHeight() - getPaddingBottom();
        if (view == null || !viewIsOpaque(panel)) {
            left = 0;
            bottom = 0;
            top = 0;
            right = 0;
        } else {
            left = panel.getLeft();
            right = panel.getRight();
            top = panel.getTop();
            bottom = panel.getBottom();
        }
        int i = 0;
        int childCount = getChildCount();
        while (i < childCount) {
            View child = getChildAt(i);
            if (child == view) {
                boolean z = isLayoutRtl2;
                return;
            }
            if (child.getVisibility() == 8) {
                isLayoutRtl = isLayoutRtl2;
            } else {
                int clampedChildLeft = Math.max(isLayoutRtl2 ? endBound : startBound, child.getLeft());
                int clampedChildTop = Math.max(topBound, child.getTop());
                isLayoutRtl = isLayoutRtl2;
                int clampedChildRight2 = Math.min(isLayoutRtl2 ? startBound : endBound, child.getRight());
                int clampedChildBottom = Math.min(bottomBound, child.getBottom());
                if (clampedChildLeft < left || clampedChildTop < top || clampedChildRight2 > right || clampedChildBottom > bottom) {
                    int i2 = clampedChildRight2;
                    clampedChildRight = 0;
                } else {
                    int i3 = clampedChildRight2;
                    clampedChildRight = 4;
                }
                child.setVisibility(clampedChildRight);
            }
            i++;
            view = panel;
            isLayoutRtl2 = isLayoutRtl;
        }
        boolean z2 = isLayoutRtl2;
    }

    /* access modifiers changed from: package-private */
    public void setAllChildrenVisible() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            if (child.getVisibility() == 4) {
                child.setVisibility(0);
            }
        }
    }

    private static boolean viewIsOpaque(View v) {
        if (v.isOpaque()) {
            return true;
        }
        return false;
    }

    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (getChildCount() == 1) {
            super.addView(new TouchBlocker(child), index, params);
        } else {
            super.addView(child, index, params);
        }
    }

    public void removeView(View view) {
        if (view.getParent() instanceof TouchBlocker) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        Activity activity;
        super.onAttachedToWindow();
        this.mFirstLayout = true;
        if (this.mFoldingFeatureObserver != null && (activity = getActivityOrNull(getContext())) != null) {
            this.mFoldingFeatureObserver.registerLayoutStateChangeCallback(activity);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
        if (this.mFoldingFeatureObserver != null) {
            this.mFoldingFeatureObserver.unregisterLayoutStateChangeCallback();
        }
        int count = this.mPostedRunnables.size();
        for (int i = 0; i < count; i++) {
            this.mPostedRunnables.get(i).run();
        }
        this.mPostedRunnables.clear();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int heightMode;
        ArrayList<Rect> splitViews;
        int i;
        int newWidth;
        int childWidthSpec;
        int widthMode;
        int childWidthSpec2;
        int i2 = heightMeasureSpec;
        int widthMode2 = View.MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int heightMode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
        int layoutHeight = 0;
        int maxLayoutHeight = 0;
        switch (heightMode2) {
            case Integer.MIN_VALUE:
                maxLayoutHeight = (heightSize - getPaddingTop()) - getPaddingBottom();
                break;
            case BasicMeasure.EXACTLY:
                int paddingTop = (heightSize - getPaddingTop()) - getPaddingBottom();
                maxLayoutHeight = paddingTop;
                layoutHeight = paddingTop;
                break;
        }
        float weightSum = 0.0f;
        boolean canSlide = false;
        int widthAvailable = Math.max((widthSize - getPaddingLeft()) - getPaddingRight(), 0);
        int widthRemaining = widthAvailable;
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e(TAG, "onMeasure: More than two child views are not supported.");
        }
        this.mSlideableView = null;
        int i3 = 0;
        while (i3 < childCount) {
            View child = getChildAt(i3);
            LayoutParams lp = (LayoutParams) child.getLayoutParams();
            int heightSize2 = heightSize;
            int widthSize2 = widthSize;
            if (child.getVisibility() == 8) {
                lp.dimWhenOffset = false;
                widthMode = widthMode2;
            } else {
                if (lp.weight > 0.0f) {
                    weightSum += lp.weight;
                    if (lp.width == 0) {
                        widthMode = widthMode2;
                    }
                }
                int horizontalMargin = lp.leftMargin + lp.rightMargin;
                int i4 = horizontalMargin;
                int childWidthSize = Math.max(widthAvailable - horizontalMargin, 0);
                float weightSum2 = weightSum;
                if (lp.width == -2) {
                    childWidthSpec2 = View.MeasureSpec.makeMeasureSpec(childWidthSize, widthMode2 == 0 ? widthMode2 : Integer.MIN_VALUE);
                } else if (lp.width == -1) {
                    childWidthSpec2 = View.MeasureSpec.makeMeasureSpec(childWidthSize, widthMode2);
                } else {
                    childWidthSpec2 = View.MeasureSpec.makeMeasureSpec(lp.width, BasicMeasure.EXACTLY);
                }
                widthMode = widthMode2;
                int childHeightSpec = getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), lp.height);
                child.measure(childWidthSpec2, childHeightSpec);
                int childWidth = child.getMeasuredWidth();
                int i5 = childHeightSpec;
                int childHeight = child.getMeasuredHeight();
                if (childHeight > layoutHeight) {
                    int i6 = childWidthSpec2;
                    if (heightMode2 == Integer.MIN_VALUE) {
                        layoutHeight = Math.min(childHeight, maxLayoutHeight);
                    } else if (heightMode2 == 0) {
                        layoutHeight = childHeight;
                    }
                }
                widthRemaining -= childWidth;
                if (i3 == 0) {
                    weightSum = weightSum2;
                } else {
                    boolean z = widthRemaining < 0;
                    lp.slideable = z;
                    boolean canSlide2 = z | canSlide;
                    if (lp.slideable) {
                        this.mSlideableView = child;
                    }
                    canSlide = canSlide2;
                    weightSum = weightSum2;
                }
            }
            i3++;
            heightSize = heightSize2;
            widthSize = widthSize2;
            widthMode2 = widthMode;
        }
        int widthSize3 = widthSize;
        int i7 = heightSize;
        if (canSlide || weightSum > 0.0f) {
            int i8 = 0;
            while (i8 < childCount) {
                View child2 = getChildAt(i8);
                if (child2.getVisibility() != 8) {
                    LayoutParams lp2 = (LayoutParams) child2.getLayoutParams();
                    boolean skippedFirstPass = lp2.width == 0 && lp2.weight > 0.0f;
                    int measuredWidth = skippedFirstPass ? 0 : child2.getMeasuredWidth();
                    int newWidth2 = measuredWidth;
                    if (canSlide) {
                        boolean z2 = skippedFirstPass;
                        int i9 = newWidth2;
                        int horizontalMargin2 = lp2.leftMargin + lp2.rightMargin;
                        newWidth = widthAvailable - horizontalMargin2;
                        int i10 = horizontalMargin2;
                        LayoutParams layoutParams = lp2;
                        childWidthSpec = View.MeasureSpec.makeMeasureSpec(newWidth, BasicMeasure.EXACTLY);
                    } else {
                        int newWidth3 = newWidth2;
                        if (lp2.weight > 0.0f) {
                            LayoutParams layoutParams2 = lp2;
                            int addedWidth = (int) ((lp2.weight * ((float) Math.max(0, widthRemaining))) / weightSum);
                            int newWidth4 = measuredWidth + addedWidth;
                            int i11 = addedWidth;
                            newWidth = newWidth4;
                            childWidthSpec = View.MeasureSpec.makeMeasureSpec(newWidth4, BasicMeasure.EXACTLY);
                        } else {
                            childWidthSpec = 0;
                            newWidth = newWidth3;
                        }
                    }
                    int childHeightSpec2 = measureChildHeight(child2, i2, getPaddingTop() + getPaddingBottom());
                    if (measuredWidth != newWidth) {
                        child2.measure(childWidthSpec, childHeightSpec2);
                        int childHeight2 = child2.getMeasuredHeight();
                        if (childHeight2 > layoutHeight) {
                            View view = child2;
                            if (heightMode2 == Integer.MIN_VALUE) {
                                layoutHeight = Math.min(childHeight2, maxLayoutHeight);
                            } else if (heightMode2 == 0) {
                                layoutHeight = childHeight2;
                            }
                        }
                    }
                }
                i8++;
                i2 = heightMeasureSpec;
            }
        }
        ArrayList<Rect> splitViews2 = splitViewPositions();
        if (splitViews2 == null || canSlide) {
            int i12 = heightMode2;
        } else {
            int i13 = 0;
            while (i13 < childCount) {
                View child3 = getChildAt(i13);
                if (child3.getVisibility() == 8) {
                    splitViews = splitViews2;
                    heightMode = heightMode2;
                } else {
                    Rect splitView = splitViews2.get(i13);
                    LayoutParams lp3 = (LayoutParams) child3.getLayoutParams();
                    int horizontalMargin3 = lp3.leftMargin + lp3.rightMargin;
                    splitViews = splitViews2;
                    int childHeightSpec3 = View.MeasureSpec.makeMeasureSpec(child3.getMeasuredHeight(), BasicMeasure.EXACTLY);
                    heightMode = heightMode2;
                    int childWidthSpec3 = View.MeasureSpec.makeMeasureSpec(splitView.width(), Integer.MIN_VALUE);
                    child3.measure(childWidthSpec3, childHeightSpec3);
                    int i14 = childWidthSpec3;
                    if ((child3.getMeasuredWidthAndState() & 16777216) == 1) {
                        i = BasicMeasure.EXACTLY;
                    } else if (getMinimumWidth(child3) == 0 || splitView.width() >= getMinimumWidth(child3)) {
                        child3.measure(View.MeasureSpec.makeMeasureSpec(splitView.width(), BasicMeasure.EXACTLY), childHeightSpec3);
                    } else {
                        i = BasicMeasure.EXACTLY;
                    }
                    child3.measure(View.MeasureSpec.makeMeasureSpec(widthAvailable - horizontalMargin3, i), childHeightSpec3);
                    if (i13 != 0) {
                        lp3.slideable = true;
                        canSlide = true;
                        this.mSlideableView = child3;
                        i13++;
                        splitViews2 = splitViews;
                        heightMode2 = heightMode;
                    }
                }
                i13++;
                splitViews2 = splitViews;
                heightMode2 = heightMode;
            }
            int i15 = heightMode2;
        }
        setMeasuredDimension(widthSize3, getPaddingTop() + layoutHeight + getPaddingBottom());
        this.mCanSlide = canSlide;
        if (this.mDragHelper.getViewDragState() != 0 && !canSlide) {
            this.mDragHelper.abort();
        }
    }

    private static int getMinimumWidth(View child) {
        if (child instanceof TouchBlocker) {
            return ViewCompat.getMinimumWidth(((TouchBlocker) child).getChildAt(0));
        }
        return ViewCompat.getMinimumWidth(child);
    }

    private static int measureChildHeight(View child, int spec, int padding) {
        LayoutParams lp = (LayoutParams) child.getLayoutParams();
        if (lp.width == 0 && lp.weight > 0.0f) {
            return getChildMeasureSpec(spec, padding, lp.height);
        }
        return View.MeasureSpec.makeMeasureSpec(child.getMeasuredHeight(), BasicMeasure.EXACTLY);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        int childCount;
        int width;
        boolean isLayoutRtl;
        int paddingStart;
        int childLeft;
        int childRight;
        int paddingStart2;
        boolean isLayoutRtl2 = isLayoutRtlSupport();
        int width2 = r - l;
        int paddingStart3 = isLayoutRtl2 ? getPaddingRight() : getPaddingLeft();
        int paddingEnd = isLayoutRtl2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount2 = getChildCount();
        int xStart = paddingStart3;
        int nextXStart = xStart;
        if (this.mFirstLayout) {
            this.mSlideOffset = (!this.mCanSlide || !this.mPreservedOpenState) ? 1.0f : 0.0f;
        }
        int i = 0;
        while (i < childCount2) {
            View child = getChildAt(i);
            if (child.getVisibility() == 8) {
                isLayoutRtl = isLayoutRtl2;
                width = width2;
                paddingStart = paddingStart3;
                childCount = childCount2;
            } else {
                LayoutParams lp = (LayoutParams) child.getLayoutParams();
                int childWidth = child.getMeasuredWidth();
                int offset = 0;
                if (lp.slideable) {
                    int margin = lp.leftMargin + lp.rightMargin;
                    int range = (Math.min(nextXStart, width2 - paddingEnd) - xStart) - margin;
                    this.mSlideRange = range;
                    if (isLayoutRtl2) {
                        paddingStart = paddingStart3;
                        paddingStart2 = lp.rightMargin;
                    } else {
                        paddingStart = paddingStart3;
                        paddingStart2 = lp.leftMargin;
                    }
                    childCount = childCount2;
                    int i2 = margin;
                    lp.dimWhenOffset = ((xStart + paddingStart2) + range) + (childWidth / 2) > width2 - paddingEnd;
                    int pos = (int) (((float) range) * this.mSlideOffset);
                    xStart += pos + paddingStart2;
                    int i3 = paddingStart2;
                    this.mSlideOffset = ((float) pos) / ((float) this.mSlideRange);
                } else {
                    paddingStart = paddingStart3;
                    childCount = childCount2;
                    if (this.mCanSlide == 0 || this.mParallaxBy == 0) {
                        xStart = nextXStart;
                    } else {
                        offset = (int) ((1.0f - this.mSlideOffset) * ((float) this.mParallaxBy));
                        xStart = nextXStart;
                    }
                }
                if (isLayoutRtl2) {
                    childRight = (width2 - xStart) + offset;
                    childLeft = childRight - childWidth;
                } else {
                    childLeft = xStart - offset;
                    childRight = childLeft + childWidth;
                }
                child.layout(childLeft, paddingTop, childRight, paddingTop + child.getMeasuredHeight());
                int nextXOffset = 0;
                isLayoutRtl = isLayoutRtl2;
                if (this.mFoldingFeature != null) {
                    width = width2;
                    if (this.mFoldingFeature.getOrientation() == FoldingFeature.Orientation.VERTICAL && this.mFoldingFeature.isSeparating()) {
                        nextXOffset = this.mFoldingFeature.getBounds().width();
                    }
                } else {
                    width = width2;
                }
                nextXStart += child.getWidth() + Math.abs(nextXOffset);
            }
            i++;
            paddingStart3 = paddingStart;
            isLayoutRtl2 = isLayoutRtl;
            width2 = width;
            childCount2 = childCount;
        }
        int i4 = width2;
        int i5 = paddingStart3;
        int i6 = childCount2;
        if (this.mFirstLayout) {
            if (this.mCanSlide && this.mParallaxBy != 0) {
                parallaxOtherViews(this.mSlideOffset);
            }
            updateObscuredViewsVisibility(this.mSlideableView);
        }
        this.mFirstLayout = false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (w != oldw) {
            this.mFirstLayout = true;
        }
    }

    public void requestChildFocus(View child, View focused) {
        super.requestChildFocus(child, focused);
        if (!isInTouchMode() && !this.mCanSlide) {
            this.mPreservedOpenState = child == this.mSlideableView;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {
        View secondChild;
        int action = ev.getActionMasked();
        if (!this.mCanSlide && action == 0 && getChildCount() > 1 && (secondChild = getChildAt(1)) != null) {
            this.mPreservedOpenState = this.mDragHelper.isViewUnder(secondChild, (int) ev.getX(), (int) ev.getY());
        }
        if (!this.mCanSlide || (this.mIsUnableToDrag && action != 0)) {
            this.mDragHelper.cancel();
            return super.onInterceptTouchEvent(ev);
        } else if (action == 3 || action == 1) {
            this.mDragHelper.cancel();
            return false;
        } else {
            boolean interceptTap = false;
            switch (action) {
                case 0:
                    this.mIsUnableToDrag = false;
                    float x = ev.getX();
                    float y = ev.getY();
                    this.mInitialMotionX = x;
                    this.mInitialMotionY = y;
                    if (this.mDragHelper.isViewUnder(this.mSlideableView, (int) x, (int) y) && isDimmed(this.mSlideableView)) {
                        interceptTap = true;
                        break;
                    }
                case 2:
                    float x2 = ev.getX();
                    float y2 = ev.getY();
                    float adx = Math.abs(x2 - this.mInitialMotionX);
                    float ady = Math.abs(y2 - this.mInitialMotionY);
                    if (adx > ((float) this.mDragHelper.getTouchSlop()) && ady > adx) {
                        this.mDragHelper.cancel();
                        this.mIsUnableToDrag = true;
                        return false;
                    }
            }
            if (this.mDragHelper.shouldInterceptTouchEvent(ev) || interceptTap) {
                return true;
            }
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent ev) {
        if (!this.mCanSlide) {
            return super.onTouchEvent(ev);
        }
        this.mDragHelper.processTouchEvent(ev);
        switch (ev.getActionMasked()) {
            case 0:
                float x = ev.getX();
                float y = ev.getY();
                this.mInitialMotionX = x;
                this.mInitialMotionY = y;
                break;
            case 1:
                if (isDimmed(this.mSlideableView)) {
                    float x2 = ev.getX();
                    float y2 = ev.getY();
                    float dx = x2 - this.mInitialMotionX;
                    float dy = y2 - this.mInitialMotionY;
                    int slop = this.mDragHelper.getTouchSlop();
                    if ((dx * dx) + (dy * dy) < ((float) (slop * slop)) && this.mDragHelper.isViewUnder(this.mSlideableView, (int) x2, (int) y2)) {
                        closePane(0);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    private boolean closePane(int initialVelocity) {
        if (!this.mCanSlide) {
            this.mPreservedOpenState = false;
        }
        if (!this.mFirstLayout && !smoothSlideTo(1.0f, initialVelocity)) {
            return false;
        }
        this.mPreservedOpenState = false;
        return true;
    }

    private boolean openPane(int initialVelocity) {
        if (!this.mCanSlide) {
            this.mPreservedOpenState = true;
        }
        if (!this.mFirstLayout && !smoothSlideTo(0.0f, initialVelocity)) {
            return false;
        }
        this.mPreservedOpenState = true;
        return true;
    }

    @Deprecated
    public void smoothSlideOpen() {
        openPane();
    }

    public void open() {
        openPane();
    }

    public boolean openPane() {
        return openPane(0);
    }

    @Deprecated
    public void smoothSlideClosed() {
        closePane();
    }

    public void close() {
        closePane();
    }

    public boolean closePane() {
        return closePane(0);
    }

    public boolean isOpen() {
        return !this.mCanSlide || this.mSlideOffset == 0.0f;
    }

    @Deprecated
    public boolean canSlide() {
        return this.mCanSlide;
    }

    public boolean isSlideable() {
        return this.mCanSlide;
    }

    /* access modifiers changed from: package-private */
    public void onPanelDragged(int newLeft) {
        if (this.mSlideableView == null) {
            this.mSlideOffset = 0.0f;
            return;
        }
        boolean isLayoutRtl = isLayoutRtlSupport();
        LayoutParams lp = (LayoutParams) this.mSlideableView.getLayoutParams();
        this.mSlideOffset = ((float) ((isLayoutRtl ? (getWidth() - newLeft) - this.mSlideableView.getWidth() : newLeft) - ((isLayoutRtl ? getPaddingRight() : getPaddingLeft()) + (isLayoutRtl ? lp.rightMargin : lp.leftMargin)))) / ((float) this.mSlideRange);
        if (this.mParallaxBy != 0) {
            parallaxOtherViews(this.mSlideOffset);
        }
        dispatchOnPanelSlide(this.mSlideableView);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        if (isOpen() ^ isLayoutRtlSupport()) {
            this.mDragHelper.setEdgeTrackingEnabled(1);
            Insets gestureInsets = getSystemGestureInsets();
            if (gestureInsets != null) {
                this.mDragHelper.setEdgeSize(Math.max(this.mDragHelper.getDefaultEdgeSize(), gestureInsets.left));
            }
        } else {
            this.mDragHelper.setEdgeTrackingEnabled(2);
            Insets gestureInsets2 = getSystemGestureInsets();
            if (gestureInsets2 != null) {
                this.mDragHelper.setEdgeSize(Math.max(this.mDragHelper.getDefaultEdgeSize(), gestureInsets2.right));
            }
        }
        LayoutParams lp = (LayoutParams) child.getLayoutParams();
        int save = canvas.save();
        if (this.mCanSlide && !lp.slideable && this.mSlideableView != null) {
            canvas.getClipBounds(this.mTmpRect);
            if (isLayoutRtlSupport()) {
                this.mTmpRect.left = Math.max(this.mTmpRect.left, this.mSlideableView.getRight());
            } else {
                this.mTmpRect.right = Math.min(this.mTmpRect.right, this.mSlideableView.getLeft());
            }
            canvas.clipRect(this.mTmpRect);
        }
        boolean result = super.drawChild(canvas, child, drawingTime);
        canvas.restoreToCount(save);
        return result;
    }

    private Insets getSystemGestureInsets() {
        WindowInsetsCompat rootInsetsCompat;
        if (!sEdgeSizeUsingSystemGestureInsets || (rootInsetsCompat = ViewCompat.getRootWindowInsets(this)) == null) {
            return null;
        }
        return rootInsetsCompat.getSystemGestureInsets();
    }

    /* access modifiers changed from: package-private */
    public void invalidateChildRegion(View v) {
        ViewCompat.setLayerPaint(v, ((LayoutParams) v.getLayoutParams()).dimPaint);
    }

    /* access modifiers changed from: package-private */
    public boolean smoothSlideTo(float slideOffset, int velocity) {
        int startBound;
        if (!this.mCanSlide) {
            return false;
        }
        boolean isLayoutRtl = isLayoutRtlSupport();
        LayoutParams lp = (LayoutParams) this.mSlideableView.getLayoutParams();
        if (isLayoutRtl) {
            startBound = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + lp.rightMargin)) + (((float) this.mSlideRange) * slideOffset)) + ((float) this.mSlideableView.getWidth())));
        } else {
            startBound = (int) (((float) (getPaddingLeft() + lp.leftMargin)) + (((float) this.mSlideRange) * slideOffset));
        }
        if (!this.mDragHelper.smoothSlideViewTo(this.mSlideableView, startBound, this.mSlideableView.getTop())) {
            return false;
        }
        setAllChildrenVisible();
        ViewCompat.postInvalidateOnAnimation(this);
        return true;
    }

    public void computeScroll() {
        if (!this.mDragHelper.continueSettling(true)) {
            return;
        }
        if (!this.mCanSlide) {
            this.mDragHelper.abort();
        } else {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Deprecated
    public void setShadowDrawable(Drawable d) {
        setShadowDrawableLeft(d);
    }

    public void setShadowDrawableLeft(Drawable d) {
        this.mShadowDrawableLeft = d;
    }

    public void setShadowDrawableRight(Drawable d) {
        this.mShadowDrawableRight = d;
    }

    @Deprecated
    public void setShadowResource(int resId) {
        setShadowDrawableLeft(getResources().getDrawable(resId));
    }

    public void setShadowResourceLeft(int resId) {
        setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), resId));
    }

    public void setShadowResourceRight(int resId) {
        setShadowDrawableRight(ContextCompat.getDrawable(getContext(), resId));
    }

    public void draw(Canvas c) {
        Drawable shadowDrawable;
        int right;
        int left;
        super.draw(c);
        if (isLayoutRtlSupport()) {
            shadowDrawable = this.mShadowDrawableRight;
        } else {
            shadowDrawable = this.mShadowDrawableLeft;
        }
        View shadowView = getChildCount() > 1 ? getChildAt(1) : null;
        if (shadowView != null && shadowDrawable != null) {
            int top = shadowView.getTop();
            int bottom = shadowView.getBottom();
            int shadowWidth = shadowDrawable.getIntrinsicWidth();
            if (isLayoutRtlSupport()) {
                left = shadowView.getRight();
                right = left + shadowWidth;
            } else {
                right = shadowView.getLeft();
                left = right - shadowWidth;
            }
            shadowDrawable.setBounds(left, top, right, bottom);
            shadowDrawable.draw(c);
        }
    }

    private void parallaxOtherViews(float slideOffset) {
        boolean isLayoutRtl = isLayoutRtlSupport();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View v = getChildAt(i);
            if (v != this.mSlideableView) {
                this.mParallaxOffset = slideOffset;
                int dx = ((int) ((1.0f - this.mParallaxOffset) * ((float) this.mParallaxBy))) - ((int) ((1.0f - slideOffset) * ((float) this.mParallaxBy)));
                v.offsetLeftAndRight(isLayoutRtl ? -dx : dx);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean canScroll(View v, boolean checkV, int dx, int x, int y) {
        View view = v;
        if (view instanceof ViewGroup) {
            ViewGroup group = (ViewGroup) view;
            int scrollX = v.getScrollX();
            int scrollY = v.getScrollY();
            for (int i = group.getChildCount() - 1; i >= 0; i--) {
                View child = group.getChildAt(i);
                if (x + scrollX >= child.getLeft() && x + scrollX < child.getRight() && y + scrollY >= child.getTop() && y + scrollY < child.getBottom()) {
                    if (canScroll(child, true, dx, (x + scrollX) - child.getLeft(), (y + scrollY) - child.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (checkV) {
            if (v.canScrollHorizontally(isLayoutRtlSupport() ? dx : -dx)) {
                return true;
            }
        } else {
            int i2 = dx;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean isDimmed(View child) {
        if (child == null) {
            return false;
        }
        LayoutParams lp = (LayoutParams) child.getLayoutParams();
        if (!this.mCanSlide || !lp.dimWhenOffset || this.mSlideOffset <= 0.0f) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        if (p instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) p);
        }
        return new LayoutParams(p);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return (p instanceof LayoutParams) && super.checkLayoutParams(p);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LayoutParams(getContext(), attrs);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState ss = new SavedState(super.onSaveInstanceState());
        ss.isOpen = isSlideable() ? isOpen() : this.mPreservedOpenState;
        ss.mLockMode = this.mLockMode;
        return ss;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState ss = (SavedState) state;
        super.onRestoreInstanceState(ss.getSuperState());
        if (ss.isOpen) {
            openPane();
        } else {
            closePane();
        }
        this.mPreservedOpenState = ss.isOpen;
        setLockMode(ss.mLockMode);
    }

    private class DragHelperCallback extends ViewDragHelper.Callback {
        DragHelperCallback() {
        }

        public boolean tryCaptureView(View child, int pointerId) {
            if (!isDraggable()) {
                return false;
            }
            return ((LayoutParams) child.getLayoutParams()).slideable;
        }

        public void onViewDragStateChanged(int state) {
            if (SlidingPaneLayout.this.mDragHelper.getViewDragState() != 0) {
                return;
            }
            if (SlidingPaneLayout.this.mSlideOffset == 1.0f) {
                SlidingPaneLayout.this.updateObscuredViewsVisibility(SlidingPaneLayout.this.mSlideableView);
                SlidingPaneLayout.this.dispatchOnPanelClosed(SlidingPaneLayout.this.mSlideableView);
                SlidingPaneLayout.this.mPreservedOpenState = false;
                return;
            }
            SlidingPaneLayout.this.dispatchOnPanelOpened(SlidingPaneLayout.this.mSlideableView);
            SlidingPaneLayout.this.mPreservedOpenState = true;
        }

        public void onViewCaptured(View capturedChild, int activePointerId) {
            SlidingPaneLayout.this.setAllChildrenVisible();
        }

        public void onViewPositionChanged(View changedView, int left, int top, int dx, int dy) {
            SlidingPaneLayout.this.onPanelDragged(left);
            SlidingPaneLayout.this.invalidate();
        }

        public void onViewReleased(View releasedChild, float xvel, float yvel) {
            int left;
            LayoutParams lp = (LayoutParams) releasedChild.getLayoutParams();
            if (SlidingPaneLayout.this.isLayoutRtlSupport()) {
                int startToRight = SlidingPaneLayout.this.getPaddingRight() + lp.rightMargin;
                if (xvel < 0.0f || (xvel == 0.0f && SlidingPaneLayout.this.mSlideOffset > 0.5f)) {
                    startToRight += SlidingPaneLayout.this.mSlideRange;
                }
                left = (SlidingPaneLayout.this.getWidth() - startToRight) - SlidingPaneLayout.this.mSlideableView.getWidth();
            } else {
                int left2 = SlidingPaneLayout.this.getPaddingLeft() + lp.leftMargin;
                if (xvel > 0.0f || (xvel == 0.0f && SlidingPaneLayout.this.mSlideOffset > 0.5f)) {
                    left = left2 + SlidingPaneLayout.this.mSlideRange;
                } else {
                    left = left2;
                }
            }
            SlidingPaneLayout.this.mDragHelper.settleCapturedViewAt(left, releasedChild.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        public int getViewHorizontalDragRange(View child) {
            return SlidingPaneLayout.this.mSlideRange;
        }

        public int clampViewPositionHorizontal(View child, int left, int dx) {
            int newLeft = left;
            LayoutParams lp = (LayoutParams) SlidingPaneLayout.this.mSlideableView.getLayoutParams();
            if (SlidingPaneLayout.this.isLayoutRtlSupport()) {
                int startBound = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + lp.rightMargin) + SlidingPaneLayout.this.mSlideableView.getWidth());
                return Math.max(Math.min(newLeft, startBound), startBound - SlidingPaneLayout.this.mSlideRange);
            }
            int startBound2 = SlidingPaneLayout.this.getPaddingLeft() + lp.leftMargin;
            return Math.min(Math.max(newLeft, startBound2), SlidingPaneLayout.this.mSlideRange + startBound2);
        }

        public int clampViewPositionVertical(View child, int top, int dy) {
            return child.getTop();
        }

        public void onEdgeTouched(int edgeFlags, int pointerId) {
            if (isDraggable()) {
                SlidingPaneLayout.this.mDragHelper.captureChildView(SlidingPaneLayout.this.mSlideableView, pointerId);
            }
        }

        public void onEdgeDragStarted(int edgeFlags, int pointerId) {
            if (isDraggable()) {
                SlidingPaneLayout.this.mDragHelper.captureChildView(SlidingPaneLayout.this.mSlideableView, pointerId);
            }
        }

        private boolean isDraggable() {
            if (SlidingPaneLayout.this.mIsUnableToDrag || SlidingPaneLayout.this.getLockMode() == 3) {
                return false;
            }
            if (SlidingPaneLayout.this.isOpen() && SlidingPaneLayout.this.getLockMode() == 1) {
                return false;
            }
            if (SlidingPaneLayout.this.isOpen() || SlidingPaneLayout.this.getLockMode() != 2) {
                return true;
            }
            return false;
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int[] ATTRS = {16843137};
        Paint dimPaint;
        boolean dimWhenOffset;
        boolean slideable;
        public float weight = 0.0f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(int width, int height) {
            super(width, height);
        }

        public LayoutParams(ViewGroup.LayoutParams source) {
            super(source);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams source) {
            super(source);
        }

        public LayoutParams(LayoutParams source) {
            super(source);
            this.weight = source.weight;
        }

        public LayoutParams(Context c, AttributeSet attrs) {
            super(c, attrs);
            TypedArray a = c.obtainStyledAttributes(attrs, ATTRS);
            this.weight = a.getFloat(0, 0.0f);
            a.recycle();
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            public SavedState createFromParcel(Parcel in, ClassLoader loader) {
                return new SavedState(in, (ClassLoader) null);
            }

            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in, (ClassLoader) null);
            }

            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        };
        boolean isOpen;
        int mLockMode;

        SavedState(Parcelable superState) {
            super(superState);
        }

        SavedState(Parcel in, ClassLoader loader) {
            super(in, loader);
            this.isOpen = in.readInt() != 0;
            this.mLockMode = in.readInt();
        }

        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.isOpen ? 1 : 0);
            out.writeInt(this.mLockMode);
        }
    }

    class AccessibilityDelegate extends AccessibilityDelegateCompat {
        private final Rect mTmpRect = new Rect();

        AccessibilityDelegate() {
        }

        public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
            AccessibilityNodeInfoCompat superNode = AccessibilityNodeInfoCompat.obtain(info);
            super.onInitializeAccessibilityNodeInfo(host, superNode);
            copyNodeInfoNoChildren(info, superNode);
            superNode.recycle();
            info.setClassName(SlidingPaneLayout.ACCESSIBILITY_CLASS_NAME);
            info.setSource(host);
            ViewParent parent = ViewCompat.getParentForAccessibility(host);
            if (parent instanceof View) {
                info.setParent((View) parent);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = SlidingPaneLayout.this.getChildAt(i);
                if (!filter(child) && child.getVisibility() == 0) {
                    ViewCompat.setImportantForAccessibility(child, 1);
                    info.addChild(child);
                }
            }
        }

        public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
            super.onInitializeAccessibilityEvent(host, event);
            event.setClassName(SlidingPaneLayout.ACCESSIBILITY_CLASS_NAME);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) {
            if (!filter(child)) {
                return super.onRequestSendAccessibilityEvent(host, child, event);
            }
            return false;
        }

        public boolean filter(View child) {
            return SlidingPaneLayout.this.isDimmed(child);
        }

        private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat dest, AccessibilityNodeInfoCompat src) {
            Rect rect = this.mTmpRect;
            src.getBoundsInScreen(rect);
            dest.setBoundsInScreen(rect);
            dest.setVisibleToUser(src.isVisibleToUser());
            dest.setPackageName(src.getPackageName());
            dest.setClassName(src.getClassName());
            dest.setContentDescription(src.getContentDescription());
            dest.setEnabled(src.isEnabled());
            dest.setClickable(src.isClickable());
            dest.setFocusable(src.isFocusable());
            dest.setFocused(src.isFocused());
            dest.setAccessibilityFocused(src.isAccessibilityFocused());
            dest.setSelected(src.isSelected());
            dest.setLongClickable(src.isLongClickable());
            dest.addAction(src.getActions());
            dest.setMovementGranularities(src.getMovementGranularities());
        }
    }

    private static class TouchBlocker extends FrameLayout {
        TouchBlocker(View view) {
            super(view.getContext());
            addView(view);
        }

        public boolean onTouchEvent(MotionEvent event) {
            return true;
        }

        public boolean onGenericMotionEvent(MotionEvent event) {
            return true;
        }
    }

    private class DisableLayerRunnable implements Runnable {
        final View mChildView;

        DisableLayerRunnable(View childView) {
            this.mChildView = childView;
        }

        public void run() {
            if (this.mChildView.getParent() == SlidingPaneLayout.this) {
                this.mChildView.setLayerType(0, (Paint) null);
                SlidingPaneLayout.this.invalidateChildRegion(this.mChildView);
            }
            SlidingPaneLayout.this.mPostedRunnables.remove(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isLayoutRtlSupport() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    private ArrayList<Rect> splitViewPositions() {
        Rect splitPosition;
        if (this.mFoldingFeature == null || !this.mFoldingFeature.isSeparating() || this.mFoldingFeature.getBounds().left == 0 || this.mFoldingFeature.getBounds().top != 0 || (splitPosition = getFoldBoundsInView(this.mFoldingFeature, this)) == null) {
            return null;
        }
        Rect leftRect = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), splitPosition.left), getHeight() - getPaddingBottom());
        int rightBound = getWidth() - getPaddingRight();
        return new ArrayList<>(Arrays.asList(new Rect[]{leftRect, new Rect(Math.min(rightBound, splitPosition.right), getPaddingTop(), rightBound, getHeight() - getPaddingBottom())}));
    }

    private static Rect getFoldBoundsInView(FoldingFeature foldingFeature, View view) {
        int[] viewLocationInWindow = new int[2];
        view.getLocationInWindow(viewLocationInWindow);
        Rect viewRect = new Rect(viewLocationInWindow[0], viewLocationInWindow[1], viewLocationInWindow[0] + view.getWidth(), viewLocationInWindow[1] + view.getWidth());
        Rect foldRectInView = new Rect(foldingFeature.getBounds());
        boolean intersects = foldRectInView.intersect(viewRect);
        if ((foldRectInView.width() == 0 && foldRectInView.height() == 0) || !intersects) {
            return null;
        }
        foldRectInView.offset(-viewLocationInWindow[0], -viewLocationInWindow[1]);
        return foldRectInView;
    }

    private static Activity getActivityOrNull(Context context) {
        for (Context iterator = context; iterator instanceof ContextWrapper; iterator = ((ContextWrapper) iterator).getBaseContext()) {
            if (iterator instanceof Activity) {
                return (Activity) iterator;
            }
        }
        return null;
    }
}
