package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.2.0-alpha04";
    private static SharedValues sSharedValues = null;
    SparseArray<View> mChildrenByIds = new SparseArray<>();
    /* access modifiers changed from: private */
    public ArrayList<ConstraintHelper> mConstraintHelpers = new ArrayList<>(4);
    protected ConstraintLayoutStates mConstraintLayoutSpec = null;
    private ConstraintSet mConstraintSet = null;
    private int mConstraintSetId = -1;
    private HashMap<String, Integer> mDesignIds = new HashMap<>();
    protected boolean mDirtyHierarchy = true;
    private int mLastMeasureHeight = -1;
    int mLastMeasureHeightMode = 0;
    int mLastMeasureHeightSize = -1;
    private int mLastMeasureWidth = -1;
    int mLastMeasureWidthMode = 0;
    int mLastMeasureWidthSize = -1;
    /* access modifiers changed from: protected */
    public ConstraintWidgetContainer mLayoutWidget = new ConstraintWidgetContainer();
    private int mMaxHeight = Integer.MAX_VALUE;
    private int mMaxWidth = Integer.MAX_VALUE;
    Measurer mMeasurer = new Measurer(this);
    /* access modifiers changed from: private */
    public Metrics mMetrics;
    private int mMinHeight = 0;
    private int mMinWidth = 0;
    private ArrayList<ValueModifier> mModifiers;
    private int mOnMeasureHeightMeasureSpec = 0;
    private int mOnMeasureWidthMeasureSpec = 0;
    /* access modifiers changed from: private */
    public int mOptimizationLevel = 257;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget = new SparseArray<>();

    public interface ValueModifier {
        boolean update(int i, int i2, int i3, View view, LayoutParams layoutParams);
    }

    public static SharedValues getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new SharedValues();
        }
        return sSharedValues;
    }

    public void setDesignInformation(int type, Object value1, Object value2) {
        if (type == 0 && (value1 instanceof String) && (value2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String name = (String) value1;
            int index = name.indexOf("/");
            if (index != -1) {
                name = name.substring(index + 1);
            }
            this.mDesignIds.put(name, Integer.valueOf(((Integer) value2).intValue()));
        }
    }

    public Object getDesignInformation(int type, Object value) {
        if (type != 0 || !(value instanceof String)) {
            return null;
        }
        String name = (String) value;
        if (this.mDesignIds == null || !this.mDesignIds.containsKey(name)) {
            return null;
        }
        return this.mDesignIds.get(name);
    }

    public ConstraintLayout(Context context) {
        super(context);
        init((AttributeSet) null, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs, defStyleAttr, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs, defStyleAttr, defStyleRes);
    }

    public void setId(int id) {
        this.mChildrenByIds.remove(getId());
        super.setId(id);
        this.mChildrenByIds.put(getId(), this);
    }

    class Measurer implements BasicMeasure.Measurer {
        ConstraintLayout mLayout;
        int mLayoutHeightSpec;
        int mLayoutWidthSpec;
        int mPaddingBottom;
        int mPaddingHeight;
        int mPaddingTop;
        int mPaddingWidth;

        public void captureLayoutInfo(int widthSpec, int heightSpec, int top, int bottom, int width, int height) {
            this.mPaddingTop = top;
            this.mPaddingBottom = bottom;
            this.mPaddingWidth = width;
            this.mPaddingHeight = height;
            this.mLayoutWidthSpec = widthSpec;
            this.mLayoutHeightSpec = heightSpec;
        }

        Measurer(ConstraintLayout l) {
            this.mLayout = l;
        }

        /* JADX WARNING: Removed duplicated region for block: B:136:0x0237  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x0241  */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x0246 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x0247  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void measure(androidx.constraintlayout.core.widgets.ConstraintWidget r36, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure r37) {
            /*
                r35 = this;
                r0 = r35
                r1 = r36
                r2 = r37
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r36.getVisibility()
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001f
                boolean r3 = r36.isInPlaceholder()
                if (r3 != 0) goto L_0x001f
                r2.measuredWidth = r5
                r2.measuredHeight = r5
                r2.measuredBaseline = r5
                return
            L_0x001f:
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r36.getParent()
                if (r3 != 0) goto L_0x0026
                return
            L_0x0026:
                r3 = 0
                androidx.constraintlayout.widget.ConstraintLayout r6 = androidx.constraintlayout.widget.ConstraintLayout.this
                androidx.constraintlayout.core.Metrics r6 = r6.mMetrics
                r7 = 1
                if (r6 == 0) goto L_0x0040
                androidx.constraintlayout.widget.ConstraintLayout r6 = androidx.constraintlayout.widget.ConstraintLayout.this
                androidx.constraintlayout.core.Metrics r6 = r6.mMetrics
                int r8 = r6.mNumberOfMeasures
                int r8 = r8 + r7
                r6.mNumberOfMeasures = r8
                long r3 = java.lang.System.nanoTime()
            L_0x0040:
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r2.horizontalBehavior
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r2.verticalBehavior
                int r9 = r2.horizontalDimension
                int r10 = r2.verticalDimension
                r11 = 0
                r12 = 0
                int r13 = r0.mPaddingTop
                int r14 = r0.mPaddingBottom
                int r13 = r13 + r14
                int r14 = r0.mPaddingWidth
                java.lang.Object r15 = r36.getCompanionWidget()
                android.view.View r15 = (android.view.View) r15
                int[] r16 = androidx.constraintlayout.widget.ConstraintLayout.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour
                int r17 = r6.ordinal()
                r16 = r16[r17]
                r5 = -2
                switch(r16) {
                    case 1: goto L_0x00de;
                    case 2: goto L_0x00d4;
                    case 3: goto L_0x00c5;
                    case 4: goto L_0x0067;
                    default: goto L_0x0063;
                }
            L_0x0063:
                r22 = r12
                goto L_0x00e7
            L_0x0067:
                int r7 = r0.mLayoutWidthSpec
                int r11 = android.view.ViewGroup.getChildMeasureSpec(r7, r14, r5)
                int r7 = r1.mMatchConstraintDefaultWidth
                r5 = 1
                if (r7 != r5) goto L_0x0074
                r5 = 1
                goto L_0x0075
            L_0x0074:
                r5 = 0
            L_0x0075:
                int r7 = r2.measureStrategy
                r21 = r11
                int r11 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS
                if (r7 == r11) goto L_0x0087
                int r7 = r2.measureStrategy
                int r11 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS
                if (r7 != r11) goto L_0x0084
                goto L_0x0087
            L_0x0084:
                r22 = r12
                goto L_0x00c2
            L_0x0087:
                int r7 = r15.getMeasuredHeight()
                int r11 = r36.getHeight()
                if (r7 != r11) goto L_0x0093
                r7 = 1
                goto L_0x0094
            L_0x0093:
                r7 = 0
            L_0x0094:
                int r11 = r2.measureStrategy
                r22 = r12
                int r12 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS
                if (r11 == r12) goto L_0x00af
                if (r5 == 0) goto L_0x00af
                if (r5 == 0) goto L_0x00a2
                if (r7 != 0) goto L_0x00af
            L_0x00a2:
                boolean r11 = r15 instanceof androidx.constraintlayout.widget.Placeholder
                if (r11 != 0) goto L_0x00af
                boolean r11 = r36.isResolvedHorizontally()
                if (r11 == 0) goto L_0x00ad
                goto L_0x00af
            L_0x00ad:
                r11 = 0
                goto L_0x00b0
            L_0x00af:
                r11 = 1
            L_0x00b0:
                if (r11 == 0) goto L_0x00c0
                int r12 = r36.getWidth()
                r23 = r5
                r5 = 1073741824(0x40000000, float:2.0)
                int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r5)
                r11 = r12
                goto L_0x00e7
            L_0x00c0:
                r23 = r5
            L_0x00c2:
                r11 = r21
                goto L_0x00e7
            L_0x00c5:
                r22 = r12
                int r5 = r0.mLayoutWidthSpec
                int r7 = r36.getHorizontalMargin()
                int r7 = r7 + r14
                r12 = -1
                int r11 = android.view.ViewGroup.getChildMeasureSpec(r5, r7, r12)
                goto L_0x00e7
            L_0x00d4:
                r22 = r12
                int r5 = r0.mLayoutWidthSpec
                r7 = -2
                int r11 = android.view.ViewGroup.getChildMeasureSpec(r5, r14, r7)
                goto L_0x00e7
            L_0x00de:
                r22 = r12
                r5 = 1073741824(0x40000000, float:2.0)
                int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r5)
            L_0x00e7:
                int[] r5 = androidx.constraintlayout.widget.ConstraintLayout.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour
                int r7 = r8.ordinal()
                r5 = r5[r7]
                switch(r5) {
                    case 1: goto L_0x016f;
                    case 2: goto L_0x0165;
                    case 3: goto L_0x0156;
                    case 4: goto L_0x00f8;
                    default: goto L_0x00f2;
                }
            L_0x00f2:
                r21 = r9
                r12 = r22
                goto L_0x0178
            L_0x00f8:
                int r5 = r0.mLayoutHeightSpec
                r7 = -2
                int r12 = android.view.ViewGroup.getChildMeasureSpec(r5, r13, r7)
                int r5 = r1.mMatchConstraintDefaultHeight
                r7 = 1
                if (r5 != r7) goto L_0x0106
                r5 = 1
                goto L_0x0107
            L_0x0106:
                r5 = 0
            L_0x0107:
                int r7 = r2.measureStrategy
                r21 = r9
                int r9 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS
                if (r7 == r9) goto L_0x0119
                int r7 = r2.measureStrategy
                int r9 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS
                if (r7 != r9) goto L_0x0116
                goto L_0x0119
            L_0x0116:
                r20 = r12
                goto L_0x0153
            L_0x0119:
                int r7 = r15.getMeasuredWidth()
                int r9 = r36.getWidth()
                if (r7 != r9) goto L_0x0125
                r7 = 1
                goto L_0x0126
            L_0x0125:
                r7 = 0
            L_0x0126:
                int r9 = r2.measureStrategy
                r20 = r12
                int r12 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS
                if (r9 == r12) goto L_0x0141
                if (r5 == 0) goto L_0x0141
                if (r5 == 0) goto L_0x0134
                if (r7 != 0) goto L_0x0141
            L_0x0134:
                boolean r9 = r15 instanceof androidx.constraintlayout.widget.Placeholder
                if (r9 != 0) goto L_0x0141
                boolean r9 = r36.isResolvedVertically()
                if (r9 == 0) goto L_0x013f
                goto L_0x0141
            L_0x013f:
                r9 = 0
                goto L_0x0142
            L_0x0141:
                r9 = 1
            L_0x0142:
                if (r9 == 0) goto L_0x0151
                int r12 = r36.getHeight()
                r22 = r5
                r5 = 1073741824(0x40000000, float:2.0)
                int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r5)
                goto L_0x0178
            L_0x0151:
                r22 = r5
            L_0x0153:
                r12 = r20
                goto L_0x0178
            L_0x0156:
                r21 = r9
                int r5 = r0.mLayoutHeightSpec
                int r7 = r36.getVerticalMargin()
                int r7 = r7 + r13
                r9 = -1
                int r12 = android.view.ViewGroup.getChildMeasureSpec(r5, r7, r9)
                goto L_0x0178
            L_0x0165:
                r21 = r9
                int r5 = r0.mLayoutHeightSpec
                r7 = -2
                int r12 = android.view.ViewGroup.getChildMeasureSpec(r5, r13, r7)
                goto L_0x0178
            L_0x016f:
                r21 = r9
                r5 = 1073741824(0x40000000, float:2.0)
                int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r5)
            L_0x0178:
                androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r36.getParent()
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r5
                if (r5 == 0) goto L_0x01fa
                androidx.constraintlayout.widget.ConstraintLayout r7 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r7 = r7.mOptimizationLevel
                r9 = 256(0x100, float:3.59E-43)
                boolean r7 = androidx.constraintlayout.core.widgets.Optimizer.enabled(r7, r9)
                if (r7 == 0) goto L_0x01fa
                int r7 = r15.getMeasuredWidth()
                int r9 = r36.getWidth()
                if (r7 != r9) goto L_0x01fa
                int r7 = r15.getMeasuredWidth()
                int r9 = r5.getWidth()
                if (r7 >= r9) goto L_0x01fa
                int r7 = r15.getMeasuredHeight()
                int r9 = r36.getHeight()
                if (r7 != r9) goto L_0x01fa
                int r7 = r15.getMeasuredHeight()
                int r9 = r5.getHeight()
                if (r7 >= r9) goto L_0x01fa
                int r7 = r15.getBaseline()
                int r9 = r36.getBaselineDistance()
                if (r7 != r9) goto L_0x01fa
                boolean r7 = r36.isMeasureRequested()
                if (r7 != 0) goto L_0x01fa
                int r7 = r36.getLastHorizontalMeasureSpec()
                int r9 = r36.getWidth()
                boolean r7 = r0.isSimilarSpec(r7, r11, r9)
                if (r7 == 0) goto L_0x01e4
                int r7 = r36.getLastVerticalMeasureSpec()
                int r9 = r36.getHeight()
                boolean r7 = r0.isSimilarSpec(r7, r12, r9)
                if (r7 == 0) goto L_0x01e4
                r7 = 1
                goto L_0x01e5
            L_0x01e4:
                r7 = 0
            L_0x01e5:
                if (r7 == 0) goto L_0x01fa
                int r9 = r36.getWidth()
                r2.measuredWidth = r9
                int r9 = r36.getHeight()
                r2.measuredHeight = r9
                int r9 = r36.getBaselineDistance()
                r2.measuredBaseline = r9
                return
            L_0x01fa:
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r6 != r7) goto L_0x0200
                r7 = 1
                goto L_0x0201
            L_0x0200:
                r7 = 0
            L_0x0201:
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r8 != r9) goto L_0x0207
                r9 = 1
                goto L_0x0208
            L_0x0207:
                r9 = 0
            L_0x0208:
                r20 = r5
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
                if (r8 == r5) goto L_0x0215
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                if (r8 != r5) goto L_0x0213
                goto L_0x0215
            L_0x0213:
                r5 = 0
                goto L_0x0216
            L_0x0215:
                r5 = 1
            L_0x0216:
                r22 = r8
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
                if (r6 == r8) goto L_0x0223
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                if (r6 != r8) goto L_0x0221
                goto L_0x0223
            L_0x0221:
                r8 = 0
                goto L_0x0224
            L_0x0223:
                r8 = 1
            L_0x0224:
                r23 = 0
                if (r7 == 0) goto L_0x0232
                r24 = r6
                float r6 = r1.mDimensionRatio
                int r6 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1))
                if (r6 <= 0) goto L_0x0234
                r6 = 1
                goto L_0x0235
            L_0x0232:
                r24 = r6
            L_0x0234:
                r6 = 0
            L_0x0235:
                if (r9 == 0) goto L_0x0241
                r25 = r10
                float r10 = r1.mDimensionRatio
                int r10 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
                if (r10 <= 0) goto L_0x0243
                r10 = 1
                goto L_0x0244
            L_0x0241:
                r25 = r10
            L_0x0243:
                r10 = 0
            L_0x0244:
                if (r15 != 0) goto L_0x0247
                return
            L_0x0247:
                android.view.ViewGroup$LayoutParams r23 = r15.getLayoutParams()
                r26 = r13
                r13 = r23
                androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r13 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r13
                r23 = 0
                r27 = 0
                r28 = 0
                r29 = r14
                int r14 = r2.measureStrategy
                r30 = r3
                int r3 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS
                if (r14 == r3) goto L_0x0282
                int r3 = r2.measureStrategy
                int r4 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS
                if (r3 == r4) goto L_0x0282
                if (r7 == 0) goto L_0x0282
                int r3 = r1.mMatchConstraintDefaultWidth
                if (r3 != 0) goto L_0x0282
                if (r9 == 0) goto L_0x0282
                int r3 = r1.mMatchConstraintDefaultHeight
                if (r3 == 0) goto L_0x0274
                goto L_0x0282
            L_0x0274:
                r34 = r5
                r32 = r9
                r14 = r23
                r5 = r27
                r3 = r28
                r27 = r7
                goto L_0x0344
            L_0x0282:
                boolean r3 = r15 instanceof androidx.constraintlayout.widget.VirtualLayout
                if (r3 == 0) goto L_0x0294
                boolean r3 = r1 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
                if (r3 == 0) goto L_0x0294
                r3 = r1
                androidx.constraintlayout.core.widgets.VirtualLayout r3 = (androidx.constraintlayout.core.widgets.VirtualLayout) r3
                r4 = r15
                androidx.constraintlayout.widget.VirtualLayout r4 = (androidx.constraintlayout.widget.VirtualLayout) r4
                r4.onMeasure(r3, r11, r12)
                goto L_0x0297
            L_0x0294:
                r15.measure(r11, r12)
            L_0x0297:
                r1.setLastMeasureSpec(r11, r12)
                int r3 = r15.getMeasuredWidth()
                int r4 = r15.getMeasuredHeight()
                int r28 = r15.getBaseline()
                r14 = r3
                r23 = r4
                r27 = r7
                int r7 = r1.mMatchConstraintMinWidth
                if (r7 <= 0) goto L_0x02b5
                int r7 = r1.mMatchConstraintMinWidth
                int r14 = java.lang.Math.max(r7, r14)
            L_0x02b5:
                int r7 = r1.mMatchConstraintMaxWidth
                if (r7 <= 0) goto L_0x02bf
                int r7 = r1.mMatchConstraintMaxWidth
                int r14 = java.lang.Math.min(r7, r14)
            L_0x02bf:
                int r7 = r1.mMatchConstraintMinHeight
                if (r7 <= 0) goto L_0x02d0
                int r7 = r1.mMatchConstraintMinHeight
                r32 = r9
                r9 = r23
                int r23 = java.lang.Math.max(r7, r9)
                r9 = r23
                goto L_0x02d4
            L_0x02d0:
                r32 = r9
                r9 = r23
            L_0x02d4:
                int r7 = r1.mMatchConstraintMaxHeight
                if (r7 <= 0) goto L_0x02de
                int r7 = r1.mMatchConstraintMaxHeight
                int r9 = java.lang.Math.min(r7, r9)
            L_0x02de:
                androidx.constraintlayout.widget.ConstraintLayout r7 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r7 = r7.mOptimizationLevel
                r23 = r11
                r11 = 1
                boolean r7 = androidx.constraintlayout.core.widgets.Optimizer.enabled(r7, r11)
                if (r7 != 0) goto L_0x030e
                if (r6 == 0) goto L_0x02fe
                if (r5 == 0) goto L_0x02fe
                float r11 = r1.mDimensionRatio
                r34 = r5
                float r5 = (float) r9
                float r5 = r5 * r11
                r33 = 1056964608(0x3f000000, float:0.5)
                float r5 = r5 + r33
                int r5 = (int) r5
                r14 = r5
                goto L_0x0310
            L_0x02fe:
                r34 = r5
                if (r10 == 0) goto L_0x0310
                if (r8 == 0) goto L_0x0310
                float r5 = r1.mDimensionRatio
                float r11 = (float) r14
                float r11 = r11 / r5
                r33 = 1056964608(0x3f000000, float:0.5)
                float r11 = r11 + r33
                int r9 = (int) r11
                goto L_0x0310
            L_0x030e:
                r34 = r5
            L_0x0310:
                if (r3 != r14) goto L_0x031b
                if (r4 == r9) goto L_0x0315
                goto L_0x031b
            L_0x0315:
                r5 = r9
                r11 = r23
                r3 = r28
                goto L_0x0344
            L_0x031b:
                if (r3 == r14) goto L_0x0324
                r5 = 1073741824(0x40000000, float:2.0)
                int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
                goto L_0x0328
            L_0x0324:
                r5 = 1073741824(0x40000000, float:2.0)
                r11 = r23
            L_0x0328:
                if (r4 == r9) goto L_0x032e
                int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r5)
            L_0x032e:
                r15.measure(r11, r12)
                r1.setLastMeasureSpec(r11, r12)
                int r23 = r15.getMeasuredWidth()
                int r5 = r15.getMeasuredHeight()
                int r28 = r15.getBaseline()
                r14 = r23
                r3 = r28
            L_0x0344:
                r4 = -1
                if (r3 == r4) goto L_0x0349
                r4 = 1
                goto L_0x034a
            L_0x0349:
                r4 = 0
            L_0x034a:
                int r7 = r2.horizontalDimension
                if (r14 != r7) goto L_0x0355
                int r7 = r2.verticalDimension
                if (r5 == r7) goto L_0x0353
                goto L_0x0355
            L_0x0353:
                r7 = 0
                goto L_0x0356
            L_0x0355:
                r7 = 1
            L_0x0356:
                r2.measuredNeedsSolverPass = r7
                boolean r7 = r13.mNeedsBaseline
                if (r7 == 0) goto L_0x035d
                r4 = 1
            L_0x035d:
                if (r4 == 0) goto L_0x036b
                r7 = -1
                if (r3 == r7) goto L_0x036b
                int r7 = r36.getBaselineDistance()
                if (r7 == r3) goto L_0x036b
                r7 = 1
                r2.measuredNeedsSolverPass = r7
            L_0x036b:
                r2.measuredWidth = r14
                r2.measuredHeight = r5
                r2.measuredHasBaseline = r4
                r2.measuredBaseline = r3
                androidx.constraintlayout.widget.ConstraintLayout r7 = androidx.constraintlayout.widget.ConstraintLayout.this
                androidx.constraintlayout.core.Metrics r7 = r7.mMetrics
                if (r7 == 0) goto L_0x038d
                long r16 = java.lang.System.nanoTime()
                androidx.constraintlayout.widget.ConstraintLayout r7 = androidx.constraintlayout.widget.ConstraintLayout.this
                androidx.constraintlayout.core.Metrics r7 = r7.mMetrics
                long r0 = r7.measuresWidgetsDuration
                long r18 = r16 - r30
                long r0 = r0 + r18
                r7.measuresWidgetsDuration = r0
            L_0x038d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.Measurer.measure(androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure):void");
        }

        private boolean isSimilarSpec(int lastMeasureSpec, int spec, int widgetSize) {
            if (lastMeasureSpec == spec) {
                return true;
            }
            int lastMode = View.MeasureSpec.getMode(lastMeasureSpec);
            int mode = View.MeasureSpec.getMode(spec);
            int size = View.MeasureSpec.getSize(spec);
            if (mode == 1073741824 && ((lastMode == Integer.MIN_VALUE || lastMode == 0) && widgetSize == size)) {
                return true;
            }
            return false;
        }

        public final void didMeasures() {
            int widgetsCount = this.mLayout.getChildCount();
            for (int i = 0; i < widgetsCount; i++) {
                View child = this.mLayout.getChildAt(i);
                if (child instanceof Placeholder) {
                    ((Placeholder) child).updatePostMeasure(this.mLayout);
                }
            }
            int helperCount = this.mLayout.mConstraintHelpers.size();
            if (helperCount > 0) {
                for (int i2 = 0; i2 < helperCount; i2++) {
                    ((ConstraintHelper) this.mLayout.mConstraintHelpers.get(i2)).updatePostMeasure(this.mLayout);
                }
            }
        }
    }

    private void init(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.mLayoutWidget.setCompanionWidget(this);
        this.mLayoutWidget.setMeasurer(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.ConstraintLayout_Layout, defStyleAttr, defStyleRes);
            int count = a.getIndexCount();
            for (int i = 0; i < count; i++) {
                int attr = a.getIndex(i);
                if (attr == R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = a.getDimensionPixelOffset(attr, this.mMinWidth);
                } else if (attr == R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = a.getDimensionPixelOffset(attr, this.mMinHeight);
                } else if (attr == R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = a.getDimensionPixelOffset(attr, this.mMaxWidth);
                } else if (attr == R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = a.getDimensionPixelOffset(attr, this.mMaxHeight);
                } else if (attr == R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = a.getInt(attr, this.mOptimizationLevel);
                } else if (attr == R.styleable.ConstraintLayout_Layout_layoutDescription) {
                    int id = a.getResourceId(attr, 0);
                    if (id != 0) {
                        try {
                            parseLayoutDescription(id);
                        } catch (Resources.NotFoundException e) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (attr == R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int id2 = a.getResourceId(attr, 0);
                    try {
                        this.mConstraintSet = new ConstraintSet();
                        this.mConstraintSet.load(getContext(), id2);
                    } catch (Resources.NotFoundException e2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = id2;
                }
            }
            a.recycle();
        }
        this.mLayoutWidget.setOptimizationLevel(this.mOptimizationLevel);
    }

    /* access modifiers changed from: protected */
    public void parseLayoutDescription(int id) {
        this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, id);
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget widget = getViewWidget(view);
        if ((view instanceof Guideline) && !(widget instanceof Guideline)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.mWidget = new Guideline();
            layoutParams.mIsGuideline = true;
            ((Guideline) layoutParams.mWidget).setOrientation(layoutParams.orientation);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper helper = (ConstraintHelper) view;
            helper.validateParams();
            ((LayoutParams) view.getLayoutParams()).mIsHelper = true;
            if (!this.mConstraintHelpers.contains(helper)) {
                this.mConstraintHelpers.add(helper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.remove(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void setMinWidth(int value) {
        if (value != this.mMinWidth) {
            this.mMinWidth = value;
            requestLayout();
        }
    }

    public void setMinHeight(int value) {
        if (value != this.mMinHeight) {
            this.mMinHeight = value;
            requestLayout();
        }
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public void setMaxWidth(int value) {
        if (value != this.mMaxWidth) {
            this.mMaxWidth = value;
            requestLayout();
        }
    }

    public void setMaxHeight(int value) {
        if (value != this.mMaxHeight) {
            this.mMaxHeight = value;
            requestLayout();
        }
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    private boolean updateHierarchy() {
        int count = getChildCount();
        boolean recompute = false;
        int i = 0;
        while (true) {
            if (i >= count) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                recompute = true;
                break;
            } else {
                i++;
            }
        }
        if (recompute) {
            setChildrenConstraints();
        }
        return recompute;
    }

    private void setChildrenConstraints() {
        boolean isInEditMode = isInEditMode();
        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            ConstraintWidget widget = getViewWidget(getChildAt(i));
            if (widget != null) {
                widget.reset();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < count; i2++) {
                View view = getChildAt(i2);
                try {
                    String IdAsString = getResources().getResourceName(view.getId());
                    setDesignInformation(0, IdAsString, Integer.valueOf(view.getId()));
                    int slashIndex = IdAsString.indexOf(47);
                    if (slashIndex != -1) {
                        IdAsString = IdAsString.substring(slashIndex + 1);
                    }
                    getTargetWidget(view.getId()).setDebugName(IdAsString);
                } catch (Resources.NotFoundException e) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < count; i3++) {
                View child = getChildAt(i3);
                if (child.getId() == this.mConstraintSetId && (child instanceof Constraints)) {
                    this.mConstraintSet = ((Constraints) child).getConstraintSet();
                }
            }
        }
        if (this.mConstraintSet != null) {
            this.mConstraintSet.applyToInternal(this, true);
        }
        this.mLayoutWidget.removeAllChildren();
        int helperCount = this.mConstraintHelpers.size();
        if (helperCount > 0) {
            for (int i4 = 0; i4 < helperCount; i4++) {
                this.mConstraintHelpers.get(i4).updatePreLayout(this);
            }
        }
        for (int i5 = 0; i5 < count; i5++) {
            View child2 = getChildAt(i5);
            if (child2 instanceof Placeholder) {
                ((Placeholder) child2).updatePreLayout(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < count; i6++) {
            View child3 = getChildAt(i6);
            this.mTempMapIdToWidget.put(child3.getId(), getViewWidget(child3));
        }
        for (int i7 = 0; i7 < count; i7++) {
            View child4 = getChildAt(i7);
            ConstraintWidget widget2 = getViewWidget(child4);
            if (widget2 != null) {
                this.mLayoutWidget.add(widget2);
                applyConstraintsFromLayoutParams(isInEditMode, child4, widget2, (LayoutParams) child4.getLayoutParams(), this.mTempMapIdToWidget);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void applyConstraintsFromLayoutParams(boolean isInEditMode, View child, ConstraintWidget widget, LayoutParams layoutParams, SparseArray<ConstraintWidget> idToWidget) {
        int resolvedRightToRight;
        int resolveGoneRightMargin;
        float resolvedHorizontalBias;
        ConstraintWidget target;
        ConstraintWidget target2;
        ConstraintWidget target3;
        ConstraintWidget target4;
        View view = child;
        ConstraintWidget constraintWidget = widget;
        LayoutParams layoutParams2 = layoutParams;
        SparseArray<ConstraintWidget> sparseArray = idToWidget;
        layoutParams.validate();
        layoutParams2.helped = false;
        constraintWidget.setVisibility(child.getVisibility());
        if (layoutParams2.mIsInPlaceholder) {
            constraintWidget.setInPlaceholder(true);
            constraintWidget.setVisibility(8);
        }
        constraintWidget.setCompanionWidget(view);
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).resolveRtl(constraintWidget, this.mLayoutWidget.isRtl());
        }
        if (layoutParams2.mIsGuideline) {
            Guideline guideline = (Guideline) constraintWidget;
            int resolvedGuideBegin = layoutParams2.mResolvedGuideBegin;
            int resolvedGuideEnd = layoutParams2.mResolvedGuideEnd;
            float resolvedGuidePercent = layoutParams2.mResolvedGuidePercent;
            if (resolvedGuidePercent != -1.0f) {
                guideline.setGuidePercent(resolvedGuidePercent);
            } else if (resolvedGuideBegin != -1) {
                guideline.setGuideBegin(resolvedGuideBegin);
            } else if (resolvedGuideEnd != -1) {
                guideline.setGuideEnd(resolvedGuideEnd);
            }
        } else {
            int resolvedLeftToLeft = layoutParams2.mResolvedLeftToLeft;
            int resolvedLeftToRight = layoutParams2.mResolvedLeftToRight;
            int resolvedRightToLeft = layoutParams2.mResolvedRightToLeft;
            int resolvedRightToRight2 = layoutParams2.mResolvedRightToRight;
            int resolveGoneLeftMargin = layoutParams2.mResolveGoneLeftMargin;
            int resolveGoneRightMargin2 = layoutParams2.mResolveGoneRightMargin;
            float resolvedHorizontalBias2 = layoutParams2.mResolvedHorizontalBias;
            if (layoutParams2.circleConstraint != -1) {
                ConstraintWidget target5 = sparseArray.get(layoutParams2.circleConstraint);
                if (target5 != null) {
                    constraintWidget.connectCircularConstraint(target5, layoutParams2.circleAngle, layoutParams2.circleRadius);
                }
                float f = resolvedHorizontalBias2;
                int i = resolveGoneRightMargin2;
                int i2 = resolveGoneLeftMargin;
                int i3 = resolvedRightToRight2;
            } else {
                if (resolvedLeftToLeft != -1) {
                    ConstraintWidget target6 = sparseArray.get(resolvedLeftToLeft);
                    if (target6 != null) {
                        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.LEFT;
                        resolvedHorizontalBias = resolvedHorizontalBias2;
                        resolveGoneRightMargin = resolveGoneRightMargin2;
                        ConstraintAnchor.Type type3 = type2;
                        resolvedRightToRight = resolvedRightToRight2;
                        widget.immediateConnect(type, target6, type3, layoutParams2.leftMargin, resolveGoneLeftMargin);
                    } else {
                        resolvedHorizontalBias = resolvedHorizontalBias2;
                        resolveGoneRightMargin = resolveGoneRightMargin2;
                        int i4 = resolveGoneLeftMargin;
                        resolvedRightToRight = resolvedRightToRight2;
                    }
                } else {
                    resolvedHorizontalBias = resolvedHorizontalBias2;
                    resolveGoneRightMargin = resolveGoneRightMargin2;
                    int resolveGoneLeftMargin2 = resolveGoneLeftMargin;
                    resolvedRightToRight = resolvedRightToRight2;
                    if (!(resolvedLeftToRight == -1 || (target4 = sparseArray.get(resolvedLeftToRight)) == null)) {
                        widget.immediateConnect(ConstraintAnchor.Type.LEFT, target4, ConstraintAnchor.Type.RIGHT, layoutParams2.leftMargin, resolveGoneLeftMargin2);
                    }
                }
                if (resolvedRightToLeft != -1) {
                    ConstraintWidget target7 = sparseArray.get(resolvedRightToLeft);
                    if (target7 != null) {
                        widget.immediateConnect(ConstraintAnchor.Type.RIGHT, target7, ConstraintAnchor.Type.LEFT, layoutParams2.rightMargin, resolveGoneRightMargin);
                    }
                    int i5 = resolvedRightToRight;
                } else {
                    int resolvedRightToRight3 = resolvedRightToRight;
                    if (!(resolvedRightToRight3 == -1 || (target3 = sparseArray.get(resolvedRightToRight3)) == null)) {
                        widget.immediateConnect(ConstraintAnchor.Type.RIGHT, target3, ConstraintAnchor.Type.RIGHT, layoutParams2.rightMargin, resolveGoneRightMargin);
                    }
                }
                if (layoutParams2.topToTop != -1) {
                    ConstraintWidget target8 = sparseArray.get(layoutParams2.topToTop);
                    if (target8 != null) {
                        widget.immediateConnect(ConstraintAnchor.Type.TOP, target8, ConstraintAnchor.Type.TOP, layoutParams2.topMargin, layoutParams2.goneTopMargin);
                    }
                } else if (!(layoutParams2.topToBottom == -1 || (target2 = sparseArray.get(layoutParams2.topToBottom)) == null)) {
                    widget.immediateConnect(ConstraintAnchor.Type.TOP, target2, ConstraintAnchor.Type.BOTTOM, layoutParams2.topMargin, layoutParams2.goneTopMargin);
                }
                if (layoutParams2.bottomToTop != -1) {
                    ConstraintWidget target9 = sparseArray.get(layoutParams2.bottomToTop);
                    if (target9 != null) {
                        widget.immediateConnect(ConstraintAnchor.Type.BOTTOM, target9, ConstraintAnchor.Type.TOP, layoutParams2.bottomMargin, layoutParams2.goneBottomMargin);
                    }
                } else if (!(layoutParams2.bottomToBottom == -1 || (target = sparseArray.get(layoutParams2.bottomToBottom)) == null)) {
                    widget.immediateConnect(ConstraintAnchor.Type.BOTTOM, target, ConstraintAnchor.Type.BOTTOM, layoutParams2.bottomMargin, layoutParams2.goneBottomMargin);
                }
                if (layoutParams2.baselineToBaseline != -1) {
                    setWidgetBaseline(widget, layoutParams, idToWidget, layoutParams2.baselineToBaseline, ConstraintAnchor.Type.BASELINE);
                } else if (layoutParams2.baselineToTop != -1) {
                    setWidgetBaseline(widget, layoutParams, idToWidget, layoutParams2.baselineToTop, ConstraintAnchor.Type.TOP);
                } else if (layoutParams2.baselineToBottom != -1) {
                    setWidgetBaseline(widget, layoutParams, idToWidget, layoutParams2.baselineToBottom, ConstraintAnchor.Type.BOTTOM);
                }
                float resolvedHorizontalBias3 = resolvedHorizontalBias;
                if (resolvedHorizontalBias3 >= 0.0f) {
                    constraintWidget.setHorizontalBiasPercent(resolvedHorizontalBias3);
                }
                if (layoutParams2.verticalBias >= 0.0f) {
                    constraintWidget.setVerticalBiasPercent(layoutParams2.verticalBias);
                }
            }
            if (isInEditMode && !(layoutParams2.editorAbsoluteX == -1 && layoutParams2.editorAbsoluteY == -1)) {
                constraintWidget.setOrigin(layoutParams2.editorAbsoluteX, layoutParams2.editorAbsoluteY);
            }
            if (layoutParams2.mHorizontalDimensionFixed) {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget.setWidth(layoutParams2.width);
                if (layoutParams2.width == -2) {
                    constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
            } else if (layoutParams2.width == -1) {
                if (layoutParams2.constrainedWidth) {
                    constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT).mMargin = layoutParams2.leftMargin;
                constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).mMargin = layoutParams2.rightMargin;
            } else {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget.setWidth(0);
            }
            if (layoutParams2.mVerticalDimensionFixed) {
                constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget.setHeight(layoutParams2.height);
                if (layoutParams2.height == -2) {
                    constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
            } else if (layoutParams2.height == -1) {
                if (layoutParams2.constrainedHeight) {
                    constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                constraintWidget.getAnchor(ConstraintAnchor.Type.TOP).mMargin = layoutParams2.topMargin;
                constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM).mMargin = layoutParams2.bottomMargin;
            } else {
                constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget.setHeight(0);
            }
            constraintWidget.setDimensionRatio(layoutParams2.dimensionRatio);
            constraintWidget.setHorizontalWeight(layoutParams2.horizontalWeight);
            constraintWidget.setVerticalWeight(layoutParams2.verticalWeight);
            constraintWidget.setHorizontalChainStyle(layoutParams2.horizontalChainStyle);
            constraintWidget.setVerticalChainStyle(layoutParams2.verticalChainStyle);
            constraintWidget.setWrapBehaviorInParent(layoutParams2.wrapBehaviorInParent);
            constraintWidget.setHorizontalMatchStyle(layoutParams2.matchConstraintDefaultWidth, layoutParams2.matchConstraintMinWidth, layoutParams2.matchConstraintMaxWidth, layoutParams2.matchConstraintPercentWidth);
            constraintWidget.setVerticalMatchStyle(layoutParams2.matchConstraintDefaultHeight, layoutParams2.matchConstraintMinHeight, layoutParams2.matchConstraintMaxHeight, layoutParams2.matchConstraintPercentHeight);
        }
    }

    private void setWidgetBaseline(ConstraintWidget widget, LayoutParams layoutParams, SparseArray<ConstraintWidget> idToWidget, int baselineTarget, ConstraintAnchor.Type type) {
        View view = this.mChildrenByIds.get(baselineTarget);
        ConstraintWidget target = idToWidget.get(baselineTarget);
        if (target != null && view != null && (view.getLayoutParams() instanceof LayoutParams)) {
            layoutParams.mNeedsBaseline = true;
            if (type == ConstraintAnchor.Type.BASELINE) {
                LayoutParams targetParams = (LayoutParams) view.getLayoutParams();
                targetParams.mNeedsBaseline = true;
                targetParams.mWidget.setHasBaseline(true);
            }
            widget.getAnchor(ConstraintAnchor.Type.BASELINE).connect(target.getAnchor(type), layoutParams.baselineMargin, layoutParams.goneBaselineMargin, true);
            widget.setHasBaseline(true);
            widget.getAnchor(ConstraintAnchor.Type.TOP).reset();
            widget.getAnchor(ConstraintAnchor.Type.BOTTOM).reset();
        }
    }

    private ConstraintWidget getTargetWidget(int id) {
        if (id == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(id);
        if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).mWidget;
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).mWidget;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).mWidget;
        }
        return null;
    }

    public void fillMetrics(Metrics metrics) {
        this.mMetrics = metrics;
        this.mLayoutWidget.fillMetrics(metrics);
    }

    /* access modifiers changed from: protected */
    public void resolveSystem(ConstraintWidgetContainer layout, int optimizationLevel, int widthMeasureSpec, int heightMeasureSpec) {
        int paddingX;
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
        int paddingY = Math.max(0, getPaddingTop());
        int paddingBottom = Math.max(0, getPaddingBottom());
        int paddingHeight = paddingY + paddingBottom;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.captureLayoutInfo(widthMeasureSpec, heightMeasureSpec, paddingY, paddingBottom, paddingWidth, paddingHeight);
        int paddingStart = Math.max(0, getPaddingStart());
        int paddingEnd = Math.max(0, getPaddingEnd());
        if (paddingStart <= 0 && paddingEnd <= 0) {
            paddingX = Math.max(0, getPaddingLeft());
        } else if (isRtl() != 0) {
            paddingX = paddingEnd;
        } else {
            paddingX = paddingStart;
        }
        int widthSize2 = widthSize - paddingWidth;
        int heightSize2 = heightSize - paddingHeight;
        setSelfDimensionBehaviour(layout, widthMode, widthSize2, heightMode, heightSize2);
        layout.measure(optimizationLevel, widthMode, widthSize2, heightMode, heightSize2, this.mLastMeasureWidth, this.mLastMeasureHeight, paddingX, paddingY);
    }

    /* access modifiers changed from: protected */
    public void resolveMeasuredDimension(int widthMeasureSpec, int heightMeasureSpec, int measuredWidth, int measuredHeight, boolean isWidthMeasuredTooSmall, boolean isHeightMeasuredTooSmall) {
        int heightPadding = this.mMeasurer.mPaddingHeight;
        int resolvedWidthSize = resolveSizeAndState(measuredWidth + this.mMeasurer.mPaddingWidth, widthMeasureSpec, 0);
        int resolvedHeightSize = resolveSizeAndState(measuredHeight + heightPadding, heightMeasureSpec, 0 << 16);
        int resolvedWidthSize2 = resolvedWidthSize & ViewCompat.MEASURED_SIZE_MASK;
        int resolvedHeightSize2 = resolvedHeightSize & ViewCompat.MEASURED_SIZE_MASK;
        int resolvedWidthSize3 = Math.min(this.mMaxWidth, resolvedWidthSize2);
        int resolvedHeightSize3 = Math.min(this.mMaxHeight, resolvedHeightSize2);
        if (isWidthMeasuredTooSmall) {
            resolvedWidthSize3 |= 16777216;
        }
        if (isHeightMeasuredTooSmall) {
            resolvedHeightSize3 |= 16777216;
        }
        setMeasuredDimension(resolvedWidthSize3, resolvedHeightSize3);
        this.mLastMeasureWidth = resolvedWidthSize3;
        this.mLastMeasureHeight = resolvedHeightSize3;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        long time = 0;
        if (this.mMetrics != null) {
            time = System.nanoTime();
            this.mMetrics.mChildCount = (long) getChildCount();
            this.mMetrics.mMeasureCalls++;
        }
        this.mDirtyHierarchy |= dynamicUpdateConstraints(widthMeasureSpec, heightMeasureSpec);
        if (!this.mDirtyHierarchy && 0 == 0) {
            int count = getChildCount();
            int i = 0;
            while (true) {
                if (i >= count) {
                    break;
                } else if (getChildAt(i).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        if (this.mDirtyHierarchy != 0 || 0 == 0) {
            this.mOnMeasureWidthMeasureSpec = widthMeasureSpec;
            this.mOnMeasureHeightMeasureSpec = heightMeasureSpec;
            this.mLayoutWidget.setRtl(isRtl());
            if (this.mDirtyHierarchy) {
                this.mDirtyHierarchy = false;
                if (updateHierarchy()) {
                    this.mLayoutWidget.updateHierarchy();
                }
            }
            this.mLayoutWidget.fillMetrics(this.mMetrics);
            resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, widthMeasureSpec, heightMeasureSpec);
            resolveMeasuredDimension(widthMeasureSpec, heightMeasureSpec, this.mLayoutWidget.getWidth(), this.mLayoutWidget.getHeight(), this.mLayoutWidget.isWidthMeasuredTooSmall(), this.mLayoutWidget.isHeightMeasuredTooSmall());
            if (this.mMetrics != null) {
                this.mMetrics.mMeasureDuration += System.nanoTime() - time;
                return;
            }
            return;
        }
        resolveMeasuredDimension(widthMeasureSpec, heightMeasureSpec, this.mLayoutWidget.getWidth(), this.mLayoutWidget.getHeight(), this.mLayoutWidget.isWidthMeasuredTooSmall(), this.mLayoutWidget.isHeightMeasuredTooSmall());
        if (this.mMetrics != null) {
            this.mMetrics.mMeasureDuration += System.nanoTime() - time;
        }
    }

    /* access modifiers changed from: protected */
    public boolean isRtl() {
        if (!((getContext().getApplicationInfo().flags & 4194304) != 0) || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    private int getPaddingWidth() {
        int widthPadding = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int rtlPadding = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (rtlPadding > 0) {
            return rtlPadding;
        }
        return widthPadding;
    }

    /* access modifiers changed from: protected */
    public void setSelfDimensionBehaviour(ConstraintWidgetContainer layout, int widthMode, int widthSize, int heightMode, int heightSize) {
        int heightPadding = this.mMeasurer.mPaddingHeight;
        int widthPadding = this.mMeasurer.mPaddingWidth;
        ConstraintWidget.DimensionBehaviour widthBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour heightBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        int desiredWidth = 0;
        int desiredHeight = 0;
        int childCount = getChildCount();
        switch (widthMode) {
            case Integer.MIN_VALUE:
                widthBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                desiredWidth = widthSize;
                if (childCount == 0) {
                    desiredWidth = Math.max(0, this.mMinWidth);
                    break;
                }
                break;
            case 0:
                widthBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    desiredWidth = Math.max(0, this.mMinWidth);
                    break;
                }
                break;
            case BasicMeasure.EXACTLY:
                desiredWidth = Math.min(this.mMaxWidth - widthPadding, widthSize);
                break;
        }
        switch (heightMode) {
            case Integer.MIN_VALUE:
                heightBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                desiredHeight = heightSize;
                if (childCount == 0) {
                    desiredHeight = Math.max(0, this.mMinHeight);
                    break;
                }
                break;
            case 0:
                heightBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    desiredHeight = Math.max(0, this.mMinHeight);
                    break;
                }
                break;
            case BasicMeasure.EXACTLY:
                desiredHeight = Math.min(this.mMaxHeight - heightPadding, heightSize);
                break;
        }
        if (!(desiredWidth == layout.getWidth() && desiredHeight == layout.getHeight())) {
            layout.invalidateMeasures();
        }
        layout.setX(0);
        layout.setY(0);
        layout.setMaxWidth(this.mMaxWidth - widthPadding);
        layout.setMaxHeight(this.mMaxHeight - heightPadding);
        layout.setMinWidth(0);
        layout.setMinHeight(0);
        layout.setHorizontalDimensionBehaviour(widthBehaviour);
        layout.setWidth(desiredWidth);
        layout.setVerticalDimensionBehaviour(heightBehaviour);
        layout.setHeight(desiredHeight);
        layout.setMinWidth(this.mMinWidth - widthPadding);
        layout.setMinHeight(this.mMinHeight - heightPadding);
    }

    public void setState(int id, int screenWidth, int screenHeight) {
        if (this.mConstraintLayoutSpec != null) {
            this.mConstraintLayoutSpec.updateConstraints(id, (float) screenWidth, (float) screenHeight);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        View content;
        if (this.mMetrics != null) {
            this.mMetrics.mNumberOfLayouts++;
        }
        int widgetsCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i = 0; i < widgetsCount; i++) {
            View child = getChildAt(i);
            LayoutParams params = (LayoutParams) child.getLayoutParams();
            ConstraintWidget widget = params.mWidget;
            if ((child.getVisibility() != 8 || params.mIsGuideline || params.mIsHelper || params.mIsVirtualGroup || isInEditMode) && !params.mIsInPlaceholder) {
                int l = widget.getX();
                int t = widget.getY();
                int r = widget.getWidth() + l;
                int b = widget.getHeight() + t;
                child.layout(l, t, r, b);
                if ((child instanceof Placeholder) && (content = ((Placeholder) child).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(l, t, r, b);
                }
            }
        }
        int helperCount = this.mConstraintHelpers.size();
        if (helperCount > 0) {
            for (int i2 = 0; i2 < helperCount; i2++) {
                this.mConstraintHelpers.get(i2).updatePostLayout(this);
            }
        }
    }

    public void setOptimizationLevel(int level) {
        this.mOptimizationLevel = level;
        this.mLayoutWidget.setOptimizationLevel(level);
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.getOptimizationLevel();
    }

    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LayoutParams(getContext(), attrs);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new LayoutParams(p);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof LayoutParams;
    }

    public void setConstraintSet(ConstraintSet set) {
        this.mConstraintSet = set;
    }

    public View getViewById(int id) {
        return this.mChildrenByIds.get(id);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        float ow;
        float ch;
        float cw;
        int helperCount;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.mConstraintHelpers != null && (helperCount = constraintLayout.mConstraintHelpers.size()) > 0) {
            for (int i = 0; i < helperCount; i++) {
                constraintLayout.mConstraintHelpers.get(i).updatePreDraw(constraintLayout);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float cw2 = (float) getWidth();
            float ch2 = (float) getHeight();
            float ow2 = 1080.0f;
            int count = getChildCount();
            int i2 = 0;
            while (i2 < count) {
                View child = constraintLayout.getChildAt(i2);
                if (child.getVisibility() == 8) {
                    cw = cw2;
                    ch = ch2;
                    ow = ow2;
                } else {
                    Object tag = child.getTag();
                    if (tag == null || !(tag instanceof String)) {
                        cw = cw2;
                        ch = ch2;
                        ow = ow2;
                    } else {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int x = Integer.parseInt(split[0]);
                            int y = Integer.parseInt(split[1]);
                            int x2 = (int) ((((float) x) / ow2) * cw2);
                            int y2 = (int) ((((float) y) / 1920.0f) * ch2);
                            int w = (int) ((((float) Integer.parseInt(split[2])) / ow2) * cw2);
                            int h = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * ch2);
                            Paint paint = new Paint();
                            paint.setColor(SupportMenu.CATEGORY_MASK);
                            cw = cw2;
                            ch = ch2;
                            ow = ow2;
                            Canvas canvas2 = canvas;
                            Paint paint2 = paint;
                            canvas2.drawLine((float) x2, (float) y2, (float) (x2 + w), (float) y2, paint2);
                            canvas2.drawLine((float) (x2 + w), (float) y2, (float) (x2 + w), (float) (y2 + h), paint2);
                            canvas2.drawLine((float) (x2 + w), (float) (y2 + h), (float) x2, (float) (y2 + h), paint2);
                            canvas2.drawLine((float) x2, (float) (y2 + h), (float) x2, (float) y2, paint2);
                            paint.setColor(-16711936);
                            canvas2.drawLine((float) x2, (float) y2, (float) (x2 + w), (float) (y2 + h), paint2);
                            canvas2.drawLine((float) x2, (float) (y2 + h), (float) (x2 + w), (float) y2, paint2);
                        } else {
                            cw = cw2;
                            ch = ch2;
                            ow = ow2;
                        }
                    }
                }
                i2++;
                constraintLayout = this;
                cw2 = cw;
                ch2 = ch;
                ow2 = ow;
            }
            float f = ch2;
            float f2 = ow2;
        }
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        if (this.mConstraintLayoutSpec != null) {
            this.mConstraintLayoutSpec.setOnConstraintsChanged(constraintsChangedListener);
        }
    }

    public void loadLayoutDescription(int layoutDescription) {
        if (layoutDescription != 0) {
            try {
                this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, layoutDescription);
            } catch (Resources.NotFoundException e) {
                this.mConstraintLayoutSpec = null;
            }
        } else {
            this.mConstraintLayoutSpec = null;
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int BASELINE = 5;
        public static final int BOTTOM = 4;
        public static final int CHAIN_PACKED = 2;
        public static final int CHAIN_SPREAD = 0;
        public static final int CHAIN_SPREAD_INSIDE = 1;
        public static final int CIRCLE = 8;
        public static final int END = 7;
        public static final int GONE_UNSET = Integer.MIN_VALUE;
        public static final int HORIZONTAL = 0;
        public static final int LEFT = 1;
        public static final int MATCH_CONSTRAINT = 0;
        public static final int MATCH_CONSTRAINT_PERCENT = 2;
        public static final int MATCH_CONSTRAINT_SPREAD = 0;
        public static final int MATCH_CONSTRAINT_WRAP = 1;
        public static final int PARENT_ID = 0;
        public static final int RIGHT = 2;
        public static final int START = 6;
        public static final int TOP = 3;
        public static final int UNSET = -1;
        public static final int VERTICAL = 1;
        public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
        public static final int WRAP_BEHAVIOR_INCLUDED = 0;
        public static final int WRAP_BEHAVIOR_SKIPPED = 3;
        public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
        public int baselineMargin = 0;
        public int baselineToBaseline = -1;
        public int baselineToBottom = -1;
        public int baselineToTop = -1;
        public int bottomToBottom = -1;
        public int bottomToTop = -1;
        public float circleAngle = 0.0f;
        public int circleConstraint = -1;
        public int circleRadius = 0;
        public boolean constrainedHeight = false;
        public boolean constrainedWidth = false;
        public String constraintTag = null;
        public String dimensionRatio = null;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int endToEnd = -1;
        public int endToStart = -1;
        public int goneBaselineMargin = Integer.MIN_VALUE;
        public int goneBottomMargin = Integer.MIN_VALUE;
        public int goneEndMargin = Integer.MIN_VALUE;
        public int goneLeftMargin = Integer.MIN_VALUE;
        public int goneRightMargin = Integer.MIN_VALUE;
        public int goneStartMargin = Integer.MIN_VALUE;
        public int goneTopMargin = Integer.MIN_VALUE;
        public int guideBegin = -1;
        public int guideEnd = -1;
        public float guidePercent = -1.0f;
        public boolean guidelineUseRtl = true;
        public boolean helped = false;
        public float horizontalBias = 0.5f;
        public int horizontalChainStyle = 0;
        public float horizontalWeight = -1.0f;
        public int leftToLeft = -1;
        public int leftToRight = -1;
        int mDimensionRatioSide = 1;
        float mDimensionRatioValue = 0.0f;
        boolean mHeightSet = true;
        boolean mHorizontalDimensionFixed = true;
        boolean mIsGuideline = false;
        boolean mIsHelper = false;
        boolean mIsInPlaceholder = false;
        boolean mIsVirtualGroup = false;
        boolean mNeedsBaseline = false;
        int mResolveGoneLeftMargin = Integer.MIN_VALUE;
        int mResolveGoneRightMargin = Integer.MIN_VALUE;
        int mResolvedGuideBegin;
        int mResolvedGuideEnd;
        float mResolvedGuidePercent;
        float mResolvedHorizontalBias = 0.5f;
        int mResolvedLeftToLeft = -1;
        int mResolvedLeftToRight = -1;
        int mResolvedRightToLeft = -1;
        int mResolvedRightToRight = -1;
        boolean mVerticalDimensionFixed = true;
        ConstraintWidget mWidget = new ConstraintWidget();
        boolean mWidthSet = true;
        public int matchConstraintDefaultHeight = 0;
        public int matchConstraintDefaultWidth = 0;
        public int matchConstraintMaxHeight = 0;
        public int matchConstraintMaxWidth = 0;
        public int matchConstraintMinHeight = 0;
        public int matchConstraintMinWidth = 0;
        public float matchConstraintPercentHeight = 1.0f;
        public float matchConstraintPercentWidth = 1.0f;
        public int orientation = -1;
        public int rightToLeft = -1;
        public int rightToRight = -1;
        public int startToEnd = -1;
        public int startToStart = -1;
        public int topToBottom = -1;
        public int topToTop = -1;
        public float verticalBias = 0.5f;
        public int verticalChainStyle = 0;
        public float verticalWeight = -1.0f;
        public int wrapBehaviorInParent = 0;

        public ConstraintWidget getConstraintWidget() {
            return this.mWidget;
        }

        public void setWidgetDebugName(String text) {
            this.mWidget.setDebugName(text);
        }

        public void reset() {
            if (this.mWidget != null) {
                this.mWidget.reset();
            }
        }

        public LayoutParams(ViewGroup.LayoutParams params) {
            super(params);
            if (params instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginSource = (ViewGroup.MarginLayoutParams) params;
                this.leftMargin = marginSource.leftMargin;
                this.rightMargin = marginSource.rightMargin;
                this.topMargin = marginSource.topMargin;
                this.bottomMargin = marginSource.bottomMargin;
                setMarginStart(marginSource.getMarginStart());
                setMarginEnd(marginSource.getMarginEnd());
            }
            if (params instanceof LayoutParams) {
                LayoutParams source = (LayoutParams) params;
                this.guideBegin = source.guideBegin;
                this.guideEnd = source.guideEnd;
                this.guidePercent = source.guidePercent;
                this.guidelineUseRtl = source.guidelineUseRtl;
                this.leftToLeft = source.leftToLeft;
                this.leftToRight = source.leftToRight;
                this.rightToLeft = source.rightToLeft;
                this.rightToRight = source.rightToRight;
                this.topToTop = source.topToTop;
                this.topToBottom = source.topToBottom;
                this.bottomToTop = source.bottomToTop;
                this.bottomToBottom = source.bottomToBottom;
                this.baselineToBaseline = source.baselineToBaseline;
                this.baselineToTop = source.baselineToTop;
                this.baselineToBottom = source.baselineToBottom;
                this.circleConstraint = source.circleConstraint;
                this.circleRadius = source.circleRadius;
                this.circleAngle = source.circleAngle;
                this.startToEnd = source.startToEnd;
                this.startToStart = source.startToStart;
                this.endToStart = source.endToStart;
                this.endToEnd = source.endToEnd;
                this.goneLeftMargin = source.goneLeftMargin;
                this.goneTopMargin = source.goneTopMargin;
                this.goneRightMargin = source.goneRightMargin;
                this.goneBottomMargin = source.goneBottomMargin;
                this.goneStartMargin = source.goneStartMargin;
                this.goneEndMargin = source.goneEndMargin;
                this.goneBaselineMargin = source.goneBaselineMargin;
                this.baselineMargin = source.baselineMargin;
                this.horizontalBias = source.horizontalBias;
                this.verticalBias = source.verticalBias;
                this.dimensionRatio = source.dimensionRatio;
                this.mDimensionRatioValue = source.mDimensionRatioValue;
                this.mDimensionRatioSide = source.mDimensionRatioSide;
                this.horizontalWeight = source.horizontalWeight;
                this.verticalWeight = source.verticalWeight;
                this.horizontalChainStyle = source.horizontalChainStyle;
                this.verticalChainStyle = source.verticalChainStyle;
                this.constrainedWidth = source.constrainedWidth;
                this.constrainedHeight = source.constrainedHeight;
                this.matchConstraintDefaultWidth = source.matchConstraintDefaultWidth;
                this.matchConstraintDefaultHeight = source.matchConstraintDefaultHeight;
                this.matchConstraintMinWidth = source.matchConstraintMinWidth;
                this.matchConstraintMaxWidth = source.matchConstraintMaxWidth;
                this.matchConstraintMinHeight = source.matchConstraintMinHeight;
                this.matchConstraintMaxHeight = source.matchConstraintMaxHeight;
                this.matchConstraintPercentWidth = source.matchConstraintPercentWidth;
                this.matchConstraintPercentHeight = source.matchConstraintPercentHeight;
                this.editorAbsoluteX = source.editorAbsoluteX;
                this.editorAbsoluteY = source.editorAbsoluteY;
                this.orientation = source.orientation;
                this.mHorizontalDimensionFixed = source.mHorizontalDimensionFixed;
                this.mVerticalDimensionFixed = source.mVerticalDimensionFixed;
                this.mNeedsBaseline = source.mNeedsBaseline;
                this.mIsGuideline = source.mIsGuideline;
                this.mResolvedLeftToLeft = source.mResolvedLeftToLeft;
                this.mResolvedLeftToRight = source.mResolvedLeftToRight;
                this.mResolvedRightToLeft = source.mResolvedRightToLeft;
                this.mResolvedRightToRight = source.mResolvedRightToRight;
                this.mResolveGoneLeftMargin = source.mResolveGoneLeftMargin;
                this.mResolveGoneRightMargin = source.mResolveGoneRightMargin;
                this.mResolvedHorizontalBias = source.mResolvedHorizontalBias;
                this.constraintTag = source.constraintTag;
                this.wrapBehaviorInParent = source.wrapBehaviorInParent;
                this.mWidget = source.mWidget;
                this.mWidthSet = source.mWidthSet;
                this.mHeightSet = source.mHeightSet;
            }
        }

        private static class Table {
            public static final int ANDROID_ORIENTATION = 1;
            public static final int GUIDELINE_USE_RTL = 67;
            public static final int LAYOUT_CONSTRAINED_HEIGHT = 28;
            public static final int LAYOUT_CONSTRAINED_WIDTH = 27;
            public static final int LAYOUT_CONSTRAINT_BASELINE_CREATOR = 43;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BASELINE_OF = 16;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF = 53;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF = 52;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_CREATOR = 42;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_BOTTOM_OF = 15;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_TOP_OF = 14;
            public static final int LAYOUT_CONSTRAINT_CIRCLE = 2;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_ANGLE = 4;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_RADIUS = 3;
            public static final int LAYOUT_CONSTRAINT_DIMENSION_RATIO = 44;
            public static final int LAYOUT_CONSTRAINT_END_TO_END_OF = 20;
            public static final int LAYOUT_CONSTRAINT_END_TO_START_OF = 19;
            public static final int LAYOUT_CONSTRAINT_GUIDE_BEGIN = 5;
            public static final int LAYOUT_CONSTRAINT_GUIDE_END = 6;
            public static final int LAYOUT_CONSTRAINT_GUIDE_PERCENT = 7;
            public static final int LAYOUT_CONSTRAINT_HEIGHT = 65;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_DEFAULT = 32;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MAX = 37;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MIN = 36;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_PERCENT = 38;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_BIAS = 29;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_CHAINSTYLE = 47;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_WEIGHT = 45;
            public static final int LAYOUT_CONSTRAINT_LEFT_CREATOR = 39;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_LEFT_OF = 8;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_RIGHT_OF = 9;
            public static final int LAYOUT_CONSTRAINT_RIGHT_CREATOR = 41;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_LEFT_OF = 10;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_RIGHT_OF = 11;
            public static final int LAYOUT_CONSTRAINT_START_TO_END_OF = 17;
            public static final int LAYOUT_CONSTRAINT_START_TO_START_OF = 18;
            public static final int LAYOUT_CONSTRAINT_TAG = 51;
            public static final int LAYOUT_CONSTRAINT_TOP_CREATOR = 40;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_BOTTOM_OF = 13;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_TOP_OF = 12;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_BIAS = 30;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE = 48;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_WEIGHT = 46;
            public static final int LAYOUT_CONSTRAINT_WIDTH = 64;
            public static final int LAYOUT_CONSTRAINT_WIDTH_DEFAULT = 31;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MAX = 34;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MIN = 33;
            public static final int LAYOUT_CONSTRAINT_WIDTH_PERCENT = 35;
            public static final int LAYOUT_EDITOR_ABSOLUTEX = 49;
            public static final int LAYOUT_EDITOR_ABSOLUTEY = 50;
            public static final int LAYOUT_GONE_MARGIN_BASELINE = 55;
            public static final int LAYOUT_GONE_MARGIN_BOTTOM = 24;
            public static final int LAYOUT_GONE_MARGIN_END = 26;
            public static final int LAYOUT_GONE_MARGIN_LEFT = 21;
            public static final int LAYOUT_GONE_MARGIN_RIGHT = 23;
            public static final int LAYOUT_GONE_MARGIN_START = 25;
            public static final int LAYOUT_GONE_MARGIN_TOP = 22;
            public static final int LAYOUT_MARGIN_BASELINE = 54;
            public static final int LAYOUT_WRAP_BEHAVIOR_IN_PARENT = 66;
            public static final int UNUSED = 0;
            public static final SparseIntArray sMap = new SparseIntArray();

            private Table() {
            }

            static {
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sMap.append(R.styleable.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sMap.append(R.styleable.ConstraintLayout_Layout_android_orientation, 1);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
                sMap.append(R.styleable.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public LayoutParams(Context c, AttributeSet attrs) {
            super(c, attrs);
            TypedArray a = c.obtainStyledAttributes(attrs, R.styleable.ConstraintLayout_Layout);
            int n = a.getIndexCount();
            for (int i = 0; i < n; i++) {
                int attr = a.getIndex(i);
                switch (Table.sMap.get(attr)) {
                    case 1:
                        this.orientation = a.getInt(attr, this.orientation);
                        break;
                    case 2:
                        this.circleConstraint = a.getResourceId(attr, this.circleConstraint);
                        if (this.circleConstraint != -1) {
                            break;
                        } else {
                            this.circleConstraint = a.getInt(attr, -1);
                            break;
                        }
                    case 3:
                        this.circleRadius = a.getDimensionPixelSize(attr, this.circleRadius);
                        break;
                    case 4:
                        this.circleAngle = a.getFloat(attr, this.circleAngle) % 360.0f;
                        if (this.circleAngle >= 0.0f) {
                            break;
                        } else {
                            this.circleAngle = (360.0f - this.circleAngle) % 360.0f;
                            break;
                        }
                    case 5:
                        this.guideBegin = a.getDimensionPixelOffset(attr, this.guideBegin);
                        break;
                    case 6:
                        this.guideEnd = a.getDimensionPixelOffset(attr, this.guideEnd);
                        break;
                    case 7:
                        this.guidePercent = a.getFloat(attr, this.guidePercent);
                        break;
                    case 8:
                        this.leftToLeft = a.getResourceId(attr, this.leftToLeft);
                        if (this.leftToLeft != -1) {
                            break;
                        } else {
                            this.leftToLeft = a.getInt(attr, -1);
                            break;
                        }
                    case 9:
                        this.leftToRight = a.getResourceId(attr, this.leftToRight);
                        if (this.leftToRight != -1) {
                            break;
                        } else {
                            this.leftToRight = a.getInt(attr, -1);
                            break;
                        }
                    case 10:
                        this.rightToLeft = a.getResourceId(attr, this.rightToLeft);
                        if (this.rightToLeft != -1) {
                            break;
                        } else {
                            this.rightToLeft = a.getInt(attr, -1);
                            break;
                        }
                    case 11:
                        this.rightToRight = a.getResourceId(attr, this.rightToRight);
                        if (this.rightToRight != -1) {
                            break;
                        } else {
                            this.rightToRight = a.getInt(attr, -1);
                            break;
                        }
                    case 12:
                        this.topToTop = a.getResourceId(attr, this.topToTop);
                        if (this.topToTop != -1) {
                            break;
                        } else {
                            this.topToTop = a.getInt(attr, -1);
                            break;
                        }
                    case 13:
                        this.topToBottom = a.getResourceId(attr, this.topToBottom);
                        if (this.topToBottom != -1) {
                            break;
                        } else {
                            this.topToBottom = a.getInt(attr, -1);
                            break;
                        }
                    case 14:
                        this.bottomToTop = a.getResourceId(attr, this.bottomToTop);
                        if (this.bottomToTop != -1) {
                            break;
                        } else {
                            this.bottomToTop = a.getInt(attr, -1);
                            break;
                        }
                    case 15:
                        this.bottomToBottom = a.getResourceId(attr, this.bottomToBottom);
                        if (this.bottomToBottom != -1) {
                            break;
                        } else {
                            this.bottomToBottom = a.getInt(attr, -1);
                            break;
                        }
                    case 16:
                        this.baselineToBaseline = a.getResourceId(attr, this.baselineToBaseline);
                        if (this.baselineToBaseline != -1) {
                            break;
                        } else {
                            this.baselineToBaseline = a.getInt(attr, -1);
                            break;
                        }
                    case 17:
                        this.startToEnd = a.getResourceId(attr, this.startToEnd);
                        if (this.startToEnd != -1) {
                            break;
                        } else {
                            this.startToEnd = a.getInt(attr, -1);
                            break;
                        }
                    case 18:
                        this.startToStart = a.getResourceId(attr, this.startToStart);
                        if (this.startToStart != -1) {
                            break;
                        } else {
                            this.startToStart = a.getInt(attr, -1);
                            break;
                        }
                    case 19:
                        this.endToStart = a.getResourceId(attr, this.endToStart);
                        if (this.endToStart != -1) {
                            break;
                        } else {
                            this.endToStart = a.getInt(attr, -1);
                            break;
                        }
                    case 20:
                        this.endToEnd = a.getResourceId(attr, this.endToEnd);
                        if (this.endToEnd != -1) {
                            break;
                        } else {
                            this.endToEnd = a.getInt(attr, -1);
                            break;
                        }
                    case 21:
                        this.goneLeftMargin = a.getDimensionPixelSize(attr, this.goneLeftMargin);
                        break;
                    case 22:
                        this.goneTopMargin = a.getDimensionPixelSize(attr, this.goneTopMargin);
                        break;
                    case 23:
                        this.goneRightMargin = a.getDimensionPixelSize(attr, this.goneRightMargin);
                        break;
                    case 24:
                        this.goneBottomMargin = a.getDimensionPixelSize(attr, this.goneBottomMargin);
                        break;
                    case 25:
                        this.goneStartMargin = a.getDimensionPixelSize(attr, this.goneStartMargin);
                        break;
                    case 26:
                        this.goneEndMargin = a.getDimensionPixelSize(attr, this.goneEndMargin);
                        break;
                    case 27:
                        this.constrainedWidth = a.getBoolean(attr, this.constrainedWidth);
                        break;
                    case 28:
                        this.constrainedHeight = a.getBoolean(attr, this.constrainedHeight);
                        break;
                    case Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /*29*/:
                        this.horizontalBias = a.getFloat(attr, this.horizontalBias);
                        break;
                    case 30:
                        this.verticalBias = a.getFloat(attr, this.verticalBias);
                        break;
                    case Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /*31*/:
                        this.matchConstraintDefaultWidth = a.getInt(attr, 0);
                        if (this.matchConstraintDefaultWidth != 1) {
                            break;
                        } else {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        this.matchConstraintDefaultHeight = a.getInt(attr, 0);
                        if (this.matchConstraintDefaultHeight != 1) {
                            break;
                        } else {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.matchConstraintMinWidth = a.getDimensionPixelSize(attr, this.matchConstraintMinWidth);
                            break;
                        } catch (Exception e) {
                            if (a.getInt(attr, this.matchConstraintMinWidth) != -2) {
                                break;
                            } else {
                                this.matchConstraintMinWidth = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.matchConstraintMaxWidth = a.getDimensionPixelSize(attr, this.matchConstraintMaxWidth);
                            break;
                        } catch (Exception e2) {
                            if (a.getInt(attr, this.matchConstraintMaxWidth) != -2) {
                                break;
                            } else {
                                this.matchConstraintMaxWidth = -2;
                                break;
                            }
                        }
                    case 35:
                        this.matchConstraintPercentWidth = Math.max(0.0f, a.getFloat(attr, this.matchConstraintPercentWidth));
                        this.matchConstraintDefaultWidth = 2;
                        break;
                    case 36:
                        try {
                            this.matchConstraintMinHeight = a.getDimensionPixelSize(attr, this.matchConstraintMinHeight);
                            break;
                        } catch (Exception e3) {
                            if (a.getInt(attr, this.matchConstraintMinHeight) != -2) {
                                break;
                            } else {
                                this.matchConstraintMinHeight = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.matchConstraintMaxHeight = a.getDimensionPixelSize(attr, this.matchConstraintMaxHeight);
                            break;
                        } catch (Exception e4) {
                            if (a.getInt(attr, this.matchConstraintMaxHeight) != -2) {
                                break;
                            } else {
                                this.matchConstraintMaxHeight = -2;
                                break;
                            }
                        }
                    case 38:
                        this.matchConstraintPercentHeight = Math.max(0.0f, a.getFloat(attr, this.matchConstraintPercentHeight));
                        this.matchConstraintDefaultHeight = 2;
                        break;
                    case 44:
                        ConstraintSet.parseDimensionRatioString(this, a.getString(attr));
                        break;
                    case 45:
                        this.horizontalWeight = a.getFloat(attr, this.horizontalWeight);
                        break;
                    case 46:
                        this.verticalWeight = a.getFloat(attr, this.verticalWeight);
                        break;
                    case 47:
                        this.horizontalChainStyle = a.getInt(attr, 0);
                        break;
                    case Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /*48*/:
                        this.verticalChainStyle = a.getInt(attr, 0);
                        break;
                    case Table.LAYOUT_EDITOR_ABSOLUTEX /*49*/:
                        this.editorAbsoluteX = a.getDimensionPixelOffset(attr, this.editorAbsoluteX);
                        break;
                    case 50:
                        this.editorAbsoluteY = a.getDimensionPixelOffset(attr, this.editorAbsoluteY);
                        break;
                    case Table.LAYOUT_CONSTRAINT_TAG /*51*/:
                        this.constraintTag = a.getString(attr);
                        break;
                    case Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /*52*/:
                        this.baselineToTop = a.getResourceId(attr, this.baselineToTop);
                        if (this.baselineToTop != -1) {
                            break;
                        } else {
                            this.baselineToTop = a.getInt(attr, -1);
                            break;
                        }
                    case Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /*53*/:
                        this.baselineToBottom = a.getResourceId(attr, this.baselineToBottom);
                        if (this.baselineToBottom != -1) {
                            break;
                        } else {
                            this.baselineToBottom = a.getInt(attr, -1);
                            break;
                        }
                    case Table.LAYOUT_MARGIN_BASELINE /*54*/:
                        this.baselineMargin = a.getDimensionPixelSize(attr, this.baselineMargin);
                        break;
                    case Table.LAYOUT_GONE_MARGIN_BASELINE /*55*/:
                        this.goneBaselineMargin = a.getDimensionPixelSize(attr, this.goneBaselineMargin);
                        break;
                    case 64:
                        ConstraintSet.parseDimensionConstraints(this, a, attr, 0);
                        this.mWidthSet = true;
                        break;
                    case Table.LAYOUT_CONSTRAINT_HEIGHT /*65*/:
                        ConstraintSet.parseDimensionConstraints(this, a, attr, 1);
                        this.mHeightSet = true;
                        break;
                    case Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /*66*/:
                        this.wrapBehaviorInParent = a.getInt(attr, this.wrapBehaviorInParent);
                        break;
                    case Table.GUIDELINE_USE_RTL /*67*/:
                        this.guidelineUseRtl = a.getBoolean(attr, this.guidelineUseRtl);
                        break;
                }
            }
            a.recycle();
            validate();
        }

        public void validate() {
            this.mIsGuideline = false;
            this.mHorizontalDimensionFixed = true;
            this.mVerticalDimensionFixed = true;
            if (this.width == -2 && this.constrainedWidth) {
                this.mHorizontalDimensionFixed = false;
                if (this.matchConstraintDefaultWidth == 0) {
                    this.matchConstraintDefaultWidth = 1;
                }
            }
            if (this.height == -2 && this.constrainedHeight) {
                this.mVerticalDimensionFixed = false;
                if (this.matchConstraintDefaultHeight == 0) {
                    this.matchConstraintDefaultHeight = 1;
                }
            }
            if (this.width == 0 || this.width == -1) {
                this.mHorizontalDimensionFixed = false;
                if (this.width == 0 && this.matchConstraintDefaultWidth == 1) {
                    this.width = -2;
                    this.constrainedWidth = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.mVerticalDimensionFixed = false;
                if (this.height == 0 && this.matchConstraintDefaultHeight == 1) {
                    this.height = -2;
                    this.constrainedHeight = true;
                }
            }
            if (this.guidePercent != -1.0f || this.guideBegin != -1 || this.guideEnd != -1) {
                this.mIsGuideline = true;
                this.mHorizontalDimensionFixed = true;
                this.mVerticalDimensionFixed = true;
                if (!(this.mWidget instanceof Guideline)) {
                    this.mWidget = new Guideline();
                }
                ((Guideline) this.mWidget).setOrientation(this.orientation);
            }
        }

        public LayoutParams(int width, int height) {
            super(width, height);
        }

        public void resolveLayoutDirection(int layoutDirection) {
            int originalLeftMargin = this.leftMargin;
            int originalRightMargin = this.rightMargin;
            super.resolveLayoutDirection(layoutDirection);
            boolean isRtl = 1 == getLayoutDirection();
            this.mResolvedRightToLeft = -1;
            this.mResolvedRightToRight = -1;
            this.mResolvedLeftToLeft = -1;
            this.mResolvedLeftToRight = -1;
            this.mResolveGoneLeftMargin = -1;
            this.mResolveGoneRightMargin = -1;
            this.mResolveGoneLeftMargin = this.goneLeftMargin;
            this.mResolveGoneRightMargin = this.goneRightMargin;
            this.mResolvedHorizontalBias = this.horizontalBias;
            this.mResolvedGuideBegin = this.guideBegin;
            this.mResolvedGuideEnd = this.guideEnd;
            this.mResolvedGuidePercent = this.guidePercent;
            if (isRtl) {
                boolean startEndDefined = false;
                if (this.startToEnd != -1) {
                    this.mResolvedRightToLeft = this.startToEnd;
                    startEndDefined = true;
                } else if (this.startToStart != -1) {
                    this.mResolvedRightToRight = this.startToStart;
                    startEndDefined = true;
                }
                if (this.endToStart != -1) {
                    this.mResolvedLeftToRight = this.endToStart;
                    startEndDefined = true;
                }
                if (this.endToEnd != -1) {
                    this.mResolvedLeftToLeft = this.endToEnd;
                    startEndDefined = true;
                }
                if (this.goneStartMargin != Integer.MIN_VALUE) {
                    this.mResolveGoneRightMargin = this.goneStartMargin;
                }
                if (this.goneEndMargin != Integer.MIN_VALUE) {
                    this.mResolveGoneLeftMargin = this.goneEndMargin;
                }
                if (startEndDefined) {
                    this.mResolvedHorizontalBias = 1.0f - this.horizontalBias;
                }
                if (this.mIsGuideline && this.orientation == 1 && this.guidelineUseRtl) {
                    if (this.guidePercent != -1.0f) {
                        this.mResolvedGuidePercent = 1.0f - this.guidePercent;
                        this.mResolvedGuideBegin = -1;
                        this.mResolvedGuideEnd = -1;
                    } else if (this.guideBegin != -1) {
                        this.mResolvedGuideEnd = this.guideBegin;
                        this.mResolvedGuideBegin = -1;
                        this.mResolvedGuidePercent = -1.0f;
                    } else if (this.guideEnd != -1) {
                        this.mResolvedGuideBegin = this.guideEnd;
                        this.mResolvedGuideEnd = -1;
                        this.mResolvedGuidePercent = -1.0f;
                    }
                }
            } else {
                if (this.startToEnd != -1) {
                    this.mResolvedLeftToRight = this.startToEnd;
                }
                if (this.startToStart != -1) {
                    this.mResolvedLeftToLeft = this.startToStart;
                }
                if (this.endToStart != -1) {
                    this.mResolvedRightToLeft = this.endToStart;
                }
                if (this.endToEnd != -1) {
                    this.mResolvedRightToRight = this.endToEnd;
                }
                if (this.goneStartMargin != Integer.MIN_VALUE) {
                    this.mResolveGoneLeftMargin = this.goneStartMargin;
                }
                if (this.goneEndMargin != Integer.MIN_VALUE) {
                    this.mResolveGoneRightMargin = this.goneEndMargin;
                }
            }
            if (this.endToStart == -1 && this.endToEnd == -1 && this.startToStart == -1 && this.startToEnd == -1) {
                if (this.rightToLeft != -1) {
                    this.mResolvedRightToLeft = this.rightToLeft;
                    if (this.rightMargin <= 0 && originalRightMargin > 0) {
                        this.rightMargin = originalRightMargin;
                    }
                } else if (this.rightToRight != -1) {
                    this.mResolvedRightToRight = this.rightToRight;
                    if (this.rightMargin <= 0 && originalRightMargin > 0) {
                        this.rightMargin = originalRightMargin;
                    }
                }
                if (this.leftToLeft != -1) {
                    this.mResolvedLeftToLeft = this.leftToLeft;
                    if (this.leftMargin <= 0 && originalLeftMargin > 0) {
                        this.leftMargin = originalLeftMargin;
                    }
                } else if (this.leftToRight != -1) {
                    this.mResolvedLeftToRight = this.leftToRight;
                    if (this.leftMargin <= 0 && originalLeftMargin > 0) {
                        this.leftMargin = originalLeftMargin;
                    }
                }
            }
        }

        public String getConstraintTag() {
            return this.constraintTag;
        }
    }

    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public String getSceneString() {
        int id;
        StringBuilder ret = new StringBuilder();
        if (this.mLayoutWidget.stringId == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.stringId = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.stringId = "parent";
            }
        }
        if (this.mLayoutWidget.getDebugName() == null) {
            this.mLayoutWidget.setDebugName(this.mLayoutWidget.stringId);
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.getDebugName());
        }
        Iterator<ConstraintWidget> it = this.mLayoutWidget.getChildren().iterator();
        while (it.hasNext()) {
            ConstraintWidget child = it.next();
            View v = (View) child.getCompanionWidget();
            if (v != null) {
                if (child.stringId == null && (id = v.getId()) != -1) {
                    child.stringId = getContext().getResources().getResourceEntryName(id);
                }
                if (child.getDebugName() == null) {
                    child.setDebugName(child.stringId);
                    Log.v(TAG, " setDebugName " + child.getDebugName());
                }
            }
        }
        this.mLayoutWidget.getSceneString(ret);
        return ret.toString();
    }

    public void addValueModifier(ValueModifier modifier) {
        if (this.mModifiers == null) {
            this.mModifiers = new ArrayList<>();
        }
        this.mModifiers.add(modifier);
    }

    /* access modifiers changed from: package-private */
    public void removeValueModifier(ValueModifier modifier) {
        if (modifier != null) {
            this.mModifiers.remove(modifier);
        }
    }

    /* access modifiers changed from: protected */
    public boolean dynamicUpdateConstraints(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.mModifiers == null) {
            return false;
        }
        boolean dirty = false;
        int width = View.MeasureSpec.getSize(widthMeasureSpec);
        int height = View.MeasureSpec.getSize(heightMeasureSpec);
        Iterator<ValueModifier> it = this.mModifiers.iterator();
        while (it.hasNext()) {
            ValueModifier m = it.next();
            Iterator<ConstraintWidget> it2 = this.mLayoutWidget.getChildren().iterator();
            while (it2.hasNext()) {
                View view = (View) it2.next().getCompanionWidget();
                dirty |= m.update(width, height, view.getId(), view, (LayoutParams) view.getLayoutParams());
            }
        }
        return dirty;
    }
}
