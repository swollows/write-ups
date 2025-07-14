package app;

import android.view.View;
import android.view.WindowInsets;

public abstract class Menu
{
  public static TypeToken get(View paramView)
  {
    Object localObject = paramView.getRootWindowInsets();
    if (localObject == null) {
      return null;
    }
    localObject = TypeToken.get((WindowInsets)localObject, null);
    Elements localElements = a;
    localElements.set((TypeToken)localObject);
    localElements.set(paramView.getRootView());
    return localObject;
  }
  
  public static void setScrollIndicators(View paramView, int paramInt1, int paramInt2)
  {
    paramView.setScrollIndicators(paramInt1, paramInt2);
  }
}
