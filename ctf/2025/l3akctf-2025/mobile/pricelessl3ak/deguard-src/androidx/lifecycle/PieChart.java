package androidx.lifecycle;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class PieChart
{
  public final LinkedHashMap m = new LinkedHashMap();
  
  public PieChart() {}
  
  public final void a()
  {
    LinkedHashMap localLinkedHashMap = m;
    Iterator localIterator = localLinkedHashMap.values().iterator();
    while (localIterator.hasNext()) {
      ((Label)localIterator.next()).a();
    }
    localLinkedHashMap.clear();
  }
}
