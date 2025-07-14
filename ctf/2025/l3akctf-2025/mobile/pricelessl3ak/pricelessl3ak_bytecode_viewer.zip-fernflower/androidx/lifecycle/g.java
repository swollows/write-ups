package androidx.lifecycle;

import android.os.Handler;
import android.os.Looper;
import android.os.Build.VERSION;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

public final class g implements s {
   public final int a;
   public final Object b;
   public final Object c;

   public g(t var1) {
      this.a = 2;
      super();
      this.b = var1;
      d var2 = d.c;
      Class var3 = var1.getClass();
      b var4 = (b)var2.a.get(var3);
      if (var4 == null) {
         var4 = var2.a(var3, (Method[])null);
      }

      this.c = var4;
   }

   // $FF: synthetic method
   public g(Object var1, Object var2, int var3) {
      this.a = var3;
      this.b = var1;
      this.c = var2;
   }

   public final void a(u var1, n var2) {
      switch (this.a) {
         case 0:
            int var3 = f.a[var2.ordinal()];
            H.k var5 = (H.k)this.b;
            switch (var3) {
               case 3:
                  Handler var4;
                  if (VERSION.SDK_INT >= 28) {
                     var4 = H.b.a(Looper.getMainLooper());
                  } else {
                     var4 = new Handler(Looper.getMainLooper());
                  }

                  var4.postDelayed((Runnable)(new Object()), 500L);
                  var5.a.b(var5);
               case 1:
               case 2:
               case 4:
               case 5:
               case 6:
                  s var7 = (s)this.c;
                  if (var7 != null) {
                     var7.a(var1, var2);
                  }

                  return;
               case 7:
                  throw new IllegalArgumentException("ON_ANY must not been send by anybody");
               default:
                  throw new RuntimeException();
            }
         case 1:
            if (var2 == n.ON_START) {
               ((p)this.b).b(this);
               ((Q.e)this.c).d();
            }

            return;
         default:
            HashMap var8 = ((b)this.c).a;
            List var9 = (List)var8.get(var2);
            t var6 = (t)this.b;
            androidx.lifecycle.b.a(var9, var1, var2, var6);
            androidx.lifecycle.b.a((List)var8.get(n.ON_ANY), var1, var2, var6);
      }
   }
}
