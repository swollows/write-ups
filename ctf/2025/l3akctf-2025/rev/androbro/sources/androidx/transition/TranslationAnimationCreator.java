package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.transition.Transition;

class TranslationAnimationCreator {
    static Animator createAnimation(View view, TransitionValues values, int viewPosX, int viewPosY, float startX, float startY, float endX, float endY, TimeInterpolator interpolator, Transition transition) {
        float startY2;
        float startX2;
        View view2 = view;
        TransitionValues transitionValues = values;
        float terminalX = view.getTranslationX();
        float terminalY = view.getTranslationY();
        int[] startPosition = (int[]) transitionValues.view.getTag(R.id.transition_position);
        if (startPosition != null) {
            startX2 = ((float) (startPosition[0] - viewPosX)) + terminalX;
            startY2 = ((float) (startPosition[1] - viewPosY)) + terminalY;
        } else {
            startX2 = startX;
            startY2 = startY;
        }
        view.setTranslationX(startX2);
        view.setTranslationY(startY2);
        if (startX2 == endX && startY2 == endY) {
            return null;
        }
        ObjectAnimator anim = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{startX2, endX}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{startY2, endY})});
        TransitionPositionListener listener = new TransitionPositionListener(view, transitionValues.view, terminalX, terminalY);
        transition.addListener(listener);
        anim.addListener(listener);
        anim.setInterpolator(interpolator);
        return anim;
    }

    private static class TransitionPositionListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private boolean mIsTransitionCanceled;
        private final View mMovingView;
        private float mPausedX;
        private float mPausedY;
        private final float mTerminalX;
        private final float mTerminalY;
        private int[] mTransitionPosition = ((int[]) this.mViewInHierarchy.getTag(R.id.transition_position));
        private final View mViewInHierarchy;

        TransitionPositionListener(View movingView, View viewInHierarchy, float terminalX, float terminalY) {
            this.mMovingView = movingView;
            this.mViewInHierarchy = viewInHierarchy;
            this.mTerminalX = terminalX;
            this.mTerminalY = terminalY;
            if (this.mTransitionPosition != null) {
                this.mViewInHierarchy.setTag(R.id.transition_position, (Object) null);
            }
        }

        public void onAnimationCancel(Animator animation) {
            this.mIsTransitionCanceled = true;
            this.mMovingView.setTranslationX(this.mTerminalX);
            this.mMovingView.setTranslationY(this.mTerminalY);
        }

        public void onAnimationEnd(Animator animation, boolean isReverse) {
            if (!isReverse) {
                this.mMovingView.setTranslationX(this.mTerminalX);
                this.mMovingView.setTranslationY(this.mTerminalY);
            }
        }

        public void onAnimationEnd(Animator animation) {
            onAnimationEnd(animation, false);
        }

        public void onTransitionStart(Transition transition) {
        }

        public void onTransitionEnd(Transition transition, boolean isReverse) {
            if (!this.mIsTransitionCanceled) {
                this.mViewInHierarchy.setTag(R.id.transition_position, (Object) null);
            }
        }

        public void onTransitionEnd(Transition transition) {
            onTransitionEnd(transition, false);
        }

        public void onTransitionCancel(Transition transition) {
            this.mIsTransitionCanceled = true;
            this.mMovingView.setTranslationX(this.mTerminalX);
            this.mMovingView.setTranslationY(this.mTerminalY);
        }

        public void onTransitionPause(Transition transition) {
            setInterruptedPosition();
            this.mPausedX = this.mMovingView.getTranslationX();
            this.mPausedY = this.mMovingView.getTranslationY();
            this.mMovingView.setTranslationX(this.mTerminalX);
            this.mMovingView.setTranslationY(this.mTerminalY);
        }

        public void onTransitionResume(Transition transition) {
            this.mMovingView.setTranslationX(this.mPausedX);
            this.mMovingView.setTranslationY(this.mPausedY);
        }

        private void setInterruptedPosition() {
            if (this.mTransitionPosition == null) {
                this.mTransitionPosition = new int[2];
            }
            this.mMovingView.getLocationOnScreen(this.mTransitionPosition);
            this.mViewInHierarchy.setTag(R.id.transition_position, this.mTransitionPosition);
        }
    }

    private TranslationAnimationCreator() {
    }
}
