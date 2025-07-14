package androidx.lifecycle;

import android.os.Handler;
import asm.Type;
import params.Log;

public final class Plot
  implements x
{
  public static final Plot r = new Plot();
  public final g a = new g(this);
  public final Type b = new Type(1, this);
  public boolean c = true;
  public Handler h;
  public int l;
  public final f o = new f(this);
  public int p;
  public boolean s = true;
  
  public Plot() {}
  
  public final void a()
  {
    int i = l + 1;
    l = i;
    if (i == 1)
    {
      if (c)
      {
        o.d(Handle.ON_RESUME);
        c = false;
        return;
      }
      Handler localHandler = h;
      Log.get(localHandler);
      localHandler.removeCallbacks(b);
    }
  }
  
  public final ClassWriter getLifecycle()
  {
    return o;
  }
}
