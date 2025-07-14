package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

class AnimatorTracker {
    private Animator currentAnimator;

    AnimatorTracker() {
    }

    public void onNextAnimationStart(Animator animator) {
        cancelCurrent();
        this.currentAnimator = animator;
    }

    public void cancelCurrent() {
        if (this.currentAnimator != null) {
            this.currentAnimator.cancel();
        }
    }

    public void clear() {
        this.currentAnimator = null;
    }
}
