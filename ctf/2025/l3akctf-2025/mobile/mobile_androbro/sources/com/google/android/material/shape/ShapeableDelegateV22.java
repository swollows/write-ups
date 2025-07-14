package com.google.android.material.shape;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

class ShapeableDelegateV22 extends ShapeableDelegate {
    private boolean canUseViewOutline = false;
    /* access modifiers changed from: private */
    public float cornerRadius = 0.0f;

    ShapeableDelegateV22(View view) {
        initMaskOutlineProvider(view);
    }

    /* access modifiers changed from: package-private */
    public boolean shouldUseCompatClipping() {
        return !this.canUseViewOutline || this.forceCompatClippingEnabled;
    }

    /* access modifiers changed from: package-private */
    public void invalidateClippingMethod(View view) {
        this.cornerRadius = getDefaultCornerRadius();
        this.canUseViewOutline = isShapeRoundRect() || offsetZeroCornerEdgeBoundsIfPossible();
        view.setClipToOutline(!shouldUseCompatClipping());
        if (shouldUseCompatClipping()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    private float getDefaultCornerRadius() {
        if (this.shapeAppearanceModel == null || this.maskBounds == null) {
            return 0.0f;
        }
        return this.shapeAppearanceModel.topRightCornerSize.getCornerSize(this.maskBounds);
    }

    private boolean isShapeRoundRect() {
        if (this.maskBounds.isEmpty() || this.shapeAppearanceModel == null) {
            return false;
        }
        return this.shapeAppearanceModel.isRoundRect(this.maskBounds);
    }

    private boolean offsetZeroCornerEdgeBoundsIfPossible() {
        if (this.maskBounds.isEmpty() || this.shapeAppearanceModel == null || !this.offsetZeroCornerEdgeBoundsEnabled || this.shapeAppearanceModel.isRoundRect(this.maskBounds) || !shapeUsesAllRoundedCornerTreatments(this.shapeAppearanceModel)) {
            return false;
        }
        float topLeft = this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.maskBounds);
        float topRight = this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.maskBounds);
        float bottomLeft = this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.maskBounds);
        float bottomRight = this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.maskBounds);
        if (topLeft == 0.0f && bottomLeft == 0.0f && topRight == bottomRight) {
            this.maskBounds.set(this.maskBounds.left - topRight, this.maskBounds.top, this.maskBounds.right, this.maskBounds.bottom);
            this.cornerRadius = topRight;
            return true;
        } else if (topLeft == 0.0f && topRight == 0.0f && bottomLeft == bottomRight) {
            this.maskBounds.set(this.maskBounds.left, this.maskBounds.top - bottomLeft, this.maskBounds.right, this.maskBounds.bottom);
            this.cornerRadius = bottomLeft;
            return true;
        } else if (topRight == 0.0f && bottomRight == 0.0f && topLeft == bottomLeft) {
            this.maskBounds.set(this.maskBounds.left, this.maskBounds.top, this.maskBounds.right + topLeft, this.maskBounds.bottom);
            this.cornerRadius = topLeft;
            return true;
        } else if (bottomLeft != 0.0f || bottomRight != 0.0f || topLeft != topRight) {
            return false;
        } else {
            this.maskBounds.set(this.maskBounds.left, this.maskBounds.top, this.maskBounds.right, this.maskBounds.bottom + topLeft);
            this.cornerRadius = topLeft;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public float getCornerRadius() {
        return this.cornerRadius;
    }

    private static boolean shapeUsesAllRoundedCornerTreatments(ShapeAppearanceModel model) {
        return (model.getTopLeftCorner() instanceof RoundedCornerTreatment) && (model.getTopRightCorner() instanceof RoundedCornerTreatment) && (model.getBottomLeftCorner() instanceof RoundedCornerTreatment) && (model.getBottomRightCorner() instanceof RoundedCornerTreatment);
    }

    private void initMaskOutlineProvider(View view) {
        view.setOutlineProvider(new ViewOutlineProvider() {
            public void getOutline(View view, Outline outline) {
                if (ShapeableDelegateV22.this.shapeAppearanceModel != null && !ShapeableDelegateV22.this.maskBounds.isEmpty()) {
                    outline.setRoundRect((int) ShapeableDelegateV22.this.maskBounds.left, (int) ShapeableDelegateV22.this.maskBounds.top, (int) ShapeableDelegateV22.this.maskBounds.right, (int) ShapeableDelegateV22.this.maskBounds.bottom, ShapeableDelegateV22.this.cornerRadius);
                }
            }
        });
    }
}
