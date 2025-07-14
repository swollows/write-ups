package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.HashMap;

public class ChainReference extends HelperReference {
    protected float mBias = 0.5f;
    private HashMap<String, Float> mMapPostGoneMargin;
    @Deprecated
    protected HashMap<String, Float> mMapPostMargin = new HashMap<>();
    private HashMap<String, Float> mMapPreGoneMargin;
    @Deprecated
    protected HashMap<String, Float> mMapPreMargin = new HashMap<>();
    @Deprecated
    protected HashMap<String, Float> mMapWeights = new HashMap<>();
    protected State.Chain mStyle = State.Chain.SPREAD;

    public ChainReference(State state, State.Helper type) {
        super(state, type);
    }

    public State.Chain getStyle() {
        return State.Chain.SPREAD;
    }

    public ChainReference style(State.Chain style) {
        this.mStyle = style;
        return this;
    }

    public void addChainElement(String id, float weight, float preMargin, float postMargin) {
        addChainElement(id, weight, preMargin, postMargin, 0.0f, 0.0f);
    }

    public void addChainElement(Object id, float weight, float preMargin, float postMargin, float preGoneMargin, float postGoneMargin) {
        super.add(id);
        String idString = id.toString();
        if (!Float.isNaN(weight)) {
            this.mMapWeights.put(idString, Float.valueOf(weight));
        }
        if (!Float.isNaN(preMargin)) {
            this.mMapPreMargin.put(idString, Float.valueOf(preMargin));
        }
        if (!Float.isNaN(postMargin)) {
            this.mMapPostMargin.put(idString, Float.valueOf(postMargin));
        }
        if (!Float.isNaN(preGoneMargin)) {
            if (this.mMapPreGoneMargin == null) {
                this.mMapPreGoneMargin = new HashMap<>();
            }
            this.mMapPreGoneMargin.put(idString, Float.valueOf(preGoneMargin));
        }
        if (!Float.isNaN(postGoneMargin)) {
            if (this.mMapPostGoneMargin == null) {
                this.mMapPostGoneMargin = new HashMap<>();
            }
            this.mMapPostGoneMargin.put(idString, Float.valueOf(postGoneMargin));
        }
    }

    /* access modifiers changed from: protected */
    public float getWeight(String id) {
        if (this.mMapWeights.containsKey(id)) {
            return this.mMapWeights.get(id).floatValue();
        }
        return -1.0f;
    }

    /* access modifiers changed from: protected */
    public float getPostMargin(String id) {
        if (this.mMapPostMargin.containsKey(id)) {
            return this.mMapPostMargin.get(id).floatValue();
        }
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public float getPreMargin(String id) {
        if (this.mMapPreMargin.containsKey(id)) {
            return this.mMapPreMargin.get(id).floatValue();
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public float getPostGoneMargin(String id) {
        if (this.mMapPostGoneMargin == null || !this.mMapPostGoneMargin.containsKey(id)) {
            return 0.0f;
        }
        return this.mMapPostGoneMargin.get(id).floatValue();
    }

    /* access modifiers changed from: package-private */
    public float getPreGoneMargin(String id) {
        if (this.mMapPreGoneMargin == null || !this.mMapPreGoneMargin.containsKey(id)) {
            return 0.0f;
        }
        return this.mMapPreGoneMargin.get(id).floatValue();
    }

    public float getBias() {
        return this.mBias;
    }

    public ChainReference bias(float bias) {
        this.mBias = bias;
        return this;
    }
}
