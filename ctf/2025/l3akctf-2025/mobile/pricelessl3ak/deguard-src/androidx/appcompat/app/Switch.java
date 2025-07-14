package androidx.appcompat.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import http.AbstractMultimap;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;

public final class Switch
{
  public static final int[] b = { 16843375 };
  public static final int[] c = { 16844160 };
  public static final int[] f = { 16844156 };
  public static final Class[] g = { Context.class, AttributeSet.class };
  public static final int[] h = { 16844148 };
  public static final String[] i = { "android.widget.", "android.view.", "android.webkit." };
  public static final AbstractMultimap m = new AbstractMultimap(0);
  public final Object[] a = new Object[2];
  
  public Switch() {}
  
  public final View get(Context paramContext, String paramString1, String paramString2)
  {
    AbstractMultimap localAbstractMultimap = m;
    Constructor localConstructor = (Constructor)localAbstractMultimap.get(paramString1);
    Object localObject = localConstructor;
    if ((localConstructor != null) || (paramString2 != null)) {}
    try
    {
      paramString2 = paramString2.concat(paramString1);
      break label40;
      paramString2 = paramString1;
      label40:
      paramContext = Class.forName(paramString2, false, paramContext.getClassLoader()).asSubclass(View.class);
      paramString2 = g;
      paramContext = paramContext.getConstructor(paramString2);
      localObject = paramContext;
      localAbstractMultimap.put(paramString1, paramContext);
      ((AccessibleObject)localObject).setAccessible(true);
      paramContext = a;
      paramContext = ((Constructor)localObject).newInstance(paramContext);
      return (View)paramContext;
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
    return null;
  }
}
