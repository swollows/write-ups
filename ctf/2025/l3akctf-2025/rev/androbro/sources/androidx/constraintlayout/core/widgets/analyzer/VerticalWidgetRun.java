package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

public class VerticalWidgetRun extends WidgetRun {
    private static final boolean FORCE_USE = true;
    public DependencyNode baseline = new DependencyNode(this);
    DimensionDependency mBaselineDimension = null;

    public VerticalWidgetRun(ConstraintWidget widget) {
        super(widget);
        this.start.mType = DependencyNode.Type.TOP;
        this.end.mType = DependencyNode.Type.BOTTOM;
        this.baseline.mType = DependencyNode.Type.BASELINE;
        this.orientation = 1;
    }

    public String toString() {
        return "VerticalRun " + this.mWidget.getDebugName();
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        this.mRunGroup = null;
        this.start.clear();
        this.end.clear();
        this.baseline.clear();
        this.mDimension.clear();
        this.mResolved = false;
    }

    /* access modifiers changed from: package-private */
    public void reset() {
        this.mResolved = false;
        this.start.clear();
        this.start.resolved = false;
        this.end.clear();
        this.end.resolved = false;
        this.baseline.clear();
        this.baseline.resolved = false;
        this.mDimension.resolved = false;
    }

    /* access modifiers changed from: package-private */
    public boolean supportsWrapComputation() {
        if (this.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.mWidget.mMatchConstraintDefaultHeight == 0) {
            return true;
        }
        return false;
    }

    public void update(Dependency dependency) {
        switch (this.mRunType) {
            case START:
                updateRunStart(dependency);
                break;
            case END:
                updateRunEnd(dependency);
                break;
            case CENTER:
                updateRunCenter(dependency, this.mWidget.mTop, this.mWidget.mBottom, 1);
                return;
        }
        if (this.mDimension.readyToSolve && !this.mDimension.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            switch (this.mWidget.mMatchConstraintDefaultHeight) {
                case 2:
                    ConstraintWidget parent = this.mWidget.getParent();
                    if (parent != null && parent.mVerticalRun.mDimension.resolved) {
                        float percent = this.mWidget.mMatchConstraintPercentHeight;
                        this.mDimension.resolve((int) ((((float) parent.mVerticalRun.mDimension.value) * percent) + 0.5f));
                        break;
                    }
                case 3:
                    if (this.mWidget.mHorizontalRun.mDimension.resolved) {
                        int size = 0;
                        switch (this.mWidget.getDimensionRatioSide()) {
                            case -1:
                                size = (int) ((((float) this.mWidget.mHorizontalRun.mDimension.value) / this.mWidget.getDimensionRatio()) + 0.5f);
                                break;
                            case 0:
                                size = (int) ((((float) this.mWidget.mHorizontalRun.mDimension.value) * this.mWidget.getDimensionRatio()) + 0.5f);
                                break;
                            case 1:
                                size = (int) ((((float) this.mWidget.mHorizontalRun.mDimension.value) / this.mWidget.getDimensionRatio()) + 0.5f);
                                break;
                        }
                        this.mDimension.resolve(size);
                        break;
                    }
                    break;
            }
        }
        if (this.start.readyToSolve && this.end.readyToSolve) {
            if (this.start.resolved && this.end.resolved && this.mDimension.resolved) {
                return;
            }
            if (this.mDimension.resolved || this.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.mWidget.mMatchConstraintDefaultWidth != 0 || this.mWidget.isInVerticalChain()) {
                if (!this.mDimension.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.matchConstraintsType == 1 && this.start.mTargets.size() > 0 && this.end.mTargets.size() > 0) {
                    int availableSpace = (this.end.mTargets.get(0).value + this.end.mMargin) - (this.start.mTargets.get(0).value + this.start.mMargin);
                    if (availableSpace < this.mDimension.wrapValue) {
                        this.mDimension.resolve(availableSpace);
                    } else {
                        this.mDimension.resolve(this.mDimension.wrapValue);
                    }
                }
                if (this.mDimension.resolved && this.start.mTargets.size() > 0 && this.end.mTargets.size() > 0) {
                    DependencyNode startTarget = this.start.mTargets.get(0);
                    DependencyNode endTarget = this.end.mTargets.get(0);
                    int startPos = startTarget.value + this.start.mMargin;
                    int endPos = endTarget.value + this.end.mMargin;
                    float bias = this.mWidget.getVerticalBiasPercent();
                    if (startTarget == endTarget) {
                        startPos = startTarget.value;
                        endPos = endTarget.value;
                        bias = 0.5f;
                    }
                    this.start.resolve((int) (((float) startPos) + 0.5f + (((float) ((endPos - startPos) - this.mDimension.value)) * bias)));
                    this.end.resolve(this.start.value + this.mDimension.value);
                    return;
                }
                return;
            }
            int startPos2 = this.start.mTargets.get(0).value + this.start.mMargin;
            int endPos2 = this.end.mTargets.get(0).value + this.end.mMargin;
            this.start.resolve(startPos2);
            this.end.resolve(endPos2);
            this.mDimension.resolve(endPos2 - startPos2);
        }
    }

    /* access modifiers changed from: package-private */
    public void apply() {
        ConstraintWidget parent;
        ConstraintWidget parent2;
        if (this.mWidget.measured) {
            this.mDimension.resolve(this.mWidget.getHeight());
        }
        if (!this.mDimension.resolved) {
            this.mDimensionBehavior = this.mWidget.getVerticalDimensionBehaviour();
            if (this.mWidget.hasBaseline()) {
                this.mBaselineDimension = new BaselineDimensionDependency(this);
            }
            if (this.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (parent2 = this.mWidget.getParent()) != null && parent2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int resolvedDimension = (parent2.getHeight() - this.mWidget.mTop.getMargin()) - this.mWidget.mBottom.getMargin();
                    addTarget(this.start, parent2.mVerticalRun.start, this.mWidget.mTop.getMargin());
                    addTarget(this.end, parent2.mVerticalRun.end, -this.mWidget.mBottom.getMargin());
                    this.mDimension.resolve(resolvedDimension);
                    return;
                } else if (this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.mDimension.resolve(this.mWidget.getHeight());
                }
            }
        } else if (this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (parent = this.mWidget.getParent()) != null && parent.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED) {
            addTarget(this.start, parent.mVerticalRun.start, this.mWidget.mTop.getMargin());
            addTarget(this.end, parent.mVerticalRun.end, -this.mWidget.mBottom.getMargin());
            return;
        }
        if (!this.mDimension.resolved || !this.mWidget.measured) {
            if (!this.mDimension.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                switch (this.mWidget.mMatchConstraintDefaultHeight) {
                    case 2:
                        ConstraintWidget parent3 = this.mWidget.getParent();
                        if (parent3 != null) {
                            DependencyNode targetDimension = parent3.mVerticalRun.mDimension;
                            this.mDimension.mTargets.add(targetDimension);
                            targetDimension.mDependencies.add(this.mDimension);
                            this.mDimension.delegateToWidgetRun = true;
                            this.mDimension.mDependencies.add(this.start);
                            this.mDimension.mDependencies.add(this.end);
                            break;
                        }
                        break;
                    case 3:
                        if (!this.mWidget.isInVerticalChain() && this.mWidget.mMatchConstraintDefaultWidth != 3) {
                            DependencyNode targetDimension2 = this.mWidget.mHorizontalRun.mDimension;
                            this.mDimension.mTargets.add(targetDimension2);
                            targetDimension2.mDependencies.add(this.mDimension);
                            this.mDimension.delegateToWidgetRun = true;
                            this.mDimension.mDependencies.add(this.start);
                            this.mDimension.mDependencies.add(this.end);
                            break;
                        }
                }
            } else {
                this.mDimension.addDependency(this);
            }
            if (this.mWidget.mListAnchors[2].mTarget != null && this.mWidget.mListAnchors[3].mTarget != null) {
                if (this.mWidget.isInVerticalChain()) {
                    this.start.mMargin = this.mWidget.mListAnchors[2].getMargin();
                    this.end.mMargin = -this.mWidget.mListAnchors[3].getMargin();
                } else {
                    DependencyNode startTarget = getTarget(this.mWidget.mListAnchors[2]);
                    DependencyNode endTarget = getTarget(this.mWidget.mListAnchors[3]);
                    if (startTarget != null) {
                        startTarget.addDependency(this);
                    }
                    if (endTarget != null) {
                        endTarget.addDependency(this);
                    }
                    this.mRunType = WidgetRun.RunType.CENTER;
                }
                if (this.mWidget.hasBaseline()) {
                    addTarget(this.baseline, this.start, 1, this.mBaselineDimension);
                }
            } else if (this.mWidget.mListAnchors[2].mTarget != null) {
                DependencyNode target = getTarget(this.mWidget.mListAnchors[2]);
                if (target != null) {
                    addTarget(this.start, target, this.mWidget.mListAnchors[2].getMargin());
                    addTarget(this.end, this.start, 1, this.mDimension);
                    if (this.mWidget.hasBaseline()) {
                        addTarget(this.baseline, this.start, 1, this.mBaselineDimension);
                    }
                    if (this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.mWidget.getDimensionRatio() > 0.0f && this.mWidget.mHorizontalRun.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        this.mWidget.mHorizontalRun.mDimension.mDependencies.add(this.mDimension);
                        this.mDimension.mTargets.add(this.mWidget.mHorizontalRun.mDimension);
                        this.mDimension.updateDelegate = this;
                    }
                }
            } else if (this.mWidget.mListAnchors[3].mTarget != null) {
                DependencyNode target2 = getTarget(this.mWidget.mListAnchors[3]);
                if (target2 != null) {
                    addTarget(this.end, target2, -this.mWidget.mListAnchors[3].getMargin());
                    addTarget(this.start, this.end, -1, this.mDimension);
                    if (this.mWidget.hasBaseline()) {
                        addTarget(this.baseline, this.start, 1, this.mBaselineDimension);
                    }
                }
            } else if (this.mWidget.mListAnchors[4].mTarget != null) {
                DependencyNode target3 = getTarget(this.mWidget.mListAnchors[4]);
                if (target3 != null) {
                    addTarget(this.baseline, target3, 0);
                    addTarget(this.start, this.baseline, -1, this.mBaselineDimension);
                    addTarget(this.end, this.start, 1, this.mDimension);
                }
            } else if (!(this.mWidget instanceof Helper) && this.mWidget.getParent() != null) {
                addTarget(this.start, this.mWidget.getParent().mVerticalRun.start, this.mWidget.getY());
                addTarget(this.end, this.start, 1, this.mDimension);
                if (this.mWidget.hasBaseline()) {
                    addTarget(this.baseline, this.start, 1, this.mBaselineDimension);
                }
                if (this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.mWidget.getDimensionRatio() > 0.0f && this.mWidget.mHorizontalRun.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mWidget.mHorizontalRun.mDimension.mDependencies.add(this.mDimension);
                    this.mDimension.mTargets.add(this.mWidget.mHorizontalRun.mDimension);
                    this.mDimension.updateDelegate = this;
                }
            }
            if (this.mDimension.mTargets.size() == 0) {
                this.mDimension.readyToSolve = true;
            }
        } else if (this.mWidget.mListAnchors[2].mTarget != null && this.mWidget.mListAnchors[3].mTarget != null) {
            if (this.mWidget.isInVerticalChain()) {
                this.start.mMargin = this.mWidget.mListAnchors[2].getMargin();
                this.end.mMargin = -this.mWidget.mListAnchors[3].getMargin();
            } else {
                DependencyNode startTarget2 = getTarget(this.mWidget.mListAnchors[2]);
                if (startTarget2 != null) {
                    addTarget(this.start, startTarget2, this.mWidget.mListAnchors[2].getMargin());
                }
                DependencyNode endTarget2 = getTarget(this.mWidget.mListAnchors[3]);
                if (endTarget2 != null) {
                    addTarget(this.end, endTarget2, -this.mWidget.mListAnchors[3].getMargin());
                }
                this.start.delegateToWidgetRun = true;
                this.end.delegateToWidgetRun = true;
            }
            if (this.mWidget.hasBaseline()) {
                addTarget(this.baseline, this.start, this.mWidget.getBaselineDistance());
            }
        } else if (this.mWidget.mListAnchors[2].mTarget != null) {
            DependencyNode target4 = getTarget(this.mWidget.mListAnchors[2]);
            if (target4 != null) {
                addTarget(this.start, target4, this.mWidget.mListAnchors[2].getMargin());
                addTarget(this.end, this.start, this.mDimension.value);
                if (this.mWidget.hasBaseline()) {
                    addTarget(this.baseline, this.start, this.mWidget.getBaselineDistance());
                }
            }
        } else if (this.mWidget.mListAnchors[3].mTarget != null) {
            DependencyNode target5 = getTarget(this.mWidget.mListAnchors[3]);
            if (target5 != null) {
                addTarget(this.end, target5, -this.mWidget.mListAnchors[3].getMargin());
                addTarget(this.start, this.end, -this.mDimension.value);
            }
            if (this.mWidget.hasBaseline()) {
                addTarget(this.baseline, this.start, this.mWidget.getBaselineDistance());
            }
        } else if (this.mWidget.mListAnchors[4].mTarget != null) {
            DependencyNode target6 = getTarget(this.mWidget.mListAnchors[4]);
            if (target6 != null) {
                addTarget(this.baseline, target6, 0);
                addTarget(this.start, this.baseline, -this.mWidget.getBaselineDistance());
                addTarget(this.end, this.start, this.mDimension.value);
            }
        } else if (!(this.mWidget instanceof Helper) && this.mWidget.getParent() != null && this.mWidget.getAnchor(ConstraintAnchor.Type.CENTER).mTarget == null) {
            addTarget(this.start, this.mWidget.getParent().mVerticalRun.start, this.mWidget.getY());
            addTarget(this.end, this.start, this.mDimension.value);
            if (this.mWidget.hasBaseline()) {
                addTarget(this.baseline, this.start, this.mWidget.getBaselineDistance());
            }
        }
    }

    public void applyToWidget() {
        if (this.start.resolved) {
            this.mWidget.setY(this.start.value);
        }
    }
}
