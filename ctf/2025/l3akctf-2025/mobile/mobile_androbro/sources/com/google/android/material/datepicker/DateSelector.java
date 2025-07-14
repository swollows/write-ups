package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.util.Pair;
import com.google.android.material.internal.ViewUtils;
import java.text.SimpleDateFormat;
import java.util.Collection;

public interface DateSelector<S> extends Parcelable {
    int getDefaultThemeResId(Context context);

    int getDefaultTitleResId();

    String getError();

    Collection<Long> getSelectedDays();

    Collection<Pair<Long, Long>> getSelectedRanges();

    S getSelection();

    String getSelectionContentDescription(Context context);

    String getSelectionDisplayString(Context context);

    boolean isSelectionComplete();

    View onCreateTextInputView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, OnSelectionChangedListener<S> onSelectionChangedListener);

    void select(long j);

    void setSelection(S s);

    void setTextInputFormat(SimpleDateFormat simpleDateFormat);

    static void showKeyboardWithAutoHideBehavior(EditText... editTexts) {
        if (editTexts.length != 0) {
            View.OnFocusChangeListener listener = new DateSelector$$ExternalSyntheticLambda0(editTexts);
            for (EditText editText : editTexts) {
                editText.setOnFocusChangeListener(listener);
            }
            View viewToFocus = editTexts[0];
            viewToFocus.postDelayed(new DateSelector$$ExternalSyntheticLambda1(viewToFocus), 100);
        }
    }

    static /* synthetic */ void lambda$showKeyboardWithAutoHideBehavior$0(EditText[] editTexts, View view, boolean hasFocus) {
        int length = editTexts.length;
        int i = 0;
        while (i < length) {
            if (!editTexts[i].hasFocus()) {
                i++;
            } else {
                return;
            }
        }
        ViewUtils.hideKeyboard(view, false);
    }
}
