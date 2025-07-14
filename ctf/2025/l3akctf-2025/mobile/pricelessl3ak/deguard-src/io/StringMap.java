package io;

import app.Attribute;
import drupal.Context;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import params.Log;
import ssh.F;

public final class StringMap
  implements Map, Serializable, F
{
  public static final StringMap t;
  public int count;
  public int data;
  public Sets.SetFromMap entrySet;
  public Object[] key;
  public Sets.SetFromMap keySet;
  public int[] length;
  public int modCount;
  public int[] next;
  public boolean s;
  public int size;
  public int threshold;
  public Object[] value;
  public MapCollections.ValuesCollection values;
  
  static
  {
    StringMap localStringMap = new StringMap(0);
    s = true;
    t = localStringMap;
  }
  
  public StringMap(int paramInt) {}
  
  public final int add(Object paramObject)
  {
    get();
    int i = getKey(paramObject);
    int k = size * 2;
    int m = next.length / 2;
    int j = k;
    if (k > m) {
      j = m;
    }
    k = 0;
    for (;;)
    {
      int[] arrayOfInt = next;
      m = arrayOfInt[i];
      if (m <= 0)
      {
        j = data;
        Object[] arrayOfObject = key;
        if (j >= arrayOfObject.length)
        {
          add(1);
          break;
        }
        m = j + 1;
        data = m;
        arrayOfObject[j] = paramObject;
        length[j] = i;
        arrayOfInt[i] = m;
        count += 1;
        modCount += 1;
        if (k <= size) {
          return j;
        }
        size = k;
        return j;
      }
      if (Log.equals(key[(m - 1)], paramObject)) {
        return -m;
      }
      k += 1;
      if (k > j)
      {
        put(next.length * 2);
        break;
      }
      if (i == 0) {
        i = next.length - 1;
      } else {
        i -= 1;
      }
    }
    return j;
  }
  
  public final void add(int paramInt)
  {
    Object localObject = key;
    int j = localObject.length;
    int i = data;
    int k = j - i;
    int m = i - count;
    j = 1;
    if ((k < paramInt) && (k + m >= paramInt) && (m >= localObject.length / 4))
    {
      add(true);
      return;
    }
    k = i + paramInt;
    if (k >= 0)
    {
      if (k > localObject.length)
      {
        paramInt = localObject.length;
        paramInt += (paramInt >> 1);
        i = paramInt;
        if (paramInt - k < 0) {
          i = k;
        }
        paramInt = i;
        if (i - 2147483639 > 0) {
          if (k > 2147483639) {
            paramInt = Integer.MAX_VALUE;
          } else {
            paramInt = 2147483639;
          }
        }
        localObject = Arrays.copyOf((Object[])localObject, paramInt);
        Log.append(localObject, "copyOf(...)");
        key = ((Object[])localObject);
        localObject = value;
        if (localObject != null)
        {
          Object[] arrayOfObject = Arrays.copyOf((Object[])localObject, paramInt);
          localObject = arrayOfObject;
          Log.append(arrayOfObject, "copyOf(...)");
        }
        else
        {
          localObject = null;
        }
        value = ((Object[])localObject);
        localObject = Arrays.copyOf(length, paramInt);
        Log.append(localObject, "copyOf(...)");
        length = ((int[])localObject);
        if (paramInt < 1) {
          paramInt = j;
        }
        paramInt = Integer.highestOneBit(paramInt * 3);
        if (paramInt > next.length) {
          put(paramInt);
        }
      }
    }
    else {
      throw new OutOfMemoryError();
    }
  }
  
  public final void add(boolean paramBoolean)
  {
    Object[] arrayOfObject1 = value;
    int i = 0;
    int k;
    for (int j = 0;; j = k)
    {
      k = data;
      if (i >= k) {
        break;
      }
      int[] arrayOfInt = length;
      int m = arrayOfInt[i];
      k = j;
      if (m >= 0)
      {
        Object[] arrayOfObject2 = key;
        arrayOfObject2[j] = arrayOfObject2[i];
        if (arrayOfObject1 != null) {
          arrayOfObject1[j] = arrayOfObject1[i];
        }
        if (paramBoolean)
        {
          arrayOfInt[j] = m;
          next[m] = (j + 1);
        }
        k = j + 1;
      }
      i += 1;
    }
    Context.scan(key, j, k);
    if (arrayOfObject1 != null) {
      Context.scan(arrayOfObject1, j, data);
    }
    data = j;
  }
  
  public final void clear()
  {
    get();
    int j = data - 1;
    if (j >= 0)
    {
      int i = 0;
      for (;;)
      {
        localObject = length;
        int k = localObject[i];
        if (k >= 0)
        {
          next[k] = 0;
          localObject[i] = -1;
        }
        if (i == j) {
          break;
        }
        i += 1;
      }
    }
    Context.scan(key, 0, data);
    Object localObject = value;
    if (localObject != null) {
      Context.scan((Object[])localObject, 0, data);
    }
    count = 0;
    data = 0;
    modCount += 1;
  }
  
  public final boolean containsKey(Object paramObject)
  {
    return toString(paramObject) >= 0;
  }
  
  public final boolean containsValue(Object paramObject)
  {
    return indexOf(paramObject) >= 0;
  }
  
  public final Set entrySet()
  {
    Sets.SetFromMap localSetFromMap2 = entrySet;
    Sets.SetFromMap localSetFromMap1 = localSetFromMap2;
    if (localSetFromMap2 == null)
    {
      localSetFromMap1 = new Sets.SetFromMap(this, 0);
      entrySet = localSetFromMap1;
    }
    return localSetFromMap1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject != this) {
      if ((paramObject instanceof Map))
      {
        paramObject = (Map)paramObject;
        if ((count == paramObject.size()) && (get(paramObject.entrySet()))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public final Object get(Object paramObject)
  {
    int i = toString(paramObject);
    if (i < 0) {
      return null;
    }
    paramObject = value;
    Log.get(paramObject);
    return paramObject[i];
  }
  
  public final void get()
  {
    if (!s) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void get(int paramInt)
  {
    Object localObject = key;
    Log.get(localObject, "<this>");
    localObject[paramInt] = null;
    localObject = value;
    if (localObject != null) {
      localObject[paramInt] = null;
    }
    int n = length[paramInt];
    int j = size * 2;
    int k = next.length / 2;
    int i = j;
    if (j > k) {
      i = k;
    }
    j = 0;
    int m = n;
    k = i;
    i = n;
    int i1;
    do
    {
      if (i == 0) {
        i = next.length - 1;
      } else {
        i -= 1;
      }
      i1 = j + 1;
      if (i1 > size)
      {
        next[m] = 0;
        break;
      }
      localObject = next;
      int i2 = localObject[i];
      if (i2 == 0)
      {
        localObject[m] = 0;
        break;
      }
      if (i2 < 0) {
        localObject[m] = -1;
      }
      for (;;)
      {
        n = i;
        j = 0;
        break;
        localObject = key;
        int i3 = i2 - 1;
        int i4 = getKey(localObject[i3]);
        localObject = next;
        j = i1;
        n = m;
        if ((i4 - i & localObject.length - 1) < i1) {
          break;
        }
        localObject[m] = i2;
        length[i3] = m;
      }
      i1 = k - 1;
      k = i1;
      m = n;
    } while (i1 >= 0);
    next[n] = -1;
    length[paramInt] = -1;
    count -= 1;
    modCount += 1;
  }
  
  public final boolean get(Collection paramCollection)
  {
    Log.get(paramCollection, "m");
    paramCollection = paramCollection.iterator();
    for (;;)
    {
      Object localObject;
      if (paramCollection.hasNext())
      {
        localObject = paramCollection.next();
        if (localObject == null) {
          break;
        }
      }
      else
      {
        try
        {
          boolean bool = get((Map.Entry)localObject);
          if (!bool) {
            return false;
          }
        }
        catch (ClassCastException paramCollection) {}
      }
    }
    return true;
    return false;
  }
  
  public final boolean get(Map.Entry paramEntry)
  {
    Log.get(paramEntry, "entry");
    int i = toString(paramEntry.getKey());
    if (i < 0) {
      return false;
    }
    Object[] arrayOfObject = value;
    Log.get(arrayOfObject);
    return Log.equals(arrayOfObject[i], paramEntry.getValue());
  }
  
  public final int getKey(Object paramObject)
  {
    int i;
    if (paramObject != null) {
      i = paramObject.hashCode();
    } else {
      i = 0;
    }
    return i * -1640531527 >>> threshold;
  }
  
  public final int hashCode()
  {
    TIntDoubleMapDecorator.1.1 local1 = new TIntDoubleMapDecorator.1.1(this, 0);
    int i = 0;
    while (local1.hasNext())
    {
      int j = data;
      Object localObject1 = (StringMap)value;
      if (j < data)
      {
        data = (j + 1);
        size = j;
        Object localObject2 = key[j];
        if (localObject2 != null) {
          j = localObject2.hashCode();
        } else {
          j = 0;
        }
        localObject1 = value;
        Log.get(localObject1);
        localObject1 = localObject1[size];
        int k;
        if (localObject1 != null) {
          k = localObject1.hashCode();
        } else {
          k = 0;
        }
        local1.read();
        i += (j ^ k);
      }
      else
      {
        throw new NoSuchElementException();
      }
    }
    return i;
  }
  
  public final int indexOf(Object paramObject)
  {
    int i = data;
    int j;
    Object[] arrayOfObject;
    do
    {
      do
      {
        j = i - 1;
        if (j < 0) {
          break;
        }
        i = j;
      } while (length[j] < 0);
      arrayOfObject = value;
      Log.get(arrayOfObject);
      i = j;
    } while (!Log.equals(arrayOfObject[j], paramObject));
    return j;
    return -1;
  }
  
  public final boolean isEmpty()
  {
    return count == 0;
  }
  
  public final Set keySet()
  {
    Sets.SetFromMap localSetFromMap2 = keySet;
    Sets.SetFromMap localSetFromMap1 = localSetFromMap2;
    if (localSetFromMap2 == null)
    {
      localSetFromMap1 = new Sets.SetFromMap(this, 1);
      keySet = localSetFromMap1;
    }
    return localSetFromMap1;
  }
  
  public final Object put(Object paramObject1, Object paramObject2)
  {
    get();
    int i = add(paramObject1);
    paramObject1 = value;
    if (paramObject1 == null)
    {
      int j = key.length;
      if (j >= 0)
      {
        paramObject1 = new Object[j];
        value = paramObject1;
      }
    }
    else
    {
      if (i < 0)
      {
        i = -i - 1;
        Object localObject = paramObject1[i];
        paramObject1[i] = paramObject2;
        return localObject;
      }
      paramObject1[i] = paramObject2;
      return null;
    }
    throw new IllegalArgumentException("capacity must be non-negative.");
  }
  
  public final void put(int paramInt)
  {
    modCount += 1;
    int j = data;
    int k = count;
    int i = 0;
    if (j > k) {
      add(false);
    }
    next = new int[paramInt];
    threshold = (Integer.numberOfLeadingZeros(paramInt) + 1);
    if (i < data)
    {
      k = i + 1;
      paramInt = getKey(key[i]);
      j = size;
      for (;;)
      {
        int[] arrayOfInt = next;
        if (arrayOfInt[paramInt] == 0)
        {
          arrayOfInt[paramInt] = k;
          length[i] = paramInt;
          i = k;
          break;
        }
        j -= 1;
        if (j < 0) {
          break label140;
        }
        if (paramInt == 0) {
          paramInt = arrayOfInt.length - 1;
        } else {
          paramInt -= 1;
        }
      }
      label140:
      throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
    }
  }
  
  public final void putAll(Map paramMap)
  {
    Log.get(paramMap, "from");
    get();
    paramMap = paramMap.entrySet();
    if (paramMap.isEmpty()) {
      return;
    }
    add(paramMap.size());
    Iterator localIterator = paramMap.iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      int i = add(localEntry.getKey());
      paramMap = value;
      if (paramMap == null)
      {
        int j = key.length;
        if (j >= 0)
        {
          paramMap = new Object[j];
          value = paramMap;
        }
      }
      else
      {
        if (i >= 0)
        {
          paramMap[i] = localEntry.getValue();
          continue;
        }
        i = -i - 1;
        Object localObject = paramMap[i];
        if (Log.equals(localEntry.getValue(), localObject)) {
          continue;
        }
        paramMap[i] = localEntry.getValue();
        continue;
      }
      throw new IllegalArgumentException("capacity must be non-negative.");
    }
  }
  
  public final Object remove(Object paramObject)
  {
    get();
    int i = toString(paramObject);
    if (i < 0) {
      return null;
    }
    paramObject = value;
    Log.get(paramObject);
    paramObject = paramObject[i];
    get(i);
    return paramObject;
  }
  
  public final int size()
  {
    return count;
  }
  
  public final int toString(Object paramObject)
  {
    int i = getKey(paramObject);
    int j = size;
    for (;;)
    {
      int k = next[i];
      if (k == 0) {
        return -1;
      }
      if (k > 0)
      {
        Object[] arrayOfObject = key;
        k -= 1;
        if (Log.equals(arrayOfObject[k], paramObject)) {
          return k;
        }
      }
      j -= 1;
      if (j < 0) {
        return -1;
      }
      if (i == 0) {
        i = next.length - 1;
      } else {
        i -= 1;
      }
    }
  }
  
  public final String toString()
  {
    Object localObject1 = new StringBuilder(count * 3 + 2);
    ((StringBuilder)localObject1).append("{");
    TIntDoubleMapDecorator.1.1 local1 = new TIntDoubleMapDecorator.1.1(this, 0);
    int i = 0;
    while (local1.hasNext())
    {
      if (i > 0) {
        ((StringBuilder)localObject1).append(", ");
      }
      int j = data;
      StringMap localStringMap = (StringMap)value;
      if (j < data)
      {
        data = (j + 1);
        size = j;
        Object localObject2 = key[j];
        if (localObject2 == localStringMap) {
          ((StringBuilder)localObject1).append("(this Map)");
        } else {
          ((StringBuilder)localObject1).append(localObject2);
        }
        ((StringBuilder)localObject1).append('=');
        localObject2 = value;
        Log.get(localObject2);
        localObject2 = localObject2[size];
        if (localObject2 == localStringMap) {
          ((StringBuilder)localObject1).append("(this Map)");
        } else {
          ((StringBuilder)localObject1).append(localObject2);
        }
        local1.read();
        i += 1;
      }
      else
      {
        throw new NoSuchElementException();
      }
    }
    ((StringBuilder)localObject1).append("}");
    localObject1 = ((StringBuilder)localObject1).toString();
    Log.append(localObject1, "toString(...)");
    return localObject1;
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
