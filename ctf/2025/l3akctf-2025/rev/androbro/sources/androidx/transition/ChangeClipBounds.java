package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;

public class ChangeClipBounds extends Transition {
    static final Rect NULL_SENTINEL = new Rect();
    private static final String PROPNAME_BOUNDS = "android:clipBounds:bounds";
    private static final String PROPNAME_CLIP = "android:clipBounds:clip";
    private static final String[] sTransitionProperties = {PROPNAME_CLIP};

    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    public ChangeClipBounds() {
    }

    public ChangeClipBounds(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public boolean isSeekingSupported() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: android.graphics.Rect} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void captureValues(androidx.transition.TransitionValues r7, boolean r8) {
        /*
            r6 = this;
            android.view.View r0 = r7.view
            int r1 = r0.getVisibility()
            r2 = 8
            if (r1 != r2) goto L_0x000b
            return
        L_0x000b:
            r1 = 0
            if (r8 == 0) goto L_0x0017
            int r2 = androidx.transition.R.id.transition_clip
            java.lang.Object r2 = r0.getTag(r2)
            r1 = r2
            android.graphics.Rect r1 = (android.graphics.Rect) r1
        L_0x0017:
            if (r1 != 0) goto L_0x001d
            android.graphics.Rect r1 = r0.getClipBounds()
        L_0x001d:
            android.graphics.Rect r2 = NULL_SENTINEL
            if (r1 != r2) goto L_0x0022
            r1 = 0
        L_0x0022:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r7.values
            java.lang.String r3 = "android:clipBounds:clip"
            r2.put(r3, r1)
            if (r1 != 0) goto L_0x0040
            android.graphics.Rect r2 = new android.graphics.Rect
            int r3 = r0.getWidth()
            int r4 = r0.getHeight()
            r5 = 0
            r2.<init>(r5, r5, r3, r4)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r7.values
            java.lang.String r4 = "android:clipBounds:bounds"
            r3.put(r4, r2)
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeClipBounds.captureValues(androidx.transition.TransitionValues, boolean):void");
    }

    public void captureStartValues(TransitionValues transitionValues) {
        captureValues(transitionValues, true);
    }

    public void captureEndValues(TransitionValues transitionValues) {
        captureValues(transitionValues, false);
    }

    public Animator createAnimator(ViewGroup sceneRoot, TransitionValues startValues, TransitionValues endValues) {
        if (startValues == null || endValues == null || !startValues.values.containsKey(PROPNAME_CLIP) || !endValues.values.containsKey(PROPNAME_CLIP)) {
            return null;
        }
        Rect start = (Rect) startValues.values.get(PROPNAME_CLIP);
        Rect end = (Rect) endValues.values.get(PROPNAME_CLIP);
        if (start == null && end == null) {
            return null;
        }
        Rect startClip = start == null ? (Rect) startValues.values.get(PROPNAME_BOUNDS) : start;
        Rect endClip = end == null ? (Rect) endValues.values.get(PROPNAME_BOUNDS) : end;
        if (startClip.equals(endClip)) {
            return null;
        }
        endValues.view.setClipBounds(start);
        ObjectAnimator animator = ObjectAnimator.ofObject(endValues.view, ViewUtils.CLIP_BOUNDS, new RectEvaluator(new Rect()), new Rect[]{startClip, endClip});
        Listener listener = new Listener(endValues.view, start, end);
        animator.addListener(listener);
        addListener(listener);
        return animator;
    }

    private static class Listener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private final Rect mEnd;
        private final Rect mStart;
        private final View mView;

        Listener(View view, Rect start, Rect end) {
            this.mView = view;
            this.mStart = start;
            this.mEnd = end;
        }

        public void onTransitionStart(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionPause(Transition transition) {
            Rect clipBounds = this.mView.getClipBounds();
            if (clipBounds == null) {
                clipBounds = ChangeClipBounds.NULL_SENTINEL;
            }
            this.mView.setTag(R.id.transition_clip, clipBounds);
            this.mView.setClipBounds(this.mEnd);
        }

        public void onTransitionResume(Transition transition) {
            this.mView.setClipBounds((Rect) this.mView.getTag(R.id.transition_clip));
            this.mView.setTag(R.id.transition_clip, (Object) null);
        }

        public void onAnimationEnd(Animator animation) {
            onAnimationEnd(animation, false);
        }

        public void onAnimationEnd(Animator animation, boolean isReverse) {
            if (!isReverse) {
                this.mView.setClipBounds(this.mEnd);
            } else {
                this.mView.setClipBounds(this.mStart);
            }
        }
    }
}
