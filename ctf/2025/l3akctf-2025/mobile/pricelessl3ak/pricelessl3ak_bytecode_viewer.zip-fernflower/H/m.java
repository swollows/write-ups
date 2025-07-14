package H;

import java.util.concurrent.ThreadPoolExecutor;

public final class m extends C.b {
   public final C.b o;
   public final ThreadPoolExecutor p;

   public m(C.b var1, ThreadPoolExecutor var2) {
      this.o = var1;
      this.p = var2;
   }

   public final void x(Throwable var1) {
      ThreadPoolExecutor var2 = this.p;

      try {
         this.o.x(var1);
      } finally {
         var2.shutdown();
      }

   }

   public final void y(w var1) {
      ThreadPoolExecutor var2 = this.p;

      try {
         this.o.y(var1);
      } finally {
         var2.shutdown();
      }

   }
}
