package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Set;

public class MotionWidget implements TypedValues {
    public static final int FILL_PARENT = -1;
    public static final int GONE_UNSET = Integer.MIN_VALUE;
    private static final int INTERNAL_MATCH_CONSTRAINT = -3;
    private static final int INTERNAL_MATCH_PARENT = -1;
    private static final int INTERNAL_WRAP_CONTENT = -2;
    private static final int INTERNAL_WRAP_CONTENT_CONSTRAINED = -4;
    public static final int INVISIBLE = 0;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int MATCH_PARENT = -1;
    public static final int PARENT_ID = 0;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    public static final int UNSET = -1;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 4;
    public static final int WRAP_CONTENT = -2;
    Motion mMotion = new Motion();
    private float mProgress;
    PropertySet mPropertySet = new PropertySet();
    float mTransitionPathRotate;
    WidgetFrame mWidgetFrame = new WidgetFrame();

    public static class Motion {
        private static final int INTERPOLATOR_REFERENCE_ID = -2;
        private static final int INTERPOLATOR_UNDEFINED = -3;
        private static final int SPLINE_STRING = -1;
        public int mAnimateCircleAngleTo = 0;
        public String mAnimateRelativeTo = null;
        public int mDrawPath = 0;
        public float mMotionStagger = Float.NaN;
        public int mPathMotionArc = -1;
        public float mPathRotate = Float.NaN;
        public int mPolarRelativeTo = -1;
        public int mQuantizeInterpolatorID = -1;
        public String mQuantizeInterpolatorString = null;
        public int mQuantizeInterpolatorType = -3;
        public float mQuantizeMotionPhase = Float.NaN;
        public int mQuantizeMotionSteps = -1;
        public String mTransitionEasing = null;
    }

    public static class PropertySet {
        public float alpha = 1.0f;
        public float mProgress = Float.NaN;
        public int mVisibilityMode = 0;
        public int visibility = 4;
    }

    public MotionWidget() {
    }

    public MotionWidget getParent() {
        return null;
    }

    public MotionWidget findViewById(int mTransformPivotTarget) {
        return null;
    }

    public void setVisibility(int visibility) {
        this.mPropertySet.visibility = visibility;
    }

    public String getName() {
        return this.mWidgetFrame.getId();
    }

    public void layout(int l, int t, int r, int b) {
        setBounds(l, t, r, b);
    }

    public String toString() {
        return this.mWidgetFrame.left + ", " + this.mWidgetFrame.top + ", " + this.mWidgetFrame.right + ", " + this.mWidgetFrame.bottom;
    }

    public void setBounds(int left, int top, int right, int bottom) {
        if (this.mWidgetFrame == null) {
            ConstraintWidget constraintWidget = null;
            this.mWidgetFrame = new WidgetFrame((ConstraintWidget) null);
        }
        this.mWidgetFrame.top = top;
        this.mWidgetFrame.left = left;
        this.mWidgetFrame.right = right;
        this.mWidgetFrame.bottom = bottom;
    }

    public MotionWidget(WidgetFrame f) {
        this.mWidgetFrame = f;
    }

    public void updateMotion(TypedValues toUpdate) {
        if (this.mWidgetFrame.getMotionProperties() != null) {
            this.mWidgetFrame.getMotionProperties().applyDelta(toUpdate);
        }
    }

    public boolean setValue(int id, int value) {
        if (setValueAttributes(id, (float) value)) {
            return true;
        }
        return setValueMotion(id, value);
    }

    public boolean setValue(int id, float value) {
        if (setValueAttributes(id, value)) {
            return true;
        }
        return setValueMotion(id, value);
    }

    public boolean setValue(int id, String value) {
        if (id != 605) {
            return setValueMotion(id, value);
        }
        this.mMotion.mAnimateRelativeTo = value;
        return true;
    }

    public boolean setValue(int id, boolean value) {
        return false;
    }

    public boolean setValueMotion(int id, int value) {
        switch (id) {
            case TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO:
                this.mMotion.mAnimateCircleAngleTo = value;
                return true;
            case TypedValues.MotionType.TYPE_PATHMOTION_ARC:
                this.mMotion.mPathMotionArc = value;
                return true;
            case TypedValues.MotionType.TYPE_DRAW_PATH:
                this.mMotion.mDrawPath = value;
                return true;
            case TypedValues.MotionType.TYPE_POLAR_RELATIVETO:
                this.mMotion.mPolarRelativeTo = value;
                return true;
            case TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS:
                this.mMotion.mQuantizeMotionSteps = value;
                return true;
            case TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE:
                this.mMotion.mQuantizeInterpolatorType = value;
                return true;
            case TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID:
                this.mMotion.mQuantizeInterpolatorID = value;
                return true;
            default:
                return false;
        }
    }

    public boolean setValueMotion(int id, String value) {
        switch (id) {
            case TypedValues.MotionType.TYPE_EASING:
                this.mMotion.mTransitionEasing = value;
                return true;
            case TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR:
                this.mMotion.mQuantizeInterpolatorString = value;
                return true;
            default:
                return false;
        }
    }

    public boolean setValueMotion(int id, float value) {
        switch (id) {
            case 600:
                this.mMotion.mMotionStagger = value;
                return true;
            case 601:
                this.mMotion.mPathRotate = value;
                return true;
            case TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE:
                this.mMotion.mQuantizeMotionPhase = value;
                return true;
            default:
                return false;
        }
    }

    public boolean setValueAttributes(int id, float value) {
        switch (id) {
            case 303:
                this.mWidgetFrame.alpha = value;
                return true;
            case 304:
                this.mWidgetFrame.translationX = value;
                return true;
            case 305:
                this.mWidgetFrame.translationY = value;
                return true;
            case 306:
                this.mWidgetFrame.translationZ = value;
                return true;
            case 308:
                this.mWidgetFrame.rotationX = value;
                return true;
            case 309:
                this.mWidgetFrame.rotationY = value;
                return true;
            case 310:
                this.mWidgetFrame.rotationZ = value;
                return true;
            case 311:
                this.mWidgetFrame.scaleX = value;
                return true;
            case 312:
                this.mWidgetFrame.scaleY = value;
                return true;
            case 313:
                this.mWidgetFrame.pivotX = value;
                return true;
            case 314:
                this.mWidgetFrame.pivotY = value;
                return true;
            case 315:
                this.mProgress = value;
                return true;
            case TypedValues.AttributesType.TYPE_PATH_ROTATE:
                this.mTransitionPathRotate = value;
                return true;
            default:
                return false;
        }
    }

    public float getValueAttributes(int id) {
        switch (id) {
            case 303:
                return this.mWidgetFrame.alpha;
            case 304:
                return this.mWidgetFrame.translationX;
            case 305:
                return this.mWidgetFrame.translationY;
            case 306:
                return this.mWidgetFrame.translationZ;
            case 308:
                return this.mWidgetFrame.rotationX;
            case 309:
                return this.mWidgetFrame.rotationY;
            case 310:
                return this.mWidgetFrame.rotationZ;
            case 311:
                return this.mWidgetFrame.scaleX;
            case 312:
                return this.mWidgetFrame.scaleY;
            case 313:
                return this.mWidgetFrame.pivotX;
            case 314:
                return this.mWidgetFrame.pivotY;
            case 315:
                return this.mProgress;
            case TypedValues.AttributesType.TYPE_PATH_ROTATE:
                return this.mTransitionPathRotate;
            default:
                return Float.NaN;
        }
    }

    public int getId(String name) {
        int ret = TypedValues.AttributesType.getId(name);
        if (ret != -1) {
            return ret;
        }
        return TypedValues.MotionType.getId(name);
    }

    public int getTop() {
        return this.mWidgetFrame.top;
    }

    public int getLeft() {
        return this.mWidgetFrame.left;
    }

    public int getBottom() {
        return this.mWidgetFrame.bottom;
    }

    public int getRight() {
        return this.mWidgetFrame.right;
    }

    public void setPivotX(float px) {
        this.mWidgetFrame.pivotX = px;
    }

    public void setPivotY(float py) {
        this.mWidgetFrame.pivotY = py;
    }

    public float getRotationX() {
        return this.mWidgetFrame.rotationX;
    }

    public void setRotationX(float rotationX) {
        this.mWidgetFrame.rotationX = rotationX;
    }

    public float getRotationY() {
        return this.mWidgetFrame.rotationY;
    }

    public void setRotationY(float rotationY) {
        this.mWidgetFrame.rotationY = rotationY;
    }

    public float getRotationZ() {
        return this.mWidgetFrame.rotationZ;
    }

    public void setRotationZ(float rotationZ) {
        this.mWidgetFrame.rotationZ = rotationZ;
    }

    public float getTranslationX() {
        return this.mWidgetFrame.translationX;
    }

    public void setTranslationX(float translationX) {
        this.mWidgetFrame.translationX = translationX;
    }

    public float getTranslationY() {
        return this.mWidgetFrame.translationY;
    }

    public void setTranslationY(float translationY) {
        this.mWidgetFrame.translationY = translationY;
    }

    public void setTranslationZ(float tz) {
        this.mWidgetFrame.translationZ = tz;
    }

    public float getTranslationZ() {
        return this.mWidgetFrame.translationZ;
    }

    public float getScaleX() {
        return this.mWidgetFrame.scaleX;
    }

    public void setScaleX(float scaleX) {
        this.mWidgetFrame.scaleX = scaleX;
    }

    public float getScaleY() {
        return this.mWidgetFrame.scaleY;
    }

    public void setScaleY(float scaleY) {
        this.mWidgetFrame.scaleY = scaleY;
    }

    public int getVisibility() {
        return this.mPropertySet.visibility;
    }

    public float getPivotX() {
        return this.mWidgetFrame.pivotX;
    }

    public float getPivotY() {
        return this.mWidgetFrame.pivotY;
    }

    public float getAlpha() {
        return this.mWidgetFrame.alpha;
    }

    public int getX() {
        return this.mWidgetFrame.left;
    }

    public int getY() {
        return this.mWidgetFrame.top;
    }

    public int getWidth() {
        return this.mWidgetFrame.right - this.mWidgetFrame.left;
    }

    public int getHeight() {
        return this.mWidgetFrame.bottom - this.mWidgetFrame.top;
    }

    public WidgetFrame getWidgetFrame() {
        return this.mWidgetFrame;
    }

    public Set<String> getCustomAttributeNames() {
        return this.mWidgetFrame.getCustomAttributeNames();
    }

    public void setCustomAttribute(String name, int type, float value) {
        this.mWidgetFrame.setCustomAttribute(name, type, value);
    }

    public void setCustomAttribute(String name, int type, int value) {
        this.mWidgetFrame.setCustomAttribute(name, type, value);
    }

    public void setCustomAttribute(String name, int type, boolean value) {
        this.mWidgetFrame.setCustomAttribute(name, type, value);
    }

    public void setCustomAttribute(String name, int type, String value) {
        this.mWidgetFrame.setCustomAttribute(name, type, value);
    }

    public CustomVariable getCustomAttribute(String name) {
        return this.mWidgetFrame.getCustomAttribute(name);
    }

    public void setInterpolatedValue(CustomAttribute attribute, float[] mCache) {
        this.mWidgetFrame.setCustomAttribute(attribute.mName, (int) TypedValues.Custom.TYPE_FLOAT, mCache[0]);
    }
}
