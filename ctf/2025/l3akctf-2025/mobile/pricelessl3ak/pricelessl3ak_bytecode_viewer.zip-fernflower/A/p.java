package A;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class p implements Executor {
   public final Handler a;

   public p(Handler var1) {
      this.a = var1;
   }

   public final void execute(Runnable var1) {
      var1.getClass();
      Handler var2 = this.a;
      if (!var2.post(var1)) {
         StringBuilder var3 = new StringBuilder();
         var3.append(var2);
         var3.append(" is shutting down");
         throw new RejectedExecutionException(var3.toString());
      }
   }
}
