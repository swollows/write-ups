package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import androidx.core.os.EnvironmentCompat;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintSet {
    private static final int ALPHA = 43;
    private static final int ANIMATE_CIRCLE_ANGLE_TO = 82;
    private static final int ANIMATE_RELATIVE_TO = 64;
    private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
    private static final int BARRIER_DIRECTION = 72;
    private static final int BARRIER_MARGIN = 73;
    private static final int BARRIER_TYPE = 1;
    public static final int BASELINE = 5;
    private static final int BASELINE_MARGIN = 93;
    private static final int BASELINE_TO_BASELINE = 1;
    private static final int BASELINE_TO_BOTTOM = 92;
    private static final int BASELINE_TO_TOP = 91;
    public static final int BOTTOM = 4;
    private static final int BOTTOM_MARGIN = 2;
    private static final int BOTTOM_TO_BOTTOM = 3;
    private static final int BOTTOM_TO_TOP = 4;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    private static final int CHAIN_USE_RTL = 71;
    private static final int CIRCLE = 61;
    private static final int CIRCLE_ANGLE = 63;
    private static final int CIRCLE_RADIUS = 62;
    public static final int CIRCLE_REFERENCE = 8;
    private static final int CONSTRAINED_HEIGHT = 81;
    private static final int CONSTRAINED_WIDTH = 80;
    private static final int CONSTRAINT_REFERENCED_IDS = 74;
    private static final int CONSTRAINT_TAG = 77;
    private static final boolean DEBUG = false;
    private static final int DIMENSION_RATIO = 5;
    private static final int DRAW_PATH = 66;
    private static final int EDITOR_ABSOLUTE_X = 6;
    private static final int EDITOR_ABSOLUTE_Y = 7;
    private static final int ELEVATION = 44;
    public static final int END = 7;
    private static final int END_MARGIN = 8;
    private static final int END_TO_END = 9;
    private static final int END_TO_START = 10;
    private static final String ERROR_MESSAGE = "XML parser error must be within a Constraint ";
    public static final int GONE = 8;
    private static final int GONE_BASELINE_MARGIN = 94;
    private static final int GONE_BOTTOM_MARGIN = 11;
    private static final int GONE_END_MARGIN = 12;
    private static final int GONE_LEFT_MARGIN = 13;
    private static final int GONE_RIGHT_MARGIN = 14;
    private static final int GONE_START_MARGIN = 15;
    private static final int GONE_TOP_MARGIN = 16;
    private static final int GUIDELINE_USE_RTL = 99;
    private static final int GUIDE_BEGIN = 17;
    private static final int GUIDE_END = 18;
    private static final int GUIDE_PERCENT = 19;
    private static final int HEIGHT_DEFAULT = 55;
    private static final int HEIGHT_MAX = 57;
    private static final int HEIGHT_MIN = 59;
    private static final int HEIGHT_PERCENT = 70;
    public static final int HORIZONTAL = 0;
    private static final int HORIZONTAL_BIAS = 20;
    public static final int HORIZONTAL_GUIDELINE = 0;
    private static final int HORIZONTAL_STYLE = 41;
    private static final int HORIZONTAL_WEIGHT = 39;
    private static final int INTERNAL_MATCH_CONSTRAINT = -3;
    private static final int INTERNAL_MATCH_PARENT = -1;
    private static final int INTERNAL_WRAP_CONTENT = -2;
    private static final int INTERNAL_WRAP_CONTENT_CONSTRAINED = -4;
    public static final int INVISIBLE = 4;
    private static final String KEY_PERCENT_PARENT = "parent";
    private static final String KEY_RATIO = "ratio";
    private static final String KEY_WEIGHT = "weight";
    private static final int LAYOUT_CONSTRAINT_HEIGHT = 96;
    private static final int LAYOUT_CONSTRAINT_WIDTH = 95;
    private static final int LAYOUT_HEIGHT = 21;
    private static final int LAYOUT_VISIBILITY = 22;
    private static final int LAYOUT_WIDTH = 23;
    private static final int LAYOUT_WRAP_BEHAVIOR = 97;
    public static final int LEFT = 1;
    private static final int LEFT_MARGIN = 24;
    private static final int LEFT_TO_LEFT = 25;
    private static final int LEFT_TO_RIGHT = 26;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    private static final int MOTION_STAGGER = 79;
    private static final int MOTION_TARGET = 98;
    private static final int ORIENTATION = 27;
    public static final int PARENT_ID = 0;
    private static final int PATH_MOTION_ARC = 76;
    private static final int PROGRESS = 68;
    private static final int QUANTIZE_MOTION_INTERPOLATOR = 86;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_ID = 89;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_STR = 90;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_TYPE = 88;
    private static final int QUANTIZE_MOTION_PHASE = 85;
    private static final int QUANTIZE_MOTION_STEPS = 84;
    public static final int RIGHT = 2;
    private static final int RIGHT_MARGIN = 28;
    private static final int RIGHT_TO_LEFT = 29;
    private static final int RIGHT_TO_RIGHT = 30;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    private static final int ROTATION = 60;
    private static final int ROTATION_X = 45;
    private static final int ROTATION_Y = 46;
    private static final int SCALE_X = 47;
    private static final int SCALE_Y = 48;
    public static final int START = 6;
    private static final int START_MARGIN = 31;
    private static final int START_TO_END = 32;
    private static final int START_TO_START = 33;
    private static final String TAG = "ConstraintSet";
    public static final int TOP = 3;
    private static final int TOP_MARGIN = 34;
    private static final int TOP_TO_BOTTOM = 35;
    private static final int TOP_TO_TOP = 36;
    private static final int TRANSFORM_PIVOT_TARGET = 83;
    private static final int TRANSFORM_PIVOT_X = 49;
    private static final int TRANSFORM_PIVOT_Y = 50;
    private static final int TRANSITION_EASING = 65;
    private static final int TRANSITION_PATH_ROTATE = 67;
    private static final int TRANSLATION_X = 51;
    private static final int TRANSLATION_Y = 52;
    private static final int TRANSLATION_Z = 53;
    public static final int UNSET = -1;
    private static final int UNUSED = 87;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_BIAS = 37;
    public static final int VERTICAL_GUIDELINE = 1;
    private static final int VERTICAL_STYLE = 42;
    private static final int VERTICAL_WEIGHT = 40;
    private static final int VIEW_ID = 38;
    /* access modifiers changed from: private */
    public static final int[] VISIBILITY_FLAGS = {0, 4, 8};
    private static final int VISIBILITY_MODE = 78;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 0;
    private static final int WIDTH_DEFAULT = 54;
    private static final int WIDTH_MAX = 56;
    private static final int WIDTH_MIN = 58;
    private static final int WIDTH_PERCENT = 69;
    public static final int WRAP_CONTENT = -2;
    private static SparseIntArray sMapToConstant = new SparseIntArray();
    private static SparseIntArray sOverrideMapToConstant = new SparseIntArray();
    public String derivedState = "";
    /* access modifiers changed from: private */
    public HashMap<Integer, Constraint> mConstraints = new HashMap<>();
    private boolean mForceId = true;
    public String mIdString;
    private String[] mMatchLabels = new String[0];
    public int mRotate = 0;
    private HashMap<String, ConstraintAttribute> mSavedAttributes = new HashMap<>();
    private boolean mValidate;

    static {
        sMapToConstant.append(R.styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintRight_toRightOf, 30);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintTop_toTopOf, 36);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_toTopOf, BASELINE_TO_TOP);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_toBottomOf, BASELINE_TO_BOTTOM);
        sMapToConstant.append(R.styleable.Constraint_layout_editor_absoluteX, 6);
        sMapToConstant.append(R.styleable.Constraint_layout_editor_absoluteY, 7);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintGuide_begin, 17);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintGuide_end, 18);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintGuide_percent, 19);
        sMapToConstant.append(R.styleable.Constraint_guidelineUseRtl, GUIDELINE_USE_RTL);
        sMapToConstant.append(R.styleable.Constraint_android_orientation, 27);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintStart_toEndOf, 32);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintStart_toStartOf, 33);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        sMapToConstant.append(R.styleable.Constraint_layout_goneMarginLeft, 13);
        sMapToConstant.append(R.styleable.Constraint_layout_goneMarginTop, 16);
        sMapToConstant.append(R.styleable.Constraint_layout_goneMarginRight, 14);
        sMapToConstant.append(R.styleable.Constraint_layout_goneMarginBottom, 11);
        sMapToConstant.append(R.styleable.Constraint_layout_goneMarginStart, 15);
        sMapToConstant.append(R.styleable.Constraint_layout_goneMarginEnd, 12);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintVertical_weight, 40);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHorizontal_weight, 39);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHorizontal_bias, 20);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintVertical_bias, 37);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintDimensionRatio, 5);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintLeft_creator, UNUSED);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintTop_creator, UNUSED);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintRight_creator, UNUSED);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBottom_creator, UNUSED);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_creator, UNUSED);
        sMapToConstant.append(R.styleable.Constraint_android_layout_marginLeft, 24);
        sMapToConstant.append(R.styleable.Constraint_android_layout_marginRight, 28);
        sMapToConstant.append(R.styleable.Constraint_android_layout_marginStart, 31);
        sMapToConstant.append(R.styleable.Constraint_android_layout_marginEnd, 8);
        sMapToConstant.append(R.styleable.Constraint_android_layout_marginTop, 34);
        sMapToConstant.append(R.styleable.Constraint_android_layout_marginBottom, 2);
        sMapToConstant.append(R.styleable.Constraint_android_layout_width, 23);
        sMapToConstant.append(R.styleable.Constraint_android_layout_height, 21);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintWidth, LAYOUT_CONSTRAINT_WIDTH);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHeight, LAYOUT_CONSTRAINT_HEIGHT);
        sMapToConstant.append(R.styleable.Constraint_android_visibility, 22);
        sMapToConstant.append(R.styleable.Constraint_android_alpha, 43);
        sMapToConstant.append(R.styleable.Constraint_android_elevation, 44);
        sMapToConstant.append(R.styleable.Constraint_android_rotationX, 45);
        sMapToConstant.append(R.styleable.Constraint_android_rotationY, 46);
        sMapToConstant.append(R.styleable.Constraint_android_rotation, 60);
        sMapToConstant.append(R.styleable.Constraint_android_scaleX, 47);
        sMapToConstant.append(R.styleable.Constraint_android_scaleY, 48);
        sMapToConstant.append(R.styleable.Constraint_android_transformPivotX, 49);
        sMapToConstant.append(R.styleable.Constraint_android_transformPivotY, 50);
        sMapToConstant.append(R.styleable.Constraint_android_translationX, 51);
        sMapToConstant.append(R.styleable.Constraint_android_translationY, 52);
        sMapToConstant.append(R.styleable.Constraint_android_translationZ, 53);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintWidth_default, 54);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHeight_default, 55);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintWidth_max, WIDTH_MAX);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHeight_max, HEIGHT_MAX);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintWidth_min, WIDTH_MIN);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHeight_min, HEIGHT_MIN);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintCircle, 61);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintCircleRadius, CIRCLE_RADIUS);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintCircleAngle, 63);
        sMapToConstant.append(R.styleable.Constraint_animateRelativeTo, 64);
        sMapToConstant.append(R.styleable.Constraint_transitionEasing, 65);
        sMapToConstant.append(R.styleable.Constraint_drawPath, 66);
        sMapToConstant.append(R.styleable.Constraint_transitionPathRotate, 67);
        sMapToConstant.append(R.styleable.Constraint_motionStagger, MOTION_STAGGER);
        sMapToConstant.append(R.styleable.Constraint_android_id, 38);
        sMapToConstant.append(R.styleable.Constraint_motionProgress, PROGRESS);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintWidth_percent, WIDTH_PERCENT);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHeight_percent, HEIGHT_PERCENT);
        sMapToConstant.append(R.styleable.Constraint_layout_wrapBehaviorInParent, LAYOUT_WRAP_BEHAVIOR);
        sMapToConstant.append(R.styleable.Constraint_chainUseRtl, CHAIN_USE_RTL);
        sMapToConstant.append(R.styleable.Constraint_barrierDirection, BARRIER_DIRECTION);
        sMapToConstant.append(R.styleable.Constraint_barrierMargin, BARRIER_MARGIN);
        sMapToConstant.append(R.styleable.Constraint_constraint_referenced_ids, CONSTRAINT_REFERENCED_IDS);
        sMapToConstant.append(R.styleable.Constraint_barrierAllowsGoneWidgets, BARRIER_ALLOWS_GONE_WIDGETS);
        sMapToConstant.append(R.styleable.Constraint_pathMotionArc, 76);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintTag, CONSTRAINT_TAG);
        sMapToConstant.append(R.styleable.Constraint_visibilityMode, VISIBILITY_MODE);
        sMapToConstant.append(R.styleable.Constraint_layout_constrainedWidth, CONSTRAINED_WIDTH);
        sMapToConstant.append(R.styleable.Constraint_layout_constrainedHeight, CONSTRAINED_HEIGHT);
        sMapToConstant.append(R.styleable.Constraint_polarRelativeTo, ANIMATE_CIRCLE_ANGLE_TO);
        sMapToConstant.append(R.styleable.Constraint_transformPivotTarget, TRANSFORM_PIVOT_TARGET);
        sMapToConstant.append(R.styleable.Constraint_quantizeMotionSteps, QUANTIZE_MOTION_STEPS);
        sMapToConstant.append(R.styleable.Constraint_quantizeMotionPhase, QUANTIZE_MOTION_PHASE);
        sMapToConstant.append(R.styleable.Constraint_quantizeMotionInterpolator, QUANTIZE_MOTION_INTERPOLATOR);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_editor_absoluteY, 6);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_editor_absoluteY, 7);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_orientation, 27);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginLeft, 13);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginTop, 16);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginRight, 14);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginBottom, 11);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginStart, 15);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginEnd, 12);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintVertical_weight, 40);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintVertical_bias, 37);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintDimensionRatio, 5);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintLeft_creator, UNUSED);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintTop_creator, UNUSED);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintRight_creator, UNUSED);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintBottom_creator, UNUSED);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintBaseline_creator, UNUSED);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginLeft, 24);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginRight, 28);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginStart, 31);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginEnd, 8);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginTop, 34);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginBottom, 2);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_width, 23);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_height, 21);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth, LAYOUT_CONSTRAINT_WIDTH);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight, LAYOUT_CONSTRAINT_HEIGHT);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_visibility, 22);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_alpha, 43);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_elevation, 44);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_rotationX, 45);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_rotationY, 46);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_rotation, 60);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_scaleX, 47);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_scaleY, 48);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_transformPivotX, 49);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_transformPivotY, 50);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_translationX, 51);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_translationY, 52);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_translationZ, 53);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_default, 54);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_default, 55);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_max, WIDTH_MAX);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_max, HEIGHT_MAX);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_min, WIDTH_MIN);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_min, HEIGHT_MIN);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintCircleRadius, CIRCLE_RADIUS);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintCircleAngle, 63);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_animateRelativeTo, 64);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_transitionEasing, 65);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_drawPath, 66);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_transitionPathRotate, 67);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_motionStagger, MOTION_STAGGER);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_id, 38);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_motionTarget, MOTION_TARGET);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_motionProgress, PROGRESS);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_percent, WIDTH_PERCENT);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_percent, HEIGHT_PERCENT);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_chainUseRtl, CHAIN_USE_RTL);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_barrierDirection, BARRIER_DIRECTION);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_barrierMargin, BARRIER_MARGIN);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_constraint_referenced_ids, CONSTRAINT_REFERENCED_IDS);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_barrierAllowsGoneWidgets, BARRIER_ALLOWS_GONE_WIDGETS);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_pathMotionArc, 76);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintTag, CONSTRAINT_TAG);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_visibilityMode, VISIBILITY_MODE);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constrainedWidth, CONSTRAINED_WIDTH);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constrainedHeight, CONSTRAINED_HEIGHT);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_polarRelativeTo, ANIMATE_CIRCLE_ANGLE_TO);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_transformPivotTarget, TRANSFORM_PIVOT_TARGET);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_quantizeMotionSteps, QUANTIZE_MOTION_STEPS);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_quantizeMotionPhase, QUANTIZE_MOTION_PHASE);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_quantizeMotionInterpolator, QUANTIZE_MOTION_INTERPOLATOR);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_wrapBehaviorInParent, LAYOUT_WRAP_BEHAVIOR);
    }

    public HashMap<String, ConstraintAttribute> getCustomAttributeSet() {
        return this.mSavedAttributes;
    }

    public Constraint getParameters(int mId) {
        return get(mId);
    }

    public void readFallback(ConstraintSet set) {
        for (Integer key : set.mConstraints.keySet()) {
            int id = key.intValue();
            Constraint parent = set.mConstraints.get(key);
            if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                this.mConstraints.put(Integer.valueOf(id), new Constraint());
            }
            Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
            if (constraint != null) {
                if (!constraint.layout.mApply) {
                    constraint.layout.copyFrom(parent.layout);
                }
                if (!constraint.propertySet.mApply) {
                    constraint.propertySet.copyFrom(parent.propertySet);
                }
                if (!constraint.transform.mApply) {
                    constraint.transform.copyFrom(parent.transform);
                }
                if (!constraint.motion.mApply) {
                    constraint.motion.copyFrom(parent.motion);
                }
                for (String s : parent.mCustomConstraints.keySet()) {
                    if (!constraint.mCustomConstraints.containsKey(s)) {
                        constraint.mCustomConstraints.put(s, parent.mCustomConstraints.get(s));
                    }
                }
            }
        }
    }

    public void readFallback(ConstraintLayout constraintLayout) {
        int count = constraintLayout.getChildCount();
        int i = 0;
        while (i < count) {
            View view = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams param = (ConstraintLayout.LayoutParams) view.getLayoutParams();
            int id = view.getId();
            if (!this.mForceId || id != -1) {
                if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                    this.mConstraints.put(Integer.valueOf(id), new Constraint());
                }
                Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
                if (constraint != null) {
                    if (!constraint.layout.mApply) {
                        constraint.fillFrom(id, param);
                        if (view instanceof ConstraintHelper) {
                            constraint.layout.mReferenceIds = ((ConstraintHelper) view).getReferencedIds();
                            if (view instanceof Barrier) {
                                Barrier barrier = (Barrier) view;
                                constraint.layout.mBarrierAllowsGoneWidgets = barrier.getAllowsGoneWidget();
                                constraint.layout.mBarrierDirection = barrier.getType();
                                constraint.layout.mBarrierMargin = barrier.getMargin();
                            }
                        }
                        constraint.layout.mApply = true;
                    }
                    if (!constraint.propertySet.mApply) {
                        constraint.propertySet.visibility = view.getVisibility();
                        constraint.propertySet.alpha = view.getAlpha();
                        constraint.propertySet.mApply = true;
                    }
                    if (!constraint.transform.mApply) {
                        constraint.transform.mApply = true;
                        constraint.transform.rotation = view.getRotation();
                        constraint.transform.rotationX = view.getRotationX();
                        constraint.transform.rotationY = view.getRotationY();
                        constraint.transform.scaleX = view.getScaleX();
                        constraint.transform.scaleY = view.getScaleY();
                        float pivotX = view.getPivotX();
                        float pivotY = view.getPivotY();
                        if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                            constraint.transform.transformPivotX = pivotX;
                            constraint.transform.transformPivotY = pivotY;
                        }
                        constraint.transform.translationX = view.getTranslationX();
                        constraint.transform.translationY = view.getTranslationY();
                        constraint.transform.translationZ = view.getTranslationZ();
                        if (constraint.transform.applyElevation) {
                            constraint.transform.elevation = view.getElevation();
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void applyDeltaFrom(ConstraintSet cs) {
        for (Constraint from : cs.mConstraints.values()) {
            if (from.mDelta != null) {
                if (from.mTargetString == null) {
                    from.mDelta.applyDelta(getConstraint(from.mViewId));
                } else {
                    for (Integer intValue : this.mConstraints.keySet()) {
                        Constraint potential = getConstraint(intValue.intValue());
                        if (potential.layout.mConstraintTag != null && from.mTargetString.matches(potential.layout.mConstraintTag)) {
                            from.mDelta.applyDelta(potential);
                            potential.mCustomConstraints.putAll((HashMap) from.mCustomConstraints.clone());
                        }
                    }
                }
            }
        }
    }

    static void parseDimensionConstraints(Object data, TypedArray a, int attr, int orientation) {
        if (data != null) {
            int finalValue = 0;
            boolean finalConstrained = false;
            switch (a.peekValue(attr).type) {
                case 3:
                    parseDimensionConstraintsString(data, a.getString(attr), orientation);
                    return;
                case 5:
                    finalValue = a.getDimensionPixelSize(attr, 0);
                    break;
                default:
                    int value = a.getInt(attr, 0);
                    switch (value) {
                        case -4:
                            finalValue = -2;
                            finalConstrained = true;
                            break;
                        case -3:
                            finalValue = 0;
                            break;
                        case -2:
                        case -1:
                            finalValue = value;
                            break;
                    }
            }
            if ((data instanceof ConstraintLayout.LayoutParams) != 0) {
                ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) data;
                if (orientation == 0) {
                    params.width = finalValue;
                    params.constrainedWidth = finalConstrained;
                    return;
                }
                params.height = finalValue;
                params.constrainedHeight = finalConstrained;
            } else if (data instanceof Layout) {
                Layout params2 = (Layout) data;
                if (orientation == 0) {
                    params2.mWidth = finalValue;
                    params2.constrainedWidth = finalConstrained;
                    return;
                }
                params2.mHeight = finalValue;
                params2.constrainedHeight = finalConstrained;
            } else if (data instanceof Constraint.Delta) {
                Constraint.Delta params3 = (Constraint.Delta) data;
                if (orientation == 0) {
                    params3.add(23, finalValue);
                    params3.add((int) CONSTRAINED_WIDTH, finalConstrained);
                    return;
                }
                params3.add(21, finalValue);
                params3.add((int) CONSTRAINED_HEIGHT, finalConstrained);
            }
        }
    }

    static void parseDimensionRatioString(ConstraintLayout.LayoutParams params, String value) {
        int commaIndex;
        String dimensionRatio = value;
        float dimensionRatioValue = Float.NaN;
        int dimensionRatioSide = -1;
        if (dimensionRatio != null) {
            int len = dimensionRatio.length();
            int commaIndex2 = dimensionRatio.indexOf(44);
            if (commaIndex2 <= 0 || commaIndex2 >= len - 1) {
                commaIndex = 0;
            } else {
                String dimension = dimensionRatio.substring(0, commaIndex2);
                if (dimension.equalsIgnoreCase("W")) {
                    dimensionRatioSide = 0;
                } else if (dimension.equalsIgnoreCase("H")) {
                    dimensionRatioSide = 1;
                }
                commaIndex = commaIndex2 + 1;
            }
            int colonIndex = dimensionRatio.indexOf(WIDTH_MIN);
            if (colonIndex < 0 || colonIndex >= len - 1) {
                String r = dimensionRatio.substring(commaIndex);
                if (r.length() > 0) {
                    try {
                        dimensionRatioValue = Float.parseFloat(r);
                    } catch (NumberFormatException e) {
                    }
                }
            } else {
                String nominator = dimensionRatio.substring(commaIndex, colonIndex);
                String denominator = dimensionRatio.substring(colonIndex + 1);
                if (nominator.length() > 0 && denominator.length() > 0) {
                    try {
                        float nominatorValue = Float.parseFloat(nominator);
                        float denominatorValue = Float.parseFloat(denominator);
                        if (nominatorValue > 0.0f && denominatorValue > 0.0f) {
                            dimensionRatioValue = dimensionRatioSide == 1 ? Math.abs(denominatorValue / nominatorValue) : Math.abs(nominatorValue / denominatorValue);
                        }
                    } catch (NumberFormatException e2) {
                    }
                }
            }
        }
        params.dimensionRatio = dimensionRatio;
        params.mDimensionRatioValue = dimensionRatioValue;
        params.mDimensionRatioSide = dimensionRatioSide;
    }

    static void parseDimensionConstraintsString(Object data, String value, int orientation) {
        if (value != null) {
            int equalIndex = value.indexOf(61);
            int len = value.length();
            if (equalIndex > 0 && equalIndex < len - 1) {
                String key = value.substring(0, equalIndex);
                String val = value.substring(equalIndex + 1);
                if (val.length() > 0) {
                    String key2 = key.trim();
                    String val2 = val.trim();
                    if (KEY_RATIO.equalsIgnoreCase(key2)) {
                        if (data instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) data;
                            if (orientation == 0) {
                                params.width = 0;
                            } else {
                                params.height = 0;
                            }
                            parseDimensionRatioString(params, val2);
                        } else if (data instanceof Layout) {
                            ((Layout) data).dimensionRatio = val2;
                        } else if (data instanceof Constraint.Delta) {
                            ((Constraint.Delta) data).add(5, val2);
                        }
                    } else if (KEY_WEIGHT.equalsIgnoreCase(key2)) {
                        try {
                            float weight = Float.parseFloat(val2);
                            if (data instanceof ConstraintLayout.LayoutParams) {
                                ConstraintLayout.LayoutParams params2 = (ConstraintLayout.LayoutParams) data;
                                if (orientation == 0) {
                                    params2.width = 0;
                                    params2.horizontalWeight = weight;
                                } else {
                                    params2.height = 0;
                                    params2.verticalWeight = weight;
                                }
                            } else if (data instanceof Layout) {
                                Layout params3 = (Layout) data;
                                if (orientation == 0) {
                                    params3.mWidth = 0;
                                    params3.horizontalWeight = weight;
                                    return;
                                }
                                params3.mHeight = 0;
                                params3.verticalWeight = weight;
                            } else if (data instanceof Constraint.Delta) {
                                Constraint.Delta params4 = (Constraint.Delta) data;
                                if (orientation == 0) {
                                    params4.add(23, 0);
                                    params4.add(39, weight);
                                    return;
                                }
                                params4.add(21, 0);
                                params4.add(40, weight);
                            }
                        } catch (NumberFormatException e) {
                        }
                    } else if (KEY_PERCENT_PARENT.equalsIgnoreCase(key2)) {
                        try {
                            float percent = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(val2)));
                            if (data instanceof ConstraintLayout.LayoutParams) {
                                ConstraintLayout.LayoutParams params5 = (ConstraintLayout.LayoutParams) data;
                                if (orientation == 0) {
                                    params5.width = 0;
                                    params5.matchConstraintPercentWidth = percent;
                                    params5.matchConstraintDefaultWidth = 2;
                                } else {
                                    params5.height = 0;
                                    params5.matchConstraintPercentHeight = percent;
                                    params5.matchConstraintDefaultHeight = 2;
                                }
                            } else if (data instanceof Layout) {
                                Layout params6 = (Layout) data;
                                if (orientation == 0) {
                                    params6.mWidth = 0;
                                    params6.widthPercent = percent;
                                    params6.widthDefault = 2;
                                    return;
                                }
                                params6.mHeight = 0;
                                params6.heightPercent = percent;
                                params6.heightDefault = 2;
                            } else if (data instanceof Constraint.Delta) {
                                Constraint.Delta params7 = (Constraint.Delta) data;
                                if (orientation == 0) {
                                    params7.add(23, 0);
                                    params7.add(54, 2);
                                    return;
                                }
                                params7.add(21, 0);
                                params7.add(55, 2);
                            }
                        } catch (NumberFormatException e2) {
                        }
                    }
                }
            }
        }
    }

    public String[] getStateLabels() {
        return (String[]) Arrays.copyOf(this.mMatchLabels, this.mMatchLabels.length);
    }

    public void setStateLabels(String types) {
        this.mMatchLabels = types.split(",");
        for (int i = 0; i < this.mMatchLabels.length; i++) {
            this.mMatchLabels[i] = this.mMatchLabels[i].trim();
        }
    }

    public void setStateLabelsList(String... types) {
        this.mMatchLabels = types;
        for (int i = 0; i < this.mMatchLabels.length; i++) {
            this.mMatchLabels[i] = this.mMatchLabels[i].trim();
        }
    }

    public boolean matchesLabels(String... types) {
        for (String type : types) {
            boolean match = false;
            String[] strArr = this.mMatchLabels;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (strArr[i].equals(type)) {
                    match = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!match) {
                return false;
            }
        }
        return true;
    }

    public static class Layout {
        private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
        private static final int BARRIER_DIRECTION = 72;
        private static final int BARRIER_MARGIN = 73;
        private static final int BASELINE_MARGIN = 80;
        private static final int BASELINE_TO_BASELINE = 1;
        private static final int BASELINE_TO_BOTTOM = 78;
        private static final int BASELINE_TO_TOP = 77;
        private static final int BOTTOM_MARGIN = 2;
        private static final int BOTTOM_TO_BOTTOM = 3;
        private static final int BOTTOM_TO_TOP = 4;
        private static final int CHAIN_USE_RTL = 71;
        private static final int CIRCLE = 61;
        private static final int CIRCLE_ANGLE = 63;
        private static final int CIRCLE_RADIUS = 62;
        private static final int CONSTRAINED_HEIGHT = 88;
        private static final int CONSTRAINED_WIDTH = 87;
        private static final int CONSTRAINT_REFERENCED_IDS = 74;
        private static final int CONSTRAINT_TAG = 89;
        private static final int DIMENSION_RATIO = 5;
        private static final int EDITOR_ABSOLUTE_X = 6;
        private static final int EDITOR_ABSOLUTE_Y = 7;
        private static final int END_MARGIN = 8;
        private static final int END_TO_END = 9;
        private static final int END_TO_START = 10;
        private static final int GONE_BASELINE_MARGIN = 79;
        private static final int GONE_BOTTOM_MARGIN = 11;
        private static final int GONE_END_MARGIN = 12;
        private static final int GONE_LEFT_MARGIN = 13;
        private static final int GONE_RIGHT_MARGIN = 14;
        private static final int GONE_START_MARGIN = 15;
        private static final int GONE_TOP_MARGIN = 16;
        private static final int GUIDE_BEGIN = 17;
        private static final int GUIDE_END = 18;
        private static final int GUIDE_PERCENT = 19;
        private static final int GUIDE_USE_RTL = 90;
        private static final int HEIGHT_DEFAULT = 82;
        private static final int HEIGHT_MAX = 83;
        private static final int HEIGHT_MIN = 85;
        private static final int HEIGHT_PERCENT = 70;
        private static final int HORIZONTAL_BIAS = 20;
        private static final int HORIZONTAL_STYLE = 39;
        private static final int HORIZONTAL_WEIGHT = 37;
        private static final int LAYOUT_CONSTRAINT_HEIGHT = 42;
        private static final int LAYOUT_CONSTRAINT_WIDTH = 41;
        private static final int LAYOUT_HEIGHT = 21;
        private static final int LAYOUT_WIDTH = 22;
        private static final int LAYOUT_WRAP_BEHAVIOR = 76;
        private static final int LEFT_MARGIN = 23;
        private static final int LEFT_TO_LEFT = 24;
        private static final int LEFT_TO_RIGHT = 25;
        private static final int ORIENTATION = 26;
        private static final int RIGHT_MARGIN = 27;
        private static final int RIGHT_TO_LEFT = 28;
        private static final int RIGHT_TO_RIGHT = 29;
        private static final int START_MARGIN = 30;
        private static final int START_TO_END = 31;
        private static final int START_TO_START = 32;
        private static final int TOP_MARGIN = 33;
        private static final int TOP_TO_BOTTOM = 34;
        private static final int TOP_TO_TOP = 35;
        public static final int UNSET = -1;
        public static final int UNSET_GONE_MARGIN = Integer.MIN_VALUE;
        private static final int UNUSED = 91;
        private static final int VERTICAL_BIAS = 36;
        private static final int VERTICAL_STYLE = 40;
        private static final int VERTICAL_WEIGHT = 38;
        private static final int WIDTH_DEFAULT = 81;
        private static final int WIDTH_MAX = 84;
        private static final int WIDTH_MIN = 86;
        private static final int WIDTH_PERCENT = 69;
        private static SparseIntArray sMapToConstant = new SparseIntArray();
        public int baselineMargin = 0;
        public int baselineToBaseline = -1;
        public int baselineToBottom = -1;
        public int baselineToTop = -1;
        public int bottomMargin = 0;
        public int bottomToBottom = -1;
        public int bottomToTop = -1;
        public float circleAngle = 0.0f;
        public int circleConstraint = -1;
        public int circleRadius = 0;
        public boolean constrainedHeight = false;
        public boolean constrainedWidth = false;
        public String dimensionRatio = null;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int endMargin = 0;
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
        public int heightDefault = 0;
        public int heightMax = 0;
        public int heightMin = 0;
        public float heightPercent = 1.0f;
        public float horizontalBias = 0.5f;
        public int horizontalChainStyle = 0;
        public float horizontalWeight = -1.0f;
        public int leftMargin = 0;
        public int leftToLeft = -1;
        public int leftToRight = -1;
        public boolean mApply = false;
        public boolean mBarrierAllowsGoneWidgets = true;
        public int mBarrierDirection = -1;
        public int mBarrierMargin = 0;
        public String mConstraintTag;
        public int mHeight;
        public int mHelperType = -1;
        public boolean mIsGuideline = false;
        public boolean mOverride = false;
        public String mReferenceIdString;
        public int[] mReferenceIds;
        public int mWidth;
        public int mWrapBehavior = 0;
        public int orientation = -1;
        public int rightMargin = 0;
        public int rightToLeft = -1;
        public int rightToRight = -1;
        public int startMargin = 0;
        public int startToEnd = -1;
        public int startToStart = -1;
        public int topMargin = 0;
        public int topToBottom = -1;
        public int topToTop = -1;
        public float verticalBias = 0.5f;
        public int verticalChainStyle = 0;
        public float verticalWeight = -1.0f;
        public int widthDefault = 0;
        public int widthMax = 0;
        public int widthMin = 0;
        public float widthPercent = 1.0f;

        public void copyFrom(Layout src) {
            this.mIsGuideline = src.mIsGuideline;
            this.mWidth = src.mWidth;
            this.mApply = src.mApply;
            this.mHeight = src.mHeight;
            this.guideBegin = src.guideBegin;
            this.guideEnd = src.guideEnd;
            this.guidePercent = src.guidePercent;
            this.guidelineUseRtl = src.guidelineUseRtl;
            this.leftToLeft = src.leftToLeft;
            this.leftToRight = src.leftToRight;
            this.rightToLeft = src.rightToLeft;
            this.rightToRight = src.rightToRight;
            this.topToTop = src.topToTop;
            this.topToBottom = src.topToBottom;
            this.bottomToTop = src.bottomToTop;
            this.bottomToBottom = src.bottomToBottom;
            this.baselineToBaseline = src.baselineToBaseline;
            this.baselineToTop = src.baselineToTop;
            this.baselineToBottom = src.baselineToBottom;
            this.startToEnd = src.startToEnd;
            this.startToStart = src.startToStart;
            this.endToStart = src.endToStart;
            this.endToEnd = src.endToEnd;
            this.horizontalBias = src.horizontalBias;
            this.verticalBias = src.verticalBias;
            this.dimensionRatio = src.dimensionRatio;
            this.circleConstraint = src.circleConstraint;
            this.circleRadius = src.circleRadius;
            this.circleAngle = src.circleAngle;
            this.editorAbsoluteX = src.editorAbsoluteX;
            this.editorAbsoluteY = src.editorAbsoluteY;
            this.orientation = src.orientation;
            this.leftMargin = src.leftMargin;
            this.rightMargin = src.rightMargin;
            this.topMargin = src.topMargin;
            this.bottomMargin = src.bottomMargin;
            this.endMargin = src.endMargin;
            this.startMargin = src.startMargin;
            this.baselineMargin = src.baselineMargin;
            this.goneLeftMargin = src.goneLeftMargin;
            this.goneTopMargin = src.goneTopMargin;
            this.goneRightMargin = src.goneRightMargin;
            this.goneBottomMargin = src.goneBottomMargin;
            this.goneEndMargin = src.goneEndMargin;
            this.goneStartMargin = src.goneStartMargin;
            this.goneBaselineMargin = src.goneBaselineMargin;
            this.verticalWeight = src.verticalWeight;
            this.horizontalWeight = src.horizontalWeight;
            this.horizontalChainStyle = src.horizontalChainStyle;
            this.verticalChainStyle = src.verticalChainStyle;
            this.widthDefault = src.widthDefault;
            this.heightDefault = src.heightDefault;
            this.widthMax = src.widthMax;
            this.heightMax = src.heightMax;
            this.widthMin = src.widthMin;
            this.heightMin = src.heightMin;
            this.widthPercent = src.widthPercent;
            this.heightPercent = src.heightPercent;
            this.mBarrierDirection = src.mBarrierDirection;
            this.mBarrierMargin = src.mBarrierMargin;
            this.mHelperType = src.mHelperType;
            this.mConstraintTag = src.mConstraintTag;
            if (src.mReferenceIds == null || src.mReferenceIdString != null) {
                this.mReferenceIds = null;
            } else {
                this.mReferenceIds = Arrays.copyOf(src.mReferenceIds, src.mReferenceIds.length);
            }
            this.mReferenceIdString = src.mReferenceIdString;
            this.constrainedWidth = src.constrainedWidth;
            this.constrainedHeight = src.constrainedHeight;
            this.mBarrierAllowsGoneWidgets = src.mBarrierAllowsGoneWidgets;
            this.mWrapBehavior = src.mWrapBehavior;
        }

        static {
            sMapToConstant.append(R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            sMapToConstant.append(R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
            sMapToConstant.append(R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
            sMapToConstant.append(R.styleable.Layout_layout_constraintRight_toRightOf, 29);
            sMapToConstant.append(R.styleable.Layout_layout_constraintTop_toTopOf, 35);
            sMapToConstant.append(R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
            sMapToConstant.append(R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
            sMapToConstant.append(R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            sMapToConstant.append(R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            sMapToConstant.append(R.styleable.Layout_layout_editor_absoluteX, 6);
            sMapToConstant.append(R.styleable.Layout_layout_editor_absoluteY, 7);
            sMapToConstant.append(R.styleable.Layout_layout_constraintGuide_begin, 17);
            sMapToConstant.append(R.styleable.Layout_layout_constraintGuide_end, 18);
            sMapToConstant.append(R.styleable.Layout_layout_constraintGuide_percent, 19);
            sMapToConstant.append(R.styleable.Layout_guidelineUseRtl, GUIDE_USE_RTL);
            sMapToConstant.append(R.styleable.Layout_android_orientation, 26);
            sMapToConstant.append(R.styleable.Layout_layout_constraintStart_toEndOf, 31);
            sMapToConstant.append(R.styleable.Layout_layout_constraintStart_toStartOf, 32);
            sMapToConstant.append(R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
            sMapToConstant.append(R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
            sMapToConstant.append(R.styleable.Layout_layout_goneMarginLeft, 13);
            sMapToConstant.append(R.styleable.Layout_layout_goneMarginTop, 16);
            sMapToConstant.append(R.styleable.Layout_layout_goneMarginRight, 14);
            sMapToConstant.append(R.styleable.Layout_layout_goneMarginBottom, 11);
            sMapToConstant.append(R.styleable.Layout_layout_goneMarginStart, 15);
            sMapToConstant.append(R.styleable.Layout_layout_goneMarginEnd, 12);
            sMapToConstant.append(R.styleable.Layout_layout_constraintVertical_weight, 38);
            sMapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_weight, 37);
            sMapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            sMapToConstant.append(R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
            sMapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_bias, 20);
            sMapToConstant.append(R.styleable.Layout_layout_constraintVertical_bias, 36);
            sMapToConstant.append(R.styleable.Layout_layout_constraintDimensionRatio, 5);
            sMapToConstant.append(R.styleable.Layout_layout_constraintLeft_creator, UNUSED);
            sMapToConstant.append(R.styleable.Layout_layout_constraintTop_creator, UNUSED);
            sMapToConstant.append(R.styleable.Layout_layout_constraintRight_creator, UNUSED);
            sMapToConstant.append(R.styleable.Layout_layout_constraintBottom_creator, UNUSED);
            sMapToConstant.append(R.styleable.Layout_layout_constraintBaseline_creator, UNUSED);
            sMapToConstant.append(R.styleable.Layout_android_layout_marginLeft, 23);
            sMapToConstant.append(R.styleable.Layout_android_layout_marginRight, 27);
            sMapToConstant.append(R.styleable.Layout_android_layout_marginStart, 30);
            sMapToConstant.append(R.styleable.Layout_android_layout_marginEnd, 8);
            sMapToConstant.append(R.styleable.Layout_android_layout_marginTop, 33);
            sMapToConstant.append(R.styleable.Layout_android_layout_marginBottom, 2);
            sMapToConstant.append(R.styleable.Layout_android_layout_width, 22);
            sMapToConstant.append(R.styleable.Layout_android_layout_height, 21);
            sMapToConstant.append(R.styleable.Layout_layout_constraintWidth, 41);
            sMapToConstant.append(R.styleable.Layout_layout_constraintHeight, 42);
            sMapToConstant.append(R.styleable.Layout_layout_constrainedWidth, CONSTRAINED_WIDTH);
            sMapToConstant.append(R.styleable.Layout_layout_constrainedHeight, CONSTRAINED_HEIGHT);
            sMapToConstant.append(R.styleable.Layout_layout_wrapBehaviorInParent, 76);
            sMapToConstant.append(R.styleable.Layout_layout_constraintCircle, 61);
            sMapToConstant.append(R.styleable.Layout_layout_constraintCircleRadius, CIRCLE_RADIUS);
            sMapToConstant.append(R.styleable.Layout_layout_constraintCircleAngle, 63);
            sMapToConstant.append(R.styleable.Layout_layout_constraintWidth_percent, WIDTH_PERCENT);
            sMapToConstant.append(R.styleable.Layout_layout_constraintHeight_percent, HEIGHT_PERCENT);
            sMapToConstant.append(R.styleable.Layout_chainUseRtl, CHAIN_USE_RTL);
            sMapToConstant.append(R.styleable.Layout_barrierDirection, BARRIER_DIRECTION);
            sMapToConstant.append(R.styleable.Layout_barrierMargin, BARRIER_MARGIN);
            sMapToConstant.append(R.styleable.Layout_constraint_referenced_ids, CONSTRAINT_REFERENCED_IDS);
            sMapToConstant.append(R.styleable.Layout_barrierAllowsGoneWidgets, BARRIER_ALLOWS_GONE_WIDGETS);
            sMapToConstant.append(R.styleable.Layout_layout_constraintWidth_max, WIDTH_MAX);
            sMapToConstant.append(R.styleable.Layout_layout_constraintWidth_min, WIDTH_MIN);
            sMapToConstant.append(R.styleable.Layout_layout_constraintWidth_max, HEIGHT_MAX);
            sMapToConstant.append(R.styleable.Layout_layout_constraintHeight_min, HEIGHT_MIN);
            sMapToConstant.append(R.styleable.Layout_layout_constraintWidth, CONSTRAINED_WIDTH);
            sMapToConstant.append(R.styleable.Layout_layout_constraintHeight, CONSTRAINED_HEIGHT);
            sMapToConstant.append(R.styleable.ConstraintLayout_Layout_layout_constraintTag, CONSTRAINT_TAG);
            sMapToConstant.append(R.styleable.Layout_guidelineUseRtl, GUIDE_USE_RTL);
        }

        /* access modifiers changed from: package-private */
        public void fillFromAttributeList(Context context, AttributeSet attrs) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.Layout);
            this.mApply = true;
            int count = a.getIndexCount();
            for (int i = 0; i < count; i++) {
                int attr = a.getIndex(i);
                switch (sMapToConstant.get(attr)) {
                    case 1:
                        this.baselineToBaseline = ConstraintSet.lookupID(a, attr, this.baselineToBaseline);
                        break;
                    case 2:
                        this.bottomMargin = a.getDimensionPixelSize(attr, this.bottomMargin);
                        break;
                    case 3:
                        this.bottomToBottom = ConstraintSet.lookupID(a, attr, this.bottomToBottom);
                        break;
                    case 4:
                        this.bottomToTop = ConstraintSet.lookupID(a, attr, this.bottomToTop);
                        break;
                    case 5:
                        this.dimensionRatio = a.getString(attr);
                        break;
                    case 6:
                        this.editorAbsoluteX = a.getDimensionPixelOffset(attr, this.editorAbsoluteX);
                        break;
                    case 7:
                        this.editorAbsoluteY = a.getDimensionPixelOffset(attr, this.editorAbsoluteY);
                        break;
                    case 8:
                        this.endMargin = a.getDimensionPixelSize(attr, this.endMargin);
                        break;
                    case 9:
                        this.endToEnd = ConstraintSet.lookupID(a, attr, this.endToEnd);
                        break;
                    case 10:
                        this.endToStart = ConstraintSet.lookupID(a, attr, this.endToStart);
                        break;
                    case 11:
                        this.goneBottomMargin = a.getDimensionPixelSize(attr, this.goneBottomMargin);
                        break;
                    case 12:
                        this.goneEndMargin = a.getDimensionPixelSize(attr, this.goneEndMargin);
                        break;
                    case 13:
                        this.goneLeftMargin = a.getDimensionPixelSize(attr, this.goneLeftMargin);
                        break;
                    case 14:
                        this.goneRightMargin = a.getDimensionPixelSize(attr, this.goneRightMargin);
                        break;
                    case 15:
                        this.goneStartMargin = a.getDimensionPixelSize(attr, this.goneStartMargin);
                        break;
                    case 16:
                        this.goneTopMargin = a.getDimensionPixelSize(attr, this.goneTopMargin);
                        break;
                    case 17:
                        this.guideBegin = a.getDimensionPixelOffset(attr, this.guideBegin);
                        break;
                    case 18:
                        this.guideEnd = a.getDimensionPixelOffset(attr, this.guideEnd);
                        break;
                    case 19:
                        this.guidePercent = a.getFloat(attr, this.guidePercent);
                        break;
                    case 20:
                        this.horizontalBias = a.getFloat(attr, this.horizontalBias);
                        break;
                    case 21:
                        this.mHeight = a.getLayoutDimension(attr, this.mHeight);
                        break;
                    case 22:
                        this.mWidth = a.getLayoutDimension(attr, this.mWidth);
                        break;
                    case 23:
                        this.leftMargin = a.getDimensionPixelSize(attr, this.leftMargin);
                        break;
                    case 24:
                        this.leftToLeft = ConstraintSet.lookupID(a, attr, this.leftToLeft);
                        break;
                    case 25:
                        this.leftToRight = ConstraintSet.lookupID(a, attr, this.leftToRight);
                        break;
                    case 26:
                        this.orientation = a.getInt(attr, this.orientation);
                        break;
                    case 27:
                        this.rightMargin = a.getDimensionPixelSize(attr, this.rightMargin);
                        break;
                    case 28:
                        this.rightToLeft = ConstraintSet.lookupID(a, attr, this.rightToLeft);
                        break;
                    case 29:
                        this.rightToRight = ConstraintSet.lookupID(a, attr, this.rightToRight);
                        break;
                    case 30:
                        this.startMargin = a.getDimensionPixelSize(attr, this.startMargin);
                        break;
                    case 31:
                        this.startToEnd = ConstraintSet.lookupID(a, attr, this.startToEnd);
                        break;
                    case 32:
                        this.startToStart = ConstraintSet.lookupID(a, attr, this.startToStart);
                        break;
                    case 33:
                        this.topMargin = a.getDimensionPixelSize(attr, this.topMargin);
                        break;
                    case 34:
                        this.topToBottom = ConstraintSet.lookupID(a, attr, this.topToBottom);
                        break;
                    case 35:
                        this.topToTop = ConstraintSet.lookupID(a, attr, this.topToTop);
                        break;
                    case 36:
                        this.verticalBias = a.getFloat(attr, this.verticalBias);
                        break;
                    case 37:
                        this.horizontalWeight = a.getFloat(attr, this.horizontalWeight);
                        break;
                    case 38:
                        this.verticalWeight = a.getFloat(attr, this.verticalWeight);
                        break;
                    case 39:
                        this.horizontalChainStyle = a.getInt(attr, this.horizontalChainStyle);
                        break;
                    case 40:
                        this.verticalChainStyle = a.getInt(attr, this.verticalChainStyle);
                        break;
                    case 41:
                        ConstraintSet.parseDimensionConstraints(this, a, attr, 0);
                        break;
                    case 42:
                        ConstraintSet.parseDimensionConstraints(this, a, attr, 1);
                        break;
                    case 61:
                        this.circleConstraint = ConstraintSet.lookupID(a, attr, this.circleConstraint);
                        break;
                    case CIRCLE_RADIUS /*62*/:
                        this.circleRadius = a.getDimensionPixelSize(attr, this.circleRadius);
                        break;
                    case 63:
                        this.circleAngle = a.getFloat(attr, this.circleAngle);
                        break;
                    case WIDTH_PERCENT /*69*/:
                        this.widthPercent = a.getFloat(attr, 1.0f);
                        break;
                    case HEIGHT_PERCENT /*70*/:
                        this.heightPercent = a.getFloat(attr, 1.0f);
                        break;
                    case CHAIN_USE_RTL /*71*/:
                        Log.e(ConstraintSet.TAG, "CURRENTLY UNSUPPORTED");
                        break;
                    case BARRIER_DIRECTION /*72*/:
                        this.mBarrierDirection = a.getInt(attr, this.mBarrierDirection);
                        break;
                    case BARRIER_MARGIN /*73*/:
                        this.mBarrierMargin = a.getDimensionPixelSize(attr, this.mBarrierMargin);
                        break;
                    case CONSTRAINT_REFERENCED_IDS /*74*/:
                        this.mReferenceIdString = a.getString(attr);
                        break;
                    case BARRIER_ALLOWS_GONE_WIDGETS /*75*/:
                        this.mBarrierAllowsGoneWidgets = a.getBoolean(attr, this.mBarrierAllowsGoneWidgets);
                        break;
                    case 76:
                        this.mWrapBehavior = a.getInt(attr, this.mWrapBehavior);
                        break;
                    case BASELINE_TO_TOP /*77*/:
                        this.baselineToTop = ConstraintSet.lookupID(a, attr, this.baselineToTop);
                        break;
                    case BASELINE_TO_BOTTOM /*78*/:
                        this.baselineToBottom = ConstraintSet.lookupID(a, attr, this.baselineToBottom);
                        break;
                    case GONE_BASELINE_MARGIN /*79*/:
                        this.goneBaselineMargin = a.getDimensionPixelSize(attr, this.goneBaselineMargin);
                        break;
                    case BASELINE_MARGIN /*80*/:
                        this.baselineMargin = a.getDimensionPixelSize(attr, this.baselineMargin);
                        break;
                    case WIDTH_DEFAULT /*81*/:
                        this.widthDefault = a.getInt(attr, this.widthDefault);
                        break;
                    case HEIGHT_DEFAULT /*82*/:
                        this.heightDefault = a.getInt(attr, this.heightDefault);
                        break;
                    case HEIGHT_MAX /*83*/:
                        this.heightMax = a.getDimensionPixelSize(attr, this.heightMax);
                        break;
                    case WIDTH_MAX /*84*/:
                        this.widthMax = a.getDimensionPixelSize(attr, this.widthMax);
                        break;
                    case HEIGHT_MIN /*85*/:
                        this.heightMin = a.getDimensionPixelSize(attr, this.heightMin);
                        break;
                    case WIDTH_MIN /*86*/:
                        this.widthMin = a.getDimensionPixelSize(attr, this.widthMin);
                        break;
                    case CONSTRAINED_WIDTH /*87*/:
                        this.constrainedWidth = a.getBoolean(attr, this.constrainedWidth);
                        break;
                    case CONSTRAINED_HEIGHT /*88*/:
                        this.constrainedHeight = a.getBoolean(attr, this.constrainedHeight);
                        break;
                    case CONSTRAINT_TAG /*89*/:
                        this.mConstraintTag = a.getString(attr);
                        break;
                    case GUIDE_USE_RTL /*90*/:
                        this.guidelineUseRtl = a.getBoolean(attr, this.guidelineUseRtl);
                        break;
                    case UNUSED /*91*/:
                        Log.w(ConstraintSet.TAG, "unused attribute 0x" + Integer.toHexString(attr) + "   " + sMapToConstant.get(attr));
                        break;
                    default:
                        Log.w(ConstraintSet.TAG, "Unknown attribute 0x" + Integer.toHexString(attr) + "   " + sMapToConstant.get(attr));
                        break;
                }
            }
            a.recycle();
        }

        public void dump(MotionScene scene, StringBuilder stringBuilder) {
            Field[] fields = getClass().getDeclaredFields();
            stringBuilder.append("\n");
            for (Field field : fields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object value = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer iValue = (Integer) value;
                            if (iValue.intValue() != -1) {
                                String stringId = scene.lookUpConstraintName(iValue.intValue());
                                stringBuilder.append("    ");
                                stringBuilder.append(name);
                                stringBuilder.append(" = \"");
                                stringBuilder.append(stringId == null ? iValue : stringId);
                                stringBuilder.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float fValue = (Float) value;
                            if (fValue.floatValue() != -1.0f) {
                                stringBuilder.append("    ");
                                stringBuilder.append(name);
                                stringBuilder.append(" = \"");
                                stringBuilder.append(fValue);
                                stringBuilder.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e) {
                        Log.e(ConstraintSet.TAG, "Error accessing ConstraintSet field", e);
                    }
                }
            }
        }
    }

    public static class Transform {
        private static final int ELEVATION = 11;
        private static final int ROTATION = 1;
        private static final int ROTATION_X = 2;
        private static final int ROTATION_Y = 3;
        private static final int SCALE_X = 4;
        private static final int SCALE_Y = 5;
        private static final int TRANSFORM_PIVOT_TARGET = 12;
        private static final int TRANSFORM_PIVOT_X = 6;
        private static final int TRANSFORM_PIVOT_Y = 7;
        private static final int TRANSLATION_X = 8;
        private static final int TRANSLATION_Y = 9;
        private static final int TRANSLATION_Z = 10;
        private static SparseIntArray sMapToConstant = new SparseIntArray();
        public boolean applyElevation = false;
        public float elevation = 0.0f;
        public boolean mApply = false;
        public float rotation = 0.0f;
        public float rotationX = 0.0f;
        public float rotationY = 0.0f;
        public float scaleX = 1.0f;
        public float scaleY = 1.0f;
        public int transformPivotTarget = -1;
        public float transformPivotX = Float.NaN;
        public float transformPivotY = Float.NaN;
        public float translationX = 0.0f;
        public float translationY = 0.0f;
        public float translationZ = 0.0f;

        public void copyFrom(Transform src) {
            this.mApply = src.mApply;
            this.rotation = src.rotation;
            this.rotationX = src.rotationX;
            this.rotationY = src.rotationY;
            this.scaleX = src.scaleX;
            this.scaleY = src.scaleY;
            this.transformPivotX = src.transformPivotX;
            this.transformPivotY = src.transformPivotY;
            this.transformPivotTarget = src.transformPivotTarget;
            this.translationX = src.translationX;
            this.translationY = src.translationY;
            this.translationZ = src.translationZ;
            this.applyElevation = src.applyElevation;
            this.elevation = src.elevation;
        }

        static {
            sMapToConstant.append(R.styleable.Transform_android_rotation, 1);
            sMapToConstant.append(R.styleable.Transform_android_rotationX, 2);
            sMapToConstant.append(R.styleable.Transform_android_rotationY, 3);
            sMapToConstant.append(R.styleable.Transform_android_scaleX, 4);
            sMapToConstant.append(R.styleable.Transform_android_scaleY, 5);
            sMapToConstant.append(R.styleable.Transform_android_transformPivotX, 6);
            sMapToConstant.append(R.styleable.Transform_android_transformPivotY, 7);
            sMapToConstant.append(R.styleable.Transform_android_translationX, 8);
            sMapToConstant.append(R.styleable.Transform_android_translationY, 9);
            sMapToConstant.append(R.styleable.Transform_android_translationZ, 10);
            sMapToConstant.append(R.styleable.Transform_android_elevation, 11);
            sMapToConstant.append(R.styleable.Transform_transformPivotTarget, 12);
        }

        /* access modifiers changed from: package-private */
        public void fillFromAttributeList(Context context, AttributeSet attrs) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.Transform);
            this.mApply = true;
            int count = a.getIndexCount();
            for (int i = 0; i < count; i++) {
                int attr = a.getIndex(i);
                switch (sMapToConstant.get(attr)) {
                    case 1:
                        this.rotation = a.getFloat(attr, this.rotation);
                        break;
                    case 2:
                        this.rotationX = a.getFloat(attr, this.rotationX);
                        break;
                    case 3:
                        this.rotationY = a.getFloat(attr, this.rotationY);
                        break;
                    case 4:
                        this.scaleX = a.getFloat(attr, this.scaleX);
                        break;
                    case 5:
                        this.scaleY = a.getFloat(attr, this.scaleY);
                        break;
                    case 6:
                        this.transformPivotX = a.getDimension(attr, this.transformPivotX);
                        break;
                    case 7:
                        this.transformPivotY = a.getDimension(attr, this.transformPivotY);
                        break;
                    case 8:
                        this.translationX = a.getDimension(attr, this.translationX);
                        break;
                    case 9:
                        this.translationY = a.getDimension(attr, this.translationY);
                        break;
                    case 10:
                        this.translationZ = a.getDimension(attr, this.translationZ);
                        break;
                    case 11:
                        this.applyElevation = true;
                        this.elevation = a.getDimension(attr, this.elevation);
                        break;
                    case 12:
                        this.transformPivotTarget = ConstraintSet.lookupID(a, attr, this.transformPivotTarget);
                        break;
                }
            }
            a.recycle();
        }
    }

    public static class PropertySet {
        public float alpha = 1.0f;
        public boolean mApply = false;
        public float mProgress = Float.NaN;
        public int mVisibilityMode = 0;
        public int visibility = 0;

        public void copyFrom(PropertySet src) {
            this.mApply = src.mApply;
            this.visibility = src.visibility;
            this.alpha = src.alpha;
            this.mProgress = src.mProgress;
            this.mVisibilityMode = src.mVisibilityMode;
        }

        /* access modifiers changed from: package-private */
        public void fillFromAttributeList(Context context, AttributeSet attrs) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.PropertySet);
            this.mApply = true;
            int count = a.getIndexCount();
            for (int i = 0; i < count; i++) {
                int attr = a.getIndex(i);
                if (attr == R.styleable.PropertySet_android_alpha) {
                    this.alpha = a.getFloat(attr, this.alpha);
                } else if (attr == R.styleable.PropertySet_android_visibility) {
                    this.visibility = a.getInt(attr, this.visibility);
                    this.visibility = ConstraintSet.VISIBILITY_FLAGS[this.visibility];
                } else if (attr == R.styleable.PropertySet_visibilityMode) {
                    this.mVisibilityMode = a.getInt(attr, this.mVisibilityMode);
                } else if (attr == R.styleable.PropertySet_motionProgress) {
                    this.mProgress = a.getFloat(attr, this.mProgress);
                }
            }
            a.recycle();
        }
    }

    public static class Motion {
        private static final int ANIMATE_CIRCLE_ANGLE_TO = 6;
        private static final int ANIMATE_RELATIVE_TO = 5;
        private static final int INTERPOLATOR_REFERENCE_ID = -2;
        private static final int INTERPOLATOR_UNDEFINED = -3;
        private static final int MOTION_DRAW_PATH = 4;
        private static final int MOTION_STAGGER = 7;
        private static final int PATH_MOTION_ARC = 2;
        private static final int QUANTIZE_MOTION_INTERPOLATOR = 10;
        private static final int QUANTIZE_MOTION_PHASE = 9;
        private static final int QUANTIZE_MOTION_STEPS = 8;
        private static final int SPLINE_STRING = -1;
        private static final int TRANSITION_EASING = 3;
        private static final int TRANSITION_PATH_ROTATE = 1;
        private static SparseIntArray sMapToConstant = new SparseIntArray();
        public int mAnimateCircleAngleTo = 0;
        public int mAnimateRelativeTo = -1;
        public boolean mApply = false;
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

        public void copyFrom(Motion src) {
            this.mApply = src.mApply;
            this.mAnimateRelativeTo = src.mAnimateRelativeTo;
            this.mTransitionEasing = src.mTransitionEasing;
            this.mPathMotionArc = src.mPathMotionArc;
            this.mDrawPath = src.mDrawPath;
            this.mPathRotate = src.mPathRotate;
            this.mMotionStagger = src.mMotionStagger;
            this.mPolarRelativeTo = src.mPolarRelativeTo;
        }

        static {
            sMapToConstant.append(R.styleable.Motion_motionPathRotate, 1);
            sMapToConstant.append(R.styleable.Motion_pathMotionArc, 2);
            sMapToConstant.append(R.styleable.Motion_transitionEasing, 3);
            sMapToConstant.append(R.styleable.Motion_drawPath, 4);
            sMapToConstant.append(R.styleable.Motion_animateRelativeTo, 5);
            sMapToConstant.append(R.styleable.Motion_animateCircleAngleTo, 6);
            sMapToConstant.append(R.styleable.Motion_motionStagger, 7);
            sMapToConstant.append(R.styleable.Motion_quantizeMotionSteps, 8);
            sMapToConstant.append(R.styleable.Motion_quantizeMotionPhase, 9);
            sMapToConstant.append(R.styleable.Motion_quantizeMotionInterpolator, 10);
        }

        /* access modifiers changed from: package-private */
        public void fillFromAttributeList(Context context, AttributeSet attrs) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.Motion);
            this.mApply = true;
            int count = a.getIndexCount();
            for (int i = 0; i < count; i++) {
                int attr = a.getIndex(i);
                switch (sMapToConstant.get(attr)) {
                    case 1:
                        this.mPathRotate = a.getFloat(attr, this.mPathRotate);
                        break;
                    case 2:
                        this.mPathMotionArc = a.getInt(attr, this.mPathMotionArc);
                        break;
                    case 3:
                        if (a.peekValue(attr).type != 3) {
                            this.mTransitionEasing = Easing.NAMED_EASING[a.getInteger(attr, 0)];
                            break;
                        } else {
                            this.mTransitionEasing = a.getString(attr);
                            break;
                        }
                    case 4:
                        this.mDrawPath = a.getInt(attr, 0);
                        break;
                    case 5:
                        this.mAnimateRelativeTo = ConstraintSet.lookupID(a, attr, this.mAnimateRelativeTo);
                        break;
                    case 6:
                        this.mAnimateCircleAngleTo = a.getInteger(attr, this.mAnimateCircleAngleTo);
                        break;
                    case 7:
                        this.mMotionStagger = a.getFloat(attr, this.mMotionStagger);
                        break;
                    case 8:
                        this.mQuantizeMotionSteps = a.getInteger(attr, this.mQuantizeMotionSteps);
                        break;
                    case 9:
                        this.mQuantizeMotionPhase = a.getFloat(attr, this.mQuantizeMotionPhase);
                        break;
                    case 10:
                        TypedValue type = a.peekValue(attr);
                        if (type.type != 1) {
                            if (type.type != 3) {
                                this.mQuantizeInterpolatorType = a.getInteger(attr, this.mQuantizeInterpolatorID);
                                break;
                            } else {
                                this.mQuantizeInterpolatorString = a.getString(attr);
                                if (this.mQuantizeInterpolatorString.indexOf("/") <= 0) {
                                    this.mQuantizeInterpolatorType = -1;
                                    break;
                                } else {
                                    this.mQuantizeInterpolatorID = a.getResourceId(attr, -1);
                                    this.mQuantizeInterpolatorType = -2;
                                    break;
                                }
                            }
                        } else {
                            this.mQuantizeInterpolatorID = a.getResourceId(attr, -1);
                            if (this.mQuantizeInterpolatorID == -1) {
                                break;
                            } else {
                                this.mQuantizeInterpolatorType = -2;
                                break;
                            }
                        }
                }
            }
            a.recycle();
        }
    }

    public static class Constraint {
        public final Layout layout = new Layout();
        public HashMap<String, ConstraintAttribute> mCustomConstraints = new HashMap<>();
        Delta mDelta;
        String mTargetString;
        int mViewId;
        public final Motion motion = new Motion();
        public final PropertySet propertySet = new PropertySet();
        public final Transform transform = new Transform();

        static class Delta {
            private static final int INITIAL_BOOLEAN = 4;
            private static final int INITIAL_FLOAT = 10;
            private static final int INITIAL_INT = 10;
            private static final int INITIAL_STRING = 5;
            int mCountBoolean = 0;
            int mCountFloat = 0;
            int mCountInt = 0;
            int mCountString = 0;
            int[] mTypeBoolean = new int[4];
            int[] mTypeFloat = new int[10];
            int[] mTypeInt = new int[10];
            int[] mTypeString = new int[5];
            boolean[] mValueBoolean = new boolean[4];
            float[] mValueFloat = new float[10];
            int[] mValueInt = new int[10];
            String[] mValueString = new String[5];

            Delta() {
            }

            /* access modifiers changed from: package-private */
            public void add(int type, int value) {
                if (this.mCountInt >= this.mTypeInt.length) {
                    this.mTypeInt = Arrays.copyOf(this.mTypeInt, this.mTypeInt.length * 2);
                    this.mValueInt = Arrays.copyOf(this.mValueInt, this.mValueInt.length * 2);
                }
                this.mTypeInt[this.mCountInt] = type;
                int[] iArr = this.mValueInt;
                int i = this.mCountInt;
                this.mCountInt = i + 1;
                iArr[i] = value;
            }

            /* access modifiers changed from: package-private */
            public void add(int type, float value) {
                if (this.mCountFloat >= this.mTypeFloat.length) {
                    this.mTypeFloat = Arrays.copyOf(this.mTypeFloat, this.mTypeFloat.length * 2);
                    this.mValueFloat = Arrays.copyOf(this.mValueFloat, this.mValueFloat.length * 2);
                }
                this.mTypeFloat[this.mCountFloat] = type;
                float[] fArr = this.mValueFloat;
                int i = this.mCountFloat;
                this.mCountFloat = i + 1;
                fArr[i] = value;
            }

            /* access modifiers changed from: package-private */
            public void add(int type, String value) {
                if (this.mCountString >= this.mTypeString.length) {
                    this.mTypeString = Arrays.copyOf(this.mTypeString, this.mTypeString.length * 2);
                    this.mValueString = (String[]) Arrays.copyOf(this.mValueString, this.mValueString.length * 2);
                }
                this.mTypeString[this.mCountString] = type;
                String[] strArr = this.mValueString;
                int i = this.mCountString;
                this.mCountString = i + 1;
                strArr[i] = value;
            }

            /* access modifiers changed from: package-private */
            public void add(int type, boolean value) {
                if (this.mCountBoolean >= this.mTypeBoolean.length) {
                    this.mTypeBoolean = Arrays.copyOf(this.mTypeBoolean, this.mTypeBoolean.length * 2);
                    this.mValueBoolean = Arrays.copyOf(this.mValueBoolean, this.mValueBoolean.length * 2);
                }
                this.mTypeBoolean[this.mCountBoolean] = type;
                boolean[] zArr = this.mValueBoolean;
                int i = this.mCountBoolean;
                this.mCountBoolean = i + 1;
                zArr[i] = value;
            }

            /* access modifiers changed from: package-private */
            public void applyDelta(Constraint c) {
                for (int i = 0; i < this.mCountInt; i++) {
                    ConstraintSet.setDeltaValue(c, this.mTypeInt[i], this.mValueInt[i]);
                }
                for (int i2 = 0; i2 < this.mCountFloat; i2++) {
                    ConstraintSet.setDeltaValue(c, this.mTypeFloat[i2], this.mValueFloat[i2]);
                }
                for (int i3 = 0; i3 < this.mCountString; i3++) {
                    ConstraintSet.setDeltaValue(c, this.mTypeString[i3], this.mValueString[i3]);
                }
                for (int i4 = 0; i4 < this.mCountBoolean; i4++) {
                    ConstraintSet.setDeltaValue(c, this.mTypeBoolean[i4], this.mValueBoolean[i4]);
                }
            }

            /* access modifiers changed from: package-private */
            public void printDelta(String tag) {
                Log.v(tag, "int");
                for (int i = 0; i < this.mCountInt; i++) {
                    Log.v(tag, this.mTypeInt[i] + " = " + this.mValueInt[i]);
                }
                Log.v(tag, TypedValues.Custom.S_FLOAT);
                for (int i2 = 0; i2 < this.mCountFloat; i2++) {
                    Log.v(tag, this.mTypeFloat[i2] + " = " + this.mValueFloat[i2]);
                }
                Log.v(tag, "strings");
                for (int i3 = 0; i3 < this.mCountString; i3++) {
                    Log.v(tag, this.mTypeString[i3] + " = " + this.mValueString[i3]);
                }
                Log.v(tag, TypedValues.Custom.S_BOOLEAN);
                for (int i4 = 0; i4 < this.mCountBoolean; i4++) {
                    Log.v(tag, this.mTypeBoolean[i4] + " = " + this.mValueBoolean[i4]);
                }
            }
        }

        public void applyDelta(Constraint c) {
            if (this.mDelta != null) {
                this.mDelta.applyDelta(c);
            }
        }

        public void printDelta(String tag) {
            if (this.mDelta != null) {
                this.mDelta.printDelta(tag);
            } else {
                Log.v(tag, "DELTA IS NULL");
            }
        }

        private ConstraintAttribute get(String attributeName, ConstraintAttribute.AttributeType attributeType) {
            if (this.mCustomConstraints.containsKey(attributeName)) {
                ConstraintAttribute ret = this.mCustomConstraints.get(attributeName);
                if (ret.getType() == attributeType) {
                    return ret;
                }
                throw new IllegalArgumentException("ConstraintAttribute is already a " + ret.getType().name());
            }
            ConstraintAttribute ret2 = new ConstraintAttribute(attributeName, attributeType);
            this.mCustomConstraints.put(attributeName, ret2);
            return ret2;
        }

        /* access modifiers changed from: private */
        public void setStringValue(String attributeName, String value) {
            get(attributeName, ConstraintAttribute.AttributeType.STRING_TYPE).setStringValue(value);
        }

        /* access modifiers changed from: private */
        public void setFloatValue(String attributeName, float value) {
            get(attributeName, ConstraintAttribute.AttributeType.FLOAT_TYPE).setFloatValue(value);
        }

        /* access modifiers changed from: private */
        public void setIntValue(String attributeName, int value) {
            get(attributeName, ConstraintAttribute.AttributeType.INT_TYPE).setIntValue(value);
        }

        /* access modifiers changed from: private */
        public void setColorValue(String attributeName, int value) {
            get(attributeName, ConstraintAttribute.AttributeType.COLOR_TYPE).setColorValue(value);
        }

        public Constraint clone() {
            Constraint clone = new Constraint();
            clone.layout.copyFrom(this.layout);
            clone.motion.copyFrom(this.motion);
            clone.propertySet.copyFrom(this.propertySet);
            clone.transform.copyFrom(this.transform);
            clone.mViewId = this.mViewId;
            clone.mDelta = this.mDelta;
            return clone;
        }

        /* access modifiers changed from: private */
        public void fillFromConstraints(ConstraintHelper helper, int viewId, Constraints.LayoutParams param) {
            fillFromConstraints(viewId, param);
            if (helper instanceof Barrier) {
                this.layout.mHelperType = 1;
                Barrier barrier = (Barrier) helper;
                this.layout.mBarrierDirection = barrier.getType();
                this.layout.mReferenceIds = barrier.getReferencedIds();
                this.layout.mBarrierMargin = barrier.getMargin();
            }
        }

        /* access modifiers changed from: private */
        public void fillFromConstraints(int viewId, Constraints.LayoutParams param) {
            fillFrom(viewId, param);
            this.propertySet.alpha = param.alpha;
            this.transform.rotation = param.rotation;
            this.transform.rotationX = param.rotationX;
            this.transform.rotationY = param.rotationY;
            this.transform.scaleX = param.scaleX;
            this.transform.scaleY = param.scaleY;
            this.transform.transformPivotX = param.transformPivotX;
            this.transform.transformPivotY = param.transformPivotY;
            this.transform.translationX = param.translationX;
            this.transform.translationY = param.translationY;
            this.transform.translationZ = param.translationZ;
            this.transform.elevation = param.elevation;
            this.transform.applyElevation = param.applyElevation;
        }

        /* access modifiers changed from: private */
        public void fillFrom(int viewId, ConstraintLayout.LayoutParams param) {
            this.mViewId = viewId;
            this.layout.leftToLeft = param.leftToLeft;
            this.layout.leftToRight = param.leftToRight;
            this.layout.rightToLeft = param.rightToLeft;
            this.layout.rightToRight = param.rightToRight;
            this.layout.topToTop = param.topToTop;
            this.layout.topToBottom = param.topToBottom;
            this.layout.bottomToTop = param.bottomToTop;
            this.layout.bottomToBottom = param.bottomToBottom;
            this.layout.baselineToBaseline = param.baselineToBaseline;
            this.layout.baselineToTop = param.baselineToTop;
            this.layout.baselineToBottom = param.baselineToBottom;
            this.layout.startToEnd = param.startToEnd;
            this.layout.startToStart = param.startToStart;
            this.layout.endToStart = param.endToStart;
            this.layout.endToEnd = param.endToEnd;
            this.layout.horizontalBias = param.horizontalBias;
            this.layout.verticalBias = param.verticalBias;
            this.layout.dimensionRatio = param.dimensionRatio;
            this.layout.circleConstraint = param.circleConstraint;
            this.layout.circleRadius = param.circleRadius;
            this.layout.circleAngle = param.circleAngle;
            this.layout.editorAbsoluteX = param.editorAbsoluteX;
            this.layout.editorAbsoluteY = param.editorAbsoluteY;
            this.layout.orientation = param.orientation;
            this.layout.guidePercent = param.guidePercent;
            this.layout.guideBegin = param.guideBegin;
            this.layout.guideEnd = param.guideEnd;
            this.layout.mWidth = param.width;
            this.layout.mHeight = param.height;
            this.layout.leftMargin = param.leftMargin;
            this.layout.rightMargin = param.rightMargin;
            this.layout.topMargin = param.topMargin;
            this.layout.bottomMargin = param.bottomMargin;
            this.layout.baselineMargin = param.baselineMargin;
            this.layout.verticalWeight = param.verticalWeight;
            this.layout.horizontalWeight = param.horizontalWeight;
            this.layout.verticalChainStyle = param.verticalChainStyle;
            this.layout.horizontalChainStyle = param.horizontalChainStyle;
            this.layout.constrainedWidth = param.constrainedWidth;
            this.layout.constrainedHeight = param.constrainedHeight;
            this.layout.widthDefault = param.matchConstraintDefaultWidth;
            this.layout.heightDefault = param.matchConstraintDefaultHeight;
            this.layout.widthMax = param.matchConstraintMaxWidth;
            this.layout.heightMax = param.matchConstraintMaxHeight;
            this.layout.widthMin = param.matchConstraintMinWidth;
            this.layout.heightMin = param.matchConstraintMinHeight;
            this.layout.widthPercent = param.matchConstraintPercentWidth;
            this.layout.heightPercent = param.matchConstraintPercentHeight;
            this.layout.mConstraintTag = param.constraintTag;
            this.layout.goneTopMargin = param.goneTopMargin;
            this.layout.goneBottomMargin = param.goneBottomMargin;
            this.layout.goneLeftMargin = param.goneLeftMargin;
            this.layout.goneRightMargin = param.goneRightMargin;
            this.layout.goneStartMargin = param.goneStartMargin;
            this.layout.goneEndMargin = param.goneEndMargin;
            this.layout.goneBaselineMargin = param.goneBaselineMargin;
            this.layout.mWrapBehavior = param.wrapBehaviorInParent;
            this.layout.endMargin = param.getMarginEnd();
            this.layout.startMargin = param.getMarginStart();
        }

        public void applyTo(ConstraintLayout.LayoutParams param) {
            param.leftToLeft = this.layout.leftToLeft;
            param.leftToRight = this.layout.leftToRight;
            param.rightToLeft = this.layout.rightToLeft;
            param.rightToRight = this.layout.rightToRight;
            param.topToTop = this.layout.topToTop;
            param.topToBottom = this.layout.topToBottom;
            param.bottomToTop = this.layout.bottomToTop;
            param.bottomToBottom = this.layout.bottomToBottom;
            param.baselineToBaseline = this.layout.baselineToBaseline;
            param.baselineToTop = this.layout.baselineToTop;
            param.baselineToBottom = this.layout.baselineToBottom;
            param.startToEnd = this.layout.startToEnd;
            param.startToStart = this.layout.startToStart;
            param.endToStart = this.layout.endToStart;
            param.endToEnd = this.layout.endToEnd;
            param.leftMargin = this.layout.leftMargin;
            param.rightMargin = this.layout.rightMargin;
            param.topMargin = this.layout.topMargin;
            param.bottomMargin = this.layout.bottomMargin;
            param.goneStartMargin = this.layout.goneStartMargin;
            param.goneEndMargin = this.layout.goneEndMargin;
            param.goneTopMargin = this.layout.goneTopMargin;
            param.goneBottomMargin = this.layout.goneBottomMargin;
            param.horizontalBias = this.layout.horizontalBias;
            param.verticalBias = this.layout.verticalBias;
            param.circleConstraint = this.layout.circleConstraint;
            param.circleRadius = this.layout.circleRadius;
            param.circleAngle = this.layout.circleAngle;
            param.dimensionRatio = this.layout.dimensionRatio;
            param.editorAbsoluteX = this.layout.editorAbsoluteX;
            param.editorAbsoluteY = this.layout.editorAbsoluteY;
            param.verticalWeight = this.layout.verticalWeight;
            param.horizontalWeight = this.layout.horizontalWeight;
            param.verticalChainStyle = this.layout.verticalChainStyle;
            param.horizontalChainStyle = this.layout.horizontalChainStyle;
            param.constrainedWidth = this.layout.constrainedWidth;
            param.constrainedHeight = this.layout.constrainedHeight;
            param.matchConstraintDefaultWidth = this.layout.widthDefault;
            param.matchConstraintDefaultHeight = this.layout.heightDefault;
            param.matchConstraintMaxWidth = this.layout.widthMax;
            param.matchConstraintMaxHeight = this.layout.heightMax;
            param.matchConstraintMinWidth = this.layout.widthMin;
            param.matchConstraintMinHeight = this.layout.heightMin;
            param.matchConstraintPercentWidth = this.layout.widthPercent;
            param.matchConstraintPercentHeight = this.layout.heightPercent;
            param.orientation = this.layout.orientation;
            param.guidePercent = this.layout.guidePercent;
            param.guideBegin = this.layout.guideBegin;
            param.guideEnd = this.layout.guideEnd;
            param.width = this.layout.mWidth;
            param.height = this.layout.mHeight;
            if (this.layout.mConstraintTag != null) {
                param.constraintTag = this.layout.mConstraintTag;
            }
            param.wrapBehaviorInParent = this.layout.mWrapBehavior;
            param.setMarginStart(this.layout.startMargin);
            param.setMarginEnd(this.layout.endMargin);
            param.validate();
        }
    }

    public void clone(Context context, int constraintLayoutId) {
        clone((ConstraintLayout) LayoutInflater.from(context).inflate(constraintLayoutId, (ViewGroup) null));
    }

    public void clone(ConstraintSet set) {
        this.mConstraints.clear();
        for (Integer key : set.mConstraints.keySet()) {
            Constraint constraint = set.mConstraints.get(key);
            if (constraint != null) {
                this.mConstraints.put(key, constraint.clone());
            }
        }
    }

    public void clone(ConstraintLayout constraintLayout) {
        int count = constraintLayout.getChildCount();
        this.mConstraints.clear();
        int i = 0;
        while (i < count) {
            View view = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams param = (ConstraintLayout.LayoutParams) view.getLayoutParams();
            int id = view.getId();
            if (!this.mForceId || id != -1) {
                if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                    this.mConstraints.put(Integer.valueOf(id), new Constraint());
                }
                Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
                if (constraint != null) {
                    constraint.mCustomConstraints = ConstraintAttribute.extractAttributes(this.mSavedAttributes, view);
                    constraint.fillFrom(id, param);
                    constraint.propertySet.visibility = view.getVisibility();
                    constraint.propertySet.alpha = view.getAlpha();
                    constraint.transform.rotation = view.getRotation();
                    constraint.transform.rotationX = view.getRotationX();
                    constraint.transform.rotationY = view.getRotationY();
                    constraint.transform.scaleX = view.getScaleX();
                    constraint.transform.scaleY = view.getScaleY();
                    float pivotX = view.getPivotX();
                    float pivotY = view.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        constraint.transform.transformPivotX = pivotX;
                        constraint.transform.transformPivotY = pivotY;
                    }
                    constraint.transform.translationX = view.getTranslationX();
                    constraint.transform.translationY = view.getTranslationY();
                    constraint.transform.translationZ = view.getTranslationZ();
                    if (constraint.transform.applyElevation) {
                        constraint.transform.elevation = view.getElevation();
                    }
                    if (view instanceof Barrier) {
                        Barrier barrier = (Barrier) view;
                        constraint.layout.mBarrierAllowsGoneWidgets = barrier.getAllowsGoneWidget();
                        constraint.layout.mReferenceIds = barrier.getReferencedIds();
                        constraint.layout.mBarrierDirection = barrier.getType();
                        constraint.layout.mBarrierMargin = barrier.getMargin();
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void clone(Constraints constraints) {
        int count = constraints.getChildCount();
        this.mConstraints.clear();
        int i = 0;
        while (i < count) {
            View view = constraints.getChildAt(i);
            Constraints.LayoutParams param = (Constraints.LayoutParams) view.getLayoutParams();
            int id = view.getId();
            if (!this.mForceId || id != -1) {
                if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                    this.mConstraints.put(Integer.valueOf(id), new Constraint());
                }
                Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
                if (constraint != null) {
                    if (view instanceof ConstraintHelper) {
                        constraint.fillFromConstraints((ConstraintHelper) view, id, param);
                    }
                    constraint.fillFromConstraints(id, param);
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void applyTo(ConstraintLayout constraintLayout) {
        applyToInternal(constraintLayout, true);
        constraintLayout.setConstraintSet((ConstraintSet) null);
        constraintLayout.requestLayout();
    }

    public void applyToWithoutCustom(ConstraintLayout constraintLayout) {
        applyToInternal(constraintLayout, false);
        constraintLayout.setConstraintSet((ConstraintSet) null);
    }

    public void applyCustomAttributes(ConstraintLayout constraintLayout) {
        Constraint constraint;
        int count = constraintLayout.getChildCount();
        for (int i = 0; i < count; i++) {
            View view = constraintLayout.getChildAt(i);
            int id = view.getId();
            if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                Log.w(TAG, "id unknown " + Debug.getName(view));
            } else if (this.mForceId && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.mConstraints.containsKey(Integer.valueOf(id)) && (constraint = this.mConstraints.get(Integer.valueOf(id))) != null) {
                ConstraintAttribute.setAttributes(view, constraint.mCustomConstraints);
            }
        }
    }

    public void applyToHelper(ConstraintHelper helper, ConstraintWidget child, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> mapIdToWidget) {
        Constraint constraint;
        int id = helper.getId();
        if (this.mConstraints.containsKey(Integer.valueOf(id)) && (constraint = this.mConstraints.get(Integer.valueOf(id))) != null && (child instanceof HelperWidget)) {
            helper.loadParameters(constraint, (HelperWidget) child, layoutParams, mapIdToWidget);
        }
    }

    public void applyToLayoutParams(int id, ConstraintLayout.LayoutParams layoutParams) {
        Constraint constraint;
        if (this.mConstraints.containsKey(Integer.valueOf(id)) && (constraint = this.mConstraints.get(Integer.valueOf(id))) != null) {
            constraint.applyTo(layoutParams);
        }
    }

    /* access modifiers changed from: package-private */
    public void applyToInternal(ConstraintLayout constraintLayout, boolean applyPostLayout) {
        int count = constraintLayout.getChildCount();
        HashSet<Integer> used = new HashSet<>(this.mConstraints.keySet());
        for (int i = 0; i < count; i++) {
            View view = constraintLayout.getChildAt(i);
            int id = view.getId();
            if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                Log.w(TAG, "id unknown " + Debug.getName(view));
            } else if (this.mForceId && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.mConstraints.containsKey(Integer.valueOf(id))) {
                    used.remove(Integer.valueOf(id));
                    Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
                    if (constraint != null) {
                        if (view instanceof Barrier) {
                            constraint.layout.mHelperType = 1;
                            Barrier barrier = (Barrier) view;
                            barrier.setId(id);
                            barrier.setType(constraint.layout.mBarrierDirection);
                            barrier.setMargin(constraint.layout.mBarrierMargin);
                            barrier.setAllowsGoneWidget(constraint.layout.mBarrierAllowsGoneWidgets);
                            if (constraint.layout.mReferenceIds != null) {
                                barrier.setReferencedIds(constraint.layout.mReferenceIds);
                            } else if (constraint.layout.mReferenceIdString != null) {
                                constraint.layout.mReferenceIds = convertReferenceString(barrier, constraint.layout.mReferenceIdString);
                                barrier.setReferencedIds(constraint.layout.mReferenceIds);
                            }
                        }
                        ConstraintLayout.LayoutParams param = (ConstraintLayout.LayoutParams) view.getLayoutParams();
                        param.validate();
                        constraint.applyTo(param);
                        if (applyPostLayout) {
                            ConstraintAttribute.setAttributes(view, constraint.mCustomConstraints);
                        }
                        view.setLayoutParams(param);
                        if (constraint.propertySet.mVisibilityMode == 0) {
                            view.setVisibility(constraint.propertySet.visibility);
                        }
                        view.setAlpha(constraint.propertySet.alpha);
                        view.setRotation(constraint.transform.rotation);
                        view.setRotationX(constraint.transform.rotationX);
                        view.setRotationY(constraint.transform.rotationY);
                        view.setScaleX(constraint.transform.scaleX);
                        view.setScaleY(constraint.transform.scaleY);
                        if (constraint.transform.transformPivotTarget != -1) {
                            View center = ((View) view.getParent()).findViewById(constraint.transform.transformPivotTarget);
                            if (center != null) {
                                float cy = ((float) (center.getTop() + center.getBottom())) / 2.0f;
                                float cx = ((float) (center.getLeft() + center.getRight())) / 2.0f;
                                if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                                    view.setPivotX(cx - ((float) view.getLeft()));
                                    view.setPivotY(cy - ((float) view.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(constraint.transform.transformPivotX)) {
                                view.setPivotX(constraint.transform.transformPivotX);
                            }
                            if (!Float.isNaN(constraint.transform.transformPivotY)) {
                                view.setPivotY(constraint.transform.transformPivotY);
                            }
                        }
                        view.setTranslationX(constraint.transform.translationX);
                        view.setTranslationY(constraint.transform.translationY);
                        view.setTranslationZ(constraint.transform.translationZ);
                        if (constraint.transform.applyElevation) {
                            view.setElevation(constraint.transform.elevation);
                        }
                    }
                } else {
                    Log.v(TAG, "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator<Integer> it = used.iterator();
        while (it.hasNext()) {
            Integer id2 = it.next();
            Constraint constraint2 = this.mConstraints.get(id2);
            if (constraint2 != null) {
                if (constraint2.layout.mHelperType == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(id2.intValue());
                    if (constraint2.layout.mReferenceIds != null) {
                        barrier2.setReferencedIds(constraint2.layout.mReferenceIds);
                    } else if (constraint2.layout.mReferenceIdString != null) {
                        constraint2.layout.mReferenceIds = convertReferenceString(barrier2, constraint2.layout.mReferenceIdString);
                        barrier2.setReferencedIds(constraint2.layout.mReferenceIds);
                    }
                    barrier2.setType(constraint2.layout.mBarrierDirection);
                    barrier2.setMargin(constraint2.layout.mBarrierMargin);
                    ConstraintLayout.LayoutParams param2 = constraintLayout.generateDefaultLayoutParams();
                    barrier2.validateParams();
                    constraint2.applyTo(param2);
                    constraintLayout.addView(barrier2, param2);
                }
                if (constraint2.layout.mIsGuideline) {
                    Guideline g = new Guideline(constraintLayout.getContext());
                    g.setId(id2.intValue());
                    ConstraintLayout.LayoutParams param3 = constraintLayout.generateDefaultLayoutParams();
                    constraint2.applyTo(param3);
                    constraintLayout.addView(g, param3);
                }
            }
        }
        for (int i2 = 0; i2 < count; i2++) {
            View view2 = constraintLayout.getChildAt(i2);
            if (view2 instanceof ConstraintHelper) {
                ((ConstraintHelper) view2).applyLayoutFeaturesInConstraintSet(constraintLayout);
            }
        }
    }

    public void center(int centerID, int firstID, int firstSide, int firstMargin, int secondId, int secondSide, int secondMargin, float bias) {
        int i = firstSide;
        float f = bias;
        if (firstMargin < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (secondMargin < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (f <= 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        } else if (i == 1 || i == 2) {
            int i2 = centerID;
            connect(i2, 1, firstID, firstSide, firstMargin);
            connect(i2, 2, secondId, secondSide, secondMargin);
            Constraint constraint = this.mConstraints.get(Integer.valueOf(centerID));
            if (constraint != null) {
                constraint.layout.horizontalBias = f;
            }
        } else if (i == 6 || i == 7) {
            int i3 = centerID;
            connect(i3, 6, firstID, firstSide, firstMargin);
            connect(i3, 7, secondId, secondSide, secondMargin);
            Constraint constraint2 = this.mConstraints.get(Integer.valueOf(centerID));
            if (constraint2 != null) {
                constraint2.layout.horizontalBias = f;
            }
        } else {
            int i4 = centerID;
            connect(i4, 3, firstID, firstSide, firstMargin);
            connect(i4, 4, secondId, secondSide, secondMargin);
            Constraint constraint3 = this.mConstraints.get(Integer.valueOf(centerID));
            if (constraint3 != null) {
                constraint3.layout.verticalBias = f;
            }
        }
    }

    public void centerHorizontally(int centerID, int leftId, int leftSide, int leftMargin, int rightId, int rightSide, int rightMargin, float bias) {
        connect(centerID, 1, leftId, leftSide, leftMargin);
        connect(centerID, 2, rightId, rightSide, rightMargin);
        Constraint constraint = this.mConstraints.get(Integer.valueOf(centerID));
        if (constraint != null) {
            constraint.layout.horizontalBias = bias;
            return;
        }
        float f = bias;
    }

    public void centerHorizontallyRtl(int centerID, int startId, int startSide, int startMargin, int endId, int endSide, int endMargin, float bias) {
        connect(centerID, 6, startId, startSide, startMargin);
        connect(centerID, 7, endId, endSide, endMargin);
        Constraint constraint = this.mConstraints.get(Integer.valueOf(centerID));
        if (constraint != null) {
            constraint.layout.horizontalBias = bias;
            return;
        }
        float f = bias;
    }

    public void centerVertically(int centerID, int topId, int topSide, int topMargin, int bottomId, int bottomSide, int bottomMargin, float bias) {
        connect(centerID, 3, topId, topSide, topMargin);
        connect(centerID, 4, bottomId, bottomSide, bottomMargin);
        Constraint constraint = this.mConstraints.get(Integer.valueOf(centerID));
        if (constraint != null) {
            constraint.layout.verticalBias = bias;
            return;
        }
        float f = bias;
    }

    public void createVerticalChain(int topId, int topSide, int bottomId, int bottomSide, int[] chainIds, float[] weights, int style) {
        if (chainIds.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        } else if (weights == null || weights.length == chainIds.length) {
            if (weights != null) {
                get(chainIds[0]).layout.verticalWeight = weights[0];
            }
            get(chainIds[0]).layout.verticalChainStyle = style;
            connect(chainIds[0], 3, topId, topSide, 0);
            for (int i = 1; i < chainIds.length; i++) {
                connect(chainIds[i], 3, chainIds[i - 1], 4, 0);
                connect(chainIds[i - 1], 4, chainIds[i], 3, 0);
                if (weights != null) {
                    get(chainIds[i]).layout.verticalWeight = weights[i];
                }
            }
            connect(chainIds[chainIds.length - 1], 4, bottomId, bottomSide, 0);
        } else {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
    }

    public void createHorizontalChain(int leftId, int leftSide, int rightId, int rightSide, int[] chainIds, float[] weights, int style) {
        createHorizontalChain(leftId, leftSide, rightId, rightSide, chainIds, weights, style, 1, 2);
    }

    public void createHorizontalChainRtl(int startId, int startSide, int endId, int endSide, int[] chainIds, float[] weights, int style) {
        createHorizontalChain(startId, startSide, endId, endSide, chainIds, weights, style, 6, 7);
    }

    private void createHorizontalChain(int leftId, int leftSide, int rightId, int rightSide, int[] chainIds, float[] weights, int style, int left, int right) {
        int[] iArr = chainIds;
        float[] fArr = weights;
        if (iArr.length < 2) {
            int i = style;
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        } else if (fArr == null || fArr.length == iArr.length) {
            if (fArr != null) {
                get(iArr[0]).layout.horizontalWeight = fArr[0];
            }
            get(iArr[0]).layout.horizontalChainStyle = style;
            connect(iArr[0], left, leftId, leftSide, -1);
            for (int i2 = 1; i2 < iArr.length; i2++) {
                connect(iArr[i2], left, iArr[i2 - 1], right, -1);
                connect(iArr[i2 - 1], right, iArr[i2], left, -1);
                if (fArr != null) {
                    get(iArr[i2]).layout.horizontalWeight = fArr[i2];
                }
            }
            connect(iArr[iArr.length - 1], right, rightId, rightSide, -1);
        } else {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
    }

    public void connect(int startID, int startSide, int endID, int endSide, int margin) {
        if (!this.mConstraints.containsKey(Integer.valueOf(startID))) {
            this.mConstraints.put(Integer.valueOf(startID), new Constraint());
        }
        Constraint constraint = this.mConstraints.get(Integer.valueOf(startID));
        if (constraint != null) {
            switch (startSide) {
                case 1:
                    if (endSide == 1) {
                        constraint.layout.leftToLeft = endID;
                        constraint.layout.leftToRight = -1;
                    } else if (endSide == 2) {
                        constraint.layout.leftToRight = endID;
                        constraint.layout.leftToLeft = -1;
                    } else {
                        throw new IllegalArgumentException("Left to " + sideToString(endSide) + " undefined");
                    }
                    constraint.layout.leftMargin = margin;
                    return;
                case 2:
                    if (endSide == 1) {
                        constraint.layout.rightToLeft = endID;
                        constraint.layout.rightToRight = -1;
                    } else if (endSide == 2) {
                        constraint.layout.rightToRight = endID;
                        constraint.layout.rightToLeft = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                    }
                    constraint.layout.rightMargin = margin;
                    return;
                case 3:
                    if (endSide == 3) {
                        constraint.layout.topToTop = endID;
                        constraint.layout.topToBottom = -1;
                        constraint.layout.baselineToBaseline = -1;
                        constraint.layout.baselineToTop = -1;
                        constraint.layout.baselineToBottom = -1;
                    } else if (endSide == 4) {
                        constraint.layout.topToBottom = endID;
                        constraint.layout.topToTop = -1;
                        constraint.layout.baselineToBaseline = -1;
                        constraint.layout.baselineToTop = -1;
                        constraint.layout.baselineToBottom = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                    }
                    constraint.layout.topMargin = margin;
                    return;
                case 4:
                    if (endSide == 4) {
                        constraint.layout.bottomToBottom = endID;
                        constraint.layout.bottomToTop = -1;
                        constraint.layout.baselineToBaseline = -1;
                        constraint.layout.baselineToTop = -1;
                        constraint.layout.baselineToBottom = -1;
                    } else if (endSide == 3) {
                        constraint.layout.bottomToTop = endID;
                        constraint.layout.bottomToBottom = -1;
                        constraint.layout.baselineToBaseline = -1;
                        constraint.layout.baselineToTop = -1;
                        constraint.layout.baselineToBottom = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                    }
                    constraint.layout.bottomMargin = margin;
                    return;
                case 5:
                    if (endSide == 5) {
                        constraint.layout.baselineToBaseline = endID;
                        constraint.layout.bottomToBottom = -1;
                        constraint.layout.bottomToTop = -1;
                        constraint.layout.topToTop = -1;
                        constraint.layout.topToBottom = -1;
                        return;
                    } else if (endSide == 3) {
                        constraint.layout.baselineToTop = endID;
                        constraint.layout.bottomToBottom = -1;
                        constraint.layout.bottomToTop = -1;
                        constraint.layout.topToTop = -1;
                        constraint.layout.topToBottom = -1;
                        return;
                    } else if (endSide == 4) {
                        constraint.layout.baselineToBottom = endID;
                        constraint.layout.bottomToBottom = -1;
                        constraint.layout.bottomToTop = -1;
                        constraint.layout.topToTop = -1;
                        constraint.layout.topToBottom = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                    }
                case 6:
                    if (endSide == 6) {
                        constraint.layout.startToStart = endID;
                        constraint.layout.startToEnd = -1;
                    } else if (endSide == 7) {
                        constraint.layout.startToEnd = endID;
                        constraint.layout.startToStart = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                    }
                    constraint.layout.startMargin = margin;
                    return;
                case 7:
                    if (endSide == 7) {
                        constraint.layout.endToEnd = endID;
                        constraint.layout.endToStart = -1;
                    } else if (endSide == 6) {
                        constraint.layout.endToStart = endID;
                        constraint.layout.endToEnd = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                    }
                    constraint.layout.endMargin = margin;
                    return;
                default:
                    throw new IllegalArgumentException(sideToString(startSide) + " to " + sideToString(endSide) + " unknown");
            }
        }
    }

    public void connect(int startID, int startSide, int endID, int endSide) {
        if (!this.mConstraints.containsKey(Integer.valueOf(startID))) {
            this.mConstraints.put(Integer.valueOf(startID), new Constraint());
        }
        Constraint constraint = this.mConstraints.get(Integer.valueOf(startID));
        if (constraint != null) {
            switch (startSide) {
                case 1:
                    if (endSide == 1) {
                        constraint.layout.leftToLeft = endID;
                        constraint.layout.leftToRight = -1;
                        return;
                    } else if (endSide == 2) {
                        constraint.layout.leftToRight = endID;
                        constraint.layout.leftToLeft = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("left to " + sideToString(endSide) + " undefined");
                    }
                case 2:
                    if (endSide == 1) {
                        constraint.layout.rightToLeft = endID;
                        constraint.layout.rightToRight = -1;
                        return;
                    } else if (endSide == 2) {
                        constraint.layout.rightToRight = endID;
                        constraint.layout.rightToLeft = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                    }
                case 3:
                    if (endSide == 3) {
                        constraint.layout.topToTop = endID;
                        constraint.layout.topToBottom = -1;
                        constraint.layout.baselineToBaseline = -1;
                        constraint.layout.baselineToTop = -1;
                        constraint.layout.baselineToBottom = -1;
                        return;
                    } else if (endSide == 4) {
                        constraint.layout.topToBottom = endID;
                        constraint.layout.topToTop = -1;
                        constraint.layout.baselineToBaseline = -1;
                        constraint.layout.baselineToTop = -1;
                        constraint.layout.baselineToBottom = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                    }
                case 4:
                    if (endSide == 4) {
                        constraint.layout.bottomToBottom = endID;
                        constraint.layout.bottomToTop = -1;
                        constraint.layout.baselineToBaseline = -1;
                        constraint.layout.baselineToTop = -1;
                        constraint.layout.baselineToBottom = -1;
                        return;
                    } else if (endSide == 3) {
                        constraint.layout.bottomToTop = endID;
                        constraint.layout.bottomToBottom = -1;
                        constraint.layout.baselineToBaseline = -1;
                        constraint.layout.baselineToTop = -1;
                        constraint.layout.baselineToBottom = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                    }
                case 5:
                    if (endSide == 5) {
                        constraint.layout.baselineToBaseline = endID;
                        constraint.layout.bottomToBottom = -1;
                        constraint.layout.bottomToTop = -1;
                        constraint.layout.topToTop = -1;
                        constraint.layout.topToBottom = -1;
                        return;
                    } else if (endSide == 3) {
                        constraint.layout.baselineToTop = endID;
                        constraint.layout.bottomToBottom = -1;
                        constraint.layout.bottomToTop = -1;
                        constraint.layout.topToTop = -1;
                        constraint.layout.topToBottom = -1;
                        return;
                    } else if (endSide == 4) {
                        constraint.layout.baselineToBottom = endID;
                        constraint.layout.bottomToBottom = -1;
                        constraint.layout.bottomToTop = -1;
                        constraint.layout.topToTop = -1;
                        constraint.layout.topToBottom = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                    }
                case 6:
                    if (endSide == 6) {
                        constraint.layout.startToStart = endID;
                        constraint.layout.startToEnd = -1;
                        return;
                    } else if (endSide == 7) {
                        constraint.layout.startToEnd = endID;
                        constraint.layout.startToStart = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                    }
                case 7:
                    if (endSide == 7) {
                        constraint.layout.endToEnd = endID;
                        constraint.layout.endToStart = -1;
                        return;
                    } else if (endSide == 6) {
                        constraint.layout.endToStart = endID;
                        constraint.layout.endToEnd = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(endSide) + " undefined");
                    }
                default:
                    throw new IllegalArgumentException(sideToString(startSide) + " to " + sideToString(endSide) + " unknown");
            }
        }
    }

    public void centerHorizontally(int viewId, int toView) {
        if (toView == 0) {
            center(viewId, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            center(viewId, toView, 2, 0, toView, 1, 0, 0.5f);
        }
    }

    public void centerHorizontallyRtl(int viewId, int toView) {
        if (toView == 0) {
            center(viewId, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            center(viewId, toView, 7, 0, toView, 6, 0, 0.5f);
        }
    }

    public void centerVertically(int viewId, int toView) {
        if (toView == 0) {
            center(viewId, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            center(viewId, toView, 4, 0, toView, 3, 0, 0.5f);
        }
    }

    public void clear(int viewId) {
        this.mConstraints.remove(Integer.valueOf(viewId));
    }

    public void clear(int viewId, int anchor) {
        Constraint constraint;
        if (this.mConstraints.containsKey(Integer.valueOf(viewId)) && (constraint = this.mConstraints.get(Integer.valueOf(viewId))) != null) {
            switch (anchor) {
                case 1:
                    constraint.layout.leftToRight = -1;
                    constraint.layout.leftToLeft = -1;
                    constraint.layout.leftMargin = -1;
                    constraint.layout.goneLeftMargin = Integer.MIN_VALUE;
                    return;
                case 2:
                    constraint.layout.rightToRight = -1;
                    constraint.layout.rightToLeft = -1;
                    constraint.layout.rightMargin = -1;
                    constraint.layout.goneRightMargin = Integer.MIN_VALUE;
                    return;
                case 3:
                    constraint.layout.topToBottom = -1;
                    constraint.layout.topToTop = -1;
                    constraint.layout.topMargin = 0;
                    constraint.layout.goneTopMargin = Integer.MIN_VALUE;
                    return;
                case 4:
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.bottomMargin = 0;
                    constraint.layout.goneBottomMargin = Integer.MIN_VALUE;
                    return;
                case 5:
                    constraint.layout.baselineToBaseline = -1;
                    constraint.layout.baselineToTop = -1;
                    constraint.layout.baselineToBottom = -1;
                    constraint.layout.baselineMargin = 0;
                    constraint.layout.goneBaselineMargin = Integer.MIN_VALUE;
                    return;
                case 6:
                    constraint.layout.startToEnd = -1;
                    constraint.layout.startToStart = -1;
                    constraint.layout.startMargin = 0;
                    constraint.layout.goneStartMargin = Integer.MIN_VALUE;
                    return;
                case 7:
                    constraint.layout.endToStart = -1;
                    constraint.layout.endToEnd = -1;
                    constraint.layout.endMargin = 0;
                    constraint.layout.goneEndMargin = Integer.MIN_VALUE;
                    return;
                case 8:
                    constraint.layout.circleAngle = -1.0f;
                    constraint.layout.circleRadius = -1;
                    constraint.layout.circleConstraint = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void setMargin(int viewId, int anchor, int value) {
        Constraint constraint = get(viewId);
        switch (anchor) {
            case 1:
                constraint.layout.leftMargin = value;
                return;
            case 2:
                constraint.layout.rightMargin = value;
                return;
            case 3:
                constraint.layout.topMargin = value;
                return;
            case 4:
                constraint.layout.bottomMargin = value;
                return;
            case 5:
                constraint.layout.baselineMargin = value;
                return;
            case 6:
                constraint.layout.startMargin = value;
                return;
            case 7:
                constraint.layout.endMargin = value;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setGoneMargin(int viewId, int anchor, int value) {
        Constraint constraint = get(viewId);
        switch (anchor) {
            case 1:
                constraint.layout.goneLeftMargin = value;
                return;
            case 2:
                constraint.layout.goneRightMargin = value;
                return;
            case 3:
                constraint.layout.goneTopMargin = value;
                return;
            case 4:
                constraint.layout.goneBottomMargin = value;
                return;
            case 5:
                constraint.layout.goneBaselineMargin = value;
                return;
            case 6:
                constraint.layout.goneStartMargin = value;
                return;
            case 7:
                constraint.layout.goneEndMargin = value;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setHorizontalBias(int viewId, float bias) {
        get(viewId).layout.horizontalBias = bias;
    }

    public void setVerticalBias(int viewId, float bias) {
        get(viewId).layout.verticalBias = bias;
    }

    public void setDimensionRatio(int viewId, String ratio) {
        get(viewId).layout.dimensionRatio = ratio;
    }

    public void setVisibility(int viewId, int visibility) {
        get(viewId).propertySet.visibility = visibility;
    }

    public void setVisibilityMode(int viewId, int visibilityMode) {
        get(viewId).propertySet.mVisibilityMode = visibilityMode;
    }

    public int getVisibilityMode(int viewId) {
        return get(viewId).propertySet.mVisibilityMode;
    }

    public int getVisibility(int viewId) {
        return get(viewId).propertySet.visibility;
    }

    public int getHeight(int viewId) {
        return get(viewId).layout.mHeight;
    }

    public int getWidth(int viewId) {
        return get(viewId).layout.mWidth;
    }

    public void setAlpha(int viewId, float alpha) {
        get(viewId).propertySet.alpha = alpha;
    }

    public boolean getApplyElevation(int viewId) {
        return get(viewId).transform.applyElevation;
    }

    public void setApplyElevation(int viewId, boolean apply) {
        get(viewId).transform.applyElevation = apply;
    }

    public void setElevation(int viewId, float elevation) {
        get(viewId).transform.elevation = elevation;
        get(viewId).transform.applyElevation = true;
    }

    public void setRotation(int viewId, float rotation) {
        get(viewId).transform.rotation = rotation;
    }

    public void setRotationX(int viewId, float rotationX) {
        get(viewId).transform.rotationX = rotationX;
    }

    public void setRotationY(int viewId, float rotationY) {
        get(viewId).transform.rotationY = rotationY;
    }

    public void setScaleX(int viewId, float scaleX) {
        get(viewId).transform.scaleX = scaleX;
    }

    public void setScaleY(int viewId, float scaleY) {
        get(viewId).transform.scaleY = scaleY;
    }

    public void setTransformPivotX(int viewId, float transformPivotX) {
        get(viewId).transform.transformPivotX = transformPivotX;
    }

    public void setTransformPivotY(int viewId, float transformPivotY) {
        get(viewId).transform.transformPivotY = transformPivotY;
    }

    public void setTransformPivot(int viewId, float transformPivotX, float transformPivotY) {
        Constraint constraint = get(viewId);
        constraint.transform.transformPivotY = transformPivotY;
        constraint.transform.transformPivotX = transformPivotX;
    }

    public void setTranslationX(int viewId, float translationX) {
        get(viewId).transform.translationX = translationX;
    }

    public void setTranslationY(int viewId, float translationY) {
        get(viewId).transform.translationY = translationY;
    }

    public void setTranslation(int viewId, float translationX, float translationY) {
        Constraint constraint = get(viewId);
        constraint.transform.translationX = translationX;
        constraint.transform.translationY = translationY;
    }

    public void setTranslationZ(int viewId, float translationZ) {
        get(viewId).transform.translationZ = translationZ;
    }

    public void setEditorAbsoluteX(int viewId, int position) {
        get(viewId).layout.editorAbsoluteX = position;
    }

    public void setEditorAbsoluteY(int viewId, int position) {
        get(viewId).layout.editorAbsoluteY = position;
    }

    public void setLayoutWrapBehavior(int viewId, int behavior) {
        if (behavior >= 0 && behavior <= 3) {
            get(viewId).layout.mWrapBehavior = behavior;
        }
    }

    public void constrainHeight(int viewId, int height) {
        get(viewId).layout.mHeight = height;
    }

    public void constrainWidth(int viewId, int width) {
        get(viewId).layout.mWidth = width;
    }

    public void constrainCircle(int viewId, int id, int radius, float angle) {
        Constraint constraint = get(viewId);
        constraint.layout.circleConstraint = id;
        constraint.layout.circleRadius = radius;
        constraint.layout.circleAngle = angle;
    }

    public void constrainMaxHeight(int viewId, int height) {
        get(viewId).layout.heightMax = height;
    }

    public void constrainMaxWidth(int viewId, int width) {
        get(viewId).layout.widthMax = width;
    }

    public void constrainMinHeight(int viewId, int height) {
        get(viewId).layout.heightMin = height;
    }

    public void constrainMinWidth(int viewId, int width) {
        get(viewId).layout.widthMin = width;
    }

    public void constrainPercentWidth(int viewId, float percent) {
        get(viewId).layout.widthPercent = percent;
    }

    public void constrainPercentHeight(int viewId, float percent) {
        get(viewId).layout.heightPercent = percent;
    }

    public void constrainDefaultHeight(int viewId, int height) {
        get(viewId).layout.heightDefault = height;
    }

    public void constrainedWidth(int viewId, boolean constrained) {
        get(viewId).layout.constrainedWidth = constrained;
    }

    public void constrainedHeight(int viewId, boolean constrained) {
        get(viewId).layout.constrainedHeight = constrained;
    }

    public void constrainDefaultWidth(int viewId, int width) {
        get(viewId).layout.widthDefault = width;
    }

    public void setHorizontalWeight(int viewId, float weight) {
        get(viewId).layout.horizontalWeight = weight;
    }

    public void setVerticalWeight(int viewId, float weight) {
        get(viewId).layout.verticalWeight = weight;
    }

    public void setHorizontalChainStyle(int viewId, int chainStyle) {
        get(viewId).layout.horizontalChainStyle = chainStyle;
    }

    public void setVerticalChainStyle(int viewId, int chainStyle) {
        get(viewId).layout.verticalChainStyle = chainStyle;
    }

    public void addToHorizontalChain(int viewId, int leftId, int rightId) {
        connect(viewId, 1, leftId, leftId == 0 ? 1 : 2, 0);
        connect(viewId, 2, rightId, rightId == 0 ? 2 : 1, 0);
        if (leftId != 0) {
            connect(leftId, 2, viewId, 1, 0);
        }
        if (rightId != 0) {
            connect(rightId, 1, viewId, 2, 0);
        }
    }

    public void addToHorizontalChainRTL(int viewId, int leftId, int rightId) {
        connect(viewId, 6, leftId, leftId == 0 ? 6 : 7, 0);
        connect(viewId, 7, rightId, rightId == 0 ? 7 : 6, 0);
        if (leftId != 0) {
            connect(leftId, 7, viewId, 6, 0);
        }
        if (rightId != 0) {
            connect(rightId, 6, viewId, 7, 0);
        }
    }

    public void addToVerticalChain(int viewId, int topId, int bottomId) {
        connect(viewId, 3, topId, topId == 0 ? 3 : 4, 0);
        connect(viewId, 4, bottomId, bottomId == 0 ? 4 : 3, 0);
        if (topId != 0) {
            connect(topId, 4, viewId, 3, 0);
        }
        if (bottomId != 0) {
            connect(bottomId, 3, viewId, 4, 0);
        }
    }

    public void removeFromVerticalChain(int viewId) {
        if (this.mConstraints.containsKey(Integer.valueOf(viewId))) {
            Constraint constraint = this.mConstraints.get(Integer.valueOf(viewId));
            if (constraint != null) {
                int topId = constraint.layout.topToBottom;
                int bottomId = constraint.layout.bottomToTop;
                if (!(topId == -1 && bottomId == -1)) {
                    if (topId != -1 && bottomId != -1) {
                        connect(topId, 4, bottomId, 3, 0);
                        connect(bottomId, 3, topId, 4, 0);
                    } else if (constraint.layout.bottomToBottom != -1) {
                        connect(topId, 4, constraint.layout.bottomToBottom, 4, 0);
                    } else if (constraint.layout.topToTop != -1) {
                        connect(bottomId, 3, constraint.layout.topToTop, 3, 0);
                    }
                }
            } else {
                return;
            }
        }
        clear(viewId, 3);
        clear(viewId, 4);
    }

    public void removeFromHorizontalChain(int viewId) {
        Constraint constraint;
        if (this.mConstraints.containsKey(Integer.valueOf(viewId)) && (constraint = this.mConstraints.get(Integer.valueOf(viewId))) != null) {
            int leftId = constraint.layout.leftToRight;
            int rightId = constraint.layout.rightToLeft;
            if (leftId == -1 && rightId == -1) {
                int startId = constraint.layout.startToEnd;
                int endId = constraint.layout.endToStart;
                if (!(startId == -1 && endId == -1)) {
                    if (startId != -1 && endId != -1) {
                        connect(startId, 7, endId, 6, 0);
                        connect(endId, 6, leftId, 7, 0);
                    } else if (endId != -1) {
                        if (constraint.layout.rightToRight != -1) {
                            connect(leftId, 7, constraint.layout.rightToRight, 7, 0);
                        } else if (constraint.layout.leftToLeft != -1) {
                            connect(endId, 6, constraint.layout.leftToLeft, 6, 0);
                        }
                    }
                }
                clear(viewId, 6);
                clear(viewId, 7);
                return;
            }
            if (leftId != -1 && rightId != -1) {
                connect(leftId, 2, rightId, 1, 0);
                connect(rightId, 1, leftId, 2, 0);
            } else if (constraint.layout.rightToRight != -1) {
                connect(leftId, 2, constraint.layout.rightToRight, 2, 0);
            } else if (constraint.layout.leftToLeft != -1) {
                connect(rightId, 1, constraint.layout.leftToLeft, 1, 0);
            }
            clear(viewId, 1);
            clear(viewId, 2);
        }
    }

    public void create(int guidelineID, int orientation) {
        Constraint constraint = get(guidelineID);
        constraint.layout.mIsGuideline = true;
        constraint.layout.orientation = orientation;
    }

    public void createBarrier(int id, int direction, int margin, int... referenced) {
        Constraint constraint = get(id);
        constraint.layout.mHelperType = 1;
        constraint.layout.mBarrierDirection = direction;
        constraint.layout.mBarrierMargin = margin;
        constraint.layout.mIsGuideline = false;
        constraint.layout.mReferenceIds = referenced;
    }

    public void setGuidelineBegin(int guidelineID, int margin) {
        get(guidelineID).layout.guideBegin = margin;
        get(guidelineID).layout.guideEnd = -1;
        get(guidelineID).layout.guidePercent = -1.0f;
    }

    public void setGuidelineEnd(int guidelineID, int margin) {
        get(guidelineID).layout.guideEnd = margin;
        get(guidelineID).layout.guideBegin = -1;
        get(guidelineID).layout.guidePercent = -1.0f;
    }

    public void setGuidelinePercent(int guidelineID, float ratio) {
        get(guidelineID).layout.guidePercent = ratio;
        get(guidelineID).layout.guideEnd = -1;
        get(guidelineID).layout.guideBegin = -1;
    }

    public int[] getReferencedIds(int id) {
        Constraint constraint = get(id);
        if (constraint.layout.mReferenceIds == null) {
            return new int[0];
        }
        return Arrays.copyOf(constraint.layout.mReferenceIds, constraint.layout.mReferenceIds.length);
    }

    public void setReferencedIds(int id, int... referenced) {
        get(id).layout.mReferenceIds = referenced;
    }

    public void setBarrierType(int id, int type) {
        get(id).layout.mHelperType = type;
    }

    public void removeAttribute(String attributeName) {
        this.mSavedAttributes.remove(attributeName);
    }

    public void setIntValue(int viewId, String attributeName, int value) {
        get(viewId).setIntValue(attributeName, value);
    }

    public void setColorValue(int viewId, String attributeName, int value) {
        get(viewId).setColorValue(attributeName, value);
    }

    public void setFloatValue(int viewId, String attributeName, float value) {
        get(viewId).setFloatValue(attributeName, value);
    }

    public void setStringValue(int viewId, String attributeName, String value) {
        get(viewId).setStringValue(attributeName, value);
    }

    private void addAttributes(ConstraintAttribute.AttributeType attributeType, String... attributeName) {
        for (int i = 0; i < attributeName.length; i++) {
            if (this.mSavedAttributes.containsKey(attributeName[i])) {
                ConstraintAttribute constraintAttribute = this.mSavedAttributes.get(attributeName[i]);
                if (!(constraintAttribute == null || constraintAttribute.getType() == attributeType)) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute.getType().name());
                }
            } else {
                this.mSavedAttributes.put(attributeName[i], new ConstraintAttribute(attributeName[i], attributeType));
            }
        }
    }

    public void parseIntAttributes(Constraint set, String attributes) {
        String[] sp = attributes.split(",");
        for (int i = 0; i < sp.length; i++) {
            String[] attr = sp[i].split("=");
            if (attr.length != 2) {
                Log.w(TAG, " Unable to parse " + sp[i]);
            } else {
                set.setFloatValue(attr[0], (float) Integer.decode(attr[1]).intValue());
            }
        }
    }

    public void parseColorAttributes(Constraint set, String attributes) {
        String[] sp = attributes.split(",");
        for (int i = 0; i < sp.length; i++) {
            String[] attr = sp[i].split("=");
            if (attr.length != 2) {
                Log.w(TAG, " Unable to parse " + sp[i]);
            } else {
                set.setColorValue(attr[0], Color.parseColor(attr[1]));
            }
        }
    }

    public void parseFloatAttributes(Constraint set, String attributes) {
        String[] sp = attributes.split(",");
        for (int i = 0; i < sp.length; i++) {
            String[] attr = sp[i].split("=");
            if (attr.length != 2) {
                Log.w(TAG, " Unable to parse " + sp[i]);
            } else {
                set.setFloatValue(attr[0], Float.parseFloat(attr[1]));
            }
        }
    }

    public void parseStringAttributes(Constraint set, String attributes) {
        String[] sp = splitString(attributes);
        for (int i = 0; i < sp.length; i++) {
            String[] attr = sp[i].split("=");
            Log.w(TAG, " Unable to parse " + sp[i]);
            set.setStringValue(attr[0], attr[1]);
        }
    }

    private static String[] splitString(String str) {
        char[] chars = str.toCharArray();
        ArrayList<String> list = new ArrayList<>();
        boolean inDouble = false;
        int start = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ',' && !inDouble) {
                list.add(new String(chars, start, i - start));
                start = i + 1;
            } else if (chars[i] == '\"') {
                inDouble = !inDouble;
            }
        }
        list.add(new String(chars, start, chars.length - start));
        return (String[]) list.toArray(new String[list.size()]);
    }

    public void addIntAttributes(String... attributeName) {
        addAttributes(ConstraintAttribute.AttributeType.INT_TYPE, attributeName);
    }

    public void addColorAttributes(String... attributeName) {
        addAttributes(ConstraintAttribute.AttributeType.COLOR_TYPE, attributeName);
    }

    public void addFloatAttributes(String... attributeName) {
        addAttributes(ConstraintAttribute.AttributeType.FLOAT_TYPE, attributeName);
    }

    public void addStringAttributes(String... attributeName) {
        addAttributes(ConstraintAttribute.AttributeType.STRING_TYPE, attributeName);
    }

    private Constraint get(int id) {
        if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
            this.mConstraints.put(Integer.valueOf(id), new Constraint());
        }
        return this.mConstraints.get(Integer.valueOf(id));
    }

    private String sideToString(int side) {
        switch (side) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public void load(Context context, int resourceId) {
        XmlPullParser parser = context.getResources().getXml(resourceId);
        try {
            for (int eventType = parser.getEventType(); eventType != 1; eventType = parser.next()) {
                switch (eventType) {
                    case 0:
                    case 3:
                    case 4:
                        break;
                    case 2:
                        String tagName = parser.getName();
                        Constraint constraint = fillFromAttributeList(context, Xml.asAttributeSet(parser), false);
                        if (tagName.equalsIgnoreCase("Guideline")) {
                            constraint.layout.mIsGuideline = true;
                        }
                        this.mConstraints.put(Integer.valueOf(constraint.mViewId), constraint);
                        break;
                }
            }
        } catch (XmlPullParserException e) {
            Log.e(TAG, "Error parsing resource: " + resourceId, e);
        } catch (IOException e2) {
            Log.e(TAG, "Error parsing resource: " + resourceId, e2);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void load(android.content.Context r13, org.xmlpull.v1.XmlPullParser r14) {
        /*
            r12 = this;
            java.lang.String r0 = "Error parsing XML resource"
            java.lang.String r1 = "ConstraintSet"
            r2 = 0
            r3 = 0
            int r4 = r14.getEventType()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
        L_0x000a:
            r5 = 1
            if (r4 == r5) goto L_0x01ea
            r6 = 3
            r7 = 2
            r8 = -1
            r9 = 0
            switch(r4) {
                case 0: goto L_0x01de;
                case 1: goto L_0x0014;
                case 2: goto L_0x0066;
                case 3: goto L_0x0016;
                default: goto L_0x0014;
            }     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
        L_0x0014:
            goto L_0x01e3
        L_0x0016:
            java.lang.String r10 = r14.getName()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r2 = r10
            java.util.Locale r10 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.String r10 = r2.toLowerCase(r10)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            int r11 = r10.hashCode()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            switch(r11) {
                case -2075718416: goto L_0x0046;
                case -190376483: goto L_0x003d;
                case 426575017: goto L_0x0033;
                case 2146106725: goto L_0x0029;
                default: goto L_0x0028;
            }     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
        L_0x0028:
            goto L_0x0050
        L_0x0029:
            java.lang.String r5 = "constraintset"
            boolean r5 = r10.equals(r5)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            if (r5 == 0) goto L_0x0028
            r5 = r9
            goto L_0x0051
        L_0x0033:
            java.lang.String r5 = "constraintoverride"
            boolean r5 = r10.equals(r5)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            if (r5 == 0) goto L_0x0028
            r5 = r7
            goto L_0x0051
        L_0x003d:
            java.lang.String r6 = "constraint"
            boolean r6 = r10.equals(r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            if (r6 == 0) goto L_0x0028
            goto L_0x0051
        L_0x0046:
            java.lang.String r5 = "guideline"
            boolean r5 = r10.equals(r5)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            if (r5 == 0) goto L_0x0028
            r5 = r6
            goto L_0x0051
        L_0x0050:
            r5 = r8
        L_0x0051:
            switch(r5) {
                case 0: goto L_0x0062;
                case 1: goto L_0x0055;
                case 2: goto L_0x0055;
                case 3: goto L_0x0055;
                default: goto L_0x0054;
            }     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
        L_0x0054:
            goto L_0x0063
        L_0x0055:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r5 = r12.mConstraints     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            int r6 = r3.mViewId     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r5.put(r6, r3)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r3 = 0
            goto L_0x0063
        L_0x0062:
            return
        L_0x0063:
            r2 = 0
            goto L_0x01e3
        L_0x0066:
            java.lang.String r10 = r14.getName()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r2 = r10
            int r10 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            switch(r10) {
                case -2025855158: goto L_0x00d0;
                case -1984451626: goto L_0x00c6;
                case -1962203927: goto L_0x00bc;
                case -1269513683: goto L_0x00b2;
                case -1238332596: goto L_0x00a8;
                case -71750448: goto L_0x009e;
                case 366511058: goto L_0x0093;
                case 1331510167: goto L_0x008a;
                case 1791837707: goto L_0x007f;
                case 1803088381: goto L_0x0074;
                default: goto L_0x0072;
            }     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
        L_0x0072:
            goto L_0x00da
        L_0x0074:
            java.lang.String r6 = "Constraint"
            boolean r6 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            if (r6 == 0) goto L_0x0072
            r6 = r9
            goto L_0x00db
        L_0x007f:
            java.lang.String r6 = "CustomAttribute"
            boolean r6 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            if (r6 == 0) goto L_0x0072
            r6 = 8
            goto L_0x00db
        L_0x008a:
            java.lang.String r7 = "Barrier"
            boolean r7 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            if (r7 == 0) goto L_0x0072
            goto L_0x00db
        L_0x0093:
            java.lang.String r6 = "CustomMethod"
            boolean r6 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            if (r6 == 0) goto L_0x0072
            r6 = 9
            goto L_0x00db
        L_0x009e:
            java.lang.String r6 = "Guideline"
            boolean r6 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            if (r6 == 0) goto L_0x0072
            r6 = r7
            goto L_0x00db
        L_0x00a8:
            java.lang.String r6 = "Transform"
            boolean r6 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            if (r6 == 0) goto L_0x0072
            r6 = 5
            goto L_0x00db
        L_0x00b2:
            java.lang.String r6 = "PropertySet"
            boolean r6 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            if (r6 == 0) goto L_0x0072
            r6 = 4
            goto L_0x00db
        L_0x00bc:
            java.lang.String r6 = "ConstraintOverride"
            boolean r6 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            if (r6 == 0) goto L_0x0072
            r6 = r5
            goto L_0x00db
        L_0x00c6:
            java.lang.String r6 = "Motion"
            boolean r6 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            if (r6 == 0) goto L_0x0072
            r6 = 7
            goto L_0x00db
        L_0x00d0:
            java.lang.String r6 = "Layout"
            boolean r6 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            if (r6 == 0) goto L_0x0072
            r6 = 6
            goto L_0x00db
        L_0x00da:
            r6 = r8
        L_0x00db:
            java.lang.String r7 = "XML parser error must be within a Constraint "
            switch(r6) {
                case 0: goto L_0x01d2;
                case 1: goto L_0x01c7;
                case 2: goto L_0x01b4;
                case 3: goto L_0x01a5;
                case 4: goto L_0x017e;
                case 5: goto L_0x0156;
                case 6: goto L_0x012e;
                case 7: goto L_0x0106;
                case 8: goto L_0x00e2;
                case 9: goto L_0x00e2;
                default: goto L_0x00e0;
            }
        L_0x00e0:
            goto L_0x01dd
        L_0x00e2:
            if (r3 == 0) goto L_0x00eb
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r5 = r3.mCustomConstraints     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            androidx.constraintlayout.widget.ConstraintAttribute.parse(r13, r14, r5)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            goto L_0x01dd
        L_0x00eb:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            int r7 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.String r6 = r6.toString()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r5.<init>(r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            throw r5     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
        L_0x0106:
            if (r3 == 0) goto L_0x0113
            androidx.constraintlayout.widget.ConstraintSet$Motion r5 = r3.motion     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r5.fillFromAttributeList(r13, r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            goto L_0x01dd
        L_0x0113:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            int r7 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.String r6 = r6.toString()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r5.<init>(r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            throw r5     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
        L_0x012e:
            if (r3 == 0) goto L_0x013b
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r3.layout     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r5.fillFromAttributeList(r13, r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            goto L_0x01dd
        L_0x013b:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            int r7 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.String r6 = r6.toString()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r5.<init>(r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            throw r5     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
        L_0x0156:
            if (r3 == 0) goto L_0x0163
            androidx.constraintlayout.widget.ConstraintSet$Transform r5 = r3.transform     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r5.fillFromAttributeList(r13, r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            goto L_0x01dd
        L_0x0163:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            int r7 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.String r6 = r6.toString()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r5.<init>(r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            throw r5     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
        L_0x017e:
            if (r3 == 0) goto L_0x018a
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r5 = r3.propertySet     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r5.fillFromAttributeList(r13, r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            goto L_0x01dd
        L_0x018a:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            int r7 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            java.lang.String r6 = r6.toString()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r5.<init>(r6)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            throw r5     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
        L_0x01a5:
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            androidx.constraintlayout.widget.ConstraintSet$Constraint r6 = r12.fillFromAttributeList(r13, r6, r9)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r3 = r6
            androidx.constraintlayout.widget.ConstraintSet$Layout r6 = r3.layout     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r6.mHelperType = r5     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            goto L_0x01dd
        L_0x01b4:
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            androidx.constraintlayout.widget.ConstraintSet$Constraint r6 = r12.fillFromAttributeList(r13, r6, r9)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r3 = r6
            androidx.constraintlayout.widget.ConstraintSet$Layout r6 = r3.layout     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r6.mIsGuideline = r5     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            androidx.constraintlayout.widget.ConstraintSet$Layout r6 = r3.layout     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r6.mApply = r5     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            goto L_0x01dd
        L_0x01c7:
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            androidx.constraintlayout.widget.ConstraintSet$Constraint r5 = r12.fillFromAttributeList(r13, r6, r5)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r3 = r5
            goto L_0x01dd
        L_0x01d2:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            androidx.constraintlayout.widget.ConstraintSet$Constraint r5 = r12.fillFromAttributeList(r13, r5, r9)     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r3 = r5
        L_0x01dd:
            goto L_0x01e3
        L_0x01de:
            java.lang.String r5 = r14.getName()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
        L_0x01e3:
            int r5 = r14.next()     // Catch:{ XmlPullParserException -> 0x01f0, IOException -> 0x01eb }
            r4 = r5
            goto L_0x000a
        L_0x01ea:
            goto L_0x01f4
        L_0x01eb:
            r3 = move-exception
            android.util.Log.e(r1, r0, r3)
            goto L_0x01f5
        L_0x01f0:
            r3 = move-exception
            android.util.Log.e(r1, r0, r3)
        L_0x01f4:
        L_0x01f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.load(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* access modifiers changed from: private */
    public static int lookupID(TypedArray a, int index, int def) {
        int ret = a.getResourceId(index, def);
        if (ret == -1) {
            return a.getInt(index, -1);
        }
        return ret;
    }

    private Constraint fillFromAttributeList(Context context, AttributeSet attrs, boolean override) {
        Constraint c = new Constraint();
        TypedArray a = context.obtainStyledAttributes(attrs, override ? R.styleable.ConstraintOverride : R.styleable.Constraint);
        populateConstraint(c, a, override);
        a.recycle();
        return c;
    }

    public static Constraint buildDelta(Context context, XmlPullParser parser) {
        AttributeSet attrs = Xml.asAttributeSet(parser);
        Constraint c = new Constraint();
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ConstraintOverride);
        populateOverride(c, a);
        a.recycle();
        return c;
    }

    private static void populateOverride(Constraint c, TypedArray a) {
        int count = a.getIndexCount();
        Constraint.Delta delta = new Constraint.Delta();
        c.mDelta = delta;
        c.motion.mApply = false;
        c.layout.mApply = false;
        c.propertySet.mApply = false;
        c.transform.mApply = false;
        for (int i = 0; i < count; i++) {
            int attr = a.getIndex(i);
            switch (sOverrideMapToConstant.get(attr)) {
                case 2:
                    delta.add(2, a.getDimensionPixelSize(attr, c.layout.bottomMargin));
                    break;
                case 5:
                    delta.add(5, a.getString(attr));
                    break;
                case 6:
                    delta.add(6, a.getDimensionPixelOffset(attr, c.layout.editorAbsoluteX));
                    break;
                case 7:
                    delta.add(7, a.getDimensionPixelOffset(attr, c.layout.editorAbsoluteY));
                    break;
                case 8:
                    delta.add(8, a.getDimensionPixelSize(attr, c.layout.endMargin));
                    break;
                case 11:
                    delta.add(11, a.getDimensionPixelSize(attr, c.layout.goneBottomMargin));
                    break;
                case 12:
                    delta.add(12, a.getDimensionPixelSize(attr, c.layout.goneEndMargin));
                    break;
                case 13:
                    delta.add(13, a.getDimensionPixelSize(attr, c.layout.goneLeftMargin));
                    break;
                case 14:
                    delta.add(14, a.getDimensionPixelSize(attr, c.layout.goneRightMargin));
                    break;
                case 15:
                    delta.add(15, a.getDimensionPixelSize(attr, c.layout.goneStartMargin));
                    break;
                case 16:
                    delta.add(16, a.getDimensionPixelSize(attr, c.layout.goneTopMargin));
                    break;
                case 17:
                    delta.add(17, a.getDimensionPixelOffset(attr, c.layout.guideBegin));
                    break;
                case 18:
                    delta.add(18, a.getDimensionPixelOffset(attr, c.layout.guideEnd));
                    break;
                case 19:
                    delta.add(19, a.getFloat(attr, c.layout.guidePercent));
                    break;
                case 20:
                    delta.add(20, a.getFloat(attr, c.layout.horizontalBias));
                    break;
                case 21:
                    delta.add(21, a.getLayoutDimension(attr, c.layout.mHeight));
                    break;
                case 22:
                    delta.add(22, VISIBILITY_FLAGS[a.getInt(attr, c.propertySet.visibility)]);
                    break;
                case 23:
                    delta.add(23, a.getLayoutDimension(attr, c.layout.mWidth));
                    break;
                case 24:
                    delta.add(24, a.getDimensionPixelSize(attr, c.layout.leftMargin));
                    break;
                case 27:
                    delta.add(27, a.getInt(attr, c.layout.orientation));
                    break;
                case 28:
                    delta.add(28, a.getDimensionPixelSize(attr, c.layout.rightMargin));
                    break;
                case 31:
                    delta.add(31, a.getDimensionPixelSize(attr, c.layout.startMargin));
                    break;
                case 34:
                    delta.add(34, a.getDimensionPixelSize(attr, c.layout.topMargin));
                    break;
                case 37:
                    delta.add(37, a.getFloat(attr, c.layout.verticalBias));
                    break;
                case 38:
                    c.mViewId = a.getResourceId(attr, c.mViewId);
                    delta.add(38, c.mViewId);
                    break;
                case 39:
                    delta.add(39, a.getFloat(attr, c.layout.horizontalWeight));
                    break;
                case 40:
                    delta.add(40, a.getFloat(attr, c.layout.verticalWeight));
                    break;
                case 41:
                    delta.add(41, a.getInt(attr, c.layout.horizontalChainStyle));
                    break;
                case 42:
                    delta.add(42, a.getInt(attr, c.layout.verticalChainStyle));
                    break;
                case 43:
                    delta.add(43, a.getFloat(attr, c.propertySet.alpha));
                    break;
                case 44:
                    delta.add(44, true);
                    delta.add(44, a.getDimension(attr, c.transform.elevation));
                    break;
                case 45:
                    delta.add(45, a.getFloat(attr, c.transform.rotationX));
                    break;
                case 46:
                    delta.add(46, a.getFloat(attr, c.transform.rotationY));
                    break;
                case 47:
                    delta.add(47, a.getFloat(attr, c.transform.scaleX));
                    break;
                case 48:
                    delta.add(48, a.getFloat(attr, c.transform.scaleY));
                    break;
                case 49:
                    delta.add(49, a.getDimension(attr, c.transform.transformPivotX));
                    break;
                case 50:
                    delta.add(50, a.getDimension(attr, c.transform.transformPivotY));
                    break;
                case 51:
                    delta.add(51, a.getDimension(attr, c.transform.translationX));
                    break;
                case 52:
                    delta.add(52, a.getDimension(attr, c.transform.translationY));
                    break;
                case 53:
                    delta.add(53, a.getDimension(attr, c.transform.translationZ));
                    break;
                case 54:
                    delta.add(54, a.getInt(attr, c.layout.widthDefault));
                    break;
                case 55:
                    delta.add(55, a.getInt(attr, c.layout.heightDefault));
                    break;
                case WIDTH_MAX /*56*/:
                    delta.add((int) WIDTH_MAX, a.getDimensionPixelSize(attr, c.layout.widthMax));
                    break;
                case HEIGHT_MAX /*57*/:
                    delta.add((int) HEIGHT_MAX, a.getDimensionPixelSize(attr, c.layout.heightMax));
                    break;
                case WIDTH_MIN /*58*/:
                    delta.add((int) WIDTH_MIN, a.getDimensionPixelSize(attr, c.layout.widthMin));
                    break;
                case HEIGHT_MIN /*59*/:
                    delta.add((int) HEIGHT_MIN, a.getDimensionPixelSize(attr, c.layout.heightMin));
                    break;
                case 60:
                    delta.add(60, a.getFloat(attr, c.transform.rotation));
                    break;
                case CIRCLE_RADIUS /*62*/:
                    delta.add((int) CIRCLE_RADIUS, a.getDimensionPixelSize(attr, c.layout.circleRadius));
                    break;
                case 63:
                    delta.add(63, a.getFloat(attr, c.layout.circleAngle));
                    break;
                case 64:
                    delta.add(64, lookupID(a, attr, c.motion.mAnimateRelativeTo));
                    break;
                case 65:
                    if (a.peekValue(attr).type != 3) {
                        delta.add(65, Easing.NAMED_EASING[a.getInteger(attr, 0)]);
                        break;
                    } else {
                        delta.add(65, a.getString(attr));
                        break;
                    }
                case 66:
                    delta.add(66, a.getInt(attr, 0));
                    break;
                case 67:
                    delta.add(67, a.getFloat(attr, c.motion.mPathRotate));
                    break;
                case PROGRESS /*68*/:
                    delta.add((int) PROGRESS, a.getFloat(attr, c.propertySet.mProgress));
                    break;
                case WIDTH_PERCENT /*69*/:
                    delta.add((int) WIDTH_PERCENT, a.getFloat(attr, 1.0f));
                    break;
                case HEIGHT_PERCENT /*70*/:
                    delta.add((int) HEIGHT_PERCENT, a.getFloat(attr, 1.0f));
                    break;
                case CHAIN_USE_RTL /*71*/:
                    Log.e(TAG, "CURRENTLY UNSUPPORTED");
                    break;
                case BARRIER_DIRECTION /*72*/:
                    delta.add((int) BARRIER_DIRECTION, a.getInt(attr, c.layout.mBarrierDirection));
                    break;
                case BARRIER_MARGIN /*73*/:
                    delta.add((int) BARRIER_MARGIN, a.getDimensionPixelSize(attr, c.layout.mBarrierMargin));
                    break;
                case CONSTRAINT_REFERENCED_IDS /*74*/:
                    delta.add((int) CONSTRAINT_REFERENCED_IDS, a.getString(attr));
                    break;
                case BARRIER_ALLOWS_GONE_WIDGETS /*75*/:
                    delta.add((int) BARRIER_ALLOWS_GONE_WIDGETS, a.getBoolean(attr, c.layout.mBarrierAllowsGoneWidgets));
                    break;
                case 76:
                    delta.add(76, a.getInt(attr, c.motion.mPathMotionArc));
                    break;
                case CONSTRAINT_TAG /*77*/:
                    delta.add((int) CONSTRAINT_TAG, a.getString(attr));
                    break;
                case VISIBILITY_MODE /*78*/:
                    delta.add((int) VISIBILITY_MODE, a.getInt(attr, c.propertySet.mVisibilityMode));
                    break;
                case MOTION_STAGGER /*79*/:
                    delta.add((int) MOTION_STAGGER, a.getFloat(attr, c.motion.mMotionStagger));
                    break;
                case CONSTRAINED_WIDTH /*80*/:
                    delta.add((int) CONSTRAINED_WIDTH, a.getBoolean(attr, c.layout.constrainedWidth));
                    break;
                case CONSTRAINED_HEIGHT /*81*/:
                    delta.add((int) CONSTRAINED_HEIGHT, a.getBoolean(attr, c.layout.constrainedHeight));
                    break;
                case ANIMATE_CIRCLE_ANGLE_TO /*82*/:
                    delta.add((int) ANIMATE_CIRCLE_ANGLE_TO, a.getInteger(attr, c.motion.mAnimateCircleAngleTo));
                    break;
                case TRANSFORM_PIVOT_TARGET /*83*/:
                    delta.add((int) TRANSFORM_PIVOT_TARGET, lookupID(a, attr, c.transform.transformPivotTarget));
                    break;
                case QUANTIZE_MOTION_STEPS /*84*/:
                    delta.add((int) QUANTIZE_MOTION_STEPS, a.getInteger(attr, c.motion.mQuantizeMotionSteps));
                    break;
                case QUANTIZE_MOTION_PHASE /*85*/:
                    delta.add((int) QUANTIZE_MOTION_PHASE, a.getFloat(attr, c.motion.mQuantizeMotionPhase));
                    break;
                case QUANTIZE_MOTION_INTERPOLATOR /*86*/:
                    TypedValue type = a.peekValue(attr);
                    if (type.type != 1) {
                        if (type.type != 3) {
                            c.motion.mQuantizeInterpolatorType = a.getInteger(attr, c.motion.mQuantizeInterpolatorID);
                            delta.add((int) QUANTIZE_MOTION_INTERPOLATOR_TYPE, c.motion.mQuantizeInterpolatorType);
                            break;
                        } else {
                            c.motion.mQuantizeInterpolatorString = a.getString(attr);
                            delta.add((int) QUANTIZE_MOTION_INTERPOLATOR_STR, c.motion.mQuantizeInterpolatorString);
                            if (c.motion.mQuantizeInterpolatorString.indexOf("/") <= 0) {
                                c.motion.mQuantizeInterpolatorType = -1;
                                delta.add((int) QUANTIZE_MOTION_INTERPOLATOR_TYPE, c.motion.mQuantizeInterpolatorType);
                                break;
                            } else {
                                c.motion.mQuantizeInterpolatorID = a.getResourceId(attr, -1);
                                delta.add((int) QUANTIZE_MOTION_INTERPOLATOR_ID, c.motion.mQuantizeInterpolatorID);
                                c.motion.mQuantizeInterpolatorType = -2;
                                delta.add((int) QUANTIZE_MOTION_INTERPOLATOR_TYPE, c.motion.mQuantizeInterpolatorType);
                                break;
                            }
                        }
                    } else {
                        c.motion.mQuantizeInterpolatorID = a.getResourceId(attr, -1);
                        delta.add((int) QUANTIZE_MOTION_INTERPOLATOR_ID, c.motion.mQuantizeInterpolatorID);
                        if (c.motion.mQuantizeInterpolatorID == -1) {
                            break;
                        } else {
                            c.motion.mQuantizeInterpolatorType = -2;
                            delta.add((int) QUANTIZE_MOTION_INTERPOLATOR_TYPE, c.motion.mQuantizeInterpolatorType);
                            break;
                        }
                    }
                case UNUSED /*87*/:
                    Log.w(TAG, "unused attribute 0x" + Integer.toHexString(attr) + "   " + sMapToConstant.get(attr));
                    break;
                case BASELINE_MARGIN /*93*/:
                    delta.add((int) BASELINE_MARGIN, a.getDimensionPixelSize(attr, c.layout.baselineMargin));
                    break;
                case GONE_BASELINE_MARGIN /*94*/:
                    delta.add((int) GONE_BASELINE_MARGIN, a.getDimensionPixelSize(attr, c.layout.goneBaselineMargin));
                    break;
                case LAYOUT_CONSTRAINT_WIDTH /*95*/:
                    parseDimensionConstraints(delta, a, attr, 0);
                    break;
                case LAYOUT_CONSTRAINT_HEIGHT /*96*/:
                    parseDimensionConstraints(delta, a, attr, 1);
                    break;
                case LAYOUT_WRAP_BEHAVIOR /*97*/:
                    delta.add((int) LAYOUT_WRAP_BEHAVIOR, a.getInt(attr, c.layout.mWrapBehavior));
                    break;
                case MOTION_TARGET /*98*/:
                    if (!MotionLayout.IS_IN_EDIT_MODE) {
                        if (a.peekValue(attr).type != 3) {
                            c.mViewId = a.getResourceId(attr, c.mViewId);
                            break;
                        } else {
                            c.mTargetString = a.getString(attr);
                            break;
                        }
                    } else {
                        c.mViewId = a.getResourceId(attr, c.mViewId);
                        if (c.mViewId != -1) {
                            break;
                        } else {
                            c.mTargetString = a.getString(attr);
                            break;
                        }
                    }
                case GUIDELINE_USE_RTL /*99*/:
                    delta.add((int) GUIDELINE_USE_RTL, a.getBoolean(attr, c.layout.guidelineUseRtl));
                    break;
                default:
                    Log.w(TAG, "Unknown attribute 0x" + Integer.toHexString(attr) + "   " + sMapToConstant.get(attr));
                    break;
            }
        }
    }

    /* access modifiers changed from: private */
    public static void setDeltaValue(Constraint c, int type, float value) {
        switch (type) {
            case 19:
                c.layout.guidePercent = value;
                return;
            case 20:
                c.layout.horizontalBias = value;
                return;
            case 37:
                c.layout.verticalBias = value;
                return;
            case 39:
                c.layout.horizontalWeight = value;
                return;
            case 40:
                c.layout.verticalWeight = value;
                return;
            case 43:
                c.propertySet.alpha = value;
                return;
            case 44:
                c.transform.elevation = value;
                c.transform.applyElevation = true;
                return;
            case 45:
                c.transform.rotationX = value;
                return;
            case 46:
                c.transform.rotationY = value;
                return;
            case 47:
                c.transform.scaleX = value;
                return;
            case 48:
                c.transform.scaleY = value;
                return;
            case 49:
                c.transform.transformPivotX = value;
                return;
            case 50:
                c.transform.transformPivotY = value;
                return;
            case 51:
                c.transform.translationX = value;
                return;
            case 52:
                c.transform.translationY = value;
                return;
            case 53:
                c.transform.translationZ = value;
                return;
            case 60:
                c.transform.rotation = value;
                return;
            case 63:
                c.layout.circleAngle = value;
                return;
            case 67:
                c.motion.mPathRotate = value;
                return;
            case PROGRESS /*68*/:
                c.propertySet.mProgress = value;
                return;
            case WIDTH_PERCENT /*69*/:
                c.layout.widthPercent = value;
                return;
            case HEIGHT_PERCENT /*70*/:
                c.layout.heightPercent = value;
                return;
            case MOTION_STAGGER /*79*/:
                c.motion.mMotionStagger = value;
                return;
            case QUANTIZE_MOTION_PHASE /*85*/:
                c.motion.mQuantizeMotionPhase = value;
                return;
            case UNUSED /*87*/:
                return;
            default:
                Log.w(TAG, "Unknown attribute 0x");
                return;
        }
    }

    /* access modifiers changed from: private */
    public static void setDeltaValue(Constraint c, int type, int value) {
        switch (type) {
            case 2:
                c.layout.bottomMargin = value;
                return;
            case 6:
                c.layout.editorAbsoluteX = value;
                return;
            case 7:
                c.layout.editorAbsoluteY = value;
                return;
            case 8:
                c.layout.endMargin = value;
                return;
            case 11:
                c.layout.goneBottomMargin = value;
                return;
            case 12:
                c.layout.goneEndMargin = value;
                return;
            case 13:
                c.layout.goneLeftMargin = value;
                return;
            case 14:
                c.layout.goneRightMargin = value;
                return;
            case 15:
                c.layout.goneStartMargin = value;
                return;
            case 16:
                c.layout.goneTopMargin = value;
                return;
            case 17:
                c.layout.guideBegin = value;
                return;
            case 18:
                c.layout.guideEnd = value;
                return;
            case 21:
                c.layout.mHeight = value;
                return;
            case 22:
                c.propertySet.visibility = value;
                return;
            case 23:
                c.layout.mWidth = value;
                return;
            case 24:
                c.layout.leftMargin = value;
                return;
            case 27:
                c.layout.orientation = value;
                return;
            case 28:
                c.layout.rightMargin = value;
                return;
            case 31:
                c.layout.startMargin = value;
                return;
            case 34:
                c.layout.topMargin = value;
                return;
            case 38:
                c.mViewId = value;
                return;
            case 41:
                c.layout.horizontalChainStyle = value;
                return;
            case 42:
                c.layout.verticalChainStyle = value;
                return;
            case 54:
                c.layout.widthDefault = value;
                return;
            case 55:
                c.layout.heightDefault = value;
                return;
            case WIDTH_MAX /*56*/:
                c.layout.widthMax = value;
                return;
            case HEIGHT_MAX /*57*/:
                c.layout.heightMax = value;
                return;
            case WIDTH_MIN /*58*/:
                c.layout.widthMin = value;
                return;
            case HEIGHT_MIN /*59*/:
                c.layout.heightMin = value;
                return;
            case 61:
                c.layout.circleConstraint = value;
                return;
            case CIRCLE_RADIUS /*62*/:
                c.layout.circleRadius = value;
                return;
            case 64:
                c.motion.mAnimateRelativeTo = value;
                return;
            case 66:
                c.motion.mDrawPath = value;
                return;
            case BARRIER_DIRECTION /*72*/:
                c.layout.mBarrierDirection = value;
                return;
            case BARRIER_MARGIN /*73*/:
                c.layout.mBarrierMargin = value;
                return;
            case 76:
                c.motion.mPathMotionArc = value;
                return;
            case VISIBILITY_MODE /*78*/:
                c.propertySet.mVisibilityMode = value;
                return;
            case ANIMATE_CIRCLE_ANGLE_TO /*82*/:
                c.motion.mAnimateCircleAngleTo = value;
                return;
            case TRANSFORM_PIVOT_TARGET /*83*/:
                c.transform.transformPivotTarget = value;
                return;
            case QUANTIZE_MOTION_STEPS /*84*/:
                c.motion.mQuantizeMotionSteps = value;
                return;
            case UNUSED /*87*/:
                return;
            case QUANTIZE_MOTION_INTERPOLATOR_TYPE /*88*/:
                c.motion.mQuantizeInterpolatorType = value;
                return;
            case QUANTIZE_MOTION_INTERPOLATOR_ID /*89*/:
                c.motion.mQuantizeInterpolatorID = value;
                return;
            case BASELINE_MARGIN /*93*/:
                c.layout.baselineMargin = value;
                return;
            case GONE_BASELINE_MARGIN /*94*/:
                c.layout.goneBaselineMargin = value;
                return;
            case LAYOUT_WRAP_BEHAVIOR /*97*/:
                c.layout.mWrapBehavior = value;
                return;
            default:
                Log.w(TAG, "Unknown attribute 0x");
                return;
        }
    }

    /* access modifiers changed from: private */
    public static void setDeltaValue(Constraint c, int type, String value) {
        switch (type) {
            case 5:
                c.layout.dimensionRatio = value;
                return;
            case 65:
                c.motion.mTransitionEasing = value;
                return;
            case CONSTRAINT_REFERENCED_IDS /*74*/:
                c.layout.mReferenceIdString = value;
                c.layout.mReferenceIds = null;
                return;
            case CONSTRAINT_TAG /*77*/:
                c.layout.mConstraintTag = value;
                return;
            case UNUSED /*87*/:
                return;
            case QUANTIZE_MOTION_INTERPOLATOR_STR /*90*/:
                c.motion.mQuantizeInterpolatorString = value;
                return;
            default:
                Log.w(TAG, "Unknown attribute 0x");
                return;
        }
    }

    /* access modifiers changed from: private */
    public static void setDeltaValue(Constraint c, int type, boolean value) {
        switch (type) {
            case 44:
                c.transform.applyElevation = value;
                return;
            case BARRIER_ALLOWS_GONE_WIDGETS /*75*/:
                c.layout.mBarrierAllowsGoneWidgets = value;
                return;
            case CONSTRAINED_WIDTH /*80*/:
                c.layout.constrainedWidth = value;
                return;
            case CONSTRAINED_HEIGHT /*81*/:
                c.layout.constrainedHeight = value;
                return;
            case UNUSED /*87*/:
                return;
            default:
                Log.w(TAG, "Unknown attribute 0x");
                return;
        }
    }

    private void populateConstraint(Constraint c, TypedArray a, boolean override) {
        if (override) {
            populateOverride(c, a);
            return;
        }
        int count = a.getIndexCount();
        for (int i = 0; i < count; i++) {
            int attr = a.getIndex(i);
            if (!(attr == R.styleable.Constraint_android_id || R.styleable.Constraint_android_layout_marginStart == attr || R.styleable.Constraint_android_layout_marginEnd == attr)) {
                c.motion.mApply = true;
                c.layout.mApply = true;
                c.propertySet.mApply = true;
                c.transform.mApply = true;
            }
            switch (sMapToConstant.get(attr)) {
                case 1:
                    c.layout.baselineToBaseline = lookupID(a, attr, c.layout.baselineToBaseline);
                    break;
                case 2:
                    c.layout.bottomMargin = a.getDimensionPixelSize(attr, c.layout.bottomMargin);
                    break;
                case 3:
                    c.layout.bottomToBottom = lookupID(a, attr, c.layout.bottomToBottom);
                    break;
                case 4:
                    c.layout.bottomToTop = lookupID(a, attr, c.layout.bottomToTop);
                    break;
                case 5:
                    c.layout.dimensionRatio = a.getString(attr);
                    break;
                case 6:
                    c.layout.editorAbsoluteX = a.getDimensionPixelOffset(attr, c.layout.editorAbsoluteX);
                    break;
                case 7:
                    c.layout.editorAbsoluteY = a.getDimensionPixelOffset(attr, c.layout.editorAbsoluteY);
                    break;
                case 8:
                    c.layout.endMargin = a.getDimensionPixelSize(attr, c.layout.endMargin);
                    break;
                case 9:
                    c.layout.endToEnd = lookupID(a, attr, c.layout.endToEnd);
                    break;
                case 10:
                    c.layout.endToStart = lookupID(a, attr, c.layout.endToStart);
                    break;
                case 11:
                    c.layout.goneBottomMargin = a.getDimensionPixelSize(attr, c.layout.goneBottomMargin);
                    break;
                case 12:
                    c.layout.goneEndMargin = a.getDimensionPixelSize(attr, c.layout.goneEndMargin);
                    break;
                case 13:
                    c.layout.goneLeftMargin = a.getDimensionPixelSize(attr, c.layout.goneLeftMargin);
                    break;
                case 14:
                    c.layout.goneRightMargin = a.getDimensionPixelSize(attr, c.layout.goneRightMargin);
                    break;
                case 15:
                    c.layout.goneStartMargin = a.getDimensionPixelSize(attr, c.layout.goneStartMargin);
                    break;
                case 16:
                    c.layout.goneTopMargin = a.getDimensionPixelSize(attr, c.layout.goneTopMargin);
                    break;
                case 17:
                    c.layout.guideBegin = a.getDimensionPixelOffset(attr, c.layout.guideBegin);
                    break;
                case 18:
                    c.layout.guideEnd = a.getDimensionPixelOffset(attr, c.layout.guideEnd);
                    break;
                case 19:
                    c.layout.guidePercent = a.getFloat(attr, c.layout.guidePercent);
                    break;
                case 20:
                    c.layout.horizontalBias = a.getFloat(attr, c.layout.horizontalBias);
                    break;
                case 21:
                    c.layout.mHeight = a.getLayoutDimension(attr, c.layout.mHeight);
                    break;
                case 22:
                    c.propertySet.visibility = a.getInt(attr, c.propertySet.visibility);
                    c.propertySet.visibility = VISIBILITY_FLAGS[c.propertySet.visibility];
                    break;
                case 23:
                    c.layout.mWidth = a.getLayoutDimension(attr, c.layout.mWidth);
                    break;
                case 24:
                    c.layout.leftMargin = a.getDimensionPixelSize(attr, c.layout.leftMargin);
                    break;
                case 25:
                    c.layout.leftToLeft = lookupID(a, attr, c.layout.leftToLeft);
                    break;
                case 26:
                    c.layout.leftToRight = lookupID(a, attr, c.layout.leftToRight);
                    break;
                case 27:
                    c.layout.orientation = a.getInt(attr, c.layout.orientation);
                    break;
                case 28:
                    c.layout.rightMargin = a.getDimensionPixelSize(attr, c.layout.rightMargin);
                    break;
                case 29:
                    c.layout.rightToLeft = lookupID(a, attr, c.layout.rightToLeft);
                    break;
                case 30:
                    c.layout.rightToRight = lookupID(a, attr, c.layout.rightToRight);
                    break;
                case 31:
                    c.layout.startMargin = a.getDimensionPixelSize(attr, c.layout.startMargin);
                    break;
                case 32:
                    c.layout.startToEnd = lookupID(a, attr, c.layout.startToEnd);
                    break;
                case 33:
                    c.layout.startToStart = lookupID(a, attr, c.layout.startToStart);
                    break;
                case 34:
                    c.layout.topMargin = a.getDimensionPixelSize(attr, c.layout.topMargin);
                    break;
                case 35:
                    c.layout.topToBottom = lookupID(a, attr, c.layout.topToBottom);
                    break;
                case 36:
                    c.layout.topToTop = lookupID(a, attr, c.layout.topToTop);
                    break;
                case 37:
                    c.layout.verticalBias = a.getFloat(attr, c.layout.verticalBias);
                    break;
                case 38:
                    c.mViewId = a.getResourceId(attr, c.mViewId);
                    break;
                case 39:
                    c.layout.horizontalWeight = a.getFloat(attr, c.layout.horizontalWeight);
                    break;
                case 40:
                    c.layout.verticalWeight = a.getFloat(attr, c.layout.verticalWeight);
                    break;
                case 41:
                    c.layout.horizontalChainStyle = a.getInt(attr, c.layout.horizontalChainStyle);
                    break;
                case 42:
                    c.layout.verticalChainStyle = a.getInt(attr, c.layout.verticalChainStyle);
                    break;
                case 43:
                    c.propertySet.alpha = a.getFloat(attr, c.propertySet.alpha);
                    break;
                case 44:
                    c.transform.applyElevation = true;
                    c.transform.elevation = a.getDimension(attr, c.transform.elevation);
                    break;
                case 45:
                    c.transform.rotationX = a.getFloat(attr, c.transform.rotationX);
                    break;
                case 46:
                    c.transform.rotationY = a.getFloat(attr, c.transform.rotationY);
                    break;
                case 47:
                    c.transform.scaleX = a.getFloat(attr, c.transform.scaleX);
                    break;
                case 48:
                    c.transform.scaleY = a.getFloat(attr, c.transform.scaleY);
                    break;
                case 49:
                    c.transform.transformPivotX = a.getDimension(attr, c.transform.transformPivotX);
                    break;
                case 50:
                    c.transform.transformPivotY = a.getDimension(attr, c.transform.transformPivotY);
                    break;
                case 51:
                    c.transform.translationX = a.getDimension(attr, c.transform.translationX);
                    break;
                case 52:
                    c.transform.translationY = a.getDimension(attr, c.transform.translationY);
                    break;
                case 53:
                    c.transform.translationZ = a.getDimension(attr, c.transform.translationZ);
                    break;
                case 54:
                    c.layout.widthDefault = a.getInt(attr, c.layout.widthDefault);
                    break;
                case 55:
                    c.layout.heightDefault = a.getInt(attr, c.layout.heightDefault);
                    break;
                case WIDTH_MAX /*56*/:
                    c.layout.widthMax = a.getDimensionPixelSize(attr, c.layout.widthMax);
                    break;
                case HEIGHT_MAX /*57*/:
                    c.layout.heightMax = a.getDimensionPixelSize(attr, c.layout.heightMax);
                    break;
                case WIDTH_MIN /*58*/:
                    c.layout.widthMin = a.getDimensionPixelSize(attr, c.layout.widthMin);
                    break;
                case HEIGHT_MIN /*59*/:
                    c.layout.heightMin = a.getDimensionPixelSize(attr, c.layout.heightMin);
                    break;
                case 60:
                    c.transform.rotation = a.getFloat(attr, c.transform.rotation);
                    break;
                case 61:
                    c.layout.circleConstraint = lookupID(a, attr, c.layout.circleConstraint);
                    break;
                case CIRCLE_RADIUS /*62*/:
                    c.layout.circleRadius = a.getDimensionPixelSize(attr, c.layout.circleRadius);
                    break;
                case 63:
                    c.layout.circleAngle = a.getFloat(attr, c.layout.circleAngle);
                    break;
                case 64:
                    c.motion.mAnimateRelativeTo = lookupID(a, attr, c.motion.mAnimateRelativeTo);
                    break;
                case 65:
                    if (a.peekValue(attr).type != 3) {
                        c.motion.mTransitionEasing = Easing.NAMED_EASING[a.getInteger(attr, 0)];
                        break;
                    } else {
                        c.motion.mTransitionEasing = a.getString(attr);
                        break;
                    }
                case 66:
                    c.motion.mDrawPath = a.getInt(attr, 0);
                    break;
                case 67:
                    c.motion.mPathRotate = a.getFloat(attr, c.motion.mPathRotate);
                    break;
                case PROGRESS /*68*/:
                    c.propertySet.mProgress = a.getFloat(attr, c.propertySet.mProgress);
                    break;
                case WIDTH_PERCENT /*69*/:
                    c.layout.widthPercent = a.getFloat(attr, 1.0f);
                    break;
                case HEIGHT_PERCENT /*70*/:
                    c.layout.heightPercent = a.getFloat(attr, 1.0f);
                    break;
                case CHAIN_USE_RTL /*71*/:
                    Log.e(TAG, "CURRENTLY UNSUPPORTED");
                    break;
                case BARRIER_DIRECTION /*72*/:
                    c.layout.mBarrierDirection = a.getInt(attr, c.layout.mBarrierDirection);
                    break;
                case BARRIER_MARGIN /*73*/:
                    c.layout.mBarrierMargin = a.getDimensionPixelSize(attr, c.layout.mBarrierMargin);
                    break;
                case CONSTRAINT_REFERENCED_IDS /*74*/:
                    c.layout.mReferenceIdString = a.getString(attr);
                    break;
                case BARRIER_ALLOWS_GONE_WIDGETS /*75*/:
                    c.layout.mBarrierAllowsGoneWidgets = a.getBoolean(attr, c.layout.mBarrierAllowsGoneWidgets);
                    break;
                case 76:
                    c.motion.mPathMotionArc = a.getInt(attr, c.motion.mPathMotionArc);
                    break;
                case CONSTRAINT_TAG /*77*/:
                    c.layout.mConstraintTag = a.getString(attr);
                    break;
                case VISIBILITY_MODE /*78*/:
                    c.propertySet.mVisibilityMode = a.getInt(attr, c.propertySet.mVisibilityMode);
                    break;
                case MOTION_STAGGER /*79*/:
                    c.motion.mMotionStagger = a.getFloat(attr, c.motion.mMotionStagger);
                    break;
                case CONSTRAINED_WIDTH /*80*/:
                    c.layout.constrainedWidth = a.getBoolean(attr, c.layout.constrainedWidth);
                    break;
                case CONSTRAINED_HEIGHT /*81*/:
                    c.layout.constrainedHeight = a.getBoolean(attr, c.layout.constrainedHeight);
                    break;
                case ANIMATE_CIRCLE_ANGLE_TO /*82*/:
                    c.motion.mAnimateCircleAngleTo = a.getInteger(attr, c.motion.mAnimateCircleAngleTo);
                    break;
                case TRANSFORM_PIVOT_TARGET /*83*/:
                    c.transform.transformPivotTarget = lookupID(a, attr, c.transform.transformPivotTarget);
                    break;
                case QUANTIZE_MOTION_STEPS /*84*/:
                    c.motion.mQuantizeMotionSteps = a.getInteger(attr, c.motion.mQuantizeMotionSteps);
                    break;
                case QUANTIZE_MOTION_PHASE /*85*/:
                    c.motion.mQuantizeMotionPhase = a.getFloat(attr, c.motion.mQuantizeMotionPhase);
                    break;
                case QUANTIZE_MOTION_INTERPOLATOR /*86*/:
                    TypedValue type = a.peekValue(attr);
                    if (type.type != 1) {
                        if (type.type != 3) {
                            c.motion.mQuantizeInterpolatorType = a.getInteger(attr, c.motion.mQuantizeInterpolatorID);
                            break;
                        } else {
                            c.motion.mQuantizeInterpolatorString = a.getString(attr);
                            if (c.motion.mQuantizeInterpolatorString.indexOf("/") <= 0) {
                                c.motion.mQuantizeInterpolatorType = -1;
                                break;
                            } else {
                                c.motion.mQuantizeInterpolatorID = a.getResourceId(attr, -1);
                                c.motion.mQuantizeInterpolatorType = -2;
                                break;
                            }
                        }
                    } else {
                        c.motion.mQuantizeInterpolatorID = a.getResourceId(attr, -1);
                        if (c.motion.mQuantizeInterpolatorID == -1) {
                            break;
                        } else {
                            c.motion.mQuantizeInterpolatorType = -2;
                            break;
                        }
                    }
                case UNUSED /*87*/:
                    Log.w(TAG, "unused attribute 0x" + Integer.toHexString(attr) + "   " + sMapToConstant.get(attr));
                    break;
                case BASELINE_TO_TOP /*91*/:
                    c.layout.baselineToTop = lookupID(a, attr, c.layout.baselineToTop);
                    break;
                case BASELINE_TO_BOTTOM /*92*/:
                    c.layout.baselineToBottom = lookupID(a, attr, c.layout.baselineToBottom);
                    break;
                case BASELINE_MARGIN /*93*/:
                    c.layout.baselineMargin = a.getDimensionPixelSize(attr, c.layout.baselineMargin);
                    break;
                case GONE_BASELINE_MARGIN /*94*/:
                    c.layout.goneBaselineMargin = a.getDimensionPixelSize(attr, c.layout.goneBaselineMargin);
                    break;
                case LAYOUT_CONSTRAINT_WIDTH /*95*/:
                    parseDimensionConstraints(c.layout, a, attr, 0);
                    break;
                case LAYOUT_CONSTRAINT_HEIGHT /*96*/:
                    parseDimensionConstraints(c.layout, a, attr, 1);
                    break;
                case LAYOUT_WRAP_BEHAVIOR /*97*/:
                    c.layout.mWrapBehavior = a.getInt(attr, c.layout.mWrapBehavior);
                    break;
                default:
                    Log.w(TAG, "Unknown attribute 0x" + Integer.toHexString(attr) + "   " + sMapToConstant.get(attr));
                    break;
            }
        }
        if (c.layout.mReferenceIdString != null) {
            c.layout.mReferenceIds = null;
        }
    }

    private int[] convertReferenceString(View view, String referenceIdString) {
        Object value;
        String[] split = referenceIdString.split(",");
        Context context = view.getContext();
        int[] tags = new int[split.length];
        int count = 0;
        int i = 0;
        while (i < split.length) {
            String idString = split[i].trim();
            int tag = 0;
            try {
                tag = R.id.class.getField(idString).getInt((Object) null);
            } catch (Exception e) {
            }
            if (tag == 0) {
                tag = context.getResources().getIdentifier(idString, "id", context.getPackageName());
            }
            if (tag == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (value = ((ConstraintLayout) view.getParent()).getDesignInformation(0, idString)) != null && (value instanceof Integer)) {
                tag = ((Integer) value).intValue();
            }
            tags[count] = tag;
            i++;
            count++;
        }
        if (count != split.length) {
            return Arrays.copyOf(tags, count);
        }
        return tags;
    }

    public Constraint getConstraint(int id) {
        if (this.mConstraints.containsKey(Integer.valueOf(id))) {
            return this.mConstraints.get(Integer.valueOf(id));
        }
        return null;
    }

    public int[] getKnownIds() {
        Integer[] arr = (Integer[]) this.mConstraints.keySet().toArray(new Integer[0]);
        int[] array = new int[arr.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = arr[i].intValue();
        }
        return array;
    }

    public boolean isForceId() {
        return this.mForceId;
    }

    public void setForceId(boolean forceId) {
        this.mForceId = forceId;
    }

    public void setValidateOnParse(boolean validate) {
        this.mValidate = validate;
    }

    public boolean isValidateOnParse() {
        return this.mValidate;
    }

    public void dump(MotionScene scene, int... ids) {
        HashSet<Integer> set;
        Set<Integer> keys = this.mConstraints.keySet();
        if (ids.length != 0) {
            set = new HashSet<>();
            for (int id : ids) {
                set.add(Integer.valueOf(id));
            }
        } else {
            set = new HashSet<>(keys);
        }
        System.out.println(set.size() + " constraints");
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer id2 : (Integer[]) set.toArray(new Integer[0])) {
            Constraint constraint = this.mConstraints.get(id2);
            if (constraint != null) {
                stringBuilder.append("<Constraint id=");
                stringBuilder.append(id2);
                stringBuilder.append(" \n");
                constraint.layout.dump(scene, stringBuilder);
                stringBuilder.append("/>\n");
            }
        }
        System.out.println(stringBuilder.toString());
    }

    static String getLine(Context context, int resourceId, XmlPullParser pullParser) {
        return ".(" + Debug.getName(context, resourceId) + ".xml:" + pullParser.getLineNumber() + ") \"" + pullParser.getName() + "\"";
    }

    static String getDebugName(int v) {
        for (Field field : ConstraintSet.class.getDeclaredFields()) {
            if (field.getName().contains("_") && field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getInt((Object) null) == v) {
                        return field.getName();
                    }
                } catch (IllegalAccessException e) {
                    Log.e(TAG, "Error accessing ConstraintSet field", e);
                }
            }
        }
        return "UNKNOWN";
    }

    public void writeState(Writer writer, ConstraintLayout layout, int flags) throws IOException {
        writer.write("\n---------------------------------------------\n");
        if ((flags & 1) == 1) {
            new WriteXmlEngine(writer, layout, flags).writeLayout();
        } else {
            new WriteJsonEngine(writer, layout, flags).writeLayout();
        }
        writer.write("\n---------------------------------------------\n");
    }

    class WriteXmlEngine {
        private static final String SPACE = "\n       ";
        final String mBASELINE = "'baseline'";
        final String mBOTTOM = "'bottom'";
        Context mContext;
        final String mEND = "'end'";
        int mFlags;
        HashMap<Integer, String> mIdMap = new HashMap<>();
        final String mLEFT = "'left'";
        ConstraintLayout mLayout;
        final String mRIGHT = "'right'";
        final String mSTART = "'start'";
        final String mTOP = "'top'";
        int mUnknownCount = 0;
        Writer mWriter;

        WriteXmlEngine(Writer writer, ConstraintLayout layout, int flags) throws IOException {
            this.mWriter = writer;
            this.mLayout = layout;
            this.mContext = layout.getContext();
            this.mFlags = flags;
        }

        /* access modifiers changed from: package-private */
        public void writeLayout() throws IOException {
            this.mWriter.write("\n<ConstraintSet>\n");
            for (Integer id : ConstraintSet.this.mConstraints.keySet()) {
                String idName = getName(id.intValue());
                this.mWriter.write("  <Constraint");
                this.mWriter.write("\n       android:id=\"" + idName + "\"");
                Layout l = ((Constraint) ConstraintSet.this.mConstraints.get(id)).layout;
                writeBaseDimension("android:layout_width", l.mWidth, -5);
                writeBaseDimension("android:layout_height", l.mHeight, -5);
                writeVariable("app:layout_constraintGuide_begin", (float) l.guideBegin, -1.0f);
                writeVariable("app:layout_constraintGuide_end", (float) l.guideEnd, -1.0f);
                writeVariable("app:layout_constraintGuide_percent", l.guidePercent, -1.0f);
                writeVariable("app:layout_constraintHorizontal_bias", l.horizontalBias, 0.5f);
                writeVariable("app:layout_constraintVertical_bias", l.verticalBias, 0.5f);
                writeVariable("app:layout_constraintDimensionRatio", l.dimensionRatio, (String) null);
                writeXmlConstraint("app:layout_constraintCircle", l.circleConstraint);
                writeVariable("app:layout_constraintCircleRadius", (float) l.circleRadius, 0.0f);
                writeVariable("app:layout_constraintCircleAngle", l.circleAngle, 0.0f);
                writeVariable("android:orientation", (float) l.orientation, -1.0f);
                writeVariable("app:layout_constraintVertical_weight", l.verticalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_weight", l.horizontalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_chainStyle", (float) l.horizontalChainStyle, 0.0f);
                writeVariable("app:layout_constraintVertical_chainStyle", (float) l.verticalChainStyle, 0.0f);
                writeVariable("app:barrierDirection", (float) l.mBarrierDirection, -1.0f);
                writeVariable("app:barrierMargin", (float) l.mBarrierMargin, 0.0f);
                writeDimension("app:layout_marginLeft", l.leftMargin, 0);
                writeDimension("app:layout_goneMarginLeft", l.goneLeftMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginRight", l.rightMargin, 0);
                writeDimension("app:layout_goneMarginRight", l.goneRightMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginStart", l.startMargin, 0);
                writeDimension("app:layout_goneMarginStart", l.goneStartMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginEnd", l.endMargin, 0);
                writeDimension("app:layout_goneMarginEnd", l.goneEndMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginTop", l.topMargin, 0);
                writeDimension("app:layout_goneMarginTop", l.goneTopMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginBottom", l.bottomMargin, 0);
                writeDimension("app:layout_goneMarginBottom", l.goneBottomMargin, Integer.MIN_VALUE);
                writeDimension("app:goneBaselineMargin", l.goneBaselineMargin, Integer.MIN_VALUE);
                writeDimension("app:baselineMargin", l.baselineMargin, 0);
                writeBoolen("app:layout_constrainedWidth", l.constrainedWidth, false);
                writeBoolen("app:layout_constrainedHeight", l.constrainedHeight, false);
                writeBoolen("app:barrierAllowsGoneWidgets", l.mBarrierAllowsGoneWidgets, true);
                writeVariable("app:layout_wrapBehaviorInParent", (float) l.mWrapBehavior, 0.0f);
                writeXmlConstraint("app:baselineToBaseline", l.baselineToBaseline);
                writeXmlConstraint("app:baselineToBottom", l.baselineToBottom);
                writeXmlConstraint("app:baselineToTop", l.baselineToTop);
                writeXmlConstraint("app:layout_constraintBottom_toBottomOf", l.bottomToBottom);
                writeXmlConstraint("app:layout_constraintBottom_toTopOf", l.bottomToTop);
                writeXmlConstraint("app:layout_constraintEnd_toEndOf", l.endToEnd);
                writeXmlConstraint("app:layout_constraintEnd_toStartOf", l.endToStart);
                writeXmlConstraint("app:layout_constraintLeft_toLeftOf", l.leftToLeft);
                writeXmlConstraint("app:layout_constraintLeft_toRightOf", l.leftToRight);
                writeXmlConstraint("app:layout_constraintRight_toLeftOf", l.rightToLeft);
                writeXmlConstraint("app:layout_constraintRight_toRightOf", l.rightToRight);
                writeXmlConstraint("app:layout_constraintStart_toEndOf", l.startToEnd);
                writeXmlConstraint("app:layout_constraintStart_toStartOf", l.startToStart);
                writeXmlConstraint("app:layout_constraintTop_toBottomOf", l.topToBottom);
                writeXmlConstraint("app:layout_constraintTop_toTopOf", l.topToTop);
                String[] typesConstraintDefault = {"spread", "wrap", "percent"};
                writeEnum("app:layout_constraintHeight_default", l.heightDefault, typesConstraintDefault, 0);
                writeVariable("app:layout_constraintHeight_percent", l.heightPercent, 1.0f);
                writeDimension("app:layout_constraintHeight_min", l.heightMin, 0);
                writeDimension("app:layout_constraintHeight_max", l.heightMax, 0);
                writeBoolen("android:layout_constrainedHeight", l.constrainedHeight, false);
                writeEnum("app:layout_constraintWidth_default", l.widthDefault, typesConstraintDefault, 0);
                writeVariable("app:layout_constraintWidth_percent", l.widthPercent, 1.0f);
                writeDimension("app:layout_constraintWidth_min", l.widthMin, 0);
                writeDimension("app:layout_constraintWidth_max", l.widthMax, 0);
                writeBoolen("android:layout_constrainedWidth", l.constrainedWidth, false);
                writeVariable("app:layout_constraintVertical_weight", l.verticalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_weight", l.horizontalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_chainStyle", l.horizontalChainStyle);
                writeVariable("app:layout_constraintVertical_chainStyle", l.verticalChainStyle);
                writeEnum("app:barrierDirection", l.mBarrierDirection, new String[]{"left", "right", "top", "bottom", "start", "end"}, -1);
                writeVariable("app:layout_constraintTag", l.mConstraintTag, (String) null);
                if (l.mReferenceIds != null) {
                    writeVariable("'ReferenceIds'", l.mReferenceIds);
                }
                this.mWriter.write(" />\n");
            }
            this.mWriter.write("</ConstraintSet>\n");
        }

        private void writeBoolen(String dimString, boolean val, boolean def) throws IOException {
            if (val != def) {
                this.mWriter.write(SPACE + dimString + "=\"" + val + "dp\"");
            }
        }

        private void writeEnum(String dimString, int val, String[] types, int def) throws IOException {
            if (val != def) {
                this.mWriter.write(SPACE + dimString + "=\"" + types[val] + "\"");
            }
        }

        private void writeDimension(String dimString, int dim, int def) throws IOException {
            if (dim != def) {
                this.mWriter.write(SPACE + dimString + "=\"" + dim + "dp\"");
            }
        }

        private void writeBaseDimension(String dimString, int dim, int def) throws IOException {
            if (dim == def) {
                return;
            }
            if (dim == -2) {
                this.mWriter.write(SPACE + dimString + "=\"wrap_content\"");
            } else if (dim == -1) {
                this.mWriter.write(SPACE + dimString + "=\"match_parent\"");
            } else {
                this.mWriter.write(SPACE + dimString + "=\"" + dim + "dp\"");
            }
        }

        /* access modifiers changed from: package-private */
        public String getName(int id) {
            if (this.mIdMap.containsKey(Integer.valueOf(id))) {
                return "@+id/" + this.mIdMap.get(Integer.valueOf(id)) + "";
            }
            if (id == 0) {
                return ConstraintSet.KEY_PERCENT_PARENT;
            }
            String name = lookup(id);
            this.mIdMap.put(Integer.valueOf(id), name);
            return "@+id/" + name + "";
        }

        /* access modifiers changed from: package-private */
        public String lookup(int id) {
            if (id != -1) {
                try {
                    return this.mContext.getResources().getResourceEntryName(id);
                } catch (Exception e) {
                    StringBuilder append = new StringBuilder().append(EnvironmentCompat.MEDIA_UNKNOWN);
                    int i = this.mUnknownCount + 1;
                    this.mUnknownCount = i;
                    return append.append(i).toString();
                }
            } else {
                StringBuilder append2 = new StringBuilder().append(EnvironmentCompat.MEDIA_UNKNOWN);
                int i2 = this.mUnknownCount + 1;
                this.mUnknownCount = i2;
                return append2.append(i2).toString();
            }
        }

        /* access modifiers changed from: package-private */
        public void writeXmlConstraint(String str, int leftToLeft) throws IOException {
            if (leftToLeft != -1) {
                this.mWriter.write(SPACE + str);
                this.mWriter.write("=\"" + getName(leftToLeft) + "\"");
            }
        }

        /* access modifiers changed from: package-private */
        public void writeConstraint(String my, int leftToLeft, String other, int margin, int goneMargin) throws IOException {
            if (leftToLeft != -1) {
                this.mWriter.write(SPACE + my);
                this.mWriter.write(":[");
                this.mWriter.write(getName(leftToLeft));
                this.mWriter.write(" , ");
                this.mWriter.write(other);
                if (margin != 0) {
                    this.mWriter.write(" , " + margin);
                }
                this.mWriter.write("],\n");
            }
        }

        /* access modifiers changed from: package-private */
        public void writeCircle(int circleConstraint, float circleAngle, int circleRadius) throws IOException {
            if (circleConstraint != -1) {
                this.mWriter.write("circle");
                this.mWriter.write(":[");
                this.mWriter.write(getName(circleConstraint));
                this.mWriter.write(", " + circleAngle);
                this.mWriter.write(circleRadius + "]");
            }
        }

        /* access modifiers changed from: package-private */
        public void writeVariable(String name, int value) throws IOException {
            if (value != 0 && value != -1) {
                this.mWriter.write(SPACE + name + "=\"" + value + "\"\n");
            }
        }

        /* access modifiers changed from: package-private */
        public void writeVariable(String name, float value, float def) throws IOException {
            if (value != def) {
                this.mWriter.write(SPACE + name);
                this.mWriter.write("=\"" + value + "\"");
            }
        }

        /* access modifiers changed from: package-private */
        public void writeVariable(String name, String value, String def) throws IOException {
            if (value != null && !value.equals(def)) {
                this.mWriter.write(SPACE + name);
                this.mWriter.write("=\"" + value + "\"");
            }
        }

        /* access modifiers changed from: package-private */
        public void writeVariable(String name, int[] value) throws IOException {
            if (value != null) {
                this.mWriter.write(SPACE + name);
                this.mWriter.write(":");
                int i = 0;
                while (i < value.length) {
                    this.mWriter.write((i == 0 ? "[" : ", ") + getName(value[i]));
                    i++;
                }
                this.mWriter.write("],\n");
            }
        }

        /* access modifiers changed from: package-private */
        public void writeVariable(String name, String value) throws IOException {
            if (value != null) {
                this.mWriter.write(name);
                this.mWriter.write(":");
                this.mWriter.write(", " + value);
                this.mWriter.write("\n");
            }
        }
    }

    class WriteJsonEngine {
        private static final String SPACE = "       ";
        final String mBASELINE = "'baseline'";
        final String mBOTTOM = "'bottom'";
        Context mContext;
        final String mEND = "'end'";
        int mFlags;
        HashMap<Integer, String> mIdMap = new HashMap<>();
        final String mLEFT = "'left'";
        ConstraintLayout mLayout;
        final String mRIGHT = "'right'";
        final String mSTART = "'start'";
        final String mTOP = "'top'";
        int mUnknownCount = 0;
        Writer mWriter;

        WriteJsonEngine(Writer writer, ConstraintLayout layout, int flags) throws IOException {
            this.mWriter = writer;
            this.mLayout = layout;
            this.mContext = layout.getContext();
            this.mFlags = flags;
        }

        /* access modifiers changed from: package-private */
        public void writeLayout() throws IOException {
            this.mWriter.write("\n'ConstraintSet':{\n");
            for (Integer id : ConstraintSet.this.mConstraints.keySet()) {
                this.mWriter.write(getName(id.intValue()) + ":{\n");
                Layout l = ((Constraint) ConstraintSet.this.mConstraints.get(id)).layout;
                writeDimension("height", l.mHeight, l.heightDefault, l.heightPercent, l.heightMin, l.heightMax, l.constrainedHeight);
                writeDimension("width", l.mWidth, l.widthDefault, l.widthPercent, l.widthMin, l.widthMax, l.constrainedWidth);
                writeConstraint("'left'", l.leftToLeft, "'left'", l.leftMargin, l.goneLeftMargin);
                writeConstraint("'left'", l.leftToRight, "'right'", l.leftMargin, l.goneLeftMargin);
                writeConstraint("'right'", l.rightToLeft, "'left'", l.rightMargin, l.goneRightMargin);
                writeConstraint("'right'", l.rightToRight, "'right'", l.rightMargin, l.goneRightMargin);
                writeConstraint("'baseline'", l.baselineToBaseline, "'baseline'", -1, l.goneBaselineMargin);
                writeConstraint("'baseline'", l.baselineToTop, "'top'", -1, l.goneBaselineMargin);
                writeConstraint("'baseline'", l.baselineToBottom, "'bottom'", -1, l.goneBaselineMargin);
                writeConstraint("'top'", l.topToBottom, "'bottom'", l.topMargin, l.goneTopMargin);
                writeConstraint("'top'", l.topToTop, "'top'", l.topMargin, l.goneTopMargin);
                writeConstraint("'bottom'", l.bottomToBottom, "'bottom'", l.bottomMargin, l.goneBottomMargin);
                writeConstraint("'bottom'", l.bottomToTop, "'top'", l.bottomMargin, l.goneBottomMargin);
                writeConstraint("'start'", l.startToStart, "'start'", l.startMargin, l.goneStartMargin);
                writeConstraint("'start'", l.startToEnd, "'end'", l.startMargin, l.goneStartMargin);
                writeConstraint("'end'", l.endToStart, "'start'", l.endMargin, l.goneEndMargin);
                writeConstraint("'end'", l.endToEnd, "'end'", l.endMargin, l.goneEndMargin);
                writeVariable("'horizontalBias'", l.horizontalBias, 0.5f);
                writeVariable("'verticalBias'", l.verticalBias, 0.5f);
                writeCircle(l.circleConstraint, l.circleAngle, l.circleRadius);
                writeGuideline(l.orientation, l.guideBegin, l.guideEnd, l.guidePercent);
                writeVariable("'dimensionRatio'", l.dimensionRatio);
                writeVariable("'barrierMargin'", l.mBarrierMargin);
                writeVariable("'type'", l.mHelperType);
                writeVariable("'ReferenceId'", l.mReferenceIdString);
                writeVariable("'mBarrierAllowsGoneWidgets'", l.mBarrierAllowsGoneWidgets, true);
                writeVariable("'WrapBehavior'", l.mWrapBehavior);
                writeVariable("'verticalWeight'", l.verticalWeight);
                writeVariable("'horizontalWeight'", l.horizontalWeight);
                writeVariable("'horizontalChainStyle'", l.horizontalChainStyle);
                writeVariable("'verticalChainStyle'", l.verticalChainStyle);
                writeVariable("'barrierDirection'", l.mBarrierDirection);
                if (l.mReferenceIds != null) {
                    writeVariable("'ReferenceIds'", l.mReferenceIds);
                }
                this.mWriter.write("}\n");
            }
            this.mWriter.write("}\n");
        }

        private void writeGuideline(int orientation, int guideBegin, int guideEnd, float guidePercent) throws IOException {
            writeVariable("'orientation'", orientation);
            writeVariable("'guideBegin'", guideBegin);
            writeVariable("'guideEnd'", guideEnd);
            writeVariable("'guidePercent'", guidePercent);
        }

        private void writeDimension(String dimString, int dim, int dimDefault, float dimPercent, int dimMin, int dimMax, boolean unusedConstrainedDim) throws IOException {
            if (dim == 0) {
                if (dimMax == -1 && dimMin == -1) {
                    switch (dimDefault) {
                        case 1:
                            this.mWriter.write(SPACE + dimString + ": '???????????',\n");
                            return;
                        case 2:
                            this.mWriter.write(SPACE + dimString + ": '" + dimPercent + "%',\n");
                            return;
                        default:
                            return;
                    }
                } else {
                    switch (dimDefault) {
                        case 0:
                            this.mWriter.write(SPACE + dimString + ": {'spread' ," + dimMin + ", " + dimMax + "}\n");
                            return;
                        case 1:
                            this.mWriter.write(SPACE + dimString + ": {'wrap' ," + dimMin + ", " + dimMax + "}\n");
                            return;
                        case 2:
                            this.mWriter.write(SPACE + dimString + ": {'" + dimPercent + "'% ," + dimMin + ", " + dimMax + "}\n");
                            return;
                        default:
                            return;
                    }
                }
            } else if (dim == -2) {
                this.mWriter.write(SPACE + dimString + ": 'wrap'\n");
            } else if (dim == -1) {
                this.mWriter.write(SPACE + dimString + ": 'parent'\n");
            } else {
                this.mWriter.write(SPACE + dimString + ": " + dim + ",\n");
            }
        }

        /* access modifiers changed from: package-private */
        public String getName(int id) {
            if (this.mIdMap.containsKey(Integer.valueOf(id))) {
                return "'" + this.mIdMap.get(Integer.valueOf(id)) + "'";
            }
            if (id == 0) {
                return "'parent'";
            }
            String name = lookup(id);
            this.mIdMap.put(Integer.valueOf(id), name);
            return "'" + name + "'";
        }

        /* access modifiers changed from: package-private */
        public String lookup(int id) {
            if (id != -1) {
                try {
                    return this.mContext.getResources().getResourceEntryName(id);
                } catch (Exception e) {
                    StringBuilder append = new StringBuilder().append(EnvironmentCompat.MEDIA_UNKNOWN);
                    int i = this.mUnknownCount + 1;
                    this.mUnknownCount = i;
                    return append.append(i).toString();
                }
            } else {
                StringBuilder append2 = new StringBuilder().append(EnvironmentCompat.MEDIA_UNKNOWN);
                int i2 = this.mUnknownCount + 1;
                this.mUnknownCount = i2;
                return append2.append(i2).toString();
            }
        }

        /* access modifiers changed from: package-private */
        public void writeConstraint(String my, int leftToLeft, String other, int margin, int goneMargin) throws IOException {
            if (leftToLeft != -1) {
                this.mWriter.write(SPACE + my);
                this.mWriter.write(":[");
                this.mWriter.write(getName(leftToLeft));
                this.mWriter.write(" , ");
                this.mWriter.write(other);
                if (margin != 0) {
                    this.mWriter.write(" , " + margin);
                }
                this.mWriter.write("],\n");
            }
        }

        /* access modifiers changed from: package-private */
        public void writeCircle(int circleConstraint, float circleAngle, int circleRadius) throws IOException {
            if (circleConstraint != -1) {
                this.mWriter.write("       circle");
                this.mWriter.write(":[");
                this.mWriter.write(getName(circleConstraint));
                this.mWriter.write(", " + circleAngle);
                this.mWriter.write(circleRadius + "]");
            }
        }

        /* access modifiers changed from: package-private */
        public void writeVariable(String name, int value) throws IOException {
            if (value != 0 && value != -1) {
                this.mWriter.write(SPACE + name);
                this.mWriter.write(":");
                this.mWriter.write(", " + value);
                this.mWriter.write("\n");
            }
        }

        /* access modifiers changed from: package-private */
        public void writeVariable(String name, float value) throws IOException {
            if (value != -1.0f) {
                this.mWriter.write(SPACE + name);
                this.mWriter.write(": " + value);
                this.mWriter.write(",\n");
            }
        }

        /* access modifiers changed from: package-private */
        public void writeVariable(String name, float value, float def) throws IOException {
            if (value != def) {
                this.mWriter.write(SPACE + name);
                this.mWriter.write(": " + value);
                this.mWriter.write(",\n");
            }
        }

        /* access modifiers changed from: package-private */
        public void writeVariable(String name, boolean value) throws IOException {
            if (value) {
                this.mWriter.write(SPACE + name);
                this.mWriter.write(": " + value);
                this.mWriter.write(",\n");
            }
        }

        /* access modifiers changed from: package-private */
        public void writeVariable(String name, boolean value, boolean def) throws IOException {
            if (value != def) {
                this.mWriter.write(SPACE + name);
                this.mWriter.write(": " + value);
                this.mWriter.write(",\n");
            }
        }

        /* access modifiers changed from: package-private */
        public void writeVariable(String name, int[] value) throws IOException {
            if (value != null) {
                this.mWriter.write(SPACE + name);
                this.mWriter.write(": ");
                int i = 0;
                while (i < value.length) {
                    this.mWriter.write((i == 0 ? "[" : ", ") + getName(value[i]));
                    i++;
                }
                this.mWriter.write("],\n");
            }
        }

        /* access modifiers changed from: package-private */
        public void writeVariable(String name, String value) throws IOException {
            if (value != null) {
                this.mWriter.write(SPACE + name);
                this.mWriter.write(":");
                this.mWriter.write(", " + value);
                this.mWriter.write("\n");
            }
        }
    }
}
