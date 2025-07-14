package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class MaterialDivider extends View {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_MaterialDivider;
    private int color;
    private final MaterialShapeDrawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private int thickness;

    public MaterialDivider(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialDivider(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.materialDividerStyle);
    }

    public MaterialDivider(Context context, AttributeSet attrs, int defStyleAttr) {
        super(MaterialThemeOverlay.wrap(context, attrs, defStyleAttr, DEF_STYLE_RES), attrs, defStyleAttr);
        Context context2 = getContext();
        this.dividerDrawable = new MaterialShapeDrawable();
        TypedArray attributes = ThemeEnforcement.obtainStyledAttributes(context2, attrs, R.styleable.MaterialDivider, defStyleAttr, DEF_STYLE_RES, new int[0]);
        this.thickness = attributes.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.insetStart = attributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = attributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(MaterialResources.getColorStateList(context2, attributes, R.styleable.MaterialDivider_dividerColor).getDefaultColor());
        attributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int newThickness = getMeasuredHeight();
        if (heightMode == Integer.MIN_VALUE || heightMode == 0) {
            if (this.thickness > 0 && newThickness != this.thickness) {
                newThickness = this.thickness;
            }
            setMeasuredDimension(getMeasuredWidth(), newThickness);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z = true;
        if (ViewCompat.getLayoutDirection(this) != 1) {
            z = false;
        }
        boolean isRtl = z;
        this.dividerDrawable.setBounds(isRtl ? this.insetEnd : this.insetStart, 0, getWidth() - (isRtl ? this.insetStart : this.insetEnd), getBottom() - getTop());
        this.dividerDrawable.draw(canvas);
    }

    public void setDividerThickness(int thickness2) {
        if (this.thickness != thickness2) {
            this.thickness = thickness2;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int thicknessId) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(thicknessId));
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    public void setDividerInsetStart(int insetStart2) {
        this.insetStart = insetStart2;
    }

    public void setDividerInsetStartResource(int insetStartId) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(insetStartId));
    }

    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public void setDividerInsetEnd(int insetEnd2) {
        this.insetEnd = insetEnd2;
    }

    public void setDividerInsetEndResource(int insetEndId) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(insetEndId));
    }

    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    public void setDividerColor(int color2) {
        if (this.color != color2) {
            this.color = color2;
            this.dividerDrawable.setFillColor(ColorStateList.valueOf(color2));
            invalidate();
        }
    }

    public void setDividerColorResource(int colorId) {
        setDividerColor(ContextCompat.getColor(getContext(), colorId));
    }

    public int getDividerColor() {
        return this.color;
    }
}
