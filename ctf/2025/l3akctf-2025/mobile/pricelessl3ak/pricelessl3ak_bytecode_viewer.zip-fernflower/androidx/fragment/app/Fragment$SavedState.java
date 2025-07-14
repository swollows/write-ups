package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class Fragment$SavedState implements Parcelable {
   public static final Parcelable.Creator CREATOR = new Object();
   public final Bundle a;

   public Fragment$SavedState(Parcel var1, ClassLoader var2) {
      Bundle var3 = var1.readBundle();
      this.a = var3;
      if (var2 != null && var3 != null) {
         var3.setClassLoader(var2);
      }

   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeBundle(this.a);
   }
}
