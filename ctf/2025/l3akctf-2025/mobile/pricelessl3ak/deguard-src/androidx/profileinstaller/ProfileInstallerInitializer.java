package androidx.profileinstaller;

import S.b;
import android.content.Context;
import android.view.Choreographer;
import app.Element;
import core.ViewDataBinding.7;
import java.util.Collections;
import java.util.List;

public class ProfileInstallerInitializer
  implements b
{
  public ProfileInstallerInitializer() {}
  
  public final Object a(Context paramContext)
  {
    paramContext = paramContext.getApplicationContext();
    Choreographer.getInstance().postFrameCallback(new ViewDataBinding.7(this, paramContext));
    return new Element(11);
  }
  
  public final List get()
  {
    return Collections.emptyList();
  }
}
