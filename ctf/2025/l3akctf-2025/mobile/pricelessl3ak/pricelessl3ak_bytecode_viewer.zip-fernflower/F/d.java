package F;

import D.T;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.appcompat.widget.A;

public final class d {
   public final A a;

   // $FF: synthetic method
   public d(A var1) {
      this.a = var1;
   }

   public final boolean a(D.d var1, int var2, Bundle var3) {
      int var4 = VERSION.SDK_INT;
      boolean var5 = false;
      Bundle var6 = var3;
      if (var4 >= 25) {
         var6 = var3;
         if ((var2 & 1) != 0) {
            try {
               ((h)var1.b).b();
            } catch (Exception var8) {
               Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", var8);
               return var5;
            }

            Parcelable var12 = (Parcelable)((h)var1.b).d();
            if (var3 == null) {
               var3 = new Bundle();
            } else {
               var3 = new Bundle(var3);
            }

            var3.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", var12);
            var6 = var3;
         }
      }

      ClipDescription var7 = ((h)var1.b).a();
      h var11 = (h)var1.b;
      ClipData var13 = new ClipData(var7, new ClipData.Item(var11.e()));
      Object var9;
      if (var4 >= 31) {
         var9 = new D.d(var13, 2);
      } else {
         var9 = new D.f(0);
         ((D.f)var9).b = var13;
         ((D.f)var9).c = 2;
      }

      ((D.e)var9).e(var11.c());
      ((D.e)var9).b(var6);
      D.h var10 = ((D.e)var9).l();
      if (T.g(this.a, var10) == null) {
         var5 = true;
      }

      return var5;
   }
}
