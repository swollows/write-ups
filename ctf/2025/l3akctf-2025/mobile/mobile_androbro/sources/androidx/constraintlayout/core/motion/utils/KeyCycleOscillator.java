package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

public abstract class KeyCycleOscillator {
    private static final String TAG = "KeyCycleOscillator";
    private CurveFit mCurveFit;
    private CycleOscillator mCycleOscillator;
    private String mType;
    public int mVariesBy = 0;
    ArrayList<WavePoint> mWavePoints = new ArrayList<>();
    private int mWaveShape = 0;
    private String mWaveString = null;

    public static KeyCycleOscillator makeWidgetCycle(String attribute) {
        if (attribute.equals("pathRotate")) {
            return new PathRotateSet(attribute);
        }
        return new CoreSpline(attribute);
    }

    private static class CoreSpline extends KeyCycleOscillator {
        String mType;
        int mTypeId = TypedValues.CycleType.getId(this.mType);

        CoreSpline(String str) {
            this.mType = str;
        }

        public void setProperty(MotionWidget widget, float t) {
            widget.setValue(this.mTypeId, get(t));
        }
    }

    public static class PathRotateSet extends KeyCycleOscillator {
        String mType;
        int mTypeId = TypedValues.CycleType.getId(this.mType);

        public PathRotateSet(String str) {
            this.mType = str;
        }

        public void setProperty(MotionWidget widget, float t) {
            widget.setValue(this.mTypeId, get(t));
        }

        public void setPathRotate(MotionWidget view, float t, double dx, double dy) {
            view.setRotationZ(get(t) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
        }
    }

    public boolean variesByPath() {
        return this.mVariesBy == 1;
    }

    static class WavePoint {
        float mOffset;
        float mPeriod;
        float mPhase;
        int mPosition;
        float mValue;

        WavePoint(int position, float period, float offset, float phase, float value) {
            this.mPosition = position;
            this.mValue = value;
            this.mOffset = offset;
            this.mPeriod = period;
            this.mPhase = phase;
        }
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat df = new DecimalFormat("##.##");
        Iterator<WavePoint> it = this.mWavePoints.iterator();
        while (it.hasNext()) {
            WavePoint wp = it.next();
            str = str + "[" + wp.mPosition + " , " + df.format((double) wp.mValue) + "] ";
        }
        return str;
    }

    public void setType(String type) {
        this.mType = type;
    }

    public float get(float t) {
        return (float) this.mCycleOscillator.getValues(t);
    }

    public float getSlope(float position) {
        return (float) this.mCycleOscillator.getSlope(position);
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    /* access modifiers changed from: protected */
    public void setCustom(Object custom) {
    }

    public void setPoint(int framePosition, int shape, String waveString, int variesBy, float period, float offset, float phase, float value, Object custom) {
        int i = variesBy;
        this.mWavePoints.add(new WavePoint(framePosition, period, offset, phase, value));
        if (i != -1) {
            this.mVariesBy = i;
        }
        this.mWaveShape = shape;
        setCustom(custom);
        this.mWaveString = waveString;
    }

    public void setPoint(int framePosition, int shape, String waveString, int variesBy, float period, float offset, float phase, float value) {
        int i = variesBy;
        this.mWavePoints.add(new WavePoint(framePosition, period, offset, phase, value));
        if (i != -1) {
            this.mVariesBy = i;
        }
        this.mWaveShape = shape;
        this.mWaveString = waveString;
    }

    public void setup(float pathLength) {
        int count = this.mWavePoints.size();
        if (count != 0) {
            Collections.sort(this.mWavePoints, new Comparator<WavePoint>() {
                public int compare(WavePoint lhs, WavePoint rhs) {
                    return Integer.compare(lhs.mPosition, rhs.mPosition);
                }
            });
            double[] time = new double[count];
            int[] iArr = new int[2];
            iArr[1] = 3;
            iArr[0] = count;
            double[][] values = (double[][]) Array.newInstance(Double.TYPE, iArr);
            this.mCycleOscillator = new CycleOscillator(this.mWaveShape, this.mWaveString, this.mVariesBy, count);
            int i = 0;
            Iterator<WavePoint> it = this.mWavePoints.iterator();
            while (it.hasNext()) {
                WavePoint wp = it.next();
                time[i] = ((double) wp.mPeriod) * 0.01d;
                values[i][0] = (double) wp.mValue;
                values[i][1] = (double) wp.mOffset;
                values[i][2] = (double) wp.mPhase;
                WavePoint wavePoint = wp;
                this.mCycleOscillator.setPoint(i, wp.mPosition, wp.mPeriod, wp.mOffset, wp.mPhase, wp.mValue);
                i++;
            }
            this.mCycleOscillator.setup(pathLength);
            this.mCurveFit = CurveFit.get(0, time, values);
        }
    }

    static class CycleOscillator {
        private static final String TAG = "CycleOscillator";
        static final int UNSET = -1;
        CurveFit mCurveFit;
        float[] mOffsetArr;
        private final int mOffst = 0;
        Oscillator mOscillator = new Oscillator();
        float mPathLength;
        float[] mPeriod;
        private final int mPhase = 1;
        float[] mPhaseArr;
        double[] mPosition;
        float[] mScale;
        double[] mSplineSlopeCache;
        double[] mSplineValueCache;
        private final int mValue = 2;
        float[] mValues;
        private final int mVariesBy;
        int mWaveShape;

        CycleOscillator(int waveShape, String customShape, int variesBy, int steps) {
            this.mWaveShape = waveShape;
            this.mVariesBy = variesBy;
            this.mOscillator.setType(waveShape, customShape);
            this.mValues = new float[steps];
            this.mPosition = new double[steps];
            this.mPeriod = new float[steps];
            this.mOffsetArr = new float[steps];
            this.mPhaseArr = new float[steps];
            this.mScale = new float[steps];
        }

        public double getValues(float time) {
            if (this.mCurveFit != null) {
                this.mCurveFit.getPos((double) time, this.mSplineValueCache);
            } else {
                this.mSplineValueCache[0] = (double) this.mOffsetArr[0];
                this.mSplineValueCache[1] = (double) this.mPhaseArr[0];
                this.mSplineValueCache[2] = (double) this.mValues[0];
            }
            double offset = this.mSplineValueCache[0];
            double[] dArr = this.mSplineValueCache;
            Objects.requireNonNull(this);
            return (this.mSplineValueCache[2] * this.mOscillator.getValue((double) time, dArr[1])) + offset;
        }

        public double getLastPhase() {
            return this.mSplineValueCache[1];
        }

        public double getSlope(float time) {
            if (this.mCurveFit != null) {
                this.mCurveFit.getSlope((double) time, this.mSplineSlopeCache);
                this.mCurveFit.getPos((double) time, this.mSplineValueCache);
            } else {
                this.mSplineSlopeCache[0] = 0.0d;
                this.mSplineSlopeCache[1] = 0.0d;
                this.mSplineSlopeCache[2] = 0.0d;
            }
            return this.mSplineSlopeCache[0] + (this.mSplineSlopeCache[2] * this.mOscillator.getValue((double) time, this.mSplineValueCache[1])) + (this.mSplineValueCache[2] * this.mOscillator.getSlope((double) time, this.mSplineValueCache[1], this.mSplineSlopeCache[1]));
        }

        public void setPoint(int index, int framePosition, float wavePeriod, float offset, float phase, float values) {
            this.mPosition[index] = ((double) framePosition) / 100.0d;
            this.mPeriod[index] = wavePeriod;
            this.mOffsetArr[index] = offset;
            this.mPhaseArr[index] = phase;
            this.mValues[index] = values;
        }

        public void setup(float pathLength) {
            this.mPathLength = pathLength;
            int length = this.mPosition.length;
            int[] iArr = new int[2];
            iArr[1] = 3;
            iArr[0] = length;
            double[][] splineValues = (double[][]) Array.newInstance(Double.TYPE, iArr);
            this.mSplineValueCache = new double[(this.mValues.length + 2)];
            this.mSplineSlopeCache = new double[(this.mValues.length + 2)];
            if (this.mPosition[0] > 0.0d) {
                this.mOscillator.addPoint(0.0d, this.mPeriod[0]);
            }
            int last = this.mPosition.length - 1;
            if (this.mPosition[last] < 1.0d) {
                this.mOscillator.addPoint(1.0d, this.mPeriod[last]);
            }
            for (int i = 0; i < splineValues.length; i++) {
                splineValues[i][0] = (double) this.mOffsetArr[i];
                splineValues[i][1] = (double) this.mPhaseArr[i];
                splineValues[i][2] = (double) this.mValues[i];
                this.mOscillator.addPoint(this.mPosition[i], this.mPeriod[i]);
            }
            this.mOscillator.normalize();
            if (this.mPosition.length > 1) {
                this.mCurveFit = CurveFit.get(0, this.mPosition, splineValues);
            } else {
                this.mCurveFit = null;
            }
        }
    }

    public void setProperty(MotionWidget widget, float t) {
    }
}
