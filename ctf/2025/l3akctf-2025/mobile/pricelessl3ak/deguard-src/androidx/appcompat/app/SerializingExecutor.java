package androidx.appcompat.app;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class SerializingExecutor
  implements Executor
{
  public final ScheduledExecutorService executor;
  public final Object internalLock = new Object();
  public Runnable isThreadScheduled;
  public final ArrayDeque waitQueue = new ArrayDeque();
  
  public SerializingExecutor(ScheduledExecutorService paramScheduledExecutorService)
  {
    executor = paramScheduledExecutorService;
  }
  
  public final void execute()
  {
    Object localObject = internalLock;
    try
    {
      localRunnable = (Runnable)waitQueue.poll();
      isThreadScheduled = localRunnable;
      if (localRunnable != null) {
        executor.execute(localRunnable);
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      Runnable localRunnable;
      for (;;) {}
    }
    throw localRunnable;
  }
  
  public final void execute(Runnable paramRunnable)
  {
    Object localObject = internalLock;
    try
    {
      waitQueue.add(new Type(this, paramRunnable, 0));
      if (isThreadScheduled == null) {
        execute();
      }
      return;
    }
    catch (Throwable paramRunnable)
    {
      for (;;) {}
    }
    throw paramRunnable;
  }
}
