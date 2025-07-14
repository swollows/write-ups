package androidx.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

public final class LifecycleHandler
  implements Application.ActivityLifecycleCallbacks
{
  public static final Regex.Companion Companion;
  
  static
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public LifecycleHandler() {}
  
  public static final void registerIn(Activity paramActivity)
  {
    Companion.getClass();
    params.Log.get(paramActivity, "activity");
    app.Log.enable(paramActivity, new LifecycleHandler());
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    params.Log.get(paramActivity, "activity");
  }
  
  public void onActivityDestroyed(Activity paramActivity)
  {
    params.Log.get(paramActivity, "activity");
  }
  
  public void onActivityPaused(Activity paramActivity)
  {
    params.Log.get(paramActivity, "activity");
  }
  
  public void onActivityPostCreated(Activity paramActivity, Bundle paramBundle)
  {
    params.Log.get(paramActivity, "activity");
    int i = PreferenceFragment.emptyView;
    Dictionary.a(paramActivity, Handle.ON_CREATE);
  }
  
  public void onActivityPostResumed(Activity paramActivity)
  {
    params.Log.get(paramActivity, "activity");
    int i = PreferenceFragment.emptyView;
    Dictionary.a(paramActivity, Handle.ON_RESUME);
  }
  
  public void onActivityPostStarted(Activity paramActivity)
  {
    params.Log.get(paramActivity, "activity");
    int i = PreferenceFragment.emptyView;
    Dictionary.a(paramActivity, Handle.ON_START);
  }
  
  public void onActivityPreDestroyed(Activity paramActivity)
  {
    params.Log.get(paramActivity, "activity");
    int i = PreferenceFragment.emptyView;
    Dictionary.a(paramActivity, Handle.ON_DESTROY);
  }
  
  public void onActivityPrePaused(Activity paramActivity)
  {
    params.Log.get(paramActivity, "activity");
    int i = PreferenceFragment.emptyView;
    Dictionary.a(paramActivity, Handle.ON_PAUSE);
  }
  
  public void onActivityPreStopped(Activity paramActivity)
  {
    params.Log.get(paramActivity, "activity");
    int i = PreferenceFragment.emptyView;
    Dictionary.a(paramActivity, Handle.ON_STOP);
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    params.Log.get(paramActivity, "activity");
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    params.Log.get(paramActivity, "activity");
    params.Log.get(paramBundle, "bundle");
  }
  
  public void onActivityStarted(Activity paramActivity)
  {
    params.Log.get(paramActivity, "activity");
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    params.Log.get(paramActivity, "activity");
  }
}
