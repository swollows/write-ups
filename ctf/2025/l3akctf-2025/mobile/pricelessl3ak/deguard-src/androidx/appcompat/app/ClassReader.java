package androidx.appcompat.app;

import android.app.LocaleManager;
import android.os.LocaleList;

public abstract class ClassReader
{
  public static void a(Object paramObject, LocaleList paramLocaleList)
  {
    ((LocaleManager)paramObject).setApplicationLocales(paramLocaleList);
  }
  
  public static LocaleList accept(Object paramObject)
  {
    return ((LocaleManager)paramObject).getApplicationLocales();
  }
}
