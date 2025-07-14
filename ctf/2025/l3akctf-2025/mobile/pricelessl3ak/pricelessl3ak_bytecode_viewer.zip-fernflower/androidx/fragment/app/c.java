package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

public final class c implements Parcelable.ClassLoaderCreator {
   public final Object createFromParcel(Parcel var1) {
      return new Fragment$SavedState(var1, (ClassLoader)null);
   }

   public final Object createFromParcel(Parcel var1, ClassLoader var2) {
      return new Fragment$SavedState(var1, var2);
   }

   public final Object[] newArray(int var1) {
      return new Fragment$SavedState[var1];
   }
}
