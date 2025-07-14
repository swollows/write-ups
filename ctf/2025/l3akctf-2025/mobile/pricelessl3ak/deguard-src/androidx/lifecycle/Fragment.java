package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import params.Log;

public final class Fragment
  extends MainApp.1
{
  public Fragment()
  {
    super();
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    Log.get(paramActivity, "activity");
    int i = PreferenceFragment.emptyView;
    Dictionary.onCreate(paramActivity);
  }
}
