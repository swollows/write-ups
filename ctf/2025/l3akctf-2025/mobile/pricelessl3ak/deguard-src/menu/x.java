package menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

public final class x
  extends BaseAdapter
{
  public final f a;
  public final LayoutInflater b;
  public int c = -1;
  public boolean d;
  public final int f;
  public final boolean l;
  
  public x(f paramF, LayoutInflater paramLayoutInflater, boolean paramBoolean, int paramInt)
  {
    l = paramBoolean;
    b = paramLayoutInflater;
    a = paramF;
    f = paramInt;
    a();
  }
  
  public final h a(int paramInt)
  {
    Object localObject = a;
    if (l)
    {
      ((f)localObject).a();
      localObject = n;
    }
    else
    {
      localObject = ((f)localObject).getVisibleItems();
    }
    int j = c;
    int i = paramInt;
    if (j >= 0)
    {
      i = paramInt;
      if (paramInt >= j) {
        i = paramInt + 1;
      }
    }
    return (h)((ArrayList)localObject).get(i);
  }
  
  public final void a()
  {
    Object localObject = a;
    h localH = C;
    if (localH != null)
    {
      ((f)localObject).a();
      localObject = n;
      int j = ((ArrayList)localObject).size();
      int i = 0;
      while (i < j)
      {
        if ((h)((ArrayList)localObject).get(i) == localH)
        {
          c = i;
          return;
        }
        i += 1;
      }
    }
    c = -1;
  }
  
  public final int getCount()
  {
    Object localObject = a;
    if (l)
    {
      ((f)localObject).a();
      localObject = n;
    }
    else
    {
      localObject = ((f)localObject).getVisibleItems();
    }
    if (c < 0) {
      return ((ArrayList)localObject).size();
    }
    return ((ArrayList)localObject).size() - 1;
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool2 = false;
    View localView = paramView;
    if (paramView == null) {
      localView = b.inflate(f, paramViewGroup, false);
    }
    int j = aj;
    int i = paramInt - 1;
    if (i >= 0) {
      i = aj;
    } else {
      i = j;
    }
    paramView = (ListMenuItemView)localView;
    boolean bool1 = bool2;
    if (a.c())
    {
      bool1 = bool2;
      if (j != i) {
        bool1 = true;
      }
    }
    paramView.setGroupDividerEnabled(bool1);
    paramViewGroup = (m.a)localView;
    if (d) {
      paramView.setForceShowIcon(true);
    }
    paramViewGroup.a(a(paramInt));
    return localView;
  }
  
  public final void notifyDataSetChanged()
  {
    a();
    super.notifyDataSetChanged();
  }
}
