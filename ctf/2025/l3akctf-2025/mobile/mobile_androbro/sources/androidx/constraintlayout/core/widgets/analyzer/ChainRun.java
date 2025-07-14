package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

public class ChainRun extends WidgetRun {
    private int mChainStyle;
    ArrayList<WidgetRun> mWidgets = new ArrayList<>();

    public ChainRun(ConstraintWidget widget, int orientation) {
        super(widget);
        this.orientation = orientation;
        build();
    }

    public String toString() {
        StringBuilder log = new StringBuilder("ChainRun ");
        log.append(this.orientation == 0 ? "horizontal : " : "vertical : ");
        Iterator<WidgetRun> it = this.mWidgets.iterator();
        while (it.hasNext()) {
            log.append("<");
            log.append(it.next());
            log.append("> ");
        }
        return log.toString();
    }

    /* access modifiers changed from: package-private */
    public boolean supportsWrapComputation() {
        int count = this.mWidgets.size();
        for (int i = 0; i < count; i++) {
            if (!this.mWidgets.get(i).supportsWrapComputation()) {
                return false;
            }
        }
        return true;
    }

    public long getWrapDimension() {
        int count = this.mWidgets.size();
        long wrapDimension = 0;
        for (int i = 0; i < count; i++) {
            WidgetRun run = this.mWidgets.get(i);
            wrapDimension = wrapDimension + ((long) run.start.mMargin) + run.getWrapDimension() + ((long) run.end.mMargin);
        }
        return wrapDimension;
    }

    private void build() {
        ConstraintWidget current = this.mWidget;
        ConstraintWidget previous = current.getPreviousChainMember(this.orientation);
        while (previous != null) {
            current = previous;
            previous = current.getPreviousChainMember(this.orientation);
        }
        this.mWidget = current;
        this.mWidgets.add(current.getRun(this.orientation));
        ConstraintWidget next = current.getNextChainMember(this.orientation);
        while (next != null) {
            ConstraintWidget current2 = next;
            this.mWidgets.add(current2.getRun(this.orientation));
            next = current2.getNextChainMember(this.orientation);
        }
        Iterator<WidgetRun> it = this.mWidgets.iterator();
        while (it.hasNext()) {
            WidgetRun run = it.next();
            if (this.orientation == 0) {
                run.mWidget.horizontalChainRun = this;
            } else if (this.orientation == 1) {
                run.mWidget.verticalChainRun = this;
            }
        }
        if ((this.orientation == 0 && ((ConstraintWidgetContainer) this.mWidget.getParent()).isRtl()) && this.mWidgets.size() > 1) {
            this.mWidget = this.mWidgets.get(this.mWidgets.size() - 1).mWidget;
        }
        this.mChainStyle = this.orientation == 0 ? this.mWidget.getHorizontalChainStyle() : this.mWidget.getVerticalChainStyle();
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        this.mRunGroup = null;
        Iterator<WidgetRun> it = this.mWidgets.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    /* access modifiers changed from: package-private */
    public void reset() {
        this.start.resolved = false;
        this.end.resolved = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency r28) {
        /*
            r27 = this;
            r0 = r27
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.start
            boolean r1 = r1.resolved
            if (r1 == 0) goto L_0x048c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.end
            boolean r1 = r1.resolved
            if (r1 != 0) goto L_0x0010
            goto L_0x048c
        L_0x0010:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.mWidget
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.getParent()
            r2 = 0
            boolean r3 = r1 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r3 == 0) goto L_0x0022
            r3 = r1
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r3
            boolean r2 = r3.isRtl()
        L_0x0022:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r0.end
            int r3 = r3.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r0.start
            int r4 = r4.value
            int r3 = r3 - r4
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r8 = r0.mWidgets
            int r8 = r8.size()
            r9 = -1
            r10 = 0
        L_0x0037:
            r11 = 8
            if (r10 >= r8) goto L_0x0051
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r12 = r0.mWidgets
            java.lang.Object r12 = r12.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r12 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r12
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = r12.mWidget
            int r13 = r13.getVisibility()
            if (r13 != r11) goto L_0x004f
            int r10 = r10 + 1
            goto L_0x0037
        L_0x004f:
            r9 = r10
        L_0x0051:
            r10 = -1
            int r12 = r8 + -1
        L_0x0054:
            if (r12 < 0) goto L_0x006c
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r13 = r0.mWidgets
            java.lang.Object r13 = r13.get(r12)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r13 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r13
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r13.mWidget
            int r14 = r14.getVisibility()
            if (r14 != r11) goto L_0x006a
            int r12 = r12 + -1
            goto L_0x0054
        L_0x006a:
            r10 = r12
        L_0x006c:
            r12 = 0
        L_0x006d:
            r15 = 2
            if (r12 >= r15) goto L_0x0121
            r17 = 0
            r15 = r17
        L_0x0074:
            if (r15 >= r8) goto L_0x010e
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r13 = r0.mWidgets
            java.lang.Object r13 = r13.get(r15)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r13 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r13
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r13.mWidget
            int r14 = r14.getVisibility()
            if (r14 != r11) goto L_0x008a
            r19 = r1
            goto L_0x0106
        L_0x008a:
            int r7 = r7 + 1
            if (r15 <= 0) goto L_0x0095
            if (r15 < r9) goto L_0x0095
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r14 = r13.start
            int r14 = r14.mMargin
            int r4 = r4 + r14
        L_0x0095:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r14 = r13.mDimension
            int r14 = r14.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r13.mDimensionBehavior
            r19 = r1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 == r1) goto L_0x00a3
            r1 = 1
            goto L_0x00a4
        L_0x00a3:
            r1 = 0
        L_0x00a4:
            if (r1 == 0) goto L_0x00c7
            int r11 = r0.orientation
            if (r11 != 0) goto L_0x00b5
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r13.mWidget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r11 = r11.mHorizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r11 = r11.mDimension
            boolean r11 = r11.resolved
            if (r11 != 0) goto L_0x00b5
            return
        L_0x00b5:
            int r11 = r0.orientation
            r20 = r1
            r1 = 1
            if (r11 != r1) goto L_0x00e0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r13.mWidget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r1.mVerticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r1.mDimension
            boolean r1 = r1.resolved
            if (r1 != 0) goto L_0x00e0
            return
        L_0x00c7:
            r20 = r1
            int r1 = r13.matchConstraintsType
            r11 = 1
            if (r1 != r11) goto L_0x00d8
            if (r12 != 0) goto L_0x00d8
            r1 = 1
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r11 = r13.mDimension
            int r14 = r11.wrapValue
            int r5 = r5 + 1
            goto L_0x00e2
        L_0x00d8:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r13.mDimension
            boolean r1 = r1.resolved
            if (r1 == 0) goto L_0x00e0
            r1 = 1
            goto L_0x00e2
        L_0x00e0:
            r1 = r20
        L_0x00e2:
            if (r1 != 0) goto L_0x00f7
            int r5 = r5 + 1
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r13.mWidget
            float[] r11 = r11.mWeight
            r20 = r1
            int r1 = r0.orientation
            r1 = r11[r1]
            r11 = 0
            int r21 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r21 < 0) goto L_0x00f6
            float r6 = r6 + r1
        L_0x00f6:
            goto L_0x00fa
        L_0x00f7:
            r20 = r1
            int r4 = r4 + r14
        L_0x00fa:
            int r1 = r8 + -1
            if (r15 >= r1) goto L_0x0106
            if (r15 >= r10) goto L_0x0106
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r13.end
            int r1 = r1.mMargin
            int r1 = -r1
            int r4 = r4 + r1
        L_0x0106:
            int r15 = r15 + 1
            r1 = r19
            r11 = 8
            goto L_0x0074
        L_0x010e:
            r19 = r1
            if (r4 < r3) goto L_0x0123
            if (r5 != 0) goto L_0x0115
            goto L_0x0123
        L_0x0115:
            r7 = 0
            r5 = 0
            r4 = 0
            r6 = 0
            int r12 = r12 + 1
            r1 = r19
            r11 = 8
            goto L_0x006d
        L_0x0121:
            r19 = r1
        L_0x0123:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.start
            int r1 = r1.value
            if (r2 == 0) goto L_0x012d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r0.end
            int r1 = r11.value
        L_0x012d:
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r4 <= r3) goto L_0x0144
            r12 = 1073741824(0x40000000, float:2.0)
            if (r2 == 0) goto L_0x013d
            int r13 = r4 - r3
            float r13 = (float) r13
            float r13 = r13 / r12
            float r13 = r13 + r11
            int r12 = (int) r13
            int r1 = r1 + r12
            goto L_0x0144
        L_0x013d:
            int r13 = r4 - r3
            float r13 = (float) r13
            float r13 = r13 / r12
            float r13 = r13 + r11
            int r12 = (int) r13
            int r1 = r1 - r12
        L_0x0144:
            r12 = 0
            if (r5 <= 0) goto L_0x0254
            int r13 = r3 - r4
            float r13 = (float) r13
            float r14 = (float) r5
            float r13 = r13 / r14
            float r13 = r13 + r11
            int r12 = (int) r13
            r13 = 0
            r14 = 0
        L_0x0150:
            if (r14 >= r8) goto L_0x0202
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r15 = r0.mWidgets
            java.lang.Object r15 = r15.get(r14)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r15 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r15
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r15.mWidget
            int r11 = r11.getVisibility()
            r21 = r1
            r1 = 8
            if (r11 != r1) goto L_0x0170
            r25 = r2
            r22 = r4
            r23 = r6
            r24 = r12
            goto L_0x01f2
        L_0x0170:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r15.mDimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r11) goto L_0x01ea
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r15.mDimension
            boolean r1 = r1.resolved
            if (r1 != 0) goto L_0x01ea
            r1 = r12
            r11 = 0
            int r18 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r18 <= 0) goto L_0x0198
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r15.mWidget
            float[] r11 = r11.mWeight
            r22 = r1
            int r1 = r0.orientation
            r1 = r11[r1]
            int r11 = r3 - r4
            float r11 = (float) r11
            float r11 = r11 * r1
            float r11 = r11 / r6
            r20 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 + r20
            int r11 = (int) r11
            r1 = r11
            goto L_0x019a
        L_0x0198:
            r22 = r1
        L_0x019a:
            r11 = r1
            r22 = r4
            int r4 = r0.orientation
            if (r4 != 0) goto L_0x01b3
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r15.mWidget
            int r4 = r4.mMatchConstraintMaxWidth
            r23 = r4
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r15.mWidget
            int r4 = r4.mMatchConstraintMinWidth
            r26 = r6
            r6 = r4
            r4 = r23
            r23 = r26
            goto L_0x01c4
        L_0x01b3:
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r15.mWidget
            int r4 = r4.mMatchConstraintMaxHeight
            r23 = r4
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r15.mWidget
            int r4 = r4.mMatchConstraintMinHeight
            r26 = r6
            r6 = r4
            r4 = r23
            r23 = r26
        L_0x01c4:
            r24 = r12
            int r12 = r15.matchConstraintsType
            r25 = r2
            r2 = 1
            if (r12 != r2) goto L_0x01d5
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r15.mDimension
            int r2 = r2.wrapValue
            int r11 = java.lang.Math.min(r11, r2)
        L_0x01d5:
            int r2 = java.lang.Math.max(r6, r11)
            if (r4 <= 0) goto L_0x01df
            int r2 = java.lang.Math.min(r4, r2)
        L_0x01df:
            if (r2 == r1) goto L_0x01e4
            int r13 = r13 + 1
            r1 = r2
        L_0x01e4:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r11 = r15.mDimension
            r11.resolve(r1)
            goto L_0x01f2
        L_0x01ea:
            r25 = r2
            r22 = r4
            r23 = r6
            r24 = r12
        L_0x01f2:
            int r14 = r14 + 1
            r1 = r21
            r4 = r22
            r6 = r23
            r12 = r24
            r2 = r25
            r11 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0150
        L_0x0202:
            r21 = r1
            r25 = r2
            r22 = r4
            r23 = r6
            r24 = r12
            if (r13 <= 0) goto L_0x0245
            int r5 = r5 - r13
            r1 = 0
            r2 = 0
        L_0x0211:
            if (r2 >= r8) goto L_0x0243
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r0.mWidgets
            java.lang.Object r4 = r4.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r4 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r4
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r4.mWidget
            int r6 = r6.getVisibility()
            r11 = 8
            if (r6 != r11) goto L_0x0226
            goto L_0x0240
        L_0x0226:
            if (r2 <= 0) goto L_0x022f
            if (r2 < r9) goto L_0x022f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r4.start
            int r6 = r6.mMargin
            int r1 = r1 + r6
        L_0x022f:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r4.mDimension
            int r6 = r6.value
            int r1 = r1 + r6
            int r6 = r8 + -1
            if (r2 >= r6) goto L_0x0240
            if (r2 >= r10) goto L_0x0240
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r4.end
            int r6 = r6.mMargin
            int r6 = -r6
            int r1 = r1 + r6
        L_0x0240:
            int r2 = r2 + 1
            goto L_0x0211
        L_0x0243:
            r4 = r1
            goto L_0x0247
        L_0x0245:
            r4 = r22
        L_0x0247:
            int r1 = r0.mChainStyle
            r2 = 2
            if (r1 != r2) goto L_0x0251
            if (r13 != 0) goto L_0x0251
            r1 = 0
            r0.mChainStyle = r1
        L_0x0251:
            r12 = r24
            goto L_0x025c
        L_0x0254:
            r21 = r1
            r25 = r2
            r22 = r4
            r23 = r6
        L_0x025c:
            if (r4 <= r3) goto L_0x0262
            r1 = 2
            r0.mChainStyle = r1
            goto L_0x0263
        L_0x0262:
            r1 = 2
        L_0x0263:
            if (r7 <= 0) goto L_0x026b
            if (r5 != 0) goto L_0x026b
            if (r9 != r10) goto L_0x026b
            r0.mChainStyle = r1
        L_0x026b:
            int r1 = r0.mChainStyle
            r2 = 1
            if (r1 != r2) goto L_0x0320
            r1 = 0
            if (r7 <= r2) goto L_0x027a
            int r6 = r3 - r4
            int r11 = r7 + -1
            int r1 = r6 / r11
            goto L_0x0281
        L_0x027a:
            if (r7 != r2) goto L_0x0281
            int r2 = r3 - r4
            r6 = 2
            int r1 = r2 / 2
        L_0x0281:
            if (r5 <= 0) goto L_0x0284
            r1 = 0
        L_0x0284:
            r2 = 0
            r6 = r2
            r2 = r21
        L_0x0288:
            if (r6 >= r8) goto L_0x031b
            r11 = r6
            if (r25 == 0) goto L_0x0291
            int r13 = r6 + 1
            int r11 = r8 - r13
        L_0x0291:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r13 = r0.mWidgets
            java.lang.Object r13 = r13.get(r11)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r13 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r13
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r13.mWidget
            int r14 = r14.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x02b1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r14 = r13.start
            r14.resolve(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r14 = r13.end
            r14.resolve(r2)
            r16 = r1
            goto L_0x0315
        L_0x02b1:
            if (r6 <= 0) goto L_0x02b8
            if (r25 == 0) goto L_0x02b7
            int r2 = r2 - r1
            goto L_0x02b8
        L_0x02b7:
            int r2 = r2 + r1
        L_0x02b8:
            if (r6 <= 0) goto L_0x02c9
            if (r6 < r9) goto L_0x02c9
            if (r25 == 0) goto L_0x02c4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r14 = r13.start
            int r14 = r14.mMargin
            int r2 = r2 - r14
            goto L_0x02c9
        L_0x02c4:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r14 = r13.start
            int r14 = r14.mMargin
            int r2 = r2 + r14
        L_0x02c9:
            if (r25 == 0) goto L_0x02d1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r14 = r13.end
            r14.resolve(r2)
            goto L_0x02d6
        L_0x02d1:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r14 = r13.start
            r14.resolve(r2)
        L_0x02d6:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r14 = r13.mDimension
            int r14 = r14.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = r13.mDimensionBehavior
            r16 = r1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r15 != r1) goto L_0x02eb
            int r1 = r13.matchConstraintsType
            r15 = 1
            if (r1 != r15) goto L_0x02eb
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r13.mDimension
            int r14 = r1.wrapValue
        L_0x02eb:
            if (r25 == 0) goto L_0x02ef
            int r2 = r2 - r14
            goto L_0x02f0
        L_0x02ef:
            int r2 = r2 + r14
        L_0x02f0:
            if (r25 == 0) goto L_0x02f8
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r13.start
            r1.resolve(r2)
            goto L_0x02fd
        L_0x02f8:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r13.end
            r1.resolve(r2)
        L_0x02fd:
            r1 = 1
            r13.mResolved = r1
            int r1 = r8 + -1
            if (r6 >= r1) goto L_0x0315
            if (r6 >= r10) goto L_0x0315
            if (r25 == 0) goto L_0x030f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r13.end
            int r1 = r1.mMargin
            int r1 = -r1
            int r2 = r2 - r1
            goto L_0x0315
        L_0x030f:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r13.end
            int r1 = r1.mMargin
            int r1 = -r1
            int r2 = r2 + r1
        L_0x0315:
            int r6 = r6 + 1
            r1 = r16
            goto L_0x0288
        L_0x031b:
            r16 = r1
            r1 = r2
            goto L_0x048b
        L_0x0320:
            int r1 = r0.mChainStyle
            if (r1 != 0) goto L_0x03c6
            int r1 = r3 - r4
            int r2 = r7 + 1
            int r1 = r1 / r2
            if (r5 <= 0) goto L_0x032c
            r1 = 0
        L_0x032c:
            r2 = 0
            r6 = r2
            r2 = r21
        L_0x0330:
            if (r6 >= r8) goto L_0x03c1
            r11 = r6
            if (r25 == 0) goto L_0x0339
            int r13 = r6 + 1
            int r11 = r8 - r13
        L_0x0339:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r13 = r0.mWidgets
            java.lang.Object r13 = r13.get(r11)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r13 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r13
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r13.mWidget
            int r14 = r14.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x0358
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r14 = r13.start
            r14.resolve(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r14 = r13.end
            r14.resolve(r2)
            r16 = r1
            goto L_0x03bb
        L_0x0358:
            if (r25 == 0) goto L_0x035c
            int r2 = r2 - r1
            goto L_0x035d
        L_0x035c:
            int r2 = r2 + r1
        L_0x035d:
            if (r6 <= 0) goto L_0x036e
            if (r6 < r9) goto L_0x036e
            if (r25 == 0) goto L_0x0369
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r14 = r13.start
            int r14 = r14.mMargin
            int r2 = r2 - r14
            goto L_0x036e
        L_0x0369:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r14 = r13.start
            int r14 = r14.mMargin
            int r2 = r2 + r14
        L_0x036e:
            if (r25 == 0) goto L_0x0376
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r14 = r13.end
            r14.resolve(r2)
            goto L_0x037b
        L_0x0376:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r14 = r13.start
            r14.resolve(r2)
        L_0x037b:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r14 = r13.mDimension
            int r14 = r14.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = r13.mDimensionBehavior
            r16 = r1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r15 != r1) goto L_0x0394
            int r1 = r13.matchConstraintsType
            r15 = 1
            if (r1 != r15) goto L_0x0394
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r13.mDimension
            int r1 = r1.wrapValue
            int r14 = java.lang.Math.min(r14, r1)
        L_0x0394:
            if (r25 == 0) goto L_0x0398
            int r2 = r2 - r14
            goto L_0x0399
        L_0x0398:
            int r2 = r2 + r14
        L_0x0399:
            if (r25 == 0) goto L_0x03a1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r13.start
            r1.resolve(r2)
            goto L_0x03a6
        L_0x03a1:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r13.end
            r1.resolve(r2)
        L_0x03a6:
            int r1 = r8 + -1
            if (r6 >= r1) goto L_0x03bb
            if (r6 >= r10) goto L_0x03bb
            if (r25 == 0) goto L_0x03b5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r13.end
            int r1 = r1.mMargin
            int r1 = -r1
            int r2 = r2 - r1
            goto L_0x03bb
        L_0x03b5:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r13.end
            int r1 = r1.mMargin
            int r1 = -r1
            int r2 = r2 + r1
        L_0x03bb:
            int r6 = r6 + 1
            r1 = r16
            goto L_0x0330
        L_0x03c1:
            r16 = r1
            r1 = r2
            goto L_0x048b
        L_0x03c6:
            int r1 = r0.mChainStyle
            r2 = 2
            if (r1 != r2) goto L_0x0489
            int r1 = r0.orientation
            if (r1 != 0) goto L_0x03d6
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.mWidget
            float r1 = r1.getHorizontalBiasPercent()
            goto L_0x03dc
        L_0x03d6:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.mWidget
            float r1 = r1.getVerticalBiasPercent()
        L_0x03dc:
            if (r25 == 0) goto L_0x03e3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r2 - r1
        L_0x03e3:
            int r2 = r3 - r4
            float r2 = (float) r2
            float r2 = r2 * r1
            r6 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r6
            int r2 = (int) r2
            if (r2 < 0) goto L_0x03ef
            if (r5 <= 0) goto L_0x03f0
        L_0x03ef:
            r2 = 0
        L_0x03f0:
            if (r25 == 0) goto L_0x03f5
            int r6 = r21 - r2
            goto L_0x03f7
        L_0x03f5:
            int r6 = r21 + r2
        L_0x03f7:
            r11 = 0
        L_0x03f8:
            if (r11 >= r8) goto L_0x0485
            r13 = r11
            if (r25 == 0) goto L_0x0401
            int r14 = r11 + 1
            int r13 = r8 - r14
        L_0x0401:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r14 = r0.mWidgets
            java.lang.Object r14 = r14.get(r13)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r14 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r14
            androidx.constraintlayout.core.widgets.ConstraintWidget r15 = r14.mWidget
            int r15 = r15.getVisibility()
            r0 = 8
            if (r15 != r0) goto L_0x0421
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r15 = r14.start
            r15.resolve(r6)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r15 = r14.end
            r15.resolve(r6)
            r16 = r1
            r1 = 1
            goto L_0x047d
        L_0x0421:
            if (r11 <= 0) goto L_0x0432
            if (r11 < r9) goto L_0x0432
            if (r25 == 0) goto L_0x042d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r15 = r14.start
            int r15 = r15.mMargin
            int r6 = r6 - r15
            goto L_0x0432
        L_0x042d:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r15 = r14.start
            int r15 = r15.mMargin
            int r6 = r6 + r15
        L_0x0432:
            if (r25 == 0) goto L_0x043a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r15 = r14.end
            r15.resolve(r6)
            goto L_0x043f
        L_0x043a:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r15 = r14.start
            r15.resolve(r6)
        L_0x043f:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r15 = r14.mDimension
            int r15 = r15.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r14.mDimensionBehavior
            r16 = r1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0455
            int r0 = r14.matchConstraintsType
            r1 = 1
            if (r0 != r1) goto L_0x0456
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r14.mDimension
            int r15 = r0.wrapValue
            goto L_0x0456
        L_0x0455:
            r1 = 1
        L_0x0456:
            if (r25 == 0) goto L_0x045a
            int r6 = r6 - r15
            goto L_0x045b
        L_0x045a:
            int r6 = r6 + r15
        L_0x045b:
            if (r25 == 0) goto L_0x0463
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r14.start
            r0.resolve(r6)
            goto L_0x0468
        L_0x0463:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r14.end
            r0.resolve(r6)
        L_0x0468:
            int r0 = r8 + -1
            if (r11 >= r0) goto L_0x047d
            if (r11 >= r10) goto L_0x047d
            if (r25 == 0) goto L_0x0477
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r14.end
            int r0 = r0.mMargin
            int r0 = -r0
            int r6 = r6 - r0
            goto L_0x047d
        L_0x0477:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r14.end
            int r0 = r0.mMargin
            int r0 = -r0
            int r6 = r6 + r0
        L_0x047d:
            int r11 = r11 + 1
            r0 = r27
            r1 = r16
            goto L_0x03f8
        L_0x0485:
            r16 = r1
            r1 = r6
            goto L_0x048b
        L_0x0489:
            r1 = r21
        L_0x048b:
            return
        L_0x048c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.ChainRun.update(androidx.constraintlayout.core.widgets.analyzer.Dependency):void");
    }

    public void applyToWidget() {
        for (int i = 0; i < this.mWidgets.size(); i++) {
            this.mWidgets.get(i).applyToWidget();
        }
    }

    private ConstraintWidget getFirstVisibleWidget() {
        for (int i = 0; i < this.mWidgets.size(); i++) {
            WidgetRun run = this.mWidgets.get(i);
            if (run.mWidget.getVisibility() != 8) {
                return run.mWidget;
            }
        }
        return null;
    }

    private ConstraintWidget getLastVisibleWidget() {
        for (int i = this.mWidgets.size() - 1; i >= 0; i--) {
            WidgetRun run = this.mWidgets.get(i);
            if (run.mWidget.getVisibility() != 8) {
                return run.mWidget;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void apply() {
        Iterator<WidgetRun> it = this.mWidgets.iterator();
        while (it.hasNext()) {
            it.next().apply();
        }
        int count = this.mWidgets.size();
        if (count >= 1) {
            ConstraintWidget firstWidget = this.mWidgets.get(0).mWidget;
            ConstraintWidget lastWidget = this.mWidgets.get(count - 1).mWidget;
            if (this.orientation == 0) {
                ConstraintAnchor startAnchor = firstWidget.mLeft;
                ConstraintAnchor endAnchor = lastWidget.mRight;
                DependencyNode startTarget = getTarget(startAnchor, 0);
                int startMargin = startAnchor.getMargin();
                ConstraintWidget firstVisibleWidget = getFirstVisibleWidget();
                if (firstVisibleWidget != null) {
                    startMargin = firstVisibleWidget.mLeft.getMargin();
                }
                if (startTarget != null) {
                    addTarget(this.start, startTarget, startMargin);
                }
                DependencyNode endTarget = getTarget(endAnchor, 0);
                int endMargin = endAnchor.getMargin();
                ConstraintWidget lastVisibleWidget = getLastVisibleWidget();
                if (lastVisibleWidget != null) {
                    endMargin = lastVisibleWidget.mRight.getMargin();
                }
                if (endTarget != null) {
                    addTarget(this.end, endTarget, -endMargin);
                }
            } else {
                ConstraintAnchor startAnchor2 = firstWidget.mTop;
                ConstraintAnchor endAnchor2 = lastWidget.mBottom;
                DependencyNode startTarget2 = getTarget(startAnchor2, 1);
                int startMargin2 = startAnchor2.getMargin();
                ConstraintWidget firstVisibleWidget2 = getFirstVisibleWidget();
                if (firstVisibleWidget2 != null) {
                    startMargin2 = firstVisibleWidget2.mTop.getMargin();
                }
                if (startTarget2 != null) {
                    addTarget(this.start, startTarget2, startMargin2);
                }
                DependencyNode endTarget2 = getTarget(endAnchor2, 1);
                int endMargin2 = endAnchor2.getMargin();
                ConstraintWidget lastVisibleWidget2 = getLastVisibleWidget();
                if (lastVisibleWidget2 != null) {
                    endMargin2 = lastVisibleWidget2.mBottom.getMargin();
                }
                if (endTarget2 != null) {
                    addTarget(this.end, endTarget2, -endMargin2);
                }
            }
            this.start.updateDelegate = this;
            this.end.updateDelegate = this;
        }
    }
}
