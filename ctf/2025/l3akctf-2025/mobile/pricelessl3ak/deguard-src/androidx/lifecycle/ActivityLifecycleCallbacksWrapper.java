package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import params.Log;

public final class ActivityLifecycleCallbacksWrapper
  extends MainApp.1
{
  public ActivityLifecycleCallbacksWrapper(Plot paramPlot)
  {
    super();
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    Log.get(paramActivity, "activity");
    if (Build.VERSION.SDK_INT < 29)
    {
      int i = PreferenceFragment.emptyView;
      paramActivity = paramActivity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
      Log.add(paramActivity, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
      a = this$0.a;
    }
  }
  
  public void onActivityPaused(Activity paramActivity)
  {
    Log.get(paramActivity, "activity");
    paramActivity = this$0;
    int i = l - 1;
    l = i;
    if (i == 0)
    {
      Handler localHandler = h;
      Log.get(localHandler);
      localHandler.postDelayed(b, 700L);
    }
  }
  
  public void onActivityPreCreated(Activity paramActivity, Bundle paramBundle)
  {
    Log.get(paramActivity, "activity");
    DOMStorage.enable(paramActivity, new LockScreenActivity.3(this$0));
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    Log.get(paramActivity, "activity");
    paramActivity = this$0;
    int i = p - 1;
    p = i;
    if ((i == 0) && (c))
    {
      o.d(Handle.ON_STOP);
      s = true;
    }
  }
}
