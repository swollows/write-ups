package androidx.emoji2.text;

import S.b;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import asm.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class EmojiCompatInitializer
  implements b
{
  public EmojiCompatInitializer() {}
  
  public final Object a(Context paramContext)
  {
    Object localObject2 = new g(new app.f(paramContext));
    e = 1;
    Object localObject1;
    if (asm.ClassWriter.b == null) {
      localObject1 = asm.ClassWriter.H;
    }
    try
    {
      if (asm.ClassWriter.b == null) {
        asm.ClassWriter.b = new asm.ClassWriter((g)localObject2);
      }
    }
    catch (Throwable paramContext)
    {
      arity.f localF;
      for (;;) {}
    }
    throw paramContext;
    localF = arity.f.a(paramContext);
    localF.getClass();
    localObject2 = arity.f.b;
    try
    {
      localObject1 = m.get(ProcessLifecycleInitializer.class);
      paramContext = localObject1;
      if (localObject1 == null) {
        paramContext = localF.add(ProcessLifecycleInitializer.class, new HashSet());
      }
      paramContext = ((androidx.lifecycle.x)paramContext).getLifecycle();
      paramContext.a(new asm.x(this, paramContext));
      return Boolean.TRUE;
    }
    catch (Throwable paramContext)
    {
      for (;;) {}
    }
    throw paramContext;
  }
  
  public final List get()
  {
    return Collections.singletonList(ProcessLifecycleInitializer.class);
  }
}
