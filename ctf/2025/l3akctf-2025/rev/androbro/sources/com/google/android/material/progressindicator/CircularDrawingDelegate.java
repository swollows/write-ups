package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;
import com.google.android.material.progressindicator.DrawingDelegate;

final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {
    private static final float ROUND_CAP_RAMP_DOWN_THRESHHOLD = 0.01f;
    private float adjustedRadius;
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private float totalTrackLengthFraction;
    private boolean useStrokeCap;

    CircularDrawingDelegate(CircularProgressIndicatorSpec spec) {
        super(spec);
    }

    /* access modifiers changed from: package-private */
    public int getPreferredWidth() {
        return getSize();
    }

    /* access modifiers changed from: package-private */
    public int getPreferredHeight() {
        return getSize();
    }

    /* access modifiers changed from: package-private */
    public void adjustCanvas(Canvas canvas, Rect bounds, float trackThicknessFraction, boolean isShowing, boolean isHiding) {
        Canvas canvas2 = canvas;
        Rect rect = bounds;
        float f = trackThicknessFraction;
        float scaleX = ((float) bounds.width()) / ((float) getPreferredWidth());
        float scaleY = ((float) bounds.height()) / ((float) getPreferredHeight());
        float outerRadiusWithInset = (((float) ((CircularProgressIndicatorSpec) this.spec).indicatorSize) / 2.0f) + ((float) ((CircularProgressIndicatorSpec) this.spec).indicatorInset);
        canvas2.translate(((float) rect.left) + (outerRadiusWithInset * scaleX), ((float) rect.top) + (outerRadiusWithInset * scaleY));
        canvas2.rotate(-90.0f);
        canvas2.scale(scaleX, scaleY);
        if (((CircularProgressIndicatorSpec) this.spec).indicatorDirection != 0) {
            canvas2.scale(1.0f, -1.0f);
        }
        canvas2.clipRect(-outerRadiusWithInset, -outerRadiusWithInset, outerRadiusWithInset, outerRadiusWithInset);
        this.useStrokeCap = ((CircularProgressIndicatorSpec) this.spec).trackThickness / 2 <= ((CircularProgressIndicatorSpec) this.spec).trackCornerRadius;
        this.displayedTrackThickness = ((float) ((CircularProgressIndicatorSpec) this.spec).trackThickness) * f;
        this.displayedCornerRadius = ((float) Math.min(((CircularProgressIndicatorSpec) this.spec).trackThickness / 2, ((CircularProgressIndicatorSpec) this.spec).trackCornerRadius)) * f;
        this.adjustedRadius = ((float) (((CircularProgressIndicatorSpec) this.spec).indicatorSize - ((CircularProgressIndicatorSpec) this.spec).trackThickness)) / 2.0f;
        if (isShowing || isHiding) {
            if ((isShowing && ((CircularProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (isHiding && ((CircularProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
                this.adjustedRadius += ((1.0f - f) * ((float) ((CircularProgressIndicatorSpec) this.spec).trackThickness)) / 2.0f;
            } else if ((isShowing && ((CircularProgressIndicatorSpec) this.spec).showAnimationBehavior == 1) || (isHiding && ((CircularProgressIndicatorSpec) this.spec).hideAnimationBehavior == 2)) {
                this.adjustedRadius -= ((1.0f - f) * ((float) ((CircularProgressIndicatorSpec) this.spec).trackThickness)) / 2.0f;
            }
        }
        if (!isHiding || ((CircularProgressIndicatorSpec) this.spec).hideAnimationBehavior != 3) {
            this.totalTrackLengthFraction = 1.0f;
        } else {
            this.totalTrackLengthFraction = f;
        }
    }

    /* access modifiers changed from: package-private */
    public void fillIndicator(Canvas canvas, Paint paint, DrawingDelegate.ActiveIndicator activeIndicator, int drawableAlpha) {
        drawArc(canvas, paint, activeIndicator.startFraction, activeIndicator.endFraction, MaterialColors.compositeARGBWithAlpha(activeIndicator.color, drawableAlpha), activeIndicator.gapSize, activeIndicator.gapSize);
    }

    /* access modifiers changed from: package-private */
    public void fillTrack(Canvas canvas, Paint paint, float startFraction, float endFraction, int color, int drawableAlpha, int gapSize) {
        drawArc(canvas, paint, startFraction, endFraction, MaterialColors.compositeARGBWithAlpha(color, drawableAlpha), gapSize, gapSize);
    }

    private void drawArc(Canvas canvas, Paint paint, float startFraction, float endFraction, int paintColor, int startGapSize, int endGapSize) {
        float f;
        Paint paint2 = paint;
        if (endFraction >= startFraction) {
            f = endFraction - startFraction;
        } else {
            f = (endFraction + 1.0f) - startFraction;
        }
        float arcFraction = f;
        float startFraction2 = startFraction % 1.0f;
        if (this.totalTrackLengthFraction >= 1.0f || startFraction2 + arcFraction <= 1.0f) {
            float displayedCornerRadiusInDegree = (float) Math.toDegrees((double) (this.displayedCornerRadius / this.adjustedRadius));
            if (startFraction2 == 0.0f && arcFraction >= 0.99f) {
                arcFraction += ((arcFraction - 0.99f) * ((displayedCornerRadiusInDegree * 2.0f) / 360.0f)) / ROUND_CAP_RAMP_DOWN_THRESHHOLD;
            }
            float startFraction3 = MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, startFraction2);
            float arcFraction2 = MathUtils.lerp(0.0f, this.totalTrackLengthFraction, arcFraction);
            float startGapSizeInDegrees = (float) Math.toDegrees((double) (((float) startGapSize) / this.adjustedRadius));
            float endGapSizeInDegrees = (float) Math.toDegrees((double) (((float) endGapSize) / this.adjustedRadius));
            float arcDegree = ((arcFraction2 * 360.0f) - startGapSizeInDegrees) - endGapSizeInDegrees;
            float startDegree = (360.0f * startFraction3) + startGapSizeInDegrees;
            if (arcDegree > 0.0f) {
                paint2.setAntiAlias(true);
                paint2.setColor(paintColor);
                paint2.setStrokeWidth(this.displayedTrackThickness);
                if (arcDegree < displayedCornerRadiusInDegree * 2.0f) {
                    float shrinkRatio = arcDegree / (displayedCornerRadiusInDegree * 2.0f);
                    paint2.setStyle(Paint.Style.FILL);
                    drawRoundedBlock(canvas, paint, startDegree + (displayedCornerRadiusInDegree * shrinkRatio), this.displayedCornerRadius * 2.0f, this.displayedTrackThickness, shrinkRatio);
                    float f2 = endGapSizeInDegrees;
                    float f3 = startGapSizeInDegrees;
                    return;
                }
                RectF arcBound = new RectF(-this.adjustedRadius, -this.adjustedRadius, this.adjustedRadius, this.adjustedRadius);
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeCap(this.useStrokeCap ? Paint.Cap.ROUND : Paint.Cap.BUTT);
                float f4 = endGapSizeInDegrees;
                float f5 = startGapSizeInDegrees;
                canvas.drawArc(arcBound, startDegree + displayedCornerRadiusInDegree, arcDegree - (displayedCornerRadiusInDegree * 2.0f), false, paint);
                if (!this.useStrokeCap && this.displayedCornerRadius > 0.0f) {
                    paint2.setStyle(Paint.Style.FILL);
                    Canvas canvas2 = canvas;
                    Paint paint3 = paint;
                    drawRoundedBlock(canvas2, paint3, startDegree + displayedCornerRadiusInDegree, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness);
                    drawRoundedBlock(canvas2, paint3, (startDegree + arcDegree) - displayedCornerRadiusInDegree, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness);
                    return;
                }
                return;
            }
            return;
        }
        Canvas canvas3 = canvas;
        Paint paint4 = paint;
        int i = paintColor;
        drawArc(canvas3, paint4, startFraction2, 1.0f, i, startGapSize, 0);
        drawArc(canvas3, paint4, 1.0f, startFraction2 + arcFraction, i, 0, endGapSize);
    }

    /* access modifiers changed from: package-private */
    public void drawStopIndicator(Canvas canvas, Paint paint, int color, int drawableAlpha) {
    }

    private int getSize() {
        return ((CircularProgressIndicatorSpec) this.spec).indicatorSize + (((CircularProgressIndicatorSpec) this.spec).indicatorInset * 2);
    }

    private void drawRoundedBlock(Canvas canvas, Paint paint, float positionInDeg, float markWidth, float markHeight) {
        drawRoundedBlock(canvas, paint, positionInDeg, markWidth, markHeight, 1.0f);
    }

    private void drawRoundedBlock(Canvas canvas, Paint paint, float positionInDeg, float markWidth, float markHeight, float scale) {
        float markHeight2 = (float) ((int) Math.min(markHeight, this.displayedTrackThickness));
        float markCornerSize = Math.min(markWidth / 2.0f, (this.displayedCornerRadius * markHeight2) / this.displayedTrackThickness);
        RectF roundedBlock = new RectF((-markHeight2) / 2.0f, (-markWidth) / 2.0f, markHeight2 / 2.0f, markWidth / 2.0f);
        canvas.save();
        canvas.translate((float) (((double) this.adjustedRadius) * Math.cos(Math.toRadians((double) positionInDeg))), (float) (((double) this.adjustedRadius) * Math.sin(Math.toRadians((double) positionInDeg))));
        canvas.rotate(positionInDeg);
        canvas.scale(scale, scale);
        canvas.drawRoundRect(roundedBlock, markCornerSize, markCornerSize, paint);
        canvas.restore();
    }
}
