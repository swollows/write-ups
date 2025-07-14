package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

public final class i1 implements Parcelable.ClassLoaderCreator {
   public final Object createFromParcel(Parcel var1) {
      return new Toolbar.SavedState(var1, (ClassLoader)null);
   }

   public final Object createFromParcel(Parcel var1, ClassLoader var2) {
      return new Toolbar.SavedState(var1, var2);
   }

   public final Object[] newArray(int var1) {
      return new Toolbar.SavedState[var1];
   }
}
