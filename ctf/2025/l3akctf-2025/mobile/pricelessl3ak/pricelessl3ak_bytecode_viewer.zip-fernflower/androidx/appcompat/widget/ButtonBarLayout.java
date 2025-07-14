package androidx.appcompat.widget;

import D.T;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import java.util.WeakHashMap;

public class ButtonBarLayout extends LinearLayout {
   public boolean a;
   public boolean b;
   public int c = -1;

   public ButtonBarLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
      int[] var4 = g.a.k;
      TypedArray var3 = var1.obtainStyledAttributes(var2, var4);
      T.h(this, var1, var4, var2, var3, 0);
      this.a = var3.getBoolean(0, true);
      var3.recycle();
      if (this.getOrientation() == 1) {
         this.setStacked(this.a);
      }

   }

   private void setStacked(boolean var1) {
      if (this.b != var1 && (var1 == 0 || this.a)) {
         this.b = (boolean)var1;
         this.setOrientation(var1);
         int var2;
         if (var1 != 0) {
            var2 = 8388613;
         } else {
            var2 = 80;
         }

         this.setGravity(var2);
         View var3 = this.findViewById(2131230868);
         if (var3 != null) {
            if (var1 != 0) {
               var1 = 8;
            } else {
               var1 = 4;
            }

            var3.setVisibility(var1);
         }

         for(var1 = this.getChildCount() - 2; var1 >= 0; --var1) {
            this.bringChildToFront(this.getChildAt(var1));
         }
      }

   }

   public final void onMeasure(int var1, int var2) {
      int var3 = MeasureSpec.getSize(var1);
      boolean var8 = this.a;
      int var5 = 0;
      if (var8) {
         if (var3 > this.c && this.b) {
            this.setStacked(false);
         }

         this.c = var3;
      }

      int var4;
      boolean var11;
      if (!this.b && MeasureSpec.getMode(var1) == 1073741824) {
         var4 = MeasureSpec.makeMeasureSpec(var3, Integer.MIN_VALUE);
         var11 = true;
      } else {
         var4 = var1;
         var11 = false;
      }

      super.onMeasure(var4, var2);
      boolean var12 = var11;
      if (this.a) {
         var12 = var11;
         if (!this.b) {
            var12 = var11;
            if ((this.getMeasuredWidthAndState() & -16777216) == 16777216) {
               this.setStacked(true);
               var12 = true;
            }
         }
      }

      if (var12) {
         super.onMeasure(var1, var2);
      }

      var4 = this.getChildCount();
      var3 = 0;

      byte var6;
      while(true) {
         var6 = -1;
         if (var3 >= var4) {
            var4 = -1;
            break;
         }

         if (this.getChildAt(var3).getVisibility() == 0) {
            var4 = var3;
            break;
         }

         ++var3;
      }

      var3 = var5;
      if (var4 >= 0) {
         View var10 = this.getChildAt(var4);
         LinearLayout.LayoutParams var9 = (LinearLayout.LayoutParams)var10.getLayoutParams();
         var3 = this.getPaddingTop();
         var5 = var10.getMeasuredHeight() + var3 + var9.topMargin + var9.bottomMargin;
         if (this.b) {
            var3 = var4 + 1;
            int var7 = this.getChildCount();

            while(true) {
               var4 = var6;
               if (var3 >= var7) {
                  break;
               }

               if (this.getChildAt(var3).getVisibility() == 0) {
                  var4 = var3;
                  break;
               }

               ++var3;
            }

            if (var4 >= 0) {
               var3 = this.getChildAt(var4).getPaddingTop() + (int)(this.getResources().getDisplayMetrics().density * 16.0F) + var5;
            } else {
               var3 = var5;
            }
         } else {
            var3 = this.getPaddingBottom() + var5;
         }
      }

      WeakHashMap var13 = T.a;
      if (this.getMinimumHeight() != var3) {
         this.setMinimumHeight(var3);
         if (var2 == 0) {
            super.onMeasure(var1, var2);
         }
      }

   }

   public void setAllowStacking(boolean var1) {
      if (this.a != var1) {
         this.a = var1;
         if (!var1 && this.b) {
            this.setStacked(false);
         }

         this.requestLayout();
      }

   }
}
