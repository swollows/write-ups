package com.google.android.material.carousel;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

public class CarouselSnapHelper extends SnapHelper {
    private static final float HORIZONTAL_SNAP_SPEED = 100.0f;
    private static final float VERTICAL_SNAP_SPEED = 50.0f;
    private final boolean disableFling;
    /* access modifiers changed from: private */
    public RecyclerView recyclerView;

    public CarouselSnapHelper() {
        this(true);
    }

    public CarouselSnapHelper(boolean disableFling2) {
        this.disableFling = disableFling2;
    }

    public void attachToRecyclerView(RecyclerView recyclerView2) {
        super.attachToRecyclerView(recyclerView2);
        this.recyclerView = recyclerView2;
    }

    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        return calculateDistanceToSnap(layoutManager, view, false);
    }

    /* access modifiers changed from: private */
    public int[] calculateDistanceToSnap(RecyclerView.LayoutManager layoutManager, View view, boolean partialSnap) {
        if (!(layoutManager instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int offset = distanceToFirstFocalKeyline(view, (CarouselLayoutManager) layoutManager, partialSnap);
        if (layoutManager.canScrollHorizontally()) {
            return new int[]{offset, 0};
        }
        if (layoutManager.canScrollVertically()) {
            return new int[]{0, offset};
        }
        return new int[]{0, 0};
    }

    private int distanceToFirstFocalKeyline(View targetView, CarouselLayoutManager layoutManager, boolean partialSnap) {
        return layoutManager.getOffsetToScrollToPositionForSnap(layoutManager.getPosition(targetView), partialSnap);
    }

    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        return findViewNearestFirstKeyline(layoutManager);
    }

    private View findViewNearestFirstKeyline(RecyclerView.LayoutManager layoutManager) {
        int childCount = layoutManager.getChildCount();
        if (childCount == 0 || !(layoutManager instanceof CarouselLayoutManager)) {
            return null;
        }
        View closestChild = null;
        int absClosest = Integer.MAX_VALUE;
        CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) layoutManager;
        for (int i = 0; i < childCount; i++) {
            View child = layoutManager.getChildAt(i);
            int offset = Math.abs(carouselLayoutManager.getOffsetToScrollToPositionForSnap(layoutManager.getPosition(child), false));
            if (offset < absClosest) {
                absClosest = offset;
                closestChild = child;
            }
        }
        return closestChild;
    }

    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int velocityX, int velocityY) {
        int itemCount;
        if (!this.disableFling || (itemCount = layoutManager.getItemCount()) == 0) {
            return -1;
        }
        View closestChildBeforeKeyline = null;
        int distanceBefore = Integer.MIN_VALUE;
        View closestChildAfterKeyline = null;
        int distanceAfter = Integer.MAX_VALUE;
        int childCount = layoutManager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = layoutManager.getChildAt(i);
            if (child != null) {
                int distance = distanceToFirstFocalKeyline(child, (CarouselLayoutManager) layoutManager, false);
                if (distance <= 0 && distance > distanceBefore) {
                    distanceBefore = distance;
                    closestChildBeforeKeyline = child;
                }
                if (distance >= 0 && distance < distanceAfter) {
                    distanceAfter = distance;
                    closestChildAfterKeyline = child;
                }
            }
        }
        int i2 = isForwardFling(layoutManager, velocityX, velocityY);
        if (i2 != 0 && closestChildAfterKeyline != null) {
            return layoutManager.getPosition(closestChildAfterKeyline);
        }
        if (i2 == 0 && closestChildBeforeKeyline != null) {
            return layoutManager.getPosition(closestChildBeforeKeyline);
        }
        View visibleView = i2 != 0 ? closestChildBeforeKeyline : closestChildAfterKeyline;
        if (visibleView == null) {
            return -1;
        }
        int snapToPosition = (isReverseLayout(layoutManager) == i2 ? -1 : 1) + layoutManager.getPosition(visibleView);
        if (snapToPosition < 0 || snapToPosition >= itemCount) {
            return -1;
        }
        return snapToPosition;
    }

    private boolean isForwardFling(RecyclerView.LayoutManager layoutManager, int velocityX, int velocityY) {
        if (layoutManager.canScrollHorizontally()) {
            if (velocityX > 0) {
                return true;
            }
            return false;
        } else if (velocityY > 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isReverseLayout(RecyclerView.LayoutManager layoutManager) {
        PointF vectorForEnd;
        int itemCount = layoutManager.getItemCount();
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (vectorForEnd = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        if (vectorForEnd.x < 0.0f || vectorForEnd.y < 0.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public RecyclerView.SmoothScroller createScroller(final RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.recyclerView.getContext()) {
                /* access modifiers changed from: protected */
                public void onTargetFound(View targetView, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    if (CarouselSnapHelper.this.recyclerView != null) {
                        int[] snapDistances = CarouselSnapHelper.this.calculateDistanceToSnap(CarouselSnapHelper.this.recyclerView.getLayoutManager(), targetView, true);
                        int dx = snapDistances[0];
                        int dy = snapDistances[1];
                        int time = calculateTimeForDeceleration(Math.max(Math.abs(dx), Math.abs(dy)));
                        if (time > 0) {
                            action.update(dx, dy, time, this.mDecelerateInterpolator);
                        }
                    }
                }

                /* access modifiers changed from: protected */
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    if (layoutManager.canScrollVertically()) {
                        return 50.0f / ((float) displayMetrics.densityDpi);
                    }
                    return CarouselSnapHelper.HORIZONTAL_SNAP_SPEED / ((float) displayMetrics.densityDpi);
                }
            };
        }
        return null;
    }
}
