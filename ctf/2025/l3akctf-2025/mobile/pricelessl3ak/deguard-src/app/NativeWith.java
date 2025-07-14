package app;

import android.view.WindowInsets;
import util.Headers;

public class NativeWith
  extends TLongArrayStack
{
  public NativeWith(TypeToken paramTypeToken, WindowInsets paramWindowInsets)
  {
    super(paramTypeToken, paramWindowInsets);
  }
  
  public TypeToken get(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return TypeToken.get(Log.onApplyWindowInsets(mSource, paramInt1, paramInt2, paramInt3, paramInt4), null);
  }
  
  public void init(Headers paramHeaders) {}
}
