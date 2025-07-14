package menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import java.util.ArrayList;

public abstract class NavigationMenuPresenter
  implements v, l, AdapterView.OnItemClickListener
{
  public Rect y;
  
  public static int measureContentWidth(ListAdapter paramListAdapter, Context paramContext, int paramInt)
  {
    int i = 0;
    int i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i3 = paramListAdapter.getCount();
    int j = 0;
    int m = 0;
    Object localObject2 = null;
    Object localObject3;
    for (Object localObject1 = null; i < i3; localObject1 = localObject3)
    {
      int n = paramListAdapter.getItemViewType(i);
      int k = m;
      localObject3 = localObject1;
      if (n != m)
      {
        localObject3 = null;
        k = n;
      }
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new FrameLayout(paramContext);
      }
      localObject2 = paramListAdapter.getView(i, localObject3, (ViewGroup)localObject1);
      localObject3 = localObject2;
      ((View)localObject2).measure(i1, i2);
      n = ((View)localObject2).getMeasuredWidth();
      if (n >= paramInt) {
        return paramInt;
      }
      m = j;
      if (n > j) {
        m = n;
      }
      i += 1;
      j = m;
      m = k;
      localObject2 = localObject1;
    }
    return j;
  }
  
  public static boolean onSubMenuSelected(f paramF)
  {
    int j = paramF.j.size();
    int i = 0;
    while (i < j)
    {
      MenuItem localMenuItem = paramF.getItem(i);
      if ((localMenuItem.isVisible()) && (localMenuItem.getIcon() != null)) {
        return true;
      }
      i += 1;
    }
    return false;
  }
  
  public abstract void a(int paramInt);
  
  public abstract void a(View paramView);
  
  public abstract void a(PopupWindow.OnDismissListener paramOnDismissListener);
  
  public abstract void a(boolean paramBoolean);
  
  public final boolean a(h paramH)
  {
    return false;
  }
  
  public final boolean b(h paramH)
  {
    return false;
  }
  
  public abstract void dismiss(int paramInt);
  
  public final void initForMenu(Context paramContext, f paramF) {}
  
  public abstract void onCloseMenu(f paramF);
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramView = (ListAdapter)paramAdapterView.getAdapter();
    if ((paramView instanceof HeaderViewListAdapter)) {
      paramAdapterView = (x)((HeaderViewListAdapter)paramView).getWrappedAdapter();
    } else {
      paramAdapterView = (x)paramView;
    }
    paramAdapterView = a;
    paramView = (MenuItem)paramView.getItem(paramInt);
    if (!(this instanceof w)) {
      paramInt = 0;
    } else {
      paramInt = 4;
    }
    paramAdapterView.a(paramView, this, paramInt);
  }
  
  public abstract void setGravity(int paramInt);
  
  public abstract void updateMenuView(boolean paramBoolean);
}
