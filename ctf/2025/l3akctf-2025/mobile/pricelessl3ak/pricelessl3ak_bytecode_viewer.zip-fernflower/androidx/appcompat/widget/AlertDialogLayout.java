package androidx.appcompat.widget;

import D.T;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import java.util.WeakHashMap;

public class AlertDialogLayout extends D0 {
   public AlertDialogLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public static int i(View var0) {
      WeakHashMap var2 = T.a;
      int var1 = var0.getMinimumHeight();
      if (var1 > 0) {
         return var1;
      } else {
         if (var0 instanceof ViewGroup) {
            ViewGroup var3 = (ViewGroup)var0;
            if (var3.getChildCount() == 1) {
               return i(var3.getChildAt(0));
            }
         }

         return 0;
      }
   }

   public final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      int var7 = this.getPaddingLeft();
      int var11 = var4 - var2;
      int var9 = this.getPaddingRight();
      int var10 = this.getPaddingRight();
      var2 = this.getMeasuredHeight();
      int var8 = this.getChildCount();
      int var12 = this.getGravity();
      var4 = var12 & 112;
      if (var4 != 16) {
         if (var4 != 80) {
            var2 = this.getPaddingTop();
         } else {
            var2 = this.getPaddingTop() + var5 - var3 - var2;
         }
      } else {
         var4 = this.getPaddingTop();
         var2 = (var5 - var3 - var2) / 2 + var4;
      }

      Drawable var15 = this.getDividerDrawable();
      var4 = 0;
      if (var15 == null) {
         var3 = 0;
      } else {
         var3 = var15.getIntrinsicHeight();
      }

      while(var4 < var8) {
         View var16 = this.getChildAt(var4);
         var5 = var2;
         if (var16 != null) {
            var5 = var2;
            if (var16.getVisibility() != 8) {
               int var14 = var16.getMeasuredWidth();
               int var13 = var16.getMeasuredHeight();
               C0 var17 = (C0)var16.getLayoutParams();
               int var6 = var17.gravity;
               var5 = var6;
               if (var6 < 0) {
                  var5 = var12 & 8388615;
               }

               label46: {
                  var5 = Gravity.getAbsoluteGravity(var5, this.getLayoutDirection()) & 7;
                  if (var5 != 1) {
                     if (var5 != 5) {
                        var5 = var17.leftMargin + var7;
                        break label46;
                     }

                     var5 = var11 - var9 - var14;
                     var6 = var17.rightMargin;
                  } else {
                     var5 = (var11 - var7 - var10 - var14) / 2 + var7 + var17.leftMargin;
                     var6 = var17.rightMargin;
                  }

                  var5 -= var6;
               }

               var6 = var2;
               if (this.h(var4)) {
                  var6 = var2 + var3;
               }

               var2 = var6 + var17.topMargin;
               var16.layout(var5, var2, var14 + var5, var2 + var13);
               var5 = var13 + var17.bottomMargin + var2;
            }
         }

         ++var4;
         var2 = var5;
      }

   }

   public final void onMeasure(int var1, int var2) {
      int var12 = this.getChildCount();
      View var18 = null;
      View var17 = null;
      View var16 = null;
      int var3 = 0;

      while(true) {
         int var4;
         View var15;
         if (var3 >= var12) {
            int var14 = MeasureSpec.getMode(var2);
            int var7 = MeasureSpec.getSize(var2);
            int var13 = MeasureSpec.getMode(var1);
            var3 = this.getPaddingTop();
            int var5 = this.getPaddingBottom() + var3;
            if (var18 != null) {
               var18.measure(var1, 0);
               var5 += var18.getMeasuredHeight();
               var4 = View.combineMeasuredStates(0, var18.getMeasuredState());
            } else {
               var4 = 0;
            }

            int var9;
            if (var17 != null) {
               var17.measure(var1, 0);
               var3 = i(var17);
               var9 = var17.getMeasuredHeight() - var3;
               var5 += var3;
               var4 = View.combineMeasuredStates(var4, var17.getMeasuredState());
            } else {
               var3 = 0;
               var9 = 0;
            }

            int var6;
            int var8;
            if (var16 != null) {
               if (var14 == 0) {
                  var6 = 0;
               } else {
                  var6 = MeasureSpec.makeMeasureSpec(Math.max(0, var7 - var5), var14);
               }

               var16.measure(var1, var6);
               var8 = var16.getMeasuredHeight();
               var5 += var8;
               var4 = View.combineMeasuredStates(var4, var16.getMeasuredState());
            } else {
               var8 = 0;
            }

            int var11 = var7 - var5;
            var7 = var4;
            int var10 = var11;
            var6 = var5;
            if (var17 != null) {
               var9 = Math.min(var11, var9);
               var7 = var11;
               var6 = var3;
               if (var9 > 0) {
                  var7 = var11 - var9;
                  var6 = var3 + var9;
               }

               var17.measure(var1, MeasureSpec.makeMeasureSpec(var6, 1073741824));
               var6 = var5 - var3 + var17.getMeasuredHeight();
               var3 = View.combineMeasuredStates(var4, var17.getMeasuredState());
               var10 = var7;
               var7 = var3;
            }

            var4 = var7;
            var3 = var6;
            if (var16 != null) {
               var4 = var7;
               var3 = var6;
               if (var10 > 0) {
                  var16.measure(var1, MeasureSpec.makeMeasureSpec(var8 + var10, var14));
                  var3 = var6 - var8 + var16.getMeasuredHeight();
                  var4 = View.combineMeasuredStates(var7, var16.getMeasuredState());
               }
            }

            var6 = 0;

            for(var5 = 0; var6 < var12; var5 = var7) {
               var15 = this.getChildAt(var6);
               var7 = var5;
               if (var15.getVisibility() != 8) {
                  var7 = Math.max(var5, var15.getMeasuredWidth());
               }

               ++var6;
            }

            var6 = this.getPaddingLeft();
            this.setMeasuredDimension(View.resolveSizeAndState(this.getPaddingRight() + var6 + var5, var1, var4), View.resolveSizeAndState(var3, var2, 0));
            if (var13 != 1073741824) {
               var3 = MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);

               for(var1 = 0; var1 < var12; ++var1) {
                  var16 = this.getChildAt(var1);
                  if (var16.getVisibility() != 8) {
                     C0 var19 = (C0)var16.getLayoutParams();
                     if (var19.width == -1) {
                        var4 = var19.height;
                        var19.height = var16.getMeasuredHeight();
                        this.measureChildWithMargins(var16, var3, 0, var2, 0);
                        var19.height = var4;
                     }
                  }
               }
            }
            break;
         }

         var15 = this.getChildAt(var3);
         if (var15.getVisibility() != 8) {
            var4 = var15.getId();
            if (var4 == 2131230901) {
               var18 = var15;
            } else if (var4 == 2131230786) {
               var17 = var15;
            } else {
               if (var4 != 2131230796 && var4 != 2131230798 || var16 != null) {
                  super.onMeasure(var1, var2);
                  break;
               }

               var16 = var15;
            }
         }

         ++var3;
      }

   }
}
