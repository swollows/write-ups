package E;

import android.app.Activity;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResult;

public abstract class f {
   public static OnBackInvokedDispatcher a(Activity var0) {
      OnBackInvokedDispatcher var1 = var0.getOnBackInvokedDispatcher();
      i0.d.d(var1, "activity.getOnBackInvokedDispatcher()");
      return var1;
   }

   public static Object b(String var0, Bundle var1) {
      return var1.getParcelable(var0, ActivityResult.class);
   }

   public static String c(AccessibilityNodeInfo var0) {
      return var0.getUniqueId();
   }

   public static boolean d(AccessibilityNodeInfo var0) {
      return var0.isTextSelectable();
   }

   public static void e(Object var0, Object var1) {
      i0.d.e(var0, "dispatcher");
      i0.d.e(var1, "callback");
      ((OnBackInvokedDispatcher)var0).registerOnBackInvokedCallback(0, (OnBackInvokedCallback)var1);
   }

   public static void f(Object var0, Object var1) {
      i0.d.e(var0, "dispatcher");
      i0.d.e(var1, "callback");
      ((OnBackInvokedDispatcher)var0).unregisterOnBackInvokedCallback((OnBackInvokedCallback)var1);
   }
}
