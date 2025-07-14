package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.internal.MaterialCheckable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.List;

public class Chip extends AppCompatCheckBox implements ChipDrawable.Delegate, Shapeable, MaterialCheckable<Chip> {
    private static final String BUTTON_ACCESSIBILITY_CLASS_NAME = "android.widget.Button";
    private static final int[] CHECKABLE_STATE_SET = {16842911};
    private static final int CHIP_BODY_VIRTUAL_ID = 0;
    private static final int CLOSE_ICON_VIRTUAL_ID = 1;
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_Chip_Action;
    /* access modifiers changed from: private */
    public static final Rect EMPTY_BOUNDS = new Rect();
    private static final String GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME = "android.view.View";
    private static final int MIN_TOUCH_TARGET_DP = 48;
    private static final String NAMESPACE_ANDROID = "http://schemas.android.com/apk/res/android";
    private static final String RADIO_BUTTON_ACCESSIBILITY_CLASS_NAME = "android.widget.RadioButton";
    private static final int[] SELECTED_STATE = {16842913};
    private static final String TAG = "Chip";
    private CharSequence accessibilityClassName;
    /* access modifiers changed from: private */
    public ChipDrawable chipDrawable;
    /* access modifiers changed from: private */
    public boolean closeIconFocused;
    private boolean closeIconHovered;
    private boolean closeIconPressed;
    private boolean deferredCheckedValue;
    private boolean ensureMinTouchTargetSize;
    private final TextAppearanceFontCallback fontCallback;
    private InsetDrawable insetBackgroundDrawable;
    private int lastLayoutDirection;
    private int minTouchTargetSize;
    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
    private MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListenerInternal;
    /* access modifiers changed from: private */
    public View.OnClickListener onCloseIconClickListener;
    private final Rect rect;
    private final RectF rectF;
    private RippleDrawable ripple;
    private final ChipTouchHelper touchHelper;
    private boolean touchHelperEnabled;

    public Chip(Context context) {
        this(context, (AttributeSet) null);
    }

    public Chip(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.chipStyle);
    }

    public Chip(Context context, AttributeSet attrs, int defStyleAttr) {
        super(MaterialThemeOverlay.wrap(context, attrs, defStyleAttr, DEF_STYLE_RES), attrs, defStyleAttr);
        this.rect = new Rect();
        this.rectF = new RectF();
        this.fontCallback = new TextAppearanceFontCallback() {
            public void onFontRetrieved(Typeface typeface, boolean fontResolvedSynchronously) {
                Chip.this.setText(Chip.this.chipDrawable.shouldDrawText() ? Chip.this.chipDrawable.getText() : Chip.this.getText());
                Chip.this.requestLayout();
                Chip.this.invalidate();
            }

            public void onFontRetrievalFailed(int reason) {
            }
        };
        Context context2 = getContext();
        validateAttributes(attrs);
        ChipDrawable drawable = ChipDrawable.createFromAttributes(context2, attrs, defStyleAttr, DEF_STYLE_RES);
        initMinTouchTarget(context2, attrs, defStyleAttr);
        setChipDrawable(drawable);
        drawable.setElevation(ViewCompat.getElevation(this));
        TypedArray a = ThemeEnforcement.obtainStyledAttributes(context2, attrs, R.styleable.Chip, defStyleAttr, DEF_STYLE_RES, new int[0]);
        boolean hasShapeAppearanceAttribute = a.hasValue(R.styleable.Chip_shapeAppearance);
        a.recycle();
        this.touchHelper = new ChipTouchHelper(this);
        updateAccessibilityDelegate();
        if (!hasShapeAppearanceAttribute) {
            initOutlineProvider();
        }
        setChecked(this.deferredCheckedValue);
        setText(drawable.getText());
        setEllipsize(drawable.getEllipsize());
        updateTextPaintDrawState();
        if (!this.chipDrawable.shouldDrawText()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        updatePaddingInternal();
        if (shouldEnsureMinTouchTargetSize()) {
            setMinHeight(this.minTouchTargetSize);
        }
        this.lastLayoutDirection = ViewCompat.getLayoutDirection(this);
        super.setOnCheckedChangeListener(new Chip$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$new$0$com-google-android-material-chip-Chip  reason: not valid java name */
    public /* synthetic */ void m191lambda$new$0$comgoogleandroidmaterialchipChip(CompoundButton buttonView, boolean isChecked) {
        if (this.onCheckedChangeListenerInternal != null) {
            this.onCheckedChangeListenerInternal.onCheckedChanged(this, isChecked);
        }
        if (this.onCheckedChangeListener != null) {
            this.onCheckedChangeListener.onCheckedChanged(buttonView, isChecked);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.chipDrawable);
    }

    public void setElevation(float elevation) {
        super.setElevation(elevation);
        if (this.chipDrawable != null) {
            this.chipDrawable.setElevation(elevation);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(getAccessibilityClassName());
        info.setCheckable(isCheckable());
        info.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            AccessibilityNodeInfoCompat.wrap(info).setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(chipGroup.getRowIndex(this), 1, chipGroup.isSingleLine() ? chipGroup.getIndexOfChip(this) : -1, 1, false, isChecked()));
        }
    }

    private void updateAccessibilityDelegate() {
        if (!hasCloseIcon() || !isCloseIconVisible() || this.onCloseIconClickListener == null) {
            ViewCompat.setAccessibilityDelegate(this, (AccessibilityDelegateCompat) null);
            this.touchHelperEnabled = false;
            return;
        }
        ViewCompat.setAccessibilityDelegate(this, this.touchHelper);
        this.touchHelperEnabled = true;
    }

    private void initMinTouchTarget(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray a = ThemeEnforcement.obtainStyledAttributes(context, attrs, R.styleable.Chip, defStyleAttr, DEF_STYLE_RES, new int[0]);
        this.ensureMinTouchTargetSize = a.getBoolean(R.styleable.Chip_ensureMinTouchTargetSize, false);
        this.minTouchTargetSize = (int) Math.ceil((double) a.getDimension(R.styleable.Chip_chipMinTouchTargetSize, (float) Math.ceil((double) ViewUtils.dpToPx(getContext(), 48))));
        a.recycle();
    }

    private void updatePaddingInternal() {
        if (!TextUtils.isEmpty(getText()) && this.chipDrawable != null) {
            int paddingEnd = (int) (this.chipDrawable.getChipEndPadding() + this.chipDrawable.getTextEndPadding() + this.chipDrawable.calculateCloseIconWidth());
            int paddingStart = (int) (this.chipDrawable.getChipStartPadding() + this.chipDrawable.getTextStartPadding() + this.chipDrawable.calculateChipIconWidth());
            if (this.insetBackgroundDrawable != null) {
                Rect padding = new Rect();
                this.insetBackgroundDrawable.getPadding(padding);
                paddingStart += padding.left;
                paddingEnd += padding.right;
            }
            ViewCompat.setPaddingRelative(this, paddingStart, getPaddingTop(), paddingEnd, getPaddingBottom());
        }
    }

    public void onRtlPropertiesChanged(int layoutDirection) {
        super.onRtlPropertiesChanged(layoutDirection);
        if (this.lastLayoutDirection != layoutDirection) {
            this.lastLayoutDirection = layoutDirection;
            updatePaddingInternal();
        }
    }

    private void validateAttributes(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue(NAMESPACE_ANDROID, "background") != null) {
                Log.w(TAG, "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue(NAMESPACE_ANDROID, "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue(NAMESPACE_ANDROID, "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue(NAMESPACE_ANDROID, "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue(NAMESPACE_ANDROID, "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue(NAMESPACE_ANDROID, "singleLine", true) || attributeSet.getAttributeIntValue(NAMESPACE_ANDROID, "lines", 1) != 1 || attributeSet.getAttributeIntValue(NAMESPACE_ANDROID, "minLines", 1) != 1 || attributeSet.getAttributeIntValue(NAMESPACE_ANDROID, "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue(NAMESPACE_ANDROID, "gravity", 8388627) != 8388627) {
                Log.w(TAG, "Chip text must be vertically center and start aligned");
            }
        }
    }

    private void initOutlineProvider() {
        setOutlineProvider(new ViewOutlineProvider() {
            public void getOutline(View view, Outline outline) {
                if (Chip.this.chipDrawable != null) {
                    Chip.this.chipDrawable.getOutline(outline);
                } else {
                    outline.setAlpha(0.0f);
                }
            }
        });
    }

    public Drawable getChipDrawable() {
        return this.chipDrawable;
    }

    public void setChipDrawable(ChipDrawable drawable) {
        if (this.chipDrawable != drawable) {
            unapplyChipDrawable(this.chipDrawable);
            this.chipDrawable = drawable;
            this.chipDrawable.setShouldDrawText(false);
            applyChipDrawable(this.chipDrawable);
            ensureAccessibleTouchTarget(this.minTouchTargetSize);
        }
    }

    private void updateBackgroundDrawable() {
        if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
            updateFrameworkRippleBackground();
            return;
        }
        this.chipDrawable.setUseCompatRipple(true);
        ViewCompat.setBackground(this, getBackgroundDrawable());
        updatePaddingInternal();
        ensureChipDrawableHasCallback();
    }

    private void ensureChipDrawableHasCallback() {
        if (getBackgroundDrawable() == this.insetBackgroundDrawable && this.chipDrawable.getCallback() == null) {
            this.chipDrawable.setCallback(this.insetBackgroundDrawable);
        }
    }

    public Drawable getBackgroundDrawable() {
        if (this.insetBackgroundDrawable == null) {
            return this.chipDrawable;
        }
        return this.insetBackgroundDrawable;
    }

    private void updateFrameworkRippleBackground() {
        this.ripple = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.chipDrawable.getRippleColor()), getBackgroundDrawable(), (Drawable) null);
        this.chipDrawable.setUseCompatRipple(false);
        ViewCompat.setBackground(this, this.ripple);
        updatePaddingInternal();
    }

    private void unapplyChipDrawable(ChipDrawable chipDrawable2) {
        if (chipDrawable2 != null) {
            chipDrawable2.setDelegate((ChipDrawable.Delegate) null);
        }
    }

    private void applyChipDrawable(ChipDrawable chipDrawable2) {
        chipDrawable2.setDelegate(this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int extraSpace) {
        int[] state = super.onCreateDrawableState(extraSpace + 2);
        if (isChecked()) {
            mergeDrawableStates(state, SELECTED_STATE);
        }
        if (isCheckable()) {
            mergeDrawableStates(state, CHECKABLE_STATE_SET);
        }
        return state;
    }

    public void setGravity(int gravity) {
        if (gravity != 8388627) {
            Log.w(TAG, "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(gravity);
        }
    }

    public void setBackgroundTintList(ColorStateList tint) {
        Log.w(TAG, "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode tintMode) {
        Log.w(TAG, "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setBackgroundColor(int color) {
        Log.w(TAG, "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundResource(int resid) {
        Log.w(TAG, "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackground(Drawable background) {
        if (background == getBackgroundDrawable() || background == this.ripple) {
            super.setBackground(background);
        } else {
            Log.w(TAG, "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        if (background == getBackgroundDrawable() || background == this.ripple) {
            super.setBackgroundDrawable(background);
        } else {
            Log.w(TAG, "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setCompoundDrawables(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        if (left != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (right == null) {
            super.setCompoundDrawables(left, top, right, bottom);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int left, int top, int right, int bottom) {
        if (left != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (right == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        if (left != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (right == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        if (start != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (end == null) {
            super.setCompoundDrawablesRelative(start, top, end, bottom);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int start, int top, int end, int bottom) {
        if (start != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (end == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        if (start != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (end == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public TextUtils.TruncateAt getEllipsize() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getEllipsize();
        }
        return null;
    }

    public void setEllipsize(TextUtils.TruncateAt where) {
        if (this.chipDrawable != null) {
            if (where != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(where);
                if (this.chipDrawable != null) {
                    this.chipDrawable.setEllipsize(where);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setSingleLine(boolean singleLine) {
        if (singleLine) {
            super.setSingleLine(singleLine);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setLines(int lines) {
        if (lines <= 1) {
            super.setLines(lines);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMinLines(int minLines) {
        if (minLines <= 1) {
            super.setMinLines(minLines);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int maxLines) {
        if (maxLines <= 1) {
            super.setMaxLines(maxLines);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int maxWidth) {
        super.setMaxWidth(maxWidth);
        if (this.chipDrawable != null) {
            this.chipDrawable.setMaxWidth(maxWidth);
        }
    }

    public void onChipDrawableSizeChange() {
        ensureAccessibleTouchTarget(this.minTouchTargetSize);
        requestLayout();
        invalidateOutline();
    }

    public void setChecked(boolean checked) {
        if (this.chipDrawable == null) {
            this.deferredCheckedValue = checked;
        } else if (this.chipDrawable.isCheckable()) {
            super.setChecked(checked);
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener listener) {
        this.onCheckedChangeListener = listener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener listener) {
        this.onCloseIconClickListener = listener;
        updateAccessibilityDelegate();
    }

    public boolean performCloseIconClick() {
        boolean result;
        playSoundEffect(0);
        if (this.onCloseIconClickListener != null) {
            this.onCloseIconClickListener.onClick(this);
            result = true;
        } else {
            result = false;
        }
        if (this.touchHelperEnabled) {
            this.touchHelper.sendEventForVirtualView(1, 1);
        }
        return result;
    }

    public boolean onTouchEvent(MotionEvent event) {
        boolean handled = false;
        int action = event.getActionMasked();
        boolean eventInCloseIcon = getCloseIconTouchBounds().contains(event.getX(), event.getY());
        switch (action) {
            case 0:
                if (eventInCloseIcon) {
                    setCloseIconPressed(true);
                    handled = true;
                    break;
                }
                break;
            case 1:
                if (this.closeIconPressed) {
                    performCloseIconClick();
                    handled = true;
                    break;
                }
                break;
            case 2:
                if (this.closeIconPressed) {
                    if (!eventInCloseIcon) {
                        setCloseIconPressed(false);
                    }
                    handled = true;
                    break;
                }
                break;
            case 3:
                break;
        }
        setCloseIconPressed(false);
        if (handled || super.onTouchEvent(event)) {
            return true;
        }
        return false;
    }

    public boolean onHoverEvent(MotionEvent event) {
        switch (event.getActionMasked()) {
            case 7:
                setCloseIconHovered(getCloseIconTouchBounds().contains(event.getX(), event.getY()));
                break;
            case 10:
                setCloseIconHovered(false);
                break;
        }
        return super.onHoverEvent(event);
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent event) {
        if (!this.touchHelperEnabled) {
            return super.dispatchHoverEvent(event);
        }
        return this.touchHelper.dispatchHoverEvent(event) || super.dispatchHoverEvent(event);
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        if (!this.touchHelperEnabled) {
            return super.dispatchKeyEvent(event);
        }
        if (!this.touchHelper.dispatchKeyEvent(event) || this.touchHelper.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(event);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
        if (this.touchHelperEnabled) {
            this.touchHelper.onFocusChanged(focused, direction, previouslyFocusedRect);
        }
    }

    public void getFocusedRect(Rect r) {
        if (!this.touchHelperEnabled || !(this.touchHelper.getKeyboardFocusedVirtualViewId() == 1 || this.touchHelper.getAccessibilityFocusedVirtualViewId() == 1)) {
            super.getFocusedRect(r);
        } else {
            r.set(getCloseIconTouchBoundsInt());
        }
    }

    private void setCloseIconPressed(boolean pressed) {
        if (this.closeIconPressed != pressed) {
            this.closeIconPressed = pressed;
            refreshDrawableState();
        }
    }

    private void setCloseIconHovered(boolean hovered) {
        if (this.closeIconHovered != hovered) {
            this.closeIconHovered = hovered;
            refreshDrawableState();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        boolean changed = false;
        if (this.chipDrawable != null && this.chipDrawable.isCloseIconStateful()) {
            changed = this.chipDrawable.setCloseIconState(createCloseIconDrawableState());
        }
        if (changed) {
            invalidate();
        }
    }

    private int[] createCloseIconDrawableState() {
        int count = 0;
        if (isEnabled()) {
            count = 0 + 1;
        }
        if (this.closeIconFocused) {
            count++;
        }
        if (this.closeIconHovered) {
            count++;
        }
        if (this.closeIconPressed) {
            count++;
        }
        if (isChecked()) {
            count++;
        }
        int[] stateSet = new int[count];
        int i = 0;
        if (isEnabled()) {
            stateSet[0] = 16842910;
            i = 0 + 1;
        }
        if (this.closeIconFocused) {
            stateSet[i] = 16842908;
            i++;
        }
        if (this.closeIconHovered) {
            stateSet[i] = 16843623;
            i++;
        }
        if (this.closeIconPressed) {
            stateSet[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            stateSet[i] = 16842913;
            int i2 = i + 1;
        }
        return stateSet;
    }

    /* access modifiers changed from: private */
    public boolean hasCloseIcon() {
        return (this.chipDrawable == null || this.chipDrawable.getCloseIcon() == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.rectF.setEmpty();
        if (hasCloseIcon() && this.onCloseIconClickListener != null) {
            this.chipDrawable.getCloseIconTouchBounds(this.rectF);
        }
        return this.rectF;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF bounds = getCloseIconTouchBounds();
        this.rect.set((int) bounds.left, (int) bounds.top, (int) bounds.right, (int) bounds.bottom);
        return this.rect;
    }

    public PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) {
        if (!getCloseIconTouchBounds().contains(event.getX(), event.getY()) || !isEnabled()) {
            return super.onResolvePointerIcon(event, pointerIndex);
        }
        return PointerIcon.getSystemIcon(getContext(), PointerIconCompat.TYPE_HAND);
    }

    public void setInternalOnCheckedChangeListener(MaterialCheckable.OnCheckedChangeListener<Chip> listener) {
        this.onCheckedChangeListenerInternal = listener;
    }

    private class ChipTouchHelper extends ExploreByTouchHelper {
        ChipTouchHelper(Chip view) {
            super(view);
        }

        /* access modifiers changed from: protected */
        public int getVirtualViewAt(float x, float y) {
            if (!Chip.this.hasCloseIcon() || !Chip.this.getCloseIconTouchBounds().contains(x, y)) {
                return 0;
            }
            return 1;
        }

        /* access modifiers changed from: protected */
        public void getVisibleVirtualViews(List<Integer> virtualViewIds) {
            virtualViewIds.add(0);
            if (Chip.this.hasCloseIcon() && Chip.this.isCloseIconVisible() && Chip.this.onCloseIconClickListener != null) {
                virtualViewIds.add(1);
            }
        }

        /* access modifiers changed from: protected */
        public void onVirtualViewKeyboardFocusChanged(int virtualViewId, boolean hasFocus) {
            if (virtualViewId == 1) {
                boolean unused = Chip.this.closeIconFocused = hasFocus;
                Chip.this.refreshDrawableState();
            }
        }

        /* access modifiers changed from: protected */
        public void onPopulateNodeForVirtualView(int virtualViewId, AccessibilityNodeInfoCompat node) {
            CharSequence charSequence = "";
            if (virtualViewId == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    node.setContentDescription(closeIconContentDescription);
                } else {
                    CharSequence chipText = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i = R.string.mtrl_chip_close_icon_content_description;
                    if (!TextUtils.isEmpty(chipText)) {
                        charSequence = chipText;
                    }
                    node.setContentDescription(context.getString(i, new Object[]{charSequence}).trim());
                }
                node.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                node.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                node.setEnabled(Chip.this.isEnabled());
                return;
            }
            node.setContentDescription(charSequence);
            node.setBoundsInParent(Chip.EMPTY_BOUNDS);
        }

        /* access modifiers changed from: protected */
        public void onPopulateNodeForHost(AccessibilityNodeInfoCompat node) {
            node.setCheckable(Chip.this.isCheckable());
            node.setClickable(Chip.this.isClickable());
            node.setClassName(Chip.this.getAccessibilityClassName());
            node.setText(Chip.this.getText());
        }

        /* access modifiers changed from: protected */
        public boolean onPerformActionForVirtualView(int virtualViewId, int action, Bundle arguments) {
            if (action != 16) {
                return false;
            }
            if (virtualViewId == 0) {
                return Chip.this.performClick();
            }
            if (virtualViewId == 1) {
                return Chip.this.performCloseIconClick();
            }
            return false;
        }
    }

    public ColorStateList getChipBackgroundColor() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getChipBackgroundColor();
        }
        return null;
    }

    public void setChipBackgroundColorResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipBackgroundColorResource(id);
        }
    }

    public void setChipBackgroundColor(ColorStateList chipBackgroundColor) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipBackgroundColor(chipBackgroundColor);
        }
    }

    public float getChipMinHeight() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getChipMinHeight();
        }
        return 0.0f;
    }

    public void setChipMinHeightResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipMinHeightResource(id);
        }
    }

    public void setChipMinHeight(float minHeight) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipMinHeight(minHeight);
        }
    }

    public float getChipCornerRadius() {
        if (this.chipDrawable != null) {
            return Math.max(0.0f, this.chipDrawable.getChipCornerRadius());
        }
        return 0.0f;
    }

    @Deprecated
    public void setChipCornerRadiusResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipCornerRadiusResource(id);
        }
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.chipDrawable.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.chipDrawable.getShapeAppearanceModel();
    }

    @Deprecated
    public void setChipCornerRadius(float chipCornerRadius) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipCornerRadius(chipCornerRadius);
        }
    }

    public ColorStateList getChipStrokeColor() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getChipStrokeColor();
        }
        return null;
    }

    public void setChipStrokeColorResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipStrokeColorResource(id);
        }
    }

    public void setChipStrokeColor(ColorStateList chipStrokeColor) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipStrokeColor(chipStrokeColor);
        }
    }

    public float getChipStrokeWidth() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getChipStrokeWidth();
        }
        return 0.0f;
    }

    public void setChipStrokeWidthResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipStrokeWidthResource(id);
        }
    }

    public void setChipStrokeWidth(float chipStrokeWidth) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipStrokeWidth(chipStrokeWidth);
        }
    }

    public ColorStateList getRippleColor() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getRippleColor();
        }
        return null;
    }

    public void setRippleColorResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setRippleColorResource(id);
            if (!this.chipDrawable.getUseCompatRipple()) {
                updateFrameworkRippleBackground();
            }
        }
    }

    public void setRippleColor(ColorStateList rippleColor) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setRippleColor(rippleColor);
        }
        if (!this.chipDrawable.getUseCompatRipple()) {
            updateFrameworkRippleBackground();
        }
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public void setLayoutDirection(int layoutDirection) {
        if (this.chipDrawable != null) {
            super.setLayoutDirection(layoutDirection);
        }
    }

    public void setText(CharSequence text, TextView.BufferType type) {
        if (this.chipDrawable != null) {
            if (text == null) {
                text = "";
            }
            super.setText(this.chipDrawable.shouldDrawText() ? null : text, type);
            if (this.chipDrawable != null) {
                this.chipDrawable.setText(text);
            }
        }
    }

    @Deprecated
    public void setChipTextResource(int id) {
        setText(getResources().getString(id));
    }

    @Deprecated
    public void setChipText(CharSequence chipText) {
        setText(chipText);
    }

    public void setTextAppearanceResource(int id) {
        setTextAppearance(getContext(), id);
    }

    public void setTextAppearance(TextAppearance textAppearance) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setTextAppearance(textAppearance);
        }
        updateTextPaintDrawState();
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        if (this.chipDrawable != null) {
            this.chipDrawable.setTextAppearanceResource(resId);
        }
        updateTextPaintDrawState();
    }

    public void setTextAppearance(int resId) {
        super.setTextAppearance(resId);
        if (this.chipDrawable != null) {
            this.chipDrawable.setTextAppearanceResource(resId);
        }
        updateTextPaintDrawState();
    }

    public void setTextSize(int unit, float size) {
        super.setTextSize(unit, size);
        if (this.chipDrawable != null) {
            this.chipDrawable.setTextSize(TypedValue.applyDimension(unit, size, getResources().getDisplayMetrics()));
        }
        updateTextPaintDrawState();
    }

    private void updateTextPaintDrawState() {
        TextPaint textPaint = getPaint();
        if (this.chipDrawable != null) {
            textPaint.drawableState = this.chipDrawable.getState();
        }
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.updateDrawState(getContext(), textPaint, this.fontCallback);
        }
    }

    private TextAppearance getTextAppearance() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getTextAppearance();
        }
        return null;
    }

    public boolean isChipIconVisible() {
        return this.chipDrawable != null && this.chipDrawable.isChipIconVisible();
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    public void setChipIconVisible(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipIconVisible(id);
        }
    }

    public void setChipIconVisible(boolean chipIconVisible) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipIconVisible(chipIconVisible);
        }
    }

    @Deprecated
    public void setChipIconEnabledResource(int id) {
        setChipIconVisible(id);
    }

    @Deprecated
    public void setChipIconEnabled(boolean chipIconEnabled) {
        setChipIconVisible(chipIconEnabled);
    }

    public Drawable getChipIcon() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getChipIcon();
        }
        return null;
    }

    public void setChipIconResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipIconResource(id);
        }
    }

    public void setChipIcon(Drawable chipIcon) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipIcon(chipIcon);
        }
    }

    public ColorStateList getChipIconTint() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getChipIconTint();
        }
        return null;
    }

    public void setChipIconTintResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipIconTintResource(id);
        }
    }

    public void setChipIconTint(ColorStateList chipIconTint) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipIconTint(chipIconTint);
        }
    }

    public float getChipIconSize() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getChipIconSize();
        }
        return 0.0f;
    }

    public void setChipIconSizeResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipIconSizeResource(id);
        }
    }

    public void setChipIconSize(float chipIconSize) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipIconSize(chipIconSize);
        }
    }

    public boolean isCloseIconVisible() {
        return this.chipDrawable != null && this.chipDrawable.isCloseIconVisible();
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    public void setCloseIconVisible(int id) {
        setCloseIconVisible(getResources().getBoolean(id));
    }

    public void setCloseIconVisible(boolean closeIconVisible) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconVisible(closeIconVisible);
        }
        updateAccessibilityDelegate();
    }

    @Deprecated
    public void setCloseIconEnabledResource(int id) {
        setCloseIconVisible(id);
    }

    @Deprecated
    public void setCloseIconEnabled(boolean closeIconEnabled) {
        setCloseIconVisible(closeIconEnabled);
    }

    public Drawable getCloseIcon() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getCloseIcon();
        }
        return null;
    }

    public void setCloseIconResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconResource(id);
        }
        updateAccessibilityDelegate();
    }

    public void setCloseIcon(Drawable closeIcon) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIcon(closeIcon);
        }
        updateAccessibilityDelegate();
    }

    public ColorStateList getCloseIconTint() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getCloseIconTint();
        }
        return null;
    }

    public void setCloseIconTintResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconTintResource(id);
        }
    }

    public void setCloseIconTint(ColorStateList closeIconTint) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconTint(closeIconTint);
        }
    }

    public float getCloseIconSize() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getCloseIconSize();
        }
        return 0.0f;
    }

    public void setCloseIconSizeResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconSizeResource(id);
        }
    }

    public void setCloseIconSize(float closeIconSize) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconSize(closeIconSize);
        }
    }

    public void setCloseIconContentDescription(CharSequence closeIconContentDescription) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconContentDescription(closeIconContentDescription);
        }
    }

    public CharSequence getCloseIconContentDescription() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getCloseIconContentDescription();
        }
        return null;
    }

    public boolean isCheckable() {
        return this.chipDrawable != null && this.chipDrawable.isCheckable();
    }

    public void setCheckableResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCheckableResource(id);
        }
    }

    public void setCheckable(boolean checkable) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCheckable(checkable);
        }
    }

    public boolean isCheckedIconVisible() {
        return this.chipDrawable != null && this.chipDrawable.isCheckedIconVisible();
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    public void setCheckedIconVisible(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCheckedIconVisible(id);
        }
    }

    public void setCheckedIconVisible(boolean checkedIconVisible) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCheckedIconVisible(checkedIconVisible);
        }
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int id) {
        setCheckedIconVisible(id);
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean checkedIconEnabled) {
        setCheckedIconVisible(checkedIconEnabled);
    }

    public Drawable getCheckedIcon() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getCheckedIcon();
        }
        return null;
    }

    public void setCheckedIconResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCheckedIconResource(id);
        }
    }

    public void setCheckedIcon(Drawable checkedIcon) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCheckedIcon(checkedIcon);
        }
    }

    public ColorStateList getCheckedIconTint() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getCheckedIconTint();
        }
        return null;
    }

    public void setCheckedIconTintResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCheckedIconTintResource(id);
        }
    }

    public void setCheckedIconTint(ColorStateList checkedIconTint) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCheckedIconTint(checkedIconTint);
        }
    }

    public MotionSpec getShowMotionSpec() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getShowMotionSpec();
        }
        return null;
    }

    public void setShowMotionSpecResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setShowMotionSpecResource(id);
        }
    }

    public void setShowMotionSpec(MotionSpec showMotionSpec) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setShowMotionSpec(showMotionSpec);
        }
    }

    public MotionSpec getHideMotionSpec() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getHideMotionSpec();
        }
        return null;
    }

    public void setHideMotionSpecResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setHideMotionSpecResource(id);
        }
    }

    public void setHideMotionSpec(MotionSpec hideMotionSpec) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setHideMotionSpec(hideMotionSpec);
        }
    }

    public float getChipStartPadding() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getChipStartPadding();
        }
        return 0.0f;
    }

    public void setChipStartPaddingResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipStartPaddingResource(id);
        }
    }

    public void setChipStartPadding(float chipStartPadding) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipStartPadding(chipStartPadding);
        }
    }

    public float getIconStartPadding() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getIconStartPadding();
        }
        return 0.0f;
    }

    public void setIconStartPaddingResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setIconStartPaddingResource(id);
        }
    }

    public void setIconStartPadding(float iconStartPadding) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setIconStartPadding(iconStartPadding);
        }
    }

    public float getIconEndPadding() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getIconEndPadding();
        }
        return 0.0f;
    }

    public void setIconEndPaddingResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setIconEndPaddingResource(id);
        }
    }

    public void setIconEndPadding(float iconEndPadding) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setIconEndPadding(iconEndPadding);
        }
    }

    public float getTextStartPadding() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getTextStartPadding();
        }
        return 0.0f;
    }

    public void setTextStartPaddingResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setTextStartPaddingResource(id);
        }
    }

    public void setTextStartPadding(float textStartPadding) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setTextStartPadding(textStartPadding);
        }
    }

    public float getTextEndPadding() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getTextEndPadding();
        }
        return 0.0f;
    }

    public void setTextEndPaddingResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setTextEndPaddingResource(id);
        }
    }

    public void setTextEndPadding(float textEndPadding) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setTextEndPadding(textEndPadding);
        }
    }

    public float getCloseIconStartPadding() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getCloseIconStartPadding();
        }
        return 0.0f;
    }

    public void setCloseIconStartPaddingResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconStartPaddingResource(id);
        }
    }

    public void setCloseIconStartPadding(float closeIconStartPadding) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconStartPadding(closeIconStartPadding);
        }
    }

    public float getCloseIconEndPadding() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getCloseIconEndPadding();
        }
        return 0.0f;
    }

    public void setCloseIconEndPaddingResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconEndPaddingResource(id);
        }
    }

    public void setCloseIconEndPadding(float closeIconEndPadding) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconEndPadding(closeIconEndPadding);
        }
    }

    public float getChipEndPadding() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getChipEndPadding();
        }
        return 0.0f;
    }

    public void setChipEndPaddingResource(int id) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipEndPaddingResource(id);
        }
    }

    public void setChipEndPadding(float chipEndPadding) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipEndPadding(chipEndPadding);
        }
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        return this.ensureMinTouchTargetSize;
    }

    public void setEnsureMinTouchTargetSize(boolean flag) {
        this.ensureMinTouchTargetSize = flag;
        ensureAccessibleTouchTarget(this.minTouchTargetSize);
    }

    public boolean ensureAccessibleTouchTarget(int minTargetPx) {
        this.minTouchTargetSize = minTargetPx;
        int deltaY = 0;
        if (!shouldEnsureMinTouchTargetSize()) {
            if (this.insetBackgroundDrawable != null) {
                removeBackgroundInset();
            } else {
                updateBackgroundDrawable();
            }
            return false;
        }
        int deltaHeight = Math.max(0, minTargetPx - this.chipDrawable.getIntrinsicHeight());
        int deltaWidth = Math.max(0, minTargetPx - this.chipDrawable.getIntrinsicWidth());
        if (deltaWidth > 0 || deltaHeight > 0) {
            int deltaX = deltaWidth > 0 ? deltaWidth / 2 : 0;
            if (deltaHeight > 0) {
                deltaY = deltaHeight / 2;
            }
            if (this.insetBackgroundDrawable != null) {
                Rect padding = new Rect();
                this.insetBackgroundDrawable.getPadding(padding);
                if (padding.top == deltaY && padding.bottom == deltaY && padding.left == deltaX && padding.right == deltaX) {
                    updateBackgroundDrawable();
                    return true;
                }
            }
            if (getMinHeight() != minTargetPx) {
                setMinHeight(minTargetPx);
            }
            if (getMinWidth() != minTargetPx) {
                setMinWidth(minTargetPx);
            }
            insetChipBackgroundDrawable(deltaX, deltaY, deltaX, deltaY);
            updateBackgroundDrawable();
            return true;
        }
        if (this.insetBackgroundDrawable != null) {
            removeBackgroundInset();
        } else {
            updateBackgroundDrawable();
        }
        return false;
    }

    public void setAccessibilityClassName(CharSequence className) {
        this.accessibilityClassName = className;
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.accessibilityClassName)) {
            return this.accessibilityClassName;
        }
        if (isCheckable()) {
            ViewParent parent = getParent();
            if (!(parent instanceof ChipGroup) || !((ChipGroup) parent).isSingleSelection()) {
                return BUTTON_ACCESSIBILITY_CLASS_NAME;
            }
            return RADIO_BUTTON_ACCESSIBILITY_CLASS_NAME;
        } else if (isClickable()) {
            return BUTTON_ACCESSIBILITY_CLASS_NAME;
        } else {
            return GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME;
        }
    }

    private void removeBackgroundInset() {
        if (this.insetBackgroundDrawable != null) {
            this.insetBackgroundDrawable = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            updateBackgroundDrawable();
        }
    }

    private void insetChipBackgroundDrawable(int insetLeft, int insetTop, int insetRight, int insetBottom) {
        this.insetBackgroundDrawable = new InsetDrawable(this.chipDrawable, insetLeft, insetTop, insetRight, insetBottom);
    }
}
