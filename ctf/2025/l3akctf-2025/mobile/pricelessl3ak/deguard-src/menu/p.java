package menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class p
  extends f
  implements SubMenu
{
  public final f d;
  public final h e;
  
  public p(Context paramContext, f paramF, h paramH)
  {
    super(paramContext);
    d = paramF;
    e = paramH;
  }
  
  public final boolean a(f paramF, MenuItem paramMenuItem)
  {
    return (super.a(paramF, paramMenuItem)) || (d.a(paramF, paramMenuItem));
  }
  
  public final boolean b()
  {
    return d.b();
  }
  
  public final boolean c()
  {
    return d.c();
  }
  
  public final boolean c(h paramH)
  {
    return d.c(paramH);
  }
  
  public final boolean d()
  {
    return d.d();
  }
  
  public final boolean d(h paramH)
  {
    return d.d(paramH);
  }
  
  public final String getActionViewStatesKey()
  {
    Object localObject = e;
    int i;
    if (localObject != null) {
      i = id;
    } else {
      i = 0;
    }
    if (i == 0) {
      return null;
    }
    localObject = new StringBuilder("android:menu:actionviewstates:");
    ((StringBuilder)localObject).append(i);
    return ((StringBuilder)localObject).toString();
  }
  
  public final MenuItem getItem()
  {
    return e;
  }
  
  public final f q()
  {
    return d.q();
  }
  
  public final void setGroupDividerEnabled(boolean paramBoolean)
  {
    d.setGroupDividerEnabled(paramBoolean);
  }
  
  public final SubMenu setHeaderIcon(int paramInt)
  {
    a(0, null, paramInt, null, null);
    return this;
  }
  
  public final SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    a(0, null, 0, paramDrawable, null);
    return this;
  }
  
  public final SubMenu setHeaderTitle(int paramInt)
  {
    a(paramInt, null, 0, null, null);
    return this;
  }
  
  public final SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    a(0, paramCharSequence, 0, null, null);
    return this;
  }
  
  public final SubMenu setHeaderView(View paramView)
  {
    a(0, null, 0, null, paramView);
    return this;
  }
  
  public final SubMenu setIcon(int paramInt)
  {
    e.setIcon(paramInt);
    return this;
  }
  
  public final SubMenu setIcon(Drawable paramDrawable)
  {
    e.setIcon(paramDrawable);
    return this;
  }
  
  public final void setQwertyMode(boolean paramBoolean)
  {
    d.setQwertyMode(paramBoolean);
  }
}
