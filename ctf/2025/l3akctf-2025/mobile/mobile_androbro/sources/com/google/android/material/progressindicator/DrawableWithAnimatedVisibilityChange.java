package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.List;

abstract class DrawableWithAnimatedVisibilityChange extends Drawable implements Animatable2Compat {
    private static final boolean DEFAULT_DRAWABLE_RESTART = false;
    private static final int GROW_DURATION = 500;
    private static final Property<DrawableWithAnimatedVisibilityChange, Float> GROW_FRACTION = new Property<DrawableWithAnimatedVisibilityChange, Float>(Float.class, "growFraction") {
        public Float get(DrawableWithAnimatedVisibilityChange drawable) {
            return Float.valueOf(drawable.getGrowFraction());
        }

        public void set(DrawableWithAnimatedVisibilityChange drawable, Float value) {
            drawable.setGrowFraction(value.floatValue());
        }
    };
    private List<Animatable2Compat.AnimationCallback> animationCallbacks;
    AnimatorDurationScaleProvider animatorDurationScaleProvider;
    final BaseProgressIndicatorSpec baseSpec;
    final Context context;
    private float growFraction;
    private ValueAnimator hideAnimator;
    private boolean ignoreCallbacks;
    private Animatable2Compat.AnimationCallback internalAnimationCallback;
    private float mockGrowFraction;
    private boolean mockHideAnimationRunning;
    private boolean mockShowAnimationRunning;
    final Paint paint = new Paint();
    private ValueAnimator showAnimator;
    private int totalAlpha;

    DrawableWithAnimatedVisibilityChange(Context context2, BaseProgressIndicatorSpec baseSpec2) {
        this.context = context2;
        this.baseSpec = baseSpec2;
        this.animatorDurationScaleProvider = new AnimatorDurationScaleProvider();
        setAlpha(255);
    }

    private void maybeInitializeAnimators() {
        if (this.showAnimator == null) {
            this.showAnimator = ObjectAnimator.ofFloat(this, GROW_FRACTION, new float[]{0.0f, 1.0f});
            this.showAnimator.setDuration(500);
            this.showAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            setShowAnimator(this.showAnimator);
        }
        if (this.hideAnimator == null) {
            this.hideAnimator = ObjectAnimator.ofFloat(this, GROW_FRACTION, new float[]{1.0f, 0.0f});
            this.hideAnimator.setDuration(500);
            this.hideAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            setHideAnimator(this.hideAnimator);
        }
    }

    public void registerAnimationCallback(Animatable2Compat.AnimationCallback callback) {
        if (this.animationCallbacks == null) {
            this.animationCallbacks = new ArrayList();
        }
        if (!this.animationCallbacks.contains(callback)) {
            this.animationCallbacks.add(callback);
        }
    }

    public boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback callback) {
        if (this.animationCallbacks == null || !this.animationCallbacks.contains(callback)) {
            return false;
        }
        this.animationCallbacks.remove(callback);
        if (!this.animationCallbacks.isEmpty()) {
            return true;
        }
        this.animationCallbacks = null;
        return true;
    }

    public void clearAnimationCallbacks() {
        this.animationCallbacks.clear();
        this.animationCallbacks = null;
    }

    /* access modifiers changed from: package-private */
    public void setInternalAnimationCallback(Animatable2Compat.AnimationCallback callback) {
        this.internalAnimationCallback = callback;
    }

    /* access modifiers changed from: private */
    public void dispatchAnimationStart() {
        if (this.internalAnimationCallback != null) {
            this.internalAnimationCallback.onAnimationStart(this);
        }
        if (this.animationCallbacks != null && !this.ignoreCallbacks) {
            for (Animatable2Compat.AnimationCallback callback : this.animationCallbacks) {
                callback.onAnimationStart(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public void dispatchAnimationEnd() {
        if (this.internalAnimationCallback != null) {
            this.internalAnimationCallback.onAnimationEnd(this);
        }
        if (this.animationCallbacks != null && !this.ignoreCallbacks) {
            for (Animatable2Compat.AnimationCallback callback : this.animationCallbacks) {
                callback.onAnimationEnd(this);
            }
        }
    }

    public void start() {
        setVisibleInternal(true, true, false);
    }

    public void stop() {
        setVisibleInternal(false, true, false);
    }

    public boolean isRunning() {
        return isShowing() || isHiding();
    }

    public boolean isShowing() {
        return (this.showAnimator != null && this.showAnimator.isRunning()) || this.mockShowAnimationRunning;
    }

    public boolean isHiding() {
        return (this.hideAnimator != null && this.hideAnimator.isRunning()) || this.mockHideAnimationRunning;
    }

    public boolean hideNow() {
        return setVisible(false, false, false);
    }

    public boolean setVisible(boolean visible, boolean restart) {
        return setVisible(visible, restart, true);
    }

    public boolean setVisible(boolean visible, boolean restart, boolean animate) {
        return setVisibleInternal(visible, restart, animate && this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver()) > 0.0f);
    }

    /* access modifiers changed from: package-private */
    public boolean setVisibleInternal(boolean visible, boolean restart, boolean animate) {
        maybeInitializeAnimators();
        if (!isVisible() && !visible) {
            return false;
        }
        ValueAnimator animatorInAction = visible ? this.showAnimator : this.hideAnimator;
        ValueAnimator animatorNotInAction = visible ? this.hideAnimator : this.showAnimator;
        if (!animate) {
            if (animatorNotInAction.isRunning()) {
                cancelAnimatorsWithoutCallbacks(animatorNotInAction);
            }
            if (animatorInAction.isRunning()) {
                animatorInAction.end();
            } else {
                endAnimatorsWithoutCallbacks(animatorInAction);
            }
            return super.setVisible(visible, false);
        } else if (animatorInAction.isRunning()) {
            return false;
        } else {
            boolean changed = !visible || super.setVisible(visible, false);
            BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.baseSpec;
            if (!(visible ? baseProgressIndicatorSpec.isShowAnimationEnabled() : baseProgressIndicatorSpec.isHideAnimationEnabled())) {
                endAnimatorsWithoutCallbacks(animatorInAction);
                return changed;
            }
            if (restart || !animatorInAction.isPaused()) {
                animatorInAction.start();
            } else {
                animatorInAction.resume();
            }
            return changed;
        }
    }

    private void cancelAnimatorsWithoutCallbacks(ValueAnimator... animators) {
        boolean ignoreCallbacksOrig = this.ignoreCallbacks;
        this.ignoreCallbacks = true;
        for (ValueAnimator animator : animators) {
            animator.cancel();
        }
        this.ignoreCallbacks = ignoreCallbacksOrig;
    }

    private void endAnimatorsWithoutCallbacks(ValueAnimator... animators) {
        boolean ignoreCallbacksOrig = this.ignoreCallbacks;
        this.ignoreCallbacks = true;
        for (ValueAnimator animator : animators) {
            animator.end();
        }
        this.ignoreCallbacks = ignoreCallbacksOrig;
    }

    public void setAlpha(int alpha) {
        this.totalAlpha = alpha;
        invalidateSelf();
    }

    public int getAlpha() {
        return this.totalAlpha;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        return -3;
    }

    private void setShowAnimator(ValueAnimator showAnimator2) {
        if (this.showAnimator == null || !this.showAnimator.isRunning()) {
            this.showAnimator = showAnimator2;
            showAnimator2.addListener(new AnimatorListenerAdapter() {
                public void onAnimationStart(Animator animation) {
                    super.onAnimationStart(animation);
                    DrawableWithAnimatedVisibilityChange.this.dispatchAnimationStart();
                }
            });
            return;
        }
        throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
    }

    /* access modifiers changed from: package-private */
    public ValueAnimator getHideAnimator() {
        return this.hideAnimator;
    }

    private void setHideAnimator(ValueAnimator hideAnimator2) {
        if (this.hideAnimator == null || !this.hideAnimator.isRunning()) {
            this.hideAnimator = hideAnimator2;
            hideAnimator2.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);
                    boolean unused = DrawableWithAnimatedVisibilityChange.super.setVisible(false, false);
                    DrawableWithAnimatedVisibilityChange.this.dispatchAnimationEnd();
                }
            });
            return;
        }
        throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
    }

    /* access modifiers changed from: package-private */
    public float getGrowFraction() {
        if (!this.baseSpec.isShowAnimationEnabled() && !this.baseSpec.isHideAnimationEnabled()) {
            return 1.0f;
        }
        if (this.mockHideAnimationRunning || this.mockShowAnimationRunning) {
            return this.mockGrowFraction;
        }
        return this.growFraction;
    }

    /* access modifiers changed from: package-private */
    public void setGrowFraction(float growFraction2) {
        if (this.growFraction != growFraction2) {
            this.growFraction = growFraction2;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void setMockShowAnimationRunning(boolean running, float fraction) {
        this.mockShowAnimationRunning = running;
        this.mockGrowFraction = fraction;
    }

    /* access modifiers changed from: package-private */
    public void setMockHideAnimationRunning(boolean running, float fraction) {
        this.mockHideAnimationRunning = running;
        this.mockGrowFraction = fraction;
    }
}
