package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

public class k0 extends m0 {
   public void a(StaticLayout.Builder var1, TextView var2) {
      var1.setTextDirection((TextDirectionHeuristic)n0.e(var2, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
   }
}
