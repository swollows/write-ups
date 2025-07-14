package D;

import E.f;
import android.window.OnBackInvokedDispatcher;

public final class n implements androidx.lifecycle.s {
   public final int a;
   public final Object b;
   public final Object c;

   // $FF: synthetic method
   public n(Object var1, Object var2, int var3) {
      this.a = var3;
      this.b = var1;
      this.c = var2;
   }

   public final void a(androidx.lifecycle.u var1, androidx.lifecycle.n var2) {
      switch (this.a) {
         case 0:
            p var3 = (p)this.b;
            var3.getClass();
            if (var2 == androidx.lifecycle.n.ON_DESTROY) {
               var3.d((r)this.c);
            }

            return;
         default:
            if (var2 == androidx.lifecycle.n.ON_CREATE) {
               OnBackInvokedDispatcher var4 = f.a((b.l)this.c);
               b.t var5 = (b.t)this.b;
               var5.e = var4;
               var5.c(var5.g);
            }

      }
   }
}
