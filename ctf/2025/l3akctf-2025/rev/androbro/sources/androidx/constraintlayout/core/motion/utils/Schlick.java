package androidx.constraintlayout.core.motion.utils;

public class Schlick extends Easing {
    private static final boolean DEBUG = false;
    double mEps;
    double mS;
    double mT;

    Schlick(String configString) {
        this.mStr = configString;
        int start = configString.indexOf(40);
        int off1 = configString.indexOf(44, start);
        this.mS = Double.parseDouble(configString.substring(start + 1, off1).trim());
        this.mT = Double.parseDouble(configString.substring(off1 + 1, configString.indexOf(44, off1 + 1)).trim());
    }

    private double func(double x) {
        if (x < this.mT) {
            return (this.mT * x) / ((this.mS * (this.mT - x)) + x);
        }
        return ((1.0d - this.mT) * (x - 1.0d)) / ((1.0d - x) - (this.mS * (this.mT - x)));
    }

    private double dfunc(double x) {
        if (x < this.mT) {
            return ((this.mS * this.mT) * this.mT) / (((this.mS * (this.mT - x)) + x) * ((this.mS * (this.mT - x)) + x));
        }
        return ((this.mS * (this.mT - 1.0d)) * (this.mT - 1.0d)) / (((((-this.mS) * (this.mT - x)) - x) + 1.0d) * ((((-this.mS) * (this.mT - x)) - x) + 1.0d));
    }

    public double getDiff(double x) {
        return dfunc(x);
    }

    public double get(double x) {
        return func(x);
    }
}
