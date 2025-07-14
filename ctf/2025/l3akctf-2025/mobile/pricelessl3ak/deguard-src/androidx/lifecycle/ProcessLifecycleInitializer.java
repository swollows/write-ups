package androidx.lifecycle;

import S.b;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import collections.EmptyList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import params.Log;

public final class ProcessLifecycleInitializer
  implements b
{
  public ProcessLifecycleInitializer() {}
  
  public final Object a(Context paramContext)
  {
    Log.get(paramContext, "context");
    Object localObject = arity.f.a(paramContext);
    Log.append(localObject, "getInstance(...)");
    if (a.contains(ProcessLifecycleInitializer.class))
    {
      if (!YPositionMetric.a.a.getAndSet(true))
      {
        localObject = paramContext.getApplicationContext();
        Log.add(localObject, "null cannot be cast to non-null type android.app.Application");
        ((Application)localObject).registerActivityLifecycleCallbacks(new Fragment());
      }
      localObject = Plot.r;
      localObject.getClass();
      h = new Handler();
      o.d(Handle.ON_CREATE);
      paramContext = paramContext.getApplicationContext();
      Log.add(paramContext, "null cannot be cast to non-null type android.app.Application");
      ((Application)paramContext).registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacksWrapper((Plot)localObject));
      return localObject;
    }
    throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
  }
  
  public final List get()
  {
    return EmptyList.v;
  }
}
