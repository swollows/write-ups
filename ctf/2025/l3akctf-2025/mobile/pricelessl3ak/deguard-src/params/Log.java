package params;

import i0.d;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class Log
{
  public static final Object[] s = new Object[0];
  
  public static void add(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return;
    }
    paramObject = new NullPointerException(paramString);
    get(paramObject, d.class.getName());
    throw paramObject;
  }
  
  public static void append(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return;
    }
    paramObject = new NullPointerException(paramString.concat(" must not be null"));
    get(paramObject, d.class.getName());
    throw paramObject;
  }
  
  public static boolean equals(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      return paramObject2 == null;
    }
    return paramObject1.equals(paramObject2);
  }
  
  public static void get(Object paramObject)
  {
    if (paramObject != null) {
      return;
    }
    paramObject = new NullPointerException();
    get(paramObject, d.class.getName());
    throw paramObject;
  }
  
  public static void get(Object paramObject, String paramString)
  {
    if (paramObject == null)
    {
      paramObject = Thread.currentThread().getStackTrace();
      String str = d.class.getName();
      int i = 0;
      int j;
      for (;;)
      {
        j = i;
        if (paramObject[i].getClassName().equals(str)) {
          break;
        }
        i += 1;
      }
      while (paramObject[j].getClassName().equals(str)) {
        j += 1;
      }
      str = paramObject[j];
      paramObject = str.getClassName();
      str = str.getMethodName();
      StringBuilder localStringBuilder = new StringBuilder("Parameter specified as non-null is null: method ");
      localStringBuilder.append(paramObject);
      localStringBuilder.append(".");
      localStringBuilder.append(str);
      localStringBuilder.append(", parameter ");
      localStringBuilder.append(paramString);
      paramObject = new NullPointerException(localStringBuilder.toString());
      get(paramObject, d.class.getName());
      throw paramObject;
    }
  }
  
  public static void get(RuntimeException paramRuntimeException, String paramString)
  {
    StackTraceElement[] arrayOfStackTraceElement = paramRuntimeException.getStackTrace();
    int k = arrayOfStackTraceElement.length;
    int j = -1;
    int i = 0;
    while (i < k)
    {
      if (paramString.equals(arrayOfStackTraceElement[i].getClassName())) {
        j = i;
      }
      i += 1;
    }
    paramRuntimeException.setStackTrace((StackTraceElement[])Arrays.copyOfRange(arrayOfStackTraceElement, j + 1, k));
  }
  
  public static final Object[] read(Collection paramCollection)
  {
    int i = paramCollection.size();
    Object localObject = s;
    if (i == 0) {
      return localObject;
    }
    Iterator localIterator = paramCollection.iterator();
    if (!localIterator.hasNext()) {
      return localObject;
    }
    paramCollection = new Object[i];
    i = 0;
    int j = i + 1;
    paramCollection[i] = localIterator.next();
    if (j >= paramCollection.length)
    {
      if (!localIterator.hasNext()) {
        return paramCollection;
      }
      int k = j * 3 + 1 >>> 1;
      i = k;
      if (k <= j)
      {
        i = 2147483645;
        if (j >= 2147483645) {
          throw new OutOfMemoryError();
        }
      }
      localObject = Arrays.copyOf(paramCollection, i);
      paramCollection = (Collection)localObject;
      append(localObject, "copyOf(...)");
      localObject = paramCollection;
    }
    do
    {
      i = j;
      paramCollection = (Collection)localObject;
      break;
      localObject = paramCollection;
    } while (localIterator.hasNext());
    paramCollection = Arrays.copyOf(paramCollection, j);
    append(paramCollection, "copyOf(...)");
    return paramCollection;
  }
  
  public static final Object[] toArray(Collection paramCollection, Object[] paramArrayOfObject)
  {
    int j = paramCollection.size();
    int i = 0;
    if (j == 0)
    {
      paramCollection = paramArrayOfObject;
      if (paramArrayOfObject.length > 0)
      {
        paramArrayOfObject[0] = null;
        return paramArrayOfObject;
      }
    }
    else
    {
      Iterator localIterator = paramCollection.iterator();
      if (!localIterator.hasNext())
      {
        paramCollection = paramArrayOfObject;
        if (paramArrayOfObject.length > 0)
        {
          paramArrayOfObject[0] = null;
          return paramArrayOfObject;
        }
      }
      else
      {
        if (j <= paramArrayOfObject.length)
        {
          paramCollection = paramArrayOfObject;
        }
        else
        {
          paramCollection = Array.newInstance(paramArrayOfObject.getClass().getComponentType(), j);
          add(paramCollection, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
          paramCollection = (Object[])paramCollection;
        }
        j = i + 1;
        paramCollection[i] = localIterator.next();
        Object localObject;
        if (j >= paramCollection.length)
        {
          if (!localIterator.hasNext()) {
            return paramCollection;
          }
          int k = j * 3 + 1 >>> 1;
          i = k;
          if (k <= j)
          {
            i = 2147483645;
            if (j >= 2147483645) {
              throw new OutOfMemoryError();
            }
          }
          localObject = Arrays.copyOf(paramCollection, i);
          paramCollection = (Collection)localObject;
          append(localObject, "copyOf(...)");
          localObject = paramCollection;
        }
        do
        {
          i = j;
          paramCollection = (Collection)localObject;
          break;
          localObject = paramCollection;
        } while (localIterator.hasNext());
        if (paramCollection == paramArrayOfObject)
        {
          paramArrayOfObject[j] = null;
          return paramArrayOfObject;
        }
        paramCollection = Arrays.copyOf(paramCollection, j);
        append(paramCollection, "copyOf(...)");
      }
    }
    return paramCollection;
  }
}
