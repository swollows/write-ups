package D;

import B.b;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

public class j0 extends i0 {
   public j0(p0 var1, WindowInsets var2) {
      super(var1, var2);
   }

   public p0 a() {
      return p0.c(B.b.j(super.c), (View)null);
   }

   public k e() {
      DisplayCutout var1 = B.b.i(super.c);
      k var2;
      if (var1 == null) {
         var2 = null;
      } else {
         var2 = new k(var1);
      }

      return var2;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof j0)) {
         return false;
      } else {
         j0 var3 = (j0)var1;
         WindowInsets var4 = var3.c;
         if (!Objects.equals(super.c, var4) || !Objects.equals(super.e, var3.e) || !h0.r(super.f, var3.f)) {
            var2 = false;
         }

         return var2;
      }
   }

   public int hashCode() {
      return super.c.hashCode();
   }
}
