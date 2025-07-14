package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

public class Oscillator {
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int CUSTOM = 7;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static String TAG = "Oscillator";
    public static final int TRIANGLE_WAVE = 2;
    double[] mArea;
    MonotonicCurveFit mCustomCurve;
    String mCustomType;
    private boolean mNormalized = false;
    double mPI2 = 6.283185307179586d;
    float[] mPeriod = new float[0];
    double[] mPosition = new double[0];
    int mType;

    public String toString() {
        return "pos =" + Arrays.toString(this.mPosition) + " period=" + Arrays.toString(this.mPeriod);
    }

    public void setType(int type, String customType) {
        this.mType = type;
        this.mCustomType = customType;
        if (this.mCustomType != null) {
            this.mCustomCurve = MonotonicCurveFit.buildWave(customType);
        }
    }

    public void addPoint(double position, float period) {
        int len = this.mPeriod.length + 1;
        int j = Arrays.binarySearch(this.mPosition, position);
        if (j < 0) {
            j = (-j) - 1;
        }
        this.mPosition = Arrays.copyOf(this.mPosition, len);
        this.mPeriod = Arrays.copyOf(this.mPeriod, len);
        this.mArea = new double[len];
        System.arraycopy(this.mPosition, j, this.mPosition, j + 1, (len - j) - 1);
        this.mPosition[j] = position;
        this.mPeriod[j] = period;
        this.mNormalized = false;
    }

    public void normalize() {
        double totalArea = 0.0d;
        double totalCount = 0.0d;
        for (float f : this.mPeriod) {
            totalCount += (double) f;
        }
        for (int i = 1; i < this.mPeriod.length; i++) {
            totalArea += ((double) ((this.mPeriod[i - 1] + this.mPeriod[i]) / 2.0f)) * (this.mPosition[i] - this.mPosition[i - 1]);
        }
        for (int i2 = 0; i2 < this.mPeriod.length; i2++) {
            float[] fArr = this.mPeriod;
            fArr[i2] = fArr[i2] * ((float) (totalCount / totalArea));
        }
        this.mArea[0] = 0.0d;
        for (int i3 = 1; i3 < this.mPeriod.length; i3++) {
            this.mArea[i3] = this.mArea[i3 - 1] + (((double) ((this.mPeriod[i3 - 1] + this.mPeriod[i3]) / 2.0f)) * (this.mPosition[i3] - this.mPosition[i3 - 1]));
        }
        this.mNormalized = true;
    }

    /* access modifiers changed from: package-private */
    public double getP(double time) {
        if (time <= 0.0d) {
            return 0.0d;
        }
        if (time >= 1.0d) {
            return 1.0d;
        }
        int index = Arrays.binarySearch(this.mPosition, time);
        if (index < 0) {
            index = (-index) - 1;
        }
        double m = ((double) (this.mPeriod[index] - this.mPeriod[index - 1])) / (this.mPosition[index] - this.mPosition[index - 1]);
        return this.mArea[index - 1] + ((((double) this.mPeriod[index - 1]) - (this.mPosition[index - 1] * m)) * (time - this.mPosition[index - 1])) + ((((time * time) - (this.mPosition[index - 1] * this.mPosition[index - 1])) * m) / 2.0d);
    }

    public double getValue(double time, double phase) {
        double angle = getP(time) + phase;
        switch (this.mType) {
            case 1:
                return Math.signum(0.5d - (angle % 1.0d));
            case 2:
                return 1.0d - Math.abs((((angle * 4.0d) + 1.0d) % 4.0d) - 2.0d);
            case 3:
                return (((angle * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                return 1.0d - (((angle * 2.0d) + 1.0d) % 2.0d);
            case 5:
                return Math.cos(this.mPI2 * (phase + angle));
            case 6:
                double x = 1.0d - Math.abs(((angle * 4.0d) % 4.0d) - 2.0d);
                return 1.0d - (x * x);
            case 7:
                return this.mCustomCurve.getPos(angle % 1.0d, 0);
            default:
                return Math.sin(this.mPI2 * angle);
        }
    }

    /* access modifiers changed from: package-private */
    public double getDP(double time) {
        if (time <= 0.0d) {
            return 0.0d;
        }
        if (time >= 1.0d) {
            return 1.0d;
        }
        int index = Arrays.binarySearch(this.mPosition, time);
        if (index < 0) {
            index = (-index) - 1;
        }
        double m = ((double) (this.mPeriod[index] - this.mPeriod[index - 1])) / (this.mPosition[index] - this.mPosition[index - 1]);
        return (m * time) + (((double) this.mPeriod[index - 1]) - (this.mPosition[index - 1] * m));
    }

    public double getSlope(double time, double phase, double dphase) {
        double angle = phase + getP(time);
        double dangle_dtime = getDP(time) + dphase;
        switch (this.mType) {
            case 1:
                return 0.0d;
            case 2:
                return dangle_dtime * 4.0d * Math.signum((((angle * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return 2.0d * dangle_dtime;
            case 4:
                return (-dangle_dtime) * 2.0d;
            case 5:
                return (-this.mPI2) * dangle_dtime * Math.sin(this.mPI2 * angle);
            case 6:
                return dangle_dtime * 4.0d * ((((angle * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.mCustomCurve.getSlope(angle % 1.0d, 0);
            default:
                return this.mPI2 * dangle_dtime * Math.cos(this.mPI2 * angle);
        }
    }
}
