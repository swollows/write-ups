package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout {
   public FitWindowsLinearLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public final boolean fitSystemWindows(Rect var1) {
      return super.fitSystemWindows(var1);
   }

   public void setOnFitSystemWindowsListener(z0 var1) {
   }
}
