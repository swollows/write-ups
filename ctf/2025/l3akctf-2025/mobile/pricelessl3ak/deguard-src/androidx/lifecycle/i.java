package androidx.lifecycle;

import params.Log;
import smb.b;
import tts.h;

public final class i
  implements MenuItem, AutoCloseable
{
  public final m a;
  public final String c;
  public boolean e;
  
  public i(String paramString, m paramM)
  {
    c = paramString;
    a = paramM;
  }
  
  public final void a(x paramX, Handle paramHandle)
  {
    if (paramHandle == Handle.ON_DESTROY)
    {
      e = false;
      paramX.getLifecycle().b(this);
    }
  }
  
  public final void a(h paramH, ClassWriter paramClassWriter)
  {
    Log.get(paramH, "registry");
    Log.get(paramClassWriter, "lifecycle");
    if (!e)
    {
      e = true;
      paramClassWriter.a(this);
      paramClassWriter = a.c.k;
      paramH.a(c, paramClassWriter);
      return;
    }
    throw new IllegalStateException("Already attached to lifecycleOwner");
  }
  
  public final void close() {}
}
