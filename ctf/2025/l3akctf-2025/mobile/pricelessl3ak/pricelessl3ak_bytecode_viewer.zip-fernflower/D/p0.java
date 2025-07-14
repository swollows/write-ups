package D;

import android.os.Build.VERSION;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import w.c;

public final class p0 {
   public static final p0 b;
   public final o0 a;

   static {
      int var0 = VERSION.SDK_INT;
      if (var0 >= 34) {
         b = n0.n;
      } else if (var0 >= 30) {
         b = m0.m;
      } else {
         b = o0.b;
      }

   }

   public p0() {
      this.a = new o0(this);
   }

   public p0(WindowInsets var1) {
      int var2 = VERSION.SDK_INT;
      if (var2 >= 34) {
         this.a = new n0(this, var1);
      } else if (var2 >= 30) {
         this.a = new m0(this, var1);
      } else if (var2 >= 29) {
         this.a = new k0(this, var1);
      } else if (var2 >= 28) {
         this.a = new j0(this, var1);
      } else {
         this.a = new i0(this, var1);
      }

   }

   public static c a(c var0, int var1, int var2, int var3, int var4) {
      int var5 = Math.max(0, var0.a - var1);
      int var6 = Math.max(0, var0.b - var2);
      int var8 = Math.max(0, var0.c - var3);
      int var7 = Math.max(0, var0.d - var4);
      return var5 == var1 && var6 == var2 && var8 == var3 && var7 == var4 ? var0 : c.a(var5, var6, var8, var7);
   }

   public static p0 c(WindowInsets var0, View var1) {
      var0.getClass();
      p0 var4 = new p0(var0);
      if (var1 != null && var1.isAttachedToWindow()) {
         WeakHashMap var2 = T.a;
         p0 var3 = M.a(var1);
         o0 var5 = var4.a;
         var5.l(var3);
         var5.d(var1.getRootView());
         var5.n(var1.getWindowSystemUiVisibility());
      }

      return var4;
   }

   public final WindowInsets b() {
      o0 var1 = this.a;
      WindowInsets var2;
      if (var1 instanceof h0) {
         var2 = ((h0)var1).c;
      } else {
         var2 = null;
      }

      return var2;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof p0)) {
         return false;
      } else {
         o0 var2 = ((p0)var1).a;
         return Objects.equals(this.a, var2);
      }
   }

   public final int hashCode() {
      o0 var2 = this.a;
      int var1;
      if (var2 == null) {
         var1 = 0;
      } else {
         var1 = var2.hashCode();
      }

      return var1;
   }
}
