package androidx.appcompat.app;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f1;

public final class c implements View.OnClickListener {
   public final int a;
   public final Object b;

   // $FF: synthetic method
   public c(int var1, Object var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void onClick(View var1) {
      switch (this.a) {
         case 0:
            h var3 = (h)this.b;
            Button var2 = var3.f;
            var3.v.obtainMessage(1, var3.b).sendToTarget();
            return;
         case 1:
            ((i.b)this.b).a();
            return;
         default:
            f1 var4 = ((Toolbar)this.b).M;
            j.n var5;
            if (var4 == null) {
               var5 = null;
            } else {
               var5 = var4.b;
            }

            if (var5 != null) {
               var5.collapseActionView();
            }

      }
   }
}
