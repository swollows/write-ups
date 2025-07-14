package ctf.l3akctf.pricelessl3ak;

import V.a;
import android.os.Parcel;
import android.os.Parcelable;

public class a0da01 implements Parcelable {
   public static final Parcelable.Creator CREATOR = new a(1);
   public int[] a;
   public boolean b;
   public boolean c;

   public a0da01(Parcel var1) {
      this.a = var1.createIntArray();
      byte var2 = var1.readByte();
      boolean var4 = false;
      boolean var3;
      if (var2 != 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.b = var3;
      var3 = var4;
      if (var1.readByte() != 0) {
         var3 = true;
      }

      this.c = var3;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeIntArray(this.a);
      var1.writeByte((byte)this.b);
      var1.writeByte((byte)this.c);
   }
}
