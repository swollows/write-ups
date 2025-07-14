package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.DrawingDelegate;

final class LinearIndeterminateContiguousAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {
    private static final Property<LinearIndeterminateContiguousAnimatorDelegate, Float> ANIMATION_FRACTION = new Property<LinearIndeterminateContiguousAnimatorDelegate, Float>(Float.class, "animationFraction") {
        public Float get(LinearIndeterminateContiguousAnimatorDelegate delegate) {
            return Float.valueOf(delegate.getAnimationFraction());
        }

        public void set(LinearIndeterminateContiguousAnimatorDelegate delegate, Float value) {
            delegate.setAnimationFraction(value.floatValue());
        }
    };
    private static final int DURATION_PER_CYCLE_IN_MS = 333;
    private static final int TOTAL_DURATION_IN_MS = 667;
    private float animationFraction;
    private ObjectAnimator animator;
    /* access modifiers changed from: private */
    public final BaseProgressIndicatorSpec baseSpec;
    /* access modifiers changed from: private */
    public boolean dirtyColors;
    private FastOutSlowInInterpolator interpolator;
    /* access modifiers changed from: private */
    public int newIndicatorColorIndex = 1;

    public LinearIndeterminateContiguousAnimatorDelegate(LinearProgressIndicatorSpec spec) {
        super(3);
        this.baseSpec = spec;
        this.interpolator = new FastOutSlowInInterpolator();
    }

    public void startAnimator() {
        maybeInitializeAnimators();
        resetPropertiesForNewStart();
        this.animator.start();
    }

    private void maybeInitializeAnimators() {
        if (this.animator == null) {
            this.animator = ObjectAnimator.ofFloat(this, ANIMATION_FRACTION, new float[]{0.0f, 1.0f});
            this.animator.setDuration(333);
            this.animator.setInterpolator((TimeInterpolator) null);
            this.animator.setRepeatCount(-1);
            this.animator.addListener(new AnimatorListenerAdapter() {
                public void onAnimationRepeat(Animator animation) {
                    super.onAnimationRepeat(animation);
                    int unused = LinearIndeterminateContiguousAnimatorDelegate.this.newIndicatorColorIndex = (LinearIndeterminateContiguousAnimatorDelegate.this.newIndicatorColorIndex + 1) % LinearIndeterminateContiguousAnimatorDelegate.this.baseSpec.indicatorColors.length;
                    boolean unused2 = LinearIndeterminateContiguousAnimatorDelegate.this.dirtyColors = true;
                }
            });
        }
    }

    public void cancelAnimatorImmediately() {
        if (this.animator != null) {
            this.animator.cancel();
        }
    }

    public void requestCancelAnimatorAfterCurrentCycle() {
    }

    public void invalidateSpecValues() {
        resetPropertiesForNewStart();
    }

    public void registerAnimatorsCompleteCallback(Animatable2Compat.AnimationCallback callback) {
    }

    public void unregisterAnimatorsCompleteCallback() {
    }

    private void updateSegmentPositions(int playtime) {
        ((DrawingDelegate.ActiveIndicator) this.activeIndicators.get(0)).startFraction = 0.0f;
        float fraction = getFractionInRange(playtime, 0, TOTAL_DURATION_IN_MS);
        float interpolation = this.interpolator.getInterpolation(fraction);
        ((DrawingDelegate.ActiveIndicator) this.activeIndicators.get(1)).startFraction = interpolation;
        ((DrawingDelegate.ActiveIndicator) this.activeIndicators.get(0)).endFraction = interpolation;
        float interpolation2 = this.interpolator.getInterpolation(fraction + 0.49925038f);
        ((DrawingDelegate.ActiveIndicator) this.activeIndicators.get(2)).startFraction = interpolation2;
        ((DrawingDelegate.ActiveIndicator) this.activeIndicators.get(1)).endFraction = interpolation2;
        ((DrawingDelegate.ActiveIndicator) this.activeIndicators.get(2)).endFraction = 1.0f;
    }

    private void maybeUpdateSegmentColors() {
        if (this.dirtyColors && ((DrawingDelegate.ActiveIndicator) this.activeIndicators.get(1)).endFraction < 1.0f) {
            ((DrawingDelegate.ActiveIndicator) this.activeIndicators.get(2)).color = ((DrawingDelegate.ActiveIndicator) this.activeIndicators.get(1)).color;
            ((DrawingDelegate.ActiveIndicator) this.activeIndicators.get(1)).color = ((DrawingDelegate.ActiveIndicator) this.activeIndicators.get(0)).color;
            ((DrawingDelegate.ActiveIndicator) this.activeIndicators.get(0)).color = this.baseSpec.indicatorColors[this.newIndicatorColorIndex];
            this.dirtyColors = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void resetPropertiesForNewStart() {
        this.dirtyColors = true;
        this.newIndicatorColorIndex = 1;
        for (DrawingDelegate.ActiveIndicator indicator : this.activeIndicators) {
            indicator.color = this.baseSpec.indicatorColors[0];
            indicator.gapSize = this.baseSpec.indicatorTrackGapSize / 2;
        }
    }

    /* access modifiers changed from: private */
    public float getAnimationFraction() {
        return this.animationFraction;
    }

    /* access modifiers changed from: package-private */
    public void setAnimationFraction(float value) {
        this.animationFraction = value;
        updateSegmentPositions((int) (this.animationFraction * 333.0f));
        maybeUpdateSegmentColors();
        this.drawable.invalidateSelf();
    }
}
