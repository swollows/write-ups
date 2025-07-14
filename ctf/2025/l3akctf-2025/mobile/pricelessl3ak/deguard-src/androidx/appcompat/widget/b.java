package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.view.menu.ActionMenuItemView;
import java.util.ArrayList;
import menu.MenuBuilder.ItemInvoker;
import menu.MenuView;
import menu.NavigationMenuPresenter;
import menu.h;
import menu.l;
import menu.m.a;
import menu.p;
import menu.v;

public final class b
  implements l
{
  public Context a;
  public boolean b;
  public menu.f c;
  public menu.Object d;
  public boolean e;
  public final int f;
  public int g;
  public i h;
  public int i;
  public final app.f j;
  public int k;
  public i m;
  public final int mMenuLayoutRes;
  public MenuView mMenuView;
  public ActionMenuPresenter.OverflowMenuButton mOverflowButton;
  public Drawable mPendingOverflowIcon;
  public boolean mPendingOverflowIconSet;
  public ActionMenuPresenter.ActionMenuPopupCallback mPopupCallback;
  public ActionMenuPresenter.OpenOverflowRunnable mPostedOpenRunnable;
  public final Context mSystemContext;
  public final LayoutInflater mSystemInflater;
  public final SparseBooleanArray o;
  public boolean s;
  
  public b(Context paramContext)
  {
    mSystemContext = paramContext;
    mSystemInflater = LayoutInflater.from(paramContext);
    mMenuLayoutRes = 2131427331;
    f = 2131427330;
    o = new SparseBooleanArray();
    j = new app.f(11, this);
  }
  
  public final View a(h paramH, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject2 = paramH.getActionView();
    Object localObject1 = localObject2;
    int n = 0;
    if ((localObject2 == null) || (paramH.n()))
    {
      if ((paramView instanceof m.a))
      {
        paramView = (m.a)paramView;
      }
      else
      {
        int i1 = f;
        paramView = (m.a)mSystemInflater.inflate(i1, paramViewGroup, false);
      }
      paramView.a(paramH);
      localObject1 = (ActionMenuView)mMenuView;
      localObject2 = (ActionMenuItemView)paramView;
      ((ActionMenuItemView)localObject2).setItemInvoker((MenuBuilder.ItemInvoker)localObject1);
      if (mPopupCallback == null) {
        mPopupCallback = new ActionMenuPresenter.ActionMenuPopupCallback(this);
      }
      ((ActionMenuItemView)localObject2).setPopupCallback(mPopupCallback);
      localObject1 = (View)paramView;
    }
    if (r) {
      n = 8;
    }
    ((View)localObject1).setVisibility(n);
    paramH = (ActionMenuView)paramViewGroup;
    paramView = ((View)localObject1).getLayoutParams();
    paramH.getClass();
    if (!(paramView instanceof ActionMenuView.LayoutParams)) {
      ((View)localObject1).setLayoutParams(ActionMenuView.a(paramView));
    }
    return localObject1;
  }
  
  public final void a(menu.Object paramObject)
  {
    throw new NullPointerException("Null throw statement replaced by Soot");
  }
  
  public final void a(menu.f paramF, boolean paramBoolean)
  {
    hideOverflowMenu();
    Object localObject = m;
    if ((localObject != null) && (((menu.i)localObject).a())) {
      l.dismiss();
    }
    localObject = d;
    if (localObject != null) {
      ((menu.Object)localObject).a(paramF, paramBoolean);
    }
  }
  
  public final boolean a()
  {
    Object localObject1 = c;
    int i5;
    if (localObject1 != null)
    {
      localObject2 = ((menu.f)localObject1).getVisibleItems();
      localObject1 = localObject2;
      i5 = ((ArrayList)localObject2).size();
    }
    else
    {
      i5 = 0;
      localObject1 = null;
    }
    int n = i;
    int i7 = k;
    int i8 = View.MeasureSpec.makeMeasureSpec(0, 0);
    Object localObject2 = (ViewGroup)mMenuView;
    int i1 = 0;
    int i4 = 0;
    int i2 = 0;
    int i3 = 0;
    while (i1 < i5)
    {
      localObject3 = (h)((ArrayList)localObject1).get(i1);
      i6 = q;
      if ((i6 & 0x2) == 2) {
        i2 += 1;
      } else if ((i6 & 0x1) == 1) {
        i3 += 1;
      } else {
        i4 = 1;
      }
      i6 = n;
      if (s)
      {
        i6 = n;
        if (r) {
          i6 = 0;
        }
      }
      i1 += 1;
      n = i6;
    }
    i1 = n;
    if (b) {
      if (i4 == 0)
      {
        i1 = n;
        if (i3 + i2 <= n) {}
      }
      else
      {
        i1 = n - 1;
      }
    }
    n = i1 - i2;
    Object localObject3 = o;
    ((SparseBooleanArray)localObject3).clear();
    int i6 = 0;
    i1 = 0;
    for (i4 = i7; i6 < i5; i4 = i3)
    {
      h localH = (h)((ArrayList)localObject1).get(i6);
      i3 = q;
      if ((i3 & 0x2) == 2) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      int i9 = j;
      Object localObject4;
      if (i2 != 0)
      {
        localObject4 = a(localH, null, (ViewGroup)localObject2);
        ((View)localObject4).measure(i8, i8);
        i7 = ((View)localObject4).getMeasuredWidth();
        i3 = i4 - i7;
        i2 = i1;
        if (i1 == 0) {
          i2 = i7;
        }
        if (i9 != 0) {
          ((SparseBooleanArray)localObject3).put(i9, true);
        }
        localH.d(true);
      }
      for (;;)
      {
        i1 = i2;
        break label593;
        if ((i3 & 0x1) != 1) {
          break;
        }
        boolean bool = ((SparseBooleanArray)localObject3).get(i9);
        int i10;
        if (((n > 0) || (bool)) && (i4 > 0)) {
          i10 = 1;
        } else {
          i10 = 0;
        }
        i3 = i4;
        i2 = i1;
        int i11 = i10;
        if (i10 != 0)
        {
          localObject4 = a(localH, null, (ViewGroup)localObject2);
          ((View)localObject4).measure(i8, i8);
          i7 = ((View)localObject4).getMeasuredWidth();
          i3 = i4 - i7;
          i2 = i1;
          if (i1 == 0) {
            i2 = i7;
          }
          if (i3 + i2 > 0) {
            i1 = 1;
          } else {
            i1 = 0;
          }
          i11 = i10 & i1;
        }
        if ((i11 != 0) && (i9 != 0))
        {
          ((SparseBooleanArray)localObject3).put(i9, true);
          i1 = n;
        }
        else
        {
          i1 = n;
          if (bool)
          {
            ((SparseBooleanArray)localObject3).put(i9, false);
            i4 = 0;
            for (;;)
            {
              i1 = n;
              if (i4 >= i6) {
                break;
              }
              localObject4 = (h)((ArrayList)localObject1).get(i4);
              i1 = n;
              if (j == i9)
              {
                i1 = n;
                if (((h)localObject4).a()) {
                  i1 = n + 1;
                }
                ((h)localObject4).d(false);
              }
              i4 += 1;
              n = i1;
            }
          }
        }
        n = i1;
        if (i11 != 0) {
          n = i1 - 1;
        }
        localH.d(i11);
      }
      localH.d(false);
      i3 = i4;
      label593:
      i6 += 1;
    }
    return true;
  }
  
  public final boolean a(h paramH)
  {
    return false;
  }
  
  public final boolean a(p paramP)
  {
    if (!paramP.hasVisibleItems()) {
      return false;
    }
    Object localObject2;
    for (Object localObject1 = paramP;; localObject1 = (p)localObject2)
    {
      localObject2 = d;
      if (localObject2 == c) {
        break;
      }
    }
    ViewGroup localViewGroup = (ViewGroup)mMenuView;
    Object localObject3 = null;
    if (localViewGroup == null)
    {
      localObject2 = localObject3;
    }
    else
    {
      i1 = localViewGroup.getChildCount();
      n = 0;
      for (;;)
      {
        localObject2 = localObject3;
        if (n >= i1) {
          break;
        }
        localObject2 = localViewGroup.getChildAt(n);
        if (((localObject2 instanceof m.a)) && (((m.a)localObject2).getItemData() == e)) {
          break;
        }
        n += 1;
      }
    }
    if (localObject2 == null) {
      return false;
    }
    e.getClass();
    int i1 = j.size();
    int n = 0;
    while (n < i1)
    {
      localObject1 = paramP.getItem(n);
      if ((((MenuItem)localObject1).isVisible()) && (((MenuItem)localObject1).getIcon() != null))
      {
        bool = true;
        break label196;
      }
      n += 1;
    }
    boolean bool = false;
    label196:
    localObject1 = new i(this, a, paramP, (View)localObject2);
    m = ((i)localObject1);
    t = bool;
    localObject1 = l;
    if (localObject1 != null) {
      ((NavigationMenuPresenter)localObject1).a(bool);
    }
    localObject1 = m;
    if (!((menu.i)localObject1).a())
    {
      if (a != null) {
        ((menu.i)localObject1).a(0, 0, false, false);
      }
    }
    else
    {
      localObject1 = d;
      if (localObject1 == null) {
        break label312;
      }
      ((menu.Object)localObject1).a(paramP);
      return true;
    }
    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    label312:
    return true;
  }
  
  public final boolean b(h paramH)
  {
    return false;
  }
  
  public final boolean c()
  {
    i localI = h;
    return (localI != null) && (localI.a());
  }
  
  public final boolean hideOverflowMenu()
  {
    Object localObject = mPostedOpenRunnable;
    if (localObject != null)
    {
      MenuView localMenuView = mMenuView;
      if (localMenuView != null)
      {
        ((View)localMenuView).removeCallbacks((Runnable)localObject);
        mPostedOpenRunnable = null;
        return true;
      }
    }
    localObject = h;
    if (localObject != null)
    {
      if (((menu.i)localObject).a())
      {
        l.dismiss();
        return true;
      }
    }
    else {
      return false;
    }
    return true;
  }
  
  public final void initForMenu(Context paramContext, menu.f paramF)
  {
    a = paramContext;
    LayoutInflater.from(paramContext);
    c = paramF;
    paramF = paramContext.getResources();
    if (!e) {
      b = true;
    }
    int i1 = getResourcesgetDisplayMetricswidthPixels;
    int n = 2;
    g = (i1 / 2);
    paramContext = paramContext.getResources().getConfiguration();
    i1 = screenWidthDp;
    int i2 = screenHeightDp;
    if ((smallestScreenWidthDp <= 600) && (i1 <= 600) && ((i1 <= 960) || (i2 <= 720)) && ((i1 <= 720) || (i2 <= 960)))
    {
      if ((i1 < 500) && ((i1 <= 640) || (i2 <= 480)) && ((i1 <= 480) || (i2 <= 640)))
      {
        if (i1 >= 360) {
          n = 3;
        }
      }
      else {
        n = 4;
      }
    }
    else {
      n = 5;
    }
    i = n;
    n = g;
    if (b)
    {
      if (mOverflowButton == null)
      {
        paramContext = new ActionMenuPresenter.OverflowMenuButton(this, mSystemContext);
        mOverflowButton = paramContext;
        if (mPendingOverflowIconSet)
        {
          paramContext.setImageDrawable(mPendingOverflowIcon);
          mPendingOverflowIcon = null;
          mPendingOverflowIconSet = false;
        }
        i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
        mOverflowButton.measure(i1, i1);
      }
      n -= mOverflowButton.getMeasuredWidth();
    }
    else
    {
      mOverflowButton = null;
    }
    k = n;
    float f1 = getDisplayMetricsdensity;
  }
  
  public final boolean showOverflowMenu()
  {
    if ((b) && (!c()))
    {
      Object localObject = c;
      if ((localObject != null) && (mMenuView != null) && (mPostedOpenRunnable == null))
      {
        ((menu.f)localObject).a();
        if (!n.isEmpty())
        {
          localObject = new ActionMenuPresenter.OpenOverflowRunnable(this, new i(this, a, c, mOverflowButton));
          mPostedOpenRunnable = ((ActionMenuPresenter.OpenOverflowRunnable)localObject);
          ((View)mMenuView).post((Runnable)localObject);
          return true;
        }
      }
    }
    return false;
  }
  
  public final void updateMenuView()
  {
    Object localObject3 = (ViewGroup)mMenuView;
    Object localObject2 = null;
    int i3 = 0;
    int i1;
    if (localObject3 != null)
    {
      localObject1 = c;
      if (localObject1 != null)
      {
        ((menu.f)localObject1).a();
        ArrayList localArrayList = c.getVisibleItems();
        int i4 = localArrayList.size();
        int i2 = 0;
        for (n = 0;; n = i1)
        {
          i1 = n;
          if (i2 >= i4) {
            break;
          }
          h localH = (h)localArrayList.get(i2);
          i1 = n;
          if (localH.a())
          {
            View localView1 = ((ViewGroup)localObject3).getChildAt(n);
            if ((localView1 instanceof m.a)) {
              localObject1 = ((m.a)localView1).getItemData();
            } else {
              localObject1 = null;
            }
            View localView2 = a(localH, localView1, (ViewGroup)localObject3);
            if (localH != localObject1)
            {
              localView2.setPressed(false);
              localView2.jumpDrawablesToCurrentState();
            }
            if (localView2 != localView1)
            {
              localObject1 = (ViewGroup)localView2.getParent();
              if (localObject1 != null) {
                ((ViewGroup)localObject1).removeView(localView2);
              }
              ((ViewGroup)mMenuView).addView(localView2, n);
            }
            i1 = n + 1;
          }
          i2 += 1;
        }
      }
      i1 = 0;
      while (i1 < ((ViewGroup)localObject3).getChildCount()) {
        if (((ViewGroup)localObject3).getChildAt(i1) == mOverflowButton) {
          i1 += 1;
        } else {
          ((ViewGroup)localObject3).removeViewAt(i1);
        }
      }
    }
    ((View)mMenuView).requestLayout();
    Object localObject1 = c;
    if (localObject1 != null)
    {
      ((menu.f)localObject1).a();
      localObject1 = l;
      i1 = ((ArrayList)localObject1).size();
      n = 0;
      while (n < i1)
      {
        localObject3 = getB;
        n += 1;
      }
    }
    localObject3 = c;
    localObject1 = localObject2;
    if (localObject3 != null)
    {
      ((menu.f)localObject3).a();
      localObject1 = n;
    }
    int n = i3;
    boolean bool;
    if (b)
    {
      n = i3;
      if (localObject1 != null)
      {
        i1 = ((ArrayList)localObject1).size();
        if (i1 == 1)
        {
          bool = get0r ^ true;
        }
        else
        {
          bool = i3;
          if (i1 > 0) {
            bool = true;
          }
        }
      }
    }
    if (bool)
    {
      if (mOverflowButton == null) {
        mOverflowButton = new ActionMenuPresenter.OverflowMenuButton(this, mSystemContext);
      }
      localObject1 = (ViewGroup)mOverflowButton.getParent();
      if (localObject1 != mMenuView)
      {
        if (localObject1 != null) {
          ((ViewGroup)localObject1).removeView(mOverflowButton);
        }
        localObject1 = (ActionMenuView)mMenuView;
        localObject2 = mOverflowButton;
        localObject1.getClass();
        localObject3 = ActionMenuView.onCreateView();
        isOverflowButton = true;
        ((ViewGroup)localObject1).addView((View)localObject2, (ViewGroup.LayoutParams)localObject3);
      }
    }
    else
    {
      localObject1 = mOverflowButton;
      if (localObject1 != null)
      {
        localObject1 = ((View)localObject1).getParent();
        localObject2 = mMenuView;
        if (localObject1 == localObject2) {
          ((ViewGroup)localObject2).removeView(mOverflowButton);
        }
      }
    }
    ((ActionMenuView)mMenuView).setOverflowReserved(b);
  }
}
