package w;

import android.graphics.Color;

public abstract class a {
   public static final int a = 0;

   static {
      new ThreadLocal();
   }

   public static int a(double var0, double var2, double var4) {
      double var8 = (-0.4986 * var4 + -1.5372 * var2 + 3.2406 * var0) / 100.0;
      double var6 = (0.0415 * var4 + 1.8758 * var2 + -0.9689 * var0) / 100.0;
      var4 = (1.057 * var4 + -0.204 * var2 + 0.0557 * var0) / 100.0;
      if (var8 > 0.0031308) {
         var0 = Math.pow(var8, 0.4166666666666667) * 1.055 - 0.055;
      } else {
         var0 = var8 * 12.92;
      }

      if (var6 > 0.0031308) {
         var2 = Math.pow(var6, 0.4166666666666667) * 1.055 - 0.055;
      } else {
         var2 = var6 * 12.92;
      }

      if (var4 > 0.0031308) {
         var4 = Math.pow(var4, 0.4166666666666667) * 1.055 - 0.055;
      } else {
         var4 *= 12.92;
      }

      int var10 = (int)Math.round(var0 * 255.0);
      int var12 = 0;
      if (var10 < 0) {
         var10 = 0;
      } else {
         var10 = Math.min(var10, 255);
      }

      int var11 = (int)Math.round(var2 * 255.0);
      if (var11 < 0) {
         var11 = 0;
      } else {
         var11 = Math.min(var11, 255);
      }

      int var13 = (int)Math.round(var4 * 255.0);
      if (var13 >= 0) {
         var12 = Math.min(var13, 255);
      }

      return Color.rgb(var10, var11, var12);
   }

   public static int b(int var0, int var1) {
      int var4 = Color.alpha(var1);
      int var3 = Color.alpha(var0);
      int var2 = 255 - (255 - var3) * (255 - var4) / 255;
      return Color.argb(var2, c(Color.red(var0), var3, Color.red(var1), var4, var2), c(Color.green(var0), var3, Color.green(var1), var4, var2), c(Color.blue(var0), var3, Color.blue(var1), var4, var2));
   }

   public static int c(int var0, int var1, int var2, int var3, int var4) {
      return var4 == 0 ? 0 : ((255 - var1) * var2 * var3 + var0 * 255 * var1) / (var4 * 255);
   }
}
