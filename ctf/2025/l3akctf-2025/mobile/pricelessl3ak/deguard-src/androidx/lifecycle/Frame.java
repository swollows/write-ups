package androidx.lifecycle;

import android.os.BaseBundle;
import android.os.Bundle;
import app.Element;
import handle.AnnotationVisitor;
import handle.Handle;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import params.Log;
import tts.h;
import widgets.Pair;

public abstract class Frame
{
  public static final Element a = new Element(16);
  public static final Element b = new Element(17);
  public static final Element i = new Element(15);
  
  public static m a(Bundle paramBundle1, Bundle paramBundle2)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static final m a(AnnotationVisitor paramAnnotationVisitor)
  {
    Object localObject1 = i;
    paramAnnotationVisitor = c;
    localObject1 = (tts.c)paramAnnotationVisitor.get(localObject1);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = (List)paramAnnotationVisitor.get(a);
      if (localObject2 != null)
      {
        Bundle localBundle1 = (Bundle)paramAnnotationVisitor.get(b);
        String str = (String)paramAnnotationVisitor.get(g.a);
        if (str != null)
        {
          localObject1 = ((tts.c)localObject1).getSavedStateRegistry().b();
          boolean bool = localObject1 instanceof b;
          paramAnnotationVisitor = null;
          if (bool) {
            localObject1 = (b)localObject1;
          } else {
            localObject1 = null;
          }
          if (localObject1 != null)
          {
            LinkedHashMap localLinkedHashMap = aa;
            localObject2 = (m)localLinkedHashMap.get(str);
            if (localObject2 == null)
            {
              ((b)localObject1).c();
              Bundle localBundle2 = c;
              if ((localBundle2 != null) && (localBundle2.containsKey(str)))
              {
                localObject2 = localBundle2.getBundle(str);
                paramAnnotationVisitor = (AnnotationVisitor)localObject2;
                if (localObject2 == null) {
                  paramAnnotationVisitor = internal.Label.bundleOf((Pair[])Arrays.copyOf(new Pair[0], 0));
                }
                localBundle2.remove(str);
                if (localBundle2.isEmpty()) {
                  c = null;
                }
              }
              paramAnnotationVisitor = a(paramAnnotationVisitor, localBundle1);
              localLinkedHashMap.put(str, paramAnnotationVisitor);
              return paramAnnotationVisitor;
            }
          }
          else
          {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
          }
        }
        else
        {
          throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
      }
      else
      {
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
      }
    }
    else
    {
      throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }
    return localObject2;
  }
  
  public static final p a(List paramList)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static final void a(Label paramLabel, h paramH, ClassWriter paramClassWriter)
  {
    Log.get(paramH, "registry");
    Log.get(paramClassWriter, "lifecycle");
    paramLabel = c;
    if (paramLabel != null)
    {
      Element localElement = b;
      try
      {
        paramLabel = (AutoCloseable)l.get("androidx.lifecycle.savedstate.vm.tag");
      }
      catch (Throwable paramLabel)
      {
        throw paramLabel;
      }
    }
    else
    {
      paramLabel = null;
    }
    paramLabel = (i)paramLabel;
    if ((paramLabel != null) && (!e))
    {
      paramLabel.a(paramH, paramClassWriter);
      paramLabel = a;
      if ((paramLabel != c.a) && (paramLabel.compareTo(c.d) < 0))
      {
        paramClassWriter.a(new a(paramClassWriter, paramH, 1));
        return;
      }
      paramH.a();
    }
  }
}
