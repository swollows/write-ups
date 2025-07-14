package androidx.appcompat.widget;

import android.widget.AbsListView;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public abstract class Message
{
  public static final Field settings;
  
  static
  {
    Object localObject = null;
    try
    {
      Field localField2 = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      Field localField1 = localField2;
      localObject = localField1;
      localField2.setAccessible(true);
      localObject = localField1;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      localNoSuchFieldException.printStackTrace();
    }
    settings = localObject;
  }
}
