package menu;

import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;

public final class d
  implements ActionProvider.VisibilityListener
{
  public final ActionProvider a;
  public app.f b;
  
  public d(MenuItemWrapper paramMenuItemWrapper, ActionProvider paramActionProvider)
  {
    f = paramMenuItemWrapper;
    a = paramActionProvider;
  }
  
  public final void onActionProviderVisibilityChanged(boolean paramBoolean)
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = a).b;
      mIsVisibleItemsStale = true;
      ((f)localObject).b(true);
    }
  }
}
