package menu;

import android.widget.PopupWindow.OnDismissListener;

public final class MenuPopupHelper
  implements PopupWindow.OnDismissListener
{
  public MenuPopupHelper(i paramI)
  {
    mMenu = paramI;
  }
  
  public final void onDismiss()
  {
    mMenu.b();
  }
}
