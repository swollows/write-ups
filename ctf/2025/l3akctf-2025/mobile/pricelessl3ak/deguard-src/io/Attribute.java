package io;

import java.util.Map.Entry;
import params.Log;

public final class Attribute
  implements Map.Entry, ssh.Object
{
  public final int key;
  public final StringMap this$0;
  
  public Attribute(StringMap paramStringMap, int paramInt)
  {
    this$0 = paramStringMap;
    key = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Map.Entry))
    {
      paramObject = (Map.Entry)paramObject;
      if ((Log.equals(paramObject.getKey(), getKey())) && (Log.equals(paramObject.getValue(), getValue()))) {
        return true;
      }
    }
    return false;
  }
  
  public final Object getKey()
  {
    return this$0.key[key];
  }
  
  public final Object getValue()
  {
    Object[] arrayOfObject = this$0.value;
    Log.get(arrayOfObject);
    return arrayOfObject[key];
  }
  
  public final int hashCode()
  {
    Object localObject = getKey();
    int j = 0;
    int i;
    if (localObject != null) {
      i = localObject.hashCode();
    } else {
      i = 0;
    }
    localObject = getValue();
    if (localObject != null) {
      j = localObject.hashCode();
    }
    return i ^ j;
  }
  
  public final Object setValue(Object paramObject)
  {
    StringMap localStringMap = this$0;
    localStringMap.get();
    Object[] arrayOfObject = value;
    int i;
    if (arrayOfObject == null)
    {
      i = key.length;
      if (i >= 0)
      {
        arrayOfObject = new Object[i];
        value = arrayOfObject;
      }
    }
    else
    {
      i = key;
      localStringMap = arrayOfObject[i];
      arrayOfObject[i] = paramObject;
      return localStringMap;
    }
    throw new IllegalArgumentException("capacity must be non-negative.");
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getKey());
    localStringBuilder.append('=');
    localStringBuilder.append(getValue());
    return localStringBuilder.toString();
  }
}
