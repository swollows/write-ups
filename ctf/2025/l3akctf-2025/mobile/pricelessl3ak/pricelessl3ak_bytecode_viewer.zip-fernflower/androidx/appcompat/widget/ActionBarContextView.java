package androidx.appcompat.widget;

import D.T;
import D.Z;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends ViewGroup {
   public final a a = new a(this);
   public final Context b;
   public ActionMenuView c;
   public m d;
   public int e;
   public Z f;
   public boolean g;
   public boolean h;
   public CharSequence i;
   public CharSequence j;
   public View k;
   public View l;
   public View m;
   public LinearLayout n;
   public TextView o;
   public TextView p;
   public final int q;
   public final int r;
   public boolean s;
   public final int t;

   public ActionBarContextView(Context var1, AttributeSet var2) {
      super(var1, var2, 2130903068);
      TypedValue var4 = new TypedValue();
      if (var1.getTheme().resolveAttribute(2130903042, var4, true) && var4.resourceId != 0) {
         this.b = new ContextThemeWrapper(var1, var4.resourceId);
      } else {
         this.b = var1;
      }

      Drawable var5;
      TypedArray var6;
      label16: {
         var6 = var1.obtainStyledAttributes(var2, g.a.d, 2130903068, 0);
         if (var6.hasValue(0)) {
            int var3 = var6.getResourceId(0, 0);
            if (var3 != 0) {
               var5 = C.b.n(var1, var3);
               break label16;
            }
         }

         var5 = var6.getDrawable(0);
      }

      this.setBackground(var5);
      this.q = var6.getResourceId(5, 0);
      this.r = var6.getResourceId(4, 0);
      this.e = var6.getLayoutDimension(3, 0);
      this.t = var6.getResourceId(2, 2131427333);
      var6.recycle();
   }

   // $FF: synthetic method
   public static void a(ActionBarContextView var0) {
      var0.setVisibility(0);
   }

   // $FF: synthetic method
   public static void b(ActionBarContextView var0, int var1) {
      var0.setVisibility(var1);
   }

   public static int f(View var0, int var1, int var2) {
      var0.measure(MeasureSpec.makeMeasureSpec(var1, Integer.MIN_VALUE), var2);
      return Math.max(0, var1 - var0.getMeasuredWidth());
   }

   public static int g(View var0, int var1, int var2, int var3, boolean var4) {
      int var5 = var0.getMeasuredWidth();
      int var6 = var0.getMeasuredHeight();
      var2 += (var3 - var6) / 2;
      if (var4) {
         var0.layout(var1 - var5, var2, var1, var6 + var2);
      } else {
         var0.layout(var1, var2, var1 + var5, var6 + var2);
      }

      var1 = var5;
      if (var4) {
         var1 = -var5;
      }

      return var1;
   }

   public final void c(i.b var1) {
      View var2 = this.k;
      if (var2 == null) {
         var2 = LayoutInflater.from(this.getContext()).inflate(this.t, this, false);
         this.k = var2;
         this.addView(var2);
      } else if (var2.getParent() == null) {
         this.addView(this.k);
      }

      var2 = this.k.findViewById(2131230774);
      this.l = var2;
      var2.setOnClickListener(new androidx.appcompat.app.c(1, var1));
      j.l var8 = var1.c();
      m var5 = this.d;
      if (var5 != null) {
         var5.g();
         g var6 = var5.t;
         if (var6 != null && var6.b()) {
            var6.i.dismiss();
         }
      }

      var5 = new m(this.getContext());
      this.d = var5;
      var5.l = true;
      var5.m = true;
      ViewGroup.LayoutParams var7 = new ViewGroup.LayoutParams(-2, -1);
      var8.b(this.d, this.b);
      m var9 = this.d;
      j.z var3 = var9.h;
      j.z var4;
      if (var3 == null) {
         var4 = (j.z)var9.d.inflate(var9.f, this, false);
         var9.h = var4;
         var4.a(var9.c);
         var9.c();
      }

      var4 = var9.h;
      if (var3 != var4) {
         ((ActionMenuView)var4).setPresenter(var9);
      }

      ActionMenuView var10 = (ActionMenuView)var4;
      this.c = var10;
      var10.setBackground((Drawable)null);
      this.addView(this.c, var7);
   }

   public final void d() {
      LinearLayout var5;
      if (this.n == null) {
         LayoutInflater.from(this.getContext()).inflate(2131427328, this);
         var5 = (LinearLayout)this.getChildAt(this.getChildCount() - 1);
         this.n = var5;
         this.o = (TextView)var5.findViewById(2131230765);
         this.p = (TextView)this.n.findViewById(2131230764);
         int var1 = this.q;
         if (var1 != 0) {
            this.o.setTextAppearance(this.getContext(), var1);
         }

         var1 = this.r;
         if (var1 != 0) {
            this.p.setTextAppearance(this.getContext(), var1);
         }
      }

      this.o.setText(this.i);
      this.p.setText(this.j);
      boolean var3 = TextUtils.isEmpty(this.i);
      boolean var4 = TextUtils.isEmpty(this.j);
      TextView var7 = this.p;
      byte var2 = 8;
      byte var6;
      if (!var4) {
         var6 = 0;
      } else {
         var6 = 8;
      }

      label27: {
         var7.setVisibility(var6);
         var5 = this.n;
         if (var3) {
            var6 = var2;
            if (var4) {
               break label27;
            }
         }

         var6 = 0;
      }

      var5.setVisibility(var6);
      if (this.n.getParent() == null) {
         this.addView(this.n);
      }

   }

   public final void e() {
      this.removeAllViews();
      this.m = null;
      this.c = null;
      this.d = null;
      View var1 = this.l;
      if (var1 != null) {
         var1.setOnClickListener((View.OnClickListener)null);
      }

   }

   public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
      return new ViewGroup.MarginLayoutParams(-1, -2);
   }

   public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet var1) {
      return new ViewGroup.MarginLayoutParams(this.getContext(), var1);
   }

   public int getAnimatedVisibility() {
      int var1;
      if (this.f != null) {
         var1 = this.a.b;
      } else {
         var1 = this.getVisibility();
      }

      return var1;
   }

   public int getContentHeight() {
      return this.e;
   }

   public CharSequence getSubtitle() {
      return this.j;
   }

   public CharSequence getTitle() {
      return this.i;
   }

   public final void h(int var1) {
      if (var1 != this.getVisibility()) {
         Z var2 = this.f;
         if (var2 != null) {
            var2.b();
         }

         super.setVisibility(var1);
      }

   }

   public final Z i(int var1, long var2) {
      Z var4 = this.f;
      if (var4 != null) {
         var4.b();
      }

      a var6 = this.a;
      Z var5;
      if (var1 == 0) {
         if (this.getVisibility() != 0) {
            this.setAlpha(0.0F);
         }

         var5 = T.a(this);
         var5.a(1.0F);
         var5.c(var2);
         var6.c.f = var5;
         var6.b = var1;
         var5.d(var6);
         return var5;
      } else {
         var5 = T.a(this);
         var5.a(0.0F);
         var5.c(var2);
         var6.c.f = var5;
         var6.b = var1;
         var5.d(var6);
         return var5;
      }
   }

   public final void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      TypedArray var5 = this.getContext().obtainStyledAttributes((AttributeSet)null, g.a.a, 2130903045, 0);
      this.setContentHeight(var5.getLayoutDimension(13, 0));
      var5.recycle();
      m var4 = this.d;
      if (var4 != null) {
         var1 = var4.b.getResources().getConfiguration();
         int var2 = var1.screenWidthDp;
         int var3 = var1.screenHeightDp;
         byte var7;
         if (var1.smallestScreenWidthDp <= 600 && var2 <= 600 && (var2 <= 960 || var3 <= 720) && (var2 <= 720 || var3 <= 960)) {
            if (var2 < 500 && (var2 <= 640 || var3 <= 480) && (var2 <= 480 || var3 <= 640)) {
               if (var2 >= 360) {
                  var7 = 3;
               } else {
                  var7 = 2;
               }
            } else {
               var7 = 4;
            }
         } else {
            var7 = 5;
         }

         var4.p = var7;
         j.l var6 = var4.c;
         if (var6 != null) {
            var6.p(true);
         }
      }

   }

   public final void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      m var1 = this.d;
      if (var1 != null) {
         var1.g();
         g var2 = this.d.t;
         if (var2 != null && var2.b()) {
            var2.i.dismiss();
         }
      }

   }

   public final boolean onHoverEvent(MotionEvent var1) {
      int var2 = var1.getActionMasked();
      if (var2 == 9) {
         this.h = false;
      }

      if (!this.h) {
         boolean var3 = super.onHoverEvent(var1);
         if (var2 == 9 && !var3) {
            this.h = true;
         }
      }

      if (var2 == 10 || var2 == 3) {
         this.h = false;
      }

      return true;
   }

   public final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      var1 = t1.a;
      if (this.getLayoutDirection() == 1) {
         var1 = true;
      } else {
         var1 = false;
      }

      int var6;
      if (var1) {
         var6 = var4 - var2 - this.getPaddingRight();
      } else {
         var6 = this.getPaddingLeft();
      }

      int var7 = this.getPaddingTop();
      int var8 = var5 - var3 - this.getPaddingTop() - this.getPaddingBottom();
      View var9 = this.k;
      var3 = var6;
      if (var9 != null) {
         var3 = var6;
         if (var9.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams var10 = (ViewGroup.MarginLayoutParams)this.k.getLayoutParams();
            if (var1) {
               var5 = var10.rightMargin;
            } else {
               var5 = var10.leftMargin;
            }

            if (var1) {
               var3 = var10.leftMargin;
            } else {
               var3 = var10.rightMargin;
            }

            if (var1) {
               var5 = var6 - var5;
            } else {
               var5 += var6;
            }

            var5 += g(this.k, var5, var7, var8, var1);
            if (var1) {
               var3 = var5 - var3;
            } else {
               var3 += var5;
            }
         }
      }

      LinearLayout var11 = this.n;
      var5 = var3;
      if (var11 != null) {
         var5 = var3;
         if (this.m == null) {
            var5 = var3;
            if (var11.getVisibility() != 8) {
               var5 = var3 + g(this.n, var3, var7, var8, var1);
            }
         }
      }

      var9 = this.m;
      if (var9 != null) {
         g(var9, var5, var7, var8, var1);
      }

      if (var1) {
         var2 = this.getPaddingLeft();
      } else {
         var2 = var4 - var2 - this.getPaddingRight();
      }

      ActionMenuView var12 = this.c;
      if (var12 != null) {
         g(var12, var2, var7, var8, var1 ^ true);
      }

   }

   public final void onMeasure(int var1, int var2) {
      int var3 = MeasureSpec.getMode(var1);
      int var5 = 1073741824;
      if (var3 != 1073741824) {
         throw new IllegalStateException(this.getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
      } else if (MeasureSpec.getMode(var2) != 0) {
         int var8 = MeasureSpec.getSize(var1);
         var3 = this.e;
         if (var3 <= 0) {
            var3 = MeasureSpec.getSize(var2);
         }

         var1 = this.getPaddingTop();
         int var9 = this.getPaddingBottom() + var1;
         var1 = var8 - this.getPaddingLeft() - this.getPaddingRight();
         int var6 = var3 - var9;
         int var4 = MeasureSpec.makeMeasureSpec(var6, Integer.MIN_VALUE);
         View var11 = this.k;
         var2 = var1;
         if (var11 != null) {
            var1 = f(var11, var1, var4);
            ViewGroup.MarginLayoutParams var14 = (ViewGroup.MarginLayoutParams)this.k.getLayoutParams();
            var2 = var1 - (var14.leftMargin + var14.rightMargin);
         }

         ActionMenuView var15 = this.c;
         var1 = var2;
         if (var15 != null) {
            var1 = var2;
            if (var15.getParent() == this) {
               var1 = f(this.c, var2, var4);
            }
         }

         LinearLayout var16 = this.n;
         byte var7 = 0;
         var2 = var1;
         int var10;
         if (var16 != null) {
            var2 = var1;
            if (this.m == null) {
               if (this.s) {
                  var2 = MeasureSpec.makeMeasureSpec(0, 0);
                  this.n.measure(var2, var4);
                  var10 = this.n.getMeasuredWidth();
                  boolean var13;
                  if (var10 <= var1) {
                     var13 = true;
                  } else {
                     var13 = false;
                  }

                  var2 = var1;
                  if (var13) {
                     var2 = var1 - var10;
                  }

                  var16 = this.n;
                  byte var12;
                  if (var13) {
                     var12 = 0;
                  } else {
                     var12 = 8;
                  }

                  var16.setVisibility(var12);
               } else {
                  var2 = f(var16, var1, var4);
               }
            }
         }

         var11 = this.m;
         if (var11 != null) {
            ViewGroup.LayoutParams var17 = var11.getLayoutParams();
            var10 = var17.width;
            if (var10 != -2) {
               var1 = 1073741824;
            } else {
               var1 = Integer.MIN_VALUE;
            }

            var4 = var2;
            if (var10 >= 0) {
               var4 = Math.min(var10, var2);
            }

            var10 = var17.height;
            if (var10 != -2) {
               var2 = var5;
            } else {
               var2 = Integer.MIN_VALUE;
            }

            var5 = var6;
            if (var10 >= 0) {
               var5 = Math.min(var10, var6);
            }

            this.m.measure(MeasureSpec.makeMeasureSpec(var4, var1), MeasureSpec.makeMeasureSpec(var5, var2));
         }

         if (this.e <= 0) {
            var5 = this.getChildCount();
            var3 = 0;

            for(var1 = var7; var1 < var5; var3 = var2) {
               var4 = this.getChildAt(var1).getMeasuredHeight() + var9;
               var2 = var3;
               if (var4 > var3) {
                  var2 = var4;
               }

               ++var1;
            }

            this.setMeasuredDimension(var8, var3);
         } else {
            this.setMeasuredDimension(var8, var3);
         }

      } else {
         throw new IllegalStateException(this.getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
      }
   }

   public final boolean onTouchEvent(MotionEvent var1) {
      int var2 = var1.getActionMasked();
      if (var2 == 0) {
         this.g = false;
      }

      if (!this.g) {
         boolean var3 = super.onTouchEvent(var1);
         if (var2 == 0 && !var3) {
            this.g = true;
         }
      }

      if (var2 == 1 || var2 == 3) {
         this.g = false;
      }

      return true;
   }

   public void setContentHeight(int var1) {
      this.e = var1;
   }

   public void setCustomView(View var1) {
      View var2 = this.m;
      if (var2 != null) {
         this.removeView(var2);
      }

      this.m = var1;
      if (var1 != null) {
         LinearLayout var3 = this.n;
         if (var3 != null) {
            this.removeView(var3);
            this.n = null;
         }
      }

      if (var1 != null) {
         this.addView(var1);
      }

      this.requestLayout();
   }

   public void setSubtitle(CharSequence var1) {
      this.j = var1;
      this.d();
   }

   public void setTitle(CharSequence var1) {
      this.i = var1;
      this.d();
      T.j(this, var1);
   }

   public void setTitleOptional(boolean var1) {
      if (var1 != this.s) {
         this.requestLayout();
      }

      this.s = var1;
   }

   public final boolean shouldDelayChildPressedState() {
      return false;
   }
}
