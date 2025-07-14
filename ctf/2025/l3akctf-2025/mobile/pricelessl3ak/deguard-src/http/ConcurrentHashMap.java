package http;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import params.Log;

public final class ConcurrentHashMap
  extends AbstractMultimap
  implements Map
{
  public LinkedTreeMap.EntrySet entrySet;
  public MapCollections.KeySet keySet;
  public MapCollections.ValuesCollection values;
  
  public final Set entrySet()
  {
    LinkedTreeMap.EntrySet localEntrySet2 = entrySet;
    LinkedTreeMap.EntrySet localEntrySet1 = localEntrySet2;
    if (localEntrySet2 == null)
    {
      localEntrySet1 = new LinkedTreeMap.EntrySet(this);
      entrySet = localEntrySet1;
    }
    return localEntrySet1;
  }
  
  public final boolean get(Collection paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (!super.containsKey(paramCollection.next())) {
        return false;
      }
    }
    return true;
  }
  
  public final Set keySet()
  {
    MapCollections.KeySet localKeySet2 = keySet;
    MapCollections.KeySet localKeySet1 = localKeySet2;
    if (localKeySet2 == null)
    {
      localKeySet1 = new MapCollections.KeySet(this);
      keySet = localKeySet1;
    }
    return localKeySet1;
  }
  
  public final void putAll(Map paramMap)
  {
    int i = size;
    i = paramMap.size() + i;
    int j = size;
    Object localObject = data;
    if (localObject.length < i)
    {
      localObject = Arrays.copyOf((int[])localObject, i);
      Log.append(localObject, "copyOf(this, newSize)");
      data = ((int[])localObject);
      localObject = Arrays.copyOf(value, i * 2);
      Log.append(localObject, "copyOf(this, newSize)");
      value = ((Object[])localObject);
    }
    if (size == j)
    {
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        localObject = (Map.Entry)paramMap.next();
        put(((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue());
      }
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public final boolean remove(Collection paramCollection)
  {
    int i = size;
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      super.remove(paramCollection.next());
    }
    return i != size;
  }
  
  public final Collection values()
  {
    MapCollections.ValuesCollection localValuesCollection2 = values;
    MapCollections.ValuesCollection localValuesCollection1 = localValuesCollection2;
    if (localValuesCollection2 == null)
    {
      localValuesCollection1 = new MapCollections.ValuesCollection(this);
      values = localValuesCollection1;
    }
    return localValuesCollection1;
  }
}
