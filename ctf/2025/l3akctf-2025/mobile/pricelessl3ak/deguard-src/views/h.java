package views;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class h
  implements Callable
{
  public final Object call()
  {
    switch (t)
    {
    default: 
      break;
    }
    try
    {
      localObject1 = ClassWriter.a(s, i, (List)e, w);
      return localObject1;
    }
    catch (Throwable localThrowable)
    {
      Object localObject1;
      Object localObject2;
      for (;;) {}
    }
    return new Type(-3);
    localObject2 = (Context)e;
    localObject1 = new ArrayList(1);
    localObject2 = new Object[] { localObject2 }[0];
    Objects.requireNonNull(localObject2);
    ((ArrayList)localObject1).add(localObject2);
    localObject1 = Collections.unmodifiableList((List)localObject1);
    return ClassWriter.a(s, i, (List)localObject1, w);
  }
}
