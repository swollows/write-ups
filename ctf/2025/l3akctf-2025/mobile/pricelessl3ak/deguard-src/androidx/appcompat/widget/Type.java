package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class Type
{
  public Type(ClassWriter paramClassWriter, int paramInt1, int paramInt2, WeakReference paramWeakReference)
  {
    b = paramClassWriter;
    c = paramInt1;
    d = paramInt2;
    a = paramWeakReference;
  }
  
  public final void a(Typeface paramTypeface)
  {
    Typeface localTypeface = paramTypeface;
    if (Build.VERSION.SDK_INT >= 28)
    {
      int i = c;
      localTypeface = paramTypeface;
      if (i != -1)
      {
        boolean bool;
        if ((d & 0x2) != 0) {
          bool = true;
        } else {
          bool = false;
        }
        localTypeface = AtomicBoolean.get(paramTypeface, i, bool);
      }
    }
    paramTypeface = b;
    if (p)
    {
      t = localTypeface;
      TextView localTextView = (TextView)a.get();
      if (localTextView != null)
      {
        if (localTextView.isAttachedToWindow())
        {
          localTextView.post(new Proxy(localTextView, localTypeface, e));
          return;
        }
        localTextView.setTypeface(localTypeface, e);
      }
    }
  }
  
  public final void create()
  {
    new Handler(Looper.getMainLooper()).post(new asm.Type(5, this));
  }
}
