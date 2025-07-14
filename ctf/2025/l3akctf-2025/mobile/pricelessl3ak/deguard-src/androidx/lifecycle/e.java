package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.fragment.asm.FragmentActivity;
import drupal.Context;
import handle.AnnotationVisitor;
import handle.Handle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import params.Log;
import tts.c;
import tts.h;

public final class e
  implements l
{
  public final ClassWriter a;
  public final Application b;
  public final Bundle c;
  public final h g;
  public final Item h;
  
  public e(Application paramApplication, FragmentActivity paramFragmentActivity, Bundle paramBundle)
  {
    g = paramFragmentActivity.getSavedStateRegistry();
    a = paramFragmentActivity.getLifecycle();
    c = paramBundle;
    b = paramApplication;
    if (paramApplication != null)
    {
      if (Item.g == null) {
        Item.g = new Item(paramApplication);
      }
      paramApplication = Item.g;
      Log.get(paramApplication);
    }
    else
    {
      paramApplication = new Item(null);
    }
    h = paramApplication;
  }
  
  public final Label a(Class paramClass)
  {
    String str = paramClass.getCanonicalName();
    if (str != null) {
      return a(str, paramClass);
    }
    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
  }
  
  public final Label a(Class paramClass, AnnotationVisitor paramAnnotationVisitor)
  {
    Object localObject2 = g.a;
    Object localObject1 = c;
    localObject2 = (String)((LinkedHashMap)localObject1).get(localObject2);
    if (localObject2 != null)
    {
      if ((((LinkedHashMap)localObject1).get(Frame.i) != null) && (((LinkedHashMap)localObject1).get(Frame.a) != null))
      {
        localObject2 = (Application)((LinkedHashMap)localObject1).get(Item.a);
        boolean bool = a.class.isAssignableFrom(paramClass);
        if ((bool) && (localObject2 != null)) {
          localObject1 = aa.get(paramClass, aa.a);
        } else {
          localObject1 = aa.get(paramClass, aa.c);
        }
        if (localObject1 == null) {
          return h.a(paramClass, paramAnnotationVisitor);
        }
        if ((bool) && (localObject2 != null)) {
          return aa.invoke(paramClass, (Constructor)localObject1, new Object[] { localObject2, Frame.a(paramAnnotationVisitor) });
        }
        return aa.invoke(paramClass, (Constructor)localObject1, new Object[] { Frame.a(paramAnnotationVisitor) });
      }
      if (a != null) {
        return a((String)localObject2, paramClass);
      }
      throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
    }
    throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
  }
  
  public final Label a(String paramString, Class paramClass)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final Label a(params.Item paramItem, AnnotationVisitor paramAnnotationVisitor)
  {
    return a(Context.add(paramItem), paramAnnotationVisitor);
  }
}
