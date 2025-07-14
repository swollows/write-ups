package A;

import java.util.concurrent.ThreadFactory;

public final class o implements ThreadFactory {
   public final Thread newThread(Runnable var1) {
      return new n(var1);
   }
}
