package androidx.appcompat.app;

import D.T;
import D.Z;
import android.view.ViewGroup;

public final class s implements Runnable {
   public final int a;
   public final H b;

   // $FF: synthetic method
   public s(H var1, int var2) {
      this.a = var2;
      this.b = var1;
   }

   public final void run() {
      H var2;
      switch (this.a) {
         case 0:
            var2 = this.b;
            if ((var2.Z & 1) != 0) {
               var2.w(0);
            }

            if ((var2.Z & 4096) != 0) {
               var2.w(108);
            }

            var2.Y = false;
            var2.Z = 0;
            return;
         default:
            var2 = this.b;
            var2.w.showAtLocation(var2.v, 55, 0, 0);
            Z var3 = var2.y;
            if (var3 != null) {
               var3.b();
            }

            boolean var1;
            label32: {
               if (var2.z) {
                  ViewGroup var4 = var2.A;
                  if (var4 != null && var4.isLaidOut()) {
                     var1 = true;
                     break label32;
                  }
               }

               var1 = false;
            }

            if (var1) {
               var2.v.setAlpha(0.0F);
               var3 = T.a(var2.v);
               var3.a(1.0F);
               var2.y = var3;
               var3.d(new u(0, this));
            } else {
               var2.v.setAlpha(1.0F);
               var2.v.setVisibility(0);
            }

      }
   }
}
