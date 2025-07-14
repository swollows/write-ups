package a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;

public final class c extends Binder implements b {
   public static final int c = 0;
   public final ResultReceiver b;

   public c(ResultReceiver var1) {
      this.b = var1;
      this.attachInterface(this, a.b.a);
   }

   public final IBinder asBinder() {
      return this;
   }

   public final boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      String var5 = a.b.a;
      if (var1 >= 1 && var1 <= 16777215) {
         var2.enforceInterface(var5);
      }

      if (var1 == 1598968902) {
         var3.writeString(var5);
         return true;
      } else if (var1 != 1) {
         return super.onTransact(var1, var2, var3, var4);
      } else {
         var2.readInt();
         Parcelable.Creator var7 = Bundle.CREATOR;
         Object var6;
         if (var2.readInt() != 0) {
            var6 = var7.createFromParcel(var2);
         } else {
            var6 = null;
         }

         Bundle var8 = (Bundle)var6;
         this.b.getClass();
         return true;
      }
   }
}
