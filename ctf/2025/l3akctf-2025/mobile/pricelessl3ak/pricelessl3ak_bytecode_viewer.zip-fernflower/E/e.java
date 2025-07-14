package E;

import android.view.accessibility.AccessibilityNodeInfo;

public abstract class e {
   public static CharSequence a(AccessibilityNodeInfo var0) {
      return var0.getStateDescription();
   }

   public static void b(AccessibilityNodeInfo var0, CharSequence var1) {
      var0.setStateDescription(var1);
   }
}
