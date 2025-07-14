package androidx.lifecycle;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public final class Type
{
  public final Method c;
  public final int d;
  
  public Type(int paramInt, Method paramMethod)
  {
    d = paramInt;
    c = paramMethod;
    paramMethod.setAccessible(true);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Type)) {
      return false;
    }
    paramObject = (Type)paramObject;
    int i = d;
    return (d == i) && (c.getName().equals(c.getName()));
  }
  
  public final int hashCode()
  {
    int i = d;
    return c.getName().hashCode() + i * 31;
  }
}
