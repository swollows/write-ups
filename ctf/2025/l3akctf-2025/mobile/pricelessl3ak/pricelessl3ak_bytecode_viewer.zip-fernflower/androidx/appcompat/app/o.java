package androidx.appcompat.app;

import android.graphics.Typeface;
import androidx.appcompat.widget.Z;

public final class o implements Runnable {
   public final int a;
   public final Object b;
   public final Object c;

   // $FF: synthetic method
   public o(Object var1, Object var2, int var3) {
      this.a = var3;
      this.b = var1;
      this.c = var2;
   }

   public final void run() {
      switch (this.a) {
         case 0:
            Runnable var2 = (Runnable)this.c;
            p var1 = (p)this.b;
            var1.getClass();

            try {
               var2.run();
            } finally {
               var1.a();
            }

            return;
         case 1:
            b.l.access$addObserverForBackInvoker((androidx.fragment.app.i)this.b, (b.t)this.c);
            return;
         default:
            ((Z)this.b).b((Typeface)this.c);
      }
   }
}
