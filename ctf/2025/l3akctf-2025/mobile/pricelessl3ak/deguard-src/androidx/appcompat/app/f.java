package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import http.BlockList.MyIterator;
import http.TCharArrayList;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import sync.Label;
import view.ActionMode;
import view.ActionMode.Callback;

public abstract class f
{
  public static final TCharArrayList a;
  public static Label b;
  public static Label c;
  public static final Object m;
  public static final Object r;
  public static boolean s;
  public static final SerializingExecutor this$0;
  public static final int v;
  public static Boolean value;
  
  static
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static void a(AppCompatDelegateImplV7 paramAppCompatDelegateImplV7)
  {
    Object localObject1 = r;
    try
    {
      Object localObject2 = a;
      localObject2.getClass();
      localObject2 = new BlockList.MyIterator((TCharArrayList)localObject2);
      while (((BlockList.MyIterator)localObject2).hasNext())
      {
        f localF = (f)((WeakReference)((BlockList.MyIterator)localObject2).next()).get();
        if ((localF == paramAppCompatDelegateImplV7) || (localF == null)) {
          ((BlockList.MyIterator)localObject2).remove();
        }
      }
      return;
    }
    catch (Throwable paramAppCompatDelegateImplV7)
    {
      for (;;) {}
    }
    throw paramAppCompatDelegateImplV7;
  }
  
  public static boolean parse(Context paramContext)
  {
    int i;
    if (value == null) {
      i = CustomTileListenerService.logger;
    }
    try
    {
      i = MessageConstraints.getMaxLineLength();
      PackageManager localPackageManager = paramContext.getPackageManager();
      paramContext = localPackageManager.getServiceInfo(new ComponentName(paramContext, M.class), i | 0x80);
      paramContext = metaData;
      if (paramContext == null) {
        break label79;
      }
      boolean bool = paramContext.getBoolean("autoStoreLocales");
      value = Boolean.valueOf(bool);
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      label79:
      for (;;) {}
    }
    Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
    value = Boolean.FALSE;
    return value.booleanValue();
  }
  
  public abstract void a();
  
  public abstract void b();
  
  public abstract void b(CharSequence paramCharSequence);
  
  public abstract void invalidateOptionsMenu();
  
  public abstract void onCreate();
  
  public abstract boolean requestWindowFeature(int paramInt);
  
  public abstract void setContentView(int paramInt);
  
  public abstract void setContentView(View paramView);
  
  public abstract void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract ActionMode startSupportActionModeFromWindow(ActionMode.Callback paramCallback);
}
