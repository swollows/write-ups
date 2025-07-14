package androidx.appcompat.app;

import android.os.LocaleList;

public abstract class Util
{
  public static LocaleList toBase64(String paramString)
  {
    return LocaleList.forLanguageTags(paramString);
  }
}
