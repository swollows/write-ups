package views;

import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Trace;
import http.AbstractMultimap;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public abstract class ClassWriter
{
  public static final AbstractMultimap c;
  public static final http.Label k;
  public static final ThreadPoolExecutor pool;
  public static final Object v;
  
  static
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static String a(List paramList, int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < paramList.size())
    {
      localStringBuilder.append(getd);
      localStringBuilder.append("-");
      localStringBuilder.append(paramInt);
      if (i < paramList.size() - 1) {
        localStringBuilder.append(";");
      }
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public static Type a(String paramString, android.content.Context paramContext, List paramList, int paramInt)
  {
    drupal.Context.add("getFontSync");
    http.Label localLabel = k;
    Object localObject;
    try
    {
      localObject = (Typeface)localLabel.add(paramString);
      if (localObject != null)
      {
        paramString = new Type((Typeface)localObject);
        Trace.endSection();
        return paramString;
      }
    }
    catch (Throwable paramString) {}
    try
    {
      paramList = Frame.get(paramContext, paramList);
      int i = a;
      paramList = (List)b;
      if (i != 0)
      {
        if (i != 1) {
          i = -3;
        } else {
          i = -2;
        }
      }
      else
      {
        localObject = (Item[])paramList.get(0);
        if (localObject != null)
        {
          i = localObject.length;
          if (i != 0)
          {
            int m = localObject.length;
            i = 0;
            for (;;)
            {
              if (i >= m) {
                break label174;
              }
              int j = i;
              if (j != 0)
              {
                if (j < 0) {
                  break;
                }
                i = j;
                break label183;
              }
              i += 1;
            }
            label174:
            i = 0;
            break label183;
          }
        }
        i = 1;
      }
      label183:
      if (i != 0)
      {
        paramString = new Type(i);
        Trace.endSection();
        return paramString;
      }
      i = paramList.size();
      if (i > 1)
      {
        i = Build.VERSION.SDK_INT;
        if (i >= 29)
        {
          localObject = util.Type.a;
          drupal.Context.add("TypefaceCompat.createFromFontInfoWithFallback");
          try
          {
            paramContext = util.Type.a.a(paramContext, paramList, paramInt);
            Trace.endSection();
          }
          catch (Throwable paramString)
          {
            Trace.endSection();
            throw paramString;
          }
        }
      }
      paramList = (Item[])paramList.get(0);
      localObject = util.Type.a;
      drupal.Context.add("TypefaceCompat.createFromFontInfo");
      try
      {
        paramContext = util.Type.a.read(paramContext, paramList, paramInt);
        Trace.endSection();
        if (paramContext != null)
        {
          localLabel.add(paramString, paramContext);
          paramString = new Type(paramContext);
          Trace.endSection();
          return paramString;
        }
        paramString = new Type(-3);
        Trace.endSection();
        return paramString;
      }
      catch (Throwable paramString)
      {
        Trace.endSection();
        throw paramString;
      }
    }
    catch (PackageManager.NameNotFoundException paramString)
    {
      for (;;) {}
    }
    paramString = new Type(-1);
    Trace.endSection();
    return paramString;
    Trace.endSection();
    throw paramString;
  }
}
