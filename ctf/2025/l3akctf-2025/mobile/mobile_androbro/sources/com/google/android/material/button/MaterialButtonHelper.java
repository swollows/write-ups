package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

class MaterialButtonHelper {
    private static final boolean IS_LOLLIPOP = false;
    private static final boolean IS_MIN_LOLLIPOP = true;
    private boolean backgroundOverwritten = false;
    private ColorStateList backgroundTint;
    private PorterDuff.Mode backgroundTintMode;
    private boolean checkable;
    private int cornerRadius;
    private boolean cornerRadiusSet = false;
    private int elevation;
    private int insetBottom;
    private int insetLeft;
    private int insetRight;
    private int insetTop;
    private Drawable maskDrawable;
    private final MaterialButton materialButton;
    private ColorStateList rippleColor;
    private LayerDrawable rippleDrawable;
    private ShapeAppearanceModel shapeAppearanceModel;
    private boolean shouldDrawSurfaceColorStroke = false;
    private ColorStateList strokeColor;
    private int strokeWidth;
    private boolean toggleCheckedStateOnClick = true;

    MaterialButtonHelper(MaterialButton button, ShapeAppearanceModel shapeAppearanceModel2) {
        this.materialButton = button;
        this.shapeAppearanceModel = shapeAppearanceModel2;
    }

    /* access modifiers changed from: package-private */
    public void loadFromAttributes(TypedArray attributes) {
        this.insetLeft = attributes.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetLeft, 0);
        this.insetRight = attributes.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetRight, 0);
        this.insetTop = attributes.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetTop, 0);
        this.insetBottom = attributes.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetBottom, 0);
        if (attributes.hasValue(R.styleable.MaterialButton_cornerRadius)) {
            this.cornerRadius = attributes.getDimensionPixelSize(R.styleable.MaterialButton_cornerRadius, -1);
            setShapeAppearanceModel(this.shapeAppearanceModel.withCornerSize((float) this.cornerRadius));
            this.cornerRadiusSet = true;
        }
        this.strokeWidth = attributes.getDimensionPixelSize(R.styleable.MaterialButton_strokeWidth, 0);
        this.backgroundTintMode = ViewUtils.parseTintMode(attributes.getInt(R.styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.backgroundTint = MaterialResources.getColorStateList(this.materialButton.getContext(), attributes, R.styleable.MaterialButton_backgroundTint);
        this.strokeColor = MaterialResources.getColorStateList(this.materialButton.getContext(), attributes, R.styleable.MaterialButton_strokeColor);
        this.rippleColor = MaterialResources.getColorStateList(this.materialButton.getContext(), attributes, R.styleable.MaterialButton_rippleColor);
        this.checkable = attributes.getBoolean(R.styleable.MaterialButton_android_checkable, false);
        this.elevation = attributes.getDimensionPixelSize(R.styleable.MaterialButton_elevation, 0);
        this.toggleCheckedStateOnClick = attributes.getBoolean(R.styleable.MaterialButton_toggleCheckedStateOnClick, true);
        int paddingStart = ViewCompat.getPaddingStart(this.materialButton);
        int paddingTop = this.materialButton.getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(this.materialButton);
        int paddingBottom = this.materialButton.getPaddingBottom();
        if (attributes.hasValue(R.styleable.MaterialButton_android_background)) {
            setBackgroundOverwritten();
        } else {
            updateBackground();
        }
        ViewCompat.setPaddingRelative(this.materialButton, this.insetLeft + paddingStart, this.insetTop + paddingTop, this.insetRight + paddingEnd, this.insetBottom + paddingBottom);
    }

    private void updateBackground() {
        this.materialButton.setInternalBackground(createBackground());
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation((float) this.elevation);
            materialShapeDrawable.setState(this.materialButton.getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundOverwritten() {
        this.backgroundOverwritten = true;
        this.materialButton.setSupportBackgroundTintList(this.backgroundTint);
        this.materialButton.setSupportBackgroundTintMode(this.backgroundTintMode);
    }

    /* access modifiers changed from: package-private */
    public boolean isBackgroundOverwritten() {
        return this.backgroundOverwritten;
    }

    private InsetDrawable wrapDrawableWithInset(Drawable drawable) {
        return new InsetDrawable(drawable, this.insetLeft, this.insetTop, this.insetRight, this.insetBottom);
    }

    /* access modifiers changed from: package-private */
    public void setSupportBackgroundTintList(ColorStateList tintList) {
        if (this.backgroundTint != tintList) {
            this.backgroundTint = tintList;
            if (getMaterialShapeDrawable() != null) {
                DrawableCompat.setTintList(getMaterialShapeDrawable(), this.backgroundTint);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList getSupportBackgroundTintList() {
        return this.backgroundTint;
    }

    /* access modifiers changed from: package-private */
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.backgroundTintMode != mode) {
            this.backgroundTintMode = mode;
            if (getMaterialShapeDrawable() != null && this.backgroundTintMode != null) {
                DrawableCompat.setTintMode(getMaterialShapeDrawable(), this.backgroundTintMode);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.backgroundTintMode;
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean shouldDrawSurfaceColorStroke2) {
        this.shouldDrawSurfaceColorStroke = shouldDrawSurfaceColorStroke2;
        updateStroke();
    }

    private Drawable createBackground() {
        int i;
        MaterialShapeDrawable backgroundDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
        backgroundDrawable.initializeElevationOverlay(this.materialButton.getContext());
        DrawableCompat.setTintList(backgroundDrawable, this.backgroundTint);
        if (this.backgroundTintMode != null) {
            DrawableCompat.setTintMode(backgroundDrawable, this.backgroundTintMode);
        }
        backgroundDrawable.setStroke((float) this.strokeWidth, this.strokeColor);
        MaterialShapeDrawable surfaceColorStrokeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
        surfaceColorStrokeDrawable.setTint(0);
        float f = (float) this.strokeWidth;
        if (this.shouldDrawSurfaceColorStroke) {
            i = MaterialColors.getColor(this.materialButton, R.attr.colorSurface);
        } else {
            i = 0;
        }
        surfaceColorStrokeDrawable.setStroke(f, i);
        if (IS_MIN_LOLLIPOP) {
            this.maskDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
            DrawableCompat.setTint(this.maskDrawable, -1);
            this.rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.rippleColor), wrapDrawableWithInset(new LayerDrawable(new Drawable[]{surfaceColorStrokeDrawable, backgroundDrawable})), this.maskDrawable);
            return this.rippleDrawable;
        }
        this.maskDrawable = new RippleDrawableCompat(this.shapeAppearanceModel);
        DrawableCompat.setTintList(this.maskDrawable, RippleUtils.sanitizeRippleDrawableColor(this.rippleColor));
        this.rippleDrawable = new LayerDrawable(new Drawable[]{surfaceColorStrokeDrawable, backgroundDrawable, this.maskDrawable});
        return wrapDrawableWithInset(this.rippleDrawable);
    }

    /* access modifiers changed from: package-private */
    public void updateMaskBounds(int height, int width) {
        if (this.maskDrawable != null) {
            this.maskDrawable.setBounds(this.insetLeft, this.insetTop, width - this.insetRight, height - this.insetBottom);
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundColor(int color) {
        if (getMaterialShapeDrawable() != null) {
            getMaterialShapeDrawable().setTint(color);
        }
    }

    /* access modifiers changed from: package-private */
    public void setRippleColor(ColorStateList rippleColor2) {
        if (this.rippleColor != rippleColor2) {
            this.rippleColor = rippleColor2;
            if (IS_MIN_LOLLIPOP && (this.materialButton.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.materialButton.getBackground()).setColor(RippleUtils.sanitizeRippleDrawableColor(rippleColor2));
            } else if (!IS_MIN_LOLLIPOP && (this.materialButton.getBackground() instanceof RippleDrawableCompat)) {
                ((RippleDrawableCompat) this.materialButton.getBackground()).setTintList(RippleUtils.sanitizeRippleDrawableColor(rippleColor2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    /* access modifiers changed from: package-private */
    public void setStrokeColor(ColorStateList strokeColor2) {
        if (this.strokeColor != strokeColor2) {
            this.strokeColor = strokeColor2;
            updateStroke();
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList getStrokeColor() {
        return this.strokeColor;
    }

    /* access modifiers changed from: package-private */
    public void setStrokeWidth(int strokeWidth2) {
        if (this.strokeWidth != strokeWidth2) {
            this.strokeWidth = strokeWidth2;
            updateStroke();
        }
    }

    /* access modifiers changed from: package-private */
    public int getStrokeWidth() {
        return this.strokeWidth;
    }

    private void updateStroke() {
        int i;
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        MaterialShapeDrawable surfaceColorStrokeDrawable = getSurfaceColorStrokeDrawable();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setStroke((float) this.strokeWidth, this.strokeColor);
            if (surfaceColorStrokeDrawable != null) {
                float f = (float) this.strokeWidth;
                if (this.shouldDrawSurfaceColorStroke) {
                    i = MaterialColors.getColor(this.materialButton, R.attr.colorSurface);
                } else {
                    i = 0;
                }
                surfaceColorStrokeDrawable.setStroke(f, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setCornerRadius(int cornerRadius2) {
        if (!this.cornerRadiusSet || this.cornerRadius != cornerRadius2) {
            this.cornerRadius = cornerRadius2;
            this.cornerRadiusSet = true;
            setShapeAppearanceModel(this.shapeAppearanceModel.withCornerSize((float) cornerRadius2));
        }
    }

    /* access modifiers changed from: package-private */
    public int getCornerRadius() {
        return this.cornerRadius;
    }

    private MaterialShapeDrawable getMaterialShapeDrawable(boolean getSurfaceColorStrokeDrawable) {
        if (this.rippleDrawable == null || this.rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (IS_MIN_LOLLIPOP) {
            return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.rippleDrawable.getDrawable(0)).getDrawable()).getDrawable(getSurfaceColorStrokeDrawable ^ true ? 1 : 0);
        }
        return (MaterialShapeDrawable) this.rippleDrawable.getDrawable(getSurfaceColorStrokeDrawable ^ true ? 1 : 0);
    }

    /* access modifiers changed from: package-private */
    public MaterialShapeDrawable getMaterialShapeDrawable() {
        return getMaterialShapeDrawable(false);
    }

    /* access modifiers changed from: package-private */
    public void setCheckable(boolean checkable2) {
        this.checkable = checkable2;
    }

    /* access modifiers changed from: package-private */
    public boolean isCheckable() {
        return this.checkable;
    }

    /* access modifiers changed from: package-private */
    public boolean isToggleCheckedStateOnClick() {
        return this.toggleCheckedStateOnClick;
    }

    /* access modifiers changed from: package-private */
    public void setToggleCheckedStateOnClick(boolean toggleCheckedStateOnClick2) {
        this.toggleCheckedStateOnClick = toggleCheckedStateOnClick2;
    }

    private MaterialShapeDrawable getSurfaceColorStrokeDrawable() {
        return getMaterialShapeDrawable(true);
    }

    private void updateButtonShape(ShapeAppearanceModel shapeAppearanceModel2) {
        if (!IS_LOLLIPOP || this.backgroundOverwritten) {
            if (getMaterialShapeDrawable() != null) {
                getMaterialShapeDrawable().setShapeAppearanceModel(shapeAppearanceModel2);
            }
            if (getSurfaceColorStrokeDrawable() != null) {
                getSurfaceColorStrokeDrawable().setShapeAppearanceModel(shapeAppearanceModel2);
            }
            if (getMaskDrawable() != null) {
                getMaskDrawable().setShapeAppearanceModel(shapeAppearanceModel2);
                return;
            }
            return;
        }
        int paddingStart = ViewCompat.getPaddingStart(this.materialButton);
        int paddingTop = this.materialButton.getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(this.materialButton);
        int paddingBottom = this.materialButton.getPaddingBottom();
        updateBackground();
        ViewCompat.setPaddingRelative(this.materialButton, paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    public Shapeable getMaskDrawable() {
        if (this.rippleDrawable == null || this.rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.rippleDrawable.getNumberOfLayers() > 2) {
            return (Shapeable) this.rippleDrawable.getDrawable(2);
        }
        return (Shapeable) this.rippleDrawable.getDrawable(1);
    }

    /* access modifiers changed from: package-private */
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel2) {
        this.shapeAppearanceModel = shapeAppearanceModel2;
        updateButtonShape(shapeAppearanceModel2);
    }

    /* access modifiers changed from: package-private */
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    public void setInsetBottom(int newInsetBottom) {
        setVerticalInsets(this.insetTop, newInsetBottom);
    }

    public int getInsetBottom() {
        return this.insetBottom;
    }

    public void setInsetTop(int newInsetTop) {
        setVerticalInsets(newInsetTop, this.insetBottom);
    }

    private void setVerticalInsets(int newInsetTop, int newInsetBottom) {
        int paddingStart = ViewCompat.getPaddingStart(this.materialButton);
        int paddingTop = this.materialButton.getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(this.materialButton);
        int paddingBottom = this.materialButton.getPaddingBottom();
        int oldInsetTop = this.insetTop;
        int oldInsetBottom = this.insetBottom;
        this.insetBottom = newInsetBottom;
        this.insetTop = newInsetTop;
        if (!this.backgroundOverwritten) {
            updateBackground();
        }
        ViewCompat.setPaddingRelative(this.materialButton, paddingStart, (paddingTop + newInsetTop) - oldInsetTop, paddingEnd, (paddingBottom + newInsetBottom) - oldInsetBottom);
    }

    public int getInsetTop() {
        return this.insetTop;
    }
}
