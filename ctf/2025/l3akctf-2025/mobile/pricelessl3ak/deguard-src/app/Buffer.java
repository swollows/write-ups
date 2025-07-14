package app;

import Client.Util;
import D.k;
import android.view.DisplayCutout;
import java.util.Objects;

public final class Buffer
{
  public final DisplayCutout offset;
  
  public Buffer(DisplayCutout paramDisplayCutout)
  {
    offset = paramDisplayCutout;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (k.class == paramObject.getClass()))
    {
      paramObject = (Buffer)paramObject;
      return Objects.equals(offset, offset);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Util.hash(offset);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("DisplayCutoutCompat{");
    localStringBuilder.append(offset);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}
