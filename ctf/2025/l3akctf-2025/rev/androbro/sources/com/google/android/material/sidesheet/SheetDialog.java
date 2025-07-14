package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.sidesheet.SheetCallback;

abstract class SheetDialog<C extends SheetCallback> extends AppCompatDialog {
    private static final int COORDINATOR_LAYOUT_ID = R.id.coordinator;
    private static final int TOUCH_OUTSIDE_ID = R.id.touch_outside;
    private MaterialBackOrchestrator backOrchestrator;
    private Sheet<C> behavior;
    boolean cancelable = true;
    private boolean canceledOnTouchOutside = true;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    boolean dismissWithAnimation;
    private FrameLayout sheet;

    /* access modifiers changed from: package-private */
    public abstract void addSheetCancelOnHideCallback(Sheet<C> sheet2);

    /* access modifiers changed from: package-private */
    public abstract Sheet<C> getBehaviorFromSheet(FrameLayout frameLayout);

    /* access modifiers changed from: package-private */
    public abstract int getDialogId();

    /* access modifiers changed from: package-private */
    public abstract int getLayoutResId();

    /* access modifiers changed from: package-private */
    public abstract int getStateOnStart();

    SheetDialog(Context context, int theme, int themeAttr, int defaultThemeAttr) {
        super(context, getThemeResId(context, theme, themeAttr, defaultThemeAttr));
        supportRequestWindowFeature(1);
    }

    public void setContentView(int layoutResId) {
        super.setContentView(wrapInSheet(layoutResId, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view) {
        super.setContentView(wrapInSheet(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(wrapInSheet(0, view, params));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public void setCancelable(boolean cancelable2) {
        super.setCancelable(cancelable2);
        if (this.cancelable != cancelable2) {
            this.cancelable = cancelable2;
        }
        if (getWindow() != null) {
            updateListeningForBackCallbacks();
        }
    }

    private void updateListeningForBackCallbacks() {
        if (this.backOrchestrator != null) {
            if (this.cancelable) {
                this.backOrchestrator.startListeningForBackCallbacks();
            } else {
                this.backOrchestrator.stopListeningForBackCallbacks();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.behavior != null && this.behavior.getState() == 5) {
            this.behavior.setState(getStateOnStart());
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeUpdateWindowAnimationsBasedOnLayoutDirection();
        updateListeningForBackCallbacks();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.backOrchestrator != null) {
            this.backOrchestrator.stopListeningForBackCallbacks();
        }
    }

    public void cancel() {
        Sheet<C> behavior2 = getBehavior();
        if (!this.dismissWithAnimation || behavior2.getState() == 5) {
            super.cancel();
        } else {
            behavior2.setState(5);
        }
    }

    public void setCanceledOnTouchOutside(boolean cancel) {
        super.setCanceledOnTouchOutside(cancel);
        if (cancel && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = cancel;
        this.canceledOnTouchOutsideSet = true;
    }

    public void setDismissWithSheetAnimationEnabled(boolean dismissWithAnimation2) {
        this.dismissWithAnimation = dismissWithAnimation2;
    }

    public boolean isDismissWithSheetAnimationEnabled() {
        return this.dismissWithAnimation;
    }

    private void ensureContainerAndBehavior() {
        if (this.container == null) {
            this.container = (FrameLayout) View.inflate(getContext(), getLayoutResId(), (ViewGroup) null);
            this.sheet = (FrameLayout) this.container.findViewById(getDialogId());
            this.behavior = getBehaviorFromSheet(this.sheet);
            addSheetCancelOnHideCallback(this.behavior);
            this.backOrchestrator = new MaterialBackOrchestrator(this.behavior, this.sheet);
        }
    }

    private FrameLayout getContainer() {
        if (this.container == null) {
            ensureContainerAndBehavior();
        }
        return this.container;
    }

    private FrameLayout getSheet() {
        if (this.sheet == null) {
            ensureContainerAndBehavior();
        }
        return this.sheet;
    }

    /* access modifiers changed from: package-private */
    public Sheet<C> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    private View wrapInSheet(int layoutResId, View view, ViewGroup.LayoutParams params) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinator = (CoordinatorLayout) getContainer().findViewById(COORDINATOR_LAYOUT_ID);
        if (layoutResId != 0 && view == null) {
            view = getLayoutInflater().inflate(layoutResId, coordinator, false);
        }
        FrameLayout sheet2 = getSheet();
        sheet2.removeAllViews();
        if (params == null) {
            sheet2.addView(view);
        } else {
            sheet2.addView(view, params);
        }
        coordinator.findViewById(TOUCH_OUTSIDE_ID).setOnClickListener(new SheetDialog$$ExternalSyntheticLambda0(this));
        ViewCompat.setAccessibilityDelegate(getSheet(), new AccessibilityDelegateCompat() {
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                super.onInitializeAccessibilityNodeInfo(host, info);
                if (SheetDialog.this.cancelable) {
                    info.addAction(1048576);
                    info.setDismissable(true);
                    return;
                }
                info.setDismissable(false);
            }

            public boolean performAccessibilityAction(View host, int action, Bundle args) {
                if (action != 1048576 || !SheetDialog.this.cancelable) {
                    return super.performAccessibilityAction(host, action, args);
                }
                SheetDialog.this.cancel();
                return true;
            }
        });
        return this.container;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$wrapInSheet$0$com-google-android-material-sidesheet-SheetDialog  reason: not valid java name */
    public /* synthetic */ void m253lambda$wrapInSheet$0$comgoogleandroidmaterialsidesheetSheetDialog(View v) {
        if (this.cancelable && isShowing() && shouldWindowCloseOnTouchOutside()) {
            cancel();
        }
    }

    public void setSheetEdge(int gravity) {
        if (this.sheet == null) {
            throw new IllegalStateException("Sheet view reference is null; sheet edge cannot be changed if the sheet view is null.");
        } else if (!ViewCompat.isLaidOut(this.sheet)) {
            ViewGroup.LayoutParams layoutParams = this.sheet.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                ((CoordinatorLayout.LayoutParams) layoutParams).gravity = gravity;
                maybeUpdateWindowAnimationsBasedOnLayoutDirection();
            }
        } else {
            throw new IllegalStateException("Sheet view has been laid out; sheet edge cannot be changed once the sheet has been laid out.");
        }
    }

    private void maybeUpdateWindowAnimationsBasedOnLayoutDirection() {
        int i;
        Window window = getWindow();
        if (window != null && this.sheet != null && (this.sheet.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
            if (GravityCompat.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) this.sheet.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(this.sheet)) == 3) {
                i = R.style.Animation_Material3_SideSheetDialog_Left;
            } else {
                i = R.style.Animation_Material3_SideSheetDialog_Right;
            }
            window.setWindowAnimations(i);
        }
    }

    private boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray a = getContext().obtainStyledAttributes(new int[]{16843611});
            this.canceledOnTouchOutside = a.getBoolean(0, true);
            a.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    private static int getThemeResId(Context context, int themeId, int themeAttr, int defaultTheme) {
        if (themeId != 0) {
            return themeId;
        }
        TypedValue outValue = new TypedValue();
        if (context.getTheme().resolveAttribute(themeAttr, outValue, true)) {
            return outValue.resourceId;
        }
        return defaultTheme;
    }
}
