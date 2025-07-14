package androidx.versionedparcelable;

import V.a;
import V.c;
import V.d;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelImpl implements Parcelable {
   public static final Parcelable.Creator CREATOR = new a(0);
   public final d a;

   public ParcelImpl(Parcel var1) {
      this.a = (new c(var1)).g();
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      (new c(var1)).i(this.a);
   }
}
