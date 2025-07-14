package app;

import android.view.WindowInsets;

public abstract class View
{
  public static WindowInsets dispatchApplyWindowInsets(android.view.View paramView, WindowInsets paramWindowInsets)
  {
    int i = PreferenceKeys.LOCATION_TYPE;
    return paramView.dispatchApplyWindowInsets(paramWindowInsets);
  }
  
  public static WindowInsets onApplyWindowInsets(android.view.View paramView, WindowInsets paramWindowInsets)
  {
    return paramView.onApplyWindowInsets(paramWindowInsets);
  }
  
  public static void requestApplyInsets(android.view.View paramView)
  {
    paramView.requestApplyInsets();
  }
}
