package androidx.constraintlayout.core.motion.utils;

public class VelocityMatrix {
    private static String sTag = "VelocityMatrix";
    float mDRotate;
    float mDScaleX;
    float mDScaleY;
    float mDTranslateX;
    float mDTranslateY;
    float mRotate;

    public void clear() {
        this.mDRotate = 0.0f;
        this.mDTranslateY = 0.0f;
        this.mDTranslateX = 0.0f;
        this.mDScaleY = 0.0f;
        this.mDScaleX = 0.0f;
    }

    public void setRotationVelocity(SplineSet rot, float position) {
        if (rot != null) {
            this.mDRotate = rot.getSlope(position);
            this.mRotate = rot.get(position);
        }
    }

    public void setTranslationVelocity(SplineSet transX, SplineSet transY, float position) {
        if (transX != null) {
            this.mDTranslateX = transX.getSlope(position);
        }
        if (transY != null) {
            this.mDTranslateY = transY.getSlope(position);
        }
    }

    public void setScaleVelocity(SplineSet scaleX, SplineSet scaleY, float position) {
        if (scaleX != null) {
            this.mDScaleX = scaleX.getSlope(position);
        }
        if (scaleY != null) {
            this.mDScaleY = scaleY.getSlope(position);
        }
    }

    public void setRotationVelocity(KeyCycleOscillator oscR, float position) {
        if (oscR != null) {
            this.mDRotate = oscR.getSlope(position);
        }
    }

    public void setTranslationVelocity(KeyCycleOscillator oscX, KeyCycleOscillator oscY, float position) {
        if (oscX != null) {
            this.mDTranslateX = oscX.getSlope(position);
        }
        if (oscY != null) {
            this.mDTranslateY = oscY.getSlope(position);
        }
    }

    public void setScaleVelocity(KeyCycleOscillator oscSx, KeyCycleOscillator oscSy, float position) {
        if (oscSx != null) {
            this.mDScaleX = oscSx.getSlope(position);
        }
        if (oscSy != null) {
            this.mDScaleY = oscSy.getSlope(position);
        }
    }

    public void applyTransform(float locationX, float locationY, int width, int height, float[] mAnchorDpDt) {
        int i = width;
        int i2 = height;
        float dx = mAnchorDpDt[0];
        float dy = mAnchorDpDt[1];
        float offx = (locationX - 0.5f) * 2.0f;
        float offy = (locationY - 0.5f) * 2.0f;
        float dx2 = dx + this.mDTranslateX;
        float dy2 = dy + this.mDTranslateY;
        float dx3 = dx2 + (this.mDScaleX * offx);
        float dy3 = dy2 + (this.mDScaleY * offy);
        float r = (float) Math.toRadians((double) this.mRotate);
        float dr = (float) Math.toRadians((double) this.mDRotate);
        mAnchorDpDt[0] = dx3 + (((float) ((((double) (((float) (-i)) * offx)) * Math.sin((double) r)) - (((double) (((float) i2) * offy)) * Math.cos((double) r)))) * dr);
        mAnchorDpDt[1] = dy3 + (((float) ((((double) (((float) i) * offx)) * Math.cos((double) r)) - (((double) (((float) i2) * offy)) * Math.sin((double) r)))) * dr);
    }
}
