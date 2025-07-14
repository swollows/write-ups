package internal;

import java.util.concurrent.atomic.AtomicReference;
import params.Log;

public abstract class f
{
  public static final int b;
  public static final c c;
  public static final AtomicReference d;
  public static final app.f o;
  public static final Object s;
  
  static
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static final Item a(Item paramItem)
  {
    Object localObject = a();
    localObject = a(paramItem, b, c);
    if (localObject == null)
    {
      localObject = s;
      try
      {
        Type localType = a();
        paramItem = a(paramItem, b, c);
        if (paramItem != null) {
          return paramItem;
        }
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
      }
      catch (Throwable paramItem)
      {
        throw paramItem;
      }
    }
    return localObject;
  }
  
  public static final Item a(Item paramItem, int paramInt, c paramC)
  {
    Object localObject = null;
    Item localItem = paramItem;
    for (paramItem = (Item)localObject; localItem != null; paramItem = (Item)localObject)
    {
      int i = b;
      localObject = paramItem;
      if (i != 0)
      {
        localObject = paramItem;
        if (i <= paramInt)
        {
          localObject = paramItem;
          if (!paramC.b(i))
          {
            if ((paramItem != null) && (b >= b)) {
              localItem = paramItem;
            }
            localObject = localItem;
          }
        }
      }
      localItem = null;
    }
    if (paramItem != null) {
      return paramItem;
    }
    return null;
  }
  
  public static final Item a(Item paramItem, Label paramLabel)
  {
    Type localType = a();
    localType.getClass();
    paramItem = a(paramItem, b, c);
    if (paramItem == null)
    {
      paramItem = s;
      try
      {
        localType = a();
        paramLabel = paramLabel.b();
        Log.add(paramLabel, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
        paramLabel = a(paramLabel, b, c);
        if (paramLabel != null) {
          return paramLabel;
        }
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
      }
      catch (Throwable paramLabel)
      {
        throw paramLabel;
      }
    }
    return paramItem;
  }
  
  public static final Type a()
  {
    o.a();
    return (Type)d.get();
  }
}
