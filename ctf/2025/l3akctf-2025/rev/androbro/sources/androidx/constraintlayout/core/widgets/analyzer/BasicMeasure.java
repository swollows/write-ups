package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import java.util.ArrayList;

public class BasicMeasure {
    public static final int AT_MOST = Integer.MIN_VALUE;
    private static final boolean DEBUG = false;
    private static final boolean DO_NOT_USE = false;
    public static final int EXACTLY = 1073741824;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    private static final int MODE_SHIFT = 30;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;
    private ConstraintWidgetContainer mConstraintWidgetContainer;
    private Measure mMeasure = new Measure();
    private final ArrayList<ConstraintWidget> mVariableDimensionsWidgets = new ArrayList<>();

    public static class Measure {
        public static int SELF_DIMENSIONS = 0;
        public static int TRY_GIVEN_DIMENSIONS = 1;
        public static int USE_GIVEN_DIMENSIONS = 2;
        public ConstraintWidget.DimensionBehaviour horizontalBehavior;
        public int horizontalDimension;
        public int measureStrategy;
        public int measuredBaseline;
        public boolean measuredHasBaseline;
        public int measuredHeight;
        public boolean measuredNeedsSolverPass;
        public int measuredWidth;
        public ConstraintWidget.DimensionBehaviour verticalBehavior;
        public int verticalDimension;
    }

    public interface Measurer {
        void didMeasures();

        void measure(ConstraintWidget constraintWidget, Measure measure);
    }

    public void updateHierarchy(ConstraintWidgetContainer layout) {
        this.mVariableDimensionsWidgets.clear();
        int childCount = layout.mChildren.size();
        for (int i = 0; i < childCount; i++) {
            ConstraintWidget widget = (ConstraintWidget) layout.mChildren.get(i);
            if (widget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || widget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                this.mVariableDimensionsWidgets.add(widget);
            }
        }
        layout.invalidateGraph();
    }

    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer) {
        this.mConstraintWidgetContainer = constraintWidgetContainer;
    }

    private void measureChildren(ConstraintWidgetContainer layout) {
        int childCount = layout.mChildren.size();
        boolean optimize = layout.optimizeFor(64);
        Measurer measurer = layout.getMeasurer();
        for (int i = 0; i < childCount; i++) {
            ConstraintWidget child = (ConstraintWidget) layout.mChildren.get(i);
            if (!(child instanceof Guideline) && !(child instanceof Barrier) && !child.isInVirtualLayout() && (!optimize || child.mHorizontalRun == null || child.mVerticalRun == null || !child.mHorizontalRun.mDimension.resolved || !child.mVerticalRun.mDimension.resolved)) {
                boolean skip = false;
                ConstraintWidget.DimensionBehaviour widthBehavior = child.getDimensionBehaviour(0);
                ConstraintWidget.DimensionBehaviour heightBehavior = child.getDimensionBehaviour(1);
                if (widthBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && child.mMatchConstraintDefaultWidth != 1 && heightBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && child.mMatchConstraintDefaultHeight != 1) {
                    skip = true;
                }
                if (!skip && layout.optimizeFor(1) && !(child instanceof VirtualLayout)) {
                    if (widthBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && child.mMatchConstraintDefaultWidth == 0 && heightBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && !child.isInHorizontalChain()) {
                        skip = true;
                    }
                    if (heightBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && child.mMatchConstraintDefaultHeight == 0 && widthBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && !child.isInHorizontalChain()) {
                        skip = true;
                    }
                    if ((widthBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || heightBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && child.mDimensionRatio > 0.0f) {
                        skip = true;
                    }
                }
                if (!skip) {
                    measure(measurer, child, Measure.SELF_DIMENSIONS);
                    if (layout.mMetrics != null) {
                        layout.mMetrics.measuredWidgets++;
                    }
                }
            }
        }
        measurer.didMeasures();
    }

    private void solveLinearSystem(ConstraintWidgetContainer layout, String reason, int pass, int w, int h) {
        ConstraintWidgetContainer constraintWidgetContainer = layout;
        long startLayout = 0;
        if (constraintWidgetContainer.mMetrics != null) {
            startLayout = System.nanoTime();
        }
        int minWidth = layout.getMinWidth();
        int minHeight = layout.getMinHeight();
        constraintWidgetContainer.setMinWidth(0);
        constraintWidgetContainer.setMinHeight(0);
        constraintWidgetContainer.setWidth(w);
        constraintWidgetContainer.setHeight(h);
        constraintWidgetContainer.setMinWidth(minWidth);
        constraintWidgetContainer.setMinHeight(minHeight);
        this.mConstraintWidgetContainer.setPass(pass);
        this.mConstraintWidgetContainer.layout();
        if (constraintWidgetContainer.mMetrics != null) {
            long endLayout = System.nanoTime();
            constraintWidgetContainer.mMetrics.mSolverPasses++;
            constraintWidgetContainer.mMetrics.measuresLayoutDuration += endLayout - startLayout;
        }
    }

    public long solverMeasure(ConstraintWidgetContainer layout, int optimizationLevel, int paddingX, int paddingY, int widthMode, int widthSize, int heightMode, int heightSize, int lastMeasureWidth, int lastMeasureHeight) {
        long layoutTime;
        boolean allSolved;
        boolean z;
        int heightSize2;
        long layoutTime2;
        boolean z2;
        boolean z3;
        int optimizations;
        int sizeDependentWidgetsCount;
        int maxIterations;
        int sizeDependentWidgetsCount2;
        Measurer measurer;
        int measureStrategy;
        boolean optimizeWrap;
        int startingHeight;
        int childCount;
        boolean z4;
        boolean allSolved2;
        BasicMeasure basicMeasure = this;
        ConstraintWidgetContainer constraintWidgetContainer = layout;
        int i = optimizationLevel;
        int i2 = widthMode;
        int i3 = heightMode;
        Measurer measurer2 = layout.getMeasurer();
        long layoutTime3 = 0;
        int childCount2 = constraintWidgetContainer.mChildren.size();
        int startingWidth = layout.getWidth();
        int startingHeight2 = layout.getHeight();
        boolean optimizeWrap2 = Optimizer.enabled(i, 128);
        boolean optimize = optimizeWrap2 || Optimizer.enabled(i, 64);
        if (optimize) {
            int i4 = 0;
            while (true) {
                if (i4 >= childCount2) {
                    layoutTime = layoutTime3;
                    break;
                }
                ConstraintWidget child = (ConstraintWidget) constraintWidgetContainer.mChildren.get(i4);
                layoutTime = layoutTime3;
                boolean matchWidth = child.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean ratio = matchWidth && (child.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && child.getDimensionRatio() > 0.0f;
                if (!child.isInHorizontalChain() || !ratio) {
                    if (child.isInVerticalChain() && ratio) {
                        optimize = false;
                        break;
                    }
                    boolean z5 = matchWidth;
                    if (child instanceof VirtualLayout) {
                        optimize = false;
                        break;
                    } else if (child.isInHorizontalChain() || child.isInVerticalChain()) {
                        optimize = false;
                    } else {
                        i4++;
                        layoutTime3 = layoutTime;
                    }
                } else {
                    optimize = false;
                    break;
                }
            }
        } else {
            layoutTime = 0;
        }
        if (optimize && LinearSystem.sMetrics != null) {
            LinearSystem.sMetrics.measures++;
        }
        boolean optimize2 = optimize & ((i2 == 1073741824 && i3 == 1073741824) || optimizeWrap2);
        int computations = 0;
        if (optimize2) {
            int widthSize2 = Math.min(layout.getMaxWidth(), widthSize);
            int heightSize3 = Math.min(layout.getMaxHeight(), heightSize);
            if (i2 == 1073741824 && layout.getWidth() != widthSize2) {
                constraintWidgetContainer.setWidth(widthSize2);
                layout.invalidateGraph();
            }
            if (i3 == 1073741824 && layout.getHeight() != heightSize3) {
                constraintWidgetContainer.setHeight(heightSize3);
                layout.invalidateGraph();
            }
            if (i2 == 1073741824 && i3 == 1073741824) {
                allSolved2 = constraintWidgetContainer.directMeasure(optimizeWrap2);
                computations = 2;
                z4 = true;
            } else {
                allSolved2 = constraintWidgetContainer.directMeasureSetup(optimizeWrap2);
                if (i2 == 1073741824) {
                    allSolved2 &= constraintWidgetContainer.directMeasureWithOrientation(optimizeWrap2, 0);
                    computations = 0 + 1;
                }
                if (i3 == 1073741824) {
                    z4 = true;
                    allSolved2 &= constraintWidgetContainer.directMeasureWithOrientation(optimizeWrap2, 1);
                    computations++;
                } else {
                    z4 = true;
                }
            }
            if (allSolved2) {
                if (i2 != 1073741824) {
                    z4 = false;
                }
                constraintWidgetContainer.updateFromRuns(z4, i3 == 1073741824);
            }
            allSolved = allSolved2;
            int i5 = widthSize2;
            int i6 = heightSize3;
            z = false;
            heightSize2 = computations;
        } else {
            z = false;
            int i7 = heightSize;
            allSolved = false;
            int i8 = widthSize;
            heightSize2 = 0;
        }
        if (!allSolved || heightSize2 != 2) {
            int optimizations2 = layout.getOptimizationLevel();
            if (childCount2 > 0) {
                measureChildren(layout);
            }
            if (constraintWidgetContainer.mMetrics != null) {
                layoutTime = System.nanoTime();
            }
            updateHierarchy(layout);
            int sizeDependentWidgetsCount3 = basicMeasure.mVariableDimensionsWidgets.size();
            if (childCount2 > 0) {
                sizeDependentWidgetsCount = sizeDependentWidgetsCount3;
                optimizations = optimizations2;
                int i9 = heightSize2;
                z3 = true;
                z2 = z;
                solveLinearSystem(layout, "First pass", 0, startingWidth, startingHeight2);
            } else {
                sizeDependentWidgetsCount = sizeDependentWidgetsCount3;
                optimizations = optimizations2;
                int i10 = heightSize2;
                z2 = z;
                z3 = true;
            }
            if (sizeDependentWidgetsCount > 0) {
                boolean needSolverPass = false;
                boolean containerWrapWidth = layout.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? z3 : z2;
                boolean containerWrapHeight = layout.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? z3 : z2;
                int minWidth = Math.max(layout.getWidth(), basicMeasure.mConstraintWidgetContainer.getMinWidth());
                int minHeight = Math.max(layout.getHeight(), basicMeasure.mConstraintWidgetContainer.getMinHeight());
                int i11 = 0;
                while (i11 < sizeDependentWidgetsCount) {
                    ConstraintWidget widget = basicMeasure.mVariableDimensionsWidgets.get(i11);
                    if (!(widget instanceof VirtualLayout)) {
                        childCount = childCount2;
                        startingHeight = startingHeight2;
                        optimizeWrap = optimizeWrap2;
                    } else {
                        int preWidth = widget.getWidth();
                        int preHeight = widget.getHeight();
                        childCount = childCount2;
                        boolean needSolverPass2 = needSolverPass | basicMeasure.measure(measurer2, widget, Measure.TRY_GIVEN_DIMENSIONS);
                        if (constraintWidgetContainer.mMetrics != null) {
                            startingHeight = startingHeight2;
                            optimizeWrap = optimizeWrap2;
                            constraintWidgetContainer.mMetrics.measuredMatchWidgets++;
                        } else {
                            startingHeight = startingHeight2;
                            optimizeWrap = optimizeWrap2;
                        }
                        int measuredWidth = widget.getWidth();
                        int measuredHeight = widget.getHeight();
                        if (measuredWidth != preWidth) {
                            widget.setWidth(measuredWidth);
                            if (!containerWrapWidth || widget.getRight() <= minWidth) {
                            } else {
                                boolean z6 = needSolverPass2;
                                minWidth = Math.max(minWidth, widget.getRight() + widget.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin());
                            }
                            needSolverPass2 = true;
                        } else {
                            boolean z7 = needSolverPass2;
                        }
                        if (measuredHeight != preHeight) {
                            widget.setHeight(measuredHeight);
                            if (!containerWrapHeight || widget.getBottom() <= minHeight) {
                            } else {
                                boolean z8 = needSolverPass2;
                                minHeight = Math.max(minHeight, widget.getBottom() + widget.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin());
                            }
                            needSolverPass2 = true;
                        } else {
                            boolean z9 = needSolverPass2;
                        }
                        needSolverPass = needSolverPass2 | ((VirtualLayout) widget).needSolverPass();
                    }
                    i11++;
                    int i12 = heightMode;
                    childCount2 = childCount;
                    startingHeight2 = startingHeight;
                    optimizeWrap2 = optimizeWrap;
                }
                int startingHeight3 = startingHeight2;
                boolean z10 = optimizeWrap2;
                int maxIterations2 = 2;
                int j = 0;
                while (true) {
                    if (j >= maxIterations2) {
                        int i13 = maxIterations2;
                        Measurer measurer3 = measurer2;
                        break;
                    }
                    int i14 = 0;
                    boolean needSolverPass3 = needSolverPass;
                    int minWidth2 = minWidth;
                    int minHeight2 = minHeight;
                    while (i14 < sizeDependentWidgetsCount) {
                        ConstraintWidget widget2 = basicMeasure.mVariableDimensionsWidgets.get(i14);
                        if ((!(widget2 instanceof Helper) || (widget2 instanceof VirtualLayout)) && !(widget2 instanceof Guideline) && widget2.getVisibility() != 8 && ((!optimize2 || !widget2.mHorizontalRun.mDimension.resolved || !widget2.mVerticalRun.mDimension.resolved) && !(widget2 instanceof VirtualLayout))) {
                            int preWidth2 = widget2.getWidth();
                            int preHeight2 = widget2.getHeight();
                            int preBaselineDistance = widget2.getBaselineDistance();
                            int measureStrategy2 = Measure.TRY_GIVEN_DIMENSIONS;
                            sizeDependentWidgetsCount2 = sizeDependentWidgetsCount;
                            if (j == maxIterations2 - 1) {
                                measureStrategy = Measure.USE_GIVEN_DIMENSIONS;
                            } else {
                                measureStrategy = measureStrategy2;
                            }
                            needSolverPass3 |= basicMeasure.measure(measurer2, widget2, measureStrategy);
                            if (constraintWidgetContainer.mMetrics != null) {
                                maxIterations = maxIterations2;
                                measurer = measurer2;
                                constraintWidgetContainer.mMetrics.measuredMatchWidgets++;
                            } else {
                                maxIterations = maxIterations2;
                                measurer = measurer2;
                            }
                            int measuredWidth2 = widget2.getWidth();
                            int measuredHeight2 = widget2.getHeight();
                            if (measuredWidth2 != preWidth2) {
                                widget2.setWidth(measuredWidth2);
                                if (!containerWrapWidth || widget2.getRight() <= minWidth2) {
                                } else {
                                    int i15 = preWidth2;
                                    minWidth2 = Math.max(minWidth2, widget2.getRight() + widget2.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin());
                                }
                                needSolverPass3 = true;
                            }
                            if (measuredHeight2 != preHeight2) {
                                widget2.setHeight(measuredHeight2);
                                if (containerWrapHeight && widget2.getBottom() > minHeight2) {
                                    minHeight2 = Math.max(minHeight2, widget2.getBottom() + widget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin());
                                }
                                needSolverPass3 = true;
                            }
                            if (widget2.hasBaseline() && preBaselineDistance != widget2.getBaselineDistance()) {
                                needSolverPass3 = true;
                            }
                        } else {
                            sizeDependentWidgetsCount2 = sizeDependentWidgetsCount;
                            maxIterations = maxIterations2;
                            measurer = measurer2;
                        }
                        i14++;
                        basicMeasure = this;
                        sizeDependentWidgetsCount = sizeDependentWidgetsCount2;
                        maxIterations2 = maxIterations;
                        measurer2 = measurer;
                    }
                    int sizeDependentWidgetsCount4 = sizeDependentWidgetsCount;
                    int maxIterations3 = maxIterations2;
                    Measurer measurer4 = measurer2;
                    if (!needSolverPass3) {
                        break;
                    }
                    solveLinearSystem(layout, "intermediate pass", j + 1, startingWidth, startingHeight3);
                    needSolverPass = false;
                    j++;
                    sizeDependentWidgetsCount = sizeDependentWidgetsCount4;
                    maxIterations2 = maxIterations3;
                    minHeight = minHeight2;
                    minWidth = minWidth2;
                    measurer2 = measurer4;
                    basicMeasure = this;
                }
            } else {
                Measurer measurer5 = measurer2;
                int i16 = childCount2;
                int i17 = startingHeight2;
                boolean z11 = optimizeWrap2;
            }
            constraintWidgetContainer.setOptimizationLevel(optimizations);
            layoutTime2 = layoutTime;
        } else {
            int i18 = heightSize2;
            Measurer measurer6 = measurer2;
            int i19 = childCount2;
            int i20 = startingHeight2;
            boolean z12 = optimizeWrap2;
            layoutTime2 = layoutTime;
        }
        if (constraintWidgetContainer.mMetrics != null) {
            return System.nanoTime() - layoutTime2;
        }
        return layoutTime2;
    }

    private boolean measure(Measurer measurer, ConstraintWidget widget, int measureStrategy) {
        this.mMeasure.horizontalBehavior = widget.getHorizontalDimensionBehaviour();
        this.mMeasure.verticalBehavior = widget.getVerticalDimensionBehaviour();
        this.mMeasure.horizontalDimension = widget.getWidth();
        this.mMeasure.verticalDimension = widget.getHeight();
        this.mMeasure.measuredNeedsSolverPass = false;
        this.mMeasure.measureStrategy = measureStrategy;
        boolean horizontalMatchConstraints = this.mMeasure.horizontalBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean verticalMatchConstraints = this.mMeasure.verticalBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean horizontalUseRatio = horizontalMatchConstraints && widget.mDimensionRatio > 0.0f;
        boolean verticalUseRatio = verticalMatchConstraints && widget.mDimensionRatio > 0.0f;
        if (horizontalUseRatio && widget.mResolvedMatchConstraintDefault[0] == 4) {
            this.mMeasure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (verticalUseRatio && widget.mResolvedMatchConstraintDefault[1] == 4) {
            this.mMeasure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        measurer.measure(widget, this.mMeasure);
        widget.setWidth(this.mMeasure.measuredWidth);
        widget.setHeight(this.mMeasure.measuredHeight);
        widget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        widget.setBaselineDistance(this.mMeasure.measuredBaseline);
        this.mMeasure.measureStrategy = Measure.SELF_DIMENSIONS;
        return this.mMeasure.measuredNeedsSolverPass;
    }
}
