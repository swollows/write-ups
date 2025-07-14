package androidx.appcompat.view.menu;

import Console.R.styleable;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.ActivityChooserView.3;
import androidx.appcompat.widget.BubbleTextView;
import androidx.appcompat.widget.ListPopupWindow.ForwardingListener;
import androidx.appcompat.widget.MethodWriter;
import menu.ActionMenuItemView.b;
import menu.MenuBuilder.ItemInvoker;
import menu.f;
import menu.h;
import menu.m.a;

public class ActionMenuItemView
  extends BubbleTextView
  implements m.a, View.OnClickListener, MethodWriter
{
  public h a;
  public CharSequence c;
  public Drawable d;
  public MenuBuilder.ItemInvoker e;
  public ActivityChooserView.3 f;
  public ActionMenuItemView.b g;
  public boolean h;
  public boolean i;
  public final int mMaxIconSize;
  public final int mMinWidth;
  public int mSavedPaddingLeft;
  
  public ActionMenuItemView(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
    Resources localResources = paramContext.getResources();
    h = refresh();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.RecyclerView, 0, 0);
    mMinWidth = paramContext.getDimensionPixelSize(0, 0);
    paramContext.recycle();
    mMaxIconSize = ((int)(getDisplayMetricsdensity * 32.0F + 0.5F));
    setOnClickListener(this);
    mSavedPaddingLeft = -1;
    setSaveEnabled(false);
  }
  
  public final void a()
  {
    boolean bool = TextUtils.isEmpty(c);
    int k = 1;
    int j = k;
    if (d != null)
    {
      if ((a.q & 0x4) == 4)
      {
        j = k;
        if (h) {
          break label55;
        }
        if (i)
        {
          j = k;
          break label55;
        }
      }
      j = 0;
    }
    label55:
    j = (bool ^ true) & j;
    Object localObject2 = null;
    if (j != 0) {
      localObject1 = c;
    } else {
      localObject1 = null;
    }
    setText((CharSequence)localObject1);
    Object localObject1 = a.u;
    if (TextUtils.isEmpty((CharSequence)localObject1))
    {
      if (j != 0) {
        localObject1 = null;
      } else {
        localObject1 = a.a;
      }
      setContentDescription((CharSequence)localObject1);
    }
    else
    {
      setContentDescription((CharSequence)localObject1);
    }
    localObject1 = a.e;
    if (TextUtils.isEmpty((CharSequence)localObject1))
    {
      if (j != 0) {
        localObject1 = localObject2;
      } else {
        localObject1 = a.a;
      }
      drupal.Context.b(this, (CharSequence)localObject1);
      return;
    }
    drupal.Context.b(this, (CharSequence)localObject1);
  }
  
  public final void a(h paramH)
  {
    a = paramH;
    setIcon(paramH.getIcon());
    setTitle(paramH.getTitleCondensed());
    setId(id);
    int j;
    if (paramH.isVisible()) {
      j = 0;
    } else {
      j = 8;
    }
    setVisibility(j);
    setEnabled(paramH.isEnabled());
    if ((paramH.hasSubMenu()) && (f == null)) {
      f = new ActivityChooserView.3(this);
    }
  }
  
  public final boolean b()
  {
    return (!TextUtils.isEmpty(getText())) && (a.getIcon() == null);
  }
  
  public final boolean c()
  {
    return TextUtils.isEmpty(getText()) ^ true;
  }
  
  public CharSequence getAccessibilityClassName()
  {
    return Button.class.getName();
  }
  
  public h getItemData()
  {
    return a;
  }
  
  public final void onClick(View paramView)
  {
    paramView = e;
    if (paramView != null) {
      paramView.invokeItem(a);
    }
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    h = refresh();
    a();
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = TextUtils.isEmpty(getText());
    if (!bool)
    {
      j = mSavedPaddingLeft;
      if (j >= 0) {
        super.setPadding(j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
      }
    }
    super.onMeasure(paramInt1, paramInt2);
    int k = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int m = getMeasuredWidth();
    int j = mMinWidth;
    if (k == Integer.MIN_VALUE) {
      paramInt1 = Math.min(paramInt1, j);
    } else {
      paramInt1 = j;
    }
    if ((k != 1073741824) && (j > 0) && (m < paramInt1)) {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2);
    }
    if ((bool) && (d != null)) {
      super.setPadding((getMeasuredWidth() - d.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    super.onRestoreInstanceState(null);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (a.hasSubMenu())
    {
      ActivityChooserView.3 local3 = f;
      if ((local3 != null) && (local3.onTouch(this, paramMotionEvent))) {
        return true;
      }
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public final boolean refresh()
  {
    Configuration localConfiguration = getContext().getResources().getConfiguration();
    int j = screenWidthDp;
    int k = screenHeightDp;
    return (j >= 480) || ((j >= 640) && (k >= 480)) || (orientation == 2);
  }
  
  public void setCheckable(boolean paramBoolean) {}
  
  public void setChecked(boolean paramBoolean) {}
  
  public void setExpandedFormat(boolean paramBoolean)
  {
    if (i != paramBoolean)
    {
      i = paramBoolean;
      Object localObject = a;
      if (localObject != null)
      {
        localObject = b;
        o = true;
        ((f)localObject).b(true);
      }
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    d = paramDrawable;
    if (paramDrawable != null)
    {
      int n = paramDrawable.getIntrinsicWidth();
      int j = n;
      int i1 = paramDrawable.getIntrinsicHeight();
      int k = i1;
      int m = mMaxIconSize;
      float f1;
      if (n > m)
      {
        f1 = m / n;
        k = (int)(i1 * f1);
        j = m;
      }
      if (k > m)
      {
        f1 = m / k;
        j = (int)(j * f1);
      }
      else
      {
        m = k;
      }
      paramDrawable.setBounds(0, 0, j, m);
    }
    setCompoundDrawables(paramDrawable, null, null, null);
    a();
  }
  
  public void setItemInvoker(MenuBuilder.ItemInvoker paramItemInvoker)
  {
    e = paramItemInvoker;
  }
  
  public final void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    mSavedPaddingLeft = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setPopupCallback(ActionMenuItemView.b paramB)
  {
    g = paramB;
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    c = paramCharSequence;
    a();
  }
}
