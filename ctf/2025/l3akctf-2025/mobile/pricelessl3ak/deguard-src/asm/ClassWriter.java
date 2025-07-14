package asm;

import android.os.Looper;
import app.Element;
import drupal.Context;
import http.TCharArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class ClassWriter
{
  public static final Object H = new Object();
  public static volatile ClassWriter b;
  public final Element a;
  public volatile int c;
  public final ReentrantReadWriteLock d;
  public final int e;
  public final TCharArrayList f;
  public final android.os.Handler h;
  public final f i;
  public final Item j;
  public final i p;
  
  public ClassWriter(g paramG)
  {
    ReentrantReadWriteLock localReentrantReadWriteLock = new ReentrantReadWriteLock();
    d = localReentrantReadWriteLock;
    c = 3;
    Item localItem = j;
    j = localItem;
    int k = e;
    e = k;
    i = d;
    h = new android.os.Handler(Looper.getMainLooper());
    f = new TCharArrayList();
    a = new Element(2);
    paramG = new i(this);
    p = paramG;
    localReentrantReadWriteLock.writeLock().lock();
    if (k == 0) {
      try
      {
        c = 0;
      }
      catch (Throwable paramG)
      {
        d.writeLock().unlock();
        throw paramG;
      }
    }
    localReentrantReadWriteLock.writeLock().unlock();
    if (get() == 0) {
      try
      {
        localItem.a(new ClassReader(paramG));
        return;
      }
      catch (Throwable paramG)
      {
        a(paramG);
      }
    }
  }
  
  public static ClassWriter a()
  {
    Object localObject = H;
    for (;;)
    {
      try
      {
        ClassWriter localClassWriter = b;
        if (localClassWriter != null)
        {
          k = 1;
          if (k != 0) {
            return localClassWriter;
          }
        }
      }
      catch (Throwable localThrowable)
      {
        continue;
        throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        throw localThrowable;
      }
      int k = 0;
    }
  }
  
  public final void a(Handler paramHandler)
  {
    Context.get(paramHandler, "initCallback cannot be null");
    d.writeLock().lock();
    try
    {
      k = c;
      if (k != 1)
      {
        k = c;
        if (k != 2) {
          f.add(paramHandler);
        }
      }
    }
    catch (Throwable paramHandler)
    {
      break label105;
    }
    android.os.Handler localHandler = h;
    int k = c;
    localHandler.post(new b(Arrays.asList(new Handler[] { paramHandler }), k, null));
    d.writeLock().unlock();
    return;
    label105:
    d.writeLock().unlock();
    throw paramHandler;
  }
  
  public final void a(Throwable paramThrowable)
  {
    ArrayList localArrayList = new ArrayList();
    d.writeLock().lock();
    try
    {
      c = 2;
      localArrayList.addAll(f);
      f.clear();
      d.writeLock().unlock();
      h.post(new b(localArrayList, c, paramThrowable));
      return;
    }
    catch (Throwable paramThrowable)
    {
      d.writeLock().unlock();
      throw paramThrowable;
    }
  }
  
  public final void b()
  {
    int k;
    if (e == 1) {
      k = 1;
    } else {
      k = 0;
    }
    if (k != 0)
    {
      if (get() == 1) {
        return;
      }
      d.writeLock().lock();
      try
      {
        k = c;
        if (k == 0)
        {
          d.writeLock().unlock();
          return;
        }
        c = 0;
        d.writeLock().unlock();
        Object localObject = p;
        ClassWriter localClassWriter = a;
        try
        {
          localObject = new ClassReader((i)localObject);
          j.a((Context)localObject);
          return;
        }
        catch (Throwable localThrowable2)
        {
          localClassWriter.a(localThrowable2);
          return;
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
      }
      catch (Throwable localThrowable1)
      {
        d.writeLock().unlock();
        throw localThrowable1;
      }
    }
  }
  
  public final int get()
  {
    d.readLock().lock();
    try
    {
      int k = c;
      d.readLock().unlock();
      return k;
    }
    catch (Throwable localThrowable)
    {
      d.readLock().unlock();
      throw localThrowable;
    }
  }
  
  public final CharSequence get(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
}
