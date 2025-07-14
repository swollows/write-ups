package androidx.core.widget;

import android.os.Parcel;
import android.os.Parcelable;

public final class h implements Parcelable.Creator {
   public final Object createFromParcel(Parcel var1) {
      return new NestedScrollView.SavedState(var1);
   }

   public final Object[] newArray(int var1) {
      return new NestedScrollView.SavedState[var1];
   }
}
