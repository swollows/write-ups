package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintReference implements Reference {
    float mAlpha = Float.NaN;
    Object mBaselineToBaseline = null;
    Object mBaselineToBottom = null;
    Object mBaselineToTop = null;
    Object mBottomToBaseline = null;
    protected Object mBottomToBottom = null;
    protected Object mBottomToTop = null;
    private float mCircularAngle;
    Object mCircularConstraint = null;
    private float mCircularDistance;
    private ConstraintWidget mConstraintWidget;
    private HashMap<String, Integer> mCustomColors = new HashMap<>();
    private HashMap<String, Float> mCustomFloats = new HashMap<>();
    protected Object mEndToEnd = null;
    protected Object mEndToStart = null;
    Facade mFacade = null;
    protected float mHorizontalBias = 0.5f;
    int mHorizontalChainStyle = 0;
    float mHorizontalChainWeight = -1.0f;
    Dimension mHorizontalDimension = Dimension.createFixed(Dimension.WRAP_DIMENSION);
    private Object mKey;
    State.Constraint mLast = null;
    protected Object mLeftToLeft = null;
    protected Object mLeftToRight = null;
    int mMarginBaseline = 0;
    int mMarginBaselineGone = 0;
    protected int mMarginBottom = 0;
    protected int mMarginBottomGone = 0;
    protected int mMarginEnd = 0;
    protected int mMarginEndGone = 0;
    protected int mMarginLeft = 0;
    protected int mMarginLeftGone = 0;
    protected int mMarginRight = 0;
    protected int mMarginRightGone = 0;
    protected int mMarginStart = 0;
    protected int mMarginStartGone = 0;
    protected int mMarginTop = 0;
    protected int mMarginTopGone = 0;
    TypedBundle mMotionProperties = null;
    float mPivotX = Float.NaN;
    float mPivotY = Float.NaN;
    protected Object mRightToLeft = null;
    protected Object mRightToRight = null;
    float mRotationX = Float.NaN;
    float mRotationY = Float.NaN;
    float mRotationZ = Float.NaN;
    float mScaleX = Float.NaN;
    float mScaleY = Float.NaN;
    protected Object mStartToEnd = null;
    protected Object mStartToStart = null;
    final State mState;
    String mTag = null;
    Object mTopToBaseline = null;
    protected Object mTopToBottom = null;
    protected Object mTopToTop = null;
    float mTranslationX = Float.NaN;
    float mTranslationY = Float.NaN;
    float mTranslationZ = Float.NaN;
    protected float mVerticalBias = 0.5f;
    int mVerticalChainStyle = 0;
    float mVerticalChainWeight = -1.0f;
    Dimension mVerticalDimension = Dimension.createFixed(Dimension.WRAP_DIMENSION);
    private Object mView;
    int mVisibility = 0;

    public interface ConstraintReferenceFactory {
        ConstraintReference create(State state);
    }

    public void setKey(Object key) {
        this.mKey = key;
    }

    public Object getKey() {
        return this.mKey;
    }

    public void setTag(String tag) {
        this.mTag = tag;
    }

    public String getTag() {
        return this.mTag;
    }

    public void setView(Object view) {
        this.mView = view;
        if (this.mConstraintWidget != null) {
            this.mConstraintWidget.setCompanionWidget(this.mView);
        }
    }

    public Object getView() {
        return this.mView;
    }

    public void setFacade(Facade facade) {
        this.mFacade = facade;
        if (facade != null) {
            setConstraintWidget(facade.getConstraintWidget());
        }
    }

    public Facade getFacade() {
        return this.mFacade;
    }

    public void setConstraintWidget(ConstraintWidget widget) {
        if (widget != null) {
            this.mConstraintWidget = widget;
            this.mConstraintWidget.setCompanionWidget(this.mView);
        }
    }

    public ConstraintWidget getConstraintWidget() {
        if (this.mConstraintWidget == null) {
            this.mConstraintWidget = createConstraintWidget();
            this.mConstraintWidget.setCompanionWidget(this.mView);
        }
        return this.mConstraintWidget;
    }

    public ConstraintWidget createConstraintWidget() {
        return new ConstraintWidget(getWidth().getValue(), getHeight().getValue());
    }

    static class IncorrectConstraintException extends Exception {
        private final ArrayList<String> mErrors;

        IncorrectConstraintException(ArrayList<String> errors) {
            this.mErrors = errors;
        }

        public ArrayList<String> getErrors() {
            return this.mErrors;
        }

        public String getMessage() {
            return toString();
        }

        public String toString() {
            return "IncorrectConstraintException: " + this.mErrors.toString();
        }
    }

    public void validate() throws IncorrectConstraintException {
        ArrayList<String> errors = new ArrayList<>();
        if (!(this.mLeftToLeft == null || this.mLeftToRight == null)) {
            errors.add("LeftToLeft and LeftToRight both defined");
        }
        if (!(this.mRightToLeft == null || this.mRightToRight == null)) {
            errors.add("RightToLeft and RightToRight both defined");
        }
        if (!(this.mStartToStart == null || this.mStartToEnd == null)) {
            errors.add("StartToStart and StartToEnd both defined");
        }
        if (!(this.mEndToStart == null || this.mEndToEnd == null)) {
            errors.add("EndToStart and EndToEnd both defined");
        }
        if (!((this.mLeftToLeft == null && this.mLeftToRight == null && this.mRightToLeft == null && this.mRightToRight == null) || (this.mStartToStart == null && this.mStartToEnd == null && this.mEndToStart == null && this.mEndToEnd == null))) {
            errors.add("Both left/right and start/end constraints defined");
        }
        if (errors.size() > 0) {
            throw new IncorrectConstraintException(errors);
        }
    }

    private Object get(Object reference) {
        if (reference == null) {
            return null;
        }
        if (!(reference instanceof ConstraintReference)) {
            return this.mState.reference(reference);
        }
        return reference;
    }

    public ConstraintReference(State state) {
        this.mState = state;
    }

    public void setHorizontalChainStyle(int chainStyle) {
        this.mHorizontalChainStyle = chainStyle;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public void setVerticalChainStyle(int chainStyle) {
        this.mVerticalChainStyle = chainStyle;
    }

    public int getVerticalChainStyle(int chainStyle) {
        return this.mVerticalChainStyle;
    }

    public float getHorizontalChainWeight() {
        return this.mHorizontalChainWeight;
    }

    public void setHorizontalChainWeight(float weight) {
        this.mHorizontalChainWeight = weight;
    }

    public float getVerticalChainWeight() {
        return this.mVerticalChainWeight;
    }

    public void setVerticalChainWeight(float weight) {
        this.mVerticalChainWeight = weight;
    }

    public ConstraintReference clearVertical() {
        top().clear();
        baseline().clear();
        bottom().clear();
        return this;
    }

    public ConstraintReference clearHorizontal() {
        start().clear();
        end().clear();
        left().clear();
        right().clear();
        return this;
    }

    public float getTranslationX() {
        return this.mTranslationX;
    }

    public float getTranslationY() {
        return this.mTranslationY;
    }

    public float getTranslationZ() {
        return this.mTranslationZ;
    }

    public float getScaleX() {
        return this.mScaleX;
    }

    public float getScaleY() {
        return this.mScaleY;
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public float getPivotX() {
        return this.mPivotX;
    }

    public float getPivotY() {
        return this.mPivotY;
    }

    public float getRotationX() {
        return this.mRotationX;
    }

    public float getRotationY() {
        return this.mRotationY;
    }

    public float getRotationZ() {
        return this.mRotationZ;
    }

    public ConstraintReference pivotX(float x) {
        this.mPivotX = x;
        return this;
    }

    public ConstraintReference pivotY(float y) {
        this.mPivotY = y;
        return this;
    }

    public ConstraintReference rotationX(float x) {
        this.mRotationX = x;
        return this;
    }

    public ConstraintReference rotationY(float y) {
        this.mRotationY = y;
        return this;
    }

    public ConstraintReference rotationZ(float z) {
        this.mRotationZ = z;
        return this;
    }

    public ConstraintReference translationX(float x) {
        this.mTranslationX = x;
        return this;
    }

    public ConstraintReference translationY(float y) {
        this.mTranslationY = y;
        return this;
    }

    public ConstraintReference translationZ(float z) {
        this.mTranslationZ = z;
        return this;
    }

    public ConstraintReference scaleX(float x) {
        this.mScaleX = x;
        return this;
    }

    public ConstraintReference scaleY(float y) {
        this.mScaleY = y;
        return this;
    }

    public ConstraintReference alpha(float alpha) {
        this.mAlpha = alpha;
        return this;
    }

    public ConstraintReference visibility(int visibility) {
        this.mVisibility = visibility;
        return this;
    }

    public ConstraintReference left() {
        if (this.mLeftToLeft != null) {
            this.mLast = State.Constraint.LEFT_TO_LEFT;
        } else {
            this.mLast = State.Constraint.LEFT_TO_RIGHT;
        }
        return this;
    }

    public ConstraintReference right() {
        if (this.mRightToLeft != null) {
            this.mLast = State.Constraint.RIGHT_TO_LEFT;
        } else {
            this.mLast = State.Constraint.RIGHT_TO_RIGHT;
        }
        return this;
    }

    public ConstraintReference start() {
        if (this.mStartToStart != null) {
            this.mLast = State.Constraint.START_TO_START;
        } else {
            this.mLast = State.Constraint.START_TO_END;
        }
        return this;
    }

    public ConstraintReference end() {
        if (this.mEndToStart != null) {
            this.mLast = State.Constraint.END_TO_START;
        } else {
            this.mLast = State.Constraint.END_TO_END;
        }
        return this;
    }

    public ConstraintReference top() {
        if (this.mTopToTop != null) {
            this.mLast = State.Constraint.TOP_TO_TOP;
        } else {
            this.mLast = State.Constraint.TOP_TO_BOTTOM;
        }
        return this;
    }

    public ConstraintReference bottom() {
        if (this.mBottomToTop != null) {
            this.mLast = State.Constraint.BOTTOM_TO_TOP;
        } else {
            this.mLast = State.Constraint.BOTTOM_TO_BOTTOM;
        }
        return this;
    }

    public ConstraintReference baseline() {
        this.mLast = State.Constraint.BASELINE_TO_BASELINE;
        return this;
    }

    public void addCustomColor(String name, int color) {
        this.mCustomColors.put(name, Integer.valueOf(color));
    }

    public void addCustomFloat(String name, float value) {
        if (this.mCustomFloats == null) {
            this.mCustomFloats = new HashMap<>();
        }
        this.mCustomFloats.put(name, Float.valueOf(value));
    }

    private void dereference() {
        this.mLeftToLeft = get(this.mLeftToLeft);
        this.mLeftToRight = get(this.mLeftToRight);
        this.mRightToLeft = get(this.mRightToLeft);
        this.mRightToRight = get(this.mRightToRight);
        this.mStartToStart = get(this.mStartToStart);
        this.mStartToEnd = get(this.mStartToEnd);
        this.mEndToStart = get(this.mEndToStart);
        this.mEndToEnd = get(this.mEndToEnd);
        this.mTopToTop = get(this.mTopToTop);
        this.mTopToBottom = get(this.mTopToBottom);
        this.mBottomToTop = get(this.mBottomToTop);
        this.mBottomToBottom = get(this.mBottomToBottom);
        this.mBaselineToBaseline = get(this.mBaselineToBaseline);
        this.mBaselineToTop = get(this.mBaselineToTop);
        this.mBaselineToBottom = get(this.mBaselineToBottom);
    }

    public ConstraintReference leftToLeft(Object reference) {
        this.mLast = State.Constraint.LEFT_TO_LEFT;
        this.mLeftToLeft = reference;
        return this;
    }

    public ConstraintReference leftToRight(Object reference) {
        this.mLast = State.Constraint.LEFT_TO_RIGHT;
        this.mLeftToRight = reference;
        return this;
    }

    public ConstraintReference rightToLeft(Object reference) {
        this.mLast = State.Constraint.RIGHT_TO_LEFT;
        this.mRightToLeft = reference;
        return this;
    }

    public ConstraintReference rightToRight(Object reference) {
        this.mLast = State.Constraint.RIGHT_TO_RIGHT;
        this.mRightToRight = reference;
        return this;
    }

    public ConstraintReference startToStart(Object reference) {
        this.mLast = State.Constraint.START_TO_START;
        this.mStartToStart = reference;
        return this;
    }

    public ConstraintReference startToEnd(Object reference) {
        this.mLast = State.Constraint.START_TO_END;
        this.mStartToEnd = reference;
        return this;
    }

    public ConstraintReference endToStart(Object reference) {
        this.mLast = State.Constraint.END_TO_START;
        this.mEndToStart = reference;
        return this;
    }

    public ConstraintReference endToEnd(Object reference) {
        this.mLast = State.Constraint.END_TO_END;
        this.mEndToEnd = reference;
        return this;
    }

    public ConstraintReference topToTop(Object reference) {
        this.mLast = State.Constraint.TOP_TO_TOP;
        this.mTopToTop = reference;
        return this;
    }

    public ConstraintReference topToBottom(Object reference) {
        this.mLast = State.Constraint.TOP_TO_BOTTOM;
        this.mTopToBottom = reference;
        return this;
    }

    /* access modifiers changed from: package-private */
    public ConstraintReference topToBaseline(Object reference) {
        this.mLast = State.Constraint.TOP_TO_BASELINE;
        this.mTopToBaseline = reference;
        return this;
    }

    public ConstraintReference bottomToTop(Object reference) {
        this.mLast = State.Constraint.BOTTOM_TO_TOP;
        this.mBottomToTop = reference;
        return this;
    }

    public ConstraintReference bottomToBottom(Object reference) {
        this.mLast = State.Constraint.BOTTOM_TO_BOTTOM;
        this.mBottomToBottom = reference;
        return this;
    }

    /* access modifiers changed from: package-private */
    public ConstraintReference bottomToBaseline(Object reference) {
        this.mLast = State.Constraint.BOTTOM_TO_BASELINE;
        this.mBottomToBaseline = reference;
        return this;
    }

    public ConstraintReference baselineToBaseline(Object reference) {
        this.mLast = State.Constraint.BASELINE_TO_BASELINE;
        this.mBaselineToBaseline = reference;
        return this;
    }

    public ConstraintReference baselineToTop(Object reference) {
        this.mLast = State.Constraint.BASELINE_TO_TOP;
        this.mBaselineToTop = reference;
        return this;
    }

    public ConstraintReference baselineToBottom(Object reference) {
        this.mLast = State.Constraint.BASELINE_TO_BOTTOM;
        this.mBaselineToBottom = reference;
        return this;
    }

    public ConstraintReference centerHorizontally(Object reference) {
        Object ref = get(reference);
        this.mStartToStart = ref;
        this.mEndToEnd = ref;
        this.mLast = State.Constraint.CENTER_HORIZONTALLY;
        this.mHorizontalBias = 0.5f;
        return this;
    }

    public ConstraintReference centerVertically(Object reference) {
        Object ref = get(reference);
        this.mTopToTop = ref;
        this.mBottomToBottom = ref;
        this.mLast = State.Constraint.CENTER_VERTICALLY;
        this.mVerticalBias = 0.5f;
        return this;
    }

    public ConstraintReference circularConstraint(Object reference, float angle, float distance) {
        this.mCircularConstraint = get(reference);
        this.mCircularAngle = angle;
        this.mCircularDistance = distance;
        this.mLast = State.Constraint.CIRCULAR_CONSTRAINT;
        return this;
    }

    public ConstraintReference width(Dimension dimension) {
        return setWidth(dimension);
    }

    public ConstraintReference height(Dimension dimension) {
        return setHeight(dimension);
    }

    public Dimension getWidth() {
        return this.mHorizontalDimension;
    }

    public ConstraintReference setWidth(Dimension dimension) {
        this.mHorizontalDimension = dimension;
        return this;
    }

    public Dimension getHeight() {
        return this.mVerticalDimension;
    }

    public ConstraintReference setHeight(Dimension dimension) {
        this.mVerticalDimension = dimension;
        return this;
    }

    public ConstraintReference margin(Object marginValue) {
        return margin(this.mState.convertDimension(marginValue));
    }

    public ConstraintReference marginGone(Object marginGoneValue) {
        return marginGone(this.mState.convertDimension(marginGoneValue));
    }

    public ConstraintReference margin(int value) {
        if (this.mLast != null) {
            switch (this.mLast) {
                case LEFT_TO_LEFT:
                case LEFT_TO_RIGHT:
                    this.mMarginLeft = value;
                    break;
                case RIGHT_TO_LEFT:
                case RIGHT_TO_RIGHT:
                    this.mMarginRight = value;
                    break;
                case START_TO_START:
                case START_TO_END:
                    this.mMarginStart = value;
                    break;
                case END_TO_START:
                case END_TO_END:
                    this.mMarginEnd = value;
                    break;
                case TOP_TO_TOP:
                case TOP_TO_BOTTOM:
                case TOP_TO_BASELINE:
                    this.mMarginTop = value;
                    break;
                case BOTTOM_TO_TOP:
                case BOTTOM_TO_BOTTOM:
                case BOTTOM_TO_BASELINE:
                    this.mMarginBottom = value;
                    break;
                case BASELINE_TO_BOTTOM:
                case BASELINE_TO_TOP:
                case BASELINE_TO_BASELINE:
                    this.mMarginBaseline = value;
                    break;
                case CIRCULAR_CONSTRAINT:
                    this.mCircularDistance = (float) value;
                    break;
            }
        } else {
            this.mMarginLeft = value;
            this.mMarginRight = value;
            this.mMarginStart = value;
            this.mMarginEnd = value;
            this.mMarginTop = value;
            this.mMarginBottom = value;
        }
        return this;
    }

    public ConstraintReference marginGone(int value) {
        if (this.mLast != null) {
            switch (this.mLast) {
                case LEFT_TO_LEFT:
                case LEFT_TO_RIGHT:
                    this.mMarginLeftGone = value;
                    break;
                case RIGHT_TO_LEFT:
                case RIGHT_TO_RIGHT:
                    this.mMarginRightGone = value;
                    break;
                case START_TO_START:
                case START_TO_END:
                    this.mMarginStartGone = value;
                    break;
                case END_TO_START:
                case END_TO_END:
                    this.mMarginEndGone = value;
                    break;
                case TOP_TO_TOP:
                case TOP_TO_BOTTOM:
                case TOP_TO_BASELINE:
                    this.mMarginTopGone = value;
                    break;
                case BOTTOM_TO_TOP:
                case BOTTOM_TO_BOTTOM:
                case BOTTOM_TO_BASELINE:
                    this.mMarginBottomGone = value;
                    break;
                case BASELINE_TO_BOTTOM:
                case BASELINE_TO_TOP:
                case BASELINE_TO_BASELINE:
                    this.mMarginBaselineGone = value;
                    break;
            }
        } else {
            this.mMarginLeftGone = value;
            this.mMarginRightGone = value;
            this.mMarginStartGone = value;
            this.mMarginEndGone = value;
            this.mMarginTopGone = value;
            this.mMarginBottomGone = value;
        }
        return this;
    }

    public ConstraintReference horizontalBias(float value) {
        this.mHorizontalBias = value;
        return this;
    }

    public ConstraintReference verticalBias(float value) {
        this.mVerticalBias = value;
        return this;
    }

    public ConstraintReference bias(float value) {
        if (this.mLast == null) {
            return this;
        }
        switch (this.mLast) {
            case LEFT_TO_LEFT:
            case LEFT_TO_RIGHT:
            case RIGHT_TO_LEFT:
            case RIGHT_TO_RIGHT:
            case START_TO_START:
            case START_TO_END:
            case END_TO_START:
            case END_TO_END:
            case CENTER_HORIZONTALLY:
                this.mHorizontalBias = value;
                break;
            case TOP_TO_TOP:
            case TOP_TO_BOTTOM:
            case TOP_TO_BASELINE:
            case BOTTOM_TO_TOP:
            case BOTTOM_TO_BOTTOM:
            case BOTTOM_TO_BASELINE:
            case CENTER_VERTICALLY:
                this.mVerticalBias = value;
                break;
        }
        return this;
    }

    public ConstraintReference clearAll() {
        this.mLeftToLeft = null;
        this.mLeftToRight = null;
        this.mMarginLeft = 0;
        this.mRightToLeft = null;
        this.mRightToRight = null;
        this.mMarginRight = 0;
        this.mStartToStart = null;
        this.mStartToEnd = null;
        this.mMarginStart = 0;
        this.mEndToStart = null;
        this.mEndToEnd = null;
        this.mMarginEnd = 0;
        this.mTopToTop = null;
        this.mTopToBottom = null;
        this.mMarginTop = 0;
        this.mBottomToTop = null;
        this.mBottomToBottom = null;
        this.mMarginBottom = 0;
        this.mBaselineToBaseline = null;
        this.mCircularConstraint = null;
        this.mHorizontalBias = 0.5f;
        this.mVerticalBias = 0.5f;
        this.mMarginLeftGone = 0;
        this.mMarginRightGone = 0;
        this.mMarginStartGone = 0;
        this.mMarginEndGone = 0;
        this.mMarginTopGone = 0;
        this.mMarginBottomGone = 0;
        return this;
    }

    public ConstraintReference clear() {
        if (this.mLast != null) {
            switch (this.mLast) {
                case LEFT_TO_LEFT:
                case LEFT_TO_RIGHT:
                    this.mLeftToLeft = null;
                    this.mLeftToRight = null;
                    this.mMarginLeft = 0;
                    this.mMarginLeftGone = 0;
                    break;
                case RIGHT_TO_LEFT:
                case RIGHT_TO_RIGHT:
                    this.mRightToLeft = null;
                    this.mRightToRight = null;
                    this.mMarginRight = 0;
                    this.mMarginRightGone = 0;
                    break;
                case START_TO_START:
                case START_TO_END:
                    this.mStartToStart = null;
                    this.mStartToEnd = null;
                    this.mMarginStart = 0;
                    this.mMarginStartGone = 0;
                    break;
                case END_TO_START:
                case END_TO_END:
                    this.mEndToStart = null;
                    this.mEndToEnd = null;
                    this.mMarginEnd = 0;
                    this.mMarginEndGone = 0;
                    break;
                case TOP_TO_TOP:
                case TOP_TO_BOTTOM:
                case TOP_TO_BASELINE:
                    this.mTopToTop = null;
                    this.mTopToBottom = null;
                    this.mTopToBaseline = null;
                    this.mMarginTop = 0;
                    this.mMarginTopGone = 0;
                    break;
                case BOTTOM_TO_TOP:
                case BOTTOM_TO_BOTTOM:
                case BOTTOM_TO_BASELINE:
                    this.mBottomToTop = null;
                    this.mBottomToBottom = null;
                    this.mBottomToBaseline = null;
                    this.mMarginBottom = 0;
                    this.mMarginBottomGone = 0;
                    break;
                case BASELINE_TO_BASELINE:
                    this.mBaselineToBaseline = null;
                    break;
                case CIRCULAR_CONSTRAINT:
                    this.mCircularConstraint = null;
                    break;
            }
        } else {
            clearAll();
        }
        return this;
    }

    private ConstraintWidget getTarget(Object target) {
        if (target instanceof Reference) {
            return ((Reference) target).getConstraintWidget();
        }
        return null;
    }

    private void applyConnection(ConstraintWidget widget, Object opaqueTarget, State.Constraint type) {
        ConstraintWidget target = getTarget(opaqueTarget);
        if (target != null) {
            int i = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[type.ordinal()];
            switch (type) {
                case LEFT_TO_LEFT:
                    widget.getAnchor(ConstraintAnchor.Type.LEFT).connect(target.getAnchor(ConstraintAnchor.Type.LEFT), this.mMarginLeft, this.mMarginLeftGone, false);
                    return;
                case LEFT_TO_RIGHT:
                    widget.getAnchor(ConstraintAnchor.Type.LEFT).connect(target.getAnchor(ConstraintAnchor.Type.RIGHT), this.mMarginLeft, this.mMarginLeftGone, false);
                    return;
                case RIGHT_TO_LEFT:
                    widget.getAnchor(ConstraintAnchor.Type.RIGHT).connect(target.getAnchor(ConstraintAnchor.Type.LEFT), this.mMarginRight, this.mMarginRightGone, false);
                    return;
                case RIGHT_TO_RIGHT:
                    widget.getAnchor(ConstraintAnchor.Type.RIGHT).connect(target.getAnchor(ConstraintAnchor.Type.RIGHT), this.mMarginRight, this.mMarginRightGone, false);
                    return;
                case START_TO_START:
                    widget.getAnchor(ConstraintAnchor.Type.LEFT).connect(target.getAnchor(ConstraintAnchor.Type.LEFT), this.mMarginStart, this.mMarginStartGone, false);
                    return;
                case START_TO_END:
                    widget.getAnchor(ConstraintAnchor.Type.LEFT).connect(target.getAnchor(ConstraintAnchor.Type.RIGHT), this.mMarginStart, this.mMarginStartGone, false);
                    return;
                case END_TO_START:
                    widget.getAnchor(ConstraintAnchor.Type.RIGHT).connect(target.getAnchor(ConstraintAnchor.Type.LEFT), this.mMarginEnd, this.mMarginEndGone, false);
                    return;
                case END_TO_END:
                    widget.getAnchor(ConstraintAnchor.Type.RIGHT).connect(target.getAnchor(ConstraintAnchor.Type.RIGHT), this.mMarginEnd, this.mMarginEndGone, false);
                    return;
                case TOP_TO_TOP:
                    widget.getAnchor(ConstraintAnchor.Type.TOP).connect(target.getAnchor(ConstraintAnchor.Type.TOP), this.mMarginTop, this.mMarginTopGone, false);
                    return;
                case TOP_TO_BOTTOM:
                    widget.getAnchor(ConstraintAnchor.Type.TOP).connect(target.getAnchor(ConstraintAnchor.Type.BOTTOM), this.mMarginTop, this.mMarginTopGone, false);
                    return;
                case TOP_TO_BASELINE:
                    widget.immediateConnect(ConstraintAnchor.Type.TOP, target, ConstraintAnchor.Type.BASELINE, this.mMarginTop, this.mMarginTopGone);
                    return;
                case BOTTOM_TO_TOP:
                    widget.getAnchor(ConstraintAnchor.Type.BOTTOM).connect(target.getAnchor(ConstraintAnchor.Type.TOP), this.mMarginBottom, this.mMarginBottomGone, false);
                    return;
                case BOTTOM_TO_BOTTOM:
                    widget.getAnchor(ConstraintAnchor.Type.BOTTOM).connect(target.getAnchor(ConstraintAnchor.Type.BOTTOM), this.mMarginBottom, this.mMarginBottomGone, false);
                    return;
                case BOTTOM_TO_BASELINE:
                    widget.immediateConnect(ConstraintAnchor.Type.BOTTOM, target, ConstraintAnchor.Type.BASELINE, this.mMarginBottom, this.mMarginBottomGone);
                    return;
                case BASELINE_TO_BOTTOM:
                    widget.immediateConnect(ConstraintAnchor.Type.BASELINE, target, ConstraintAnchor.Type.BOTTOM, this.mMarginBaseline, this.mMarginBaselineGone);
                    return;
                case BASELINE_TO_TOP:
                    widget.immediateConnect(ConstraintAnchor.Type.BASELINE, target, ConstraintAnchor.Type.TOP, this.mMarginBaseline, this.mMarginBaselineGone);
                    return;
                case BASELINE_TO_BASELINE:
                    widget.immediateConnect(ConstraintAnchor.Type.BASELINE, target, ConstraintAnchor.Type.BASELINE, this.mMarginBaseline, this.mMarginBaselineGone);
                    return;
                case CIRCULAR_CONSTRAINT:
                    widget.connectCircularConstraint(target, this.mCircularAngle, (int) this.mCircularDistance);
                    return;
                default:
                    return;
            }
        }
    }

    public void applyWidgetConstraints() {
        applyConnection(this.mConstraintWidget, this.mLeftToLeft, State.Constraint.LEFT_TO_LEFT);
        applyConnection(this.mConstraintWidget, this.mLeftToRight, State.Constraint.LEFT_TO_RIGHT);
        applyConnection(this.mConstraintWidget, this.mRightToLeft, State.Constraint.RIGHT_TO_LEFT);
        applyConnection(this.mConstraintWidget, this.mRightToRight, State.Constraint.RIGHT_TO_RIGHT);
        applyConnection(this.mConstraintWidget, this.mStartToStart, State.Constraint.START_TO_START);
        applyConnection(this.mConstraintWidget, this.mStartToEnd, State.Constraint.START_TO_END);
        applyConnection(this.mConstraintWidget, this.mEndToStart, State.Constraint.END_TO_START);
        applyConnection(this.mConstraintWidget, this.mEndToEnd, State.Constraint.END_TO_END);
        applyConnection(this.mConstraintWidget, this.mTopToTop, State.Constraint.TOP_TO_TOP);
        applyConnection(this.mConstraintWidget, this.mTopToBottom, State.Constraint.TOP_TO_BOTTOM);
        applyConnection(this.mConstraintWidget, this.mTopToBaseline, State.Constraint.TOP_TO_BASELINE);
        applyConnection(this.mConstraintWidget, this.mBottomToTop, State.Constraint.BOTTOM_TO_TOP);
        applyConnection(this.mConstraintWidget, this.mBottomToBottom, State.Constraint.BOTTOM_TO_BOTTOM);
        applyConnection(this.mConstraintWidget, this.mBottomToBaseline, State.Constraint.BOTTOM_TO_BASELINE);
        applyConnection(this.mConstraintWidget, this.mBaselineToBaseline, State.Constraint.BASELINE_TO_BASELINE);
        applyConnection(this.mConstraintWidget, this.mBaselineToTop, State.Constraint.BASELINE_TO_TOP);
        applyConnection(this.mConstraintWidget, this.mBaselineToBottom, State.Constraint.BASELINE_TO_BOTTOM);
        applyConnection(this.mConstraintWidget, this.mCircularConstraint, State.Constraint.CIRCULAR_CONSTRAINT);
    }

    public void apply() {
        if (this.mConstraintWidget != null) {
            if (this.mFacade != null) {
                this.mFacade.apply();
            }
            this.mHorizontalDimension.apply(this.mState, this.mConstraintWidget, 0);
            this.mVerticalDimension.apply(this.mState, this.mConstraintWidget, 1);
            dereference();
            applyWidgetConstraints();
            if (this.mHorizontalChainStyle != 0) {
                this.mConstraintWidget.setHorizontalChainStyle(this.mHorizontalChainStyle);
            }
            if (this.mVerticalChainStyle != 0) {
                this.mConstraintWidget.setVerticalChainStyle(this.mVerticalChainStyle);
            }
            if (this.mHorizontalChainWeight != -1.0f) {
                this.mConstraintWidget.setHorizontalWeight(this.mHorizontalChainWeight);
            }
            if (this.mVerticalChainWeight != -1.0f) {
                this.mConstraintWidget.setVerticalWeight(this.mVerticalChainWeight);
            }
            this.mConstraintWidget.setHorizontalBiasPercent(this.mHorizontalBias);
            this.mConstraintWidget.setVerticalBiasPercent(this.mVerticalBias);
            this.mConstraintWidget.frame.pivotX = this.mPivotX;
            this.mConstraintWidget.frame.pivotY = this.mPivotY;
            this.mConstraintWidget.frame.rotationX = this.mRotationX;
            this.mConstraintWidget.frame.rotationY = this.mRotationY;
            this.mConstraintWidget.frame.rotationZ = this.mRotationZ;
            this.mConstraintWidget.frame.translationX = this.mTranslationX;
            this.mConstraintWidget.frame.translationY = this.mTranslationY;
            this.mConstraintWidget.frame.translationZ = this.mTranslationZ;
            this.mConstraintWidget.frame.scaleX = this.mScaleX;
            this.mConstraintWidget.frame.scaleY = this.mScaleY;
            this.mConstraintWidget.frame.alpha = this.mAlpha;
            this.mConstraintWidget.frame.visibility = this.mVisibility;
            this.mConstraintWidget.setVisibility(this.mVisibility);
            this.mConstraintWidget.frame.setMotionAttributes(this.mMotionProperties);
            if (this.mCustomColors != null) {
                for (String key : this.mCustomColors.keySet()) {
                    this.mConstraintWidget.frame.setCustomAttribute(key, (int) TypedValues.Custom.TYPE_COLOR, this.mCustomColors.get(key).intValue());
                }
            }
            if (this.mCustomFloats != null) {
                for (String key2 : this.mCustomFloats.keySet()) {
                    this.mConstraintWidget.frame.setCustomAttribute(key2, (int) TypedValues.Custom.TYPE_FLOAT, this.mCustomFloats.get(key2).floatValue());
                }
            }
        }
    }
}
