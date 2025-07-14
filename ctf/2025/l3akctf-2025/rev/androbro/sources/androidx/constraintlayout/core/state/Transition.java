package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Transition implements TypedValues {
    static final int ANTICIPATE = 6;
    static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    public static final int END = 1;
    public static final int INTERPOLATED = 2;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    public static final int START = 0;
    private int mAutoTransition = 0;
    private TypedBundle mBundle = new TypedBundle();
    private int mDefaultInterpolator = 0;
    private String mDefaultInterpolatorString = null;
    private int mDuration = 400;
    private Easing mEasing = null;
    private HashMap<Integer, HashMap<String, KeyPosition>> mKeyPositions = new HashMap<>();
    private OnSwipe mOnSwipe = null;
    int mParentEndHeight;
    int mParentEndWidth;
    int mParentInterpolateHeight;
    int mParentInterpolatedWidth;
    int mParentStartHeight;
    int mParentStartWidth;
    private float mStagger = 0.0f;
    private HashMap<String, WidgetState> mState = new HashMap<>();
    final CorePixelDp mToPixel;
    boolean mWrap;

    public Transition(CorePixelDp dpToPixel) {
        this.mToPixel = dpToPixel;
    }

    /* access modifiers changed from: package-private */
    public OnSwipe createOnSwipe() {
        OnSwipe onSwipe = new OnSwipe();
        this.mOnSwipe = onSwipe;
        return onSwipe;
    }

    public boolean hasOnSwipe() {
        return this.mOnSwipe != null;
    }

    static class OnSwipe {
        public static final int ANCHOR_SIDE_BOTTOM = 3;
        public static final int ANCHOR_SIDE_END = 6;
        public static final int ANCHOR_SIDE_LEFT = 1;
        public static final int ANCHOR_SIDE_MIDDLE = 4;
        public static final int ANCHOR_SIDE_RIGHT = 2;
        public static final int ANCHOR_SIDE_START = 5;
        public static final int ANCHOR_SIDE_TOP = 0;
        public static final String[] BOUNDARY = {"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};
        public static final int BOUNDARY_BOUNCE_BOTH = 3;
        public static final int BOUNDARY_BOUNCE_END = 2;
        public static final int BOUNDARY_BOUNCE_START = 1;
        public static final int BOUNDARY_OVERSHOOT = 0;
        public static final String[] DIRECTIONS = {"up", "down", "left", "right", "start", "end", "clockwise", "anticlockwise"};
        public static final int DRAG_ANTICLOCKWISE = 7;
        public static final int DRAG_CLOCKWISE = 6;
        public static final int DRAG_DOWN = 1;
        public static final int DRAG_END = 5;
        public static final int DRAG_LEFT = 2;
        public static final int DRAG_RIGHT = 3;
        public static final int DRAG_START = 4;
        public static final int DRAG_UP = 0;
        public static final String[] MODE = {"velocity", "spring"};
        public static final int MODE_CONTINUOUS_VELOCITY = 0;
        public static final int MODE_SPRING = 1;
        public static final int ON_UP_AUTOCOMPLETE = 0;
        public static final int ON_UP_AUTOCOMPLETE_TO_END = 2;
        public static final int ON_UP_AUTOCOMPLETE_TO_START = 1;
        public static final int ON_UP_DECELERATE = 4;
        public static final int ON_UP_DECELERATE_AND_COMPLETE = 5;
        public static final int ON_UP_NEVER_COMPLETE_TO_END = 7;
        public static final int ON_UP_NEVER_COMPLETE_TO_START = 6;
        public static final int ON_UP_STOP = 3;
        public static final String[] SIDES = {"top", "left", "right", "bottom", "middle", "start", "end"};
        private static final float[][] TOUCH_DIRECTION = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
        private static final float[][] TOUCH_SIDES = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
        public static final String[] TOUCH_UP = {"autocomplete", "toStart", "toEnd", "stop", "decelerate", "decelerateComplete", "neverCompleteStart", "neverCompleteEnd"};
        String mAnchorId;
        private int mAnchorSide;
        private int mAutoCompleteMode = 0;
        private float mDestination = 0.0f;
        private int mDragDirection = 0;
        private float mDragScale = 1.0f;
        private float mDragThreshold = 10.0f;
        private boolean mDragVertical = true;
        private StopEngine mEngine;
        String mLimitBoundsTo;
        private float mMaxAcceleration = 1.2f;
        private float mMaxVelocity = 4.0f;
        private int mOnTouchUp = 0;
        private String mRotationCenterId;
        private int mSpringBoundary = 0;
        private float mSpringDamping = 10.0f;
        private float mSpringMass = 1.0f;
        private float mSpringStiffness = 400.0f;
        private float mSpringStopThreshold = 0.01f;
        private long mStart;

        OnSwipe() {
        }

        /* access modifiers changed from: package-private */
        public float getScale() {
            return this.mDragScale;
        }

        /* access modifiers changed from: package-private */
        public float[] getDirection() {
            return TOUCH_DIRECTION[this.mDragDirection];
        }

        /* access modifiers changed from: package-private */
        public float[] getSide() {
            return TOUCH_SIDES[this.mAnchorSide];
        }

        /* access modifiers changed from: package-private */
        public void setAnchorId(String anchorId) {
            this.mAnchorId = anchorId;
        }

        /* access modifiers changed from: package-private */
        public void setAnchorSide(int anchorSide) {
            this.mAnchorSide = anchorSide;
        }

        /* access modifiers changed from: package-private */
        public void setRotationCenterId(String rotationCenterId) {
            this.mRotationCenterId = rotationCenterId;
        }

        /* access modifiers changed from: package-private */
        public void setLimitBoundsTo(String limitBoundsTo) {
            this.mLimitBoundsTo = limitBoundsTo;
        }

        /* access modifiers changed from: package-private */
        public void setDragDirection(int dragDirection) {
            this.mDragDirection = dragDirection;
            this.mDragVertical = this.mDragDirection < 2;
        }

        /* access modifiers changed from: package-private */
        public void setDragScale(float dragScale) {
            if (!Float.isNaN(dragScale)) {
                this.mDragScale = dragScale;
            }
        }

        /* access modifiers changed from: package-private */
        public void setDragThreshold(float dragThreshold) {
            if (!Float.isNaN(dragThreshold)) {
                this.mDragThreshold = dragThreshold;
            }
        }

        /* access modifiers changed from: package-private */
        public void setAutoCompleteMode(int mAutoCompleteMode2) {
            this.mAutoCompleteMode = mAutoCompleteMode2;
        }

        /* access modifiers changed from: package-private */
        public void setMaxVelocity(float maxVelocity) {
            if (!Float.isNaN(maxVelocity)) {
                this.mMaxVelocity = maxVelocity;
            }
        }

        /* access modifiers changed from: package-private */
        public void setMaxAcceleration(float maxAcceleration) {
            if (!Float.isNaN(maxAcceleration)) {
                this.mMaxAcceleration = maxAcceleration;
            }
        }

        /* access modifiers changed from: package-private */
        public void setOnTouchUp(int onTouchUp) {
            this.mOnTouchUp = onTouchUp;
        }

        /* access modifiers changed from: package-private */
        public void setSpringMass(float mSpringMass2) {
            if (!Float.isNaN(mSpringMass2)) {
                this.mSpringMass = mSpringMass2;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSpringStiffness(float mSpringStiffness2) {
            if (!Float.isNaN(mSpringStiffness2)) {
                this.mSpringStiffness = mSpringStiffness2;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSpringDamping(float mSpringDamping2) {
            if (!Float.isNaN(mSpringDamping2)) {
                this.mSpringDamping = mSpringDamping2;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSpringStopThreshold(float mSpringStopThreshold2) {
            if (!Float.isNaN(mSpringStopThreshold2)) {
                this.mSpringStopThreshold = mSpringStopThreshold2;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSpringBoundary(int mSpringBoundary2) {
            this.mSpringBoundary = mSpringBoundary2;
        }

        /* access modifiers changed from: package-private */
        public float getDestinationPosition(float currentPosition, float velocity, float duration) {
            float rest = (((Math.abs(velocity) * 0.5f) * velocity) / this.mMaxAcceleration) + currentPosition;
            switch (this.mOnTouchUp) {
                case 1:
                    return currentPosition >= 1.0f ? 1.0f : 0.0f;
                case 2:
                    return currentPosition <= 0.0f ? 0.0f : 1.0f;
                case 3:
                    return Float.NaN;
                case 4:
                    return Math.max(0.0f, Math.min(1.0f, rest));
                case 5:
                    if (rest > 0.2f && rest < 0.8f) {
                        return rest;
                    }
                    if (rest > 0.5f) {
                        return 1.0f;
                    }
                    return 0.0f;
                case 6:
                    return 1.0f;
                case 7:
                    return 0.0f;
                default:
                    if (((double) rest) > 0.5d) {
                        return 1.0f;
                    }
                    return 0.0f;
            }
        }

        /* access modifiers changed from: package-private */
        public void config(float position, float velocity, long start, float duration) {
            SpringStopEngine sl;
            StopLogicEngine sl2;
            StopLogicEngine.Decelerate sld;
            this.mStart = start;
            if (Math.abs(velocity) > this.mMaxVelocity) {
                velocity = this.mMaxVelocity * Math.signum(velocity);
            }
            this.mDestination = getDestinationPosition(position, velocity, duration);
            if (this.mDestination == position) {
                this.mEngine = null;
            } else if (this.mOnTouchUp == 4 && this.mAutoCompleteMode == 0) {
                if (this.mEngine instanceof StopLogicEngine.Decelerate) {
                    sld = (StopLogicEngine.Decelerate) this.mEngine;
                } else {
                    sld = new StopLogicEngine.Decelerate();
                    StopLogicEngine.Decelerate decelerate = sld;
                    this.mEngine = sld;
                }
                sld.config(position, this.mDestination, velocity);
            } else if (this.mAutoCompleteMode == 0) {
                if (this.mEngine instanceof StopLogicEngine) {
                    sl2 = (StopLogicEngine) this.mEngine;
                } else {
                    StopLogicEngine sl3 = new StopLogicEngine();
                    this.mEngine = sl3;
                    sl2 = sl3;
                }
                sl2.config(position, this.mDestination, velocity, duration, this.mMaxAcceleration, this.mMaxVelocity);
            } else {
                if (this.mEngine instanceof SpringStopEngine) {
                    sl = (SpringStopEngine) this.mEngine;
                } else {
                    SpringStopEngine sl4 = new SpringStopEngine();
                    this.mEngine = sl4;
                    sl = sl4;
                }
                sl.springConfig(position, this.mDestination, velocity, this.mSpringMass, this.mSpringStiffness, this.mSpringDamping, this.mSpringStopThreshold, this.mSpringBoundary);
            }
        }

        public float getTouchUpProgress(long currentTime) {
            float pos = this.mEngine.getInterpolation(((float) (currentTime - this.mStart)) * 1.0E-9f);
            if (this.mEngine.isStopped()) {
                return this.mDestination;
            }
            return pos;
        }

        public void printInfo() {
            if (this.mAutoCompleteMode == 0) {
                System.out.println("velocity = " + this.mEngine.getVelocity());
                System.out.println("mMaxAcceleration = " + this.mMaxAcceleration);
                System.out.println("mMaxVelocity = " + this.mMaxVelocity);
                return;
            }
            System.out.println("mSpringMass          = " + this.mSpringMass);
            System.out.println("mSpringStiffness     = " + this.mSpringStiffness);
            System.out.println("mSpringDamping       = " + this.mSpringDamping);
            System.out.println("mSpringStopThreshold = " + this.mSpringStopThreshold);
            System.out.println("mSpringBoundary      = " + this.mSpringBoundary);
        }

        public boolean isNotDone(float progress) {
            if (this.mOnTouchUp == 3 || this.mEngine == null || this.mEngine.isStopped()) {
                return false;
            }
            return true;
        }
    }

    public boolean isFirstDownAccepted(float posX, float posY) {
        if (this.mOnSwipe == null) {
            return false;
        }
        if (this.mOnSwipe.mLimitBoundsTo == null) {
            return true;
        }
        WidgetState targetWidget = this.mState.get(this.mOnSwipe.mLimitBoundsTo);
        if (targetWidget == null) {
            System.err.println("mLimitBoundsTo target is null");
            return false;
        }
        WidgetFrame frame = targetWidget.getFrame(2);
        if (posX < ((float) frame.left) || posX >= ((float) frame.right) || posY < ((float) frame.top) || posY >= ((float) frame.bottom)) {
            return false;
        }
        return true;
    }

    public float dragToProgress(float currentProgress, int baseW, int baseH, float dx, float dy) {
        float drag;
        float drag2;
        float f = currentProgress;
        float f2 = dy;
        WidgetState childWidget = null;
        Iterator<WidgetState> it = this.mState.values().iterator();
        if (it.hasNext()) {
            childWidget = it.next();
        }
        if (this.mOnSwipe == null) {
            int i = baseW;
            int i2 = baseH;
        } else if (childWidget == null) {
            int i3 = baseW;
            int i4 = baseH;
        } else if (this.mOnSwipe.mAnchorId == null) {
            float[] dir = this.mOnSwipe.getDirection();
            float motionDpDtX = (float) childWidget.mParentHeight;
            float motionDpDtY = (float) childWidget.mParentHeight;
            if (dir[0] != 0.0f) {
                drag2 = (Math.abs(dir[0]) * dx) / motionDpDtX;
            } else {
                drag2 = (Math.abs(dir[1]) * f2) / motionDpDtY;
            }
            return this.mOnSwipe.getScale() * drag2;
        } else {
            WidgetState base = this.mState.get(this.mOnSwipe.mAnchorId);
            float[] dir2 = this.mOnSwipe.getDirection();
            float[] side = this.mOnSwipe.getSide();
            float[] motionDpDt = new float[2];
            base.interpolate(baseW, baseH, f, this);
            base.mMotionControl.getDpDt(f, side[0], side[1], motionDpDt);
            if (dir2[0] != 0.0f) {
                drag = (Math.abs(dir2[0]) * dx) / motionDpDt[0];
            } else {
                drag = (Math.abs(dir2[1]) * f2) / motionDpDt[1];
            }
            return this.mOnSwipe.getScale() * drag;
        }
        if (childWidget != null) {
            return (-f2) / ((float) childWidget.mParentHeight);
        }
        return 1.0f;
    }

    public void setTouchUp(float currentProgress, long currentTime, float velocityX, float velocityY) {
        if (this.mOnSwipe != null) {
            float[] motionDpDt = new float[2];
            float[] dir = this.mOnSwipe.getDirection();
            float[] side = this.mOnSwipe.getSide();
            this.mState.get(this.mOnSwipe.mAnchorId).mMotionControl.getDpDt(currentProgress, side[0], side[1], motionDpDt);
            if (((double) Math.abs((dir[0] * motionDpDt[0]) + (dir[1] * motionDpDt[1]))) < 0.01d) {
                motionDpDt[0] = 0.01f;
                motionDpDt[1] = 0.01f;
            }
            this.mOnSwipe.config(currentProgress, (dir[0] != 0.0f ? velocityX / motionDpDt[0] : velocityY / motionDpDt[1]) * this.mOnSwipe.getScale(), currentTime, ((float) this.mDuration) * 0.001f);
        }
    }

    public float getTouchUpProgress(long currentTime) {
        if (this.mOnSwipe != null) {
            return this.mOnSwipe.getTouchUpProgress(currentTime);
        }
        return 0.0f;
    }

    public boolean isTouchNotDone(float currentProgress) {
        return this.mOnSwipe.isNotDone(currentProgress);
    }

    public static Interpolator getInterpolator(int interpolator, String interpolatorString) {
        switch (interpolator) {
            case -1:
                return new Transition$$ExternalSyntheticLambda0(interpolatorString);
            case 0:
                return new Transition$$ExternalSyntheticLambda1();
            case 1:
                return new Transition$$ExternalSyntheticLambda2();
            case 2:
                return new Transition$$ExternalSyntheticLambda3();
            case 3:
                return new Transition$$ExternalSyntheticLambda4();
            case 4:
                return new Transition$$ExternalSyntheticLambda7();
            case 5:
                return new Transition$$ExternalSyntheticLambda6();
            case 6:
                return new Transition$$ExternalSyntheticLambda5();
            default:
                return null;
        }
    }

    static /* synthetic */ float lambda$getInterpolator$0(String interpolatorString, float v) {
        return (float) Easing.getInterpolator(interpolatorString).get((double) v);
    }

    static /* synthetic */ float lambda$getInterpolator$1(float v) {
        return (float) Easing.getInterpolator("standard").get((double) v);
    }

    static /* synthetic */ float lambda$getInterpolator$2(float v) {
        return (float) Easing.getInterpolator("accelerate").get((double) v);
    }

    static /* synthetic */ float lambda$getInterpolator$3(float v) {
        return (float) Easing.getInterpolator("decelerate").get((double) v);
    }

    static /* synthetic */ float lambda$getInterpolator$4(float v) {
        return (float) Easing.getInterpolator("linear").get((double) v);
    }

    static /* synthetic */ float lambda$getInterpolator$5(float v) {
        return (float) Easing.getInterpolator("anticipate").get((double) v);
    }

    static /* synthetic */ float lambda$getInterpolator$6(float v) {
        return (float) Easing.getInterpolator("overshoot").get((double) v);
    }

    static /* synthetic */ float lambda$getInterpolator$7(float v) {
        return (float) Easing.getInterpolator("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").get((double) v);
    }

    public KeyPosition findPreviousPosition(String target, int frameNumber) {
        KeyPosition keyPosition;
        while (frameNumber >= 0) {
            HashMap<String, KeyPosition> map = this.mKeyPositions.get(Integer.valueOf(frameNumber));
            if (map != null && (keyPosition = map.get(target)) != null) {
                return keyPosition;
            }
            frameNumber--;
        }
        return null;
    }

    public KeyPosition findNextPosition(String target, int frameNumber) {
        KeyPosition keyPosition;
        while (frameNumber <= 100) {
            HashMap<String, KeyPosition> map = this.mKeyPositions.get(Integer.valueOf(frameNumber));
            if (map != null && (keyPosition = map.get(target)) != null) {
                return keyPosition;
            }
            frameNumber++;
        }
        return null;
    }

    public int getNumberKeyPositions(WidgetFrame frame) {
        int numKeyPositions = 0;
        for (int frameNumber = 0; frameNumber <= 100; frameNumber++) {
            HashMap<String, KeyPosition> map = this.mKeyPositions.get(Integer.valueOf(frameNumber));
            if (!(map == null || map.get(frame.widget.stringId) == null)) {
                numKeyPositions++;
            }
        }
        return numKeyPositions;
    }

    public Motion getMotion(String id) {
        return getWidgetState(id, (ConstraintWidget) null, 0).mMotionControl;
    }

    public void fillKeyPositions(WidgetFrame frame, float[] x, float[] y, float[] pos) {
        KeyPosition keyPosition;
        int numKeyPositions = 0;
        for (int frameNumber = 0; frameNumber <= 100; frameNumber++) {
            HashMap<String, KeyPosition> map = this.mKeyPositions.get(Integer.valueOf(frameNumber));
            if (!(map == null || (keyPosition = map.get(frame.widget.stringId)) == null)) {
                x[numKeyPositions] = keyPosition.mX;
                y[numKeyPositions] = keyPosition.mY;
                pos[numKeyPositions] = (float) keyPosition.mFrame;
                numKeyPositions++;
            }
        }
    }

    public boolean hasPositionKeyframes() {
        return this.mKeyPositions.size() > 0;
    }

    public void setTransitionProperties(TypedBundle bundle) {
        bundle.applyDelta(this.mBundle);
        bundle.applyDelta((TypedValues) this);
    }

    public boolean setValue(int id, int value) {
        return false;
    }

    public boolean setValue(int id, float value) {
        if (id != 706) {
            return false;
        }
        this.mStagger = value;
        return false;
    }

    public boolean setValue(int id, String value) {
        if (id != 705) {
            return false;
        }
        this.mDefaultInterpolatorString = value;
        this.mEasing = Easing.getInterpolator(value);
        return false;
    }

    public boolean setValue(int id, boolean value) {
        return false;
    }

    public int getId(String name) {
        return 0;
    }

    public boolean isEmpty() {
        return this.mState.isEmpty();
    }

    public void clear() {
        this.mState.clear();
    }

    /* access modifiers changed from: package-private */
    public void resetProperties() {
        this.mOnSwipe = null;
        this.mBundle.clear();
    }

    public boolean contains(String key) {
        return this.mState.containsKey(key);
    }

    public void addKeyPosition(String target, TypedBundle bundle) {
        getWidgetState(target, (ConstraintWidget) null, 0).setKeyPosition(bundle);
    }

    public void addKeyAttribute(String target, TypedBundle bundle) {
        getWidgetState(target, (ConstraintWidget) null, 0).setKeyAttribute(bundle);
    }

    public void addKeyAttribute(String target, TypedBundle bundle, CustomVariable[] custom) {
        getWidgetState(target, (ConstraintWidget) null, 0).setKeyAttribute(bundle, custom);
    }

    public void addKeyCycle(String target, TypedBundle bundle) {
        getWidgetState(target, (ConstraintWidget) null, 0).setKeyCycle(bundle);
    }

    public void addKeyPosition(String target, int frame, int type, float x, float y) {
        TypedBundle bundle = new TypedBundle();
        bundle.add((int) TypedValues.PositionType.TYPE_POSITION_TYPE, 2);
        bundle.add(100, frame);
        bundle.add((int) TypedValues.PositionType.TYPE_PERCENT_X, x);
        bundle.add((int) TypedValues.PositionType.TYPE_PERCENT_Y, y);
        getWidgetState(target, (ConstraintWidget) null, 0).setKeyPosition(bundle);
        KeyPosition keyPosition = new KeyPosition(target, frame, type, x, y);
        HashMap<String, KeyPosition> map = this.mKeyPositions.get(Integer.valueOf(frame));
        if (map == null) {
            map = new HashMap<>();
            this.mKeyPositions.put(Integer.valueOf(frame), map);
        }
        map.put(target, keyPosition);
    }

    public void addCustomFloat(int state, String widgetId, String property, float value) {
        getWidgetState(widgetId, (ConstraintWidget) null, state).getFrame(state).addCustomFloat(property, value);
    }

    public void addCustomColor(int state, String widgetId, String property, int color) {
        getWidgetState(widgetId, (ConstraintWidget) null, state).getFrame(state).addCustomColor(property, color);
    }

    private void calculateParentDimensions(float progress) {
        this.mParentInterpolatedWidth = (int) (((float) this.mParentStartWidth) + 0.5f + (((float) (this.mParentEndWidth - this.mParentStartWidth)) * progress));
        this.mParentInterpolateHeight = (int) (((float) this.mParentStartHeight) + 0.5f + (((float) (this.mParentEndHeight - this.mParentStartHeight)) * progress));
    }

    public int getInterpolatedWidth() {
        return this.mParentInterpolatedWidth;
    }

    public int getInterpolatedHeight() {
        return this.mParentInterpolateHeight;
    }

    public void updateFrom(ConstraintWidgetContainer container, int state) {
        boolean z = false;
        this.mWrap = container.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z2 = this.mWrap;
        if (container.mListDimensionBehaviors[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            z = true;
        }
        this.mWrap = z2 | z;
        if (state == 0) {
            int width = container.getWidth();
            this.mParentStartWidth = width;
            this.mParentInterpolatedWidth = width;
            int height = container.getHeight();
            this.mParentStartHeight = height;
            this.mParentInterpolateHeight = height;
        } else {
            this.mParentEndWidth = container.getWidth();
            this.mParentEndHeight = container.getHeight();
        }
        ArrayList<ConstraintWidget> children = container.getChildren();
        int count = children.size();
        WidgetState[] states = new WidgetState[count];
        for (int i = 0; i < count; i++) {
            ConstraintWidget child = children.get(i);
            WidgetState widgetState = getWidgetState(child.stringId, (ConstraintWidget) null, state);
            states[i] = widgetState;
            widgetState.update(child, state);
            String id = widgetState.getPathRelativeId();
            if (id != null) {
                widgetState.setPathRelative(getWidgetState(id, (ConstraintWidget) null, state));
            }
        }
        calcStagger();
    }

    public void interpolate(int parentWidth, int parentHeight, float progress) {
        if (this.mWrap) {
            calculateParentDimensions(progress);
        }
        if (this.mEasing != null) {
            progress = (float) this.mEasing.get((double) progress);
        }
        for (String key : this.mState.keySet()) {
            this.mState.get(key).interpolate(parentWidth, parentHeight, progress, this);
        }
    }

    public WidgetFrame getStart(String id) {
        WidgetState widgetState = this.mState.get(id);
        if (widgetState == null) {
            return null;
        }
        return widgetState.mStart;
    }

    public WidgetFrame getEnd(String id) {
        WidgetState widgetState = this.mState.get(id);
        if (widgetState == null) {
            return null;
        }
        return widgetState.mEnd;
    }

    public WidgetFrame getInterpolated(String id) {
        WidgetState widgetState = this.mState.get(id);
        if (widgetState == null) {
            return null;
        }
        return widgetState.mInterpolated;
    }

    public float[] getPath(String id) {
        int frames = 1000 / 16;
        float[] mPoints = new float[(frames * 2)];
        this.mState.get(id).mMotionControl.buildPath(mPoints, frames);
        return mPoints;
    }

    public int getKeyFrames(String id, float[] rectangles, int[] pathMode, int[] position) {
        return this.mState.get(id).mMotionControl.buildKeyFrames(rectangles, pathMode, position);
    }

    private WidgetState getWidgetState(String widgetId) {
        return this.mState.get(widgetId);
    }

    public WidgetState getWidgetState(String widgetId, ConstraintWidget child, int transitionState) {
        WidgetState widgetState = this.mState.get(widgetId);
        if (widgetState == null) {
            widgetState = new WidgetState();
            this.mBundle.applyDelta((TypedValues) widgetState.mMotionControl);
            widgetState.mMotionWidgetStart.updateMotion(widgetState.mMotionControl);
            this.mState.put(widgetId, widgetState);
            if (child != null) {
                widgetState.update(child, transitionState);
            }
        }
        return widgetState;
    }

    public WidgetFrame getStart(ConstraintWidget child) {
        return getWidgetState(child.stringId, (ConstraintWidget) null, 0).mStart;
    }

    public WidgetFrame getEnd(ConstraintWidget child) {
        return getWidgetState(child.stringId, (ConstraintWidget) null, 1).mEnd;
    }

    public WidgetFrame getInterpolated(ConstraintWidget child) {
        return getWidgetState(child.stringId, (ConstraintWidget) null, 2).mInterpolated;
    }

    public Interpolator getInterpolator() {
        return getInterpolator(this.mDefaultInterpolator, this.mDefaultInterpolatorString);
    }

    public int getAutoTransition() {
        return this.mAutoTransition;
    }

    public static class WidgetState {
        WidgetFrame mEnd = new WidgetFrame();
        WidgetFrame mInterpolated = new WidgetFrame();
        KeyCache mKeyCache = new KeyCache();
        Motion mMotionControl = new Motion(this.mMotionWidgetStart);
        MotionWidget mMotionWidgetEnd = new MotionWidget(this.mEnd);
        MotionWidget mMotionWidgetInterpolated = new MotionWidget(this.mInterpolated);
        MotionWidget mMotionWidgetStart = new MotionWidget(this.mStart);
        boolean mNeedSetup = true;
        int mParentHeight = -1;
        int mParentWidth = -1;
        WidgetFrame mStart = new WidgetFrame();

        public WidgetState() {
            this.mMotionControl.setStart(this.mMotionWidgetStart);
            this.mMotionControl.setEnd(this.mMotionWidgetEnd);
        }

        public void setKeyPosition(TypedBundle prop) {
            MotionKeyPosition keyPosition = new MotionKeyPosition();
            prop.applyDelta((TypedValues) keyPosition);
            this.mMotionControl.addKey(keyPosition);
        }

        public void setKeyAttribute(TypedBundle prop) {
            MotionKeyAttributes keyAttributes = new MotionKeyAttributes();
            prop.applyDelta((TypedValues) keyAttributes);
            this.mMotionControl.addKey(keyAttributes);
        }

        public void setKeyAttribute(TypedBundle prop, CustomVariable[] custom) {
            MotionKeyAttributes keyAttributes = new MotionKeyAttributes();
            prop.applyDelta((TypedValues) keyAttributes);
            if (custom != null) {
                for (int i = 0; i < custom.length; i++) {
                    keyAttributes.mCustom.put(custom[i].getName(), custom[i]);
                }
            }
            this.mMotionControl.addKey(keyAttributes);
        }

        public void setKeyCycle(TypedBundle prop) {
            MotionKeyCycle keyAttributes = new MotionKeyCycle();
            prop.applyDelta((TypedValues) keyAttributes);
            this.mMotionControl.addKey(keyAttributes);
        }

        public void update(ConstraintWidget child, int state) {
            if (state == 0) {
                this.mStart.update(child);
                this.mMotionWidgetStart.updateMotion(this.mMotionWidgetStart);
                this.mMotionControl.setStart(this.mMotionWidgetStart);
                this.mNeedSetup = true;
            } else if (state == 1) {
                this.mEnd.update(child);
                this.mMotionControl.setEnd(this.mMotionWidgetEnd);
                this.mNeedSetup = true;
            }
            this.mParentWidth = -1;
        }

        /* access modifiers changed from: package-private */
        public String getPathRelativeId() {
            return this.mMotionControl.getAnimateRelativeTo();
        }

        public WidgetFrame getFrame(int type) {
            if (type == 0) {
                return this.mStart;
            }
            if (type == 1) {
                return this.mEnd;
            }
            return this.mInterpolated;
        }

        public void interpolate(int parentWidth, int parentHeight, float progress, Transition transition) {
            this.mParentHeight = parentHeight;
            this.mParentWidth = parentWidth;
            if (this.mNeedSetup) {
                this.mMotionControl.setup(parentWidth, parentHeight, 1.0f, System.nanoTime());
                this.mNeedSetup = false;
            }
            WidgetFrame.interpolate(parentWidth, parentHeight, this.mInterpolated, this.mStart, this.mEnd, transition, progress);
            this.mInterpolated.interpolatedPos = progress;
            this.mMotionControl.interpolate(this.mMotionWidgetInterpolated, progress, System.nanoTime(), this.mKeyCache);
        }

        public void setPathRelative(WidgetState widgetState) {
            this.mMotionControl.setupRelative(widgetState.mMotionControl);
        }
    }

    static class KeyPosition {
        int mFrame;
        String mTarget;
        int mType;
        float mX;
        float mY;

        KeyPosition(String target, int frame, int type, float x, float y) {
            this.mTarget = target;
            this.mFrame = frame;
            this.mType = type;
            this.mX = x;
            this.mY = y;
        }
    }

    public void calcStagger() {
        if (this.mStagger != 0.0f) {
            boolean flip = ((double) this.mStagger) < 0.0d;
            float stagger = Math.abs(this.mStagger);
            float min = Float.MAX_VALUE;
            float max = -3.4028235E38f;
            boolean useMotionStagger = false;
            Iterator<String> it = this.mState.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!Float.isNaN(this.mState.get(it.next()).mMotionControl.getMotionStagger())) {
                    useMotionStagger = true;
                    break;
                }
            }
            if (useMotionStagger) {
                for (String widgetId : this.mState.keySet()) {
                    float widgetStagger = this.mState.get(widgetId).mMotionControl.getMotionStagger();
                    if (!Float.isNaN(widgetStagger)) {
                        min = Math.min(min, widgetStagger);
                        max = Math.max(max, widgetStagger);
                    }
                }
                for (String widgetId2 : this.mState.keySet()) {
                    Motion f = this.mState.get(widgetId2).mMotionControl;
                    float widgetStagger2 = f.getMotionStagger();
                    if (!Float.isNaN(widgetStagger2)) {
                        float scale = 1.0f / (1.0f - stagger);
                        float offset = stagger - (((widgetStagger2 - min) * stagger) / (max - min));
                        if (flip) {
                            offset = stagger - (((max - widgetStagger2) / (max - min)) * stagger);
                        }
                        f.setStaggerScale(scale);
                        f.setStaggerOffset(offset);
                    }
                }
                return;
            }
            for (String widgetId3 : this.mState.keySet()) {
                Motion f2 = this.mState.get(widgetId3).mMotionControl;
                float widgetStagger3 = f2.getFinalX() + f2.getFinalY();
                min = Math.min(min, widgetStagger3);
                max = Math.max(max, widgetStagger3);
            }
            for (String widgetId4 : this.mState.keySet()) {
                Motion f3 = this.mState.get(widgetId4).mMotionControl;
                float widgetStagger4 = f3.getFinalX() + f3.getFinalY();
                float offset2 = stagger - (((widgetStagger4 - min) * stagger) / (max - min));
                if (flip) {
                    offset2 = stagger - (((max - widgetStagger4) / (max - min)) * stagger);
                }
                f3.setStaggerScale(1.0f / (1.0f - stagger));
                f3.setStaggerOffset(offset2);
            }
        }
    }
}
