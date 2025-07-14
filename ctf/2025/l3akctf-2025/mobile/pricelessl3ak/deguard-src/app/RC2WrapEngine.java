package app;

import android.view.WindowInsets;
import util.Headers;

public class RC2WrapEngine
  extends IntArray
{
  public Headers mSource = null;
  
  public RC2WrapEngine(TypeToken paramTypeToken, WindowInsets paramWindowInsets)
  {
    super(paramTypeToken, paramWindowInsets);
  }
  
  public TypeToken get()
  {
    return TypeToken.get(mSource.consumeSystemWindowInsets(), null);
  }
  
  public void init(Headers paramHeaders)
  {
    mSource = paramHeaders;
  }
  
  public boolean isEmpty()
  {
    return mSource.isConsumed();
  }
  
  public final Headers unwrap()
  {
    if (mSource == null)
    {
      WindowInsets localWindowInsets = mSource;
      mSource = Headers.set(localWindowInsets.getStableInsetLeft(), localWindowInsets.getStableInsetTop(), localWindowInsets.getStableInsetRight(), localWindowInsets.getStableInsetBottom());
    }
    return mSource;
  }
  
  public TypeToken wrap()
  {
    return TypeToken.get(mSource.consumeStableInsets(), null);
  }
}
