package androidx.core.widget;

import D.T;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.y0;
import java.util.WeakHashMap;

public final class d implements View.OnTouchListener {
   public static final int r = ViewConfiguration.getTapTimeout();
   public final a a;
   public final AccelerateInterpolator b;
   public final ListView c;
   public A.b d;
   public final float[] e;
   public final float[] f;
   public final int g;
   public final int h;
   public final float[] i;
   public final float[] j;
   public final float[] k;
   public boolean l;
   public boolean m;
   public boolean n;
   public boolean o;
   public boolean p;
   public final y0 q;

   public d(y0 var1) {
      Object var5 = new Object();
      ((a)var5).e = Long.MIN_VALUE;
      ((a)var5).g = -1L;
      ((a)var5).f = 0L;
      this.a = (a)var5;
      this.b = new AccelerateInterpolator();
      float[] var10 = new float[]{0.0F, 0.0F};
      this.e = var10;
      float[] var7 = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
      this.f = var7;
      float[] var6 = new float[]{0.0F, 0.0F};
      this.i = var6;
      float[] var8 = new float[]{0.0F, 0.0F};
      this.j = var8;
      float[] var9 = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
      this.k = var9;
      this.c = var1;
      float var2 = Resources.getSystem().getDisplayMetrics().density;
      int var4 = (int)(1575.0F * var2 + 0.5F);
      int var3 = (int)(var2 * 315.0F + 0.5F);
      var2 = (float)var4 / 1000.0F;
      var9[0] = var2;
      var9[1] = var2;
      var2 = (float)var3 / 1000.0F;
      var8[0] = var2;
      var8[1] = var2;
      this.g = 1;
      var7[0] = Float.MAX_VALUE;
      var7[1] = Float.MAX_VALUE;
      var10[0] = 0.2F;
      var10[1] = 0.2F;
      var6[0] = 0.001F;
      var6[1] = 0.001F;
      this.h = r;
      ((a)var5).a = 500;
      ((a)var5).b = 500;
      this.q = var1;
   }

   public static float b(float var0, float var1, float var2) {
      if (var0 > var2) {
         return var2;
      } else {
         return var0 < var1 ? var1 : var0;
      }
   }

   public final float a(int var1, float var2, float var3, float var4) {
      float var5;
      float var6;
      label23: {
         var5 = b(this.e[var1] * var3, 0.0F, this.f[var1]);
         var6 = this.c(var2, var5);
         var2 = this.c(var3 - var2, var5) - var6;
         AccelerateInterpolator var8 = this.b;
         if (var2 < 0.0F) {
            var2 = -var8.getInterpolation(-var2);
         } else {
            if (!(var2 > 0.0F)) {
               var2 = 0.0F;
               break label23;
            }

            var2 = var8.getInterpolation(var2);
         }

         var2 = b(var2, -1.0F, 1.0F);
      }

      float var9;
      int var7 = (var9 = var2 - 0.0F) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
      if (var7 == 0) {
         return 0.0F;
      } else {
         var6 = this.i[var1];
         var3 = this.j[var1];
         var5 = this.k[var1];
         var4 = var6 * var4;
         return var7 > 0 ? b(var2 * var4, var3, var5) : -b(-var2 * var4, var3, var5);
      }
   }

   public final float c(float var1, float var2) {
      if (var2 == 0.0F) {
         return 0.0F;
      } else {
         int var3 = this.g;
         if (var3 != 0 && var3 != 1) {
            if (var3 == 2 && var1 < 0.0F) {
               return var1 / -var2;
            }
         } else if (var1 < var2) {
            if (var1 >= 0.0F) {
               return 1.0F - var1 / var2;
            }

            if (this.o && var3 == 1) {
               return 1.0F;
            }
         }

         return 0.0F;
      }
   }

   public final void d() {
      boolean var6 = this.m;
      byte var2 = 0;
      if (var6) {
         this.o = false;
      } else {
         a var7 = this.a;
         long var4 = AnimationUtils.currentAnimationTimeMillis();
         int var3 = (int)(var4 - var7.e);
         int var1 = var7.b;
         if (var3 <= var1) {
            if (var3 < 0) {
               var1 = var2;
            } else {
               var1 = var3;
            }
         }

         var7.i = var1;
         var7.h = var7.a(var4);
         var7.g = var4;
      }

   }

   public final boolean e() {
      a var8 = this.a;
      float var1 = var8.d;
      int var3 = (int)(var1 / Math.abs(var1));
      Math.abs(var8.c);
      boolean var7 = false;
      boolean var6 = var7;
      if (var3 != 0) {
         y0 var9 = this.q;
         int var2 = var9.getCount();
         if (var2 == 0) {
            var6 = var7;
         } else {
            int var5 = var9.getChildCount();
            int var4 = var9.getFirstVisiblePosition();
            if (var3 > 0) {
               if (var4 + var5 >= var2 && var9.getChildAt(var5 - 1).getBottom() <= var9.getHeight()) {
                  var6 = var7;
                  return var6;
               }
            } else {
               var6 = var7;
               if (var3 >= 0) {
                  return var6;
               }

               if (var4 <= 0 && var9.getChildAt(0).getTop() >= 0) {
                  var6 = var7;
                  return var6;
               }
            }

            var6 = true;
         }
      }

      return var6;
   }

   public final boolean onTouch(View var1, MotionEvent var2) {
      if (!this.p) {
         return false;
      } else {
         int var5 = var2.getActionMasked();
         if (var5 != 0) {
            label55: {
               if (var5 != 1) {
                  if (var5 == 2) {
                     break label55;
                  }

                  if (var5 != 3) {
                     return false;
                  }
               }

               this.d();
               return false;
            }
         } else {
            this.n = true;
            this.l = false;
         }

         float var4 = var2.getX();
         float var3 = (float)var1.getWidth();
         ListView var8 = this.c;
         var3 = this.a(0, var4, var3, (float)var8.getWidth());
         var4 = this.a(1, var2.getY(), (float)var1.getHeight(), (float)var8.getHeight());
         a var9 = this.a;
         var9.c = var3;
         var9.d = var4;
         if (!this.o && this.e()) {
            if (this.d == null) {
               this.d = new A.b(5, this);
            }

            label28: {
               this.o = true;
               this.m = true;
               if (!this.l) {
                  var5 = this.h;
                  if (var5 > 0) {
                     A.b var11 = this.d;
                     long var6 = (long)var5;
                     WeakHashMap var10 = T.a;
                     var8.postOnAnimationDelayed(var11, var6);
                     break label28;
                  }
               }

               this.d.run();
            }

            this.l = true;
         }

         return false;
      }
   }
}
