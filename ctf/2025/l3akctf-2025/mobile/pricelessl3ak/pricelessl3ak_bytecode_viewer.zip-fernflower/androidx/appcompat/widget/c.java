package androidx.appcompat.widget;

public final class c implements Runnable {
   public final int a;
   public final ActionBarOverlayLayout b;

   // $FF: synthetic method
   public c(ActionBarOverlayLayout var1, int var2) {
      this.a = var2;
      this.b = var1;
   }

   public final void run() {
      ActionBarOverlayLayout var1;
      switch (this.a) {
         case 0:
            var1 = this.b;
            var1.h();
            var1.w = var1.d.animate().translationY(0.0F).setListener(var1.x);
            return;
         default:
            var1 = this.b;
            var1.h();
            var1.w = var1.d.animate().translationY((float)(-var1.d.getHeight())).setListener(var1.x);
      }
   }
}
