package androidx.appcompat.widget;

import android.os.LocaleList;
import android.widget.TextView;

public abstract class Plugins
{
  public static LocaleList getString(String paramString)
  {
    return LocaleList.forLanguageTags(paramString);
  }
  
  public static void measureText(TextView paramTextView, LocaleList paramLocaleList)
  {
    paramTextView.setTextLocales(paramLocaleList);
  }
}
