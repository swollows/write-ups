package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public final class k extends E implements n {
   public final m d;

   public k(m var1, Context var2) {
      super(var2, (AttributeSet)null, 2130903071);
      this.d = var1;
      this.setClickable(true);
      this.setFocusable(true);
      this.setVisibility(0);
      this.setEnabled(true);
      C.b.H(this, this.getContentDescription());
      this.setOnTouchListener(new j(this, this));
   }

   public final boolean a() {
      return false;
   }

   public final boolean b() {
      return false;
   }

   public final boolean performClick() {
      if (super.performClick()) {
         return true;
      } else {
         this.playSoundEffect(0);
         this.d.l();
         return true;
      }
   }

   public final boolean setFrame(int var1, int var2, int var3, int var4) {
      boolean var8 = super.setFrame(var1, var2, var3, var4);
      Drawable var10 = this.getDrawable();
      Drawable var9 = this.getBackground();
      if (var10 != null && var9 != null) {
         int var6 = this.getWidth();
         var2 = this.getHeight();
         var1 = Math.max(var6, var2) / 2;
         int var5 = this.getPaddingLeft();
         int var7 = this.getPaddingRight();
         var4 = this.getPaddingTop();
         var3 = this.getPaddingBottom();
         var5 = (var6 + (var5 - var7)) / 2;
         var2 = (var2 + (var4 - var3)) / 2;
         var9.setHotspotBounds(var5 - var1, var2 - var1, var5 + var1, var2 + var1);
      }

      return var8;
   }
}
