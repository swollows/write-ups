package androidx.appcompat.app;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

public abstract class z {
   public static OnBackInvokedDispatcher a(Activity var0) {
      return E.c.c(var0);
   }

   public static OnBackInvokedCallback b(Object var0, H var1) {
      Objects.requireNonNull(var1);
      y var2 = new y(0, var1);
      E.c.g(E.c.e(var0), var2);
      return var2;
   }

   public static void c(Object var0, Object var1) {
      OnBackInvokedCallback var2 = E.c.b(var1);
      E.c.f(E.c.e(var0), var2);
   }
}
