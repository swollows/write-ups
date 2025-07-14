package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Chain;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class WidgetGroup {
    private static final boolean DEBUG = false;
    static int sCount = 0;
    boolean mAuthoritative = false;
    int mId = -1;
    private int mMoveTo = -1;
    int mOrientation = 0;
    ArrayList<MeasureResult> mResults = null;
    ArrayList<ConstraintWidget> mWidgets = new ArrayList<>();

    public WidgetGroup(int orientation) {
        int i = sCount;
        sCount = i + 1;
        this.mId = i;
        this.mOrientation = orientation;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getId() {
        return this.mId;
    }

    public boolean add(ConstraintWidget widget) {
        if (this.mWidgets.contains(widget)) {
            return false;
        }
        this.mWidgets.add(widget);
        return true;
    }

    public void setAuthoritative(boolean isAuthoritative) {
        this.mAuthoritative = isAuthoritative;
    }

    public boolean isAuthoritative() {
        return this.mAuthoritative;
    }

    private String getOrientationString() {
        if (this.mOrientation == 0) {
            return "Horizontal";
        }
        if (this.mOrientation == 1) {
            return "Vertical";
        }
        if (this.mOrientation == 2) {
            return "Both";
        }
        return "Unknown";
    }

    public String toString() {
        String ret = getOrientationString() + " [" + this.mId + "] <";
        Iterator<ConstraintWidget> it = this.mWidgets.iterator();
        while (it.hasNext()) {
            ret = ret + " " + it.next().getDebugName();
        }
        return ret + " >";
    }

    public void moveTo(int orientation, WidgetGroup widgetGroup) {
        Iterator<ConstraintWidget> it = this.mWidgets.iterator();
        while (it.hasNext()) {
            ConstraintWidget widget = it.next();
            widgetGroup.add(widget);
            if (orientation == 0) {
                widget.horizontalGroup = widgetGroup.getId();
            } else {
                widget.verticalGroup = widgetGroup.getId();
            }
        }
        this.mMoveTo = widgetGroup.mId;
    }

    public void clear() {
        this.mWidgets.clear();
    }

    private int measureWrap(int orientation, ConstraintWidget widget) {
        ConstraintWidget.DimensionBehaviour behaviour = widget.getDimensionBehaviour(orientation);
        if (behaviour != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && behaviour != ConstraintWidget.DimensionBehaviour.MATCH_PARENT && behaviour != ConstraintWidget.DimensionBehaviour.FIXED) {
            return -1;
        }
        if (orientation == 0) {
            return widget.getWidth();
        }
        return widget.getHeight();
    }

    public int measureWrap(LinearSystem system, int orientation) {
        if (this.mWidgets.size() == 0) {
            return 0;
        }
        return solverMeasure(system, this.mWidgets, orientation);
    }

    private int solverMeasure(LinearSystem system, ArrayList<ConstraintWidget> widgets, int orientation) {
        ConstraintWidgetContainer container = (ConstraintWidgetContainer) widgets.get(0).getParent();
        system.reset();
        container.addToSolver(system, false);
        for (int i = 0; i < widgets.size(); i++) {
            widgets.get(i).addToSolver(system, false);
        }
        if (orientation == 0 && container.mHorizontalChainsSize > 0) {
            Chain.applyChainConstraints(container, system, widgets, 0);
        }
        if (orientation == 1 && container.mVerticalChainsSize > 0) {
            Chain.applyChainConstraints(container, system, widgets, 1);
        }
        try {
            system.minimize();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.mResults = new ArrayList<>();
        for (int i2 = 0; i2 < widgets.size(); i2++) {
            this.mResults.add(new MeasureResult(widgets.get(i2), system, orientation));
        }
        if (orientation == 0) {
            int left = system.getObjectVariableValue(container.mLeft);
            int right = system.getObjectVariableValue(container.mRight);
            system.reset();
            return right - left;
        }
        int top = system.getObjectVariableValue(container.mTop);
        int bottom = system.getObjectVariableValue(container.mBottom);
        system.reset();
        return bottom - top;
    }

    public void setOrientation(int orientation) {
        this.mOrientation = orientation;
    }

    public void apply() {
        if (this.mResults != null && this.mAuthoritative) {
            for (int i = 0; i < this.mResults.size(); i++) {
                this.mResults.get(i).apply();
            }
        }
    }

    public boolean intersectWith(WidgetGroup group) {
        for (int i = 0; i < this.mWidgets.size(); i++) {
            if (group.contains(this.mWidgets.get(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean contains(ConstraintWidget widget) {
        return this.mWidgets.contains(widget);
    }

    public int size() {
        return this.mWidgets.size();
    }

    public void cleanup(ArrayList<WidgetGroup> dependencyLists) {
        int count = this.mWidgets.size();
        if (this.mMoveTo != -1 && count > 0) {
            for (int i = 0; i < dependencyLists.size(); i++) {
                WidgetGroup group = dependencyLists.get(i);
                if (this.mMoveTo == group.mId) {
                    moveTo(this.mOrientation, group);
                }
            }
        }
        if (count == 0) {
            dependencyLists.remove(this);
        }
    }

    static class MeasureResult {
        int mBaseline;
        int mBottom;
        int mLeft;
        int mOrientation;
        int mRight;
        int mTop;
        WeakReference<ConstraintWidget> mWidgetRef;

        MeasureResult(ConstraintWidget widget, LinearSystem system, int orientation) {
            this.mWidgetRef = new WeakReference<>(widget);
            this.mLeft = system.getObjectVariableValue(widget.mLeft);
            this.mTop = system.getObjectVariableValue(widget.mTop);
            this.mRight = system.getObjectVariableValue(widget.mRight);
            this.mBottom = system.getObjectVariableValue(widget.mBottom);
            this.mBaseline = system.getObjectVariableValue(widget.mBaseline);
            this.mOrientation = orientation;
        }

        public void apply() {
            ConstraintWidget widget = (ConstraintWidget) this.mWidgetRef.get();
            if (widget != null) {
                widget.setFinalFrame(this.mLeft, this.mTop, this.mRight, this.mBottom, this.mBaseline, this.mOrientation);
            }
        }
    }
}
