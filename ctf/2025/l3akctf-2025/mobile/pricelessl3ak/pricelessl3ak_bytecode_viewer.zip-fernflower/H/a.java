package H;

import java.util.concurrent.ThreadFactory;

public final class a implements ThreadFactory {
   public final String a;

   // $FF: synthetic method
   public a(String var1) {
      this.a = var1;
   }

   public final Thread newThread(Runnable var1) {
      Thread var2 = new Thread(var1, this.a);
      var2.setPriority(10);
      return var2;
   }
}
