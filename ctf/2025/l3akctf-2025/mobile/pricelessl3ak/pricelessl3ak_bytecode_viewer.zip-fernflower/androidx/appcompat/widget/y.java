package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

public final class y {
   public static final PorterDuff.Mode b;
   public static y c;
   public S0 a;

   static {
      b = Mode.SRC_IN;
   }

   public static y a() {
      synchronized(y.class){}

      y var13;
      label144: {
         Throwable var10000;
         boolean var10001;
         label145: {
            try {
               if (c == null) {
                  c();
               }
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label145;
            }

            label132:
            try {
               var13 = c;
               break label144;
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               break label132;
            }
         }

         while(true) {
            Throwable var0 = var10000;

            try {
               throw var0;
            } catch (Throwable var10) {
               var10000 = var10;
               var10001 = false;
               continue;
            }
         }
      }

      return var13;
   }

   public static void c() {
      // $FF: Couldn't be decompiled
   }

   public static void d(Drawable var0, a1 var1, int[] var2) {
      PorterDuff.Mode var4 = S0.f;
      int[] var8 = var0.getState();
      if (var0.mutate() == var0) {
         if (var0 instanceof LayerDrawable && var0.isStateful()) {
            var0.setState(new int[0]);
            var0.setState(var8);
         }

         boolean var3 = var1.d;
         if (!var3 && !var1.c) {
            var0.clearColorFilter();
         } else {
            Object var6 = null;
            ColorStateList var9;
            if (var3) {
               var9 = var1.a;
            } else {
               var9 = null;
            }

            PorterDuff.Mode var5;
            if (var1.c) {
               var5 = var1.b;
            } else {
               var5 = S0.f;
            }

            PorterDuffColorFilter var7 = (PorterDuffColorFilter)var6;
            if (var9 != null) {
               if (var5 == null) {
                  var7 = (PorterDuffColorFilter)var6;
               } else {
                  var7 = S0.e(var9.getColorForState(var2, 0), var5);
               }
            }

            var0.setColorFilter(var7);
         }
      } else {
         Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
      }

   }

   public final Drawable b(Context var1, int var2) {
      synchronized(this){}

      Drawable var10;
      try {
         var10 = this.a.c(var1, var2);
      } catch (Throwable var8) {
         Throwable var10000 = var8;
         boolean var10001 = false;

         while(true) {
            Throwable var9 = var10000;

            try {
               throw var9;
            } catch (Throwable var7) {
               var10000 = var7;
               var10001 = false;
               continue;
            }
         }
      }

      return var10;
   }
}
