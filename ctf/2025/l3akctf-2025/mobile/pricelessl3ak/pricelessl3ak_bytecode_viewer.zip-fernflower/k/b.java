package k;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class b implements ThreadFactory {
   public final AtomicInteger a = new AtomicInteger(0);

   public final Thread newThread(Runnable var1) {
      Thread var2 = new Thread(var1);
      StringBuilder var3 = new StringBuilder("arch_disk_io_");
      var3.append(this.a.getAndIncrement());
      var2.setName(var3.toString());
      return var2;
   }
}
