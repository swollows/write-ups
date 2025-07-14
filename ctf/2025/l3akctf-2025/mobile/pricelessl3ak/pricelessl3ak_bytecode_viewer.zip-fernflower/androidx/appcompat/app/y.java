package androidx.appcompat.app;

import android.window.OnBackInvokedCallback;

public final class y implements OnBackInvokedCallback {
   public final int a;
   public final Object b;

   // $FF: synthetic method
   public y(int var1, Object var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void onBackInvoked() {
      switch (this.a) {
         case 0:
            ((H)this.b).E();
            return;
         case 1:
            ((Runnable)this.b).run();
            return;
         default:
            ((b.o)this.b).b();
      }
   }
}
