package app;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.ViewConfiguration;

public abstract class Common
{
  static
  {
    if (Build.VERSION.SDK_INT == 25)
    {
      try
      {
        ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
        return;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
      Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
      return;
    }
  }
}
