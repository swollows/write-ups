package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

public final class Alarm
  implements Runnable
{
  public final void run()
  {
    Object localObject;
    switch (mFile)
    {
    default: 
      localObject = mZip;
      ((ListPopupWindow.ForwardingListener)localObject).clearCallbacks();
      View localView = mSrc;
      if (localView.isEnabled())
      {
        if (localView.isLongClickable()) {
          return;
        }
        if (!((ListPopupWindow.ForwardingListener)localObject).onForwardingStarted()) {
          return;
        }
        localView.getParent().requestDisallowInterceptTouchEvent(true);
        long l = SystemClock.uptimeMillis();
        MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        localView.onTouchEvent(localMotionEvent);
        localMotionEvent.recycle();
        mForwarding = true;
        return;
      }
      break;
    case 0: 
      localObject = mZip.mSrc.getParent();
      if (localObject != null) {
        ((ViewParent)localObject).requestDisallowInterceptTouchEvent(true);
      }
      break;
    }
  }
}
