package j;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

public final class p extends FrameLayout implements i.c {
   public final CollapsibleActionView a;

   public p(View var1) {
      super(var1.getContext());
      this.a = (CollapsibleActionView)var1;
      this.addView(var1);
   }
}
