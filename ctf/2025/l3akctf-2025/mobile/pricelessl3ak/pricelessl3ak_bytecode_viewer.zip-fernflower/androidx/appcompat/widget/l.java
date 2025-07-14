package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

public final class l implements Parcelable.Creator {
   public final int a;

   // $FF: synthetic method
   public l(int var1) {
      this.a = var1;
   }

   public final Object createFromParcel(Parcel var1) {
      switch (this.a) {
         case 0:
            return new ActionMenuPresenter$SavedState(var1);
         default:
            return new AppCompatSpinner$SavedState(var1);
      }
   }

   public final Object[] newArray(int var1) {
      switch (this.a) {
         case 0:
            return new ActionMenuPresenter$SavedState[var1];
         default:
            return new AppCompatSpinner$SavedState[var1];
      }
   }
}
