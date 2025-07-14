package androidx.constraintlayout.core.motion.utils;

public class LinearCurveFit extends CurveFit {
    private static final String TAG = "LinearCurveFit";
    private boolean mExtrapolate = true;
    double[] mSlopeTemp;
    private double[] mT;
    private double mTotalLength = Double.NaN;
    private double[][] mY;

    public LinearCurveFit(double[] time, double[][] y) {
        double px;
        int dim;
        double[] dArr = time;
        double[][] dArr2 = y;
        char c = 0;
        int dim2 = dArr2[0].length;
        this.mSlopeTemp = new double[dim2];
        this.mT = dArr;
        this.mY = dArr2;
        if (dim2 > 2) {
            double sum = 0.0d;
            double lastx = 0.0d;
            double lasty = 0.0d;
            int i = 0;
            while (i < dArr.length) {
                double px2 = dArr2[i][c];
                double py = dArr2[i][c];
                if (i > 0) {
                    dim = dim2;
                    px = px2;
                    sum += Math.hypot(px2 - lastx, py - lasty);
                } else {
                    dim = dim2;
                    px = px2;
                }
                lastx = px;
                lasty = py;
                i++;
                dim2 = dim;
                c = 0;
            }
            this.mTotalLength = 0.0d;
            return;
        }
    }

    private double getLength2D(double t) {
        LinearCurveFit linearCurveFit = this;
        if (Double.isNaN(linearCurveFit.mTotalLength)) {
            return 0.0d;
        }
        int n = linearCurveFit.mT.length;
        if (t <= linearCurveFit.mT[0]) {
            return 0.0d;
        }
        if (t >= linearCurveFit.mT[n - 1]) {
            return linearCurveFit.mTotalLength;
        }
        double sum = 0.0d;
        double last_x = 0.0d;
        double last_y = 0.0d;
        int i = 0;
        while (i < n - 1) {
            double px = linearCurveFit.mY[i][0];
            double py = linearCurveFit.mY[i][1];
            if (i > 0) {
                double d = last_x;
                sum += Math.hypot(px - last_x, py - last_y);
            }
            last_x = px;
            last_y = py;
            if (t == linearCurveFit.mT[i]) {
                return sum;
            }
            if (t < linearCurveFit.mT[i + 1]) {
                double x = (t - linearCurveFit.mT[i]) / (linearCurveFit.mT[i + 1] - linearCurveFit.mT[i]);
                double x1 = linearCurveFit.mY[i][0];
                double x2 = linearCurveFit.mY[i + 1][0];
                int i2 = n;
                return sum + Math.hypot(py - (((1.0d - x) * linearCurveFit.mY[i][1]) + (linearCurveFit.mY[i + 1][1] * x)), px - (((1.0d - x) * x1) + (x2 * x)));
            }
            i++;
            linearCurveFit = this;
        }
        return 0.0d;
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
                double x = (t - this.mT[i]) / (this.mT[i + 1] - this.mT[i]);
                for (int j6 = 0; j6 < dim; j6++) {
                    v[j6] = ((1.0d - x) * this.mY[i][j6]) + (this.mY[i + 1][j6] * x);
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
                double x = (t - this.mT[i]) / (this.mT[i + 1] - this.mT[i]);
                for (int j6 = 0; j6 < dim; j6++) {
                    v[j6] = (float) (((1.0d - x) * this.mY[i][j6]) + (this.mY[i + 1][j6] * x));
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
                double x = (t - this.mT[i2]) / (this.mT[i2 + 1] - this.mT[i2]);
                return ((1.0d - x) * this.mY[i2][i]) + (this.mY[i2 + 1][i] * x);
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
                for (int j = 0; j < dim; j++) {
                    v[j] = (this.mY[i + 1][j] - this.mY[i][j]) / h;
                }
                return;
            }
        }
    }

    public double getSlope(double t, int j) {
        int n = this.mT.length;
        if (t < this.mT[0]) {
            t = this.mT[0];
        } else if (t >= this.mT[n - 1]) {
            t = this.mT[n - 1];
        }
        for (int i = 0; i < n - 1; i++) {
            if (t <= this.mT[i + 1]) {
                return (this.mY[i + 1][j] - this.mY[i][j]) / (this.mT[i + 1] - this.mT[i]);
            }
        }
        return 0.0d;
    }

    public double[] getTimePoints() {
        return this.mT;
    }
}
