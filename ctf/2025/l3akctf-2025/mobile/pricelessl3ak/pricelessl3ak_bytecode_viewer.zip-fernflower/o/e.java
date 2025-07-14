package o;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class e implements Parcelable.ClassLoaderCreator {
   public static ParcelableSnapshotMutableState a(Parcel var0, ClassLoader var1) {
      ClassLoader var3 = var1;
      if (var1 == null) {
         var3 = e.class.getClassLoader();
      }

      Object var6 = var0.readValue(var3);
      int var2 = var0.readInt();
      c var4;
      if (var2 != 0) {
         if (var2 != 1) {
            if (var2 != 2) {
               StringBuilder var5 = new StringBuilder("Unsupported MutableState policy ");
               var5.append(var2);
               var5.append(" was restored");
               throw new IllegalStateException(var5.toString());
            }

            var4 = c.c;
         } else {
            var4 = c.d;
         }
      } else {
         var4 = c.b;
      }

      return new ParcelableSnapshotMutableState(var6, var4);
   }

   public final Object createFromParcel(Parcel var1) {
      return a(var1, (ClassLoader)null);
   }

   public final Object[] newArray(int var1) {
      return new ParcelableSnapshotMutableState[var1];
   }
}
