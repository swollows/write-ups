package androidx.appcompat.app;

import D.J;
import D.M;
import D.T;
import D.b0;
import D.d0;
import D.e0;
import D.f0;
import D.g0;
import D.o0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.p0;
import androidx.appcompat.widget.s1;
import androidx.appcompat.widget.t1;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class t implements D.w, p0, j.w {
   public final int a;
   public final H b;

   // $FF: synthetic method
   public t(H var1, int var2) {
      this.a = var2;
      this.b = var1;
   }

   public void a(j.l var1, boolean var2) {
      boolean var3;
      int var4;
      int var5;
      j.l var6;
      H var8;
      G[] var9;
      switch (this.a) {
         case 2:
            this.b.s(var1);
            return;
         default:
            var6 = var1.k();
            var5 = 0;
            if (var6 != var1) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3) {
               var1 = var6;
            }

            var8 = this.b;
            var9 = var8.L;
            if (var9 != null) {
               var4 = var9.length;
            } else {
               var4 = 0;
            }
      }

      G var10;
      while(true) {
         if (var5 >= var4) {
            var10 = null;
            break;
         }

         G var7 = var9[var5];
         if (var7 != null && var7.h == var1) {
            var10 = var7;
            break;
         }

         ++var5;
      }

      if (var10 != null) {
         if (var3) {
            var8.r(var10.a, var10, var6);
            var8.t(var10, true);
         } else {
            var8.t(var10, var2);
         }
      }

   }

   public D.p0 b(View var1, D.p0 var2) {
      o0 var11 = var2.a;
      int var8 = var11.g().b;
      H var12 = this.b;
      var12.getClass();
      int var4 = var11.g().b;
      ActionBarContextView var13 = var12.v;
      int var3;
      int var5;
      int var6;
      boolean var7;
      int var24;
      if (var13 != null && var13.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
         ViewGroup.MarginLayoutParams var29 = (ViewGroup.MarginLayoutParams)var12.v.getLayoutParams();
         boolean var21;
         boolean var23;
         if (!var12.v.isShown()) {
            if (var29.topMargin != 0) {
               var29.topMargin = 0;
               var21 = false;
               var23 = true;
            } else {
               var21 = false;
               var23 = false;
            }
         } else {
            if (var12.c0 == null) {
               var12.c0 = new Rect();
               var12.d0 = new Rect();
            }

            Rect var14 = var12.c0;
            Rect var16 = var12.d0;
            var14.set(var11.g().a, var11.g().b, var11.g().c, var11.g().d);
            ViewGroup var15 = var12.A;
            if (VERSION.SDK_INT >= 29) {
               boolean var10 = t1.a;
               s1.a(var15, var14, var16);
            } else {
               Method var17;
               if (!t1.a) {
                  t1.a = true;

                  try {
                     var17 = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                     t1.b = var17;
                     if (!var17.isAccessible()) {
                        t1.b.setAccessible(true);
                     }
                  } catch (NoSuchMethodException var19) {
                     Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                  }
               }

               var17 = t1.b;
               if (var17 != null) {
                  try {
                     var17.invoke(var15, var14, var16);
                  } catch (Exception var18) {
                     Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", var18);
                  }
               }
            }

            var24 = var14.top;
            var3 = var14.left;
            int var9 = var14.right;
            ViewGroup var31 = var12.A;
            WeakHashMap var34 = T.a;
            D.p0 var32 = M.a(var31);
            if (var32 == null) {
               var5 = 0;
            } else {
               var5 = var32.a.g().a;
            }

            if (var32 == null) {
               var6 = 0;
            } else {
               var6 = var32.a.g().c;
            }

            if (var29.topMargin == var24 && var29.leftMargin == var3 && var29.rightMargin == var9) {
               var21 = false;
            } else {
               var29.topMargin = var24;
               var29.leftMargin = var3;
               var29.rightMargin = var9;
               var21 = true;
            }

            Context var33 = var12.k;
            View var35;
            if (var24 > 0 && var12.C == null) {
               var35 = new View(var33);
               var12.C = var35;
               var35.setVisibility(8);
               FrameLayout.LayoutParams var37 = new FrameLayout.LayoutParams(-1, var29.topMargin, 51);
               var37.leftMargin = var5;
               var37.rightMargin = var6;
               var12.A.addView(var12.C, -1, var37);
            } else {
               var35 = var12.C;
               if (var35 != null) {
                  ViewGroup.MarginLayoutParams var36 = (ViewGroup.MarginLayoutParams)var35.getLayoutParams();
                  var24 = var36.height;
                  var9 = var29.topMargin;
                  if (var24 != var9 || var36.leftMargin != var5 || var36.rightMargin != var6) {
                     var36.height = var9;
                     var36.leftMargin = var5;
                     var36.rightMargin = var6;
                     var12.C.setLayoutParams(var36);
                  }
               }
            }

            var35 = var12.C;
            if (var35 != null) {
               var23 = true;
            } else {
               var23 = false;
            }

            if (var23 && var35.getVisibility() != 0) {
               var35 = var12.C;
               if ((var35.getWindowSystemUiVisibility() & 8192) != 0) {
                  var6 = var33.getColor(2131034118);
               } else {
                  var6 = var33.getColor(2131034117);
               }

               var35.setBackgroundColor(var6);
            }

            var6 = var4;
            if (!var12.H) {
               var6 = var4;
               if (var23) {
                  var6 = 0;
               }
            }

            var7 = var21;
            var21 = var23;
            var4 = var6;
            var23 = var7;
         }

         var7 = var21;
         var6 = var4;
         if (var23) {
            var12.v.setLayoutParams(var29);
            var7 = var21;
            var6 = var4;
         }
      } else {
         var7 = false;
         var6 = var4;
      }

      View var27 = var12.C;
      if (var27 != null) {
         byte var22;
         if (var7) {
            var22 = 0;
         } else {
            var22 = 8;
         }

         var27.setVisibility(var22);
      }

      if (var8 != var6) {
         var4 = var11.g().a;
         var5 = var11.g().c;
         var24 = var11.g().d;
         var3 = VERSION.SDK_INT;
         Object var20;
         if (var3 >= 34) {
            var20 = new f0(var2);
         } else if (var3 >= 30) {
            var20 = new e0(var2);
         } else if (var3 >= 29) {
            var20 = new d0(var2);
         } else {
            var20 = new b0(var2);
         }

         ((g0)var20).d(w.c.a(var4, var6, var5, var24));
         var2 = ((g0)var20).b();
      }

      WeakHashMap var25 = T.a;
      WindowInsets var30 = var2.b();
      D.p0 var26 = var2;
      if (var30 != null) {
         WindowInsets var28 = J.b(var1, var30);
         var26 = var2;
         if (!var28.equals(var30)) {
            var26 = D.p0.c(var28, var1);
         }
      }

      return var26;
   }

   public boolean c(j.l var1) {
      switch (this.a) {
         case 2:
            Window.Callback var2 = this.b.l.getCallback();
            if (var2 != null) {
               var2.onMenuOpened(108, var1);
            }

            return true;
         default:
            if (var1 == var1.k()) {
               H var4 = this.b;
               if (var4.F) {
                  Window.Callback var3 = var4.l.getCallback();
                  if (var3 != null && !var4.Q) {
                     var3.onMenuOpened(108, var1);
                  }
               }
            }

            return true;
      }
   }
}
