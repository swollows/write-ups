package androidx.appcompat.widget;

import D.L;
import D.T;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

public final class s {
   public final View a;
   public final y b;
   public int c = -1;
   public a1 d;
   public a1 e;
   public a1 f;

   public s(View var1) {
      this.a = var1;
      this.b = y.a();
   }

   public final void a() {
      View var2 = this.a;
      Drawable var1 = var2.getBackground();
      if (var1 != null) {
         a1 var3;
         if (this.d != null) {
            if (this.f == null) {
               this.f = (a1)(new Object());
            }

            var3 = this.f;
            var3.a = null;
            var3.d = false;
            var3.b = null;
            var3.c = false;
            WeakHashMap var4 = T.a;
            ColorStateList var5 = L.c(var2);
            if (var5 != null) {
               var3.d = true;
               var3.a = var5;
            }

            PorterDuff.Mode var6 = L.d(var2);
            if (var6 != null) {
               var3.c = true;
               var3.b = var6;
            }

            if (var3.d || var3.c) {
               y.d(var1, var3, var2.getDrawableState());
               return;
            }
         }

         var3 = this.e;
         if (var3 != null) {
            y.d(var1, var3, var2.getDrawableState());
         } else {
            var3 = this.d;
            if (var3 != null) {
               y.d(var1, var3, var2.getDrawableState());
            }
         }
      }

   }

   public final ColorStateList b() {
      a1 var1 = this.e;
      ColorStateList var2;
      if (var1 != null) {
         var2 = var1.a;
      } else {
         var2 = null;
      }

      return var2;
   }

   public final PorterDuff.Mode c() {
      a1 var1 = this.e;
      PorterDuff.Mode var2;
      if (var1 != null) {
         var2 = var1.b;
      } else {
         var2 = null;
      }

      return var2;
   }

   public final void d(AttributeSet param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void e() {
      this.c = -1;
      this.g((ColorStateList)null);
      this.a();
   }

   public final void f(int var1) {
      this.c = var1;
      y var3 = this.b;
      ColorStateList var11;
      if (var3 != null) {
         Context var2 = this.a.getContext();
         synchronized(var3){}

         try {
            var11 = var3.a.f(var2, var1);
         } catch (Throwable var9) {
            Throwable var10000 = var9;
            boolean var10001 = false;

            while(true) {
               Throwable var10 = var10000;

               try {
                  throw var10;
               } catch (Throwable var8) {
                  var10000 = var8;
                  var10001 = false;
                  continue;
               }
            }
         }
      } else {
         var11 = null;
      }

      this.g(var11);
      this.a();
   }

   public final void g(ColorStateList var1) {
      if (var1 != null) {
         if (this.d == null) {
            this.d = (a1)(new Object());
         }

         a1 var2 = this.d;
         var2.a = var1;
         var2.d = true;
      } else {
         this.d = null;
      }

      this.a();
   }

   public final void h(ColorStateList var1) {
      if (this.e == null) {
         this.e = (a1)(new Object());
      }

      a1 var2 = this.e;
      var2.a = var1;
      var2.d = true;
      this.a();
   }

   public final void i(PorterDuff.Mode var1) {
      if (this.e == null) {
         this.e = (a1)(new Object());
      }

      a1 var2 = this.e;
      var2.b = var1;
      var2.c = true;
      this.a();
   }
}
