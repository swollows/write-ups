package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

class TouchResponse {
    public static final int COMPLETE_MODE_CONTINUOUS_VELOCITY = 0;
    public static final int COMPLETE_MODE_SPRING = 1;
    private static final boolean DEBUG = false;
    private static final float EPSILON = 1.0E-7f;
    static final int FLAG_DISABLE_POST_SCROLL = 1;
    static final int FLAG_DISABLE_SCROLL = 2;
    static final int FLAG_SUPPORT_SCROLL_UP = 4;
    private static final int SEC_TO_MILLISECONDS = 1000;
    private static final int SIDE_BOTTOM = 3;
    private static final int SIDE_END = 6;
    private static final int SIDE_LEFT = 1;
    private static final int SIDE_MIDDLE = 4;
    private static final int SIDE_RIGHT = 2;
    private static final int SIDE_START = 5;
    private static final int SIDE_TOP = 0;
    private static final String TAG = "TouchResponse";
    private static final float[][] TOUCH_DIRECTION = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    private static final int TOUCH_DOWN = 1;
    private static final int TOUCH_END = 5;
    private static final int TOUCH_LEFT = 2;
    private static final int TOUCH_RIGHT = 3;
    private static final float[][] TOUCH_SIDES = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final int TOUCH_START = 4;
    private static final int TOUCH_UP = 0;
    private float[] mAnchorDpDt = new float[2];
    private int mAutoCompleteMode = 0;
    private float mDragScale = 1.0f;
    private boolean mDragStarted = false;
    private float mDragThreshold = 10.0f;
    private int mFlags = 0;
    boolean mIsRotateMode = false;
    private float mLastTouchX;
    private float mLastTouchY;
    private int mLimitBoundsTo = -1;
    private float mMaxAcceleration = 1.2f;
    private float mMaxVelocity = 4.0f;
    private final MotionLayout mMotionLayout;
    private boolean mMoveWhenScrollAtTop = true;
    private int mOnTouchUp = 0;
    float mRotateCenterX = 0.5f;
    float mRotateCenterY = 0.5f;
    private int mRotationCenterId = -1;
    private int mSpringBoundary = 0;
    private float mSpringDamping = 10.0f;
    private float mSpringMass = 1.0f;
    private float mSpringStiffness = Float.NaN;
    private float mSpringStopThreshold = Float.NaN;
    private int[] mTempLoc = new int[2];
    private int mTouchAnchorId = -1;
    private int mTouchAnchorSide = 0;
    private float mTouchAnchorX = 0.5f;
    private float mTouchAnchorY = 0.5f;
    private float mTouchDirectionX = 0.0f;
    private float mTouchDirectionY = 1.0f;
    private int mTouchRegionId = -1;
    private int mTouchSide = 0;

    TouchResponse(Context context, MotionLayout layout, XmlPullParser parser) {
        this.mMotionLayout = layout;
        fillFromAttributeList(context, Xml.asAttributeSet(parser));
    }

    TouchResponse(MotionLayout layout, OnSwipe onSwipe) {
        this.mMotionLayout = layout;
        this.mTouchAnchorId = onSwipe.getTouchAnchorId();
        this.mTouchAnchorSide = onSwipe.getTouchAnchorSide();
        if (this.mTouchAnchorSide != -1) {
            this.mTouchAnchorX = TOUCH_SIDES[this.mTouchAnchorSide][0];
            this.mTouchAnchorY = TOUCH_SIDES[this.mTouchAnchorSide][1];
        }
        this.mTouchSide = onSwipe.getDragDirection();
        if (this.mTouchSide < TOUCH_DIRECTION.length) {
            this.mTouchDirectionX = TOUCH_DIRECTION[this.mTouchSide][0];
            this.mTouchDirectionY = TOUCH_DIRECTION[this.mTouchSide][1];
        } else {
            this.mTouchDirectionY = Float.NaN;
            this.mTouchDirectionX = Float.NaN;
            this.mIsRotateMode = true;
        }
        this.mMaxVelocity = onSwipe.getMaxVelocity();
        this.mMaxAcceleration = onSwipe.getMaxAcceleration();
        this.mMoveWhenScrollAtTop = onSwipe.getMoveWhenScrollAtTop();
        this.mDragScale = onSwipe.getDragScale();
        this.mDragThreshold = onSwipe.getDragThreshold();
        this.mTouchRegionId = onSwipe.getTouchRegionId();
        this.mOnTouchUp = onSwipe.getOnTouchUp();
        this.mFlags = onSwipe.getNestedScrollFlags();
        this.mLimitBoundsTo = onSwipe.getLimitBoundsTo();
        this.mRotationCenterId = onSwipe.getRotationCenterId();
        this.mSpringBoundary = onSwipe.getSpringBoundary();
        this.mSpringDamping = onSwipe.getSpringDamping();
        this.mSpringMass = onSwipe.getSpringMass();
        this.mSpringStiffness = onSwipe.getSpringStiffness();
        this.mSpringStopThreshold = onSwipe.getSpringStopThreshold();
        this.mAutoCompleteMode = onSwipe.getAutoCompleteMode();
    }

    public void setRTL(boolean rtl) {
        if (rtl) {
            TOUCH_DIRECTION[4] = TOUCH_DIRECTION[3];
            TOUCH_DIRECTION[5] = TOUCH_DIRECTION[2];
            TOUCH_SIDES[5] = TOUCH_SIDES[2];
            TOUCH_SIDES[6] = TOUCH_SIDES[1];
        } else {
            TOUCH_DIRECTION[4] = TOUCH_DIRECTION[2];
            TOUCH_DIRECTION[5] = TOUCH_DIRECTION[3];
            TOUCH_SIDES[5] = TOUCH_SIDES[1];
            TOUCH_SIDES[6] = TOUCH_SIDES[2];
        }
        this.mTouchAnchorX = TOUCH_SIDES[this.mTouchAnchorSide][0];
        this.mTouchAnchorY = TOUCH_SIDES[this.mTouchAnchorSide][1];
        if (this.mTouchSide < TOUCH_DIRECTION.length) {
            this.mTouchDirectionX = TOUCH_DIRECTION[this.mTouchSide][0];
            this.mTouchDirectionY = TOUCH_DIRECTION[this.mTouchSide][1];
        }
    }

    private void fillFromAttributeList(Context context, AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.OnSwipe);
        fill(a);
        a.recycle();
    }

    private void fill(TypedArray a) {
        int count = a.getIndexCount();
        for (int i = 0; i < count; i++) {
            int attr = a.getIndex(i);
            if (attr == R.styleable.OnSwipe_touchAnchorId) {
                this.mTouchAnchorId = a.getResourceId(attr, this.mTouchAnchorId);
            } else if (attr == R.styleable.OnSwipe_touchAnchorSide) {
                this.mTouchAnchorSide = a.getInt(attr, this.mTouchAnchorSide);
                this.mTouchAnchorX = TOUCH_SIDES[this.mTouchAnchorSide][0];
                this.mTouchAnchorY = TOUCH_SIDES[this.mTouchAnchorSide][1];
            } else if (attr == R.styleable.OnSwipe_dragDirection) {
                this.mTouchSide = a.getInt(attr, this.mTouchSide);
                if (this.mTouchSide < TOUCH_DIRECTION.length) {
                    this.mTouchDirectionX = TOUCH_DIRECTION[this.mTouchSide][0];
                    this.mTouchDirectionY = TOUCH_DIRECTION[this.mTouchSide][1];
                } else {
                    this.mTouchDirectionY = Float.NaN;
                    this.mTouchDirectionX = Float.NaN;
                    this.mIsRotateMode = true;
                }
            } else if (attr == R.styleable.OnSwipe_maxVelocity) {
                this.mMaxVelocity = a.getFloat(attr, this.mMaxVelocity);
            } else if (attr == R.styleable.OnSwipe_maxAcceleration) {
                this.mMaxAcceleration = a.getFloat(attr, this.mMaxAcceleration);
            } else if (attr == R.styleable.OnSwipe_moveWhenScrollAtTop) {
                this.mMoveWhenScrollAtTop = a.getBoolean(attr, this.mMoveWhenScrollAtTop);
            } else if (attr == R.styleable.OnSwipe_dragScale) {
                this.mDragScale = a.getFloat(attr, this.mDragScale);
            } else if (attr == R.styleable.OnSwipe_dragThreshold) {
                this.mDragThreshold = a.getFloat(attr, this.mDragThreshold);
            } else if (attr == R.styleable.OnSwipe_touchRegionId) {
                this.mTouchRegionId = a.getResourceId(attr, this.mTouchRegionId);
            } else if (attr == R.styleable.OnSwipe_onTouchUp) {
                this.mOnTouchUp = a.getInt(attr, this.mOnTouchUp);
            } else if (attr == R.styleable.OnSwipe_nestedScrollFlags) {
                this.mFlags = a.getInteger(attr, 0);
            } else if (attr == R.styleable.OnSwipe_limitBoundsTo) {
                this.mLimitBoundsTo = a.getResourceId(attr, 0);
            } else if (attr == R.styleable.OnSwipe_rotationCenterId) {
                this.mRotationCenterId = a.getResourceId(attr, this.mRotationCenterId);
            } else if (attr == R.styleable.OnSwipe_springDamping) {
                this.mSpringDamping = a.getFloat(attr, this.mSpringDamping);
            } else if (attr == R.styleable.OnSwipe_springMass) {
                this.mSpringMass = a.getFloat(attr, this.mSpringMass);
            } else if (attr == R.styleable.OnSwipe_springStiffness) {
                this.mSpringStiffness = a.getFloat(attr, this.mSpringStiffness);
            } else if (attr == R.styleable.OnSwipe_springStopThreshold) {
                this.mSpringStopThreshold = a.getFloat(attr, this.mSpringStopThreshold);
            } else if (attr == R.styleable.OnSwipe_springBoundary) {
                this.mSpringBoundary = a.getInt(attr, this.mSpringBoundary);
            } else if (attr == R.styleable.OnSwipe_autoCompleteMode) {
                this.mAutoCompleteMode = a.getInt(attr, this.mAutoCompleteMode);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setUpTouchEvent(float lastTouchX, float lastTouchY) {
        this.mLastTouchX = lastTouchX;
        this.mLastTouchY = lastTouchY;
        this.mDragStarted = false;
    }

    /* access modifiers changed from: package-private */
    public void processTouchRotateEvent(MotionEvent event, MotionLayout.MotionTracker velocityTracker, int currentState, MotionScene motionScene) {
        char c;
        MotionLayout.MotionTracker motionTracker = velocityTracker;
        motionTracker.addMovement(event);
        switch (event.getAction()) {
            case 0:
                this.mLastTouchX = event.getRawX();
                this.mLastTouchY = event.getRawY();
                this.mDragStarted = false;
                return;
            case 1:
                this.mDragStarted = false;
                motionTracker.computeCurrentVelocity(16);
                float tvx = velocityTracker.getXVelocity();
                float tvy = velocityTracker.getYVelocity();
                float currentPos = this.mMotionLayout.getProgress();
                float pos = currentPos;
                float rcx = ((float) this.mMotionLayout.getWidth()) / 2.0f;
                float rcy = ((float) this.mMotionLayout.getHeight()) / 2.0f;
                if (this.mRotationCenterId != -1) {
                    View v = this.mMotionLayout.findViewById(this.mRotationCenterId);
                    this.mMotionLayout.getLocationOnScreen(this.mTempLoc);
                    rcx = ((float) this.mTempLoc[0]) + (((float) (v.getLeft() + v.getRight())) / 2.0f);
                    rcy = ((float) this.mTempLoc[1]) + (((float) (v.getTop() + v.getBottom())) / 2.0f);
                } else if (this.mTouchAnchorId != -1) {
                    View v2 = this.mMotionLayout.findViewById(this.mMotionLayout.getMotionController(this.mTouchAnchorId).getAnimateRelativeTo());
                    this.mMotionLayout.getLocationOnScreen(this.mTempLoc);
                    rcx = ((float) this.mTempLoc[0]) + (((float) (v2.getLeft() + v2.getRight())) / 2.0f);
                    rcy = ((float) this.mTempLoc[1]) + (((float) (v2.getTop() + v2.getBottom())) / 2.0f);
                }
                float relativePosX = event.getRawX() - rcx;
                float relativePosY = event.getRawY() - rcy;
                double angle1 = Math.toDegrees(Math.atan2((double) relativePosY, (double) relativePosX));
                if (this.mTouchAnchorId != -1) {
                    this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, pos, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
                    this.mAnchorDpDt[1] = (float) Math.toDegrees((double) this.mAnchorDpDt[1]);
                } else {
                    this.mAnchorDpDt[1] = 360.0f;
                }
                float angularVelocity = ((float) (Math.toDegrees(Math.atan2((double) (tvy + relativePosY), (double) (tvx + relativePosX))) - angle1)) * 62.5f;
                if (!Float.isNaN(angularVelocity)) {
                    pos += ((angularVelocity * 3.0f) * this.mDragScale) / this.mAnchorDpDt[1];
                }
                if (pos == 0.0f || pos == 1.0f || this.mOnTouchUp == 3) {
                    float f = tvy;
                    if (0.0f >= pos || 1.0f <= pos) {
                        this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                        return;
                    }
                    return;
                }
                float angularVelocity2 = (this.mDragScale * angularVelocity) / this.mAnchorDpDt[1];
                float target = ((double) pos) < 0.5d ? 0.0f : 1.0f;
                float f2 = tvx;
                if (this.mOnTouchUp == 6) {
                    if (currentPos + angularVelocity2 < 0.0f) {
                        angularVelocity2 = Math.abs(angularVelocity2);
                    }
                    target = 1.0f;
                }
                if (this.mOnTouchUp == 7) {
                    if (currentPos + angularVelocity2 > 1.0f) {
                        angularVelocity2 = -Math.abs(angularVelocity2);
                    }
                    target = 0.0f;
                }
                float f3 = tvy;
                this.mMotionLayout.touchAnimateTo(this.mOnTouchUp, target, angularVelocity2 * 3.0f);
                if (0.0f >= currentPos || 1.0f <= currentPos) {
                    this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                    return;
                }
                return;
            case 2:
                float dy = event.getRawY() - this.mLastTouchY;
                float rawX = event.getRawX() - this.mLastTouchX;
                float rcx2 = ((float) this.mMotionLayout.getWidth()) / 2.0f;
                float rcy2 = ((float) this.mMotionLayout.getHeight()) / 2.0f;
                if (this.mRotationCenterId != -1) {
                    View v3 = this.mMotionLayout.findViewById(this.mRotationCenterId);
                    this.mMotionLayout.getLocationOnScreen(this.mTempLoc);
                    rcx2 = ((float) this.mTempLoc[0]) + (((float) (v3.getLeft() + v3.getRight())) / 2.0f);
                    rcy2 = ((float) this.mTempLoc[1]) + (((float) (v3.getTop() + v3.getBottom())) / 2.0f);
                } else if (this.mTouchAnchorId != -1) {
                    View v4 = this.mMotionLayout.findViewById(this.mMotionLayout.getMotionController(this.mTouchAnchorId).getAnimateRelativeTo());
                    if (v4 == null) {
                        Log.e(TAG, "could not find view to animate to");
                    } else {
                        this.mMotionLayout.getLocationOnScreen(this.mTempLoc);
                        rcx2 = ((float) this.mTempLoc[0]) + (((float) (v4.getLeft() + v4.getRight())) / 2.0f);
                        rcy2 = ((float) this.mTempLoc[1]) + (((float) (v4.getTop() + v4.getBottom())) / 2.0f);
                    }
                }
                float relativePosY2 = event.getRawY() - rcy2;
                double angle12 = Math.atan2((double) (event.getRawY() - rcy2), (double) (event.getRawX() - rcx2));
                float relativePosX2 = event.getRawX() - rcx2;
                double angle2 = Math.atan2((double) (this.mLastTouchY - rcy2), (double) (this.mLastTouchX - rcx2));
                float drag = (float) (((angle12 - angle2) * 180.0d) / 3.141592653589793d);
                if (drag > 330.0f) {
                    drag -= 360.0f;
                } else if (drag < -330.0f) {
                    drag += 360.0f;
                }
                if (((double) Math.abs(drag)) > 0.01d || this.mDragStarted) {
                    float pos2 = this.mMotionLayout.getProgress();
                    if (!this.mDragStarted) {
                        this.mDragStarted = true;
                        this.mMotionLayout.setProgress(pos2);
                    }
                    if (this.mTouchAnchorId != -1) {
                        float f4 = dy;
                        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, pos2, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
                        double d = angle2;
                        c = 1;
                        this.mAnchorDpDt[1] = (float) Math.toDegrees((double) this.mAnchorDpDt[1]);
                    } else {
                        double d2 = angle2;
                        c = 1;
                        this.mAnchorDpDt[1] = 360.0f;
                    }
                    float change = (this.mDragScale * drag) / this.mAnchorDpDt[c];
                    float pos3 = Math.max(Math.min(pos2 + change, 1.0f), 0.0f);
                    float current = this.mMotionLayout.getProgress();
                    if (pos3 != current) {
                        if (current == 0.0f || current == 1.0f) {
                            this.mMotionLayout.endTrigger(current == 0.0f);
                        }
                        this.mMotionLayout.setProgress(pos3);
                        motionTracker.computeCurrentVelocity(1000);
                        float tvx2 = velocityTracker.getXVelocity();
                        float tvy2 = velocityTracker.getYVelocity();
                        float f5 = change;
                        float f6 = pos3;
                        float f7 = current;
                        float f8 = tvy2;
                        double d3 = angle12;
                        this.mMotionLayout.mLastVelocity = (float) Math.toDegrees((double) ((float) ((Math.hypot((double) tvy2, (double) tvx2) * Math.sin(Math.atan2((double) tvy2, (double) tvx2) - angle12)) / Math.hypot((double) relativePosX2, (double) relativePosY2))));
                    } else {
                        float f9 = pos3;
                        float f10 = current;
                        double d4 = angle12;
                        float current2 = relativePosY2;
                        this.mMotionLayout.mLastVelocity = 0.0f;
                    }
                    this.mLastTouchX = event.getRawX();
                    this.mLastTouchY = event.getRawY();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    public void processTouchEvent(MotionEvent event, MotionLayout.MotionTracker velocityTracker, int currentState, MotionScene motionScene) {
        float velocity;
        float change;
        float velocity2;
        MotionLayout.MotionTracker motionTracker = velocityTracker;
        if (this.mIsRotateMode) {
            processTouchRotateEvent(event, velocityTracker, currentState, motionScene);
            return;
        }
        motionTracker.addMovement(event);
        switch (event.getAction()) {
            case 0:
                this.mLastTouchX = event.getRawX();
                this.mLastTouchY = event.getRawY();
                this.mDragStarted = false;
                return;
            case 1:
                this.mDragStarted = false;
                motionTracker.computeCurrentVelocity(1000);
                float tvx = velocityTracker.getXVelocity();
                float tvy = velocityTracker.getYVelocity();
                float currentPos = this.mMotionLayout.getProgress();
                float pos = currentPos;
                if (this.mTouchAnchorId != -1) {
                    this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, pos, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
                } else {
                    float minSize = (float) Math.min(this.mMotionLayout.getWidth(), this.mMotionLayout.getHeight());
                    this.mAnchorDpDt[1] = this.mTouchDirectionY * minSize;
                    this.mAnchorDpDt[0] = this.mTouchDirectionX * minSize;
                }
                float f = (this.mTouchDirectionX * this.mAnchorDpDt[0]) + (this.mTouchDirectionY * this.mAnchorDpDt[1]);
                if (this.mTouchDirectionX != 0.0f) {
                    velocity = tvx / this.mAnchorDpDt[0];
                } else {
                    velocity = tvy / this.mAnchorDpDt[1];
                }
                if (!Float.isNaN(velocity)) {
                    pos += velocity / 3.0f;
                }
                if (pos != 0.0f && pos != 1.0f && this.mOnTouchUp != 3) {
                    float target = ((double) pos) < 0.5d ? 0.0f : 1.0f;
                    if (this.mOnTouchUp == 6) {
                        if (currentPos + velocity < 0.0f) {
                            velocity = Math.abs(velocity);
                        }
                        target = 1.0f;
                    }
                    if (this.mOnTouchUp == 7) {
                        if (currentPos + velocity > 1.0f) {
                            velocity = -Math.abs(velocity);
                        }
                        target = 0.0f;
                    }
                    this.mMotionLayout.touchAnimateTo(this.mOnTouchUp, target, velocity);
                    if (0.0f >= currentPos || 1.0f <= currentPos) {
                        this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                        return;
                    }
                    return;
                } else if (0.0f >= pos || 1.0f <= pos) {
                    this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                    return;
                } else {
                    return;
                }
            case 2:
                float dy = event.getRawY() - this.mLastTouchY;
                float dx = event.getRawX() - this.mLastTouchX;
                if (Math.abs((this.mTouchDirectionX * dx) + (this.mTouchDirectionY * dy)) > this.mDragThreshold || this.mDragStarted) {
                    float pos2 = this.mMotionLayout.getProgress();
                    if (!this.mDragStarted) {
                        this.mDragStarted = true;
                        this.mMotionLayout.setProgress(pos2);
                    }
                    if (this.mTouchAnchorId != -1) {
                        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, pos2, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
                    } else {
                        float minSize2 = (float) Math.min(this.mMotionLayout.getWidth(), this.mMotionLayout.getHeight());
                        this.mAnchorDpDt[1] = this.mTouchDirectionY * minSize2;
                        this.mAnchorDpDt[0] = this.mTouchDirectionX * minSize2;
                    }
                    if (((double) Math.abs(((this.mTouchDirectionX * this.mAnchorDpDt[0]) + (this.mTouchDirectionY * this.mAnchorDpDt[1])) * this.mDragScale)) < 0.01d) {
                        this.mAnchorDpDt[0] = 0.01f;
                        this.mAnchorDpDt[1] = 0.01f;
                    }
                    if (this.mTouchDirectionX != 0.0f) {
                        change = dx / this.mAnchorDpDt[0];
                    } else {
                        change = dy / this.mAnchorDpDt[1];
                    }
                    float pos3 = Math.max(Math.min(pos2 + change, 1.0f), 0.0f);
                    if (this.mOnTouchUp == 6) {
                        pos3 = Math.max(pos3, 0.01f);
                    }
                    if (this.mOnTouchUp == 7) {
                        pos3 = Math.min(pos3, 0.99f);
                    }
                    float current = this.mMotionLayout.getProgress();
                    if (pos3 != current) {
                        if (current == 0.0f || current == 1.0f) {
                            this.mMotionLayout.endTrigger(current == 0.0f);
                        }
                        this.mMotionLayout.setProgress(pos3);
                        motionTracker.computeCurrentVelocity(1000);
                        float tvx2 = velocityTracker.getXVelocity();
                        float tvy2 = velocityTracker.getYVelocity();
                        if (this.mTouchDirectionX != 0.0f) {
                            velocity2 = tvx2 / this.mAnchorDpDt[0];
                        } else {
                            velocity2 = tvy2 / this.mAnchorDpDt[1];
                        }
                        this.mMotionLayout.mLastVelocity = velocity2;
                    } else {
                        this.mMotionLayout.mLastVelocity = 0.0f;
                    }
                    this.mLastTouchX = event.getRawX();
                    this.mLastTouchY = event.getRawY();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    public void setDown(float lastTouchX, float lastTouchY) {
        this.mLastTouchX = lastTouchX;
        this.mLastTouchY = lastTouchY;
    }

    /* access modifiers changed from: package-private */
    public float getProgressDirection(float dx, float dy) {
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, this.mMotionLayout.getProgress(), this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        if (this.mTouchDirectionX != 0.0f) {
            if (this.mAnchorDpDt[0] == 0.0f) {
                this.mAnchorDpDt[0] = 1.0E-7f;
            }
            return (this.mTouchDirectionX * dx) / this.mAnchorDpDt[0];
        }
        if (this.mAnchorDpDt[1] == 0.0f) {
            this.mAnchorDpDt[1] = 1.0E-7f;
        }
        return (this.mTouchDirectionY * dy) / this.mAnchorDpDt[1];
    }

    /* access modifiers changed from: package-private */
    public void scrollUp(float dx, float dy) {
        float velocity;
        this.mDragStarted = false;
        float pos = this.mMotionLayout.getProgress();
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, pos, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f = (this.mTouchDirectionX * this.mAnchorDpDt[0]) + (this.mTouchDirectionY * this.mAnchorDpDt[1]);
        float f2 = 0.0f;
        if (this.mTouchDirectionX != 0.0f) {
            velocity = (this.mTouchDirectionX * dx) / this.mAnchorDpDt[0];
        } else {
            velocity = (this.mTouchDirectionY * dy) / this.mAnchorDpDt[1];
        }
        if (!Float.isNaN(velocity)) {
            pos += velocity / 3.0f;
        }
        if (pos != 0.0f && pos != 1.0f && this.mOnTouchUp != 3) {
            MotionLayout motionLayout = this.mMotionLayout;
            int i = this.mOnTouchUp;
            if (((double) pos) >= 0.5d) {
                f2 = 1.0f;
            }
            motionLayout.touchAnimateTo(i, f2, velocity);
        }
    }

    /* access modifiers changed from: package-private */
    public void scrollMove(float dx, float dy) {
        float change;
        float f = (this.mTouchDirectionX * dx) + (this.mTouchDirectionY * dy);
        float pos = this.mMotionLayout.getProgress();
        if (!this.mDragStarted) {
            this.mDragStarted = true;
            this.mMotionLayout.setProgress(pos);
        }
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, pos, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        if (((double) Math.abs((this.mTouchDirectionX * this.mAnchorDpDt[0]) + (this.mTouchDirectionY * this.mAnchorDpDt[1]))) < 0.01d) {
            this.mAnchorDpDt[0] = 0.01f;
            this.mAnchorDpDt[1] = 0.01f;
        }
        if (this.mTouchDirectionX != 0.0f) {
            change = (this.mTouchDirectionX * dx) / this.mAnchorDpDt[0];
        } else {
            change = (this.mTouchDirectionY * dy) / this.mAnchorDpDt[1];
        }
        float pos2 = Math.max(Math.min(pos + change, 1.0f), 0.0f);
        if (pos2 != this.mMotionLayout.getProgress()) {
            this.mMotionLayout.setProgress(pos2);
        }
    }

    /* access modifiers changed from: package-private */
    public void setupTouch() {
        View view = null;
        if (this.mTouchAnchorId != -1 && (view = this.mMotionLayout.findViewById(this.mTouchAnchorId)) == null) {
            Log.e(TAG, "cannot find TouchAnchorId @id/" + Debug.getName(this.mMotionLayout.getContext(), this.mTouchAnchorId));
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView sv = (NestedScrollView) view;
            sv.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return false;
                }
            });
            sv.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
                public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                }
            });
        }
    }

    public void setAnchorId(int id) {
        this.mTouchAnchorId = id;
    }

    public int getAnchorId() {
        return this.mTouchAnchorId;
    }

    public void setTouchAnchorLocation(float x, float y) {
        this.mTouchAnchorX = x;
        this.mTouchAnchorY = y;
    }

    public void setMaxVelocity(float velocity) {
        this.mMaxVelocity = velocity;
    }

    public void setMaxAcceleration(float acceleration) {
        this.mMaxAcceleration = acceleration;
    }

    /* access modifiers changed from: package-private */
    public float getMaxAcceleration() {
        return this.mMaxAcceleration;
    }

    public float getMaxVelocity() {
        return this.mMaxVelocity;
    }

    /* access modifiers changed from: package-private */
    public boolean getMoveWhenScrollAtTop() {
        return this.mMoveWhenScrollAtTop;
    }

    public int getAutoCompleteMode() {
        return this.mAutoCompleteMode;
    }

    /* access modifiers changed from: package-private */
    public void setAutoCompleteMode(int autoCompleteMode) {
        this.mAutoCompleteMode = autoCompleteMode;
    }

    /* access modifiers changed from: package-private */
    public RectF getTouchRegion(ViewGroup layout, RectF rect) {
        View view;
        if (this.mTouchRegionId == -1 || (view = layout.findViewById(this.mTouchRegionId)) == null) {
            return null;
        }
        rect.set((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        return rect;
    }

    /* access modifiers changed from: package-private */
    public int getTouchRegionId() {
        return this.mTouchRegionId;
    }

    /* access modifiers changed from: package-private */
    public RectF getLimitBoundsTo(ViewGroup layout, RectF rect) {
        View view;
        if (this.mLimitBoundsTo == -1 || (view = layout.findViewById(this.mLimitBoundsTo)) == null) {
            return null;
        }
        rect.set((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        return rect;
    }

    /* access modifiers changed from: package-private */
    public int getLimitBoundsToId() {
        return this.mLimitBoundsTo;
    }

    /* access modifiers changed from: package-private */
    public float dot(float dx, float dy) {
        return (this.mTouchDirectionX * dx) + (this.mTouchDirectionY * dy);
    }

    public String toString() {
        if (Float.isNaN(this.mTouchDirectionX)) {
            return Key.ROTATION;
        }
        return this.mTouchDirectionX + " , " + this.mTouchDirectionY;
    }

    public int getFlags() {
        return this.mFlags;
    }

    public void setTouchUpMode(int touchUpMode) {
        this.mOnTouchUp = touchUpMode;
    }

    public float getSpringStiffness() {
        return this.mSpringStiffness;
    }

    public float getSpringMass() {
        return this.mSpringMass;
    }

    public float getSpringDamping() {
        return this.mSpringDamping;
    }

    public float getSpringStopThreshold() {
        return this.mSpringStopThreshold;
    }

    public int getSpringBoundary() {
        return this.mSpringBoundary;
    }

    /* access modifiers changed from: package-private */
    public boolean isDragStarted() {
        return this.mDragStarted;
    }
}
