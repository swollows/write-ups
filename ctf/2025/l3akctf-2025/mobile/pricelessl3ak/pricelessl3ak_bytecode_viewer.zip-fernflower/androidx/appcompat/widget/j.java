package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import j.B;

public final class j extends B0 {
   public final int j;
   public final View k;

   public j(ActionMenuItemView var1) {
      this.j = 1;
      this.k = var1;
      super(var1);
   }

   public j(k var1, k var2) {
      this.j = 0;
      this.k = var1;
      super(var2);
   }

   public final B b() {
      t var4;
      switch (this.j) {
         case 0:
            g var1 = ((k)this.k).d.s;
            if (var1 == null) {
               var4 = null;
            } else {
               var4 = var1.a();
            }

            return var4;
         default:
            b var3 = ((ActionMenuItemView)this.k).m;
            Object var2 = null;
            var4 = (t)var2;
            if (var3 != null) {
               g var5 = ((h)var3).a.t;
               var4 = (t)var2;
               if (var5 != null) {
                  var4 = var5.a();
               }
            }

            return var4;
      }
   }

   public final boolean c() {
      switch (this.j) {
         case 0:
            ((k)this.k).d.l();
            return true;
         default:
            ActionMenuItemView var3 = (ActionMenuItemView)this.k;
            k var4 = var3.k;
            boolean var2 = false;
            boolean var1 = var2;
            if (var4 != null) {
               var1 = var2;
               if (var4.b(var3.h)) {
                  B var5 = this.b();
                  var1 = var2;
                  if (var5 != null) {
                     var1 = var2;
                     if (var5.b()) {
                        var1 = true;
                     }
                  }
               }
            }

            return var1;
      }
   }

   public boolean d() {
      switch (this.j) {
         case 0:
            m var2 = ((k)this.k).d;
            boolean var1;
            if (var2.u != null) {
               var1 = false;
            } else {
               var2.g();
               var1 = true;
            }

            return var1;
         default:
            return super.d();
      }
   }
}
