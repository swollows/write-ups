package android.support.v4.os;

import V.a;
import a.b;
import a.c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public class ResultReceiver implements Parcelable {
   public static final Parcelable.Creator CREATOR = new a(7);
   public b a;

   public ResultReceiver(Parcel var1) {
      IBinder var3 = var1.readStrongBinder();
      int var2 = c.c;
      Object var4;
      if (var3 == null) {
         var4 = null;
      } else {
         IInterface var5 = var3.queryLocalInterface(b.a);
         if (var5 != null && var5 instanceof b) {
            var4 = (b)var5;
         } else {
            var4 = new Object();
            ((a.a)var4).b = var3;
         }
      }

      this.a = (b)var4;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      synchronized(this){}

      Throwable var10000;
      boolean var10001;
      label134: {
         try {
            if (this.a == null) {
               c var3 = new c(this);
               this.a = var3;
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label134;
         }

         label123:
         try {
            var1.writeStrongBinder(this.a.asBinder());
            return;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label123;
         }
      }

      while(true) {
         Throwable var16 = var10000;

         try {
            throw var16;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            continue;
         }
      }
   }
}
