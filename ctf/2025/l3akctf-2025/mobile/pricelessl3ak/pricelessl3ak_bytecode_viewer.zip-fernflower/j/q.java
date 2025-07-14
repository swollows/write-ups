package j;

import android.view.MenuItem;

public final class q implements MenuItem.OnActionExpandListener {
   public final MenuItem.OnActionExpandListener a;
   public final s b;

   public q(s var1, MenuItem.OnActionExpandListener var2) {
      this.b = var1;
      this.a = var2;
   }

   public final boolean onMenuItemActionCollapse(MenuItem var1) {
      var1 = this.b.f(var1);
      return this.a.onMenuItemActionCollapse(var1);
   }

   public final boolean onMenuItemActionExpand(MenuItem var1) {
      var1 = this.b.f(var1);
      return this.a.onMenuItemActionExpand(var1);
   }
}
