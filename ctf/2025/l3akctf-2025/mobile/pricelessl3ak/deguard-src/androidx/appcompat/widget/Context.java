package androidx.appcompat.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

public abstract class Context
{
  public static final int[] b;
  public static final int[] m = { 16842912 };
  
  static
  {
    b = new int[0];
    new Rect();
  }
  
  public static PorterDuff.Mode parseTintMode(int paramInt, PorterDuff.Mode paramMode)
  {
    if (paramInt != 3)
    {
      if (paramInt != 5)
      {
        if (paramInt != 9)
        {
          switch (paramInt)
          {
          default: 
            return paramMode;
          case 16: 
            return PorterDuff.Mode.ADD;
          case 15: 
            return PorterDuff.Mode.SCREEN;
          }
          return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_ATOP;
      }
      return PorterDuff.Mode.SRC_IN;
    }
    return PorterDuff.Mode.SRC_OVER;
  }
  
  public static void update(Drawable paramDrawable)
  {
    Object localObject = paramDrawable.getClass().getName();
    int i = Build.VERSION.SDK_INT;
    if ((i >= 29) && (i < 31) && ("android.graphics.drawable.ColorStateListDrawable".equals(localObject)))
    {
      localObject = paramDrawable.getState();
      if ((localObject != null) && (localObject.length != 0)) {
        paramDrawable.setState(b);
      } else {
        paramDrawable.setState(m);
      }
      paramDrawable.setState((int[])localObject);
    }
  }
}
