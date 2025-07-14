package D;

import android.view.View;
import android.view.WindowInsets;
import w.c;

public class d0 extends g0 {
   public final WindowInsets.Builder a;

   public d0() {
      this.a = c0.b();
   }

   public d0(p0 var1) {
      super(var1);
      WindowInsets var2 = var1.b();
      WindowInsets.Builder var3;
      if (var2 != null) {
         var3 = c0.c(var2);
      } else {
         var3 = c0.b();
      }

      this.a = var3;
   }

   public p0 b() {
      this.a();
      p0 var1 = p0.c(c0.d(this.a), (View)null);
      var1.a.k((c[])null);
      return var1;
   }

   public void c(c var1) {
      c0.k(this.a, var1.b());
   }

   public void d(c var1) {
      c0.h(this.a, var1.b());
   }
}
