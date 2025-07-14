package b;

public final class r implements b {
   public final androidx.fragment.app.o a;
   public final t b;

   public r(t var1, androidx.fragment.app.o var2) {
      i0.d.e(var2, "onBackPressedCallback");
      this.b = var1;
      this.a = var2;
   }

   public final void cancel() {
      t var3 = this.b;
      Z.f var2 = var3.b;
      androidx.fragment.app.o var1 = this.a;
      var2.remove(var1);
      if (i0.d.a(var3.c, var1)) {
         var1.getClass();
         var3.c = null;
      }

      var1.b.remove(this);
      s var4 = var1.c;
      if (var4 != null) {
         var4.b();
      }

      var1.c = null;
   }
}
