package view;

import android.view.Menu;
import android.view.Window.Callback;
import java.util.List;

public abstract class f
{
  public static void a(Window.Callback paramCallback, List paramList, Menu paramMenu, int paramInt)
  {
    paramCallback.onProvideKeyboardShortcuts(paramList, paramMenu, paramInt);
  }
}
