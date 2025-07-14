package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;

public final class a implements Parcelable.Creator {
   public final Object createFromParcel(Parcel var1) {
      return new DefaultLazyKey(var1.readInt());
   }

   public final Object[] newArray(int var1) {
      return new DefaultLazyKey[var1];
   }
}
