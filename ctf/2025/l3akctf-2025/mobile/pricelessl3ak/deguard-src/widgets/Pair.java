package widgets;

import java.io.Serializable;
import params.Log;

public final class Pair
  implements Serializable
{
  public final Object key;
  public final Object name;
  
  public Pair(Object paramObject1, Object paramObject2)
  {
    name = paramObject1;
    key = paramObject2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Pair)) {
      return false;
    }
    paramObject = (Pair)paramObject;
    Object localObject = name;
    if (!Log.equals(name, localObject)) {
      return false;
    }
    return Log.equals(key, key);
  }
  
  public final int hashCode()
  {
    int j = 0;
    Object localObject = name;
    int i;
    if (localObject == null) {
      i = 0;
    } else {
      i = localObject.hashCode();
    }
    localObject = key;
    if (localObject != null) {
      j = localObject.hashCode();
    }
    return i * 31 + j;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("(");
    localStringBuilder.append(name);
    localStringBuilder.append(", ");
    localStringBuilder.append(key);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}
