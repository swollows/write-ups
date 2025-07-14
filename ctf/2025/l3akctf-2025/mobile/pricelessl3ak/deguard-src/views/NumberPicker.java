package views;

import android.content.Context;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import androidx.appcompat.app.ToolbarActionBar;
import androidx.appcompat.app.WindowCallbackWrapper;
import androidx.appcompat.widget.ListViewCompat;
import androidx.appcompat.widget.SearchView.SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.AutoScrollHelper;
import androidx.core.widget.AutoScrollHelper.ClampedScroller;
import app.ViewCompat;

public final class NumberPicker
  implements Runnable
{
  public NumberPicker(app.f paramF, int paramInt)
  {
    s = paramF;
  }
  
  public final void run()
  {
    Object localObject1 = s;
    Object localObject2;
    boolean bool;
    Object localObject3;
    switch (r)
    {
    default: 
      localObject2 = (AutoScrollHelper)localObject1;
      if (!mAnimating) {
        return;
      }
      bool = mNeedsReset;
      localObject3 = mScroller;
      long l1;
      if (bool)
      {
        mNeedsReset = false;
        l1 = AnimationUtils.currentAnimationTimeMillis();
        mStartTime = l1;
        mStopTime = -1L;
        mDeltaTime = l1;
        mStopValue = 0.5F;
      }
      if (((mStopTime > 0L) && (AnimationUtils.currentAnimationTimeMillis() > mStopTime + mEffectiveRampDown)) || (!((AutoScrollHelper)localObject2).start()))
      {
        mAnimating = false;
        return;
      }
      bool = mStarted;
      localObject1 = mTarget;
      if (bool)
      {
        mStarted = false;
        l1 = SystemClock.uptimeMillis();
        MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
        ((View)localObject1).onTouchEvent(localMotionEvent);
        localMotionEvent.recycle();
      }
      if (mDeltaTime != 0L)
      {
        l1 = AnimationUtils.currentAnimationTimeMillis();
        float f = ((AutoScrollHelper.ClampedScroller)localObject3).getValueAt(l1);
        long l2 = mDeltaTime;
        mDeltaTime = l1;
        int i = (int)((float)(l1 - l2) * (f * 4.0F + -4.0F * f * f) * mTargetVelocityY);
        this$0.scrollListBy(i);
        localObject2 = ViewCompat.this$0;
        ((View)localObject1).postOnAnimation(this);
        return;
      }
      throw new RuntimeException("Cannot compute scroll delta before calling start()");
    case 4: 
      ((Toolbar)localObject1).showOverflowMenu();
      return;
    case 3: 
      localObject1 = (SearchView.SearchAutoComplete)localObject1;
      if (closed)
      {
        ((InputMethodManager)((View)localObject1).getContext().getSystemService("input_method")).showSoftInput((View)localObject1, 0);
        closed = false;
        return;
      }
      break;
    case 2: 
      localObject1 = (ListViewCompat)localObject1;
      b = null;
      ((ListViewCompat)localObject1).drawableStateChanged();
      return;
    case 1: 
      localObject1 = (ToolbarActionBar)localObject1;
      localObject2 = this$0;
      localObject3 = ((ToolbarActionBar)localObject1).getMenu();
      if ((localObject3 instanceof menu.f)) {
        localObject1 = (menu.f)localObject3;
      } else {
        localObject1 = null;
      }
      if (localObject1 != null) {
        ((menu.f)localObject1).g();
      }
      try
      {
        ((Menu)localObject3).clear();
        bool = ((WindowCallbackWrapper)localObject2).onCreatePanelMenu(0, (Menu)localObject3);
        if (bool)
        {
          bool = ((WindowCallbackWrapper)localObject2).onPreparePanel(0, null, (Menu)localObject3);
          if (bool) {
            break label503;
          }
        }
      }
      catch (Throwable localThrowable)
      {
        break label514;
      }
      ((Menu)localObject3).clear();
      if (localObject1 != null)
      {
        ((menu.f)localObject1).h();
        return;
        if (localObject1 != null) {
          ((menu.f)localObject1).h();
        }
        throw localThrowable;
      }
      break;
    case 0: 
      label503:
      label514:
      localObject1 = a;
    }
  }
}
