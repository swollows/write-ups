package app;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class ViewPropertyAnimatorCompat
{
  public final WeakReference mView;
  
  public ViewPropertyAnimatorCompat(View paramView)
  {
    mView = new WeakReference(paramView);
  }
  
  public final void alpha(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().alpha(paramFloat);
    }
  }
  
  public final void cancel()
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().cancel();
    }
  }
  
  public final void setDuration(long paramLong)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().setDuration(paramLong);
    }
  }
  
  public final void setListener(ViewPropertyAnimatorListener paramViewPropertyAnimatorListener)
  {
    View localView = (View)mView.get();
    if (localView != null)
    {
      if (paramViewPropertyAnimatorListener != null)
      {
        localView.animate().setListener(new ValueAnimatorCompatImplHoneycombMr1.2(paramViewPropertyAnimatorListener, localView));
        return;
      }
      localView.animate().setListener(null);
    }
  }
  
  public final void translationY(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().translationY(paramFloat);
    }
  }
}
