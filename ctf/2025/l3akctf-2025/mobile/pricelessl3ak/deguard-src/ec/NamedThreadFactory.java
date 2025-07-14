package ec;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class NamedThreadFactory
  implements ThreadFactory
{
  public final AtomicInteger threadNumber = new AtomicInteger(0);
  
  public NamedThreadFactory() {}
  
  public final Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = new Thread(paramRunnable);
    StringBuilder localStringBuilder = new StringBuilder("arch_disk_io_");
    localStringBuilder.append(threadNumber.getAndIncrement());
    paramRunnable.setName(localStringBuilder.toString());
    return paramRunnable;
  }
}
