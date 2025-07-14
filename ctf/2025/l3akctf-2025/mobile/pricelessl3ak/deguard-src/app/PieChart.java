package app;

import android.os.Build.VERSION;
import androidx.core.widget.NestedScrollView;

public final class PieChart
{
  public final NumberPicker.Formatter a;
  
  public PieChart(NestedScrollView paramNestedScrollView)
  {
    if (Build.VERSION.SDK_INT >= 35)
    {
      a = new NumberPicker.1(paramNestedScrollView);
      return;
    }
    a = new Element(0);
  }
}
