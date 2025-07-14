package common;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import app.f;

public final class Resources
  extends InputConnectionWrapper
{
  public Resources(InputConnection paramInputConnection, d paramD)
  {
    super(paramInputConnection, false);
  }
  
  public final boolean commitContent(InputContentInfo paramInputContentInfo, int paramInt, Bundle paramBundle)
  {
    f localF = null;
    if ((paramInputContentInfo != null) && (Build.VERSION.SDK_INT >= 25)) {
      localF = new f(3, new MethodWriter(paramInputContentInfo));
    }
    if (a.a(localF, paramInt, paramBundle)) {
      return true;
    }
    return super.commitContent(paramInputContentInfo, paramInt, paramBundle);
  }
}
