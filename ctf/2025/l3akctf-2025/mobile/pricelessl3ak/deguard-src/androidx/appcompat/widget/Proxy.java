package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

public final class Proxy
  implements Runnable
{
  public Proxy(TextView paramTextView, Typeface paramTypeface, int paramInt)
  {
    url = paramTextView;
    username = paramTypeface;
    title = paramInt;
  }
  
  public final void run()
  {
    Typeface localTypeface = username;
    int i = title;
    url.setTypeface(localTypeface, i);
  }
}
