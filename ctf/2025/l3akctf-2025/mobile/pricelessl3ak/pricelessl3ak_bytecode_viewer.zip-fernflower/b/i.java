package b;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

public final class i implements h, ViewTreeObserver.OnDrawListener, Runnable {
   public final long a;
   public Runnable b;
   public boolean c;
   public final androidx.fragment.app.i d;

   public i(androidx.fragment.app.i var1) {
      this.d = var1;
      this.a = SystemClock.uptimeMillis() + (long)10000;
   }

   public final void execute(Runnable var1) {
      i0.d.e(var1, "runnable");
      this.b = var1;
      View var2 = this.d.getWindow().getDecorView();
      i0.d.d(var2, "window.decorView");
      if (this.c) {
         if (i0.d.a(Looper.myLooper(), Looper.getMainLooper())) {
            var2.invalidate();
         } else {
            var2.postInvalidate();
         }
      } else {
         var2.postOnAnimation(new H.s(2, this));
      }

   }

   public final void onDraw() {
      Runnable var2 = this.b;
      if (var2 != null) {
         var2.run();
         this.b = null;
         m var3 = this.d.getFullyDrawnReporter();
         Object var6 = var3.a;
         synchronized(var6){}

         boolean var1;
         try {
            var1 = var3.b;
         } finally {
            ;
         }

         if (var1) {
            this.c = false;
            this.d.getWindow().getDecorView().post(this);
         }
      } else if (SystemClock.uptimeMillis() > this.a) {
         this.c = false;
         this.d.getWindow().getDecorView().post(this);
      }

   }

   public final void run() {
      this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
   }
}
