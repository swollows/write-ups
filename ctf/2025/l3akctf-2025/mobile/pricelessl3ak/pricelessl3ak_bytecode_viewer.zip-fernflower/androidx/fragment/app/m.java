package androidx.fragment.app;

import android.content.res.Configuration;
import java.util.Iterator;

public final class m implements C.a {
   public final int a;
   public final t b;

   // $FF: synthetic method
   public m(t var1, int var2) {
      this.a = var2;
      this.b = var1;
   }

   public final void a(Object var1) {
      boolean var2;
      t var4;
      Iterator var5;
      switch (this.a) {
         case 0:
            Configuration var6 = (Configuration)var1;
            var5 = this.b.c.c().iterator();

            do {
               if (!var5.hasNext()) {
                  return;
               }
            } while(var5.next() == null);

            throw new ClassCastException();
         case 1:
            Integer var8 = (Integer)var1;
            var4 = this.b;
            var4.getClass();
            if (var8 == 80) {
               var5 = var4.c.c().iterator();

               while(var5.hasNext()) {
                  if (var5.next() != null) {
                     throw new ClassCastException();
                  }
               }
            }

            return;
         case 2:
            t.g var3 = (t.g)var1;
            var4 = this.b;
            var4.getClass();
            var2 = var3.a;
            var5 = var4.c.c().iterator();

            do {
               if (!var5.hasNext()) {
                  return;
               }
            } while(var5.next() == null);

            throw new ClassCastException();
         default:
            t.h var7 = (t.h)var1;
            t var9 = this.b;
            var9.getClass();
            var2 = var7.a;
            var5 = var9.c.c().iterator();

            do {
               if (!var5.hasNext()) {
                  return;
               }
            } while(var5.next() == null);

            throw new ClassCastException();
      }
   }
}
