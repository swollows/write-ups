package androidx.appcompat.app;

import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import menu.f;
import menu.i;
import menu.v;

public final class b
  implements menu.Object
{
  public boolean i;
  
  public b(ToolbarActionBar paramToolbarActionBar)
  {
    h = paramToolbarActionBar;
  }
  
  public final void a(f paramF, boolean paramBoolean)
  {
    if (i) {
      return;
    }
    i = true;
    ToolbarActionBar localToolbarActionBar = h;
    Object localObject = mToolbar.mToolbar.mMenuView;
    if (localObject != null)
    {
      localObject = mPresenter;
      if (localObject != null)
      {
        ((androidx.appcompat.widget.b)localObject).hideOverflowMenu();
        localObject = m;
        if ((localObject != null) && (((i)localObject).a())) {
          l.dismiss();
        }
      }
    }
    this$0.onPanelClosed(108, paramF);
    i = false;
  }
  
  public final boolean a(f paramF)
  {
    h.this$0.onMenuOpened(108, paramF);
    return true;
  }
}
