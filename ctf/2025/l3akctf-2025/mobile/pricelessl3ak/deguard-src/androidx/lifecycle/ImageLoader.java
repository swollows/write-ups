package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class ImageLoader
{
  public static final ImageLoader this$0 = new ImageLoader();
  public final HashMap items = new HashMap();
  public final HashMap queue = new HashMap();
  
  public ImageLoader() {}
  
  public static void get(HashMap paramHashMap, Type paramType, Handle paramHandle, Class paramClass)
  {
    Handle localHandle = (Handle)paramHashMap.get(paramType);
    if ((localHandle != null) && (paramHandle != localHandle))
    {
      paramHashMap = c;
      paramType = new StringBuilder("Method ");
      paramType.append(paramHashMap.getName());
      paramType.append(" in ");
      paramType.append(paramClass.getName());
      paramType.append(" already declared with different @OnLifecycleEvent value: previous value ");
      paramType.append(localHandle);
      paramType.append(", new value ");
      paramType.append(paramHandle);
      throw new IllegalArgumentException(paramType.toString());
    }
    if (localHandle == null) {
      paramHashMap.put(paramType, paramHandle);
    }
  }
  
  public final Attribute get(Class paramClass, Method[] paramArrayOfMethod)
  {
    Object localObject2 = paramClass.getSuperclass();
    HashMap localHashMap2 = new HashMap();
    HashMap localHashMap1 = queue;
    Object localObject1;
    if (localObject2 != null)
    {
      localObject1 = (Attribute)localHashMap1.get(localObject2);
      if (localObject1 == null) {
        localObject1 = get((Class)localObject2, null);
      }
      localHashMap2.putAll(map);
    }
    localObject2 = paramClass.getInterfaces();
    int j = localObject2.length;
    int i = 0;
    Object localObject3;
    while (i < j)
    {
      localObject3 = localObject2[i];
      localObject1 = (Attribute)localHashMap1.get(localObject3);
      if (localObject1 == null) {
        localObject1 = get((Class)localObject3, null);
      }
      localObject1 = map.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)localObject1).next();
        get(localHashMap2, (Type)((Map.Entry)localObject3).getKey(), (Handle)((Map.Entry)localObject3).getValue(), paramClass);
      }
      i += 1;
    }
    if (paramArrayOfMethod == null) {}
    try
    {
      paramArrayOfMethod = paramClass.getDeclaredMethods();
      int k = paramArrayOfMethod.length;
      j = 0;
      boolean bool = false;
      while (j < k)
      {
        localObject1 = paramArrayOfMethod[j];
        localObject3 = (SmallSortedMap.Entry)((Method)localObject1).getAnnotation(y.class);
        if (localObject3 != null)
        {
          localObject2 = ((Method)localObject1).getParameterTypes();
          if (localObject2.length > 0)
          {
            if (u.class.isAssignableFrom(localObject2[0])) {
              i = 1;
            } else {
              throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
            }
          }
          else {
            i = 0;
          }
          localObject3 = ((SmallSortedMap.Entry)localObject3).value();
          if (localObject2.length > 1) {
            if (n.class.isAssignableFrom(localObject2[1]))
            {
              if (localObject3 == Handle.ON_ANY) {
                i = 2;
              } else {
                throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
              }
            }
            else {
              throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
            }
          }
          if (localObject2.length <= 2)
          {
            get(localHashMap2, new Type(i, (Method)localObject1), (Handle)localObject3, paramClass);
            bool = true;
          }
        }
        else
        {
          j += 1;
          continue;
        }
        throw new IllegalArgumentException("cannot have more than 2 params");
      }
      paramArrayOfMethod = new Attribute(localHashMap2);
      localHashMap1.put(paramClass, paramArrayOfMethod);
      items.put(paramClass, Boolean.valueOf(bool));
      return paramArrayOfMethod;
    }
    catch (NoClassDefFoundError paramClass)
    {
      throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", paramClass);
    }
  }
}
