package androidx.fragment.asm;

import android.util.Log;
import java.io.Writer;

public final class LogWriter
  extends Writer
{
  public final StringBuilder a = new StringBuilder(128);
  public final String x = "FragmentManager";
  
  public LogWriter() {}
  
  public final void close()
  {
    write();
  }
  
  public final void flush()
  {
    write();
  }
  
  public final void write()
  {
    StringBuilder localStringBuilder = a;
    if (localStringBuilder.length() > 0)
    {
      Log.d(x, localStringBuilder.toString());
      localStringBuilder.delete(0, localStringBuilder.length());
    }
  }
  
  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = 0;
    while (i < paramInt2)
    {
      char c = paramArrayOfChar[(paramInt1 + i)];
      if (c == '\n') {
        write();
      } else {
        a.append(c);
      }
      i += 1;
    }
  }
}
