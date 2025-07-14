package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

public class StateSet {
    private static final boolean DEBUG = false;
    public static final String TAG = "ConstraintLayoutStates";
    private ConstraintsChangedListener mConstraintsChangedListener = null;
    int mCurrentConstraintNumber = -1;
    int mCurrentStateId = -1;
    int mDefaultState = -1;
    private SparseArray<State> mStateList = new SparseArray<>();

    public StateSet(Context context, XmlPullParser parser) {
        load(context, parser);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void load(android.content.Context r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            r11 = this;
            java.lang.String r0 = "Error parsing XML resource"
            java.lang.String r1 = "ConstraintLayoutStates"
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r13)
            int[] r3 = androidx.constraintlayout.widget.R.styleable.StateSet
            android.content.res.TypedArray r3 = r12.obtainStyledAttributes(r2, r3)
            int r4 = r3.getIndexCount()
            r5 = 0
        L_0x0013:
            if (r5 >= r4) goto L_0x0028
            int r6 = r3.getIndex(r5)
            int r7 = androidx.constraintlayout.widget.R.styleable.StateSet_defaultState
            if (r6 != r7) goto L_0x0025
            int r7 = r11.mDefaultState
            int r7 = r3.getResourceId(r6, r7)
            r11.mDefaultState = r7
        L_0x0025:
            int r5 = r5 + 1
            goto L_0x0013
        L_0x0028:
            r3.recycle()
            r5 = 0
            int r6 = r13.getEventType()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
        L_0x0030:
            r7 = 1
            if (r6 == r7) goto L_0x009d
            java.lang.String r8 = "StateSet"
            switch(r6) {
                case 0: goto L_0x0096;
                case 1: goto L_0x0038;
                case 2: goto L_0x0044;
                case 3: goto L_0x0039;
                case 4: goto L_0x0096;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x0097
        L_0x0039:
            java.lang.String r7 = r13.getName()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            boolean r7 = r8.equals(r7)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r7 == 0) goto L_0x0097
            return
        L_0x0044:
            java.lang.String r9 = r13.getName()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            int r10 = r9.hashCode()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            switch(r10) {
                case 80204913: goto L_0x006b;
                case 1301459538: goto L_0x0061;
                case 1382829617: goto L_0x005a;
                case 1901439077: goto L_0x0050;
                default: goto L_0x004f;
            }     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
        L_0x004f:
            goto L_0x0075
        L_0x0050:
            java.lang.String r7 = "Variant"
            boolean r7 = r9.equals(r7)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r7 == 0) goto L_0x004f
            r7 = 3
            goto L_0x0076
        L_0x005a:
            boolean r8 = r9.equals(r8)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r8 == 0) goto L_0x004f
            goto L_0x0076
        L_0x0061:
            java.lang.String r7 = "LayoutDescription"
            boolean r7 = r9.equals(r7)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r7 == 0) goto L_0x004f
            r7 = 0
            goto L_0x0076
        L_0x006b:
            java.lang.String r7 = "State"
            boolean r7 = r9.equals(r7)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r7 == 0) goto L_0x004f
            r7 = 2
            goto L_0x0076
        L_0x0075:
            r7 = -1
        L_0x0076:
            switch(r7) {
                case 0: goto L_0x0094;
                case 1: goto L_0x0093;
                case 2: goto L_0x0085;
                case 3: goto L_0x007a;
                default: goto L_0x0079;
            }     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
        L_0x0079:
            goto L_0x0095
        L_0x007a:
            androidx.constraintlayout.widget.StateSet$Variant r7 = new androidx.constraintlayout.widget.StateSet$Variant     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            r7.<init>(r12, r13)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r5 == 0) goto L_0x0095
            r5.add(r7)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            goto L_0x0095
        L_0x0085:
            androidx.constraintlayout.widget.StateSet$State r7 = new androidx.constraintlayout.widget.StateSet$State     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            r7.<init>(r12, r13)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            r5 = r7
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r7 = r11.mStateList     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            int r8 = r5.mId     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            r7.put(r8, r5)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            goto L_0x0095
        L_0x0093:
            goto L_0x0095
        L_0x0094:
        L_0x0095:
            goto L_0x0097
        L_0x0096:
        L_0x0097:
            int r7 = r13.next()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            r6 = r7
            goto L_0x0030
        L_0x009d:
            goto L_0x00a7
        L_0x009e:
            r5 = move-exception
            android.util.Log.e(r1, r0, r5)
            goto L_0x00a8
        L_0x00a3:
            r5 = move-exception
            android.util.Log.e(r1, r0, r5)
        L_0x00a7:
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.StateSet.load(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
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

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
    }

    public int stateGetConstraintID(int id, int width, int height) {
        return updateConstraints(-1, id, (float) width, (float) height);
    }

    public int convertToConstraintSet(int currentConstrainSettId, int stateId, float width, float height) {
        State state = this.mStateList.get(stateId);
        if (state == null) {
            return stateId;
        }
        if (width != -1.0f && height != -1.0f) {
            Variant match = null;
            Iterator<Variant> it = state.mVariants.iterator();
            while (it.hasNext()) {
                Variant mVariant = it.next();
                if (mVariant.match(width, height)) {
                    if (currentConstrainSettId == mVariant.mConstraintID) {
                        return currentConstrainSettId;
                    }
                    match = mVariant;
                }
            }
            if (match != null) {
                return match.mConstraintID;
            }
            return state.mConstraintID;
        } else if (state.mConstraintID == currentConstrainSettId) {
            return currentConstrainSettId;
        } else {
            Iterator<Variant> it2 = state.mVariants.iterator();
            while (it2.hasNext()) {
                if (currentConstrainSettId == it2.next().mConstraintID) {
                    return currentConstrainSettId;
                }
            }
            return state.mConstraintID;
        }
    }

    public int updateConstraints(int currentId, int id, float width, float height) {
        State state;
        int match;
        if (currentId == id) {
            if (id == -1) {
                state = this.mStateList.valueAt(0);
            } else {
                state = this.mStateList.get(this.mCurrentStateId);
            }
            if (state == null) {
                return -1;
            }
            if ((this.mCurrentConstraintNumber == -1 || !state.mVariants.get(currentId).match(width, height)) && currentId != (match = state.findMatch(width, height))) {
                return match == -1 ? state.mConstraintID : state.mVariants.get(match).mConstraintID;
            }
            return currentId;
        }
        State state2 = this.mStateList.get(id);
        if (state2 == null) {
            return -1;
        }
        int match2 = state2.findMatch(width, height);
        return match2 == -1 ? state2.mConstraintID : state2.mVariants.get(match2).mConstraintID;
    }

    static class State {
        int mConstraintID = -1;
        int mId;
        boolean mIsLayout = false;
        ArrayList<Variant> mVariants = new ArrayList<>();

        State(Context context, XmlPullParser parser) {
            TypedArray a = context.obtainStyledAttributes(Xml.asAttributeSet(parser), R.styleable.State);
            int count = a.getIndexCount();
            for (int i = 0; i < count; i++) {
                int attr = a.getIndex(i);
                if (attr == R.styleable.State_android_id) {
                    this.mId = a.getResourceId(attr, this.mId);
                } else if (attr == R.styleable.State_constraints) {
                    this.mConstraintID = a.getResourceId(attr, this.mConstraintID);
                    String type = context.getResources().getResourceTypeName(this.mConstraintID);
                    String resourceName = context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(type)) {
                        this.mIsLayout = true;
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
        int mId;
        boolean mIsLayout = false;
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
                        this.mIsLayout = true;
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
}
