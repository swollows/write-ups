package androidx.core.widget;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import app.AppCompatDelegateImplV7.PanelFeatureState;
import app.Common;
import app.Label;
import app.NestedScrollingParent;
import app.NestedScrollingParentHelper;
import app.NumberPicker.Formatter;
import app.PieChart;
import app.SwipeRefreshLayout;
import app.Switch;
import app.Vector;
import app.ViewCompat;
import app.ViewCompatLollipop;
import app.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

public class NestedScrollView
  extends FrameLayout
  implements NestedScrollingParent
{
  public static final NestedScrollView.AccessibilityDelegate ACCESSIBILITY_DELEGATE;
  public static final int[] SCROLLVIEW_STYLEABLE;
  public static final float i;
  public final Switch a;
  public final int[] c;
  public final float d;
  public final int[] e;
  public final EdgeEffect h;
  public int mActivePointerId;
  public PieChart mChart;
  public View mChildToScrollTo;
  public boolean mFillViewport;
  public boolean mIsBeingDragged;
  public boolean mIsLaidOut;
  public boolean mIsLayoutDirty;
  public int mLastFlingY;
  public int mLastMotionY;
  public long mLastScroll;
  public final int mMaximumVelocity;
  public final int mMinimumVelocity;
  public int mNestedYOffset;
  public final NestedScrollingParentHelper mParentHelper;
  public SavedState mSavedState;
  public final OverScroller mScroller;
  public boolean mSmoothScrollingEnabled;
  public final Rect mTempRect;
  public final int mTouchSlop;
  public VelocityTracker mVelocityTracker;
  public float mVerticalScrollFactor;
  public final EdgeEffect x;
  public final Label y;
  
  static
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public NestedScrollView(android.content.Context paramContext, AttributeSet paramAttributeSet) {}
  
  private PieChart getScrollFeedbackProvider()
  {
    if (mChart == null) {
      mChart = new PieChart(this);
    }
    return mChart;
  }
  
  public static boolean isViewDescendantOf(View paramView, NestedScrollView paramNestedScrollView)
  {
    if (paramView == paramNestedScrollView) {
      return true;
    }
    paramView = paramView.getParent();
    return ((paramView instanceof ViewGroup)) && (isViewDescendantOf((View)paramView, paramNestedScrollView));
  }
  
  public final void a(int paramInt)
  {
    Label localLabel = y;
    ViewParent localViewParent = localLabel.a(paramInt);
    if (localViewParent != null)
    {
      boolean bool = localViewParent instanceof SwipeRefreshLayout;
      NestedScrollView localNestedScrollView = mView;
      if (bool) {
        ((SwipeRefreshLayout)localViewParent).onStopNestedScroll(localNestedScrollView, paramInt);
      } else if (paramInt == 0) {
        try
        {
          localViewParent.onStopNestedScroll(localNestedScrollView);
        }
        catch (AbstractMethodError localAbstractMethodError)
        {
          StringBuilder localStringBuilder = new StringBuilder("ViewParent ");
          localStringBuilder.append(localViewParent);
          localStringBuilder.append(" does not implement interface method onStopNestedScroll");
          Log.e("ViewParentCompat", localStringBuilder.toString(), localAbstractMethodError);
        }
      }
      if (paramInt != 0)
      {
        if (paramInt != 1) {
          return;
        }
        f = null;
        return;
      }
      g = null;
    }
  }
  
  public final boolean a(int paramInt1, int paramInt2)
  {
    Label localLabel = y;
    int j;
    if (localLabel.a(paramInt2) != null) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0) {
      return true;
    }
    if (c)
    {
      Object localObject2 = mView;
      ViewParent localViewParent = ((View)localObject2).getParent();
      Object localObject1 = localObject2;
      for (;;)
      {
        if (localViewParent == null) {
          break label307;
        }
        boolean bool2 = localViewParent instanceof SwipeRefreshLayout;
        boolean bool1;
        if (bool2) {
          bool1 = ((SwipeRefreshLayout)localViewParent).onStartNestedScroll(localObject1, (View)localObject2, paramInt1, paramInt2);
        } else if (paramInt2 == 0) {
          try
          {
            bool1 = localViewParent.onStartNestedScroll(localObject1, (View)localObject2, paramInt1);
          }
          catch (AbstractMethodError localAbstractMethodError2)
          {
            StringBuilder localStringBuilder = new StringBuilder("ViewParent ");
            localStringBuilder.append(localViewParent);
            localStringBuilder.append(" does not implement interface method onStartNestedScroll");
            Log.e("ViewParentCompat", localStringBuilder.toString(), localAbstractMethodError2);
          }
        } else {
          bool1 = false;
        }
        if (bool1)
        {
          if (paramInt2 != 0)
          {
            if (paramInt2 == 1) {
              f = localViewParent;
            }
          }
          else {
            g = localViewParent;
          }
          if (bool2)
          {
            ((SwipeRefreshLayout)localViewParent).onStopNestedScroll(localObject1, (View)localObject2, paramInt1, paramInt2);
            break;
          }
          if (paramInt2 != 0) {
            break;
          }
          try
          {
            localViewParent.onNestedScrollAccepted(localObject1, (View)localObject2, paramInt1);
          }
          catch (AbstractMethodError localAbstractMethodError1)
          {
            localObject2 = new StringBuilder("ViewParent ");
            ((StringBuilder)localObject2).append(localViewParent);
            ((StringBuilder)localObject2).append(" does not implement interface method onNestedScrollAccepted");
            Log.e("ViewParentCompat", ((StringBuilder)localObject2).toString(), localAbstractMethodError1);
          }
          break;
        }
        if ((localViewParent instanceof View)) {
          View localView = (View)localViewParent;
        }
        localViewParent = localViewParent.getParent();
      }
    }
    label307:
    return false;
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    Object localObject = y;
    if (c)
    {
      ViewParent localViewParent = ((Label)localObject).a(paramInt3);
      if (localViewParent == null) {
        return false;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (paramArrayOfInt2 != null)
        {
          paramArrayOfInt2[0] = 0;
          paramArrayOfInt2[1] = 0;
          return false;
        }
      }
      else
      {
        NestedScrollView localNestedScrollView = mView;
        int j;
        int k;
        if (paramArrayOfInt2 != null)
        {
          localNestedScrollView.getLocationInWindow(paramArrayOfInt2);
          j = paramArrayOfInt2[0];
          k = paramArrayOfInt2[1];
        }
        else
        {
          j = 0;
          k = 0;
        }
        int[] arrayOfInt = paramArrayOfInt1;
        if (paramArrayOfInt1 == null)
        {
          if (h == null) {
            h = new int[2];
          }
          arrayOfInt = h;
        }
        arrayOfInt[0] = 0;
        arrayOfInt[1] = 0;
        if ((localViewParent instanceof SwipeRefreshLayout)) {
          ((SwipeRefreshLayout)localViewParent).draw(paramInt1, paramInt2, arrayOfInt, paramInt3);
        } else if (paramInt3 == 0) {
          try
          {
            localViewParent.onNestedPreScroll(localNestedScrollView, paramInt1, paramInt2, arrayOfInt);
          }
          catch (AbstractMethodError paramArrayOfInt1)
          {
            localObject = new StringBuilder("ViewParent ");
            ((StringBuilder)localObject).append(localViewParent);
            ((StringBuilder)localObject).append(" does not implement interface method onNestedPreScroll");
            Log.e("ViewParentCompat", ((StringBuilder)localObject).toString(), paramArrayOfInt1);
          }
        }
        if (paramArrayOfInt2 != null)
        {
          localNestedScrollView.getLocationInWindow(paramArrayOfInt2);
          paramArrayOfInt2[0] -= j;
          paramArrayOfInt2[1] -= k;
        }
        if ((arrayOfInt[0] != 0) || (arrayOfInt[1] != 0)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final boolean a(MotionEvent paramMotionEvent)
  {
    EdgeEffect localEdgeEffect = h;
    boolean bool;
    if (drupal.Context.draw(localEdgeEffect) != 0.0F)
    {
      drupal.Context.draw(localEdgeEffect, 0.0F, paramMotionEvent.getX() / getWidth());
      bool = true;
    }
    else
    {
      bool = false;
    }
    localEdgeEffect = x;
    if (drupal.Context.draw(localEdgeEffect) != 0.0F)
    {
      drupal.Context.draw(localEdgeEffect, 0.0F, 1.0F - paramMotionEvent.getX() / getWidth());
      return true;
    }
    return bool;
  }
  
  public final void addView(View paramView)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public final void addView(View paramView, int paramInt)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView, paramInt);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public final void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView, paramInt, paramLayoutParams);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public final void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView, paramLayoutParams);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public final boolean arrowScroll(int paramInt)
  {
    View localView2 = findFocus();
    View localView1 = localView2;
    if (localView2 == this) {
      localView1 = null;
    }
    localView2 = FocusFinder.getInstance().findNextFocus(this, localView1, paramInt);
    int m = getMaxScrollAmount();
    int k = m;
    Object localObject;
    if ((localView2 != null) && (isWithinDeltaOfScreen(localView2, m, getHeight())))
    {
      localObject = mTempRect;
      localView2.getDrawingRect((Rect)localObject);
      offsetDescendantRectToMyCoords(localView2, (Rect)localObject);
      draw(computeScrollDeltaToGetChildRectOnScreen((Rect)localObject), -1, null, 0, 1, true);
      localView2.requestFocus(paramInt);
    }
    else
    {
      int j;
      if ((paramInt == 33) && (getScrollY() < m))
      {
        j = getScrollY();
      }
      else
      {
        j = k;
        if (paramInt == 130)
        {
          j = k;
          if (getChildCount() > 0)
          {
            localView2 = getChildAt(0);
            localObject = (FrameLayout.LayoutParams)localView2.getLayoutParams();
            j = localView2.getBottom();
            k = bottomMargin;
            int n = getScrollY();
            j = Math.min(j + k - (getHeight() + n - getPaddingBottom()), m);
          }
        }
      }
      if (j == 0) {
        return false;
      }
      if (paramInt != 130) {
        for (;;)
        {
          j = -j;
        }
      }
      draw(j, -1, null, 0, 1, true);
    }
    if ((localView1 != null) && (localView1.isFocused()) && (!isWithinDeltaOfScreen(localView1, 0, getHeight())))
    {
      paramInt = getDescendantFocusability();
      setDescendantFocusability(131072);
      requestFocus();
      setDescendantFocusability(paramInt);
    }
    return true;
  }
  
  public final int computeHorizontalScrollExtent()
  {
    return super.computeHorizontalScrollExtent();
  }
  
  public final int computeHorizontalScrollOffset()
  {
    return super.computeHorizontalScrollOffset();
  }
  
  public final int computeHorizontalScrollRange()
  {
    return super.computeHorizontalScrollRange();
  }
  
  public final void computeScroll()
  {
    if (mScroller.isFinished()) {
      return;
    }
    mScroller.computeScrollOffset();
    int i1 = mScroller.getCurrY();
    int m = i1 - mLastFlingY;
    int k = getHeight();
    EdgeEffect localEdgeEffect1 = x;
    EdgeEffect localEdgeEffect2 = h;
    float f1;
    float f2;
    int n;
    if ((m > 0) && (drupal.Context.draw(localEdgeEffect2) != 0.0F))
    {
      f1 = -m * 4.0F / k;
      f2 = -k / 4.0F;
      n = Math.round(drupal.Context.draw(localEdgeEffect2, f1, 0.5F) * f2);
      k = n;
      j = k;
      if (n != m)
      {
        localEdgeEffect2.finish();
        j = k;
      }
    }
    for (;;)
    {
      j = m - j;
      break;
      j = m;
      if (m >= 0) {
        break;
      }
      j = m;
      if (drupal.Context.draw(localEdgeEffect1) == 0.0F) {
        break;
      }
      f2 = m;
      f1 = k;
      f2 = f2 * 4.0F / f1;
      f1 /= 4.0F;
      n = Math.round(drupal.Context.draw(localEdgeEffect1, f2, 0.5F) * f1);
      k = n;
      j = k;
      if (n != m)
      {
        localEdgeEffect1.finish();
        j = k;
      }
    }
    mLastFlingY = i1;
    int[] arrayOfInt = c;
    arrayOfInt[1] = 0;
    a(0, j, 1, arrayOfInt, null);
    k = j - arrayOfInt[1];
    m = getScrollRange();
    if (Build.VERSION.SDK_INT >= 35) {
      ScrollerCompat.create(this, Math.abs(mScroller.getCurrVelocity()));
    }
    int j = k;
    if (k != 0)
    {
      j = getScrollY();
      overScrollByCompat(k, getScrollX(), j, m);
      j = getScrollY() - j;
      k -= j;
      arrayOfInt[1] = 0;
      y.a(0, j, 0, k, e, 1, arrayOfInt);
      j = k - arrayOfInt[1];
    }
    if (j != 0)
    {
      k = getOverScrollMode();
      if ((k == 0) || ((k == 1) && (m > 0))) {
        if (j < 0)
        {
          if (localEdgeEffect2.isFinished()) {
            localEdgeEffect2.onAbsorb((int)mScroller.getCurrVelocity());
          }
        }
        else if (localEdgeEffect1.isFinished()) {
          localEdgeEffect1.onAbsorb((int)mScroller.getCurrVelocity());
        }
      }
      mScroller.abortAnimation();
      a(1);
    }
    if (!mScroller.isFinished())
    {
      postInvalidateOnAnimation();
      return;
    }
    a(1);
  }
  
  public final int computeScrollDeltaToGetChildRectOnScreen(Rect paramRect)
  {
    if (getChildCount() == 0) {
      return 0;
    }
    int n = getHeight();
    int k = getScrollY();
    int j = k;
    int m = k + n;
    int i1 = getVerticalFadingEdgeLength();
    if (top > 0) {
      j = k + i1;
    }
    View localView = getChildAt(0);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
    if (bottom < localView.getHeight() + topMargin + bottomMargin) {
      k = m - i1;
    } else {
      k = m;
    }
    i1 = bottom;
    if ((i1 > k) && (top > j))
    {
      if (paramRect.height() > n) {
        j = top - j;
      } else {
        j = bottom - k;
      }
      return Math.min(j, localView.getBottom() + bottomMargin - m);
    }
    if ((top < j) && (i1 < k))
    {
      if (paramRect.height() > n) {
        j = 0 - (k - bottom);
      } else {
        j = 0 - (j - top);
      }
      return Math.max(j, -getScrollY());
    }
    return 0;
  }
  
  public final int computeVerticalScrollExtent()
  {
    return super.computeVerticalScrollExtent();
  }
  
  public final int computeVerticalScrollOffset()
  {
    return Math.max(0, super.computeVerticalScrollOffset());
  }
  
  public final int computeVerticalScrollRange()
  {
    int k = getChildCount();
    int j = getHeight() - getPaddingBottom() - getPaddingTop();
    if (k == 0) {
      return j;
    }
    View localView = getChildAt(0);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
    k = localView.getBottom() + bottomMargin;
    int m = getScrollY();
    int n = Math.max(0, k - j);
    if (m < 0) {
      return k - m;
    }
    j = k;
    if (m > n) {
      j = k + (m - n);
    }
    return j;
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return (super.dispatchKeyEvent(paramKeyEvent)) || (executeKeyEvent(paramKeyEvent));
  }
  
  public final boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    Object localObject = y;
    if (c)
    {
      ViewParent localViewParent = ((Label)localObject).a(0);
      if (localViewParent != null)
      {
        localObject = mView;
        try
        {
          paramBoolean = localViewParent.onNestedFling((View)localObject, paramFloat1, paramFloat2, paramBoolean);
          return paramBoolean;
        }
        catch (AbstractMethodError localAbstractMethodError)
        {
          StringBuilder localStringBuilder = new StringBuilder("ViewParent ");
          localStringBuilder.append(localViewParent);
          localStringBuilder.append(" does not implement interface method onNestedFling");
          Log.e("ViewParentCompat", localStringBuilder.toString(), localAbstractMethodError);
        }
      }
    }
    return false;
  }
  
  public final boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return y.onNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public final boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return a(paramInt1, paramInt2, 0, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public final boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return y.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, 0, null);
  }
  
  public final int draw(int paramInt1, int paramInt2, MotionEvent paramMotionEvent, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    if (paramInt4 == 1) {
      a(2, paramInt4);
    }
    Object localObject1 = e;
    boolean bool = a(0, paramInt1, paramInt4, c, (int[])localObject1);
    localObject1 = c;
    Object localObject2 = e;
    int k;
    int j;
    if (bool)
    {
      k = paramInt1 - localObject1[1];
      j = localObject2[1];
    }
    else
    {
      j = 0;
      k = paramInt1;
    }
    int i1 = getScrollY();
    int n = getScrollRange();
    paramInt1 = getOverScrollMode();
    int m;
    if (((paramInt1 == 0) || ((paramInt1 == 1) && (getScrollRange() > 0))) && (!paramBoolean)) {
      m = 1;
    } else {
      m = 0;
    }
    if ((overScrollByCompat(k, 0, i1, n)) && (y.a(paramInt4) == null)) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    int i2 = getScrollY() - i1;
    PieChart localPieChart;
    if ((paramMotionEvent != null) && (i2 != 0))
    {
      localPieChart = getScrollFeedbackProvider();
      int i3 = paramMotionEvent.getDeviceId();
      int i4 = paramMotionEvent.getSource();
      a.toString(i3, i4, paramInt2, i2);
    }
    localObject1[1] = 0;
    y.a(0, i2, 0, k - i2, e, paramInt4, (int[])localObject1);
    i2 = localObject2[1];
    k -= localObject1[1];
    i1 += k;
    localObject1 = x;
    localObject2 = h;
    if (i1 < 0) {
      if (m != 0)
      {
        drupal.Context.draw((EdgeEffect)localObject2, -k / getHeight(), paramInt3 / getWidth());
        if (paramMotionEvent != null)
        {
          localPieChart = getScrollFeedbackProvider();
          paramInt3 = paramMotionEvent.getDeviceId();
          k = paramMotionEvent.getSource();
          a.format(paramInt3, k, paramInt2, true);
        }
        if (!((EdgeEffect)localObject1).isFinished()) {
          ((EdgeEffect)localObject1).onRelease();
        }
      }
    }
    for (;;)
    {
      break;
      if ((i1 > n) && (m != 0))
      {
        drupal.Context.draw((EdgeEffect)localObject1, k / getHeight(), 1.0F - paramInt3 / getWidth());
        if (paramMotionEvent != null)
        {
          localPieChart = getScrollFeedbackProvider();
          paramInt3 = paramMotionEvent.getDeviceId();
          k = paramMotionEvent.getSource();
          a.format(paramInt3, k, paramInt2, false);
        }
        if (!((EdgeEffect)localObject2).isFinished()) {
          ((EdgeEffect)localObject2).onRelease();
        }
      }
    }
    if ((((EdgeEffect)localObject2).isFinished()) && (((EdgeEffect)localObject1).isFinished())) {
      break label485;
    }
    postInvalidateOnAnimation();
    paramInt1 = 0;
    label485:
    if ((paramInt1 != 0) && (paramInt4 == 0))
    {
      paramMotionEvent = mVelocityTracker;
      if (paramMotionEvent != null) {
        paramMotionEvent.clear();
      }
    }
    if (paramInt4 == 1)
    {
      a(paramInt4);
      ((EdgeEffect)localObject2).onRelease();
      ((EdgeEffect)localObject1).onRelease();
    }
    return j + i2;
  }
  
  public final void draw(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    int j = getScrollY();
    scrollBy(0, paramInt1);
    j = getScrollY() - j;
    if (paramArrayOfInt != null) {
      paramArrayOfInt[1] += j;
    }
    y.a(0, j, 0, paramInt1 - j, null, paramInt2, paramArrayOfInt);
  }
  
  public final void draw(int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    a(paramInt1, paramInt2, paramInt3, paramArrayOfInt, null);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i4 = getScrollY();
    EdgeEffect localEdgeEffect = h;
    boolean bool = localEdgeEffect.isFinished();
    int i1 = 0;
    int i5;
    int m;
    int n;
    int i3;
    int k;
    int i2;
    int j;
    if (!bool)
    {
      i5 = paramCanvas.save();
      m = getWidth();
      n = m;
      i3 = getHeight();
      k = i3;
      i2 = Math.min(0, i4);
      j = i2;
      if (getClipToPadding())
      {
        n = getPaddingLeft();
        n = m - (getPaddingRight() + n);
        m = getPaddingLeft();
      }
      else
      {
        m = 0;
      }
      if (getClipToPadding())
      {
        j = getPaddingTop();
        k = i3 - (getPaddingBottom() + j);
        j = i2 + getPaddingTop();
      }
      paramCanvas.translate(m, j);
      localEdgeEffect.setSize(n, k);
      if (localEdgeEffect.draw(paramCanvas)) {
        postInvalidateOnAnimation();
      }
      paramCanvas.restoreToCount(i5);
    }
    localEdgeEffect = x;
    if (!localEdgeEffect.isFinished())
    {
      i5 = paramCanvas.save();
      n = getWidth();
      m = n;
      i2 = getHeight();
      j = i2;
      i3 = Math.max(getScrollRange(), i4) + i2;
      k = i1;
      if (getClipToPadding())
      {
        k = getPaddingLeft();
        m = n - (getPaddingRight() + k);
        k = getPaddingLeft();
      }
      n = i3;
      if (getClipToPadding())
      {
        j = getPaddingTop();
        j = i2 - (getPaddingBottom() + j);
        n = i3 - getPaddingBottom();
      }
      paramCanvas.translate(k - m, n);
      paramCanvas.rotate(180.0F, m, 0.0F);
      localEdgeEffect.setSize(m, j);
      if (localEdgeEffect.draw(paramCanvas)) {
        postInvalidateOnAnimation();
      }
      paramCanvas.restoreToCount(i5);
    }
  }
  
  public final boolean draw(EdgeEffect paramEdgeEffect, int paramInt)
  {
    if (paramInt > 0) {
      return true;
    }
    float f1 = drupal.Context.draw(paramEdgeEffect);
    float f2 = getHeight();
    float f3 = Math.abs(-paramInt);
    float f4 = d * 0.015F;
    double d1 = Math.log(f3 * 0.35F / f4);
    double d2 = i;
    double d3 = f4;
    return (float)(Math.exp(d2 / (d2 - 1.0D) * d1) * d3) < f1 * f2;
  }
  
  public final boolean executeKeyEvent(KeyEvent paramKeyEvent)
  {
    mTempRect.setEmpty();
    int k = getChildCount();
    int j = 130;
    View localView;
    if (k > 0)
    {
      localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      if (localView.getHeight() + topMargin + bottomMargin > getHeight() - getPaddingTop() - getPaddingBottom())
      {
        if (paramKeyEvent.getAction() != 0) {
          break label285;
        }
        k = paramKeyEvent.getKeyCode();
        if (k != 19)
        {
          if (k != 20)
          {
            if (k != 62)
            {
              if (k != 92)
              {
                if (k != 93)
                {
                  if (k != 122)
                  {
                    if (k != 123) {
                      return false;
                    }
                    pageScroll(130);
                    return false;
                  }
                  pageScroll(33);
                  return false;
                }
                return fullScroll(130);
              }
              return fullScroll(33);
            }
            if (paramKeyEvent.isShiftPressed()) {
              j = 33;
            }
            pageScroll(j);
            return false;
          }
          if (paramKeyEvent.isAltPressed()) {
            return fullScroll(130);
          }
          return arrowScroll(130);
        }
        if (paramKeyEvent.isAltPressed()) {
          return fullScroll(33);
        }
        return arrowScroll(33);
      }
    }
    if ((isFocused()) && (paramKeyEvent.getKeyCode() != 4))
    {
      localView = findFocus();
      paramKeyEvent = localView;
      if (localView == this) {
        paramKeyEvent = null;
      }
      paramKeyEvent = FocusFinder.getInstance().findNextFocus(this, paramKeyEvent, 130);
      if ((paramKeyEvent != null) && (paramKeyEvent != this) && (paramKeyEvent.requestFocus(130))) {
        return true;
      }
    }
    label285:
    return false;
  }
  
  public final void fling(int paramInt)
  {
    if (getChildCount() > 0)
    {
      mScroller.fling(getScrollX(), getScrollY(), 0, paramInt, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
      a(2, 1);
      mLastFlingY = getScrollY();
      postInvalidateOnAnimation();
      if (Build.VERSION.SDK_INT >= 35) {
        ScrollerCompat.create(this, Math.abs(mScroller.getCurrVelocity()));
      }
    }
  }
  
  public final boolean fullScroll(int paramInt)
  {
    int j;
    if (paramInt == 130) {
      j = 1;
    } else {
      j = 0;
    }
    int k = getHeight();
    Rect localRect = mTempRect;
    top = 0;
    bottom = k;
    if (j != 0)
    {
      j = getChildCount();
      if (j > 0)
      {
        View localView = getChildAt(j - 1);
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
        j = localView.getBottom();
        int m = bottomMargin;
        j = getPaddingBottom() + (j + m);
        bottom = j;
        top = (j - k);
      }
    }
    return scrollAndFocus(paramInt, top, bottom);
  }
  
  public float getBottomFadingEdgeStrength()
  {
    if (getChildCount() == 0) {
      return 0.0F;
    }
    View localView = getChildAt(0);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
    int j = getVerticalFadingEdgeLength();
    int k = getHeight();
    int m = getPaddingBottom();
    k = localView.getBottom() + bottomMargin - getScrollY() - (k - m);
    if (k < j) {
      return k / j;
    }
    return 1.0F;
  }
  
  public int getMaxScrollAmount()
  {
    return (int)(getHeight() * 0.5F);
  }
  
  public int getNestedScrollAxes()
  {
    NestedScrollingParentHelper localNestedScrollingParentHelper = mParentHelper;
    int j = mNestedScrollAxes;
    return b | j;
  }
  
  public int getScrollRange()
  {
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      return Math.max(0, localView.getHeight() + topMargin + bottomMargin - (getHeight() - getPaddingTop() - getPaddingBottom()));
    }
    return 0;
  }
  
  public float getTopFadingEdgeStrength()
  {
    if (getChildCount() == 0) {
      return 0.0F;
    }
    int j = getVerticalFadingEdgeLength();
    int k = getScrollY();
    if (k < j) {
      return k / j;
    }
    return 1.0F;
  }
  
  public float getVerticalScrollFactorCompat()
  {
    if (mVerticalScrollFactor == 0.0F)
    {
      TypedValue localTypedValue = new TypedValue();
      android.content.Context localContext = getContext();
      if (localContext.getTheme().resolveAttribute(16842829, localTypedValue, true)) {
        mVerticalScrollFactor = localTypedValue.getDimension(localContext.getResources().getDisplayMetrics());
      } else {
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
      }
    }
    return mVerticalScrollFactor;
  }
  
  public final boolean hasNestedScrollingParent()
  {
    return y.a(0) != null;
  }
  
  public final boolean isNestedScrollingEnabled()
  {
    return y.c;
  }
  
  public final boolean isWithinDeltaOfScreen(View paramView, int paramInt1, int paramInt2)
  {
    Rect localRect = mTempRect;
    paramView.getDrawingRect(localRect);
    offsetDescendantRectToMyCoords(paramView, localRect);
    return (bottom + paramInt1 >= getScrollY()) && (top - paramInt1 <= getScrollY() + paramInt2);
  }
  
  public final void measureChild(View paramView, int paramInt1, int paramInt2)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    paramInt2 = getPaddingLeft();
    paramView.measure(ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + paramInt2, width), View.MeasureSpec.makeMeasureSpec(0, 0));
  }
  
  public final void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    paramInt3 = getPaddingLeft();
    paramView.measure(ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + paramInt3 + leftMargin + rightMargin + paramInt2, width), View.MeasureSpec.makeMeasureSpec(topMargin + bottomMargin, 0));
  }
  
  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    mIsLaidOut = false;
  }
  
  public final boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() == 8) && (!mIsBeingDragged))
    {
      int j;
      if ((paramMotionEvent.getSource() & 0x2) == 2) {
        j = 1;
      } else {
        j = 0;
      }
      float f1;
      float f2;
      int k;
      if (j != 0)
      {
        f1 = paramMotionEvent.getAxisValue(9);
        f2 = paramMotionEvent.getX();
        k = 9;
        j = (int)f2;
      }
      else if ((paramMotionEvent.getSource() & 0x400000) == 4194304)
      {
        f1 = paramMotionEvent.getAxisValue(26);
        j = getWidth() / 2;
        k = 26;
      }
      else
      {
        f1 = 0.0F;
        j = 0;
        k = 0;
      }
      if (f1 != 0.0F)
      {
        int m = (int)(getVerticalScrollFactorCompat() * f1);
        boolean bool;
        if ((paramMotionEvent.getSource() & 0x2002) == 8194) {
          bool = true;
        } else {
          bool = false;
        }
        draw(-m, k, paramMotionEvent, j, 1, bool);
        if (k != 0)
        {
          Switch localSwitch = a;
          localSwitch.getClass();
          int i1 = paramMotionEvent.getSource();
          int i2 = paramMotionEvent.getDeviceId();
          j = a;
          int[] arrayOfInt = n;
          Object localObject2;
          Object localObject1;
          int n;
          int i3;
          Object localObject3;
          if ((j == i1) && (k == i2) && (h == k))
          {
            j = 0;
          }
          else
          {
            localObject2 = c;
            localObject1 = ViewConfiguration.get((android.content.Context)localObject2);
            j = paramMotionEvent.getDeviceId();
            m = paramMotionEvent.getSource();
            n = Build.VERSION.SDK_INT;
            if (n >= 34)
            {
              i3 = Common.prefs;
              j = Vector.get((ViewConfiguration)localObject1, j, k, m);
            }
            for (;;)
            {
              break;
              i3 = Common.prefs;
              localObject3 = InputDevice.getDevice(j);
              if ((localObject3 != null) && (((InputDevice)localObject3).getMotionRange(k, m) != null))
              {
                localObject3 = ((android.content.Context)localObject2).getResources();
                if ((m == 4194304) && (k == 26)) {
                  j = ((Resources)localObject3).getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android");
                } else {
                  j = -1;
                }
                Objects.requireNonNull(localObject1);
                if (j != -1)
                {
                  if (j != 0)
                  {
                    m = ((Resources)localObject3).getDimensionPixelSize(j);
                    j = m;
                    if (m >= 0) {
                      continue;
                    }
                  }
                }
                else
                {
                  j = ((ViewConfiguration)localObject1).getScaledMinimumFlingVelocity();
                  continue;
                }
              }
              j = Integer.MAX_VALUE;
            }
            arrayOfInt[0] = j;
            j = paramMotionEvent.getDeviceId();
            m = paramMotionEvent.getSource();
            if (n >= 34) {
              j = Vector.add((ViewConfiguration)localObject1, j, k, m);
            }
            for (;;)
            {
              break;
              localObject3 = InputDevice.getDevice(j);
              if ((localObject3 != null) && (((InputDevice)localObject3).getMotionRange(k, m) != null)) {
                j = 1;
              } else {
                j = 0;
              }
              n = Integer.MIN_VALUE;
              if (j == 0) {
                j = n;
              }
              for (;;)
              {
                break;
                localObject2 = ((android.content.Context)localObject2).getResources();
                if ((m == 4194304) && (k == 26)) {
                  m = ((Resources)localObject2).getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
                } else {
                  m = -1;
                }
                Objects.requireNonNull(localObject1);
                if (m == -1) {
                  break label608;
                }
                j = n;
                if (m != 0)
                {
                  j = ((Resources)localObject2).getDimensionPixelSize(m);
                  if (j < 0) {
                    j = n;
                  }
                }
              }
              label608:
              j = ((ViewConfiguration)localObject1).getScaledMaximumFlingVelocity();
            }
            arrayOfInt[1] = j;
            a = i1;
            k = i2;
            h = k;
            j = 1;
          }
          if (arrayOfInt[0] == Integer.MAX_VALUE)
          {
            paramMotionEvent = mVelocityTracker;
            if (paramMotionEvent != null)
            {
              paramMotionEvent.recycle();
              mVelocityTracker = null;
            }
          }
          else
          {
            if (mVelocityTracker == null) {
              mVelocityTracker = VelocityTracker.obtain();
            }
            localObject1 = mVelocityTracker;
            localObject2 = app.NestedScrollView.c;
            ((VelocityTracker)localObject1).addMovement(paramMotionEvent);
            long l1;
            if ((Build.VERSION.SDK_INT < 34) && (paramMotionEvent.getSource() == 4194304))
            {
              localObject2 = app.NestedScrollView.c;
              if (!((Map)localObject2).containsKey(localObject1)) {
                ((Map)localObject2).put(localObject1, new AppCompatDelegateImplV7.PanelFeatureState());
              }
              localObject2 = (AppCompatDelegateImplV7.PanelFeatureState)((Map)localObject2).get(localObject1);
              localObject2.getClass();
              l1 = paramMotionEvent.getEventTime();
              m = i;
              localObject3 = l;
              if ((m != 0) && (l1 - localObject3[h] > 40L))
              {
                i = 0;
                a = 0.0F;
              }
              m = (h + 1) % 20;
              h = m;
              n = i;
              if (n != 20) {
                i = (n + 1);
              }
              f1 = paramMotionEvent.getAxisValue(26);
              c[m] = f1;
              localObject3[h] = l1;
            }
            ((VelocityTracker)localObject1).computeCurrentVelocity(1000, Float.MAX_VALUE);
            localObject2 = (AppCompatDelegateImplV7.PanelFeatureState)app.NestedScrollView.c.get(localObject1);
            if (localObject2 != null)
            {
              m = i;
              if (m < 2) {}
              long l2;
              do
              {
                do
                {
                  f1 = 0.0F;
                  break;
                  n = h;
                  m = (n + 20 - (m - 1)) % 20;
                  localObject3 = l;
                  l2 = localObject3[n];
                  for (;;)
                  {
                    l1 = localObject3[m];
                    if (l2 - l1 <= 100L) {
                      break;
                    }
                    i -= 1;
                    m = (m + 1) % 20;
                  }
                  n = i;
                } while (n < 2);
                paramMotionEvent = c;
                if (n != 2) {
                  break;
                }
                m = (m + 1) % 20;
                l2 = localObject3[m];
              } while (l1 == l2);
              f1 = paramMotionEvent[m] / (float)(l2 - l1);
              break label1293;
              f1 = 0.0F;
              n = 0;
              i1 = 0;
              for (;;)
              {
                i2 = i;
                f2 = 1.0F;
                if (n >= i2 - 1) {
                  break;
                }
                i2 = n + m;
                l1 = localObject3[(i2 % 20)];
                i3 = (i2 + 1) % 20;
                if (localObject3[i3] != l1)
                {
                  i2 = i1 + 1;
                  if (f1 < 0.0F) {
                    f2 = -1.0F;
                  }
                  float f3 = (float)Math.sqrt(Math.abs(f1) * 2.0F);
                  float f4 = paramMotionEvent[i3] / (float)(localObject3[i3] - l1);
                  f2 = Math.abs(f4) * (f4 - f2 * f3) + f1;
                  f1 = f2;
                  i1 = i2;
                  if (i2 == 1)
                  {
                    f1 = f2 * 0.5F;
                    i1 = i2;
                  }
                }
                n += 1;
              }
              if (f1 < 0.0F) {
                f2 = -1.0F;
              }
              f1 = (float)Math.sqrt(Math.abs(f1) * 2.0F) * f2;
              label1293:
              f1 *= 1000.0F;
              a = f1;
              if (f1 < -Math.abs(Float.MAX_VALUE)) {
                a = (-Math.abs(Float.MAX_VALUE));
              } else if (a > Math.abs(Float.MAX_VALUE)) {
                a = Math.abs(Float.MAX_VALUE);
              }
            }
            if (Build.VERSION.SDK_INT >= 34)
            {
              f1 = Vector.getXVelocity((VelocityTracker)localObject1, k);
            }
            else if (k == 0)
            {
              f1 = ((VelocityTracker)localObject1).getXVelocity();
            }
            else if (k == 1)
            {
              f1 = ((VelocityTracker)localObject1).getYVelocity();
            }
            else
            {
              paramMotionEvent = (AppCompatDelegateImplV7.PanelFeatureState)app.NestedScrollView.c.get(localObject1);
              if ((paramMotionEvent != null) && (k == 26)) {
                f1 = a;
              } else {
                f1 = 0.0F;
              }
            }
            paramMotionEvent = (NestedScrollView)d.a;
            f1 *= -paramMotionEvent.getVerticalScrollFactorCompat();
            f2 = Math.signum(f1);
            if ((j != 0) || ((f2 != Math.signum(x)) && (f2 != 0.0F))) {
              mScroller.abortAnimation();
            }
            if (Math.abs(f1) >= arrayOfInt[0])
            {
              j = arrayOfInt[1];
              f1 = Math.max(-j, Math.min(f1, j));
              if (f1 == 0.0F)
              {
                f1 = 0.0F;
              }
              else
              {
                mScroller.abortAnimation();
                paramMotionEvent.fling((int)f1);
              }
              x = f1;
            }
          }
        }
        return true;
      }
    }
    return false;
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int j = paramMotionEvent.getAction();
    boolean bool3 = true;
    boolean bool2 = true;
    if ((j == 2) && (mIsBeingDragged)) {
      return true;
    }
    j &= 0xFF;
    int k;
    if (j != 0)
    {
      if (j != 1) {
        if (j != 2)
        {
          if (j != 3)
          {
            if (j != 6) {
              break label517;
            }
            onSecondaryPointerUp(paramMotionEvent);
            break label517;
          }
        }
        else
        {
          j = mActivePointerId;
          if (j == -1) {
            break label517;
          }
          k = paramMotionEvent.findPointerIndex(j);
          if (k == -1)
          {
            paramMotionEvent = new StringBuilder("Invalid pointerId=");
            paramMotionEvent.append(j);
            paramMotionEvent.append(" in onInterceptTouchEvent");
            Log.e("NestedScrollView", paramMotionEvent.toString());
            break label517;
          }
          j = (int)paramMotionEvent.getY(k);
          if ((Math.abs(j - mLastMotionY) <= mTouchSlop) || ((0x2 & getNestedScrollAxes()) != 0)) {
            break label517;
          }
          mIsBeingDragged = true;
          mLastMotionY = j;
          if (mVelocityTracker == null) {
            mVelocityTracker = VelocityTracker.obtain();
          }
          mVelocityTracker.addMovement(paramMotionEvent);
          mNestedYOffset = 0;
          paramMotionEvent = getParent();
          if (paramMotionEvent == null) {
            break label517;
          }
          paramMotionEvent.requestDisallowInterceptTouchEvent(true);
          break label517;
        }
      }
      mIsBeingDragged = false;
      mActivePointerId = -1;
      paramMotionEvent = mVelocityTracker;
      if (paramMotionEvent != null)
      {
        paramMotionEvent.recycle();
        mVelocityTracker = null;
      }
      if (mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
        postInvalidateOnAnimation();
      }
      a(0);
    }
    else
    {
      j = (int)paramMotionEvent.getY();
      k = (int)paramMotionEvent.getX();
      if (getChildCount() > 0)
      {
        int m = getScrollY();
        Object localObject = getChildAt(0);
        if ((j >= ((View)localObject).getTop() - m) && (j < ((View)localObject).getBottom() - m) && (k >= ((View)localObject).getLeft()) && (k < ((View)localObject).getRight()))
        {
          mLastMotionY = j;
          mActivePointerId = paramMotionEvent.getPointerId(0);
          localObject = mVelocityTracker;
          if (localObject == null) {
            mVelocityTracker = VelocityTracker.obtain();
          } else {
            ((VelocityTracker)localObject).clear();
          }
          mVelocityTracker.addMovement(paramMotionEvent);
          mScroller.computeScrollOffset();
          bool1 = bool2;
          if (!a(paramMotionEvent)) {
            if (!mScroller.isFinished()) {
              bool1 = bool2;
            } else {
              bool1 = false;
            }
          }
          mIsBeingDragged = bool1;
          a(2, 0);
          break label517;
        }
      }
      boolean bool1 = bool3;
      if (!a(paramMotionEvent)) {
        if (!mScroller.isFinished()) {
          bool1 = bool3;
        } else {
          bool1 = false;
        }
      }
      mIsBeingDragged = bool1;
      paramMotionEvent = mVelocityTracker;
      if (paramMotionEvent != null)
      {
        paramMotionEvent.recycle();
        mVelocityTracker = null;
      }
    }
    label517:
    return mIsBeingDragged;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int j = 0;
    mIsLayoutDirty = false;
    View localView = mChildToScrollTo;
    Object localObject;
    if ((localView != null) && (isViewDescendantOf(localView, this)))
    {
      localView = mChildToScrollTo;
      localObject = mTempRect;
      localView.getDrawingRect((Rect)localObject);
      offsetDescendantRectToMyCoords(localView, (Rect)localObject);
      paramInt1 = computeScrollDeltaToGetChildRectOnScreen((Rect)localObject);
      if (paramInt1 != 0) {
        scrollBy(0, paramInt1);
      }
    }
    mChildToScrollTo = null;
    if (!mIsLaidOut)
    {
      if (mSavedState != null)
      {
        scrollTo(getScrollX(), mSavedState.scrollPosition);
        mSavedState = null;
      }
      if (getChildCount() > 0)
      {
        localView = getChildAt(0);
        localObject = (FrameLayout.LayoutParams)localView.getLayoutParams();
        paramInt3 = localView.getMeasuredHeight() + topMargin + bottomMargin;
      }
      else
      {
        paramInt3 = 0;
      }
      paramInt4 = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
      paramInt2 = getScrollY();
      paramInt1 = j;
      if (paramInt4 < paramInt3) {
        if (paramInt2 < 0) {
          paramInt1 = j;
        } else if (paramInt4 + paramInt2 > paramInt3) {
          paramInt1 = paramInt3 - paramInt4;
        } else {
          paramInt1 = paramInt2;
        }
      }
      if (paramInt1 != paramInt2) {
        scrollTo(getScrollX(), paramInt1);
      }
    }
    scrollTo(getScrollX(), getScrollY());
    mIsLaidOut = true;
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (!mFillViewport) {
      return;
    }
    if (View.MeasureSpec.getMode(paramInt2) == 0) {
      return;
    }
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      int j = localView.getMeasuredHeight();
      paramInt2 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom() - topMargin - bottomMargin;
      if (j < paramInt2)
      {
        j = getPaddingLeft();
        localView.measure(ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + j + leftMargin + rightMargin, width), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
      }
    }
  }
  
  public final boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      dispatchNestedFling(0.0F, paramFloat2, true);
      fling((int)paramFloat2);
      return true;
    }
    return false;
  }
  
  public final boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return y.onNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public final void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    a(paramInt1, paramInt2, 0, paramArrayOfInt, null);
  }
  
  public final void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    draw(paramInt4, 0, null);
  }
  
  public final void onNestedScroll(NestedScrollView paramNestedScrollView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    draw(paramInt4, paramInt5, null);
  }
  
  public final void onNestedScroll(NestedScrollView paramNestedScrollView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfInt)
  {
    draw(paramInt4, paramInt5, paramArrayOfInt);
  }
  
  public final void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    onStopNestedScroll(paramView1, paramView2, paramInt, 0);
  }
  
  public final void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.scrollTo(paramInt1, paramInt2);
  }
  
  public final boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int j;
    if (paramInt == 2)
    {
      j = 130;
    }
    else
    {
      j = paramInt;
      if (paramInt == 1) {
        j = 33;
      }
    }
    View localView;
    if (paramRect == null) {
      localView = FocusFinder.getInstance().findNextFocus(this, null, j);
    } else {
      localView = FocusFinder.getInstance().findNextFocusFromRect(this, paramRect, j);
    }
    if (localView == null) {
      return false;
    }
    if (!isWithinDeltaOfScreen(localView, 0, getHeight())) {
      return false;
    }
    return localView.requestFocus(j, paramRect);
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    mSavedState = paramParcelable;
    requestLayout();
  }
  
  public final Parcelable onSaveInstanceState()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void onSecondaryPointerUp(MotionEvent paramMotionEvent)
  {
    int j = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(j) == mActivePointerId)
    {
      if (j == 0) {
        j = 1;
      } else {
        j = 0;
      }
      mLastMotionY = ((int)paramMotionEvent.getY(j));
      mActivePointerId = paramMotionEvent.getPointerId(j);
      paramMotionEvent = mVelocityTracker;
      if (paramMotionEvent != null) {
        paramMotionEvent.clear();
      }
    }
  }
  
  public final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = findFocus();
    if (localView != null)
    {
      if (this == localView) {
        return;
      }
      if (isWithinDeltaOfScreen(localView, 0, paramInt4))
      {
        Rect localRect = mTempRect;
        localView.getDrawingRect(localRect);
        offsetDescendantRectToMyCoords(localView, localRect);
        paramInt1 = computeScrollDeltaToGetChildRectOnScreen(localRect);
        if (paramInt1 != 0)
        {
          if (mSmoothScrollingEnabled)
          {
            smoothScrollBy(0, paramInt1, false);
            return;
          }
          scrollBy(0, paramInt1);
        }
      }
    }
  }
  
  public final boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    return onStartNestedScroll(paramView1, paramView2, paramInt, 0);
  }
  
  public final boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    return (paramInt1 & 0x2) != 0;
  }
  
  public final void onStopNestedScroll(View paramView)
  {
    onStopNestedScroll(paramView, 0);
  }
  
  public final void onStopNestedScroll(View paramView, int paramInt)
  {
    paramView = mParentHelper;
    if (paramInt == 1) {
      b = 0;
    } else {
      mNestedScrollAxes = 0;
    }
    a(paramInt);
  }
  
  public final void onStopNestedScroll(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    paramView1 = mParentHelper;
    if (paramInt2 == 1) {
      b = paramInt1;
    } else {
      mNestedScrollAxes = paramInt1;
    }
    a(2, paramInt2);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (mVelocityTracker == null) {
      mVelocityTracker = VelocityTracker.obtain();
    }
    int j = paramMotionEvent.getActionMasked();
    if (j == 0) {
      mNestedYOffset = 0;
    }
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    float f2 = mNestedYOffset;
    float f1 = 0.0F;
    localMotionEvent.offsetLocation(0.0F, f2);
    Object localObject;
    int k;
    if (j != 0)
    {
      localObject = x;
      EdgeEffect localEdgeEffect = h;
      if (j != 1)
      {
        if (j != 2)
        {
          if (j != 3)
          {
            if (j != 5)
            {
              if (j == 6)
              {
                onSecondaryPointerUp(paramMotionEvent);
                mLastMotionY = ((int)paramMotionEvent.getY(paramMotionEvent.findPointerIndex(mActivePointerId)));
              }
            }
            else
            {
              j = paramMotionEvent.getActionIndex();
              mLastMotionY = ((int)paramMotionEvent.getY(j));
              mActivePointerId = paramMotionEvent.getPointerId(j);
            }
          }
          else
          {
            if ((mIsBeingDragged) && (getChildCount() > 0) && (mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))) {
              postInvalidateOnAnimation();
            }
            mActivePointerId = -1;
            mIsBeingDragged = false;
            paramMotionEvent = mVelocityTracker;
            if (paramMotionEvent != null)
            {
              paramMotionEvent.recycle();
              mVelocityTracker = null;
            }
            a(0);
            h.onRelease();
            x.onRelease();
          }
        }
        else
        {
          int n = paramMotionEvent.findPointerIndex(mActivePointerId);
          if (n == -1)
          {
            paramMotionEvent = new StringBuilder("Invalid pointerId=");
            paramMotionEvent.append(mActivePointerId);
            paramMotionEvent.append(" in onTouchEvent");
            Log.e("NestedScrollView", paramMotionEvent.toString());
          }
          else
          {
            int m = (int)paramMotionEvent.getY(n);
            j = mLastMotionY - m;
            f2 = paramMotionEvent.getX(n) / getWidth();
            float f3 = j / getHeight();
            if (drupal.Context.draw(localEdgeEffect) != 0.0F)
            {
              f2 = -drupal.Context.draw(localEdgeEffect, -f3, f2);
              f1 = f2;
              if (drupal.Context.draw(localEdgeEffect) == 0.0F)
              {
                localEdgeEffect.onRelease();
                f1 = f2;
              }
            }
            for (;;)
            {
              break;
              if (drupal.Context.draw((EdgeEffect)localObject) == 0.0F) {
                break;
              }
              f2 = drupal.Context.draw((EdgeEffect)localObject, f3, 1.0F - f2);
              f1 = f2;
              if (drupal.Context.draw((EdgeEffect)localObject) == 0.0F)
              {
                ((EdgeEffect)localObject).onRelease();
                f1 = f2;
              }
            }
            k = Math.round(f1 * getHeight());
            if (k != 0) {
              invalidate();
            }
            k = j - k;
            j = k;
            if (!mIsBeingDragged)
            {
              j = k;
              if (Math.abs(k) > mTouchSlop)
              {
                localObject = getParent();
                if (localObject != null) {
                  ((ViewParent)localObject).requestDisallowInterceptTouchEvent(true);
                }
                mIsBeingDragged = true;
                if (k > 0) {
                  j = k - mTouchSlop;
                } else {
                  j = k + mTouchSlop;
                }
              }
            }
            if (mIsBeingDragged)
            {
              j = draw(j, 1, paramMotionEvent, (int)paramMotionEvent.getX(n), 0, false);
              mLastMotionY = (m - j);
              mNestedYOffset += j;
            }
          }
        }
      }
      else
      {
        paramMotionEvent = mVelocityTracker;
        paramMotionEvent.computeCurrentVelocity(1000, mMaximumVelocity);
        j = (int)paramMotionEvent.getYVelocity(mActivePointerId);
        if (Math.abs(j) >= mMinimumVelocity)
        {
          if (drupal.Context.draw(localEdgeEffect) != 0.0F)
          {
            if (draw(localEdgeEffect, j)) {
              localEdgeEffect.onAbsorb(j);
            } else {
              fling(-j);
            }
          }
          else if (drupal.Context.draw((EdgeEffect)localObject) != 0.0F)
          {
            j = -j;
            if (draw((EdgeEffect)localObject, j)) {
              ((EdgeEffect)localObject).onAbsorb(j);
            } else {
              fling(j);
            }
          }
          else
          {
            j = -j;
            f1 = j;
            if (!y.onNestedPreFling(0.0F, f1))
            {
              dispatchNestedFling(0.0F, f1, true);
              fling(j);
            }
          }
        }
        else if (mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
          postInvalidateOnAnimation();
        }
        mActivePointerId = -1;
        mIsBeingDragged = false;
        paramMotionEvent = mVelocityTracker;
        if (paramMotionEvent != null)
        {
          paramMotionEvent.recycle();
          mVelocityTracker = null;
        }
        a(0);
        h.onRelease();
        x.onRelease();
      }
    }
    else
    {
      if (getChildCount() == 0) {
        return false;
      }
      if (mIsBeingDragged)
      {
        localObject = getParent();
        if (localObject != null) {
          ((ViewParent)localObject).requestDisallowInterceptTouchEvent(true);
        }
      }
      if (!mScroller.isFinished())
      {
        mScroller.abortAnimation();
        a(1);
      }
      j = (int)paramMotionEvent.getY();
      k = paramMotionEvent.getPointerId(0);
      mLastMotionY = j;
      mActivePointerId = k;
      a(2, 0);
    }
    paramMotionEvent = mVelocityTracker;
    if (paramMotionEvent != null) {
      paramMotionEvent.addMovement(localMotionEvent);
    }
    localMotionEvent.recycle();
    return true;
  }
  
  public final boolean overScrollByCompat(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    getOverScrollMode();
    super.computeHorizontalScrollRange();
    super.computeHorizontalScrollExtent();
    computeVerticalScrollRange();
    super.computeVerticalScrollExtent();
    paramInt3 += paramInt1;
    if (paramInt2 > 0) {}
    while (paramInt2 < 0)
    {
      paramInt2 = 0;
      paramInt1 = 1;
      break;
    }
    paramInt1 = 0;
    if (paramInt3 > paramInt4) {}
    for (;;)
    {
      paramInt3 = 1;
      break label75;
      if (paramInt3 >= 0) {
        break;
      }
      paramInt4 = 0;
    }
    paramInt4 = paramInt3;
    paramInt3 = 0;
    label75:
    if ((paramInt3 != 0) && (y.a(1) == null)) {
      mScroller.springBack(paramInt2, paramInt4, 0, 0, 0, getScrollRange());
    }
    super.scrollTo(paramInt2, paramInt4);
    if (paramInt1 == 0) {
      return paramInt3 != 0;
    }
    return true;
  }
  
  public final void pageScroll(int paramInt)
  {
    if (paramInt == 130) {
      j = 1;
    } else {
      j = 0;
    }
    int k = getHeight();
    Rect localRect = mTempRect;
    if (j != 0)
    {
      top = (getScrollY() + k);
      j = getChildCount();
      if (j > 0)
      {
        View localView = getChildAt(j - 1);
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
        j = localView.getBottom();
        int m = bottomMargin;
        j = getPaddingBottom() + (j + m);
        if (top + k > j) {
          top = (j - k);
        }
      }
    }
    else
    {
      j = getScrollY() - k;
      top = j;
      if (j < 0) {
        top = 0;
      }
    }
    int j = top;
    k += j;
    bottom = k;
    scrollAndFocus(paramInt, j, k);
  }
  
  public final void requestChildFocus(View paramView1, View paramView2)
  {
    if (!mIsLayoutDirty)
    {
      Rect localRect = mTempRect;
      paramView2.getDrawingRect(localRect);
      offsetDescendantRectToMyCoords(paramView2, localRect);
      int j = computeScrollDeltaToGetChildRectOnScreen(localRect);
      if (j != 0) {
        scrollBy(0, j);
      }
    }
    else
    {
      mChildToScrollTo = paramView2;
    }
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public final boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    paramRect.offset(paramView.getLeft() - paramView.getScrollX(), paramView.getTop() - paramView.getScrollY());
    int j = computeScrollDeltaToGetChildRectOnScreen(paramRect);
    boolean bool;
    if (j != 0) {
      bool = true;
    } else {
      bool = false;
    }
    if (bool)
    {
      if (paramBoolean)
      {
        scrollBy(0, j);
        return bool;
      }
      smoothScrollBy(0, j, false);
    }
    return bool;
  }
  
  public final void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      VelocityTracker localVelocityTracker = mVelocityTracker;
      if (localVelocityTracker != null)
      {
        localVelocityTracker.recycle();
        mVelocityTracker = null;
      }
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public final void requestLayout()
  {
    mIsLayoutDirty = true;
    super.requestLayout();
  }
  
  public final boolean scrollAndFocus(int paramInt1, int paramInt2, int paramInt3)
  {
    int j = getHeight();
    int i3 = getScrollY();
    int i4 = j + i3;
    int m;
    if (paramInt1 == 33) {
      m = 1;
    } else {
      m = 0;
    }
    ArrayList localArrayList = getFocusables(2);
    int i5 = localArrayList.size();
    Object localObject2 = null;
    int n = 0;
    int k;
    for (int i1 = 0; n < i5; i1 = k)
    {
      View localView = (View)localArrayList.get(n);
      int i2 = localView.getTop();
      int i6 = localView.getBottom();
      localObject1 = localObject2;
      k = i1;
      if (paramInt2 < i6)
      {
        localObject1 = localObject2;
        k = i1;
        if (i2 < paramInt3)
        {
          if ((paramInt2 < i2) && (i6 < paramInt3)) {
            j = 1;
          } else {
            j = 0;
          }
          if (localObject2 == null)
          {
            localObject1 = localView;
            k = j;
          }
          else
          {
            if (((m != 0) && (i2 < localObject2.getTop())) || ((m == 0) && (i6 > localObject2.getBottom()))) {
              i2 = 1;
            } else {
              i2 = 0;
            }
            if (i1 != 0)
            {
              localObject1 = localObject2;
              k = i1;
              if (j == 0) {
                break label268;
              }
              localObject1 = localObject2;
              k = i1;
              if (i2 == 0) {
                break label268;
              }
            }
            else
            {
              if (j != 0)
              {
                localObject1 = localView;
                k = 1;
                break label268;
              }
              localObject1 = localObject2;
              k = i1;
              if (i2 == 0) {
                break label268;
              }
            }
            localObject1 = localView;
            k = i1;
          }
        }
      }
      label268:
      n += 1;
      localObject2 = localObject1;
    }
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = this;
    }
    boolean bool;
    if ((paramInt2 >= i3) && (paramInt3 <= i4))
    {
      bool = false;
    }
    else
    {
      if (m != 0) {
        paramInt2 -= i3;
      }
      for (;;)
      {
        break;
        paramInt2 = paramInt3 - i4;
      }
      draw(paramInt2, -1, null, 0, 1, true);
      bool = true;
    }
    if (localObject1 != findFocus()) {
      ((View)localObject1).requestFocus(paramInt1);
    }
    return bool;
  }
  
  public final void scrollTo(int paramInt1, int paramInt2)
  {
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      int n = getWidth() - getPaddingLeft() - getPaddingRight();
      int i1 = localView.getWidth() + leftMargin + rightMargin;
      int k = getHeight() - getPaddingTop() - getPaddingBottom();
      int m = localView.getHeight() + topMargin + bottomMargin;
      int j;
      if ((n < i1) && (paramInt1 >= 0))
      {
        j = paramInt1;
        if (n + paramInt1 > i1) {
          j = i1 - n;
        }
      }
      else
      {
        j = 0;
      }
      if ((k < m) && (paramInt2 >= 0))
      {
        paramInt1 = paramInt2;
        if (k + paramInt2 > m) {
          paramInt1 = m - k;
        }
      }
      else
      {
        paramInt1 = 0;
      }
      if ((j != getScrollX()) || (paramInt1 != getScrollY())) {
        super.scrollTo(j, paramInt1);
      }
    }
  }
  
  public void setFillViewport(boolean paramBoolean)
  {
    if (paramBoolean != mFillViewport)
    {
      mFillViewport = paramBoolean;
      requestLayout();
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    Label localLabel = y;
    if (c)
    {
      WeakHashMap localWeakHashMap = ViewCompat.this$0;
      ViewCompatLollipop.stopNestedScroll(mView);
    }
    c = paramBoolean;
  }
  
  public void setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener paramOnScrollChangeListener) {}
  
  public void setSmoothScrollingEnabled(boolean paramBoolean)
  {
    mSmoothScrollingEnabled = paramBoolean;
  }
  
  public final boolean shouldDelayChildPressedState()
  {
    return true;
  }
  
  public final void smoothScrollBy(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (getChildCount() == 0) {
      return;
    }
    if (AnimationUtils.currentAnimationTimeMillis() - mLastScroll > 250L)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      int j = localView.getHeight();
      int k = topMargin;
      int m = bottomMargin;
      int n = getHeight();
      int i1 = getPaddingTop();
      int i2 = getPaddingBottom();
      paramInt1 = getScrollY();
      paramInt2 = Math.max(0, Math.min(paramInt2 + paramInt1, Math.max(0, j + k + m - (n - i1 - i2))));
      mScroller.startScroll(getScrollX(), paramInt1, 0, paramInt2 - paramInt1, 250);
      if (paramBoolean) {
        a(2, 1);
      } else {
        a(1);
      }
      mLastFlingY = getScrollY();
      postInvalidateOnAnimation();
    }
    else
    {
      if (!mScroller.isFinished())
      {
        mScroller.abortAnimation();
        a(1);
      }
      scrollBy(paramInt1, paramInt2);
    }
    mLastScroll = AnimationUtils.currentAnimationTimeMillis();
  }
  
  public final boolean startNestedScroll(int paramInt)
  {
    return a(paramInt, 0);
  }
  
  public final void stopNestedScroll()
  {
    a(0);
  }
  
  public static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR;
    public int scrollPosition;
    
    static
    {
      throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public SavedState(Parcel paramParcel)
    {
      super();
      scrollPosition = paramParcel.readInt();
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("HorizontalScrollView.SavedState{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" scrollPosition=");
      localStringBuilder.append(scrollPosition);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(scrollPosition);
    }
  }
}
