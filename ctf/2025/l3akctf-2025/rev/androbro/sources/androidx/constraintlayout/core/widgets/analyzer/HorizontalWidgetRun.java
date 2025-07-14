package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

public class HorizontalWidgetRun extends WidgetRun {
    private static int[] sTempDimensions = new int[2];

    public HorizontalWidgetRun(ConstraintWidget widget) {
        super(widget);
        this.start.mType = DependencyNode.Type.LEFT;
        this.end.mType = DependencyNode.Type.RIGHT;
        this.orientation = 0;
    }

    public String toString() {
        return "HorizontalRun " + this.mWidget.getDebugName();
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        this.mRunGroup = null;
        this.start.clear();
        this.end.clear();
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
        this.mDimension.resolved = false;
    }

    /* access modifiers changed from: package-private */
    public boolean supportsWrapComputation() {
        if (this.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.mWidget.mMatchConstraintDefaultWidth == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void apply() {
        ConstraintWidget parent;
        ConstraintWidget parent2;
        if (this.mWidget.measured) {
            this.mDimension.resolve(this.mWidget.getWidth());
        }
        if (!this.mDimension.resolved) {
            this.mDimensionBehavior = this.mWidget.getHorizontalDimensionBehaviour();
            if (this.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (parent2 = this.mWidget.getParent()) != null && (parent2.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED || parent2.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_PARENT)) {
                    int resolvedDimension = (parent2.getWidth() - this.mWidget.mLeft.getMargin()) - this.mWidget.mRight.getMargin();
                    addTarget(this.start, parent2.mHorizontalRun.start, this.mWidget.mLeft.getMargin());
                    addTarget(this.end, parent2.mHorizontalRun.end, -this.mWidget.mRight.getMargin());
                    this.mDimension.resolve(resolvedDimension);
                    return;
                } else if (this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.mDimension.resolve(this.mWidget.getWidth());
                }
            }
        } else if (this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (parent = this.mWidget.getParent()) != null && (parent.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED || parent.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_PARENT)) {
            addTarget(this.start, parent.mHorizontalRun.start, this.mWidget.mLeft.getMargin());
            addTarget(this.end, parent.mHorizontalRun.end, -this.mWidget.mRight.getMargin());
            return;
        }
        if (!this.mDimension.resolved || !this.mWidget.measured) {
            if (this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                switch (this.mWidget.mMatchConstraintDefaultWidth) {
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
                        if (this.mWidget.mMatchConstraintDefaultHeight != 3) {
                            DependencyNode targetDimension2 = this.mWidget.mVerticalRun.mDimension;
                            this.mDimension.mTargets.add(targetDimension2);
                            targetDimension2.mDependencies.add(this.mDimension);
                            this.mWidget.mVerticalRun.start.mDependencies.add(this.mDimension);
                            this.mWidget.mVerticalRun.end.mDependencies.add(this.mDimension);
                            this.mDimension.delegateToWidgetRun = true;
                            this.mDimension.mDependencies.add(this.start);
                            this.mDimension.mDependencies.add(this.end);
                            this.start.mTargets.add(this.mDimension);
                            this.end.mTargets.add(this.mDimension);
                            break;
                        } else {
                            this.start.updateDelegate = this;
                            this.end.updateDelegate = this;
                            this.mWidget.mVerticalRun.start.updateDelegate = this;
                            this.mWidget.mVerticalRun.end.updateDelegate = this;
                            this.mDimension.updateDelegate = this;
                            if (!this.mWidget.isInVerticalChain()) {
                                if (!this.mWidget.isInHorizontalChain()) {
                                    this.mWidget.mVerticalRun.mDimension.mTargets.add(this.mDimension);
                                    break;
                                } else {
                                    this.mWidget.mVerticalRun.mDimension.mTargets.add(this.mDimension);
                                    this.mDimension.mDependencies.add(this.mWidget.mVerticalRun.mDimension);
                                    break;
                                }
                            } else {
                                this.mDimension.mTargets.add(this.mWidget.mVerticalRun.mDimension);
                                this.mWidget.mVerticalRun.mDimension.mDependencies.add(this.mDimension);
                                this.mWidget.mVerticalRun.mDimension.updateDelegate = this;
                                this.mDimension.mTargets.add(this.mWidget.mVerticalRun.start);
                                this.mDimension.mTargets.add(this.mWidget.mVerticalRun.end);
                                this.mWidget.mVerticalRun.start.mDependencies.add(this.mDimension);
                                this.mWidget.mVerticalRun.end.mDependencies.add(this.mDimension);
                                break;
                            }
                        }
                }
            }
            if (this.mWidget.mListAnchors[0].mTarget == null || this.mWidget.mListAnchors[1].mTarget == null) {
                if (this.mWidget.mListAnchors[0].mTarget != null) {
                    DependencyNode target = getTarget(this.mWidget.mListAnchors[0]);
                    if (target != null) {
                        addTarget(this.start, target, this.mWidget.mListAnchors[0].getMargin());
                        addTarget(this.end, this.start, 1, this.mDimension);
                    }
                } else if (this.mWidget.mListAnchors[1].mTarget != null) {
                    DependencyNode target2 = getTarget(this.mWidget.mListAnchors[1]);
                    if (target2 != null) {
                        addTarget(this.end, target2, -this.mWidget.mListAnchors[1].getMargin());
                        addTarget(this.start, this.end, -1, this.mDimension);
                    }
                } else if (!(this.mWidget instanceof Helper) && this.mWidget.getParent() != null) {
                    addTarget(this.start, this.mWidget.getParent().mHorizontalRun.start, this.mWidget.getX());
                    addTarget(this.end, this.start, 1, this.mDimension);
                }
            } else if (this.mWidget.isInHorizontalChain()) {
                this.start.mMargin = this.mWidget.mListAnchors[0].getMargin();
                this.end.mMargin = -this.mWidget.mListAnchors[1].getMargin();
            } else {
                DependencyNode startTarget = getTarget(this.mWidget.mListAnchors[0]);
                DependencyNode endTarget = getTarget(this.mWidget.mListAnchors[1]);
                if (startTarget != null) {
                    startTarget.addDependency(this);
                }
                if (endTarget != null) {
                    endTarget.addDependency(this);
                }
                this.mRunType = WidgetRun.RunType.CENTER;
            }
        } else if (this.mWidget.mListAnchors[0].mTarget == null || this.mWidget.mListAnchors[1].mTarget == null) {
            if (this.mWidget.mListAnchors[0].mTarget != null) {
                DependencyNode target3 = getTarget(this.mWidget.mListAnchors[0]);
                if (target3 != null) {
                    addTarget(this.start, target3, this.mWidget.mListAnchors[0].getMargin());
                    addTarget(this.end, this.start, this.mDimension.value);
                }
            } else if (this.mWidget.mListAnchors[1].mTarget != null) {
                DependencyNode target4 = getTarget(this.mWidget.mListAnchors[1]);
                if (target4 != null) {
                    addTarget(this.end, target4, -this.mWidget.mListAnchors[1].getMargin());
                    addTarget(this.start, this.end, -this.mDimension.value);
                }
            } else if (!(this.mWidget instanceof Helper) && this.mWidget.getParent() != null && this.mWidget.getAnchor(ConstraintAnchor.Type.CENTER).mTarget == null) {
                addTarget(this.start, this.mWidget.getParent().mHorizontalRun.start, this.mWidget.getX());
                addTarget(this.end, this.start, this.mDimension.value);
            }
        } else if (this.mWidget.isInHorizontalChain()) {
            this.start.mMargin = this.mWidget.mListAnchors[0].getMargin();
            this.end.mMargin = -this.mWidget.mListAnchors[1].getMargin();
        } else {
            DependencyNode startTarget2 = getTarget(this.mWidget.mListAnchors[0]);
            if (startTarget2 != null) {
                addTarget(this.start, startTarget2, this.mWidget.mListAnchors[0].getMargin());
            }
            DependencyNode endTarget2 = getTarget(this.mWidget.mListAnchors[1]);
            if (endTarget2 != null) {
                addTarget(this.end, endTarget2, -this.mWidget.mListAnchors[1].getMargin());
            }
            this.start.delegateToWidgetRun = true;
            this.end.delegateToWidgetRun = true;
        }
    }

    private void computeInsetRatio(int[] dimensions, int x1, int x2, int y1, int y2, float ratio, int side) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        switch (side) {
            case -1:
                int candidateX1 = (int) ((((float) dy) * ratio) + 0.5f);
                int candidateY1 = dy;
                int candidateX2 = dx;
                int candidateY2 = (int) ((((float) dx) / ratio) + 0.5f);
                if (candidateX1 <= dx && candidateY1 <= dy) {
                    dimensions[0] = candidateX1;
                    dimensions[1] = candidateY1;
                    return;
                } else if (candidateX2 <= dx && candidateY2 <= dy) {
                    dimensions[0] = candidateX2;
                    dimensions[1] = candidateY2;
                    return;
                } else {
                    return;
                }
            case 0:
                dimensions[0] = (int) ((((float) dy) * ratio) + 0.5f);
                dimensions[1] = dy;
                return;
            case 1:
                dimensions[0] = dx;
                dimensions[1] = (int) ((((float) dx) * ratio) + 0.5f);
                return;
            default:
                return;
        }
    }

    public void update(Dependency dependency) {
        switch (this.mRunType) {
            case START:
                Dependency dependency2 = dependency;
                updateRunStart(dependency);
                break;
            case END:
                Dependency dependency3 = dependency;
                updateRunEnd(dependency);
                break;
            case CENTER:
                updateRunCenter(dependency, this.mWidget.mLeft, this.mWidget.mRight, 0);
                return;
            default:
                Dependency dependency4 = dependency;
                break;
        }
        if (!this.mDimension.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            switch (this.mWidget.mMatchConstraintDefaultWidth) {
                case 2:
                    ConstraintWidget parent = this.mWidget.getParent();
                    if (parent != null && parent.mHorizontalRun.mDimension.resolved) {
                        this.mDimension.resolve((int) ((((float) parent.mHorizontalRun.mDimension.value) * this.mWidget.mMatchConstraintPercentWidth) + 0.5f));
                        break;
                    }
                case 3:
                    if (this.mWidget.mMatchConstraintDefaultHeight != 0 && this.mWidget.mMatchConstraintDefaultHeight != 3) {
                        int size = 0;
                        switch (this.mWidget.getDimensionRatioSide()) {
                            case -1:
                                size = (int) ((((float) this.mWidget.mVerticalRun.mDimension.value) * this.mWidget.getDimensionRatio()) + 0.5f);
                                break;
                            case 0:
                                size = (int) ((((float) this.mWidget.mVerticalRun.mDimension.value) / this.mWidget.getDimensionRatio()) + 0.5f);
                                break;
                            case 1:
                                size = (int) ((((float) this.mWidget.mVerticalRun.mDimension.value) * this.mWidget.getDimensionRatio()) + 0.5f);
                                break;
                        }
                        this.mDimension.resolve(size);
                        break;
                    } else {
                        DependencyNode secondStart = this.mWidget.mVerticalRun.start;
                        DependencyNode secondEnd = this.mWidget.mVerticalRun.end;
                        boolean s1 = this.mWidget.mLeft.mTarget != null;
                        boolean s2 = this.mWidget.mTop.mTarget != null;
                        boolean e1 = this.mWidget.mRight.mTarget != null;
                        boolean e2 = this.mWidget.mBottom.mTarget != null;
                        int definedSide = this.mWidget.getDimensionRatioSide();
                        if (!s1 || !s2 || !e1 || !e2) {
                            if (s1 && e1) {
                                if (this.start.readyToSolve && this.end.readyToSolve) {
                                    float ratio = this.mWidget.getDimensionRatio();
                                    int x1 = this.start.mTargets.get(0).value + this.start.mMargin;
                                    int x2 = this.end.mTargets.get(0).value - this.end.mMargin;
                                    switch (definedSide) {
                                        case -1:
                                        case 0:
                                            int ldx = getLimitedDimension(x2 - x1, 0);
                                            int dy = (int) ((((float) ldx) * ratio) + 0.5f);
                                            int ldy = getLimitedDimension(dy, 1);
                                            if (dy != ldy) {
                                                ldx = (int) ((((float) ldy) / ratio) + 0.5f);
                                            }
                                            this.mDimension.resolve(ldx);
                                            this.mWidget.mVerticalRun.mDimension.resolve(ldy);
                                            break;
                                        case 1:
                                            int ldx2 = getLimitedDimension(x2 - x1, 0);
                                            int dy2 = (int) ((((float) ldx2) / ratio) + 0.5f);
                                            int ldy2 = getLimitedDimension(dy2, 1);
                                            if (dy2 != ldy2) {
                                                ldx2 = (int) ((((float) ldy2) * ratio) + 0.5f);
                                            }
                                            this.mDimension.resolve(ldx2);
                                            this.mWidget.mVerticalRun.mDimension.resolve(ldy2);
                                            break;
                                    }
                                } else {
                                    return;
                                }
                            } else if (s2 && e2) {
                                if (secondStart.readyToSolve && secondEnd.readyToSolve) {
                                    float ratio2 = this.mWidget.getDimensionRatio();
                                    int y1 = secondStart.mTargets.get(0).value + secondStart.mMargin;
                                    int y2 = secondEnd.mTargets.get(0).value - secondEnd.mMargin;
                                    switch (definedSide) {
                                        case -1:
                                        case 1:
                                            int ldy3 = getLimitedDimension(y2 - y1, 1);
                                            int dx = (int) ((((float) ldy3) / ratio2) + 0.5f);
                                            int ldx3 = getLimitedDimension(dx, 0);
                                            if (dx != ldx3) {
                                                ldy3 = (int) ((((float) ldx3) * ratio2) + 0.5f);
                                            }
                                            this.mDimension.resolve(ldx3);
                                            this.mWidget.mVerticalRun.mDimension.resolve(ldy3);
                                            break;
                                        case 0:
                                            int ldy4 = getLimitedDimension(y2 - y1, 1);
                                            int dx2 = (int) ((((float) ldy4) * ratio2) + 0.5f);
                                            int ldx4 = getLimitedDimension(dx2, 0);
                                            if (dx2 != ldx4) {
                                                ldy4 = (int) ((((float) ldx4) / ratio2) + 0.5f);
                                            }
                                            this.mDimension.resolve(ldx4);
                                            this.mWidget.mVerticalRun.mDimension.resolve(ldy4);
                                            break;
                                    }
                                } else {
                                    return;
                                }
                            }
                        } else {
                            float ratio3 = this.mWidget.getDimensionRatio();
                            if (!secondStart.resolved || !secondEnd.resolved) {
                                if (this.start.resolved && this.end.resolved) {
                                    if (secondStart.readyToSolve && secondEnd.readyToSolve) {
                                        computeInsetRatio(sTempDimensions, this.start.value + this.start.mMargin, this.end.value - this.end.mMargin, secondStart.mTargets.get(0).value + secondStart.mMargin, secondEnd.mTargets.get(0).value - secondEnd.mMargin, ratio3, definedSide);
                                        this.mDimension.resolve(sTempDimensions[0]);
                                        this.mWidget.mVerticalRun.mDimension.resolve(sTempDimensions[1]);
                                    } else {
                                        return;
                                    }
                                }
                                if (this.start.readyToSolve && this.end.readyToSolve && secondStart.readyToSolve && secondEnd.readyToSolve) {
                                    computeInsetRatio(sTempDimensions, this.start.mTargets.get(0).value + this.start.mMargin, this.end.mTargets.get(0).value - this.end.mMargin, secondStart.mTargets.get(0).value + secondStart.mMargin, secondEnd.mTargets.get(0).value - secondEnd.mMargin, ratio3, definedSide);
                                    this.mDimension.resolve(sTempDimensions[0]);
                                    this.mWidget.mVerticalRun.mDimension.resolve(sTempDimensions[1]);
                                    break;
                                } else {
                                    return;
                                }
                            } else if (this.start.readyToSolve && this.end.readyToSolve) {
                                computeInsetRatio(sTempDimensions, this.start.mTargets.get(0).value + this.start.mMargin, this.end.mTargets.get(0).value - this.end.mMargin, secondStart.value + secondStart.mMargin, secondEnd.value - secondEnd.mMargin, ratio3, definedSide);
                                this.mDimension.resolve(sTempDimensions[0]);
                                this.mWidget.mVerticalRun.mDimension.resolve(sTempDimensions[1]);
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                    break;
            }
        }
        if (this.start.readyToSolve && this.end.readyToSolve) {
            if (this.start.resolved && this.end.resolved && this.mDimension.resolved) {
                return;
            }
            if (this.mDimension.resolved || this.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.mWidget.mMatchConstraintDefaultWidth != 0 || this.mWidget.isInHorizontalChain()) {
                if (!this.mDimension.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.matchConstraintsType == 1 && this.start.mTargets.size() > 0 && this.end.mTargets.size() > 0) {
                    int value = Math.min((this.end.mTargets.get(0).value + this.end.mMargin) - (this.start.mTargets.get(0).value + this.start.mMargin), this.mDimension.wrapValue);
                    int max = this.mWidget.mMatchConstraintMaxWidth;
                    int value2 = Math.max(this.mWidget.mMatchConstraintMinWidth, value);
                    if (max > 0) {
                        value2 = Math.min(max, value2);
                    }
                    this.mDimension.resolve(value2);
                }
                if (this.mDimension.resolved) {
                    DependencyNode startTarget = this.start.mTargets.get(0);
                    DependencyNode endTarget = this.end.mTargets.get(0);
                    int startPos = startTarget.value + this.start.mMargin;
                    int endPos = endTarget.value + this.end.mMargin;
                    float bias = this.mWidget.getHorizontalBiasPercent();
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

    public void applyToWidget() {
        if (this.start.resolved) {
            this.mWidget.setX(this.start.value);
        }
    }
}
