package b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

public final class p implements OnBackAnimationCallback {
   public final n a;
   public final n b;
   public final o c;
   public final o d;

   public p(n var1, n var2, o var3, o var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final void onBackCancelled() {
      this.d.b();
   }

   public final void onBackInvoked() {
      this.c.b();
   }

   public final void onBackProgressed(BackEvent var1) {
      i0.d.e(var1, "backEvent");
      this.b.a(new a(var1));
   }

   public final void onBackStarted(BackEvent var1) {
      i0.d.e(var1, "backEvent");
      this.a.a(new a(var1));
   }
}
