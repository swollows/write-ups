package app;

import Client.Util;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

public class TLongArrayStack
  extends RC2WrapEngine
{
  public TLongArrayStack(TypeToken paramTypeToken, WindowInsets paramWindowInsets)
  {
    super(paramTypeToken, paramWindowInsets);
  }
  
  public TypeToken equals()
  {
    return TypeToken.get(Util.onApplyWindowInsets(mSource), null);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof TLongArrayStack)) {
      return false;
    }
    paramObject = (TLongArrayStack)paramObject;
    WindowInsets localWindowInsets = mSource;
    return (Objects.equals(mSource, localWindowInsets)) && (Objects.equals(map, map)) && (IntArray.get(size, size));
  }
  
  public int hashCode()
  {
    return mSource.hashCode();
  }
  
  public Buffer peek()
  {
    DisplayCutout localDisplayCutout = Util.getQueue(mSource);
    if (localDisplayCutout == null) {
      return null;
    }
    return new Buffer(localDisplayCutout);
  }
}
