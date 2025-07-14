package ui;

import android.app.Activity;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnDrawListener;
import android.view.Window;
import androidx.fragment.asm.FragmentActivity;
import asm.Type;
import params.Log;

public final class Item
  implements Scheduler, ViewTreeObserver.OnDrawListener, Runnable
{
  public final long b;
  public Runnable h;
  public boolean k;
  
  public Item(FragmentActivity paramFragmentActivity)
  {
    c = paramFragmentActivity;
    b = (SystemClock.uptimeMillis() + '?');
  }
  
  public final void execute(Runnable paramRunnable)
  {
    Log.get(paramRunnable, "runnable");
    h = paramRunnable;
    paramRunnable = c.getWindow().getDecorView();
    Log.append(paramRunnable, "window.decorView");
    if (k)
    {
      if (Log.equals(Looper.myLooper(), Looper.getMainLooper()))
      {
        paramRunnable.invalidate();
        return;
      }
      paramRunnable.postInvalidate();
      return;
    }
    paramRunnable.postOnAnimation(new Type(2, this));
  }
  
  public final void onDraw()
  {
    Object localObject = h;
    if (localObject != null)
    {
      ((Runnable)localObject).run();
      h = null;
      Plot localPlot = c.getFullyDrawnReporter();
      localObject = s;
      try
      {
        boolean bool = l;
        if (!bool) {
          return;
        }
        k = false;
        c.getWindow().getDecorView().post(this);
        return;
      }
      catch (Throwable localThrowable)
      {
        throw localThrowable;
      }
    }
    else if (SystemClock.uptimeMillis() > b)
    {
      k = false;
      c.getWindow().getDecorView().post(this);
    }
  }
  
  public final void run()
  {
    c.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
  }
}
