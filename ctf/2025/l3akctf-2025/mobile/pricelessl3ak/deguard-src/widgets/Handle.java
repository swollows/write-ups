package widgets;

import java.io.Serializable;
import params.Log;

public final class Handle
  implements Serializable
{
  public final Throwable d;
  
  public Handle(Throwable paramThrowable)
  {
    d = paramThrowable;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Handle))
    {
      paramObject = d;
      if (Log.equals(d, paramObject)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return d.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Failure(");
    localStringBuilder.append(d);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}
