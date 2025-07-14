package J;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

public final class j implements TransformationMethod {
   public final TransformationMethod a;

   public j(TransformationMethod var1) {
      this.a = var1;
   }

   public final CharSequence getTransformation(CharSequence var1, View var2) {
      if (var2.isInEditMode()) {
         return var1;
      } else {
         TransformationMethod var4 = this.a;
         CharSequence var3 = var1;
         if (var4 != null) {
            var3 = var4.getTransformation(var1, var2);
         }

         var1 = var3;
         if (var3 != null) {
            if (H.j.a().b() != 1) {
               var1 = var3;
            } else {
               H.j var5 = H.j.a();
               var5.getClass();
               var1 = var5.e(var3, 0, var3.length());
            }
         }

         return var1;
      }
   }

   public final void onFocusChanged(View var1, CharSequence var2, boolean var3, int var4, Rect var5) {
      TransformationMethod var6 = this.a;
      if (var6 != null) {
         var6.onFocusChanged(var1, var2, var3, var4, var5);
      }

   }
}
