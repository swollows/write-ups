package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.appcompat.app.AppCompatDelegateImplV7;
import androidx.appcompat.app.AppCompatDelegateImplV7.PanelFeatureState;
import androidx.appcompat.app.a;
import app.ViewPropertyAnimatorCompat;
import menu.f;
import menu.i;
import menu.v;

public class ContentFrameLayout
  extends FrameLayout
{
  public ContentFrameLayout.OnAttachListener mAttachListener;
  public final Rect mDecorPadding = new Rect();
  public TypedValue mFixedHeightMajor;
  public TypedValue mFixedHeightMinor;
  public TypedValue mFixedWidthMajor;
  public TypedValue mFixedWidthMinor;
  public TypedValue mMinWidthMajor;
  public TypedValue mMinWidthMinor;
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  public TypedValue getFixedHeightMajor()
  {
    if (mFixedHeightMajor == null) {
      mFixedHeightMajor = new TypedValue();
    }
    return mFixedHeightMajor;
  }
  
  public TypedValue getFixedHeightMinor()
  {
    if (mFixedHeightMinor == null) {
      mFixedHeightMinor = new TypedValue();
    }
    return mFixedHeightMinor;
  }
  
  public TypedValue getFixedWidthMajor()
  {
    if (mFixedWidthMajor == null) {
      mFixedWidthMajor = new TypedValue();
    }
    return mFixedWidthMajor;
  }
  
  public TypedValue getFixedWidthMinor()
  {
    if (mFixedWidthMinor == null) {
      mFixedWidthMinor = new TypedValue();
    }
    return mFixedWidthMinor;
  }
  
  public TypedValue getMinWidthMajor()
  {
    if (mMinWidthMajor == null) {
      mMinWidthMajor = new TypedValue();
    }
    return mMinWidthMajor;
  }
  
  public TypedValue getMinWidthMinor()
  {
    if (mMinWidthMinor == null) {
      mMinWidthMinor = new TypedValue();
    }
    return mMinWidthMinor;
  }
  
  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    ContentFrameLayout.OnAttachListener localOnAttachListener = mAttachListener;
    if (localOnAttachListener != null) {
      localOnAttachListener.getClass();
    }
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject1 = mAttachListener;
    if (localObject1 != null)
    {
      localObject1 = a;
      Object localObject2 = mDecorContentParent;
      if (localObject2 != null)
      {
        localObject2 = (ActionBarOverlayLayout)localObject2;
        ((ActionBarOverlayLayout)localObject2).pullChildren();
        localObject2 = mDecorToolbar).mToolbar.mMenuView;
        if (localObject2 != null)
        {
          localObject2 = mPresenter;
          if (localObject2 != null)
          {
            ((b)localObject2).hideOverflowMenu();
            localObject2 = m;
            if ((localObject2 != null) && (((i)localObject2).a())) {
              l.dismiss();
            }
          }
        }
      }
      if (mActionModePopup != null)
      {
        mWindow.getDecorView().removeCallbacks(mShowActionModePopup);
        if (mActionModePopup.isShowing()) {
          localObject2 = mActionModePopup;
        }
      }
      try
      {
        ((PopupWindow)localObject2).dismiss();
        mActionModePopup = null;
        localObject2 = mFadeAnim;
        if (localObject2 != null) {
          ((ViewPropertyAnimatorCompat)localObject2).cancel();
        }
        localObject1 = a0j;
        if (localObject1 != null)
        {
          ((f)localObject1).a(true);
          return;
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;) {}
      }
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    DisplayMetrics localDisplayMetrics = getContext().getResources().getDisplayMetrics();
    int i = widthPixels;
    int j = heightPixels;
    int n = 1;
    if (i < j) {
      i = 1;
    } else {
      i = 0;
    }
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int m = View.MeasureSpec.getMode(paramInt2);
    Rect localRect = mDecorPadding;
    TypedValue localTypedValue;
    float f;
    if (i1 == Integer.MIN_VALUE)
    {
      if (i != 0) {
        localTypedValue = mFixedWidthMinor;
      } else {
        localTypedValue = mFixedWidthMajor;
      }
      if (localTypedValue != null)
      {
        j = type;
        if (j != 0)
        {
          if (j == 5) {}
          for (f = localTypedValue.getDimension(localDisplayMetrics);; f = localTypedValue.getFraction(j, j))
          {
            j = (int)f;
            break label160;
            if (j != 6) {
              break;
            }
            j = widthPixels;
          }
          j = 0;
          label160:
          if (j > 0)
          {
            k = View.MeasureSpec.makeMeasureSpec(Math.min(j - (left + right), View.MeasureSpec.getSize(paramInt1)), 1073741824);
            paramInt1 = 1;
            break label207;
          }
        }
      }
    }
    j = 0;
    int k = paramInt1;
    paramInt1 = j;
    label207:
    j = paramInt2;
    if (m == Integer.MIN_VALUE)
    {
      if (i != 0) {
        localTypedValue = mFixedHeightMajor;
      } else {
        localTypedValue = mFixedHeightMinor;
      }
      j = paramInt2;
      if (localTypedValue != null)
      {
        m = type;
        j = paramInt2;
        if (m != 0)
        {
          if (m == 5) {}
          for (f = localTypedValue.getDimension(localDisplayMetrics);; f = localTypedValue.getFraction(j, j))
          {
            m = (int)f;
            break label313;
            if (m != 6) {
              break;
            }
            j = heightPixels;
          }
          m = 0;
          label313:
          j = paramInt2;
          if (m > 0) {
            j = View.MeasureSpec.makeMeasureSpec(Math.min(m - (top + bottom), View.MeasureSpec.getSize(paramInt2)), 1073741824);
          }
        }
      }
    }
    super.onMeasure(k, j);
    m = getMeasuredWidth();
    k = View.MeasureSpec.makeMeasureSpec(m, 1073741824);
    if ((paramInt1 == 0) && (i1 == Integer.MIN_VALUE))
    {
      if (i != 0) {
        localTypedValue = mMinWidthMinor;
      } else {
        localTypedValue = mMinWidthMajor;
      }
      if (localTypedValue != null)
      {
        paramInt1 = type;
        if (paramInt1 != 0)
        {
          if (paramInt1 == 5) {}
          for (f = localTypedValue.getDimension(localDisplayMetrics);; f = localTypedValue.getFraction(paramInt1, paramInt1))
          {
            paramInt1 = (int)f;
            break label467;
            if (paramInt1 != 6) {
              break;
            }
            paramInt1 = widthPixels;
          }
          paramInt1 = 0;
          label467:
          paramInt2 = paramInt1;
          if (paramInt1 > 0) {
            paramInt2 = paramInt1 - (left + right);
          }
          if (m < paramInt2)
          {
            paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
            paramInt2 = n;
            break label511;
          }
        }
      }
    }
    paramInt2 = 0;
    paramInt1 = k;
    label511:
    if (paramInt2 != 0) {
      super.onMeasure(paramInt1, j);
    }
  }
  
  public void setAttachListener(ContentFrameLayout.OnAttachListener paramOnAttachListener)
  {
    mAttachListener = paramOnAttachListener;
  }
}
