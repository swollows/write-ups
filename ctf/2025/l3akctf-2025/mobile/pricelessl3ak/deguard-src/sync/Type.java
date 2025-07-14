package sync;

import android.os.LocaleList;

public final class Type
{
  public final LocaleList c;
  
  public Type(LocaleList paramLocaleList)
  {
    c = paramLocaleList;
  }
  
  public final boolean equals(Object paramObject)
  {
    paramObject = c;
    return c.equals(paramObject);
  }
  
  public final int hashCode()
  {
    return c.hashCode();
  }
  
  public final String toString()
  {
    return c.toString();
  }
}
