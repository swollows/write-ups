package androidx.appcompat.widget;

import Console.R.styleable;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class ActionBarContainer
  extends FrameLayout
{
  public View mActionBarView;
  public Drawable mBackground;
  public View mContextView;
  public final int mHeight;
  public final boolean mIsSplit;
  public boolean mIsStacked;
  public boolean mIsTransitioning;
  public Drawable mSplitBackground;
  public Drawable mStackedBackground;
  
  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setBackground(new CircularBorderDrawable(this));
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.ActionBar);
    boolean bool2 = false;
    mBackground = paramContext.getDrawable(0);
    mStackedBackground = paramContext.getDrawable(2);
    mHeight = paramContext.getDimensionPixelSize(13, -1);
    if (getId() == 2131230870)
    {
      mIsSplit = true;
      mSplitBackground = paramContext.getDrawable(1);
    }
    paramContext.recycle();
    boolean bool1;
    if (mIsSplit)
    {
      bool1 = bool2;
      if (mSplitBackground != null) {}
    }
    else
    {
      do
      {
        bool1 = true;
        break;
        bool1 = bool2;
        if (mBackground != null) {
          break;
        }
        bool1 = bool2;
      } while (mStackedBackground == null);
    }
    setWillNotDraw(bool1);
  }
  
  public final void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = mBackground;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      mBackground.setState(getDrawableState());
    }
    localDrawable = mStackedBackground;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      mStackedBackground.setState(getDrawableState());
    }
    localDrawable = mSplitBackground;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      mSplitBackground.setState(getDrawableState());
    }
  }
  
  public View getTabContainer()
  {
    return null;
  }
  
  public final void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    Drawable localDrawable = mBackground;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
    localDrawable = mStackedBackground;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
    localDrawable = mSplitBackground;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
  }
  
  public final void onFinishInflate()
  {
    super.onFinishInflate();
    mActionBarView = findViewById(2131230759);
    mContextView = findViewById(2131230767);
  }
  
  public final boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    super.onHoverEvent(paramMotionEvent);
    return true;
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return (mIsTransitioning) || (super.onInterceptTouchEvent(paramMotionEvent));
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    paramBoolean = mIsSplit;
    paramInt2 = 1;
    paramInt1 = 1;
    Object localObject;
    if (paramBoolean)
    {
      localObject = mSplitBackground;
      if (localObject != null)
      {
        ((Drawable)localObject).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        paramInt1 = paramInt2;
      }
      else
      {
        paramInt1 = 0;
      }
    }
    else
    {
      if (mBackground != null)
      {
        if (mActionBarView.getVisibility() == 0)
        {
          mBackground.setBounds(mActionBarView.getLeft(), mActionBarView.getTop(), mActionBarView.getRight(), mActionBarView.getBottom());
        }
        else
        {
          localObject = mContextView;
          if ((localObject != null) && (((View)localObject).getVisibility() == 0)) {
            mBackground.setBounds(mContextView.getLeft(), mContextView.getTop(), mContextView.getRight(), mContextView.getBottom());
          } else {
            mBackground.setBounds(0, 0, 0, 0);
          }
        }
      }
      else {
        paramInt1 = 0;
      }
      mIsStacked = false;
    }
    if (paramInt1 != 0) {
      invalidate();
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (mActionBarView == null)
    {
      i = paramInt2;
      if (View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE)
      {
        int j = mHeight;
        i = paramInt2;
        if (j >= 0) {
          i = View.MeasureSpec.makeMeasureSpec(Math.min(j, View.MeasureSpec.getSize(paramInt2)), Integer.MIN_VALUE);
        }
      }
    }
    super.onMeasure(paramInt1, i);
    if (mActionBarView == null) {
      return;
    }
    View.MeasureSpec.getMode(i);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void setPrimaryBackground(Drawable paramDrawable)
  {
    Drawable localDrawable = mBackground;
    if (localDrawable != null)
    {
      localDrawable.setCallback(null);
      unscheduleDrawable(mBackground);
    }
    mBackground = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      paramDrawable = mActionBarView;
      if (paramDrawable != null) {
        mBackground.setBounds(paramDrawable.getLeft(), mActionBarView.getTop(), mActionBarView.getRight(), mActionBarView.getBottom());
      }
    }
    boolean bool1 = mIsSplit;
    boolean bool2 = false;
    if (bool1)
    {
      bool1 = bool2;
      if (mSplitBackground != null) {}
    }
    else
    {
      do
      {
        bool1 = true;
        break;
        bool1 = bool2;
        if (mBackground != null) {
          break;
        }
        bool1 = bool2;
      } while (mStackedBackground == null);
    }
    setWillNotDraw(bool1);
    invalidate();
    invalidateOutline();
  }
  
  public void setSplitBackground(Drawable paramDrawable)
  {
    Drawable localDrawable = mSplitBackground;
    if (localDrawable != null)
    {
      localDrawable.setCallback(null);
      unscheduleDrawable(mSplitBackground);
    }
    mSplitBackground = paramDrawable;
    boolean bool1 = mIsSplit;
    boolean bool2 = false;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if (bool1)
      {
        paramDrawable = mSplitBackground;
        if (paramDrawable != null) {
          paramDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
      }
    }
    if (bool1)
    {
      bool1 = bool2;
      if (mSplitBackground != null) {}
    }
    else
    {
      do
      {
        bool1 = true;
        break;
        bool1 = bool2;
        if (mBackground != null) {
          break;
        }
        bool1 = bool2;
      } while (mStackedBackground == null);
    }
    setWillNotDraw(bool1);
    invalidate();
    invalidateOutline();
  }
  
  public void setStackedBackground(Drawable paramDrawable)
  {
    Drawable localDrawable = mStackedBackground;
    if (localDrawable != null)
    {
      localDrawable.setCallback(null);
      unscheduleDrawable(mStackedBackground);
    }
    mStackedBackground = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if ((mIsStacked) && (mStackedBackground != null)) {
        throw new NullPointerException("Null throw statement replaced by Soot");
      }
    }
    boolean bool1 = mIsSplit;
    boolean bool2 = false;
    if (bool1)
    {
      bool1 = bool2;
      if (mSplitBackground != null) {}
    }
    else
    {
      do
      {
        bool1 = true;
        break;
        bool1 = bool2;
        if (mBackground != null) {
          break;
        }
        bool1 = bool2;
      } while (mStackedBackground == null);
    }
    setWillNotDraw(bool1);
    invalidate();
    invalidateOutline();
  }
  
  public void setTabContainer(ScrollingTabContainerView paramScrollingTabContainerView) {}
  
  public void setTransitioning(boolean paramBoolean)
  {
    mIsTransitioning = paramBoolean;
    int i;
    if (paramBoolean) {
      i = 393216;
    } else {
      i = 262144;
    }
    setDescendantFocusability(i);
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    boolean bool;
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    }
    Drawable localDrawable = mBackground;
    if (localDrawable != null) {
      localDrawable.setVisible(bool, false);
    }
    localDrawable = mStackedBackground;
    if (localDrawable != null) {
      localDrawable.setVisible(bool, false);
    }
    localDrawable = mSplitBackground;
    if (localDrawable != null) {
      localDrawable.setVisible(bool, false);
    }
  }
  
  public final ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  public final ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback, int paramInt)
  {
    if (paramInt != 0) {
      return super.startActionModeForChild(paramView, paramCallback, paramInt);
    }
    return null;
  }
  
  public final boolean verifyDrawable(Drawable paramDrawable)
  {
    Drawable localDrawable = mBackground;
    boolean bool = mIsSplit;
    return ((paramDrawable == localDrawable) && (!bool)) || ((paramDrawable == mStackedBackground) && (mIsStacked)) || ((paramDrawable == mSplitBackground) && (bool)) || (super.verifyDrawable(paramDrawable));
  }
}
