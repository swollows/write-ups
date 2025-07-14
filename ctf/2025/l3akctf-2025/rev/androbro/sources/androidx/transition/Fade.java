package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.TypedArrayUtils;
import androidx.transition.Transition;

public class Fade extends Visibility {
    public static final int IN = 1;
    private static final String LOG_TAG = "Fade";
    public static final int OUT = 2;
    private static final String PROPNAME_TRANSITION_ALPHA = "android:fade:transitionAlpha";

    public Fade(int fadingMode) {
        setMode(fadingMode);
    }

    public Fade() {
    }

    public Fade(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs, Styleable.FADE);
        setMode(TypedArrayUtils.getNamedInt(a, (XmlResourceParser) attrs, "fadingMode", 0, getMode()));
        a.recycle();
    }

    public void captureStartValues(TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        Float alpha = (Float) transitionValues.view.getTag(R.id.transition_pause_alpha);
        if (alpha == null) {
            if (transitionValues.view.getVisibility() == 0) {
                alpha = Float.valueOf(ViewUtils.getTransitionAlpha(transitionValues.view));
            } else {
                alpha = Float.valueOf(0.0f);
            }
        }
        transitionValues.values.put(PROPNAME_TRANSITION_ALPHA, alpha);
    }

    public boolean isSeekingSupported() {
        return true;
    }

    private Animator createAnimation(View view, float startAlpha, float endAlpha) {
        if (startAlpha == endAlpha) {
            return null;
        }
        ViewUtils.setTransitionAlpha(view, startAlpha);
        ObjectAnimator anim = ObjectAnimator.ofFloat(view, ViewUtils.TRANSITION_ALPHA, new float[]{endAlpha});
        FadeAnimatorListener listener = new FadeAnimatorListener(view);
        anim.addListener(listener);
        getRootTransition().addListener(listener);
        return anim;
    }

    public Animator onAppear(ViewGroup sceneRoot, View view, TransitionValues startValues, TransitionValues endValues) {
        ViewUtils.saveNonTransitionAlpha(view);
        return createAnimation(view, getStartAlpha(startValues, 0.0f), 1.0f);
    }

    public Animator onDisappear(ViewGroup sceneRoot, View view, TransitionValues startValues, TransitionValues endValues) {
        ViewUtils.saveNonTransitionAlpha(view);
        Animator animator = createAnimation(view, getStartAlpha(startValues, 1.0f), 0.0f);
        if (animator == null) {
            ViewUtils.setTransitionAlpha(view, getStartAlpha(endValues, 1.0f));
        }
        return animator;
    }

    private static float getStartAlpha(TransitionValues startValues, float fallbackValue) {
        Float startAlphaFloat;
        float startAlpha = fallbackValue;
        if (startValues == null || (startAlphaFloat = (Float) startValues.values.get(PROPNAME_TRANSITION_ALPHA)) == null) {
            return startAlpha;
        }
        return startAlphaFloat.floatValue();
    }

    private static class FadeAnimatorListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private boolean mLayerTypeChanged = false;
        private final View mView;

        FadeAnimatorListener(View view) {
            this.mView = view;
        }

        public void onAnimationStart(Animator animation) {
            if (this.mView.hasOverlappingRendering() && this.mView.getLayerType() == 0) {
                this.mLayerTypeChanged = true;
                this.mView.setLayerType(2, (Paint) null);
            }
        }

        public void onAnimationEnd(Animator animation) {
            onAnimationEnd(animation, false);
        }

        public void onAnimationEnd(Animator animation, boolean isReverse) {
            if (this.mLayerTypeChanged) {
                this.mView.setLayerType(0, (Paint) null);
            }
            if (!isReverse) {
                ViewUtils.setTransitionAlpha(this.mView, 1.0f);
                ViewUtils.clearNonTransitionAlpha(this.mView);
            }
        }

        public void onAnimationCancel(Animator animation) {
            ViewUtils.setTransitionAlpha(this.mView, 1.0f);
        }

        public void onTransitionStart(Transition transition) {
        }

        public void onTransitionStart(Transition transition, boolean isReverse) {
        }

        public void onTransitionEnd(Transition transition) {
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionPause(Transition transition) {
            this.mView.setTag(R.id.transition_pause_alpha, Float.valueOf(this.mView.getVisibility() == 0 ? ViewUtils.getTransitionAlpha(this.mView) : 0.0f));
        }

        public void onTransitionResume(Transition transition) {
            this.mView.setTag(R.id.transition_pause_alpha, (Object) null);
        }
    }
}
