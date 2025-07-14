package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MonotonicCurveFit extends CurveFit {
    private static final String TAG = "MonotonicCurveFit";
    private boolean mExtrapolate = true;
    double[] mSlopeTemp;
    private double[] mT;
    private double[][] mTangent;
    private double[][] mY;

    public MonotonicCurveFit(double[] time, double[][] y) {
        double[] dArr = time;
        double[][] dArr2 = y;
        int n = dArr.length;
        int dim = dArr2[0].length;
        this.mSlopeTemp = new double[dim];
        int[] iArr = new int[2];
        iArr[1] = dim;
        iArr[0] = n - 1;
        double[][] slope = (double[][]) Array.newInstance(Double.TYPE, iArr);
        int[] iArr2 = new int[2];
        iArr2[1] = dim;
        iArr2[0] = n;
        double[][] tangent = (double[][]) Array.newInstance(Double.TYPE, iArr2);
        for (int j = 0; j < dim; j++) {
            for (int i = 0; i < n - 1; i++) {
                slope[i][j] = (dArr2[i + 1][j] - dArr2[i][j]) / (dArr[i + 1] - dArr[i]);
                if (i == 0) {
                    tangent[i][j] = slope[i][j];
                } else {
                    tangent[i][j] = (slope[i - 1][j] + slope[i][j]) * 0.5d;
                }
            }
            tangent[n - 1][j] = slope[n - 2][j];
        }
        for (int i2 = 0; i2 < n - 1; i2++) {
            for (int j2 = 0; j2 < dim; j2++) {
                if (slope[i2][j2] == 0.0d) {
                    tangent[i2][j2] = 0.0d;
                    tangent[i2 + 1][j2] = 0.0d;
                } else {
                    double a = tangent[i2][j2] / slope[i2][j2];
                    double b = tangent[i2 + 1][j2] / slope[i2][j2];
                    double h = Math.hypot(a, b);
                    if (h > 9.0d) {
                        double t = 3.0d / h;
                        tangent[i2][j2] = t * a * slope[i2][j2];
                        tangent[i2 + 1][j2] = t * b * slope[i2][j2];
                    }
                }
            }
        }
        this.mT = dArr;
        this.mY = dArr2;
        this.mTangent = tangent;
    }

    public void getPos(double t, double[] v) {
        int n = this.mT.length;
        int dim = this.mY[0].length;
        if (this.mExtrapolate) {
            if (t <= this.mT[0]) {
                getSlope(this.mT[0], this.mSlopeTemp);
                for (int j = 0; j < dim; j++) {
                    v[j] = this.mY[0][j] + ((t - this.mT[0]) * this.mSlopeTemp[j]);
                }
                return;
            } else if (t >= this.mT[n - 1]) {
                getSlope(this.mT[n - 1], this.mSlopeTemp);
                for (int j2 = 0; j2 < dim; j2++) {
                    v[j2] = this.mY[n - 1][j2] + ((t - this.mT[n - 1]) * this.mSlopeTemp[j2]);
                }
                return;
            }
        } else if (t <= this.mT[0]) {
            for (int j3 = 0; j3 < dim; j3++) {
                v[j3] = this.mY[0][j3];
            }
            return;
        } else if (t >= this.mT[n - 1]) {
            for (int j4 = 0; j4 < dim; j4++) {
                v[j4] = this.mY[n - 1][j4];
            }
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (t == this.mT[i]) {
                for (int j5 = 0; j5 < dim; j5++) {
                    v[j5] = this.mY[i][j5];
                }
            }
            if (t < this.mT[i + 1]) {
                double h = this.mT[i + 1] - this.mT[i];
                double x = (t - this.mT[i]) / h;
                for (int j6 = 0; j6 < dim; j6++) {
                    v[j6] = interpolate(h, x, this.mY[i][j6], this.mY[i + 1][j6], this.mTangent[i][j6], this.mTangent[i + 1][j6]);
                }
                return;
            }
        }
    }

    public void getPos(double t, float[] v) {
        int n = this.mT.length;
        int dim = this.mY[0].length;
        if (this.mExtrapolate) {
            if (t <= this.mT[0]) {
                getSlope(this.mT[0], this.mSlopeTemp);
                for (int j = 0; j < dim; j++) {
                    v[j] = (float) (this.mY[0][j] + ((t - this.mT[0]) * this.mSlopeTemp[j]));
                }
                return;
            } else if (t >= this.mT[n - 1]) {
                getSlope(this.mT[n - 1], this.mSlopeTemp);
                for (int j2 = 0; j2 < dim; j2++) {
                    v[j2] = (float) (this.mY[n - 1][j2] + ((t - this.mT[n - 1]) * this.mSlopeTemp[j2]));
                }
                return;
            }
        } else if (t <= this.mT[0]) {
            for (int j3 = 0; j3 < dim; j3++) {
                v[j3] = (float) this.mY[0][j3];
            }
            return;
        } else if (t >= this.mT[n - 1]) {
            for (int j4 = 0; j4 < dim; j4++) {
                v[j4] = (float) this.mY[n - 1][j4];
            }
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (t == this.mT[i]) {
                for (int j5 = 0; j5 < dim; j5++) {
                    v[j5] = (float) this.mY[i][j5];
                }
            }
            if (t < this.mT[i + 1]) {
                double h = this.mT[i + 1] - this.mT[i];
                double x = (t - this.mT[i]) / h;
                for (int j6 = 0; j6 < dim; j6++) {
                    v[j6] = (float) interpolate(h, x, this.mY[i][j6], this.mY[i + 1][j6], this.mTangent[i][j6], this.mTangent[i + 1][j6]);
                }
                return;
            }
        }
    }

    public double getPos(double t, int j) {
        int i = j;
        int n = this.mT.length;
        if (this.mExtrapolate) {
            if (t <= this.mT[0]) {
                return this.mY[0][i] + ((t - this.mT[0]) * getSlope(this.mT[0], i));
            }
            if (t >= this.mT[n - 1]) {
                return this.mY[n - 1][i] + ((t - this.mT[n - 1]) * getSlope(this.mT[n - 1], i));
            }
        } else if (t <= this.mT[0]) {
            return this.mY[0][i];
        } else {
            if (t >= this.mT[n - 1]) {
                return this.mY[n - 1][i];
            }
        }
        for (int i2 = 0; i2 < n - 1; i2++) {
            if (t == this.mT[i2]) {
                return this.mY[i2][i];
            }
            if (t < this.mT[i2 + 1]) {
                double h = this.mT[i2 + 1] - this.mT[i2];
                return interpolate(h, (t - this.mT[i2]) / h, this.mY[i2][i], this.mY[i2 + 1][i], this.mTangent[i2][i], this.mTangent[i2 + 1][i]);
            }
        }
        return 0.0d;
    }

    public void getSlope(double t, double[] v) {
        double t2;
        int n = this.mT.length;
        int dim = this.mY[0].length;
        if (t <= this.mT[0]) {
            t2 = this.mT[0];
        } else if (t >= this.mT[n - 1]) {
            t2 = this.mT[n - 1];
        } else {
            t2 = t;
        }
        for (int i = 0; i < n - 1; i++) {
            if (t2 <= this.mT[i + 1]) {
                double h = this.mT[i + 1] - this.mT[i];
                double x = (t2 - this.mT[i]) / h;
                for (int j = 0; j < dim; j++) {
                    v[j] = diff(h, x, this.mY[i][j], this.mY[i + 1][j], this.mTangent[i][j], this.mTangent[i + 1][j]) / h;
                }
                return;
            }
        }
    }

    public double getSlope(double t, int j) {
        double t2;
        int n = this.mT.length;
        if (t < this.mT[0]) {
            t2 = this.mT[0];
        } else if (t >= this.mT[n - 1]) {
            t2 = this.mT[n - 1];
        } else {
            t2 = t;
        }
        for (int i = 0; i < n - 1; i++) {
            if (t2 <= this.mT[i + 1]) {
                double h = this.mT[i + 1] - this.mT[i];
                return diff(h, (t2 - this.mT[i]) / h, this.mY[i][j], this.mY[i + 1][j], this.mTangent[i][j], this.mTangent[i + 1][j]) / h;
            }
        }
        return 0.0d;
    }

    public double[] getTimePoints() {
        return this.mT;
    }

    private static double interpolate(double h, double x, double y1, double y2, double t1, double t2) {
        double x2 = x * x;
        double x3 = x2 * x;
        return ((((((((((-2.0d * x3) * y2) + ((x2 * 3.0d) * y2)) + ((x3 * 2.0d) * y1)) - ((3.0d * x2) * y1)) + y1) + ((h * t2) * x3)) + ((h * t1) * x3)) - ((h * t2) * x2)) - (((h * 2.0d) * t1) * x2)) + (h * t1 * x);
    }

    private static double diff(double h, double x, double y1, double y2, double t1, double t2) {
        double x2 = x * x;
        return (((((((((-6.0d * x2) * y2) + ((x * 6.0d) * y2)) + ((x2 * 6.0d) * y1)) - ((6.0d * x) * y1)) + (((h * 3.0d) * t2) * x2)) + (((3.0d * h) * t1) * x2)) - (((2.0d * h) * t2) * x)) - (((4.0d * h) * t1) * x)) + (h * t1);
    }

    public static MonotonicCurveFit buildWave(String configString) {
        double[] values = new double[(configString.length() / 2)];
        int start = configString.indexOf(40) + 1;
        int off1 = configString.indexOf(44, start);
        int count = 0;
        while (off1 != -1) {
            int count2 = count + 1;
            values[count] = Double.parseDouble(configString.substring(start, off1).trim());
            int i = off1 + 1;
            start = i;
            off1 = configString.indexOf(44, i);
            count = count2;
        }
        values[count] = Double.parseDouble(configString.substring(start, configString.indexOf(41, start)).trim());
        return buildWave(Arrays.copyOf(values, count + 1));
    }

    private static MonotonicCurveFit buildWave(double[] values) {
        double[] dArr = values;
        int length = (dArr.length * 3) - 2;
        int len = dArr.length - 1;
        double gap = 1.0d / ((double) len);
        int[] iArr = new int[2];
        iArr[1] = 1;
        iArr[0] = length;
        double[][] points = (double[][]) Array.newInstance(Double.TYPE, iArr);
        double[] time = new double[length];
        for (int i = 0; i < dArr.length; i++) {
            double v = dArr[i];
            points[i + len][0] = v;
            time[i + len] = ((double) i) * gap;
            if (i > 0) {
                points[(len * 2) + i][0] = v + 1.0d;
                time[(len * 2) + i] = (((double) i) * gap) + 1.0d;
                points[i - 1][0] = (v - 1.0d) - gap;
                time[i - 1] = ((((double) i) * gap) - 4.0d) - gap;
            }
        }
        return new MonotonicCurveFit(time, points);
    }
}
