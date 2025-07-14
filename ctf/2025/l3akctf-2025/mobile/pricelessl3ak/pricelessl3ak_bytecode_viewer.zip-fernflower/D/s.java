package D;

import android.util.Log;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;

public final class s {
   public ViewParent a;
   public ViewParent b;
   public final NestedScrollView c;
   public boolean d;
   public int[] e;

   public s(NestedScrollView var1) {
      this.c = var1;
   }

   public final boolean a(float var1, float var2) {
      boolean var5 = this.d;
      boolean var4 = false;
      boolean var3 = var4;
      if (var5) {
         ViewParent var6 = this.c(0);
         var3 = var4;
         if (var6 != null) {
            NestedScrollView var7 = this.c;

            try {
               var3 = var6.onNestedPreFling(var7, var1, var2);
            } catch (AbstractMethodError var9) {
               StringBuilder var8 = new StringBuilder("ViewParent ");
               var8.append(var6);
               var8.append(" does not implement interface method onNestedPreFling");
               Log.e("ViewParentCompat", var8.toString(), var9);
               var3 = var4;
            }
         }
      }

      return var3;
   }

   public final boolean b(int var1, int var2, int var3, int var4, int[] var5, int var6, int[] var7) {
      if (this.d) {
         ViewParent var11 = this.c(var6);
         if (var11 == null) {
            return false;
         }

         if (var1 != 0 || var2 != 0 || var3 != 0 || var4 != 0) {
            NestedScrollView var10 = this.c;
            int var8;
            int var9;
            if (var5 != null) {
               var10.getLocationInWindow(var5);
               var9 = var5[0];
               var8 = var5[1];
            } else {
               var9 = 0;
               var8 = 0;
            }

            if (var7 == null) {
               if (this.e == null) {
                  this.e = new int[2];
               }

               var7 = this.e;
               var7[0] = 0;
               var7[1] = 0;
            }

            if (var11 instanceof u) {
               ((u)var11).d(var10, var1, var2, var3, var4, var6, var7);
            } else {
               var7[0] += var3;
               var7[1] += var4;
               if (var11 instanceof t) {
                  ((t)var11).e(var10, var1, var2, var3, var4, var6);
               } else if (var6 == 0) {
                  try {
                     var11.onNestedScroll(var10, var1, var2, var3, var4);
                  } catch (AbstractMethodError var13) {
                     StringBuilder var14 = new StringBuilder("ViewParent ");
                     var14.append(var11);
                     var14.append(" does not implement interface method onNestedScroll");
                     Log.e("ViewParentCompat", var14.toString(), var13);
                  }
               }
            }

            if (var5 != null) {
               var10.getLocationInWindow(var5);
               var5[0] -= var9;
               var5[1] -= var8;
            }

            return true;
         }

         if (var5 != null) {
            var5[0] = 0;
            var5[1] = 0;
         }
      }

      return false;
   }

   public final ViewParent c(int var1) {
      if (var1 != 0) {
         return var1 != 1 ? null : this.b;
      } else {
         return this.a;
      }
   }
}
