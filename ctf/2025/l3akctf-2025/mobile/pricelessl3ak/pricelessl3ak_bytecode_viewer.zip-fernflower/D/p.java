package D;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class p {
   public final Runnable a;
   public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
   public final HashMap c = new HashMap();

   public p(Runnable var1) {
      this.a = var1;
   }

   public final void a() {
      Iterator var1 = this.b.iterator();

      while(true) {
         androidx.fragment.app.t var2;
         do {
            if (!var1.hasNext()) {
               return;
            }

            var2 = ((androidx.fragment.app.p)((r)var1.next())).a;
         } while(var2.q < 1);

         Iterator var3 = var2.c.c().iterator();

         while(var3.hasNext()) {
            if (var3.next() != null) {
               throw new ClassCastException();
            }
         }
      }
   }

   public final void b() {
      Iterator var1 = this.b.iterator();

      while(true) {
         androidx.fragment.app.t var2;
         do {
            if (!var1.hasNext()) {
               return;
            }

            var2 = ((androidx.fragment.app.p)((r)var1.next())).a;
         } while(var2.q < 1);

         Iterator var3 = var2.c.c().iterator();

         while(var3.hasNext()) {
            if (var3.next() != null) {
               throw new ClassCastException();
            }
         }
      }
   }

   public final void c() {
      Iterator var1 = this.b.iterator();

      while(true) {
         androidx.fragment.app.t var2;
         do {
            if (!var1.hasNext()) {
               return;
            }

            var2 = ((androidx.fragment.app.p)((r)var1.next())).a;
         } while(var2.q < 1);

         Iterator var3 = var2.c.c().iterator();

         while(var3.hasNext()) {
            if (var3.next() != null) {
               throw new ClassCastException();
            }
         }
      }
   }

   public final void d(r var1) {
      this.b.remove(var1);
      o var2 = (o)this.c.remove(var1);
      if (var2 != null) {
         var2.a.b(var2.b);
         var2.b = null;
      }

      this.a.run();
   }
}
