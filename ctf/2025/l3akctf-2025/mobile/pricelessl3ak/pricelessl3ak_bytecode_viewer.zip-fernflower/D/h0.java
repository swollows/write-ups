package D;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import w.c;

public abstract class h0 extends o0 {
   public static boolean g;
   public static Method h;
   public static Class i;
   public static Field j;
   public static Field k;
   public final WindowInsets c;
   public c d = null;
   public c e;
   public int f;

   public h0(p0 var1, WindowInsets var2) {
      super(var1);
      this.c = var2;
   }

   private c o(View var1) {
      if (VERSION.SDK_INT < 30) {
         if (!g) {
            p();
         }

         Method var3 = h;
         ReflectiveOperationException var2 = null;
         if (var3 != null && i != null && j != null) {
            ReflectiveOperationException var10000;
            label47: {
               Object var8;
               boolean var10001;
               try {
                  var8 = var3.invoke(var1, (Object[])null);
               } catch (ReflectiveOperationException var7) {
                  var10000 = var7;
                  var10001 = false;
                  break label47;
               }

               if (var8 == null) {
                  try {
                     NullPointerException var9 = new NullPointerException();
                     Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", var9);
                     return null;
                  } catch (ReflectiveOperationException var4) {
                     var10000 = var4;
                     var10001 = false;
                  }
               } else {
                  label57: {
                     Rect var12;
                     try {
                        var8 = k.get(var8);
                        var12 = (Rect)j.get(var8);
                     } catch (ReflectiveOperationException var6) {
                        var10000 = var6;
                        var10001 = false;
                        break label57;
                     }

                     c var10 = var2;
                     if (var12 != null) {
                        try {
                           var10 = w.c.a(var12.left, var12.top, var12.right, var12.bottom);
                        } catch (ReflectiveOperationException var5) {
                           var10000 = var5;
                           var10001 = false;
                           break label57;
                        }
                     }

                     return var10;
                  }
               }
            }

            var2 = var10000;
            StringBuilder var11 = new StringBuilder("Failed to get visible insets. (Reflection error). ");
            var11.append(var2.getMessage());
            Log.e("WindowInsetsCompat", var11.toString(), var2);
         }

         return null;
      } else {
         throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
      }
   }

   private static void p() {
      try {
         h = View.class.getDeclaredMethod("getViewRootImpl", (Class[])null);
         Class var0 = Class.forName("android.view.View$AttachInfo");
         i = var0;
         j = var0.getDeclaredField("mVisibleInsets");
         k = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
         j.setAccessible(true);
         k.setAccessible(true);
      } catch (ReflectiveOperationException var2) {
         StringBuilder var1 = new StringBuilder("Failed to get visible insets. (Reflection error). ");
         var1.append(var2.getMessage());
         Log.e("WindowInsetsCompat", var1.toString(), var2);
      }

      g = true;
   }

   public static boolean r(int var0, int var1) {
      boolean var2;
      if ((var0 & 6) == (var1 & 6)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public void d(View var1) {
      c var2 = this.o(var1);
      c var3 = var2;
      if (var2 == null) {
         var3 = w.c.e;
      }

      this.q(var3);
   }

   public boolean equals(Object var1) {
      boolean var2 = super.equals(var1);
      boolean var3 = false;
      if (!var2) {
         return false;
      } else {
         h0 var4 = (h0)var1;
         var2 = var3;
         if (Objects.equals(this.e, var4.e)) {
            var2 = var3;
            if (r(this.f, var4.f)) {
               var2 = true;
            }
         }

         return var2;
      }
   }

   public final c g() {
      if (this.d == null) {
         WindowInsets var1 = this.c;
         this.d = w.c.a(var1.getSystemWindowInsetLeft(), var1.getSystemWindowInsetTop(), var1.getSystemWindowInsetRight(), var1.getSystemWindowInsetBottom());
      }

      return this.d;
   }

   public p0 h(int var1, int var2, int var3, int var4) {
      p0 var6 = p0.c(this.c, (View)null);
      int var5 = VERSION.SDK_INT;
      Object var7;
      if (var5 >= 34) {
         var7 = new f0(var6);
      } else if (var5 >= 30) {
         var7 = new e0(var6);
      } else if (var5 >= 29) {
         var7 = new d0(var6);
      } else {
         var7 = new b0(var6);
      }

      ((g0)var7).d(p0.a(this.g(), var1, var2, var3, var4));
      ((g0)var7).c(p0.a(this.f(), var1, var2, var3, var4));
      return ((g0)var7).b();
   }

   public boolean j() {
      return this.c.isRound();
   }

   public void k(c[] var1) {
   }

   public void l(p0 var1) {
   }

   public void n(int var1) {
      this.f = var1;
   }

   public void q(c var1) {
      this.e = var1;
   }
}
