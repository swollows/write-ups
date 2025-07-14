package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class KeyTrigger extends Key {
    public static final String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    static final String NAME = "KeyTrigger";
    public static final String NEGATIVE_CROSS = "negativeCross";
    public static final String POSITIVE_CROSS = "positiveCross";
    public static final String POST_LAYOUT = "postLayout";
    private static final String TAG = "KeyTrigger";
    public static final String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final String TRIGGER_ID = "triggerID";
    public static final String TRIGGER_RECEIVER = "triggerReceiver";
    public static final String TRIGGER_SLACK = "triggerSlack";
    public static final String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";
    RectF mCollisionRect = new RectF();
    /* access modifiers changed from: private */
    public String mCross = null;
    private int mCurveFit = -1;
    private boolean mFireCrossReset = true;
    private float mFireLastPos;
    private boolean mFireNegativeReset = true;
    private boolean mFirePositiveReset = true;
    /* access modifiers changed from: private */
    public float mFireThreshold = Float.NaN;
    HashMap<String, Method> mMethodHashMap = new HashMap<>();
    /* access modifiers changed from: private */
    public String mNegativeCross = null;
    /* access modifiers changed from: private */
    public String mPositiveCross = null;
    /* access modifiers changed from: private */
    public boolean mPostLayout = false;
    RectF mTargetRect = new RectF();
    /* access modifiers changed from: private */
    public int mTriggerCollisionId = UNSET;
    private View mTriggerCollisionView = null;
    /* access modifiers changed from: private */
    public int mTriggerID = UNSET;
    /* access modifiers changed from: private */
    public int mTriggerReceiver = UNSET;
    float mTriggerSlack = 0.1f;
    int mViewTransitionOnCross = UNSET;
    int mViewTransitionOnNegativeCross = UNSET;
    int mViewTransitionOnPositiveCross = UNSET;

    public KeyTrigger() {
        this.mType = 5;
        this.mCustomConstraints = new HashMap();
    }

    public void load(Context context, AttributeSet attrs) {
        Loader.read(this, context.obtainStyledAttributes(attrs, R.styleable.KeyTrigger), context);
    }

    /* access modifiers changed from: package-private */
    public int getCurveFit() {
        return this.mCurveFit;
    }

    public void getAttributeNames(HashSet<String> hashSet) {
    }

    public void addValues(HashMap<String, ViewSpline> hashMap) {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setValue(java.lang.String r2, java.lang.Object r3) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -1594793529: goto L_0x0085;
                case -966421266: goto L_0x0079;
                case -786670827: goto L_0x006e;
                case -648752941: goto L_0x0063;
                case -638126837: goto L_0x0059;
                case -76025313: goto L_0x004e;
                case -9754574: goto L_0x0042;
                case 64397344: goto L_0x0038;
                case 364489912: goto L_0x002d;
                case 1301930599: goto L_0x0021;
                case 1401391082: goto L_0x0015;
                case 1535404999: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x008f
        L_0x0009:
            java.lang.String r0 = "triggerReceiver"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 1
            goto L_0x0090
        L_0x0015:
            java.lang.String r0 = "postLayout"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 8
            goto L_0x0090
        L_0x0021:
            java.lang.String r0 = "viewTransitionOnCross"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 11
            goto L_0x0090
        L_0x002d:
            java.lang.String r0 = "triggerSlack"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 7
            goto L_0x0090
        L_0x0038:
            java.lang.String r0 = "CROSS"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 0
            goto L_0x0090
        L_0x0042:
            java.lang.String r0 = "viewTransitionOnNegativeCross"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 9
            goto L_0x0090
        L_0x004e:
            java.lang.String r0 = "triggerCollisionView"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 6
            goto L_0x0090
        L_0x0059:
            java.lang.String r0 = "negativeCross"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 2
            goto L_0x0090
        L_0x0063:
            java.lang.String r0 = "triggerID"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 4
            goto L_0x0090
        L_0x006e:
            java.lang.String r0 = "triggerCollisionId"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 5
            goto L_0x0090
        L_0x0079:
            java.lang.String r0 = "viewTransitionOnPositiveCross"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 10
            goto L_0x0090
        L_0x0085:
            java.lang.String r0 = "positiveCross"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 3
            goto L_0x0090
        L_0x008f:
            r0 = -1
        L_0x0090:
            switch(r0) {
                case 0: goto L_0x00e0;
                case 1: goto L_0x00d9;
                case 2: goto L_0x00d2;
                case 3: goto L_0x00cb;
                case 4: goto L_0x00c4;
                case 5: goto L_0x00bd;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00b0;
                case 8: goto L_0x00a9;
                case 9: goto L_0x00a2;
                case 10: goto L_0x009b;
                case 11: goto L_0x0094;
                default: goto L_0x0093;
            }
        L_0x0093:
            goto L_0x00e7
        L_0x0094:
            int r0 = r1.toInt(r3)
            r1.mViewTransitionOnCross = r0
            goto L_0x00e7
        L_0x009b:
            int r0 = r1.toInt(r3)
            r1.mViewTransitionOnPositiveCross = r0
            goto L_0x00e7
        L_0x00a2:
            int r0 = r1.toInt(r3)
            r1.mViewTransitionOnNegativeCross = r0
            goto L_0x00e7
        L_0x00a9:
            boolean r0 = r1.toBoolean(r3)
            r1.mPostLayout = r0
            goto L_0x00e7
        L_0x00b0:
            float r0 = r1.toFloat(r3)
            r1.mTriggerSlack = r0
            goto L_0x00e7
        L_0x00b7:
            r0 = r3
            android.view.View r0 = (android.view.View) r0
            r1.mTriggerCollisionView = r0
            goto L_0x00e7
        L_0x00bd:
            int r0 = r1.toInt(r3)
            r1.mTriggerCollisionId = r0
            goto L_0x00e7
        L_0x00c4:
            int r0 = r1.toInt(r3)
            r1.mTriggerID = r0
            goto L_0x00e7
        L_0x00cb:
            java.lang.String r0 = r3.toString()
            r1.mPositiveCross = r0
            goto L_0x00e7
        L_0x00d2:
            java.lang.String r0 = r3.toString()
            r1.mNegativeCross = r0
            goto L_0x00e7
        L_0x00d9:
            int r0 = r1.toInt(r3)
            r1.mTriggerReceiver = r0
            goto L_0x00e7
        L_0x00e0:
            java.lang.String r0 = r3.toString()
            r1.mCross = r0
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyTrigger.setValue(java.lang.String, java.lang.Object):void");
    }

    private void setUpRect(RectF rect, View child, boolean postLayout) {
        rect.top = (float) child.getTop();
        rect.bottom = (float) child.getBottom();
        rect.left = (float) child.getLeft();
        rect.right = (float) child.getRight();
        if (postLayout) {
            child.getMatrix().mapRect(rect);
        }
    }

    public void conditionallyFire(float pos, View child) {
        View call;
        boolean fireCross = false;
        boolean fireNegative = false;
        boolean firePositive = false;
        if (this.mTriggerCollisionId != UNSET) {
            if (this.mTriggerCollisionView == null) {
                this.mTriggerCollisionView = ((ViewGroup) child.getParent()).findViewById(this.mTriggerCollisionId);
            }
            setUpRect(this.mCollisionRect, this.mTriggerCollisionView, this.mPostLayout);
            setUpRect(this.mTargetRect, child, this.mPostLayout);
            if (this.mCollisionRect.intersect(this.mTargetRect)) {
                if (this.mFireCrossReset) {
                    fireCross = true;
                    this.mFireCrossReset = false;
                }
                if (this.mFirePositiveReset) {
                    firePositive = true;
                    this.mFirePositiveReset = false;
                }
                this.mFireNegativeReset = true;
            } else {
                if (!this.mFireCrossReset) {
                    fireCross = true;
                    this.mFireCrossReset = true;
                }
                if (this.mFireNegativeReset) {
                    fireNegative = true;
                    this.mFireNegativeReset = false;
                }
                this.mFirePositiveReset = true;
            }
        } else {
            if (this.mFireCrossReset) {
                if ((pos - this.mFireThreshold) * (this.mFireLastPos - this.mFireThreshold) < 0.0f) {
                    fireCross = true;
                    this.mFireCrossReset = false;
                }
            } else if (Math.abs(pos - this.mFireThreshold) > this.mTriggerSlack) {
                this.mFireCrossReset = true;
            }
            if (this.mFireNegativeReset) {
                float offset = pos - this.mFireThreshold;
                if (offset * (this.mFireLastPos - this.mFireThreshold) < 0.0f && offset < 0.0f) {
                    fireNegative = true;
                    this.mFireNegativeReset = false;
                }
            } else if (Math.abs(pos - this.mFireThreshold) > this.mTriggerSlack) {
                this.mFireNegativeReset = true;
            }
            if (this.mFirePositiveReset) {
                float offset2 = pos - this.mFireThreshold;
                if (offset2 * (this.mFireLastPos - this.mFireThreshold) < 0.0f && offset2 > 0.0f) {
                    firePositive = true;
                    this.mFirePositiveReset = false;
                }
            } else if (Math.abs(pos - this.mFireThreshold) > this.mTriggerSlack) {
                this.mFirePositiveReset = true;
            }
        }
        this.mFireLastPos = pos;
        if (fireNegative || fireCross || firePositive) {
            ((MotionLayout) child.getParent()).fireTrigger(this.mTriggerID, firePositive, pos);
        }
        if (this.mTriggerReceiver == UNSET) {
            call = child;
        } else {
            call = ((MotionLayout) child.getParent()).findViewById(this.mTriggerReceiver);
        }
        if (fireNegative) {
            if (this.mNegativeCross != null) {
                fire(this.mNegativeCross, call);
            }
            if (this.mViewTransitionOnNegativeCross != UNSET) {
                ((MotionLayout) child.getParent()).viewTransition(this.mViewTransitionOnNegativeCross, call);
            }
        }
        if (firePositive) {
            if (this.mPositiveCross != null) {
                fire(this.mPositiveCross, call);
            }
            if (this.mViewTransitionOnPositiveCross != UNSET) {
                ((MotionLayout) child.getParent()).viewTransition(this.mViewTransitionOnPositiveCross, call);
            }
        }
        if (fireCross) {
            if (this.mCross != null) {
                fire(this.mCross, call);
            }
            if (this.mViewTransitionOnCross != UNSET) {
                ((MotionLayout) child.getParent()).viewTransition(this.mViewTransitionOnCross, call);
            }
        }
    }

    private void fire(String str, View call) {
        if (str != null) {
            if (str.startsWith(".")) {
                fireCustom(str, call);
                return;
            }
            Method method = null;
            if (!this.mMethodHashMap.containsKey(str) || (method = this.mMethodHashMap.get(str)) != null) {
                if (method == null) {
                    try {
                        method = call.getClass().getMethod(str, new Class[0]);
                        this.mMethodHashMap.put(str, method);
                    } catch (NoSuchMethodException e) {
                        this.mMethodHashMap.put(str, (Object) null);
                        Log.e(TypedValues.TriggerType.NAME, "Could not find method \"" + str + "\"on class " + call.getClass().getSimpleName() + " " + Debug.getName(call));
                        return;
                    }
                }
                try {
                    method.invoke(call, new Object[0]);
                } catch (Exception e2) {
                    Log.e(TypedValues.TriggerType.NAME, "Exception in call \"" + this.mCross + "\"on class " + call.getClass().getSimpleName() + " " + Debug.getName(call));
                }
            }
        }
    }

    private void fireCustom(String str, View view) {
        ConstraintAttribute custom;
        boolean callAll = str.length() == 1;
        if (!callAll) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String name : this.mCustomConstraints.keySet()) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            if ((callAll || lowerCase.matches(str)) && (custom = (ConstraintAttribute) this.mCustomConstraints.get(name)) != null) {
                custom.applyCustom(view);
            }
        }
    }

    public Key copy(Key src) {
        super.copy(src);
        KeyTrigger k = (KeyTrigger) src;
        this.mCurveFit = k.mCurveFit;
        this.mCross = k.mCross;
        this.mTriggerReceiver = k.mTriggerReceiver;
        this.mNegativeCross = k.mNegativeCross;
        this.mPositiveCross = k.mPositiveCross;
        this.mTriggerID = k.mTriggerID;
        this.mTriggerCollisionId = k.mTriggerCollisionId;
        this.mTriggerCollisionView = k.mTriggerCollisionView;
        this.mTriggerSlack = k.mTriggerSlack;
        this.mFireCrossReset = k.mFireCrossReset;
        this.mFireNegativeReset = k.mFireNegativeReset;
        this.mFirePositiveReset = k.mFirePositiveReset;
        this.mFireThreshold = k.mFireThreshold;
        this.mFireLastPos = k.mFireLastPos;
        this.mPostLayout = k.mPostLayout;
        this.mCollisionRect = k.mCollisionRect;
        this.mTargetRect = k.mTargetRect;
        this.mMethodHashMap = k.mMethodHashMap;
        return this;
    }

    public Key clone() {
        return new KeyTrigger().copy(this);
    }

    private static class Loader {
        private static final int COLLISION = 9;
        private static final int CROSS = 4;
        private static final int FRAME_POS = 8;
        private static final int NEGATIVE_CROSS = 1;
        private static final int POSITIVE_CROSS = 2;
        private static final int POST_LAYOUT = 10;
        private static final int TARGET_ID = 7;
        private static final int TRIGGER_ID = 6;
        private static final int TRIGGER_RECEIVER = 11;
        private static final int TRIGGER_SLACK = 5;
        private static final int VT_CROSS = 12;
        private static final int VT_NEGATIVE_CROSS = 13;
        private static final int VT_POSITIVE_CROSS = 14;
        private static SparseIntArray sAttrMap = new SparseIntArray();

        private Loader() {
        }

        static {
            sAttrMap.append(R.styleable.KeyTrigger_framePosition, 8);
            sAttrMap.append(R.styleable.KeyTrigger_onCross, 4);
            sAttrMap.append(R.styleable.KeyTrigger_onNegativeCross, 1);
            sAttrMap.append(R.styleable.KeyTrigger_onPositiveCross, 2);
            sAttrMap.append(R.styleable.KeyTrigger_motionTarget, 7);
            sAttrMap.append(R.styleable.KeyTrigger_triggerId, 6);
            sAttrMap.append(R.styleable.KeyTrigger_triggerSlack, 5);
            sAttrMap.append(R.styleable.KeyTrigger_motion_triggerOnCollision, 9);
            sAttrMap.append(R.styleable.KeyTrigger_motion_postLayoutCollision, 10);
            sAttrMap.append(R.styleable.KeyTrigger_triggerReceiver, 11);
            sAttrMap.append(R.styleable.KeyTrigger_viewTransitionOnCross, 12);
            sAttrMap.append(R.styleable.KeyTrigger_viewTransitionOnNegativeCross, 13);
            sAttrMap.append(R.styleable.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        public static void read(KeyTrigger c, TypedArray a, Context context) {
            int n = a.getIndexCount();
            for (int i = 0; i < n; i++) {
                int attr = a.getIndex(i);
                switch (sAttrMap.get(attr)) {
                    case 1:
                        String unused = c.mNegativeCross = a.getString(attr);
                        break;
                    case 2:
                        String unused2 = c.mPositiveCross = a.getString(attr);
                        break;
                    case 4:
                        String unused3 = c.mCross = a.getString(attr);
                        break;
                    case 5:
                        c.mTriggerSlack = a.getFloat(attr, c.mTriggerSlack);
                        break;
                    case 6:
                        int unused4 = c.mTriggerID = a.getResourceId(attr, c.mTriggerID);
                        break;
                    case 7:
                        if (!MotionLayout.IS_IN_EDIT_MODE) {
                            if (a.peekValue(attr).type != 3) {
                                c.mTargetId = a.getResourceId(attr, c.mTargetId);
                                break;
                            } else {
                                c.mTargetString = a.getString(attr);
                                break;
                            }
                        } else {
                            c.mTargetId = a.getResourceId(attr, c.mTargetId);
                            if (c.mTargetId != -1) {
                                break;
                            } else {
                                c.mTargetString = a.getString(attr);
                                break;
                            }
                        }
                    case 8:
                        c.mFramePosition = a.getInteger(attr, c.mFramePosition);
                        float unused5 = c.mFireThreshold = (((float) c.mFramePosition) + 0.5f) / 100.0f;
                        break;
                    case 9:
                        int unused6 = c.mTriggerCollisionId = a.getResourceId(attr, c.mTriggerCollisionId);
                        break;
                    case 10:
                        boolean unused7 = c.mPostLayout = a.getBoolean(attr, c.mPostLayout);
                        break;
                    case 11:
                        int unused8 = c.mTriggerReceiver = a.getResourceId(attr, c.mTriggerReceiver);
                        break;
                    case 12:
                        c.mViewTransitionOnCross = a.getResourceId(attr, c.mViewTransitionOnCross);
                        break;
                    case 13:
                        c.mViewTransitionOnNegativeCross = a.getResourceId(attr, c.mViewTransitionOnNegativeCross);
                        break;
                    case 14:
                        c.mViewTransitionOnPositiveCross = a.getResourceId(attr, c.mViewTransitionOnPositiveCross);
                        break;
                    default:
                        Log.e(TypedValues.TriggerType.NAME, "unused attribute 0x" + Integer.toHexString(attr) + "   " + sAttrMap.get(attr));
                        break;
                }
            }
        }
    }
}
