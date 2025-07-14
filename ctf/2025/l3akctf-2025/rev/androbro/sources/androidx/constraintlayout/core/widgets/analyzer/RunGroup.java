package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

class RunGroup {
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;
    public static int index;
    public boolean dual;
    int mDirection;
    WidgetRun mFirstRun;
    int mGroupIndex;
    WidgetRun mLastRun;
    ArrayList<WidgetRun> mRuns;
    public int position;

    RunGroup(WidgetRun run, int dir) {
        this.position = 0;
        this.dual = false;
        this.mFirstRun = null;
        this.mLastRun = null;
        this.mRuns = new ArrayList<>();
        this.mGroupIndex = 0;
        this.mGroupIndex = index;
        index++;
        this.mFirstRun = run;
        this.mLastRun = run;
        this.mDirection = dir;
    }

    public void add(WidgetRun run) {
        this.mRuns.add(run);
        this.mLastRun = run;
    }

    private long traverseStart(DependencyNode node, long startPosition) {
        WidgetRun run = node.mRun;
        if (run instanceof HelperReferences) {
            return startPosition;
        }
        long position2 = startPosition;
        int count = node.mDependencies.size();
        for (int i = 0; i < count; i++) {
            Dependency dependency = node.mDependencies.get(i);
            if (dependency instanceof DependencyNode) {
                DependencyNode nextNode = (DependencyNode) dependency;
                if (nextNode.mRun != run) {
                    position2 = Math.max(position2, traverseStart(nextNode, ((long) nextNode.mMargin) + startPosition));
                }
            }
        }
        if (node != run.start) {
            return position2;
        }
        long dimension = run.getWrapDimension();
        return Math.max(Math.max(position2, traverseStart(run.end, startPosition + dimension)), (startPosition + dimension) - ((long) run.end.mMargin));
    }

    private long traverseEnd(DependencyNode node, long startPosition) {
        WidgetRun run = node.mRun;
        if (run instanceof HelperReferences) {
            return startPosition;
        }
        long position2 = startPosition;
        int count = node.mDependencies.size();
        for (int i = 0; i < count; i++) {
            Dependency dependency = node.mDependencies.get(i);
            if (dependency instanceof DependencyNode) {
                DependencyNode nextNode = (DependencyNode) dependency;
                if (nextNode.mRun != run) {
                    position2 = Math.min(position2, traverseEnd(nextNode, ((long) nextNode.mMargin) + startPosition));
                }
            }
        }
        if (node != run.end) {
            return position2;
        }
        long dimension = run.getWrapDimension();
        return Math.min(Math.min(position2, traverseEnd(run.start, startPosition - dimension)), (startPosition - dimension) - ((long) run.start.mMargin));
    }

    public long computeWrapSize(ConstraintWidgetContainer container, int orientation) {
        ConstraintWidgetContainer constraintWidgetContainer = container;
        int i = orientation;
        if (this.mFirstRun instanceof ChainRun) {
            if (((ChainRun) this.mFirstRun).orientation != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(this.mFirstRun instanceof HorizontalWidgetRun)) {
                return 0;
            }
        } else if (!(this.mFirstRun instanceof VerticalWidgetRun)) {
            return 0;
        }
        DependencyNode containerStart = i == 0 ? constraintWidgetContainer.mHorizontalRun.start : constraintWidgetContainer.mVerticalRun.start;
        DependencyNode containerEnd = i == 0 ? constraintWidgetContainer.mHorizontalRun.end : constraintWidgetContainer.mVerticalRun.end;
        boolean runWithStartTarget = this.mFirstRun.start.mTargets.contains(containerStart);
        boolean runWithEndTarget = this.mFirstRun.end.mTargets.contains(containerEnd);
        long dimension = this.mFirstRun.getWrapDimension();
        if (!runWithStartTarget || !runWithEndTarget) {
            if (runWithStartTarget) {
                return Math.max(traverseStart(this.mFirstRun.start, (long) this.mFirstRun.start.mMargin), ((long) this.mFirstRun.start.mMargin) + dimension);
            }
            if (!runWithEndTarget) {
                return (((long) this.mFirstRun.start.mMargin) + this.mFirstRun.getWrapDimension()) - ((long) this.mFirstRun.end.mMargin);
            }
            return Math.max(-traverseEnd(this.mFirstRun.end, (long) this.mFirstRun.end.mMargin), ((long) (-this.mFirstRun.end.mMargin)) + dimension);
        }
        long maxPosition = traverseStart(this.mFirstRun.start, 0);
        long minPosition = traverseEnd(this.mFirstRun.end, 0);
        long endGap = maxPosition - dimension;
        long j = maxPosition;
        if (endGap >= ((long) (-this.mFirstRun.end.mMargin))) {
            endGap += (long) this.mFirstRun.end.mMargin;
        }
        DependencyNode dependencyNode = containerStart;
        long j2 = minPosition;
        long startGap = ((-minPosition) - dimension) - ((long) this.mFirstRun.start.mMargin);
        if (startGap >= ((long) this.mFirstRun.start.mMargin)) {
            startGap -= (long) this.mFirstRun.start.mMargin;
        }
        float bias = this.mFirstRun.mWidget.getBiasPercent(i);
        long gap = 0;
        if (bias > 0.0f) {
            gap = (long) ((((float) startGap) / bias) + (((float) endGap) / (1.0f - bias)));
        }
        float f = bias;
        long j3 = gap;
        return (((long) this.mFirstRun.start.mMargin) + ((((long) ((((float) gap) * bias) + 0.5f)) + dimension) + ((long) ((((float) gap) * (1.0f - bias)) + 0.5f)))) - ((long) this.mFirstRun.end.mMargin);
    }

    private boolean defineTerminalWidget(WidgetRun run, int orientation) {
        if (!run.mWidget.isTerminalWidget[orientation]) {
            return false;
        }
        for (Dependency dependency : run.start.mDependencies) {
            if (dependency instanceof DependencyNode) {
                DependencyNode node = (DependencyNode) dependency;
                if (node.mRun != run && node == node.mRun.start) {
                    if (run instanceof ChainRun) {
                        Iterator<WidgetRun> it = ((ChainRun) run).mWidgets.iterator();
                        while (it.hasNext()) {
                            defineTerminalWidget(it.next(), orientation);
                        }
                    } else if (!(run instanceof HelperReferences)) {
                        run.mWidget.isTerminalWidget[orientation] = false;
                    }
                    defineTerminalWidget(node.mRun, orientation);
                }
            }
        }
        for (Dependency dependency2 : run.end.mDependencies) {
            if (dependency2 instanceof DependencyNode) {
                DependencyNode node2 = (DependencyNode) dependency2;
                if (node2.mRun != run && node2 == node2.mRun.start) {
                    if (run instanceof ChainRun) {
                        Iterator<WidgetRun> it2 = ((ChainRun) run).mWidgets.iterator();
                        while (it2.hasNext()) {
                            defineTerminalWidget(it2.next(), orientation);
                        }
                    } else if (!(run instanceof HelperReferences)) {
                        run.mWidget.isTerminalWidget[orientation] = false;
                    }
                    defineTerminalWidget(node2.mRun, orientation);
                }
            }
        }
        return false;
    }

    public void defineTerminalWidgets(boolean horizontalCheck, boolean verticalCheck) {
        if (horizontalCheck && (this.mFirstRun instanceof HorizontalWidgetRun)) {
            defineTerminalWidget(this.mFirstRun, 0);
        }
        if (verticalCheck && (this.mFirstRun instanceof VerticalWidgetRun)) {
            defineTerminalWidget(this.mFirstRun, 1);
        }
    }
}
