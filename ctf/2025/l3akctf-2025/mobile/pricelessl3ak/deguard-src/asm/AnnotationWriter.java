package asm;

import drupal.Context;
import java.util.concurrent.ThreadPoolExecutor;

public final class AnnotationWriter
  extends Context
{
  public AnnotationWriter(Context paramContext, ThreadPoolExecutor paramThreadPoolExecutor)
  {
    super();
    a = paramContext;
    e = paramThreadPoolExecutor;
  }
  
  public final void a(Label paramLabel)
  {
    ThreadPoolExecutor localThreadPoolExecutor = e;
    try
    {
      a.a(paramLabel);
      localThreadPoolExecutor.shutdown();
      return;
    }
    catch (Throwable paramLabel)
    {
      localThreadPoolExecutor.shutdown();
      throw paramLabel;
    }
  }
  
  public final void a(Throwable paramThrowable)
  {
    ThreadPoolExecutor localThreadPoolExecutor = e;
    try
    {
      a.a(paramThrowable);
      localThreadPoolExecutor.shutdown();
      return;
    }
    catch (Throwable paramThrowable)
    {
      localThreadPoolExecutor.shutdown();
      throw paramThrowable;
    }
  }
}
