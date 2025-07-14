package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import menu.f;
import menu.h;
import menu.l;
import menu.p;

public final class i
  extends menu.i
{
  public i(b paramB, Context paramContext, f paramF, View paramView)
  {
    super(2130903072, paramContext, paramView, paramF, true);
    f = 8388613;
    paramB = j;
    v = paramB;
    paramContext = l;
    if (paramContext != null) {
      paramContext.a(paramB);
    }
  }
  
  public i(b paramB, Context paramContext, p paramP, View paramView)
  {
    super(2130903072, paramContext, paramView, paramP, false);
    if (!e.a())
    {
      paramP = mOverflowButton;
      paramContext = paramP;
      if (paramP == null) {
        paramContext = (View)mMenuView;
      }
      a = paramContext;
    }
    paramB = j;
    v = paramB;
    paramContext = l;
    if (paramContext != null) {
      paramContext.a(paramB);
    }
  }
  
  public final void b()
  {
    switch (f)
    {
    default: 
      localB = e;
      f localF = c;
      if (localF != null) {
        localF.a(true);
      }
      h = null;
      super.b();
      return;
    }
    b localB = e;
    m = null;
    localB.getClass();
    super.b();
  }
}
