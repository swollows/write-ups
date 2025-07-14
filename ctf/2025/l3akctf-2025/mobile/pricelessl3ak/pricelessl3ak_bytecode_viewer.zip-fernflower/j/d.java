package j;

public final class d implements Runnable {
   public final e a;
   public final n b;
   public final l c;
   public final D.d d;

   public d(D.d var1, e var2, n var3, l var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   public final void run() {
      e var2 = this.a;
      if (var2 != null) {
         D.d var1 = this.d;
         ((f)var1.b).z = true;
         var2.b.c(false);
         ((f)var1.b).z = false;
      }

      n var3 = this.b;
      if (var3.isEnabled() && var3.hasSubMenu()) {
         this.c.q(var3, (x)null, 4);
      }

   }
}
