package A;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class h implements Callable {
   public final int a;
   public final String b;
   public final Context c;
   public final int d;
   public final Object e;

   // $FF: synthetic method
   public h(String var1, Context var2, Object var3, int var4, int var5) {
      this.a = var5;
      this.b = var1;
      this.c = var2;
      this.e = var3;
      this.d = var4;
   }

   public final Object call() {
      switch (this.a) {
         case 0:
            g var2 = (g)this.e;
            ArrayList var1 = new ArrayList(1);
            Object var8 = (new Object[]{var2})[0];
            Objects.requireNonNull(var8);
            var1.add(var8);
            List var6 = Collections.unmodifiableList(var1);
            return k.b(this.b, this.c, var6, this.d);
         default:
            boolean var4 = false;

            j var7;
            try {
               var4 = true;
               var7 = k.b(this.b, this.c, (List)this.e, this.d);
               var4 = false;
            } finally {
               if (var4) {
                  var7 = new j(-3);
                  return var7;
               }
            }

            return var7;
      }
   }
}
