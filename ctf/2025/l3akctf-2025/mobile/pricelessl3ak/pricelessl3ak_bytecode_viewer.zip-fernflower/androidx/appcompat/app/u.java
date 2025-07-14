package androidx.appcompat.app;

import D.J;
import D.T;
import D.a0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

public final class u extends C.b {
   public final int o;
   public final Object p;

   // $FF: synthetic method
   public u(int var1, Object var2) {
      this.o = var1;
      this.p = var2;
   }

   public final void a() {
      Object var1 = this.p;
      H var4;
      switch (this.o) {
         case 0:
            var4 = ((s)var1).b;
            var4.v.setAlpha(1.0F);
            var4.y.d((a0)null);
            var4.y = null;
            return;
         case 1:
            var4 = (H)var1;
            var4.v.setAlpha(1.0F);
            var4.y.d((a0)null);
            var4.y = null;
            return;
         default:
            A.c var5 = (A.c)var1;
            ((H)var5.b).v.setVisibility(8);
            var4 = (H)var5.b;
            PopupWindow var2 = var4.w;
            if (var2 != null) {
               var2.dismiss();
            } else if (var4.v.getParent() instanceof View) {
               View var6 = (View)var4.v.getParent();
               WeakHashMap var3 = T.a;
               J.c(var6);
            }

            var4.v.e();
            var4.y.d((a0)null);
            var4.y = null;
            ViewGroup var7 = var4.A;
            WeakHashMap var8 = T.a;
            J.c(var7);
      }
   }

   public void c() {
      Object var1 = this.p;
      switch (this.o) {
         case 0:
            ((s)var1).b.v.setVisibility(0);
            return;
         case 1:
            H var3 = (H)var1;
            var3.v.setVisibility(0);
            if (var3.v.getParent() instanceof View) {
               View var2 = (View)var3.v.getParent();
               WeakHashMap var4 = T.a;
               J.c(var2);
            }

            return;
         default:
      }
   }
}
