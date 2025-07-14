package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

public class ViewTransition {
    static final int ANTICIPATE = 6;
    static final int BOUNCE = 4;
    public static final String CONSTRAINT_OVERRIDE = "ConstraintOverride";
    public static final String CUSTOM_ATTRIBUTE = "CustomAttribute";
    public static final String CUSTOM_METHOD = "CustomMethod";
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    public static final String KEY_FRAME_SET_TAG = "KeyFrameSet";
    static final int LINEAR = 3;
    public static final int ONSTATE_ACTION_DOWN = 1;
    public static final int ONSTATE_ACTION_DOWN_UP = 3;
    public static final int ONSTATE_ACTION_UP = 2;
    public static final int ONSTATE_SHARED_VALUE_SET = 4;
    public static final int ONSTATE_SHARED_VALUE_UNSET = 5;
    static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    private static final String TAG = "ViewTransition";
    private static final int UNSET = -1;
    static final int VIEWTRANSITIONMODE_ALLSTATES = 1;
    static final int VIEWTRANSITIONMODE_CURRENTSTATE = 0;
    static final int VIEWTRANSITIONMODE_NOSTATE = 2;
    public static final String VIEW_TRANSITION_TAG = "ViewTransition";
    private int mClearsTag = -1;
    ConstraintSet.Constraint mConstraintDelta;
    Context mContext;
    private int mDefaultInterpolator = 0;
    private int mDefaultInterpolatorID = -1;
    private String mDefaultInterpolatorString = null;
    private boolean mDisabled = false;
    private int mDuration = -1;
    private int mId;
    private int mIfTagNotSet = -1;
    private int mIfTagSet = -1;
    KeyFrames mKeyFrames;
    private int mOnStateTransition = -1;
    private int mPathMotionArc = 0;
    ConstraintSet mSet;
    private int mSetsTag = -1;
    private int mSharedValueCurrent = -1;
    private int mSharedValueID = -1;
    private int mSharedValueTarget = -1;
    private int mTargetId;
    private String mTargetString;
    private int mUpDuration = -1;
    int mViewTransitionMode;

    public int getSharedValueCurrent() {
        return this.mSharedValueCurrent;
    }

    public void setSharedValueCurrent(int sharedValueCurrent) {
        this.mSharedValueCurrent = sharedValueCurrent;
    }

    public int getStateTransition() {
        return this.mOnStateTransition;
    }

    public void setStateTransition(int stateTransition) {
        this.mOnStateTransition = stateTransition;
    }

    public int getSharedValue() {
        return this.mSharedValueTarget;
    }

    public void setSharedValue(int sharedValue) {
        this.mSharedValueTarget = sharedValue;
    }

    public int getSharedValueID() {
        return this.mSharedValueID;
    }

    public void setSharedValueID(int sharedValueID) {
        this.mSharedValueID = sharedValueID;
    }

    public String toString() {
        return "ViewTransition(" + Debug.getName(this.mContext, this.mId) + ")";
    }

    /* access modifiers changed from: package-private */
    public Interpolator getInterpolator(Context context) {
        switch (this.mDefaultInterpolator) {
            case -2:
                return AnimationUtils.loadInterpolator(context, this.mDefaultInterpolatorID);
            case -1:
                final Easing easing = Easing.getInterpolator(this.mDefaultInterpolatorString);
                return new Interpolator() {
                    public float getInterpolation(float v) {
                        return (float) easing.get((double) v);
                    }
                };
            case 0:
                return new AccelerateDecelerateInterpolator();
            case 1:
                return new AccelerateInterpolator();
            case 2:
                return new DecelerateInterpolator();
            case 3:
                return null;
            case 4:
                return new BounceInterpolator();
            case 5:
                return new OvershootInterpolator();
            case 6:
                return new AnticipateInterpolator();
            default:
                return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    ViewTransition(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            r8 = this;
            java.lang.String r0 = "Error parsing XML resource"
            java.lang.String r1 = "ViewTransition"
            r8.<init>()
            r2 = -1
            r8.mOnStateTransition = r2
            r3 = 0
            r8.mDisabled = r3
            r8.mPathMotionArc = r3
            r8.mDuration = r2
            r8.mUpDuration = r2
            r8.mDefaultInterpolator = r3
            r4 = 0
            r8.mDefaultInterpolatorString = r4
            r8.mDefaultInterpolatorID = r2
            r8.mSetsTag = r2
            r8.mClearsTag = r2
            r8.mIfTagSet = r2
            r8.mIfTagNotSet = r2
            r8.mSharedValueTarget = r2
            r8.mSharedValueID = r2
            r8.mSharedValueCurrent = r2
            r8.mContext = r9
            int r4 = r10.getEventType()     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
        L_0x002e:
            r5 = 1
            if (r4 == r5) goto L_0x00dd
            switch(r4) {
                case 0: goto L_0x00d5;
                case 1: goto L_0x0034;
                case 2: goto L_0x0041;
                case 3: goto L_0x0036;
                case 4: goto L_0x00d5;
                default: goto L_0x0034;
            }     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
        L_0x0034:
            goto L_0x00d6
        L_0x0036:
            java.lang.String r5 = r10.getName()     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            boolean r5 = r1.equals(r5)     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            if (r5 == 0) goto L_0x00d6
            return
        L_0x0041:
            java.lang.String r6 = r10.getName()     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            int r7 = r6.hashCode()     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            switch(r7) {
                case -1962203927: goto L_0x0072;
                case -1239391468: goto L_0x0069;
                case 61998586: goto L_0x0061;
                case 366511058: goto L_0x0057;
                case 1791837707: goto L_0x004d;
                default: goto L_0x004c;
            }     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
        L_0x004c:
            goto L_0x007c
        L_0x004d:
            java.lang.String r5 = "CustomAttribute"
            boolean r5 = r6.equals(r5)     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            if (r5 == 0) goto L_0x004c
            r5 = 3
            goto L_0x007d
        L_0x0057:
            java.lang.String r5 = "CustomMethod"
            boolean r5 = r6.equals(r5)     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            if (r5 == 0) goto L_0x004c
            r5 = 4
            goto L_0x007d
        L_0x0061:
            boolean r5 = r6.equals(r1)     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            if (r5 == 0) goto L_0x004c
            r5 = r3
            goto L_0x007d
        L_0x0069:
            java.lang.String r7 = "KeyFrameSet"
            boolean r7 = r6.equals(r7)     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            if (r7 == 0) goto L_0x004c
            goto L_0x007d
        L_0x0072:
            java.lang.String r5 = "ConstraintOverride"
            boolean r5 = r6.equals(r5)     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            if (r5 == 0) goto L_0x004c
            r5 = 2
            goto L_0x007d
        L_0x007c:
            r5 = r2
        L_0x007d:
            switch(r5) {
                case 0: goto L_0x0098;
                case 1: goto L_0x0090;
                case 2: goto L_0x0089;
                case 3: goto L_0x0081;
                case 4: goto L_0x0081;
                default: goto L_0x0080;
            }     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
        L_0x0080:
            goto L_0x009c
        L_0x0081:
            androidx.constraintlayout.widget.ConstraintSet$Constraint r5 = r8.mConstraintDelta     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r5 = r5.mCustomConstraints     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            androidx.constraintlayout.widget.ConstraintAttribute.parse(r9, r10, r5)     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            goto L_0x00d4
        L_0x0089:
            androidx.constraintlayout.widget.ConstraintSet$Constraint r5 = androidx.constraintlayout.widget.ConstraintSet.buildDelta(r9, r10)     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            r8.mConstraintDelta = r5     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            goto L_0x00d4
        L_0x0090:
            androidx.constraintlayout.motion.widget.KeyFrames r5 = new androidx.constraintlayout.motion.widget.KeyFrames     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            r5.<init>(r9, r10)     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            r8.mKeyFrames = r5     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            goto L_0x00d4
        L_0x0098:
            r8.parseViewTransitionTags(r9, r10)     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            goto L_0x00d4
        L_0x009c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            java.lang.String r7 = androidx.constraintlayout.motion.widget.Debug.getLoc()     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            java.lang.String r7 = " unknown tag "
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            java.lang.String r5 = r5.toString()     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            android.util.Log.e(r1, r5)     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            java.lang.String r7 = ".xml:"
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            int r7 = r10.getLineNumber()     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            java.lang.String r5 = r5.toString()     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            android.util.Log.e(r1, r5)     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
        L_0x00d4:
            goto L_0x00d6
        L_0x00d5:
        L_0x00d6:
            int r5 = r10.next()     // Catch:{ XmlPullParserException -> 0x00e3, IOException -> 0x00de }
            r4 = r5
            goto L_0x002e
        L_0x00dd:
            goto L_0x00e7
        L_0x00de:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
            goto L_0x00e8
        L_0x00e3:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x00e7:
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.ViewTransition.<init>(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    private void parseViewTransitionTags(Context context, XmlPullParser parser) {
        TypedArray a = context.obtainStyledAttributes(Xml.asAttributeSet(parser), R.styleable.ViewTransition);
        int count = a.getIndexCount();
        for (int i = 0; i < count; i++) {
            int attr = a.getIndex(i);
            if (attr == R.styleable.ViewTransition_android_id) {
                this.mId = a.getResourceId(attr, this.mId);
            } else if (attr == R.styleable.ViewTransition_motionTarget) {
                if (MotionLayout.IS_IN_EDIT_MODE) {
                    this.mTargetId = a.getResourceId(attr, this.mTargetId);
                    if (this.mTargetId == -1) {
                        this.mTargetString = a.getString(attr);
                    }
                } else if (a.peekValue(attr).type == 3) {
                    this.mTargetString = a.getString(attr);
                } else {
                    this.mTargetId = a.getResourceId(attr, this.mTargetId);
                }
            } else if (attr == R.styleable.ViewTransition_onStateTransition) {
                this.mOnStateTransition = a.getInt(attr, this.mOnStateTransition);
            } else if (attr == R.styleable.ViewTransition_transitionDisable) {
                this.mDisabled = a.getBoolean(attr, this.mDisabled);
            } else if (attr == R.styleable.ViewTransition_pathMotionArc) {
                this.mPathMotionArc = a.getInt(attr, this.mPathMotionArc);
            } else if (attr == R.styleable.ViewTransition_duration) {
                this.mDuration = a.getInt(attr, this.mDuration);
            } else if (attr == R.styleable.ViewTransition_upDuration) {
                this.mUpDuration = a.getInt(attr, this.mUpDuration);
            } else if (attr == R.styleable.ViewTransition_viewTransitionMode) {
                this.mViewTransitionMode = a.getInt(attr, this.mViewTransitionMode);
            } else if (attr == R.styleable.ViewTransition_motionInterpolator) {
                TypedValue type = a.peekValue(attr);
                if (type.type == 1) {
                    this.mDefaultInterpolatorID = a.getResourceId(attr, -1);
                    if (this.mDefaultInterpolatorID != -1) {
                        this.mDefaultInterpolator = -2;
                    }
                } else if (type.type == 3) {
                    this.mDefaultInterpolatorString = a.getString(attr);
                    if (this.mDefaultInterpolatorString == null || this.mDefaultInterpolatorString.indexOf("/") <= 0) {
                        this.mDefaultInterpolator = -1;
                    } else {
                        this.mDefaultInterpolatorID = a.getResourceId(attr, -1);
                        this.mDefaultInterpolator = -2;
                    }
                } else {
                    this.mDefaultInterpolator = a.getInteger(attr, this.mDefaultInterpolator);
                }
            } else if (attr == R.styleable.ViewTransition_setsTag) {
                this.mSetsTag = a.getResourceId(attr, this.mSetsTag);
            } else if (attr == R.styleable.ViewTransition_clearsTag) {
                this.mClearsTag = a.getResourceId(attr, this.mClearsTag);
            } else if (attr == R.styleable.ViewTransition_ifTagSet) {
                this.mIfTagSet = a.getResourceId(attr, this.mIfTagSet);
            } else if (attr == R.styleable.ViewTransition_ifTagNotSet) {
                this.mIfTagNotSet = a.getResourceId(attr, this.mIfTagNotSet);
            } else if (attr == R.styleable.ViewTransition_SharedValueId) {
                this.mSharedValueID = a.getResourceId(attr, this.mSharedValueID);
            } else if (attr == R.styleable.ViewTransition_SharedValue) {
                this.mSharedValueTarget = a.getInteger(attr, this.mSharedValueTarget);
            }
        }
        a.recycle();
    }

    /* access modifiers changed from: package-private */
    public void applyIndependentTransition(ViewTransitionController controller, MotionLayout motionLayout, View view) {
        MotionController motionController = new MotionController(view);
        motionController.setBothStates(view);
        this.mKeyFrames.addAllFrames(motionController);
        motionController.setup(motionLayout.getWidth(), motionLayout.getHeight(), (float) this.mDuration, System.nanoTime());
        new Animate(controller, motionController, this.mDuration, this.mUpDuration, this.mOnStateTransition, getInterpolator(motionLayout.getContext()), this.mSetsTag, this.mClearsTag);
    }

    static class Animate {
        KeyCache mCache = new KeyCache();
        private final int mClearsTag;
        float mDpositionDt;
        int mDuration;
        boolean mHoldAt100 = false;
        Interpolator mInterpolator;
        long mLastRender;
        MotionController mMC;
        float mPosition;
        boolean mReverse = false;
        private final int mSetsTag;
        long mStart;
        Rect mTempRec = new Rect();
        int mUpDuration;
        ViewTransitionController mVtController;

        Animate(ViewTransitionController controller, MotionController motionController, int duration, int upDuration, int mode, Interpolator interpolator, int setTag, int clearTag) {
            this.mVtController = controller;
            this.mMC = motionController;
            this.mDuration = duration;
            this.mUpDuration = upDuration;
            this.mStart = System.nanoTime();
            this.mLastRender = this.mStart;
            this.mVtController.addAnimation(this);
            this.mInterpolator = interpolator;
            this.mSetsTag = setTag;
            this.mClearsTag = clearTag;
            if (mode == 3) {
                this.mHoldAt100 = true;
            }
            this.mDpositionDt = duration == 0 ? Float.MAX_VALUE : 1.0f / ((float) duration);
            mutate();
        }

        /* access modifiers changed from: package-private */
        public void reverse(boolean dir) {
            this.mReverse = dir;
            if (this.mReverse && this.mUpDuration != -1) {
                this.mDpositionDt = this.mUpDuration == 0 ? Float.MAX_VALUE : 1.0f / ((float) this.mUpDuration);
            }
            this.mVtController.invalidate();
            this.mLastRender = System.nanoTime();
        }

        /* access modifiers changed from: package-private */
        public void mutate() {
            if (this.mReverse) {
                mutateReverse();
            } else {
                mutateForward();
            }
        }

        /* access modifiers changed from: package-private */
        public void mutateReverse() {
            float ipos;
            long current = System.nanoTime();
            long elapse = current - this.mLastRender;
            this.mLastRender = current;
            this.mPosition -= ((float) (((double) elapse) * 1.0E-6d)) * this.mDpositionDt;
            if (this.mPosition < 0.0f) {
                this.mPosition = 0.0f;
            }
            if (this.mInterpolator == null) {
                ipos = this.mPosition;
            } else {
                ipos = this.mInterpolator.getInterpolation(this.mPosition);
            }
            boolean repaint = this.mMC.interpolate(this.mMC.mView, ipos, current, this.mCache);
            if (this.mPosition <= 0.0f) {
                if (this.mSetsTag != -1) {
                    this.mMC.getView().setTag(this.mSetsTag, Long.valueOf(System.nanoTime()));
                }
                if (this.mClearsTag != -1) {
                    this.mMC.getView().setTag(this.mClearsTag, (Object) null);
                }
                this.mVtController.removeAnimation(this);
            }
            if (this.mPosition > 0.0f || repaint) {
                this.mVtController.invalidate();
            }
        }

        /* access modifiers changed from: package-private */
        public void mutateForward() {
            float ipos;
            long current = System.nanoTime();
            long elapse = current - this.mLastRender;
            this.mLastRender = current;
            this.mPosition += ((float) (((double) elapse) * 1.0E-6d)) * this.mDpositionDt;
            if (this.mPosition >= 1.0f) {
                this.mPosition = 1.0f;
            }
            if (this.mInterpolator == null) {
                ipos = this.mPosition;
            } else {
                ipos = this.mInterpolator.getInterpolation(this.mPosition);
            }
            boolean repaint = this.mMC.interpolate(this.mMC.mView, ipos, current, this.mCache);
            if (this.mPosition >= 1.0f) {
                if (this.mSetsTag != -1) {
                    this.mMC.getView().setTag(this.mSetsTag, Long.valueOf(System.nanoTime()));
                }
                if (this.mClearsTag != -1) {
                    this.mMC.getView().setTag(this.mClearsTag, (Object) null);
                }
                if (!this.mHoldAt100) {
                    this.mVtController.removeAnimation(this);
                }
            }
            if (this.mPosition < 1.0f || repaint) {
                this.mVtController.invalidate();
            }
        }

        public void reactTo(int action, float x, float y) {
            switch (action) {
                case 1:
                    if (!this.mReverse) {
                        reverse(true);
                        return;
                    }
                    return;
                case 2:
                    this.mMC.getView().getHitRect(this.mTempRec);
                    if (!this.mTempRec.contains((int) x, (int) y) && !this.mReverse) {
                        reverse(true);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void applyTransition(ViewTransitionController controller, MotionLayout layout, int fromId, ConstraintSet current, View... views) {
        MotionLayout motionLayout = layout;
        int i = fromId;
        ConstraintSet constraintSet = current;
        View[] viewArr = views;
        if (!this.mDisabled) {
            int i2 = 0;
            if (this.mViewTransitionMode == 2) {
                applyIndependentTransition(controller, motionLayout, viewArr[0]);
                return;
            }
            ViewTransitionController viewTransitionController = controller;
            if (this.mViewTransitionMode == 1) {
                int[] ids = layout.getConstraintSetIds();
                int i3 = 0;
                while (i3 < ids.length) {
                    int id = ids[i3];
                    if (id != i) {
                        ConstraintSet cSet = motionLayout.getConstraintSet(id);
                        int length = viewArr.length;
                        for (int i4 = i2; i4 < length; i4++) {
                            ConstraintSet.Constraint constraint = cSet.getConstraint(viewArr[i4].getId());
                            if (this.mConstraintDelta != null) {
                                this.mConstraintDelta.applyDelta(constraint);
                                constraint.mCustomConstraints.putAll(this.mConstraintDelta.mCustomConstraints);
                            }
                        }
                    }
                    i3++;
                    i2 = 0;
                }
            }
            ConstraintSet transformedState = new ConstraintSet();
            transformedState.clone(constraintSet);
            for (View view : viewArr) {
                ConstraintSet.Constraint constraint2 = transformedState.getConstraint(view.getId());
                if (this.mConstraintDelta != null) {
                    this.mConstraintDelta.applyDelta(constraint2);
                    constraint2.mCustomConstraints.putAll(this.mConstraintDelta.mCustomConstraints);
                }
            }
            motionLayout.updateState(i, transformedState);
            motionLayout.updateState(R.id.view_transition, constraintSet);
            motionLayout.setState(R.id.view_transition, -1, -1);
            MotionScene.Transition tmpTransition = new MotionScene.Transition(-1, motionLayout.mScene, R.id.view_transition, i);
            for (View view2 : viewArr) {
                updateTransition(tmpTransition, view2);
            }
            motionLayout.setTransition(tmpTransition);
            motionLayout.transitionToEnd(new ViewTransition$$ExternalSyntheticLambda0(this, viewArr));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$applyTransition$0$androidx-constraintlayout-motion-widget-ViewTransition  reason: not valid java name */
    public /* synthetic */ void m106lambda$applyTransition$0$androidxconstraintlayoutmotionwidgetViewTransition(View[] views) {
        if (this.mSetsTag != -1) {
            for (View view : views) {
                view.setTag(this.mSetsTag, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.mClearsTag != -1) {
            for (View view2 : views) {
                view2.setTag(this.mClearsTag, (Object) null);
            }
        }
    }

    private void updateTransition(MotionScene.Transition transition, View view) {
        if (this.mDuration != -1) {
            transition.setDuration(this.mDuration);
        }
        transition.setPathMotionArc(this.mPathMotionArc);
        transition.setInterpolatorInfo(this.mDefaultInterpolator, this.mDefaultInterpolatorString, this.mDefaultInterpolatorID);
        int id = view.getId();
        if (this.mKeyFrames != null) {
            ArrayList<Key> keys = this.mKeyFrames.getKeyFramesForView(-1);
            KeyFrames keyFrames = new KeyFrames();
            Iterator<Key> it = keys.iterator();
            while (it.hasNext()) {
                keyFrames.addKey(it.next().clone().setViewId(id));
            }
            transition.addKeyFrame(keyFrames);
        }
    }

    /* access modifiers changed from: package-private */
    public int getId() {
        return this.mId;
    }

    /* access modifiers changed from: package-private */
    public void setId(int id) {
        this.mId = id;
    }

    /* access modifiers changed from: package-private */
    public boolean matchesView(View view) {
        String tag;
        if (view == null) {
            return false;
        }
        if ((this.mTargetId == -1 && this.mTargetString == null) || !checkTags(view)) {
            return false;
        }
        if (view.getId() == this.mTargetId) {
            return true;
        }
        if (this.mTargetString != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (tag = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).constraintTag) != null && tag.matches(this.mTargetString)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean supports(int action) {
        if (this.mOnStateTransition == 1) {
            if (action == 0) {
                return true;
            }
            return false;
        } else if (this.mOnStateTransition == 2) {
            if (action == 1) {
                return true;
            }
            return false;
        } else if (this.mOnStateTransition == 3 && action == 0) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isEnabled() {
        return !this.mDisabled;
    }

    /* access modifiers changed from: package-private */
    public void setEnabled(boolean enable) {
        this.mDisabled = !enable;
    }

    /* access modifiers changed from: package-private */
    public boolean checkTags(View view) {
        boolean set = this.mIfTagSet == -1 || view.getTag(this.mIfTagSet) != null;
        boolean notSet = this.mIfTagNotSet == -1 || view.getTag(this.mIfTagNotSet) == null;
        if (!set || !notSet) {
            return false;
        }
        return true;
    }
}
