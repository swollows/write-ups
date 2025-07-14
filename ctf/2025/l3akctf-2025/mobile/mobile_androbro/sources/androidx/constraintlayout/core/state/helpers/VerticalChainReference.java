package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

public class VerticalChainReference extends ChainReference {
    public VerticalChainReference(State state) {
        super(state, State.Helper.VERTICAL_CHAIN);
    }

    public void apply() {
        ConstraintReference first = null;
        ConstraintReference previous = null;
        Iterator it = this.mReferences.iterator();
        while (it.hasNext()) {
            this.mHelperState.constraints(it.next()).clearVertical();
        }
        Iterator it2 = this.mReferences.iterator();
        while (it2.hasNext()) {
            Object key = it2.next();
            ConstraintReference reference = this.mHelperState.constraints(key);
            if (first == null) {
                first = reference;
                if (this.mTopToTop != null) {
                    first.topToTop(this.mTopToTop).margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                } else if (this.mTopToBottom != null) {
                    first.topToBottom(this.mTopToBottom).margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                } else {
                    String refKey = reference.getKey().toString();
                    first.topToTop(State.PARENT).margin((Object) Float.valueOf(getPreMargin(refKey))).marginGone((Object) Float.valueOf(getPreGoneMargin(refKey)));
                }
            }
            if (previous != null) {
                String preKey = previous.getKey().toString();
                String refKey2 = reference.getKey().toString();
                previous.bottomToTop(reference.getKey()).margin((Object) Float.valueOf(getPostMargin(preKey))).marginGone((Object) Float.valueOf(getPostGoneMargin(preKey)));
                reference.topToBottom(previous.getKey()).margin((Object) Float.valueOf(getPreMargin(refKey2))).marginGone((Object) Float.valueOf(getPreGoneMargin(refKey2)));
            }
            float weight = getWeight(key.toString());
            if (weight != -1.0f) {
                reference.setVerticalChainWeight(weight);
            }
            previous = reference;
        }
        if (previous != null) {
            if (this.mBottomToTop != null) {
                previous.bottomToTop(this.mBottomToTop).margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
            } else if (this.mBottomToBottom != null) {
                previous.bottomToBottom(this.mBottomToBottom).margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
            } else {
                String preKey2 = previous.getKey().toString();
                previous.bottomToBottom(State.PARENT).margin((Object) Float.valueOf(getPostMargin(preKey2))).marginGone((Object) Float.valueOf(getPostGoneMargin(preKey2)));
            }
        }
        if (first != null) {
            if (this.mBias != 0.5f) {
                first.verticalBias(this.mBias);
            }
            switch (this.mStyle) {
                case SPREAD:
                    first.setVerticalChainStyle(0);
                    return;
                case SPREAD_INSIDE:
                    first.setVerticalChainStyle(1);
                    return;
                case PACKED:
                    first.setVerticalChainStyle(2);
                    return;
                default:
                    return;
            }
        }
    }
}
