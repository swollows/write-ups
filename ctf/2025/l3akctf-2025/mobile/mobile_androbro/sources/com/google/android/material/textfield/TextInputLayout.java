package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEFAULT_PLACEHOLDER_FADE_DURATION = 87;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_TextInputLayout;
    private static final int[][] EDIT_TEXT_BACKGROUND_RIPPLE_STATE = {new int[]{16842919}, new int[0]};
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final String LOG_TAG = "TextInputLayout";
    private static final int NO_WIDTH = -1;
    private static final int PLACEHOLDER_START_DELAY = 67;
    private ValueAnimator animator;
    private boolean areCornerRadiiRtl;
    private MaterialShapeDrawable boxBackground;
    private boolean boxBackgroundApplied;
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;
    private MaterialShapeDrawable boxUnderlineDefault;
    private MaterialShapeDrawable boxUnderlineFocused;
    final CollapsingTextHelper collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;
    private ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;
    private ColorStateList counterTextColor;
    private TextView counterView;
    private ColorStateList cursorColor;
    private ColorStateList cursorErrorColor;
    private int defaultFilledBackgroundColor;
    private ColorStateList defaultHintTextColor;
    private int defaultStrokeColor;
    private int disabledColor;
    private int disabledFilledBackgroundColor;
    EditText editText;
    private final LinkedHashSet<OnEditTextAttachedListener> editTextAttachedListeners;
    private Drawable endDummyDrawable;
    private int endDummyDrawableWidth;
    /* access modifiers changed from: private */
    public final EndCompoundLayout endLayout;
    private boolean expandedHintEnabled;
    private StateListDrawable filledDropDownMenuBackground;
    private int focusedFilledBackgroundColor;
    private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private boolean globalLayoutListenerAdded;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;
    private int hoveredFilledBackgroundColor;
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    /* access modifiers changed from: private */
    public final IndicatorViewController indicatorViewController;
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;
    private LengthCounter lengthCounter;
    private int maxEms;
    private int maxWidth;
    private int minEms;
    private int minWidth;
    private Drawable originalEditTextEndDrawable;
    int originalEditTextMinimumHeight;
    private CharSequence originalHint;
    private MaterialShapeDrawable outlinedDropDownMenuBackground;
    /* access modifiers changed from: private */
    public boolean placeholderEnabled;
    private Fade placeholderFadeIn;
    private Fade placeholderFadeOut;
    private CharSequence placeholderText;
    private int placeholderTextAppearance;
    private ColorStateList placeholderTextColor;
    private TextView placeholderTextView;
    /* access modifiers changed from: private */
    public boolean restoringSavedState;
    private ShapeAppearanceModel shapeAppearanceModel;
    private Drawable startDummyDrawable;
    private int startDummyDrawableWidth;
    /* access modifiers changed from: private */
    public final StartCompoundLayout startLayout;
    private ColorStateList strokeErrorColor;
    private final Rect tmpBoundsRect;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface EndIconMode {
    }

    public interface LengthCounter {
        int countLength(Editable editable);
    }

    public interface OnEditTextAttachedListener {
        void onEditTextAttached(TextInputLayout textInputLayout);
    }

    public interface OnEndIconChangedListener {
        void onEndIconChanged(TextInputLayout textInputLayout, int i);
    }

    static /* synthetic */ int lambda$new$0(Editable text) {
        if (text != null) {
            return text.length();
        }
        return 0;
    }

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public TextInputLayout(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.textInputStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r25, android.util.AttributeSet r26, int r27) {
        /*
            r24 = this;
            r0 = r24
            r7 = r26
            r8 = r27
            int r1 = DEF_STYLE_RES
            r2 = r25
            android.content.Context r1 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r2, r7, r8, r1)
            r0.<init>(r1, r7, r8)
            r9 = -1
            r0.minEms = r9
            r0.maxEms = r9
            r0.minWidth = r9
            r0.maxWidth = r9
            com.google.android.material.textfield.IndicatorViewController r1 = new com.google.android.material.textfield.IndicatorViewController
            r1.<init>(r0)
            r0.indicatorViewController = r1
            com.google.android.material.textfield.TextInputLayout$$ExternalSyntheticLambda1 r1 = new com.google.android.material.textfield.TextInputLayout$$ExternalSyntheticLambda1
            r1.<init>()
            r0.lengthCounter = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.tmpRect = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.tmpBoundsRect = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.tmpRectF = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.editTextAttachedListeners = r1
            com.google.android.material.internal.CollapsingTextHelper r1 = new com.google.android.material.internal.CollapsingTextHelper
            r1.<init>(r0)
            r0.collapsingTextHelper = r1
            r10 = 0
            r0.globalLayoutListenerAdded = r10
            android.content.Context r11 = r24.getContext()
            r12 = 1
            r0.setOrientation(r12)
            r0.setWillNotDraw(r10)
            r0.setAddStatesFromChildren(r12)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r11)
            r0.inputFrame = r1
            android.widget.FrameLayout r1 = r0.inputFrame
            r1.setAddStatesFromChildren(r12)
            com.google.android.material.internal.CollapsingTextHelper r1 = r0.collapsingTextHelper
            android.animation.TimeInterpolator r2 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            r1.setTextSizeInterpolator(r2)
            com.google.android.material.internal.CollapsingTextHelper r1 = r0.collapsingTextHelper
            android.animation.TimeInterpolator r2 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            r1.setPositionInterpolator(r2)
            com.google.android.material.internal.CollapsingTextHelper r1 = r0.collapsingTextHelper
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.setCollapsedTextGravity(r2)
            int[] r3 = com.google.android.material.R.styleable.TextInputLayout
            int r5 = DEF_STYLE_RES
            int r1 = com.google.android.material.R.styleable.TextInputLayout_counterTextAppearance
            int r2 = com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextAppearance
            int r4 = com.google.android.material.R.styleable.TextInputLayout_errorTextAppearance
            int r6 = com.google.android.material.R.styleable.TextInputLayout_helperTextTextAppearance
            int r13 = com.google.android.material.R.styleable.TextInputLayout_hintTextAppearance
            int[] r6 = new int[]{r1, r2, r4, r6, r13}
            r1 = r11
            r2 = r26
            r4 = r27
            androidx.appcompat.widget.TintTypedArray r1 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r1, r2, r3, r4, r5, r6)
            com.google.android.material.textfield.StartCompoundLayout r2 = new com.google.android.material.textfield.StartCompoundLayout
            r2.<init>(r0, r1)
            r0.startLayout = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_hintEnabled
            boolean r2 = r1.getBoolean(r2, r12)
            r0.hintEnabled = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_android_hint
            java.lang.CharSequence r2 = r1.getText(r2)
            r0.setHint((java.lang.CharSequence) r2)
            int r2 = com.google.android.material.R.styleable.TextInputLayout_hintAnimationEnabled
            boolean r2 = r1.getBoolean(r2, r12)
            r0.hintAnimationEnabled = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_expandedHintEnabled
            boolean r2 = r1.getBoolean(r2, r12)
            r0.expandedHintEnabled = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_android_minEms
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x00d3
            int r2 = com.google.android.material.R.styleable.TextInputLayout_android_minEms
            int r2 = r1.getInt(r2, r9)
            r0.setMinEms(r2)
            goto L_0x00e4
        L_0x00d3:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_android_minWidth
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x00e4
            int r2 = com.google.android.material.R.styleable.TextInputLayout_android_minWidth
            int r2 = r1.getDimensionPixelSize(r2, r9)
            r0.setMinWidth(r2)
        L_0x00e4:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_android_maxEms
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x00f6
            int r2 = com.google.android.material.R.styleable.TextInputLayout_android_maxEms
            int r2 = r1.getInt(r2, r9)
            r0.setMaxEms(r2)
            goto L_0x0107
        L_0x00f6:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_android_maxWidth
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x0107
            int r2 = com.google.android.material.R.styleable.TextInputLayout_android_maxWidth
            int r2 = r1.getDimensionPixelSize(r2, r9)
            r0.setMaxWidth(r2)
        L_0x0107:
            int r2 = DEF_STYLE_RES
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = com.google.android.material.shape.ShapeAppearanceModel.builder((android.content.Context) r11, (android.util.AttributeSet) r7, (int) r8, (int) r2)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.build()
            r0.shapeAppearanceModel = r2
            android.content.res.Resources r2 = r11.getResources()
            int r3 = com.google.android.material.R.dimen.mtrl_textinput_box_label_cutout_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            r0.boxLabelCutoutPaddingPx = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxCollapsedPaddingTop
            int r2 = r1.getDimensionPixelOffset(r2, r10)
            r0.boxCollapsedPaddingTopPx = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r3 = r11.getResources()
            int r4 = com.google.android.material.R.dimen.mtrl_textinput_box_stroke_width_default
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.boxStrokeWidthDefaultPx = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r3 = r11.getResources()
            int r4 = com.google.android.material.R.dimen.mtrl_textinput_box_stroke_width_focused
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.boxStrokeWidthFocusedPx = r2
            int r2 = r0.boxStrokeWidthDefaultPx
            r0.boxStrokeWidthPx = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusTopStart
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.getDimension(r2, r3)
            int r4 = com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusTopEnd
            float r4 = r1.getDimension(r4, r3)
            int r5 = com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusBottomEnd
            float r5 = r1.getDimension(r5, r3)
            int r6 = com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusBottomStart
            float r3 = r1.getDimension(r6, r3)
            com.google.android.material.shape.ShapeAppearanceModel r6 = r0.shapeAppearanceModel
            com.google.android.material.shape.ShapeAppearanceModel$Builder r6 = r6.toBuilder()
            r13 = 0
            int r14 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r14 < 0) goto L_0x0178
            r6.setTopLeftCornerSize((float) r2)
        L_0x0178:
            int r14 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r14 < 0) goto L_0x017f
            r6.setTopRightCornerSize((float) r4)
        L_0x017f:
            int r14 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r14 < 0) goto L_0x0186
            r6.setBottomRightCornerSize((float) r5)
        L_0x0186:
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L_0x018d
            r6.setBottomLeftCornerSize((float) r3)
        L_0x018d:
            com.google.android.material.shape.ShapeAppearanceModel r13 = r6.build()
            r0.shapeAppearanceModel = r13
            int r13 = com.google.android.material.R.styleable.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r13 = com.google.android.material.resources.MaterialResources.getColorStateList((android.content.Context) r11, (androidx.appcompat.widget.TintTypedArray) r1, (int) r13)
            if (r13 == 0) goto L_0x01f5
            int r14 = r13.getDefaultColor()
            r0.defaultFilledBackgroundColor = r14
            int r14 = r0.defaultFilledBackgroundColor
            r0.boxBackgroundColor = r14
            boolean r14 = r13.isStateful()
            r15 = 16843623(0x1010367, float:2.3696E-38)
            r16 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r14 == 0) goto L_0x01d6
            int[] r14 = new int[]{r16}
            int r14 = r13.getColorForState(r14, r9)
            r0.disabledFilledBackgroundColor = r14
            r14 = 16842908(0x101009c, float:2.3693995E-38)
            r12 = 16842910(0x101009e, float:2.3694E-38)
            int[] r14 = new int[]{r14, r12}
            int r14 = r13.getColorForState(r14, r9)
            r0.focusedFilledBackgroundColor = r14
            int[] r12 = new int[]{r15, r12}
            int r12 = r13.getColorForState(r12, r9)
            r0.hoveredFilledBackgroundColor = r12
            goto L_0x01ff
        L_0x01d6:
            int r12 = r0.defaultFilledBackgroundColor
            r0.focusedFilledBackgroundColor = r12
            int r12 = com.google.android.material.R.color.mtrl_filled_background_color
            android.content.res.ColorStateList r12 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r11, r12)
            int[] r14 = new int[]{r16}
            int r14 = r12.getColorForState(r14, r9)
            r0.disabledFilledBackgroundColor = r14
            int[] r14 = new int[]{r15}
            int r14 = r12.getColorForState(r14, r9)
            r0.hoveredFilledBackgroundColor = r14
            goto L_0x01ff
        L_0x01f5:
            r0.boxBackgroundColor = r10
            r0.defaultFilledBackgroundColor = r10
            r0.disabledFilledBackgroundColor = r10
            r0.focusedFilledBackgroundColor = r10
            r0.hoveredFilledBackgroundColor = r10
        L_0x01ff:
            int r12 = com.google.android.material.R.styleable.TextInputLayout_android_textColorHint
            boolean r12 = r1.hasValue(r12)
            if (r12 == 0) goto L_0x0211
            int r12 = com.google.android.material.R.styleable.TextInputLayout_android_textColorHint
            android.content.res.ColorStateList r12 = r1.getColorStateList(r12)
            r0.focusedTextColor = r12
            r0.defaultHintTextColor = r12
        L_0x0211:
            int r12 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r12 = com.google.android.material.resources.MaterialResources.getColorStateList((android.content.Context) r11, (androidx.appcompat.widget.TintTypedArray) r1, (int) r12)
            int r14 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeColor
            int r14 = r1.getColor(r14, r10)
            r0.focusedStrokeColor = r14
            int r14 = com.google.android.material.R.color.mtrl_textinput_default_box_stroke_color
            int r14 = androidx.core.content.ContextCompat.getColor(r11, r14)
            r0.defaultStrokeColor = r14
            int r14 = com.google.android.material.R.color.mtrl_textinput_disabled_color
            int r14 = androidx.core.content.ContextCompat.getColor(r11, r14)
            r0.disabledColor = r14
            int r14 = com.google.android.material.R.color.mtrl_textinput_hovered_box_stroke_color
            int r14 = androidx.core.content.ContextCompat.getColor(r11, r14)
            r0.hoveredStrokeColor = r14
            if (r12 == 0) goto L_0x023c
            r0.setBoxStrokeColorStateList(r12)
        L_0x023c:
            int r14 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeErrorColor
            boolean r14 = r1.hasValue(r14)
            if (r14 == 0) goto L_0x024d
            int r14 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeErrorColor
            android.content.res.ColorStateList r14 = com.google.android.material.resources.MaterialResources.getColorStateList((android.content.Context) r11, (androidx.appcompat.widget.TintTypedArray) r1, (int) r14)
            r0.setBoxStrokeErrorColor(r14)
        L_0x024d:
            int r14 = com.google.android.material.R.styleable.TextInputLayout_hintTextAppearance
            int r14 = r1.getResourceId(r14, r9)
            if (r14 == r9) goto L_0x025e
            int r15 = com.google.android.material.R.styleable.TextInputLayout_hintTextAppearance
            int r15 = r1.getResourceId(r15, r10)
            r0.setHintTextAppearance(r15)
        L_0x025e:
            int r15 = com.google.android.material.R.styleable.TextInputLayout_cursorColor
            android.content.res.ColorStateList r15 = r1.getColorStateList(r15)
            r0.cursorColor = r15
            int r15 = com.google.android.material.R.styleable.TextInputLayout_cursorErrorColor
            android.content.res.ColorStateList r15 = r1.getColorStateList(r15)
            r0.cursorErrorColor = r15
            int r15 = com.google.android.material.R.styleable.TextInputLayout_errorTextAppearance
            int r15 = r1.getResourceId(r15, r10)
            int r9 = com.google.android.material.R.styleable.TextInputLayout_errorContentDescription
            java.lang.CharSequence r9 = r1.getText(r9)
            int r10 = com.google.android.material.R.styleable.TextInputLayout_errorAccessibilityLiveRegion
            r18 = r2
            r2 = 1
            int r10 = r1.getInt(r10, r2)
            int r2 = com.google.android.material.R.styleable.TextInputLayout_errorEnabled
            r19 = r3
            r3 = 0
            boolean r2 = r1.getBoolean(r2, r3)
            r17 = r4
            int r4 = com.google.android.material.R.styleable.TextInputLayout_helperTextTextAppearance
            int r4 = r1.getResourceId(r4, r3)
            r20 = r5
            int r5 = com.google.android.material.R.styleable.TextInputLayout_helperTextEnabled
            boolean r5 = r1.getBoolean(r5, r3)
            int r3 = com.google.android.material.R.styleable.TextInputLayout_helperText
            java.lang.CharSequence r3 = r1.getText(r3)
            r21 = r6
            int r6 = com.google.android.material.R.styleable.TextInputLayout_placeholderTextAppearance
            r7 = 0
            int r6 = r1.getResourceId(r6, r7)
            int r7 = com.google.android.material.R.styleable.TextInputLayout_placeholderText
            java.lang.CharSequence r7 = r1.getText(r7)
            int r8 = com.google.android.material.R.styleable.TextInputLayout_counterEnabled
            r22 = r11
            r11 = 0
            boolean r8 = r1.getBoolean(r8, r11)
            int r11 = com.google.android.material.R.styleable.TextInputLayout_counterMaxLength
            r23 = r12
            r12 = -1
            int r11 = r1.getInt(r11, r12)
            r0.setCounterMaxLength(r11)
            int r11 = com.google.android.material.R.styleable.TextInputLayout_counterTextAppearance
            r12 = 0
            int r11 = r1.getResourceId(r11, r12)
            r0.counterTextAppearance = r11
            int r11 = com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextAppearance
            int r11 = r1.getResourceId(r11, r12)
            r0.counterOverflowTextAppearance = r11
            int r11 = com.google.android.material.R.styleable.TextInputLayout_boxBackgroundMode
            int r11 = r1.getInt(r11, r12)
            r0.setBoxBackgroundMode(r11)
            r0.setErrorContentDescription(r9)
            r0.setErrorAccessibilityLiveRegion(r10)
            int r11 = r0.counterOverflowTextAppearance
            r0.setCounterOverflowTextAppearance(r11)
            r0.setHelperTextTextAppearance(r4)
            r0.setErrorTextAppearance(r15)
            int r11 = r0.counterTextAppearance
            r0.setCounterTextAppearance(r11)
            r0.setPlaceholderText(r7)
            r0.setPlaceholderTextAppearance(r6)
            int r11 = com.google.android.material.R.styleable.TextInputLayout_errorTextColor
            boolean r11 = r1.hasValue(r11)
            if (r11 == 0) goto L_0x030d
            int r11 = com.google.android.material.R.styleable.TextInputLayout_errorTextColor
            android.content.res.ColorStateList r11 = r1.getColorStateList(r11)
            r0.setErrorTextColor(r11)
        L_0x030d:
            int r11 = com.google.android.material.R.styleable.TextInputLayout_helperTextTextColor
            boolean r11 = r1.hasValue(r11)
            if (r11 == 0) goto L_0x031e
            int r11 = com.google.android.material.R.styleable.TextInputLayout_helperTextTextColor
            android.content.res.ColorStateList r11 = r1.getColorStateList(r11)
            r0.setHelperTextColor(r11)
        L_0x031e:
            int r11 = com.google.android.material.R.styleable.TextInputLayout_hintTextColor
            boolean r11 = r1.hasValue(r11)
            if (r11 == 0) goto L_0x032f
            int r11 = com.google.android.material.R.styleable.TextInputLayout_hintTextColor
            android.content.res.ColorStateList r11 = r1.getColorStateList(r11)
            r0.setHintTextColor(r11)
        L_0x032f:
            int r11 = com.google.android.material.R.styleable.TextInputLayout_counterTextColor
            boolean r11 = r1.hasValue(r11)
            if (r11 == 0) goto L_0x0340
            int r11 = com.google.android.material.R.styleable.TextInputLayout_counterTextColor
            android.content.res.ColorStateList r11 = r1.getColorStateList(r11)
            r0.setCounterTextColor(r11)
        L_0x0340:
            int r11 = com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextColor
            boolean r11 = r1.hasValue(r11)
            if (r11 == 0) goto L_0x0351
            int r11 = com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextColor
            android.content.res.ColorStateList r11 = r1.getColorStateList(r11)
            r0.setCounterOverflowTextColor(r11)
        L_0x0351:
            int r11 = com.google.android.material.R.styleable.TextInputLayout_placeholderTextColor
            boolean r11 = r1.hasValue(r11)
            if (r11 == 0) goto L_0x0362
            int r11 = com.google.android.material.R.styleable.TextInputLayout_placeholderTextColor
            android.content.res.ColorStateList r11 = r1.getColorStateList(r11)
            r0.setPlaceholderTextColor(r11)
        L_0x0362:
            com.google.android.material.textfield.EndCompoundLayout r11 = new com.google.android.material.textfield.EndCompoundLayout
            r11.<init>(r0, r1)
            r0.endLayout = r11
            int r11 = com.google.android.material.R.styleable.TextInputLayout_android_enabled
            r12 = 1
            boolean r11 = r1.getBoolean(r11, r12)
            r1.recycle()
            r12 = 2
            androidx.core.view.ViewCompat.setImportantForAccessibility(r0, r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            r16 = r1
            r1 = 26
            if (r12 < r1) goto L_0x0383
            r1 = 1
            androidx.core.view.ViewCompat.setImportantForAutofill(r0, r1)
        L_0x0383:
            android.widget.FrameLayout r1 = r0.inputFrame
            com.google.android.material.textfield.StartCompoundLayout r12 = r0.startLayout
            r1.addView(r12)
            android.widget.FrameLayout r1 = r0.inputFrame
            com.google.android.material.textfield.EndCompoundLayout r12 = r0.endLayout
            r1.addView(r12)
            android.widget.FrameLayout r1 = r0.inputFrame
            r0.addView(r1)
            r0.setEnabled(r11)
            r0.setHelperTextEnabled(r5)
            r0.setErrorEnabled(r2)
            r0.setCounterEnabled(r8)
            r0.setHelperText(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void onGlobalLayout() {
        this.endLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.globalLayoutListenerAdded = false;
        boolean updatedHeight = updateEditTextHeightBasedOnIcon();
        boolean updatedIcon = updateDummyDrawables();
        if (updatedHeight || updatedIcon) {
            this.editText.post(new TextInputLayout$$ExternalSyntheticLambda0(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onGlobalLayout$1$com-google-android-material-textfield-TextInputLayout  reason: not valid java name */
    public /* synthetic */ void m272lambda$onGlobalLayout$1$comgoogleandroidmaterialtextfieldTextInputLayout() {
        this.editText.requestLayout();
    }

    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (child instanceof EditText) {
            FrameLayout.LayoutParams flp = new FrameLayout.LayoutParams(params);
            flp.gravity = (flp.gravity & -113) | 16;
            this.inputFrame.addView(child, flp);
            this.inputFrame.setLayoutParams(params);
            updateInputLayoutMargins();
            setEditText((EditText) child);
            return;
        }
        super.addView(child, index, params);
    }

    /* access modifiers changed from: package-private */
    public MaterialShapeDrawable getBoxBackground() {
        if (this.boxBackgroundMode == 1 || this.boxBackgroundMode == 2) {
            return this.boxBackground;
        }
        throw new IllegalStateException();
    }

    public void setBoxBackgroundMode(int boxBackgroundMode2) {
        if (boxBackgroundMode2 != this.boxBackgroundMode) {
            this.boxBackgroundMode = boxBackgroundMode2;
            if (this.editText != null) {
                onApplyBoxBackgroundMode();
            }
        }
    }

    public int getBoxBackgroundMode() {
        return this.boxBackgroundMode;
    }

    private void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        updateEditTextBoxBackgroundIfNeeded();
        updateTextInputBoxState();
        updateBoxCollapsedPaddingTop();
        adjustFilledEditTextPaddingForLargeFont();
        if (this.boxBackgroundMode != 0) {
            updateInputLayoutMargins();
        }
        setDropDownMenuBackgroundIfNeeded();
    }

    private void assignBoxBackgroundByMode() {
        switch (this.boxBackgroundMode) {
            case 0:
                this.boxBackground = null;
                this.boxUnderlineDefault = null;
                this.boxUnderlineFocused = null;
                return;
            case 1:
                this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
                this.boxUnderlineDefault = new MaterialShapeDrawable();
                this.boxUnderlineFocused = new MaterialShapeDrawable();
                return;
            case 2:
                if (!this.hintEnabled || (this.boxBackground instanceof CutoutDrawable)) {
                    this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
                } else {
                    this.boxBackground = CutoutDrawable.create(this.shapeAppearanceModel);
                }
                this.boxUnderlineDefault = null;
                this.boxUnderlineFocused = null;
                return;
            default:
                throw new IllegalArgumentException(this.boxBackgroundMode + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    /* access modifiers changed from: package-private */
    public void updateEditTextBoxBackgroundIfNeeded() {
        if (this.editText != null && this.boxBackground != null) {
            if ((this.boxBackgroundApplied || this.editText.getBackground() == null) && this.boxBackgroundMode != 0) {
                updateEditTextBoxBackground();
                this.boxBackgroundApplied = true;
            }
        }
    }

    private void updateEditTextBoxBackground() {
        ViewCompat.setBackground(this.editText, getEditTextBoxBackground());
    }

    private Drawable getEditTextBoxBackground() {
        if (!(this.editText instanceof AutoCompleteTextView) || EditTextUtils.isEditable(this.editText)) {
            return this.boxBackground;
        }
        int rippleColor = MaterialColors.getColor(this.editText, R.attr.colorControlHighlight);
        if (this.boxBackgroundMode == 2) {
            return getOutlinedBoxBackgroundWithRipple(getContext(), this.boxBackground, rippleColor, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
        }
        if (this.boxBackgroundMode == 1) {
            return getFilledBoxBackgroundWithRipple(this.boxBackground, this.boxBackgroundColor, rippleColor, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
        }
        return null;
    }

    private static Drawable getOutlinedBoxBackgroundWithRipple(Context context, MaterialShapeDrawable boxBackground2, int rippleColor, int[][] states) {
        int surfaceColor = MaterialColors.getColor(context, R.attr.colorSurface, LOG_TAG);
        MaterialShapeDrawable rippleBackground = new MaterialShapeDrawable(boxBackground2.getShapeAppearanceModel());
        int pressedBackgroundColor = MaterialColors.layer(rippleColor, surfaceColor, 0.1f);
        rippleBackground.setFillColor(new ColorStateList(states, new int[]{pressedBackgroundColor, 0}));
        rippleBackground.setTint(surfaceColor);
        ColorStateList rippleColorStateList = new ColorStateList(states, new int[]{pressedBackgroundColor, surfaceColor});
        MaterialShapeDrawable mask = new MaterialShapeDrawable(boxBackground2.getShapeAppearanceModel());
        mask.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(rippleColorStateList, rippleBackground, mask), boxBackground2});
    }

    private static Drawable getFilledBoxBackgroundWithRipple(MaterialShapeDrawable boxBackground2, int boxBackgroundColor2, int rippleColor, int[][] states) {
        return new RippleDrawable(new ColorStateList(states, new int[]{MaterialColors.layer(rippleColor, boxBackgroundColor2, 0.1f), boxBackgroundColor2}), boxBackground2, boxBackground2);
    }

    private void setDropDownMenuBackgroundIfNeeded() {
        if (this.editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.editText;
            if (autoCompleteTextView.getDropDownBackground() != null) {
                return;
            }
            if (this.boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
            } else if (this.boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
            }
        }
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.outlinedDropDownMenuBackground == null) {
            this.outlinedDropDownMenuBackground = getDropDownMaterialShapeDrawable(true);
        }
        return this.outlinedDropDownMenuBackground;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.filledDropDownMenuBackground == null) {
            this.filledDropDownMenuBackground = new StateListDrawable();
            this.filledDropDownMenuBackground.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.filledDropDownMenuBackground.addState(new int[0], getDropDownMaterialShapeDrawable(false));
        }
        return this.filledDropDownMenuBackground;
    }

    private MaterialShapeDrawable getDropDownMaterialShapeDrawable(boolean roundedTopCorners) {
        float elevation;
        float cornerRadius = (float) getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float topCornerRadius = roundedTopCorners ? cornerRadius : 0.0f;
        if (this.editText instanceof MaterialAutoCompleteTextView) {
            elevation = ((MaterialAutoCompleteTextView) this.editText).getPopupElevation();
        } else {
            elevation = (float) getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int verticalPadding = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ShapeAppearanceModel shapeAppearanceModel2 = ShapeAppearanceModel.builder().setTopLeftCornerSize(topCornerRadius).setTopRightCornerSize(topCornerRadius).setBottomLeftCornerSize(cornerRadius).setBottomRightCornerSize(cornerRadius).build();
        ColorStateList dropDownBackgroundTint = null;
        if (this.editText instanceof MaterialAutoCompleteTextView) {
            dropDownBackgroundTint = ((MaterialAutoCompleteTextView) this.editText).getDropDownBackgroundTintList();
        }
        MaterialShapeDrawable popupDrawable = MaterialShapeDrawable.createWithElevationOverlay(getContext(), elevation, dropDownBackgroundTint);
        popupDrawable.setShapeAppearanceModel(shapeAppearanceModel2);
        popupDrawable.setPadding(0, verticalPadding, 0, verticalPadding);
        return popupDrawable;
    }

    private void updateBoxCollapsedPaddingTop() {
        if (this.boxBackgroundMode != 1) {
            return;
        }
        if (MaterialResources.isFontScaleAtLeast2_0(getContext())) {
            this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
        } else if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
        }
    }

    private void adjustFilledEditTextPaddingForLargeFont() {
        if (this.editText != null && this.boxBackgroundMode == 1) {
            if (MaterialResources.isFontScaleAtLeast2_0(getContext())) {
                ViewCompat.setPaddingRelative(this.editText, ViewCompat.getPaddingStart(this.editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), ViewCompat.getPaddingEnd(this.editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
                ViewCompat.setPaddingRelative(this.editText, ViewCompat.getPaddingStart(this.editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), ViewCompat.getPaddingEnd(this.editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int boxCollapsedPaddingTop) {
        this.boxCollapsedPaddingTopPx = boxCollapsedPaddingTop;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.boxCollapsedPaddingTopPx;
    }

    public void setBoxStrokeWidthResource(int boxStrokeWidthResId) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(boxStrokeWidthResId));
    }

    public void setBoxStrokeWidth(int boxStrokeWidth) {
        this.boxStrokeWidthDefaultPx = boxStrokeWidth;
        updateTextInputBoxState();
    }

    public int getBoxStrokeWidth() {
        return this.boxStrokeWidthDefaultPx;
    }

    public void setBoxStrokeWidthFocusedResource(int boxStrokeWidthFocusedResId) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(boxStrokeWidthFocusedResId));
    }

    public void setBoxStrokeWidthFocused(int boxStrokeWidthFocused) {
        this.boxStrokeWidthFocusedPx = boxStrokeWidthFocused;
        updateTextInputBoxState();
    }

    public int getBoxStrokeWidthFocused() {
        return this.boxStrokeWidthFocusedPx;
    }

    public void setBoxStrokeColor(int boxStrokeColor2) {
        if (this.focusedStrokeColor != boxStrokeColor2) {
            this.focusedStrokeColor = boxStrokeColor2;
            updateTextInputBoxState();
        }
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    public void setBoxStrokeColorStateList(ColorStateList boxStrokeColorStateList) {
        if (boxStrokeColorStateList.isStateful()) {
            this.defaultStrokeColor = boxStrokeColorStateList.getDefaultColor();
            this.disabledColor = boxStrokeColorStateList.getColorForState(new int[]{-16842910}, -1);
            this.hoveredStrokeColor = boxStrokeColorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.focusedStrokeColor = boxStrokeColorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.focusedStrokeColor != boxStrokeColorStateList.getDefaultColor()) {
            this.focusedStrokeColor = boxStrokeColorStateList.getDefaultColor();
        }
        updateTextInputBoxState();
    }

    public void setBoxStrokeErrorColor(ColorStateList strokeErrorColor2) {
        if (this.strokeErrorColor != strokeErrorColor2) {
            this.strokeErrorColor = strokeErrorColor2;
            updateTextInputBoxState();
        }
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.strokeErrorColor;
    }

    public void setBoxBackgroundColorResource(int boxBackgroundColorId) {
        setBoxBackgroundColor(ContextCompat.getColor(getContext(), boxBackgroundColorId));
    }

    public void setBoxBackgroundColor(int boxBackgroundColor2) {
        if (this.boxBackgroundColor != boxBackgroundColor2) {
            this.boxBackgroundColor = boxBackgroundColor2;
            this.defaultFilledBackgroundColor = boxBackgroundColor2;
            this.focusedFilledBackgroundColor = boxBackgroundColor2;
            this.hoveredFilledBackgroundColor = boxBackgroundColor2;
            applyBoxAttributes();
        }
    }

    public void setBoxBackgroundColorStateList(ColorStateList boxBackgroundColorStateList) {
        this.defaultFilledBackgroundColor = boxBackgroundColorStateList.getDefaultColor();
        this.boxBackgroundColor = this.defaultFilledBackgroundColor;
        this.disabledFilledBackgroundColor = boxBackgroundColorStateList.getColorForState(new int[]{-16842910}, -1);
        this.focusedFilledBackgroundColor = boxBackgroundColorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.hoveredFilledBackgroundColor = boxBackgroundColorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        applyBoxAttributes();
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel2) {
        if (this.boxBackground != null && this.boxBackground.getShapeAppearanceModel() != shapeAppearanceModel2) {
            this.shapeAppearanceModel = shapeAppearanceModel2;
            applyBoxAttributes();
        }
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    public void setBoxCornerFamily(int cornerFamily) {
        this.shapeAppearanceModel = this.shapeAppearanceModel.toBuilder().setTopLeftCorner(cornerFamily, this.shapeAppearanceModel.getTopLeftCornerSize()).setTopRightCorner(cornerFamily, this.shapeAppearanceModel.getTopRightCornerSize()).setBottomLeftCorner(cornerFamily, this.shapeAppearanceModel.getBottomLeftCornerSize()).setBottomRightCorner(cornerFamily, this.shapeAppearanceModel.getBottomRightCornerSize()).build();
        applyBoxAttributes();
    }

    public void setBoxCornerRadiiResources(int boxCornerRadiusTopStartId, int boxCornerRadiusTopEndId, int boxCornerRadiusBottomEndId, int boxCornerRadiusBottomStartId) {
        setBoxCornerRadii(getContext().getResources().getDimension(boxCornerRadiusTopStartId), getContext().getResources().getDimension(boxCornerRadiusTopEndId), getContext().getResources().getDimension(boxCornerRadiusBottomStartId), getContext().getResources().getDimension(boxCornerRadiusBottomEndId));
    }

    public void setBoxCornerRadii(float boxCornerRadiusTopStart, float boxCornerRadiusTopEnd, float boxCornerRadiusBottomStart, float boxCornerRadiusBottomEnd) {
        this.areCornerRadiiRtl = ViewUtils.isLayoutRtl(this);
        float boxCornerRadiusTopLeft = this.areCornerRadiiRtl ? boxCornerRadiusTopEnd : boxCornerRadiusTopStart;
        float boxCornerRadiusTopRight = this.areCornerRadiiRtl ? boxCornerRadiusTopStart : boxCornerRadiusTopEnd;
        float boxCornerRadiusBottomLeft = this.areCornerRadiiRtl ? boxCornerRadiusBottomEnd : boxCornerRadiusBottomStart;
        float boxCornerRadiusBottomRight = this.areCornerRadiiRtl ? boxCornerRadiusBottomStart : boxCornerRadiusBottomEnd;
        if (this.boxBackground == null || this.boxBackground.getTopLeftCornerResolvedSize() != boxCornerRadiusTopLeft || this.boxBackground.getTopRightCornerResolvedSize() != boxCornerRadiusTopRight || this.boxBackground.getBottomLeftCornerResolvedSize() != boxCornerRadiusBottomLeft || this.boxBackground.getBottomRightCornerResolvedSize() != boxCornerRadiusBottomRight) {
            this.shapeAppearanceModel = this.shapeAppearanceModel.toBuilder().setTopLeftCornerSize(boxCornerRadiusTopLeft).setTopRightCornerSize(boxCornerRadiusTopRight).setBottomLeftCornerSize(boxCornerRadiusBottomLeft).setBottomRightCornerSize(boxCornerRadiusBottomRight).build();
            applyBoxAttributes();
        }
    }

    public float getBoxCornerRadiusTopStart() {
        if (ViewUtils.isLayoutRtl(this)) {
            return this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
        }
        return this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (ViewUtils.isLayoutRtl(this)) {
            return this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
        }
        return this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (ViewUtils.isLayoutRtl(this)) {
            return this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF);
        }
        return this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (ViewUtils.isLayoutRtl(this)) {
            return this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF);
        }
        return this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF);
    }

    public void setTypeface(Typeface typeface2) {
        if (typeface2 != this.typeface) {
            this.typeface = typeface2;
            this.collapsingTextHelper.setTypefaces(typeface2);
            this.indicatorViewController.setTypefaces(typeface2);
            if (this.counterView != null) {
                this.counterView.setTypeface(typeface2);
            }
        }
    }

    public Typeface getTypeface() {
        return this.typeface;
    }

    public void setLengthCounter(LengthCounter lengthCounter2) {
        this.lengthCounter = lengthCounter2;
    }

    public LengthCounter getLengthCounter() {
        return this.lengthCounter;
    }

    public void dispatchProvideAutofillStructure(ViewStructure structure, int flags) {
        if (this.editText == null) {
            super.dispatchProvideAutofillStructure(structure, flags);
        } else if (this.originalHint != null) {
            boolean wasProvidingHint = this.isProvidingHint;
            this.isProvidingHint = false;
            CharSequence hint2 = this.editText.getHint();
            this.editText.setHint(this.originalHint);
            try {
                super.dispatchProvideAutofillStructure(structure, flags);
            } finally {
                this.editText.setHint(hint2);
                this.isProvidingHint = wasProvidingHint;
            }
        } else {
            structure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(structure, flags);
            onProvideAutofillVirtualStructure(structure, flags);
            structure.setChildCount(this.inputFrame.getChildCount());
            for (int i = 0; i < this.inputFrame.getChildCount(); i++) {
                View child = this.inputFrame.getChildAt(i);
                ViewStructure childStructure = structure.newChild(i);
                child.dispatchProvideAutofillStructure(childStructure, flags);
                if (child == this.editText) {
                    childStructure.setHint(getHint());
                }
            }
        }
    }

    private void setEditText(final EditText editText2) {
        if (this.editText == null) {
            if (getEndIconMode() != 3 && !(editText2 instanceof TextInputEditText)) {
                Log.i(LOG_TAG, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.editText = editText2;
            if (this.minEms != -1) {
                setMinEms(this.minEms);
            } else {
                setMinWidth(this.minWidth);
            }
            if (this.maxEms != -1) {
                setMaxEms(this.maxEms);
            } else {
                setMaxWidth(this.maxWidth);
            }
            this.boxBackgroundApplied = false;
            onApplyBoxBackgroundMode();
            setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
            this.collapsingTextHelper.setTypefaces(this.editText.getTypeface());
            this.collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
            this.collapsingTextHelper.setExpandedLetterSpacing(this.editText.getLetterSpacing());
            int editTextGravity = this.editText.getGravity();
            this.collapsingTextHelper.setCollapsedTextGravity((editTextGravity & -113) | 48);
            this.collapsingTextHelper.setExpandedTextGravity(editTextGravity);
            this.originalEditTextMinimumHeight = ViewCompat.getMinimumHeight(editText2);
            this.editText.addTextChangedListener(new TextWatcher() {
                int previousLineCount = editText2.getLineCount();

                public void afterTextChanged(Editable s) {
                    TextInputLayout.this.updateLabelState(!TextInputLayout.this.restoringSavedState);
                    if (TextInputLayout.this.counterEnabled) {
                        TextInputLayout.this.updateCounter(s);
                    }
                    if (TextInputLayout.this.placeholderEnabled) {
                        TextInputLayout.this.updatePlaceholderText(s);
                    }
                    int currentLineCount = editText2.getLineCount();
                    if (currentLineCount != this.previousLineCount) {
                        if (currentLineCount < this.previousLineCount && ViewCompat.getMinimumHeight(editText2) != TextInputLayout.this.originalEditTextMinimumHeight) {
                            editText2.setMinimumHeight(TextInputLayout.this.originalEditTextMinimumHeight);
                        }
                        this.previousLineCount = currentLineCount;
                    }
                }

                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                public void onTextChanged(CharSequence s, int start, int before, int count) {
                }
            });
            if (this.defaultHintTextColor == null) {
                this.defaultHintTextColor = this.editText.getHintTextColors();
            }
            if (this.hintEnabled) {
                if (TextUtils.isEmpty(this.hint)) {
                    this.originalHint = this.editText.getHint();
                    setHint(this.originalHint);
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                updateCursorColor();
            }
            if (this.counterView != null) {
                updateCounter(this.editText.getText());
            }
            updateEditTextBackground();
            this.indicatorViewController.adjustIndicatorPadding();
            this.startLayout.bringToFront();
            this.endLayout.bringToFront();
            dispatchOnEditTextAttached();
            this.endLayout.updateSuffixTextViewPadding();
            if (!isEnabled()) {
                editText2.setEnabled(false);
            }
            updateLabelState(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void updateInputLayoutMargins() {
        if (this.boxBackgroundMode != 1) {
            LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) this.inputFrame.getLayoutParams();
            int newTopMargin = calculateLabelMarginTop();
            if (newTopMargin != lp.topMargin) {
                lp.topMargin = newTopMargin;
                this.inputFrame.requestLayout();
            }
        }
    }

    public int getBaseline() {
        if (this.editText != null) {
            return this.editText.getBaseline() + getPaddingTop() + calculateLabelMarginTop();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public void updateLabelState(boolean animate) {
        updateLabelState(animate, false);
    }

    private void updateLabelState(boolean animate, boolean force) {
        int disabledHintColor;
        boolean isEnabled = isEnabled();
        boolean hasFocus = true;
        boolean hasText = this.editText != null && !TextUtils.isEmpty(this.editText.getText());
        if (this.editText == null || !this.editText.hasFocus()) {
            hasFocus = false;
        }
        if (this.defaultHintTextColor != null) {
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(this.defaultHintTextColor);
        }
        if (!isEnabled) {
            if (this.defaultHintTextColor != null) {
                disabledHintColor = this.defaultHintTextColor.getColorForState(new int[]{-16842910}, this.disabledColor);
            } else {
                disabledHintColor = this.disabledColor;
            }
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(ColorStateList.valueOf(disabledHintColor));
        } else if (shouldShowError()) {
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(this.indicatorViewController.getErrorViewTextColors());
        } else if (this.counterOverflowed && this.counterView != null) {
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(this.counterView.getTextColors());
        } else if (hasFocus && this.focusedTextColor != null) {
            this.collapsingTextHelper.setCollapsedTextColor(this.focusedTextColor);
        }
        if (hasText || !this.expandedHintEnabled || (isEnabled() && hasFocus)) {
            if (force || this.hintExpanded) {
                collapseHint(animate);
            }
        } else if (force || !this.hintExpanded) {
            expandHint(animate);
        }
    }

    public EditText getEditText() {
        return this.editText;
    }

    public void setMinEms(int minEms2) {
        this.minEms = minEms2;
        if (this.editText != null && minEms2 != -1) {
            this.editText.setMinEms(minEms2);
        }
    }

    public int getMinEms() {
        return this.minEms;
    }

    public void setMaxEms(int maxEms2) {
        this.maxEms = maxEms2;
        if (this.editText != null && maxEms2 != -1) {
            this.editText.setMaxEms(maxEms2);
        }
    }

    public int getMaxEms() {
        return this.maxEms;
    }

    public void setMinWidth(int minWidth2) {
        this.minWidth = minWidth2;
        if (this.editText != null && minWidth2 != -1) {
            this.editText.setMinWidth(minWidth2);
        }
    }

    public void setMinWidthResource(int minWidthId) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(minWidthId));
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    public void setMaxWidth(int maxWidth2) {
        this.maxWidth = maxWidth2;
        if (this.editText != null && maxWidth2 != -1) {
            this.editText.setMaxWidth(maxWidth2);
        }
    }

    public void setMaxWidthResource(int maxWidthId) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(maxWidthId));
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public void setHint(CharSequence hint2) {
        if (this.hintEnabled) {
            setHintInternal(hint2);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHint(int textHintId) {
        setHint(textHintId != 0 ? getResources().getText(textHintId) : null);
    }

    private void setHintInternal(CharSequence hint2) {
        if (!TextUtils.equals(hint2, this.hint)) {
            this.hint = hint2;
            this.collapsingTextHelper.setText(hint2);
            if (!this.hintExpanded) {
                openCutout();
            }
        }
    }

    public CharSequence getHint() {
        if (this.hintEnabled) {
            return this.hint;
        }
        return null;
    }

    public void setHintEnabled(boolean enabled) {
        if (enabled != this.hintEnabled) {
            this.hintEnabled = enabled;
            if (!this.hintEnabled) {
                this.isProvidingHint = false;
                if (!TextUtils.isEmpty(this.hint) && TextUtils.isEmpty(this.editText.getHint())) {
                    this.editText.setHint(this.hint);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence editTextHint = this.editText.getHint();
                if (!TextUtils.isEmpty(editTextHint)) {
                    if (TextUtils.isEmpty(this.hint)) {
                        setHint(editTextHint);
                    }
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public boolean isHintEnabled() {
        return this.hintEnabled;
    }

    public boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    public void setHintTextAppearance(int resId) {
        this.collapsingTextHelper.setCollapsedTextAppearance(resId);
        this.focusedTextColor = this.collapsingTextHelper.getCollapsedTextColor();
        if (this.editText != null) {
            updateLabelState(false);
            updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(ColorStateList hintTextColor) {
        if (this.focusedTextColor != hintTextColor) {
            if (this.defaultHintTextColor == null) {
                this.collapsingTextHelper.setCollapsedTextColor(hintTextColor);
            }
            this.focusedTextColor = hintTextColor;
            if (this.editText != null) {
                updateLabelState(false);
            }
        }
    }

    public ColorStateList getHintTextColor() {
        return this.focusedTextColor;
    }

    public void setDefaultHintTextColor(ColorStateList textColor) {
        this.defaultHintTextColor = textColor;
        this.focusedTextColor = textColor;
        if (this.editText != null) {
            updateLabelState(false);
        }
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    public void setErrorEnabled(boolean enabled) {
        this.indicatorViewController.setErrorEnabled(enabled);
    }

    public void setErrorTextAppearance(int errorTextAppearance) {
        this.indicatorViewController.setErrorTextAppearance(errorTextAppearance);
    }

    public void setErrorTextColor(ColorStateList errorTextColor) {
        this.indicatorViewController.setErrorViewTextColor(errorTextColor);
    }

    public int getErrorCurrentTextColors() {
        return this.indicatorViewController.getErrorViewCurrentTextColor();
    }

    public void setHelperTextTextAppearance(int helperTextTextAppearance) {
        this.indicatorViewController.setHelperTextAppearance(helperTextTextAppearance);
    }

    public void setHelperTextColor(ColorStateList helperTextColor) {
        this.indicatorViewController.setHelperTextViewTextColor(helperTextColor);
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.isErrorEnabled();
    }

    public void setHelperTextEnabled(boolean enabled) {
        this.indicatorViewController.setHelperTextEnabled(enabled);
    }

    public void setHelperText(CharSequence helperText) {
        if (!TextUtils.isEmpty(helperText)) {
            if (!isHelperTextEnabled()) {
                setHelperTextEnabled(true);
            }
            this.indicatorViewController.showHelper(helperText);
        } else if (isHelperTextEnabled()) {
            setHelperTextEnabled(false);
        }
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.isHelperTextEnabled();
    }

    public int getHelperTextCurrentTextColor() {
        return this.indicatorViewController.getHelperTextViewCurrentTextColor();
    }

    public void setErrorContentDescription(CharSequence errorContentDescription) {
        this.indicatorViewController.setErrorContentDescription(errorContentDescription);
    }

    public CharSequence getErrorContentDescription() {
        return this.indicatorViewController.getErrorContentDescription();
    }

    public void setErrorAccessibilityLiveRegion(int errorAccessibilityLiveRegion) {
        this.indicatorViewController.setErrorAccessibilityLiveRegion(errorAccessibilityLiveRegion);
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.indicatorViewController.getErrorAccessibilityLiveRegion();
    }

    public void setError(CharSequence errorText) {
        if (!this.indicatorViewController.isErrorEnabled()) {
            if (!TextUtils.isEmpty(errorText)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(errorText)) {
            this.indicatorViewController.showError(errorText);
        } else {
            this.indicatorViewController.hideError();
        }
    }

    public void setErrorIconDrawable(int resId) {
        this.endLayout.setErrorIconDrawable(resId);
    }

    public void setErrorIconDrawable(Drawable errorIconDrawable) {
        this.endLayout.setErrorIconDrawable(errorIconDrawable);
    }

    public Drawable getErrorIconDrawable() {
        return this.endLayout.getErrorIconDrawable();
    }

    public void setErrorIconTintList(ColorStateList errorIconTintList) {
        this.endLayout.setErrorIconTintList(errorIconTintList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode errorIconTintMode) {
        this.endLayout.setErrorIconTintMode(errorIconTintMode);
    }

    public void setCounterEnabled(boolean enabled) {
        if (this.counterEnabled != enabled) {
            if (enabled) {
                this.counterView = new AppCompatTextView(getContext());
                this.counterView.setId(R.id.textinput_counter);
                if (this.typeface != null) {
                    this.counterView.setTypeface(this.typeface);
                }
                this.counterView.setMaxLines(1);
                this.indicatorViewController.addIndicator(this.counterView, 2);
                MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) this.counterView.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                updateCounterTextAppearanceAndColor();
                updateCounter();
            } else {
                this.indicatorViewController.removeIndicator(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = enabled;
        }
    }

    public void setCounterTextAppearance(int counterTextAppearance2) {
        if (this.counterTextAppearance != counterTextAppearance2) {
            this.counterTextAppearance = counterTextAppearance2;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(ColorStateList counterTextColor2) {
        if (this.counterTextColor != counterTextColor2) {
            this.counterTextColor = counterTextColor2;
            updateCounterTextAppearanceAndColor();
        }
    }

    public ColorStateList getCounterTextColor() {
        return this.counterTextColor;
    }

    public void setCounterOverflowTextAppearance(int counterOverflowTextAppearance2) {
        if (this.counterOverflowTextAppearance != counterOverflowTextAppearance2) {
            this.counterOverflowTextAppearance = counterOverflowTextAppearance2;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList counterOverflowTextColor2) {
        if (this.counterOverflowTextColor != counterOverflowTextColor2) {
            this.counterOverflowTextColor = counterOverflowTextColor2;
            updateCounterTextAppearanceAndColor();
        }
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.counterOverflowTextColor;
    }

    public boolean isCounterEnabled() {
        return this.counterEnabled;
    }

    public void setCounterMaxLength(int maxLength) {
        if (this.counterMaxLength != maxLength) {
            if (maxLength > 0) {
                this.counterMaxLength = maxLength;
            } else {
                this.counterMaxLength = -1;
            }
            if (this.counterEnabled) {
                updateCounter();
            }
        }
    }

    private void updateCounter() {
        if (this.counterView != null) {
            updateCounter(this.editText == null ? null : this.editText.getText());
        }
    }

    /* access modifiers changed from: package-private */
    public void updateCounter(Editable text) {
        int length = this.lengthCounter.countLength(text);
        boolean wasCounterOverflowed = this.counterOverflowed;
        if (this.counterMaxLength == -1) {
            this.counterView.setText(String.valueOf(length));
            this.counterView.setContentDescription((CharSequence) null);
            this.counterOverflowed = false;
        } else {
            this.counterOverflowed = length > this.counterMaxLength;
            updateCounterContentDescription(getContext(), this.counterView, length, this.counterMaxLength, this.counterOverflowed);
            if (wasCounterOverflowed != this.counterOverflowed) {
                updateCounterTextAppearanceAndColor();
            }
            this.counterView.setText(BidiFormatter.getInstance().unicodeWrap(getContext().getString(R.string.character_counter_pattern, new Object[]{Integer.valueOf(length), Integer.valueOf(this.counterMaxLength)})));
        }
        if (this.editText != null && wasCounterOverflowed != this.counterOverflowed) {
            updateLabelState(false);
            updateTextInputBoxState();
            updateEditTextBackground();
        }
    }

    private static void updateCounterContentDescription(Context context, TextView counterView2, int length, int counterMaxLength2, boolean counterOverflowed2) {
        int i;
        if (counterOverflowed2) {
            i = R.string.character_counter_overflowed_content_description;
        } else {
            i = R.string.character_counter_content_description;
        }
        counterView2.setContentDescription(context.getString(i, new Object[]{Integer.valueOf(length), Integer.valueOf(counterMaxLength2)}));
    }

    public void setPlaceholderText(CharSequence placeholderText2) {
        if (this.placeholderTextView == null) {
            this.placeholderTextView = new AppCompatTextView(getContext());
            this.placeholderTextView.setId(R.id.textinput_placeholder);
            ViewCompat.setImportantForAccessibility(this.placeholderTextView, 2);
            this.placeholderFadeIn = createPlaceholderFadeTransition();
            this.placeholderFadeIn.setStartDelay(67);
            this.placeholderFadeOut = createPlaceholderFadeTransition();
            setPlaceholderTextAppearance(this.placeholderTextAppearance);
            setPlaceholderTextColor(this.placeholderTextColor);
        }
        if (TextUtils.isEmpty(placeholderText2)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.placeholderEnabled) {
                setPlaceholderTextEnabled(true);
            }
            this.placeholderText = placeholderText2;
        }
        updatePlaceholderText();
    }

    public CharSequence getPlaceholderText() {
        if (this.placeholderEnabled) {
            return this.placeholderText;
        }
        return null;
    }

    private void setPlaceholderTextEnabled(boolean placeholderEnabled2) {
        if (this.placeholderEnabled != placeholderEnabled2) {
            if (placeholderEnabled2) {
                addPlaceholderTextView();
            } else {
                removePlaceholderTextView();
                this.placeholderTextView = null;
            }
            this.placeholderEnabled = placeholderEnabled2;
        }
    }

    private Fade createPlaceholderFadeTransition() {
        Fade placeholderFadeTransition = new Fade();
        placeholderFadeTransition.setDuration((long) MotionUtils.resolveThemeDuration(getContext(), R.attr.motionDurationShort2, DEFAULT_PLACEHOLDER_FADE_DURATION));
        placeholderFadeTransition.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR));
        return placeholderFadeTransition;
    }

    private void updatePlaceholderText() {
        updatePlaceholderText(this.editText == null ? null : this.editText.getText());
    }

    /* access modifiers changed from: private */
    public void updatePlaceholderText(Editable text) {
        if (this.lengthCounter.countLength(text) != 0 || this.hintExpanded) {
            hidePlaceholderText();
        } else {
            showPlaceholderText();
        }
    }

    private void showPlaceholderText() {
        if (this.placeholderTextView != null && this.placeholderEnabled && !TextUtils.isEmpty(this.placeholderText)) {
            this.placeholderTextView.setText(this.placeholderText);
            TransitionManager.beginDelayedTransition(this.inputFrame, this.placeholderFadeIn);
            this.placeholderTextView.setVisibility(0);
            this.placeholderTextView.bringToFront();
            announceForAccessibility(this.placeholderText);
        }
    }

    private void hidePlaceholderText() {
        if (this.placeholderTextView != null && this.placeholderEnabled) {
            this.placeholderTextView.setText((CharSequence) null);
            TransitionManager.beginDelayedTransition(this.inputFrame, this.placeholderFadeOut);
            this.placeholderTextView.setVisibility(4);
        }
    }

    private void addPlaceholderTextView() {
        if (this.placeholderTextView != null) {
            this.inputFrame.addView(this.placeholderTextView);
            this.placeholderTextView.setVisibility(0);
        }
    }

    private void removePlaceholderTextView() {
        if (this.placeholderTextView != null) {
            this.placeholderTextView.setVisibility(8);
        }
    }

    public void setPlaceholderTextColor(ColorStateList placeholderTextColor2) {
        if (this.placeholderTextColor != placeholderTextColor2) {
            this.placeholderTextColor = placeholderTextColor2;
            if (this.placeholderTextView != null && placeholderTextColor2 != null) {
                this.placeholderTextView.setTextColor(placeholderTextColor2);
            }
        }
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.placeholderTextColor;
    }

    public void setPlaceholderTextAppearance(int placeholderTextAppearance2) {
        this.placeholderTextAppearance = placeholderTextAppearance2;
        if (this.placeholderTextView != null) {
            TextViewCompat.setTextAppearance(this.placeholderTextView, placeholderTextAppearance2);
        }
    }

    public int getPlaceholderTextAppearance() {
        return this.placeholderTextAppearance;
    }

    public void setCursorColor(ColorStateList cursorColor2) {
        if (this.cursorColor != cursorColor2) {
            this.cursorColor = cursorColor2;
            updateCursorColor();
        }
    }

    public ColorStateList getCursorColor() {
        return this.cursorColor;
    }

    public void setCursorErrorColor(ColorStateList cursorErrorColor2) {
        if (this.cursorErrorColor != cursorErrorColor2) {
            this.cursorErrorColor = cursorErrorColor2;
            if (isOnError()) {
                updateCursorColor();
            }
        }
    }

    public ColorStateList getCursorErrorColor() {
        return this.cursorErrorColor;
    }

    public void setPrefixText(CharSequence prefixText) {
        this.startLayout.setPrefixText(prefixText);
    }

    public CharSequence getPrefixText() {
        return this.startLayout.getPrefixText();
    }

    public TextView getPrefixTextView() {
        return this.startLayout.getPrefixTextView();
    }

    public void setPrefixTextColor(ColorStateList prefixTextColor) {
        this.startLayout.setPrefixTextColor(prefixTextColor);
    }

    public ColorStateList getPrefixTextColor() {
        return this.startLayout.getPrefixTextColor();
    }

    public void setPrefixTextAppearance(int prefixTextAppearance) {
        this.startLayout.setPrefixTextAppearance(prefixTextAppearance);
    }

    public void setSuffixText(CharSequence suffixText) {
        this.endLayout.setSuffixText(suffixText);
    }

    public CharSequence getSuffixText() {
        return this.endLayout.getSuffixText();
    }

    public TextView getSuffixTextView() {
        return this.endLayout.getSuffixTextView();
    }

    public void setSuffixTextColor(ColorStateList suffixTextColor) {
        this.endLayout.setSuffixTextColor(suffixTextColor);
    }

    public ColorStateList getSuffixTextColor() {
        return this.endLayout.getSuffixTextColor();
    }

    public void setSuffixTextAppearance(int suffixTextAppearance) {
        this.endLayout.setSuffixTextAppearance(suffixTextAppearance);
    }

    public void setEnabled(boolean enabled) {
        recursiveSetEnabled(this, enabled);
        super.setEnabled(enabled);
    }

    private static void recursiveSetEnabled(ViewGroup vg, boolean enabled) {
        int count = vg.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = vg.getChildAt(i);
            child.setEnabled(enabled);
            if (child instanceof ViewGroup) {
                recursiveSetEnabled((ViewGroup) child, enabled);
            }
        }
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        if (!this.counterEnabled || !this.counterOverflowed || this.counterView == null) {
            return null;
        }
        return this.counterView.getContentDescription();
    }

    private void updateCounterTextAppearanceAndColor() {
        if (this.counterView != null) {
            setTextAppearanceCompatWithErrorFallback(this.counterView, this.counterOverflowed ? this.counterOverflowTextAppearance : this.counterTextAppearance);
            if (!this.counterOverflowed && this.counterTextColor != null) {
                this.counterView.setTextColor(this.counterTextColor);
            }
            if (this.counterOverflowed && this.counterOverflowTextColor != null) {
                this.counterView.setTextColor(this.counterOverflowTextColor);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setTextAppearanceCompatWithErrorFallback(TextView textView, int textAppearance) {
        boolean useDefaultColor = false;
        try {
            TextViewCompat.setTextAppearance(textView, textAppearance);
            if (textView.getTextColors().getDefaultColor() == -65281) {
                useDefaultColor = true;
            }
        } catch (Exception e) {
            useDefaultColor = true;
        }
        if (useDefaultColor) {
            TextViewCompat.setTextAppearance(textView, R.style.TextAppearance_AppCompat_Caption);
            textView.setTextColor(ContextCompat.getColor(getContext(), R.color.design_error));
        }
    }

    private int calculateLabelMarginTop() {
        if (!this.hintEnabled) {
            return 0;
        }
        switch (this.boxBackgroundMode) {
            case 0:
                return (int) this.collapsingTextHelper.getCollapsedTextHeight();
            case 2:
                return (int) (this.collapsingTextHelper.getCollapsedTextHeight() / 2.0f);
            default:
                return 0;
        }
    }

    private Rect calculateCollapsedTextBounds(Rect rect) {
        if (this.editText != null) {
            Rect bounds = this.tmpBoundsRect;
            boolean isRtl = ViewUtils.isLayoutRtl(this);
            bounds.bottom = rect.bottom;
            switch (this.boxBackgroundMode) {
                case 1:
                    bounds.left = getLabelLeftBoundAlignedWithPrefixAndSuffix(rect.left, isRtl);
                    bounds.top = rect.top + this.boxCollapsedPaddingTopPx;
                    bounds.right = getLabelRightBoundAlignedWithPrefixAndSuffix(rect.right, isRtl);
                    return bounds;
                case 2:
                    bounds.left = rect.left + this.editText.getPaddingLeft();
                    bounds.top = rect.top - calculateLabelMarginTop();
                    bounds.right = rect.right - this.editText.getPaddingRight();
                    return bounds;
                default:
                    bounds.left = getLabelLeftBoundAlignedWithPrefixAndSuffix(rect.left, isRtl);
                    bounds.top = getPaddingTop();
                    bounds.right = getLabelRightBoundAlignedWithPrefixAndSuffix(rect.right, isRtl);
                    return bounds;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    private int getLabelLeftBoundAlignedWithPrefixAndSuffix(int rectLeft, boolean isRtl) {
        if (!isRtl && getPrefixText() != null) {
            return this.startLayout.getPrefixTextStartOffset() + rectLeft;
        }
        if (!isRtl || getSuffixText() == null) {
            return this.editText.getCompoundPaddingLeft() + rectLeft;
        }
        return this.endLayout.getSuffixTextEndOffset() + rectLeft;
    }

    private int getLabelRightBoundAlignedWithPrefixAndSuffix(int rectRight, boolean isRtl) {
        if (!isRtl && getSuffixText() != null) {
            return rectRight - this.endLayout.getSuffixTextEndOffset();
        }
        if (!isRtl || getPrefixText() == null) {
            return rectRight - this.editText.getCompoundPaddingRight();
        }
        return rectRight - this.startLayout.getPrefixTextStartOffset();
    }

    private Rect calculateExpandedTextBounds(Rect rect) {
        if (this.editText != null) {
            Rect bounds = this.tmpBoundsRect;
            float labelHeight = this.collapsingTextHelper.getExpandedTextHeight();
            bounds.left = rect.left + this.editText.getCompoundPaddingLeft();
            bounds.top = calculateExpandedLabelTop(rect, labelHeight);
            bounds.right = rect.right - this.editText.getCompoundPaddingRight();
            bounds.bottom = calculateExpandedLabelBottom(rect, bounds, labelHeight);
            return bounds;
        }
        throw new IllegalStateException();
    }

    private int calculateExpandedLabelTop(Rect rect, float labelHeight) {
        if (isSingleLineFilledTextField()) {
            return (int) (((float) rect.centerY()) - (labelHeight / 2.0f));
        }
        return rect.top + this.editText.getCompoundPaddingTop();
    }

    private int calculateExpandedLabelBottom(Rect rect, Rect bounds, float labelHeight) {
        if (isSingleLineFilledTextField()) {
            return (int) (((float) bounds.top) + labelHeight);
        }
        return rect.bottom - this.editText.getCompoundPaddingBottom();
    }

    private boolean isSingleLineFilledTextField() {
        if (this.boxBackgroundMode != 1 || this.editText.getMinLines() > 1) {
            return false;
        }
        return true;
    }

    private int calculateBoxBackgroundColor() {
        int backgroundColor = this.boxBackgroundColor;
        if (this.boxBackgroundMode == 1) {
            return MaterialColors.layer(MaterialColors.getColor((View) this, R.attr.colorSurface, 0), this.boxBackgroundColor);
        }
        return backgroundColor;
    }

    private void applyBoxAttributes() {
        if (this.boxBackground != null) {
            if (this.boxBackground.getShapeAppearanceModel() != this.shapeAppearanceModel) {
                this.boxBackground.setShapeAppearanceModel(this.shapeAppearanceModel);
            }
            if (canDrawOutlineStroke()) {
                this.boxBackground.setStroke((float) this.boxStrokeWidthPx, this.boxStrokeColor);
            }
            this.boxBackgroundColor = calculateBoxBackgroundColor();
            this.boxBackground.setFillColor(ColorStateList.valueOf(this.boxBackgroundColor));
            applyBoxUnderlineAttributes();
            updateEditTextBoxBackgroundIfNeeded();
        }
    }

    private void applyBoxUnderlineAttributes() {
        ColorStateList colorStateList;
        if (this.boxUnderlineDefault != null && this.boxUnderlineFocused != null) {
            if (canDrawStroke()) {
                MaterialShapeDrawable materialShapeDrawable = this.boxUnderlineDefault;
                if (this.editText.isFocused()) {
                    colorStateList = ColorStateList.valueOf(this.defaultStrokeColor);
                } else {
                    colorStateList = ColorStateList.valueOf(this.boxStrokeColor);
                }
                materialShapeDrawable.setFillColor(colorStateList);
                this.boxUnderlineFocused.setFillColor(ColorStateList.valueOf(this.boxStrokeColor));
            }
            invalidate();
        }
    }

    private boolean canDrawOutlineStroke() {
        return this.boxBackgroundMode == 2 && canDrawStroke();
    }

    private boolean canDrawStroke() {
        return this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0;
    }

    /* access modifiers changed from: package-private */
    public void updateEditTextBackground() {
        Drawable editTextBackground;
        if (this.editText != null && this.boxBackgroundMode == 0 && (editTextBackground = this.editText.getBackground()) != null) {
            if (DrawableUtils.canSafelyMutateDrawable(editTextBackground)) {
                editTextBackground = editTextBackground.mutate();
            }
            if (shouldShowError()) {
                editTextBackground.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (!this.counterOverflowed || this.counterView == null) {
                DrawableCompat.clearColorFilter(editTextBackground);
                this.editText.refreshDrawableState();
            } else {
                editTextBackground.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(this.counterView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean shouldShowError() {
        return this.indicatorViewController.errorShouldBeShown();
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            public SavedState createFromParcel(Parcel in, ClassLoader loader) {
                return new SavedState(in, loader);
            }

            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in, (ClassLoader) null);
            }

            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        };
        CharSequence error;
        boolean isEndIconChecked;

        SavedState(Parcelable superState) {
            super(superState);
        }

        SavedState(Parcel source, ClassLoader loader) {
            super(source, loader);
            this.error = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(source);
            this.isEndIconChecked = source.readInt() != 1 ? false : true;
        }

        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            TextUtils.writeToParcel(this.error, dest, flags);
            dest.writeInt(this.isEndIconChecked ? 1 : 0);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.error + "}";
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState ss = new SavedState(super.onSaveInstanceState());
        if (shouldShowError()) {
            ss.error = getError();
        }
        ss.isEndIconChecked = this.endLayout.isEndIconChecked();
        return ss;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState ss = (SavedState) state;
        super.onRestoreInstanceState(ss.getSuperState());
        setError(ss.error);
        if (ss.isEndIconChecked) {
            post(new Runnable() {
                public void run() {
                    TextInputLayout.this.endLayout.checkEndIcon();
                }
            });
        }
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(container);
        this.restoringSavedState = false;
    }

    public CharSequence getError() {
        if (this.indicatorViewController.isErrorEnabled()) {
            return this.indicatorViewController.getErrorText();
        }
        return null;
    }

    public CharSequence getHelperText() {
        if (this.indicatorViewController.isHelperTextEnabled()) {
            return this.indicatorViewController.getHelperText();
        }
        return null;
    }

    public boolean isHintAnimationEnabled() {
        return this.hintAnimationEnabled;
    }

    public void setHintAnimationEnabled(boolean enabled) {
        this.hintAnimationEnabled = enabled;
    }

    public boolean isExpandedHintEnabled() {
        return this.expandedHintEnabled;
    }

    public void setExpandedHintEnabled(boolean enabled) {
        if (this.expandedHintEnabled != enabled) {
            this.expandedHintEnabled = enabled;
            updateLabelState(false);
        }
    }

    public void onRtlPropertiesChanged(int layoutDirection) {
        super.onRtlPropertiesChanged(layoutDirection);
        boolean isLayoutDirectionRtl = true;
        if (layoutDirection != 1) {
            isLayoutDirectionRtl = false;
        }
        if (isLayoutDirectionRtl != this.areCornerRadiiRtl) {
            float boxCornerRadiusTopLeft = this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
            float boxCornerRadiusTopRight = this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
            float boxCornerRadiusBottomLeft = this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF);
            float boxCornerRadiusBottomRight = this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF);
            CornerTreatment topLeftTreatment = this.shapeAppearanceModel.getTopLeftCorner();
            CornerTreatment topRightTreatment = this.shapeAppearanceModel.getTopRightCorner();
            ShapeAppearanceModel newShapeAppearanceModel = ShapeAppearanceModel.builder().setTopLeftCorner(topRightTreatment).setTopRightCorner(topLeftTreatment).setBottomLeftCorner(this.shapeAppearanceModel.getBottomRightCorner()).setBottomRightCorner(this.shapeAppearanceModel.getBottomLeftCorner()).setTopLeftCornerSize(boxCornerRadiusTopRight).setTopRightCornerSize(boxCornerRadiusTopLeft).setBottomLeftCornerSize(boxCornerRadiusBottomRight).setBottomRightCornerSize(boxCornerRadiusBottomLeft).build();
            this.areCornerRadiiRtl = isLayoutDirectionRtl;
            setShapeAppearanceModel(newShapeAppearanceModel);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (!this.globalLayoutListenerAdded) {
            this.endLayout.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.globalLayoutListenerAdded = true;
        }
        updatePlaceholderMeasurementsBasedOnEditText();
        this.endLayout.updateSuffixTextViewPadding();
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        int maxIconHeight;
        if (this.editText == null || this.editText.getMeasuredHeight() >= (maxIconHeight = Math.max(this.endLayout.getMeasuredHeight(), this.startLayout.getMeasuredHeight()))) {
            return false;
        }
        this.editText.setMinimumHeight(maxIconHeight);
        return true;
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
        if (this.placeholderTextView != null && this.editText != null) {
            this.placeholderTextView.setGravity(this.editText.getGravity());
            this.placeholderTextView.setPadding(this.editText.getCompoundPaddingLeft(), this.editText.getCompoundPaddingTop(), this.editText.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
        }
    }

    public void setStartIconDrawable(int resId) {
        setStartIconDrawable(resId != 0 ? AppCompatResources.getDrawable(getContext(), resId) : null);
    }

    public void setStartIconDrawable(Drawable startIconDrawable) {
        this.startLayout.setStartIconDrawable(startIconDrawable);
    }

    public Drawable getStartIconDrawable() {
        return this.startLayout.getStartIconDrawable();
    }

    public void setStartIconMinSize(int iconSize) {
        this.startLayout.setStartIconMinSize(iconSize);
    }

    public int getStartIconMinSize() {
        return this.startLayout.getStartIconMinSize();
    }

    public void setStartIconOnClickListener(View.OnClickListener startIconOnClickListener) {
        this.startLayout.setStartIconOnClickListener(startIconOnClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener startIconOnLongClickListener) {
        this.startLayout.setStartIconOnLongClickListener(startIconOnLongClickListener);
    }

    public void setStartIconVisible(boolean visible) {
        this.startLayout.setStartIconVisible(visible);
    }

    public boolean isStartIconVisible() {
        return this.startLayout.isStartIconVisible();
    }

    public void refreshStartIconDrawableState() {
        this.startLayout.refreshStartIconDrawableState();
    }

    public void setStartIconCheckable(boolean startIconCheckable) {
        this.startLayout.setStartIconCheckable(startIconCheckable);
    }

    public boolean isStartIconCheckable() {
        return this.startLayout.isStartIconCheckable();
    }

    public void setStartIconContentDescription(int resId) {
        setStartIconContentDescription(resId != 0 ? getResources().getText(resId) : null);
    }

    public void setStartIconContentDescription(CharSequence startIconContentDescription) {
        this.startLayout.setStartIconContentDescription(startIconContentDescription);
    }

    public CharSequence getStartIconContentDescription() {
        return this.startLayout.getStartIconContentDescription();
    }

    public void setStartIconTintList(ColorStateList startIconTintList) {
        this.startLayout.setStartIconTintList(startIconTintList);
    }

    public void setStartIconTintMode(PorterDuff.Mode startIconTintMode) {
        this.startLayout.setStartIconTintMode(startIconTintMode);
    }

    public void setEndIconMode(int endIconMode) {
        this.endLayout.setEndIconMode(endIconMode);
    }

    public int getEndIconMode() {
        return this.endLayout.getEndIconMode();
    }

    public void setEndIconOnClickListener(View.OnClickListener endIconOnClickListener) {
        this.endLayout.setEndIconOnClickListener(endIconOnClickListener);
    }

    public void setErrorIconOnClickListener(View.OnClickListener errorIconOnClickListener) {
        this.endLayout.setErrorIconOnClickListener(errorIconOnClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener endIconOnLongClickListener) {
        this.endLayout.setEndIconOnLongClickListener(endIconOnLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener errorIconOnLongClickListener) {
        this.endLayout.setErrorIconOnLongClickListener(errorIconOnLongClickListener);
    }

    public void refreshErrorIconDrawableState() {
        this.endLayout.refreshErrorIconDrawableState();
    }

    public void setEndIconVisible(boolean visible) {
        this.endLayout.setEndIconVisible(visible);
    }

    public boolean isEndIconVisible() {
        return this.endLayout.isEndIconVisible();
    }

    public void setEndIconActivated(boolean endIconActivated) {
        this.endLayout.setEndIconActivated(endIconActivated);
    }

    public void refreshEndIconDrawableState() {
        this.endLayout.refreshEndIconDrawableState();
    }

    public void setEndIconCheckable(boolean endIconCheckable) {
        this.endLayout.setEndIconCheckable(endIconCheckable);
    }

    public boolean isEndIconCheckable() {
        return this.endLayout.isEndIconCheckable();
    }

    public void setEndIconDrawable(int resId) {
        this.endLayout.setEndIconDrawable(resId);
    }

    public void setEndIconDrawable(Drawable endIconDrawable) {
        this.endLayout.setEndIconDrawable(endIconDrawable);
    }

    public Drawable getEndIconDrawable() {
        return this.endLayout.getEndIconDrawable();
    }

    public void setEndIconMinSize(int iconSize) {
        this.endLayout.setEndIconMinSize(iconSize);
    }

    public int getEndIconMinSize() {
        return this.endLayout.getEndIconMinSize();
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.startLayout.setStartIconScaleType(scaleType);
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.startLayout.getStartIconScaleType();
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.endLayout.setEndIconScaleType(scaleType);
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.endLayout.getEndIconScaleType();
    }

    public void setEndIconContentDescription(int resId) {
        this.endLayout.setEndIconContentDescription(resId);
    }

    public void setEndIconContentDescription(CharSequence endIconContentDescription) {
        this.endLayout.setEndIconContentDescription(endIconContentDescription);
    }

    public CharSequence getEndIconContentDescription() {
        return this.endLayout.getEndIconContentDescription();
    }

    public void setEndIconTintList(ColorStateList endIconTintList) {
        this.endLayout.setEndIconTintList(endIconTintList);
    }

    public void setEndIconTintMode(PorterDuff.Mode endIconTintMode) {
        this.endLayout.setEndIconTintMode(endIconTintMode);
    }

    public void addOnEndIconChangedListener(OnEndIconChangedListener listener) {
        this.endLayout.addOnEndIconChangedListener(listener);
    }

    public void removeOnEndIconChangedListener(OnEndIconChangedListener listener) {
        this.endLayout.removeOnEndIconChangedListener(listener);
    }

    public void clearOnEndIconChangedListeners() {
        this.endLayout.clearOnEndIconChangedListeners();
    }

    public void addOnEditTextAttachedListener(OnEditTextAttachedListener listener) {
        this.editTextAttachedListeners.add(listener);
        if (this.editText != null) {
            listener.onEditTextAttached(this);
        }
    }

    public void removeOnEditTextAttachedListener(OnEditTextAttachedListener listener) {
        this.editTextAttachedListeners.remove(listener);
    }

    public void clearOnEditTextAttachedListeners() {
        this.editTextAttachedListeners.clear();
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int resId) {
        this.endLayout.setPasswordVisibilityToggleDrawable(resId);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable icon) {
        this.endLayout.setPasswordVisibilityToggleDrawable(icon);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int resId) {
        this.endLayout.setPasswordVisibilityToggleContentDescription(resId);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence description) {
        this.endLayout.setPasswordVisibilityToggleContentDescription(description);
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endLayout.getPasswordVisibilityToggleDrawable();
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endLayout.getPasswordVisibilityToggleContentDescription();
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endLayout.isPasswordVisibilityToggleEnabled();
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean enabled) {
        this.endLayout.setPasswordVisibilityToggleEnabled(enabled);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList tintList) {
        this.endLayout.setPasswordVisibilityToggleTintList(tintList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.endLayout.setPasswordVisibilityToggleTintMode(mode);
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean shouldSkipAnimations) {
        this.endLayout.togglePasswordVisibilityToggle(shouldSkipAnimations);
    }

    public void setTextInputAccessibilityDelegate(AccessibilityDelegate delegate) {
        if (this.editText != null) {
            ViewCompat.setAccessibilityDelegate(this.editText, delegate);
        }
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.endLayout.getEndIconView();
    }

    private void dispatchOnEditTextAttached() {
        Iterator it = this.editTextAttachedListeners.iterator();
        while (it.hasNext()) {
            ((OnEditTextAttachedListener) it.next()).onEditTextAttached(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean updateDummyDrawables() {
        if (this.editText == null) {
            return false;
        }
        boolean updatedIcon = false;
        if (shouldUpdateStartDummyDrawable()) {
            int right = this.startLayout.getMeasuredWidth() - this.editText.getPaddingLeft();
            if (this.startDummyDrawable == null || this.startDummyDrawableWidth != right) {
                this.startDummyDrawable = new ColorDrawable();
                this.startDummyDrawableWidth = right;
                this.startDummyDrawable.setBounds(0, 0, this.startDummyDrawableWidth, 1);
            }
            Drawable[] compounds = TextViewCompat.getCompoundDrawablesRelative(this.editText);
            if (compounds[0] != this.startDummyDrawable) {
                TextViewCompat.setCompoundDrawablesRelative(this.editText, this.startDummyDrawable, compounds[1], compounds[2], compounds[3]);
                updatedIcon = true;
            }
        } else if (this.startDummyDrawable != null) {
            Drawable[] compounds2 = TextViewCompat.getCompoundDrawablesRelative(this.editText);
            TextViewCompat.setCompoundDrawablesRelative(this.editText, (Drawable) null, compounds2[1], compounds2[2], compounds2[3]);
            this.startDummyDrawable = null;
            updatedIcon = true;
        }
        if (shouldUpdateEndDummyDrawable()) {
            int right2 = this.endLayout.getSuffixTextView().getMeasuredWidth() - this.editText.getPaddingRight();
            View iconView = this.endLayout.getCurrentEndIconView();
            if (iconView != null) {
                right2 = iconView.getMeasuredWidth() + right2 + MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) iconView.getLayoutParams());
            }
            Drawable[] compounds3 = TextViewCompat.getCompoundDrawablesRelative(this.editText);
            if (this.endDummyDrawable == null || this.endDummyDrawableWidth == right2) {
                if (this.endDummyDrawable == null) {
                    this.endDummyDrawable = new ColorDrawable();
                    this.endDummyDrawableWidth = right2;
                    this.endDummyDrawable.setBounds(0, 0, this.endDummyDrawableWidth, 1);
                }
                if (compounds3[2] == this.endDummyDrawable) {
                    return updatedIcon;
                }
                this.originalEditTextEndDrawable = compounds3[2];
                TextViewCompat.setCompoundDrawablesRelative(this.editText, compounds3[0], compounds3[1], this.endDummyDrawable, compounds3[3]);
                return true;
            }
            this.endDummyDrawableWidth = right2;
            this.endDummyDrawable.setBounds(0, 0, this.endDummyDrawableWidth, 1);
            TextViewCompat.setCompoundDrawablesRelative(this.editText, compounds3[0], compounds3[1], this.endDummyDrawable, compounds3[3]);
            return true;
        } else if (this.endDummyDrawable == null) {
            return updatedIcon;
        } else {
            Drawable[] compounds4 = TextViewCompat.getCompoundDrawablesRelative(this.editText);
            if (compounds4[2] == this.endDummyDrawable) {
                TextViewCompat.setCompoundDrawablesRelative(this.editText, compounds4[0], compounds4[1], this.originalEditTextEndDrawable, compounds4[3]);
                updatedIcon = true;
            }
            this.endDummyDrawable = null;
            return updatedIcon;
        }
    }

    private boolean shouldUpdateStartDummyDrawable() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.startLayout.getMeasuredWidth() > 0;
    }

    private boolean shouldUpdateEndDummyDrawable() {
        return (this.endLayout.isErrorIconVisible() || ((this.endLayout.hasEndIcon() && isEndIconVisible()) || this.endLayout.getSuffixText() != null)) && this.endLayout.getMeasuredWidth() > 0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (this.editText != null) {
            Rect rect = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(this, this.editText, rect);
            updateBoxUnderlineBounds(rect);
            if (this.hintEnabled) {
                this.collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
                int editTextGravity = this.editText.getGravity();
                this.collapsingTextHelper.setCollapsedTextGravity((editTextGravity & -113) | 48);
                this.collapsingTextHelper.setExpandedTextGravity(editTextGravity);
                this.collapsingTextHelper.setCollapsedBounds(calculateCollapsedTextBounds(rect));
                this.collapsingTextHelper.setExpandedBounds(calculateExpandedTextBounds(rect));
                this.collapsingTextHelper.recalculate();
                if (cutoutEnabled() && !this.hintExpanded) {
                    openCutout();
                }
            }
        }
    }

    private void updateBoxUnderlineBounds(Rect bounds) {
        if (this.boxUnderlineDefault != null) {
            this.boxUnderlineDefault.setBounds(bounds.left, bounds.bottom - this.boxStrokeWidthDefaultPx, bounds.right, bounds.bottom);
        }
        if (this.boxUnderlineFocused != null) {
            this.boxUnderlineFocused.setBounds(bounds.left, bounds.bottom - this.boxStrokeWidthFocusedPx, bounds.right, bounds.bottom);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        drawHint(canvas);
        drawBoxUnderline(canvas);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.collapsingTextHelper.maybeUpdateFontWeightAdjustment(newConfig);
    }

    private void drawHint(Canvas canvas) {
        if (this.hintEnabled) {
            this.collapsingTextHelper.draw(canvas);
        }
    }

    private void drawBoxUnderline(Canvas canvas) {
        if (this.boxUnderlineFocused != null && this.boxUnderlineDefault != null) {
            this.boxUnderlineDefault.draw(canvas);
            if (this.editText.isFocused()) {
                Rect focusedUnderlineBounds = this.boxUnderlineFocused.getBounds();
                Rect defaultUnderlineBounds = this.boxUnderlineDefault.getBounds();
                float hintExpansionFraction = this.collapsingTextHelper.getExpansionFraction();
                int midpointX = defaultUnderlineBounds.centerX();
                focusedUnderlineBounds.left = AnimationUtils.lerp(midpointX, defaultUnderlineBounds.left, hintExpansionFraction);
                focusedUnderlineBounds.right = AnimationUtils.lerp(midpointX, defaultUnderlineBounds.right, hintExpansionFraction);
                this.boxUnderlineFocused.draw(canvas);
            }
        }
    }

    private void collapseHint(boolean animate) {
        if (this.animator != null && this.animator.isRunning()) {
            this.animator.cancel();
        }
        if (!animate || !this.hintAnimationEnabled) {
            this.collapsingTextHelper.setExpansionFraction(1.0f);
        } else {
            animateToExpansionFraction(1.0f);
        }
        this.hintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
        updatePlaceholderText();
        this.startLayout.onHintStateChanged(false);
        this.endLayout.onHintStateChanged(false);
    }

    private boolean cutoutEnabled() {
        return this.hintEnabled && !TextUtils.isEmpty(this.hint) && (this.boxBackground instanceof CutoutDrawable);
    }

    private void openCutout() {
        if (cutoutEnabled()) {
            RectF cutoutBounds = this.tmpRectF;
            this.collapsingTextHelper.getCollapsedTextActualBounds(cutoutBounds, this.editText.getWidth(), this.editText.getGravity());
            if (cutoutBounds.width() > 0.0f && cutoutBounds.height() > 0.0f) {
                applyCutoutPadding(cutoutBounds);
                cutoutBounds.offset((float) (-getPaddingLeft()), (((float) (-getPaddingTop())) - (cutoutBounds.height() / 2.0f)) + ((float) this.boxStrokeWidthPx));
                ((CutoutDrawable) this.boxBackground).setCutout(cutoutBounds);
            }
        }
    }

    private void recalculateCutout() {
        if (cutoutEnabled() && !this.hintExpanded) {
            closeCutout();
            openCutout();
        }
    }

    private void closeCutout() {
        if (cutoutEnabled()) {
            ((CutoutDrawable) this.boxBackground).removeCutout();
        }
    }

    private void applyCutoutPadding(RectF cutoutBounds) {
        cutoutBounds.left -= (float) this.boxLabelCutoutPaddingPx;
        cutoutBounds.right += (float) this.boxLabelCutoutPaddingPx;
    }

    /* access modifiers changed from: package-private */
    public boolean cutoutIsOpen() {
        return cutoutEnabled() && ((CutoutDrawable) this.boxBackground).hasCutout();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.inDrawableStateChanged) {
            boolean z = true;
            this.inDrawableStateChanged = true;
            super.drawableStateChanged();
            int[] state = getDrawableState();
            boolean changed = false;
            if (this.collapsingTextHelper != null) {
                changed = false | this.collapsingTextHelper.setState(state);
            }
            if (this.editText != null) {
                if (!ViewCompat.isLaidOut(this) || !isEnabled()) {
                    z = false;
                }
                updateLabelState(z);
            }
            updateEditTextBackground();
            updateTextInputBoxState();
            if (changed) {
                invalidate();
            }
            this.inDrawableStateChanged = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void updateTextInputBoxState() {
        if (this.boxBackground != null && this.boxBackgroundMode != 0) {
            boolean isHovered = false;
            boolean hasFocus = isFocused() || (this.editText != null && this.editText.hasFocus());
            if (isHovered() || (this.editText != null && this.editText.isHovered())) {
                isHovered = true;
            }
            if (!isEnabled()) {
                this.boxStrokeColor = this.disabledColor;
            } else if (shouldShowError()) {
                if (this.strokeErrorColor != null) {
                    updateStrokeErrorColor(hasFocus, isHovered);
                } else {
                    this.boxStrokeColor = getErrorCurrentTextColors();
                }
            } else if (!this.counterOverflowed || this.counterView == null) {
                if (hasFocus) {
                    this.boxStrokeColor = this.focusedStrokeColor;
                } else if (isHovered) {
                    this.boxStrokeColor = this.hoveredStrokeColor;
                } else {
                    this.boxStrokeColor = this.defaultStrokeColor;
                }
            } else if (this.strokeErrorColor != null) {
                updateStrokeErrorColor(hasFocus, isHovered);
            } else {
                this.boxStrokeColor = this.counterView.getCurrentTextColor();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                updateCursorColor();
            }
            this.endLayout.onTextInputBoxStateUpdated();
            refreshStartIconDrawableState();
            if (this.boxBackgroundMode == 2) {
                int originalBoxStrokeWidthPx = this.boxStrokeWidthPx;
                if (!hasFocus || !isEnabled()) {
                    this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
                } else {
                    this.boxStrokeWidthPx = this.boxStrokeWidthFocusedPx;
                }
                if (this.boxStrokeWidthPx != originalBoxStrokeWidthPx) {
                    recalculateCutout();
                }
            }
            if (this.boxBackgroundMode == 1) {
                if (!isEnabled()) {
                    this.boxBackgroundColor = this.disabledFilledBackgroundColor;
                } else if (isHovered && !hasFocus) {
                    this.boxBackgroundColor = this.hoveredFilledBackgroundColor;
                } else if (hasFocus) {
                    this.boxBackgroundColor = this.focusedFilledBackgroundColor;
                } else {
                    this.boxBackgroundColor = this.defaultFilledBackgroundColor;
                }
            }
            applyBoxAttributes();
        }
    }

    private boolean isOnError() {
        return shouldShowError() || (this.counterView != null && this.counterOverflowed);
    }

    private void updateStrokeErrorColor(boolean hasFocus, boolean isHovered) {
        int defaultStrokeErrorColor = this.strokeErrorColor.getDefaultColor();
        int hoveredStrokeErrorColor = this.strokeErrorColor.getColorForState(new int[]{16843623, 16842910}, defaultStrokeErrorColor);
        int focusedStrokeErrorColor = this.strokeErrorColor.getColorForState(new int[]{16843518, 16842910}, defaultStrokeErrorColor);
        if (hasFocus) {
            this.boxStrokeColor = focusedStrokeErrorColor;
        } else if (isHovered) {
            this.boxStrokeColor = hoveredStrokeErrorColor;
        } else {
            this.boxStrokeColor = defaultStrokeErrorColor;
        }
    }

    private void updateCursorColor() {
        ColorStateList color;
        if (this.cursorColor != null) {
            color = this.cursorColor;
        } else {
            color = MaterialColors.getColorStateListOrNull(getContext(), R.attr.colorControlActivated);
        }
        if (this.editText != null && this.editText.getTextCursorDrawable() != null) {
            Drawable cursorDrawable = DrawableCompat.wrap(this.editText.getTextCursorDrawable()).mutate();
            if (isOnError() && this.cursorErrorColor != null) {
                color = this.cursorErrorColor;
            }
            DrawableCompat.setTintList(cursorDrawable, color);
        }
    }

    private void expandHint(boolean animate) {
        if (this.animator != null && this.animator.isRunning()) {
            this.animator.cancel();
        }
        if (!animate || !this.hintAnimationEnabled) {
            this.collapsingTextHelper.setExpansionFraction(0.0f);
        } else {
            animateToExpansionFraction(0.0f);
        }
        if (cutoutEnabled() && ((CutoutDrawable) this.boxBackground).hasCutout()) {
            closeCutout();
        }
        this.hintExpanded = true;
        hidePlaceholderText();
        this.startLayout.onHintStateChanged(true);
        this.endLayout.onHintStateChanged(true);
    }

    /* access modifiers changed from: package-private */
    public void animateToExpansionFraction(float target) {
        if (this.collapsingTextHelper.getExpansionFraction() != target) {
            if (this.animator == null) {
                this.animator = new ValueAnimator();
                this.animator.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
                this.animator.setDuration((long) MotionUtils.resolveThemeDuration(getContext(), R.attr.motionDurationMedium4, LABEL_SCALE_ANIMATION_DURATION));
                this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator animator) {
                        TextInputLayout.this.collapsingTextHelper.setExpansionFraction(((Float) animator.getAnimatedValue()).floatValue());
                    }
                });
            }
            this.animator.setFloatValues(new float[]{this.collapsingTextHelper.getExpansionFraction(), target});
            this.animator.start();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    /* access modifiers changed from: package-private */
    public final boolean isHelperTextDisplayed() {
        return this.indicatorViewController.helperTextIsDisplayed();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.collapsingTextHelper.getCurrentCollapsedTextColor();
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.getCollapsedTextHeight();
    }

    public static class AccessibilityDelegate extends AccessibilityDelegateCompat {
        private final TextInputLayout layout;

        public AccessibilityDelegate(TextInputLayout layout2) {
            this.layout = layout2;
        }

        public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
            String hint;
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = info;
            super.onInitializeAccessibilityNodeInfo(host, info);
            EditText editText = this.layout.getEditText();
            CharSequence inputText = editText != null ? editText.getText() : null;
            CharSequence hintText = this.layout.getHint();
            CharSequence errorText = this.layout.getError();
            CharSequence placeholderText = this.layout.getPlaceholderText();
            int maxCharLimit = this.layout.getCounterMaxLength();
            CharSequence counterOverflowDesc = this.layout.getCounterOverflowDescription();
            boolean showingText = !TextUtils.isEmpty(inputText);
            boolean hasHint = !TextUtils.isEmpty(hintText);
            boolean isHintCollapsed = !this.layout.isHintExpanded();
            boolean showingError = !TextUtils.isEmpty(errorText);
            boolean contentInvalid = showingError || !TextUtils.isEmpty(counterOverflowDesc);
            String hint2 = hasHint ? hintText.toString() : "";
            this.layout.startLayout.setupAccessibilityNodeInfo(accessibilityNodeInfoCompat);
            if (showingText) {
                accessibilityNodeInfoCompat.setText(inputText);
                hint = hint2;
                EditText editText2 = editText;
            } else if (!TextUtils.isEmpty(hint2)) {
                hint = hint2;
                accessibilityNodeInfoCompat.setText(hint);
                if (!isHintCollapsed || placeholderText == null) {
                } else {
                    EditText editText3 = editText;
                    accessibilityNodeInfoCompat.setText(hint + ", " + placeholderText);
                }
            } else {
                hint = hint2;
                EditText editText4 = editText;
                if (placeholderText != null) {
                    accessibilityNodeInfoCompat.setText(placeholderText);
                }
            }
            if (!TextUtils.isEmpty(hint)) {
                CharSequence charSequence = hintText;
                if (Build.VERSION.SDK_INT >= 26) {
                    accessibilityNodeInfoCompat.setHintText(hint);
                } else {
                    accessibilityNodeInfoCompat.setText(showingText ? inputText + ", " + hint : hint);
                }
                accessibilityNodeInfoCompat.setShowingHintText(!showingText);
            }
            accessibilityNodeInfoCompat.setMaxTextLength((inputText == null || inputText.length() != maxCharLimit) ? -1 : maxCharLimit);
            if (contentInvalid) {
                accessibilityNodeInfoCompat.setError(showingError ? errorText : counterOverflowDesc);
            }
            View helperTextView = this.layout.indicatorViewController.getHelperTextView();
            if (helperTextView != null) {
                accessibilityNodeInfoCompat.setLabelFor(helperTextView);
            }
            this.layout.endLayout.getEndIconDelegate().onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfoCompat);
        }

        public void onPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
            super.onPopulateAccessibilityEvent(host, event);
            this.layout.endLayout.getEndIconDelegate().onPopulateAccessibilityEvent(host, event);
        }
    }
}
