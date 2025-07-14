package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

class DaysOfWeekAdapter extends BaseAdapter {
    private static final int CALENDAR_DAY_STYLE = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);
    private static final int NARROW_FORMAT = 4;
    private final Calendar calendar;
    private final int daysInWeek;
    private final int firstDayOfWeek;

    public DaysOfWeekAdapter() {
        this.calendar = UtcDates.getUtcCalendar();
        this.daysInWeek = this.calendar.getMaximum(7);
        this.firstDayOfWeek = this.calendar.getFirstDayOfWeek();
    }

    public DaysOfWeekAdapter(int firstDayOfWeek2) {
        this.calendar = UtcDates.getUtcCalendar();
        this.daysInWeek = this.calendar.getMaximum(7);
        this.firstDayOfWeek = firstDayOfWeek2;
    }

    public Integer getItem(int position) {
        if (position >= this.daysInWeek) {
            return null;
        }
        return Integer.valueOf(positionToDayOfWeek(position));
    }

    public long getItemId(int position) {
        return 0;
    }

    public int getCount() {
        return this.daysInWeek;
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            r7 = this;
            r0 = r9
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r9 != 0) goto L_0x0017
            android.content.Context r1 = r10.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r2 = com.google.android.material.R.layout.mtrl_calendar_day_of_week
            r3 = 0
            android.view.View r2 = r1.inflate(r2, r10, r3)
            r0 = r2
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r1 = r7.calendar
            int r2 = r7.positionToDayOfWeek(r8)
            r3 = 7
            r1.set(r3, r2)
            android.content.res.Resources r1 = r0.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            java.util.Locale r1 = r1.locale
            java.util.Calendar r2 = r7.calendar
            int r4 = CALENDAR_DAY_STYLE
            java.lang.String r2 = r2.getDisplayName(r3, r4, r1)
            r0.setText(r2)
            android.content.Context r2 = r10.getContext()
            int r4 = com.google.android.material.R.string.mtrl_picker_day_of_week_column_header
            java.lang.String r2 = r2.getString(r4)
            java.util.Calendar r4 = r7.calendar
            java.util.Locale r5 = java.util.Locale.getDefault()
            r6 = 2
            java.lang.String r3 = r4.getDisplayName(r3, r6, r5)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r0.setContentDescription(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.DaysOfWeekAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    private int positionToDayOfWeek(int position) {
        int dayConstant = this.firstDayOfWeek + position;
        if (dayConstant > this.daysInWeek) {
            return dayConstant - this.daysInWeek;
        }
        return dayConstant;
    }
}
