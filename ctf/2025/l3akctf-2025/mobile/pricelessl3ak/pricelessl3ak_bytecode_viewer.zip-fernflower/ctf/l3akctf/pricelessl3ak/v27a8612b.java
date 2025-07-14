package ctf.l3akctf.pricelessl3ak;

import V.a;
import android.os.Parcel;
import android.os.Parcelable;

public class v27a8612b implements Parcelable {
   public static final Parcelable.Creator CREATOR = new a(6);
   public final int a;
   public final int b;
   public final int c;
   public final int d;

   public v27a8612b(int var1, int var2, int var3, int var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public v27a8612b(Parcel var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
   }
}
