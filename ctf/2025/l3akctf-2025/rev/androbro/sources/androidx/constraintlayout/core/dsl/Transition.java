package androidx.constraintlayout.core.dsl;

public class Transition {
    private final int DEFAULT_DURATION;
    private final float DEFAULT_STAGGER;
    final int UNSET;
    private String mConstraintSetEnd;
    private String mConstraintSetStart;
    private int mDefaultInterpolator;
    private int mDefaultInterpolatorID;
    private String mDefaultInterpolatorString;
    private int mDuration;
    private String mId;
    private KeyFrames mKeyFrames;
    private OnSwipe mOnSwipe;
    private float mStagger;

    public void setOnSwipe(OnSwipe onSwipe) {
        this.mOnSwipe = onSwipe;
    }

    public void setKeyFrames(Keys keyFrames) {
        this.mKeyFrames.add(keyFrames);
    }

    public Transition(String from, String to) {
        this.mOnSwipe = null;
        this.UNSET = -1;
        this.DEFAULT_DURATION = 400;
        this.DEFAULT_STAGGER = 0.0f;
        this.mId = null;
        this.mConstraintSetEnd = null;
        this.mConstraintSetStart = null;
        this.mDefaultInterpolator = 0;
        this.mDefaultInterpolatorString = null;
        this.mDefaultInterpolatorID = -1;
        this.mDuration = 400;
        this.mStagger = 0.0f;
        this.mKeyFrames = new KeyFrames();
        this.mId = "default";
        this.mConstraintSetStart = from;
        this.mConstraintSetEnd = to;
    }

    public Transition(String id, String from, String to) {
        this.mOnSwipe = null;
        this.UNSET = -1;
        this.DEFAULT_DURATION = 400;
        this.DEFAULT_STAGGER = 0.0f;
        this.mId = null;
        this.mConstraintSetEnd = null;
        this.mConstraintSetStart = null;
        this.mDefaultInterpolator = 0;
        this.mDefaultInterpolatorString = null;
        this.mDefaultInterpolatorID = -1;
        this.mDuration = 400;
        this.mStagger = 0.0f;
        this.mKeyFrames = new KeyFrames();
        this.mId = id;
        this.mConstraintSetStart = from;
        this.mConstraintSetEnd = to;
    }

    /* access modifiers changed from: package-private */
    public String toJson() {
        return toString();
    }

    public void setId(String id) {
        this.mId = id;
    }

    public void setTo(String constraintSetEnd) {
        this.mConstraintSetEnd = constraintSetEnd;
    }

    public void setFrom(String constraintSetStart) {
        this.mConstraintSetStart = constraintSetStart;
    }

    public void setDuration(int duration) {
        this.mDuration = duration;
    }

    public void setStagger(float stagger) {
        this.mStagger = stagger;
    }

    public String toString() {
        String ret = this.mId + ":{\nfrom:'" + this.mConstraintSetStart + "',\nto:'" + this.mConstraintSetEnd + "',\n";
        if (this.mDuration != 400) {
            ret = ret + "duration:" + this.mDuration + ",\n";
        }
        if (this.mStagger != 0.0f) {
            ret = ret + "stagger:" + this.mStagger + ",\n";
        }
        if (this.mOnSwipe != null) {
            ret = ret + this.mOnSwipe.toString();
        }
        return (ret + this.mKeyFrames.toString()) + "},\n";
    }

    public String getId() {
        return this.mId;
    }
}
