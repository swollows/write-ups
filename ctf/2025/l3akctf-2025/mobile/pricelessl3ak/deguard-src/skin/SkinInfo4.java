package skin;

import params.Log;

public abstract class SkinInfo4
  extends SkinInfo
{
  public static String canonicalPath(String paramString)
  {
    Log.get(paramString, "<this>");
    Log.get(paramString, "missingDelimiterValue");
    int i = paramString.lastIndexOf('.', paramString.length() - 1);
    if (i == -1) {
      return paramString;
    }
    paramString = paramString.substring(i + 1, paramString.length());
    Log.append(paramString, "substring(...)");
    return paramString;
  }
}
