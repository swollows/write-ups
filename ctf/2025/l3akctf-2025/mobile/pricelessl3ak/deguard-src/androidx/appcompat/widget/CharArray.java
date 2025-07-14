package androidx.appcompat.widget;

import android.text.StaticLayout.Builder;
import android.widget.TextView;

public abstract class CharArray
{
  public CharArray() {}
  
  public abstract void add(StaticLayout.Builder paramBuilder, TextView paramTextView);
  
  public boolean add(TextView paramTextView)
  {
    return ((Boolean)f.a(paramTextView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
  }
}
