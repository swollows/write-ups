package androidx.appcompat.widget;

import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

public class Complex
  extends CharArray
{
  public Complex() {}
  
  public void add(StaticLayout.Builder paramBuilder, TextView paramTextView)
  {
    paramBuilder.setTextDirection((TextDirectionHeuristic)f.a(paramTextView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
  }
}
