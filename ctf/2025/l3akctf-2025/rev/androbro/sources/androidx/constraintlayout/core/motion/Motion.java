package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.MotionKey;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.core.motion.utils.ViewState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Motion implements TypedValues {
    static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final int INTERPOLATOR_UNDEFINED = -3;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    private static final int SPLINE_STRING = -1;
    private static final String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    private CurveFit mArcSpline;
    private int[] mAttributeInterpolatorCount;
    private String[] mAttributeNames;
    String[] mAttributeTable;
    private HashMap<String, SplineSet> mAttributesMap;
    String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private int mCurveFitType = 0;
    private HashMap<String, KeyCycleOscillator> mCycleMap;
    private MotionPaths mEndMotionPath = new MotionPaths();
    private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
    public String mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private ArrayList<MotionKey> mKeyList = new ArrayList<>();
    private MotionKeyTrigger[] mKeyTriggers;
    private int mMaxDimension = 4;
    private ArrayList<MotionPaths> mMotionPaths = new ArrayList<>();
    float mMotionStagger = Float.NaN;
    private boolean mNoMovement = false;
    private int mPathMotionArc = -1;
    private DifferentialInterpolator mQuantizeMotionInterpolator = null;
    private float mQuantizeMotionPhase = Float.NaN;
    private int mQuantizeMotionSteps = -1;
    Motion mRelativeMotion;
    private CurveFit[] mSpline;
    float mStaggerOffset = 0.0f;
    float mStaggerScale = 1.0f;
    private MotionPaths mStartMotionPath = new MotionPaths();
    private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
    Rect mTempRect = new Rect();
    private HashMap<String, TimeCycleSplineSet> mTimeCycleAttributesMap;
    private int mTransformPivotTarget = -1;
    private MotionWidget mTransformPivotView = null;
    private float[] mValuesBuff = new float[this.mMaxDimension];
    private float[] mVelocity = new float[1];
    MotionWidget mView;

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public void setTransformPivotTarget(int transformPivotTarget) {
        this.mTransformPivotTarget = transformPivotTarget;
        this.mTransformPivotView = null;
    }

    public MotionPaths getKeyFrame(int i) {
        return this.mMotionPaths.get(i);
    }

    public Motion(MotionWidget view) {
        setView(view);
    }

    public float getStartX() {
        return this.mStartMotionPath.mX;
    }

    public float getStartY() {
        return this.mStartMotionPath.mY;
    }

    public float getFinalX() {
        return this.mEndMotionPath.mX;
    }

    public float getFinalY() {
        return this.mEndMotionPath.mY;
    }

    public float getStartWidth() {
        return this.mStartMotionPath.mWidth;
    }

    public float getStartHeight() {
        return this.mStartMotionPath.mHeight;
    }

    public float getFinalWidth() {
        return this.mEndMotionPath.mWidth;
    }

    public float getFinalHeight() {
        return this.mEndMotionPath.mHeight;
    }

    public String getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    public void setupRelative(Motion motionController) {
        this.mRelativeMotion = motionController;
    }

    private void setupRelative() {
        if (this.mRelativeMotion != null) {
            this.mStartMotionPath.setupRelative(this.mRelativeMotion, this.mRelativeMotion.mStartMotionPath);
            this.mEndMotionPath.setupRelative(this.mRelativeMotion, this.mRelativeMotion.mEndMotionPath);
        }
    }

    public float getCenterX() {
        return this.mCurrentCenterX;
    }

    public float getCenterY() {
        return this.mCurrentCenterY;
    }

    public void getCenter(double p, float[] pos, float[] vel) {
        double[] position = new double[4];
        double[] velocity = new double[4];
        this.mSpline[0].getPos(p, position);
        this.mSpline[0].getSlope(p, velocity);
        Arrays.fill(vel, 0.0f);
        this.mStartMotionPath.getCenter(p, this.mInterpolateVariables, position, pos, velocity, vel);
    }

    public void buildPath(float[] points, int pointCount) {
        float position;
        double p;
        Motion motion = this;
        int i = pointCount;
        float f = 1.0f;
        float mils = 1.0f / ((float) (i - 1));
        KeyCycleOscillator keyCycleOscillator = null;
        SplineSet trans_x = motion.mAttributesMap == null ? null : motion.mAttributesMap.get("translationX");
        SplineSet trans_y = motion.mAttributesMap == null ? null : motion.mAttributesMap.get("translationY");
        KeyCycleOscillator osc_x = motion.mCycleMap == null ? null : motion.mCycleMap.get("translationX");
        if (motion.mCycleMap != null) {
            keyCycleOscillator = motion.mCycleMap.get("translationY");
        }
        KeyCycleOscillator osc_y = keyCycleOscillator;
        int i2 = 0;
        while (i2 < i) {
            float position2 = ((float) i2) * mils;
            if (motion.mStaggerScale != f) {
                if (position2 < motion.mStaggerOffset) {
                    position2 = 0.0f;
                }
                if (position2 <= motion.mStaggerOffset || ((double) position2) >= 1.0d) {
                    position = position2;
                } else {
                    position = Math.min((position2 - motion.mStaggerOffset) * motion.mStaggerScale, f);
                }
            } else {
                position = position2;
            }
            double p2 = (double) position;
            Easing easing = motion.mStartMotionPath.mKeyFrameEasing;
            Iterator<MotionPaths> it = motion.mMotionPaths.iterator();
            float start = 0.0f;
            Easing easing2 = easing;
            float end = Float.NaN;
            while (it.hasNext()) {
                MotionPaths frame = it.next();
                if (frame.mKeyFrameEasing != null) {
                    if (frame.mTime < position) {
                        easing2 = frame.mKeyFrameEasing;
                        start = frame.mTime;
                    } else if (Float.isNaN(end)) {
                        end = frame.mTime;
                    }
                }
            }
            if (easing2 != null) {
                if (Float.isNaN(end)) {
                    end = 1.0f;
                }
                double d = p2;
                float offset = (float) easing2.get((double) ((position - start) / (end - start)));
                float f2 = offset;
                float f3 = end;
                p = (double) (((end - start) * offset) + start);
            } else {
                float f4 = end;
                p = p2;
            }
            motion.mSpline[0].getPos(p, motion.mInterpolateData);
            if (motion.mArcSpline != null && motion.mInterpolateData.length > 0) {
                motion.mArcSpline.getPos(p, motion.mInterpolateData);
            }
            double d2 = p;
            Easing easing3 = easing2;
            float position3 = position;
            motion.mStartMotionPath.getCenter(p, motion.mInterpolateVariables, motion.mInterpolateData, points, i2 * 2);
            if (osc_x != null) {
                int i3 = i2 * 2;
                points[i3] = points[i3] + osc_x.get(position3);
            } else if (trans_x != null) {
                int i4 = i2 * 2;
                points[i4] = points[i4] + trans_x.get(position3);
            }
            if (osc_y != null) {
                int i5 = (i2 * 2) + 1;
                points[i5] = points[i5] + osc_y.get(position3);
            } else if (trans_y != null) {
                int i6 = (i2 * 2) + 1;
                points[i6] = points[i6] + trans_y.get(position3);
            }
            i2++;
            f = 1.0f;
            motion = this;
        }
    }

    /* access modifiers changed from: package-private */
    public double[] getPos(double position) {
        this.mSpline[0].getPos(position, this.mInterpolateData);
        if (this.mArcSpline != null && this.mInterpolateData.length > 0) {
            this.mArcSpline.getPos(position, this.mInterpolateData);
        }
        return this.mInterpolateData;
    }

    /* access modifiers changed from: package-private */
    public void buildBounds(float[] bounds, int pointCount) {
        float mils;
        Motion motion = this;
        int i = pointCount;
        float f = 1.0f;
        float mils2 = 1.0f / ((float) (i - 1));
        SplineSet trans_x = motion.mAttributesMap == null ? null : motion.mAttributesMap.get("translationX");
        if (motion.mAttributesMap != null) {
            SplineSet splineSet = motion.mAttributesMap.get("translationY");
        }
        if (motion.mCycleMap != null) {
            KeyCycleOscillator keyCycleOscillator = motion.mCycleMap.get("translationX");
        }
        if (motion.mCycleMap != null) {
            KeyCycleOscillator keyCycleOscillator2 = motion.mCycleMap.get("translationY");
        }
        int i2 = 0;
        while (i2 < i) {
            float position = ((float) i2) * mils2;
            if (motion.mStaggerScale != f) {
                if (position < motion.mStaggerOffset) {
                    position = 0.0f;
                }
                if (position > motion.mStaggerOffset && ((double) position) < 1.0d) {
                    position = Math.min((position - motion.mStaggerOffset) * motion.mStaggerScale, f);
                }
            }
            double p = (double) position;
            Easing easing = motion.mStartMotionPath.mKeyFrameEasing;
            float start = 0.0f;
            float end = Float.NaN;
            Iterator<MotionPaths> it = motion.mMotionPaths.iterator();
            while (it.hasNext()) {
                MotionPaths frame = it.next();
                if (frame.mKeyFrameEasing != null) {
                    if (frame.mTime < position) {
                        Easing easing2 = frame.mKeyFrameEasing;
                        start = frame.mTime;
                        easing = easing2;
                    } else if (Float.isNaN(end)) {
                        end = frame.mTime;
                    }
                }
                int i3 = pointCount;
            }
            if (easing != null) {
                if (Float.isNaN(end)) {
                    end = 1.0f;
                }
                mils = mils2;
                p = (double) (((end - start) * ((float) easing.get((double) ((position - start) / (end - start))))) + start);
            } else {
                mils = mils2;
            }
            motion.mSpline[0].getPos(p, motion.mInterpolateData);
            if (motion.mArcSpline != null && motion.mInterpolateData.length > 0) {
                motion.mArcSpline.getPos(p, motion.mInterpolateData);
            }
            motion.mStartMotionPath.getBounds(motion.mInterpolateVariables, motion.mInterpolateData, bounds, i2 * 2);
            i2++;
            motion = this;
            i = pointCount;
            mils2 = mils;
            trans_x = trans_x;
            f = 1.0f;
        }
    }

    private float getPreCycleDistance() {
        double p;
        float offset;
        int pointCount = 100;
        float[] points = new float[2];
        float mils = 1.0f / ((float) (100 - 1));
        float sum = 0.0f;
        double x = 0.0d;
        double y = 0.0d;
        int i = 0;
        while (i < pointCount) {
            float position = ((float) i) * mils;
            double p2 = (double) position;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            int pointCount2 = pointCount;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float start = 0.0f;
            Easing easing2 = easing;
            float end = Float.NaN;
            while (it.hasNext()) {
                MotionPaths frame = it.next();
                Iterator<MotionPaths> it2 = it;
                if (frame.mKeyFrameEasing != null) {
                    if (frame.mTime < position) {
                        Easing easing3 = frame.mKeyFrameEasing;
                        start = frame.mTime;
                        easing2 = easing3;
                    } else if (Float.isNaN(end)) {
                        end = frame.mTime;
                    }
                }
                it = it2;
            }
            if (easing2 != null) {
                if (Float.isNaN(end)) {
                    end = 1.0f;
                }
                double d = p2;
                offset = end;
                p = (double) (((end - start) * ((float) easing2.get((double) ((position - start) / (end - start))))) + start);
            } else {
                offset = end;
                p = p2;
            }
            this.mSpline[0].getPos(p, this.mInterpolateData);
            float f = offset;
            double d2 = p;
            Easing easing4 = easing2;
            float f2 = position;
            int i2 = i;
            this.mStartMotionPath.getCenter(p, this.mInterpolateVariables, this.mInterpolateData, points, 0);
            if (i2 > 0) {
                sum += (float) Math.hypot(y - ((double) points[1]), x - ((double) points[0]));
            }
            x = (double) points[0];
            y = (double) points[1];
            i = i2 + 1;
            pointCount = pointCount2;
        }
        return sum;
    }

    /* access modifiers changed from: package-private */
    public MotionKeyPosition getPositionKeyframe(int layoutWidth, int layoutHeight, float x, float y) {
        FloatRect start = new FloatRect();
        start.left = this.mStartMotionPath.mX;
        start.top = this.mStartMotionPath.mY;
        start.right = start.left + this.mStartMotionPath.mWidth;
        start.bottom = start.top + this.mStartMotionPath.mHeight;
        FloatRect end = new FloatRect();
        end.left = this.mEndMotionPath.mX;
        end.top = this.mEndMotionPath.mY;
        end.right = end.left + this.mEndMotionPath.mWidth;
        end.bottom = end.top + this.mEndMotionPath.mHeight;
        Iterator<MotionKey> it = this.mKeyList.iterator();
        while (it.hasNext()) {
            MotionKey key = it.next();
            if ((key instanceof MotionKeyPosition) && ((MotionKeyPosition) key).intersects(layoutWidth, layoutHeight, start, end, x, y)) {
                return (MotionKeyPosition) key;
            }
        }
        return null;
    }

    public int buildKeyFrames(float[] keyFrames, int[] mode, int[] pos) {
        if (keyFrames == null) {
            return 0;
        }
        int count = 0;
        double[] time = this.mSpline[0].getTimePoints();
        if (mode != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            while (it.hasNext()) {
                mode[count] = it.next().mMode;
                count++;
            }
            count = 0;
        }
        if (pos != null) {
            Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
            while (it2.hasNext()) {
                pos[count] = (int) (it2.next().mPosition * 100.0f);
                count++;
            }
            count = 0;
        }
        for (int i = 0; i < time.length; i++) {
            this.mSpline[0].getPos(time[i], this.mInterpolateData);
            this.mStartMotionPath.getCenter(time[i], this.mInterpolateVariables, this.mInterpolateData, keyFrames, count);
            count += 2;
        }
        return count / 2;
    }

    /* access modifiers changed from: package-private */
    public int buildKeyBounds(float[] keyBounds, int[] mode) {
        if (keyBounds == null) {
            return 0;
        }
        int count = 0;
        double[] time = this.mSpline[0].getTimePoints();
        if (mode != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            while (it.hasNext()) {
                mode[count] = it.next().mMode;
                count++;
            }
            count = 0;
        }
        for (double pos : time) {
            this.mSpline[0].getPos(pos, this.mInterpolateData);
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, keyBounds, count);
            count += 2;
        }
        return count / 2;
    }

    /* access modifiers changed from: package-private */
    public int getAttributeValues(String attributeType, float[] points, int pointCount) {
        float f = 1.0f / ((float) (pointCount - 1));
        SplineSet spline = this.mAttributesMap.get(attributeType);
        if (spline == null) {
            return -1;
        }
        for (int j = 0; j < points.length; j++) {
            points[j] = spline.get((float) (j / (points.length - 1)));
        }
        return points.length;
    }

    public void buildRect(float p, float[] path, int offset) {
        this.mSpline[0].getPos((double) getAdjustedPosition(p, (float[]) null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, path, offset);
    }

    /* access modifiers changed from: package-private */
    public void buildRectangles(float[] path, int pointCount) {
        float mils = 1.0f / ((float) (pointCount - 1));
        for (int i = 0; i < pointCount; i++) {
            this.mSpline[0].getPos((double) getAdjustedPosition(((float) i) * mils, (float[]) null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, path, i * 8);
        }
    }

    /* access modifiers changed from: package-private */
    public float getKeyFrameParameter(int type, float x, float y) {
        float dx = this.mEndMotionPath.mX - this.mStartMotionPath.mX;
        float dy = this.mEndMotionPath.mY - this.mStartMotionPath.mY;
        float startCenterX = this.mStartMotionPath.mX + (this.mStartMotionPath.mWidth / 2.0f);
        float startCenterY = this.mStartMotionPath.mY + (this.mStartMotionPath.mHeight / 2.0f);
        float hypotenuse = (float) Math.hypot((double) dx, (double) dy);
        if (((double) hypotenuse) < 1.0E-7d) {
            return Float.NaN;
        }
        float vx = x - startCenterX;
        float vy = y - startCenterY;
        if (((float) Math.hypot((double) vx, (double) vy)) == 0.0f) {
            return 0.0f;
        }
        float pathDistance = (vx * dx) + (vy * dy);
        switch (type) {
            case 0:
                return pathDistance / hypotenuse;
            case 1:
                return (float) Math.sqrt((double) ((hypotenuse * hypotenuse) - (pathDistance * pathDistance)));
            case 2:
                return vx / dx;
            case 3:
                return vy / dx;
            case 4:
                return vx / dy;
            case 5:
                return vy / dy;
            default:
                return 0.0f;
        }
    }

    private void insertKey(MotionPaths point) {
        MotionPaths redundant = null;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            MotionPaths p = it.next();
            if (point.mPosition == p.mPosition) {
                redundant = p;
            }
        }
        if (redundant != null) {
            this.mMotionPaths.remove(redundant);
        }
        int pos = Collections.binarySearch(this.mMotionPaths, point);
        if (pos == 0) {
            Utils.loge(TAG, " KeyPath position \"" + point.mPosition + "\" outside of range");
        }
        this.mMotionPaths.add((-pos) - 1, point);
    }

    /* access modifiers changed from: package-private */
    public void addKeys(ArrayList<MotionKey> list) {
        this.mKeyList.addAll(list);
    }

    public void addKey(MotionKey key) {
        this.mKeyList.add(key);
    }

    public void setPathMotionArc(int arc) {
        this.mPathMotionArc = arc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: double[][]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setup(int r30, int r31, float r32, long r33) {
        /*
            r29 = this;
            r0 = r29
            r1 = r33
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r8 = 0
            r29.setupRelative()
            int r9 = r0.mPathMotionArc
            r10 = -1
            if (r9 == r10) goto L_0x0032
            androidx.constraintlayout.core.motion.MotionPaths r9 = r0.mStartMotionPath
            int r9 = r9.mPathMotionArc
            if (r9 != r10) goto L_0x0032
            androidx.constraintlayout.core.motion.MotionPaths r9 = r0.mStartMotionPath
            int r11 = r0.mPathMotionArc
            r9.mPathMotionArc = r11
        L_0x0032:
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r9 = r0.mStartPoint
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r11 = r0.mEndPoint
            r9.different(r11, r5)
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r9 = r0.mKeyList
            if (r9 == 0) goto L_0x00a3
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r9 = r0.mKeyList
            java.util.Iterator r9 = r9.iterator()
        L_0x0043:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x00a3
            java.lang.Object r11 = r9.next()
            androidx.constraintlayout.core.motion.key.MotionKey r11 = (androidx.constraintlayout.core.motion.key.MotionKey) r11
            boolean r12 = r11 instanceof androidx.constraintlayout.core.motion.key.MotionKeyPosition
            if (r12 == 0) goto L_0x0078
            r12 = r11
            androidx.constraintlayout.core.motion.key.MotionKeyPosition r12 = (androidx.constraintlayout.core.motion.key.MotionKeyPosition) r12
            androidx.constraintlayout.core.motion.MotionPaths r15 = new androidx.constraintlayout.core.motion.MotionPaths
            androidx.constraintlayout.core.motion.MotionPaths r14 = r0.mStartMotionPath
            androidx.constraintlayout.core.motion.MotionPaths r13 = r0.mEndMotionPath
            r18 = r13
            r13 = r15
            r17 = r14
            r14 = r30
            r10 = r15
            r15 = r31
            r16 = r12
            r13.<init>(r14, r15, r16, r17, r18)
            r0.insertKey(r10)
            int r10 = r12.mCurveFit
            r13 = -1
            if (r10 == r13) goto L_0x0077
            int r10 = r12.mCurveFit
            r0.mCurveFitType = r10
        L_0x0077:
            goto L_0x00a1
        L_0x0078:
            boolean r10 = r11 instanceof androidx.constraintlayout.core.motion.key.MotionKeyCycle
            if (r10 == 0) goto L_0x0080
            r11.getAttributeNames(r6)
            goto L_0x00a1
        L_0x0080:
            boolean r10 = r11 instanceof androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle
            if (r10 == 0) goto L_0x0088
            r11.getAttributeNames(r4)
            goto L_0x00a1
        L_0x0088:
            boolean r10 = r11 instanceof androidx.constraintlayout.core.motion.key.MotionKeyTrigger
            if (r10 == 0) goto L_0x009b
            if (r8 != 0) goto L_0x0094
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r8 = r10
        L_0x0094:
            r10 = r11
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger r10 = (androidx.constraintlayout.core.motion.key.MotionKeyTrigger) r10
            r8.add(r10)
            goto L_0x00a1
        L_0x009b:
            r11.setInterpolation(r7)
            r11.getAttributeNames(r5)
        L_0x00a1:
            r10 = -1
            goto L_0x0043
        L_0x00a3:
            r9 = 0
            if (r8 == 0) goto L_0x00b0
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger[] r10 = new androidx.constraintlayout.core.motion.key.MotionKeyTrigger[r9]
            java.lang.Object[] r10 = r8.toArray(r10)
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger[] r10 = (androidx.constraintlayout.core.motion.key.MotionKeyTrigger[]) r10
            r0.mKeyTriggers = r10
        L_0x00b0:
            boolean r10 = r5.isEmpty()
            java.lang.String r11 = ","
            java.lang.String r12 = "CUSTOM,"
            r13 = 1
            if (r10 != 0) goto L_0x01b7
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            r0.mAttributesMap = r10
            java.util.Iterator r10 = r5.iterator()
        L_0x00c6:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L_0x014b
            java.lang.Object r14 = r10.next()
            java.lang.String r14 = (java.lang.String) r14
            boolean r15 = r14.startsWith(r12)
            if (r15 == 0) goto L_0x012a
            androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r15 = new androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar
            r15.<init>()
            java.lang.String[] r16 = r14.split(r11)
            r9 = r16[r13]
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r13 = r0.mKeyList
            java.util.Iterator r13 = r13.iterator()
        L_0x00e9:
            boolean r18 = r13.hasNext()
            if (r18 == 0) goto L_0x011f
            java.lang.Object r18 = r13.next()
            r19 = r3
            r3 = r18
            androidx.constraintlayout.core.motion.key.MotionKey r3 = (androidx.constraintlayout.core.motion.key.MotionKey) r3
            r18 = r8
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r8 = r3.mCustom
            if (r8 != 0) goto L_0x0104
            r8 = r18
            r3 = r19
            goto L_0x00e9
        L_0x0104:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r8 = r3.mCustom
            java.lang.Object r8 = r8.get(r9)
            androidx.constraintlayout.core.motion.CustomVariable r8 = (androidx.constraintlayout.core.motion.CustomVariable) r8
            if (r8 == 0) goto L_0x0116
            r20 = r9
            int r9 = r3.mFramePosition
            r15.append(r9, r8)
            goto L_0x0118
        L_0x0116:
            r20 = r9
        L_0x0118:
            r8 = r18
            r3 = r19
            r9 = r20
            goto L_0x00e9
        L_0x011f:
            r19 = r3
            r18 = r8
            r20 = r9
            androidx.constraintlayout.core.motion.utils.SplineSet r3 = androidx.constraintlayout.core.motion.utils.SplineSet.makeCustomSplineSet(r14, r15)
            goto L_0x0132
        L_0x012a:
            r19 = r3
            r18 = r8
            androidx.constraintlayout.core.motion.utils.SplineSet r3 = androidx.constraintlayout.core.motion.utils.SplineSet.makeSpline(r14, r1)
        L_0x0132:
            if (r3 != 0) goto L_0x013b
            r8 = r18
            r3 = r19
            r9 = 0
            r13 = 1
            goto L_0x00c6
        L_0x013b:
            r3.setType(r14)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r8 = r0.mAttributesMap
            r8.put(r14, r3)
            r8 = r18
            r3 = r19
            r9 = 0
            r13 = 1
            goto L_0x00c6
        L_0x014b:
            r19 = r3
            r18 = r8
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r3 = r0.mKeyList
            if (r3 == 0) goto L_0x016f
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r3 = r0.mKeyList
            java.util.Iterator r3 = r3.iterator()
        L_0x0159:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x016f
            java.lang.Object r8 = r3.next()
            androidx.constraintlayout.core.motion.key.MotionKey r8 = (androidx.constraintlayout.core.motion.key.MotionKey) r8
            boolean r9 = r8 instanceof androidx.constraintlayout.core.motion.key.MotionKeyAttributes
            if (r9 == 0) goto L_0x016e
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r9 = r0.mAttributesMap
            r8.addValues(r9)
        L_0x016e:
            goto L_0x0159
        L_0x016f:
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r3 = r0.mStartPoint
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r8 = r0.mAttributesMap
            r9 = 0
            r3.addValues(r8, r9)
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r3 = r0.mEndPoint
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r8 = r0.mAttributesMap
            r9 = 100
            r3.addValues(r8, r9)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r3 = r0.mAttributesMap
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x018a:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x01bb
            java.lang.Object r8 = r3.next()
            java.lang.String r8 = (java.lang.String) r8
            r9 = 0
            boolean r10 = r7.containsKey(r8)
            if (r10 == 0) goto L_0x01a9
            java.lang.Object r10 = r7.get(r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L_0x01a9
            int r9 = r10.intValue()
        L_0x01a9:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r10 = r0.mAttributesMap
            java.lang.Object r10 = r10.get(r8)
            androidx.constraintlayout.core.motion.utils.SplineSet r10 = (androidx.constraintlayout.core.motion.utils.SplineSet) r10
            if (r10 == 0) goto L_0x01b6
            r10.setup(r9)
        L_0x01b6:
            goto L_0x018a
        L_0x01b7:
            r19 = r3
            r18 = r8
        L_0x01bb:
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x02a4
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> r3 = r0.mTimeCycleAttributesMap
            if (r3 != 0) goto L_0x01cc
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r0.mTimeCycleAttributesMap = r3
        L_0x01cc:
            java.util.Iterator r3 = r4.iterator()
        L_0x01d0:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x024c
            java.lang.Object r8 = r3.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> r9 = r0.mTimeCycleAttributesMap
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto L_0x01e5
            goto L_0x01d0
        L_0x01e5:
            r9 = 0
            boolean r10 = r8.startsWith(r12)
            if (r10 == 0) goto L_0x0235
            androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r10 = new androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar
            r10.<init>()
            java.lang.String[] r13 = r8.split(r11)
            r14 = 1
            r13 = r13[r14]
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r14 = r0.mKeyList
            java.util.Iterator r14 = r14.iterator()
        L_0x01fe:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x022c
            java.lang.Object r15 = r14.next()
            androidx.constraintlayout.core.motion.key.MotionKey r15 = (androidx.constraintlayout.core.motion.key.MotionKey) r15
            r20 = r3
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r3 = r15.mCustom
            if (r3 != 0) goto L_0x0213
            r3 = r20
            goto L_0x01fe
        L_0x0213:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r3 = r15.mCustom
            java.lang.Object r3 = r3.get(r13)
            androidx.constraintlayout.core.motion.CustomVariable r3 = (androidx.constraintlayout.core.motion.CustomVariable) r3
            if (r3 == 0) goto L_0x0225
            r21 = r4
            int r4 = r15.mFramePosition
            r10.append(r4, r3)
            goto L_0x0227
        L_0x0225:
            r21 = r4
        L_0x0227:
            r3 = r20
            r4 = r21
            goto L_0x01fe
        L_0x022c:
            r20 = r3
            r21 = r4
            androidx.constraintlayout.core.motion.utils.SplineSet r3 = androidx.constraintlayout.core.motion.utils.SplineSet.makeCustomSplineSet(r8, r10)
            goto L_0x023d
        L_0x0235:
            r20 = r3
            r21 = r4
            androidx.constraintlayout.core.motion.utils.SplineSet r3 = androidx.constraintlayout.core.motion.utils.SplineSet.makeSpline(r8, r1)
        L_0x023d:
            if (r3 != 0) goto L_0x0244
            r3 = r20
            r4 = r21
            goto L_0x01d0
        L_0x0244:
            r3.setType(r8)
            r3 = r20
            r4 = r21
            goto L_0x01d0
        L_0x024c:
            r21 = r4
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r3 = r0.mKeyList
            if (r3 == 0) goto L_0x0271
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r3 = r0.mKeyList
            java.util.Iterator r3 = r3.iterator()
        L_0x0258:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0271
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.core.motion.key.MotionKey r4 = (androidx.constraintlayout.core.motion.key.MotionKey) r4
            boolean r8 = r4 instanceof androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle
            if (r8 == 0) goto L_0x0270
            r8 = r4
            androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle r8 = (androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle) r8
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> r9 = r0.mTimeCycleAttributesMap
            r8.addTimeValues(r9)
        L_0x0270:
            goto L_0x0258
        L_0x0271:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> r3 = r0.mTimeCycleAttributesMap
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x027b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02a6
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r8 = 0
            boolean r9 = r7.containsKey(r4)
            if (r9 == 0) goto L_0x0298
            java.lang.Object r9 = r7.get(r4)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
        L_0x0298:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> r9 = r0.mTimeCycleAttributesMap
            java.lang.Object r9 = r9.get(r4)
            androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet r9 = (androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet) r9
            r9.setup(r8)
            goto L_0x027b
        L_0x02a4:
            r21 = r4
        L_0x02a6:
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r3 = r0.mMotionPaths
            int r3 = r3.size()
            r4 = 2
            int r3 = r3 + r4
            androidx.constraintlayout.core.motion.MotionPaths[] r3 = new androidx.constraintlayout.core.motion.MotionPaths[r3]
            r8 = 1
            androidx.constraintlayout.core.motion.MotionPaths r9 = r0.mStartMotionPath
            r10 = 0
            r3[r10] = r9
            int r9 = r3.length
            r10 = 1
            int r9 = r9 - r10
            androidx.constraintlayout.core.motion.MotionPaths r10 = r0.mEndMotionPath
            r3[r9] = r10
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r9 = r0.mMotionPaths
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x02ce
            int r9 = r0.mCurveFitType
            int r10 = androidx.constraintlayout.core.motion.key.MotionKey.UNSET
            if (r9 != r10) goto L_0x02ce
            r9 = 0
            r0.mCurveFitType = r9
        L_0x02ce:
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r9 = r0.mMotionPaths
            java.util.Iterator r9 = r9.iterator()
        L_0x02d4:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x02e6
            java.lang.Object r10 = r9.next()
            androidx.constraintlayout.core.motion.MotionPaths r10 = (androidx.constraintlayout.core.motion.MotionPaths) r10
            int r11 = r8 + 1
            r3[r8] = r10
            r8 = r11
            goto L_0x02d4
        L_0x02e6:
            r9 = 18
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            androidx.constraintlayout.core.motion.MotionPaths r11 = r0.mEndMotionPath
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r11 = r11.mCustomAttributes
            java.util.Set r11 = r11.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x02f9:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x032a
            java.lang.Object r13 = r11.next()
            java.lang.String r13 = (java.lang.String) r13
            androidx.constraintlayout.core.motion.MotionPaths r14 = r0.mStartMotionPath
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r14 = r14.mCustomAttributes
            boolean r14 = r14.containsKey(r13)
            if (r14 == 0) goto L_0x0329
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.StringBuilder r14 = r14.append(r12)
            java.lang.StringBuilder r14 = r14.append(r13)
            java.lang.String r14 = r14.toString()
            boolean r14 = r5.contains(r14)
            if (r14 != 0) goto L_0x0329
            r10.add(r13)
        L_0x0329:
            goto L_0x02f9
        L_0x032a:
            r11 = 0
            java.lang.String[] r12 = new java.lang.String[r11]
            java.lang.Object[] r11 = r10.toArray(r12)
            java.lang.String[] r11 = (java.lang.String[]) r11
            r0.mAttributeNames = r11
            java.lang.String[] r11 = r0.mAttributeNames
            int r11 = r11.length
            int[] r11 = new int[r11]
            r0.mAttributeInterpolatorCount = r11
            r11 = 0
        L_0x033d:
            java.lang.String[] r12 = r0.mAttributeNames
            int r12 = r12.length
            if (r11 >= r12) goto L_0x0378
            java.lang.String[] r12 = r0.mAttributeNames
            r12 = r12[r11]
            int[] r13 = r0.mAttributeInterpolatorCount
            r14 = 0
            r13[r11] = r14
            r13 = 0
        L_0x034c:
            int r14 = r3.length
            if (r13 >= r14) goto L_0x0375
            r14 = r3[r13]
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r14 = r14.mCustomAttributes
            boolean r14 = r14.containsKey(r12)
            if (r14 == 0) goto L_0x0372
            r14 = r3[r13]
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r14 = r14.mCustomAttributes
            java.lang.Object r14 = r14.get(r12)
            androidx.constraintlayout.core.motion.CustomVariable r14 = (androidx.constraintlayout.core.motion.CustomVariable) r14
            if (r14 == 0) goto L_0x0372
            int[] r15 = r0.mAttributeInterpolatorCount
            r20 = r15[r11]
            int r22 = r14.numberOfInterpolatedValues()
            int r20 = r20 + r22
            r15[r11] = r20
            goto L_0x0375
        L_0x0372:
            int r13 = r13 + 1
            goto L_0x034c
        L_0x0375:
            int r11 = r11 + 1
            goto L_0x033d
        L_0x0378:
            r11 = 0
            r12 = r3[r11]
            int r11 = r12.mPathMotionArc
            r12 = -1
            if (r11 == r12) goto L_0x0382
            r11 = 1
            goto L_0x0383
        L_0x0382:
            r11 = 0
        L_0x0383:
            java.lang.String[] r12 = r0.mAttributeNames
            int r12 = r12.length
            int r12 = r12 + r9
            boolean[] r12 = new boolean[r12]
            r13 = 1
        L_0x038a:
            int r14 = r3.length
            if (r13 >= r14) goto L_0x039c
            r14 = r3[r13]
            int r15 = r13 + -1
            r15 = r3[r15]
            java.lang.String[] r4 = r0.mAttributeNames
            r14.different(r15, r12, r4, r11)
            int r13 = r13 + 1
            r4 = 2
            goto L_0x038a
        L_0x039c:
            r4 = 0
            r8 = 1
        L_0x039e:
            int r13 = r12.length
            if (r8 >= r13) goto L_0x03aa
            boolean r13 = r12[r8]
            if (r13 == 0) goto L_0x03a7
            int r4 = r4 + 1
        L_0x03a7:
            int r8 = r8 + 1
            goto L_0x039e
        L_0x03aa:
            int[] r8 = new int[r4]
            r0.mInterpolateVariables = r8
            r8 = 2
            int r13 = java.lang.Math.max(r8, r4)
            double[] r8 = new double[r13]
            r0.mInterpolateData = r8
            double[] r8 = new double[r13]
            r0.mInterpolateVelocity = r8
            r4 = 0
            r8 = 1
        L_0x03bd:
            int r14 = r12.length
            if (r8 >= r14) goto L_0x03ce
            boolean r14 = r12[r8]
            if (r14 == 0) goto L_0x03cb
            int[] r14 = r0.mInterpolateVariables
            int r15 = r4 + 1
            r14[r4] = r8
            r4 = r15
        L_0x03cb:
            int r8 = r8 + 1
            goto L_0x03bd
        L_0x03ce:
            int r8 = r3.length
            int[] r14 = r0.mInterpolateVariables
            int r14 = r14.length
            r15 = 2
            int[] r1 = new int[r15]
            r2 = 1
            r1[r2] = r14
            r2 = 0
            r1[r2] = r8
            java.lang.Class r2 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r2, r1)
            double[][] r1 = (double[][]) r1
            int r2 = r3.length
            double[] r2 = new double[r2]
            r8 = 0
        L_0x03e7:
            int r14 = r3.length
            if (r8 >= r14) goto L_0x0401
            r14 = r3[r8]
            r15 = r1[r8]
            r22 = r4
            int[] r4 = r0.mInterpolateVariables
            r14.fillStandard(r15, r4)
            r4 = r3[r8]
            float r4 = r4.mTime
            double r14 = (double) r4
            r2[r8] = r14
            int r8 = r8 + 1
            r4 = r22
            goto L_0x03e7
        L_0x0401:
            r22 = r4
            r4 = 0
        L_0x0404:
            int[] r8 = r0.mInterpolateVariables
            int r8 = r8.length
            if (r4 >= r8) goto L_0x0465
            int[] r8 = r0.mInterpolateVariables
            r8 = r8[r4]
            java.lang.String[] r14 = androidx.constraintlayout.core.motion.MotionPaths.sNames
            int r14 = r14.length
            if (r8 >= r14) goto L_0x0458
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String[] r15 = androidx.constraintlayout.core.motion.MotionPaths.sNames
            r23 = r5
            int[] r5 = r0.mInterpolateVariables
            r5 = r5[r4]
            r5 = r15[r5]
            java.lang.StringBuilder r5 = r14.append(r5)
            java.lang.String r14 = " ["
            java.lang.StringBuilder r5 = r5.append(r14)
            java.lang.String r5 = r5.toString()
            r14 = 0
        L_0x0430:
            int r15 = r3.length
            if (r14 >= r15) goto L_0x0453
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.StringBuilder r15 = r15.append(r5)
            r24 = r1[r14]
            r25 = r7
            r26 = r8
            r7 = r24[r4]
            java.lang.StringBuilder r7 = r15.append(r7)
            java.lang.String r5 = r7.toString()
            int r14 = r14 + 1
            r7 = r25
            r8 = r26
            goto L_0x0430
        L_0x0453:
            r25 = r7
            r26 = r8
            goto L_0x045e
        L_0x0458:
            r23 = r5
            r25 = r7
            r26 = r8
        L_0x045e:
            int r4 = r4 + 1
            r5 = r23
            r7 = r25
            goto L_0x0404
        L_0x0465:
            r23 = r5
            r25 = r7
            java.lang.String[] r4 = r0.mAttributeNames
            int r4 = r4.length
            r5 = 1
            int r4 = r4 + r5
            androidx.constraintlayout.core.motion.utils.CurveFit[] r4 = new androidx.constraintlayout.core.motion.utils.CurveFit[r4]
            r0.mSpline = r4
            r4 = 0
        L_0x0473:
            java.lang.String[] r5 = r0.mAttributeNames
            int r5 = r5.length
            if (r4 >= r5) goto L_0x04fc
            r5 = 0
            r7 = 0
            r8 = 0
            java.lang.String[] r14 = r0.mAttributeNames
            r14 = r14[r4]
            r15 = 0
        L_0x0480:
            r24 = r9
            int r9 = r3.length
            if (r15 >= r9) goto L_0x04d7
            r9 = r3[r15]
            boolean r9 = r9.hasCustomData(r14)
            if (r9 == 0) goto L_0x04ca
            if (r7 != 0) goto L_0x04b4
            int r9 = r3.length
            double[] r8 = new double[r9]
            int r9 = r3.length
            r26 = r8
            r8 = r3[r15]
            int r8 = r8.getCustomDataCount(r14)
            r27 = r10
            r28 = r11
            r10 = 2
            int[] r11 = new int[r10]
            r10 = 1
            r11[r10] = r8
            r8 = 0
            r11[r8] = r9
            java.lang.Class r8 = java.lang.Double.TYPE
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r8, r11)
            r7 = r8
            double[][] r7 = (double[][]) r7
            r8 = r26
            goto L_0x04b8
        L_0x04b4:
            r27 = r10
            r28 = r11
        L_0x04b8:
            r9 = r3[r15]
            float r9 = r9.mTime
            double r9 = (double) r9
            r8[r5] = r9
            r9 = r3[r15]
            r10 = r7[r5]
            r11 = 0
            r9.getCustomData(r14, r10, r11)
            int r5 = r5 + 1
            goto L_0x04ce
        L_0x04ca:
            r27 = r10
            r28 = r11
        L_0x04ce:
            int r15 = r15 + 1
            r9 = r24
            r10 = r27
            r11 = r28
            goto L_0x0480
        L_0x04d7:
            r27 = r10
            r28 = r11
            double[] r8 = java.util.Arrays.copyOf(r8, r5)
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r7, r5)
            r7 = r9
            double[][] r7 = (double[][]) r7
            androidx.constraintlayout.core.motion.utils.CurveFit[] r9 = r0.mSpline
            int r10 = r4 + 1
            int r11 = r0.mCurveFitType
            androidx.constraintlayout.core.motion.utils.CurveFit r11 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r11, r8, r7)
            r9[r10] = r11
            int r4 = r4 + 1
            r9 = r24
            r10 = r27
            r11 = r28
            goto L_0x0473
        L_0x04fc:
            r24 = r9
            r27 = r10
            r28 = r11
            androidx.constraintlayout.core.motion.utils.CurveFit[] r4 = r0.mSpline
            int r5 = r0.mCurveFitType
            androidx.constraintlayout.core.motion.utils.CurveFit r5 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r5, r2, r1)
            r7 = 0
            r4[r7] = r5
            r4 = r3[r7]
            int r4 = r4.mPathMotionArc
            r5 = -1
            if (r4 == r5) goto L_0x0558
            int r4 = r3.length
            int[] r5 = new int[r4]
            double[] r7 = new double[r4]
            r8 = 2
            int[] r9 = new int[r8]
            r10 = 1
            r9[r10] = r8
            r8 = 0
            r9[r8] = r4
            java.lang.Class r8 = java.lang.Double.TYPE
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r8, r9)
            double[][] r8 = (double[][]) r8
            r9 = 0
        L_0x052b:
            if (r9 >= r4) goto L_0x0552
            r10 = r3[r9]
            int r10 = r10.mPathMotionArc
            r5[r9] = r10
            r10 = r3[r9]
            float r10 = r10.mTime
            double r10 = (double) r10
            r7[r9] = r10
            r10 = r8[r9]
            r11 = r3[r9]
            float r11 = r11.mX
            double r14 = (double) r11
            r11 = 0
            r10[r11] = r14
            r10 = r8[r9]
            r14 = r3[r9]
            float r14 = r14.mY
            double r14 = (double) r14
            r16 = 1
            r10[r16] = r14
            int r9 = r9 + 1
            goto L_0x052b
        L_0x0552:
            androidx.constraintlayout.core.motion.utils.CurveFit r9 = androidx.constraintlayout.core.motion.utils.CurveFit.getArc(r5, r7, r8)
            r0.mArcSpline = r9
        L_0x0558:
            r4 = 2143289344(0x7fc00000, float:NaN)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r0.mCycleMap = r5
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r5 = r0.mKeyList
            if (r5 == 0) goto L_0x05ce
            java.util.Iterator r5 = r6.iterator()
        L_0x0569:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0595
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r8 = androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.makeWidgetCycle(r7)
            if (r8 != 0) goto L_0x057c
            goto L_0x0569
        L_0x057c:
            boolean r9 = r8.variesByPath()
            if (r9 == 0) goto L_0x058c
            boolean r9 = java.lang.Float.isNaN(r4)
            if (r9 == 0) goto L_0x058c
            float r4 = r29.getPreCycleDistance()
        L_0x058c:
            r8.setType(r7)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r9 = r0.mCycleMap
            r9.put(r7, r8)
            goto L_0x0569
        L_0x0595:
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r5 = r0.mKeyList
            java.util.Iterator r5 = r5.iterator()
        L_0x059b:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x05b4
            java.lang.Object r7 = r5.next()
            androidx.constraintlayout.core.motion.key.MotionKey r7 = (androidx.constraintlayout.core.motion.key.MotionKey) r7
            boolean r8 = r7 instanceof androidx.constraintlayout.core.motion.key.MotionKeyCycle
            if (r8 == 0) goto L_0x05b3
            r8 = r7
            androidx.constraintlayout.core.motion.key.MotionKeyCycle r8 = (androidx.constraintlayout.core.motion.key.MotionKeyCycle) r8
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r9 = r0.mCycleMap
            r8.addCycleValues(r9)
        L_0x05b3:
            goto L_0x059b
        L_0x05b4:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r5 = r0.mCycleMap
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        L_0x05be:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x05ce
            java.lang.Object r7 = r5.next()
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r7 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r7
            r7.setup(r4)
            goto L_0x05be
        L_0x05ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.Motion.setup(int, int, float, long):void");
    }

    public String toString() {
        return " start: x: " + this.mStartMotionPath.mX + " y: " + this.mStartMotionPath.mY + " end: x: " + this.mEndMotionPath.mX + " y: " + this.mEndMotionPath.mY;
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds((float) this.mView.getX(), (float) this.mView.getY(), (float) this.mView.getWidth(), (float) this.mView.getHeight());
    }

    public void setView(MotionWidget view) {
        this.mView = view;
    }

    public MotionWidget getView() {
        return this.mView;
    }

    public void setStart(MotionWidget mw) {
        this.mStartMotionPath.mTime = 0.0f;
        this.mStartMotionPath.mPosition = 0.0f;
        this.mStartMotionPath.setBounds((float) mw.getX(), (float) mw.getY(), (float) mw.getWidth(), (float) mw.getHeight());
        this.mStartMotionPath.applyParameters(mw);
        this.mStartPoint.setState(mw);
        TypedBundle p = mw.getWidgetFrame().getMotionProperties();
        if (p != null) {
            p.applyDelta((TypedValues) this);
        }
    }

    public void setEnd(MotionWidget mw) {
        this.mEndMotionPath.mTime = 1.0f;
        this.mEndMotionPath.mPosition = 1.0f;
        readView(this.mEndMotionPath);
        this.mEndMotionPath.setBounds((float) mw.getLeft(), (float) mw.getTop(), (float) mw.getWidth(), (float) mw.getHeight());
        this.mEndMotionPath.applyParameters(mw);
        this.mEndPoint.setState(mw);
    }

    public void setStartState(ViewState rect, MotionWidget v, int rotation, int preWidth, int preHeight) {
        this.mStartMotionPath.mTime = 0.0f;
        this.mStartMotionPath.mPosition = 0.0f;
        Rect r = new Rect();
        switch (rotation) {
            case 1:
                int cx = rect.left + rect.right;
                r.left = ((rect.top + rect.bottom) - rect.width()) / 2;
                r.top = preWidth - ((rect.height() + cx) / 2);
                r.right = r.left + rect.width();
                r.bottom = r.top + rect.height();
                break;
            case 2:
                int cx2 = rect.left + rect.right;
                r.left = preHeight - ((rect.width() + (rect.top + rect.bottom)) / 2);
                r.top = (cx2 - rect.height()) / 2;
                r.right = r.left + rect.width();
                r.bottom = r.top + rect.height();
                break;
        }
        this.mStartMotionPath.setBounds((float) r.left, (float) r.top, (float) r.width(), (float) r.height());
        this.mStartPoint.setState(r, v, rotation, rect.rotation);
    }

    /* access modifiers changed from: package-private */
    public void rotate(Rect rect, Rect out, int rotation, int preHeight, int preWidth) {
        switch (rotation) {
            case 1:
                int cx = rect.left + rect.right;
                out.left = ((rect.top + rect.bottom) - rect.width()) / 2;
                out.top = preWidth - ((rect.height() + cx) / 2);
                out.right = out.left + rect.width();
                out.bottom = out.top + rect.height();
                return;
            case 2:
                int cx2 = rect.left + rect.right;
                out.left = preHeight - ((rect.width() + (rect.top + rect.bottom)) / 2);
                out.top = (cx2 - rect.height()) / 2;
                out.right = out.left + rect.width();
                out.bottom = out.top + rect.height();
                return;
            case 3:
                int cx3 = rect.left + rect.right;
                int i = rect.top + rect.bottom;
                out.left = ((rect.height() / 2) + rect.top) - (cx3 / 2);
                out.top = preWidth - ((rect.height() + cx3) / 2);
                out.right = out.left + rect.width();
                out.bottom = out.top + rect.height();
                return;
            case 4:
                int cx4 = rect.left + rect.right;
                out.left = preHeight - ((rect.width() + (rect.bottom + rect.top)) / 2);
                out.top = (cx4 - rect.height()) / 2;
                out.right = out.left + rect.width();
                out.bottom = out.top + rect.height();
                return;
            default:
                return;
        }
    }

    private static DifferentialInterpolator getInterpolator(int type, String interpolatorString, int id) {
        switch (type) {
            case -1:
                final Easing easing = Easing.getInterpolator(interpolatorString);
                return new DifferentialInterpolator() {
                    float mX;

                    public float getInterpolation(float x) {
                        this.mX = x;
                        return (float) Easing.this.get((double) x);
                    }

                    public float getVelocity() {
                        return (float) Easing.this.getDiff((double) this.mX);
                    }
                };
            default:
                return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void setBothStates(MotionWidget v) {
        this.mStartMotionPath.mTime = 0.0f;
        this.mStartMotionPath.mPosition = 0.0f;
        this.mNoMovement = true;
        this.mStartMotionPath.setBounds((float) v.getX(), (float) v.getY(), (float) v.getWidth(), (float) v.getHeight());
        this.mEndMotionPath.setBounds((float) v.getX(), (float) v.getY(), (float) v.getWidth(), (float) v.getHeight());
        this.mStartPoint.setState(v);
        this.mEndPoint.setState(v);
    }

    private float getAdjustedPosition(float position, float[] velocity) {
        if (velocity != null) {
            velocity[0] = 1.0f;
        } else if (((double) this.mStaggerScale) != 1.0d) {
            if (position < this.mStaggerOffset) {
                position = 0.0f;
            }
            if (position > this.mStaggerOffset && ((double) position) < 1.0d) {
                position = Math.min((position - this.mStaggerOffset) * this.mStaggerScale, 1.0f);
            }
        }
        float adjusted = position;
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        float start = 0.0f;
        float end = Float.NaN;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            MotionPaths frame = it.next();
            if (frame.mKeyFrameEasing != null) {
                if (frame.mTime < position) {
                    easing = frame.mKeyFrameEasing;
                    start = frame.mTime;
                } else if (Float.isNaN(end)) {
                    end = frame.mTime;
                }
            }
        }
        if (easing != null) {
            if (Float.isNaN(end)) {
                end = 1.0f;
            }
            float offset = (position - start) / (end - start);
            adjusted = ((end - start) * ((float) easing.get((double) offset))) + start;
            if (velocity != null) {
                velocity[0] = (float) easing.getDiff((double) offset);
            }
        }
        return adjusted;
    }

    /* access modifiers changed from: package-private */
    public void endTrigger(boolean start) {
    }

    public boolean interpolate(MotionWidget child, float globalPosition, long time, KeyCache keyCache) {
        float position;
        float section;
        MotionWidget motionWidget = child;
        float position2 = getAdjustedPosition(globalPosition, (float[]) null);
        if (this.mQuantizeMotionSteps != -1) {
            float f = position2;
            float steps = 1.0f / ((float) this.mQuantizeMotionSteps);
            float jump = ((float) Math.floor((double) (position2 / steps))) * steps;
            float section2 = (position2 % steps) / steps;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                section2 = (this.mQuantizeMotionPhase + section2) % 1.0f;
            }
            if (this.mQuantizeMotionInterpolator != null) {
                section = this.mQuantizeMotionInterpolator.getInterpolation(section2);
            } else {
                section = ((double) section2) > 0.5d ? 1.0f : 0.0f;
            }
            position = (section * steps) + jump;
        } else {
            position = position2;
        }
        if (this.mAttributesMap != null) {
            for (SplineSet aSpline : this.mAttributesMap.values()) {
                aSpline.setProperty(motionWidget, position);
            }
        }
        if (this.mSpline != null) {
            this.mSpline[0].getPos((double) position, this.mInterpolateData);
            this.mSpline[0].getSlope((double) position, this.mInterpolateVelocity);
            if (this.mArcSpline != null && this.mInterpolateData.length > 0) {
                this.mArcSpline.getPos((double) position, this.mInterpolateData);
                this.mArcSpline.getSlope((double) position, this.mInterpolateVelocity);
            }
            if (!this.mNoMovement) {
                this.mStartMotionPath.setView(position, child, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, (double[]) null);
            }
            if (this.mTransformPivotTarget != -1) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = child.getParent().findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float cy = ((float) (this.mTransformPivotView.getTop() + this.mTransformPivotView.getBottom())) / 2.0f;
                    float cx = ((float) (this.mTransformPivotView.getLeft() + this.mTransformPivotView.getRight())) / 2.0f;
                    if (child.getRight() - child.getLeft() > 0 && child.getBottom() - child.getTop() > 0) {
                        motionWidget.setPivotX(cx - ((float) child.getLeft()));
                        motionWidget.setPivotY(cy - ((float) child.getTop()));
                    }
                }
            }
            for (int i = 1; i < this.mSpline.length; i++) {
                this.mSpline[i].getPos((double) position, this.mValuesBuff);
                this.mStartMotionPath.mCustomAttributes.get(this.mAttributeNames[i - 1]).setInterpolatedValue(motionWidget, this.mValuesBuff);
            }
            if (this.mStartPoint.mVisibilityMode == 0) {
                if (position <= 0.0f) {
                    motionWidget.setVisibility(this.mStartPoint.mVisibility);
                } else if (position >= 1.0f) {
                    motionWidget.setVisibility(this.mEndPoint.mVisibility);
                } else if (this.mEndPoint.mVisibility != this.mStartPoint.mVisibility) {
                    motionWidget.setVisibility(4);
                }
            }
            if (this.mKeyTriggers != null) {
                for (MotionKeyTrigger conditionallyFire : this.mKeyTriggers) {
                    conditionallyFire.conditionallyFire(position, motionWidget);
                }
            }
        } else {
            float float_l = this.mStartMotionPath.mX + ((this.mEndMotionPath.mX - this.mStartMotionPath.mX) * position);
            float float_t = this.mStartMotionPath.mY + ((this.mEndMotionPath.mY - this.mStartMotionPath.mY) * position);
            int l = (int) (float_l + 0.5f);
            int t = (int) (float_t + 0.5f);
            int r = (int) (float_l + 0.5f + this.mStartMotionPath.mWidth + ((this.mEndMotionPath.mWidth - this.mStartMotionPath.mWidth) * position));
            int b = (int) (0.5f + float_t + this.mStartMotionPath.mHeight + ((this.mEndMotionPath.mHeight - this.mStartMotionPath.mHeight) * position));
            int i2 = r - l;
            int i3 = b - t;
            motionWidget.layout(l, t, r, b);
        }
        if (this.mCycleMap != null) {
            for (KeyCycleOscillator osc : this.mCycleMap.values()) {
                if (osc instanceof KeyCycleOscillator.PathRotateSet) {
                    ((KeyCycleOscillator.PathRotateSet) osc).setPathRotate(child, position, this.mInterpolateVelocity[0], this.mInterpolateVelocity[1]);
                } else {
                    osc.setProperty(motionWidget, position);
                }
            }
        }
        return false;
    }

    public void getDpDt(float position, float locationX, float locationY, float[] mAnchorDpDt) {
        float f = position;
        float position2 = getAdjustedPosition(position, this.mVelocity);
        if (this.mSpline != null) {
            this.mSpline[0].getSlope((double) position2, this.mInterpolateVelocity);
            this.mSpline[0].getPos((double) position2, this.mInterpolateData);
            float v = this.mVelocity[0];
            for (int i = 0; i < this.mInterpolateVelocity.length; i++) {
                double[] dArr = this.mInterpolateVelocity;
                dArr[i] = dArr[i] * ((double) v);
            }
            if (this.mArcSpline == null) {
                this.mStartMotionPath.setDpDt(locationX, locationY, mAnchorDpDt, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            } else if (this.mInterpolateData.length > 0) {
                this.mArcSpline.getPos((double) position2, this.mInterpolateData);
                this.mArcSpline.getSlope((double) position2, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(locationX, locationY, mAnchorDpDt, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
        } else {
            float dleft = this.mEndMotionPath.mX - this.mStartMotionPath.mX;
            float dTop = this.mEndMotionPath.mY - this.mStartMotionPath.mY;
            float dWidth = this.mEndMotionPath.mWidth - this.mStartMotionPath.mWidth;
            float dHeight = this.mEndMotionPath.mHeight - this.mStartMotionPath.mHeight;
            mAnchorDpDt[0] = ((1.0f - locationX) * dleft) + ((dleft + dWidth) * locationX);
            mAnchorDpDt[1] = ((1.0f - locationY) * dTop) + ((dTop + dHeight) * locationY);
        }
    }

    /* access modifiers changed from: package-private */
    public void getPostLayoutDvDp(float position, int width, int height, float locationX, float locationY, float[] mAnchorDpDt) {
        VelocityMatrix vmat;
        float position2 = getAdjustedPosition(position, this.mVelocity);
        KeyCycleOscillator keyCycleOscillator = null;
        SplineSet trans_x = this.mAttributesMap == null ? null : this.mAttributesMap.get("translationX");
        SplineSet trans_y = this.mAttributesMap == null ? null : this.mAttributesMap.get("translationY");
        SplineSet rotation = this.mAttributesMap == null ? null : this.mAttributesMap.get("rotationZ");
        SplineSet scale_x = this.mAttributesMap == null ? null : this.mAttributesMap.get("scaleX");
        SplineSet scale_y = this.mAttributesMap == null ? null : this.mAttributesMap.get("scaleY");
        KeyCycleOscillator osc_x = this.mCycleMap == null ? null : this.mCycleMap.get("translationX");
        KeyCycleOscillator osc_y = this.mCycleMap == null ? null : this.mCycleMap.get("translationY");
        KeyCycleOscillator osc_r = this.mCycleMap == null ? null : this.mCycleMap.get("rotationZ");
        KeyCycleOscillator osc_sx = this.mCycleMap == null ? null : this.mCycleMap.get("scaleX");
        if (this.mCycleMap != null) {
            keyCycleOscillator = this.mCycleMap.get("scaleY");
        }
        KeyCycleOscillator osc_sy = keyCycleOscillator;
        VelocityMatrix vmat2 = new VelocityMatrix();
        vmat2.clear();
        vmat2.setRotationVelocity(rotation, position2);
        vmat2.setTranslationVelocity(trans_x, trans_y, position2);
        vmat2.setScaleVelocity(scale_x, scale_y, position2);
        vmat2.setRotationVelocity(osc_r, position2);
        vmat2.setTranslationVelocity(osc_x, osc_y, position2);
        vmat2.setScaleVelocity(osc_sx, osc_sy, position2);
        if (this.mArcSpline != null) {
            if (this.mInterpolateData.length > 0) {
                this.mArcSpline.getPos((double) position2, this.mInterpolateData);
                this.mArcSpline.getSlope((double) position2, this.mInterpolateVelocity);
                vmat = vmat2;
                KeyCycleOscillator keyCycleOscillator2 = osc_x;
                KeyCycleOscillator osc_x2 = osc_r;
                KeyCycleOscillator keyCycleOscillator3 = osc_sx;
                KeyCycleOscillator keyCycleOscillator4 = osc_sy;
                this.mStartMotionPath.setDpDt(locationX, locationY, mAnchorDpDt, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            } else {
                vmat = vmat2;
                KeyCycleOscillator keyCycleOscillator5 = osc_sx;
                KeyCycleOscillator keyCycleOscillator6 = osc_sy;
                KeyCycleOscillator keyCycleOscillator7 = osc_x;
                KeyCycleOscillator osc_x3 = osc_r;
            }
            vmat.applyTransform(locationX, locationY, width, height, mAnchorDpDt);
            return;
        }
        VelocityMatrix vmat3 = vmat2;
        KeyCycleOscillator osc_sx2 = osc_sx;
        KeyCycleOscillator osc_sy2 = osc_sy;
        KeyCycleOscillator osc_x4 = osc_x;
        KeyCycleOscillator osc_x5 = osc_r;
        if (this.mSpline != null) {
            float position3 = getAdjustedPosition(position2, this.mVelocity);
            this.mSpline[0].getSlope((double) position3, this.mInterpolateVelocity);
            this.mSpline[0].getPos((double) position3, this.mInterpolateData);
            float v = this.mVelocity[0];
            for (int i = 0; i < this.mInterpolateVelocity.length; i++) {
                double[] dArr = this.mInterpolateVelocity;
                dArr[i] = dArr[i] * ((double) v);
            }
            float f = locationX;
            float f2 = locationY;
            float f3 = v;
            this.mStartMotionPath.setDpDt(f, f2, mAnchorDpDt, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            vmat3.applyTransform(f, f2, width, height, mAnchorDpDt);
            return;
        }
        float dleft = this.mEndMotionPath.mX - this.mStartMotionPath.mX;
        float dTop = this.mEndMotionPath.mY - this.mStartMotionPath.mY;
        mAnchorDpDt[0] = ((1.0f - locationX) * dleft) + ((dleft + (this.mEndMotionPath.mWidth - this.mStartMotionPath.mWidth)) * locationX);
        mAnchorDpDt[1] = ((1.0f - locationY) * dTop) + ((dTop + (this.mEndMotionPath.mHeight - this.mStartMotionPath.mHeight)) * locationY);
        vmat3.clear();
        VelocityMatrix vmat4 = vmat3;
        vmat4.setRotationVelocity(rotation, position2);
        vmat4.setTranslationVelocity(trans_x, trans_y, position2);
        vmat4.setScaleVelocity(scale_x, scale_y, position2);
        vmat4.setRotationVelocity(osc_x5, position2);
        KeyCycleOscillator osc_x6 = osc_x4;
        vmat4.setTranslationVelocity(osc_x6, osc_y, position2);
        KeyCycleOscillator osc_sy3 = osc_sy2;
        vmat4.setScaleVelocity(osc_sx2, osc_sy3, position2);
        KeyCycleOscillator keyCycleOscillator8 = osc_sy3;
        KeyCycleOscillator keyCycleOscillator9 = osc_x6;
        VelocityMatrix velocityMatrix = vmat4;
        vmat4.applyTransform(locationX, locationY, width, height, mAnchorDpDt);
    }

    public int getDrawPath() {
        int mode = this.mStartMotionPath.mDrawPath;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            mode = Math.max(mode, it.next().mDrawPath);
        }
        return Math.max(mode, this.mEndMotionPath.mDrawPath);
    }

    public void setDrawPath(int debugMode) {
        this.mStartMotionPath.mDrawPath = debugMode;
    }

    /* access modifiers changed from: package-private */
    public String name() {
        return this.mView.getName();
    }

    /* access modifiers changed from: package-private */
    public void positionKeyframe(MotionWidget view, MotionKeyPosition key, float x, float y, String[] attribute, float[] value) {
        FloatRect start = new FloatRect();
        start.left = this.mStartMotionPath.mX;
        start.top = this.mStartMotionPath.mY;
        start.right = start.left + this.mStartMotionPath.mWidth;
        start.bottom = start.top + this.mStartMotionPath.mHeight;
        FloatRect end = new FloatRect();
        end.left = this.mEndMotionPath.mX;
        end.top = this.mEndMotionPath.mY;
        end.right = end.left + this.mEndMotionPath.mWidth;
        end.bottom = end.top + this.mEndMotionPath.mHeight;
        key.positionAttributes(view, start, end, x, y, attribute, value);
    }

    public int getKeyFramePositions(int[] type, float[] pos) {
        int i = 0;
        int count = 0;
        Iterator<MotionKey> it = this.mKeyList.iterator();
        while (it.hasNext()) {
            MotionKey key = it.next();
            int i2 = i + 1;
            type[i] = key.mFramePosition + (key.mType * 1000);
            float time = ((float) key.mFramePosition) / 100.0f;
            this.mSpline[0].getPos((double) time, this.mInterpolateData);
            this.mStartMotionPath.getCenter((double) time, this.mInterpolateVariables, this.mInterpolateData, pos, count);
            count += 2;
            i = i2;
        }
        return i;
    }

    public int getKeyFrameInfo(int type, int[] info) {
        int i = type;
        int count = 0;
        int cursor = 0;
        float[] pos = new float[2];
        Iterator<MotionKey> it = this.mKeyList.iterator();
        while (it.hasNext()) {
            MotionKey key = it.next();
            if (key.mType == i || i != -1) {
                int len = cursor;
                info[cursor] = 0;
                int cursor2 = cursor + 1;
                info[cursor2] = key.mType;
                int cursor3 = cursor2 + 1;
                info[cursor3] = key.mFramePosition;
                float time = ((float) key.mFramePosition) / 100.0f;
                this.mSpline[0].getPos((double) time, this.mInterpolateData);
                float f = time;
                this.mStartMotionPath.getCenter((double) time, this.mInterpolateVariables, this.mInterpolateData, pos, 0);
                int cursor4 = cursor3 + 1;
                info[cursor4] = Float.floatToIntBits(pos[0]);
                int cursor5 = cursor4 + 1;
                info[cursor5] = Float.floatToIntBits(pos[1]);
                if (key instanceof MotionKeyPosition) {
                    MotionKeyPosition kp = (MotionKeyPosition) key;
                    int cursor6 = cursor5 + 1;
                    info[cursor6] = kp.mPositionType;
                    int cursor7 = cursor6 + 1;
                    info[cursor7] = Float.floatToIntBits(kp.mPercentX);
                    cursor5 = cursor7 + 1;
                    info[cursor5] = Float.floatToIntBits(kp.mPercentY);
                }
                cursor = cursor5 + 1;
                info[len] = cursor - len;
                count++;
            }
        }
        return count;
    }

    public boolean setValue(int id, int value) {
        switch (id) {
            case 509:
                setPathMotionArc(value);
                return true;
            case TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS:
                this.mQuantizeMotionSteps = value;
                return true;
            case TypedValues.TransitionType.TYPE_AUTO_TRANSITION:
                return true;
            default:
                return false;
        }
    }

    public boolean setValue(int id, float value) {
        if (602 == id) {
            this.mQuantizeMotionPhase = value;
            return true;
        } else if (600 != id) {
            return false;
        } else {
            this.mMotionStagger = value;
            return true;
        }
    }

    public boolean setValue(int id, String value) {
        if (705 == id || 611 == id) {
            this.mQuantizeMotionInterpolator = getInterpolator(-1, value, 0);
            return true;
        } else if (605 != id) {
            return false;
        } else {
            this.mStartMotionPath.mAnimateRelativeTo = value;
            return true;
        }
    }

    public boolean setValue(int id, boolean value) {
        return false;
    }

    public int getId(String name) {
        return 0;
    }

    public void setStaggerScale(float staggerScale) {
        this.mStaggerScale = staggerScale;
    }

    public void setStaggerOffset(float staggerOffset) {
        this.mStaggerOffset = staggerOffset;
    }

    public float getMotionStagger() {
        return this.mMotionStagger;
    }

    public void setIdString(String stringId) {
        this.mId = stringId;
        this.mStartMotionPath.mId = this.mId;
    }
}
