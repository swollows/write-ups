package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

final class RightSheetDelegate extends SheetDelegate {
    final SideSheetBehavior<? extends View> sheetBehavior;

    RightSheetDelegate(SideSheetBehavior<? extends View> sheetBehavior2) {
        this.sheetBehavior = sheetBehavior2;
    }

    /* access modifiers changed from: package-private */
    public int getSheetEdge() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int getHiddenOffset() {
        return this.sheetBehavior.getParentWidth();
    }

    /* access modifiers changed from: package-private */
    public int getExpandedOffset() {
        return Math.max(0, (getHiddenOffset() - this.sheetBehavior.getChildWidth()) - this.sheetBehavior.getInnerMargin());
    }

    /* access modifiers changed from: package-private */
    public boolean isReleasedCloseToInnerEdge(View releasedChild) {
        return releasedChild.getLeft() > (getHiddenOffset() + getExpandedOffset()) / 2;
    }

    /* access modifiers changed from: package-private */
    public boolean isSwipeSignificant(float xVelocity, float yVelocity) {
        return SheetUtils.isSwipeMostlyHorizontal(xVelocity, yVelocity) && Math.abs(xVelocity) > ((float) this.sheetBehavior.getSignificantVelocityThreshold());
    }

    /* access modifiers changed from: package-private */
    public boolean shouldHide(View child, float velocity) {
        return Math.abs(((float) child.getRight()) + (this.sheetBehavior.getHideFriction() * velocity)) > this.sheetBehavior.getHideThreshold();
    }

    /* access modifiers changed from: package-private */
    public <V extends View> int getOuterEdge(V child) {
        return child.getLeft() - this.sheetBehavior.getInnerMargin();
    }

    /* access modifiers changed from: package-private */
    public float calculateSlideOffset(int left) {
        float hiddenOffset = (float) getHiddenOffset();
        return (hiddenOffset - ((float) left)) / (hiddenOffset - ((float) getExpandedOffset()));
    }

    /* access modifiers changed from: package-private */
    public void updateCoplanarSiblingLayoutParams(ViewGroup.MarginLayoutParams coplanarSiblingLayoutParams, int sheetLeft, int sheetRight) {
        int parentWidth = this.sheetBehavior.getParentWidth();
        if (sheetLeft <= parentWidth) {
            coplanarSiblingLayoutParams.rightMargin = parentWidth - sheetLeft;
        }
    }

    /* access modifiers changed from: package-private */
    public void updateCoplanarSiblingAdjacentMargin(ViewGroup.MarginLayoutParams coplanarSiblingLayoutParams, int coplanarSiblingAdjacentMargin) {
        coplanarSiblingLayoutParams.rightMargin = coplanarSiblingAdjacentMargin;
    }

    /* access modifiers changed from: package-private */
    public int getCoplanarSiblingAdjacentMargin(ViewGroup.MarginLayoutParams coplanarSiblingLayoutParams) {
        return coplanarSiblingLayoutParams.rightMargin;
    }

    public int getParentInnerEdge(CoordinatorLayout parent) {
        return parent.getRight();
    }

    /* access modifiers changed from: package-private */
    public int calculateInnerMargin(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    /* access modifiers changed from: package-private */
    public int getMinViewPositionHorizontal() {
        return getExpandedOffset();
    }

    /* access modifiers changed from: package-private */
    public int getMaxViewPositionHorizontal() {
        return this.sheetBehavior.getParentWidth();
    }

    /* access modifiers changed from: package-private */
    public boolean isExpandingOutwards(float xVelocity) {
        return xVelocity < 0.0f;
    }
}
