package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build.VERSION;

public abstract class Dictionary
{
  public static void a(Activity paramActivity, Handle paramHandle)
  {
    params.Log.get(paramHandle, "event");
    if ((paramActivity instanceof x))
    {
      paramActivity = ((x)paramActivity).getLifecycle();
      if ((paramActivity instanceof f)) {
        ((f)paramActivity).d(paramHandle);
      }
    }
  }
  
  public static void onCreate(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 29)
    {
      LifecycleHandler.Companion.getClass();
      app.Log.enable(paramActivity, new LifecycleHandler());
    }
    paramActivity = paramActivity.getFragmentManager();
    if (paramActivity.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null)
    {
      paramActivity.beginTransaction().add(new PreferenceFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
      paramActivity.executePendingTransactions();
    }
  }
}
