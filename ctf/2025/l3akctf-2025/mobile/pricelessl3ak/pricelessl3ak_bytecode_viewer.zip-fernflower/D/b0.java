package D;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import w.c;

public final class b0 extends g0 {
   public static Field c;
   public static boolean d;
   public static Constructor e;
   public static boolean f;
   public WindowInsets a;
   public c b;

   public b0() {
      this.a = e();
   }

   public b0(p0 var1) {
      super(var1);
      this.a = var1.b();
   }

   private static WindowInsets e() {
      if (!d) {
         try {
            c = WindowInsets.class.getDeclaredField("CONSUMED");
         } catch (ReflectiveOperationException var3) {
            Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", var3);
         }

         d = true;
      }

      Field var0 = c;
      WindowInsets var7;
      if (var0 != null) {
         label54: {
            ReflectiveOperationException var10000;
            label59: {
               boolean var10001;
               try {
                  var7 = (WindowInsets)var0.get((Object)null);
               } catch (ReflectiveOperationException var6) {
                  var10000 = var6;
                  var10001 = false;
                  break label59;
               }

               if (var7 == null) {
                  break label54;
               }

               try {
                  var7 = new WindowInsets(var7);
                  return var7;
               } catch (ReflectiveOperationException var5) {
                  var10000 = var5;
                  var10001 = false;
               }
            }

            ReflectiveOperationException var8 = var10000;
            Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", var8);
         }
      }

      if (!f) {
         try {
            e = WindowInsets.class.getConstructor(Rect.class);
         } catch (ReflectiveOperationException var2) {
            Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", var2);
         }

         f = true;
      }

      Constructor var9 = e;
      if (var9 != null) {
         try {
            Rect var1 = new Rect();
            var7 = (WindowInsets)var9.newInstance(var1);
            return var7;
         } catch (ReflectiveOperationException var4) {
            Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", var4);
         }
      }

      return null;
   }

   public p0 b() {
      this.a();
      p0 var2 = p0.c(this.a, (View)null);
      o0 var1 = var2.a;
      var1.k((c[])null);
      var1.m(this.b);
      return var2;
   }

   public void c(c var1) {
      this.b = var1;
   }

   public void d(c var1) {
      WindowInsets var5 = this.a;
      if (var5 != null) {
         int var3 = var1.a;
         int var4 = var1.c;
         int var2 = var1.d;
         this.a = var5.replaceSystemWindowInsets(var3, var1.b, var4, var2);
      }

   }
}
