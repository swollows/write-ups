package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialCheckBox extends AppCompatCheckBox {
    private static final int[][] CHECKBOX_STATES = {new int[]{16842910, R.attr.state_error}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_CompoundButton_CheckBox;
    private static final int[] ERROR_STATE_SET = {R.attr.state_error};
    private static final int FRAMEWORK_BUTTON_DRAWABLE_RES_ID = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    private static final int[] INDETERMINATE_STATE_SET = {R.attr.state_indeterminate};
    public static final int STATE_CHECKED = 1;
    public static final int STATE_INDETERMINATE = 2;
    public static final int STATE_UNCHECKED = 0;
    private boolean broadcasting;
    private Drawable buttonDrawable;
    private Drawable buttonIconDrawable;
    ColorStateList buttonIconTintList;
    private PorterDuff.Mode buttonIconTintMode;
    ColorStateList buttonTintList;
    private boolean centerIfNoTextEnabled;
    private int checkedState;
    /* access modifiers changed from: private */
    public int[] currentStateChecked;
    private CharSequence customStateDescription;
    private CharSequence errorAccessibilityLabel;
    private boolean errorShown;
    private ColorStateList materialThemeColorsTintList;
    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
    private final LinkedHashSet<OnCheckedStateChangedListener> onCheckedStateChangedListeners;
    private final LinkedHashSet<OnErrorChangedListener> onErrorChangedListeners;
    private final AnimatedVectorDrawableCompat transitionToUnchecked;
    private final Animatable2Compat.AnimationCallback transitionToUncheckedCallback;
    private boolean useMaterialThemeColors;
    private boolean usingMaterialButtonDrawable;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedState {
    }

    public interface OnCheckedStateChangedListener {
        void onCheckedStateChangedListener(MaterialCheckBox materialCheckBox, int i);
    }

    public interface OnErrorChangedListener {
        void onErrorChanged(MaterialCheckBox materialCheckBox, boolean z);
    }

    public MaterialCheckBox(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialCheckBox(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.checkboxStyle);
    }

    public MaterialCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(MaterialThemeOverlay.wrap(context, attrs, defStyleAttr, DEF_STYLE_RES), attrs, defStyleAttr);
        this.onErrorChangedListeners = new LinkedHashSet<>();
        this.onCheckedStateChangedListeners = new LinkedHashSet<>();
        this.transitionToUnchecked = AnimatedVectorDrawableCompat.create(getContext(), R.drawable.mtrl_checkbox_button_checked_unchecked);
        this.transitionToUncheckedCallback = new Animatable2Compat.AnimationCallback() {
            public void onAnimationStart(Drawable drawable) {
                super.onAnimationStart(drawable);
                if (MaterialCheckBox.this.buttonTintList != null) {
                    DrawableCompat.setTint(drawable, MaterialCheckBox.this.buttonTintList.getColorForState(MaterialCheckBox.this.currentStateChecked, MaterialCheckBox.this.buttonTintList.getDefaultColor()));
                }
            }

            public void onAnimationEnd(Drawable drawable) {
                super.onAnimationEnd(drawable);
                if (MaterialCheckBox.this.buttonTintList != null) {
                    DrawableCompat.setTintList(drawable, MaterialCheckBox.this.buttonTintList);
                }
            }
        };
        Context context2 = getContext();
        this.buttonDrawable = CompoundButtonCompat.getButtonDrawable(this);
        this.buttonTintList = getSuperButtonTintList();
        setSupportButtonTintList((ColorStateList) null);
        TintTypedArray attributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attrs, R.styleable.MaterialCheckBox, defStyleAttr, DEF_STYLE_RES, new int[0]);
        this.buttonIconDrawable = attributes.getDrawable(R.styleable.MaterialCheckBox_buttonIcon);
        if (this.buttonDrawable != null && ThemeEnforcement.isMaterial3Theme(context2) && isButtonDrawableLegacy(attributes)) {
            super.setButtonDrawable((Drawable) null);
            this.buttonDrawable = AppCompatResources.getDrawable(context2, R.drawable.mtrl_checkbox_button);
            this.usingMaterialButtonDrawable = true;
            if (this.buttonIconDrawable == null) {
                this.buttonIconDrawable = AppCompatResources.getDrawable(context2, R.drawable.mtrl_checkbox_button_icon);
            }
        }
        this.buttonIconTintList = MaterialResources.getColorStateList(context2, attributes, R.styleable.MaterialCheckBox_buttonIconTint);
        this.buttonIconTintMode = ViewUtils.parseTintMode(attributes.getInt(R.styleable.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.useMaterialThemeColors = attributes.getBoolean(R.styleable.MaterialCheckBox_useMaterialThemeColors, false);
        this.centerIfNoTextEnabled = attributes.getBoolean(R.styleable.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.errorShown = attributes.getBoolean(R.styleable.MaterialCheckBox_errorShown, false);
        this.errorAccessibilityLabel = attributes.getText(R.styleable.MaterialCheckBox_errorAccessibilityLabel);
        if (attributes.hasValue(R.styleable.MaterialCheckBox_checkedState)) {
            setCheckedState(attributes.getInt(R.styleable.MaterialCheckBox_checkedState, 0));
        }
        attributes.recycle();
        refreshButtonDrawable();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$new$0$com-google-android-material-checkbox-MaterialCheckBox  reason: not valid java name */
    public /* synthetic */ void m190lambda$new$0$comgoogleandroidmaterialcheckboxMaterialCheckBox() {
        this.buttonIconDrawable.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        if (!this.centerIfNoTextEnabled || !TextUtils.isEmpty(getText()) || (drawable = CompoundButtonCompat.getButtonDrawable(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int dx = ((getWidth() - drawable.getIntrinsicWidth()) / 2) * (ViewUtils.isLayoutRtl(this) ? -1 : 1);
        int saveCount = canvas.save();
        canvas.translate((float) dx, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(saveCount);
        if (getBackground() != null) {
            Rect bounds = drawable.getBounds();
            DrawableCompat.setHotspotBounds(getBackground(), bounds.left + dx, bounds.top, bounds.right + dx, bounds.bottom);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useMaterialThemeColors && this.buttonTintList == null && this.buttonIconTintList == null) {
            setUseMaterialThemeColors(true);
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int extraSpace) {
        int[] drawableStates = super.onCreateDrawableState(extraSpace + 2);
        if (getCheckedState() == 2) {
            mergeDrawableStates(drawableStates, INDETERMINATE_STATE_SET);
        }
        if (isErrorShown()) {
            mergeDrawableStates(drawableStates, ERROR_STATE_SET);
        }
        this.currentStateChecked = DrawableUtils.getCheckedState(drawableStates);
        updateIconTintIfNeeded();
        return drawableStates;
    }

    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        updateIconTintIfNeeded();
    }

    public void setChecked(boolean checked) {
        setCheckedState(checked);
    }

    public boolean isChecked() {
        return this.checkedState == 1;
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener listener) {
        this.onCheckedChangeListener = listener;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        if (info != null && isErrorShown()) {
            info.setText(info.getText() + ", " + this.errorAccessibilityLabel);
        }
    }

    public void setCheckedState(int checkedState2) {
        AutofillManager autofillManager;
        if (this.checkedState != checkedState2) {
            this.checkedState = checkedState2;
            super.setChecked(this.checkedState == 1);
            refreshDrawableState();
            setDefaultStateDescription();
            if (!this.broadcasting) {
                this.broadcasting = true;
                if (this.onCheckedStateChangedListeners != null) {
                    Iterator it = this.onCheckedStateChangedListeners.iterator();
                    while (it.hasNext()) {
                        ((OnCheckedStateChangedListener) it.next()).onCheckedStateChangedListener(this, this.checkedState);
                    }
                }
                if (!(this.checkedState == 2 || this.onCheckedChangeListener == null)) {
                    this.onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.broadcasting = false;
            }
        }
    }

    public int getCheckedState() {
        return this.checkedState;
    }

    public void addOnCheckedStateChangedListener(OnCheckedStateChangedListener listener) {
        this.onCheckedStateChangedListeners.add(listener);
    }

    public void removeOnCheckedStateChangedListener(OnCheckedStateChangedListener listener) {
        this.onCheckedStateChangedListeners.remove(listener);
    }

    public void clearOnCheckedStateChangedListeners() {
        this.onCheckedStateChangedListeners.clear();
    }

    public void setErrorShown(boolean errorShown2) {
        if (this.errorShown != errorShown2) {
            this.errorShown = errorShown2;
            refreshDrawableState();
            Iterator it = this.onErrorChangedListeners.iterator();
            while (it.hasNext()) {
                ((OnErrorChangedListener) it.next()).onErrorChanged(this, this.errorShown);
            }
        }
    }

    public boolean isErrorShown() {
        return this.errorShown;
    }

    public void setErrorAccessibilityLabelResource(int resId) {
        setErrorAccessibilityLabel(resId != 0 ? getResources().getText(resId) : null);
    }

    public void setErrorAccessibilityLabel(CharSequence errorAccessibilityLabel2) {
        this.errorAccessibilityLabel = errorAccessibilityLabel2;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.errorAccessibilityLabel;
    }

    public void addOnErrorChangedListener(OnErrorChangedListener listener) {
        this.onErrorChangedListeners.add(listener);
    }

    public void removeOnErrorChangedListener(OnErrorChangedListener listener) {
        this.onErrorChangedListeners.remove(listener);
    }

    public void clearOnErrorChangedListeners() {
        this.onErrorChangedListeners.clear();
    }

    public void setButtonDrawable(int resId) {
        setButtonDrawable(AppCompatResources.getDrawable(getContext(), resId));
    }

    public void setButtonDrawable(Drawable drawable) {
        this.buttonDrawable = drawable;
        this.usingMaterialButtonDrawable = false;
        refreshButtonDrawable();
    }

    public Drawable getButtonDrawable() {
        return this.buttonDrawable;
    }

    public void setButtonTintList(ColorStateList tintList) {
        if (this.buttonTintList != tintList) {
            this.buttonTintList = tintList;
            refreshButtonDrawable();
        }
    }

    public ColorStateList getButtonTintList() {
        return this.buttonTintList;
    }

    public void setButtonTintMode(PorterDuff.Mode tintMode) {
        setSupportButtonTintMode(tintMode);
        refreshButtonDrawable();
    }

    public void setButtonIconDrawableResource(int resId) {
        setButtonIconDrawable(AppCompatResources.getDrawable(getContext(), resId));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.buttonIconDrawable = drawable;
        refreshButtonDrawable();
    }

    public Drawable getButtonIconDrawable() {
        return this.buttonIconDrawable;
    }

    public void setButtonIconTintList(ColorStateList tintList) {
        if (this.buttonIconTintList != tintList) {
            this.buttonIconTintList = tintList;
            refreshButtonDrawable();
        }
    }

    public ColorStateList getButtonIconTintList() {
        return this.buttonIconTintList;
    }

    public void setButtonIconTintMode(PorterDuff.Mode tintMode) {
        if (this.buttonIconTintMode != tintMode) {
            this.buttonIconTintMode = tintMode;
            refreshButtonDrawable();
        }
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.buttonIconTintMode;
    }

    public void setUseMaterialThemeColors(boolean useMaterialThemeColors2) {
        this.useMaterialThemeColors = useMaterialThemeColors2;
        if (useMaterialThemeColors2) {
            CompoundButtonCompat.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.setButtonTintList(this, (ColorStateList) null);
        }
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    public void setCenterIfNoTextEnabled(boolean centerIfNoTextEnabled2) {
        this.centerIfNoTextEnabled = centerIfNoTextEnabled2;
    }

    public boolean isCenterIfNoTextEnabled() {
        return this.centerIfNoTextEnabled;
    }

    private void refreshButtonDrawable() {
        this.buttonDrawable = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.buttonDrawable, this.buttonTintList, CompoundButtonCompat.getButtonTintMode(this));
        this.buttonIconDrawable = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.buttonIconDrawable, this.buttonIconTintList, this.buttonIconTintMode);
        setUpDefaultButtonDrawableAnimationIfNeeded();
        updateButtonTints();
        super.setButtonDrawable(DrawableUtils.compositeTwoLayeredDrawable(this.buttonDrawable, this.buttonIconDrawable));
        refreshDrawableState();
    }

    private void setUpDefaultButtonDrawableAnimationIfNeeded() {
        if (this.usingMaterialButtonDrawable) {
            if (this.transitionToUnchecked != null) {
                this.transitionToUnchecked.unregisterAnimationCallback(this.transitionToUncheckedCallback);
                this.transitionToUnchecked.registerAnimationCallback(this.transitionToUncheckedCallback);
            }
            if ((this.buttonDrawable instanceof AnimatedStateListDrawable) && this.transitionToUnchecked != null) {
                ((AnimatedStateListDrawable) this.buttonDrawable).addTransition(R.id.checked, R.id.unchecked, this.transitionToUnchecked, false);
                ((AnimatedStateListDrawable) this.buttonDrawable).addTransition(R.id.indeterminate, R.id.unchecked, this.transitionToUnchecked, false);
            }
        }
    }

    private void updateButtonTints() {
        if (!(this.buttonDrawable == null || this.buttonTintList == null)) {
            DrawableCompat.setTintList(this.buttonDrawable, this.buttonTintList);
        }
        if (this.buttonIconDrawable != null && this.buttonIconTintList != null) {
            DrawableCompat.setTintList(this.buttonIconDrawable, this.buttonIconTintList);
        }
    }

    private void updateIconTintIfNeeded() {
    }

    public void setStateDescription(CharSequence stateDescription) {
        this.customStateDescription = stateDescription;
        if (stateDescription == null) {
            setDefaultStateDescription();
        } else {
            super.setStateDescription(stateDescription);
        }
    }

    private void setDefaultStateDescription() {
        if (Build.VERSION.SDK_INT >= 30 && this.customStateDescription == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    private String getButtonStateDescription() {
        if (this.checkedState == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (this.checkedState == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getSuperButtonTintList() {
        if (this.buttonTintList != null) {
            return this.buttonTintList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    private boolean isButtonDrawableLegacy(TintTypedArray attributes) {
        int buttonResourceId = attributes.getResourceId(R.styleable.MaterialCheckBox_android_button, 0);
        int buttonCompatResourceId = attributes.getResourceId(R.styleable.MaterialCheckBox_buttonCompat, 0);
        if (buttonResourceId == FRAMEWORK_BUTTON_DRAWABLE_RES_ID && buttonCompatResourceId == 0) {
            return true;
        }
        return false;
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.materialThemeColorsTintList == null) {
            int[] checkBoxColorsList = new int[CHECKBOX_STATES.length];
            int colorControlActivated = MaterialColors.getColor(this, R.attr.colorControlActivated);
            int colorError = MaterialColors.getColor(this, R.attr.colorError);
            int colorSurface = MaterialColors.getColor(this, R.attr.colorSurface);
            int colorOnSurface = MaterialColors.getColor(this, R.attr.colorOnSurface);
            checkBoxColorsList[0] = MaterialColors.layer(colorSurface, colorError, 1.0f);
            checkBoxColorsList[1] = MaterialColors.layer(colorSurface, colorControlActivated, 1.0f);
            checkBoxColorsList[2] = MaterialColors.layer(colorSurface, colorOnSurface, 0.54f);
            checkBoxColorsList[3] = MaterialColors.layer(colorSurface, colorOnSurface, 0.38f);
            checkBoxColorsList[4] = MaterialColors.layer(colorSurface, colorOnSurface, 0.38f);
            this.materialThemeColorsTintList = new ColorStateList(CHECKBOX_STATES, checkBoxColorsList);
        }
        return this.materialThemeColorsTintList;
    }

    public Parcelable onSaveInstanceState() {
        SavedState ss = new SavedState(super.onSaveInstanceState());
        ss.checkedState = getCheckedState();
        return ss;
    }

    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState ss = (SavedState) state;
        super.onRestoreInstanceState(ss.getSuperState());
        setCheckedState(ss.checkedState);
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in);
            }

            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        };
        int checkedState;

        SavedState(Parcelable superState) {
            super(superState);
        }

        private SavedState(Parcel in) {
            super(in);
            this.checkedState = ((Integer) in.readValue(getClass().getClassLoader())).intValue();
        }

        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeValue(Integer.valueOf(this.checkedState));
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + getCheckedStateString() + "}";
        }

        private String getCheckedStateString() {
            switch (this.checkedState) {
                case 1:
                    return "checked";
                case 2:
                    return "indeterminate";
                default:
                    return "unchecked";
            }
        }
    }
}
