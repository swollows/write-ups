package D;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

public abstract class q {
   public static void a(MenuItem var0, char var1, int var2) {
      var0.setAlphabeticShortcut(var1, var2);
   }

   public static void b(MenuItem var0, CharSequence var1) {
      var0.setContentDescription(var1);
   }

   public static void c(MenuItem var0, ColorStateList var1) {
      var0.setIconTintList(var1);
   }

   public static void d(MenuItem var0, PorterDuff.Mode var1) {
      var0.setIconTintMode(var1);
   }

   public static void e(MenuItem var0, char var1, int var2) {
      var0.setNumericShortcut(var1, var2);
   }

   public static void f(MenuItem var0, CharSequence var1) {
      var0.setTooltipText(var1);
   }
}
