package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

public class FadeThroughUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    private final float[] alphas = new float[2];
    private final View fadeInView;
    private final View fadeOutView;

    public FadeThroughUpdateListener(View fadeOutView2, View fadeInView2) {
        this.fadeOutView = fadeOutView2;
        this.fadeInView = fadeInView2;
    }

    public void onAnimationUpdate(ValueAnimator animation) {
        FadeThroughUtils.calculateFadeOutAndInAlphas(((Float) animation.getAnimatedValue()).floatValue(), this.alphas);
        if (this.fadeOutView != null) {
            this.fadeOutView.setAlpha(this.alphas[0]);
        }
        if (this.fadeInView != null) {
            this.fadeInView.setAlpha(this.alphas[1]);
        }
    }
}
