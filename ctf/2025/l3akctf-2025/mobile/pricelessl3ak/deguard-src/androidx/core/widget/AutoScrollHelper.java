package androidx.core.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.ListViewCompat;
import app.ViewCompat;
import views.NumberPicker;

public final class AutoScrollHelper
  implements View.OnTouchListener
{
  public static final int DEFAULT_ACTIVATION_DELAY = ;
  public final int mActivationDelay;
  public boolean mAlreadyDelayed;
  public boolean mAnimating;
  public final AccelerateInterpolator mEdgeInterpolator;
  public final int mEdgeType;
  public final float[] mMaximumEdges;
  public final float[] mMaximumVelocity;
  public final float[] mMinimumVelocity;
  public boolean mNeedsReset;
  public final float[] mRelativeEdges;
  public final float[] mRelativeVelocity;
  public NumberPicker mRunnable;
  public final AutoScrollHelper.ClampedScroller mScroller;
  public boolean mStarted;
  public final ListView mTarget;
  public final ListViewCompat this$0;
  public boolean top;
  
  public AutoScrollHelper(ListViewCompat paramListViewCompat) {}
  
  public static float constrain(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 > paramFloat3) {
      return paramFloat3;
    }
    if (paramFloat1 < paramFloat2) {
      return paramFloat2;
    }
    return paramFloat1;
  }
  
  public final float computeTargetVelocity(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = constrain(mRelativeEdges[paramInt] * paramFloat2, 0.0F, mMaximumEdges[paramInt]);
    float f2 = constrainEdgeValue(paramFloat1, f1);
    paramFloat1 = constrainEdgeValue(paramFloat2 - paramFloat1, f1) - f2;
    AccelerateInterpolator localAccelerateInterpolator = mEdgeInterpolator;
    if (paramFloat1 < 0.0F)
    {
      paramFloat1 = -localAccelerateInterpolator.getInterpolation(-paramFloat1);
    }
    else
    {
      if (paramFloat1 <= 0.0F) {
        break label90;
      }
      paramFloat1 = localAccelerateInterpolator.getInterpolation(paramFloat1);
    }
    paramFloat1 = constrain(paramFloat1, -1.0F, 1.0F);
    break label92;
    label90:
    paramFloat1 = 0.0F;
    label92:
    boolean bool = paramFloat1 < 0.0F;
    if (!bool) {
      return 0.0F;
    }
    f2 = mRelativeVelocity[paramInt];
    paramFloat2 = mMinimumVelocity[paramInt];
    f1 = mMaximumVelocity[paramInt];
    paramFloat3 = f2 * paramFloat3;
    if (bool) {
      return constrain(paramFloat1 * paramFloat3, paramFloat2, f1);
    }
    return -constrain(-paramFloat1 * paramFloat3, paramFloat2, f1);
  }
  
  public final float constrainEdgeValue(float paramFloat1, float paramFloat2)
  {
    if (paramFloat2 == 0.0F) {
      return 0.0F;
    }
    int i = mEdgeType;
    if ((i != 0) && (i != 1))
    {
      if (i != 2) {
        return 0.0F;
      }
      if (paramFloat1 < 0.0F) {
        return paramFloat1 / -paramFloat2;
      }
    }
    else if (paramFloat1 < paramFloat2)
    {
      if (paramFloat1 >= 0.0F) {
        return 1.0F - paramFloat1 / paramFloat2;
      }
      if ((mAnimating) && (i == 1)) {
        return 1.0F;
      }
    }
    return 0.0F;
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (!top) {
      return false;
    }
    int i = paramMotionEvent.getActionMasked();
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2) {
          break label56;
        }
        if (i != 3) {
          return false;
        }
      }
      requestStop();
      return false;
    }
    else
    {
      mStarted = true;
      mAlreadyDelayed = false;
    }
    label56:
    float f1 = paramMotionEvent.getX();
    float f2 = paramView.getWidth();
    ListView localListView = mTarget;
    f1 = computeTargetVelocity(0, f1, f2, localListView.getWidth());
    f2 = computeTargetVelocity(1, paramMotionEvent.getY(), paramView.getHeight(), localListView.getHeight());
    paramView = mScroller;
    mTargetVelocityX = f1;
    mTargetVelocityY = f2;
    if ((!mAnimating) && (start()))
    {
      if (mRunnable == null) {
        mRunnable = new NumberPicker(5, this);
      }
      mAnimating = true;
      mNeedsReset = true;
      if (!mAlreadyDelayed)
      {
        i = mActivationDelay;
        if (i > 0)
        {
          paramView = mRunnable;
          long l = i;
          paramMotionEvent = ViewCompat.this$0;
          localListView.postOnAnimationDelayed(paramView, l);
          break label221;
        }
      }
      mRunnable.run();
      label221:
      mAlreadyDelayed = true;
    }
    return false;
  }
  
  public final void requestStop()
  {
    boolean bool = mNeedsReset;
    int i = 0;
    if (bool)
    {
      mAnimating = false;
      return;
    }
    AutoScrollHelper.ClampedScroller localClampedScroller = mScroller;
    long l = AnimationUtils.currentAnimationTimeMillis();
    int j = (int)(l - mStartTime);
    int k = mRampDownDuration;
    if (j > k) {
      i = k;
    } else if (j >= 0) {
      i = j;
    }
    mEffectiveRampDown = i;
    mStopValue = localClampedScroller.getValueAt(l);
    mStopTime = l;
  }
  
  public final boolean start()
  {
    Object localObject = mScroller;
    float f = mTargetVelocityY;
    int i = (int)(f / Math.abs(f));
    Math.abs(mTargetVelocityX);
    if (i != 0)
    {
      localObject = this$0;
      int j = ((AdapterView)localObject).getCount();
      if (j == 0) {
        return false;
      }
      int k = ((ViewGroup)localObject).getChildCount();
      int m = ((AdapterView)localObject).getFirstVisiblePosition();
      if (i > 0)
      {
        if ((m + k >= j) && (((ViewGroup)localObject).getChildAt(k - 1).getBottom() <= ((View)localObject).getHeight())) {
          return false;
        }
      }
      else
      {
        if (i >= 0) {
          break label125;
        }
        if ((m <= 0) && (((ViewGroup)localObject).getChildAt(0).getTop() >= 0)) {
          return false;
        }
      }
      return true;
    }
    label125:
    return false;
  }
}
