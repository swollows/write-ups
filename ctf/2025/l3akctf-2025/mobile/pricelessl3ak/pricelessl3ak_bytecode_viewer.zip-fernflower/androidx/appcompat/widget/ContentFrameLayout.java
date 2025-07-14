package androidx.appcompat.widget;

import D.Z;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import androidx.appcompat.app.H;

public class ContentFrameLayout extends FrameLayout {
   public TypedValue a;
   public TypedValue b;
   public TypedValue c;
   public TypedValue d;
   public TypedValue e;
   public TypedValue f;
   public final Rect g = new Rect();
   public p0 h;

   public ContentFrameLayout(Context var1, AttributeSet var2) {
      super(var1, var2, 0);
   }

   public TypedValue getFixedHeightMajor() {
      if (this.e == null) {
         this.e = new TypedValue();
      }

      return this.e;
   }

   public TypedValue getFixedHeightMinor() {
      if (this.f == null) {
         this.f = new TypedValue();
      }

      return this.f;
   }

   public TypedValue getFixedWidthMajor() {
      if (this.c == null) {
         this.c = new TypedValue();
      }

      return this.c;
   }

   public TypedValue getFixedWidthMinor() {
      if (this.d == null) {
         this.d = new TypedValue();
      }

      return this.d;
   }

   public TypedValue getMinWidthMajor() {
      if (this.a == null) {
         this.a = new TypedValue();
      }

      return this.a;
   }

   public TypedValue getMinWidthMinor() {
      if (this.b == null) {
         this.b = new TypedValue();
      }

      return this.b;
   }

   public final void onAttachedToWindow() {
      super.onAttachedToWindow();
      p0 var1 = this.h;
      if (var1 != null) {
         var1.getClass();
      }

   }

   public final void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      p0 var1 = this.h;
      if (var1 != null) {
         H var4 = ((androidx.appcompat.app.t)var1).b;
         q0 var2 = var4.r;
         if (var2 != null) {
            ActionBarOverlayLayout var6 = (ActionBarOverlayLayout)var2;
            var6.k();
            ActionMenuView var7 = ((l1)var6.e).a.a;
            if (var7 != null) {
               m var8 = var7.t;
               if (var8 != null) {
                  var8.g();
                  g var9 = var8.t;
                  if (var9 != null && var9.b()) {
                     var9.i.dismiss();
                  }
               }
            }
         }

         if (var4.w != null) {
            var4.l.getDecorView().removeCallbacks(var4.x);
            if (var4.w.isShowing()) {
               try {
                  var4.w.dismiss();
               } catch (IllegalArgumentException var3) {
               }
            }

            var4.w = null;
         }

         Z var10 = var4.y;
         if (var10 != null) {
            var10.b();
         }

         j.l var5 = var4.A(0).h;
         if (var5 != null) {
            var5.c(true);
         }
      }

   }

   public final void onMeasure(int var1, int var2) {
      DisplayMetrics var11 = this.getContext().getResources().getDisplayMetrics();
      int var5 = var11.widthPixels;
      int var4 = var11.heightPixels;
      boolean var7 = true;
      boolean var13;
      if (var5 < var4) {
         var13 = true;
      } else {
         var13 = false;
      }

      float var3;
      int var6;
      int var8;
      TypedValue var9;
      Rect var10;
      boolean var12;
      label104: {
         var8 = MeasureSpec.getMode(var1);
         var6 = MeasureSpec.getMode(var2);
         var10 = this.g;
         if (var8 == Integer.MIN_VALUE) {
            if (var13) {
               var9 = this.d;
            } else {
               var9 = this.c;
            }

            if (var9 != null) {
               var5 = var9.type;
               if (var5 != 0) {
                  label98: {
                     if (var5 == 5) {
                        var3 = var9.getDimension(var11);
                     } else {
                        if (var5 != 6) {
                           var5 = 0;
                           break label98;
                        }

                        var5 = var11.widthPixels;
                        var3 = var9.getFraction((float)var5, (float)var5);
                     }

                     var5 = (int)var3;
                  }

                  if (var5 > 0) {
                     var5 = MeasureSpec.makeMeasureSpec(Math.min(var5 - (var10.left + var10.right), MeasureSpec.getSize(var1)), 1073741824);
                     var12 = true;
                     break label104;
                  }
               }
            }
         }

         var5 = var1;
         var12 = false;
      }

      if (var6 == Integer.MIN_VALUE) {
         if (var13) {
            var9 = this.e;
         } else {
            var9 = this.f;
         }

         if (var9 != null) {
            var6 = var9.type;
            if (var6 != 0) {
               label85: {
                  if (var6 == 5) {
                     var3 = var9.getDimension(var11);
                  } else {
                     if (var6 != 6) {
                        var6 = 0;
                        break label85;
                     }

                     var6 = var11.heightPixels;
                     var3 = var9.getFraction((float)var6, (float)var6);
                  }

                  var6 = (int)var3;
               }

               if (var6 > 0) {
                  var2 = MeasureSpec.makeMeasureSpec(Math.min(var6 - (var10.top + var10.bottom), MeasureSpec.getSize(var2)), 1073741824);
               }
            }
         }
      }

      label79: {
         super.onMeasure(var5, var2);
         var6 = this.getMeasuredWidth();
         var5 = MeasureSpec.makeMeasureSpec(var6, 1073741824);
         if (!var12 && var8 == Integer.MIN_VALUE) {
            if (var13) {
               var9 = this.b;
            } else {
               var9 = this.a;
            }

            if (var9 != null) {
               var1 = var9.type;
               if (var1 != 0) {
                  label72: {
                     if (var1 == 5) {
                        var3 = var9.getDimension(var11);
                     } else {
                        if (var1 != 6) {
                           var1 = 0;
                           break label72;
                        }

                        var1 = var11.widthPixels;
                        var3 = var9.getFraction((float)var1, (float)var1);
                     }

                     var1 = (int)var3;
                  }

                  var4 = var1;
                  if (var1 > 0) {
                     var4 = var1 - (var10.left + var10.right);
                  }

                  if (var6 < var4) {
                     var1 = MeasureSpec.makeMeasureSpec(var4, 1073741824);
                     var13 = var7;
                     break label79;
                  }
               }
            }
         }

         var13 = false;
         var1 = var5;
      }

      if (var13) {
         super.onMeasure(var1, var2);
      }

   }

   public void setAttachListener(p0 var1) {
      this.h = var1;
   }
}
