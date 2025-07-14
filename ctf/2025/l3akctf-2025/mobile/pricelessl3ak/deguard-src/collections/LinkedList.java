package collections;

import drupal.Context;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import params.Log;

public final class LinkedList
  extends AbstractList
  implements java.util.List, ssh.Object
{
  public static final java.lang.Object[] head = new java.lang.Object[0];
  public java.lang.Object[] length = head;
  public int next;
  public int size;
  
  public LinkedList() {}
  
  public final void add()
  {
    modCount += 1;
  }
  
  public final void add(int paramInt)
  {
    if (paramInt >= 0)
    {
      java.lang.Object[] arrayOfObject2 = length;
      if (paramInt <= arrayOfObject2.length) {
        return;
      }
      if (arrayOfObject2 == head)
      {
        i = paramInt;
        if (paramInt < 10) {
          i = 10;
        }
        length = new java.lang.Object[i];
        return;
      }
      int i = arrayOfObject2.length;
      int j = i + (i >> 1);
      i = j;
      if (j - paramInt < 0) {
        i = paramInt;
      }
      j = i;
      if (i - 2147483639 > 0) {
        if (paramInt > 2147483639) {
          j = Integer.MAX_VALUE;
        } else {
          j = 2147483639;
        }
      }
      java.lang.Object[] arrayOfObject1 = new java.lang.Object[j];
      List.append(arrayOfObject2, arrayOfObject1, 0, next, arrayOfObject2.length);
      arrayOfObject2 = length;
      paramInt = arrayOfObject2.length;
      i = next;
      List.append(arrayOfObject2, arrayOfObject1, paramInt - i, 0, i);
      next = 0;
      length = arrayOfObject1;
      return;
    }
    throw new IllegalStateException("Deque is too big.");
  }
  
  public final void add(int paramInt, java.lang.Object paramObject)
  {
    int i = size;
    if ((paramInt >= 0) && (paramInt <= i))
    {
      if (paramInt == i)
      {
        addLast(paramObject);
        return;
      }
      if (paramInt == 0)
      {
        addFirst(paramObject);
        return;
      }
      add();
      add(size + 1);
      int j = next(next + paramInt);
      i = j;
      int k = size;
      java.lang.Object[] arrayOfObject;
      if (paramInt < k + 1 >> 1)
      {
        if (j == 0)
        {
          arrayOfObject = length;
          Log.get(arrayOfObject, "<this>");
          i = arrayOfObject.length;
        }
        i -= 1;
        paramInt = next;
        if (paramInt == 0)
        {
          arrayOfObject = length;
          Log.get(arrayOfObject, "<this>");
          paramInt = arrayOfObject.length - 1;
        }
        else
        {
          paramInt -= 1;
        }
        j = next;
        if (i >= j)
        {
          arrayOfObject = length;
          arrayOfObject[paramInt] = arrayOfObject[j];
          List.append(arrayOfObject, arrayOfObject, j, j + 1, i + 1);
        }
        else
        {
          arrayOfObject = length;
          List.append(arrayOfObject, arrayOfObject, j - 1, j, arrayOfObject.length);
          arrayOfObject = length;
          arrayOfObject[(arrayOfObject.length - 1)] = arrayOfObject[0];
          List.append(arrayOfObject, arrayOfObject, 0, 1, i + 1);
        }
        length[i] = paramObject;
        next = paramInt;
      }
      else
      {
        paramInt = next(next + k);
        if (j < paramInt)
        {
          arrayOfObject = length;
          List.append(arrayOfObject, arrayOfObject, j + 1, j, paramInt);
        }
        else
        {
          arrayOfObject = length;
          List.append(arrayOfObject, arrayOfObject, 1, 0, paramInt);
          arrayOfObject = length;
          arrayOfObject[0] = arrayOfObject[(arrayOfObject.length - 1)];
          List.append(arrayOfObject, arrayOfObject, j + 1, j, arrayOfObject.length - 1);
        }
        length[j] = paramObject;
      }
      size += 1;
      return;
    }
    paramObject = new StringBuilder("index: ");
    paramObject.append(paramInt);
    paramObject.append(", size: ");
    paramObject.append(i);
    throw new IndexOutOfBoundsException(paramObject.toString());
  }
  
  public final void add(int paramInt, Collection paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    int i = length.length;
    while ((paramInt < i) && (localIterator.hasNext()))
    {
      length[paramInt] = localIterator.next();
      paramInt += 1;
    }
    i = next;
    paramInt = 0;
    while ((paramInt < i) && (localIterator.hasNext()))
    {
      length[paramInt] = localIterator.next();
      paramInt += 1;
    }
    paramInt = size;
    size = (paramCollection.size() + paramInt);
  }
  
  public final boolean add(java.lang.Object paramObject)
  {
    addLast(paramObject);
    return true;
  }
  
  public final boolean addAll(int paramInt, Collection paramCollection)
  {
    Log.get(paramCollection, "elements");
    int i = size;
    if ((paramInt >= 0) && (paramInt <= i))
    {
      if (paramCollection.isEmpty()) {
        return false;
      }
      if (paramInt == size) {
        return addAll(paramCollection);
      }
      add();
      i = size;
      add(paramCollection.size() + i);
      int k = next(next + size);
      i = next(next + paramInt);
      int j = paramCollection.size();
      java.lang.Object[] arrayOfObject;
      if (paramInt < size + 1 >> 1)
      {
        k = next;
        paramInt = k - j;
        if (i >= k)
        {
          if (paramInt >= 0)
          {
            arrayOfObject = length;
            List.append(arrayOfObject, arrayOfObject, paramInt, k, i);
          }
          else
          {
            arrayOfObject = length;
            paramInt += arrayOfObject.length;
            int m = arrayOfObject.length - paramInt;
            if (m >= i - k)
            {
              List.append(arrayOfObject, arrayOfObject, paramInt, k, i);
            }
            else
            {
              List.append(arrayOfObject, arrayOfObject, paramInt, k, k + m);
              arrayOfObject = length;
              List.append(arrayOfObject, arrayOfObject, 0, next + m, i);
            }
          }
        }
        else
        {
          arrayOfObject = length;
          List.append(arrayOfObject, arrayOfObject, paramInt, k, arrayOfObject.length);
          if (j >= i)
          {
            arrayOfObject = length;
            List.append(arrayOfObject, arrayOfObject, arrayOfObject.length - j, 0, i);
          }
          else
          {
            arrayOfObject = length;
            List.append(arrayOfObject, arrayOfObject, arrayOfObject.length - j, 0, j);
            arrayOfObject = length;
            List.append(arrayOfObject, arrayOfObject, 0, j, i);
          }
        }
        next = paramInt;
        add(size(i - j), paramCollection);
        return true;
      }
      paramInt = i + j;
      if (i < k)
      {
        j += k;
        arrayOfObject = length;
        if (j <= arrayOfObject.length)
        {
          List.append(arrayOfObject, arrayOfObject, paramInt, i, k);
        }
        else if (paramInt >= arrayOfObject.length)
        {
          List.append(arrayOfObject, arrayOfObject, paramInt - arrayOfObject.length, i, k);
        }
        else
        {
          j = k - (j - arrayOfObject.length);
          List.append(arrayOfObject, arrayOfObject, 0, j, k);
          arrayOfObject = length;
          List.append(arrayOfObject, arrayOfObject, paramInt, i, j);
        }
      }
      else
      {
        arrayOfObject = length;
        List.append(arrayOfObject, arrayOfObject, j, 0, k);
        arrayOfObject = length;
        if (paramInt >= arrayOfObject.length)
        {
          List.append(arrayOfObject, arrayOfObject, paramInt - arrayOfObject.length, i, arrayOfObject.length);
        }
        else
        {
          List.append(arrayOfObject, arrayOfObject, 0, arrayOfObject.length - j, arrayOfObject.length);
          arrayOfObject = length;
          List.append(arrayOfObject, arrayOfObject, paramInt, i, arrayOfObject.length - j);
        }
      }
      add(i, paramCollection);
      return true;
    }
    paramCollection = new StringBuilder("index: ");
    paramCollection.append(paramInt);
    paramCollection.append(", size: ");
    paramCollection.append(i);
    throw new IndexOutOfBoundsException(paramCollection.toString());
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    Log.get(paramCollection, "elements");
    if (paramCollection.isEmpty()) {
      return false;
    }
    add();
    int i = size;
    add(paramCollection.size() + i);
    add(next(next + size), paramCollection);
    return true;
  }
  
  public final void addFirst(java.lang.Object paramObject)
  {
    add();
    add(size + 1);
    int j = next;
    int i = j;
    if (j == 0)
    {
      java.lang.Object[] arrayOfObject = length;
      Log.get(arrayOfObject, "<this>");
      i = arrayOfObject.length;
    }
    i -= 1;
    next = i;
    length[i] = paramObject;
    size += 1;
  }
  
  public final void addLast(java.lang.Object paramObject)
  {
    add();
    add(size + 1);
    length[next(next + size)] = paramObject;
    size += 1;
  }
  
  public final void append(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2)
    {
      arrayOfObject = length;
      Log.get(arrayOfObject, "<this>");
      Arrays.fill(arrayOfObject, paramInt1, paramInt2, null);
      return;
    }
    java.lang.Object[] arrayOfObject = length;
    Arrays.fill(arrayOfObject, paramInt1, arrayOfObject.length, null);
    arrayOfObject = length;
    Log.get(arrayOfObject, "<this>");
    Arrays.fill(arrayOfObject, 0, paramInt2, null);
  }
  
  public final void clear()
  {
    if (!isEmpty())
    {
      add();
      int i = next(next + size);
      append(next, i);
    }
    next = 0;
    size = 0;
  }
  
  public final int contains(int paramInt)
  {
    java.lang.Object[] arrayOfObject = length;
    Log.get(arrayOfObject, "<this>");
    if (paramInt == arrayOfObject.length - 1) {
      return 0;
    }
    return paramInt + 1;
  }
  
  public final boolean contains(java.lang.Object paramObject)
  {
    return indexOf(paramObject) != -1;
  }
  
  public final java.lang.Object get(int paramInt)
  {
    int i = size;
    if ((paramInt >= 0) && (paramInt < i)) {
      return length[next(next + paramInt)];
    }
    StringBuilder localStringBuilder = new StringBuilder("index: ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(", size: ");
    localStringBuilder.append(i);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public final int indexOf(java.lang.Object paramObject)
  {
    int j = next(next + size);
    int i = next;
    if (i < j) {
      while (i < j)
      {
        if (Log.equals(paramObject, length[i]))
        {
          j = next;
          return i - j;
        }
        i += 1;
      }
    }
    if (i >= j)
    {
      int k = length.length;
      for (;;)
      {
        if (i >= k) {
          break label104;
        }
        if (Log.equals(paramObject, length[i]))
        {
          j = next;
          break;
        }
        i += 1;
      }
      label104:
      i = 0;
      for (;;)
      {
        if (i >= j) {
          break label147;
        }
        if (Log.equals(paramObject, length[i]))
        {
          i += length.length;
          j = next;
          break;
        }
        i += 1;
      }
    }
    label147:
    return -1;
  }
  
  public final boolean isEmpty()
  {
    return size == 0;
  }
  
  public final int lastIndexOf(java.lang.Object paramObject)
  {
    int i = next(next + size);
    int j = next;
    if (j < i)
    {
      i -= 1;
      if (j <= i) {
        for (;;)
        {
          if (Log.equals(paramObject, length[i]))
          {
            j = next;
            return i - j;
          }
          if (i == j) {
            break;
          }
          i -= 1;
        }
      }
    }
    else if (j > i)
    {
      i -= 1;
      for (;;)
      {
        if (-1 >= i) {
          break label117;
        }
        if (Log.equals(paramObject, length[i]))
        {
          i += length.length;
          j = next;
          break;
        }
        i -= 1;
      }
      label117:
      java.lang.Object[] arrayOfObject = length;
      Log.get(arrayOfObject, "<this>");
      i = arrayOfObject.length - 1;
      j = next;
      if (j <= i) {
        for (;;)
        {
          if (Log.equals(paramObject, length[i]))
          {
            j = next;
            break;
          }
          if (i == j) {
            break label179;
          }
          i -= 1;
        }
      }
    }
    label179:
    return -1;
  }
  
  public final int next(int paramInt)
  {
    java.lang.Object[] arrayOfObject = length;
    int i = paramInt;
    if (paramInt >= arrayOfObject.length) {
      i = paramInt - arrayOfObject.length;
    }
    return i;
  }
  
  public final java.lang.Object remove(int paramInt)
  {
    int i = size;
    if ((paramInt >= 0) && (paramInt < i))
    {
      if (paramInt == i - 1) {
        return removeLast();
      }
      if (paramInt == 0) {
        return removeFirst();
      }
      add();
      i = next(next + paramInt);
      java.lang.Object[] arrayOfObject = length;
      localObject = arrayOfObject[i];
      int j = size;
      if (paramInt < j >> 1)
      {
        paramInt = next;
        if (i >= paramInt)
        {
          List.append(arrayOfObject, arrayOfObject, paramInt + 1, paramInt, i);
        }
        else
        {
          List.append(arrayOfObject, arrayOfObject, 1, 0, i);
          arrayOfObject = length;
          arrayOfObject[0] = arrayOfObject[(arrayOfObject.length - 1)];
          paramInt = next;
          List.append(arrayOfObject, arrayOfObject, paramInt + 1, paramInt, arrayOfObject.length - 1);
        }
        arrayOfObject = length;
        paramInt = next;
        arrayOfObject[paramInt] = null;
        next = contains(paramInt);
      }
      else
      {
        paramInt = next(j - 1 + next);
        if (i <= paramInt)
        {
          arrayOfObject = length;
          List.append(arrayOfObject, arrayOfObject, i, i + 1, paramInt + 1);
        }
        else
        {
          arrayOfObject = length;
          List.append(arrayOfObject, arrayOfObject, i, i + 1, arrayOfObject.length);
          arrayOfObject = length;
          arrayOfObject[(arrayOfObject.length - 1)] = arrayOfObject[0];
          List.append(arrayOfObject, arrayOfObject, 0, 1, paramInt + 1);
        }
        length[paramInt] = null;
      }
      size -= 1;
      return localObject;
    }
    java.lang.Object localObject = new StringBuilder("index: ");
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append(", size: ");
    ((StringBuilder)localObject).append(i);
    throw new IndexOutOfBoundsException(((StringBuilder)localObject).toString());
  }
  
  public final boolean remove(java.lang.Object paramObject)
  {
    int i = indexOf(paramObject);
    if (i == -1) {
      return false;
    }
    remove(i);
    return true;
  }
  
  public final boolean removeAll(Collection paramCollection)
  {
    Log.get(paramCollection, "elements");
    boolean bool2 = isEmpty();
    int k = 0;
    boolean bool1 = false;
    if (!bool2)
    {
      if (length.length == 0) {
        return false;
      }
      int m = next(next + size);
      int i = next;
      int j;
      java.lang.Object localObject1;
      if (i < m)
      {
        j = i;
        while (i < m)
        {
          localObject1 = length[i];
          if (!paramCollection.contains(localObject1))
          {
            length[j] = localObject1;
            j += 1;
          }
          else
          {
            bool1 = true;
          }
          i += 1;
        }
        paramCollection = length;
        Log.get(paramCollection, "<this>");
        Arrays.fill(paramCollection, j, m, null);
        i = j;
      }
      else
      {
        int n = length.length;
        bool1 = false;
        j = i;
        java.lang.Object localObject2;
        while (i < n)
        {
          localObject1 = length;
          localObject2 = localObject1[i];
          localObject1[i] = null;
          if (!paramCollection.contains(localObject2))
          {
            length[j] = localObject2;
            j += 1;
          }
          else
          {
            bool1 = true;
          }
          i += 1;
        }
        i = next(j);
        j = k;
        while (j < m)
        {
          localObject1 = length;
          localObject2 = localObject1[j];
          localObject1[j] = null;
          if (!paramCollection.contains(localObject2))
          {
            length[i] = localObject2;
            i = contains(i);
          }
          else
          {
            bool1 = true;
          }
          j += 1;
        }
      }
      if (bool1)
      {
        add();
        size = size(i - next);
        return bool1;
      }
    }
    else
    {
      return false;
    }
    return bool1;
  }
  
  public final java.lang.Object removeFirst()
  {
    if (!isEmpty())
    {
      add();
      java.lang.Object[] arrayOfObject = length;
      int i = next;
      java.lang.Object localObject = arrayOfObject[i];
      arrayOfObject[i] = null;
      next = contains(i);
      size -= 1;
      return localObject;
    }
    throw new NoSuchElementException("ArrayDeque is empty.");
  }
  
  public final java.lang.Object removeLast()
  {
    if (!isEmpty())
    {
      add();
      int i = next;
      i = next(size - 1 + i);
      java.lang.Object[] arrayOfObject = length;
      java.lang.Object localObject = arrayOfObject[i];
      arrayOfObject[i] = null;
      size -= 1;
      return localObject;
    }
    throw new NoSuchElementException("ArrayDeque is empty.");
  }
  
  public final void removeRange(int paramInt1, int paramInt2)
  {
    Context.append(paramInt1, paramInt2, size);
    int m = paramInt2 - paramInt1;
    if (m == 0) {
      return;
    }
    if (m == size)
    {
      clear();
      return;
    }
    if (m == 1)
    {
      remove(paramInt1);
      return;
    }
    add();
    int j;
    int i;
    int k;
    java.lang.Object[] arrayOfObject;
    if (paramInt1 < size - paramInt2)
    {
      j = next(paramInt1 - 1 + next);
      i = next(paramInt2 - 1 + next);
      paramInt2 = j;
      while (paramInt1 > 0)
      {
        k = paramInt2 + 1;
        j = Math.min(paramInt1, Math.min(k, i + 1));
        arrayOfObject = length;
        i -= j;
        paramInt2 -= j;
        List.append(arrayOfObject, arrayOfObject, i + 1, paramInt2 + 1, k);
        paramInt2 = size(paramInt2);
        i = size(i);
        paramInt1 -= j;
      }
      paramInt1 = next(next + m);
      append(next, paramInt1);
      next = paramInt1;
    }
    else
    {
      k = next(next + paramInt2);
      paramInt1 = next(next + paramInt1);
      j = size;
      i = paramInt2;
      paramInt2 = k;
      for (;;)
      {
        j -= i;
        if (j <= 0) {
          break;
        }
        arrayOfObject = length;
        k = Math.min(j, Math.min(arrayOfObject.length - paramInt2, arrayOfObject.length - paramInt1));
        i = k;
        arrayOfObject = length;
        int n = paramInt2 + k;
        List.append(arrayOfObject, arrayOfObject, paramInt1, paramInt2, n);
        paramInt2 = next(n);
        paramInt1 = next(paramInt1 + k);
      }
      paramInt1 = next(next + size);
      append(size(paramInt1 - m), paramInt1);
    }
    size -= m;
  }
  
  public final boolean retainAll(Collection paramCollection)
  {
    Log.get(paramCollection, "elements");
    boolean bool2 = isEmpty();
    int k = 0;
    boolean bool1 = false;
    if (!bool2)
    {
      if (length.length == 0) {
        return false;
      }
      int m = next(next + size);
      int i = next;
      int j;
      java.lang.Object localObject1;
      if (i < m)
      {
        j = i;
        while (i < m)
        {
          localObject1 = length[i];
          if (paramCollection.contains(localObject1))
          {
            length[j] = localObject1;
            j += 1;
          }
          else
          {
            bool1 = true;
          }
          i += 1;
        }
        paramCollection = length;
        Log.get(paramCollection, "<this>");
        Arrays.fill(paramCollection, j, m, null);
        i = j;
      }
      else
      {
        int n = length.length;
        bool1 = false;
        j = i;
        java.lang.Object localObject2;
        while (i < n)
        {
          localObject1 = length;
          localObject2 = localObject1[i];
          localObject1[i] = null;
          if (paramCollection.contains(localObject2))
          {
            length[j] = localObject2;
            j += 1;
          }
          else
          {
            bool1 = true;
          }
          i += 1;
        }
        i = next(j);
        j = k;
        while (j < m)
        {
          localObject1 = length;
          localObject2 = localObject1[j];
          localObject1[j] = null;
          if (paramCollection.contains(localObject2))
          {
            length[i] = localObject2;
            i = contains(i);
          }
          else
          {
            bool1 = true;
          }
          j += 1;
        }
      }
      if (bool1)
      {
        add();
        size = size(i - next);
        return bool1;
      }
    }
    else
    {
      return false;
    }
    return bool1;
  }
  
  public final java.lang.Object set(int paramInt, java.lang.Object paramObject)
  {
    int i = size;
    if ((paramInt >= 0) && (paramInt < i))
    {
      paramInt = next(next + paramInt);
      java.lang.Object[] arrayOfObject = length;
      java.lang.Object localObject = arrayOfObject[paramInt];
      arrayOfObject[paramInt] = paramObject;
      return localObject;
    }
    paramObject = new StringBuilder("index: ");
    paramObject.append(paramInt);
    paramObject.append(", size: ");
    paramObject.append(i);
    throw new IndexOutOfBoundsException(paramObject.toString());
  }
  
  public final int size()
  {
    return size;
  }
  
  public final int size(int paramInt)
  {
    int i = paramInt;
    if (paramInt < 0) {
      i = paramInt + length.length;
    }
    return i;
  }
  
  public final java.lang.Object[] toArray()
  {
    return toArray(new java.lang.Object[size]);
  }
  
  public final java.lang.Object[] toArray(java.lang.Object[] paramArrayOfObject)
  {
    Log.get(paramArrayOfObject, "array");
    int i = paramArrayOfObject.length;
    int j = size;
    if (i < j)
    {
      paramArrayOfObject = Array.newInstance(paramArrayOfObject.getClass().getComponentType(), j);
      Log.add(paramArrayOfObject, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
      paramArrayOfObject = (java.lang.Object[])paramArrayOfObject;
    }
    i = next(next + size);
    j = next;
    if (j < i)
    {
      List.add(length, paramArrayOfObject, j, i, 2);
    }
    else if (!isEmpty())
    {
      java.lang.Object[] arrayOfObject = length;
      List.append(arrayOfObject, paramArrayOfObject, 0, next, arrayOfObject.length);
      arrayOfObject = length;
      List.append(arrayOfObject, paramArrayOfObject, arrayOfObject.length - next, 0, i);
    }
    i = size;
    if (i < paramArrayOfObject.length) {
      paramArrayOfObject[i] = null;
    }
    return paramArrayOfObject;
  }
}
