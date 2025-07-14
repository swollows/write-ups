package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;

final class DefaultLazyKey implements Parcelable {
   public static final Parcelable.Creator CREATOR = new Object();
   public final int a;

   public DefaultLazyKey(int var1) {
      this.a = var1;
   }

   public int describeContents() {
      return 0;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof DefaultLazyKey)) {
         return false;
      } else {
         DefaultLazyKey var2 = (DefaultLazyKey)var1;
         return this.a == var2.a;
      }
   }

   public final int hashCode() {
      return Integer.hashCode(this.a);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("DefaultLazyKey(index=");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.a);
   }
}
