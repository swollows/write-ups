package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.util.Pair;
import com.google.android.material.R;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new Parcelable.Creator<SingleDateSelector>() {
        public SingleDateSelector createFromParcel(Parcel source) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            Long unused = singleDateSelector.selectedItem = (Long) source.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        public SingleDateSelector[] newArray(int size) {
            return new SingleDateSelector[size];
        }
    };
    /* access modifiers changed from: private */
    public CharSequence error;
    /* access modifiers changed from: private */
    public Long selectedItem;
    private SimpleDateFormat textInputFormat;

    public void select(long selection) {
        this.selectedItem = Long.valueOf(selection);
    }

    /* access modifiers changed from: private */
    public void clearSelection() {
        this.selectedItem = null;
    }

    public void setSelection(Long selection) {
        this.selectedItem = selection == null ? null : Long.valueOf(UtcDates.canonicalYearMonthDay(selection.longValue()));
    }

    public boolean isSelectionComplete() {
        return this.selectedItem != null;
    }

    public Collection<Pair<Long, Long>> getSelectedRanges() {
        return new ArrayList();
    }

    public Collection<Long> getSelectedDays() {
        ArrayList<Long> selections = new ArrayList<>();
        if (this.selectedItem != null) {
            selections.add(this.selectedItem);
        }
        return selections;
    }

    public Long getSelection() {
        return this.selectedItem;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.text.DateFormat] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTextInputFormat(java.text.SimpleDateFormat r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0009
            java.text.DateFormat r0 = com.google.android.material.datepicker.UtcDates.getNormalizedFormat(r2)
            r2 = r0
            java.text.SimpleDateFormat r2 = (java.text.SimpleDateFormat) r2
        L_0x0009:
            r1.textInputFormat = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.SingleDateSelector.setTextInputFormat(java.text.SimpleDateFormat):void");
    }

    public View onCreateTextInputView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints constraints, OnSelectionChangedListener<Long> listener) {
        String str;
        View root = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout dateTextInput = (TextInputLayout) root.findViewById(R.id.mtrl_picker_text_input_date);
        EditText dateEditText = dateTextInput.getEditText();
        if (ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            dateEditText.setInputType(17);
        }
        boolean hasCustomFormat = this.textInputFormat != null;
        SimpleDateFormat format = hasCustomFormat ? this.textInputFormat : UtcDates.getDefaultTextInputFormat();
        if (hasCustomFormat) {
            str = format.toPattern();
        } else {
            str = UtcDates.getDefaultTextInputHint(root.getResources(), format);
        }
        String formatHint = str;
        dateTextInput.setPlaceholderText(formatHint);
        if (this.selectedItem != null) {
            dateEditText.setText(format.format(this.selectedItem));
        }
        AnonymousClass1 r9 = r0;
        String str2 = formatHint;
        final OnSelectionChangedListener<Long> onSelectionChangedListener = listener;
        SimpleDateFormat simpleDateFormat = format;
        final TextInputLayout textInputLayout = dateTextInput;
        AnonymousClass1 r0 = new DateFormatTextWatcher(formatHint, format, dateTextInput, constraints) {
            /* access modifiers changed from: package-private */
            public void onValidDate(Long day) {
                if (day == null) {
                    SingleDateSelector.this.clearSelection();
                } else {
                    SingleDateSelector.this.select(day.longValue());
                }
                CharSequence unused = SingleDateSelector.this.error = null;
                onSelectionChangedListener.onSelectionChanged(SingleDateSelector.this.getSelection());
            }

            /* access modifiers changed from: package-private */
            public void onInvalidDate() {
                CharSequence unused = SingleDateSelector.this.error = textInputLayout.getError();
                onSelectionChangedListener.onIncompleteSelectionChanged();
            }
        };
        dateEditText.addTextChangedListener(r9);
        DateSelector.showKeyboardWithAutoHideBehavior(dateEditText);
        return root;
    }

    public int getDefaultThemeResId(Context context) {
        return MaterialAttributes.resolveOrThrow(context, R.attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName());
    }

    public String getSelectionDisplayString(Context context) {
        Resources res = context.getResources();
        if (this.selectedItem == null) {
            return res.getString(R.string.mtrl_picker_date_header_unselected);
        }
        return res.getString(R.string.mtrl_picker_date_header_selected, new Object[]{DateStrings.getYearMonthDay(this.selectedItem.longValue())});
    }

    public String getSelectionContentDescription(Context context) {
        String placeholder;
        Resources res = context.getResources();
        if (this.selectedItem == null) {
            placeholder = res.getString(R.string.mtrl_picker_announce_current_selection_none);
        } else {
            placeholder = DateStrings.getYearMonthDay(this.selectedItem.longValue());
        }
        return res.getString(R.string.mtrl_picker_announce_current_selection, new Object[]{placeholder});
    }

    public String getError() {
        if (TextUtils.isEmpty(this.error)) {
            return null;
        }
        return this.error.toString();
    }

    public int getDefaultTitleResId() {
        return R.string.mtrl_picker_date_header_title;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.selectedItem);
    }
}
