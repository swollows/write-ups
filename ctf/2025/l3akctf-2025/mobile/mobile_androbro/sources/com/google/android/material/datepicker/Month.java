package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new Parcelable.Creator<Month>() {
        public Month createFromParcel(Parcel source) {
            return Month.create(source.readInt(), source.readInt());
        }

        public Month[] newArray(int size) {
            return new Month[size];
        }
    };
    final int daysInMonth = this.firstOfMonth.getActualMaximum(5);
    final int daysInWeek = this.firstOfMonth.getMaximum(7);
    private final Calendar firstOfMonth;
    private String longName;
    final int month = this.firstOfMonth.get(2);
    final long timeInMillis = this.firstOfMonth.getTimeInMillis();
    final int year = this.firstOfMonth.get(1);

    private Month(Calendar rawCalendar) {
        rawCalendar.set(5, 1);
        this.firstOfMonth = UtcDates.getDayCopy(rawCalendar);
    }

    static Month create(long timeInMillis2) {
        Calendar calendar = UtcDates.getUtcCalendar();
        calendar.setTimeInMillis(timeInMillis2);
        return new Month(calendar);
    }

    static Month create(int year2, int month2) {
        Calendar calendar = UtcDates.getUtcCalendar();
        calendar.set(1, year2);
        calendar.set(2, month2);
        return new Month(calendar);
    }

    static Month current() {
        return new Month(UtcDates.getTodayCalendar());
    }

    /* access modifiers changed from: package-private */
    public int daysFromStartOfWeekToFirstOfMonth(int firstDayOfWeek) {
        int difference = this.firstOfMonth.get(7) - (firstDayOfWeek > 0 ? firstDayOfWeek : this.firstOfMonth.getFirstDayOfWeek());
        if (difference < 0) {
            return difference + this.daysInWeek;
        }
        return difference;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Month)) {
            return false;
        }
        Month that = (Month) o;
        if (this.month == that.month && this.year == that.year) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.month), Integer.valueOf(this.year)});
    }

    public int compareTo(Month other) {
        return this.firstOfMonth.compareTo(other.firstOfMonth);
    }

    /* access modifiers changed from: package-private */
    public int monthsUntil(Month other) {
        if (this.firstOfMonth instanceof GregorianCalendar) {
            return ((other.year - this.year) * 12) + (other.month - this.month);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    /* access modifiers changed from: package-private */
    public long getStableId() {
        return this.firstOfMonth.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    public long getDay(int day) {
        Calendar dayCalendar = UtcDates.getDayCopy(this.firstOfMonth);
        dayCalendar.set(5, day);
        return dayCalendar.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    public int getDayOfMonth(long date) {
        Calendar dayCalendar = UtcDates.getDayCopy(this.firstOfMonth);
        dayCalendar.setTimeInMillis(date);
        return dayCalendar.get(5);
    }

    /* access modifiers changed from: package-private */
    public Month monthsLater(int months) {
        Calendar laterMonth = UtcDates.getDayCopy(this.firstOfMonth);
        laterMonth.add(2, months);
        return new Month(laterMonth);
    }

    /* access modifiers changed from: package-private */
    public String getLongName() {
        if (this.longName == null) {
            this.longName = DateStrings.getYearMonth(this.firstOfMonth.getTimeInMillis());
        }
        return this.longName;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.year);
        dest.writeInt(this.month);
    }
}
