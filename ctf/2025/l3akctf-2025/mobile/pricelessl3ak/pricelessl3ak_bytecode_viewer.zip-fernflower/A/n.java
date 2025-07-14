package A;

import android.os.Process;

public final class n extends Thread {
   public final int a = 10;

   public n(Runnable var1) {
      super(var1, "fonts-androidx");
   }

   public final void run() {
      Process.setThreadPriority(this.a);
      super.run();
   }
}
