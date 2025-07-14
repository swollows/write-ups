package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build.VERSION;
import android.os.Bundle;
import params.Log;

public class PreferenceFragment
  extends Fragment
{
  public g a;
  
  public PreferenceFragment() {}
  
  public final void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    onStop(Handle.ON_CREATE);
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    onStop(Handle.ON_DESTROY);
    a = null;
  }
  
  public final void onPause()
  {
    super.onPause();
    onStop(Handle.ON_PAUSE);
  }
  
  public final void onResume()
  {
    super.onResume();
    g localG = a;
    if (localG != null) {
      ((Plot)d).a();
    }
    onStop(Handle.ON_RESUME);
  }
  
  public final void onStart()
  {
    super.onStart();
    Object localObject = a;
    if (localObject != null)
    {
      localObject = (Plot)d;
      int i = p + 1;
      p = i;
      if ((i == 1) && (s))
      {
        o.d(Handle.ON_START);
        s = false;
      }
    }
    onStop(Handle.ON_START);
  }
  
  public final void onStop()
  {
    super.onStop();
    onStop(Handle.ON_STOP);
  }
  
  public final void onStop(Handle paramHandle)
  {
    if (Build.VERSION.SDK_INT < 29)
    {
      Activity localActivity = getActivity();
      Log.append(localActivity, "getActivity(...)");
      Dictionary.a(localActivity, paramHandle);
    }
  }
}
