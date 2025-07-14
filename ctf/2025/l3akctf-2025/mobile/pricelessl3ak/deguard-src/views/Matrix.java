package views;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import androidx.appcompat.widget.Type;
import app.f;
import java.lang.reflect.Method;
import signature.ActivityLifecycleCallbacksWrapper;
import signature.R.raw;

public final class Matrix
  implements Runnable
{
  public final void run()
  {
    switch (c)
    {
    default: 
      try
      {
        Method localMethod = R.raw.b;
        Object localObject1 = b;
        Object localObject2 = a;
        Boolean localBoolean;
        if (localMethod != null) {
          localBoolean = Boolean.FALSE;
        }
        if (localRuntimeException.getClass() != RuntimeException.class) {
          break;
        }
      }
      catch (Throwable localThrowable)
      {
        try
        {
          localMethod.invoke(localObject2, new Object[] { localObject1, localBoolean, "AppCompat recreation" });
          return;
        }
        catch (RuntimeException localRuntimeException) {}
        localThrowable = localThrowable;
        break label136;
        localMethod = R.raw.a;
        localBoolean = Boolean.FALSE;
        localMethod.invoke(localObject2, new Object[] { localRuntimeException, localBoolean });
        return;
        Log.e("ActivityRecreator", "Exception while invoking performStopActivity", localRuntimeException);
        return;
      }
      if (localRuntimeException.getMessage() != null)
      {
        if (!localRuntimeException.getMessage().startsWith("Unable to stop")) {
          return;
        }
        throw localRuntimeException;
      }
      break;
    case 3: 
      ((Application)a).unregisterActivityLifecycleCallbacks((ActivityLifecycleCallbacksWrapper)b);
      return;
    case 2: 
      a).a = b;
      return;
    case 1: 
      ((Label)a).a(b);
      return;
    case 0: 
      label136:
      Type localType = (Type)a).a;
      if (localType != null) {
        localType.a((Typeface)b);
      }
      break;
    }
  }
}
