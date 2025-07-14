package ui;

import android.window.BackEvent;

public final class b
{
  public final float a;
  public final int b;
  public final float g;
  public final float h;
  
  public b(BackEvent paramBackEvent)
  {
    g = f1;
    h = f2;
    a = f3;
    b = i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("BackEventCompat{touchX=");
    localStringBuilder.append(g);
    localStringBuilder.append(", touchY=");
    localStringBuilder.append(h);
    localStringBuilder.append(", progress=");
    localStringBuilder.append(a);
    localStringBuilder.append(", swipeEdge=");
    localStringBuilder.append(b);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}
