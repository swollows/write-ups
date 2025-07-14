package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

public abstract class Y0 {
   public static final ThreadLocal a = new ThreadLocal();
   public static final int[] b = new int[]{-16842910};
   public static final int[] c = new int[]{16842908};
   public static final int[] d = new int[]{16842919};
   public static final int[] e = new int[]{16842912};
   public static final int[] f = new int[0];
   public static final int[] g = new int[1];

   public static void a(View var0, Context var1) {
      TypedArray var5 = var1.obtainStyledAttributes(g.a.j);

      try {
         if (!var5.hasValue(117)) {
            StringBuilder var2 = new StringBuilder("View ");
            var2.append(var0.getClass());
            var2.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            Log.e("ThemeUtils", var2.toString());
         }
      } finally {
         var5.recycle();
      }

   }

   public static int b(Context var0, int var1) {
      ColorStateList var5 = d(var0, var1);
      if (var5 != null && var5.isStateful()) {
         return var5.getColorForState(b, var5.getDefaultColor());
      } else {
         ThreadLocal var7 = a;
         TypedValue var6 = (TypedValue)var7.get();
         TypedValue var8 = var6;
         if (var6 == null) {
            var8 = new TypedValue();
            var7.set(var8);
         }

         var0.getTheme().resolveAttribute(16842803, var8, true);
         float var2 = var8.getFloat();
         var1 = c(var0, var1);
         int var3 = Math.round((float)Color.alpha(var1) * var2);
         int var4 = w.a.a;
         if (var3 >= 0 && var3 <= 255) {
            return var1 & 16777215 | var3 << 24;
         } else {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
         }
      }
   }

   public static int c(Context var0, int var1) {
      int[] var2 = g;
      var2[0] = var1;
      TypedArray var5 = var0.obtainStyledAttributes((AttributeSet)null, var2);

      try {
         var1 = var5.getColor(0, 0);
      } finally {
         var5.recycle();
      }

      return var1;
   }

   public static ColorStateList d(Context var0, int var1) {
      int[] var2 = g;
      var2[0] = var1;
      TypedArray var17 = var0.obtainStyledAttributes((AttributeSet)null, var2);

      ColorStateList var15;
      label134: {
         Throwable var10000;
         label133: {
            boolean var10001;
            label132: {
               try {
                  if (!var17.hasValue(0)) {
                     break label132;
                  }

                  var1 = var17.getResourceId(0, 0);
               } catch (Throwable var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label133;
               }

               if (var1 != 0) {
                  try {
                     var15 = C.b.l(var0, var1);
                  } catch (Throwable var13) {
                     var10000 = var13;
                     var10001 = false;
                     break label133;
                  }

                  if (var15 != null) {
                     break label134;
                  }
               }
            }

            label123:
            try {
               var15 = var17.getColorStateList(0);
               break label134;
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label123;
            }
         }

         Throwable var16 = var10000;
         var17.recycle();
         throw var16;
      }

      var17.recycle();
      return var15;
   }
}
