package A;

import android.content.Context;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class k {
   public static final m.j a = new m.j(16);
   public static final ThreadPoolExecutor b;
   public static final Object c;
   public static final m.k d;

   static {
      Object var0 = new Object();
      ThreadPoolExecutor var1 = new ThreadPoolExecutor(0, 1, (long)10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory)var0);
      var1.allowCoreThreadTimeOut(true);
      b = var1;
      c = new Object();
      d = new m.k(0);
   }

   public static String a(List var0, int var1) {
      StringBuilder var3 = new StringBuilder();

      for(int var2 = 0; var2 < var0.size(); ++var2) {
         var3.append(((g)var0.get(var2)).e);
         var3.append("-");
         var3.append(var1);
         if (var2 < var0.size() - 1) {
            var3.append(";");
         }
      }

      return var3.toString();
   }

   public static j b(String param0, Context param1, List param2, int param3) {
      // $FF: Couldn't be decompiled
   }
}
