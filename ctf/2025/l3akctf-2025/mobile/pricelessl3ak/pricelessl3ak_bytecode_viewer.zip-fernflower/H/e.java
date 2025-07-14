package H;

import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public final class e extends C.b {
   public final f o;

   public e(f var1) {
      this.o = var1;
   }

   public final void x(Throwable var1) {
      this.o.a.d(var1);
   }

   public final void y(w var1) {
      f var2 = this.o;
      var2.c = var1;
      w var4 = var2.c;
      j var9 = var2.a;
      D.z var5 = var9.g;
      d var6 = var9.i;
      Set var10;
      if (VERSION.SDK_INT >= 34) {
         var10 = H.o.a();
      } else {
         var10 = C.b.o();
      }

      Object var3 = new Object();
      ((X.h)var3).a = var5;
      ((X.h)var3).b = var4;
      ((X.h)var3).c = var6;
      if (!var10.isEmpty()) {
         Iterator var12 = var10.iterator();

         while(var12.hasNext()) {
            int[] var13 = (int[])var12.next();
            String var14 = new String(var13, 0, var13.length);
            q var15 = new q(var14, 0);
            ((X.h)var3).n(var14, 0, var14.length(), 1, true, var15);
         }
      }

      var2.b = (X.h)var3;
      var9 = var2.a;
      var9.getClass();
      ArrayList var11 = new ArrayList();
      var9.a.writeLock().lock();

      try {
         var9.c = 1;
         var11.addAll(var9.b);
         var9.b.clear();
      } finally {
         var9.a.writeLock().unlock();
      }

      var9.d.post(new h(var11, var9.c, (Throwable)null));
   }
}
