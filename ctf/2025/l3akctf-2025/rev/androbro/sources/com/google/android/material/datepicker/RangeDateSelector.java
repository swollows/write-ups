package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import com.google.android.material.R;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

public class RangeDateSelector implements DateSelector<Pair<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new Parcelable.Creator<RangeDateSelector>() {
        public RangeDateSelector createFromParcel(Parcel source) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            Long unused = rangeDateSelector.selectedStartItem = (Long) source.readValue(Long.class.getClassLoader());
            Long unused2 = rangeDateSelector.selectedEndItem = (Long) source.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        public RangeDateSelector[] newArray(int size) {
            return new RangeDateSelector[size];
        }
    };
    private CharSequence error;
    private final String invalidRangeEndError = " ";
    private String invalidRangeStartError;
    /* access modifiers changed from: private */
    public Long proposedTextEnd = null;
    /* access modifiers changed from: private */
    public Long proposedTextStart = null;
    /* access modifiers changed from: private */
    public Long selectedEndItem = null;
    /* access modifiers changed from: private */
    public Long selectedStartItem = null;
    private SimpleDateFormat textInputFormat;

    public void select(long selection) {
        if (this.selectedStartItem == null) {
            this.selectedStartItem = Long.valueOf(selection);
        } else if (this.selectedEndItem != null || !isValidRange(this.selectedStartItem.longValue(), selection)) {
            this.selectedEndItem = null;
            this.selectedStartItem = Long.valueOf(selection);
        } else {
            this.selectedEndItem = Long.valueOf(selection);
        }
    }

    public boolean isSelectionComplete() {
        return (this.selectedStartItem == null || this.selectedEndItem == null || !isValidRange(this.selectedStartItem.longValue(), this.selectedEndItem.longValue())) ? false : true;
    }

    public void setSelection(Pair<Long, Long> selection) {
        if (!(selection.first == null || selection.second == null)) {
            Preconditions.checkArgument(isValidRange(((Long) selection.first).longValue(), ((Long) selection.second).longValue()));
        }
        Long l = null;
        this.selectedStartItem = selection.first == null ? null : Long.valueOf(UtcDates.canonicalYearMonthDay(((Long) selection.first).longValue()));
        if (selection.second != null) {
            l = Long.valueOf(UtcDates.canonicalYearMonthDay(((Long) selection.second).longValue()));
        }
        this.selectedEndItem = l;
    }

    public Pair<Long, Long> getSelection() {
        return new Pair<>(this.selectedStartItem, this.selectedEndItem);
    }

    public Collection<Pair<Long, Long>> getSelectedRanges() {
        ArrayList<Pair<Long, Long>> ranges = new ArrayList<>();
        ranges.add(new Pair<>(this.selectedStartItem, this.selectedEndItem));
        return ranges;
    }

    public Collection<Long> getSelectedDays() {
        ArrayList<Long> selections = new ArrayList<>();
        if (this.selectedStartItem != null) {
            selections.add(this.selectedStartItem);
        }
        if (this.selectedEndItem != null) {
            selections.add(this.selectedEndItem);
        }
        return selections;
    }

    public int getDefaultThemeResId(Context context) {
        int defaultThemeAttr;
        Resources res = context.getResources();
        DisplayMetrics display = res.getDisplayMetrics();
        if (Math.min(display.widthPixels, display.heightPixels) > res.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis)) {
            defaultThemeAttr = R.attr.materialCalendarTheme;
        } else {
            defaultThemeAttr = R.attr.materialCalendarFullscreenTheme;
        }
        return MaterialAttributes.resolveOrThrow(context, defaultThemeAttr, MaterialDatePicker.class.getCanonicalName());
    }

    public String getSelectionDisplayString(Context context) {
        Resources res = context.getResources();
        if (this.selectedStartItem == null && this.selectedEndItem == null) {
            return res.getString(R.string.mtrl_picker_range_header_unselected);
        }
        if (this.selectedEndItem == null) {
            return res.getString(R.string.mtrl_picker_range_header_only_start_selected, new Object[]{DateStrings.getDateString(this.selectedStartItem.longValue())});
        }
        if (this.selectedStartItem == null) {
            return res.getString(R.string.mtrl_picker_range_header_only_end_selected, new Object[]{DateStrings.getDateString(this.selectedEndItem.longValue())});
        }
        Pair<String, String> dateRangeStrings = DateStrings.getDateRangeString(this.selectedStartItem, this.selectedEndItem);
        return res.getString(R.string.mtrl_picker_range_header_selected, new Object[]{dateRangeStrings.first, dateRangeStrings.second});
    }

    public String getSelectionContentDescription(Context context) {
        String startPlaceholder;
        String endPlaceholder;
        Resources res = context.getResources();
        Pair<String, String> dateRangeStrings = DateStrings.getDateRangeString(this.selectedStartItem, this.selectedEndItem);
        if (dateRangeStrings.first == null) {
            startPlaceholder = res.getString(R.string.mtrl_picker_announce_current_selection_none);
        } else {
            startPlaceholder = (String) dateRangeStrings.first;
        }
        if (dateRangeStrings.second == null) {
            endPlaceholder = res.getString(R.string.mtrl_picker_announce_current_selection_none);
        } else {
            endPlaceholder = (String) dateRangeStrings.second;
        }
        return res.getString(R.string.mtrl_picker_announce_current_range_selection, new Object[]{startPlaceholder, endPlaceholder});
    }

    public String getError() {
        if (TextUtils.isEmpty(this.error)) {
            return null;
        }
        return this.error.toString();
    }

    public int getDefaultTitleResId() {
        return R.string.mtrl_picker_range_header_title;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.RangeDateSelector.setTextInputFormat(java.text.SimpleDateFormat):void");
    }

    public View onCreateTextInputView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints constraints, OnSelectionChangedListener<Pair<Long, Long>> listener) {
        String str;
        View root = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout startTextInput = (TextInputLayout) root.findViewById(R.id.mtrl_picker_text_input_range_start);
        TextInputLayout endTextInput = (TextInputLayout) root.findViewById(R.id.mtrl_picker_text_input_range_end);
        EditText startEditText = startTextInput.getEditText();
        EditText endEditText = endTextInput.getEditText();
        if (ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            startEditText.setInputType(17);
            endEditText.setInputType(17);
        }
        this.invalidRangeStartError = root.getResources().getString(R.string.mtrl_picker_invalid_range);
        boolean hasCustomFormat = this.textInputFormat != null;
        SimpleDateFormat format = hasCustomFormat ? this.textInputFormat : UtcDates.getDefaultTextInputFormat();
        if (this.selectedStartItem != null) {
            startEditText.setText(format.format(this.selectedStartItem));
            this.proposedTextStart = this.selectedStartItem;
        }
        if (this.selectedEndItem != null) {
            endEditText.setText(format.format(this.selectedEndItem));
            this.proposedTextEnd = this.selectedEndItem;
        }
        if (hasCustomFormat) {
            str = format.toPattern();
        } else {
            str = UtcDates.getDefaultTextInputHint(root.getResources(), format);
        }
        String formatHint = str;
        startTextInput.setPlaceholderText(formatHint);
        endTextInput.setPlaceholderText(formatHint);
        AnonymousClass1 r10 = r0;
        String formatHint2 = formatHint;
        CalendarConstraints calendarConstraints = constraints;
        SimpleDateFormat format2 = format;
        final TextInputLayout textInputLayout = startTextInput;
        EditText endEditText2 = endEditText;
        final TextInputLayout textInputLayout2 = endTextInput;
        EditText startEditText2 = startEditText;
        final OnSelectionChangedListener<Pair<Long, Long>> onSelectionChangedListener = listener;
        AnonymousClass1 r0 = new DateFormatTextWatcher(formatHint, format, startTextInput, calendarConstraints) {
            /* access modifiers changed from: package-private */
            public void onValidDate(Long day) {
                Long unused = RangeDateSelector.this.proposedTextStart = day;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            /* access modifiers changed from: package-private */
            public void onInvalidDate() {
                Long unused = RangeDateSelector.this.proposedTextStart = null;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        };
        startEditText2.addTextChangedListener(r10);
        endEditText2.addTextChangedListener(new DateFormatTextWatcher(formatHint2, format2, endTextInput, calendarConstraints) {
            /* access modifiers changed from: package-private */
            public void onValidDate(Long day) {
                Long unused = RangeDateSelector.this.proposedTextEnd = day;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            /* access modifiers changed from: package-private */
            public void onInvalidDate() {
                Long unused = RangeDateSelector.this.proposedTextEnd = null;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        DateSelector.showKeyboardWithAutoHideBehavior(startEditText2, endEditText2);
        return root;
    }

    private boolean isValidRange(long start, long end) {
        return start <= end;
    }

    /* access modifiers changed from: private */
    public void updateIfValidTextProposal(TextInputLayout startTextInput, TextInputLayout endTextInput, OnSelectionChangedListener<Pair<Long, Long>> listener) {
        if (this.proposedTextStart == null || this.proposedTextEnd == null) {
            clearInvalidRange(startTextInput, endTextInput);
            listener.onIncompleteSelectionChanged();
        } else if (isValidRange(this.proposedTextStart.longValue(), this.proposedTextEnd.longValue())) {
            this.selectedStartItem = this.proposedTextStart;
            this.selectedEndItem = this.proposedTextEnd;
            listener.onSelectionChanged(getSelection());
        } else {
            setInvalidRange(startTextInput, endTextInput);
            listener.onIncompleteSelectionChanged();
        }
        updateError(startTextInput, endTextInput);
    }

    private void updateError(TextInputLayout start, TextInputLayout end) {
        if (!TextUtils.isEmpty(start.getError())) {
            this.error = start.getError();
        } else if (!TextUtils.isEmpty(end.getError())) {
            this.error = end.getError();
        } else {
            this.error = null;
        }
    }

    private void clearInvalidRange(TextInputLayout start, TextInputLayout end) {
        if (start.getError() != null && this.invalidRangeStartError.contentEquals(start.getError())) {
            start.setError((CharSequence) null);
        }
        if (end.getError() != null && " ".contentEquals(end.getError())) {
            end.setError((CharSequence) null);
        }
    }

    private void setInvalidRange(TextInputLayout start, TextInputLayout end) {
        start.setError(this.invalidRangeStartError);
        end.setError(" ");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.selectedStartItem);
        dest.writeValue(this.selectedEndItem);
    }
}
