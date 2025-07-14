package androidx.appcompat.app;

import ctf.l3akctf.pricelessl3ak.MainActivity;

public final class j implements c.b {
   public final MainActivity a;

   public j(MainActivity var1) {
      this.a = var1;
   }

   public final void a(b.l var1) {
      MainActivity var2 = this.a;
      r var3 = var2.getDelegate();
      var3.a();
      var2.getSavedStateRegistry().a("androidx:appcompat");
      var3.d();
   }
}
