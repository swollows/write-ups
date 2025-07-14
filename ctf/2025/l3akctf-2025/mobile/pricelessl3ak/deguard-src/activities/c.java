package activities;

import android.os.Looper;

public abstract class c
{
  public static final long h;
  
  static
  {
    try
    {
      l = Looper.getMainLooper().getThread().getId();
    }
    catch (Exception localException)
    {
      long l;
      for (;;) {}
    }
    l = -1L;
    h = l;
  }
}
