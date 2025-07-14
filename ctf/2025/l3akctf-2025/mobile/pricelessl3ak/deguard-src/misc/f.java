package misc;

import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.ClassWriter;
import androidx.lifecycle.MenuItem;
import internal.Label;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class f
{
  public final ArrayList a = new ArrayList();
  public final Bundle b = new Bundle();
  public final LinkedHashMap c = new LinkedHashMap();
  public final transient LinkedHashMap l = new LinkedHashMap();
  public final LinkedHashMap m = new LinkedHashMap();
  public final LinkedHashMap o = new LinkedHashMap();
  public final LinkedHashMap this$0 = new LinkedHashMap();
  
  public f() {}
  
  public final ByteVector a(String paramString, polynomials.a paramA, a paramA1)
  {
    params.Log.get(paramString, "key");
    add(paramString);
    l.put(paramString, new e(paramA, paramA1));
    Object localObject1 = m;
    if (((Map)localObject1).containsKey(paramString))
    {
      localObject2 = ((LinkedHashMap)localObject1).get(paramString);
      ((Map)localObject1).remove(paramString);
      paramA1.a(localObject2);
    }
    localObject1 = b;
    Object localObject2 = (ActivityResult)Label.a(paramString, (Bundle)localObject1);
    if (localObject2 != null)
    {
      ((Bundle)localObject1).remove(paramString);
      int i = d;
      paramA1.a(paramA.a(f, i));
    }
    return new ByteVector(this, paramString);
  }
  
  public final void a(String paramString)
  {
    params.Log.get(paramString, "key");
    if (!a.contains(paramString))
    {
      localObject1 = (Integer)c.remove(paramString);
      if (localObject1 != null) {
        this$0.remove(localObject1);
      }
    }
    l.remove(paramString);
    Object localObject1 = m;
    if (((Map)localObject1).containsKey(paramString))
    {
      localObject2 = new StringBuilder("Dropping pending result for request ");
      ((StringBuilder)localObject2).append(paramString);
      ((StringBuilder)localObject2).append(": ");
      ((StringBuilder)localObject2).append(((LinkedHashMap)localObject1).get(paramString));
      android.util.Log.w("ActivityResultRegistry", ((StringBuilder)localObject2).toString());
      ((Map)localObject1).remove(paramString);
    }
    localObject1 = b;
    Object localObject3;
    if (((BaseBundle)localObject1).containsKey(paramString))
    {
      localObject2 = (ActivityResult)Label.a(paramString, (Bundle)localObject1);
      localObject3 = new StringBuilder("Dropping pending result for request ");
      ((StringBuilder)localObject3).append(paramString);
      ((StringBuilder)localObject3).append(": ");
      ((StringBuilder)localObject3).append(localObject2);
      android.util.Log.w("ActivityResultRegistry", ((StringBuilder)localObject3).toString());
      ((Bundle)localObject1).remove(paramString);
    }
    localObject1 = o;
    Object localObject2 = (b)((LinkedHashMap)localObject1).get(paramString);
    if (localObject2 != null)
    {
      localObject3 = k;
      Iterator localIterator = ((ArrayList)localObject3).iterator();
      while (localIterator.hasNext())
      {
        MenuItem localMenuItem = (MenuItem)localIterator.next();
        b.b(localMenuItem);
      }
      ((ArrayList)localObject3).clear();
      ((Map)localObject1).remove(paramString);
    }
  }
  
  public final boolean a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    String str = (String)this$0.get(Integer.valueOf(paramInt1));
    if (str == null) {
      return false;
    }
    e localE = (e)l.get(str);
    Object localObject;
    if (localE != null) {
      localObject = c;
    } else {
      localObject = null;
    }
    if (localObject != null)
    {
      localObject = a;
      if (((ArrayList)localObject).contains(str))
      {
        c.a(b.a(paramIntent, paramInt2));
        ((ArrayList)localObject).remove(str);
        break label139;
      }
    }
    m.remove(str);
    paramIntent = new ActivityResult(paramIntent, paramInt2);
    b.putParcelable(str, paramIntent);
    label139:
    return true;
  }
  
  public final void add(String paramString)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
}
