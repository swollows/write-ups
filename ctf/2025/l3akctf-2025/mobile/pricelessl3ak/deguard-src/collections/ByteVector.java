package collections;

import drupal.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import params.Log;
import widgets.Pair;

public abstract class ByteVector
  extends Context
{
  public static int capacity(int paramInt)
  {
    if (paramInt < 0) {
      return paramInt;
    }
    if (paramInt < 3) {
      return paramInt + 1;
    }
    if (paramInt < 1073741824) {
      return (int)(paramInt / 0.75F + 1.0F);
    }
    return Integer.MAX_VALUE;
  }
  
  public static Map read(ArrayList paramArrayList)
  {
    Object localObject = EmptyMap.c;
    int i = paramArrayList.size();
    if (i != 0)
    {
      if (i != 1)
      {
        localObject = new LinkedHashMap(capacity(paramArrayList.size()));
        paramArrayList = paramArrayList.iterator();
        while (paramArrayList.hasNext())
        {
          Pair localPair = (Pair)paramArrayList.next();
          ((Map)localObject).put(name, key);
        }
      }
      paramArrayList = (Pair)paramArrayList.get(0);
      Log.get(paramArrayList, "pair");
      paramArrayList = Collections.singletonMap(name, key);
      Log.append(paramArrayList, "singletonMap(...)");
      return paramArrayList;
    }
    return localObject;
    return localObject;
  }
  
  public static final Map write(LinkedHashMap paramLinkedHashMap)
  {
    Log.get(paramLinkedHashMap, "<this>");
    paramLinkedHashMap = (Map.Entry)paramLinkedHashMap.entrySet().iterator().next();
    paramLinkedHashMap = Collections.singletonMap(paramLinkedHashMap.getKey(), paramLinkedHashMap.getValue());
    Log.append(paramLinkedHashMap, "with(...)");
    return paramLinkedHashMap;
  }
}
