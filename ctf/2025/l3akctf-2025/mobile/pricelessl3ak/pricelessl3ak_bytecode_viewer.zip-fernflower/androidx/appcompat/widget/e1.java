package androidx.appcompat.widget;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

public abstract class e1 {
   public static OnBackInvokedDispatcher a(View var0) {
      return var0.findOnBackInvokedDispatcher();
   }

   public static OnBackInvokedCallback b(Runnable var0) {
      Objects.requireNonNull(var0);
      return new androidx.appcompat.app.y(1, var0);
   }

   public static void c(Object var0, Object var1) {
      ((OnBackInvokedDispatcher)var0).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback)var1);
   }

   public static void d(Object var0, Object var1) {
      ((OnBackInvokedDispatcher)var0).unregisterOnBackInvokedCallback((OnBackInvokedCallback)var1);
   }
}
