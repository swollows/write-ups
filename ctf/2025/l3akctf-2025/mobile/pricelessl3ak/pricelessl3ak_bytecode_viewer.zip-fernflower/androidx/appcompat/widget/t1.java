package androidx.appcompat.widget;

import android.os.Build.VERSION;
import java.lang.reflect.Method;

public abstract class t1 {
   public static boolean a;
   public static Method b;
   public static final boolean c;

   static {
      boolean var0;
      if (VERSION.SDK_INT >= 27) {
         var0 = true;
      } else {
         var0 = false;
      }

      c = var0;
   }
}
