package androidx.appcompat.widget;

import D.T;
import D.U;
import D.V;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;

public final class o1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
   public static o1 k;
   public static o1 l;
   public final View a;
   public final CharSequence b;
   public final int c;
   public final n1 d = new n1(this, 0);
   public final n1 e = new n1(this, 1);
   public int f;
   public int g;
   public p1 h;
   public boolean i;
   public boolean j;

   public o1(View var1, CharSequence var2) {
      this.a = var1;
      this.b = var2;
      ViewConfiguration var4 = ViewConfiguration.get(var1.getContext());
      int var3 = V.a;
      if (VERSION.SDK_INT >= 28) {
         var3 = U.c(var4);
      } else {
         var3 = var4.getScaledTouchSlop() / 2;
      }

      this.c = var3;
      this.j = true;
      var1.setOnLongClickListener(this);
      var1.setOnHoverListener(this);
   }

   public static void b(o1 var0) {
      o1 var3 = k;
      if (var3 != null) {
         n1 var4 = var3.d;
         var3.a.removeCallbacks(var4);
      }

      k = var0;
      if (var0 != null) {
         n1 var5 = var0.d;
         long var1 = (long)ViewConfiguration.getLongPressTimeout();
         var0.a.postDelayed(var5, var1);
      }

   }

   public final void a() {
      o1 var2 = l;
      View var1 = this.a;
      if (var2 == this) {
         l = null;
         p1 var4 = this.h;
         if (var4 != null) {
            View var3 = var4.b;
            if (var3.getParent() != null) {
               ((WindowManager)var4.a.getSystemService("window")).removeView(var3);
            }

            this.h = null;
            this.j = true;
            var1.removeOnAttachStateChangeListener(this);
         } else {
            Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
         }
      }

      if (k == this) {
         b((o1)null);
      }

      var1.removeCallbacks(this.e);
   }

   public final void c(boolean var1) {
      View var14 = this.a;
      if (var14.isAttachedToWindow()) {
         b((o1)null);
         o1 var11 = l;
         if (var11 != null) {
            var11.a();
         }

         l = this;
         this.i = var1;
         p1 var17 = new p1(var14.getContext());
         this.h = var17;
         int var2 = this.f;
         int var4 = this.g;
         var1 = this.i;
         View var15 = var17.b;
         ViewParent var19 = var15.getParent();
         Context var16 = var17.a;
         if (var19 != null && var15.getParent() != null) {
            ((WindowManager)var16.getSystemService("window")).removeView(var15);
         }

         var17.c.setText(this.b);
         WindowManager.LayoutParams var18 = var17.d;
         var18.token = var14.getApplicationWindowToken();
         int var3 = var16.getResources().getDimensionPixelOffset(2131099764);
         if (var14.getWidth() < var3) {
            var2 = var14.getWidth() / 2;
         }

         int var5;
         if (var14.getHeight() >= var3) {
            var5 = var16.getResources().getDimensionPixelOffset(2131099763);
            var3 = var4 + var5;
            var4 -= var5;
         } else {
            var3 = var14.getHeight();
            var4 = 0;
         }

         var18.gravity = 49;
         Resources var20 = var16.getResources();
         if (var1) {
            var5 = 2131099767;
         } else {
            var5 = 2131099766;
         }

         int var6 = var20.getDimensionPixelOffset(var5);
         View var13 = var14.getRootView();
         ViewGroup.LayoutParams var21 = var13.getLayoutParams();
         View var22;
         if (var21 instanceof WindowManager.LayoutParams && ((WindowManager.LayoutParams)var21).type == 2) {
            var22 = var13;
         } else {
            Context var12 = var14.getContext();

            while(true) {
               var22 = var13;
               if (!(var12 instanceof ContextWrapper)) {
                  break;
               }

               if (var12 instanceof Activity) {
                  var22 = ((Activity)var12).getWindow().getDecorView();
                  break;
               }

               var12 = ((ContextWrapper)var12).getBaseContext();
            }
         }

         if (var22 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
         } else {
            Rect var23 = var17.e;
            var22.getWindowVisibleDisplayFrame(var23);
            if (var23.left < 0 && var23.top < 0) {
               Resources var24 = var16.getResources();
               var5 = var24.getIdentifier("status_bar_height", "dimen", "android");
               if (var5 != 0) {
                  var5 = var24.getDimensionPixelSize(var5);
               } else {
                  var5 = 0;
               }

               DisplayMetrics var26 = var24.getDisplayMetrics();
               var23.set(0, var5, var26.widthPixels, var26.heightPixels);
            }

            int[] var27 = var17.g;
            var22.getLocationOnScreen(var27);
            int[] var29 = var17.f;
            var14.getLocationOnScreen(var29);
            var5 = var29[0] - var27[0];
            var29[0] = var5;
            var29[1] -= var27[1];
            var18.x = var5 + var2 - var22.getWidth() / 2;
            var2 = MeasureSpec.makeMeasureSpec(0, 0);
            var15.measure(var2, var2);
            var2 = var15.getMeasuredHeight();
            var5 = var29[1];
            var4 = var4 + var5 - var6 - var2;
            var3 = var5 + var3 + var6;
            if (var1) {
               if (var4 >= 0) {
                  var18.y = var4;
               } else {
                  var18.y = var3;
               }
            } else if (var2 + var3 <= var23.height()) {
               var18.y = var3;
            } else {
               var18.y = var4;
            }
         }

         ((WindowManager)var16.getSystemService("window")).addView(var15, var18);
         var14.addOnAttachStateChangeListener(this);
         long var7;
         if (this.i) {
            var7 = 2500L;
         } else {
            WeakHashMap var25 = T.a;
            long var9;
            if ((var14.getWindowSystemUiVisibility() & 1) == 1) {
               var9 = (long)ViewConfiguration.getLongPressTimeout();
               var7 = 3000L;
            } else {
               var9 = (long)ViewConfiguration.getLongPressTimeout();
               var7 = 15000L;
            }

            var7 -= var9;
         }

         n1 var28 = this.e;
         var14.removeCallbacks(var28);
         var14.postDelayed(var28, var7);
      }
   }

   public final boolean onHover(View var1, MotionEvent var2) {
      if (this.h != null && this.i) {
         return false;
      } else {
         var1 = this.a;
         AccessibilityManager var7 = (AccessibilityManager)var1.getContext().getSystemService("accessibility");
         if (var7.isEnabled() && var7.isTouchExplorationEnabled()) {
            return false;
         } else {
            int var3 = var2.getAction();
            if (var3 != 7) {
               if (var3 == 10) {
                  this.j = true;
                  this.a();
               }
            } else if (var1.isEnabled() && this.h == null) {
               var3 = (int)var2.getX();
               int var4 = (int)var2.getY();
               if (!this.j) {
                  int var5 = Math.abs(var3 - this.f);
                  int var6 = this.c;
                  if (var5 <= var6 && Math.abs(var4 - this.g) <= var6) {
                     return false;
                  }
               }

               this.f = var3;
               this.g = var4;
               this.j = false;
               b(this);
            }

            return false;
         }
      }
   }

   public final boolean onLongClick(View var1) {
      this.f = var1.getWidth() / 2;
      this.g = var1.getHeight() / 2;
      this.c(true);
      return true;
   }

   public final void onViewAttachedToWindow(View var1) {
   }

   public final void onViewDetachedFromWindow(View var1) {
      this.a();
   }
}
