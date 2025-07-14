package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference;
import androidx.constraintlayout.core.state.helpers.AlignVerticallyReference;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.FlowReference;
import androidx.constraintlayout.core.state.helpers.GridReference;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import androidx.constraintlayout.core.state.helpers.HorizontalChainReference;
import androidx.constraintlayout.core.state.helpers.VerticalChainReference;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class State {
    static final int CONSTRAINT_RATIO = 2;
    static final int CONSTRAINT_SPREAD = 0;
    static final int CONSTRAINT_WRAP = 1;
    public static final Integer PARENT = 0;
    static final int UNKNOWN = -1;
    ArrayList<Object> mBaselineNeeded = new ArrayList<>();
    ArrayList<ConstraintWidget> mBaselineNeededWidgets = new ArrayList<>();
    boolean mDirtyBaselineNeededWidgets = true;
    private CorePixelDp mDpToPixel;
    protected HashMap<Object, HelperReference> mHelperReferences = new HashMap<>();
    private boolean mIsLtr = true;
    private int mNumHelpers = 0;
    public final ConstraintReference mParent = new ConstraintReference(this);
    protected HashMap<Object, Reference> mReferences = new HashMap<>();
    HashMap<String, ArrayList<String>> mTags = new HashMap<>();

    public enum Constraint {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        TOP_TO_BASELINE,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BOTTOM_TO_BASELINE,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    public enum Direction {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    public enum Helper {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        HORIZONTAL_FLOW,
        VERTICAL_FLOW,
        GRID,
        ROW,
        COLUMN,
        FLOW
    }

    public enum Chain {
        SPREAD,
        SPREAD_INSIDE,
        PACKED;
        
        public static Map<String, Chain> chainMap;
        public static Map<String, Integer> valueMap;

        static {
            chainMap = new HashMap();
            valueMap = new HashMap();
            chainMap.put("packed", PACKED);
            chainMap.put("spread_inside", SPREAD_INSIDE);
            chainMap.put("spread", SPREAD);
            valueMap.put("packed", 2);
            valueMap.put("spread_inside", 1);
            valueMap.put("spread", 0);
        }

        public static int getValueByString(String str) {
            if (valueMap.containsKey(str)) {
                return valueMap.get(str).intValue();
            }
            return -1;
        }

        public static Chain getChainByString(String str) {
            if (chainMap.containsKey(str)) {
                return chainMap.get(str);
            }
            return null;
        }
    }

    public enum Wrap {
        NONE,
        CHAIN,
        ALIGNED;
        
        public static Map<String, Integer> valueMap;
        public static Map<String, Wrap> wrapMap;

        static {
            wrapMap = new HashMap();
            valueMap = new HashMap();
            wrapMap.put("none", NONE);
            wrapMap.put("chain", CHAIN);
            wrapMap.put("aligned", ALIGNED);
            valueMap.put("none", 0);
            valueMap.put("chain", 3);
            valueMap.put("aligned", 2);
        }

        public static int getValueByString(String str) {
            if (valueMap.containsKey(str)) {
                return valueMap.get(str).intValue();
            }
            return -1;
        }

        public static Wrap getChainByString(String str) {
            if (wrapMap.containsKey(str)) {
                return wrapMap.get(str);
            }
            return null;
        }
    }

    public State() {
        this.mParent.setKey(PARENT);
        this.mReferences.put(PARENT, this.mParent);
    }

    /* access modifiers changed from: package-private */
    public CorePixelDp getDpToPixel() {
        return this.mDpToPixel;
    }

    public void setDpToPixel(CorePixelDp dpToPixel) {
        this.mDpToPixel = dpToPixel;
    }

    @Deprecated
    public void setLtr(boolean isLtr) {
        this.mIsLtr = isLtr;
    }

    @Deprecated
    public boolean isLtr() {
        return this.mIsLtr;
    }

    public void setRtl(boolean isRtl) {
        this.mIsLtr = !isRtl;
    }

    public boolean isRtl() {
        return !this.mIsLtr;
    }

    public void reset() {
        for (Object ref : this.mReferences.keySet()) {
            this.mReferences.get(ref).getConstraintWidget().reset();
        }
        this.mReferences.clear();
        this.mReferences.put(PARENT, this.mParent);
        this.mHelperReferences.clear();
        this.mTags.clear();
        this.mBaselineNeeded.clear();
        this.mDirtyBaselineNeededWidgets = true;
    }

    public int convertDimension(Object value) {
        if (value instanceof Float) {
            return Math.round(((Float) value).floatValue());
        }
        if (value instanceof Integer) {
            return ((Integer) value).intValue();
        }
        return 0;
    }

    public ConstraintReference createConstraintReference(Object key) {
        return new ConstraintReference(this);
    }

    public boolean sameFixedWidth(int width) {
        return this.mParent.getWidth().equalsFixedValue(width);
    }

    public boolean sameFixedHeight(int height) {
        return this.mParent.getHeight().equalsFixedValue(height);
    }

    public State width(Dimension dimension) {
        return setWidth(dimension);
    }

    public State height(Dimension dimension) {
        return setHeight(dimension);
    }

    public State setWidth(Dimension dimension) {
        this.mParent.setWidth(dimension);
        return this;
    }

    public State setHeight(Dimension dimension) {
        this.mParent.setHeight(dimension);
        return this;
    }

    /* access modifiers changed from: package-private */
    public Reference reference(Object key) {
        return this.mReferences.get(key);
    }

    public ConstraintReference constraints(Object key) {
        Reference reference = this.mReferences.get(key);
        if (reference == null) {
            reference = createConstraintReference(key);
            this.mReferences.put(key, reference);
            reference.setKey(key);
        }
        if (reference instanceof ConstraintReference) {
            return (ConstraintReference) reference;
        }
        return null;
    }

    private String createHelperKey() {
        StringBuilder append = new StringBuilder().append("__HELPER_KEY_");
        int i = this.mNumHelpers;
        this.mNumHelpers = i + 1;
        return append.append(i).append("__").toString();
    }

    public HelperReference helper(Object key, Helper type) {
        if (key == null) {
            key = createHelperKey();
        }
        HelperReference reference = this.mHelperReferences.get(key);
        if (reference == null) {
            switch (type.ordinal()) {
                case 0:
                    reference = new HorizontalChainReference(this);
                    break;
                case 1:
                    reference = new VerticalChainReference(this);
                    break;
                case 2:
                    reference = new AlignHorizontallyReference(this);
                    break;
                case 3:
                    reference = new AlignVerticallyReference(this);
                    break;
                case 4:
                    reference = new BarrierReference(this);
                    break;
                case 6:
                case 7:
                    reference = new FlowReference(this, type);
                    break;
                case 8:
                case 9:
                case 10:
                    reference = new GridReference(this, type);
                    break;
                default:
                    reference = new HelperReference(this, type);
                    break;
            }
            reference.setKey(key);
            this.mHelperReferences.put(key, reference);
        }
        return reference;
    }

    public GuidelineReference horizontalGuideline(Object key) {
        return guideline(key, 0);
    }

    public GuidelineReference verticalGuideline(Object key) {
        return guideline(key, 1);
    }

    public GuidelineReference guideline(Object key, int orientation) {
        ConstraintReference reference = constraints(key);
        if (reference.getFacade() == null || !(reference.getFacade() instanceof GuidelineReference)) {
            GuidelineReference guidelineReference = new GuidelineReference(this);
            guidelineReference.setOrientation(orientation);
            guidelineReference.setKey(key);
            reference.setFacade(guidelineReference);
        }
        return (GuidelineReference) reference.getFacade();
    }

    public BarrierReference barrier(Object key, Direction direction) {
        ConstraintReference reference = constraints(key);
        if (reference.getFacade() == null || !(reference.getFacade() instanceof BarrierReference)) {
            BarrierReference barrierReference = new BarrierReference(this);
            barrierReference.setBarrierDirection(direction);
            reference.setFacade(barrierReference);
        }
        return (BarrierReference) reference.getFacade();
    }

    public GridReference getGrid(Object key, String gridType) {
        ConstraintReference reference = constraints(key);
        if (reference.getFacade() == null || !(reference.getFacade() instanceof GridReference)) {
            Helper Type = Helper.GRID;
            if (gridType.charAt(0) == 'r') {
                Type = Helper.ROW;
            } else if (gridType.charAt(0) == 'c') {
                Type = Helper.COLUMN;
            }
            reference.setFacade(new GridReference(this, Type));
        }
        return (GridReference) reference.getFacade();
    }

    public FlowReference getFlow(Object key, boolean vertical) {
        FlowReference flowReference;
        ConstraintReference reference = constraints(key);
        if (reference.getFacade() == null || !(reference.getFacade() instanceof FlowReference)) {
            if (vertical) {
                flowReference = new FlowReference(this, Helper.VERTICAL_FLOW);
            } else {
                flowReference = new FlowReference(this, Helper.HORIZONTAL_FLOW);
            }
            reference.setFacade(flowReference);
        }
        return (FlowReference) reference.getFacade();
    }

    public VerticalChainReference verticalChain() {
        return (VerticalChainReference) helper((Object) null, Helper.VERTICAL_CHAIN);
    }

    public VerticalChainReference verticalChain(Object... references) {
        VerticalChainReference reference = (VerticalChainReference) helper((Object) null, Helper.VERTICAL_CHAIN);
        reference.add(references);
        return reference;
    }

    public HorizontalChainReference horizontalChain() {
        return (HorizontalChainReference) helper((Object) null, Helper.HORIZONTAL_CHAIN);
    }

    public HorizontalChainReference horizontalChain(Object... references) {
        HorizontalChainReference reference = (HorizontalChainReference) helper((Object) null, Helper.HORIZONTAL_CHAIN);
        reference.add(references);
        return reference;
    }

    public FlowReference getVerticalFlow() {
        return (FlowReference) helper((Object) null, Helper.VERTICAL_FLOW);
    }

    public FlowReference getVerticalFlow(Object... references) {
        FlowReference reference = (FlowReference) helper((Object) null, Helper.VERTICAL_FLOW);
        reference.add(references);
        return reference;
    }

    public FlowReference getHorizontalFlow() {
        return (FlowReference) helper((Object) null, Helper.HORIZONTAL_FLOW);
    }

    public FlowReference getHorizontalFlow(Object... references) {
        FlowReference reference = (FlowReference) helper((Object) null, Helper.HORIZONTAL_FLOW);
        reference.add(references);
        return reference;
    }

    public AlignHorizontallyReference centerHorizontally(Object... references) {
        AlignHorizontallyReference reference = (AlignHorizontallyReference) helper((Object) null, Helper.ALIGN_HORIZONTALLY);
        reference.add(references);
        return reference;
    }

    public AlignVerticallyReference centerVertically(Object... references) {
        AlignVerticallyReference reference = (AlignVerticallyReference) helper((Object) null, Helper.ALIGN_VERTICALLY);
        reference.add(references);
        return reference;
    }

    public void directMapping() {
        for (Object key : this.mReferences.keySet()) {
            ConstraintReference reference = constraints(key);
            if (reference instanceof ConstraintReference) {
                reference.setView(key);
            }
        }
    }

    public void map(Object key, Object view) {
        ConstraintReference ref = constraints(key);
        if (ref != null) {
            ref.setView(view);
        }
    }

    public void setTag(String key, String tag) {
        ArrayList<String> list;
        ConstraintReference reference = constraints(key);
        if (reference instanceof ConstraintReference) {
            reference.setTag(tag);
            if (!this.mTags.containsKey(tag)) {
                list = new ArrayList<>();
                this.mTags.put(tag, list);
            } else {
                list = this.mTags.get(tag);
            }
            list.add(key);
        }
    }

    public ArrayList<String> getIdsForTag(String tag) {
        if (this.mTags.containsKey(tag)) {
            return this.mTags.get(tag);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014e, code lost:
        r3 = (androidx.constraintlayout.core.state.HelperReference) r2.getFacade();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void apply(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r12) {
        /*
            r11 = this;
            r12.removeAllChildren()
            androidx.constraintlayout.core.state.ConstraintReference r0 = r11.mParent
            androidx.constraintlayout.core.state.Dimension r0 = r0.getWidth()
            r1 = 0
            r0.apply(r11, r12, r1)
            androidx.constraintlayout.core.state.ConstraintReference r0 = r11.mParent
            androidx.constraintlayout.core.state.Dimension r0 = r0.getHeight()
            r1 = 1
            r0.apply(r11, r12, r1)
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.HelperReference> r0 = r11.mHelperReferences
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0021:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x004b
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.HelperReference> r2 = r11.mHelperReferences
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.state.HelperReference r2 = (androidx.constraintlayout.core.state.HelperReference) r2
            androidx.constraintlayout.core.widgets.HelperWidget r3 = r2.getHelperWidget()
            if (r3 == 0) goto L_0x004a
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r4 = r11.mReferences
            java.lang.Object r4 = r4.get(r1)
            androidx.constraintlayout.core.state.Reference r4 = (androidx.constraintlayout.core.state.Reference) r4
            if (r4 != 0) goto L_0x0047
            androidx.constraintlayout.core.state.ConstraintReference r4 = r11.constraints(r1)
        L_0x0047:
            r4.setConstraintWidget(r3)
        L_0x004a:
            goto L_0x0021
        L_0x004b:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r0 = r11.mReferences
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0055:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0092
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r2 = r11.mReferences
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.state.Reference r2 = (androidx.constraintlayout.core.state.Reference) r2
            androidx.constraintlayout.core.state.ConstraintReference r3 = r11.mParent
            if (r2 == r3) goto L_0x0091
            androidx.constraintlayout.core.state.helpers.Facade r3 = r2.getFacade()
            boolean r3 = r3 instanceof androidx.constraintlayout.core.state.HelperReference
            if (r3 == 0) goto L_0x0091
            androidx.constraintlayout.core.state.helpers.Facade r3 = r2.getFacade()
            androidx.constraintlayout.core.state.HelperReference r3 = (androidx.constraintlayout.core.state.HelperReference) r3
            androidx.constraintlayout.core.widgets.HelperWidget r3 = r3.getHelperWidget()
            if (r3 == 0) goto L_0x0091
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r4 = r11.mReferences
            java.lang.Object r4 = r4.get(r1)
            androidx.constraintlayout.core.state.Reference r4 = (androidx.constraintlayout.core.state.Reference) r4
            if (r4 != 0) goto L_0x008e
            androidx.constraintlayout.core.state.ConstraintReference r4 = r11.constraints(r1)
        L_0x008e:
            r4.setConstraintWidget(r3)
        L_0x0091:
            goto L_0x0055
        L_0x0092:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r0 = r11.mReferences
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x009c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d8
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r2 = r11.mReferences
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.state.Reference r2 = (androidx.constraintlayout.core.state.Reference) r2
            androidx.constraintlayout.core.state.ConstraintReference r3 = r11.mParent
            if (r2 == r3) goto L_0x00d4
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r2.getConstraintWidget()
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = r4.toString()
            r3.setDebugName(r4)
            r4 = 0
            r3.setParent(r4)
            androidx.constraintlayout.core.state.helpers.Facade r4 = r2.getFacade()
            boolean r4 = r4 instanceof androidx.constraintlayout.core.state.helpers.GuidelineReference
            if (r4 == 0) goto L_0x00d0
            r2.apply()
        L_0x00d0:
            r12.add((androidx.constraintlayout.core.widgets.ConstraintWidget) r3)
            goto L_0x00d7
        L_0x00d4:
            r2.setConstraintWidget(r12)
        L_0x00d7:
            goto L_0x009c
        L_0x00d8:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.HelperReference> r0 = r11.mHelperReferences
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00e2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0126
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.HelperReference> r2 = r11.mHelperReferences
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.state.HelperReference r2 = (androidx.constraintlayout.core.state.HelperReference) r2
            androidx.constraintlayout.core.widgets.HelperWidget r3 = r2.getHelperWidget()
            if (r3 == 0) goto L_0x0122
            java.util.ArrayList<java.lang.Object> r4 = r2.mReferences
            java.util.Iterator r4 = r4.iterator()
        L_0x0100:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x011e
            java.lang.Object r5 = r4.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r6 = r11.mReferences
            java.lang.Object r6 = r6.get(r5)
            androidx.constraintlayout.core.state.Reference r6 = (androidx.constraintlayout.core.state.Reference) r6
            androidx.constraintlayout.core.widgets.HelperWidget r7 = r2.getHelperWidget()
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r6.getConstraintWidget()
            r7.add(r8)
            goto L_0x0100
        L_0x011e:
            r2.apply()
            goto L_0x0125
        L_0x0122:
            r2.apply()
        L_0x0125:
            goto L_0x00e2
        L_0x0126:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r0 = r11.mReferences
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0130:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01a8
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r2 = r11.mReferences
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.state.Reference r2 = (androidx.constraintlayout.core.state.Reference) r2
            androidx.constraintlayout.core.state.ConstraintReference r3 = r11.mParent
            if (r2 == r3) goto L_0x01a7
            androidx.constraintlayout.core.state.helpers.Facade r3 = r2.getFacade()
            boolean r3 = r3 instanceof androidx.constraintlayout.core.state.HelperReference
            if (r3 == 0) goto L_0x01a7
            androidx.constraintlayout.core.state.helpers.Facade r3 = r2.getFacade()
            androidx.constraintlayout.core.state.HelperReference r3 = (androidx.constraintlayout.core.state.HelperReference) r3
            androidx.constraintlayout.core.widgets.HelperWidget r4 = r3.getHelperWidget()
            if (r4 == 0) goto L_0x01a7
            java.util.ArrayList<java.lang.Object> r5 = r3.mReferences
            java.util.Iterator r5 = r5.iterator()
        L_0x0160:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01a4
            java.lang.Object r6 = r5.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r7 = r11.mReferences
            java.lang.Object r7 = r7.get(r6)
            androidx.constraintlayout.core.state.Reference r7 = (androidx.constraintlayout.core.state.Reference) r7
            if (r7 == 0) goto L_0x017c
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r7.getConstraintWidget()
            r4.add(r8)
            goto L_0x01a3
        L_0x017c:
            boolean r8 = r6 instanceof androidx.constraintlayout.core.state.Reference
            if (r8 == 0) goto L_0x018b
            r8 = r6
            androidx.constraintlayout.core.state.Reference r8 = (androidx.constraintlayout.core.state.Reference) r8
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r8.getConstraintWidget()
            r4.add(r8)
            goto L_0x01a3
        L_0x018b:
            java.io.PrintStream r8 = java.lang.System.out
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "couldn't find reference for "
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r6)
            java.lang.String r9 = r9.toString()
            r8.println(r9)
        L_0x01a3:
            goto L_0x0160
        L_0x01a4:
            r2.apply()
        L_0x01a7:
            goto L_0x0130
        L_0x01a8:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r0 = r11.mReferences
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01b2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01d6
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r2 = r11.mReferences
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.state.Reference r2 = (androidx.constraintlayout.core.state.Reference) r2
            r2.apply()
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r2.getConstraintWidget()
            if (r3 == 0) goto L_0x01d5
            if (r1 == 0) goto L_0x01d5
            java.lang.String r4 = r1.toString()
            r3.stringId = r4
        L_0x01d5:
            goto L_0x01b2
        L_0x01d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.State.apply(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer):void");
    }

    public void baselineNeededFor(Object id) {
        this.mBaselineNeeded.add(id);
        this.mDirtyBaselineNeededWidgets = true;
    }

    public boolean isBaselineNeeded(ConstraintWidget constraintWidget) {
        if (this.mDirtyBaselineNeededWidgets) {
            this.mBaselineNeededWidgets.clear();
            Iterator<Object> it = this.mBaselineNeeded.iterator();
            while (it.hasNext()) {
                ConstraintWidget widget = this.mReferences.get(it.next()).getConstraintWidget();
                if (widget != null) {
                    this.mBaselineNeededWidgets.add(widget);
                }
            }
            this.mDirtyBaselineNeededWidgets = false;
        }
        return this.mBaselineNeededWidgets.contains(constraintWidget);
    }
}
