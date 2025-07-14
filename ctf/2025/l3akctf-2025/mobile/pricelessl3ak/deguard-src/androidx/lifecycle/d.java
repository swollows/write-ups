package androidx.lifecycle;

import params.Log;

public final class d
{
  public c a;
  public MenuItem b;
  
  public final void a(x paramX, Handle paramHandle)
  {
    c localC2 = paramHandle.a();
    c localC3 = a;
    Log.get(localC3, "state1");
    c localC1 = localC3;
    if (localC2.compareTo(localC3) < 0) {
      localC1 = localC2;
    }
    a = localC1;
    b.a(paramX, paramHandle);
    a = localC2;
  }
}
