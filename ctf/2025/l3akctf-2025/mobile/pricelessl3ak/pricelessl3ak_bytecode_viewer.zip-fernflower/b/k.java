package b;

import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Build.VERSION;
import androidx.lifecycle.L;

public final class k extends i0.e implements h0.a {
   public final int b;
   public final androidx.fragment.app.i c;

   // $FF: synthetic method
   public k(androidx.fragment.app.i var1, int var2) {
      super(0);
      this.b = var2;
      this.c = var1;
   }

   public final Object b() {
      androidx.fragment.app.i var1;
      switch (this.b) {
         case 0:
            androidx.fragment.app.i var3 = this.c;
            Application var2 = var3.getApplication();
            Bundle var4;
            if (var3.getIntent() != null) {
               var4 = var3.getIntent().getExtras();
            } else {
               var4 = null;
            }

            return new L(var2, var3, var4);
         case 1:
            this.c.reportFullyDrawn();
            return Y.f.c;
         case 2:
            var1 = this.c;
            return new m(l.access$getReportFullyDrawnExecutor$p(var1), new k(var1, 1));
         default:
            var1 = this.c;
            t var5 = new t(new c(var1, 1));
            if (VERSION.SDK_INT >= 33) {
               if (!i0.d.a(Looper.myLooper(), Looper.getMainLooper())) {
                  (new Handler(Looper.getMainLooper())).post(new androidx.appcompat.app.o(var1, var5, 1));
               } else {
                  l.access$addObserverForBackInvoker(var1, var5);
               }
            }

            return var5;
      }
   }
}
