package app;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import util.Headers;

public final class LongMap
  extends DeltaBaseCache
{
  public static boolean hasZeroValue;
  public static boolean mask;
  public static Constructor size;
  public static Field zeroValue;
  public WindowInsets g;
  public Headers table;
  
  public LongMap()
  {
    g = remove();
  }
  
  public LongMap(TypeToken paramTypeToken)
  {
    super(paramTypeToken);
    g = paramTypeToken.unwrap();
  }
  
  private static WindowInsets remove()
  {
    if (!hasZeroValue)
    {
      try
      {
        Field localField = WindowInsets.class.getDeclaredField("CONSUMED");
        zeroValue = localField;
      }
      catch (ReflectiveOperationException localReflectiveOperationException1)
      {
        Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", localReflectiveOperationException1);
      }
      hasZeroValue = true;
    }
    Object localObject1 = zeroValue;
    if (localObject1 != null) {
      try
      {
        localObject1 = ((Field)localObject1).get(null);
        localObject1 = (WindowInsets)localObject1;
        if (localObject1 != null)
        {
          localObject1 = new WindowInsets((WindowInsets)localObject1);
          return localObject1;
        }
      }
      catch (ReflectiveOperationException localReflectiveOperationException2)
      {
        Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", localReflectiveOperationException2);
      }
    }
    if (!mask)
    {
      try
      {
        Constructor localConstructor = WindowInsets.class.getConstructor(new Class[] { Rect.class });
        size = localConstructor;
      }
      catch (ReflectiveOperationException localReflectiveOperationException3)
      {
        Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", localReflectiveOperationException3);
      }
      mask = true;
    }
    Object localObject2 = size;
    if (localObject2 != null) {
      try
      {
        Rect localRect = new Rect();
        localObject2 = ((Constructor)localObject2).newInstance(new Object[] { localRect });
        return (WindowInsets)localObject2;
      }
      catch (ReflectiveOperationException localReflectiveOperationException4)
      {
        Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", localReflectiveOperationException4);
      }
    }
    return null;
  }
  
  public TypeToken get()
  {
    put();
    TypeToken localTypeToken = TypeToken.get(g, null);
    Elements localElements = a;
    localElements.set(null);
    localElements.init(table);
    return localTypeToken;
  }
  
  public void get(Headers paramHeaders)
  {
    WindowInsets localWindowInsets = g;
    if (localWindowInsets != null)
    {
      int i = left;
      int j = height;
      int k = top;
      g = localWindowInsets.replaceSystemWindowInsets(i, right, j, k);
    }
  }
  
  public void put(Headers paramHeaders)
  {
    table = paramHeaders;
  }
}
