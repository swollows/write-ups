package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

final class LeftSheetDelegate extends SheetDelegate {
    final SideSheetBehavior<? extends View> sheetBehavior;

    LeftSheetDelegate(SideSheetBehavior<? extends View> sheetBehavior2) {
        this.sheetBehavior = sheetBehavior2;
    }

    /* access modifiers changed from: package-private */
    public int getSheetEdge() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    public int getHiddenOffset() {
        return (-this.sheetBehavior.getChildWidth()) - this.sheetBehavior.getInnerMargin();
    }

    /* access modifiers changed from: package-private */
    public int getExpandedOffset() {
        return Math.max(0, this.sheetBehavior.getParentInnerEdge() + this.sheetBehavior.getInnerMargin());
    }

    /* access modifiers changed from: package-private */
    public boolean isReleasedCloseToInnerEdge(View releasedChild) {
        return releasedChild.getRight() < (getExpandedOffset() - getHiddenOffset()) / 2;
    }

    /* access modifiers changed from: package-private */
    public boolean isSwipeSignificant(float xVelocity, float yVelocity) {
        return SheetUtils.isSwipeMostlyHorizontal(xVelocity, yVelocity) && Math.abs(xVelocity) > ((float) this.sheetBehavior.getSignificantVelocityThreshold());
    }

    /* access modifiers changed from: package-private */
    public boolean shouldHide(View child, float velocity) {
        return Math.abs(((float) child.getLeft()) + (this.sheetBehavior.getHideFriction() * velocity)) > this.sheetBehavior.getHideThreshold();
    }

    /* access modifiers changed from: package-private */
    public <V extends View> int getOuterEdge(V child) {
        return child.getRight() + this.sheetBehavior.getInnerMargin();
    }

    /* access modifiers changed from: package-private */
    public float calculateSlideOffset(int left) {
        float hiddenOffset = (float) getHiddenOffset();
        return (((float) left) - hiddenOffset) / (((float) getExpandedOffset()) - hiddenOffset);
    }

    /* access modifiers changed from: package-private */
    public void updateCoplanarSiblingLayoutParams(ViewGroup.MarginLayoutParams coplanarSiblingLayoutParams, int sheetLeft, int sheetRight) {
        if (sheetLeft <= this.sheetBehavior.getParentWidth()) {
            coplanarSiblingLayoutParams.leftMargin = sheetRight;
        }
    }

    /* access modifiers changed from: package-private */
    public void updateCoplanarSiblingAdjacentMargin(ViewGroup.MarginLayoutParams coplanarSiblingLayoutParams, int coplanarSiblingAdjacentMargin) {
        coplanarSiblingLayoutParams.leftMargin = coplanarSiblingAdjacentMargin;
    }

    /* access modifiers changed from: package-private */
    public int getCoplanarSiblingAdjacentMargin(ViewGroup.MarginLayoutParams coplanarSiblingLayoutParams) {
        return coplanarSiblingLayoutParams.leftMargin;
    }

    public int getParentInnerEdge(CoordinatorLayout parent) {
        return parent.getLeft();
    }

    /* access modifiers changed from: package-private */
    public int calculateInnerMargin(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    /* access modifiers changed from: package-private */
    public int getMinViewPositionHorizontal() {
        return -this.sheetBehavior.getChildWidth();
    }

    /* access modifiers changed from: package-private */
    public int getMaxViewPositionHorizontal() {
        return this.sheetBehavior.getInnerMargin();
    }

    /* access modifiers changed from: package-private */
    public boolean isExpandingOutwards(float xVelocity) {
        return xVelocity > 0.0f;
    }
}
