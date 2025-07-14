package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import com.google.android.material.canvas.CanvasCompat;

public abstract class ShapeableDelegate {
    boolean forceCompatClippingEnabled = false;
    RectF maskBounds = new RectF();
    boolean offsetZeroCornerEdgeBoundsEnabled = false;
    ShapeAppearanceModel shapeAppearanceModel;
    final Path shapePath = new Path();

    /* access modifiers changed from: package-private */
    public abstract void invalidateClippingMethod(View view);

    /* access modifiers changed from: package-private */
    public abstract boolean shouldUseCompatClipping();

    public static ShapeableDelegate create(View view) {
        if (Build.VERSION.SDK_INT >= 33) {
            return new ShapeableDelegateV33(view);
        }
        return new ShapeableDelegateV22(view);
    }

    public boolean isForceCompatClippingEnabled() {
        return this.forceCompatClippingEnabled;
    }

    public void setForceCompatClippingEnabled(View view, boolean enabled) {
        if (enabled != this.forceCompatClippingEnabled) {
            this.forceCompatClippingEnabled = enabled;
            invalidateClippingMethod(view);
        }
    }

    public void setOffsetZeroCornerEdgeBoundsEnabled(View view, boolean enabled) {
        this.offsetZeroCornerEdgeBoundsEnabled = enabled;
        invalidateClippingMethod(view);
    }

    public void onShapeAppearanceChanged(View view, ShapeAppearanceModel shapeAppearanceModel2) {
        this.shapeAppearanceModel = shapeAppearanceModel2;
        updateShapePath();
        invalidateClippingMethod(view);
    }

    public void onMaskChanged(View view, RectF maskBounds2) {
        this.maskBounds = maskBounds2;
        updateShapePath();
        invalidateClippingMethod(view);
    }

    private void updateShapePath() {
        if (isMaskBoundsValid() && this.shapeAppearanceModel != null) {
            ShapeAppearancePathProvider.getInstance().calculatePath(this.shapeAppearanceModel, 1.0f, this.maskBounds, this.shapePath);
        }
    }

    private boolean isMaskBoundsValid() {
        return this.maskBounds.left <= this.maskBounds.right && this.maskBounds.top <= this.maskBounds.bottom;
    }

    public void maybeClip(Canvas canvas, CanvasCompat.CanvasOperation op) {
        if (!shouldUseCompatClipping() || this.shapePath.isEmpty()) {
            op.run(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.shapePath);
        op.run(canvas);
        canvas.restore();
    }
}
