package androidx.appcompat.widget;

import android.view.MenuItem;

public final class d1 implements q, j.j {
   public final Toolbar a;

   // $FF: synthetic method
   public d1(Toolbar var1) {
      this.a = var1;
   }

   public void i(j.l var1) {
      Toolbar var3 = this.a;
      m var2 = var3.a.t;
      if (var2 == null || !var2.k()) {
         var3.G.c();
      }

      androidx.appcompat.app.N var4 = var3.O;
      if (var4 != null) {
         var4.i(var1);
      }

   }

   public boolean k(j.l var1, MenuItem var2) {
      androidx.appcompat.app.N var3 = this.a.O;
      return false;
   }
}
