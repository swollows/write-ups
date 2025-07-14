package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;
import androidx.appcompat.view.menu.ListMenuItemView;
import menu.f;
import menu.h;
import menu.x;

public final class GridView
  extends ListViewCompat
{
  public h b;
  public final int command;
  public g d;
  public final int searchAttributes;
  
  public GridView(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, paramBoolean);
    if (1 == paramContext.getResources().getConfiguration().getLayoutDirection())
    {
      command = 21;
      searchAttributes = 22;
      return;
    }
    command = 22;
    searchAttributes = 21;
  }
  
  public final boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    if (d != null)
    {
      Object localObject = getAdapter();
      int i;
      if ((localObject instanceof HeaderViewListAdapter))
      {
        localObject = (HeaderViewListAdapter)localObject;
        i = ((HeaderViewListAdapter)localObject).getHeadersCount();
        localObject = (x)((HeaderViewListAdapter)localObject).getWrappedAdapter();
      }
      else
      {
        localObject = (x)localObject;
        i = 0;
      }
      if (paramMotionEvent.getAction() != 10)
      {
        int j = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
        if (j != -1)
        {
          i = j - i;
          if ((i >= 0) && (i < ((x)localObject).getCount()))
          {
            localH1 = ((x)localObject).a(i);
            break label116;
          }
        }
      }
      h localH1 = null;
      label116:
      h localH2 = b;
      if (localH2 != localH1)
      {
        localObject = a;
        if (localH2 != null) {
          d.b((f)localObject, localH2);
        }
        b = localH1;
        if (localH1 != null) {
          d.a((f)localObject, localH1);
        }
      }
    }
    return super.onHoverEvent(paramMotionEvent);
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    ListMenuItemView localListMenuItemView = (ListMenuItemView)getSelectedView();
    if ((localListMenuItemView != null) && (paramInt == command))
    {
      if ((localListMenuItemView.isEnabled()) && (localListMenuItemView.getItemData().hasSubMenu()))
      {
        performItemClick(localListMenuItemView, getSelectedItemPosition(), getSelectedItemId());
        return true;
      }
    }
    else
    {
      if ((localListMenuItemView != null) && (paramInt == searchAttributes))
      {
        setSelection(-1);
        paramKeyEvent = getAdapter();
        if ((paramKeyEvent instanceof HeaderViewListAdapter)) {
          paramKeyEvent = (x)((HeaderViewListAdapter)paramKeyEvent).getWrappedAdapter();
        } else {
          paramKeyEvent = (x)paramKeyEvent;
        }
        a.a(false);
        return true;
      }
      return super.onKeyDown(paramInt, paramKeyEvent);
    }
    return true;
  }
  
  public void setHoverListener(g paramG)
  {
    d = paramG;
  }
}
