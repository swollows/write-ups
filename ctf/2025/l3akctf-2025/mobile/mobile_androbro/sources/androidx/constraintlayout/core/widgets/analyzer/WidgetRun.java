package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public abstract class WidgetRun implements Dependency {
    public DependencyNode end = new DependencyNode(this);
    DimensionDependency mDimension = new DimensionDependency(this);
    protected ConstraintWidget.DimensionBehaviour mDimensionBehavior;
    boolean mResolved = false;
    RunGroup mRunGroup;
    protected RunType mRunType = RunType.NONE;
    ConstraintWidget mWidget;
    public int matchConstraintsType;
    public int orientation = 0;
    public DependencyNode start = new DependencyNode(this);

    enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    /* access modifiers changed from: package-private */
    public abstract void apply();

    /* access modifiers changed from: package-private */
    public abstract void applyToWidget();

    /* access modifiers changed from: package-private */
    public abstract void clear();

    /* access modifiers changed from: package-private */
    public abstract void reset();

    /* access modifiers changed from: package-private */
    public abstract boolean supportsWrapComputation();

    public WidgetRun(ConstraintWidget widget) {
        this.mWidget = widget;
    }

    public boolean isDimensionResolved() {
        return this.mDimension.resolved;
    }

    public boolean isCenterConnection() {
        int connections = 0;
        int count = this.start.mTargets.size();
        for (int i = 0; i < count; i++) {
            if (this.start.mTargets.get(i).mRun != this) {
                connections++;
            }
        }
        int count2 = this.end.mTargets.size();
        for (int i2 = 0; i2 < count2; i2++) {
            if (this.end.mTargets.get(i2).mRun != this) {
                connections++;
            }
        }
        return connections >= 2;
    }

    public long wrapSize(int direction) {
        if (!this.mDimension.resolved) {
            return 0;
        }
        long size = (long) this.mDimension.value;
        if (isCenterConnection()) {
            return size + ((long) (this.start.mMargin - this.end.mMargin));
        }
        if (direction == 0) {
            return size + ((long) this.start.mMargin);
        }
        return size - ((long) this.end.mMargin);
    }

    /* access modifiers changed from: protected */
    public final DependencyNode getTarget(ConstraintAnchor anchor) {
        if (anchor.mTarget == null) {
            return null;
        }
        ConstraintWidget targetWidget = anchor.mTarget.mOwner;
        switch (anchor.mTarget.mType) {
            case LEFT:
                return targetWidget.mHorizontalRun.start;
            case RIGHT:
                return targetWidget.mHorizontalRun.end;
            case TOP:
                return targetWidget.mVerticalRun.start;
            case BASELINE:
                return targetWidget.mVerticalRun.baseline;
            case BOTTOM:
                return targetWidget.mVerticalRun.end;
            default:
                return null;
        }
    }

    /* access modifiers changed from: protected */
    public void updateRunCenter(Dependency dependency, ConstraintAnchor startAnchor, ConstraintAnchor endAnchor, int orientation2) {
        float bias;
        DependencyNode startTarget = getTarget(startAnchor);
        DependencyNode endTarget = getTarget(endAnchor);
        if (startTarget.resolved && endTarget.resolved) {
            int startPos = startTarget.value + startAnchor.getMargin();
            int endPos = endTarget.value - endAnchor.getMargin();
            int distance = endPos - startPos;
            if (!this.mDimension.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                resolveDimension(orientation2, distance);
            }
            if (this.mDimension.resolved) {
                if (this.mDimension.value == distance) {
                    this.start.resolve(startPos);
                    this.end.resolve(endPos);
                    return;
                }
                if (orientation2 == 0) {
                    bias = this.mWidget.getHorizontalBiasPercent();
                } else {
                    bias = this.mWidget.getVerticalBiasPercent();
                }
                if (startTarget == endTarget) {
                    startPos = startTarget.value;
                    endPos = endTarget.value;
                    bias = 0.5f;
                }
                this.start.resolve((int) (((float) startPos) + 0.5f + (((float) ((endPos - startPos) - this.mDimension.value)) * bias)));
                this.end.resolve(this.start.value + this.mDimension.value);
            }
        }
    }

    private void resolveDimension(int orientation2, int distance) {
        WidgetRun run;
        float percent;
        int value;
        switch (this.matchConstraintsType) {
            case 0:
                this.mDimension.resolve(getLimitedDimension(distance, orientation2));
                return;
            case 1:
                this.mDimension.resolve(Math.min(getLimitedDimension(this.mDimension.wrapValue, orientation2), distance));
                return;
            case 2:
                ConstraintWidget parent = this.mWidget.getParent();
                if (parent != null) {
                    if (orientation2 == 0) {
                        run = parent.mHorizontalRun;
                    } else {
                        run = parent.mVerticalRun;
                    }
                    if (run.mDimension.resolved) {
                        if (orientation2 == 0) {
                            percent = this.mWidget.mMatchConstraintPercentWidth;
                        } else {
                            percent = this.mWidget.mMatchConstraintPercentHeight;
                        }
                        this.mDimension.resolve(getLimitedDimension((int) ((((float) run.mDimension.value) * percent) + 0.5f), orientation2));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (this.mWidget.mHorizontalRun.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.mWidget.mHorizontalRun.matchConstraintsType != 3 || this.mWidget.mVerticalRun.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.mWidget.mVerticalRun.matchConstraintsType != 3) {
                    WidgetRun run2 = orientation2 == 0 ? this.mWidget.mVerticalRun : this.mWidget.mHorizontalRun;
                    if (run2.mDimension.resolved) {
                        float ratio = this.mWidget.getDimensionRatio();
                        if (orientation2 == 1) {
                            value = (int) ((((float) run2.mDimension.value) / ratio) + 0.5f);
                        } else {
                            value = (int) ((((float) run2.mDimension.value) * ratio) + 0.5f);
                        }
                        this.mDimension.resolve(value);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void updateRunStart(Dependency dependency) {
    }

    /* access modifiers changed from: protected */
    public void updateRunEnd(Dependency dependency) {
    }

    public void update(Dependency dependency) {
    }

    /* access modifiers changed from: protected */
    public final int getLimitedDimension(int dimension, int orientation2) {
        if (orientation2 == 0) {
            int max = this.mWidget.mMatchConstraintMaxWidth;
            int value = Math.max(this.mWidget.mMatchConstraintMinWidth, dimension);
            if (max > 0) {
                value = Math.min(max, dimension);
            }
            if (value != dimension) {
                return value;
            }
            return dimension;
        }
        int max2 = this.mWidget.mMatchConstraintMaxHeight;
        int value2 = Math.max(this.mWidget.mMatchConstraintMinHeight, dimension);
        if (max2 > 0) {
            value2 = Math.min(max2, dimension);
        }
        if (value2 != dimension) {
            return value2;
        }
        return dimension;
    }

    /* access modifiers changed from: protected */
    public final DependencyNode getTarget(ConstraintAnchor anchor, int orientation2) {
        if (anchor.mTarget == null) {
            return null;
        }
        ConstraintWidget targetWidget = anchor.mTarget.mOwner;
        WidgetRun run = orientation2 == 0 ? targetWidget.mHorizontalRun : targetWidget.mVerticalRun;
        switch (anchor.mTarget.mType) {
            case LEFT:
            case TOP:
                return run.start;
            case RIGHT:
            case BOTTOM:
                return run.end;
            default:
                return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void addTarget(DependencyNode node, DependencyNode target, int margin) {
        node.mTargets.add(target);
        node.mMargin = margin;
        target.mDependencies.add(node);
    }

    /* access modifiers changed from: protected */
    public final void addTarget(DependencyNode node, DependencyNode target, int marginFactor, DimensionDependency dimensionDependency) {
        node.mTargets.add(target);
        node.mTargets.add(this.mDimension);
        node.mMarginFactor = marginFactor;
        node.mMarginDependency = dimensionDependency;
        target.mDependencies.add(node);
        dimensionDependency.mDependencies.add(node);
    }

    public long getWrapDimension() {
        if (this.mDimension.resolved) {
            return (long) this.mDimension.value;
        }
        return 0;
    }

    public boolean isResolved() {
        return this.mResolved;
    }
}
