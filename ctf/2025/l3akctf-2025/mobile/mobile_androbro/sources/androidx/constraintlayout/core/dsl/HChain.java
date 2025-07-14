package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Chain;
import androidx.constraintlayout.core.dsl.Constraint;
import androidx.constraintlayout.core.dsl.Helper;

public class HChain extends Chain {
    private HAnchor mEnd = new HAnchor(Constraint.HSide.END);
    private HAnchor mLeft = new HAnchor(Constraint.HSide.LEFT);
    private HAnchor mRight = new HAnchor(Constraint.HSide.RIGHT);
    private HAnchor mStart = new HAnchor(Constraint.HSide.START);

    public class HAnchor extends Chain.Anchor {
        HAnchor(Constraint.HSide side) {
            super(Constraint.Side.valueOf(side.name()));
        }
    }

    public HChain(String name) {
        super(name);
        this.type = new Helper.HelperType((String) typeMap.get(Helper.Type.HORIZONTAL_CHAIN));
    }

    public HChain(String name, String config) {
        super(name);
        this.config = config;
        this.type = new Helper.HelperType((String) typeMap.get(Helper.Type.HORIZONTAL_CHAIN));
        this.configMap = convertConfigToMap();
        if (this.configMap.containsKey("contains")) {
            Ref.addStringToReferences((String) this.configMap.get("contains"), this.references);
        }
    }

    public HAnchor getLeft() {
        return this.mLeft;
    }

    public void linkToLeft(Constraint.HAnchor anchor) {
        linkToLeft(anchor, 0);
    }

    public void linkToLeft(Constraint.HAnchor anchor, int margin) {
        linkToLeft(anchor, margin, Integer.MIN_VALUE);
    }

    public void linkToLeft(Constraint.HAnchor anchor, int margin, int goneMargin) {
        this.mLeft.mConnection = anchor;
        this.mLeft.mMargin = margin;
        this.mLeft.mGoneMargin = goneMargin;
        this.configMap.put("left", this.mLeft.toString());
    }

    public HAnchor getRight() {
        return this.mRight;
    }

    public void linkToRight(Constraint.HAnchor anchor) {
        linkToRight(anchor, 0);
    }

    public void linkToRight(Constraint.HAnchor anchor, int margin) {
        linkToRight(anchor, margin, Integer.MIN_VALUE);
    }

    public void linkToRight(Constraint.HAnchor anchor, int margin, int goneMargin) {
        this.mRight.mConnection = anchor;
        this.mRight.mMargin = margin;
        this.mRight.mGoneMargin = goneMargin;
        this.configMap.put("right", this.mRight.toString());
    }

    public HAnchor getStart() {
        return this.mStart;
    }

    public void linkToStart(Constraint.HAnchor anchor) {
        linkToStart(anchor, 0);
    }

    public void linkToStart(Constraint.HAnchor anchor, int margin) {
        linkToStart(anchor, margin, Integer.MIN_VALUE);
    }

    public void linkToStart(Constraint.HAnchor anchor, int margin, int goneMargin) {
        this.mStart.mConnection = anchor;
        this.mStart.mMargin = margin;
        this.mStart.mGoneMargin = goneMargin;
        this.configMap.put("start", this.mStart.toString());
    }

    public HAnchor getEnd() {
        return this.mEnd;
    }

    public void linkToEnd(Constraint.HAnchor anchor) {
        linkToEnd(anchor, 0);
    }

    public void linkToEnd(Constraint.HAnchor anchor, int margin) {
        linkToEnd(anchor, margin, Integer.MIN_VALUE);
    }

    public void linkToEnd(Constraint.HAnchor anchor, int margin, int goneMargin) {
        this.mEnd.mConnection = anchor;
        this.mEnd.mMargin = margin;
        this.mEnd.mGoneMargin = goneMargin;
        this.configMap.put("end", this.mEnd.toString());
    }
}
