package A;

import android.os.Handler;

public final class q implements Runnable {
   public h a;
   public i b;
   public Handler c;

   public final void run() {
      Object var1;
      try {
         var1 = this.a.call();
      } catch (Exception var2) {
         var1 = null;
      }

      a var3 = new a(this.b, var1, 1);
      this.c.post(var3);
   }
}
