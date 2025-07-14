package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

public class AlertController$RecycleListView extends ListView {
   public final int a;
   public final int b;

   public AlertController$RecycleListView(Context var1, AttributeSet var2) {
      super(var1, var2);
      TypedArray var3 = var1.obtainStyledAttributes(var2, g.a.t);
      this.b = var3.getDimensionPixelOffset(0, -1);
      this.a = var3.getDimensionPixelOffset(1, -1);
   }
}
