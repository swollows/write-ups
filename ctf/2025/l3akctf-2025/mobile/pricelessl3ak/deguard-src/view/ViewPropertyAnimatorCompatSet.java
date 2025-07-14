package view;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.BaseInterpolator;
import androidx.appcompat.widget.ScrollingTabContainerView.VisibilityAnimListener;
import app.ViewPropertyAnimatorCompat;
import drupal.Context;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;

public final class ViewPropertyAnimatorCompatSet
{
  public final ArrayList mAnimators = new ArrayList();
  public long mDuration = -1L;
  public BaseInterpolator mInterpolator;
  public boolean mIsStarted;
  public Context mListener;
  public final ScrollingTabContainerView.VisibilityAnimListener mProxyListener = new ScrollingTabContainerView.VisibilityAnimListener(this);
  
  public ViewPropertyAnimatorCompatSet() {}
  
  public final void cancel()
  {
    if (!mIsStarted) {
      return;
    }
    Iterator localIterator = mAnimators.iterator();
    while (localIterator.hasNext()) {
      ((ViewPropertyAnimatorCompat)localIterator.next()).cancel();
    }
    mIsStarted = false;
  }
  
  public final void start()
  {
    if (mIsStarted) {
      return;
    }
    Iterator localIterator = mAnimators.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (ViewPropertyAnimatorCompat)localIterator.next();
      long l = mDuration;
      if (l >= 0L) {
        ((ViewPropertyAnimatorCompat)localObject).setDuration(l);
      }
      BaseInterpolator localBaseInterpolator = mInterpolator;
      if (localBaseInterpolator != null)
      {
        View localView = (View)mView.get();
        if (localView != null) {
          localView.animate().setInterpolator(localBaseInterpolator);
        }
      }
      if (mListener != null) {
        ((ViewPropertyAnimatorCompat)localObject).setListener(mProxyListener);
      }
      localObject = (View)mView.get();
      if (localObject != null) {
        ((View)localObject).animate().start();
      }
    }
    mIsStarted = true;
  }
}
