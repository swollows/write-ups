package androidx.lifecycle;

import android.os.Looper;
import ec.h;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import params.Log;
import tree.DynamicTableModel.a;
import tree.Item;
import tree.Label;
import tree.Multimaps.MapMultimap.1.1;
import ua.b;

public final class f
  extends ClassWriter
{
  public c a;
  public Label b;
  public final b c;
  public boolean e;
  public final boolean f;
  public boolean i;
  public int j;
  public final WeakReference l;
  public final ArrayList m;
  
  public f(x paramX)
  {
    super();
    new AtomicReference(null);
    f = true;
    b = new Label();
    c localC = c.a;
    a = localC;
    m = new ArrayList();
    l = new WeakReference(paramX);
    c = new b(localC);
  }
  
  public final void a()
  {
    Object localObject1 = (x)l.get();
    if (localObject1 != null)
    {
      Object localObject4;
      Object localObject5;
      c localC;
      label333:
      do
      {
        localObject2 = b;
        if (a != 0)
        {
          localObject2 = i;
          Log.get(localObject2);
          localObject2 = a.a;
          localObject3 = b.k;
          Log.get(localObject3);
          localObject3 = a.a;
          if ((localObject2 != localObject3) || (a != localObject3)) {}
        }
        else
        {
          i = false;
          localObject1 = a;
          c.a(localObject1);
          return;
        }
        i = false;
        localObject2 = a;
        localObject3 = b.i;
        Log.get(localObject3);
        if (((Enum)localObject2).compareTo(a.a) < 0)
        {
          localObject3 = b;
          localObject2 = new Multimaps.MapMultimap.1.1(k, i, 1);
          c.put(localObject2, Boolean.FALSE);
          while ((((Multimaps.MapMultimap.1.1)localObject2).hasNext()) && (!i))
          {
            localObject4 = (Map.Entry)((Multimaps.MapMultimap.1.1)localObject2).next();
            Log.get(localObject4);
            localObject3 = (SupportMenuItem)((Map.Entry)localObject4).getKey();
            localObject4 = (d)((Map.Entry)localObject4).getValue();
            while ((a.compareTo(a) > 0) && (!i) && (b.b.containsKey(localObject3)))
            {
              localObject5 = Handle.Companion;
              localC = a;
              localObject5.getClass();
              localObject5 = ClassReader.a(localC);
              if (localObject5 == null) {
                break label333;
              }
              localC = ((Handle)localObject5).a();
              m.add(localC);
              ((d)localObject4).a((x)localObject1, (Handle)localObject5);
              localObject5 = m;
              ((ArrayList)localObject5).remove(((ArrayList)localObject5).size() - 1);
            }
            continue;
            localObject1 = new StringBuilder("no event down from ");
            ((StringBuilder)localObject1).append(a);
            throw new IllegalStateException(((StringBuilder)localObject1).toString());
          }
        }
        localObject2 = b.k;
      } while ((i) || (localObject2 == null) || (a.compareTo(a.a) <= 0));
      Object localObject3 = b;
      localObject3.getClass();
      Object localObject2 = new DynamicTableModel.a((Label)localObject3);
      c.put(localObject2, Boolean.FALSE);
      while ((((DynamicTableModel.a)localObject2).hasNext()) && (!i))
      {
        localObject4 = (Map.Entry)((DynamicTableModel.a)localObject2).next();
        localObject3 = (SupportMenuItem)((Map.Entry)localObject4).getKey();
        localObject4 = (d)((Map.Entry)localObject4).getValue();
        while ((a.compareTo(a) < 0) && (!i) && (b.b.containsKey(localObject3)))
        {
          localObject5 = a;
          m.add(localObject5);
          localObject5 = Handle.Companion;
          localC = a;
          localObject5.getClass();
          localObject5 = ClassReader.b(localC);
          if (localObject5 == null) {
            break label591;
          }
          ((d)localObject4).a((x)localObject1, (Handle)localObject5);
          localObject5 = m;
          ((ArrayList)localObject5).remove(((ArrayList)localObject5).size() - 1);
        }
      }
      label591:
      localObject1 = new StringBuilder("no event up from ");
      ((StringBuilder)localObject1).append(a);
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
  }
  
  public final void a(SupportMenuItem paramSupportMenuItem)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final void a(c paramC)
  {
    if (a == paramC) {
      return;
    }
    x localX = (x)l.get();
    Object localObject2 = a;
    Log.get(localObject2, "current");
    c localC = c.a;
    Object localObject1 = c.b;
    if ((localObject2 == localC) && (paramC == localObject1))
    {
      localObject1 = new StringBuilder("State must be at least '");
      ((StringBuilder)localObject1).append(c.c);
      ((StringBuilder)localObject1).append("' to be moved to '");
      ((StringBuilder)localObject1).append(paramC);
      ((StringBuilder)localObject1).append("' in component ");
      ((StringBuilder)localObject1).append(localX);
      throw new IllegalStateException(((StringBuilder)localObject1).toString().toString());
    }
    if ((localObject2 == localObject1) && (localObject2 != paramC))
    {
      localObject2 = new StringBuilder("State is '");
      ((StringBuilder)localObject2).append(localObject1);
      ((StringBuilder)localObject2).append("' and cannot be moved to `");
      ((StringBuilder)localObject2).append(paramC);
      ((StringBuilder)localObject2).append("` in component ");
      ((StringBuilder)localObject2).append(localX);
      throw new IllegalStateException(((StringBuilder)localObject2).toString().toString());
    }
    a = paramC;
    if ((!e) && (j == 0))
    {
      e = true;
      a();
      e = false;
      if (a == localObject1) {
        b = new Label();
      }
    }
    else
    {
      i = true;
    }
  }
  
  public final void a(String paramString)
  {
    Object localObject;
    if (f) {
      if (h.g != null) {
        localObject = h.g;
      }
    }
    try
    {
      if (h.g == null) {
        h.g = new h(0);
      }
      localObject = h.g;
      ((h)d).getClass();
      if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        return;
      }
      localObject = new StringBuilder("Method ");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(" must be called on the main thread");
      throw new IllegalStateException(((StringBuilder)localObject).toString().toString());
    }
    catch (Throwable paramString)
    {
      for (;;) {}
    }
    throw paramString;
  }
  
  public final void b(SupportMenuItem paramSupportMenuItem)
  {
    Log.get(paramSupportMenuItem, "observer");
    a("removeObserver");
    Label localLabel = b;
    Item localItem1 = (Item)b.get(paramSupportMenuItem);
    if (localItem1 != null)
    {
      a -= 1;
      Object localObject = c;
      if (!((WeakHashMap)localObject).isEmpty())
      {
        localObject = ((WeakHashMap)localObject).keySet().iterator();
        while (((Iterator)localObject).hasNext()) {
          ((tree.Object)((Iterator)localObject).next()).next(localItem1);
        }
      }
      localObject = k;
      if (localObject != null) {
        i = i;
      } else {
        i = i;
      }
      Item localItem2 = i;
      if (localItem2 != null) {
        k = ((Item)localObject);
      } else {
        k = ((Item)localObject);
      }
      i = null;
      k = null;
    }
    b.remove(paramSupportMenuItem);
  }
  
  public final c c(SupportMenuItem paramSupportMenuItem)
  {
    Object localObject = b.b;
    boolean bool = ((HashMap)localObject).containsKey(paramSupportMenuItem);
    c localC = null;
    if (bool) {
      paramSupportMenuItem = getk;
    } else {
      paramSupportMenuItem = null;
    }
    if (paramSupportMenuItem != null) {
      paramSupportMenuItem = a.a;
    } else {
      paramSupportMenuItem = null;
    }
    localObject = m;
    if (!((ArrayList)localObject).isEmpty()) {
      localC = (c)((ArrayList)localObject).get(((ArrayList)localObject).size() - 1);
    }
    localObject = a;
    Log.get(localObject, "state1");
    if ((paramSupportMenuItem == null) || (paramSupportMenuItem.compareTo((Enum)localObject) >= 0)) {
      paramSupportMenuItem = (SupportMenuItem)localObject;
    }
    if ((localC != null) && (localC.compareTo(paramSupportMenuItem) < 0)) {
      return localC;
    }
    return paramSupportMenuItem;
  }
  
  public final void d(Handle paramHandle)
  {
    Log.get(paramHandle, "event");
    a("handleLifecycleEvent");
    a(paramHandle.a());
  }
}
