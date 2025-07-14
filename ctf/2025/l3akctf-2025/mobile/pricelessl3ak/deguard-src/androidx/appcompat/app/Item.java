package androidx.appcompat.app;

import a.ClassWriter;
import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

public final class Item
  extends e
{
  public final Object b;
  
  public Item(AppCompatDelegateImplV7 paramAppCompatDelegateImplV7, ClassWriter paramClassWriter)
  {
    super(paramAppCompatDelegateImplV7);
    b = paramClassWriter;
  }
  
  public Item(AppCompatDelegateImplV7 paramAppCompatDelegateImplV7, Context paramContext)
  {
    super(paramAppCompatDelegateImplV7);
    b = ((PowerManager)paramContext.getApplicationContext().getSystemService("power"));
  }
  
  public final int doInBackground()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final IntentFilter init()
  {
    switch (a)
    {
    default: 
      localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.TIME_SET");
      localIntentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
      localIntentFilter.addAction("android.intent.action.TIME_TICK");
      return localIntentFilter;
    }
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
    return localIntentFilter;
  }
  
  public final void setTitle()
  {
    switch (a)
    {
    default: 
      c.a(true, true);
      return;
    }
    c.a(true, true);
  }
}
