package j;

import android.view.View;
import android.view.ViewTreeObserver;

public final class c implements View.OnAttachStateChangeListener {
   public final int a;
   public final t b;

   // $FF: synthetic method
   public c(t var1, int var2) {
      this.a = var2;
      this.b = var1;
   }

   private final void a(View var1) {
   }

   private final void b(View var1) {
   }

   public final void onViewAttachedToWindow(View var1) {
      int var2 = this.a;
   }

   public final void onViewDetachedFromWindow(View var1) {
      switch (this.a) {
         case 0:
            f var2 = (f)this.b;
            ViewTreeObserver var3 = var2.x;
            if (var3 != null) {
               if (!var3.isAlive()) {
                  var2.x = var1.getViewTreeObserver();
               }

               var2.x.removeGlobalOnLayoutListener(var2.i);
            }

            var1.removeOnAttachStateChangeListener(this);
            return;
         default:
            C var5 = (C)this.b;
            ViewTreeObserver var4 = var5.o;
            if (var4 != null) {
               if (!var4.isAlive()) {
                  var5.o = var1.getViewTreeObserver();
               }

               var5.o.removeGlobalOnLayoutListener(var5.i);
            }

            var1.removeOnAttachStateChangeListener(this);
      }
   }
}
