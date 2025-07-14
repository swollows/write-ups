package handle;

import java.util.LinkedHashMap;
import params.Log;

public abstract class Handle
{
  public final LinkedHashMap c = new LinkedHashMap();
  
  public Handle() {}
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof Handle)) && (Log.equals(c, c));
  }
  
  public final int hashCode()
  {
    return c.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("CreationExtras(extras=");
    localStringBuilder.append(c);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}
