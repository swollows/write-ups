package androidx.appcompat.app;

import java.util.concurrent.Executor;

public final class ScheduledExecutorService
  implements Executor
{
  public final void execute(Runnable paramRunnable)
  {
    new Thread(paramRunnable).start();
  }
}
