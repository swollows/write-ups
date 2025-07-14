package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.motion.utils.TypedValues;

public class KeyPosition extends Keys {
    private int mFrame = 0;
    private float mPercentHeight = Float.NaN;
    private float mPercentWidth = Float.NaN;
    private float mPercentX = Float.NaN;
    private float mPercentY = Float.NaN;
    private Type mPositionType = Type.CARTESIAN;
    private String mTarget = null;
    private String mTransitionEasing = null;

    public enum Type {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public KeyPosition(String firstTarget, int frame) {
        this.mTarget = firstTarget;
        this.mFrame = frame;
    }

    public String getTransitionEasing() {
        return this.mTransitionEasing;
    }

    public void setTransitionEasing(String transitionEasing) {
        this.mTransitionEasing = transitionEasing;
    }

    public int getFrames() {
        return this.mFrame;
    }

    public void setFrames(int frames) {
        this.mFrame = frames;
    }

    public float getPercentWidth() {
        return this.mPercentWidth;
    }

    public void setPercentWidth(float percentWidth) {
        this.mPercentWidth = percentWidth;
    }

    public float getPercentHeight() {
        return this.mPercentHeight;
    }

    public void setPercentHeight(float percentHeight) {
        this.mPercentHeight = percentHeight;
    }

    public float getPercentX() {
        return this.mPercentX;
    }

    public void setPercentX(float percentX) {
        this.mPercentX = percentX;
    }

    public float getPercentY() {
        return this.mPercentY;
    }

    public void setPercentY(float percentY) {
        this.mPercentY = percentY;
    }

    public Type getPositionType() {
        return this.mPositionType;
    }

    public void setPositionType(Type positionType) {
        this.mPositionType = positionType;
    }

    public String getTarget() {
        return this.mTarget;
    }

    public void setTarget(String target) {
        this.mTarget = target;
    }

    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("KeyPositions:{\n");
        append(ret, TypedValues.AttributesType.S_TARGET, this.mTarget);
        ret.append("frame:").append(this.mFrame).append(",\n");
        if (this.mPositionType != null) {
            ret.append("type:'").append(this.mPositionType).append("',\n");
        }
        append(ret, "easing", this.mTransitionEasing);
        append(ret, "percentX", this.mPercentX);
        append(ret, "percentY", this.mPercentY);
        append(ret, "percentWidth", this.mPercentWidth);
        append(ret, "percentHeight", this.mPercentHeight);
        ret.append("},\n");
        return ret.toString();
    }
}
