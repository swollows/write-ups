package app;

import androidx.fragment.asm.h;
import androidx.fragment.asm.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class b
{
  public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
  public final HashMap c = new HashMap();
  public final Runnable r;
  
  public b(Runnable paramRunnable)
  {
    r = paramRunnable;
  }
  
  public final void a()
  {
    Object localObject;
    do
    {
      Iterator localIterator = a.iterator();
      while (!((Iterator)localObject).hasNext())
      {
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
          localObject = nexta;
        } while (x < 1);
        localObject = a.get().iterator();
      }
    } while (((Iterator)localObject).next() == null);
    throw new ClassCastException();
  }
  
  public final void a(e paramE)
  {
    a.remove(paramE);
    paramE = (c)c.remove(paramE);
    if (paramE != null)
    {
      a.b(b);
      b = null;
    }
    r.run();
  }
  
  public final void b()
  {
    Object localObject;
    do
    {
      Iterator localIterator = a.iterator();
      while (!((Iterator)localObject).hasNext())
      {
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
          localObject = nexta;
        } while (x < 1);
        localObject = a.get().iterator();
      }
    } while (((Iterator)localObject).next() == null);
    throw new ClassCastException();
  }
  
  public final void c()
  {
    Object localObject;
    do
    {
      Iterator localIterator = a.iterator();
      while (!((Iterator)localObject).hasNext())
      {
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
          localObject = nexta;
        } while (x < 1);
        localObject = a.get().iterator();
      }
    } while (((Iterator)localObject).next() == null);
    throw new ClassCastException();
  }
}
