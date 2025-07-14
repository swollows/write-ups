package ctf.l3akctf.pricelessl3ak;

import V.a;
import android.os.Parcel;
import android.os.Parcelable;

public class c9a7d02a implements Parcelable {
   public static final Parcelable.Creator CREATOR = new a(2);
   public boolean a;
   public boolean b;
   public int c;

   public c9a7d02a(Parcel var1) {
      byte var2 = var1.readByte();
      boolean var4 = false;
      boolean var3;
      if (var2 != 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.a = var3;
      var3 = var4;
      if (var1.readByte() != 0) {
         var3 = true;
      }

      this.b = var3;
      this.c = var1.readInt();
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeByte((byte)this.a);
      var1.writeByte((byte)this.b);
      var1.writeInt(this.c);
   }
}
