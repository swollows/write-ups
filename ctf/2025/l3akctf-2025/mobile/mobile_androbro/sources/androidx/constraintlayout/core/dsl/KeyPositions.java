package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Arrays;

public class KeyPositions extends Keys {
    private int[] mFrames = null;
    private float[] mPercentHeight = null;
    private float[] mPercentWidth = null;
    private float[] mPercentX = null;
    private float[] mPercentY = null;
    private Type mPositionType = null;
    private String[] mTarget = null;
    private String mTransitionEasing = null;

    public enum Type {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public KeyPositions(int numOfFrames, String... targets) {
        this.mTarget = targets;
        this.mFrames = new int[numOfFrames];
        float gap = 100.0f / ((float) (this.mFrames.length + 1));
        for (int i = 0; i < this.mFrames.length; i++) {
            this.mFrames[i] = (int) ((((float) i) * gap) + gap);
        }
    }

    public String getTransitionEasing() {
        return this.mTransitionEasing;
    }

    public void setTransitionEasing(String transitionEasing) {
        this.mTransitionEasing = transitionEasing;
    }

    public int[] getFrames() {
        return this.mFrames;
    }

    public void setFrames(int... frames) {
        this.mFrames = frames;
    }

    public float[] getPercentWidth() {
        return this.mPercentWidth;
    }

    public void setPercentWidth(float... percentWidth) {
        this.mPercentWidth = percentWidth;
    }

    public float[] getPercentHeight() {
        return this.mPercentHeight;
    }

    public void setPercentHeight(float... percentHeight) {
        this.mPercentHeight = percentHeight;
    }

    public float[] getPercentX() {
        return this.mPercentX;
    }

    public void setPercentX(float... percentX) {
        this.mPercentX = percentX;
    }

    public float[] getPercentY() {
        return this.mPercentY;
    }

    public void setPercentY(float... percentY) {
        this.mPercentY = percentY;
    }

    public Type getPositionType() {
        return this.mPositionType;
    }

    public void setPositionType(Type positionType) {
        this.mPositionType = positionType;
    }

    public String[] getTarget() {
        return this.mTarget;
    }

    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("KeyPositions:{\n");
        append(ret, TypedValues.AttributesType.S_TARGET, this.mTarget);
        ret.append("frame:").append(Arrays.toString(this.mFrames)).append(",\n");
        if (this.mPositionType != null) {
            ret.append("type:'").append(this.mPositionType).append("',\n");
        }
        append(ret, "easing", this.mTransitionEasing);
        append(ret, "percentX", this.mPercentX);
        append(ret, "percentX", this.mPercentY);
        append(ret, "percentWidth", this.mPercentWidth);
        append(ret, "percentHeight", this.mPercentHeight);
        ret.append("},\n");
        return ret.toString();
    }
}
