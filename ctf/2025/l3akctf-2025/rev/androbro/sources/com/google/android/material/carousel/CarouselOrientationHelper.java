package com.google.android.material.carousel;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

abstract class CarouselOrientationHelper {
    final int orientation;

    /* access modifiers changed from: package-private */
    public abstract void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3);

    /* access modifiers changed from: package-private */
    public abstract int getDecoratedCrossAxisMeasurement(View view);

    /* access modifiers changed from: package-private */
    public abstract float getMaskMargins(RecyclerView.LayoutParams layoutParams);

    /* access modifiers changed from: package-private */
    public abstract RectF getMaskRect(float f, float f2, float f3, float f4);

    /* access modifiers changed from: package-private */
    public abstract int getParentBottom();

    /* access modifiers changed from: package-private */
    public abstract int getParentEnd();

    /* access modifiers changed from: package-private */
    public abstract int getParentLeft();

    /* access modifiers changed from: package-private */
    public abstract int getParentRight();

    /* access modifiers changed from: package-private */
    public abstract int getParentStart();

    /* access modifiers changed from: package-private */
    public abstract int getParentTop();

    /* access modifiers changed from: package-private */
    public abstract void layoutDecoratedWithMargins(View view, int i, int i2);

    /* access modifiers changed from: package-private */
    public abstract void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3);

    /* access modifiers changed from: package-private */
    public abstract void offsetChild(View view, Rect rect, float f, float f2);

    private CarouselOrientationHelper(int orientation2) {
        this.orientation = orientation2;
    }

    static CarouselOrientationHelper createOrientationHelper(CarouselLayoutManager layoutManager, int orientation2) {
        switch (orientation2) {
            case 0:
                return createHorizontalHelper(layoutManager);
            case 1:
                return createVerticalHelper(layoutManager);
            default:
                throw new IllegalArgumentException("invalid orientation");
        }
    }

    private static CarouselOrientationHelper createVerticalHelper(final CarouselLayoutManager carouselLayoutManager) {
        return new CarouselOrientationHelper(1) {
            /* access modifiers changed from: package-private */
            public int getParentLeft() {
                return carouselLayoutManager.getPaddingLeft();
            }

            /* access modifiers changed from: package-private */
            public int getParentStart() {
                return getParentTop();
            }

            /* access modifiers changed from: package-private */
            public int getParentRight() {
                return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
            }

            /* access modifiers changed from: package-private */
            public int getParentEnd() {
                return getParentBottom();
            }

            /* access modifiers changed from: package-private */
            public int getParentTop() {
                return 0;
            }

            /* access modifiers changed from: package-private */
            public int getParentBottom() {
                return carouselLayoutManager.getHeight();
            }

            /* access modifiers changed from: package-private */
            public int getDecoratedCrossAxisMeasurement(View child) {
                RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();
                return carouselLayoutManager.getDecoratedMeasuredWidth(child) + params.leftMargin + params.rightMargin;
            }

            public void layoutDecoratedWithMargins(View child, int head, int tail) {
                int left = getParentLeft();
                carouselLayoutManager.layoutDecoratedWithMargins(child, left, head, left + getDecoratedCrossAxisMeasurement(child), tail);
            }

            public float getMaskMargins(RecyclerView.LayoutParams layoutParams) {
                return (float) (layoutParams.topMargin + layoutParams.bottomMargin);
            }

            public RectF getMaskRect(float childHeight, float childWidth, float maskHeight, float maskWidth) {
                return new RectF(0.0f, maskHeight, childWidth, childHeight - maskHeight);
            }

            public void containMaskWithinBounds(RectF maskRect, RectF offsetMaskRect, RectF boundsRect) {
                if (offsetMaskRect.top < boundsRect.top && offsetMaskRect.bottom > boundsRect.top) {
                    float diff = boundsRect.top - offsetMaskRect.top;
                    maskRect.top += diff;
                    boundsRect.top += diff;
                }
                if (offsetMaskRect.bottom > boundsRect.bottom && offsetMaskRect.top < boundsRect.bottom) {
                    float diff2 = offsetMaskRect.bottom - boundsRect.bottom;
                    maskRect.bottom = Math.max(maskRect.bottom - diff2, maskRect.top);
                    offsetMaskRect.bottom = Math.max(offsetMaskRect.bottom - diff2, offsetMaskRect.top);
                }
            }

            public void moveMaskOnEdgeOutsideBounds(RectF maskRect, RectF offsetMaskRect, RectF parentBoundsRect) {
                if (offsetMaskRect.bottom <= parentBoundsRect.top) {
                    maskRect.bottom = ((float) Math.floor((double) maskRect.bottom)) - 1.0f;
                    maskRect.top = Math.min(maskRect.top, maskRect.bottom);
                }
                if (offsetMaskRect.top >= parentBoundsRect.bottom) {
                    maskRect.top = ((float) Math.ceil((double) maskRect.top)) + 1.0f;
                    maskRect.bottom = Math.max(maskRect.top, maskRect.bottom);
                }
            }

            public void offsetChild(View child, Rect boundsRect, float halfItemSize, float offsetCenter) {
                child.offsetTopAndBottom((int) (offsetCenter - (((float) boundsRect.top) + halfItemSize)));
            }
        };
    }

    private static CarouselOrientationHelper createHorizontalHelper(final CarouselLayoutManager carouselLayoutManager) {
        return new CarouselOrientationHelper(0) {
            /* access modifiers changed from: package-private */
            public int getParentLeft() {
                return 0;
            }

            /* access modifiers changed from: package-private */
            public int getParentStart() {
                return carouselLayoutManager.isLayoutRtl() ? getParentRight() : getParentLeft();
            }

            /* access modifiers changed from: package-private */
            public int getParentRight() {
                return carouselLayoutManager.getWidth();
            }

            /* access modifiers changed from: package-private */
            public int getParentEnd() {
                return carouselLayoutManager.isLayoutRtl() ? getParentLeft() : getParentRight();
            }

            /* access modifiers changed from: package-private */
            public int getParentTop() {
                return carouselLayoutManager.getPaddingTop();
            }

            /* access modifiers changed from: package-private */
            public int getParentBottom() {
                return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
            }

            /* access modifiers changed from: package-private */
            public int getDecoratedCrossAxisMeasurement(View child) {
                RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();
                return carouselLayoutManager.getDecoratedMeasuredHeight(child) + params.topMargin + params.bottomMargin;
            }

            public void layoutDecoratedWithMargins(View child, int head, int tail) {
                int top = getParentTop();
                carouselLayoutManager.layoutDecoratedWithMargins(child, head, top, tail, top + getDecoratedCrossAxisMeasurement(child));
            }

            public float getMaskMargins(RecyclerView.LayoutParams layoutParams) {
                return (float) (layoutParams.rightMargin + layoutParams.leftMargin);
            }

            public RectF getMaskRect(float childHeight, float childWidth, float maskHeight, float maskWidth) {
                return new RectF(maskWidth, 0.0f, childWidth - maskWidth, childHeight);
            }

            public void containMaskWithinBounds(RectF maskRect, RectF offsetMaskRect, RectF boundsRect) {
                if (offsetMaskRect.left < boundsRect.left && offsetMaskRect.right > boundsRect.left) {
                    float diff = boundsRect.left - offsetMaskRect.left;
                    maskRect.left += diff;
                    offsetMaskRect.left += diff;
                }
                if (offsetMaskRect.right > boundsRect.right && offsetMaskRect.left < boundsRect.right) {
                    float diff2 = offsetMaskRect.right - boundsRect.right;
                    maskRect.right = Math.max(maskRect.right - diff2, maskRect.left);
                    offsetMaskRect.right = Math.max(offsetMaskRect.right - diff2, offsetMaskRect.left);
                }
            }

            public void moveMaskOnEdgeOutsideBounds(RectF maskRect, RectF offsetMaskRect, RectF parentBoundsRect) {
                if (offsetMaskRect.right <= parentBoundsRect.left) {
                    maskRect.right = ((float) Math.floor((double) maskRect.right)) - 1.0f;
                    maskRect.left = Math.min(maskRect.left, maskRect.right);
                }
                if (offsetMaskRect.left >= parentBoundsRect.right) {
                    maskRect.left = ((float) Math.ceil((double) maskRect.left)) + 1.0f;
                    maskRect.right = Math.max(maskRect.left, maskRect.right);
                }
            }

            public void offsetChild(View child, Rect boundsRect, float halfItemSize, float offsetCenter) {
                child.offsetLeftAndRight((int) (offsetCenter - (((float) boundsRect.left) + halfItemSize)));
            }
        };
    }
}
