package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Bitmap.Config;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

public final class x {
   public final int[] a = new int[]{2131165261, 2131165259, 2131165185};
   public final int[] b = new int[]{2131165209, 2131165244, 2131165216, 2131165211, 2131165212, 2131165215, 2131165214};
   public final int[] c = new int[]{2131165258, 2131165260, 2131165202, 2131165254, 2131165255, 2131165256, 2131165257};
   public final int[] d = new int[]{2131165234, 2131165200, 2131165233};
   public final int[] e = new int[]{2131165252, 2131165262};
   public final int[] f = new int[]{2131165188, 2131165194, 2131165189, 2131165195};

   public static boolean a(int[] var0, int var1) {
      int var3 = var0.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         if (var0[var2] == var1) {
            return true;
         }
      }

      return false;
   }

   public static ColorStateList b(Context var0, int var1) {
      int var4 = Y0.c(var0, 2130903125);
      int var2 = Y0.b(var0, 2130903123);
      int[] var6 = Y0.b;
      int[] var7 = Y0.d;
      int var3 = w.a.b(var4, var1);
      int[] var5 = Y0.c;
      var4 = w.a.b(var4, var1);
      return new ColorStateList(new int[][]{var6, var7, var5, Y0.f}, new int[]{var2, var3, var4, var1});
   }

   public static LayerDrawable c(S0 var0, Context var1, int var2) {
      var2 = var1.getResources().getDimensionPixelSize(var2);
      Drawable var4 = var0.c(var1, 2131165248);
      Drawable var3 = var0.c(var1, 2131165249);
      BitmapDrawable var7;
      BitmapDrawable var9;
      if (var4 instanceof BitmapDrawable && var4.getIntrinsicWidth() == var2 && var4.getIntrinsicHeight() == var2) {
         var9 = (BitmapDrawable)var4;
         var7 = new BitmapDrawable(var9.getBitmap());
      } else {
         Bitmap var6 = Bitmap.createBitmap(var2, var2, Config.ARGB_8888);
         Canvas var8 = new Canvas(var6);
         var4.setBounds(0, 0, var2, var2);
         var4.draw(var8);
         var9 = new BitmapDrawable(var6);
         var7 = new BitmapDrawable(var6);
      }

      var7.setTileModeX(TileMode.REPEAT);
      BitmapDrawable var11;
      if (var3 instanceof BitmapDrawable && var3.getIntrinsicWidth() == var2 && var3.getIntrinsicHeight() == var2) {
         var11 = (BitmapDrawable)var3;
      } else {
         Bitmap var12 = Bitmap.createBitmap(var2, var2, Config.ARGB_8888);
         Canvas var5 = new Canvas(var12);
         var3.setBounds(0, 0, var2, var2);
         var3.draw(var5);
         var11 = new BitmapDrawable(var12);
      }

      LayerDrawable var10 = new LayerDrawable(new Drawable[]{var9, var11, var7});
      var10.setId(0, 16908288);
      var10.setId(1, 16908303);
      var10.setId(2, 16908301);
      return var10;
   }

   public static void e(Drawable var0, int var1, PorterDuff.Mode var2) {
      Drawable var3 = var0.mutate();
      PorterDuff.Mode var10 = var2;
      if (var2 == null) {
         var10 = y.b;
      }

      var2 = y.b;
      synchronized(y.class){}

      PorterDuffColorFilter var12;
      try {
         var12 = S0.e(var1, var10);
      } catch (Throwable var9) {
         Throwable var10000 = var9;
         boolean var10001 = false;

         while(true) {
            Throwable var11 = var10000;

            try {
               throw var11;
            } catch (Throwable var8) {
               var10000 = var8;
               var10001 = false;
               continue;
            }
         }
      }

      var3.setColorFilter(var12);
   }

   public final ColorStateList d(Context var1, int var2) {
      if (var2 == 2131165205) {
         return C.b.l(var1, 2131034133);
      } else if (var2 == 2131165251) {
         return C.b.l(var1, 2131034136);
      } else if (var2 != 2131165250) {
         if (var2 == 2131165193) {
            return b(var1, Y0.c(var1, 2130903123));
         } else if (var2 == 2131165187) {
            return b(var1, 0);
         } else if (var2 == 2131165192) {
            return b(var1, Y0.c(var1, 2130903121));
         } else if (var2 != 2131165246 && var2 != 2131165247) {
            if (a(this.b, var2)) {
               return Y0.d(var1, 2130903126);
            } else if (a(this.e, var2)) {
               return C.b.l(var1, 2131034132);
            } else if (a(this.f, var2)) {
               return C.b.l(var1, 2131034131);
            } else {
               return var2 == 2131165243 ? C.b.l(var1, 2131034134) : null;
            }
         } else {
            return C.b.l(var1, 2131034135);
         }
      } else {
         int[][] var3 = new int[3][];
         int[] var4 = new int[3];
         ColorStateList var6 = Y0.d(var1, 2130903130);
         if (var6 != null && var6.isStateful()) {
            int[] var5 = Y0.b;
            var3[0] = var5;
            var4[0] = var6.getColorForState(var5, 0);
            var3[1] = Y0.e;
            var4[1] = Y0.c(var1, 2130903124);
            var3[2] = Y0.f;
            var4[2] = var6.getDefaultColor();
         } else {
            var3[0] = Y0.b;
            var4[0] = Y0.b(var1, 2130903130);
            var3[1] = Y0.e;
            var4[1] = Y0.c(var1, 2130903124);
            var3[2] = Y0.f;
            var4[2] = Y0.c(var1, 2130903130);
         }

         return new ColorStateList(var3, var4);
      }
   }
}
