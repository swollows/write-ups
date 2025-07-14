package bsh;

import V.b;
import V.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import http.AbstractMultimap;
import http.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class ByteVector
{
  public final ConcurrentHashMap b;
  public final ConcurrentHashMap buffer;
  public final ConcurrentHashMap c;
  
  public ByteVector(ConcurrentHashMap paramConcurrentHashMap1, ConcurrentHashMap paramConcurrentHashMap2, ConcurrentHashMap paramConcurrentHashMap3)
  {
    buffer = paramConcurrentHashMap1;
    b = paramConcurrentHashMap2;
    c = paramConcurrentHashMap3;
  }
  
  public abstract Attribute a();
  
  public abstract boolean a(int paramInt);
  
  public final Token get()
  {
    Object localObject2 = buffer.readString();
    if (localObject2 == null) {
      return null;
    }
    Object localObject1 = a();
    try
    {
      localObject2 = get((String)localObject2);
      localObject1 = ((Method)localObject2).invoke(null, new Object[] { localObject1 });
      return (Token)localObject1;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label74;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      break label85;
    }
    catch (IllegalAccessException localIllegalAccessException) {}
    throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", localIllegalAccessException);
    label74:
    throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", localIllegalAccessException);
    label85:
    if ((localIllegalAccessException.getCause() instanceof RuntimeException)) {
      throw ((RuntimeException)localIllegalAccessException.getCause());
    }
    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", localIllegalAccessException);
    throw new RuntimeException("VersionedParcel encountered IllegalAccessException", localIllegalAccessException);
  }
  
  public final Class get(Class paramClass)
  {
    Object localObject1 = paramClass.getName();
    ConcurrentHashMap localConcurrentHashMap = c;
    Object localObject2 = (Class)localConcurrentHashMap.get(localObject1);
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = paramClass.getPackage().getName();
      localObject2 = paramClass.getSimpleName();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(".");
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append("Parcelizer");
      localObject1 = Class.forName(localStringBuilder.toString(), false, paramClass.getClassLoader());
      localConcurrentHashMap.put(paramClass.getName(), localObject1);
    }
    return localObject1;
  }
  
  public final Method get(String paramString)
  {
    ConcurrentHashMap localConcurrentHashMap = buffer;
    Method localMethod2 = (Method)localConcurrentHashMap.get(paramString);
    Method localMethod1 = localMethod2;
    if (localMethod2 == null)
    {
      System.currentTimeMillis();
      localMethod1 = Class.forName(paramString, true, b.class.getClassLoader()).getDeclaredMethod("read", new Class[] { b.class });
      localConcurrentHashMap.put(paramString, localMethod1);
    }
    return localMethod1;
  }
  
  public final Parcelable write(Parcelable paramParcelable, int paramInt)
  {
    if (!a(paramInt)) {
      return paramParcelable;
    }
    paramParcelable = (Attribute)this;
    ClassLoader localClassLoader = c.class.getClassLoader();
    return buffer.readParcelable(localClassLoader);
  }
  
  public final Method write(Class paramClass)
  {
    Object localObject = paramClass.getName();
    ConcurrentHashMap localConcurrentHashMap = b;
    Method localMethod = (Method)localConcurrentHashMap.get(localObject);
    localObject = localMethod;
    if (localMethod == null)
    {
      localObject = get(paramClass);
      System.currentTimeMillis();
      localObject = ((Class)localObject).getDeclaredMethod("write", new Class[] { paramClass, b.class });
      localConcurrentHashMap.put(paramClass.getName(), localObject);
    }
    return localObject;
  }
  
  public abstract void write(int paramInt);
  
  public final void write(Token paramToken)
  {
    if (paramToken == null)
    {
      buffer.writeString(null);
      return;
    }
    try
    {
      Object localObject = get(paramToken.getClass());
      localObject = ((Class)localObject).getName();
      buffer.writeString((String)localObject);
      localObject = a();
      try
      {
        Method localMethod = write(paramToken.getClass());
        localMethod.invoke(null, new Object[] { paramToken, localObject });
        int i = a;
        if (i < 0) {
          return;
        }
        i = c.get(i);
        paramToken = buffer;
        int j = paramToken.dataPosition();
        paramToken.setDataPosition(i);
        paramToken.writeInt(j - i);
        paramToken.setDataPosition(j);
        return;
      }
      catch (ClassNotFoundException paramToken) {}catch (NoSuchMethodException paramToken)
      {
        break label157;
      }
      catch (InvocationTargetException paramToken)
      {
        break label168;
      }
      catch (IllegalAccessException paramToken) {}
      throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", paramToken);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      label157:
      throw new RuntimeException(paramToken.getClass().getSimpleName().concat(" does not have a Parcelizer"), localClassNotFoundException);
    }
    throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", paramToken);
    label168:
    if ((paramToken.getCause() instanceof RuntimeException)) {
      throw ((RuntimeException)paramToken.getCause());
    }
    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", paramToken);
    throw new RuntimeException("VersionedParcel encountered IllegalAccessException", paramToken);
  }
}
