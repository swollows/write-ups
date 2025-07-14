package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import androidx.activity.BackEventCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ViewUtils;

public class MaterialMainContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private static final float MIN_SCALE = 0.9f;
    private Integer expandedCornerSize;
    private Rect initialHideFromClipBounds;
    private Rect initialHideToClipBounds;
    private float initialTouchY;
    private final float maxTranslationY;
    private final float minEdgeGap;

    public MaterialMainContainerBackHelper(View view) {
        super(view);
        Resources resources = view.getResources();
        this.minEdgeGap = resources.getDimension(R.dimen.m3_back_progress_main_container_min_edge_gap);
        this.maxTranslationY = resources.getDimension(R.dimen.m3_back_progress_main_container_max_translation_y);
    }

    public Rect getInitialHideToClipBounds() {
        return this.initialHideToClipBounds;
    }

    public Rect getInitialHideFromClipBounds() {
        return this.initialHideFromClipBounds;
    }

    public void startBackProgress(BackEventCompat backEvent, View collapsedView) {
        super.onStartBackProgress(backEvent);
        startBackProgress(backEvent.getTouchY(), collapsedView);
    }

    public void startBackProgress(float touchY, View collapsedView) {
        this.initialHideToClipBounds = ViewUtils.calculateRectFromBounds(this.view);
        if (collapsedView != null) {
            this.initialHideFromClipBounds = ViewUtils.calculateOffsetRectFromBounds(this.view, collapsedView);
        }
        this.initialTouchY = touchY;
    }

    public void updateBackProgress(BackEventCompat backEvent, View collapsedView, float collapsedCornerSize) {
        if (super.onUpdateBackProgress(backEvent) != null) {
            if (!(collapsedView == null || collapsedView.getVisibility() == 4)) {
                collapsedView.setVisibility(4);
            }
            updateBackProgress(backEvent.getProgress(), backEvent.getSwipeEdge() == 0, backEvent.getTouchY(), collapsedCornerSize);
        }
    }

    public void updateBackProgress(float progress, boolean leftSwipeEdge, float touchY, float collapsedCornerSize) {
        float progress2 = interpolateProgress(progress);
        float width = (float) this.view.getWidth();
        float height = (float) this.view.getHeight();
        if (width <= 0.0f) {
            float f = collapsedCornerSize;
        } else if (height <= 0.0f) {
            float f2 = collapsedCornerSize;
        } else {
            float scale = AnimationUtils.lerp(1.0f, (float) MIN_SCALE, progress2);
            float translationX = AnimationUtils.lerp(0.0f, Math.max(0.0f, ((width - (MIN_SCALE * width)) / 2.0f) - this.minEdgeGap), progress2) * ((float) (leftSwipeEdge ? 1 : -1));
            float maxTranslationY2 = Math.min(Math.max(0.0f, ((height - (scale * height)) / 2.0f) - this.minEdgeGap), this.maxTranslationY);
            float yDelta = touchY - this.initialTouchY;
            float translationYDirection = Math.signum(yDelta);
            this.view.setScaleX(scale);
            this.view.setScaleY(scale);
            this.view.setTranslationX(translationX);
            this.view.setTranslationY(AnimationUtils.lerp(0.0f, maxTranslationY2, Math.abs(yDelta) / height) * translationYDirection);
            if (this.view instanceof ClippableRoundedCornerLayout) {
                ((ClippableRoundedCornerLayout) this.view).updateCornerRadius(AnimationUtils.lerp((float) getExpandedCornerSize(), collapsedCornerSize, progress2));
            } else {
                float f3 = collapsedCornerSize;
            }
        }
    }

    public void finishBackProgress(long duration, View collapsedView) {
        AnimatorSet resetAnimator = createResetScaleAndTranslationAnimator(collapsedView);
        resetAnimator.setDuration(duration);
        resetAnimator.start();
        resetInitialValues();
    }

    public void cancelBackProgress(View collapsedView) {
        if (super.onCancelBackProgress() != null) {
            AnimatorSet cancelAnimatorSet = createResetScaleAndTranslationAnimator(collapsedView);
            if (this.view instanceof ClippableRoundedCornerLayout) {
                cancelAnimatorSet.playTogether(new Animator[]{createCornerAnimator((ClippableRoundedCornerLayout) this.view)});
            }
            cancelAnimatorSet.setDuration((long) this.cancelDuration);
            cancelAnimatorSet.start();
            resetInitialValues();
        }
    }

    private void resetInitialValues() {
        this.initialTouchY = 0.0f;
        this.initialHideToClipBounds = null;
        this.initialHideFromClipBounds = null;
    }

    private AnimatorSet createResetScaleAndTranslationAnimator(final View collapsedView) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.view, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(this.view, View.SCALE_Y, new float[]{1.0f}), ObjectAnimator.ofFloat(this.view, View.TRANSLATION_X, new float[]{0.0f}), ObjectAnimator.ofFloat(this.view, View.TRANSLATION_Y, new float[]{0.0f})});
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animation) {
                if (collapsedView != null) {
                    collapsedView.setVisibility(0);
                }
            }
        });
        return animatorSet;
    }

    private ValueAnimator createCornerAnimator(ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        ValueAnimator cornerAnimator = ValueAnimator.ofFloat(new float[]{clippableRoundedCornerLayout.getCornerRadius(), (float) getExpandedCornerSize()});
        cornerAnimator.addUpdateListener(new MaterialMainContainerBackHelper$$ExternalSyntheticLambda0(clippableRoundedCornerLayout));
        return cornerAnimator;
    }

    public int getExpandedCornerSize() {
        if (this.expandedCornerSize == null) {
            this.expandedCornerSize = Integer.valueOf(isAtTopOfScreen() ? getMaxDeviceCornerRadius() : 0);
        }
        return this.expandedCornerSize.intValue();
    }

    private boolean isAtTopOfScreen() {
        int[] location = new int[2];
        this.view.getLocationOnScreen(location);
        return location[1] == 0;
    }

    private int getMaxDeviceCornerRadius() {
        WindowInsets insets;
        if (Build.VERSION.SDK_INT < 31 || (insets = this.view.getRootWindowInsets()) == null) {
            return 0;
        }
        return Math.max(Math.max(getRoundedCornerRadius(insets, 0), getRoundedCornerRadius(insets, 1)), Math.max(getRoundedCornerRadius(insets, 3), getRoundedCornerRadius(insets, 2)));
    }

    private int getRoundedCornerRadius(WindowInsets insets, int position) {
        RoundedCorner roundedCorner = insets.getRoundedCorner(position);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }
}
