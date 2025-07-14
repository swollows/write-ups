package j;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;

public class v {
   public final Context a;
   public final l b;
   public final boolean c;
   public final int d;
   public View e;
   public int f = 8388611;
   public boolean g;
   public w h;
   public t i;
   public u j;
   public final u k = new u(this);

   public v(int var1, Context var2, View var3, l var4, boolean var5) {
      this.a = var2;
      this.b = var4;
      this.e = var3;
      this.c = var5;
      this.d = var1;
   }

   public final t a() {
      if (this.i == null) {
         Context var4 = this.a;
         Display var3 = ((WindowManager)var4.getSystemService("window")).getDefaultDisplay();
         Point var2 = new Point();
         var3.getRealSize(var2);
         Object var5;
         if (Math.min(var2.x, var2.y) >= var4.getResources().getDimensionPixelSize(2131099670)) {
            var5 = new f(var4, this.e, this.d, this.c);
         } else {
            View var6 = this.e;
            Context var7 = this.a;
            boolean var1 = this.c;
            l var8 = this.b;
            var5 = new C(this.d, var7, var6, var8, var1);
         }

         ((t)var5).l(this.b);
         ((t)var5).r(this.k);
         ((t)var5).n(this.e);
         ((x)var5).h(this.h);
         ((t)var5).o(this.g);
         ((t)var5).p(this.f);
         this.i = (t)var5;
      }

      return this.i;
   }

   public final boolean b() {
      t var2 = this.i;
      boolean var1;
      if (var2 != null && var2.b()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void c() {
      this.i = null;
      u var1 = this.j;
      if (var1 != null) {
         var1.onDismiss();
      }

   }

   public final void d(int var1, int var2, boolean var3, boolean var4) {
      t var6 = this.a();
      var6.s(var4);
      if (var3) {
         int var5 = var1;
         if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
            var5 = var1 - this.e.getWidth();
         }

         var6.q(var5);
         var6.t(var2);
         var1 = (int)(this.a.getResources().getDisplayMetrics().density * 48.0F / 2.0F);
         var6.a = new Rect(var5 - var1, var2 - var1, var5 + var1, var2 + var1);
      }

      var6.k();
   }
}
