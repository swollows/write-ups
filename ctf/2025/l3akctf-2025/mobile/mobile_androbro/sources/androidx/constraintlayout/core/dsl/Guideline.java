package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Helper;

public abstract class Guideline extends Helper {
    private int mEnd = Integer.MIN_VALUE;
    private float mPercent = Float.NaN;
    private int mStart = Integer.MIN_VALUE;

    Guideline(String name) {
        super(name, new Helper.HelperType(""));
    }

    public int getStart() {
        return this.mStart;
    }

    public void setStart(int start) {
        this.mStart = start;
        this.configMap.put("start", String.valueOf(this.mStart));
    }

    public int getEnd() {
        return this.mEnd;
    }

    public void setEnd(int end) {
        this.mEnd = end;
        this.configMap.put("end", String.valueOf(this.mEnd));
    }

    public float getPercent() {
        return this.mPercent;
    }

    public void setPercent(float percent) {
        this.mPercent = percent;
        this.configMap.put("percent", String.valueOf(this.mPercent));
    }
}
