package j;

import android.view.ActionProvider;

public final class o implements ActionProvider.VisibilityListener {
   public D.d a;
   public final ActionProvider b;
   public final s c;

   public o(s var1, ActionProvider var2) {
      this.c = var1;
      this.b = var2;
   }

   public final void onActionProviderVisibilityChanged(boolean var1) {
      D.d var2 = this.a;
      if (var2 != null) {
         l var3 = ((n)var2.b).n;
         var3.h = true;
         var3.p(true);
      }

   }
}
