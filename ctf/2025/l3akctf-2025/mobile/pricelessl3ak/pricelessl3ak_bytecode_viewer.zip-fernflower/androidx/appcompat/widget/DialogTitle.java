package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;

public class DialogTitle extends i0 {
   public DialogTitle(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public final void onMeasure(int var1, int var2) {
      super.onMeasure(var1, var2);
      Layout var4 = this.getLayout();
      if (var4 != null) {
         int var3 = var4.getLineCount();
         if (var3 > 0 && var4.getEllipsisCount(var3 - 1) > 0) {
            this.setSingleLine(false);
            this.setMaxLines(2);
            TypedArray var5 = this.getContext().obtainStyledAttributes((AttributeSet)null, g.a.v, 16842817, 16973892);
            var3 = var5.getDimensionPixelSize(0, 0);
            if (var3 != 0) {
               this.setTextSize(0, (float)var3);
            }

            var5.recycle();
            super.onMeasure(var1, var2);
         }
      }

   }
}
