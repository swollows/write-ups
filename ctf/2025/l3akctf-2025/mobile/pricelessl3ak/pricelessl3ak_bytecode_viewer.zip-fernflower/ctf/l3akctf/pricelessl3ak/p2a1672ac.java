package ctf.l3akctf.pricelessl3ak;

import V.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class p2a1672ac implements Parcelable {
   public static final Parcelable.Creator CREATOR = new a(4);
   public final int a;
   public final String b;
   public final ArrayList c;
   public final byte[] d;
   public final int e;

   public p2a1672ac(int var1, byte[] var2) {
      this.a = var1;
      this.d = var2;
      this.c = null;
      this.e = 1;
   }

   public p2a1672ac(Parcel var1) {
      this.a = var1.readInt();
      this.b = var1.readString();
      this.c = var1.createTypedArrayList(v27a8612b.CREATOR);
      this.d = var1.createByteArray();
      this.e = var1.readInt();
   }

   public p2a1672ac(String var1, ArrayList var2) {
      this.a = 4919;
      this.b = var1;
      this.c = var2;
      this.e = 0;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.a);
      var1.writeString(this.b);
      var1.writeTypedList(this.c);
      var1.writeByteArray(this.d);
      var1.writeInt(this.e);
   }
}
