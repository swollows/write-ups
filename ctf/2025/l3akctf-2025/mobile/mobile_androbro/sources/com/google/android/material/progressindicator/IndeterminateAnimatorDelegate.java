package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.DrawingDelegate;
import java.util.ArrayList;
import java.util.List;

abstract class IndeterminateAnimatorDelegate<T extends Animator> {
    protected final List<DrawingDelegate.ActiveIndicator> activeIndicators = new ArrayList();
    protected IndeterminateDrawable drawable;

    /* access modifiers changed from: package-private */
    public abstract void cancelAnimatorImmediately();

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(Animatable2Compat.AnimationCallback animationCallback);

    /* access modifiers changed from: package-private */
    public abstract void requestCancelAnimatorAfterCurrentCycle();

    /* access modifiers changed from: package-private */
    public abstract void resetPropertiesForNewStart();

    /* access modifiers changed from: package-private */
    public abstract void setAnimationFraction(float f);

    /* access modifiers changed from: package-private */
    public abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();

    protected IndeterminateAnimatorDelegate(int indicatorCount) {
        for (int i = 0; i < indicatorCount; i++) {
            this.activeIndicators.add(new DrawingDelegate.ActiveIndicator());
        }
    }

    /* access modifiers changed from: protected */
    public void registerDrawable(IndeterminateDrawable drawable2) {
        this.drawable = drawable2;
    }

    /* access modifiers changed from: protected */
    public float getFractionInRange(int playtime, int start, int duration) {
        return ((float) (playtime - start)) / ((float) duration);
    }
}
