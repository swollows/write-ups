package androidx.fragment.asm;

import core.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class ClassWriter
{
  public final HashMap a = new HashMap();
  public final HashMap b = new HashMap();
  public final ArrayList c = new ArrayList();
  public Type r;
  
  public ClassWriter() {}
  
  public final void a()
  {
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext()) {
      File.write(localIterator.next());
    }
  }
  
  public final ArrayList b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext()) {
      File.write(localIterator.next());
    }
    return localArrayList;
  }
  
  public final List get()
  {
    if (c.isEmpty()) {
      return Collections.emptyList();
    }
    ArrayList localArrayList1 = c;
    try
    {
      ArrayList localArrayList2 = new ArrayList(c);
      return localArrayList2;
    }
    catch (Throwable localThrowable)
    {
      throw localThrowable;
    }
  }
}
