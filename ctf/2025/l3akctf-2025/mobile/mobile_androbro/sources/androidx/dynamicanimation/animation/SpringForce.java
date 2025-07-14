package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.DynamicAnimation;

public final class SpringForce implements Force {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    private static final double UNSET = Double.MAX_VALUE;
    private static final double VELOCITY_THRESHOLD_MULTIPLIER = 62.5d;
    private double mDampedFreq;
    double mDampingRatio = 0.5d;
    private double mFinalPosition = Double.MAX_VALUE;
    private double mGammaMinus;
    private double mGammaPlus;
    private boolean mInitialized = false;
    private final DynamicAnimation.MassState mMassState = new DynamicAnimation.MassState();
    double mNaturalFreq = Math.sqrt(1500.0d);
    private double mValueThreshold;
    private double mVelocityThreshold;

    public SpringForce() {
    }

    public SpringForce(float finalPosition) {
        this.mFinalPosition = (double) finalPosition;
    }

    public SpringForce setStiffness(float stiffness) {
        if (stiffness > 0.0f) {
            this.mNaturalFreq = Math.sqrt((double) stiffness);
            this.mInitialized = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public float getStiffness() {
        return (float) (this.mNaturalFreq * this.mNaturalFreq);
    }

    public SpringForce setDampingRatio(float dampingRatio) {
        if (dampingRatio >= 0.0f) {
            this.mDampingRatio = (double) dampingRatio;
            this.mInitialized = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public float getDampingRatio() {
        return (float) this.mDampingRatio;
    }

    public SpringForce setFinalPosition(float finalPosition) {
        this.mFinalPosition = (double) finalPosition;
        return this;
    }

    public float getFinalPosition() {
        return (float) this.mFinalPosition;
    }

    public float getAcceleration(float lastDisplacement, float lastVelocity) {
        float lastDisplacement2 = lastDisplacement - getFinalPosition();
        return (float) (((-(this.mNaturalFreq * this.mNaturalFreq)) * ((double) lastDisplacement2)) - (((double) lastVelocity) * ((this.mNaturalFreq * 2.0d) * this.mDampingRatio)));
    }

    public boolean isAtEquilibrium(float value, float velocity) {
        if (((double) Math.abs(velocity)) >= this.mVelocityThreshold || ((double) Math.abs(value - getFinalPosition())) >= this.mValueThreshold) {
            return false;
        }
        return true;
    }

    private void init() {
        if (!this.mInitialized) {
            if (this.mFinalPosition != Double.MAX_VALUE) {
                if (this.mDampingRatio > 1.0d) {
                    this.mGammaPlus = ((-this.mDampingRatio) * this.mNaturalFreq) + (this.mNaturalFreq * Math.sqrt((this.mDampingRatio * this.mDampingRatio) - 1.0d));
                    this.mGammaMinus = ((-this.mDampingRatio) * this.mNaturalFreq) - (this.mNaturalFreq * Math.sqrt((this.mDampingRatio * this.mDampingRatio) - 1.0d));
                } else if (this.mDampingRatio >= 0.0d && this.mDampingRatio < 1.0d) {
                    this.mDampedFreq = this.mNaturalFreq * Math.sqrt(1.0d - (this.mDampingRatio * this.mDampingRatio));
                }
                this.mInitialized = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    /* access modifiers changed from: package-private */
    public DynamicAnimation.MassState updateValues(double lastDisplacement, double lastVelocity, long timeElapsed) {
        double currentVelocity;
        double displacement;
        init();
        double deltaT = ((double) timeElapsed) / 1000.0d;
        double lastDisplacement2 = lastDisplacement - this.mFinalPosition;
        if (this.mDampingRatio > 1.0d) {
            double coeffA = lastDisplacement2 - (((this.mGammaMinus * lastDisplacement2) - lastVelocity) / (this.mGammaMinus - this.mGammaPlus));
            double coeffB = ((this.mGammaMinus * lastDisplacement2) - lastVelocity) / (this.mGammaMinus - this.mGammaPlus);
            displacement = (Math.pow(2.718281828459045d, this.mGammaMinus * deltaT) * coeffA) + (Math.pow(2.718281828459045d, this.mGammaPlus * deltaT) * coeffB);
            double d = coeffA;
            double d2 = coeffB;
            currentVelocity = (this.mGammaMinus * coeffA * Math.pow(2.718281828459045d, this.mGammaMinus * deltaT)) + (this.mGammaPlus * coeffB * Math.pow(2.718281828459045d, this.mGammaPlus * deltaT));
            double d3 = lastDisplacement2;
        } else if (this.mDampingRatio == 1.0d) {
            double coeffA2 = lastDisplacement2;
            double coeffB2 = lastVelocity + (this.mNaturalFreq * lastDisplacement2);
            displacement = Math.pow(2.718281828459045d, (-this.mNaturalFreq) * deltaT) * ((coeffB2 * deltaT) + coeffA2);
            double d4 = coeffA2;
            currentVelocity = (((coeffB2 * deltaT) + coeffA2) * Math.pow(2.718281828459045d, (-this.mNaturalFreq) * deltaT) * (-this.mNaturalFreq)) + (Math.pow(2.718281828459045d, (-this.mNaturalFreq) * deltaT) * coeffB2);
            double coeffA3 = lastDisplacement2;
        } else {
            double cosCoeff = lastDisplacement2;
            double sinCoeff = (1.0d / this.mDampedFreq) * ((this.mDampingRatio * this.mNaturalFreq * lastDisplacement2) + lastVelocity);
            displacement = ((Math.cos(this.mDampedFreq * deltaT) * cosCoeff) + (Math.sin(this.mDampedFreq * deltaT) * sinCoeff)) * Math.pow(2.718281828459045d, (-this.mDampingRatio) * this.mNaturalFreq * deltaT);
            double d5 = lastDisplacement2;
            double d6 = cosCoeff;
            double d7 = sinCoeff;
            currentVelocity = ((-this.mNaturalFreq) * displacement * this.mDampingRatio) + (Math.pow(2.718281828459045d, (-this.mDampingRatio) * this.mNaturalFreq * deltaT) * (((-this.mDampedFreq) * cosCoeff * Math.sin(this.mDampedFreq * deltaT)) + (this.mDampedFreq * sinCoeff * Math.cos(this.mDampedFreq * deltaT))));
        }
        this.mMassState.mValue = (float) (this.mFinalPosition + displacement);
        this.mMassState.mVelocity = (float) currentVelocity;
        return this.mMassState;
    }

    /* access modifiers changed from: package-private */
    public void setValueThreshold(double threshold) {
        this.mValueThreshold = Math.abs(threshold);
        this.mVelocityThreshold = this.mValueThreshold * VELOCITY_THRESHOLD_MULTIPLIER;
    }
}
