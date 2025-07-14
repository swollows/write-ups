package signature;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.lang.reflect.Field;
import views.Matrix;

public final class ActivityLifecycleCallbacksWrapper
  implements Application.ActivityLifecycleCallbacks
{
  public final int L;
  public Object a;
  public Activity b;
  public boolean c = false;
  public boolean e = false;
  public boolean f = false;
  
  public ActivityLifecycleCallbacksWrapper(Activity paramActivity)
  {
    b = paramActivity;
    L = paramActivity.hashCode();
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    if (b == paramActivity)
    {
      b = null;
      f = true;
    }
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    if ((f) && (!c) && (!e))
    {
      Object localObject2 = a;
      try
      {
        Object localObject1 = R.raw.s.get(paramActivity);
        if (localObject1 == localObject2)
        {
          int i = paramActivity.hashCode();
          if (i != L) {
            return;
          }
          paramActivity = R.raw.t.get(paramActivity);
          R.raw.h.postAtFrontOfQueue(new Matrix(paramActivity, localObject1, 4));
          c = true;
          a = null;
          return;
        }
      }
      catch (Throwable paramActivity)
      {
        Log.e("ActivityRecreator", "Exception while fetching field values", paramActivity);
      }
    }
  }
  
  public final void onActivityResumed(Activity paramActivity) {}
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity)
  {
    if (b == paramActivity) {
      e = true;
    }
  }
  
  public final void onActivityStopped(Activity paramActivity) {}
}
