package androidx.appcompat.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

public abstract class s0 {
   public static final int[] a = new int[]{16842912};
   public static final int[] b = new int[0];

   static {
      new Rect();
   }

   public static void a(Drawable var0) {
      String var2 = var0.getClass().getName();
      int var1 = VERSION.SDK_INT;
      if (var1 >= 29 && var1 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(var2)) {
         int[] var3 = var0.getState();
         if (var3 != null && var3.length != 0) {
            var0.setState(b);
         } else {
            var0.setState(a);
         }

         var0.setState(var3);
      }

   }

   public static PorterDuff.Mode b(int var0, PorterDuff.Mode var1) {
      if (var0 != 3) {
         if (var0 != 5) {
            if (var0 != 9) {
               switch (var0) {
                  case 14:
                     return Mode.MULTIPLY;
                  case 15:
                     return Mode.SCREEN;
                  case 16:
                     return Mode.ADD;
                  default:
                     return var1;
               }
            } else {
               return Mode.SRC_ATOP;
            }
         } else {
            return Mode.SRC_IN;
         }
      } else {
         return Mode.SRC_OVER;
      }
   }
}
