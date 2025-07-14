package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

public final class Attribute
{
  public final HashMap b;
  public final HashMap map;
  
  public Attribute(HashMap paramHashMap) {}
  
  public static void a(List paramList, x paramX, Handle paramHandle, SupportMenuItem paramSupportMenuItem)
  {
    if (paramList != null)
    {
      int i = paramList.size() - 1;
      while (i >= 0)
      {
        Object localObject = (Type)paramList.get(i);
        localObject.getClass();
        int j = d;
        localObject = c;
        if (j != 0)
        {
          if (j != 1)
          {
            if (j == 2) {
              try
              {
                ((Method)localObject).invoke(paramSupportMenuItem, new Object[] { paramX, paramHandle });
              }
              catch (IllegalAccessException paramList)
              {
                break label137;
              }
              catch (InvocationTargetException paramList)
              {
                break label146;
              }
            }
          }
          else {
            ((Method)localObject).invoke(paramSupportMenuItem, new Object[] { paramX });
          }
        }
        else {
          ((Method)localObject).invoke(paramSupportMenuItem, null);
        }
        i -= 1;
        continue;
        label137:
        throw new RuntimeException(paramList);
        label146:
        throw new RuntimeException("Failed to call observer method", ((InvocationTargetException)paramList).getCause());
      }
    }
  }
}
