package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import menu.v;

public abstract class ListPopupWindow
  implements v
{
  public static final Method sClipToWindowEnabledMethod;
  public static final Method sGetMaxAvailableHeightMethod;
  public boolean h;
  public boolean i;
  public AdapterView.OnItemClickListener listener;
  public ListAdapter mAdapter;
  public final Context mContext;
  public View mDropDownAnchorView;
  public int mDropDownGravity;
  public final int mDropDownHeight;
  public int mDropDownHorizontalOffset;
  public int mDropDownVerticalOffset;
  public boolean mDropDownVerticalOffsetSet;
  public int mDropDownWidth;
  public final int mDropDownWindowLayoutType;
  public final Handler mHandler;
  public final ListPopupWindow.ResizePopupRunnable mHideSelector;
  public final int mListItemExpandMaximum;
  public ListViewCompat mListView;
  public ViewPager.PagerObserver mObserver;
  public final PopupWindowCompat mPopup;
  public final ListPopupWindow.PopupScrollListener mScrollListener;
  public final ListPopupWindow.ResizePopupRunnable mTask;
  public final Rect mTempRect;
  public final ListPopupWindow.PopupTouchInterceptor mTouchInterceptor;
  public boolean this$0;
  public Rect window;
  
  static
  {
    if (Build.VERSION.SDK_INT <= 28)
    {
      Object localObject = Boolean.TYPE;
      try
      {
        localObject = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[] { localObject });
        sClipToWindowEnabledMethod = (Method)localObject;
      }
      catch (NoSuchMethodException localNoSuchMethodException1)
      {
        for (;;) {}
      }
      Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
      try
      {
        localObject = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[] { Rect.class });
        sGetMaxAvailableHeightMethod = (Method)localObject;
        return;
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        for (;;) {}
      }
      Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
      return;
    }
  }
  
  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {}
  
  public final void dismiss()
  {
    PopupWindowCompat localPopupWindowCompat = mPopup;
    localPopupWindowCompat.dismiss();
    localPopupWindowCompat.setContentView(null);
    mListView = null;
    mHandler.removeCallbacks(mTask);
  }
  
  public final Drawable getBackground()
  {
    return mPopup.getBackground();
  }
  
  public final int getHorizontalOffset()
  {
    return mDropDownHorizontalOffset;
  }
  
  public final int getVerticalOffset()
  {
    if (!mDropDownVerticalOffsetSet) {
      return 0;
    }
    return mDropDownVerticalOffset;
  }
  
  public final boolean isShowing()
  {
    return mPopup.isShowing();
  }
  
  public final ListViewCompat onItemClick()
  {
    return mListView;
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    ViewPager.PagerObserver localPagerObserver = mObserver;
    if (localPagerObserver == null)
    {
      mObserver = new ViewPager.PagerObserver(this);
    }
    else
    {
      ListAdapter localListAdapter = mAdapter;
      if (localListAdapter != null) {
        localListAdapter.unregisterDataSetObserver(localPagerObserver);
      }
    }
    mAdapter = paramListAdapter;
    if (paramListAdapter != null) {
      paramListAdapter.registerDataSetObserver(mObserver);
    }
    paramListAdapter = mListView;
    if (paramListAdapter != null) {
      paramListAdapter.setAdapter(mAdapter);
    }
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    mPopup.setBackgroundDrawable(paramDrawable);
  }
  
  public final void setContentWidth(int paramInt)
  {
    Drawable localDrawable = mPopup.getBackground();
    if (localDrawable != null)
    {
      Rect localRect = mTempRect;
      localDrawable.getPadding(localRect);
      mDropDownWidth = (left + right + paramInt);
      return;
    }
    mDropDownWidth = paramInt;
  }
  
  public final void setHorizontalOffset(int paramInt)
  {
    mDropDownHorizontalOffset = paramInt;
  }
  
  public final void setVerticalOffset(int paramInt)
  {
    mDropDownVerticalOffset = paramInt;
    mDropDownVerticalOffsetSet = true;
  }
  
  public ListViewCompat show(Context paramContext, boolean paramBoolean)
  {
    return new ListViewCompat(paramContext, paramBoolean);
  }
  
  public final void show()
  {
    Object localObject3 = mListView;
    Object localObject1 = mPopup;
    Object localObject2 = mContext;
    if (localObject3 == null)
    {
      localObject3 = show((Context)localObject2, this$0 ^ true);
      mListView = ((ListViewCompat)localObject3);
      ((AbsListView)localObject3).setAdapter(mAdapter);
      mListView.setOnItemClickListener(listener);
      mListView.setFocusable(true);
      mListView.setFocusableInTouchMode(true);
      mListView.setOnItemSelectedListener(new ListPopupWindow.3(this));
      mListView.setOnScrollListener(mScrollListener);
      ((PopupWindow)localObject1).setContentView(mListView);
    }
    else
    {
      localObject3 = (ViewGroup)((PopupWindow)localObject1).getContentView();
    }
    localObject3 = ((PopupWindow)localObject1).getBackground();
    int i2 = 0;
    Rect localRect = mTempRect;
    int j;
    int k;
    if (localObject3 != null)
    {
      ((Drawable)localObject3).getPadding(localRect);
      m = top;
      j = bottom + m;
      k = j;
      if (!mDropDownVerticalOffsetSet)
      {
        mDropDownVerticalOffset = (-m);
        k = j;
      }
    }
    else
    {
      localRect.setEmpty();
      k = 0;
    }
    boolean bool;
    if (((PopupWindow)localObject1).getInputMethodMode() == 2) {
      bool = true;
    } else {
      bool = false;
    }
    int m = IcsListPopupWindow.getMaxAvailableHeight((PopupWindow)localObject1, mDropDownAnchorView, mDropDownVerticalOffset, bool);
    int n = mDropDownHeight;
    if (n == -1)
    {
      j = m + k;
    }
    else
    {
      j = mDropDownWidth;
      if (j != -2)
      {
        if (j != -1) {
          j = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
        } else {
          j = View.MeasureSpec.makeMeasureSpec(getResourcesgetDisplayMetricswidthPixels - (left + right), 1073741824);
        }
      }
      else {
        j = View.MeasureSpec.makeMeasureSpec(getResourcesgetDisplayMetricswidthPixels - (left + right), Integer.MIN_VALUE);
      }
      m = mListView.measureHeightOfChildrenCompat(j, m);
      if (m > 0)
      {
        j = mListView.getPaddingTop();
        j = mListView.getPaddingBottom() + j + k;
      }
      else
      {
        j = 0;
      }
      j = m + j;
    }
    int i1;
    if (mPopup.getInputMethodMode() == 2) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    ((PopupWindow)localObject1).setWindowLayoutType(mDropDownWindowLayoutType);
    if (((PopupWindow)localObject1).isShowing())
    {
      if (!mDropDownAnchorView.isAttachedToWindow()) {
        return;
      }
      m = mDropDownWidth;
      if (m == -1)
      {
        k = -1;
      }
      else
      {
        k = m;
        if (m == -2) {
          k = mDropDownAnchorView.getWidth();
        }
      }
      if (n == -1)
      {
        if (i1 != 0) {
          m = j;
        } else {
          m = -1;
        }
        if (i1 != 0)
        {
          if (mDropDownWidth == -1) {
            j = -1;
          } else {
            j = 0;
          }
          ((PopupWindow)localObject1).setWidth(j);
          ((PopupWindow)localObject1).setHeight(0);
        }
        else
        {
          j = i2;
          if (mDropDownWidth == -1) {
            j = -1;
          }
          ((PopupWindow)localObject1).setWidth(j);
          ((PopupWindow)localObject1).setHeight(-1);
        }
      }
      else
      {
        m = n;
        if (n == -2) {
          m = j;
        }
      }
      ((PopupWindow)localObject1).setOutsideTouchable(true);
      localObject2 = mDropDownAnchorView;
      n = mDropDownHorizontalOffset;
      i1 = mDropDownVerticalOffset;
      j = k;
      if (k < 0) {
        j = -1;
      }
      k = m;
      if (m < 0) {
        k = -1;
      }
      ((PopupWindow)localObject1).update((View)localObject2, n, i1, j, k);
      return;
    }
    m = mDropDownWidth;
    if (m == -1)
    {
      k = -1;
    }
    else
    {
      k = m;
      if (m == -2) {
        k = mDropDownAnchorView.getWidth();
      }
    }
    if (n == -1)
    {
      m = -1;
    }
    else
    {
      m = n;
      if (n == -2) {
        m = j;
      }
    }
    ((PopupWindow)localObject1).setWidth(k);
    ((PopupWindow)localObject1).setHeight(m);
    if (Build.VERSION.SDK_INT <= 28)
    {
      localObject2 = sClipToWindowEnabledMethod;
      if (localObject2 == null) {
        break label739;
      }
      localObject3 = Boolean.TRUE;
    }
    try
    {
      ((Method)localObject2).invoke(localObject1, new Object[] { localObject3 });
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
    break label739;
    PopupWindowCompatKitKat.showAsDropDown((PopupWindow)localObject1, true);
    label739:
    ((PopupWindow)localObject1).setOutsideTouchable(true);
    ((PopupWindow)localObject1).setTouchInterceptor(mTouchInterceptor);
    if (h) {
      ((PopupWindow)localObject1).setOverlapAnchor(i);
    }
    if (Build.VERSION.SDK_INT <= 28)
    {
      localObject2 = sGetMaxAvailableHeightMethod;
      if (localObject2 != null)
      {
        localObject3 = window;
        try
        {
          ((Method)localObject2).invoke(localObject1, new Object[] { localObject3 });
        }
        catch (Exception localException1)
        {
          Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", localException1);
        }
      }
    }
    else
    {
      PopupWindowCompatKitKat.showAsDropDown((PopupWindow)localObject1, window);
    }
    ((PopupWindow)localObject1).showAsDropDown(mDropDownAnchorView, mDropDownHorizontalOffset, mDropDownVerticalOffset, mDropDownGravity);
    mListView.setSelection(-1);
    if ((!this$0) || (mListView.isInTouchMode()))
    {
      localObject1 = mListView;
      if (localObject1 != null)
      {
        ((ListViewCompat)localObject1).setListSelectionHidden(true);
        ((View)localObject1).requestLayout();
      }
    }
    if (!this$0)
    {
      mHandler.post(mHideSelector);
      return;
    }
  }
}
