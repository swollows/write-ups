package androidx.appcompat.widget;

public final class n1 implements Runnable {
   public final int a;
   public final o1 b;

   // $FF: synthetic method
   public n1(o1 var1, int var2) {
      this.a = var2;
      this.b = var1;
   }

   public final void run() {
      switch (this.a) {
         case 0:
            this.b.c(false);
            return;
         default:
            this.b.a();
      }
   }
}
