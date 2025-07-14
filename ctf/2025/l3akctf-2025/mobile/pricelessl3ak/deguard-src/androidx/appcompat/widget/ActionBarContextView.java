package androidx.appcompat.widget;

import Console.R.styleable;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.c;
import app.ViewCompat;
import app.ViewPropertyAnimatorCompat;
import app.ViewPropertyAnimatorListener;
import menu.MenuView;
import menu.f;
import menu.i;
import menu.v;
import view.ActionMode;

public class ActionBarContextView
  extends ViewGroup
{
  public b mActionMenuPresenter;
  public View mClose;
  public final int mCloseItemLayout;
  public int mContentHeight;
  public View mCustomView;
  public boolean mEatingHover;
  public boolean mIsBeingDragged;
  public ActionMenuView mMenuView;
  public final android.content.Context mPopupContext;
  public CharSequence mSubtitle;
  public final int mSubtitleStyleRes;
  public TextView mSubtitleView;
  public CharSequence mTitle;
  public LinearLayout mTitleLayout;
  public boolean mTitleOptional;
  public final int mTitleStyleRes;
  public TextView mTitleView;
  public final AbsActionBarView.VisibilityAnimListener mVisAnimListener = new AbsActionBarView.VisibilityAnimListener(this);
  public ViewPropertyAnimatorCompat mVisibilityAnim;
  public View unreadFrame;
  
  public ActionBarContextView(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130903068);
    TypedValue localTypedValue = new TypedValue();
    if ((paramContext.getTheme().resolveAttribute(2130903042, localTypedValue, true)) && (resourceId != 0)) {
      mPopupContext = new ContextThemeWrapper(paramContext, resourceId);
    } else {
      mPopupContext = paramContext;
    }
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.SearchView, 2130903068, 0);
    if (paramAttributeSet.hasValue(0))
    {
      int i = paramAttributeSet.getResourceId(0, 0);
      if (i != 0)
      {
        paramContext = drupal.Context.getDrawable(paramContext, i);
        break label123;
      }
    }
    paramContext = paramAttributeSet.getDrawable(0);
    label123:
    setBackground(paramContext);
    mTitleStyleRes = paramAttributeSet.getResourceId(5, 0);
    mSubtitleStyleRes = paramAttributeSet.getResourceId(4, 0);
    mContentHeight = paramAttributeSet.getLayoutDimension(3, 0);
    mCloseItemLayout = paramAttributeSet.getResourceId(2, 2131427333);
    paramAttributeSet.recycle();
  }
  
  public static int measureChildView(View paramView, int paramInt1, int paramInt2)
  {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, Integer.MIN_VALUE), paramInt2);
    return Math.max(0, paramInt1 - paramView.getMeasuredWidth());
  }
  
  public static int positionChild(View paramView, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    paramInt2 = (paramInt3 - j) / 2 + paramInt2;
    if (paramBoolean) {
      paramView.layout(paramInt1 - i, paramInt2, paramInt1, j + paramInt2);
    } else {
      paramView.layout(paramInt1, paramInt2, paramInt1 + i, j + paramInt2);
    }
    if (paramBoolean) {
      return -i;
    }
    return i;
  }
  
  public final void animateToVisibility(int paramInt)
  {
    if (paramInt != getVisibility())
    {
      ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat = mVisibilityAnim;
      if (localViewPropertyAnimatorCompat != null) {
        localViewPropertyAnimatorCompat.cancel();
      }
      super.setVisibility(paramInt);
    }
  }
  
  public final ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.MarginLayoutParams(-1, -2);
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }
  
  public int getAnimatedVisibility()
  {
    if (mVisibilityAnim != null) {
      return mVisAnimListener.mFinalVisibility;
    }
    return getVisibility();
  }
  
  public int getContentHeight()
  {
    return mContentHeight;
  }
  
  public CharSequence getSubtitle()
  {
    return mSubtitle;
  }
  
  public CharSequence getTitle()
  {
    return mTitle;
  }
  
  public final void initForMode()
  {
    removeAllViews();
    mCustomView = null;
    mMenuView = null;
    mActionMenuPresenter = null;
    View localView = unreadFrame;
    if (localView != null) {
      localView.setOnClickListener(null);
    }
  }
  
  public final void initForMode(ActionMode paramActionMode)
  {
    Object localObject = mClose;
    if (localObject == null)
    {
      localObject = LayoutInflater.from(getContext()).inflate(mCloseItemLayout, this, false);
      mClose = ((View)localObject);
      addView((View)localObject);
    }
    else if (((View)localObject).getParent() == null)
    {
      addView(mClose);
    }
    localObject = mClose.findViewById(2131230774);
    unreadFrame = ((View)localObject);
    ((View)localObject).setOnClickListener(new c(1, paramActionMode));
    localObject = paramActionMode.getMenu();
    paramActionMode = mActionMenuPresenter;
    if (paramActionMode != null)
    {
      paramActionMode.hideOverflowMenu();
      paramActionMode = m;
      if ((paramActionMode != null) && (paramActionMode.a())) {
        l.dismiss();
      }
    }
    paramActionMode = new b(getContext());
    mActionMenuPresenter = paramActionMode;
    b = true;
    e = true;
    paramActionMode = new ViewGroup.LayoutParams(-2, -1);
    ((f)localObject).a(mActionMenuPresenter, mPopupContext);
    localObject = mActionMenuPresenter;
    MenuView localMenuView1 = mMenuView;
    if (localMenuView1 == null)
    {
      localMenuView2 = (MenuView)mSystemInflater.inflate(mMenuLayoutRes, this, false);
      mMenuView = localMenuView2;
      localMenuView2.initialize(c);
      ((b)localObject).updateMenuView();
    }
    MenuView localMenuView2 = mMenuView;
    if (localMenuView1 != localMenuView2) {
      ((ActionMenuView)localMenuView2).setPresenter((b)localObject);
    }
    localObject = (ActionMenuView)localMenuView2;
    mMenuView = ((ActionMenuView)localObject);
    ((View)localObject).setBackground(null);
    addView(mMenuView, paramActionMode);
  }
  
  public final void initTitle()
  {
    Object localObject = mTitleLayout;
    ActionBarContextView localActionBarContextView = this;
    int i;
    if (localObject == null)
    {
      LayoutInflater.from(localActionBarContextView.getContext()).inflate(2131427328, localActionBarContextView);
      localObject = (LinearLayout)localActionBarContextView.getChildAt(localActionBarContextView.getChildCount() - 1);
      mTitleLayout = ((LinearLayout)localObject);
      mTitleView = ((TextView)((View)localObject).findViewById(2131230765));
      localObject = mTitleLayout;
      mSubtitleView = ((TextView)((View)localObject).findViewById(2131230764));
      i = mTitleStyleRes;
      if (i != 0) {
        mTitleView.setTextAppearance(localActionBarContextView.getContext(), i);
      }
      i = mSubtitleStyleRes;
      if (i != 0) {
        mSubtitleView.setTextAppearance(localActionBarContextView.getContext(), i);
      }
    }
    localActionBarContextView = this;
    mTitleView.setText(mTitle);
    mSubtitleView.setText(mSubtitle);
    boolean bool1 = TextUtils.isEmpty(mTitle);
    boolean bool2 = TextUtils.isEmpty(mSubtitle);
    localObject = mSubtitleView;
    int j = 8;
    if (!bool2) {
      i = 0;
    } else {
      i = 8;
    }
    ((View)localObject).setVisibility(i);
    localObject = mTitleLayout;
    if (bool1)
    {
      i = j;
      if (bool2) {}
    }
    else
    {
      i = 0;
    }
    ((View)localObject).setVisibility(i);
    if (mTitleLayout.getParent() == null) {
      localActionBarContextView.addView(mTitleLayout);
    }
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = getContext().obtainStyledAttributes(null, R.styleable.ActionBar, 2130903045, 0);
    setContentHeight(paramConfiguration.getLayoutDimension(13, 0));
    paramConfiguration.recycle();
    paramConfiguration = mActionMenuPresenter;
    if (paramConfiguration != null)
    {
      Configuration localConfiguration = a.getResources().getConfiguration();
      int i = screenWidthDp;
      int j = screenHeightDp;
      if ((smallestScreenWidthDp <= 600) && (i <= 600) && ((i <= 960) || (j <= 720)) && ((i <= 720) || (j <= 960)))
      {
        if ((i < 500) && ((i <= 640) || (j <= 480)) && ((i <= 480) || (j <= 640)))
        {
          if (i >= 360) {
            i = 3;
          } else {
            i = 2;
          }
        }
        else {
          i = 4;
        }
      }
      else {
        i = 5;
      }
      i = i;
      paramConfiguration = c;
      if (paramConfiguration != null) {
        paramConfiguration.b(true);
      }
    }
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject = mActionMenuPresenter;
    if (localObject != null)
    {
      ((b)localObject).hideOverflowMenu();
      localObject = mActionMenuPresenter.m;
      if ((localObject != null) && (((i)localObject).a())) {
        l.dismiss();
      }
    }
  }
  
  public final boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 9) {
      mEatingHover = false;
    }
    if (!mEatingHover)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i == 9) && (!bool)) {
        mEatingHover = true;
      }
    }
    if ((i == 10) || (i == 3)) {
      mEatingHover = false;
    }
    return true;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramBoolean = R.id.this$0;
    if (getLayoutDirection() == 1) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    int i;
    if (paramBoolean) {
      i = paramInt3 - paramInt1 - getPaddingRight();
    } else {
      i = getPaddingLeft();
    }
    int j = getPaddingTop();
    int k = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
    Object localObject = mClose;
    paramInt2 = i;
    if (localObject != null)
    {
      paramInt2 = i;
      if (((View)localObject).getVisibility() != 8)
      {
        localObject = (ViewGroup.MarginLayoutParams)mClose.getLayoutParams();
        if (paramBoolean) {
          paramInt4 = rightMargin;
        } else {
          paramInt4 = leftMargin;
        }
        if (paramBoolean) {
          paramInt2 = leftMargin;
        } else {
          paramInt2 = rightMargin;
        }
        if (paramBoolean) {
          paramInt4 = i - paramInt4;
        } else {
          paramInt4 = i + paramInt4;
        }
        paramInt4 = positionChild(mClose, paramInt4, j, k, paramBoolean) + paramInt4;
        if (paramBoolean) {}
        for (paramInt2 = paramInt4 - paramInt2;; paramInt2 = paramInt4 + paramInt2) {
          break;
        }
      }
    }
    localObject = mTitleLayout;
    paramInt4 = paramInt2;
    if (localObject != null)
    {
      paramInt4 = paramInt2;
      if (mCustomView == null)
      {
        paramInt4 = paramInt2;
        if (((View)localObject).getVisibility() != 8) {
          paramInt4 = paramInt2 + positionChild(mTitleLayout, paramInt2, j, k, paramBoolean);
        }
      }
    }
    localObject = mCustomView;
    if (localObject != null) {
      positionChild((View)localObject, paramInt4, j, k, paramBoolean);
    }
    if (paramBoolean) {
      paramInt1 = getPaddingLeft();
    } else {
      paramInt1 = paramInt3 - paramInt1 - getPaddingRight();
    }
    localObject = mMenuView;
    if (localObject != null) {
      positionChild((View)localObject, paramInt1, j, k, paramBoolean ^ true);
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int k = 1073741824;
    if (i == 1073741824)
    {
      if (View.MeasureSpec.getMode(paramInt2) != 0)
      {
        int i1 = View.MeasureSpec.getSize(paramInt1);
        i = mContentHeight;
        if (i <= 0) {
          i = View.MeasureSpec.getSize(paramInt2);
        }
        paramInt1 = getPaddingTop();
        int i2 = getPaddingBottom() + paramInt1;
        paramInt1 = i1 - getPaddingLeft() - getPaddingRight();
        int m = i - i2;
        int j = View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE);
        Object localObject = mClose;
        paramInt2 = paramInt1;
        if (localObject != null)
        {
          paramInt1 = measureChildView((View)localObject, paramInt1, j);
          localObject = (ViewGroup.MarginLayoutParams)mClose.getLayoutParams();
          paramInt2 = paramInt1 - (leftMargin + rightMargin);
        }
        localObject = mMenuView;
        paramInt1 = paramInt2;
        if (localObject != null)
        {
          paramInt1 = paramInt2;
          if (((View)localObject).getParent() == this) {
            paramInt1 = measureChildView(mMenuView, paramInt2, j);
          }
        }
        localObject = mTitleLayout;
        int n = 0;
        paramInt2 = paramInt1;
        int i3;
        if (localObject != null)
        {
          paramInt2 = paramInt1;
          if (mCustomView == null) {
            if (mTitleOptional)
            {
              paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 0);
              mTitleLayout.measure(paramInt2, j);
              i3 = mTitleLayout.getMeasuredWidth();
              if (i3 <= paramInt1) {
                j = 1;
              } else {
                j = 0;
              }
              paramInt2 = paramInt1;
              if (j != 0) {
                paramInt2 = paramInt1 - i3;
              }
              localObject = mTitleLayout;
              if (j != 0) {
                paramInt1 = 0;
              } else {
                paramInt1 = 8;
              }
              ((View)localObject).setVisibility(paramInt1);
            }
            else
            {
              paramInt2 = measureChildView((View)localObject, paramInt1, j);
            }
          }
        }
        localObject = mCustomView;
        if (localObject != null)
        {
          localObject = ((View)localObject).getLayoutParams();
          i3 = width;
          if (i3 != -2) {
            paramInt1 = 1073741824;
          } else {
            paramInt1 = Integer.MIN_VALUE;
          }
          j = paramInt2;
          if (i3 >= 0) {
            j = Math.min(i3, paramInt2);
          }
          i3 = height;
          if (i3 != -2) {
            paramInt2 = k;
          } else {
            paramInt2 = Integer.MIN_VALUE;
          }
          k = m;
          if (i3 >= 0) {
            k = Math.min(i3, m);
          }
          mCustomView.measure(View.MeasureSpec.makeMeasureSpec(j, paramInt1), View.MeasureSpec.makeMeasureSpec(k, paramInt2));
        }
        if (mContentHeight <= 0)
        {
          k = getChildCount();
          paramInt2 = 0;
          paramInt1 = n;
          while (paramInt1 < k)
          {
            j = getChildAt(paramInt1).getMeasuredHeight() + i2;
            i = paramInt2;
            if (j > paramInt2) {
              i = j;
            }
            paramInt1 += 1;
            paramInt2 = i;
          }
          setMeasuredDimension(i1, paramInt2);
          return;
        }
        setMeasuredDimension(i1, i);
        return;
      }
      throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
    }
    throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0) {
      mIsBeingDragged = false;
    }
    if (!mIsBeingDragged)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i == 0) && (!bool)) {
        mIsBeingDragged = true;
      }
    }
    if ((i == 1) || (i == 3)) {
      mIsBeingDragged = false;
    }
    return true;
  }
  
  public void setContentHeight(int paramInt)
  {
    mContentHeight = paramInt;
  }
  
  public void setCustomView(View paramView)
  {
    Object localObject = mCustomView;
    if (localObject != null) {
      removeView((View)localObject);
    }
    mCustomView = paramView;
    if (paramView != null)
    {
      localObject = mTitleLayout;
      if (localObject != null)
      {
        removeView((View)localObject);
        mTitleLayout = null;
      }
    }
    if (paramView != null) {
      addView(paramView);
    }
    requestLayout();
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    mSubtitle = paramCharSequence;
    initTitle();
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    mTitle = paramCharSequence;
    initTitle();
    ViewCompat.a(this, paramCharSequence);
  }
  
  public void setTitleOptional(boolean paramBoolean)
  {
    if (paramBoolean != mTitleOptional) {
      requestLayout();
    }
    mTitleOptional = paramBoolean;
  }
  
  public final ViewPropertyAnimatorCompat setupAnimatorToVisibility(int paramInt, long paramLong)
  {
    Object localObject = mVisibilityAnim;
    if (localObject != null) {
      ((ViewPropertyAnimatorCompat)localObject).cancel();
    }
    localObject = mVisAnimListener;
    if (paramInt == 0)
    {
      if (getVisibility() != 0) {
        setAlpha(0.0F);
      }
      localViewPropertyAnimatorCompat = ViewCompat.animate(this);
      localViewPropertyAnimatorCompat.alpha(1.0F);
      localViewPropertyAnimatorCompat.setDuration(paramLong);
      this$0.mVisibilityAnim = localViewPropertyAnimatorCompat;
      mFinalVisibility = paramInt;
      localViewPropertyAnimatorCompat.setListener((ViewPropertyAnimatorListener)localObject);
      return localViewPropertyAnimatorCompat;
    }
    ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat = ViewCompat.animate(this);
    localViewPropertyAnimatorCompat.alpha(0.0F);
    localViewPropertyAnimatorCompat.setDuration(paramLong);
    this$0.mVisibilityAnim = localViewPropertyAnimatorCompat;
    mFinalVisibility = paramInt;
    localViewPropertyAnimatorCompat.setListener((ViewPropertyAnimatorListener)localObject);
    return localViewPropertyAnimatorCompat;
  }
  
  public final boolean shouldDelayChildPressedState()
  {
    return false;
  }
}
