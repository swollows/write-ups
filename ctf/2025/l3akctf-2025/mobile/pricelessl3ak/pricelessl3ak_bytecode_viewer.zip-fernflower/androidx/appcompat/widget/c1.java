package androidx.appcompat.widget;

import j.n;

public final class c1 implements Runnable {
   public final int a;
   public final Toolbar b;

   // $FF: synthetic method
   public c1(Toolbar var1, int var2) {
      this.a = var2;
      this.b = var1;
   }

   public final void run() {
      switch (this.a) {
         case 0:
            f1 var1 = this.b.M;
            n var2;
            if (var1 == null) {
               var2 = null;
            } else {
               var2 = var1.b;
            }

            if (var2 != null) {
               var2.collapseActionView();
            }

            return;
         default:
            this.b.m();
      }
   }
}
