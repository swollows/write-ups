package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import params.Log;

public abstract class AbstractList4
  implements List, Collection, ssh.Object
{
  public AbstractList4() {}
  
  public final void add(int paramInt, java.lang.Object paramObject)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean add(java.lang.Object paramObject)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean addAll(int paramInt, Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final void clear()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean contains(java.lang.Object paramObject)
  {
    if (isEmpty()) {
      return false;
    }
    Iterator localIterator = iterator();
    while (localIterator.hasNext()) {
      if (Log.equals(localIterator.next(), paramObject)) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean containsAll(Collection paramCollection)
  {
    Log.get(paramCollection, "elements");
    if (paramCollection.isEmpty()) {
      return true;
    }
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (!contains(paramCollection.next())) {
        return false;
      }
    }
    return true;
  }
  
  public final boolean equals(java.lang.Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof List)) {
      return false;
    }
    paramObject = (Collection)paramObject;
    Log.get(paramObject, "other");
    if (size() != paramObject.size()) {}
    for (;;)
    {
      return false;
      paramObject = paramObject.iterator();
      Iterator localIterator = iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
      } while (Log.equals(localIterator.next(), paramObject.next()));
    }
    return true;
  }
  
  public abstract int get();
  
  public final int hashCode()
  {
    Iterator localIterator = iterator();
    int j;
    for (int i = 1; localIterator.hasNext(); i = i * 31 + j)
    {
      java.lang.Object localObject = localIterator.next();
      if (localObject != null) {
        j = localObject.hashCode();
      } else {
        j = 0;
      }
    }
    return i;
  }
  
  public int indexOf(java.lang.Object paramObject)
  {
    Iterator localIterator = iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      if (Log.equals(localIterator.next(), paramObject)) {
        return i;
      }
      i += 1;
    }
    return -1;
  }
  
  public final boolean isEmpty()
  {
    return get() == 0;
  }
  
  public final Iterator iterator()
  {
    return new ArrayIterator(this);
  }
  
  public int lastIndexOf(java.lang.Object paramObject)
  {
    ListIterator localListIterator = listIterator(size());
    while (localListIterator.hasPrevious()) {
      if (Log.equals(localListIterator.previous(), paramObject)) {
        return localListIterator.nextIndex();
      }
    }
    return -1;
  }
  
  public final ListIterator listIterator()
  {
    return new RealmResults.RealmResultsListIterator(this, 0);
  }
  
  public final ListIterator listIterator(int paramInt)
  {
    return new RealmResults.RealmResultsListIterator(this, paramInt);
  }
  
  public final java.lang.Object remove(int paramInt)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean remove(java.lang.Object paramObject)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean removeAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean retainAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final java.lang.Object set(int paramInt, java.lang.Object paramObject)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final List subList(int paramInt1, int paramInt2)
  {
    return new Shorts.ShortArrayAsList(this, paramInt1, paramInt2);
  }
  
  public final java.lang.Object[] toArray()
  {
    return Log.read(this);
  }
  
  public final java.lang.Object[] toArray(java.lang.Object[] paramArrayOfObject)
  {
    Log.get(paramArrayOfObject, "array");
    return Log.toArray(this, paramArrayOfObject);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    Iterator localIterator = iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      localObject = localIterator.next();
      i += 1;
      if (i > 1) {
        localStringBuilder.append(", ");
      }
      if (localObject == this) {
        localObject = "(this Collection)";
      } else {
        localObject = String.valueOf(localObject);
      }
      localStringBuilder.append((CharSequence)localObject);
    }
    localStringBuilder.append("]");
    java.lang.Object localObject = localStringBuilder.toString();
    Log.append(localObject, "toString(...)");
    return localObject;
  }
}
