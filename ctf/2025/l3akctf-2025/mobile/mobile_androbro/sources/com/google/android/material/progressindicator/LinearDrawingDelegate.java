package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.core.math.MathUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.DrawingDelegate;

final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private float totalTrackLengthFraction;
    private float trackLength = 300.0f;
    private boolean useStrokeCap;

    LinearDrawingDelegate(LinearProgressIndicatorSpec spec) {
        super(spec);
    }

    /* access modifiers changed from: package-private */
    public int getPreferredWidth() {
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int getPreferredHeight() {
        return ((LinearProgressIndicatorSpec) this.spec).trackThickness;
    }

    /* access modifiers changed from: package-private */
    public void adjustCanvas(Canvas canvas, Rect bounds, float trackThicknessFraction, boolean isShowing, boolean isHiding) {
        Canvas canvas2 = canvas;
        Rect rect = bounds;
        float f = trackThicknessFraction;
        this.trackLength = (float) bounds.width();
        float trackSize = (float) ((LinearProgressIndicatorSpec) this.spec).trackThickness;
        canvas2.translate(((float) rect.left) + (((float) bounds.width()) / 2.0f), ((float) rect.top) + (((float) bounds.height()) / 2.0f) + Math.max(0.0f, (((float) bounds.height()) - trackSize) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas2.scale(-1.0f, 1.0f);
        }
        float halfTrackLength = this.trackLength / 2.0f;
        float halfTrackSize = trackSize / 2.0f;
        canvas2.clipRect(-halfTrackLength, -halfTrackSize, halfTrackLength, halfTrackSize);
        this.useStrokeCap = ((LinearProgressIndicatorSpec) this.spec).trackThickness / 2 == ((LinearProgressIndicatorSpec) this.spec).trackCornerRadius;
        this.displayedTrackThickness = ((float) ((LinearProgressIndicatorSpec) this.spec).trackThickness) * f;
        this.displayedCornerRadius = ((float) Math.min(((LinearProgressIndicatorSpec) this.spec).trackThickness / 2, ((LinearProgressIndicatorSpec) this.spec).trackCornerRadius)) * f;
        if (isShowing || isHiding) {
            if ((isShowing && ((LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (isHiding && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
                canvas2.scale(1.0f, -1.0f);
            }
            if (isShowing || (isHiding && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior != 3)) {
                canvas2.translate(0.0f, (((float) ((LinearProgressIndicatorSpec) this.spec).trackThickness) * (1.0f - f)) / 2.0f);
            }
        }
        if (!isHiding || ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior != 3) {
            this.totalTrackLengthFraction = 1.0f;
        } else {
            this.totalTrackLengthFraction = f;
        }
    }

    /* access modifiers changed from: package-private */
    public void fillIndicator(Canvas canvas, Paint paint, DrawingDelegate.ActiveIndicator activeIndicator, int drawableAlpha) {
        drawLine(canvas, paint, activeIndicator.startFraction, activeIndicator.endFraction, MaterialColors.compositeARGBWithAlpha(activeIndicator.color, drawableAlpha), activeIndicator.gapSize, activeIndicator.gapSize);
    }

    /* access modifiers changed from: package-private */
    public void fillTrack(Canvas canvas, Paint paint, float startFraction, float endFraction, int color, int drawableAlpha, int gapSize) {
        drawLine(canvas, paint, startFraction, endFraction, MaterialColors.compositeARGBWithAlpha(color, drawableAlpha), gapSize, gapSize);
    }

    private void drawLine(Canvas canvas, Paint paint, float startFraction, float endFraction, int paintColor, int startGapSize, int endGapSize) {
        Paint paint2 = paint;
        float startFraction2 = MathUtils.clamp(startFraction, 0.0f, 1.0f);
        float endFraction2 = MathUtils.clamp(endFraction, 0.0f, 1.0f);
        float startFraction3 = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, startFraction2);
        float endFraction3 = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, endFraction2);
        int startPx = (int) ((this.trackLength * startFraction3) + ((float) ((int) ((((float) startGapSize) * MathUtils.clamp(startFraction3, 0.0f, 0.01f)) / 0.01f))));
        int endPx = (int) ((this.trackLength * endFraction3) - ((float) ((int) ((((float) endGapSize) * (1.0f - MathUtils.clamp(endFraction3, 0.99f, 1.0f))) / 0.01f))));
        float originX = (-this.trackLength) / 2.0f;
        if (startPx <= endPx) {
            float startBlockCenterX = ((float) startPx) + this.displayedCornerRadius;
            float endBlockCenterX = ((float) endPx) - this.displayedCornerRadius;
            float blockWidth = this.displayedCornerRadius * 2.0f;
            paint2.setColor(paintColor);
            paint2.setAntiAlias(true);
            paint2.setStrokeWidth(this.displayedTrackThickness);
            if (startBlockCenterX >= endBlockCenterX) {
                drawRoundedBlock(canvas, paint, new PointF(startBlockCenterX + originX, 0.0f), new PointF(endBlockCenterX + originX, 0.0f), blockWidth, this.displayedTrackThickness);
                return;
            }
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeCap(this.useStrokeCap ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            canvas.drawLine(startBlockCenterX + originX, 0.0f, endBlockCenterX + originX, 0.0f, paint);
            if (!this.useStrokeCap && this.displayedCornerRadius > 0.0f) {
                paint2.setStyle(Paint.Style.FILL);
                if (startBlockCenterX > 0.0f) {
                    drawRoundedBlock(canvas, paint, new PointF(startBlockCenterX + originX, 0.0f), blockWidth, this.displayedTrackThickness);
                }
                if (endBlockCenterX < this.trackLength) {
                    drawRoundedBlock(canvas, paint, new PointF(endBlockCenterX + originX, 0.0f), blockWidth, this.displayedTrackThickness);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void drawStopIndicator(Canvas canvas, Paint paint, int color, int drawableAlpha) {
        int paintColor = MaterialColors.compositeARGBWithAlpha(color, drawableAlpha);
        if (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize > 0 && paintColor != 0) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(paintColor);
            drawRoundedBlock(canvas, paint, new PointF((this.trackLength / 2.0f) - (this.displayedTrackThickness / 2.0f), 0.0f), (float) ((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize, (float) ((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize);
        }
    }

    private void drawRoundedBlock(Canvas canvas, Paint paint, PointF center, float markWidth, float markHeight) {
        drawRoundedBlock(canvas, paint, center, (PointF) null, markWidth, markHeight);
    }

    private void drawRoundedBlock(Canvas canvas, Paint paint, PointF drawCenter, PointF clipCenter, float markWidth, float markHeight) {
        float markHeight2 = Math.min(markHeight, this.displayedTrackThickness);
        float markCornerSize = Math.min(markWidth / 2.0f, (this.displayedCornerRadius * markHeight2) / this.displayedTrackThickness);
        RectF roundedBlock = new RectF((-markWidth) / 2.0f, (-markHeight2) / 2.0f, markWidth / 2.0f, markHeight2 / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (clipCenter != null) {
            canvas.translate(clipCenter.x, clipCenter.y);
            Path clipPath = new Path();
            clipPath.addRoundRect(roundedBlock, markCornerSize, markCornerSize, Path.Direction.CCW);
            canvas.clipPath(clipPath);
            canvas.translate(-clipCenter.x, -clipCenter.y);
        }
        canvas.translate(drawCenter.x, drawCenter.y);
        canvas.drawRoundRect(roundedBlock, markCornerSize, markCornerSize, paint);
        canvas.restore();
    }
}
