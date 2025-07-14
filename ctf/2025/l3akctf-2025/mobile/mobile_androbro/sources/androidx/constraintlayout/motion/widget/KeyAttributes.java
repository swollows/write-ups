package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;
import java.util.HashSet;

public class KeyAttributes extends Key {
    private static final boolean DEBUG = false;
    public static final int KEY_TYPE = 1;
    static final String NAME = "KeyAttribute";
    private static final String TAG = "KeyAttributes";
    /* access modifiers changed from: private */
    public float mAlpha = Float.NaN;
    /* access modifiers changed from: private */
    public int mCurveFit = -1;
    /* access modifiers changed from: private */
    public float mElevation = Float.NaN;
    /* access modifiers changed from: private */
    public float mPivotX = Float.NaN;
    /* access modifiers changed from: private */
    public float mPivotY = Float.NaN;
    /* access modifiers changed from: private */
    public float mProgress = Float.NaN;
    /* access modifiers changed from: private */
    public float mRotation = Float.NaN;
    /* access modifiers changed from: private */
    public float mRotationX = Float.NaN;
    /* access modifiers changed from: private */
    public float mRotationY = Float.NaN;
    /* access modifiers changed from: private */
    public float mScaleX = Float.NaN;
    /* access modifiers changed from: private */
    public float mScaleY = Float.NaN;
    /* access modifiers changed from: private */
    public String mTransitionEasing;
    /* access modifiers changed from: private */
    public float mTransitionPathRotate = Float.NaN;
    /* access modifiers changed from: private */
    public float mTranslationX = Float.NaN;
    /* access modifiers changed from: private */
    public float mTranslationY = Float.NaN;
    /* access modifiers changed from: private */
    public float mTranslationZ = Float.NaN;
    private boolean mVisibility = false;

    public KeyAttributes() {
        this.mType = 1;
        this.mCustomConstraints = new HashMap();
    }

    public void load(Context context, AttributeSet attrs) {
        Loader.read(this, context.obtainStyledAttributes(attrs, R.styleable.KeyAttribute));
    }

    /* access modifiers changed from: package-private */
    public int getCurveFit() {
        return this.mCurveFit;
    }

    public void getAttributeNames(HashSet<String> attributes) {
        if (!Float.isNaN(this.mAlpha)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.mElevation)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.mRotation)) {
            attributes.add(Key.ROTATION);
        }
        if (!Float.isNaN(this.mRotationX)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.mRotationY)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.mPivotX)) {
            attributes.add(Key.PIVOT_X);
        }
        if (!Float.isNaN(this.mPivotY)) {
            attributes.add(Key.PIVOT_Y);
        }
        if (!Float.isNaN(this.mTranslationX)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.mTranslationY)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.mTranslationZ)) {
            attributes.add("translationZ");
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.mScaleX)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.mScaleY)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.mProgress)) {
            attributes.add("progress");
        }
        if (this.mCustomConstraints.size() > 0) {
            for (String s : this.mCustomConstraints.keySet()) {
                attributes.add("CUSTOM," + s);
            }
        }
    }

    public void setInterpolation(HashMap<String, Integer> interpolation) {
        if (this.mCurveFit != -1) {
            if (!Float.isNaN(this.mAlpha)) {
                interpolation.put("alpha", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mElevation)) {
                interpolation.put("elevation", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mRotation)) {
                interpolation.put(Key.ROTATION, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mRotationX)) {
                interpolation.put("rotationX", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mRotationY)) {
                interpolation.put("rotationY", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mPivotX)) {
                interpolation.put(Key.PIVOT_X, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mPivotY)) {
                interpolation.put(Key.PIVOT_Y, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTranslationX)) {
                interpolation.put("translationX", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTranslationY)) {
                interpolation.put("translationY", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTranslationZ)) {
                interpolation.put("translationZ", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTransitionPathRotate)) {
                interpolation.put("transitionPathRotate", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mScaleX)) {
                interpolation.put("scaleX", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mScaleY)) {
                interpolation.put("scaleY", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mProgress)) {
                interpolation.put("progress", Integer.valueOf(this.mCurveFit));
            }
            if (this.mCustomConstraints.size() > 0) {
                for (String s : this.mCustomConstraints.keySet()) {
                    interpolation.put("CUSTOM," + s, Integer.valueOf(this.mCurveFit));
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r1.equals("elevation") != false) goto L_0x00e9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r8) {
        /*
            r7 = this;
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01d6
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.get(r1)
            androidx.constraintlayout.core.motion.utils.SplineSet r2 = (androidx.constraintlayout.core.motion.utils.SplineSet) r2
            if (r2 != 0) goto L_0x001d
            goto L_0x0008
        L_0x001d:
            java.lang.String r3 = "CUSTOM"
            boolean r4 = r1.startsWith(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0042
            int r3 = r3.length()
            int r3 = r3 + r5
            java.lang.String r3 = r1.substring(r3)
            java.util.HashMap r4 = r7.mCustomConstraints
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.widget.ConstraintAttribute r4 = (androidx.constraintlayout.widget.ConstraintAttribute) r4
            if (r4 == 0) goto L_0x0008
            r5 = r2
            androidx.constraintlayout.motion.utils.ViewSpline$CustomSet r5 = (androidx.constraintlayout.motion.utils.ViewSpline.CustomSet) r5
            int r6 = r7.mFramePosition
            r5.setPoint((int) r6, (androidx.constraintlayout.widget.ConstraintAttribute) r4)
            goto L_0x0008
        L_0x0042:
            int r3 = r1.hashCode()
            switch(r3) {
                case -1249320806: goto L_0x00de;
                case -1249320805: goto L_0x00d4;
                case -1225497657: goto L_0x00c8;
                case -1225497656: goto L_0x00bc;
                case -1225497655: goto L_0x00b0;
                case -1001078227: goto L_0x00a5;
                case -908189618: goto L_0x0099;
                case -908189617: goto L_0x008d;
                case -760884510: goto L_0x0082;
                case -760884509: goto L_0x0077;
                case -40300674: goto L_0x006c;
                case -4379043: goto L_0x0062;
                case 37232917: goto L_0x0056;
                case 92909918: goto L_0x004b;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x00e8
        L_0x004b:
            java.lang.String r3 = "alpha"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0049
            r5 = 0
            goto L_0x00e9
        L_0x0056:
            java.lang.String r3 = "transitionPathRotate"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0049
            r5 = 7
            goto L_0x00e9
        L_0x0062:
            java.lang.String r3 = "elevation"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0049
            goto L_0x00e9
        L_0x006c:
            java.lang.String r3 = "rotation"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0049
            r5 = 2
            goto L_0x00e9
        L_0x0077:
            java.lang.String r3 = "transformPivotY"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0049
            r5 = 6
            goto L_0x00e9
        L_0x0082:
            java.lang.String r3 = "transformPivotX"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0049
            r5 = 5
            goto L_0x00e9
        L_0x008d:
            java.lang.String r3 = "scaleY"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0049
            r5 = 9
            goto L_0x00e9
        L_0x0099:
            java.lang.String r3 = "scaleX"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0049
            r5 = 8
            goto L_0x00e9
        L_0x00a5:
            java.lang.String r3 = "progress"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0049
            r5 = 13
            goto L_0x00e9
        L_0x00b0:
            java.lang.String r3 = "translationZ"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0049
            r5 = 12
            goto L_0x00e9
        L_0x00bc:
            java.lang.String r3 = "translationY"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0049
            r5 = 11
            goto L_0x00e9
        L_0x00c8:
            java.lang.String r3 = "translationX"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0049
            r5 = 10
            goto L_0x00e9
        L_0x00d4:
            java.lang.String r3 = "rotationY"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0049
            r5 = 4
            goto L_0x00e9
        L_0x00de:
            java.lang.String r3 = "rotationX"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0049
            r5 = 3
            goto L_0x00e9
        L_0x00e8:
            r5 = -1
        L_0x00e9:
            switch(r5) {
                case 0: goto L_0x01c5;
                case 1: goto L_0x01b5;
                case 2: goto L_0x01a5;
                case 3: goto L_0x0195;
                case 4: goto L_0x0185;
                case 5: goto L_0x0175;
                case 6: goto L_0x0165;
                case 7: goto L_0x0154;
                case 8: goto L_0x0143;
                case 9: goto L_0x0132;
                case 10: goto L_0x0121;
                case 11: goto L_0x0110;
                case 12: goto L_0x00ff;
                case 13: goto L_0x00ee;
                default: goto L_0x00ec;
            }
        L_0x00ec:
            goto L_0x01d4
        L_0x00ee:
            float r3 = r7.mProgress
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x01d4
            int r3 = r7.mFramePosition
            float r4 = r7.mProgress
            r2.setPoint(r3, r4)
            goto L_0x01d4
        L_0x00ff:
            float r3 = r7.mTranslationZ
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x01d4
            int r3 = r7.mFramePosition
            float r4 = r7.mTranslationZ
            r2.setPoint(r3, r4)
            goto L_0x01d4
        L_0x0110:
            float r3 = r7.mTranslationY
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x01d4
            int r3 = r7.mFramePosition
            float r4 = r7.mTranslationY
            r2.setPoint(r3, r4)
            goto L_0x01d4
        L_0x0121:
            float r3 = r7.mTranslationX
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x01d4
            int r3 = r7.mFramePosition
            float r4 = r7.mTranslationX
            r2.setPoint(r3, r4)
            goto L_0x01d4
        L_0x0132:
            float r3 = r7.mScaleY
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x01d4
            int r3 = r7.mFramePosition
            float r4 = r7.mScaleY
            r2.setPoint(r3, r4)
            goto L_0x01d4
        L_0x0143:
            float r3 = r7.mScaleX
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x01d4
            int r3 = r7.mFramePosition
            float r4 = r7.mScaleX
            r2.setPoint(r3, r4)
            goto L_0x01d4
        L_0x0154:
            float r3 = r7.mTransitionPathRotate
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x01d4
            int r3 = r7.mFramePosition
            float r4 = r7.mTransitionPathRotate
            r2.setPoint(r3, r4)
            goto L_0x01d4
        L_0x0165:
            float r3 = r7.mRotationY
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x01d4
            int r3 = r7.mFramePosition
            float r4 = r7.mPivotY
            r2.setPoint(r3, r4)
            goto L_0x01d4
        L_0x0175:
            float r3 = r7.mRotationX
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x01d4
            int r3 = r7.mFramePosition
            float r4 = r7.mPivotX
            r2.setPoint(r3, r4)
            goto L_0x01d4
        L_0x0185:
            float r3 = r7.mRotationY
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x01d4
            int r3 = r7.mFramePosition
            float r4 = r7.mRotationY
            r2.setPoint(r3, r4)
            goto L_0x01d4
        L_0x0195:
            float r3 = r7.mRotationX
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x01d4
            int r3 = r7.mFramePosition
            float r4 = r7.mRotationX
            r2.setPoint(r3, r4)
            goto L_0x01d4
        L_0x01a5:
            float r3 = r7.mRotation
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x01d4
            int r3 = r7.mFramePosition
            float r4 = r7.mRotation
            r2.setPoint(r3, r4)
            goto L_0x01d4
        L_0x01b5:
            float r3 = r7.mElevation
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x01d4
            int r3 = r7.mFramePosition
            float r4 = r7.mElevation
            r2.setPoint(r3, r4)
            goto L_0x01d4
        L_0x01c5:
            float r3 = r7.mAlpha
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x01d4
            int r3 = r7.mFramePosition
            float r4 = r7.mAlpha
            r2.setPoint(r3, r4)
        L_0x01d4:
            goto L_0x0008
        L_0x01d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyAttributes.addValues(java.util.HashMap):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setValue(java.lang.String r2, java.lang.Object r3) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -1913008125: goto L_0x00c3;
                case -1812823328: goto L_0x00b7;
                case -1249320806: goto L_0x00ad;
                case -1249320805: goto L_0x00a3;
                case -1225497657: goto L_0x0097;
                case -1225497656: goto L_0x008b;
                case -1225497655: goto L_0x007f;
                case -908189618: goto L_0x0073;
                case -908189617: goto L_0x0067;
                case -760884510: goto L_0x005c;
                case -760884509: goto L_0x004f;
                case -40300674: goto L_0x0044;
                case -4379043: goto L_0x0039;
                case 37232917: goto L_0x002c;
                case 92909918: goto L_0x0021;
                case 579057826: goto L_0x0016;
                case 1941332754: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x00cd
        L_0x0009:
            java.lang.String r0 = "visibility"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 12
            goto L_0x00ce
        L_0x0016:
            java.lang.String r0 = "curveFit"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 1
            goto L_0x00ce
        L_0x0021:
            java.lang.String r0 = "alpha"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 0
            goto L_0x00ce
        L_0x002c:
            java.lang.String r0 = "transitionPathRotate"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 13
            goto L_0x00ce
        L_0x0039:
            java.lang.String r0 = "elevation"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 2
            goto L_0x00ce
        L_0x0044:
            java.lang.String r0 = "rotation"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 4
            goto L_0x00ce
        L_0x004f:
            java.lang.String r0 = "transformPivotY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 8
            goto L_0x00ce
        L_0x005c:
            java.lang.String r0 = "transformPivotX"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 7
            goto L_0x00ce
        L_0x0067:
            java.lang.String r0 = "scaleY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 10
            goto L_0x00ce
        L_0x0073:
            java.lang.String r0 = "scaleX"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 9
            goto L_0x00ce
        L_0x007f:
            java.lang.String r0 = "translationZ"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 16
            goto L_0x00ce
        L_0x008b:
            java.lang.String r0 = "translationY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 15
            goto L_0x00ce
        L_0x0097:
            java.lang.String r0 = "translationX"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 14
            goto L_0x00ce
        L_0x00a3:
            java.lang.String r0 = "rotationY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 6
            goto L_0x00ce
        L_0x00ad:
            java.lang.String r0 = "rotationX"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 5
            goto L_0x00ce
        L_0x00b7:
            java.lang.String r0 = "transitionEasing"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 11
            goto L_0x00ce
        L_0x00c3:
            java.lang.String r0 = "motionProgress"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 3
            goto L_0x00ce
        L_0x00cd:
            r0 = -1
        L_0x00ce:
            switch(r0) {
                case 0: goto L_0x0145;
                case 1: goto L_0x013e;
                case 2: goto L_0x0137;
                case 3: goto L_0x0130;
                case 4: goto L_0x0129;
                case 5: goto L_0x0122;
                case 6: goto L_0x011b;
                case 7: goto L_0x0114;
                case 8: goto L_0x010d;
                case 9: goto L_0x0106;
                case 10: goto L_0x00ff;
                case 11: goto L_0x00f8;
                case 12: goto L_0x00f1;
                case 13: goto L_0x00ea;
                case 14: goto L_0x00e3;
                case 15: goto L_0x00db;
                case 16: goto L_0x00d3;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            goto L_0x014c
        L_0x00d3:
            float r0 = r1.toFloat(r3)
            r1.mTranslationZ = r0
            goto L_0x014c
        L_0x00db:
            float r0 = r1.toFloat(r3)
            r1.mTranslationY = r0
            goto L_0x014c
        L_0x00e3:
            float r0 = r1.toFloat(r3)
            r1.mTranslationX = r0
            goto L_0x014c
        L_0x00ea:
            float r0 = r1.toFloat(r3)
            r1.mTransitionPathRotate = r0
            goto L_0x014c
        L_0x00f1:
            boolean r0 = r1.toBoolean(r3)
            r1.mVisibility = r0
            goto L_0x014c
        L_0x00f8:
            java.lang.String r0 = r3.toString()
            r1.mTransitionEasing = r0
            goto L_0x014c
        L_0x00ff:
            float r0 = r1.toFloat(r3)
            r1.mScaleY = r0
            goto L_0x014c
        L_0x0106:
            float r0 = r1.toFloat(r3)
            r1.mScaleX = r0
            goto L_0x014c
        L_0x010d:
            float r0 = r1.toFloat(r3)
            r1.mPivotY = r0
            goto L_0x014c
        L_0x0114:
            float r0 = r1.toFloat(r3)
            r1.mPivotX = r0
            goto L_0x014c
        L_0x011b:
            float r0 = r1.toFloat(r3)
            r1.mRotationY = r0
            goto L_0x014c
        L_0x0122:
            float r0 = r1.toFloat(r3)
            r1.mRotationX = r0
            goto L_0x014c
        L_0x0129:
            float r0 = r1.toFloat(r3)
            r1.mRotation = r0
            goto L_0x014c
        L_0x0130:
            float r0 = r1.toFloat(r3)
            r1.mProgress = r0
            goto L_0x014c
        L_0x0137:
            float r0 = r1.toFloat(r3)
            r1.mElevation = r0
            goto L_0x014c
        L_0x013e:
            int r0 = r1.toInt(r3)
            r1.mCurveFit = r0
            goto L_0x014c
        L_0x0145:
            float r0 = r1.toFloat(r3)
            r1.mAlpha = r0
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyAttributes.setValue(java.lang.String, java.lang.Object):void");
    }

    private static class Loader {
        private static final int ANDROID_ALPHA = 1;
        private static final int ANDROID_ELEVATION = 2;
        private static final int ANDROID_PIVOT_X = 19;
        private static final int ANDROID_PIVOT_Y = 20;
        private static final int ANDROID_ROTATION = 4;
        private static final int ANDROID_ROTATION_X = 5;
        private static final int ANDROID_ROTATION_Y = 6;
        private static final int ANDROID_SCALE_X = 7;
        private static final int ANDROID_SCALE_Y = 14;
        private static final int ANDROID_TRANSLATION_X = 15;
        private static final int ANDROID_TRANSLATION_Y = 16;
        private static final int ANDROID_TRANSLATION_Z = 17;
        private static final int CURVE_FIT = 13;
        private static final int FRAME_POSITION = 12;
        private static final int PROGRESS = 18;
        private static final int TARGET_ID = 10;
        private static final int TRANSITION_EASING = 9;
        private static final int TRANSITION_PATH_ROTATE = 8;
        private static SparseIntArray sAttrMap = new SparseIntArray();

        private Loader() {
        }

        static {
            sAttrMap.append(R.styleable.KeyAttribute_android_alpha, 1);
            sAttrMap.append(R.styleable.KeyAttribute_android_elevation, 2);
            sAttrMap.append(R.styleable.KeyAttribute_android_rotation, 4);
            sAttrMap.append(R.styleable.KeyAttribute_android_rotationX, 5);
            sAttrMap.append(R.styleable.KeyAttribute_android_rotationY, 6);
            sAttrMap.append(R.styleable.KeyAttribute_android_transformPivotX, 19);
            sAttrMap.append(R.styleable.KeyAttribute_android_transformPivotY, 20);
            sAttrMap.append(R.styleable.KeyAttribute_android_scaleX, 7);
            sAttrMap.append(R.styleable.KeyAttribute_transitionPathRotate, 8);
            sAttrMap.append(R.styleable.KeyAttribute_transitionEasing, 9);
            sAttrMap.append(R.styleable.KeyAttribute_motionTarget, 10);
            sAttrMap.append(R.styleable.KeyAttribute_framePosition, 12);
            sAttrMap.append(R.styleable.KeyAttribute_curveFit, 13);
            sAttrMap.append(R.styleable.KeyAttribute_android_scaleY, 14);
            sAttrMap.append(R.styleable.KeyAttribute_android_translationX, 15);
            sAttrMap.append(R.styleable.KeyAttribute_android_translationY, 16);
            sAttrMap.append(R.styleable.KeyAttribute_android_translationZ, 17);
            sAttrMap.append(R.styleable.KeyAttribute_motionProgress, 18);
        }

        public static void read(KeyAttributes c, TypedArray a) {
            int n = a.getIndexCount();
            for (int i = 0; i < n; i++) {
                int attr = a.getIndex(i);
                switch (sAttrMap.get(attr)) {
                    case 1:
                        float unused = c.mAlpha = a.getFloat(attr, c.mAlpha);
                        break;
                    case 2:
                        float unused2 = c.mElevation = a.getDimension(attr, c.mElevation);
                        break;
                    case 4:
                        float unused3 = c.mRotation = a.getFloat(attr, c.mRotation);
                        break;
                    case 5:
                        float unused4 = c.mRotationX = a.getFloat(attr, c.mRotationX);
                        break;
                    case 6:
                        float unused5 = c.mRotationY = a.getFloat(attr, c.mRotationY);
                        break;
                    case 7:
                        float unused6 = c.mScaleX = a.getFloat(attr, c.mScaleX);
                        break;
                    case 8:
                        float unused7 = c.mTransitionPathRotate = a.getFloat(attr, c.mTransitionPathRotate);
                        break;
                    case 9:
                        String unused8 = c.mTransitionEasing = a.getString(attr);
                        break;
                    case 10:
                        if (!MotionLayout.IS_IN_EDIT_MODE) {
                            if (a.peekValue(attr).type != 3) {
                                c.mTargetId = a.getResourceId(attr, c.mTargetId);
                                break;
                            } else {
                                c.mTargetString = a.getString(attr);
                                break;
                            }
                        } else {
                            c.mTargetId = a.getResourceId(attr, c.mTargetId);
                            if (c.mTargetId != -1) {
                                break;
                            } else {
                                c.mTargetString = a.getString(attr);
                                break;
                            }
                        }
                    case 12:
                        c.mFramePosition = a.getInt(attr, c.mFramePosition);
                        break;
                    case 13:
                        int unused9 = c.mCurveFit = a.getInteger(attr, c.mCurveFit);
                        break;
                    case 14:
                        float unused10 = c.mScaleY = a.getFloat(attr, c.mScaleY);
                        break;
                    case 15:
                        float unused11 = c.mTranslationX = a.getDimension(attr, c.mTranslationX);
                        break;
                    case 16:
                        float unused12 = c.mTranslationY = a.getDimension(attr, c.mTranslationY);
                        break;
                    case 17:
                        float unused13 = c.mTranslationZ = a.getDimension(attr, c.mTranslationZ);
                        break;
                    case 18:
                        float unused14 = c.mProgress = a.getFloat(attr, c.mProgress);
                        break;
                    case 19:
                        float unused15 = c.mPivotX = a.getDimension(attr, c.mPivotX);
                        break;
                    case 20:
                        float unused16 = c.mPivotY = a.getDimension(attr, c.mPivotY);
                        break;
                    default:
                        Log.e(KeyAttributes.NAME, "unused attribute 0x" + Integer.toHexString(attr) + "   " + sAttrMap.get(attr));
                        break;
                }
            }
        }
    }

    public Key copy(Key src) {
        super.copy(src);
        KeyAttributes k = (KeyAttributes) src;
        this.mCurveFit = k.mCurveFit;
        this.mVisibility = k.mVisibility;
        this.mAlpha = k.mAlpha;
        this.mElevation = k.mElevation;
        this.mRotation = k.mRotation;
        this.mRotationX = k.mRotationX;
        this.mRotationY = k.mRotationY;
        this.mPivotX = k.mPivotX;
        this.mPivotY = k.mPivotY;
        this.mTransitionPathRotate = k.mTransitionPathRotate;
        this.mScaleX = k.mScaleX;
        this.mScaleY = k.mScaleY;
        this.mTranslationX = k.mTranslationX;
        this.mTranslationY = k.mTranslationY;
        this.mTranslationZ = k.mTranslationZ;
        this.mProgress = k.mProgress;
        this.mTransitionEasing = k.mTransitionEasing;
        return this;
    }

    public Key clone() {
        return new KeyAttributes().copy(this);
    }
}
