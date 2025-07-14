package http;

import cat.HttpFields;
import collections.List;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import params.Log;

public class AbstractMultimap
{
  public int[] data;
  public int size;
  public Object[] value;
  
  public AbstractMultimap(int paramInt)
  {
    Object localObject;
    if (paramInt == 0) {
      localObject = HttpFields.data;
    } else {
      localObject = new int[paramInt];
    }
    data = ((int[])localObject);
    if (paramInt == 0) {
      localObject = HttpFields.size;
    } else {
      localObject = new Object[paramInt << 1];
    }
    value = ((Object[])localObject);
  }
  
  public final void clear()
  {
    if (size > 0)
    {
      data = HttpFields.data;
      value = HttpFields.size;
      size = 0;
    }
    if (size <= 0) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public boolean containsKey(Object paramObject)
  {
    return toString(paramObject) >= 0;
  }
  
  public boolean containsValue(Object paramObject)
  {
    return read(paramObject) >= 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof AbstractMultimap)) {}
    for (;;)
    {
      try
      {
        j = size;
      }
      catch (NullPointerException paramObject)
      {
        int j;
        Object localObject1;
        int i;
        Object localObject2;
        Object localObject3;
        boolean bool;
        return false;
      }
      try
      {
        localObject1 = (AbstractMultimap)paramObject;
        i = size;
        if (j != i) {
          return false;
        }
        paramObject = (AbstractMultimap)paramObject;
        i = 0;
        if (i < j)
        {
          localObject1 = next(i);
          localObject2 = get(i);
          localObject3 = paramObject.get(localObject1);
          if (localObject2 == null)
          {
            if (localObject3 != null) {
              break;
            }
            bool = paramObject.containsKey(localObject1);
            if (!bool) {
              return false;
            }
          }
          else
          {
            bool = localObject2.equals(localObject3);
            if (!bool) {
              return false;
            }
          }
          i += 1;
        }
        else
        {
          return true;
        }
      }
      catch (ClassCastException paramObject) {}
    }
    if ((paramObject instanceof Map))
    {
      i = size;
      localObject1 = (Map)paramObject;
      j = ((Map)localObject1).size();
      if (i != j) {
        return false;
      }
      j = size;
      i = 0;
      while (i < j)
      {
        localObject1 = next(i);
        localObject2 = get(i);
        localObject3 = (Map)paramObject;
        localObject3 = ((Map)localObject3).get(localObject1);
        if (localObject2 == null)
        {
          if (localObject3 != null) {
            break label263;
          }
          localObject2 = (Map)paramObject;
          bool = ((Map)localObject2).containsKey(localObject1);
          if (!bool) {
            return false;
          }
        }
        else
        {
          bool = localObject2.equals(localObject3);
          if (!bool) {
            return false;
          }
        }
        i += 1;
      }
      return true;
    }
    return false;
    label263:
    return false;
  }
  
  public final int get()
  {
    int j = size;
    if (j == 0) {
      return -1;
    }
    int k = HttpFields.get(j, 0, data);
    if (k < 0) {
      return k;
    }
    if (value[(k << 1)] == null) {
      return k;
    }
    int i = k + 1;
    while ((i < j) && (data[i] == 0))
    {
      if (value[(i << 1)] == null) {
        return i;
      }
      i += 1;
    }
    j = k - 1;
    while ((j >= 0) && (data[j] == 0))
    {
      if (value[(j << 1)] == null) {
        return j;
      }
      j -= 1;
    }
    return i;
  }
  
  public final int get(int paramInt, Object paramObject)
  {
    int j = size;
    if (j == 0) {
      return -1;
    }
    int k = HttpFields.get(j, paramInt, data);
    if (k < 0) {
      return k;
    }
    if (Log.equals(paramObject, value[(k << 1)])) {
      return k;
    }
    int i = k + 1;
    while ((i < j) && (data[i] == paramInt))
    {
      if (Log.equals(paramObject, value[(i << 1)])) {
        return i;
      }
      i += 1;
    }
    j = k - 1;
    while ((j >= 0) && (data[j] == paramInt))
    {
      if (Log.equals(paramObject, value[(j << 1)])) {
        return j;
      }
      j -= 1;
    }
    return i;
  }
  
  public final Object get(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < size)) {
      return value[((paramInt << 1) + 1)];
    }
    StringBuilder localStringBuilder = new StringBuilder("Expected index to be within 0..size()-1, but was ");
    localStringBuilder.append(paramInt);
    throw new IllegalArgumentException(localStringBuilder.toString().toString());
  }
  
  public Object get(Object paramObject)
  {
    int i = toString(paramObject);
    if (i >= 0) {
      return value[((i << 1) + 1)];
    }
    return null;
  }
  
  public final Object getOrDefault(Object paramObject1, Object paramObject2)
  {
    int i = toString(paramObject1);
    if (i >= 0) {
      return value[((i << 1) + 1)];
    }
    return paramObject2;
  }
  
  public final int hashCode()
  {
    int[] arrayOfInt = data;
    Object[] arrayOfObject = value;
    int n = size;
    int i = 1;
    int j = 0;
    int k = 0;
    while (j < n)
    {
      Object localObject = arrayOfObject[i];
      int i1 = arrayOfInt[j];
      int m;
      if (localObject != null) {
        m = localObject.hashCode();
      } else {
        m = 0;
      }
      k += (m ^ i1);
      j += 1;
      i += 2;
    }
    return k;
  }
  
  public final boolean isEmpty()
  {
    return size <= 0;
  }
  
  public final Object next(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < size)) {
      return value[(paramInt << 1)];
    }
    StringBuilder localStringBuilder = new StringBuilder("Expected index to be within 0..size()-1, but was ");
    localStringBuilder.append(paramInt);
    throw new IllegalArgumentException(localStringBuilder.toString().toString());
  }
  
  public final Object put(int paramInt, Object paramObject)
  {
    if ((paramInt >= 0) && (paramInt < size))
    {
      paramInt = (paramInt << 1) + 1;
      Object[] arrayOfObject = value;
      Object localObject = arrayOfObject[paramInt];
      arrayOfObject[paramInt] = paramObject;
      return localObject;
    }
    paramObject = new StringBuilder("Expected index to be within 0..size()-1, but was ");
    paramObject.append(paramInt);
    throw new IllegalArgumentException(paramObject.toString().toString());
  }
  
  public final Object put(Object paramObject1, Object paramObject2)
  {
    int k = size;
    int j;
    if (paramObject1 != null) {
      j = paramObject1.hashCode();
    } else {
      j = 0;
    }
    if (paramObject1 != null) {
      i = get(j, paramObject1);
    } else {
      i = get();
    }
    if (i >= 0)
    {
      i = (i << 1) + 1;
      paramObject1 = value;
      localObject = paramObject1[i];
      paramObject1[i] = paramObject2;
      return localObject;
    }
    int m = i;
    Object localObject = data;
    if (k >= localObject.length)
    {
      i = 8;
      if (k >= 8) {
        i = (k >> 1) + k;
      } else if (k < 4) {
        i = 4;
      }
      localObject = Arrays.copyOf((int[])localObject, i);
      Log.append(localObject, "copyOf(this, newSize)");
      data = ((int[])localObject);
      localObject = Arrays.copyOf(value, i << 1);
      Log.append(localObject, "copyOf(this, newSize)");
      value = ((Object[])localObject);
      if (k != size) {
        throw new ConcurrentModificationException();
      }
    }
    if (m < k)
    {
      localObject = data;
      i = m + 1;
      List.append(i, m, k, (int[])localObject, (int[])localObject);
      localObject = value;
      List.append((Object[])localObject, (Object[])localObject, i << 1, m << 1, size << 1);
    }
    int i = size;
    if (k == i)
    {
      localObject = data;
      if (m < localObject.length)
      {
        localObject[m] = j;
        localObject = value;
        j = m << 1;
        localObject[j] = paramObject1;
        localObject[(j + 1)] = paramObject2;
        size = (i + 1);
        return null;
      }
    }
    throw new ConcurrentModificationException();
  }
  
  public final Object putIfAbsent(Object paramObject1, Object paramObject2)
  {
    Object localObject = get(paramObject1);
    if (localObject == null) {
      return put(paramObject1, paramObject2);
    }
    return localObject;
  }
  
  public final int read(Object paramObject)
  {
    int j = size * 2;
    Object[] arrayOfObject = value;
    if (paramObject == null)
    {
      i = 1;
      while (i < j)
      {
        if (arrayOfObject[i] == null) {
          return i >> 1;
        }
        i += 2;
      }
    }
    int i = 1;
    while (i < j)
    {
      if (paramObject.equals(arrayOfObject[i])) {
        return i >> 1;
      }
      i += 2;
    }
    return -1;
  }
  
  public final Object remove(int paramInt)
  {
    if (paramInt >= 0)
    {
      int j = size;
      if (paramInt < j)
      {
        Object[] arrayOfObject = value;
        int m = paramInt << 1;
        localObject1 = arrayOfObject[(m + 1)];
        if (j <= 1)
        {
          clear();
          return localObject1;
        }
        int k = j - 1;
        int[] arrayOfInt = data;
        int n = arrayOfInt.length;
        int i = 8;
        if ((n > 8) && (j < arrayOfInt.length / 3))
        {
          if (j > 8) {
            i = j + (j >> 1);
          }
          Object localObject2 = Arrays.copyOf(arrayOfInt, i);
          Log.append(localObject2, "copyOf(this, newSize)");
          data = ((int[])localObject2);
          localObject2 = Arrays.copyOf(value, i << 1);
          Log.append(localObject2, "copyOf(this, newSize)");
          value = ((Object[])localObject2);
          if (j == size)
          {
            if (paramInt > 0)
            {
              List.append(0, 0, paramInt, arrayOfInt, data);
              List.append(arrayOfObject, value, 0, 0, m);
            }
            if (paramInt < k)
            {
              localObject2 = data;
              i = paramInt + 1;
              List.append(paramInt, i, j, arrayOfInt, (int[])localObject2);
              List.append(arrayOfObject, value, m, i << 1, j << 1);
            }
          }
          else
          {
            throw new ConcurrentModificationException();
          }
        }
        else
        {
          if (paramInt < k)
          {
            i = paramInt + 1;
            List.append(paramInt, i, j, arrayOfInt, arrayOfInt);
            arrayOfObject = value;
            List.append(arrayOfObject, arrayOfObject, m, i << 1, j << 1);
          }
          arrayOfObject = value;
          paramInt = k << 1;
          arrayOfObject[paramInt] = null;
          arrayOfObject[(paramInt + 1)] = null;
        }
        if (j == size)
        {
          size = k;
          return localObject1;
        }
        throw new ConcurrentModificationException();
      }
    }
    Object localObject1 = new StringBuilder("Expected index to be within 0..size()-1, but was ");
    ((StringBuilder)localObject1).append(paramInt);
    throw new IllegalArgumentException(((StringBuilder)localObject1).toString().toString());
  }
  
  public Object remove(Object paramObject)
  {
    int i = toString(paramObject);
    if (i >= 0) {
      return remove(i);
    }
    return null;
  }
  
  public final boolean remove(Object paramObject1, Object paramObject2)
  {
    int i = toString(paramObject1);
    if ((i >= 0) && (Log.equals(paramObject2, get(i))))
    {
      remove(i);
      return true;
    }
    return false;
  }
  
  public final Object replace(Object paramObject1, Object paramObject2)
  {
    int i = toString(paramObject1);
    if (i >= 0) {
      return put(i, paramObject2);
    }
    return null;
  }
  
  public final boolean replace(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    int i = toString(paramObject1);
    if ((i >= 0) && (Log.equals(paramObject2, get(i))))
    {
      put(i, paramObject3);
      return true;
    }
    return false;
  }
  
  public final int size()
  {
    return size;
  }
  
  public final int toString(Object paramObject)
  {
    if (paramObject == null) {
      return get();
    }
    return get(paramObject.hashCode(), paramObject);
  }
  
  public final String toString()
  {
    if (isEmpty()) {
      return "{}";
    }
    Object localObject1 = new StringBuilder(size * 28);
    ((StringBuilder)localObject1).append('{');
    int j = size;
    int i = 0;
    while (i < j)
    {
      if (i > 0) {
        ((StringBuilder)localObject1).append(", ");
      }
      Object localObject2 = next(i);
      if (localObject2 != localObject1) {
        ((StringBuilder)localObject1).append(localObject2);
      } else {
        ((StringBuilder)localObject1).append("(this Map)");
      }
      ((StringBuilder)localObject1).append('=');
      localObject2 = get(i);
      if (localObject2 != localObject1) {
        ((StringBuilder)localObject1).append(localObject2);
      } else {
        ((StringBuilder)localObject1).append("(this Map)");
      }
      i += 1;
    }
    ((StringBuilder)localObject1).append('}');
    localObject1 = ((StringBuilder)localObject1).toString();
    Log.append(localObject1, "StringBuilder(capacity).?builderAction).toString()");
    return localObject1;
  }
}
