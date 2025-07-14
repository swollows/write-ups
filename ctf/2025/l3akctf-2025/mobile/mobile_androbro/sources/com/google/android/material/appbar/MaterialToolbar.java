package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class MaterialToolbar extends Toolbar {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_Toolbar;
    private static final ImageView.ScaleType[] LOGO_SCALE_TYPE_ARRAY = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private Boolean logoAdjustViewBounds;
    private ImageView.ScaleType logoScaleType;
    private Integer navigationIconTint;
    private boolean subtitleCentered;
    private boolean titleCentered;

    public MaterialToolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialToolbar(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(MaterialThemeOverlay.wrap(context, attrs, defStyleAttr, DEF_STYLE_RES), attrs, defStyleAttr);
        Context context2 = getContext();
        TypedArray a = ThemeEnforcement.obtainStyledAttributes(context2, attrs, R.styleable.MaterialToolbar, defStyleAttr, DEF_STYLE_RES, new int[0]);
        if (a.hasValue(R.styleable.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(a.getColor(R.styleable.MaterialToolbar_navigationIconTint, -1));
        }
        this.titleCentered = a.getBoolean(R.styleable.MaterialToolbar_titleCentered, false);
        this.subtitleCentered = a.getBoolean(R.styleable.MaterialToolbar_subtitleCentered, false);
        int index = a.getInt(R.styleable.MaterialToolbar_logoScaleType, -1);
        if (index >= 0 && index < LOGO_SCALE_TYPE_ARRAY.length) {
            this.logoScaleType = LOGO_SCALE_TYPE_ARRAY[index];
        }
        if (a.hasValue(R.styleable.MaterialToolbar_logoAdjustViewBounds)) {
            this.logoAdjustViewBounds = Boolean.valueOf(a.getBoolean(R.styleable.MaterialToolbar_logoAdjustViewBounds, false));
        }
        a.recycle();
        initBackground(context2);
    }

    public void inflateMenu(int i) {
        Menu menu = getMenu();
        if (menu instanceof MenuBuilder) {
            ((MenuBuilder) menu).stopDispatchingItemsChanged();
        }
        super.inflateMenu(i);
        if (menu instanceof MenuBuilder) {
            ((MenuBuilder) menu).startDispatchingItemsChanged();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        maybeCenterTitleViews();
        updateLogoImageView();
    }

    private void maybeCenterTitleViews() {
        if (this.titleCentered || this.subtitleCentered) {
            TextView titleTextView = ToolbarUtils.getTitleTextView(this);
            TextView subtitleTextView = ToolbarUtils.getSubtitleTextView(this);
            if (titleTextView != null || subtitleTextView != null) {
                Pair<Integer, Integer> titleBoundLimits = calculateTitleBoundLimits(titleTextView, subtitleTextView);
                if (this.titleCentered && titleTextView != null) {
                    layoutTitleCenteredHorizontally(titleTextView, titleBoundLimits);
                }
                if (this.subtitleCentered && subtitleTextView != null) {
                    layoutTitleCenteredHorizontally(subtitleTextView, titleBoundLimits);
                }
            }
        }
    }

    private Pair<Integer, Integer> calculateTitleBoundLimits(TextView titleTextView, TextView subtitleTextView) {
        int width = getMeasuredWidth();
        int midpoint = width / 2;
        int leftLimit = getPaddingLeft();
        int rightLimit = width - getPaddingRight();
        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            if (!(child.getVisibility() == 8 || child == titleTextView || child == subtitleTextView)) {
                if (child.getRight() < midpoint && child.getRight() > leftLimit) {
                    leftLimit = child.getRight();
                }
                if (child.getLeft() > midpoint && child.getLeft() < rightLimit) {
                    rightLimit = child.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(leftLimit), Integer.valueOf(rightLimit));
    }

    private void layoutTitleCenteredHorizontally(View titleView, Pair<Integer, Integer> titleBoundLimits) {
        int width = getMeasuredWidth();
        int titleWidth = titleView.getMeasuredWidth();
        int titleLeft = (width / 2) - (titleWidth / 2);
        int titleRight = titleLeft + titleWidth;
        int overlap = Math.max(Math.max(((Integer) titleBoundLimits.first).intValue() - titleLeft, 0), Math.max(titleRight - ((Integer) titleBoundLimits.second).intValue(), 0));
        if (overlap > 0) {
            titleLeft += overlap;
            titleRight -= overlap;
            titleView.measure(View.MeasureSpec.makeMeasureSpec(titleRight - titleLeft, BasicMeasure.EXACTLY), titleView.getMeasuredHeightAndState());
        }
        titleView.layout(titleLeft, titleView.getTop(), titleRight, titleView.getBottom());
    }

    private void updateLogoImageView() {
        ImageView logoImageView = ToolbarUtils.getLogoImageView(this);
        if (logoImageView != null) {
            if (this.logoAdjustViewBounds != null) {
                logoImageView.setAdjustViewBounds(this.logoAdjustViewBounds.booleanValue());
            }
            if (this.logoScaleType != null) {
                logoImageView.setScaleType(this.logoScaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.logoScaleType;
    }

    public void setLogoScaleType(ImageView.ScaleType logoScaleType2) {
        if (this.logoScaleType != logoScaleType2) {
            this.logoScaleType = logoScaleType2;
            requestLayout();
        }
    }

    public boolean isLogoAdjustViewBounds() {
        return this.logoAdjustViewBounds != null && this.logoAdjustViewBounds.booleanValue();
    }

    public void setLogoAdjustViewBounds(boolean logoAdjustViewBounds2) {
        if (this.logoAdjustViewBounds == null || this.logoAdjustViewBounds.booleanValue() != logoAdjustViewBounds2) {
            this.logoAdjustViewBounds = Boolean.valueOf(logoAdjustViewBounds2);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    public void setElevation(float elevation) {
        super.setElevation(elevation);
        MaterialShapeUtils.setElevation(this, elevation);
    }

    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    public void setNavigationIconTint(int navigationIconTint2) {
        this.navigationIconTint = Integer.valueOf(navigationIconTint2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void clearNavigationIconTint() {
        this.navigationIconTint = null;
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            DrawableCompat.setTintList(DrawableCompat.wrap(navigationIcon.mutate()), (ColorStateList) null);
            setNavigationIcon(navigationIcon);
        }
    }

    public Integer getNavigationIconTint() {
        return this.navigationIconTint;
    }

    public void setTitleCentered(boolean titleCentered2) {
        if (this.titleCentered != titleCentered2) {
            this.titleCentered = titleCentered2;
            requestLayout();
        }
    }

    public boolean isTitleCentered() {
        return this.titleCentered;
    }

    public void setSubtitleCentered(boolean subtitleCentered2) {
        if (this.subtitleCentered != subtitleCentered2) {
            this.subtitleCentered = subtitleCentered2;
            requestLayout();
        }
    }

    public boolean isSubtitleCentered() {
        return this.subtitleCentered;
    }

    private void initBackground(Context context) {
        ColorStateList backgroundColorStateList;
        Drawable background = getBackground();
        if (background == null) {
            backgroundColorStateList = ColorStateList.valueOf(0);
        } else {
            backgroundColorStateList = DrawableUtils.getColorStateListOrNull(background);
        }
        if (backgroundColorStateList != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(backgroundColorStateList);
            materialShapeDrawable.initializeElevationOverlay(context);
            materialShapeDrawable.setElevation(ViewCompat.getElevation(this));
            ViewCompat.setBackground(this, materialShapeDrawable);
        }
    }

    private Drawable maybeTintNavigationIcon(Drawable navigationIcon) {
        if (navigationIcon == null || this.navigationIconTint == null) {
            return navigationIcon;
        }
        Drawable wrappedNavigationIcon = DrawableCompat.wrap(navigationIcon.mutate());
        DrawableCompat.setTint(wrappedNavigationIcon, this.navigationIconTint.intValue());
        return wrappedNavigationIcon;
    }
}
