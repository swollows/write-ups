package androidx.lifecycle;

import app.Element;
import cryptopro.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public abstract class Label
{
  public final a c = new a();
  
  public Label() {}
  
  public final void a()
  {
    a localA = c;
    Element localElement;
    if ((localA != null) && (!e))
    {
      e = true;
      localElement = b;
    }
    try
    {
      Iterator localIterator = l.values().iterator();
      while (localIterator.hasNext()) {
        a.read((AutoCloseable)localIterator.next());
      }
      localIterator = m.iterator();
      while (localIterator.hasNext()) {
        a.read((AutoCloseable)localIterator.next());
      }
      m.clear();
    }
    catch (Throwable localThrowable)
    {
      for (;;) {}
    }
    throw localA;
    d();
  }
  
  public void d() {}
}
