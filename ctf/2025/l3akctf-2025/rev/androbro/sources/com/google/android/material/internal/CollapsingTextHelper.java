package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicCompat;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TypefaceUtils;

public final class CollapsingTextHelper {
    private static final boolean DEBUG_DRAW = false;
    private static final Paint DEBUG_DRAW_PAINT = null;
    private static final String ELLIPSIS_NORMAL = "…";
    private static final float FADE_MODE_THRESHOLD_FRACTION_RELATIVE = 0.5f;
    private static final String TAG = "CollapsingTextHelper";
    private static final boolean USE_SCALING_TEXTURE = false;
    private boolean boundsChanged;
    private final Rect collapsedBounds;
    private float collapsedDrawX;
    private float collapsedDrawY;
    private CancelableFontCallback collapsedFontCallback;
    private float collapsedLetterSpacing;
    private ColorStateList collapsedShadowColor;
    private float collapsedShadowDx;
    private float collapsedShadowDy;
    private float collapsedShadowRadius;
    private float collapsedTextBlend;
    private ColorStateList collapsedTextColor;
    private int collapsedTextGravity = 16;
    private float collapsedTextSize = 15.0f;
    private float collapsedTextWidth;
    private Typeface collapsedTypeface;
    private Typeface collapsedTypefaceBold;
    private Typeface collapsedTypefaceDefault;
    private final RectF currentBounds;
    private float currentDrawX;
    private float currentDrawY;
    private float currentLetterSpacing;
    private int currentOffsetY;
    private int currentShadowColor;
    private float currentShadowDx;
    private float currentShadowDy;
    private float currentShadowRadius;
    private float currentTextSize;
    private Typeface currentTypeface;
    private final Rect expandedBounds;
    private float expandedDrawX;
    private float expandedDrawY;
    private CancelableFontCallback expandedFontCallback;
    private float expandedFraction;
    private float expandedLetterSpacing;
    private int expandedLineCount;
    private ColorStateList expandedShadowColor;
    private float expandedShadowDx;
    private float expandedShadowDy;
    private float expandedShadowRadius;
    private float expandedTextBlend;
    private ColorStateList expandedTextColor;
    private int expandedTextGravity = 16;
    private float expandedTextSize = 15.0f;
    private Bitmap expandedTitleTexture;
    private Typeface expandedTypeface;
    private Typeface expandedTypefaceBold;
    private Typeface expandedTypefaceDefault;
    private boolean fadeModeEnabled;
    private float fadeModeStartFraction;
    private float fadeModeThresholdFraction;
    private int hyphenationFrequency = StaticLayoutBuilderCompat.DEFAULT_HYPHENATION_FREQUENCY;
    private boolean isRtl;
    private boolean isRtlTextDirectionHeuristicsEnabled = true;
    private float lineSpacingAdd = 0.0f;
    private float lineSpacingMultiplier = 1.0f;
    private int maxLines = 1;
    private TimeInterpolator positionInterpolator;
    private float scale;
    private int[] state;
    private StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;
    private CharSequence text;
    private StaticLayout textLayout;
    private final TextPaint textPaint;
    private TimeInterpolator textSizeInterpolator;
    private CharSequence textToDraw;
    private CharSequence textToDrawCollapsed;
    private Paint texturePaint;
    private TextUtils.TruncateAt titleTextEllipsize = TextUtils.TruncateAt.END;
    private final TextPaint tmpPaint;
    private boolean useTexture;
    private final View view;

    static {
        if (DEBUG_DRAW_PAINT != null) {
            DEBUG_DRAW_PAINT.setAntiAlias(true);
            DEBUG_DRAW_PAINT.setColor(-65281);
        }
    }

    public CollapsingTextHelper(View view2) {
        this.view = view2;
        this.textPaint = new TextPaint(129);
        this.tmpPaint = new TextPaint(this.textPaint);
        this.collapsedBounds = new Rect();
        this.expandedBounds = new Rect();
        this.currentBounds = new RectF();
        this.fadeModeThresholdFraction = calculateFadeModeThresholdFraction();
        maybeUpdateFontWeightAdjustment(view2.getContext().getResources().getConfiguration());
    }

    public void setTextSizeInterpolator(TimeInterpolator interpolator) {
        this.textSizeInterpolator = interpolator;
        recalculate();
    }

    public void setPositionInterpolator(TimeInterpolator interpolator) {
        this.positionInterpolator = interpolator;
        recalculate();
    }

    public TimeInterpolator getPositionInterpolator() {
        return this.positionInterpolator;
    }

    public void setExpandedTextSize(float textSize) {
        if (this.expandedTextSize != textSize) {
            this.expandedTextSize = textSize;
            recalculate();
        }
    }

    public void setCollapsedTextSize(float textSize) {
        if (this.collapsedTextSize != textSize) {
            this.collapsedTextSize = textSize;
            recalculate();
        }
    }

    public void setCollapsedTextColor(ColorStateList textColor) {
        if (this.collapsedTextColor != textColor) {
            this.collapsedTextColor = textColor;
            recalculate();
        }
    }

    public void setExpandedTextColor(ColorStateList textColor) {
        if (this.expandedTextColor != textColor) {
            this.expandedTextColor = textColor;
            recalculate();
        }
    }

    public void setCollapsedAndExpandedTextColor(ColorStateList textColor) {
        if (this.collapsedTextColor != textColor || this.expandedTextColor != textColor) {
            this.collapsedTextColor = textColor;
            this.expandedTextColor = textColor;
            recalculate();
        }
    }

    public void setExpandedLetterSpacing(float letterSpacing) {
        if (this.expandedLetterSpacing != letterSpacing) {
            this.expandedLetterSpacing = letterSpacing;
            recalculate();
        }
    }

    public void setExpandedBounds(int left, int top, int right, int bottom) {
        if (!rectEquals(this.expandedBounds, left, top, right, bottom)) {
            this.expandedBounds.set(left, top, right, bottom);
            this.boundsChanged = true;
        }
    }

    public void setExpandedBounds(Rect bounds) {
        setExpandedBounds(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }

    public void setCollapsedBounds(int left, int top, int right, int bottom) {
        if (!rectEquals(this.collapsedBounds, left, top, right, bottom)) {
            this.collapsedBounds.set(left, top, right, bottom);
            this.boundsChanged = true;
        }
    }

    public void setCollapsedBounds(Rect bounds) {
        setCollapsedBounds(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }

    public void getCollapsedTextActualBounds(RectF bounds, int labelWidth, int textGravity) {
        this.isRtl = calculateIsRtl(this.text);
        bounds.left = Math.max(getCollapsedTextLeftBound(labelWidth, textGravity), (float) this.collapsedBounds.left);
        bounds.top = (float) this.collapsedBounds.top;
        bounds.right = Math.min(getCollapsedTextRightBound(bounds, labelWidth, textGravity), (float) this.collapsedBounds.right);
        bounds.bottom = ((float) this.collapsedBounds.top) + getCollapsedTextHeight();
    }

    private float getCollapsedTextLeftBound(int width, int gravity) {
        if (gravity == 17 || (gravity & 7) == 1) {
            return (((float) width) / 2.0f) - (this.collapsedTextWidth / 2.0f);
        }
        return ((gravity & GravityCompat.END) == 8388613 || (gravity & 5) == 5) ? this.isRtl ? (float) this.collapsedBounds.left : ((float) this.collapsedBounds.right) - this.collapsedTextWidth : this.isRtl ? ((float) this.collapsedBounds.right) - this.collapsedTextWidth : (float) this.collapsedBounds.left;
    }

    private float getCollapsedTextRightBound(RectF bounds, int width, int gravity) {
        if (gravity == 17 || (gravity & 7) == 1) {
            return (((float) width) / 2.0f) + (this.collapsedTextWidth / 2.0f);
        }
        return ((gravity & GravityCompat.END) == 8388613 || (gravity & 5) == 5) ? this.isRtl ? bounds.left + this.collapsedTextWidth : (float) this.collapsedBounds.right : this.isRtl ? (float) this.collapsedBounds.right : bounds.left + this.collapsedTextWidth;
    }

    public float getExpandedTextHeight() {
        getTextPaintExpanded(this.tmpPaint);
        return -this.tmpPaint.ascent();
    }

    public float getExpandedTextFullHeight() {
        getTextPaintExpanded(this.tmpPaint);
        return (-this.tmpPaint.ascent()) + this.tmpPaint.descent();
    }

    public float getCollapsedTextHeight() {
        getTextPaintCollapsed(this.tmpPaint);
        return -this.tmpPaint.ascent();
    }

    public void setCurrentOffsetY(int currentOffsetY2) {
        this.currentOffsetY = currentOffsetY2;
    }

    public void setFadeModeStartFraction(float fadeModeStartFraction2) {
        this.fadeModeStartFraction = fadeModeStartFraction2;
        this.fadeModeThresholdFraction = calculateFadeModeThresholdFraction();
    }

    private float calculateFadeModeThresholdFraction() {
        return this.fadeModeStartFraction + ((1.0f - this.fadeModeStartFraction) * 0.5f);
    }

    public void setFadeModeEnabled(boolean fadeModeEnabled2) {
        this.fadeModeEnabled = fadeModeEnabled2;
    }

    private void getTextPaintExpanded(TextPaint textPaint2) {
        textPaint2.setTextSize(this.expandedTextSize);
        textPaint2.setTypeface(this.expandedTypeface);
        textPaint2.setLetterSpacing(this.expandedLetterSpacing);
    }

    private void getTextPaintCollapsed(TextPaint textPaint2) {
        textPaint2.setTextSize(this.collapsedTextSize);
        textPaint2.setTypeface(this.collapsedTypeface);
        textPaint2.setLetterSpacing(this.collapsedLetterSpacing);
    }

    public void setExpandedTextGravity(int gravity) {
        if (this.expandedTextGravity != gravity) {
            this.expandedTextGravity = gravity;
            recalculate();
        }
    }

    public int getExpandedTextGravity() {
        return this.expandedTextGravity;
    }

    public void setCollapsedTextGravity(int gravity) {
        if (this.collapsedTextGravity != gravity) {
            this.collapsedTextGravity = gravity;
            recalculate();
        }
    }

    public int getCollapsedTextGravity() {
        return this.collapsedTextGravity;
    }

    public void setCollapsedTextAppearance(int resId) {
        TextAppearance textAppearance = new TextAppearance(this.view.getContext(), resId);
        if (textAppearance.getTextColor() != null) {
            this.collapsedTextColor = textAppearance.getTextColor();
        }
        if (textAppearance.getTextSize() != 0.0f) {
            this.collapsedTextSize = textAppearance.getTextSize();
        }
        if (textAppearance.shadowColor != null) {
            this.collapsedShadowColor = textAppearance.shadowColor;
        }
        this.collapsedShadowDx = textAppearance.shadowDx;
        this.collapsedShadowDy = textAppearance.shadowDy;
        this.collapsedShadowRadius = textAppearance.shadowRadius;
        this.collapsedLetterSpacing = textAppearance.letterSpacing;
        if (this.collapsedFontCallback != null) {
            this.collapsedFontCallback.cancel();
        }
        this.collapsedFontCallback = new CancelableFontCallback(new CancelableFontCallback.ApplyFont() {
            public void apply(Typeface font) {
                CollapsingTextHelper.this.setCollapsedTypeface(font);
            }
        }, textAppearance.getFallbackFont());
        textAppearance.getFontAsync(this.view.getContext(), this.collapsedFontCallback);
        recalculate();
    }

    public void setExpandedTextAppearance(int resId) {
        TextAppearance textAppearance = new TextAppearance(this.view.getContext(), resId);
        if (textAppearance.getTextColor() != null) {
            this.expandedTextColor = textAppearance.getTextColor();
        }
        if (textAppearance.getTextSize() != 0.0f) {
            this.expandedTextSize = textAppearance.getTextSize();
        }
        if (textAppearance.shadowColor != null) {
            this.expandedShadowColor = textAppearance.shadowColor;
        }
        this.expandedShadowDx = textAppearance.shadowDx;
        this.expandedShadowDy = textAppearance.shadowDy;
        this.expandedShadowRadius = textAppearance.shadowRadius;
        this.expandedLetterSpacing = textAppearance.letterSpacing;
        if (this.expandedFontCallback != null) {
            this.expandedFontCallback.cancel();
        }
        this.expandedFontCallback = new CancelableFontCallback(new CancelableFontCallback.ApplyFont() {
            public void apply(Typeface font) {
                CollapsingTextHelper.this.setExpandedTypeface(font);
            }
        }, textAppearance.getFallbackFont());
        textAppearance.getFontAsync(this.view.getContext(), this.expandedFontCallback);
        recalculate();
    }

    public void setTitleTextEllipsize(TextUtils.TruncateAt ellipsize) {
        this.titleTextEllipsize = ellipsize;
        recalculate();
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.titleTextEllipsize;
    }

    public void setCollapsedTypeface(Typeface typeface) {
        if (setCollapsedTypefaceInternal(typeface)) {
            recalculate();
        }
    }

    public void setExpandedTypeface(Typeface typeface) {
        if (setExpandedTypefaceInternal(typeface)) {
            recalculate();
        }
    }

    public void setTypefaces(Typeface typeface) {
        boolean collapsedFontChanged = setCollapsedTypefaceInternal(typeface);
        boolean expandedFontChanged = setExpandedTypefaceInternal(typeface);
        if (collapsedFontChanged || expandedFontChanged) {
            recalculate();
        }
    }

    private boolean setCollapsedTypefaceInternal(Typeface typeface) {
        if (this.collapsedFontCallback != null) {
            this.collapsedFontCallback.cancel();
        }
        if (this.collapsedTypefaceDefault == typeface) {
            return false;
        }
        this.collapsedTypefaceDefault = typeface;
        this.collapsedTypefaceBold = TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.view.getContext().getResources().getConfiguration(), typeface);
        this.collapsedTypeface = this.collapsedTypefaceBold == null ? this.collapsedTypefaceDefault : this.collapsedTypefaceBold;
        return true;
    }

    private boolean setExpandedTypefaceInternal(Typeface typeface) {
        if (this.expandedFontCallback != null) {
            this.expandedFontCallback.cancel();
        }
        if (this.expandedTypefaceDefault == typeface) {
            return false;
        }
        this.expandedTypefaceDefault = typeface;
        this.expandedTypefaceBold = TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.view.getContext().getResources().getConfiguration(), typeface);
        this.expandedTypeface = this.expandedTypefaceBold == null ? this.expandedTypefaceDefault : this.expandedTypefaceBold;
        return true;
    }

    public Typeface getCollapsedTypeface() {
        return this.collapsedTypeface != null ? this.collapsedTypeface : Typeface.DEFAULT;
    }

    public Typeface getExpandedTypeface() {
        return this.expandedTypeface != null ? this.expandedTypeface : Typeface.DEFAULT;
    }

    public void maybeUpdateFontWeightAdjustment(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            if (this.collapsedTypefaceDefault != null) {
                this.collapsedTypefaceBold = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, this.collapsedTypefaceDefault);
            }
            if (this.expandedTypefaceDefault != null) {
                this.expandedTypefaceBold = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, this.expandedTypefaceDefault);
            }
            this.collapsedTypeface = this.collapsedTypefaceBold != null ? this.collapsedTypefaceBold : this.collapsedTypefaceDefault;
            this.expandedTypeface = this.expandedTypefaceBold != null ? this.expandedTypefaceBold : this.expandedTypefaceDefault;
            recalculate(true);
        }
    }

    public void setExpansionFraction(float fraction) {
        float fraction2 = MathUtils.clamp(fraction, 0.0f, 1.0f);
        if (fraction2 != this.expandedFraction) {
            this.expandedFraction = fraction2;
            calculateCurrentOffsets();
        }
    }

    public final boolean setState(int[] state2) {
        this.state = state2;
        if (!isStateful()) {
            return false;
        }
        recalculate();
        return true;
    }

    public final boolean isStateful() {
        return (this.collapsedTextColor != null && this.collapsedTextColor.isStateful()) || (this.expandedTextColor != null && this.expandedTextColor.isStateful());
    }

    public float getFadeModeThresholdFraction() {
        return this.fadeModeThresholdFraction;
    }

    public float getExpansionFraction() {
        return this.expandedFraction;
    }

    public float getCollapsedTextSize() {
        return this.collapsedTextSize;
    }

    public float getExpandedTextSize() {
        return this.expandedTextSize;
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean rtlTextDirectionHeuristicsEnabled) {
        this.isRtlTextDirectionHeuristicsEnabled = rtlTextDirectionHeuristicsEnabled;
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.isRtlTextDirectionHeuristicsEnabled;
    }

    private void calculateCurrentOffsets() {
        calculateOffsets(this.expandedFraction);
    }

    private void calculateOffsets(float fraction) {
        float textBlendFraction;
        interpolateBounds(fraction);
        if (!this.fadeModeEnabled) {
            textBlendFraction = fraction;
            this.currentDrawX = lerp(this.expandedDrawX, this.collapsedDrawX, fraction, this.positionInterpolator);
            this.currentDrawY = lerp(this.expandedDrawY, this.collapsedDrawY, fraction, this.positionInterpolator);
            setInterpolatedTextSize(fraction);
        } else if (fraction < this.fadeModeThresholdFraction) {
            textBlendFraction = 0.0f;
            this.currentDrawX = this.expandedDrawX;
            this.currentDrawY = this.expandedDrawY;
            setInterpolatedTextSize(0.0f);
        } else {
            textBlendFraction = 1.0f;
            this.currentDrawX = this.collapsedDrawX;
            this.currentDrawY = this.collapsedDrawY - ((float) Math.max(0, this.currentOffsetY));
            setInterpolatedTextSize(1.0f);
        }
        setCollapsedTextBlend(1.0f - lerp(0.0f, 1.0f, 1.0f - fraction, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        setExpandedTextBlend(lerp(1.0f, 0.0f, fraction, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        if (this.collapsedTextColor != this.expandedTextColor) {
            this.textPaint.setColor(blendARGB(getCurrentExpandedTextColor(), getCurrentCollapsedTextColor(), textBlendFraction));
        } else {
            this.textPaint.setColor(getCurrentCollapsedTextColor());
        }
        if (this.collapsedLetterSpacing != this.expandedLetterSpacing) {
            this.textPaint.setLetterSpacing(lerp(this.expandedLetterSpacing, this.collapsedLetterSpacing, fraction, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        } else {
            this.textPaint.setLetterSpacing(this.collapsedLetterSpacing);
        }
        this.currentShadowRadius = lerp(this.expandedShadowRadius, this.collapsedShadowRadius, fraction, (TimeInterpolator) null);
        this.currentShadowDx = lerp(this.expandedShadowDx, this.collapsedShadowDx, fraction, (TimeInterpolator) null);
        this.currentShadowDy = lerp(this.expandedShadowDy, this.collapsedShadowDy, fraction, (TimeInterpolator) null);
        this.currentShadowColor = blendARGB(getCurrentColor(this.expandedShadowColor), getCurrentColor(this.collapsedShadowColor), fraction);
        this.textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, this.currentShadowColor);
        if (this.fadeModeEnabled) {
            int originalAlpha = this.textPaint.getAlpha();
            this.textPaint.setAlpha((int) (calculateFadeModeTextAlpha(fraction) * ((float) originalAlpha)));
            if (Build.VERSION.SDK_INT >= 31) {
                this.textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, this.textPaint.getAlpha()));
            }
        }
        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    private float calculateFadeModeTextAlpha(float fraction) {
        if (fraction <= this.fadeModeThresholdFraction) {
            return AnimationUtils.lerp(1.0f, 0.0f, this.fadeModeStartFraction, this.fadeModeThresholdFraction, fraction);
        }
        return AnimationUtils.lerp(0.0f, 1.0f, this.fadeModeThresholdFraction, 1.0f, fraction);
    }

    private int getCurrentExpandedTextColor() {
        return getCurrentColor(this.expandedTextColor);
    }

    public int getCurrentCollapsedTextColor() {
        return getCurrentColor(this.collapsedTextColor);
    }

    private int getCurrentColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        if (this.state != null) {
            return colorStateList.getColorForState(this.state, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private void calculateBaseOffsets(boolean forceRecalculate) {
        calculateUsingTextSize(1.0f, forceRecalculate);
        if (!(this.textToDraw == null || this.textLayout == null)) {
            this.textToDrawCollapsed = TextUtils.ellipsize(this.textToDraw, this.textPaint, (float) this.textLayout.getWidth(), this.titleTextEllipsize);
        }
        float expandedTextHeight = 0.0f;
        if (this.textToDrawCollapsed != null) {
            this.collapsedTextWidth = measureTextWidth(this.textPaint, this.textToDrawCollapsed);
        } else {
            this.collapsedTextWidth = 0.0f;
        }
        int collapsedAbsGravity = GravityCompat.getAbsoluteGravity(this.collapsedTextGravity, this.isRtl ? 1 : 0);
        switch (collapsedAbsGravity & 112) {
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE:
                this.collapsedDrawY = (float) this.collapsedBounds.top;
                break;
            case 80:
                this.collapsedDrawY = ((float) this.collapsedBounds.bottom) + this.textPaint.ascent();
                break;
            default:
                this.collapsedDrawY = ((float) this.collapsedBounds.centerY()) - ((this.textPaint.descent() - this.textPaint.ascent()) / 2.0f);
                break;
        }
        switch (collapsedAbsGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) {
            case 1:
                this.collapsedDrawX = ((float) this.collapsedBounds.centerX()) - (this.collapsedTextWidth / 2.0f);
                break;
            case 5:
                this.collapsedDrawX = ((float) this.collapsedBounds.right) - this.collapsedTextWidth;
                break;
            default:
                this.collapsedDrawX = (float) this.collapsedBounds.left;
                break;
        }
        calculateUsingTextSize(0.0f, forceRecalculate);
        if (this.textLayout != null) {
            expandedTextHeight = (float) this.textLayout.getHeight();
        }
        float expandedTextWidth = 0.0f;
        if (this.textLayout != null && this.maxLines > 1) {
            expandedTextWidth = (float) this.textLayout.getWidth();
        } else if (this.textToDraw != null) {
            expandedTextWidth = measureTextWidth(this.textPaint, this.textToDraw);
        }
        this.expandedLineCount = this.textLayout != null ? this.textLayout.getLineCount() : 0;
        int expandedAbsGravity = GravityCompat.getAbsoluteGravity(this.expandedTextGravity, this.isRtl ? 1 : 0);
        switch (expandedAbsGravity & 112) {
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE:
                this.expandedDrawY = (float) this.expandedBounds.top;
                break;
            case 80:
                this.expandedDrawY = (((float) this.expandedBounds.bottom) - expandedTextHeight) + this.textPaint.descent();
                break;
            default:
                this.expandedDrawY = ((float) this.expandedBounds.centerY()) - (expandedTextHeight / 2.0f);
                break;
        }
        switch (8388615 & expandedAbsGravity) {
            case 1:
                this.expandedDrawX = ((float) this.expandedBounds.centerX()) - (expandedTextWidth / 2.0f);
                break;
            case 5:
                this.expandedDrawX = ((float) this.expandedBounds.right) - expandedTextWidth;
                break;
            default:
                this.expandedDrawX = (float) this.expandedBounds.left;
                break;
        }
        clearTexture();
        setInterpolatedTextSize(this.expandedFraction);
    }

    private float measureTextWidth(TextPaint textPaint2, CharSequence textToDraw2) {
        return textPaint2.measureText(textToDraw2, 0, textToDraw2.length());
    }

    private void interpolateBounds(float fraction) {
        if (this.fadeModeEnabled) {
            this.currentBounds.set(fraction < this.fadeModeThresholdFraction ? this.expandedBounds : this.collapsedBounds);
            return;
        }
        this.currentBounds.left = lerp((float) this.expandedBounds.left, (float) this.collapsedBounds.left, fraction, this.positionInterpolator);
        this.currentBounds.top = lerp(this.expandedDrawY, this.collapsedDrawY, fraction, this.positionInterpolator);
        this.currentBounds.right = lerp((float) this.expandedBounds.right, (float) this.collapsedBounds.right, fraction, this.positionInterpolator);
        this.currentBounds.bottom = lerp((float) this.expandedBounds.bottom, (float) this.collapsedBounds.bottom, fraction, this.positionInterpolator);
    }

    private void setCollapsedTextBlend(float blend) {
        this.collapsedTextBlend = blend;
        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    private void setExpandedTextBlend(float blend) {
        this.expandedTextBlend = blend;
        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    public void draw(Canvas canvas) {
        int saveCount = canvas.save();
        if (this.textToDraw != null && this.currentBounds.width() > 0.0f && this.currentBounds.height() > 0.0f) {
            this.textPaint.setTextSize(this.currentTextSize);
            float x = this.currentDrawX;
            float y = this.currentDrawY;
            boolean drawTexture = this.useTexture && this.expandedTitleTexture != null;
            if (this.scale != 1.0f && !this.fadeModeEnabled) {
                canvas.scale(this.scale, this.scale, x, y);
            }
            if (drawTexture) {
                canvas.drawBitmap(this.expandedTitleTexture, x, y, this.texturePaint);
                canvas.restoreToCount(saveCount);
                return;
            }
            if (!shouldDrawMultiline() || (this.fadeModeEnabled && this.expandedFraction <= this.fadeModeThresholdFraction)) {
                canvas.translate(x, y);
                this.textLayout.draw(canvas);
            } else {
                drawMultilineTransition(canvas, this.currentDrawX - ((float) this.textLayout.getLineStart(0)), y);
            }
            canvas.restoreToCount(saveCount);
        }
    }

    private boolean shouldDrawMultiline() {
        return this.maxLines > 1 && (!this.isRtl || this.fadeModeEnabled) && !this.useTexture;
    }

    private void drawMultilineTransition(Canvas canvas, float currentExpandedX, float y) {
        int originalAlpha = this.textPaint.getAlpha();
        canvas.translate(currentExpandedX, y);
        if (!this.fadeModeEnabled) {
            this.textPaint.setAlpha((int) (this.expandedTextBlend * ((float) originalAlpha)));
            if (Build.VERSION.SDK_INT >= 31) {
                this.textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, this.textPaint.getAlpha()));
            }
            this.textLayout.draw(canvas);
        }
        if (!this.fadeModeEnabled) {
            this.textPaint.setAlpha((int) (this.collapsedTextBlend * ((float) originalAlpha)));
        }
        if (Build.VERSION.SDK_INT >= 31) {
            this.textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, this.textPaint.getAlpha()));
        }
        int lineBaseline = this.textLayout.getLineBaseline(0);
        canvas.drawText(this.textToDrawCollapsed, 0, this.textToDrawCollapsed.length(), 0.0f, (float) lineBaseline, this.textPaint);
        if (Build.VERSION.SDK_INT >= 31) {
            this.textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, this.currentShadowColor);
        }
        if (!this.fadeModeEnabled) {
            String tmp = this.textToDrawCollapsed.toString().trim();
            if (tmp.endsWith(ELLIPSIS_NORMAL)) {
                tmp = tmp.substring(0, tmp.length() - 1);
            }
            this.textPaint.setAlpha(originalAlpha);
            canvas.drawText(tmp, 0, Math.min(this.textLayout.getLineEnd(0), tmp.length()), 0.0f, (float) lineBaseline, this.textPaint);
        }
    }

    private boolean calculateIsRtl(CharSequence text2) {
        boolean defaultIsRtl = isDefaultIsRtl();
        if (this.isRtlTextDirectionHeuristicsEnabled) {
            return isTextDirectionHeuristicsIsRtl(text2, defaultIsRtl);
        }
        return defaultIsRtl;
    }

    private boolean isDefaultIsRtl() {
        return ViewCompat.getLayoutDirection(this.view) == 1;
    }

    private boolean isTextDirectionHeuristicsIsRtl(CharSequence text2, boolean defaultIsRtl) {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat;
        if (defaultIsRtl) {
            textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL;
        } else {
            textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        }
        return textDirectionHeuristicCompat.isRtl(text2, 0, text2.length());
    }

    private void setInterpolatedTextSize(float fraction) {
        calculateUsingTextSize(fraction);
        this.useTexture = USE_SCALING_TEXTURE && this.scale != 1.0f;
        if (this.useTexture) {
            ensureExpandedTexture();
        }
        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    private void calculateUsingTextSize(float fraction) {
        calculateUsingTextSize(fraction, false);
    }

    private void calculateUsingTextSize(float fraction, boolean forceRecalculate) {
        float textSizeRatio;
        Typeface newTypeface;
        float newLetterSpacing;
        float newTextSize;
        boolean updateDrawText;
        float f;
        float f2 = fraction;
        if (this.text != null) {
            float collapsedWidth = (float) this.collapsedBounds.width();
            float expandedWidth = (float) this.expandedBounds.width();
            if (isClose(f2, 1.0f)) {
                newTextSize = this.collapsedTextSize;
                newLetterSpacing = this.collapsedLetterSpacing;
                this.scale = 1.0f;
                newTypeface = this.collapsedTypeface;
                textSizeRatio = collapsedWidth;
            } else {
                newTextSize = this.expandedTextSize;
                newLetterSpacing = this.expandedLetterSpacing;
                newTypeface = this.expandedTypeface;
                if (isClose(f2, 0.0f)) {
                    this.scale = 1.0f;
                } else {
                    this.scale = lerp(this.expandedTextSize, this.collapsedTextSize, f2, this.textSizeInterpolator) / this.expandedTextSize;
                }
                float textSizeRatio2 = this.collapsedTextSize / this.expandedTextSize;
                float scaledDownWidth = expandedWidth * textSizeRatio2;
                if (forceRecalculate || this.fadeModeEnabled) {
                    textSizeRatio = expandedWidth;
                } else {
                    if (scaledDownWidth > collapsedWidth) {
                        f = Math.min(collapsedWidth / textSizeRatio2, expandedWidth);
                    } else {
                        f = expandedWidth;
                    }
                    textSizeRatio = f;
                }
            }
            if (textSizeRatio > 0.0f) {
                updateDrawText = ((this.currentTextSize > newTextSize ? 1 : (this.currentTextSize == newTextSize ? 0 : -1)) != 0) || ((this.currentLetterSpacing > newLetterSpacing ? 1 : (this.currentLetterSpacing == newLetterSpacing ? 0 : -1)) != 0) || (this.textLayout != null && (textSizeRatio > ((float) this.textLayout.getWidth()) ? 1 : (textSizeRatio == ((float) this.textLayout.getWidth()) ? 0 : -1)) != 0) || (this.currentTypeface != newTypeface) || this.boundsChanged;
                this.currentTextSize = newTextSize;
                this.currentLetterSpacing = newLetterSpacing;
                this.currentTypeface = newTypeface;
                this.boundsChanged = false;
                this.textPaint.setLinearText(this.scale != 1.0f);
            } else {
                updateDrawText = false;
            }
            if (this.textToDraw == null || updateDrawText) {
                this.textPaint.setTextSize(this.currentTextSize);
                this.textPaint.setTypeface(this.currentTypeface);
                this.textPaint.setLetterSpacing(this.currentLetterSpacing);
                this.isRtl = calculateIsRtl(this.text);
                this.textLayout = createStaticLayout(shouldDrawMultiline() ? this.maxLines : 1, textSizeRatio, this.isRtl);
                this.textToDraw = this.textLayout.getText();
            }
        }
    }

    private StaticLayout createStaticLayout(int maxLines2, float availableWidth, boolean isRtl2) {
        Layout.Alignment textAlignment;
        StaticLayout textLayout2 = null;
        if (maxLines2 == 1) {
            try {
                textAlignment = Layout.Alignment.ALIGN_NORMAL;
            } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e) {
                Log.e(TAG, e.getCause().getMessage(), e);
            }
        } else {
            textAlignment = getMultilineTextLayoutAlignment();
        }
        textLayout2 = StaticLayoutBuilderCompat.obtain(this.text, this.textPaint, (int) availableWidth).setEllipsize(this.titleTextEllipsize).setIsRtl(isRtl2).setAlignment(textAlignment).setIncludePad(false).setMaxLines(maxLines2).setLineSpacing(this.lineSpacingAdd, this.lineSpacingMultiplier).setHyphenationFrequency(this.hyphenationFrequency).setStaticLayoutBuilderConfigurer(this.staticLayoutBuilderConfigurer).build();
        return (StaticLayout) Preconditions.checkNotNull(textLayout2);
    }

    private Layout.Alignment getMultilineTextLayoutAlignment() {
        switch (GravityCompat.getAbsoluteGravity(this.expandedTextGravity, this.isRtl ? 1 : 0) & 7) {
            case 1:
                return Layout.Alignment.ALIGN_CENTER;
            case 5:
                return this.isRtl ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
            default:
                return this.isRtl ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
    }

    private void ensureExpandedTexture() {
        if (this.expandedTitleTexture == null && !this.expandedBounds.isEmpty() && !TextUtils.isEmpty(this.textToDraw)) {
            calculateOffsets(0.0f);
            int width = this.textLayout.getWidth();
            int height = this.textLayout.getHeight();
            if (width > 0 && height > 0) {
                this.expandedTitleTexture = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.textLayout.draw(new Canvas(this.expandedTitleTexture));
                if (this.texturePaint == null) {
                    this.texturePaint = new Paint(3);
                }
            }
        }
    }

    public void recalculate() {
        recalculate(false);
    }

    public void recalculate(boolean forceRecalculate) {
        if ((this.view.getHeight() > 0 && this.view.getWidth() > 0) || forceRecalculate) {
            calculateBaseOffsets(forceRecalculate);
            calculateCurrentOffsets();
        }
    }

    public void setText(CharSequence text2) {
        if (text2 == null || !TextUtils.equals(this.text, text2)) {
            this.text = text2;
            this.textToDraw = null;
            clearTexture();
            recalculate();
        }
    }

    public CharSequence getText() {
        return this.text;
    }

    private void clearTexture() {
        if (this.expandedTitleTexture != null) {
            this.expandedTitleTexture.recycle();
            this.expandedTitleTexture = null;
        }
    }

    public void setMaxLines(int maxLines2) {
        if (maxLines2 != this.maxLines) {
            this.maxLines = maxLines2;
            clearTexture();
            recalculate();
        }
    }

    public int getMaxLines() {
        return this.maxLines;
    }

    public int getLineCount() {
        if (this.textLayout != null) {
            return this.textLayout.getLineCount();
        }
        return 0;
    }

    public int getExpandedLineCount() {
        return this.expandedLineCount;
    }

    public void setLineSpacingAdd(float spacingAdd) {
        this.lineSpacingAdd = spacingAdd;
    }

    public float getLineSpacingAdd() {
        return this.textLayout.getSpacingAdd();
    }

    public void setLineSpacingMultiplier(float spacingMultiplier) {
        this.lineSpacingMultiplier = spacingMultiplier;
    }

    public float getLineSpacingMultiplier() {
        return this.textLayout.getSpacingMultiplier();
    }

    public void setHyphenationFrequency(int hyphenationFrequency2) {
        this.hyphenationFrequency = hyphenationFrequency2;
    }

    public int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    public void setStaticLayoutBuilderConfigurer(StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer2) {
        if (this.staticLayoutBuilderConfigurer != staticLayoutBuilderConfigurer2) {
            this.staticLayoutBuilderConfigurer = staticLayoutBuilderConfigurer2;
            recalculate(true);
        }
    }

    private static boolean isClose(float value, float targetValue) {
        return Math.abs(value - targetValue) < 1.0E-5f;
    }

    public ColorStateList getExpandedTextColor() {
        return this.expandedTextColor;
    }

    public ColorStateList getCollapsedTextColor() {
        return this.collapsedTextColor;
    }

    private static int blendARGB(int color1, int color2, float ratio) {
        float inverseRatio = 1.0f - ratio;
        return Color.argb(Math.round((((float) Color.alpha(color1)) * inverseRatio) + (((float) Color.alpha(color2)) * ratio)), Math.round((((float) Color.red(color1)) * inverseRatio) + (((float) Color.red(color2)) * ratio)), Math.round((((float) Color.green(color1)) * inverseRatio) + (((float) Color.green(color2)) * ratio)), Math.round((((float) Color.blue(color1)) * inverseRatio) + (((float) Color.blue(color2)) * ratio)));
    }

    private static float lerp(float startValue, float endValue, float fraction, TimeInterpolator interpolator) {
        if (interpolator != null) {
            fraction = interpolator.getInterpolation(fraction);
        }
        return AnimationUtils.lerp(startValue, endValue, fraction);
    }

    private static boolean rectEquals(Rect r, int left, int top, int right, int bottom) {
        return r.left == left && r.top == top && r.right == right && r.bottom == bottom;
    }
}
