package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {
    private static final int DEF_STYLE_RES = R.style.Widget_Design_AppBarLayout;
    private static final int INVALID_SCROLL_RANGE = -1;
    static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
    static final int PENDING_ACTION_COLLAPSED = 2;
    static final int PENDING_ACTION_EXPANDED = 1;
    static final int PENDING_ACTION_FORCE = 8;
    static final int PENDING_ACTION_NONE = 0;
    private final float appBarElevation;
    private Behavior behavior;
    private int currentOffset;
    private int downPreScrollRange;
    private int downScrollRange;
    private final boolean hasLiftOnScrollColor;
    private boolean haveChildWithInterpolator;
    private WindowInsetsCompat lastInsets;
    private boolean liftOnScroll;
    private ValueAnimator liftOnScrollColorAnimator;
    private final long liftOnScrollColorDuration;
    private final TimeInterpolator liftOnScrollColorInterpolator;
    private ValueAnimator.AnimatorUpdateListener liftOnScrollColorUpdateListener;
    private final List<LiftOnScrollListener> liftOnScrollListeners;
    private WeakReference<View> liftOnScrollTargetView;
    private int liftOnScrollTargetViewId;
    private boolean liftable;
    private boolean liftableOverride;
    private boolean lifted;
    private List<BaseOnOffsetChangedListener> listeners;
    private int pendingAction;
    private Drawable statusBarForeground;
    private Integer statusBarForegroundOriginalColor;
    private int[] tmpStatesArray;
    private int totalScrollRange;

    public interface BaseOnOffsetChangedListener<T extends AppBarLayout> {
        void onOffsetChanged(T t, int i);
    }

    public static abstract class ChildScrollEffect {
        public abstract void onOffsetChanged(AppBarLayout appBarLayout, View view, float f);
    }

    public interface LiftOnScrollListener {
        void onUpdate(float f, int i);
    }

    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener<AppBarLayout> {
        void onOffsetChanged(AppBarLayout appBarLayout, int i);
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppBarLayout(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.appBarLayoutStyle);
    }

    public AppBarLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(MaterialThemeOverlay.wrap(context, attrs, defStyleAttr, DEF_STYLE_RES), attrs, defStyleAttr);
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        this.pendingAction = 0;
        this.liftOnScrollListeners = new ArrayList();
        Context context2 = getContext();
        boolean z = true;
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            ViewUtilsLollipop.setBoundsViewOutlineProvider(this);
        }
        ViewUtilsLollipop.setStateListAnimatorFromAttrs(this, attrs, defStyleAttr, DEF_STYLE_RES);
        TypedArray a = ThemeEnforcement.obtainStyledAttributes(context2, attrs, R.styleable.AppBarLayout, defStyleAttr, DEF_STYLE_RES, new int[0]);
        ViewCompat.setBackground(this, a.getDrawable(R.styleable.AppBarLayout_android_background));
        ColorStateList liftOnScrollColor = MaterialResources.getColorStateList(context2, a, R.styleable.AppBarLayout_liftOnScrollColor);
        this.hasLiftOnScrollColor = liftOnScrollColor == null ? false : z;
        ColorStateList originalBackgroundColor = DrawableUtils.getColorStateListOrNull(getBackground());
        if (originalBackgroundColor != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(originalBackgroundColor);
            if (liftOnScrollColor != null) {
                initializeLiftOnScrollWithColor(materialShapeDrawable, originalBackgroundColor, liftOnScrollColor);
            } else {
                initializeLiftOnScrollWithElevation(context2, materialShapeDrawable);
            }
        }
        this.liftOnScrollColorDuration = (long) MotionUtils.resolveThemeDuration(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
        this.liftOnScrollColorInterpolator = MotionUtils.resolveThemeInterpolator(context2, R.attr.motionEasingStandardInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        if (a.hasValue(R.styleable.AppBarLayout_expanded)) {
            setExpanded(a.getBoolean(R.styleable.AppBarLayout_expanded, false), false, false);
        }
        if (a.hasValue(R.styleable.AppBarLayout_elevation)) {
            ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(this, (float) a.getDimensionPixelSize(R.styleable.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (a.hasValue(R.styleable.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(a.getBoolean(R.styleable.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (a.hasValue(R.styleable.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(a.getBoolean(R.styleable.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.appBarElevation = getResources().getDimension(R.dimen.design_appbar_elevation);
        this.liftOnScroll = a.getBoolean(R.styleable.AppBarLayout_liftOnScroll, false);
        this.liftOnScrollTargetViewId = a.getResourceId(R.styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(a.getDrawable(R.styleable.AppBarLayout_statusBarForeground));
        a.recycle();
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() {
            public WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
                return AppBarLayout.this.onWindowInsetChanged(insets);
            }
        });
    }

    private void initializeLiftOnScrollWithColor(MaterialShapeDrawable background, ColorStateList originalBackgroundColor, ColorStateList liftOnScrollColor) {
        this.liftOnScrollColorUpdateListener = new AppBarLayout$$ExternalSyntheticLambda0(this, originalBackgroundColor, liftOnScrollColor, background, MaterialColors.getColorOrNull(getContext(), R.attr.colorSurface));
        ViewCompat.setBackground(this, background);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$initializeLiftOnScrollWithColor$0$com-google-android-material-appbar-AppBarLayout  reason: not valid java name */
    public /* synthetic */ void m184lambda$initializeLiftOnScrollWithColor$0$comgoogleandroidmaterialappbarAppBarLayout(ColorStateList originalBackgroundColor, ColorStateList liftOnScrollColor, MaterialShapeDrawable background, Integer colorSurface, ValueAnimator valueAnimator) {
        int mixedColor = MaterialColors.layer(originalBackgroundColor.getDefaultColor(), liftOnScrollColor.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        background.setFillColor(ColorStateList.valueOf(mixedColor));
        if (!(this.statusBarForeground == null || this.statusBarForegroundOriginalColor == null || !this.statusBarForegroundOriginalColor.equals(colorSurface))) {
            DrawableCompat.setTint(this.statusBarForeground, mixedColor);
        }
        if (!this.liftOnScrollListeners.isEmpty()) {
            for (LiftOnScrollListener liftOnScrollListener : this.liftOnScrollListeners) {
                if (background.getFillColor() != null) {
                    liftOnScrollListener.onUpdate(0.0f, mixedColor);
                }
            }
        }
    }

    private void initializeLiftOnScrollWithElevation(Context context, MaterialShapeDrawable background) {
        background.initializeElevationOverlay(context);
        this.liftOnScrollColorUpdateListener = new AppBarLayout$$ExternalSyntheticLambda1(this, background);
        ViewCompat.setBackground(this, background);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$initializeLiftOnScrollWithElevation$1$com-google-android-material-appbar-AppBarLayout  reason: not valid java name */
    public /* synthetic */ void m185lambda$initializeLiftOnScrollWithElevation$1$comgoogleandroidmaterialappbarAppBarLayout(MaterialShapeDrawable background, ValueAnimator valueAnimator) {
        float elevation = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        background.setElevation(elevation);
        if (this.statusBarForeground instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) this.statusBarForeground).setElevation(elevation);
        }
        for (LiftOnScrollListener liftOnScrollListener : this.liftOnScrollListeners) {
            liftOnScrollListener.onUpdate(elevation, background.getResolvedTintColor());
        }
    }

    public void addOnOffsetChangedListener(BaseOnOffsetChangedListener listener) {
        if (this.listeners == null) {
            this.listeners = new ArrayList();
        }
        if (listener != null && !this.listeners.contains(listener)) {
            this.listeners.add(listener);
        }
    }

    public void addOnOffsetChangedListener(OnOffsetChangedListener listener) {
        addOnOffsetChangedListener((BaseOnOffsetChangedListener) listener);
    }

    public void removeOnOffsetChangedListener(BaseOnOffsetChangedListener listener) {
        if (this.listeners != null && listener != null) {
            this.listeners.remove(listener);
        }
    }

    public void removeOnOffsetChangedListener(OnOffsetChangedListener listener) {
        removeOnOffsetChangedListener((BaseOnOffsetChangedListener) listener);
    }

    public void addLiftOnScrollListener(LiftOnScrollListener liftOnScrollListener) {
        this.liftOnScrollListeners.add(liftOnScrollListener);
    }

    public boolean removeLiftOnScrollListener(LiftOnScrollListener liftOnScrollListener) {
        return this.liftOnScrollListeners.remove(liftOnScrollListener);
    }

    public void clearLiftOnScrollListener() {
        this.liftOnScrollListeners.clear();
    }

    public void setStatusBarForeground(Drawable drawable) {
        if (this.statusBarForeground != drawable) {
            Drawable drawable2 = null;
            if (this.statusBarForeground != null) {
                this.statusBarForeground.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.statusBarForeground = drawable2;
            this.statusBarForegroundOriginalColor = extractStatusBarForegroundColor();
            if (this.statusBarForeground != null) {
                if (this.statusBarForeground.isStateful()) {
                    this.statusBarForeground.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.statusBarForeground, ViewCompat.getLayoutDirection(this));
                this.statusBarForeground.setVisible(getVisibility() == 0, false);
                this.statusBarForeground.setCallback(this);
            }
            updateWillNotDraw();
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarForegroundColor(int color) {
        setStatusBarForeground(new ColorDrawable(color));
    }

    public void setStatusBarForegroundResource(int resId) {
        setStatusBarForeground(AppCompatResources.getDrawable(getContext(), resId));
    }

    public Drawable getStatusBarForeground() {
        return this.statusBarForeground;
    }

    private Integer extractStatusBarForegroundColor() {
        if (this.statusBarForeground instanceof MaterialShapeDrawable) {
            return Integer.valueOf(((MaterialShapeDrawable) this.statusBarForeground).getResolvedTintColor());
        }
        ColorStateList statusBarForegroundColorStateList = DrawableUtils.getColorStateListOrNull(this.statusBarForeground);
        if (statusBarForegroundColorStateList != null) {
            return Integer.valueOf(statusBarForegroundColorStateList.getDefaultColor());
        }
        return null;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (shouldDrawStatusBarForeground()) {
            int saveCount = canvas.save();
            canvas.translate(0.0f, (float) (-this.currentOffset));
            this.statusBarForeground.draw(canvas);
            canvas.restoreToCount(saveCount);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] state = getDrawableState();
        Drawable d = this.statusBarForeground;
        if (d != null && d.isStateful() && d.setState(state)) {
            invalidateDrawable(d);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || who == this.statusBarForeground;
    }

    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        boolean visible = visibility == 0;
        if (this.statusBarForeground != null) {
            this.statusBarForeground.setVisible(visible, false);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (heightMode != 1073741824 && ViewCompat.getFitsSystemWindows(this) && shouldOffsetFirstChild()) {
            int newHeight = getMeasuredHeight();
            switch (heightMode) {
                case Integer.MIN_VALUE:
                    newHeight = MathUtils.clamp(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(heightMeasureSpec));
                    break;
                case 0:
                    newHeight += getTopInset();
                    break;
            }
            setMeasuredDimension(getMeasuredWidth(), newHeight);
        }
        invalidateScrollRanges();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        boolean z = true;
        if (ViewCompat.getFitsSystemWindows(this) && shouldOffsetFirstChild()) {
            int topInset = getTopInset();
            for (int z2 = getChildCount() - 1; z2 >= 0; z2--) {
                ViewCompat.offsetTopAndBottom(getChildAt(z2), topInset);
            }
        }
        invalidateScrollRanges();
        this.haveChildWithInterpolator = false;
        int i = 0;
        int z3 = getChildCount();
        while (true) {
            if (i >= z3) {
                break;
            } else if (((LayoutParams) getChildAt(i).getLayoutParams()).getScrollInterpolator() != null) {
                this.haveChildWithInterpolator = true;
                break;
            } else {
                i++;
            }
        }
        if (this.statusBarForeground != null) {
            this.statusBarForeground.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.liftableOverride) {
            if (!this.liftOnScroll && !hasCollapsibleChild()) {
                z = false;
            }
            setLiftableState(z);
        }
    }

    private void updateWillNotDraw() {
        setWillNotDraw(!shouldDrawStatusBarForeground());
    }

    private boolean shouldDrawStatusBarForeground() {
        return this.statusBarForeground != null && getTopInset() > 0;
    }

    private boolean hasCollapsibleChild() {
        int z = getChildCount();
        for (int i = 0; i < z; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).isCollapsible()) {
                return true;
            }
        }
        return false;
    }

    private void invalidateScrollRanges() {
        BaseBehavior.SavedState savedState = (this.behavior == null || this.totalScrollRange == -1 || this.pendingAction != 0) ? null : this.behavior.saveScrollState(AbsSavedState.EMPTY_STATE, this);
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        if (savedState != null) {
            this.behavior.restoreScrollState(savedState, false);
        }
    }

    public void setOrientation(int orientation) {
        if (orientation == 1) {
            super.setOrientation(orientation);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        this.behavior = new Behavior();
        return this.behavior;
    }

    public MaterialShapeDrawable getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            return (MaterialShapeDrawable) background;
        }
        return null;
    }

    public void setElevation(float elevation) {
        super.setElevation(elevation);
        MaterialShapeUtils.setElevation(this, elevation);
    }

    public void setExpanded(boolean expanded) {
        setExpanded(expanded, ViewCompat.isLaidOut(this));
    }

    public void setExpanded(boolean expanded, boolean animate) {
        setExpanded(expanded, animate, true);
    }

    private void setExpanded(boolean expanded, boolean animate, boolean force) {
        int i = 0;
        int i2 = (expanded ? 1 : 2) | (animate ? 4 : 0);
        if (force) {
            i = 8;
        }
        this.pendingAction = i2 | i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LayoutParams(getContext(), attrs);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        if (p instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) p);
        }
        if (p instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) p);
        }
        return new LayoutParams(p);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearLiftOnScrollTargetView();
    }

    /* access modifiers changed from: package-private */
    public boolean hasChildWithInterpolator() {
        return this.haveChildWithInterpolator;
    }

    public final int getTotalScrollRange() {
        if (this.totalScrollRange != -1) {
            return this.totalScrollRange;
        }
        int range = 0;
        int i = 0;
        int z = getChildCount();
        while (true) {
            if (i >= z) {
                break;
            }
            View child = getChildAt(i);
            if (child.getVisibility() != 8) {
                LayoutParams lp = (LayoutParams) child.getLayoutParams();
                int childHeight = child.getMeasuredHeight();
                int flags = lp.scrollFlags;
                if ((flags & 1) == 0) {
                    break;
                }
                range += lp.topMargin + childHeight + lp.bottomMargin;
                if (i == 0 && ViewCompat.getFitsSystemWindows(child)) {
                    range -= getTopInset();
                }
                if ((flags & 2) != 0) {
                    range -= ViewCompat.getMinimumHeight(child);
                    break;
                }
            }
            i++;
        }
        int max = Math.max(0, range);
        this.totalScrollRange = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public boolean hasScrollableChildren() {
        return getTotalScrollRange() != 0;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int childRange;
        if (this.downPreScrollRange != -1) {
            return this.downPreScrollRange;
        }
        int range = 0;
        for (int i = getChildCount() - 1; i >= 0; i--) {
            View child = getChildAt(i);
            if (child.getVisibility() != 8) {
                LayoutParams lp = (LayoutParams) child.getLayoutParams();
                int childHeight = child.getMeasuredHeight();
                int flags = lp.scrollFlags;
                if ((flags & 5) == 5) {
                    int childRange2 = lp.topMargin + lp.bottomMargin;
                    if ((flags & 8) != 0) {
                        childRange = childRange2 + ViewCompat.getMinimumHeight(child);
                    } else if ((flags & 2) != 0) {
                        childRange = childRange2 + (childHeight - ViewCompat.getMinimumHeight(child));
                    } else {
                        childRange = childRange2 + childHeight;
                    }
                    if (i == 0 && ViewCompat.getFitsSystemWindows(child)) {
                        childRange = Math.min(childRange, childHeight - getTopInset());
                    }
                    range += childRange;
                } else if (range > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, range);
        this.downPreScrollRange = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        if (this.downScrollRange != -1) {
            return this.downScrollRange;
        }
        int range = 0;
        int i = 0;
        int z = getChildCount();
        while (true) {
            if (i >= z) {
                break;
            }
            View child = getChildAt(i);
            if (child.getVisibility() != 8) {
                LayoutParams lp = (LayoutParams) child.getLayoutParams();
                int childHeight = child.getMeasuredHeight() + lp.topMargin + lp.bottomMargin;
                int flags = lp.scrollFlags;
                if ((flags & 1) == 0) {
                    break;
                }
                range += childHeight;
                if ((flags & 2) != 0) {
                    range -= ViewCompat.getMinimumHeight(child);
                    break;
                }
            }
            i++;
        }
        int max = Math.max(0, range);
        this.downScrollRange = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public void onOffsetChanged(int offset) {
        this.currentOffset = offset;
        if (!willNotDraw()) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        if (this.listeners != null) {
            int z = this.listeners.size();
            for (int i = 0; i < z; i++) {
                BaseOnOffsetChangedListener listener = this.listeners.get(i);
                if (listener != null) {
                    listener.onOffsetChanged(this, offset);
                }
            }
        }
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minHeight = ViewCompat.getMinimumHeight(this);
        if (minHeight != 0) {
            return (minHeight * 2) + topInset;
        }
        int childCount = getChildCount();
        int lastChildMinHeight = childCount >= 1 ? ViewCompat.getMinimumHeight(getChildAt(childCount - 1)) : 0;
        if (lastChildMinHeight != 0) {
            return (lastChildMinHeight * 2) + topInset;
        }
        return getHeight() / 3;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int extraSpace) {
        if (this.tmpStatesArray == null) {
            this.tmpStatesArray = new int[4];
        }
        int[] extraStates = this.tmpStatesArray;
        int[] states = super.onCreateDrawableState(extraStates.length + extraSpace);
        extraStates[0] = this.liftable ? R.attr.state_liftable : -R.attr.state_liftable;
        extraStates[1] = (!this.liftable || !this.lifted) ? -R.attr.state_lifted : R.attr.state_lifted;
        extraStates[2] = this.liftable ? R.attr.state_collapsible : -R.attr.state_collapsible;
        extraStates[3] = (!this.liftable || !this.lifted) ? -R.attr.state_collapsed : R.attr.state_collapsed;
        return mergeDrawableStates(states, extraStates);
    }

    public boolean setLiftable(boolean liftable2) {
        this.liftableOverride = true;
        return setLiftableState(liftable2);
    }

    public void setLiftableOverrideEnabled(boolean enabled) {
        this.liftableOverride = enabled;
    }

    private boolean setLiftableState(boolean liftable2) {
        if (this.liftable == liftable2) {
            return false;
        }
        this.liftable = liftable2;
        refreshDrawableState();
        return true;
    }

    public boolean setLifted(boolean lifted2) {
        return setLiftedState(lifted2, true);
    }

    public boolean isLifted() {
        return this.lifted;
    }

    /* access modifiers changed from: package-private */
    public boolean setLiftedState(boolean lifted2) {
        return setLiftedState(lifted2, !this.liftableOverride);
    }

    /* access modifiers changed from: package-private */
    public boolean setLiftedState(boolean lifted2, boolean force) {
        if (!force || this.lifted == lifted2) {
            return false;
        }
        this.lifted = lifted2;
        refreshDrawableState();
        if (!isLiftOnScrollCompatibleBackground()) {
            return true;
        }
        float f = 0.0f;
        if (this.hasLiftOnScrollColor) {
            float f2 = lifted2 ? 0.0f : 1.0f;
            if (lifted2) {
                f = 1.0f;
            }
            startLiftOnScrollColorAnimation(f2, f);
            return true;
        } else if (!this.liftOnScroll) {
            return true;
        } else {
            float f3 = lifted2 ? 0.0f : this.appBarElevation;
            if (lifted2) {
                f = this.appBarElevation;
            }
            startLiftOnScrollColorAnimation(f3, f);
            return true;
        }
    }

    private boolean isLiftOnScrollCompatibleBackground() {
        return getBackground() instanceof MaterialShapeDrawable;
    }

    private void startLiftOnScrollColorAnimation(float fromValue, float toValue) {
        if (this.liftOnScrollColorAnimator != null) {
            this.liftOnScrollColorAnimator.cancel();
        }
        this.liftOnScrollColorAnimator = ValueAnimator.ofFloat(new float[]{fromValue, toValue});
        this.liftOnScrollColorAnimator.setDuration(this.liftOnScrollColorDuration);
        this.liftOnScrollColorAnimator.setInterpolator(this.liftOnScrollColorInterpolator);
        if (this.liftOnScrollColorUpdateListener != null) {
            this.liftOnScrollColorAnimator.addUpdateListener(this.liftOnScrollColorUpdateListener);
        }
        this.liftOnScrollColorAnimator.start();
    }

    public void setLiftOnScroll(boolean liftOnScroll2) {
        this.liftOnScroll = liftOnScroll2;
    }

    public boolean isLiftOnScroll() {
        return this.liftOnScroll;
    }

    public void setLiftOnScrollTargetView(View liftOnScrollTargetView2) {
        this.liftOnScrollTargetViewId = -1;
        if (liftOnScrollTargetView2 == null) {
            clearLiftOnScrollTargetView();
        } else {
            this.liftOnScrollTargetView = new WeakReference<>(liftOnScrollTargetView2);
        }
    }

    public void setLiftOnScrollTargetViewId(int liftOnScrollTargetViewId2) {
        this.liftOnScrollTargetViewId = liftOnScrollTargetViewId2;
        clearLiftOnScrollTargetView();
    }

    public int getLiftOnScrollTargetViewId() {
        return this.liftOnScrollTargetViewId;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldLift(View defaultScrollingView) {
        View scrollingView = findLiftOnScrollTargetView(defaultScrollingView);
        if (scrollingView == null) {
            scrollingView = defaultScrollingView;
        }
        return scrollingView != null && (scrollingView.canScrollVertically(-1) || scrollingView.getScrollY() > 0);
    }

    private View findLiftOnScrollTargetView(View defaultScrollingView) {
        if (this.liftOnScrollTargetView == null && this.liftOnScrollTargetViewId != -1) {
            View targetView = null;
            if (defaultScrollingView != null) {
                targetView = defaultScrollingView.findViewById(this.liftOnScrollTargetViewId);
            }
            if (targetView == null && (getParent() instanceof ViewGroup)) {
                targetView = ((ViewGroup) getParent()).findViewById(this.liftOnScrollTargetViewId);
            }
            if (targetView != null) {
                this.liftOnScrollTargetView = new WeakReference<>(targetView);
            }
        }
        if (this.liftOnScrollTargetView != null) {
            return (View) this.liftOnScrollTargetView.get();
        }
        return null;
    }

    private void clearLiftOnScrollTargetView() {
        if (this.liftOnScrollTargetView != null) {
            this.liftOnScrollTargetView.clear();
        }
        this.liftOnScrollTargetView = null;
    }

    @Deprecated
    public void setTargetElevation(float elevation) {
        ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(this, elevation);
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.pendingAction;
    }

    /* access modifiers changed from: package-private */
    public void resetPendingAction() {
        this.pendingAction = 0;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        if (this.lastInsets != null) {
            return this.lastInsets.getSystemWindowInsetTop();
        }
        return 0;
    }

    private boolean shouldOffsetFirstChild() {
        if (getChildCount() <= 0) {
            return false;
        }
        View firstChild = getChildAt(0);
        if (firstChild.getVisibility() == 8 || ViewCompat.getFitsSystemWindows(firstChild)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public WindowInsetsCompat onWindowInsetChanged(WindowInsetsCompat insets) {
        WindowInsetsCompat newInsets = null;
        if (ViewCompat.getFitsSystemWindows(this)) {
            newInsets = insets;
        }
        if (!ObjectsCompat.equals(this.lastInsets, newInsets)) {
            this.lastInsets = newInsets;
            updateWillNotDraw();
            requestLayout();
        }
        return insets;
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        static final int COLLAPSIBLE_FLAGS = 10;
        static final int FLAG_QUICK_RETURN = 5;
        static final int FLAG_SNAP = 17;
        public static final int SCROLL_EFFECT_COMPRESS = 1;
        public static final int SCROLL_EFFECT_NONE = 0;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;
        private ChildScrollEffect scrollEffect;
        int scrollFlags = 1;
        Interpolator scrollInterpolator;

        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollEffect {
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollFlags {
        }

        public LayoutParams(Context c, AttributeSet attrs) {
            super(c, attrs);
            TypedArray a = c.obtainStyledAttributes(attrs, R.styleable.AppBarLayout_Layout);
            this.scrollFlags = a.getInt(R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            setScrollEffect(a.getInt(R.styleable.AppBarLayout_Layout_layout_scrollEffect, 0));
            if (a.hasValue(R.styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.scrollInterpolator = android.view.animation.AnimationUtils.loadInterpolator(c, a.getResourceId(R.styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            a.recycle();
        }

        public LayoutParams(int width, int height) {
            super(width, height);
        }

        public LayoutParams(int width, int height, float weight) {
            super(width, height, weight);
        }

        public LayoutParams(ViewGroup.LayoutParams p) {
            super(p);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams source) {
            super(source);
        }

        public LayoutParams(LinearLayout.LayoutParams source) {
            super(source);
        }

        public LayoutParams(LayoutParams source) {
            super(source);
            this.scrollFlags = source.scrollFlags;
            this.scrollEffect = source.scrollEffect;
            this.scrollInterpolator = source.scrollInterpolator;
        }

        public void setScrollFlags(int flags) {
            this.scrollFlags = flags;
        }

        public int getScrollFlags() {
            return this.scrollFlags;
        }

        private ChildScrollEffect createScrollEffectFromInt(int scrollEffectInt) {
            switch (scrollEffectInt) {
                case 1:
                    return new CompressChildScrollEffect();
                default:
                    return null;
            }
        }

        public ChildScrollEffect getScrollEffect() {
            return this.scrollEffect;
        }

        public void setScrollEffect(ChildScrollEffect scrollEffect2) {
            this.scrollEffect = scrollEffect2;
        }

        public void setScrollEffect(int scrollEffect2) {
            this.scrollEffect = createScrollEffectFromInt(scrollEffect2);
        }

        public void setScrollInterpolator(Interpolator interpolator) {
            this.scrollInterpolator = interpolator;
        }

        public Interpolator getScrollInterpolator() {
            return this.scrollInterpolator;
        }

        /* access modifiers changed from: package-private */
        public boolean isCollapsible() {
            return (this.scrollFlags & 1) == 1 && (this.scrollFlags & 10) != 0;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class DragCallback extends BaseBehavior.BaseDragCallback<AppBarLayout> {
        }

        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.onLayoutChild(coordinatorLayout, appBarLayout, i);
        }

        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        public /* bridge */ /* synthetic */ void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
        }

        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, appBarLayout);
        }

        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        }

        public /* bridge */ /* synthetic */ void setDragCallback(BaseBehavior.BaseDragCallback baseDragCallback) {
            super.setDragCallback(baseDragCallback);
        }

        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attrs) {
            super(context, attrs);
        }
    }

    protected static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        private static final int MAX_OFFSET_ANIMATION_DURATION = 600;
        private WeakReference<View> lastNestedScrollingChildRef;
        private int lastStartedType;
        private ValueAnimator offsetAnimator;
        /* access modifiers changed from: private */
        public int offsetDelta;
        private BaseDragCallback onDragCallback;
        private SavedState savedState;

        public static abstract class BaseDragCallback<T extends AppBarLayout> {
            public abstract boolean canDrag(T t);
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public boolean onStartNestedScroll(CoordinatorLayout parent, T child, View directTargetChild, View target, int nestedScrollAxes, int type) {
            boolean started = (nestedScrollAxes & 2) != 0 && (child.isLiftOnScroll() || canScrollChildren(parent, child, directTargetChild));
            if (started && this.offsetAnimator != null) {
                this.offsetAnimator.cancel();
            }
            this.lastNestedScrollingChildRef = null;
            this.lastStartedType = type;
            return started;
        }

        private boolean canScrollChildren(CoordinatorLayout parent, T child, View directTargetChild) {
            return child.hasScrollableChildren() && parent.getHeight() - directTargetChild.getHeight() <= child.getHeight();
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, T child, View target, int dx, int dy, int[] consumed, int type) {
            int max;
            int min;
            if (dy != 0) {
                if (dy < 0) {
                    int min2 = -child.getTotalScrollRange();
                    min = min2;
                    max = child.getDownNestedPreScrollRange() + min2;
                } else {
                    min = -child.getUpNestedPreScrollRange();
                    max = 0;
                }
                if (min != max) {
                    consumed[1] = scroll(coordinatorLayout, child, dy, min, max);
                }
            }
            if (child.isLiftOnScroll()) {
                T t = child;
                child.setLiftedState(child.shouldLift(target));
                return;
            }
            T t2 = child;
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, T child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
            if (dyUnconsumed < 0) {
                consumed[1] = scroll(coordinatorLayout, child, dyUnconsumed, -child.getDownNestedScrollRange(), 0);
            }
            if (dyUnconsumed == 0) {
                addAccessibilityDelegateIfNeeded(coordinatorLayout, child);
            }
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, T abl, View target, int type) {
            if (this.lastStartedType == 0 || type == 1) {
                snapToChildIfNeeded(coordinatorLayout, abl);
                if (abl.isLiftOnScroll()) {
                    abl.setLiftedState(abl.shouldLift(target));
                }
            }
            this.lastNestedScrollingChildRef = new WeakReference<>(target);
        }

        public void setDragCallback(BaseDragCallback callback) {
            this.onDragCallback = callback;
        }

        private void animateOffsetTo(CoordinatorLayout coordinatorLayout, T child, int offset, float velocity) {
            int duration;
            int distance = Math.abs(getTopBottomOffsetForScrollingSibling() - offset);
            float velocity2 = Math.abs(velocity);
            if (velocity2 > 0.0f) {
                duration = Math.round((((float) distance) / velocity2) * 1000.0f) * 3;
            } else {
                duration = (int) ((1.0f + (((float) distance) / ((float) child.getHeight()))) * 150.0f);
            }
            animateOffsetWithDuration(coordinatorLayout, child, offset, duration);
        }

        private void animateOffsetWithDuration(final CoordinatorLayout coordinatorLayout, final T child, int offset, int duration) {
            int currentOffset = getTopBottomOffsetForScrollingSibling();
            if (currentOffset != offset) {
                if (this.offsetAnimator == null) {
                    this.offsetAnimator = new ValueAnimator();
                    this.offsetAnimator.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
                    this.offsetAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        public void onAnimationUpdate(ValueAnimator animator) {
                            BaseBehavior.this.setHeaderTopBottomOffset(coordinatorLayout, child, ((Integer) animator.getAnimatedValue()).intValue());
                        }
                    });
                } else {
                    this.offsetAnimator.cancel();
                }
                this.offsetAnimator.setDuration((long) Math.min(duration, 600));
                this.offsetAnimator.setIntValues(new int[]{currentOffset, offset});
                this.offsetAnimator.start();
            } else if (this.offsetAnimator != null && this.offsetAnimator.isRunning()) {
                this.offsetAnimator.cancel();
            }
        }

        private int getChildIndexOnOffset(T abl, int offset) {
            int count = abl.getChildCount();
            for (int i = 0; i < count; i++) {
                View child = abl.getChildAt(i);
                int top = child.getTop();
                int bottom = child.getBottom();
                LayoutParams lp = (LayoutParams) child.getLayoutParams();
                if (checkFlag(lp.getScrollFlags(), 32)) {
                    top -= lp.topMargin;
                    bottom += lp.bottomMargin;
                }
                if (top <= (-offset) && bottom >= (-offset)) {
                    return i;
                }
            }
            return -1;
        }

        private void snapToChildIfNeeded(CoordinatorLayout coordinatorLayout, T abl) {
            int topInset = abl.getTopInset() + abl.getPaddingTop();
            int offset = getTopBottomOffsetForScrollingSibling() - topInset;
            int offsetChildIndex = getChildIndexOnOffset(abl, offset);
            if (offsetChildIndex >= 0) {
                View offsetChild = abl.getChildAt(offsetChildIndex);
                LayoutParams lp = (LayoutParams) offsetChild.getLayoutParams();
                int flags = lp.getScrollFlags();
                if ((flags & 17) == 17) {
                    int snapTop = -offsetChild.getTop();
                    int snapBottom = -offsetChild.getBottom();
                    if (offsetChildIndex == 0 && ViewCompat.getFitsSystemWindows(abl) && ViewCompat.getFitsSystemWindows(offsetChild)) {
                        snapTop -= abl.getTopInset();
                    }
                    if (checkFlag(flags, 2)) {
                        snapBottom += ViewCompat.getMinimumHeight(offsetChild);
                    } else if (checkFlag(flags, 5)) {
                        int seam = ViewCompat.getMinimumHeight(offsetChild) + snapBottom;
                        if (offset < seam) {
                            snapTop = seam;
                        } else {
                            snapBottom = seam;
                        }
                    }
                    if (checkFlag(flags, 32)) {
                        snapTop += lp.topMargin;
                        snapBottom -= lp.bottomMargin;
                    }
                    animateOffsetTo(coordinatorLayout, abl, MathUtils.clamp(calculateSnapOffset(offset, snapBottom, snapTop) + topInset, -abl.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private int calculateSnapOffset(int value, int bottom, int top) {
            return value < (bottom + top) / 2 ? bottom : top;
        }

        private static boolean checkFlag(int flags, int check) {
            return (flags & check) == check;
        }

        public boolean onMeasureChild(CoordinatorLayout parent, T child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
            if (((CoordinatorLayout.LayoutParams) child.getLayoutParams()).height != -2) {
                return super.onMeasureChild(parent, child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
            }
            parent.onMeasureChild(child, parentWidthMeasureSpec, widthUsed, View.MeasureSpec.makeMeasureSpec(0, 0), heightUsed);
            return true;
        }

        public boolean onLayoutChild(CoordinatorLayout parent, T abl, int layoutDirection) {
            int offset;
            boolean handled = super.onLayoutChild(parent, abl, layoutDirection);
            int pendingAction = abl.getPendingAction();
            if (this.savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean animate = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int offset2 = -abl.getUpNestedPreScrollRange();
                        if (animate) {
                            animateOffsetTo(parent, abl, offset2, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(parent, abl, offset2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (animate) {
                            animateOffsetTo(parent, abl, 0, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(parent, abl, 0);
                        }
                    }
                }
            } else if (this.savedState.fullyScrolled) {
                setHeaderTopBottomOffset(parent, abl, -abl.getTotalScrollRange());
            } else if (this.savedState.fullyExpanded) {
                setHeaderTopBottomOffset(parent, abl, 0);
            } else {
                View child = abl.getChildAt(this.savedState.firstVisibleChildIndex);
                int offset3 = -child.getBottom();
                if (this.savedState.firstVisibleChildAtMinimumHeight) {
                    offset = offset3 + ViewCompat.getMinimumHeight(child) + abl.getTopInset();
                } else {
                    offset = offset3 + Math.round(((float) child.getHeight()) * this.savedState.firstVisibleChildPercentageShown);
                }
                setHeaderTopBottomOffset(parent, abl, offset);
            }
            abl.resetPendingAction();
            this.savedState = null;
            setTopAndBottomOffset(MathUtils.clamp(getTopAndBottomOffset(), -abl.getTotalScrollRange(), 0));
            updateAppBarLayoutDrawableState(parent, abl, getTopAndBottomOffset(), 0, true);
            abl.onOffsetChanged(getTopAndBottomOffset());
            addAccessibilityDelegateIfNeeded(parent, abl);
            return handled;
        }

        private void addAccessibilityDelegateIfNeeded(final CoordinatorLayout coordinatorLayout, final T appBarLayout) {
            if (!ViewCompat.hasAccessibilityDelegate(coordinatorLayout)) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, new AccessibilityDelegateCompat() {
                    public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                        View scrollingView;
                        super.onInitializeAccessibilityNodeInfo(host, info);
                        info.setClassName(ScrollView.class.getName());
                        if (appBarLayout.getTotalScrollRange() != 0 && (scrollingView = BaseBehavior.this.getChildWithScrollingBehavior(coordinatorLayout)) != null && BaseBehavior.this.childrenHaveScrollFlags(appBarLayout)) {
                            if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != (-appBarLayout.getTotalScrollRange())) {
                                info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                                info.setScrollable(true);
                            }
                            if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() == 0) {
                                return;
                            }
                            if (!scrollingView.canScrollVertically(-1)) {
                                info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                                info.setScrollable(true);
                            } else if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                                info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                                info.setScrollable(true);
                            }
                        }
                    }

                    public boolean performAccessibilityAction(View host, int action, Bundle args) {
                        if (action == 4096) {
                            appBarLayout.setExpanded(false);
                            return true;
                        } else if (action != 8192) {
                            return super.performAccessibilityAction(host, action, args);
                        } else {
                            if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != 0) {
                                View scrollingView = BaseBehavior.this.getChildWithScrollingBehavior(coordinatorLayout);
                                if (scrollingView.canScrollVertically(-1)) {
                                    int dy = -appBarLayout.getDownNestedPreScrollRange();
                                    if (dy != 0) {
                                        BaseBehavior.this.onNestedPreScroll(coordinatorLayout, appBarLayout, scrollingView, 0, dy, new int[]{0, 0}, 1);
                                        return true;
                                    }
                                } else {
                                    appBarLayout.setExpanded(true);
                                    return true;
                                }
                            }
                            return false;
                        }
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        public View getChildWithScrollingBehavior(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.LayoutParams) child.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior) {
                    return child;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public boolean childrenHaveScrollFlags(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((LayoutParams) appBarLayout.getChildAt(i).getLayoutParams()).scrollFlags != 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean canDragView(T view) {
            if (this.onDragCallback != null) {
                return this.onDragCallback.canDrag(view);
            }
            if (this.lastNestedScrollingChildRef == null) {
                return true;
            }
            View scrollingView = (View) this.lastNestedScrollingChildRef.get();
            if (scrollingView == null || !scrollingView.isShown() || scrollingView.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public void onFlingFinished(CoordinatorLayout parent, T layout) {
            snapToChildIfNeeded(parent, layout);
            if (layout.isLiftOnScroll()) {
                layout.setLiftedState(layout.shouldLift(findFirstScrollingChild(parent)));
            }
        }

        /* access modifiers changed from: package-private */
        public int getMaxDragOffset(T view) {
            return (-view.getDownNestedScrollRange()) + view.getTopInset();
        }

        /* access modifiers changed from: package-private */
        public int getScrollRangeForDragFling(T view) {
            return view.getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, T appBarLayout, int newOffset, int minOffset, int maxOffset) {
            int i;
            int curOffset = getTopBottomOffsetForScrollingSibling();
            int consumed = 0;
            if (minOffset == 0 || curOffset < minOffset || curOffset > maxOffset) {
                this.offsetDelta = 0;
            } else {
                int newOffset2 = MathUtils.clamp(newOffset, minOffset, maxOffset);
                if (curOffset != newOffset2) {
                    if (appBarLayout.hasChildWithInterpolator()) {
                        i = interpolateOffset(appBarLayout, newOffset2);
                    } else {
                        i = newOffset2;
                    }
                    int interpolatedOffset = i;
                    boolean offsetChanged = setTopAndBottomOffset(interpolatedOffset);
                    consumed = curOffset - newOffset2;
                    this.offsetDelta = newOffset2 - interpolatedOffset;
                    int i2 = 1;
                    if (offsetChanged) {
                        for (int i3 = 0; i3 < appBarLayout.getChildCount(); i3++) {
                            LayoutParams params = (LayoutParams) appBarLayout.getChildAt(i3).getLayoutParams();
                            ChildScrollEffect scrollEffect = params.getScrollEffect();
                            if (!(scrollEffect == null || (params.getScrollFlags() & 1) == 0)) {
                                scrollEffect.onOffsetChanged(appBarLayout, appBarLayout.getChildAt(i3), (float) getTopAndBottomOffset());
                            }
                        }
                    }
                    if (!offsetChanged && appBarLayout.hasChildWithInterpolator()) {
                        coordinatorLayout.dispatchDependentViewsChanged(appBarLayout);
                    }
                    appBarLayout.onOffsetChanged(getTopAndBottomOffset());
                    if (newOffset2 < curOffset) {
                        i2 = -1;
                    }
                    updateAppBarLayoutDrawableState(coordinatorLayout, appBarLayout, newOffset2, i2, false);
                }
            }
            addAccessibilityDelegateIfNeeded(coordinatorLayout, appBarLayout);
            return consumed;
        }

        /* access modifiers changed from: package-private */
        public boolean isOffsetAnimatorRunning() {
            return this.offsetAnimator != null && this.offsetAnimator.isRunning();
        }

        private int interpolateOffset(T layout, int offset) {
            int absOffset = Math.abs(offset);
            int i = 0;
            int z = layout.getChildCount();
            while (true) {
                if (i >= z) {
                    break;
                }
                View child = layout.getChildAt(i);
                LayoutParams childLp = (LayoutParams) child.getLayoutParams();
                Interpolator interpolator = childLp.getScrollInterpolator();
                if (absOffset < child.getTop() || absOffset > child.getBottom()) {
                    i++;
                } else if (interpolator != null) {
                    int childScrollableHeight = 0;
                    int flags = childLp.getScrollFlags();
                    if ((flags & 1) != 0) {
                        childScrollableHeight = 0 + child.getHeight() + childLp.topMargin + childLp.bottomMargin;
                        if ((flags & 2) != 0) {
                            childScrollableHeight -= ViewCompat.getMinimumHeight(child);
                        }
                    }
                    if (ViewCompat.getFitsSystemWindows(child)) {
                        childScrollableHeight -= layout.getTopInset();
                    }
                    if (childScrollableHeight > 0) {
                        return Integer.signum(offset) * (child.getTop() + Math.round(((float) childScrollableHeight) * interpolator.getInterpolation(((float) (absOffset - child.getTop())) / ((float) childScrollableHeight))));
                    }
                }
            }
            return offset;
        }

        private void updateAppBarLayoutDrawableState(CoordinatorLayout parent, T layout, int offset, int direction, boolean forceJump) {
            View child = getAppBarChildOnOffset(layout, offset);
            boolean lifted = false;
            if (child != null) {
                int flags = ((LayoutParams) child.getLayoutParams()).getScrollFlags();
                if ((flags & 1) != 0) {
                    int minHeight = ViewCompat.getMinimumHeight(child);
                    boolean z = false;
                    if (direction > 0 && (flags & 12) != 0) {
                        if ((-offset) >= (child.getBottom() - minHeight) - layout.getTopInset()) {
                            z = true;
                        }
                        lifted = z;
                    } else if ((flags & 2) != 0) {
                        if ((-offset) >= (child.getBottom() - minHeight) - layout.getTopInset()) {
                            z = true;
                        }
                        lifted = z;
                    }
                }
            }
            if (layout.isLiftOnScroll()) {
                lifted = layout.shouldLift(findFirstScrollingChild(parent));
            }
            boolean changed = layout.setLiftedState(lifted);
            if (forceJump || (changed && shouldJumpElevationState(parent, layout))) {
                if (layout.getBackground() != null) {
                    layout.getBackground().jumpToCurrentState();
                }
                if (layout.getForeground() != null) {
                    layout.getForeground().jumpToCurrentState();
                }
                if (layout.getStateListAnimator() != null) {
                    layout.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        private boolean shouldJumpElevationState(CoordinatorLayout parent, T layout) {
            List<View> dependencies = parent.getDependents(layout);
            int size = dependencies.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) dependencies.get(i).getLayoutParams()).getBehavior();
                if (behavior instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) behavior).getOverlayTop() != 0;
                }
            }
            return false;
        }

        private static View getAppBarChildOnOffset(AppBarLayout layout, int offset) {
            int absOffset = Math.abs(offset);
            int z = layout.getChildCount();
            for (int i = 0; i < z; i++) {
                View child = layout.getChildAt(i);
                if (absOffset >= child.getTop() && absOffset <= child.getBottom()) {
                    return child;
                }
            }
            return null;
        }

        private View findFirstScrollingChild(CoordinatorLayout parent) {
            int z = parent.getChildCount();
            for (int i = 0; i < z; i++) {
                View child = parent.getChildAt(i);
                if ((child instanceof NestedScrollingChild) || (child instanceof AbsListView) || (child instanceof ScrollView)) {
                    return child;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public int getTopBottomOffsetForScrollingSibling() {
            return getTopAndBottomOffset() + this.offsetDelta;
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout parent, T abl) {
            Parcelable superState = super.onSaveInstanceState(parent, abl);
            SavedState scrollState = saveScrollState(superState, abl);
            return scrollState == null ? superState : scrollState;
        }

        public void onRestoreInstanceState(CoordinatorLayout parent, T appBarLayout, Parcelable state) {
            if (state instanceof SavedState) {
                restoreScrollState((SavedState) state, true);
                super.onRestoreInstanceState(parent, appBarLayout, this.savedState.getSuperState());
                return;
            }
            super.onRestoreInstanceState(parent, appBarLayout, state);
            this.savedState = null;
        }

        /* access modifiers changed from: package-private */
        public SavedState saveScrollState(Parcelable superState, T abl) {
            int offset = getTopAndBottomOffset();
            int i = 0;
            int count = abl.getChildCount();
            while (i < count) {
                View child = abl.getChildAt(i);
                int visBottom = child.getBottom() + offset;
                if (child.getTop() + offset > 0 || visBottom < 0) {
                    i++;
                } else {
                    SavedState ss = new SavedState(superState == null ? AbsSavedState.EMPTY_STATE : superState);
                    boolean z = false;
                    ss.fullyExpanded = offset == 0;
                    ss.fullyScrolled = !ss.fullyExpanded && (-offset) >= abl.getTotalScrollRange();
                    ss.firstVisibleChildIndex = i;
                    if (visBottom == ViewCompat.getMinimumHeight(child) + abl.getTopInset()) {
                        z = true;
                    }
                    ss.firstVisibleChildAtMinimumHeight = z;
                    ss.firstVisibleChildPercentageShown = ((float) visBottom) / ((float) child.getHeight());
                    return ss;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void restoreScrollState(SavedState state, boolean force) {
            if (this.savedState == null || force) {
                this.savedState = state;
            }
        }

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
                public SavedState createFromParcel(Parcel source, ClassLoader loader) {
                    return new SavedState(source, loader);
                }

                public SavedState createFromParcel(Parcel source) {
                    return new SavedState(source, (ClassLoader) null);
                }

                public SavedState[] newArray(int size) {
                    return new SavedState[size];
                }
            };
            boolean firstVisibleChildAtMinimumHeight;
            int firstVisibleChildIndex;
            float firstVisibleChildPercentageShown;
            boolean fullyExpanded;
            boolean fullyScrolled;

            public SavedState(Parcel source, ClassLoader loader) {
                super(source, loader);
                boolean z = true;
                this.fullyScrolled = source.readByte() != 0;
                this.fullyExpanded = source.readByte() != 0;
                this.firstVisibleChildIndex = source.readInt();
                this.firstVisibleChildPercentageShown = source.readFloat();
                this.firstVisibleChildAtMinimumHeight = source.readByte() == 0 ? false : z;
            }

            public SavedState(Parcelable superState) {
                super(superState);
            }

            public void writeToParcel(Parcel dest, int flags) {
                super.writeToParcel(dest, flags);
                dest.writeByte(this.fullyScrolled ? (byte) 1 : 0);
                dest.writeByte(this.fullyExpanded ? (byte) 1 : 0);
                dest.writeInt(this.firstVisibleChildIndex);
                dest.writeFloat(this.firstVisibleChildPercentageShown);
                dest.writeByte(this.firstVisibleChildAtMinimumHeight ? (byte) 1 : 0);
            }
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.onLayoutChild(coordinatorLayout, view, i);
        }

        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }

        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attrs) {
            super(context, attrs);
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ScrollingViewBehavior_Layout);
            setOverlayTop(a.getDimensionPixelSize(R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            a.recycle();
        }

        public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
            return dependency instanceof AppBarLayout;
        }

        public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
            offsetChildAsNeeded(child, dependency);
            updateLiftedStateIfNeeded(child, dependency);
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout parent, View child, View dependency) {
            if (dependency instanceof AppBarLayout) {
                ViewCompat.setAccessibilityDelegate(parent, (AccessibilityDelegateCompat) null);
            }
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout parent, View child, Rect rectangle, boolean immediate) {
            AppBarLayout header = findFirstDependency((List) parent.getDependencies(child));
            if (header != null) {
                Rect offsetRect = new Rect(rectangle);
                offsetRect.offset(child.getLeft(), child.getTop());
                Rect parentRect = this.tempRect1;
                parentRect.set(0, 0, parent.getWidth(), parent.getHeight());
                if (!parentRect.contains(offsetRect)) {
                    header.setExpanded(false, !immediate);
                    return true;
                }
            }
            return false;
        }

        private void offsetChildAsNeeded(View child, View dependency) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) dependency.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                ViewCompat.offsetTopAndBottom(child, (((dependency.getBottom() - child.getTop()) + ((BaseBehavior) behavior).offsetDelta) + getVerticalLayoutGap()) - getOverlapPixelsForOffset(dependency));
            }
        }

        /* access modifiers changed from: package-private */
        public float getOverlapRatioForOffset(View header) {
            int availScrollRange;
            if (header instanceof AppBarLayout) {
                AppBarLayout abl = (AppBarLayout) header;
                int totalScrollRange = abl.getTotalScrollRange();
                int preScrollDown = abl.getDownNestedPreScrollRange();
                int offset = getAppBarLayoutOffset(abl);
                if ((preScrollDown == 0 || totalScrollRange + offset > preScrollDown) && (availScrollRange = totalScrollRange - preScrollDown) != 0) {
                    return (((float) offset) / ((float) availScrollRange)) + 1.0f;
                }
            }
            return 0.0f;
        }

        private static int getAppBarLayoutOffset(AppBarLayout abl) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) abl.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                return ((BaseBehavior) behavior).getTopBottomOffsetForScrollingSibling();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public AppBarLayout findFirstDependency(List<View> views) {
            int z = views.size();
            for (int i = 0; i < z; i++) {
                View view = views.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public int getScrollRange(View v) {
            if (v instanceof AppBarLayout) {
                return ((AppBarLayout) v).getTotalScrollRange();
            }
            return super.getScrollRange(v);
        }

        private void updateLiftedStateIfNeeded(View child, View dependency) {
            if (dependency instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) dependency;
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.setLiftedState(appBarLayout.shouldLift(child));
                }
            }
        }
    }

    public static class CompressChildScrollEffect extends ChildScrollEffect {
        private static final float COMPRESS_DISTANCE_FACTOR = 0.3f;
        private final Rect ghostRect = new Rect();
        private final Rect relativeRect = new Rect();

        private static void updateRelativeRect(Rect rect, AppBarLayout appBarLayout, View child) {
            child.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(child, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        public void onOffsetChanged(AppBarLayout appBarLayout, View child, float offset) {
            updateRelativeRect(this.relativeRect, appBarLayout, child);
            float distanceFromCeiling = ((float) this.relativeRect.top) - Math.abs(offset);
            if (distanceFromCeiling <= 0.0f) {
                float p = MathUtils.clamp(Math.abs(distanceFromCeiling / ((float) this.relativeRect.height())), 0.0f, 1.0f);
                float offsetY = (-distanceFromCeiling) - ((((float) this.relativeRect.height()) * COMPRESS_DISTANCE_FACTOR) * (1.0f - ((1.0f - p) * (1.0f - p))));
                child.setTranslationY(offsetY);
                child.getDrawingRect(this.ghostRect);
                this.ghostRect.offset(0, (int) (-offsetY));
                if (offsetY >= ((float) this.ghostRect.height())) {
                    child.setVisibility(4);
                } else {
                    child.setVisibility(0);
                }
                ViewCompat.setClipBounds(child, this.ghostRect);
                return;
            }
            ViewCompat.setClipBounds(child, (Rect) null);
            child.setTranslationY(0.0f);
            child.setVisibility(0);
        }
    }
}
