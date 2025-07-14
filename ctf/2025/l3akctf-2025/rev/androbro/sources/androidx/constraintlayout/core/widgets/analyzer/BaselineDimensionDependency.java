package androidx.constraintlayout.core.widgets.analyzer;

class BaselineDimensionDependency extends DimensionDependency {
    BaselineDimensionDependency(WidgetRun run) {
        super(run);
    }

    public void update(DependencyNode node) {
        ((VerticalWidgetRun) this.mRun).baseline.mMargin = this.mRun.mWidget.getBaselineDistance();
        this.resolved = true;
    }
}
