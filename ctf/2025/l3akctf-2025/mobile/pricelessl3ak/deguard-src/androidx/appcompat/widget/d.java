package androidx.appcompat.widget;

import android.content.Context;
import android.view.CollapsibleActionView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import menu.f;
import menu.h;
import menu.l;
import menu.m;
import menu.p;
import view.MenuItem;

public final class d
  implements l
{
  public h a;
  public f mMenu;
  
  public d(Toolbar paramToolbar)
  {
    d = paramToolbar;
  }
  
  public final void a(f paramF, boolean paramBoolean) {}
  
  public final boolean a()
  {
    return false;
  }
  
  public final boolean a(h paramH)
  {
    Toolbar localToolbar = d;
    localToolbar.ensureCollapseButtonView();
    Object localObject = mCollapseButtonView.getParent();
    if (localObject != localToolbar)
    {
      if ((localObject instanceof ViewGroup)) {
        ((ViewGroup)localObject).removeView(mCollapseButtonView);
      }
      localToolbar.addView(mCollapseButtonView);
    }
    localObject = paramH.getActionView();
    mExpandedActionView = ((View)localObject);
    a = paramH;
    localObject = ((View)localObject).getParent();
    if (localObject != localToolbar)
    {
      if ((localObject instanceof ViewGroup)) {
        ((ViewGroup)localObject).removeView(mExpandedActionView);
      }
      localObject = Toolbar.init();
      gravity = (mButtonGravity & 0x70 | 0x800003);
      mViewType = 2;
      mExpandedActionView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      localToolbar.addView(mExpandedActionView);
    }
    int i = localToolbar.getChildCount() - 1;
    while (i >= 0)
    {
      localObject = localToolbar.getChildAt(i);
      if ((getLayoutParamsmViewType != 2) && (localObject != mMenuView))
      {
        localToolbar.removeViewAt(i);
        mHiddenViews.add(localObject);
      }
      i -= 1;
    }
    localToolbar.requestLayout();
    r = true;
    b.b(false);
    paramH = mExpandedActionView;
    if ((paramH instanceof MenuItem)) {
      a.onActionViewExpanded();
    }
    localToolbar.a();
    return true;
  }
  
  public final boolean a(p paramP)
  {
    return false;
  }
  
  public final boolean b(h paramH)
  {
    Toolbar localToolbar = d;
    Object localObject = mExpandedActionView;
    if ((localObject instanceof MenuItem)) {
      a.onActionViewCollapsed();
    }
    localToolbar.removeView(mExpandedActionView);
    localToolbar.removeView(mCollapseButtonView);
    mExpandedActionView = null;
    localObject = mHiddenViews;
    int i = ((ArrayList)localObject).size() - 1;
    while (i >= 0)
    {
      localToolbar.addView((View)((ArrayList)localObject).get(i));
      i -= 1;
    }
    ((ArrayList)localObject).clear();
    a = null;
    localToolbar.requestLayout();
    r = false;
    b.b(false);
    localToolbar.a();
    return true;
  }
  
  public final void initForMenu(Context paramContext, f paramF)
  {
    paramContext = mMenu;
    if (paramContext != null)
    {
      h localH = a;
      if (localH != null) {
        paramContext.d(localH);
      }
    }
    mMenu = paramF;
  }
  
  public final void updateMenuView()
  {
    if (a != null)
    {
      f localF = mMenu;
      if (localF != null)
      {
        int j = j.size();
        int i = 0;
        while (i < j)
        {
          if (mMenu.getItem(i) == a) {
            return;
          }
          i += 1;
        }
      }
      b(a);
    }
  }
}
