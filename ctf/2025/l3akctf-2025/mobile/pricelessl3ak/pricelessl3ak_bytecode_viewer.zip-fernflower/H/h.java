package H;

import java.util.ArrayList;
import java.util.List;

public final class h implements Runnable {
   public final ArrayList a;
   public final int b;

   public h(List var1, int var2, Throwable var3) {
      C.b.f(var1, "initCallbacks cannot be null");
      this.a = new ArrayList(var1);
      this.b = var2;
   }

   public final void run() {
      ArrayList var5 = this.a;
      int var3 = var5.size();
      int var4 = this.b;
      int var1 = 0;
      byte var2 = 0;
      if (var4 != 1) {
         for(var1 = var2; var1 < var3; ++var1) {
            ((g)var5.get(var1)).getClass();
         }
      } else {
         while(var1 < var3) {
            ((g)var5.get(var1)).a();
            ++var1;
         }
      }

   }
}
