package androidx.lifecycle;

import drupal.Context;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import params.Log;

public abstract class ByteVector
{
  public static final HashMap a = new HashMap();
  public static final HashMap c = new HashMap();
  
  public static int get(Class paramClass)
  {
    HashMap localHashMap = a;
    Object localObject1 = (Integer)localHashMap.get(paramClass);
    if (localObject1 != null) {
      return ((Integer)localObject1).intValue();
    }
    localObject1 = paramClass.getCanonicalName();
    int k = 1;
    int i;
    Class[] arrayOfClass;
    if (localObject1 == null) {
      i = k;
    } else {
      arrayOfClass = null;
    }
    try
    {
      try
      {
        localObject1 = paramClass.getPackage();
        localObject3 = paramClass.getCanonicalName();
        localObject2 = localObject3;
        if (localObject1 != null) {
          localObject1 = ((Package)localObject1).getName();
        }
      }
      catch (NoSuchMethodException paramClass)
      {
        break label265;
      }
      localObject1 = "";
      Log.get(localObject1);
      i = ((String)localObject1).length();
      if (i != 0)
      {
        Log.get(localObject3);
        i = ((String)localObject1).length();
        localObject3 = ((String)localObject3).substring(i + 1);
        localObject2 = localObject3;
        Log.append(localObject3, "substring(...)");
      }
      Log.get(localObject2);
      localObject3 = read((String)localObject2);
      localObject2 = localObject3;
      i = ((String)localObject1).length();
      if (i == 0)
      {
        localObject1 = localObject2;
      }
      else
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append('.');
        ((StringBuilder)localObject2).append((String)localObject3);
        localObject1 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = Class.forName((String)localObject1);
      localObject3 = ((Class)localObject1).getDeclaredConstructor(new Class[] { paramClass });
      localObject2 = localObject3;
      bool = ((AccessibleObject)localObject3).isAccessible();
      localObject1 = localObject2;
      if (bool) {
        break label277;
      }
      ((AccessibleObject)localObject3).setAccessible(true);
      localObject1 = localObject2;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      Object localObject3;
      Object localObject2;
      boolean bool;
      label265:
      for (;;) {}
    }
    throw new RuntimeException(paramClass);
    localObject1 = null;
    label277:
    localObject3 = c;
    if (localObject1 != null) {
      ((HashMap)localObject3).put(paramClass, Context.create(localObject1));
    }
    for (;;)
    {
      i = 2;
      break label668;
      localObject1 = ImageLoader.this$0;
      localObject2 = items;
      Object localObject4 = (Boolean)((HashMap)localObject2).get(paramClass);
      if (localObject4 != null) {
        bool = ((Boolean)localObject4).booleanValue();
      }
      try
      {
        localObject4 = paramClass.getDeclaredMethods();
        int j = localObject4.length;
        i = 0;
        while (i < j)
        {
          if ((SmallSortedMap.Entry)localObject4[i].getAnnotation(y.class) != null)
          {
            ((ImageLoader)localObject1).get(paramClass, (Method[])localObject4);
            bool = true;
            break label409;
          }
          i += 1;
        }
        ((HashMap)localObject2).put(paramClass, Boolean.FALSE);
        bool = false;
        label409:
        if (bool)
        {
          i = k;
        }
        else
        {
          localObject1 = paramClass.getSuperclass();
          if ((localObject1 != null) && (t.class.isAssignableFrom((Class)localObject1))) {
            i = 1;
          } else {
            i = 0;
          }
          localObject2 = arrayOfClass;
          if (i != 0)
          {
            Log.get(localObject1);
            if (get((Class)localObject1) == 1)
            {
              i = k;
            }
            else
            {
              localObject1 = ((HashMap)localObject3).get(localObject1);
              Log.get(localObject1);
              localObject2 = new ArrayList((Collection)localObject1);
            }
          }
          else
          {
            arrayOfClass = paramClass.getInterfaces();
            Log.get(arrayOfClass, "array");
            i = 0;
            if (i < arrayOfClass.length) {
              j = 1;
            } else {
              j = 0;
            }
            if (j != 0)
            {
              localObject4 = arrayOfClass[i];
              if ((localObject4 != null) && (t.class.isAssignableFrom((Class)localObject4))) {
                j = 1;
              } else {
                j = 0;
              }
              if (j == 0) {
                localObject1 = localObject2;
              }
              for (;;)
              {
                i += 1;
                localObject2 = localObject1;
                break;
                Log.get(localObject4);
                if (get((Class)localObject4) == 1)
                {
                  i = k;
                  break label668;
                }
                localObject1 = localObject2;
                if (localObject2 == null) {
                  localObject1 = new ArrayList();
                }
                localObject2 = ((HashMap)localObject3).get(localObject4);
                Log.get(localObject2);
                ((List)localObject1).addAll((Collection)localObject2);
              }
            }
            i = k;
            if (localObject2 != null)
            {
              ((HashMap)localObject3).put(paramClass, localObject2);
              continue;
            }
          }
        }
        label668:
        localHashMap.put(paramClass, Integer.valueOf(i));
        return i;
      }
      catch (NoClassDefFoundError paramClass)
      {
        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", paramClass);
      }
    }
  }
  
  public static final String read(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    int k = paramString.indexOf(".", 0);
    int j = k;
    if (k >= 0)
    {
      k = paramString.length();
      if (k >= 0)
      {
        Object localObject = new StringBuilder(k);
        int m;
        do
        {
          ((StringBuilder)localObject).append(paramString, i, j);
          ((StringBuilder)localObject).append("_");
          k = j + 1;
          if (j >= paramString.length()) {
            break;
          }
          m = paramString.indexOf(".", k);
          j = m;
          i = k;
        } while (m > 0);
        ((StringBuilder)localObject).append(paramString, k, paramString.length());
        localObject = ((StringBuilder)localObject).toString();
        paramString = (String)localObject;
        Log.append(localObject, "toString(...)");
      }
    }
    else
    {
      localStringBuilder.append(paramString);
      localStringBuilder.append("_LifecycleAdapter");
      return localStringBuilder.toString();
    }
    throw new OutOfMemoryError();
  }
  
  public static void read(Constructor paramConstructor, SupportMenuItem paramSupportMenuItem)
  {
    try
    {
      Log.get(paramConstructor.newInstance(new Object[] { paramSupportMenuItem }));
      paramConstructor = new ClassCastException();
      throw paramConstructor;
    }
    catch (InvocationTargetException paramConstructor) {}catch (InstantiationException paramConstructor)
    {
      break label46;
    }
    catch (IllegalAccessException paramConstructor) {}
    throw new RuntimeException(paramConstructor);
    label46:
    throw new RuntimeException(paramConstructor);
    throw new RuntimeException(paramConstructor);
  }
}
