package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.Rect;
import java.util.HashSet;
import java.util.LinkedHashMap;

class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {
    static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    static final int PERPENDICULAR = 1;
    public static final String TAG = "MotionPaths";
    static String[] sNames = {"position", "x", "y", "width", "height", "pathRotate"};
    private float mAlpha = 1.0f;
    private int mAnimateRelativeTo = -1;
    private boolean mApplyElevation = false;
    LinkedHashMap<String, CustomVariable> mCustomVariable = new LinkedHashMap<>();
    private int mDrawPath = 0;
    private float mElevation = 0.0f;
    private float mHeight;
    private Easing mKeyFrameEasing;
    int mMode = 0;
    private float mPathRotate = Float.NaN;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float mPosition;
    private float mProgress = Float.NaN;
    private float mRotation = 0.0f;
    private float mRotationX = 0.0f;
    private float mScaleX = 1.0f;
    private float mScaleY = 1.0f;
    double[] mTempDelta = new double[18];
    double[] mTempValue = new double[18];
    private float mTranslationX = 0.0f;
    private float mTranslationY = 0.0f;
    private float mTranslationZ = 0.0f;
    int mVisibility;
    int mVisibilityMode = 0;
    private float mWidth;
    private float mX;
    private float mY;
    public float rotationY = 0.0f;

    MotionConstrainedPoint() {
    }

    private boolean diff(float a, float b) {
        if (Float.isNaN(a) || Float.isNaN(b)) {
            if (Float.isNaN(a) != Float.isNaN(b)) {
                return true;
            }
            return false;
        } else if (Math.abs(a - b) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void different(MotionConstrainedPoint points, HashSet<String> keySet) {
        if (diff(this.mAlpha, points.mAlpha)) {
            keySet.add("alpha");
        }
        if (diff(this.mElevation, points.mElevation)) {
            keySet.add("translationZ");
        }
        if (this.mVisibility != points.mVisibility && this.mVisibilityMode == 0 && (this.mVisibility == 4 || points.mVisibility == 4)) {
            keySet.add("alpha");
        }
        if (diff(this.mRotation, points.mRotation)) {
            keySet.add("rotationZ");
        }
        if (!Float.isNaN(this.mPathRotate) || !Float.isNaN(points.mPathRotate)) {
            keySet.add("pathRotate");
        }
        if (!Float.isNaN(this.mProgress) || !Float.isNaN(points.mProgress)) {
            keySet.add("progress");
        }
        if (diff(this.mRotationX, points.mRotationX)) {
            keySet.add("rotationX");
        }
        if (diff(this.rotationY, points.rotationY)) {
            keySet.add("rotationY");
        }
        if (diff(this.mPivotX, points.mPivotX)) {
            keySet.add("pivotX");
        }
        if (diff(this.mPivotY, points.mPivotY)) {
            keySet.add("pivotY");
        }
        if (diff(this.mScaleX, points.mScaleX)) {
            keySet.add("scaleX");
        }
        if (diff(this.mScaleY, points.mScaleY)) {
            keySet.add("scaleY");
        }
        if (diff(this.mTranslationX, points.mTranslationX)) {
            keySet.add("translationX");
        }
        if (diff(this.mTranslationY, points.mTranslationY)) {
            keySet.add("translationY");
        }
        if (diff(this.mTranslationZ, points.mTranslationZ)) {
            keySet.add("translationZ");
        }
        if (diff(this.mElevation, points.mElevation)) {
            keySet.add("elevation");
        }
    }

    /* access modifiers changed from: package-private */
    public void different(MotionConstrainedPoint points, boolean[] mask, String[] custom) {
        int c = 0 + 1;
        mask[0] = mask[0] | diff(this.mPosition, points.mPosition);
        int c2 = c + 1;
        mask[c] = mask[c] | diff(this.mX, points.mX);
        int c3 = c2 + 1;
        mask[c2] = mask[c2] | diff(this.mY, points.mY);
        int c4 = c3 + 1;
        mask[c3] = mask[c3] | diff(this.mWidth, points.mWidth);
        int i = c4 + 1;
        mask[c4] = mask[c4] | diff(this.mHeight, points.mHeight);
    }

    /* access modifiers changed from: package-private */
    public void fillStandard(double[] data, int[] toUse) {
        int[] iArr = toUse;
        float[] set = {this.mPosition, this.mX, this.mY, this.mWidth, this.mHeight, this.mAlpha, this.mElevation, this.mRotation, this.mRotationX, this.rotationY, this.mScaleX, this.mScaleY, this.mPivotX, this.mPivotY, this.mTranslationX, this.mTranslationY, this.mTranslationZ, this.mPathRotate};
        int c = 0;
        int i = 0;
        while (true) {
            int[] iArr2 = toUse;
            if (i < iArr2.length) {
                if (iArr2[i] < set.length) {
                    data[c] = (double) set[iArr2[i]];
                    c++;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean hasCustomData(String name) {
        return this.mCustomVariable.containsKey(name);
    }

    /* access modifiers changed from: package-private */
    public int getCustomDataCount(String name) {
        return this.mCustomVariable.get(name).numberOfInterpolatedValues();
    }

    /* access modifiers changed from: package-private */
    public int getCustomData(String name, double[] value, int offset) {
        CustomVariable a = this.mCustomVariable.get(name);
        if (a.numberOfInterpolatedValues() == 1) {
            value[offset] = (double) a.getValueToInterpolate();
            return 1;
        }
        int n = a.numberOfInterpolatedValues();
        float[] f = new float[n];
        a.getValuesToInterpolate(f);
        int i = 0;
        while (i < n) {
            value[offset] = (double) f[i];
            i++;
            offset++;
        }
        return n;
    }

    /* access modifiers changed from: package-private */
    public void setBounds(float x, float y, float w, float h) {
        this.mX = x;
        this.mY = y;
        this.mWidth = w;
        this.mHeight = h;
    }

    public int compareTo(MotionConstrainedPoint o) {
        return Float.compare(this.mPosition, o.mPosition);
    }

    public void applyParameters(MotionWidget view) {
        this.mVisibility = view.getVisibility();
        this.mAlpha = view.getVisibility() != 4 ? 0.0f : view.getAlpha();
        this.mApplyElevation = false;
        this.mRotation = view.getRotationZ();
        this.mRotationX = view.getRotationX();
        this.rotationY = view.getRotationY();
        this.mScaleX = view.getScaleX();
        this.mScaleY = view.getScaleY();
        this.mPivotX = view.getPivotX();
        this.mPivotY = view.getPivotY();
        this.mTranslationX = view.getTranslationX();
        this.mTranslationY = view.getTranslationY();
        this.mTranslationZ = view.getTranslationZ();
        for (String s : view.getCustomAttributeNames()) {
            CustomVariable attr = view.getCustomAttribute(s);
            if (attr != null && attr.isContinuous()) {
                this.mCustomVariable.put(s, attr);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r9, int r10) {
        /*
            r8 = this;
            java.util.Set r0 = r9.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01fd
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r9.get(r1)
            androidx.constraintlayout.core.motion.utils.SplineSet r2 = (androidx.constraintlayout.core.motion.utils.SplineSet) r2
            int r3 = r1.hashCode()
            r4 = 1
            switch(r3) {
                case -1249320806: goto L_0x00a9;
                case -1249320805: goto L_0x009f;
                case -1249320804: goto L_0x0095;
                case -1225497657: goto L_0x0089;
                case -1225497656: goto L_0x007d;
                case -1225497655: goto L_0x0071;
                case -1001078227: goto L_0x0067;
                case -987906986: goto L_0x005d;
                case -987906985: goto L_0x0053;
                case -908189618: goto L_0x0047;
                case -908189617: goto L_0x003a;
                case 92909918: goto L_0x002f;
                case 803192288: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x00b3
        L_0x0024:
            java.lang.String r3 = "pathRotate"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0022
            r3 = 6
            goto L_0x00b4
        L_0x002f:
            java.lang.String r3 = "alpha"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0022
            r3 = 0
            goto L_0x00b4
        L_0x003a:
            java.lang.String r3 = "scaleY"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0022
            r3 = 9
            goto L_0x00b4
        L_0x0047:
            java.lang.String r3 = "scaleX"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0022
            r3 = 8
            goto L_0x00b4
        L_0x0053:
            java.lang.String r3 = "pivotY"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0022
            r3 = 5
            goto L_0x00b4
        L_0x005d:
            java.lang.String r3 = "pivotX"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x00b4
        L_0x0067:
            java.lang.String r3 = "progress"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0022
            r3 = 7
            goto L_0x00b4
        L_0x0071:
            java.lang.String r3 = "translationZ"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0022
            r3 = 12
            goto L_0x00b4
        L_0x007d:
            java.lang.String r3 = "translationY"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0022
            r3 = 11
            goto L_0x00b4
        L_0x0089:
            java.lang.String r3 = "translationX"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0022
            r3 = 10
            goto L_0x00b4
        L_0x0095:
            java.lang.String r3 = "rotationZ"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0022
            r3 = r4
            goto L_0x00b4
        L_0x009f:
            java.lang.String r3 = "rotationY"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0022
            r3 = 3
            goto L_0x00b4
        L_0x00a9:
            java.lang.String r3 = "rotationX"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0022
            r3 = 2
            goto L_0x00b4
        L_0x00b3:
            r3 = -1
        L_0x00b4:
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            switch(r3) {
                case 0: goto L_0x01a9;
                case 1: goto L_0x019a;
                case 2: goto L_0x018b;
                case 3: goto L_0x017b;
                case 4: goto L_0x016b;
                case 5: goto L_0x015b;
                case 6: goto L_0x014b;
                case 7: goto L_0x013b;
                case 8: goto L_0x012b;
                case 9: goto L_0x011b;
                case 10: goto L_0x010a;
                case 11: goto L_0x00f9;
                case 12: goto L_0x00e8;
                default: goto L_0x00ba;
            }
        L_0x00ba:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            java.lang.String r5 = "MotionPaths"
            if (r3 == 0) goto L_0x01e5
            java.lang.String r3 = ","
            java.lang.String[] r3 = r1.split(r3)
            r3 = r3[r4]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r4 = r8.mCustomVariable
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L_0x01e4
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r4 = r8.mCustomVariable
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.core.motion.CustomVariable r4 = (androidx.constraintlayout.core.motion.CustomVariable) r4
            boolean r6 = r2 instanceof androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline
            if (r6 == 0) goto L_0x01b8
            r5 = r2
            androidx.constraintlayout.core.motion.utils.SplineSet$CustomSpline r5 = (androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline) r5
            r5.setPoint((int) r10, (androidx.constraintlayout.core.motion.CustomVariable) r4)
            goto L_0x01e4
        L_0x00e8:
            float r3 = r8.mTranslationZ
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L_0x00f2
            goto L_0x00f4
        L_0x00f2:
            float r6 = r8.mTranslationZ
        L_0x00f4:
            r2.setPoint(r10, r6)
            goto L_0x01fb
        L_0x00f9:
            float r3 = r8.mTranslationY
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L_0x0103
            goto L_0x0105
        L_0x0103:
            float r6 = r8.mTranslationY
        L_0x0105:
            r2.setPoint(r10, r6)
            goto L_0x01fb
        L_0x010a:
            float r3 = r8.mTranslationX
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L_0x0114
            goto L_0x0116
        L_0x0114:
            float r6 = r8.mTranslationX
        L_0x0116:
            r2.setPoint(r10, r6)
            goto L_0x01fb
        L_0x011b:
            float r3 = r8.mScaleY
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L_0x0124
            goto L_0x0126
        L_0x0124:
            float r5 = r8.mScaleY
        L_0x0126:
            r2.setPoint(r10, r5)
            goto L_0x01fb
        L_0x012b:
            float r3 = r8.mScaleX
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            float r5 = r8.mScaleX
        L_0x0136:
            r2.setPoint(r10, r5)
            goto L_0x01fb
        L_0x013b:
            float r3 = r8.mProgress
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L_0x0144
            goto L_0x0146
        L_0x0144:
            float r6 = r8.mProgress
        L_0x0146:
            r2.setPoint(r10, r6)
            goto L_0x01fb
        L_0x014b:
            float r3 = r8.mPathRotate
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L_0x0154
            goto L_0x0156
        L_0x0154:
            float r6 = r8.mPathRotate
        L_0x0156:
            r2.setPoint(r10, r6)
            goto L_0x01fb
        L_0x015b:
            float r3 = r8.mPivotY
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L_0x0164
            goto L_0x0166
        L_0x0164:
            float r6 = r8.mPivotY
        L_0x0166:
            r2.setPoint(r10, r6)
            goto L_0x01fb
        L_0x016b:
            float r3 = r8.mPivotX
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L_0x0174
            goto L_0x0176
        L_0x0174:
            float r6 = r8.mPivotX
        L_0x0176:
            r2.setPoint(r10, r6)
            goto L_0x01fb
        L_0x017b:
            float r3 = r8.rotationY
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L_0x0184
            goto L_0x0186
        L_0x0184:
            float r6 = r8.rotationY
        L_0x0186:
            r2.setPoint(r10, r6)
            goto L_0x01fb
        L_0x018b:
            float r3 = r8.mRotationX
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L_0x0194
            goto L_0x0196
        L_0x0194:
            float r6 = r8.mRotationX
        L_0x0196:
            r2.setPoint(r10, r6)
            goto L_0x01fb
        L_0x019a:
            float r3 = r8.mRotation
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L_0x01a3
            goto L_0x01a5
        L_0x01a3:
            float r6 = r8.mRotation
        L_0x01a5:
            r2.setPoint(r10, r6)
            goto L_0x01fb
        L_0x01a9:
            float r3 = r8.mAlpha
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L_0x01b2
            goto L_0x01b4
        L_0x01b2:
            float r5 = r8.mAlpha
        L_0x01b4:
            r2.setPoint(r10, r5)
            goto L_0x01fb
        L_0x01b8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r7 = " ViewSpline not a CustomSet frame = "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r10)
            java.lang.String r7 = ", value"
            java.lang.StringBuilder r6 = r6.append(r7)
            float r7 = r4.getValueToInterpolate()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.String r6 = r6.toString()
            androidx.constraintlayout.core.motion.utils.Utils.loge(r5, r6)
        L_0x01e4:
            goto L_0x01fb
        L_0x01e5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "UNKNOWN spline "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            androidx.constraintlayout.core.motion.utils.Utils.loge(r5, r3)
        L_0x01fb:
            goto L_0x0008
        L_0x01fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.MotionConstrainedPoint.addValues(java.util.HashMap, int):void");
    }

    public void setState(MotionWidget view) {
        setBounds((float) view.getX(), (float) view.getY(), (float) view.getWidth(), (float) view.getHeight());
        applyParameters(view);
    }

    public void setState(Rect rect, MotionWidget view, int rotation, float prevous) {
        setBounds((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        applyParameters(view);
        this.mPivotX = Float.NaN;
        this.mPivotY = Float.NaN;
        switch (rotation) {
            case 1:
                this.mRotation = prevous - 90.0f;
                return;
            case 2:
                this.mRotation = 90.0f + prevous;
                return;
            default:
                return;
        }
    }
}
