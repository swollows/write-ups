package ctf.l3akctf.pricelessl3ak;

import V.a;
import android.os.Parcel;
import android.os.Parcelable;

public class v1289a0d implements Parcelable {
   public static final Parcelable.Creator CREATOR = new a(5);
   public final boolean a;

   public v1289a0d(Parcel var1) {
      boolean var2;
      if (var1.readByte() != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.a = var2;
   }

   public v1289a0d(boolean var1) {
      this.a = var1;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeByte((byte)this.a);
   }
}
