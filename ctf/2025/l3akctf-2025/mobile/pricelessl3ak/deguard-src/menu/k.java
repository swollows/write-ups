package menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.ListViewCompat;
import androidx.appcompat.widget.Plot;

public final class k
  extends NavigationMenuPresenter
  implements PopupWindow.OnDismissListener, View.OnKeyListener
{
  public View a;
  public Object b;
  public boolean index;
  public final MainActivity.2 item;
  public final x mAdapter;
  public final boolean mAnchor;
  public View mAnchorView;
  public int mContentWidth;
  public final Context mContext;
  public final f mMenu;
  public final Plot mPopup;
  public ViewTreeObserver mTreeObserver;
  public boolean showing;
  public final androidx.appcompat.widget.MenuPopupHelper this$0;
  public final int top;
  public int type;
  public boolean visible;
  public final int width;
  public MenuPopupHelper x;
  
  public k(int paramInt, Context paramContext, View paramView, f paramF, boolean paramBoolean) {}
  
  public final void a(int paramInt)
  {
    type = paramInt;
  }
  
  public final void a(View paramView)
  {
    a = paramView;
  }
  
  public final void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    x = ((MenuPopupHelper)paramOnDismissListener);
  }
  
  public final void a(Object paramObject)
  {
    b = paramObject;
  }
  
  public final void a(f paramF, boolean paramBoolean)
  {
    if (paramF != mMenu) {
      return;
    }
    dismiss();
    Object localObject = b;
    if (localObject != null) {
      localObject.a(paramF, paramBoolean);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    mAdapter.d = paramBoolean;
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public final boolean a(p paramP)
  {
    if (paramP.hasVisibleItems())
    {
      java.lang.Object localObject1 = mAnchorView;
      java.lang.Object localObject2 = mContext;
      boolean bool = mAnchor;
      localObject1 = new i(top, (Context)localObject2, (View)localObject1, paramP, bool);
      localObject2 = b;
      v = ((Object)localObject2);
      NavigationMenuPresenter localNavigationMenuPresenter = l;
      if (localNavigationMenuPresenter != null) {
        localNavigationMenuPresenter.a((Object)localObject2);
      }
      bool = NavigationMenuPresenter.onSubMenuSelected(paramP);
      t = bool;
      localObject2 = l;
      if (localObject2 != null) {
        ((NavigationMenuPresenter)localObject2).a(bool);
      }
      h = x;
      x = null;
      mMenu.a(false);
      localObject2 = mPopup;
      int j = mDropDownHorizontalOffset;
      int k = ((ListPopupWindow)localObject2).getVerticalOffset();
      int i = j;
      if ((Gravity.getAbsoluteGravity(type, a.getLayoutDirection()) & 0x7) == 5) {
        i = j + a.getWidth();
      }
      if (!((i)localObject1).a())
      {
        if (a == null) {
          return false;
        }
        ((i)localObject1).a(i, k, true, true);
      }
      localObject1 = b;
      if (localObject1 != null)
      {
        ((Object)localObject1).a(paramP);
        return true;
      }
    }
    else
    {
      return false;
    }
    return true;
  }
  
  public final void dismiss()
  {
    if (isShowing()) {
      mPopup.dismiss();
    }
  }
  
  public final void dismiss(int paramInt)
  {
    mPopup.mDropDownHorizontalOffset = paramInt;
  }
  
  public final boolean isShowing()
  {
    return (!showing) && (mPopup.mPopup.isShowing());
  }
  
  public final void onCloseMenu(f paramF) {}
  
  public final void onDismiss()
  {
    showing = true;
    mMenu.a(true);
    java.lang.Object localObject = mTreeObserver;
    if (localObject != null)
    {
      if (!((ViewTreeObserver)localObject).isAlive()) {
        mTreeObserver = mAnchorView.getViewTreeObserver();
      }
      mTreeObserver.removeGlobalOnLayoutListener(this$0);
      mTreeObserver = null;
    }
    mAnchorView.removeOnAttachStateChangeListener(item);
    localObject = x;
    if (localObject != null) {
      ((MenuPopupHelper)localObject).onDismiss();
    }
  }
  
  public final ListViewCompat onItemClick()
  {
    return mPopup.mListView;
  }
  
  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      dismiss();
      return true;
    }
    return false;
  }
  
  public final void setGravity(int paramInt)
  {
    mPopup.setVerticalOffset(paramInt);
  }
  
  public final void show()
  {
    if (isShowing()) {
      return;
    }
    if (!showing)
    {
      java.lang.Object localObject1 = a;
      if (localObject1 != null)
      {
        mAnchorView = ((View)localObject1);
        Plot localPlot = mPopup;
        mPopup.setOnDismissListener(this);
        listener = this;
        this$0 = true;
        mPopup.setFocusable(true);
        localObject1 = mAnchorView;
        int i;
        if (mTreeObserver == null) {
          i = 1;
        } else {
          i = 0;
        }
        java.lang.Object localObject2 = ((View)localObject1).getViewTreeObserver();
        mTreeObserver = ((ViewTreeObserver)localObject2);
        if (i != 0) {
          ((ViewTreeObserver)localObject2).addOnGlobalLayoutListener(this$0);
        }
        ((View)localObject1).addOnAttachStateChangeListener(item);
        mDropDownAnchorView = ((View)localObject1);
        mDropDownGravity = type;
        boolean bool = index;
        java.lang.Object localObject3 = mContext;
        localObject2 = mAdapter;
        if (!bool)
        {
          mContentWidth = NavigationMenuPresenter.measureContentWidth((ListAdapter)localObject2, (Context)localObject3, width);
          index = true;
        }
        localPlot.setContentWidth(mContentWidth);
        mPopup.setInputMethodMode(2);
        localObject1 = y;
        if (localObject1 != null) {
          localObject1 = new Rect((Rect)localObject1);
        } else {
          localObject1 = null;
        }
        window = ((Rect)localObject1);
        localPlot.show();
        localObject1 = mListView;
        ((View)localObject1).setOnKeyListener(this);
        if (visible)
        {
          f localF = mMenu;
          if (d != null)
          {
            localObject3 = (FrameLayout)LayoutInflater.from((Context)localObject3).inflate(2131427346, (ViewGroup)localObject1, false);
            TextView localTextView = (TextView)((View)localObject3).findViewById(16908310);
            if (localTextView != null) {
              localTextView.setText(d);
            }
            ((View)localObject3).setEnabled(false);
            ((ListView)localObject1).addHeaderView((View)localObject3, null, false);
          }
        }
        localPlot.setAdapter((ListAdapter)localObject2);
        localPlot.show();
        return;
      }
    }
    throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
  }
  
  public final void updateMenuView()
  {
    index = false;
    x localX = mAdapter;
    if (localX != null) {
      localX.notifyDataSetChanged();
    }
  }
  
  public final void updateMenuView(boolean paramBoolean)
  {
    visible = paramBoolean;
  }
}
