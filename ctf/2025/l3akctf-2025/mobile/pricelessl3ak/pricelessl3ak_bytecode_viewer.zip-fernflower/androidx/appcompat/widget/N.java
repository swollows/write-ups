package androidx.appcompat.widget;

import j.B;

public final class N extends B0 {
   public final V j;
   public final X k;

   public N(X var1, X var2, V var3) {
      super(var2);
      this.k = var1;
      this.j = var3;
   }

   public final B b() {
      return this.j;
   }

   public final boolean c() {
      X var3 = this.k;
      if (!var3.getInternalPopup().b()) {
         int var2 = var3.getTextDirection();
         int var1 = var3.getTextAlignment();
         var3.f.h(var2, var1);
      }

      return true;
   }
}
