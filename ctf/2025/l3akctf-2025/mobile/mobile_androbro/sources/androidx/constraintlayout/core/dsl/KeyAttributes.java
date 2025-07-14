package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Arrays;

public class KeyAttributes extends Keys {
    protected String TYPE = TypedValues.AttributesType.NAME;
    private float[] mAlpha = null;
    private Fit mCurveFit = null;
    private int[] mFrames = null;
    private float[] mPivotX = null;
    private float[] mPivotY = null;
    private float[] mRotation = null;
    private float[] mRotationX = null;
    private float[] mRotationY = null;
    private float[] mScaleX = null;
    private float[] mScaleY = null;
    private String[] mTarget = null;
    private String mTransitionEasing;
    private float[] mTransitionPathRotate = null;
    private float[] mTranslationX = null;
    private float[] mTranslationY = null;
    private float[] mTranslationZ = null;
    private Visibility[] mVisibility = null;

    public enum Fit {
        SPLINE,
        LINEAR
    }

    public enum Visibility {
        VISIBLE,
        INVISIBLE,
        GONE
    }

    KeyAttributes(int numOfFrames, String... targets) {
        this.mTarget = targets;
        this.mFrames = new int[numOfFrames];
        float gap = 100.0f / ((float) (this.mFrames.length + 1));
        for (int i = 0; i < this.mFrames.length; i++) {
            this.mFrames[i] = (int) ((((float) i) * gap) + gap);
        }
    }

    public String[] getTarget() {
        return this.mTarget;
    }

    public void setTarget(String[] target) {
        this.mTarget = target;
    }

    public String getTransitionEasing() {
        return this.mTransitionEasing;
    }

    public void setTransitionEasing(String transitionEasing) {
        this.mTransitionEasing = transitionEasing;
    }

    public Fit getCurveFit() {
        return this.mCurveFit;
    }

    public void setCurveFit(Fit curveFit) {
        this.mCurveFit = curveFit;
    }

    public Visibility[] getVisibility() {
        return this.mVisibility;
    }

    public void setVisibility(Visibility... visibility) {
        this.mVisibility = visibility;
    }

    public float[] getAlpha() {
        return this.mAlpha;
    }

    public void setAlpha(float... alpha) {
        this.mAlpha = alpha;
    }

    public float[] getRotation() {
        return this.mRotation;
    }

    public void setRotation(float... rotation) {
        this.mRotation = rotation;
    }

    public float[] getRotationX() {
        return this.mRotationX;
    }

    public void setRotationX(float... rotationX) {
        this.mRotationX = rotationX;
    }

    public float[] getRotationY() {
        return this.mRotationY;
    }

    public void setRotationY(float... rotationY) {
        this.mRotationY = rotationY;
    }

    public float[] getPivotX() {
        return this.mPivotX;
    }

    public void setPivotX(float... pivotX) {
        this.mPivotX = pivotX;
    }

    public float[] getPivotY() {
        return this.mPivotY;
    }

    public void setPivotY(float... pivotY) {
        this.mPivotY = pivotY;
    }

    public float[] getTransitionPathRotate() {
        return this.mTransitionPathRotate;
    }

    public void setTransitionPathRotate(float... transitionPathRotate) {
        this.mTransitionPathRotate = transitionPathRotate;
    }

    public float[] getScaleX() {
        return this.mScaleX;
    }

    public void setScaleX(float[] scaleX) {
        this.mScaleX = scaleX;
    }

    public float[] getScaleY() {
        return this.mScaleY;
    }

    public void setScaleY(float[] scaleY) {
        this.mScaleY = scaleY;
    }

    public float[] getTranslationX() {
        return this.mTranslationX;
    }

    public void setTranslationX(float[] translationX) {
        this.mTranslationX = translationX;
    }

    public float[] getTranslationY() {
        return this.mTranslationY;
    }

    public void setTranslationY(float[] translationY) {
        this.mTranslationY = translationY;
    }

    public float[] getTranslationZ() {
        return this.mTranslationZ;
    }

    public void setTranslationZ(float[] translationZ) {
        this.mTranslationZ = translationZ;
    }

    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append(this.TYPE);
        ret.append(":{\n");
        attributesToString(ret);
        ret.append("},\n");
        return ret.toString();
    }

    /* access modifiers changed from: protected */
    public void attributesToString(StringBuilder builder) {
        append(builder, TypedValues.AttributesType.S_TARGET, this.mTarget);
        builder.append("frame:").append(Arrays.toString(this.mFrames)).append(",\n");
        append(builder, "easing", this.mTransitionEasing);
        if (this.mCurveFit != null) {
            builder.append("fit:'").append(this.mCurveFit).append("',\n");
        }
        if (this.mVisibility != null) {
            builder.append("visibility:'").append(Arrays.toString(this.mVisibility)).append("',\n");
        }
        append(builder, "alpha", this.mAlpha);
        append(builder, "rotationX", this.mRotationX);
        append(builder, "rotationY", this.mRotationY);
        append(builder, "rotationZ", this.mRotation);
        append(builder, "pivotX", this.mPivotX);
        append(builder, "pivotY", this.mPivotY);
        append(builder, "pathRotate", this.mTransitionPathRotate);
        append(builder, "scaleX", this.mScaleX);
        append(builder, "scaleY", this.mScaleY);
        append(builder, "translationX", this.mTranslationX);
        append(builder, "translationY", this.mTranslationY);
        append(builder, "translationZ", this.mTranslationZ);
    }
}
