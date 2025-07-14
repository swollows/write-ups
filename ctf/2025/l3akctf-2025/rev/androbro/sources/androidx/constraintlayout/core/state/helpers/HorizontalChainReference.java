package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

public class HorizontalChainReference extends ChainReference {
    public HorizontalChainReference(State state) {
        super(state, State.Helper.HORIZONTAL_CHAIN);
    }

    public void apply() {
        ConstraintReference first = null;
        ConstraintReference previous = null;
        Iterator it = this.mReferences.iterator();
        while (it.hasNext()) {
            this.mHelperState.constraints(it.next()).clearHorizontal();
        }
        Iterator it2 = this.mReferences.iterator();
        while (it2.hasNext()) {
            Object key = it2.next();
            ConstraintReference reference = this.mHelperState.constraints(key);
            if (first == null) {
                first = reference;
                if (this.mStartToStart != null) {
                    first.startToStart(this.mStartToStart).margin(this.mMarginStart).marginGone(this.mMarginStartGone);
                } else if (this.mStartToEnd != null) {
                    first.startToEnd(this.mStartToEnd).margin(this.mMarginStart).marginGone(this.mMarginStartGone);
                } else if (this.mLeftToLeft != null) {
                    first.startToStart(this.mLeftToLeft).margin(this.mMarginLeft).marginGone(this.mMarginLeftGone);
                } else if (this.mLeftToRight != null) {
                    first.startToEnd(this.mLeftToRight).margin(this.mMarginLeft).marginGone(this.mMarginLeftGone);
                } else {
                    String refKey = reference.getKey().toString();
                    first.startToStart(State.PARENT).margin((Object) Float.valueOf(getPreMargin(refKey))).marginGone((Object) Float.valueOf(getPreGoneMargin(refKey)));
                }
            }
            if (previous != null) {
                String preKey = previous.getKey().toString();
                String refKey2 = reference.getKey().toString();
                previous.endToStart(reference.getKey()).margin((Object) Float.valueOf(getPostMargin(preKey))).marginGone((Object) Float.valueOf(getPostGoneMargin(preKey)));
                reference.startToEnd(previous.getKey()).margin((Object) Float.valueOf(getPreMargin(refKey2))).marginGone((Object) Float.valueOf(getPreGoneMargin(refKey2)));
            }
            float weight = getWeight(key.toString());
            if (weight != -1.0f) {
                reference.setHorizontalChainWeight(weight);
            }
            previous = reference;
        }
        if (previous != null) {
            if (this.mEndToStart != null) {
                previous.endToStart(this.mEndToStart).margin(this.mMarginEnd).marginGone(this.mMarginEndGone);
            } else if (this.mEndToEnd != null) {
                previous.endToEnd(this.mEndToEnd).margin(this.mMarginEnd).marginGone(this.mMarginEndGone);
            } else if (this.mRightToLeft != null) {
                previous.endToStart(this.mRightToLeft).margin(this.mMarginRight).marginGone(this.mMarginRightGone);
            } else if (this.mRightToRight != null) {
                previous.endToEnd(this.mRightToRight).margin(this.mMarginRight).marginGone(this.mMarginRightGone);
            } else {
                String preKey2 = previous.getKey().toString();
                previous.endToEnd(State.PARENT).margin((Object) Float.valueOf(getPostMargin(preKey2))).marginGone((Object) Float.valueOf(getPostGoneMargin(preKey2)));
            }
        }
        if (first != null) {
            if (this.mBias != 0.5f) {
                first.horizontalBias(this.mBias);
            }
            switch (this.mStyle) {
                case SPREAD:
                    first.setHorizontalChainStyle(0);
                    return;
                case SPREAD_INSIDE:
                    first.setHorizontalChainStyle(1);
                    return;
                case PACKED:
                    first.setHorizontalChainStyle(2);
                    return;
                default:
                    return;
            }
        }
    }
}
