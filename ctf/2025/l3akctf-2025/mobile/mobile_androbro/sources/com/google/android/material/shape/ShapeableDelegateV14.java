package com.google.android.material.shape;

import android.view.View;

class ShapeableDelegateV14 extends ShapeableDelegate {
    ShapeableDelegateV14() {
    }

    /* access modifiers changed from: package-private */
    public boolean shouldUseCompatClipping() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void invalidateClippingMethod(View view) {
        if (this.shapeAppearanceModel != null && !this.maskBounds.isEmpty() && shouldUseCompatClipping()) {
            view.invalidate();
        }
    }
}
