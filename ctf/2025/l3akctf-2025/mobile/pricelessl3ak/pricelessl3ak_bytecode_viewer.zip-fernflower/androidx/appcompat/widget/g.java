package androidx.appcompat.widget;

import D.d;
import android.content.Context;
import android.view.View;

public final class g extends j.v {
   public final int l;
   public final m m;

   public g(m var1, Context var2, j.D var3, View var4) {
      this.l = 0;
      this.m = var1;
      super(2130903072, var2, var4, var3, false);
      if (!var3.A.f()) {
         k var7 = var1.i;
         Object var6 = var7;
         if (var7 == null) {
            var6 = (View)var1.h;
         }

         super.e = (View)var6;
      }

      d var5 = var1.w;
      super.h = var5;
      j.t var8 = super.i;
      if (var8 != null) {
         var8.h(var5);
      }

   }

   public g(m var1, Context var2, j.l var3, View var4) {
      this.l = 1;
      this.m = var1;
      super(2130903072, var2, var4, var3, true);
      super.f = 8388613;
      d var5 = var1.w;
      super.h = var5;
      j.t var6 = super.i;
      if (var6 != null) {
         var6.h(var5);
      }

   }

   public final void c() {
      switch (this.l) {
         case 0:
            m var1 = this.m;
            var1.t = null;
            var1.getClass();
            super.c();
            return;
         default:
            m var2 = this.m;
            j.l var3 = var2.c;
            if (var3 != null) {
               var3.c(true);
            }

            var2.s = null;
            super.c();
      }
   }
}
