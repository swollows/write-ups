package o;

import android.os.Looper;

public abstract class a {
   public static final long a;

   static {
      long var0;
      try {
         var0 = Looper.getMainLooper().getThread().getId();
      } catch (Exception var3) {
         var0 = -1L;
      }

      a = var0;
   }
}
