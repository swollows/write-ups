package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ActivityChooserView$InnerLayout extends LinearLayout {
   public static final int[] a = new int[]{16842964};

   public ActivityChooserView$InnerLayout(Context var1, AttributeSet var2) {
      Drawable var4;
      TypedArray var5;
      label12: {
         super(var1, var2);
         var5 = var1.obtainStyledAttributes(var2, a);
         if (var5.hasValue(0)) {
            int var3 = var5.getResourceId(0, 0);
            if (var3 != 0) {
               var4 = C.b.n(var1, var3);
               break label12;
            }
         }

         var4 = var5.getDrawable(0);
      }

      this.setBackgroundDrawable(var4);
      var5.recycle();
   }
}
