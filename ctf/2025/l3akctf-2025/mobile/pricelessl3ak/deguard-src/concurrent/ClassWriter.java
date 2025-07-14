package concurrent;

import java.util.concurrent.CancellationException;

public final class ClassWriter
{
  public static final ClassWriter a = new ClassWriter(false, null);
  public static final ClassWriter b = new ClassWriter(true, null);
  public final CancellationException thrown;
  
  static
  {
    if (AbstractFuture.GENERATE_CANCELLATION_CAUSES)
    {
      a = null;
      b = null;
      return;
    }
  }
  
  public ClassWriter(boolean paramBoolean, CancellationException paramCancellationException)
  {
    thrown = paramCancellationException;
  }
}
