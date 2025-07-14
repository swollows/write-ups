package b;

import androidx.lifecycle.u;

public final class q implements androidx.lifecycle.s, b {
   public final androidx.lifecycle.p a;
   public final androidx.fragment.app.o b;
   public r c;
   public final t d;

   public q(t var1, androidx.lifecycle.p var2, androidx.fragment.app.o var3) {
      i0.d.e(var2, "lifecycle");
      i0.d.e(var3, "onBackPressedCallback");
      this.d = var1;
      this.a = var2;
      this.b = var3;
      var2.a(this);
   }

   public final void a(u var1, androidx.lifecycle.n var2) {
      if (var2 == androidx.lifecycle.n.ON_START) {
         t var4 = this.d;
         androidx.fragment.app.o var3 = this.b;
         i0.d.e(var3, "onBackPressedCallback");
         var4.b.addLast(var3);
         r var6 = new r(var4, var3);
         var3.b.add(var6);
         var4.d();
         var3.c = new s(1, var4);
         this.c = var6;
      } else if (var2 == androidx.lifecycle.n.ON_STOP) {
         r var5 = this.c;
         if (var5 != null) {
            var5.cancel();
         }
      } else if (var2 == androidx.lifecycle.n.ON_DESTROY) {
         this.cancel();
      }

   }

   public final void cancel() {
      this.a.b(this);
      this.b.b.remove(this);
      r var1 = this.c;
      if (var1 != null) {
         var1.cancel();
      }

      this.c = null;
   }
}
