package androidx.constraintlayout.widget;

import android.util.Log;
import androidx.constraintlayout.core.Metrics;
import java.text.DecimalFormat;

public class ConstraintLayoutStatistics {
    public static final int DURATION_OF_CHILD_MEASURES = 5;
    public static final int DURATION_OF_LAYOUT = 7;
    public static final int DURATION_OF_MEASURES = 6;
    private static int MAX_WORD = 25;
    public static final int NUMBER_OF_CHILD_MEASURES = 4;
    public static final int NUMBER_OF_CHILD_VIEWS = 3;
    public static final int NUMBER_OF_EQUATIONS = 9;
    public static final int NUMBER_OF_LAYOUTS = 1;
    public static final int NUMBER_OF_ON_MEASURES = 2;
    public static final int NUMBER_OF_SIMPLE_EQUATIONS = 10;
    public static final int NUMBER_OF_VARIABLES = 8;
    private static final String WORD_PAD = new String(new char[MAX_WORD]).replace(0, ' ');
    ConstraintLayout mConstraintLayout;
    private final Metrics mMetrics = new Metrics();

    public ConstraintLayoutStatistics(ConstraintLayout constraintLayout) {
        attach(constraintLayout);
    }

    public ConstraintLayoutStatistics(ConstraintLayoutStatistics copy) {
        this.mMetrics.copy(copy.mMetrics);
    }

    public void attach(ConstraintLayout constraintLayout) {
        constraintLayout.fillMetrics(this.mMetrics);
        this.mConstraintLayout = constraintLayout;
    }

    public void detach() {
        if (this.mConstraintLayout != null) {
            this.mConstraintLayout.fillMetrics((Metrics) null);
        }
    }

    public void reset() {
        this.mMetrics.reset();
    }

    public ConstraintLayoutStatistics clone() {
        return new ConstraintLayoutStatistics(this);
    }

    private String fmt(DecimalFormat df, float val, int length) {
        String s = new String(new char[length]).replace(0, ' ') + df.format((double) val);
        return s.substring(s.length() - length);
    }

    public void logSummary(String tag) {
        log(tag);
    }

    private void log(String tag) {
        StackTraceElement s = new Throwable().getStackTrace()[2];
        Log.v(tag, "CL Perf: --------  Performance .(" + s.getFileName() + ":" + s.getLineNumber() + ")  ------ ");
        DecimalFormat df = new DecimalFormat("###.000");
        Log.v(tag, log(df, 5));
        Log.v(tag, log(df, 7));
        Log.v(tag, log(df, 6));
        Log.v(tag, log(1));
        Log.v(tag, log(2));
        Log.v(tag, log(3));
        Log.v(tag, log(4));
        Log.v(tag, log(8));
        Log.v(tag, log(9));
        Log.v(tag, log(10));
    }

    private String log(DecimalFormat df, int param) {
        String title = WORD_PAD + geName(param);
        return "CL Perf: " + (title.substring(title.length() - MAX_WORD) + " = ") + fmt(df, ((float) getValue(param)) * 1.0E-6f, 7);
    }

    private String log(int param) {
        String title = WORD_PAD + geName(param);
        return "CL Perf: " + (title.substring(title.length() - MAX_WORD) + " = ") + Long.toString(getValue(param));
    }

    private String compare(DecimalFormat df, ConstraintLayoutStatistics relative, int param) {
        String title = WORD_PAD + geName(param);
        return "CL Perf: " + (title.substring(title.length() - MAX_WORD) + " = ") + (fmt(df, ((float) getValue(param)) * 1.0E-6f, 7) + " -> " + fmt(df, ((float) relative.getValue(param)) * 1.0E-6f, 7) + "ms");
    }

    private String compare(ConstraintLayoutStatistics relative, int param) {
        String title = WORD_PAD + geName(param);
        return "CL Perf: " + (title.substring(title.length() - MAX_WORD) + " = ") + (getValue(param) + " -> " + relative.getValue(param));
    }

    public void logSummary(String tag, ConstraintLayoutStatistics prev) {
        if (prev == null) {
            log(tag);
            return;
        }
        DecimalFormat df = new DecimalFormat("###.000");
        StackTraceElement s = new Throwable().getStackTrace()[1];
        Log.v(tag, "CL Perf: -=  Performance .(" + s.getFileName() + ":" + s.getLineNumber() + ")  =- ");
        Log.v(tag, compare(df, prev, 5));
        Log.v(tag, compare(df, prev, 7));
        Log.v(tag, compare(df, prev, 6));
        Log.v(tag, compare(prev, 1));
        Log.v(tag, compare(prev, 2));
        Log.v(tag, compare(prev, 3));
        Log.v(tag, compare(prev, 4));
        Log.v(tag, compare(prev, 8));
        Log.v(tag, compare(prev, 9));
        Log.v(tag, compare(prev, 10));
    }

    public long getValue(int type) {
        switch (type) {
            case 1:
                return (long) this.mMetrics.mNumberOfLayouts;
            case 2:
                return this.mMetrics.mMeasureCalls;
            case 3:
                return this.mMetrics.mChildCount;
            case 4:
                return (long) this.mMetrics.mNumberOfMeasures;
            case 5:
                return this.mMetrics.measuresWidgetsDuration;
            case 6:
                return this.mMetrics.mMeasureDuration;
            case 7:
                return this.mMetrics.measuresLayoutDuration;
            case 8:
                return this.mMetrics.mVariables;
            case 9:
                return this.mMetrics.mEquations;
            case 10:
                return this.mMetrics.mSimpleEquations;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public String geName(int type) {
        switch (type) {
            case 1:
                return "NumberOfLayouts";
            case 2:
                return "MeasureCalls";
            case 3:
                return "ChildCount";
            case 4:
                return "ChildrenMeasures";
            case 5:
                return "MeasuresWidgetsDuration ";
            case 6:
                return "MeasureDuration";
            case 7:
                return "MeasuresLayoutDuration";
            case 8:
                return "SolverVariables";
            case 9:
                return "SolverEquations";
            case 10:
                return "SimpleEquations";
            default:
                return "";
        }
    }
}
