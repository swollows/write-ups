package androidx.lifecycle;

import java.util.HashMap;

public final class h
  implements MenuItem
{
  public final Object k;
  
  public final void a(x paramX, Handle paramHandle)
  {
    switch (j)
    {
    default: 
      if (paramHandle == Handle.ON_CREATE)
      {
        paramX.getLifecycle().b(this);
        ((b)k).c();
        return;
      }
      paramX = new StringBuilder("Next event must be ON_CREATE, it was ");
      paramX.append(paramHandle);
      throw new IllegalStateException(paramX.toString().toString());
    }
    new HashMap();
    paramX = (Func1[])k;
    if (paramX.length <= 0)
    {
      if (paramX.length <= 0) {
        return;
      }
      paramX = paramX[0];
      throw new NullPointerException("Null throw statement replaced by Soot");
    }
    paramX = paramX[0];
    throw new NullPointerException("Null throw statement replaced by Soot");
  }
}
