package ctf.l3akctf.pricelessl3ak;

import V.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class da012da implements Parcelable {
   public static final Parcelable.Creator CREATOR = new a(3);
   public int[] a;
   public HashMap b;
   public String c;
   public ArrayList d;
   public int e;

   public da012da(Parcel var1) {
      this.a = var1.createIntArray();
      this.b = new HashMap();
      int var4 = var1.readInt();
      byte var3 = 0;

      int var2;
      for(var2 = 0; var2 < var4; ++var2) {
         int var5 = var1.readInt();
         int var6 = var1.readInt();
         this.b.put(var5, var6);
      }

      this.c = var1.readString();
      this.d = new ArrayList();
      var4 = var1.readInt();

      for(var2 = var3; var2 < var4; ++var2) {
         this.d.add(var1.readInt());
      }

      this.e = var1.readInt();
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeIntArray(this.a);
      HashMap var3 = this.b;
      var1.writeInt(var3.size());
      Iterator var5 = var3.entrySet().iterator();

      while(var5.hasNext()) {
         Map.Entry var4 = (Map.Entry)var5.next();
         var1.writeInt((Integer)var4.getKey());
         var1.writeInt((Integer)var4.getValue());
      }

      var1.writeString(this.c);
      ArrayList var6 = this.d;
      var1.writeInt(var6.size());
      var5 = var6.iterator();

      while(var5.hasNext()) {
         var1.writeInt((Integer)var5.next());
      }

      var1.writeInt(this.e);
   }
}
