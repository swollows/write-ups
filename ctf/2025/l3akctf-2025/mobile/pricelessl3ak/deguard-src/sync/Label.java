package sync;

import android.os.LocaleList;
import java.util.Locale;

public final class Label
{
  public static final Label c = new Label(new Type(new LocaleList(new Locale[0])));
  public final Type d;
  
  public Label(Type paramType)
  {
    d = paramType;
  }
  
  public static Label a(String paramString)
  {
    if ((paramString != null) && (!paramString.isEmpty()))
    {
      paramString = paramString.split(",", -1);
      int j = paramString.length;
      Locale[] arrayOfLocale = new Locale[j];
      int i = 0;
      while (i < j)
      {
        String str = paramString[i];
        int k = c.d;
        arrayOfLocale[i] = Locale.forLanguageTag(str);
        i += 1;
      }
      return new Label(new Type(new LocaleList(arrayOfLocale)));
    }
    return c;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Label))
    {
      paramObject = d;
      if (d.equals(paramObject)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return d.c.hashCode();
  }
  
  public final String toString()
  {
    return d.c.toString();
  }
}
