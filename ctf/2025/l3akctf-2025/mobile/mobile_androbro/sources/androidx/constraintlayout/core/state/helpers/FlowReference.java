package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.HashMap;

public class FlowReference extends HelperReference {
    protected float mFirstHorizontalBias = 0.5f;
    protected int mFirstHorizontalStyle = -1;
    protected float mFirstVerticalBias = 0.5f;
    protected int mFirstVerticalStyle = -1;
    protected Flow mFlow;
    protected int mHorizontalAlign = 2;
    protected int mHorizontalGap = 0;
    protected int mHorizontalStyle = -1;
    protected float mLastHorizontalBias = 0.5f;
    protected int mLastHorizontalStyle = -1;
    protected float mLastVerticalBias = 0.5f;
    protected int mLastVerticalStyle = -1;
    protected HashMap<String, Float> mMapPostMargin;
    protected HashMap<String, Float> mMapPreMargin;
    protected HashMap<String, Float> mMapWeights;
    protected int mMaxElementsWrap = -1;
    protected int mOrientation = 0;
    protected int mPaddingBottom = 0;
    protected int mPaddingLeft = 0;
    protected int mPaddingRight = 0;
    protected int mPaddingTop = 0;
    protected int mVerticalAlign = 2;
    protected int mVerticalGap = 0;
    protected int mVerticalStyle = -1;
    protected int mWrapMode = 0;

    public FlowReference(State state, State.Helper type) {
        super(state, type);
        if (type == State.Helper.VERTICAL_FLOW) {
            this.mOrientation = 1;
        }
    }

    public void addFlowElement(String id, float weight, float preMargin, float postMargin) {
        super.add(id);
        if (!Float.isNaN(weight)) {
            if (this.mMapWeights == null) {
                this.mMapWeights = new HashMap<>();
            }
            this.mMapWeights.put(id, Float.valueOf(weight));
        }
        if (!Float.isNaN(preMargin)) {
            if (this.mMapPreMargin == null) {
                this.mMapPreMargin = new HashMap<>();
            }
            this.mMapPreMargin.put(id, Float.valueOf(preMargin));
        }
        if (!Float.isNaN(postMargin)) {
            if (this.mMapPostMargin == null) {
                this.mMapPostMargin = new HashMap<>();
            }
            this.mMapPostMargin.put(id, Float.valueOf(postMargin));
        }
    }

    /* access modifiers changed from: protected */
    public float getWeight(String id) {
        if (this.mMapWeights != null && this.mMapWeights.containsKey(id)) {
            return this.mMapWeights.get(id).floatValue();
        }
        return -1.0f;
    }

    /* access modifiers changed from: protected */
    public float getPostMargin(String id) {
        if (this.mMapPreMargin == null || !this.mMapPreMargin.containsKey(id)) {
            return 0.0f;
        }
        return this.mMapPreMargin.get(id).floatValue();
    }

    /* access modifiers changed from: protected */
    public float getPreMargin(String id) {
        if (this.mMapPostMargin == null || !this.mMapPostMargin.containsKey(id)) {
            return 0.0f;
        }
        return this.mMapPostMargin.get(id).floatValue();
    }

    public int getWrapMode() {
        return this.mWrapMode;
    }

    public void setWrapMode(int wrap) {
        this.mWrapMode = wrap;
    }

    public int getPaddingLeft() {
        return this.mPaddingLeft;
    }

    public void setPaddingLeft(int padding) {
        this.mPaddingLeft = padding;
    }

    public int getPaddingTop() {
        return this.mPaddingTop;
    }

    public void setPaddingTop(int padding) {
        this.mPaddingTop = padding;
    }

    public int getPaddingRight() {
        return this.mPaddingRight;
    }

    public void setPaddingRight(int padding) {
        this.mPaddingRight = padding;
    }

    public int getPaddingBottom() {
        return this.mPaddingBottom;
    }

    public void setPaddingBottom(int padding) {
        this.mPaddingBottom = padding;
    }

    public int getVerticalStyle() {
        return this.mVerticalStyle;
    }

    public void setVerticalStyle(int verticalStyle) {
        this.mVerticalStyle = verticalStyle;
    }

    public int getFirstVerticalStyle() {
        return this.mFirstVerticalStyle;
    }

    public void setFirstVerticalStyle(int firstVerticalStyle) {
        this.mFirstVerticalStyle = firstVerticalStyle;
    }

    public int getLastVerticalStyle() {
        return this.mLastVerticalStyle;
    }

    public void setLastVerticalStyle(int lastVerticalStyle) {
        this.mLastVerticalStyle = lastVerticalStyle;
    }

    public int getHorizontalStyle() {
        return this.mHorizontalStyle;
    }

    public void setHorizontalStyle(int horizontalStyle) {
        this.mHorizontalStyle = horizontalStyle;
    }

    public int getFirstHorizontalStyle() {
        return this.mFirstHorizontalStyle;
    }

    public void setFirstHorizontalStyle(int firstHorizontalStyle) {
        this.mFirstHorizontalStyle = firstHorizontalStyle;
    }

    public int getLastHorizontalStyle() {
        return this.mLastHorizontalStyle;
    }

    public void setLastHorizontalStyle(int lastHorizontalStyle) {
        this.mLastHorizontalStyle = lastHorizontalStyle;
    }

    public int getVerticalAlign() {
        return this.mVerticalAlign;
    }

    public void setVerticalAlign(int verticalAlign) {
        this.mVerticalAlign = verticalAlign;
    }

    public int getHorizontalAlign() {
        return this.mHorizontalAlign;
    }

    public void setHorizontalAlign(int horizontalAlign) {
        this.mHorizontalAlign = horizontalAlign;
    }

    public int getVerticalGap() {
        return this.mVerticalGap;
    }

    public void setVerticalGap(int verticalGap) {
        this.mVerticalGap = verticalGap;
    }

    public int getHorizontalGap() {
        return this.mHorizontalGap;
    }

    public void setHorizontalGap(int horizontalGap) {
        this.mHorizontalGap = horizontalGap;
    }

    public int getMaxElementsWrap() {
        return this.mMaxElementsWrap;
    }

    public void setMaxElementsWrap(int maxElementsWrap) {
        this.mMaxElementsWrap = maxElementsWrap;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setOrientation(int mOrientation2) {
        this.mOrientation = mOrientation2;
    }

    public float getVerticalBias() {
        return this.mVerticalBias;
    }

    public float getFirstVerticalBias() {
        return this.mFirstVerticalBias;
    }

    public void setFirstVerticalBias(float firstVerticalBias) {
        this.mFirstVerticalBias = firstVerticalBias;
    }

    public float getLastVerticalBias() {
        return this.mLastVerticalBias;
    }

    public void setLastVerticalBias(float lastVerticalBias) {
        this.mLastVerticalBias = lastVerticalBias;
    }

    public float getHorizontalBias() {
        return this.mHorizontalBias;
    }

    public float getFirstHorizontalBias() {
        return this.mFirstHorizontalBias;
    }

    public void setFirstHorizontalBias(float firstHorizontalBias) {
        this.mFirstHorizontalBias = firstHorizontalBias;
    }

    public float getLastHorizontalBias() {
        return this.mLastHorizontalBias;
    }

    public void setLastHorizontalBias(float lastHorizontalBias) {
        this.mLastHorizontalBias = lastHorizontalBias;
    }

    public HelperWidget getHelperWidget() {
        if (this.mFlow == null) {
            this.mFlow = new Flow();
        }
        return this.mFlow;
    }

    public void setHelperWidget(HelperWidget widget) {
        if (widget instanceof Flow) {
            this.mFlow = (Flow) widget;
        } else {
            this.mFlow = null;
        }
    }

    public void apply() {
        getHelperWidget();
        setConstraintWidget(this.mFlow);
        this.mFlow.setOrientation(this.mOrientation);
        this.mFlow.setWrapMode(this.mWrapMode);
        if (this.mMaxElementsWrap != -1) {
            this.mFlow.setMaxElementsWrap(this.mMaxElementsWrap);
        }
        if (this.mPaddingLeft != 0) {
            this.mFlow.setPaddingLeft(this.mPaddingLeft);
        }
        if (this.mPaddingTop != 0) {
            this.mFlow.setPaddingTop(this.mPaddingTop);
        }
        if (this.mPaddingRight != 0) {
            this.mFlow.setPaddingRight(this.mPaddingRight);
        }
        if (this.mPaddingBottom != 0) {
            this.mFlow.setPaddingBottom(this.mPaddingBottom);
        }
        if (this.mHorizontalGap != 0) {
            this.mFlow.setHorizontalGap(this.mHorizontalGap);
        }
        if (this.mVerticalGap != 0) {
            this.mFlow.setVerticalGap(this.mVerticalGap);
        }
        if (this.mHorizontalBias != 0.5f) {
            this.mFlow.setHorizontalBias(this.mHorizontalBias);
        }
        if (this.mFirstHorizontalBias != 0.5f) {
            this.mFlow.setFirstHorizontalBias(this.mFirstHorizontalBias);
        }
        if (this.mLastHorizontalBias != 0.5f) {
            this.mFlow.setLastHorizontalBias(this.mLastHorizontalBias);
        }
        if (this.mVerticalBias != 0.5f) {
            this.mFlow.setVerticalBias(this.mVerticalBias);
        }
        if (this.mFirstVerticalBias != 0.5f) {
            this.mFlow.setFirstVerticalBias(this.mFirstVerticalBias);
        }
        if (this.mLastVerticalBias != 0.5f) {
            this.mFlow.setLastVerticalBias(this.mLastVerticalBias);
        }
        if (this.mHorizontalAlign != 2) {
            this.mFlow.setHorizontalAlign(this.mHorizontalAlign);
        }
        if (this.mVerticalAlign != 2) {
            this.mFlow.setVerticalAlign(this.mVerticalAlign);
        }
        if (this.mVerticalStyle != -1) {
            this.mFlow.setVerticalStyle(this.mVerticalStyle);
        }
        if (this.mFirstVerticalStyle != -1) {
            this.mFlow.setFirstVerticalStyle(this.mFirstVerticalStyle);
        }
        if (this.mLastVerticalStyle != -1) {
            this.mFlow.setLastVerticalStyle(this.mLastVerticalStyle);
        }
        if (this.mHorizontalStyle != -1) {
            this.mFlow.setHorizontalStyle(this.mHorizontalStyle);
        }
        if (this.mFirstHorizontalStyle != -1) {
            this.mFlow.setFirstHorizontalStyle(this.mFirstHorizontalStyle);
        }
        if (this.mLastHorizontalStyle != -1) {
            this.mFlow.setLastHorizontalStyle(this.mLastHorizontalStyle);
        }
        applyBase();
    }
}
