package androidx.fragment.app;

import java.util.Iterator;

public final class k {
   public final h a;

   public k(h var1) {
      this.a = var1;
   }

   public final void a() {
      u var1 = this.a.c;
      if (var1.r != null) {
         var1.y = false;
         var1.z = false;
         var1.E.getClass();
         Iterator var2 = var1.c.c().iterator();

         while(var2.hasNext()) {
            if (var2.next() != null) {
               throw new ClassCastException();
            }
         }
      }

   }
}
