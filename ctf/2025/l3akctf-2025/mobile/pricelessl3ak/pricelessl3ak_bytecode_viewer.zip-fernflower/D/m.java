package D;

import java.util.concurrent.CopyOnWriteArrayList;

public final class m implements androidx.lifecycle.s {
   public final p a;
   public final androidx.lifecycle.o b;
   public final r c;

   // $FF: synthetic method
   public m(p var1, androidx.lifecycle.o var2, r var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final void a(androidx.lifecycle.u var1, androidx.lifecycle.n var2) {
      p var4 = this.a;
      var4.getClass();
      androidx.lifecycle.n.Companion.getClass();
      androidx.lifecycle.o var5 = this.b;
      int var3 = var5.ordinal();
      androidx.lifecycle.n var9;
      if (var3 != 2) {
         if (var3 != 3) {
            if (var3 != 4) {
               var9 = null;
            } else {
               var9 = androidx.lifecycle.n.ON_RESUME;
            }
         } else {
            var9 = androidx.lifecycle.n.ON_START;
         }
      } else {
         var9 = androidx.lifecycle.n.ON_CREATE;
      }

      r var6 = this.c;
      Runnable var7 = var4.a;
      CopyOnWriteArrayList var8 = var4.b;
      if (var2 == var9) {
         var8.add(var6);
         var7.run();
      } else if (var2 == androidx.lifecycle.n.ON_DESTROY) {
         var4.d(var6);
      } else if (var2 == androidx.lifecycle.l.a(var5)) {
         var8.remove(var6);
         var7.run();
      }

   }
}
