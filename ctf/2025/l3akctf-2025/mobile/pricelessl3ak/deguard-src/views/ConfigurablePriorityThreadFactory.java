package views;

import java.util.concurrent.ThreadFactory;

public final class ConfigurablePriorityThreadFactory
  implements ThreadFactory
{
  public final Thread newThread(Runnable paramRunnable)
  {
    return new PriorityThreadFactory.1(paramRunnable);
  }
}
