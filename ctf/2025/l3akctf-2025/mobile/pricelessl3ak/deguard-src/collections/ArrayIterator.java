package collections;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ArrayIterator
  implements Iterator, ssh.Object
{
  public final java.lang.Object array;
  public int index;
  
  public ArrayIterator(AbstractList4 paramAbstractList4)
  {
    array = paramAbstractList4;
  }
  
  public ArrayIterator(java.lang.Object[] paramArrayOfObject)
  {
    array = paramArrayOfObject;
  }
  
  public final boolean hasNext()
  {
    switch (size)
    {
    default: 
      return index < ((java.lang.Object[])array).length;
    }
    return index < ((AbstractList4)array).get();
  }
  
  public final java.lang.Object next()
  {
    int i;
    switch (size)
    {
    default: 
      java.lang.Object[] arrayOfObject = (java.lang.Object[])array;
      i = index;
      index = (i + 1);
      return arrayOfObject[i];
    }
    if (hasNext())
    {
      i = index;
      index = (i + 1);
      return ((AbstractList4)array).get(i);
    }
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    switch (size)
    {
    default: 
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}
