package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import menu.h;

public final class Plot
  extends ListPopupWindow
  implements g
{
  public static final Method a;
  public app.f d;
  
  static
  {
    if (Build.VERSION.SDK_INT <= 28)
    {
      Object localObject = Boolean.TYPE;
      try
      {
        localObject = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[] { localObject });
        a = (Method)localObject;
        return;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        for (;;) {}
      }
      Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
      return;
    }
  }
  
  public final void a(menu.f paramF, h paramH)
  {
    app.f localF = d;
    if (localF != null) {
      localF.a(paramF, paramH);
    }
  }
  
  public final void b(menu.f paramF, h paramH)
  {
    app.f localF = d;
    if (localF != null) {
      localF.b(paramF, paramH);
    }
  }
  
  public final ListViewCompat show(Context paramContext, boolean paramBoolean)
  {
    paramContext = new GridView(paramContext, paramBoolean);
    paramContext.setHoverListener(this);
    return paramContext;
  }
}
