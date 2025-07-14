package androidx.constraintlayout.core.parser;

public class CLNumber extends CLElement {
    float mValue = Float.NaN;

    public CLNumber(char[] content) {
        super(content);
    }

    public CLNumber(float value) {
        super((char[]) null);
        this.mValue = value;
    }

    public static CLElement allocate(char[] content) {
        return new CLNumber(content);
    }

    /* access modifiers changed from: protected */
    public String toJSON() {
        float value = getFloat();
        int intValue = (int) value;
        if (((float) intValue) == value) {
            return "" + intValue;
        }
        return "" + value;
    }

    /* access modifiers changed from: protected */
    public String toFormattedJSON(int indent, int forceIndent) {
        StringBuilder json = new StringBuilder();
        addIndent(json, indent);
        float value = getFloat();
        int intValue = (int) value;
        if (((float) intValue) == value) {
            json.append(intValue);
        } else {
            json.append(value);
        }
        return json.toString();
    }

    public boolean isInt() {
        float value = getFloat();
        return ((float) ((int) value)) == value;
    }

    public int getInt() {
        if (Float.isNaN(this.mValue) && hasContent()) {
            this.mValue = (float) Integer.parseInt(content());
        }
        return (int) this.mValue;
    }

    public float getFloat() {
        if (Float.isNaN(this.mValue) && hasContent()) {
            this.mValue = Float.parseFloat(content());
        }
        return this.mValue;
    }

    public void putValue(float value) {
        this.mValue = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLNumber)) {
            return false;
        }
        float thisFloat = getFloat();
        float otherFloat = ((CLNumber) obj).getFloat();
        if ((!Float.isNaN(thisFloat) || !Float.isNaN(otherFloat)) && thisFloat != otherFloat) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + (this.mValue != 0.0f ? Float.floatToIntBits(this.mValue) : 0);
    }
}
