package androidx.lifecycle;

public final class v {
   public o a;
   public s b;

   public final void a(u var1, n var2) {
      o var4 = var2.a();
      o var5 = this.a;
      i0.d.e(var5, "state1");
      o var3 = var5;
      if (var4.compareTo(var5) < 0) {
         var3 = var4;
      }

      this.a = var3;
      this.b.a(var1, var2);
      this.a = var4;
   }
}
