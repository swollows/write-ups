package map;

import collections.AbstractList4;
import java.io.Serializable;
import params.Log;

public final class LazyList
  extends AbstractList4
  implements OverlayList, Serializable
{
  public final Enum[] buffer;
  
  public LazyList(Enum[] paramArrayOfEnum)
  {
    buffer = paramArrayOfEnum;
  }
  
  public final boolean contains(Object paramObject)
  {
    if (!(paramObject instanceof Enum)) {
      return false;
    }
    Enum localEnum = (Enum)paramObject;
    Log.get(localEnum, "element");
    int i = localEnum.ordinal();
    paramObject = buffer;
    Log.get(paramObject, "<this>");
    if ((i >= 0) && (i < paramObject.length)) {
      paramObject = paramObject[i];
    } else {
      paramObject = null;
    }
    return paramObject == localEnum;
  }
  
  public final int get()
  {
    return buffer.length;
  }
  
  public final Object get(int paramInt)
  {
    Object localObject = buffer;
    int i = localObject.length;
    if ((paramInt >= 0) && (paramInt < i)) {
      return localObject[paramInt];
    }
    localObject = new StringBuilder("index: ");
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append(", size: ");
    ((StringBuilder)localObject).append(i);
    throw new IndexOutOfBoundsException(((StringBuilder)localObject).toString());
  }
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Enum)) {
      return -1;
    }
    Enum localEnum = (Enum)paramObject;
    Log.get(localEnum, "element");
    int i = localEnum.ordinal();
    paramObject = buffer;
    Log.get(paramObject, "<this>");
    if ((i >= 0) && (i < paramObject.length)) {
      paramObject = paramObject[i];
    } else {
      paramObject = null;
    }
    if (paramObject == localEnum) {
      return i;
    }
    return -1;
  }
  
  public final int lastIndexOf(Object paramObject)
  {
    if (!(paramObject instanceof Enum)) {
      return -1;
    }
    paramObject = (Enum)paramObject;
    Log.get(paramObject, "element");
    return indexOf(paramObject);
  }
}
