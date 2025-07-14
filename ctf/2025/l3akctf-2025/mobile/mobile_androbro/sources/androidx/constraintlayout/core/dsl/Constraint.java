package androidx.constraintlayout.core.dsl;

import java.util.HashMap;
import java.util.Map;

public class Constraint {
    public static final Constraint PARENT = new Constraint("parent");
    static int UNSET = Integer.MIN_VALUE;
    static Map<ChainMode, String> chainModeMap = new HashMap();
    String helperJason = null;
    String helperType = null;
    private VAnchor mBaseline = new VAnchor(VSide.BASELINE);
    private VAnchor mBottom = new VAnchor(VSide.BOTTOM);
    private float mCircleAngle = Float.NaN;
    private String mCircleConstraint = null;
    private int mCircleRadius = Integer.MIN_VALUE;
    private boolean mConstrainedHeight = false;
    private boolean mConstrainedWidth = false;
    private String mDimensionRatio = null;
    private int mEditorAbsoluteX = Integer.MIN_VALUE;
    private int mEditorAbsoluteY = Integer.MIN_VALUE;
    private HAnchor mEnd = new HAnchor(HSide.END);
    private int mHeight = UNSET;
    private Behaviour mHeightDefault = null;
    private int mHeightMax = UNSET;
    private int mHeightMin = UNSET;
    private float mHeightPercent = Float.NaN;
    private float mHorizontalBias = Float.NaN;
    private ChainMode mHorizontalChainStyle = null;
    private float mHorizontalWeight = Float.NaN;
    /* access modifiers changed from: private */
    public final String mId;
    private HAnchor mLeft = new HAnchor(HSide.LEFT);
    private String[] mReferenceIds = null;
    private HAnchor mRight = new HAnchor(HSide.RIGHT);
    private HAnchor mStart = new HAnchor(HSide.START);
    private VAnchor mTop = new VAnchor(VSide.TOP);
    private float mVerticalBias = Float.NaN;
    private ChainMode mVerticalChainStyle = null;
    private float mVerticalWeight = Float.NaN;
    private int mWidth = UNSET;
    private Behaviour mWidthDefault = null;
    private int mWidthMax = UNSET;
    private int mWidthMin = UNSET;
    private float mWidthPercent = Float.NaN;

    public enum Behaviour {
        SPREAD,
        WRAP,
        PERCENT,
        RATIO,
        RESOLVED
    }

    public enum ChainMode {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    public enum HSide {
        LEFT,
        RIGHT,
        START,
        END
    }

    public enum Side {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        START,
        END,
        BASELINE
    }

    public enum VSide {
        TOP,
        BOTTOM,
        BASELINE
    }

    static {
        chainModeMap.put(ChainMode.SPREAD, "spread");
        chainModeMap.put(ChainMode.SPREAD_INSIDE, "spread_inside");
        chainModeMap.put(ChainMode.PACKED, "packed");
    }

    public Constraint(String id) {
        this.mId = id;
    }

    public class VAnchor extends Anchor {
        VAnchor(VSide side) {
            super(Side.valueOf(side.name()));
        }
    }

    public class HAnchor extends Anchor {
        HAnchor(HSide side) {
            super(Side.valueOf(side.name()));
        }
    }

    public class Anchor {
        Anchor mConnection = null;
        int mGoneMargin = Integer.MIN_VALUE;
        int mMargin;
        final Side mSide;

        Anchor(Side side) {
            this.mSide = side;
        }

        public String getId() {
            return Constraint.this.mId;
        }

        /* access modifiers changed from: package-private */
        public Constraint getParent() {
            return Constraint.this;
        }

        public void build(StringBuilder builder) {
            if (this.mConnection != null) {
                builder.append(this.mSide.toString().toLowerCase()).append(":").append(this).append(",\n");
            }
        }

        public String toString() {
            StringBuilder ret = new StringBuilder("[");
            if (this.mConnection != null) {
                ret.append("'").append(this.mConnection.getId()).append("',").append("'").append(this.mConnection.mSide.toString().toLowerCase()).append("'");
            }
            if (this.mMargin != 0) {
                ret.append(",").append(this.mMargin);
            }
            if (this.mGoneMargin != Integer.MIN_VALUE) {
                if (this.mMargin == 0) {
                    ret.append(",0,").append(this.mGoneMargin);
                } else {
                    ret.append(",").append(this.mGoneMargin);
                }
            }
            ret.append("]");
            return ret.toString();
        }
    }

    public HAnchor getLeft() {
        return this.mLeft;
    }

    public HAnchor getRight() {
        return this.mRight;
    }

    public VAnchor getTop() {
        return this.mTop;
    }

    public VAnchor getBottom() {
        return this.mBottom;
    }

    public HAnchor getStart() {
        return this.mStart;
    }

    public HAnchor getEnd() {
        return this.mEnd;
    }

    public VAnchor getBaseline() {
        return this.mBaseline;
    }

    public float getHorizontalBias() {
        return this.mHorizontalBias;
    }

    public void setHorizontalBias(float horizontalBias) {
        this.mHorizontalBias = horizontalBias;
    }

    public float getVerticalBias() {
        return this.mVerticalBias;
    }

    public void setVerticalBias(float verticalBias) {
        this.mVerticalBias = verticalBias;
    }

    public String getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public void setDimensionRatio(String dimensionRatio) {
        this.mDimensionRatio = dimensionRatio;
    }

    public String getCircleConstraint() {
        return this.mCircleConstraint;
    }

    public void setCircleConstraint(String circleConstraint) {
        this.mCircleConstraint = circleConstraint;
    }

    public int getCircleRadius() {
        return this.mCircleRadius;
    }

    public void setCircleRadius(int circleRadius) {
        this.mCircleRadius = circleRadius;
    }

    public float getCircleAngle() {
        return this.mCircleAngle;
    }

    public void setCircleAngle(float circleAngle) {
        this.mCircleAngle = circleAngle;
    }

    public int getEditorAbsoluteX() {
        return this.mEditorAbsoluteX;
    }

    public void setEditorAbsoluteX(int editorAbsoluteX) {
        this.mEditorAbsoluteX = editorAbsoluteX;
    }

    public int getEditorAbsoluteY() {
        return this.mEditorAbsoluteY;
    }

    public void setEditorAbsoluteY(int editorAbsoluteY) {
        this.mEditorAbsoluteY = editorAbsoluteY;
    }

    public float getVerticalWeight() {
        return this.mVerticalWeight;
    }

    public void setVerticalWeight(float verticalWeight) {
        this.mVerticalWeight = verticalWeight;
    }

    public float getHorizontalWeight() {
        return this.mHorizontalWeight;
    }

    public void setHorizontalWeight(float horizontalWeight) {
        this.mHorizontalWeight = horizontalWeight;
    }

    public ChainMode getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public void setHorizontalChainStyle(ChainMode horizontalChainStyle) {
        this.mHorizontalChainStyle = horizontalChainStyle;
    }

    public ChainMode getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public void setVerticalChainStyle(ChainMode verticalChainStyle) {
        this.mVerticalChainStyle = verticalChainStyle;
    }

    public Behaviour getWidthDefault() {
        return this.mWidthDefault;
    }

    public void setWidthDefault(Behaviour widthDefault) {
        this.mWidthDefault = widthDefault;
    }

    public Behaviour getHeightDefault() {
        return this.mHeightDefault;
    }

    public void setHeightDefault(Behaviour heightDefault) {
        this.mHeightDefault = heightDefault;
    }

    public int getWidthMax() {
        return this.mWidthMax;
    }

    public void setWidthMax(int widthMax) {
        this.mWidthMax = widthMax;
    }

    public int getHeightMax() {
        return this.mHeightMax;
    }

    public void setHeightMax(int heightMax) {
        this.mHeightMax = heightMax;
    }

    public int getWidthMin() {
        return this.mWidthMin;
    }

    public void setWidthMin(int widthMin) {
        this.mWidthMin = widthMin;
    }

    public int getHeightMin() {
        return this.mHeightMin;
    }

    public void setHeightMin(int heightMin) {
        this.mHeightMin = heightMin;
    }

    public float getWidthPercent() {
        return this.mWidthPercent;
    }

    public void setWidthPercent(float widthPercent) {
        this.mWidthPercent = widthPercent;
    }

    public float getHeightPercent() {
        return this.mHeightPercent;
    }

    public void setHeightPercent(float heightPercent) {
        this.mHeightPercent = heightPercent;
    }

    public String[] getReferenceIds() {
        return this.mReferenceIds;
    }

    public void setReferenceIds(String[] referenceIds) {
        this.mReferenceIds = referenceIds;
    }

    public boolean isConstrainedWidth() {
        return this.mConstrainedWidth;
    }

    public void setConstrainedWidth(boolean constrainedWidth) {
        this.mConstrainedWidth = constrainedWidth;
    }

    public boolean isConstrainedHeight() {
        return this.mConstrainedHeight;
    }

    public void setConstrainedHeight(boolean constrainedHeight) {
        this.mConstrainedHeight = constrainedHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void setWidth(int width) {
        this.mWidth = width;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public void setHeight(int height) {
        this.mHeight = height;
    }

    public void linkToTop(VAnchor anchor) {
        linkToTop(anchor, 0);
    }

    public void linkToLeft(HAnchor anchor) {
        linkToLeft(anchor, 0);
    }

    public void linkToRight(HAnchor anchor) {
        linkToRight(anchor, 0);
    }

    public void linkToStart(HAnchor anchor) {
        linkToStart(anchor, 0);
    }

    public void linkToEnd(HAnchor anchor) {
        linkToEnd(anchor, 0);
    }

    public void linkToBottom(VAnchor anchor) {
        linkToBottom(anchor, 0);
    }

    public void linkToBaseline(VAnchor anchor) {
        linkToBaseline(anchor, 0);
    }

    public void linkToTop(VAnchor anchor, int margin) {
        linkToTop(anchor, margin, Integer.MIN_VALUE);
    }

    public void linkToLeft(HAnchor anchor, int margin) {
        linkToLeft(anchor, margin, Integer.MIN_VALUE);
    }

    public void linkToRight(HAnchor anchor, int margin) {
        linkToRight(anchor, margin, Integer.MIN_VALUE);
    }

    public void linkToStart(HAnchor anchor, int margin) {
        linkToStart(anchor, margin, Integer.MIN_VALUE);
    }

    public void linkToEnd(HAnchor anchor, int margin) {
        linkToEnd(anchor, margin, Integer.MIN_VALUE);
    }

    public void linkToBottom(VAnchor anchor, int margin) {
        linkToBottom(anchor, margin, Integer.MIN_VALUE);
    }

    public void linkToBaseline(VAnchor anchor, int margin) {
        linkToBaseline(anchor, margin, Integer.MIN_VALUE);
    }

    public void linkToTop(VAnchor anchor, int margin, int goneMargin) {
        this.mTop.mConnection = anchor;
        this.mTop.mMargin = margin;
        this.mTop.mGoneMargin = goneMargin;
    }

    public void linkToLeft(HAnchor anchor, int margin, int goneMargin) {
        this.mLeft.mConnection = anchor;
        this.mLeft.mMargin = margin;
        this.mLeft.mGoneMargin = goneMargin;
    }

    public void linkToRight(HAnchor anchor, int margin, int goneMargin) {
        this.mRight.mConnection = anchor;
        this.mRight.mMargin = margin;
        this.mRight.mGoneMargin = goneMargin;
    }

    public void linkToStart(HAnchor anchor, int margin, int goneMargin) {
        this.mStart.mConnection = anchor;
        this.mStart.mMargin = margin;
        this.mStart.mGoneMargin = goneMargin;
    }

    public void linkToEnd(HAnchor anchor, int margin, int goneMargin) {
        this.mEnd.mConnection = anchor;
        this.mEnd.mMargin = margin;
        this.mEnd.mGoneMargin = goneMargin;
    }

    public void linkToBottom(VAnchor anchor, int margin, int goneMargin) {
        this.mBottom.mConnection = anchor;
        this.mBottom.mMargin = margin;
        this.mBottom.mGoneMargin = goneMargin;
    }

    public void linkToBaseline(VAnchor anchor, int margin, int goneMargin) {
        this.mBaseline.mConnection = anchor;
        this.mBaseline.mMargin = margin;
        this.mBaseline.mGoneMargin = goneMargin;
    }

    public String convertStringArrayToString(String[] str) {
        StringBuilder ret = new StringBuilder("[");
        int i = 0;
        while (i < str.length) {
            ret.append(i == 0 ? "'" : ",'");
            ret.append(str[i]);
            ret.append("'");
            i++;
        }
        ret.append("]");
        return ret.toString();
    }

    /* access modifiers changed from: protected */
    public void append(StringBuilder builder, String name, float value) {
        if (!Float.isNaN(value)) {
            builder.append(name);
            builder.append(":").append(value).append(",\n");
        }
    }

    public String toString() {
        StringBuilder ret = new StringBuilder(this.mId + ":{\n");
        this.mLeft.build(ret);
        this.mRight.build(ret);
        this.mTop.build(ret);
        this.mBottom.build(ret);
        this.mStart.build(ret);
        this.mEnd.build(ret);
        this.mBaseline.build(ret);
        if (this.mWidth != UNSET) {
            ret.append("width:").append(this.mWidth).append(",\n");
        }
        if (this.mHeight != UNSET) {
            ret.append("height:").append(this.mHeight).append(",\n");
        }
        append(ret, "horizontalBias", this.mHorizontalBias);
        append(ret, "verticalBias", this.mVerticalBias);
        if (this.mDimensionRatio != null) {
            ret.append("dimensionRatio:'").append(this.mDimensionRatio).append("',\n");
        }
        if (this.mCircleConstraint != null && (!Float.isNaN(this.mCircleAngle) || this.mCircleRadius != Integer.MIN_VALUE)) {
            ret.append("circular:['").append(this.mCircleConstraint).append("'");
            if (!Float.isNaN(this.mCircleAngle)) {
                ret.append(",").append(this.mCircleAngle);
            }
            if (this.mCircleRadius != Integer.MIN_VALUE) {
                if (Float.isNaN(this.mCircleAngle)) {
                    ret.append(",0,").append(this.mCircleRadius);
                } else {
                    ret.append(",").append(this.mCircleRadius);
                }
            }
            ret.append("],\n");
        }
        append(ret, "verticalWeight", this.mVerticalWeight);
        append(ret, "horizontalWeight", this.mHorizontalWeight);
        if (this.mHorizontalChainStyle != null) {
            ret.append("horizontalChainStyle:'").append(chainModeMap.get(this.mHorizontalChainStyle)).append("',\n");
        }
        if (this.mVerticalChainStyle != null) {
            ret.append("verticalChainStyle:'").append(chainModeMap.get(this.mVerticalChainStyle)).append("',\n");
        }
        if (this.mWidthDefault != null) {
            if (this.mWidthMax == UNSET && this.mWidthMin == UNSET) {
                ret.append("width:'").append(this.mWidthDefault.toString().toLowerCase()).append("',\n");
            } else {
                ret.append("width:{value:'").append(this.mWidthDefault.toString().toLowerCase()).append("'");
                if (this.mWidthMax != UNSET) {
                    ret.append(",max:").append(this.mWidthMax);
                }
                if (this.mWidthMin != UNSET) {
                    ret.append(",min:").append(this.mWidthMin);
                }
                ret.append("},\n");
            }
        }
        if (this.mHeightDefault != null) {
            if (this.mHeightMax == UNSET && this.mHeightMin == UNSET) {
                ret.append("height:'").append(this.mHeightDefault.toString().toLowerCase()).append("',\n");
            } else {
                ret.append("height:{value:'").append(this.mHeightDefault.toString().toLowerCase()).append("'");
                if (this.mHeightMax != UNSET) {
                    ret.append(",max:").append(this.mHeightMax);
                }
                if (this.mHeightMin != UNSET) {
                    ret.append(",min:").append(this.mHeightMin);
                }
                ret.append("},\n");
            }
        }
        if (!Double.isNaN((double) this.mWidthPercent)) {
            ret.append("width:'").append((int) this.mWidthPercent).append("%',\n");
        }
        if (!Double.isNaN((double) this.mHeightPercent)) {
            ret.append("height:'").append((int) this.mHeightPercent).append("%',\n");
        }
        if (this.mReferenceIds != null) {
            ret.append("referenceIds:").append(convertStringArrayToString(this.mReferenceIds)).append(",\n");
        }
        if (this.mConstrainedWidth) {
            ret.append("constrainedWidth:").append(this.mConstrainedWidth).append(",\n");
        }
        if (this.mConstrainedHeight) {
            ret.append("constrainedHeight:").append(this.mConstrainedHeight).append(",\n");
        }
        ret.append("},\n");
        return ret.toString();
    }
}
