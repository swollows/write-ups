package collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import params.Log;

public final class EmptyList
  implements List, Serializable, RandomAccess, ssh.Object
{
  public static final EmptyList v;
  
  static
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
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
  
  public final boolean contains(java.lang.Object paramObject)
  {
    if (!(paramObject instanceof Void)) {
      return false;
    }
    Log.get((Void)paramObject, "element");
    return false;
  }
  
  public final boolean containsAll(Collection paramCollection)
  {
    Log.get(paramCollection, "elements");
    return paramCollection.isEmpty();
  }
  
  public final boolean equals(java.lang.Object paramObject)
  {
    return ((paramObject instanceof List)) && (((List)paramObject).isEmpty());
  }
  
  public final java.lang.Object get(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder("Empty list doesn't contain element at index ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append('.');
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public final int hashCode()
  {
    return 1;
  }
  
  public final int indexOf(java.lang.Object paramObject)
  {
    if (!(paramObject instanceof Void)) {
      return -1;
    }
    Log.get((Void)paramObject, "element");
    return -1;
  }
  
  public final boolean isEmpty()
  {
    return true;
  }
  
  public final Iterator iterator()
  {
    return EmptyIterator.EMPTY_LIST_ITERATOR;
  }
  
  public final int lastIndexOf(java.lang.Object paramObject)
  {
    if (!(paramObject instanceof Void)) {
      return -1;
    }
    Log.get((Void)paramObject, "element");
    return -1;
  }
  
  public final ListIterator listIterator()
  {
    return EmptyIterator.EMPTY_LIST_ITERATOR;
  }
  
  public final ListIterator listIterator(int paramInt)
  {
    if (paramInt == 0) {
      return EmptyIterator.EMPTY_LIST_ITERATOR;
    }
    StringBuilder localStringBuilder = new StringBuilder("Index: ");
    localStringBuilder.append(paramInt);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
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
  
  public final List subList(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      return this;
    }
    StringBuilder localStringBuilder = new StringBuilder("fromIndex: ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(", toIndex: ");
    localStringBuilder.append(paramInt2);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
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
    return "[]";
  }
}
