package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R;

class PasswordToggleEndIconDelegate extends EndIconDelegate {
    private EditText editText;
    private int iconResId = R.drawable.design_password_eye;
    private final View.OnClickListener onIconClickListener = new PasswordToggleEndIconDelegate$$ExternalSyntheticLambda0(this);

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$new$0$com-google-android-material-textfield-PasswordToggleEndIconDelegate  reason: not valid java name */
    public /* synthetic */ void m271lambda$new$0$comgoogleandroidmaterialtextfieldPasswordToggleEndIconDelegate(View view) {
        if (this.editText != null) {
            int selection = this.editText.getSelectionEnd();
            if (hasPasswordTransformation()) {
                this.editText.setTransformationMethod((TransformationMethod) null);
            } else {
                this.editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selection >= 0) {
                this.editText.setSelection(selection);
            }
            refreshIconState();
        }
    }

    PasswordToggleEndIconDelegate(EndCompoundLayout endLayout, int overrideIconResId) {
        super(endLayout);
        if (overrideIconResId != 0) {
            this.iconResId = overrideIconResId;
        }
    }

    /* access modifiers changed from: package-private */
    public void setUp() {
        if (isInputTypePassword(this.editText)) {
            this.editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* access modifiers changed from: package-private */
    public void tearDown() {
        if (this.editText != null) {
            this.editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* access modifiers changed from: package-private */
    public int getIconDrawableResId() {
        return this.iconResId;
    }

    /* access modifiers changed from: package-private */
    public int getIconContentDescriptionResId() {
        return R.string.password_toggle_content_description;
    }

    /* access modifiers changed from: package-private */
    public boolean isIconCheckable() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isIconChecked() {
        return !hasPasswordTransformation();
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    /* access modifiers changed from: package-private */
    public void onEditTextAttached(EditText editText2) {
        this.editText = editText2;
        refreshIconState();
    }

    /* access modifiers changed from: package-private */
    public void beforeEditTextChanged(CharSequence s, int start, int count, int after) {
        refreshIconState();
    }

    private boolean hasPasswordTransformation() {
        return this.editText != null && (this.editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean isInputTypePassword(EditText editText2) {
        return editText2 != null && (editText2.getInputType() == 16 || editText2.getInputType() == 128 || editText2.getInputType() == 144 || editText2.getInputType() == 224);
    }
}
