package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

public final class b extends Drawable {
   public final ActionBarContainer a;

   public b(ActionBarContainer var1) {
      this.a = var1;
   }

   public final void draw(Canvas var1) {
      ActionBarContainer var2 = this.a;
      if (var2.g) {
         Drawable var4 = var2.f;
         if (var4 != null) {
            var4.draw(var1);
         }
      } else {
         Drawable var3 = var2.d;
         if (var3 != null) {
            var3.draw(var1);
         }

         var3 = var2.e;
         if (var3 != null && var2.h) {
            var3.draw(var1);
         }
      }

   }

   public final int getOpacity() {
      return 0;
   }

   public final void getOutline(Outline var1) {
      ActionBarContainer var2 = this.a;
      if (var2.g) {
         if (var2.f != null) {
            var2.d.getOutline(var1);
         }
      } else {
         Drawable var3 = var2.d;
         if (var3 != null) {
            var3.getOutline(var1);
         }
      }

   }

   public final void setAlpha(int var1) {
   }

   public final void setColorFilter(ColorFilter var1) {
   }
}
