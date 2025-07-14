package P;

import java.util.concurrent.Executor;

public final class e implements Executor {
   public final void execute(Runnable var1) {
      var1.run();
   }
}
