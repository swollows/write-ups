package com.google.android.material.sidesheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.BackEventCompat;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;

public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements Sheet<SideSheetCallback> {
    private static final int DEFAULT_ACCESSIBILITY_PANE_TITLE = R.string.side_sheet_accessibility_pane_title;
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_SideSheet;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    private ColorStateList backgroundTint;
    private final Set<SideSheetCallback> callbacks = new LinkedHashSet();
    /* access modifiers changed from: private */
    public int childWidth;
    private int coplanarSiblingViewId = -1;
    private WeakReference<View> coplanarSiblingViewRef;
    private final ViewDragHelper.Callback dragCallback = new ViewDragHelper.Callback() {
        public boolean tryCaptureView(View child, int pointerId) {
            if (SideSheetBehavior.this.state == 1 || SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() != child) {
                return false;
            }
            return true;
        }

        public void onViewPositionChanged(View changedView, int left, int top, int dx, int dy) {
            ViewGroup.MarginLayoutParams layoutParams;
            View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
            if (!(coplanarSiblingView == null || (layoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null)) {
                SideSheetBehavior.this.sheetDelegate.updateCoplanarSiblingLayoutParams(layoutParams, changedView.getLeft(), changedView.getRight());
                coplanarSiblingView.setLayoutParams(layoutParams);
            }
            SideSheetBehavior.this.dispatchOnSlide(changedView, left);
        }

        public void onViewDragStateChanged(int state) {
            if (state == 1 && SideSheetBehavior.this.draggable) {
                SideSheetBehavior.this.setStateInternal(1);
            }
        }

        public void onViewReleased(View releasedChild, float xVelocity, float yVelocity) {
            SideSheetBehavior.this.startSettling(releasedChild, SideSheetBehavior.this.calculateTargetStateOnViewReleased(releasedChild, xVelocity, yVelocity), SideSheetBehavior.this.shouldSkipSmoothAnimation());
        }

        public int clampViewPositionVertical(View child, int top, int dy) {
            return child.getTop();
        }

        public int clampViewPositionHorizontal(View child, int left, int dx) {
            return MathUtils.clamp(left, SideSheetBehavior.this.sheetDelegate.getMinViewPositionHorizontal(), SideSheetBehavior.this.sheetDelegate.getMaxViewPositionHorizontal());
        }

        public int getViewHorizontalDragRange(View child) {
            return SideSheetBehavior.this.childWidth + SideSheetBehavior.this.getInnerMargin();
        }
    };
    /* access modifiers changed from: private */
    public boolean draggable = true;
    private float elevation;
    private float hideFriction = 0.1f;
    private boolean ignoreEvents;
    private int initialX;
    private int innerMargin;
    private int lastStableState = 5;
    private MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private int parentInnerEdge;
    private int parentWidth;
    private ShapeAppearanceModel shapeAppearanceModel;
    /* access modifiers changed from: private */
    public SheetDelegate sheetDelegate;
    private MaterialSideContainerBackHelper sideContainerBackHelper;
    /* access modifiers changed from: private */
    public int state = 5;
    private final SideSheetBehavior<V>.StateSettlingTracker stateSettlingTracker = new StateSettlingTracker();
    private VelocityTracker velocityTracker;
    /* access modifiers changed from: private */
    public ViewDragHelper viewDragHelper;
    /* access modifiers changed from: private */
    public WeakReference<V> viewRef;

    public SideSheetBehavior() {
    }

    public SideSheetBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.SideSheetBehavior_Layout);
        if (a.hasValue(R.styleable.SideSheetBehavior_Layout_backgroundTint)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, a, R.styleable.SideSheetBehavior_Layout_backgroundTint);
        }
        if (a.hasValue(R.styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModel = ShapeAppearanceModel.builder(context, attrs, 0, DEF_STYLE_RES).build();
        }
        if (a.hasValue(R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            setCoplanarSiblingViewId(a.getResourceId(R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId, -1));
        }
        createMaterialShapeDrawableIfNeeded(context);
        this.elevation = a.getDimension(R.styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        setDraggable(a.getBoolean(R.styleable.SideSheetBehavior_Layout_behavior_draggable, true));
        a.recycle();
        this.maximumVelocity = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void setSheetEdge(V view, int layoutDirection) {
        setSheetEdge(GravityCompat.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) view.getLayoutParams()).gravity, layoutDirection) == 3 ? 1 : 0);
    }

    private void setSheetEdge(int sheetEdge) {
        if (this.sheetDelegate != null && this.sheetDelegate.getSheetEdge() == sheetEdge) {
            return;
        }
        if (sheetEdge == 0) {
            this.sheetDelegate = new RightSheetDelegate(this);
            if (this.shapeAppearanceModel != null && !hasRightMargin()) {
                ShapeAppearanceModel.Builder builder = this.shapeAppearanceModel.toBuilder();
                builder.setTopRightCornerSize(0.0f).setBottomRightCornerSize(0.0f);
                updateMaterialShapeDrawable(builder.build());
            }
        } else if (sheetEdge == 1) {
            this.sheetDelegate = new LeftSheetDelegate(this);
            if (this.shapeAppearanceModel != null && !hasLeftMargin()) {
                ShapeAppearanceModel.Builder builder2 = this.shapeAppearanceModel.toBuilder();
                builder2.setTopLeftCornerSize(0.0f).setBottomLeftCornerSize(0.0f);
                updateMaterialShapeDrawable(builder2.build());
            }
        } else {
            throw new IllegalArgumentException("Invalid sheet edge position value: " + sheetEdge + ". Must be " + 0 + " or " + 1 + ".");
        }
    }

    private int getGravityFromSheetEdge() {
        if (this.sheetDelegate == null || this.sheetDelegate.getSheetEdge() == 0) {
            return 5;
        }
        return 3;
    }

    private boolean hasRightMargin() {
        CoordinatorLayout.LayoutParams layoutParams = getViewLayoutParams();
        return layoutParams != null && layoutParams.rightMargin > 0;
    }

    private boolean hasLeftMargin() {
        CoordinatorLayout.LayoutParams layoutParams = getViewLayoutParams();
        return layoutParams != null && layoutParams.leftMargin > 0;
    }

    private CoordinatorLayout.LayoutParams getViewLayoutParams() {
        View view;
        if (this.viewRef == null || (view = (View) this.viewRef.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
            return null;
        }
        return (CoordinatorLayout.LayoutParams) view.getLayoutParams();
    }

    private void updateMaterialShapeDrawable(ShapeAppearanceModel shapeAppearanceModel2) {
        if (this.materialShapeDrawable != null) {
            this.materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel2);
        }
    }

    public void expand() {
        setState(3);
    }

    public void hide() {
        setState(5);
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout parent, V child) {
        return new SavedState(super.onSaveInstanceState(parent, child), (SideSheetBehavior<?>) this);
    }

    public void onRestoreInstanceState(CoordinatorLayout parent, V child, Parcelable state2) {
        SavedState ss = (SavedState) state2;
        if (ss.getSuperState() != null) {
            super.onRestoreInstanceState(parent, child, ss.getSuperState());
        }
        this.state = (ss.state == 1 || ss.state == 2) ? 5 : ss.state;
        this.lastStableState = this.state;
    }

    public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    public boolean onMeasureChild(CoordinatorLayout parent, V child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        child.measure(getChildMeasureSpec(parentWidthMeasureSpec, parent.getPaddingLeft() + parent.getPaddingRight() + lp.leftMargin + lp.rightMargin + widthUsed, -1, lp.width), getChildMeasureSpec(parentHeightMeasureSpec, parent.getPaddingTop() + parent.getPaddingBottom() + lp.topMargin + lp.bottomMargin + heightUsed, -1, lp.height));
        return true;
    }

    private int getChildMeasureSpec(int parentMeasureSpec, int padding, int maxSize, int childDimension) {
        int i;
        int result = ViewGroup.getChildMeasureSpec(parentMeasureSpec, padding, childDimension);
        if (maxSize == -1) {
            return result;
        }
        int mode = View.MeasureSpec.getMode(result);
        int size = View.MeasureSpec.getSize(result);
        switch (mode) {
            case BasicMeasure.EXACTLY:
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, maxSize), BasicMeasure.EXACTLY);
            default:
                if (size == 0) {
                    i = maxSize;
                } else {
                    i = Math.min(size, maxSize);
                }
                return View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        }
    }

    public boolean onLayoutChild(CoordinatorLayout parent, V child, int layoutDirection) {
        if (ViewCompat.getFitsSystemWindows(parent) && !ViewCompat.getFitsSystemWindows(child)) {
            child.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.viewRef = new WeakReference<>(child);
            this.sideContainerBackHelper = new MaterialSideContainerBackHelper(child);
            if (this.materialShapeDrawable != null) {
                ViewCompat.setBackground(child, this.materialShapeDrawable);
                this.materialShapeDrawable.setElevation(this.elevation == -1.0f ? ViewCompat.getElevation(child) : this.elevation);
            } else if (this.backgroundTint != null) {
                ViewCompat.setBackgroundTintList(child, this.backgroundTint);
            }
            updateSheetVisibility(child);
            updateAccessibilityActions();
            if (ViewCompat.getImportantForAccessibility(child) == 0) {
                ViewCompat.setImportantForAccessibility(child, 1);
            }
            ensureAccessibilityPaneTitleIsSet(child);
        }
        setSheetEdge(child, layoutDirection);
        if (this.viewDragHelper == null) {
            this.viewDragHelper = ViewDragHelper.create(parent, this.dragCallback);
        }
        int savedOuterEdge = this.sheetDelegate.getOuterEdge(child);
        parent.onLayoutChild(child, layoutDirection);
        this.parentWidth = parent.getWidth();
        this.parentInnerEdge = this.sheetDelegate.getParentInnerEdge(parent);
        this.childWidth = child.getWidth();
        ViewGroup.MarginLayoutParams margins = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        this.innerMargin = margins != null ? this.sheetDelegate.calculateInnerMargin(margins) : 0;
        ViewCompat.offsetLeftAndRight(child, calculateCurrentOffset(savedOuterEdge, child));
        maybeAssignCoplanarSiblingViewBasedId(parent);
        for (SheetCallback callback : this.callbacks) {
            if (callback instanceof SideSheetCallback) {
                ((SideSheetCallback) callback).onLayout(child);
            }
        }
        return true;
    }

    private void updateSheetVisibility(View sheet) {
        int visibility = this.state == 5 ? 4 : 0;
        if (sheet.getVisibility() != visibility) {
            sheet.setVisibility(visibility);
        }
    }

    private void ensureAccessibilityPaneTitleIsSet(View sheet) {
        if (ViewCompat.getAccessibilityPaneTitle(sheet) == null) {
            ViewCompat.setAccessibilityPaneTitle(sheet, sheet.getResources().getString(DEFAULT_ACCESSIBILITY_PANE_TITLE));
        }
    }

    private void maybeAssignCoplanarSiblingViewBasedId(CoordinatorLayout parent) {
        View coplanarSiblingView;
        if (this.coplanarSiblingViewRef == null && this.coplanarSiblingViewId != -1 && (coplanarSiblingView = parent.findViewById(this.coplanarSiblingViewId)) != null) {
            this.coplanarSiblingViewRef = new WeakReference<>(coplanarSiblingView);
        }
    }

    /* access modifiers changed from: package-private */
    public int getChildWidth() {
        return this.childWidth;
    }

    /* access modifiers changed from: package-private */
    public int getParentWidth() {
        return this.parentWidth;
    }

    /* access modifiers changed from: package-private */
    public int getParentInnerEdge() {
        return this.parentInnerEdge;
    }

    /* access modifiers changed from: package-private */
    public int getInnerMargin() {
        return this.innerMargin;
    }

    private int calculateCurrentOffset(int savedOuterEdge, V child) {
        switch (this.state) {
            case 1:
            case 2:
                return savedOuterEdge - this.sheetDelegate.getOuterEdge(child);
            case 3:
                return 0;
            case 5:
                return this.sheetDelegate.getHiddenOffset();
            default:
                throw new IllegalStateException("Unexpected value: " + this.state);
        }
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout parent, V child, MotionEvent event) {
        if (!shouldInterceptTouchEvent(child)) {
            this.ignoreEvents = true;
            return false;
        }
        int action = event.getActionMasked();
        if (action == 0) {
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(event);
        switch (action) {
            case 0:
                this.initialX = (int) event.getX();
                break;
            case 1:
            case 3:
                if (this.ignoreEvents) {
                    this.ignoreEvents = false;
                    return false;
                }
                break;
        }
        if (this.ignoreEvents || this.viewDragHelper == null || !this.viewDragHelper.shouldInterceptTouchEvent(event)) {
            return false;
        }
        return true;
    }

    private boolean shouldInterceptTouchEvent(V child) {
        return (child.isShown() || ViewCompat.getAccessibilityPaneTitle(child) != null) && this.draggable;
    }

    /* access modifiers changed from: package-private */
    public int getSignificantVelocityThreshold() {
        return SIGNIFICANT_VEL_THRESHOLD;
    }

    public boolean onTouchEvent(CoordinatorLayout parent, V child, MotionEvent event) {
        if (!child.isShown()) {
            return false;
        }
        int action = event.getActionMasked();
        if (this.state == 1 && action == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.processTouchEvent(event);
        }
        if (action == 0) {
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(event);
        if (shouldHandleDraggingWithHelper() && action == 2 && !this.ignoreEvents && isDraggedFarEnough(event)) {
            this.viewDragHelper.captureChildView(child, event.getPointerId(event.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    private boolean isDraggedFarEnough(MotionEvent event) {
        if (shouldHandleDraggingWithHelper() && calculateDragDistance((float) this.initialX, event.getX()) > ((float) this.viewDragHelper.getTouchSlop())) {
            return true;
        }
        return false;
    }

    private float calculateDragDistance(float initialPoint, float currentPoint) {
        return Math.abs(initialPoint - currentPoint);
    }

    public int getExpandedOffset() {
        return this.sheetDelegate.getExpandedOffset();
    }

    public void setDraggable(boolean draggable2) {
        this.draggable = draggable2;
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public void setHideFriction(float hideFriction2) {
        this.hideFriction = hideFriction2;
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    /* access modifiers changed from: package-private */
    public float getHideThreshold() {
        return 0.5f;
    }

    public void addCallback(SideSheetCallback callback) {
        this.callbacks.add(callback);
    }

    public void removeCallback(SideSheetCallback callback) {
        this.callbacks.remove(callback);
    }

    public void setState(int state2) {
        if (state2 == 1 || state2 == 2) {
            throw new IllegalArgumentException("STATE_" + (state2 == 1 ? "DRAGGING" : "SETTLING") + " should not be set externally.");
        }
        int finalState = state2;
        if (this.viewRef == null || this.viewRef.get() == null) {
            setStateInternal(state2);
        } else {
            runAfterLayout((View) this.viewRef.get(), new SideSheetBehavior$$ExternalSyntheticLambda0(this, finalState));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setState$0$com-google-android-material-sidesheet-SideSheetBehavior  reason: not valid java name */
    public /* synthetic */ void m256lambda$setState$0$comgoogleandroidmaterialsidesheetSideSheetBehavior(int finalState) {
        V child = (View) this.viewRef.get();
        if (child != null) {
            startSettling(child, finalState, false);
        }
    }

    private void runAfterLayout(V child, Runnable runnable) {
        if (isLayingOut(child)) {
            child.post(runnable);
        } else {
            runnable.run();
        }
    }

    private boolean isLayingOut(V child) {
        ViewParent parent = child.getParent();
        return parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(child);
    }

    public int getState() {
        return this.state;
    }

    /* access modifiers changed from: package-private */
    public void setStateInternal(int state2) {
        View sheet;
        if (this.state != state2) {
            this.state = state2;
            if (state2 == 3 || state2 == 5) {
                this.lastStableState = state2;
            }
            if (this.viewRef != null && (sheet = (View) this.viewRef.get()) != null) {
                updateSheetVisibility(sheet);
                for (SideSheetCallback callback : this.callbacks) {
                    callback.onStateChanged(sheet, state2);
                }
                updateAccessibilityActions();
            }
        }
    }

    private void resetVelocity() {
        if (this.velocityTracker != null) {
            this.velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean shouldHide(View child, float velocity) {
        return this.sheetDelegate.shouldHide(child, velocity);
    }

    private boolean shouldHandleDraggingWithHelper() {
        return this.viewDragHelper != null && (this.draggable || this.state == 1);
    }

    private void createMaterialShapeDrawableIfNeeded(Context context) {
        if (this.shapeAppearanceModel != null) {
            this.materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
            this.materialShapeDrawable.initializeElevationOverlay(context);
            if (this.backgroundTint != null) {
                this.materialShapeDrawable.setFillColor(this.backgroundTint);
                return;
            }
            TypedValue defaultColor = new TypedValue();
            context.getTheme().resolveAttribute(16842801, defaultColor, true);
            this.materialShapeDrawable.setTint(defaultColor.data);
        }
    }

    /* access modifiers changed from: package-private */
    public float getXVelocity() {
        if (this.velocityTracker == null) {
            return 0.0f;
        }
        this.velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getXVelocity();
    }

    /* access modifiers changed from: private */
    public void startSettling(View child, int state2, boolean isReleasingView) {
        if (isSettling(child, state2, isReleasingView)) {
            setStateInternal(2);
            this.stateSettlingTracker.continueSettlingToState(state2);
            return;
        }
        setStateInternal(state2);
    }

    private boolean isSettling(View child, int state2, boolean isReleasingView) {
        int left = getOuterEdgeOffsetForState(state2);
        ViewDragHelper viewDragHelper2 = getViewDragHelper();
        return viewDragHelper2 != null && (!isReleasingView ? viewDragHelper2.smoothSlideViewTo(child, left, child.getTop()) : viewDragHelper2.settleCapturedViewAt(left, child.getTop()));
    }

    /* access modifiers changed from: package-private */
    public int getOuterEdgeOffsetForState(int state2) {
        switch (state2) {
            case 3:
                return getExpandedOffset();
            case 5:
                return this.sheetDelegate.getHiddenOffset();
            default:
                throw new IllegalArgumentException("Invalid state to get outer edge offset: " + state2);
        }
    }

    /* access modifiers changed from: package-private */
    public ViewDragHelper getViewDragHelper() {
        return this.viewDragHelper;
    }

    /* access modifiers changed from: private */
    public int calculateTargetStateOnViewReleased(View releasedChild, float xVelocity, float yVelocity) {
        if (isExpandingOutwards(xVelocity)) {
            return 3;
        }
        if (shouldHide(releasedChild, xVelocity) != 0) {
            if (this.sheetDelegate.isSwipeSignificant(xVelocity, yVelocity) || this.sheetDelegate.isReleasedCloseToInnerEdge(releasedChild)) {
                return 5;
            }
            return 3;
        } else if (xVelocity != 0.0f && SheetUtils.isSwipeMostlyHorizontal(xVelocity, yVelocity)) {
            return 5;
        } else {
            int currentLeft = releasedChild.getLeft();
            if (Math.abs(currentLeft - getExpandedOffset()) < Math.abs(currentLeft - this.sheetDelegate.getHiddenOffset())) {
                return 3;
            }
            return 5;
        }
    }

    private boolean isExpandingOutwards(float xVelocity) {
        return this.sheetDelegate.isExpandingOutwards(xVelocity);
    }

    /* access modifiers changed from: private */
    public void dispatchOnSlide(View child, int outerEdge) {
        if (!this.callbacks.isEmpty()) {
            float slideOffset = this.sheetDelegate.calculateSlideOffset(outerEdge);
            for (SideSheetCallback callback : this.callbacks) {
                callback.onSlide(child, slideOffset);
            }
        }
    }

    public void setCoplanarSiblingViewId(int coplanarSiblingViewId2) {
        this.coplanarSiblingViewId = coplanarSiblingViewId2;
        clearCoplanarSiblingView();
        if (this.viewRef != null) {
            View view = (View) this.viewRef.get();
            if (coplanarSiblingViewId2 != -1 && ViewCompat.isLaidOut(view)) {
                view.requestLayout();
            }
        }
    }

    public void setCoplanarSiblingView(View coplanarSiblingView) {
        this.coplanarSiblingViewId = -1;
        if (coplanarSiblingView == null) {
            clearCoplanarSiblingView();
            return;
        }
        this.coplanarSiblingViewRef = new WeakReference<>(coplanarSiblingView);
        if (this.viewRef != null) {
            View view = (View) this.viewRef.get();
            if (ViewCompat.isLaidOut(view)) {
                view.requestLayout();
            }
        }
    }

    public View getCoplanarSiblingView() {
        if (this.coplanarSiblingViewRef != null) {
            return (View) this.coplanarSiblingViewRef.get();
        }
        return null;
    }

    private void clearCoplanarSiblingView() {
        if (this.coplanarSiblingViewRef != null) {
            this.coplanarSiblingViewRef.clear();
        }
        this.coplanarSiblingViewRef = null;
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    public int getLastStableState() {
        return this.lastStableState;
    }

    public void startBackProgress(BackEventCompat backEvent) {
        if (this.sideContainerBackHelper != null) {
            this.sideContainerBackHelper.startBackProgress(backEvent);
        }
    }

    public void updateBackProgress(BackEventCompat backEvent) {
        if (this.sideContainerBackHelper != null) {
            this.sideContainerBackHelper.updateBackProgress(backEvent, getGravityFromSheetEdge());
            updateCoplanarSiblingBackProgress();
        }
    }

    private void updateCoplanarSiblingBackProgress() {
        ViewGroup.MarginLayoutParams coplanarSiblingLayoutParams;
        if (this.viewRef != null && this.viewRef.get() != null) {
            View sheet = (View) this.viewRef.get();
            View coplanarSiblingView = getCoplanarSiblingView();
            if (coplanarSiblingView != null && (coplanarSiblingLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(coplanarSiblingLayoutParams, (int) ((((float) this.childWidth) * sheet.getScaleX()) + ((float) this.innerMargin)));
                coplanarSiblingView.requestLayout();
            }
        }
    }

    public void handleBackInvoked() {
        if (this.sideContainerBackHelper != null) {
            BackEventCompat backEvent = this.sideContainerBackHelper.onHandleBackInvoked();
            if (backEvent == null || Build.VERSION.SDK_INT < 34) {
                setState(5);
            } else {
                this.sideContainerBackHelper.finishBackProgress(backEvent, getGravityFromSheetEdge(), new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animation) {
                        SideSheetBehavior.this.setStateInternal(5);
                        if (SideSheetBehavior.this.viewRef != null && SideSheetBehavior.this.viewRef.get() != null) {
                            ((View) SideSheetBehavior.this.viewRef.get()).requestLayout();
                        }
                    }
                }, getCoplanarFinishAnimatorUpdateListener());
            }
        }
    }

    private ValueAnimator.AnimatorUpdateListener getCoplanarFinishAnimatorUpdateListener() {
        ViewGroup.MarginLayoutParams coplanarSiblingLayoutParams;
        View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (coplanarSiblingLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return null;
        }
        return new SideSheetBehavior$$ExternalSyntheticLambda2(this, coplanarSiblingLayoutParams, this.sheetDelegate.getCoplanarSiblingAdjacentMargin(coplanarSiblingLayoutParams), coplanarSiblingView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$getCoplanarFinishAnimatorUpdateListener$1$com-google-android-material-sidesheet-SideSheetBehavior  reason: not valid java name */
    public /* synthetic */ void m255lambda$getCoplanarFinishAnimatorUpdateListener$1$comgoogleandroidmaterialsidesheetSideSheetBehavior(ViewGroup.MarginLayoutParams coplanarSiblingLayoutParams, int coplanarSiblingAdjacentMargin, View coplanarSiblingView, ValueAnimator animation) {
        this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(coplanarSiblingLayoutParams, AnimationUtils.lerp(coplanarSiblingAdjacentMargin, 0, animation.getAnimatedFraction()));
        coplanarSiblingView.requestLayout();
    }

    public void cancelBackProgress() {
        if (this.sideContainerBackHelper != null) {
            this.sideContainerBackHelper.cancelBackProgress();
        }
    }

    /* access modifiers changed from: package-private */
    public MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    class StateSettlingTracker {
        private final Runnable continueSettlingRunnable = new SideSheetBehavior$StateSettlingTracker$$ExternalSyntheticLambda0(this);
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        StateSettlingTracker() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$new$0$com-google-android-material-sidesheet-SideSheetBehavior$StateSettlingTracker  reason: not valid java name */
        public /* synthetic */ void m257lambda$new$0$comgoogleandroidmaterialsidesheetSideSheetBehavior$StateSettlingTracker() {
            this.isContinueSettlingRunnablePosted = false;
            if (SideSheetBehavior.this.viewDragHelper != null && SideSheetBehavior.this.viewDragHelper.continueSettling(true)) {
                continueSettlingToState(this.targetState);
            } else if (SideSheetBehavior.this.state == 2) {
                SideSheetBehavior.this.setStateInternal(this.targetState);
            }
        }

        /* access modifiers changed from: package-private */
        public void continueSettlingToState(int targetState2) {
            if (SideSheetBehavior.this.viewRef != null && SideSheetBehavior.this.viewRef.get() != null) {
                this.targetState = targetState2;
                if (!this.isContinueSettlingRunnablePosted) {
                    ViewCompat.postOnAnimation((View) SideSheetBehavior.this.viewRef.get(), this.continueSettlingRunnable);
                    this.isContinueSettlingRunnablePosted = true;
                }
            }
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            public SavedState createFromParcel(Parcel in, ClassLoader loader) {
                return new SavedState(in, loader);
            }

            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in, (ClassLoader) null);
            }

            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        };
        final int state;

        public SavedState(Parcel source) {
            this(source, (ClassLoader) null);
        }

        public SavedState(Parcel source, ClassLoader loader) {
            super(source, loader);
            this.state = source.readInt();
        }

        public SavedState(Parcelable superState, SideSheetBehavior<?> behavior) {
            super(superState);
            this.state = behavior.state;
        }

        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.state);
        }
    }

    public static <V extends View> SideSheetBehavior<V> from(V view) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        if (params instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior<?> behavior = ((CoordinatorLayout.LayoutParams) params).getBehavior();
            if (behavior instanceof SideSheetBehavior) {
                return (SideSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private void updateAccessibilityActions() {
        V child;
        if (this.viewRef != null && (child = (View) this.viewRef.get()) != null) {
            ViewCompat.removeAccessibilityAction(child, 262144);
            ViewCompat.removeAccessibilityAction(child, 1048576);
            if (this.state != 5) {
                replaceAccessibilityActionForState(child, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
            }
            if (this.state != 3) {
                replaceAccessibilityActionForState(child, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
            }
        }
    }

    private void replaceAccessibilityActionForState(V child, AccessibilityNodeInfoCompat.AccessibilityActionCompat action, int state2) {
        ViewCompat.replaceAccessibilityAction(child, action, (CharSequence) null, createAccessibilityViewCommandForState(state2));
    }

    private AccessibilityViewCommand createAccessibilityViewCommandForState(int state2) {
        return new SideSheetBehavior$$ExternalSyntheticLambda1(this, state2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$createAccessibilityViewCommandForState$2$com-google-android-material-sidesheet-SideSheetBehavior  reason: not valid java name */
    public /* synthetic */ boolean m254lambda$createAccessibilityViewCommandForState$2$comgoogleandroidmaterialsidesheetSideSheetBehavior(int state2, View view, AccessibilityViewCommand.CommandArguments arguments) {
        setState(state2);
        return true;
    }
}
