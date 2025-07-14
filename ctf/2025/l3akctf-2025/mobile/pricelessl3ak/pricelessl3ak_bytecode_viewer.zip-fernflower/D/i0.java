package D;

import android.view.View;
import android.view.WindowInsets;
import w.c;

public class i0 extends h0 {
   public c l = null;

   public i0(p0 var1, WindowInsets var2) {
      super(var1, var2);
   }

   public p0 b() {
      return p0.c(super.c.consumeStableInsets(), (View)null);
   }

   public p0 c() {
      return p0.c(super.c.consumeSystemWindowInsets(), (View)null);
   }

   public final c f() {
      if (this.l == null) {
         WindowInsets var1 = super.c;
         this.l = w.c.a(var1.getStableInsetLeft(), var1.getStableInsetTop(), var1.getStableInsetRight(), var1.getStableInsetBottom());
      }

      return this.l;
   }

   public boolean i() {
      return super.c.isConsumed();
   }

   public void m(c var1) {
      this.l = var1;
   }
}
