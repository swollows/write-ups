package androidx.appcompat.widget;

import android.text.StaticLayout.Builder;
import android.widget.TextView;
import app.Log;

public final class QEAbstract
  extends Complex
{
  public QEAbstract() {}
  
  public void add(StaticLayout.Builder paramBuilder, TextView paramTextView)
  {
    paramBuilder.setTextDirection(Log.log(paramTextView));
  }
  
  public boolean add(TextView paramTextView)
  {
    return Log.set(paramTextView);
  }
}
