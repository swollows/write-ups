package w;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class i extends h {
   public final Method D(Class var1) {
      Class var2 = Array.newInstance(var1, 1).getClass();
      var1 = Integer.TYPE;
      Method var3 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", var2, String.class, var1, var1);
      var3.setAccessible(true);
      return var3;
   }

   public final Typeface y(Object var1) {
      try {
         Object var2 = Array.newInstance(super.f, 1);
         Array.set(var2, 0, var1);
         Typeface var5 = (Typeface)super.l.invoke((Object)null, var2, "sans-serif", -1, -1);
         return var5;
      } catch (IllegalAccessException var3) {
         var1 = var3;
      } catch (InvocationTargetException var4) {
         var1 = var4;
      }

      throw new RuntimeException((Throwable)var1);
   }
}
