package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.List;

public class DependencyNode implements Dependency {
    public boolean delegateToWidgetRun = false;
    List<Dependency> mDependencies = new ArrayList();
    int mMargin;
    DimensionDependency mMarginDependency = null;
    int mMarginFactor = 1;
    WidgetRun mRun;
    List<DependencyNode> mTargets = new ArrayList();
    Type mType = Type.UNKNOWN;
    public boolean readyToSolve = false;
    public boolean resolved = false;
    public Dependency updateDelegate = null;
    public int value;

    enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun run) {
        this.mRun = run;
    }

    public String toString() {
        return this.mRun.mWidget.getDebugName() + ":" + this.mType + "(" + (this.resolved ? Integer.valueOf(this.value) : "unresolved") + ") <t=" + this.mTargets.size() + ":d=" + this.mDependencies.size() + ">";
    }

    public void resolve(int value2) {
        if (!this.resolved) {
            this.resolved = true;
            this.value = value2;
            for (Dependency node : this.mDependencies) {
                node.update(node);
            }
        }
    }

    public void update(Dependency node) {
        for (DependencyNode target : this.mTargets) {
            if (!target.resolved) {
                return;
            }
        }
        this.readyToSolve = true;
        if (this.updateDelegate != null) {
            this.updateDelegate.update(this);
        }
        if (this.delegateToWidgetRun) {
            this.mRun.update(this);
            return;
        }
        DependencyNode target2 = null;
        int numTargets = 0;
        for (DependencyNode t : this.mTargets) {
            if (!(t instanceof DimensionDependency)) {
                target2 = t;
                numTargets++;
            }
        }
        if (target2 != null && numTargets == 1 && target2.resolved) {
            if (this.mMarginDependency != null) {
                if (this.mMarginDependency.resolved) {
                    this.mMargin = this.mMarginFactor * this.mMarginDependency.value;
                } else {
                    return;
                }
            }
            resolve(target2.value + this.mMargin);
        }
        if (this.updateDelegate != null) {
            this.updateDelegate.update(this);
        }
    }

    public void addDependency(Dependency dependency) {
        this.mDependencies.add(dependency);
        if (this.resolved) {
            dependency.update(dependency);
        }
    }

    public String name() {
        String definition;
        String definition2 = this.mRun.mWidget.getDebugName();
        if (this.mType == Type.LEFT || this.mType == Type.RIGHT) {
            definition = definition2 + "_HORIZONTAL";
        } else {
            definition = definition2 + "_VERTICAL";
        }
        return definition + ":" + this.mType.name();
    }

    public void clear() {
        this.mTargets.clear();
        this.mDependencies.clear();
        this.resolved = false;
        this.value = 0;
        this.readyToSolve = false;
        this.delegateToWidgetRun = false;
    }
}
