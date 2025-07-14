package http;

import cat.HttpFields;
import collections.List;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import params.Log;

public final class TCharArrayList
  implements Collection, Set, ssh.Object
{
  public int data;
  public Object[] length = HttpFields.size;
  public int[] next = HttpFields.data;
  
  public TCharArrayList() {}
  
  public final Object add(int paramInt)
  {
    int j = data;
    Object[] arrayOfObject = length;
    Object localObject = arrayOfObject[paramInt];
    if (j <= 1)
    {
      clear();
      return localObject;
    }
    int k = j - 1;
    int[] arrayOfInt1 = next;
    int m = arrayOfInt1.length;
    int i = 8;
    if ((m > 8) && (j < arrayOfInt1.length / 3))
    {
      if (j > 8) {
        i = j + (j >> 1);
      }
      int[] arrayOfInt2 = new int[i];
      next = arrayOfInt2;
      length = new Object[i];
      if (paramInt > 0)
      {
        List.put(paramInt, 6, arrayOfInt1, arrayOfInt2);
        List.add(arrayOfObject, length, 0, paramInt, 6);
      }
      if (paramInt < k)
      {
        arrayOfInt2 = next;
        i = paramInt + 1;
        List.append(paramInt, i, j, arrayOfInt1, arrayOfInt2);
        List.append(arrayOfObject, length, paramInt, i, j);
      }
    }
    else
    {
      if (paramInt < k)
      {
        i = paramInt + 1;
        List.append(paramInt, i, j, arrayOfInt1, arrayOfInt1);
        arrayOfObject = length;
        List.append(arrayOfObject, arrayOfObject, paramInt, i, j);
      }
      length[k] = null;
    }
    if (j == data)
    {
      data = k;
      return localObject;
    }
    throw new ConcurrentModificationException();
  }
  
  public final boolean add(Object paramObject)
  {
    int k = data;
    int j;
    if (paramObject == null)
    {
      i = Item.get(this, null, 0);
      j = 0;
    }
    else
    {
      j = paramObject.hashCode();
      i = Item.get(this, paramObject, j);
    }
    if (i >= 0) {
      return false;
    }
    int m = i;
    Object localObject = next;
    if (k >= localObject.length)
    {
      i = 8;
      if (k >= 8) {
        i = (k >> 1) + k;
      } else if (k < 4) {
        i = 4;
      }
      Object[] arrayOfObject = length;
      int[] arrayOfInt = new int[i];
      next = arrayOfInt;
      length = new Object[i];
      if (k == data)
      {
        if (arrayOfInt.length != 0)
        {
          List.put(localObject.length, 6, (int[])localObject, arrayOfInt);
          List.add(arrayOfObject, length, 0, arrayOfObject.length, 6);
        }
      }
      else {
        throw new ConcurrentModificationException();
      }
    }
    if (m < k)
    {
      localObject = next;
      i = m + 1;
      List.append(i, m, k, (int[])localObject, (int[])localObject);
      localObject = length;
      List.append((Object[])localObject, (Object[])localObject, i, m, k);
    }
    int i = data;
    if (k == i)
    {
      localObject = next;
      if (m < localObject.length)
      {
        localObject[m] = j;
        length[m] = paramObject;
        data = (i + 1);
        return true;
      }
    }
    throw new ConcurrentModificationException();
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    Log.get(paramCollection, "elements");
    int i = data;
    int j = paramCollection.size() + i;
    i = data;
    int[] arrayOfInt1 = next;
    int k = arrayOfInt1.length;
    boolean bool = false;
    if (k < j)
    {
      Object[] arrayOfObject = length;
      int[] arrayOfInt2 = new int[j];
      next = arrayOfInt2;
      length = new Object[j];
      j = data;
      if (j > 0)
      {
        List.put(j, 6, arrayOfInt1, arrayOfInt2);
        List.add(arrayOfObject, length, 0, data, 6);
      }
    }
    if (data == i)
    {
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        bool |= add(paramCollection.next());
      }
      return bool;
    }
    throw new ConcurrentModificationException();
  }
  
  public final void clear()
  {
    if (data != 0)
    {
      next = HttpFields.data;
      length = HttpFields.size;
      data = 0;
    }
    if (data == 0) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public final boolean contains(Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = Item.get(this, null, 0);
    } else {
      i = Item.get(this, paramObject, paramObject.hashCode());
    }
    return i >= 0;
  }
  
  public final boolean containsAll(Collection paramCollection)
  {
    Log.get(paramCollection, "elements");
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (!contains(paramCollection.next())) {
        return false;
      }
    }
    return true;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((!(paramObject instanceof Set)) || (data != ((Set)paramObject).size())) {}
    for (;;)
    {
      return false;
      int i;
      Object localObject;
      Set localSet;
      boolean bool;
      try
      {
        int j = data;
        i = 0;
        if (i < j)
        {
          localObject = length[i];
          localSet = (Set)paramObject;
        }
      }
      catch (NullPointerException paramObject) {}
      try
      {
        bool = localSet.contains(localObject);
        if (!bool) {
          continue;
        }
        i += 1;
      }
      catch (ClassCastException paramObject) {}
      return true;
    }
  }
  
  public final int hashCode()
  {
    int[] arrayOfInt = next;
    int k = data;
    int i = 0;
    int j = 0;
    while (i < k)
    {
      j += arrayOfInt[i];
      i += 1;
    }
    return j;
  }
  
  public final boolean isEmpty()
  {
    return data <= 0;
  }
  
  public final Iterator iterator()
  {
    return new BlockList.MyIterator(this);
  }
  
  public final boolean remove(Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = Item.get(this, null, 0);
    } else {
      i = Item.get(this, paramObject, paramObject.hashCode());
    }
    if (i >= 0)
    {
      add(i);
      return true;
    }
    return false;
  }
  
  public final boolean removeAll(Collection paramCollection)
  {
    Log.get(paramCollection, "elements");
    paramCollection = paramCollection.iterator();
    boolean bool = false;
    while (paramCollection.hasNext()) {
      bool |= remove(paramCollection.next());
    }
    return bool;
  }
  
  public final boolean retainAll(Collection paramCollection)
  {
    Log.get(paramCollection, "elements");
    int i = data - 1;
    boolean bool = false;
    while (-1 < i)
    {
      if (!paramCollection.contains(length[i]))
      {
        add(i);
        bool = true;
      }
      i -= 1;
    }
    return bool;
  }
  
  public final int size()
  {
    return data;
  }
  
  public final Object[] toArray()
  {
    Object localObject = length;
    int i = data;
    Log.get(localObject, "<this>");
    int j = localObject.length;
    if (i <= j)
    {
      localObject = Arrays.copyOfRange((Object[])localObject, 0, i);
      Log.append(localObject, "copyOfRange(...)");
      return localObject;
    }
    localObject = new StringBuilder("toIndex (");
    ((StringBuilder)localObject).append(i);
    ((StringBuilder)localObject).append(") is greater than size (");
    ((StringBuilder)localObject).append(j);
    ((StringBuilder)localObject).append(").");
    throw new IndexOutOfBoundsException(((StringBuilder)localObject).toString());
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject)
  {
    Log.get(paramArrayOfObject, "array");
    int i = data;
    Object[] arrayOfObject;
    if (paramArrayOfObject.length < i)
    {
      arrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);
    }
    else
    {
      arrayOfObject = paramArrayOfObject;
      if (paramArrayOfObject.length > i)
      {
        paramArrayOfObject[i] = null;
        arrayOfObject = paramArrayOfObject;
      }
    }
    List.append(length, arrayOfObject, 0, 0, data);
    return arrayOfObject;
  }
  
  public final String toString()
  {
    if (isEmpty()) {
      return "{}";
    }
    Object localObject1 = new StringBuilder(data * 14);
    ((StringBuilder)localObject1).append('{');
    int j = data;
    int i = 0;
    while (i < j)
    {
      if (i > 0) {
        ((StringBuilder)localObject1).append(", ");
      }
      Object localObject2 = length[i];
      if (localObject2 != this) {
        ((StringBuilder)localObject1).append(localObject2);
      } else {
        ((StringBuilder)localObject1).append("(this Set)");
      }
      i += 1;
    }
    ((StringBuilder)localObject1).append('}');
    localObject1 = ((StringBuilder)localObject1).toString();
    Log.append(localObject1, "StringBuilder(capacity).?builderAction).toString()");
    return localObject1;
  }
}
