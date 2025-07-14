package androidx.appcompat.widget;

import android.view.View;

public final class i implements Runnable {
   public final g a;
   public final m b;

   public i(m var1, g var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void run() {
      m var1 = this.b;
      j.l var3 = var1.c;
      if (var3 != null) {
         j.j var2 = var3.e;
         if (var2 != null) {
            var2.i(var3);
         }
      }

      View var4 = (View)var1.h;
      if (var4 != null && var4.getWindowToken() != null) {
         label22: {
            g var5 = this.a;
            if (!var5.b()) {
               if (var5.e == null) {
                  break label22;
               }

               var5.d(0, 0, false, false);
            }

            var1.s = var5;
         }
      }

      var1.u = null;
   }
}
