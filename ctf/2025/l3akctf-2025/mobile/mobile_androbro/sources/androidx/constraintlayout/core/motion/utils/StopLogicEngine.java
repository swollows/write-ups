package androidx.constraintlayout.core.motion.utils;

public class StopLogicEngine implements StopEngine {
    private static final float EPSILON = 1.0E-5f;
    private boolean mBackwards = false;
    private boolean mDone = false;
    private float mLastPosition;
    private float mLastTime;
    private int mNumberOfStages;
    private float mStage1Duration;
    private float mStage1EndPosition;
    private float mStage1Velocity;
    private float mStage2Duration;
    private float mStage2EndPosition;
    private float mStage2Velocity;
    private float mStage3Duration;
    private float mStage3EndPosition;
    private float mStage3Velocity;
    private float mStartPosition;
    private String mType;

    public String debug(String desc, float time) {
        String ret = ((desc + " ===== " + this.mType + "\n") + desc + (this.mBackwards ? "backwards" : "forward ") + " time = " + time + "  stages " + this.mNumberOfStages + "\n") + desc + " dur " + this.mStage1Duration + " vel " + this.mStage1Velocity + " pos " + this.mStage1EndPosition + "\n";
        if (this.mNumberOfStages > 1) {
            ret = ret + desc + " dur " + this.mStage2Duration + " vel " + this.mStage2Velocity + " pos " + this.mStage2EndPosition + "\n";
        }
        if (this.mNumberOfStages > 2) {
            ret = ret + desc + " dur " + this.mStage3Duration + " vel " + this.mStage3Velocity + " pos " + this.mStage3EndPosition + "\n";
        }
        if (time <= this.mStage1Duration) {
            return ret + desc + "stage 0\n";
        }
        if (this.mNumberOfStages == 1) {
            return ret + desc + "end stage 0\n";
        }
        float time2 = time - this.mStage1Duration;
        if (time2 < this.mStage2Duration) {
            return ret + desc + " stage 1\n";
        }
        if (this.mNumberOfStages == 2) {
            return ret + desc + "end stage 1\n";
        }
        if (time2 - this.mStage2Duration < this.mStage3Duration) {
            return ret + desc + " stage 2\n";
        }
        return ret + desc + " end stage 2\n";
    }

    public float getVelocity(float x) {
        if (x <= this.mStage1Duration) {
            return this.mStage1Velocity + (((this.mStage2Velocity - this.mStage1Velocity) * x) / this.mStage1Duration);
        }
        if (this.mNumberOfStages == 1) {
            return 0.0f;
        }
        float x2 = x - this.mStage1Duration;
        if (x2 < this.mStage2Duration) {
            return this.mStage2Velocity + (((this.mStage3Velocity - this.mStage2Velocity) * x2) / this.mStage2Duration);
        }
        if (this.mNumberOfStages == 2) {
            return 0.0f;
        }
        float x3 = x2 - this.mStage2Duration;
        if (x3 < this.mStage3Duration) {
            return this.mStage3Velocity - ((this.mStage3Velocity * x3) / this.mStage3Duration);
        }
        return 0.0f;
    }

    private float calcY(float time) {
        this.mDone = false;
        if (time <= this.mStage1Duration) {
            return (this.mStage1Velocity * time) + ((((this.mStage2Velocity - this.mStage1Velocity) * time) * time) / (this.mStage1Duration * 2.0f));
        }
        if (this.mNumberOfStages == 1) {
            return this.mStage1EndPosition;
        }
        float time2 = time - this.mStage1Duration;
        if (time2 < this.mStage2Duration) {
            return this.mStage1EndPosition + (this.mStage2Velocity * time2) + ((((this.mStage3Velocity - this.mStage2Velocity) * time2) * time2) / (this.mStage2Duration * 2.0f));
        }
        if (this.mNumberOfStages == 2) {
            return this.mStage2EndPosition;
        }
        float time3 = time2 - this.mStage2Duration;
        if (time3 <= this.mStage3Duration) {
            return (this.mStage2EndPosition + (this.mStage3Velocity * time3)) - (((this.mStage3Velocity * time3) * time3) / (this.mStage3Duration * 2.0f));
        }
        this.mDone = true;
        return this.mStage3EndPosition;
    }

    public void config(float currentPos, float destination, float currentVelocity, float maxTime, float maxAcceleration, float maxVelocity) {
        boolean z = false;
        this.mDone = false;
        this.mStartPosition = currentPos;
        if (currentPos > destination) {
            z = true;
        }
        this.mBackwards = z;
        if (this.mBackwards) {
            setup(-currentVelocity, currentPos - destination, maxAcceleration, maxVelocity, maxTime);
            return;
        }
        setup(currentVelocity, destination - currentPos, maxAcceleration, maxVelocity, maxTime);
    }

    public float getInterpolation(float v) {
        float y = calcY(v);
        this.mLastPosition = y;
        this.mLastTime = v;
        return this.mBackwards ? this.mStartPosition - y : this.mStartPosition + y;
    }

    public float getVelocity() {
        return this.mBackwards ? -getVelocity(this.mLastTime) : getVelocity(this.mLastTime);
    }

    public boolean isStopped() {
        return getVelocity() < EPSILON && Math.abs(this.mStage3EndPosition - this.mLastPosition) < EPSILON;
    }

    private void setup(float velocity, float distance, float maxAcceleration, float maxVelocity, float maxTime) {
        float velocity2;
        float f = distance;
        float f2 = maxVelocity;
        this.mDone = false;
        this.mStage3EndPosition = f;
        if (velocity == 0.0f) {
            velocity2 = 1.0E-4f;
        } else {
            velocity2 = velocity;
        }
        float min_time_to_stop = velocity2 / maxAcceleration;
        float stopDistance = (min_time_to_stop * velocity2) / 2.0f;
        if (velocity2 < 0.0f) {
            float peak_v = (float) Math.sqrt((double) (maxAcceleration * (f - ((((-velocity2) / maxAcceleration) * velocity2) / 2.0f))));
            if (peak_v < f2) {
                this.mType = "backward accelerate, decelerate";
                this.mNumberOfStages = 2;
                this.mStage1Velocity = velocity2;
                this.mStage2Velocity = peak_v;
                this.mStage3Velocity = 0.0f;
                this.mStage1Duration = (peak_v - velocity2) / maxAcceleration;
                this.mStage2Duration = peak_v / maxAcceleration;
                this.mStage1EndPosition = ((velocity2 + peak_v) * this.mStage1Duration) / 2.0f;
                this.mStage2EndPosition = f;
                this.mStage3EndPosition = f;
                return;
            }
            this.mType = "backward accelerate cruse decelerate";
            this.mNumberOfStages = 3;
            this.mStage1Velocity = velocity2;
            this.mStage2Velocity = f2;
            this.mStage3Velocity = f2;
            this.mStage1Duration = (f2 - velocity2) / maxAcceleration;
            this.mStage3Duration = f2 / maxAcceleration;
            float accDist = ((velocity2 + f2) * this.mStage1Duration) / 2.0f;
            float decDist = (this.mStage3Duration * f2) / 2.0f;
            this.mStage2Duration = ((f - accDist) - decDist) / f2;
            this.mStage1EndPosition = accDist;
            this.mStage2EndPosition = f - decDist;
            this.mStage3EndPosition = f;
        } else if (stopDistance >= f) {
            this.mType = "hard stop";
            this.mNumberOfStages = 1;
            this.mStage1Velocity = velocity2;
            this.mStage2Velocity = 0.0f;
            this.mStage1EndPosition = f;
            this.mStage1Duration = (2.0f * f) / velocity2;
        } else {
            float distance_before_break = f - stopDistance;
            float cruseTime = distance_before_break / velocity2;
            if (cruseTime + min_time_to_stop < maxTime) {
                this.mType = "cruse decelerate";
                this.mNumberOfStages = 2;
                this.mStage1Velocity = velocity2;
                this.mStage2Velocity = velocity2;
                this.mStage3Velocity = 0.0f;
                this.mStage1EndPosition = distance_before_break;
                this.mStage2EndPosition = f;
                this.mStage1Duration = cruseTime;
                this.mStage2Duration = velocity2 / maxAcceleration;
                return;
            }
            float peak_v2 = (float) Math.sqrt((double) ((maxAcceleration * f) + ((velocity2 * velocity2) / 2.0f)));
            this.mStage1Duration = (peak_v2 - velocity2) / maxAcceleration;
            this.mStage2Duration = peak_v2 / maxAcceleration;
            if (peak_v2 < f2) {
                this.mType = "accelerate decelerate";
                this.mNumberOfStages = 2;
                this.mStage1Velocity = velocity2;
                this.mStage2Velocity = peak_v2;
                this.mStage3Velocity = 0.0f;
                this.mStage1Duration = (peak_v2 - velocity2) / maxAcceleration;
                this.mStage2Duration = peak_v2 / maxAcceleration;
                this.mStage1EndPosition = ((velocity2 + peak_v2) * this.mStage1Duration) / 2.0f;
                this.mStage2EndPosition = f;
                return;
            }
            this.mType = "accelerate cruse decelerate";
            this.mNumberOfStages = 3;
            this.mStage1Velocity = velocity2;
            this.mStage2Velocity = f2;
            this.mStage3Velocity = f2;
            this.mStage1Duration = (f2 - velocity2) / maxAcceleration;
            this.mStage3Duration = f2 / maxAcceleration;
            float accDist2 = ((velocity2 + f2) * this.mStage1Duration) / 2.0f;
            float decDist2 = (this.mStage3Duration * f2) / 2.0f;
            this.mStage2Duration = ((f - accDist2) - decDist2) / f2;
            this.mStage1EndPosition = accDist2;
            this.mStage2EndPosition = f - decDist2;
            this.mStage3EndPosition = f;
        }
    }

    public static class Decelerate implements StopEngine {
        private float mAcceleration;
        private float mDestination;
        private boolean mDone = false;
        private float mDuration;
        private float mInitialPos;
        private float mInitialVelocity;
        private float mLastVelocity;

        public String debug(String desc, float time) {
            return this.mDuration + " " + this.mLastVelocity;
        }

        public float getVelocity(float time) {
            if (time > this.mDuration) {
                return 0.0f;
            }
            float f = this.mInitialVelocity + (this.mAcceleration * time);
            this.mLastVelocity = f;
            return f;
        }

        public float getInterpolation(float time) {
            if (time > this.mDuration) {
                this.mDone = true;
                return this.mDestination;
            }
            getVelocity(time);
            return this.mInitialPos + ((this.mInitialVelocity + ((this.mAcceleration * time) / 2.0f)) * time);
        }

        public float getVelocity() {
            return this.mLastVelocity;
        }

        public boolean isStopped() {
            return this.mDone;
        }

        public void config(float currentPos, float destination, float currentVelocity) {
            this.mDone = false;
            this.mDestination = destination;
            this.mInitialVelocity = currentVelocity;
            this.mInitialPos = currentPos;
            this.mDuration = (this.mDestination - currentPos) / (currentVelocity / 2.0f);
            this.mAcceleration = (-currentVelocity) / this.mDuration;
        }
    }
}
