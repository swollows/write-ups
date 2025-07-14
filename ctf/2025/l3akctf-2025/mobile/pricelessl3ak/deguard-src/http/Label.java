package http;

import app.Element;
import app.f;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import params.Log;

public class Label
{
  public final Element a;
  public int b;
  public int c;
  public final int d;
  public int g;
  public final f p;
  
  public Label(int paramInt)
  {
    d = paramInt;
    if (paramInt > 0)
    {
      p = new f(17);
      a = new Element(20);
      return;
    }
    throw new IllegalArgumentException("maxSize <= 0");
  }
  
  public final Object add(Object paramObject)
  {
    Log.get(paramObject, "key");
    Element localElement = a;
    try
    {
      f localF = p;
      localF.getClass();
      paramObject = ((LinkedHashMap)a).get(paramObject);
      if (paramObject != null)
      {
        g += 1;
        return paramObject;
      }
    }
    catch (Throwable paramObject)
    {
      break label71;
      b += 1;
      return null;
      label71:
      throw paramObject;
    }
  }
  
  public final Object add(Object paramObject1, Object paramObject2)
  {
    Log.get(paramObject1, "key");
    Element localElement = a;
    Object localObject;
    try
    {
      c += 1;
      localObject = p;
      localObject.getClass();
      paramObject2 = ((LinkedHashMap)a).put(paramObject1, paramObject2);
      if (paramObject2 != null) {
        c -= 1;
      }
    }
    catch (Throwable paramObject1)
    {
      break label358;
    }
    int i = d;
    for (;;)
    {
      localElement = a;
      try
      {
        if (c >= 0)
        {
          if (((LinkedHashMap)p.a).isEmpty()) {
            if (c != 0) {
              break label343;
            }
          }
          if ((c > i) && (!((LinkedHashMap)p.a).isEmpty()))
          {
            localObject = ((LinkedHashMap)p.a).entrySet();
            Log.append(localObject, "map.entries");
            boolean bool = localObject instanceof List;
            paramObject1 = null;
            if (bool)
            {
              localObject = (List)localObject;
              if (!((List)localObject).isEmpty()) {
                paramObject1 = ((List)localObject).get(0);
              }
            }
            else
            {
              localObject = ((Iterable)localObject).iterator();
              if (((Iterator)localObject).hasNext()) {
                paramObject1 = ((Iterator)localObject).next();
              }
            }
            localObject = (Map.Entry)paramObject1;
            if (localObject == null) {
              return paramObject2;
            }
            paramObject1 = ((Map.Entry)localObject).getKey();
            localObject = ((Map.Entry)localObject).getValue();
            f localF = p;
            localF.getClass();
            Log.get(paramObject1, "key");
            ((LinkedHashMap)a).remove(paramObject1);
            int j = c;
            Log.get(localObject, "value");
            c = (j - 1);
            continue;
          }
          return paramObject2;
        }
        label343:
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
      }
      catch (Throwable paramObject1)
      {
        label358:
        for (;;) {}
      }
    }
    throw paramObject1;
    throw paramObject1;
  }
  
  public final String toString()
  {
    Element localElement = a;
    try
    {
      i = g;
      int j = b + i;
      if (j == 0) {
        break label135;
      }
      i = i * 100 / j;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        Object localObject;
        continue;
        int i = 0;
      }
    }
    localObject = new StringBuilder("LruCache[maxSize=");
    ((StringBuilder)localObject).append(d);
    ((StringBuilder)localObject).append(",hits=");
    ((StringBuilder)localObject).append(g);
    ((StringBuilder)localObject).append(",misses=");
    ((StringBuilder)localObject).append(b);
    ((StringBuilder)localObject).append(",hitRate=");
    ((StringBuilder)localObject).append(i);
    ((StringBuilder)localObject).append("%]");
    localObject = ((StringBuilder)localObject).toString();
    return localObject;
    throw ((Throwable)localObject);
  }
}
