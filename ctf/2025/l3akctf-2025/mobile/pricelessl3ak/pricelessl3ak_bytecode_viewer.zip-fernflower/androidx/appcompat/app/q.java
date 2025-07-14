package androidx.appcompat.app;

import java.util.concurrent.Executor;

public final class q implements Executor {
   public final void execute(Runnable var1) {
      (new Thread(var1)).start();
   }
}
