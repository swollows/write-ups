package j;

import android.view.MenuItem;

public final class r implements MenuItem.OnMenuItemClickListener {
   public final MenuItem.OnMenuItemClickListener a;
   public final s b;

   public r(s var1, MenuItem.OnMenuItemClickListener var2) {
      this.b = var1;
      this.a = var2;
   }

   public final boolean onMenuItemClick(MenuItem var1) {
      var1 = this.b.f(var1);
      return this.a.onMenuItemClick(var1);
   }
}
