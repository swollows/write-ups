package ui;

import androidx.fragment.asm.Label;
import androidx.lifecycle.ClassWriter;
import androidx.lifecycle.Handle;
import androidx.lifecycle.MenuItem;
import androidx.lifecycle.x;
import collections.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import params.Log;

public final class h
  implements MenuItem, Request
{
  public final Label a;
  public final ClassWriter b;
  public Call c;
  
  public h(i paramI, ClassWriter paramClassWriter, Label paramLabel)
  {
    Log.get(paramClassWriter, "lifecycle");
    Log.get(paramLabel, "onBackPressedCallback");
    l = paramI;
    b = paramClassWriter;
    a = paramLabel;
    paramClassWriter.a(this);
  }
  
  public final void a(x paramX, Handle paramHandle)
  {
    if (paramHandle == Handle.ON_START)
    {
      paramX = l;
      paramHandle = a;
      Log.get(paramHandle, "onBackPressedCallback");
      a.addLast(paramHandle);
      Call localCall = new Call(paramX, paramHandle);
      a.add(localCall);
      paramX.b();
      c = new Type(1, paramX);
      c = localCall;
      return;
    }
    if (paramHandle == Handle.ON_STOP)
    {
      paramX = c;
      if (paramX != null) {
        paramX.cancel();
      }
    }
    else if (paramHandle == Handle.ON_DESTROY)
    {
      cancel();
    }
  }
  
  public final void cancel()
  {
    b.b(this);
    a.a.remove(this);
    Call localCall = c;
    if (localCall != null) {
      localCall.cancel();
    }
    c = null;
  }
}
