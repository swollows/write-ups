package androidx.constraintlayout.core.motion;

import androidx.core.view.ViewCompat;

public class CustomAttribute {
    private static final String TAG = "TransitionLayout";
    boolean mBooleanValue;
    private int mColorValue;
    private float mFloatValue;
    private int mIntegerValue;
    private boolean mMethod = false;
    String mName;
    private String mStringValue;
    private AttributeType mType;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public AttributeType getType() {
        return this.mType;
    }

    public boolean isContinuous() {
        switch (this.mType.ordinal()) {
            case 4:
            case 5:
            case 7:
                return false;
            default:
                return true;
        }
    }

    public void setFloatValue(float value) {
        this.mFloatValue = value;
    }

    public void setColorValue(int value) {
        this.mColorValue = value;
    }

    public void setIntValue(int value) {
        this.mIntegerValue = value;
    }

    public void setStringValue(String value) {
        this.mStringValue = value;
    }

    public int numberOfInterpolatedValues() {
        switch (this.mType.ordinal()) {
            case 2:
            case 3:
                return 4;
            default:
                return 1;
        }
    }

    public float getValueToInterpolate() {
        switch (this.mType.ordinal()) {
            case 0:
                return (float) this.mIntegerValue;
            case 1:
                return this.mFloatValue;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.mBooleanValue ? 1.0f : 0.0f;
            case 6:
                return this.mFloatValue;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] ret) {
        switch (this.mType.ordinal()) {
            case 0:
                ret[0] = (float) this.mIntegerValue;
                return;
            case 1:
                ret[0] = this.mFloatValue;
                return;
            case 2:
            case 3:
                ret[0] = (float) Math.pow((double) (((float) ((this.mColorValue >> 16) & 255)) / 255.0f), 2.2d);
                ret[1] = (float) Math.pow((double) (((float) ((this.mColorValue >> 8) & 255)) / 255.0f), 2.2d);
                ret[2] = (float) Math.pow((double) (((float) (this.mColorValue & 255)) / 255.0f), 2.2d);
                ret[3] = ((float) ((this.mColorValue >> 24) & 255)) / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                ret[0] = this.mBooleanValue ? 1.0f : 0.0f;
                return;
            case 6:
                ret[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public void setValue(float[] value) {
        boolean z = true;
        switch (this.mType.ordinal()) {
            case 0:
            case 7:
                this.mIntegerValue = (int) value[0];
                return;
            case 1:
                this.mFloatValue = value[0];
                return;
            case 2:
            case 3:
                this.mColorValue = hsvToRgb(value[0], value[1], value[2]);
                this.mColorValue = (this.mColorValue & ViewCompat.MEASURED_SIZE_MASK) | (clamp((int) (value[3] * 255.0f)) << 24);
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                if (((double) value[0]) <= 0.5d) {
                    z = false;
                }
                this.mBooleanValue = z;
                return;
            case 6:
                this.mFloatValue = value[0];
                return;
            default:
                return;
        }
    }

    public static int hsvToRgb(float hue, float saturation, float value) {
        int h = (int) (hue * 6.0f);
        float f = (6.0f * hue) - ((float) h);
        int p = (int) ((value * 255.0f * (1.0f - saturation)) + 0.5f);
        int q = (int) ((value * 255.0f * (1.0f - (f * saturation))) + 0.5f);
        int t = (int) ((value * 255.0f * (1.0f - ((1.0f - f) * saturation))) + 0.5f);
        int v = (int) ((255.0f * value) + 0.5f);
        switch (h) {
            case 0:
                return -16777216 | ((v << 16) + (t << 8) + p);
            case 1:
                return -16777216 | ((q << 16) + (v << 8) + p);
            case 2:
                return -16777216 | ((p << 16) + (v << 8) + t);
            case 3:
                return -16777216 | ((p << 16) + (q << 8) + v);
            case 4:
                return -16777216 | ((t << 16) + (p << 8) + v);
            case 5:
                return -16777216 | ((v << 16) + (p << 8) + q);
            default:
                return 0;
        }
    }

    public boolean diff(CustomAttribute customAttribute) {
        if (customAttribute == null || this.mType != customAttribute.mType) {
            return false;
        }
        switch (this.mType.ordinal()) {
            case 0:
            case 7:
                if (this.mIntegerValue == customAttribute.mIntegerValue) {
                    return true;
                }
                return false;
            case 1:
                if (this.mFloatValue == customAttribute.mFloatValue) {
                    return true;
                }
                return false;
            case 2:
            case 3:
                if (this.mColorValue == customAttribute.mColorValue) {
                    return true;
                }
                return false;
            case 4:
                if (this.mIntegerValue == customAttribute.mIntegerValue) {
                    return true;
                }
                return false;
            case 5:
                if (this.mBooleanValue == customAttribute.mBooleanValue) {
                    return true;
                }
                return false;
            case 6:
                if (this.mFloatValue == customAttribute.mFloatValue) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public CustomAttribute(String name, AttributeType attributeType) {
        this.mName = name;
        this.mType = attributeType;
    }

    public CustomAttribute(String name, AttributeType attributeType, Object value, boolean method) {
        this.mName = name;
        this.mType = attributeType;
        this.mMethod = method;
        setValue(value);
    }

    public CustomAttribute(CustomAttribute source, Object value) {
        this.mName = source.mName;
        this.mType = source.mType;
        setValue(value);
    }

    public void setValue(Object value) {
        switch (this.mType.ordinal()) {
            case 0:
            case 7:
                this.mIntegerValue = ((Integer) value).intValue();
                return;
            case 1:
                this.mFloatValue = ((Float) value).floatValue();
                return;
            case 2:
            case 3:
                this.mColorValue = ((Integer) value).intValue();
                return;
            case 4:
                this.mStringValue = (String) value;
                return;
            case 5:
                this.mBooleanValue = ((Boolean) value).booleanValue();
                return;
            case 6:
                this.mFloatValue = ((Float) value).floatValue();
                return;
            default:
                return;
        }
    }

    private static int clamp(int c) {
        int c2 = (c & (~(c >> 31))) - 255;
        return (c2 & (c2 >> 31)) + 255;
    }
}
