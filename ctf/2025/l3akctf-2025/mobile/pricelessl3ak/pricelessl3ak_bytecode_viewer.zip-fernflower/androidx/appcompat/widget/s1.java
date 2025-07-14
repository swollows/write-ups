package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;

public abstract class s1 {
   public static void a(View var0, Rect var1, Rect var2) {
      Insets var3 = var0.computeSystemWindowInsets((new WindowInsets.Builder()).setSystemWindowInsets(Insets.of(var1)).build(), var2).getSystemWindowInsets();
      var1.set(var3.left, var3.top, var3.right, var3.bottom);
   }
}
