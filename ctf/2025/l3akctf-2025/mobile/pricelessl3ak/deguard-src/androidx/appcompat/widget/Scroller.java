package androidx.appcompat.widget;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public abstract class Scroller
{
  public static final Method a;
  public static final Method b;
  public static final Method c;
  public static final boolean g;
  
  static
  {
    Object localObject1 = Integer.TYPE;
    Object localObject2 = Boolean.TYPE;
    Class localClass = Float.TYPE;
    try
    {
      localObject2 = AbsListView.class.getDeclaredMethod("positionSelector", new Class[] { localObject1, View.class, localObject2, localClass, localClass });
      a = (Method)localObject2;
      ((AccessibleObject)localObject2).setAccessible(true);
      localObject2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[] { localObject1 });
      c = (Method)localObject2;
      ((AccessibleObject)localObject2).setAccessible(true);
      localObject1 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[] { localObject1 });
      b = (Method)localObject1;
      ((AccessibleObject)localObject1).setAccessible(true);
      g = true;
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      localNoSuchMethodException.printStackTrace();
    }
  }
}
