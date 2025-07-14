package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.motion.widget.MotionInterpolator;

public class StopLogic extends MotionInterpolator {
    private StopEngine mEngine = this.mStopLogicEngine;
    private SpringStopEngine mSpringStopEngine;
    private StopLogicEngine mStopLogicEngine = new StopLogicEngine();

    public String debug(String desc, float time) {
        return this.mEngine.debug(desc, time);
    }

    public float getVelocity(float x) {
        return this.mEngine.getVelocity(x);
    }

    public void config(float currentPos, float destination, float currentVelocity, float maxTime, float maxAcceleration, float maxVelocity) {
        this.mEngine = this.mStopLogicEngine;
        this.mStopLogicEngine.config(currentPos, destination, currentVelocity, maxTime, maxAcceleration, maxVelocity);
    }

    public void springConfig(float currentPos, float destination, float currentVelocity, float mass, float stiffness, float damping, float stopThreshold, int boundaryMode) {
        if (this.mSpringStopEngine == null) {
            this.mSpringStopEngine = new SpringStopEngine();
        }
        this.mEngine = this.mSpringStopEngine;
        this.mSpringStopEngine.springConfig(currentPos, destination, currentVelocity, mass, stiffness, damping, stopThreshold, boundaryMode);
    }

    public float getInterpolation(float v) {
        return this.mEngine.getInterpolation(v);
    }

    public float getVelocity() {
        return this.mEngine.getVelocity();
    }

    public boolean isStopped() {
        return this.mEngine.isStopped();
    }
}
