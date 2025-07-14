package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.TypedArrayUtils;
import androidx.transition.Transition;
import java.util.Map;

public class ChangeBounds extends Transition {
    private static final Property<View, PointF> BOTTOM_RIGHT_ONLY_PROPERTY = new Property<View, PointF>(PointF.class, "bottomRight") {
        public void set(View view, PointF bottomRight) {
            ViewUtils.setLeftTopRightBottom(view, view.getLeft(), view.getTop(), Math.round(bottomRight.x), Math.round(bottomRight.y));
        }

        public PointF get(View view) {
            return null;
        }
    };
    private static final Property<ViewBounds, PointF> BOTTOM_RIGHT_PROPERTY = new Property<ViewBounds, PointF>(PointF.class, "bottomRight") {
        public void set(ViewBounds viewBounds, PointF bottomRight) {
            viewBounds.setBottomRight(bottomRight);
        }

        public PointF get(ViewBounds viewBounds) {
            return null;
        }
    };
    private static final Property<View, PointF> POSITION_PROPERTY = new Property<View, PointF>(PointF.class, "position") {
        public void set(View view, PointF topLeft) {
            int left = Math.round(topLeft.x);
            int top = Math.round(topLeft.y);
            ViewUtils.setLeftTopRightBottom(view, left, top, view.getWidth() + left, view.getHeight() + top);
        }

        public PointF get(View view) {
            return null;
        }
    };
    private static final String PROPNAME_BOUNDS = "android:changeBounds:bounds";
    private static final String PROPNAME_CLIP = "android:changeBounds:clip";
    private static final String PROPNAME_PARENT = "android:changeBounds:parent";
    private static final String PROPNAME_WINDOW_X = "android:changeBounds:windowX";
    private static final String PROPNAME_WINDOW_Y = "android:changeBounds:windowY";
    private static final Property<View, PointF> TOP_LEFT_ONLY_PROPERTY = new Property<View, PointF>(PointF.class, "topLeft") {
        public void set(View view, PointF topLeft) {
            ViewUtils.setLeftTopRightBottom(view, Math.round(topLeft.x), Math.round(topLeft.y), view.getRight(), view.getBottom());
        }

        public PointF get(View view) {
            return null;
        }
    };
    private static final Property<ViewBounds, PointF> TOP_LEFT_PROPERTY = new Property<ViewBounds, PointF>(PointF.class, "topLeft") {
        public void set(ViewBounds viewBounds, PointF topLeft) {
            viewBounds.setTopLeft(topLeft);
        }

        public PointF get(ViewBounds viewBounds) {
            return null;
        }
    };
    private static final RectEvaluator sRectEvaluator = new RectEvaluator();
    private static final String[] sTransitionProperties = {PROPNAME_BOUNDS, PROPNAME_CLIP, PROPNAME_PARENT, PROPNAME_WINDOW_X, PROPNAME_WINDOW_Y};
    private boolean mResizeClip = false;

    public ChangeBounds() {
    }

    public ChangeBounds(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs, Styleable.CHANGE_BOUNDS);
        boolean resizeClip = TypedArrayUtils.getNamedBoolean(a, (XmlResourceParser) attrs, "resizeClip", 0, false);
        a.recycle();
        setResizeClip(resizeClip);
    }

    public boolean isSeekingSupported() {
        return true;
    }

    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    public void setResizeClip(boolean resizeClip) {
        this.mResizeClip = resizeClip;
    }

    public boolean getResizeClip() {
        return this.mResizeClip;
    }

    private void captureValues(TransitionValues values) {
        View view = values.view;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            values.values.put(PROPNAME_BOUNDS, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            values.values.put(PROPNAME_PARENT, values.view.getParent());
            if (this.mResizeClip) {
                values.values.put(PROPNAME_CLIP, view.getClipBounds());
            }
        }
    }

    public void captureStartValues(TransitionValues transitionValues) {
        Rect clipSize;
        captureValues(transitionValues);
        if (this.mResizeClip && (clipSize = (Rect) transitionValues.view.getTag(R.id.transition_clip)) != null) {
            transitionValues.values.put(PROPNAME_CLIP, clipSize);
        }
    }

    public void captureEndValues(TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    public Animator createAnimator(ViewGroup sceneRoot, TransitionValues startValues, TransitionValues endValues) {
        View view;
        Animator anim;
        int endLeft;
        int startTop;
        int startRight;
        Rect startClip;
        Rect endClip;
        Rect startClip2;
        Rect endClip2;
        TransitionValues transitionValues = startValues;
        TransitionValues transitionValues2 = endValues;
        if (transitionValues == null) {
            return null;
        } else if (transitionValues2 == null) {
            return null;
        } else {
            Map<String, Object> startParentVals = transitionValues.values;
            Map<String, Object> endParentVals = transitionValues2.values;
            ViewGroup startParent = (ViewGroup) startParentVals.get(PROPNAME_PARENT);
            ViewGroup endParent = (ViewGroup) endParentVals.get(PROPNAME_PARENT);
            if (startParent == null) {
                Map<String, Object> map = startParentVals;
                Map<String, Object> map2 = endParentVals;
                ViewGroup viewGroup = endParent;
                ViewGroup viewGroup2 = startParent;
                return null;
            } else if (endParent == null) {
                Map<String, Object> map3 = startParentVals;
                Map<String, Object> map4 = endParentVals;
                ViewGroup viewGroup3 = endParent;
                ViewGroup viewGroup4 = startParent;
                return null;
            } else {
                View view2 = transitionValues2.view;
                Rect startBounds = (Rect) transitionValues.values.get(PROPNAME_BOUNDS);
                Rect endBounds = (Rect) transitionValues2.values.get(PROPNAME_BOUNDS);
                int startLeft = startBounds.left;
                int endLeft2 = endBounds.left;
                int startTop2 = startBounds.top;
                int endTop = endBounds.top;
                int startRight2 = startBounds.right;
                int endRight = endBounds.right;
                Map<String, Object> map5 = startParentVals;
                int startBottom = startBounds.bottom;
                Map<String, Object> map6 = endParentVals;
                int endBottom = endBounds.bottom;
                ViewGroup viewGroup5 = endParent;
                int startWidth = startRight2 - startLeft;
                ViewGroup viewGroup6 = startParent;
                int startHeight = startBottom - startTop2;
                Rect startBounds2 = startBounds;
                int endWidth = endRight - endLeft2;
                Rect endBounds2 = endBounds;
                int endHeight = endBottom - endTop;
                View view3 = view2;
                Rect startClip3 = (Rect) transitionValues.values.get(PROPNAME_CLIP);
                Rect endClip3 = (Rect) transitionValues2.values.get(PROPNAME_CLIP);
                int numChanges = 0;
                if (!((startWidth == 0 || startHeight == 0) && (endWidth == 0 || endHeight == 0))) {
                    if (!(startLeft == endLeft2 && startTop2 == endTop)) {
                        numChanges = 0 + 1;
                    }
                    if (!(startRight2 == endRight && startBottom == endBottom)) {
                        numChanges++;
                    }
                }
                if ((startClip3 != null && !startClip3.equals(endClip3)) || (startClip3 == null && endClip3 != null)) {
                    numChanges++;
                }
                if (numChanges > 0) {
                    Rect endClip4 = endClip3;
                    Rect startClip4 = startClip3;
                    if (!this.mResizeClip) {
                        View view4 = view3;
                        ViewUtils.setLeftTopRightBottom(view4, startLeft, startTop2, startRight2, startBottom);
                        if (numChanges != 2) {
                            View view5 = view4;
                            int i = numChanges;
                            int startWidth2 = startWidth;
                            int startHeight2 = startHeight;
                            int endHeight2 = endHeight;
                            int endWidth2 = endWidth;
                            if (startLeft != endLeft2) {
                                view = view5;
                            } else if (startTop2 != endTop) {
                                view = view5;
                            } else {
                                view = view5;
                                anim = ObjectAnimatorUtils.ofPointF(view, BOTTOM_RIGHT_ONLY_PROPERTY, getPathMotion().getPath((float) startRight2, (float) startBottom, (float) endRight, (float) endBottom));
                                int i2 = startRight2;
                                int i3 = endTop;
                                int i4 = endLeft2;
                                int i5 = startLeft;
                                Rect rect = startBounds2;
                                Rect rect2 = endBounds2;
                                Rect rect3 = endClip4;
                                Rect rect4 = startClip4;
                                int i6 = startHeight2;
                                int i7 = endHeight2;
                                int i8 = startWidth2;
                                int i9 = endWidth2;
                                int endWidth3 = startTop2;
                            }
                            anim = ObjectAnimatorUtils.ofPointF(view, TOP_LEFT_ONLY_PROPERTY, getPathMotion().getPath((float) startLeft, (float) startTop2, (float) endLeft2, (float) endTop));
                            int i10 = startRight2;
                            int i11 = endTop;
                            int i12 = endLeft2;
                            int i13 = startLeft;
                            Rect rect5 = startBounds2;
                            Rect rect6 = endBounds2;
                            Rect rect7 = endClip4;
                            Rect rect8 = startClip4;
                            int i14 = startHeight2;
                            int i15 = endHeight2;
                            int i16 = startWidth2;
                            int i17 = endWidth2;
                            int endWidth4 = startTop2;
                        } else if (startWidth == endWidth && startHeight == endHeight) {
                            int i18 = numChanges;
                            int startWidth3 = startWidth;
                            anim = ObjectAnimatorUtils.ofPointF(view4, POSITION_PROPERTY, getPathMotion().getPath((float) startLeft, (float) startTop2, (float) endLeft2, (float) endTop));
                            view = view4;
                            int i19 = startRight2;
                            int i20 = endTop;
                            int i21 = startTop2;
                            int i22 = endLeft2;
                            int i23 = startLeft;
                            int i24 = endWidth;
                            Rect rect9 = startBounds2;
                            Rect rect10 = endBounds2;
                            Rect rect11 = endClip4;
                            Rect rect12 = startClip4;
                            int i25 = startHeight;
                            int i26 = endHeight;
                            int i27 = startWidth3;
                        } else {
                            int startWidth4 = startWidth;
                            int startHeight3 = startHeight;
                            int endHeight3 = endHeight;
                            final ViewBounds viewBounds = new ViewBounds(view4);
                            Path topLeftPath = getPathMotion().getPath((float) startLeft, (float) startTop2, (float) endLeft2, (float) endTop);
                            ObjectAnimator topLeftAnimator = ObjectAnimatorUtils.ofPointF(viewBounds, TOP_LEFT_PROPERTY, topLeftPath);
                            Path path = topLeftPath;
                            View view6 = view4;
                            ObjectAnimator bottomRightAnimator = ObjectAnimatorUtils.ofPointF(viewBounds, BOTTOM_RIGHT_PROPERTY, getPathMotion().getPath((float) startRight2, (float) startBottom, (float) endRight, (float) endBottom));
                            AnimatorSet set = new AnimatorSet();
                            set.playTogether(new Animator[]{topLeftAnimator, bottomRightAnimator});
                            set.addListener(new AnimatorListenerAdapter() {
                                private final ViewBounds mViewBounds = viewBounds;
                            });
                            int i28 = startRight2;
                            int i29 = endTop;
                            int i30 = endLeft2;
                            int i31 = startLeft;
                            anim = set;
                            Rect rect13 = startBounds2;
                            Rect rect14 = endBounds2;
                            Rect rect15 = endClip4;
                            Rect rect16 = startClip4;
                            int i32 = startHeight3;
                            int i33 = endHeight3;
                            int i34 = startWidth4;
                            int i35 = endWidth;
                            view = view6;
                            int endWidth5 = startTop2;
                        }
                    } else {
                        int startWidth5 = startWidth;
                        int startHeight4 = startHeight;
                        int i36 = endHeight;
                        view = view3;
                        int startWidth6 = startWidth5;
                        int endWidth6 = endWidth;
                        int maxWidth = Math.max(startWidth6, endWidth6);
                        int startHeight5 = startHeight4;
                        int i37 = maxWidth;
                        ViewUtils.setLeftTopRightBottom(view, startLeft, startTop2, startLeft + maxWidth, startTop2 + Math.max(startHeight5, endHeight));
                        ObjectAnimator positionAnimator = null;
                        if (startLeft == endLeft2 && startTop2 == endTop) {
                            startRight = startRight2;
                            startTop = startTop2;
                            endLeft = endLeft2;
                        } else {
                            startRight = startRight2;
                            startTop = startTop2;
                            endLeft = endLeft2;
                            positionAnimator = ObjectAnimatorUtils.ofPointF(view, POSITION_PROPERTY, getPathMotion().getPath((float) startLeft, (float) startTop2, (float) endLeft2, (float) endTop));
                        }
                        boolean startClipIsNull = startClip4 == null;
                        if (startClipIsNull) {
                            startClip = new Rect(0, 0, startWidth6, startHeight5);
                        } else {
                            startClip = startClip4;
                        }
                        boolean endClipIsNull = endClip4 == null;
                        if (endClipIsNull) {
                            endClip = new Rect(0, 0, endWidth6, endHeight);
                        } else {
                            endClip = endClip4;
                        }
                        ObjectAnimator clipAnimator = null;
                        if (!startClip.equals(endClip)) {
                            view.setClipBounds(startClip);
                            int i38 = startWidth6;
                            ObjectAnimator clipAnimator2 = ObjectAnimator.ofObject(view, "clipBounds", sRectEvaluator, new Object[]{startClip, endClip});
                            endClip2 = endClip;
                            int i39 = endHeight;
                            Rect rect17 = endBounds2;
                            startClip2 = startClip;
                            int i40 = endWidth6;
                            Rect rect18 = startBounds2;
                            int i41 = startHeight5;
                            ClipListener clipListener = new ClipListener(view, startClip, startClipIsNull, endClip2, endClipIsNull, startLeft, startTop, startRight, startBottom, endLeft, endTop, endRight, endBottom);
                            clipAnimator2.addListener(clipListener);
                            addListener(clipListener);
                            clipAnimator = clipAnimator2;
                        } else {
                            int i42 = endWidth6;
                            int i43 = endTop;
                            endClip2 = endClip;
                            int i44 = startLeft;
                            int i45 = endHeight;
                            startClip2 = startClip;
                            int i46 = startHeight5;
                            Rect rect19 = startBounds2;
                            Rect rect20 = endBounds2;
                        }
                        anim = TransitionUtils.mergeAnimators(positionAnimator, clipAnimator);
                        Rect rect21 = endClip2;
                        Rect rect22 = startClip2;
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup parent = (ViewGroup) view.getParent();
                        ViewGroupUtils.suppressLayout(parent, true);
                        getRootTransition().addListener(new SuppressLayoutListener(parent));
                    }
                    return anim;
                }
                Rect rect23 = endClip3;
                return null;
            }
        }
    }

    private static class ViewBounds {
        private int mBottom;
        private int mBottomRightCalls;
        private int mLeft;
        private int mRight;
        private int mTop;
        private int mTopLeftCalls;
        private final View mView;

        ViewBounds(View view) {
            this.mView = view;
        }

        /* access modifiers changed from: package-private */
        public void setTopLeft(PointF topLeft) {
            this.mLeft = Math.round(topLeft.x);
            this.mTop = Math.round(topLeft.y);
            this.mTopLeftCalls++;
            if (this.mTopLeftCalls == this.mBottomRightCalls) {
                setLeftTopRightBottom();
            }
        }

        /* access modifiers changed from: package-private */
        public void setBottomRight(PointF bottomRight) {
            this.mRight = Math.round(bottomRight.x);
            this.mBottom = Math.round(bottomRight.y);
            this.mBottomRightCalls++;
            if (this.mTopLeftCalls == this.mBottomRightCalls) {
                setLeftTopRightBottom();
            }
        }

        private void setLeftTopRightBottom() {
            ViewUtils.setLeftTopRightBottom(this.mView, this.mLeft, this.mTop, this.mRight, this.mBottom);
            this.mTopLeftCalls = 0;
            this.mBottomRightCalls = 0;
        }
    }

    private static class ClipListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private final int mEndBottom;
        private final Rect mEndClip;
        private final boolean mEndClipIsNull;
        private final int mEndLeft;
        private final int mEndRight;
        private final int mEndTop;
        private boolean mIsCanceled;
        private final int mStartBottom;
        private final Rect mStartClip;
        private final boolean mStartClipIsNull;
        private final int mStartLeft;
        private final int mStartRight;
        private final int mStartTop;
        private final View mView;

        ClipListener(View view, Rect startClip, boolean startClipIsNull, Rect endClip, boolean endClipIsNull, int startLeft, int startTop, int startRight, int startBottom, int endLeft, int endTop, int endRight, int endBottom) {
            this.mView = view;
            this.mStartClip = startClip;
            this.mStartClipIsNull = startClipIsNull;
            this.mEndClip = endClip;
            this.mEndClipIsNull = endClipIsNull;
            this.mStartLeft = startLeft;
            this.mStartTop = startTop;
            this.mStartRight = startRight;
            this.mStartBottom = startBottom;
            this.mEndLeft = endLeft;
            this.mEndTop = endTop;
            this.mEndRight = endRight;
            this.mEndBottom = endBottom;
        }

        public void onAnimationStart(Animator animation) {
            onAnimationStart(animation, false);
        }

        public void onAnimationEnd(Animator animation) {
            onAnimationEnd(animation, false);
        }

        public void onAnimationStart(Animator animation, boolean isReverse) {
            int maxWidth = Math.max(this.mStartRight - this.mStartLeft, this.mEndRight - this.mEndLeft);
            int maxHeight = Math.max(this.mStartBottom - this.mStartTop, this.mEndBottom - this.mEndTop);
            int left = isReverse ? this.mEndLeft : this.mStartLeft;
            int top = isReverse ? this.mEndTop : this.mStartTop;
            ViewUtils.setLeftTopRightBottom(this.mView, left, top, left + maxWidth, top + maxHeight);
            this.mView.setClipBounds(isReverse ? this.mEndClip : this.mStartClip);
        }

        public void onAnimationEnd(Animator animation, boolean isReverse) {
            if (!this.mIsCanceled) {
                Rect clip = null;
                if (isReverse) {
                    if (!this.mStartClipIsNull) {
                        clip = this.mStartClip;
                    }
                } else if (!this.mEndClipIsNull) {
                    clip = this.mEndClip;
                }
                this.mView.setClipBounds(clip);
                if (isReverse) {
                    ViewUtils.setLeftTopRightBottom(this.mView, this.mStartLeft, this.mStartTop, this.mStartRight, this.mStartBottom);
                } else {
                    ViewUtils.setLeftTopRightBottom(this.mView, this.mEndLeft, this.mEndTop, this.mEndRight, this.mEndBottom);
                }
            }
        }

        public void onTransitionCancel(Transition transition) {
            this.mIsCanceled = true;
        }

        public void onTransitionPause(Transition transition) {
            this.mView.setTag(R.id.transition_clip, this.mView.getClipBounds());
            this.mView.setClipBounds(this.mEndClipIsNull ? null : this.mEndClip);
        }

        public void onTransitionResume(Transition transition) {
            this.mView.setTag(R.id.transition_clip, (Object) null);
            this.mView.setClipBounds((Rect) this.mView.getTag(R.id.transition_clip));
        }

        public void onTransitionStart(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
        }
    }

    private static class SuppressLayoutListener extends TransitionListenerAdapter {
        boolean mCanceled = false;
        final ViewGroup mParent;

        SuppressLayoutListener(ViewGroup parent) {
            this.mParent = parent;
        }

        public void onTransitionCancel(Transition transition) {
            ViewGroupUtils.suppressLayout(this.mParent, false);
            this.mCanceled = true;
        }

        public void onTransitionEnd(Transition transition) {
            if (!this.mCanceled) {
                ViewGroupUtils.suppressLayout(this.mParent, false);
            }
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
            ViewGroupUtils.suppressLayout(this.mParent, false);
        }

        public void onTransitionResume(Transition transition) {
            ViewGroupUtils.suppressLayout(this.mParent, true);
        }
    }
}
