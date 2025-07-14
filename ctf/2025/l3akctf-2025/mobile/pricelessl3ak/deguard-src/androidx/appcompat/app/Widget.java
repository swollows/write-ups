package androidx.appcompat.app;

import android.content.res.Configuration;
import android.os.LocaleList;
import sync.Label;
import sync.Type;

public abstract class Widget
{
  public static Label a(Configuration paramConfiguration)
  {
    return Label.a(paramConfiguration.getLocales().toLanguageTags());
  }
  
  public static void a(Configuration paramConfiguration, Label paramLabel)
  {
    paramConfiguration.setLocales(LocaleList.forLanguageTags(d.c.toLanguageTags()));
  }
  
  public static void a(Label paramLabel)
  {
    LocaleList.setDefault(LocaleList.forLanguageTags(d.c.toLanguageTags()));
  }
  
  public static void setLocale(Configuration paramConfiguration1, Configuration paramConfiguration2, Configuration paramConfiguration3)
  {
    paramConfiguration1 = paramConfiguration1.getLocales();
    LocaleList localLocaleList = paramConfiguration2.getLocales();
    if (!paramConfiguration1.equals(localLocaleList))
    {
      paramConfiguration3.setLocales(localLocaleList);
      locale = locale;
    }
  }
}
