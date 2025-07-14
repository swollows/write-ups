package menu;

import android.view.CollapsibleActionView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import view.MenuItem;

public final class m
  extends FrameLayout
  implements MenuItem
{
  public final CollapsibleActionView a;
  
  public m(View paramView)
  {
    super(paramView.getContext());
    a = ((CollapsibleActionView)paramView);
    addView(paramView);
  }
}
