package asm;

import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import app.Element;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;
import views.Attribute;
import views.Frame;

public final class a
  implements Item
{
  public final Element a;
  public final Object b = new Object();
  public final android.content.Context c;
  public final views.Context i;
  public drupal.Context m;
  public Handler r;
  public ThreadPoolExecutor s;
  public ThreadPoolExecutor t;
  
  public a(android.content.Context paramContext, views.Context paramContext1)
  {
    drupal.Context.get(paramContext, "Context cannot be null");
    c = paramContext.getApplicationContext();
    i = paramContext1;
    a = localElement;
  }
  
  public final void a()
  {
    Object localObject1 = b;
    try
    {
      m = null;
      localObject2 = r;
      if (localObject2 != null) {
        ((Handler)localObject2).removeCallbacks(null);
      }
      r = null;
      localObject2 = t;
      if (localObject2 != null) {
        ((ThreadPoolExecutor)localObject2).shutdown();
      }
      s = null;
      t = null;
      return;
    }
    catch (Throwable localThrowable)
    {
      Object localObject2;
      for (;;) {}
    }
    throw ((Throwable)localObject2);
  }
  
  /* Error */
  public final void a(drupal.Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 32	asm/a:b	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: aload_1
    //   9: putfield 56	asm/a:m	Ldrupal/Context;
    //   12: aload_2
    //   13: monitorexit
    //   14: aload_0
    //   15: getfield 32	asm/a:b	Ljava/lang/Object;
    //   18: astore_1
    //   19: aload_1
    //   20: monitorenter
    //   21: aload_0
    //   22: getfield 56	asm/a:m	Ldrupal/Context;
    //   25: ifnonnull +10 -> 35
    //   28: aload_1
    //   29: monitorexit
    //   30: return
    //   31: astore_2
    //   32: goto +78 -> 110
    //   35: aload_0
    //   36: getfield 73	asm/a:s	Ljava/util/concurrent/ThreadPoolExecutor;
    //   39: ifnonnull +52 -> 91
    //   42: new 76	asm/ModernAsyncTask$1
    //   45: dup
    //   46: ldc 78
    //   48: invokespecial 81	asm/ModernAsyncTask$1:<init>	(Ljava/lang/String;)V
    //   51: astore_2
    //   52: new 68	java/util/concurrent/ThreadPoolExecutor
    //   55: dup
    //   56: iconst_0
    //   57: iconst_1
    //   58: ldc2_w 82
    //   61: getstatic 89	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   64: new 91	java/util/concurrent/LinkedBlockingDeque
    //   67: dup
    //   68: invokespecial 92	java/util/concurrent/LinkedBlockingDeque:<init>	()V
    //   71: aload_2
    //   72: invokespecial 95	java/util/concurrent/ThreadPoolExecutor:<init>	(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V
    //   75: astore_2
    //   76: aload_2
    //   77: iconst_1
    //   78: invokevirtual 99	java/util/concurrent/ThreadPoolExecutor:allowCoreThreadTimeOut	(Z)V
    //   81: aload_0
    //   82: aload_2
    //   83: putfield 66	asm/a:t	Ljava/util/concurrent/ThreadPoolExecutor;
    //   86: aload_0
    //   87: aload_2
    //   88: putfield 73	asm/a:s	Ljava/util/concurrent/ThreadPoolExecutor;
    //   91: aload_0
    //   92: getfield 73	asm/a:s	Ljava/util/concurrent/ThreadPoolExecutor;
    //   95: new 101	asm/Type
    //   98: dup
    //   99: iconst_0
    //   100: aload_0
    //   101: invokespecial 104	asm/Type:<init>	(ILjava/lang/Object;)V
    //   104: invokevirtual 107	java/util/concurrent/ThreadPoolExecutor:execute	(Ljava/lang/Runnable;)V
    //   107: aload_1
    //   108: monitorexit
    //   109: return
    //   110: aload_1
    //   111: monitorexit
    //   112: aload_2
    //   113: athrow
    //   114: astore_1
    //   115: aload_2
    //   116: monitorexit
    //   117: aload_1
    //   118: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	this	a
    //   0	119	1	paramContext	drupal.Context
    //   4	9	2	localObject1	Object
    //   31	1	2	localThrowable	Throwable
    //   51	65	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   21	30	31	java/lang/Throwable
    //   35	91	31	java/lang/Throwable
    //   91	109	31	java/lang/Throwable
    //   110	112	31	java/lang/Throwable
    //   7	14	114	java/lang/Throwable
    //   115	117	114	java/lang/Throwable
  }
  
  public final views.Item read()
  {
    Object localObject3 = a;
    Object localObject1 = c;
    Object localObject2 = i;
    try
    {
      localObject3.getClass();
      localObject3 = new ArrayList(1);
      localObject2 = new Object[] { localObject2 }[0];
      Objects.requireNonNull(localObject2);
      ((ArrayList)localObject3).add(localObject2);
      localObject1 = Frame.get((android.content.Context)localObject1, Collections.unmodifiableList((List)localObject3));
      int j = a;
      if (j == 0)
      {
        localObject1 = (views.Item[])((List)b).get(0);
        if ((localObject1 != null) && (localObject1.length != 0)) {
          return localObject1[0];
        }
        throw new RuntimeException("fetchFonts failed (empty result)");
      }
      localObject1 = new StringBuilder("fetchFonts failed (");
      ((StringBuilder)localObject1).append(j);
      ((StringBuilder)localObject1).append(")");
      throw new RuntimeException(((StringBuilder)localObject1).toString());
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new RuntimeException("provider not found", localNameNotFoundException);
    }
  }
}
