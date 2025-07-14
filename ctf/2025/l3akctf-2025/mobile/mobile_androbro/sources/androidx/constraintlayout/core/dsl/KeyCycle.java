package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.motion.utils.TypedValues;

public class KeyCycle extends KeyAttribute {
    private static final String TAG = "KeyCycle";
    private float mWaveOffset = Float.NaN;
    private float mWavePeriod = Float.NaN;
    private float mWavePhase = Float.NaN;
    private Wave mWaveShape = null;

    public enum Wave {
        SIN,
        SQUARE,
        TRIANGLE,
        SAW,
        REVERSE_SAW,
        COS
    }

    KeyCycle(int frame, String target) {
        super(frame, target);
        this.TYPE = "KeyCycle";
    }

    public Wave getShape() {
        return this.mWaveShape;
    }

    public void setShape(Wave waveShape) {
        this.mWaveShape = waveShape;
    }

    public float getPeriod() {
        return this.mWavePeriod;
    }

    public void setPeriod(float wavePeriod) {
        this.mWavePeriod = wavePeriod;
    }

    public float getOffset() {
        return this.mWaveOffset;
    }

    public void setOffset(float waveOffset) {
        this.mWaveOffset = waveOffset;
    }

    public float getPhase() {
        return this.mWavePhase;
    }

    public void setPhase(float wavePhase) {
        this.mWavePhase = wavePhase;
    }

    /* access modifiers changed from: protected */
    public void attributesToString(StringBuilder builder) {
        super.attributesToString(builder);
        if (this.mWaveShape != null) {
            builder.append("shape:'").append(this.mWaveShape).append("',\n");
        }
        append(builder, TypedValues.CycleType.S_WAVE_PERIOD, this.mWavePeriod);
        append(builder, TypedValues.CycleType.S_WAVE_OFFSET, this.mWaveOffset);
        append(builder, TypedValues.CycleType.S_WAVE_PHASE, this.mWavePhase);
    }
}
