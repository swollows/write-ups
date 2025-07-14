package androidx.lifecycle;

import params.Log;

public final class ClassReader
{
  public static Handle a(c paramC)
  {
    Log.get(paramC, "state");
    int i = paramC.ordinal();
    if (i != 2)
    {
      if (i != 3)
      {
        if (i != 4) {
          return null;
        }
        return Handle.ON_PAUSE;
      }
      return Handle.ON_STOP;
    }
    return Handle.ON_DESTROY;
  }
  
  public static Handle b(c paramC)
  {
    Log.get(paramC, "state");
    int i = paramC.ordinal();
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3) {
          return null;
        }
        return Handle.ON_RESUME;
      }
      return Handle.ON_START;
    }
    return Handle.ON_CREATE;
  }
}
