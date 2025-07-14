package androidx.lifecycle;

import android.app.Application;
import app.Element;
import drupal.Context;
import handle.AnnotationVisitor;
import handle.Handle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import params.Log;

public final class Item
  extends AnnotationWriter
{
  public static final Element a = new Element(18);
  public static Item g;
  public final Application d;
  
  public Item(Application paramApplication)
  {
    super();
    d = paramApplication;
  }
  
  public final Label a(Class paramClass)
  {
    Application localApplication = d;
    if (localApplication != null) {
      return a(paramClass, localApplication);
    }
    throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
  }
  
  public final Label a(Class paramClass, Application paramApplication)
  {
    if (a.class.isAssignableFrom(paramClass))
    {
      try
      {
        localObject = paramClass.getConstructor(new Class[] { Application.class });
        paramApplication = ((Constructor)localObject).newInstance(new Object[] { paramApplication });
        paramClass = (Label)paramApplication;
        Log.get(paramClass);
        return paramClass;
      }
      catch (InvocationTargetException paramApplication) {}catch (InstantiationException paramApplication)
      {
        break label92;
      }
      catch (IllegalAccessException paramApplication)
      {
        break label121;
      }
      catch (NoSuchMethodException paramApplication) {}
      Object localObject = new StringBuilder("Cannot create an instance of ");
      ((StringBuilder)localObject).append(paramClass);
      throw new RuntimeException(((StringBuilder)localObject).toString(), paramApplication);
      label92:
      localObject = new StringBuilder("Cannot create an instance of ");
      ((StringBuilder)localObject).append(paramClass);
      throw new RuntimeException(((StringBuilder)localObject).toString(), paramApplication);
      label121:
      localObject = new StringBuilder("Cannot create an instance of ");
      ((StringBuilder)localObject).append(paramClass);
      throw new RuntimeException(((StringBuilder)localObject).toString(), paramApplication);
      localObject = new StringBuilder("Cannot create an instance of ");
      ((StringBuilder)localObject).append(paramClass);
      throw new RuntimeException(((StringBuilder)localObject).toString(), paramApplication);
    }
    return Context.read(paramClass);
  }
  
  public final Label a(Class paramClass, AnnotationVisitor paramAnnotationVisitor)
  {
    if (d != null) {
      return a(paramClass);
    }
    Element localElement = a;
    paramAnnotationVisitor = (Application)c.get(localElement);
    if (paramAnnotationVisitor != null) {
      return a(paramClass, paramAnnotationVisitor);
    }
    if (!a.class.isAssignableFrom(paramClass)) {
      return Context.read(paramClass);
    }
    throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
  }
}
