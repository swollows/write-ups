package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.widget.TextView;

public abstract class m0 {
   public abstract void a(StaticLayout.Builder var1, TextView var2);

   public boolean b(TextView var1) {
      return (Boolean)n0.e(var1, "getHorizontallyScrolling", Boolean.FALSE);
   }
}
