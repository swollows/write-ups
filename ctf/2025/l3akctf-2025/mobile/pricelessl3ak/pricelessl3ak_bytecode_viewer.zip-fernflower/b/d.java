package b;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.u;

public final class d implements androidx.lifecycle.s {
   public final int a;
   public final Object b;

   // $FF: synthetic method
   public d(int var1, Object var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void a(u var1, androidx.lifecycle.n var2) {
      switch (this.a) {
         case 0:
            if (var2 == androidx.lifecycle.n.ON_STOP) {
               Window var4 = ((androidx.fragment.app.i)this.b).getWindow();
               if (var4 != null) {
                  View var5 = var4.peekDecorView();
                  if (var5 != null) {
                     var5.cancelPendingInputEvents();
                  }
               }
            }

            return;
         case 1:
            l.b((androidx.fragment.app.i)this.b, var1, var2);
            return;
         default:
            androidx.lifecycle.n var3 = androidx.lifecycle.n.ON_START;
            R.a var6 = (R.a)this.b;
            if (var2 == var3) {
               var6.h = true;
            } else if (var2 == androidx.lifecycle.n.ON_STOP) {
               var6.h = false;
            }

      }
   }
}
