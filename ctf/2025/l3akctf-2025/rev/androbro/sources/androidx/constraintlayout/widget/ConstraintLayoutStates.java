package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class ConstraintLayoutStates {
    private static final boolean DEBUG = false;
    public static final String TAG = "ConstraintLayoutStates";
    private final ConstraintLayout mConstraintLayout;
    private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    private ConstraintsChangedListener mConstraintsChangedListener = null;
    int mCurrentConstraintNumber = -1;
    int mCurrentStateId = -1;
    ConstraintSet mDefaultConstraintSet;
    private SparseArray<State> mStateList = new SparseArray<>();

    ConstraintLayoutStates(Context context, ConstraintLayout layout, int resourceID) {
        this.mConstraintLayout = layout;
        load(context, resourceID);
    }

    public boolean needsToChange(int id, float width, float height) {
        if (this.mCurrentStateId != id) {
            return true;
        }
        SparseArray sparseArray = this.mStateList;
        State state = (State) (id == -1 ? sparseArray.valueAt(0) : sparseArray.get(this.mCurrentStateId));
        if ((this.mCurrentConstraintNumber == -1 || !state.mVariants.get(this.mCurrentConstraintNumber).match(width, height)) && this.mCurrentConstraintNumber != state.findMatch(width, height)) {
            return true;
        }
        return false;
    }

    public void updateConstraints(int id, float width, float height) {
        ConstraintSet constraintSet;
        int cid;
        State state;
        int match;
        ConstraintSet constraintSet2;
        int cid2;
        if (this.mCurrentStateId == id) {
            if (id == -1) {
                state = this.mStateList.valueAt(0);
            } else {
                state = this.mStateList.get(this.mCurrentStateId);
            }
            if ((this.mCurrentConstraintNumber == -1 || !state.mVariants.get(this.mCurrentConstraintNumber).match(width, height)) && this.mCurrentConstraintNumber != (match = state.findMatch(width, height))) {
                if (match == -1) {
                    constraintSet2 = this.mDefaultConstraintSet;
                } else {
                    constraintSet2 = state.mVariants.get(match).mConstraintSet;
                }
                if (match == -1) {
                    cid2 = state.mConstraintID;
                } else {
                    cid2 = state.mVariants.get(match).mConstraintID;
                }
                if (constraintSet2 != null) {
                    this.mCurrentConstraintNumber = match;
                    if (this.mConstraintsChangedListener != null) {
                        this.mConstraintsChangedListener.preLayoutChange(-1, cid2);
                    }
                    constraintSet2.applyTo(this.mConstraintLayout);
                    if (this.mConstraintsChangedListener != null) {
                        this.mConstraintsChangedListener.postLayoutChange(-1, cid2);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.mCurrentStateId = id;
        State state2 = this.mStateList.get(this.mCurrentStateId);
        int match2 = state2.findMatch(width, height);
        if (match2 == -1) {
            constraintSet = state2.mConstraintSet;
        } else {
            constraintSet = state2.mVariants.get(match2).mConstraintSet;
        }
        if (match2 == -1) {
            cid = state2.mConstraintID;
        } else {
            cid = state2.mVariants.get(match2).mConstraintID;
        }
        if (constraintSet == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + id + ", dim =" + width + ", " + height);
            return;
        }
        this.mCurrentConstraintNumber = match2;
        if (this.mConstraintsChangedListener != null) {
            this.mConstraintsChangedListener.preLayoutChange(id, cid);
        }
        constraintSet.applyTo(this.mConstraintLayout);
        if (this.mConstraintsChangedListener != null) {
            this.mConstraintsChangedListener.postLayoutChange(id, cid);
        }
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
    }

    static class State {
        int mConstraintID = -1;
        ConstraintSet mConstraintSet;
        int mId;
        ArrayList<Variant> mVariants = new ArrayList<>();

        State(Context context, XmlPullParser parser) {
            TypedArray a = context.obtainStyledAttributes(Xml.asAttributeSet(parser), R.styleable.State);
            int n = a.getIndexCount();
            for (int i = 0; i < n; i++) {
                int attr = a.getIndex(i);
                if (attr == R.styleable.State_android_id) {
                    this.mId = a.getResourceId(attr, this.mId);
                } else if (attr == R.styleable.State_constraints) {
                    this.mConstraintID = a.getResourceId(attr, this.mConstraintID);
                    String type = context.getResources().getResourceTypeName(this.mConstraintID);
                    String resourceName = context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(type)) {
                        this.mConstraintSet = new ConstraintSet();
                        this.mConstraintSet.clone(context, this.mConstraintID);
                    }
                }
            }
            a.recycle();
        }

        /* access modifiers changed from: package-private */
        public void add(Variant size) {
            this.mVariants.add(size);
        }

        public int findMatch(float width, float height) {
            for (int i = 0; i < this.mVariants.size(); i++) {
                if (this.mVariants.get(i).match(width, height)) {
                    return i;
                }
            }
            return -1;
        }
    }

    static class Variant {
        int mConstraintID = -1;
        ConstraintSet mConstraintSet;
        int mId;
        float mMaxHeight = Float.NaN;
        float mMaxWidth = Float.NaN;
        float mMinHeight = Float.NaN;
        float mMinWidth = Float.NaN;

        Variant(Context context, XmlPullParser parser) {
            TypedArray a = context.obtainStyledAttributes(Xml.asAttributeSet(parser), R.styleable.Variant);
            int count = a.getIndexCount();
            for (int i = 0; i < count; i++) {
                int attr = a.getIndex(i);
                if (attr == R.styleable.Variant_constraints) {
                    this.mConstraintID = a.getResourceId(attr, this.mConstraintID);
                    String type = context.getResources().getResourceTypeName(this.mConstraintID);
                    String resourceName = context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(type)) {
                        this.mConstraintSet = new ConstraintSet();
                        this.mConstraintSet.clone(context, this.mConstraintID);
                    }
                } else if (attr == R.styleable.Variant_region_heightLessThan) {
                    this.mMaxHeight = a.getDimension(attr, this.mMaxHeight);
                } else if (attr == R.styleable.Variant_region_heightMoreThan) {
                    this.mMinHeight = a.getDimension(attr, this.mMinHeight);
                } else if (attr == R.styleable.Variant_region_widthLessThan) {
                    this.mMaxWidth = a.getDimension(attr, this.mMaxWidth);
                } else if (attr == R.styleable.Variant_region_widthMoreThan) {
                    this.mMinWidth = a.getDimension(attr, this.mMinWidth);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            a.recycle();
        }

        /* access modifiers changed from: package-private */
        public boolean match(float widthDp, float heightDp) {
            if (!Float.isNaN(this.mMinWidth) && widthDp < this.mMinWidth) {
                return false;
            }
            if (!Float.isNaN(this.mMinHeight) && heightDp < this.mMinHeight) {
                return false;
            }
            if (!Float.isNaN(this.mMaxWidth) && widthDp > this.mMaxWidth) {
                return false;
            }
            if (Float.isNaN(this.mMaxHeight) || heightDp <= this.mMaxHeight) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void load(android.content.Context r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = "Error parsing resource: "
            java.lang.String r1 = "ConstraintLayoutStates"
            android.content.res.Resources r2 = r10.getResources()
            android.content.res.XmlResourceParser r3 = r2.getXml(r11)
            r4 = 0
            int r5 = r3.getEventType()     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
        L_0x0011:
            r6 = 1
            if (r5 == r6) goto L_0x0080
            switch(r5) {
                case 0: goto L_0x0079;
                case 1: goto L_0x0017;
                case 2: goto L_0x0019;
                case 3: goto L_0x0079;
                case 4: goto L_0x0079;
                default: goto L_0x0017;
            }     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
        L_0x0017:
            goto L_0x007a
        L_0x0019:
            java.lang.String r7 = r3.getName()     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
            int r8 = r7.hashCode()     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
            switch(r8) {
                case -1349929691: goto L_0x004c;
                case 80204913: goto L_0x0042;
                case 1382829617: goto L_0x0039;
                case 1657696882: goto L_0x002f;
                case 1901439077: goto L_0x0025;
                default: goto L_0x0024;
            }     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
        L_0x0024:
            goto L_0x0056
        L_0x0025:
            java.lang.String r6 = "Variant"
            boolean r6 = r7.equals(r6)     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
            if (r6 == 0) goto L_0x0024
            r6 = 3
            goto L_0x0057
        L_0x002f:
            java.lang.String r6 = "layoutDescription"
            boolean r6 = r7.equals(r6)     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
            if (r6 == 0) goto L_0x0024
            r6 = 0
            goto L_0x0057
        L_0x0039:
            java.lang.String r8 = "StateSet"
            boolean r8 = r7.equals(r8)     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
            if (r8 == 0) goto L_0x0024
            goto L_0x0057
        L_0x0042:
            java.lang.String r6 = "State"
            boolean r6 = r7.equals(r6)     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
            if (r6 == 0) goto L_0x0024
            r6 = 2
            goto L_0x0057
        L_0x004c:
            java.lang.String r6 = "ConstraintSet"
            boolean r6 = r7.equals(r6)     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
            if (r6 == 0) goto L_0x0024
            r6 = 4
            goto L_0x0057
        L_0x0056:
            r6 = -1
        L_0x0057:
            switch(r6) {
                case 0: goto L_0x0078;
                case 1: goto L_0x0078;
                case 2: goto L_0x006a;
                case 3: goto L_0x005f;
                case 4: goto L_0x005b;
                default: goto L_0x005a;
            }     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
        L_0x005a:
            goto L_0x007a
        L_0x005b:
            r9.parseConstraintSet(r10, r3)     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
            goto L_0x007a
        L_0x005f:
            androidx.constraintlayout.widget.ConstraintLayoutStates$Variant r6 = new androidx.constraintlayout.widget.ConstraintLayoutStates$Variant     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
            r6.<init>(r10, r3)     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
            if (r4 == 0) goto L_0x007a
            r4.add(r6)     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
            goto L_0x007a
        L_0x006a:
            androidx.constraintlayout.widget.ConstraintLayoutStates$State r6 = new androidx.constraintlayout.widget.ConstraintLayoutStates$State     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
            r6.<init>(r10, r3)     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
            r4 = r6
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates$State> r6 = r9.mStateList     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
            int r8 = r4.mId     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
            r6.put(r8, r4)     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
            goto L_0x007a
        L_0x0078:
            goto L_0x007a
        L_0x0079:
        L_0x007a:
            int r6 = r3.next()     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0081 }
            r5 = r6
            goto L_0x0011
        L_0x0080:
            goto L_0x00ac
        L_0x0081:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r0 = r5.append(r0)
            java.lang.StringBuilder r0 = r0.append(r11)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0, r4)
            goto L_0x00ad
        L_0x0097:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r0 = r5.append(r0)
            java.lang.StringBuilder r0 = r0.append(r11)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0, r4)
        L_0x00ac:
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayoutStates.load(android.content.Context, int):void");
    }

    private void parseConstraintSet(Context context, XmlPullParser parser) {
        ConstraintSet set = new ConstraintSet();
        int count = parser.getAttributeCount();
        int i = 0;
        while (i < count) {
            String name = parser.getAttributeName(i);
            String s = parser.getAttributeValue(i);
            if (name == null || s == null || !"id".equals(name)) {
                i++;
            } else {
                int id = -1;
                if (s.contains("/")) {
                    id = context.getResources().getIdentifier(s.substring(s.indexOf(47) + 1), "id", context.getPackageName());
                }
                if (id == -1) {
                    if (s.length() > 1) {
                        id = Integer.parseInt(s.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                set.load(context, parser);
                this.mConstraintSetMap.put(id, set);
                return;
            }
        }
    }
}
