package tree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public final class Label
  implements Iterable
{
  public int a = 0;
  public final HashMap b = new HashMap();
  public final WeakHashMap c = new WeakHashMap();
  public Item i;
  public Item k;
  
  public Label() {}
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof Label)) {
      return false;
    }
    Object localObject1 = (Label)paramObject;
    if (a != a) {
      return false;
    }
    paramObject = iterator();
    localObject1 = ((Label)localObject1).iterator();
    Object localObject3;
    Object localObject2;
    do
    {
      localObject3 = (Multimaps.MapMultimap.1.1)paramObject;
      if (!((Multimaps.MapMultimap.1.1)localObject3).hasNext()) {
        break;
      }
      localObject2 = (Multimaps.MapMultimap.1.1)localObject1;
      if (!((Multimaps.MapMultimap.1.1)localObject2).hasNext()) {
        break;
      }
      localObject3 = (Map.Entry)((Multimaps.MapMultimap.1.1)localObject3).next();
      localObject2 = ((Multimaps.MapMultimap.1.1)localObject2).next();
      if ((localObject3 == null) && (localObject2 != null)) {
        break label132;
      }
    } while ((localObject3 == null) || (((Map.Entry)localObject3).equals(localObject2)));
    return false;
    return (!((Multimaps.MapMultimap.1.1)localObject3).hasNext()) && (!((Multimaps.MapMultimap.1.1)localObject1).hasNext());
  }
  
  public final int hashCode()
  {
    Iterator localIterator = iterator();
    int j = 0;
    for (;;)
    {
      Multimaps.MapMultimap.1.1 local1 = (Multimaps.MapMultimap.1.1)localIterator;
      if (!local1.hasNext()) {
        break;
      }
      j += ((Map.Entry)local1.next()).hashCode();
    }
    return j;
  }
  
  public final Iterator iterator()
  {
    Multimaps.MapMultimap.1.1 local1 = new Multimaps.MapMultimap.1.1(i, k, 0);
    c.put(local1, Boolean.FALSE);
    return local1;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("[");
    Iterator localIterator = iterator();
    for (;;)
    {
      Multimaps.MapMultimap.1.1 local1 = (Multimaps.MapMultimap.1.1)localIterator;
      if (!local1.hasNext()) {
        break;
      }
      localStringBuilder.append(((Map.Entry)local1.next()).toString());
      if (local1.hasNext()) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}
