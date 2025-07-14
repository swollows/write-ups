package androidx.lifecycle;

import android.app.Activity;

public abstract class DOMStorage
{
  public static final void enable(Activity paramActivity, LockScreenActivity.3 param3)
  {
    paramActivity.registerActivityLifecycleCallbacks(param3);
  }
}
