package androidx.core.widget;

import D.B;
import D.C;
import D.D;
import D.E;
import D.L;
import D.T;
import D.V;
import D.s;
import D.t;
import D.u;
import D.v;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.View.MeasureSpec;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

public class NestedScrollView extends FrameLayout implements u {
   public static final float C = (float)(Math.log(0.78) / Math.log(0.9));
   public static final e D = new D.b();
   public static final int[] E = new int[]{16843130};
   public float A;
   public final D.j B;
   public final float a;
   public long b;
   public final Rect c = new Rect();
   public final OverScroller d;
   public final EdgeEffect e;
   public final EdgeEffect f;
   public B g;
   public int h;
   public boolean i = true;
   public boolean j = false;
   public View k = null;
   public boolean l = false;
   public VelocityTracker m;
   public boolean n;
   public boolean o = true;
   public final int p;
   public final int q;
   public final int r;
   public int s = -1;
   public final int[] t = new int[2];
   public final int[] u = new int[2];
   public int v;
   public int w;
   public SavedState x;
   public final v y;
   public final s z;

   public NestedScrollView(Context var1, AttributeSet var2) {
      super(var1, var2, 2130903225);
      D.d var4 = new D.d(14, this);
      this.B = new D.j(this.getContext(), var4);
      int var3 = VERSION.SDK_INT;
      EdgeEffect var6;
      if (var3 >= 31) {
         var6 = androidx.core.widget.c.a(var1, var2);
      } else {
         var6 = new EdgeEffect(var1);
      }

      this.e = var6;
      if (var3 >= 31) {
         var6 = androidx.core.widget.c.a(var1, var2);
      } else {
         var6 = new EdgeEffect(var1);
      }

      this.f = var6;
      this.a = var1.getResources().getDisplayMetrics().density * 160.0F * 386.0878F * 0.84F;
      this.d = new OverScroller(this.getContext());
      this.setFocusable(true);
      this.setDescendantFocusability(262144);
      this.setWillNotDraw(false);
      ViewConfiguration var7 = ViewConfiguration.get(this.getContext());
      this.p = var7.getScaledTouchSlop();
      this.q = var7.getScaledMinimumFlingVelocity();
      this.r = var7.getScaledMaximumFlingVelocity();
      TypedArray var5 = var1.obtainStyledAttributes(var2, E, 2130903225, 0);
      this.setFillViewport(var5.getBoolean(0, false));
      var5.recycle();
      this.y = (v)(new Object());
      this.z = new s(this);
      this.setNestedScrollingEnabled(true);
      T.i(this, D);
   }

   private B getScrollFeedbackProvider() {
      if (this.g == null) {
         this.g = new B(this);
      }

      return this.g;
   }

   public static boolean m(View var0, NestedScrollView var1) {
      boolean var2 = true;
      if (var0 == var1) {
         return true;
      } else {
         ViewParent var3 = var0.getParent();
         if (!(var3 instanceof ViewGroup) || !m((View)var3, var1)) {
            var2 = false;
         }

         return var2;
      }
   }

   public final void a(int var1, int var2, int[] var3, int var4) {
      this.i(var1, var2, var4, var3, (int[])null);
   }

   public final void addView(View var1) {
      if (this.getChildCount() <= 0) {
         super.addView(var1);
      } else {
         throw new IllegalStateException("ScrollView can host only one direct child");
      }
   }

   public final void addView(View var1, int var2) {
      if (this.getChildCount() <= 0) {
         super.addView(var1, var2);
      } else {
         throw new IllegalStateException("ScrollView can host only one direct child");
      }
   }

   public final void addView(View var1, int var2, ViewGroup.LayoutParams var3) {
      if (this.getChildCount() <= 0) {
         super.addView(var1, var2, var3);
      } else {
         throw new IllegalStateException("ScrollView can host only one direct child");
      }
   }

   public final void addView(View var1, ViewGroup.LayoutParams var2) {
      if (this.getChildCount() <= 0) {
         super.addView(var1, var2);
      } else {
         throw new IllegalStateException("ScrollView can host only one direct child");
      }
   }

   public final void b(View var1, View var2, int var3, int var4) {
      v var5 = this.y;
      if (var4 == 1) {
         var5.b = var3;
      } else {
         var5.a = var3;
      }

      this.w(2, var4);
   }

   public final void c(View var1, int var2) {
      v var3 = this.y;
      if (var2 == 1) {
         var3.b = 0;
      } else {
         var3.a = 0;
      }

      this.y(var2);
   }

   public final int computeHorizontalScrollExtent() {
      return super.computeHorizontalScrollExtent();
   }

   public final int computeHorizontalScrollOffset() {
      return super.computeHorizontalScrollOffset();
   }

   public final int computeHorizontalScrollRange() {
      return super.computeHorizontalScrollRange();
   }

   public final void computeScroll() {
      if (!this.d.isFinished()) {
         int var3;
         int var4;
         int var5;
         int var6;
         EdgeEffect var8;
         EdgeEffect var9;
         label70: {
            this.d.computeScrollOffset();
            var6 = this.d.getCurrY();
            var4 = var6 - this.w;
            var5 = this.getHeight();
            var9 = this.f;
            var8 = this.e;
            float var1;
            float var2;
            if (var4 > 0 && C.b.m(var8) != 0.0F) {
               var1 = (float)(-var4) * 4.0F / (float)var5;
               var2 = (float)(-var5) / 4.0F;
               var5 = Math.round(C.b.z(var8, var1, 0.5F) * var2);
               var3 = var5;
               if (var5 != var4) {
                  var8.finish();
                  var3 = var5;
               }
            } else {
               var3 = var4;
               if (var4 >= 0) {
                  break label70;
               }

               var3 = var4;
               if (C.b.m(var9) == 0.0F) {
                  break label70;
               }

               var2 = (float)var4;
               var1 = (float)var5;
               var2 = var2 * 4.0F / var1;
               var1 /= 4.0F;
               var5 = Math.round(C.b.z(var9, var2, 0.5F) * var1);
               var3 = var5;
               if (var5 != var4) {
                  var9.finish();
                  var3 = var5;
               }
            }

            var3 = var4 - var3;
         }

         this.w = var6;
         int[] var7 = this.u;
         var7[1] = 0;
         this.i(0, var3, 1, var7, (int[])null);
         var4 = var3 - var7[1];
         var5 = this.getScrollRange();
         if (VERSION.SDK_INT >= 35) {
            androidx.core.widget.f.a(this, Math.abs(this.d.getCurrVelocity()));
         }

         var3 = var4;
         if (var4 != 0) {
            var3 = this.getScrollY();
            this.q(var4, this.getScrollX(), var3, var5);
            var3 = this.getScrollY() - var3;
            var4 -= var3;
            var7[1] = 0;
            this.z.b(0, var3, 0, var4, this.t, 1, var7);
            var3 = var4 - var7[1];
         }

         if (var3 != 0) {
            var4 = this.getOverScrollMode();
            if (var4 == 0 || var4 == 1 && var5 > 0) {
               if (var3 < 0) {
                  if (var8.isFinished()) {
                     var8.onAbsorb((int)this.d.getCurrVelocity());
                  }
               } else if (var9.isFinished()) {
                  var9.onAbsorb((int)this.d.getCurrVelocity());
               }
            }

            this.d.abortAnimation();
            this.y(1);
         }

         if (!this.d.isFinished()) {
            this.postInvalidateOnAnimation();
         } else {
            this.y(1);
         }

      }
   }

   public final int computeVerticalScrollExtent() {
      return super.computeVerticalScrollExtent();
   }

   public final int computeVerticalScrollOffset() {
      return Math.max(0, super.computeVerticalScrollOffset());
   }

   public final int computeVerticalScrollRange() {
      int var2 = this.getChildCount();
      int var1 = this.getHeight() - this.getPaddingBottom() - this.getPaddingTop();
      if (var2 == 0) {
         return var1;
      } else {
         View var6 = this.getChildAt(0);
         FrameLayout.LayoutParams var5 = (FrameLayout.LayoutParams)var6.getLayoutParams();
         var2 = var6.getBottom() + var5.bottomMargin;
         int var3 = this.getScrollY();
         int var4 = Math.max(0, var2 - var1);
         if (var3 < 0) {
            var1 = var2 - var3;
         } else {
            var1 = var2;
            if (var3 > var4) {
               var1 = var2 + (var3 - var4);
            }
         }

         return var1;
      }
   }

   public final void d(NestedScrollView var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      this.o(var5, var6, var7);
   }

   public final boolean dispatchKeyEvent(KeyEvent var1) {
      boolean var2;
      if (!super.dispatchKeyEvent(var1) && !this.j(var1)) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   public final boolean dispatchNestedFling(float var1, float var2, boolean var3) {
      s var8 = this.z;
      boolean var6 = var8.d;
      boolean var5 = false;
      boolean var4 = var5;
      if (var6) {
         ViewParent var7 = var8.c(0);
         var4 = var5;
         if (var7 != null) {
            NestedScrollView var11 = var8.c;

            try {
               var4 = var7.onNestedFling(var11, var1, var2, var3);
            } catch (AbstractMethodError var10) {
               StringBuilder var9 = new StringBuilder("ViewParent ");
               var9.append(var7);
               var9.append(" does not implement interface method onNestedFling");
               Log.e("ViewParentCompat", var9.toString(), var10);
               var4 = var5;
            }
         }
      }

      return var4;
   }

   public final boolean dispatchNestedPreFling(float var1, float var2) {
      return this.z.a(var1, var2);
   }

   public final boolean dispatchNestedPreScroll(int var1, int var2, int[] var3, int[] var4) {
      return this.i(var1, var2, 0, var3, var4);
   }

   public final boolean dispatchNestedScroll(int var1, int var2, int var3, int var4, int[] var5) {
      return this.z.b(var1, var2, var3, var4, var5, 0, (int[])null);
   }

   public final void draw(Canvas var1) {
      super.draw(var1);
      int var9 = this.getScrollY();
      EdgeEffect var12 = this.e;
      boolean var11 = var12.isFinished();
      byte var6 = 0;
      int var2;
      int var3;
      int var4;
      int var5;
      int var7;
      int var8;
      int var10;
      if (!var11) {
         var10 = var1.save();
         var3 = this.getWidth();
         var8 = this.getHeight();
         var7 = Math.min(0, var9);
         if (this.getClipToPadding()) {
            var2 = this.getPaddingLeft();
            var3 -= this.getPaddingRight() + var2;
            var2 = this.getPaddingLeft();
         } else {
            var2 = 0;
         }

         var5 = var8;
         var4 = var7;
         if (this.getClipToPadding()) {
            var4 = this.getPaddingTop();
            var5 = var8 - (this.getPaddingBottom() + var4);
            var4 = var7 + this.getPaddingTop();
         }

         var1.translate((float)var2, (float)var4);
         var12.setSize(var3, var5);
         if (var12.draw(var1)) {
            this.postInvalidateOnAnimation();
         }

         var1.restoreToCount(var10);
      }

      var12 = this.f;
      if (!var12.isFinished()) {
         var10 = var1.save();
         var4 = this.getWidth();
         var7 = this.getHeight();
         var8 = Math.max(this.getScrollRange(), var9) + var7;
         var3 = var6;
         var2 = var4;
         if (this.getClipToPadding()) {
            var2 = this.getPaddingLeft();
            var2 = var4 - (this.getPaddingRight() + var2);
            var3 = this.getPaddingLeft();
         }

         var5 = var8;
         var4 = var7;
         if (this.getClipToPadding()) {
            var4 = this.getPaddingTop();
            var4 = var7 - (this.getPaddingBottom() + var4);
            var5 = var8 - this.getPaddingBottom();
         }

         var1.translate((float)(var3 - var2), (float)var5);
         var1.rotate(180.0F, (float)var2, 0.0F);
         var12.setSize(var2, var4);
         if (var12.draw(var1)) {
            this.postInvalidateOnAnimation();
         }

         var1.restoreToCount(var10);
      }

   }

   public final void e(NestedScrollView var1, int var2, int var3, int var4, int var5, int var6) {
      this.o(var5, var6, (int[])null);
   }

   public final boolean f(View var1, View var2, int var3, int var4) {
      boolean var5;
      if ((var3 & 2) != 0) {
         var5 = true;
      } else {
         var5 = false;
      }

      return var5;
   }

   public final boolean g(int var1) {
      View var7 = this.findFocus();
      View var6 = var7;
      if (var7 == this) {
         var6 = null;
      }

      var7 = FocusFinder.getInstance().findNextFocus(this, var6, var1);
      int var3 = this.getMaxScrollAmount();
      if (var7 != null && this.n(var7, var3, this.getHeight())) {
         Rect var9 = this.c;
         var7.getDrawingRect(var9);
         this.offsetDescendantRectToMyCoords(var7, var9);
         this.t(this.h(var9), -1, (MotionEvent)null, 0, 1, true);
         var7.requestFocus(var1);
      } else {
         int var2;
         if (var1 == 33 && this.getScrollY() < var3) {
            var2 = this.getScrollY();
         } else {
            var2 = var3;
            if (var1 == 130) {
               var2 = var3;
               if (this.getChildCount() > 0) {
                  var7 = this.getChildAt(0);
                  FrameLayout.LayoutParams var8 = (FrameLayout.LayoutParams)var7.getLayoutParams();
                  int var4 = var7.getBottom();
                  var2 = var8.bottomMargin;
                  int var5 = this.getScrollY();
                  var2 = Math.min(var4 + var2 - (this.getHeight() + var5 - this.getPaddingBottom()), var3);
               }
            }
         }

         if (var2 == 0) {
            return false;
         }

         if (var1 != 130) {
            var2 = -var2;
         }

         this.t(var2, -1, (MotionEvent)null, 0, 1, true);
      }

      if (var6 != null && var6.isFocused() && !this.n(var6, 0, this.getHeight())) {
         var1 = this.getDescendantFocusability();
         this.setDescendantFocusability(131072);
         this.requestFocus();
         this.setDescendantFocusability(var1);
      }

      return true;
   }

   public float getBottomFadingEdgeStrength() {
      if (this.getChildCount() == 0) {
         return 0.0F;
      } else {
         View var5 = this.getChildAt(0);
         FrameLayout.LayoutParams var4 = (FrameLayout.LayoutParams)var5.getLayoutParams();
         int var1 = this.getVerticalFadingEdgeLength();
         int var3 = this.getHeight();
         int var2 = this.getPaddingBottom();
         var2 = var5.getBottom() + var4.bottomMargin - this.getScrollY() - (var3 - var2);
         return var2 < var1 ? (float)var2 / (float)var1 : 1.0F;
      }
   }

   public int getMaxScrollAmount() {
      return (int)((float)this.getHeight() * 0.5F);
   }

   public int getNestedScrollAxes() {
      v var2 = this.y;
      int var1 = var2.a;
      return var2.b | var1;
   }

   public int getScrollRange() {
      int var2 = this.getChildCount();
      int var1 = 0;
      if (var2 > 0) {
         View var3 = this.getChildAt(0);
         FrameLayout.LayoutParams var4 = (FrameLayout.LayoutParams)var3.getLayoutParams();
         var1 = Math.max(0, var3.getHeight() + var4.topMargin + var4.bottomMargin - (this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()));
      }

      return var1;
   }

   public float getTopFadingEdgeStrength() {
      if (this.getChildCount() == 0) {
         return 0.0F;
      } else {
         int var2 = this.getVerticalFadingEdgeLength();
         int var1 = this.getScrollY();
         return var1 < var2 ? (float)var1 / (float)var2 : 1.0F;
      }
   }

   public float getVerticalScrollFactorCompat() {
      if (this.A == 0.0F) {
         TypedValue var1 = new TypedValue();
         Context var2 = this.getContext();
         if (!var2.getTheme().resolveAttribute(16842829, var1, true)) {
            throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
         }

         this.A = var1.getDimension(var2.getResources().getDisplayMetrics());
      }

      return this.A;
   }

   public final int h(Rect var1) {
      int var2 = this.getChildCount();
      byte var6 = 0;
      if (var2 == 0) {
         return 0;
      } else {
         int var7 = this.getHeight();
         var2 = this.getScrollY();
         int var5 = var2 + var7;
         int var4 = this.getVerticalFadingEdgeLength();
         int var3 = var2;
         if (var1.top > 0) {
            var3 = var2 + var4;
         }

         View var10 = this.getChildAt(0);
         FrameLayout.LayoutParams var9 = (FrameLayout.LayoutParams)var10.getLayoutParams();
         if (var1.bottom < var10.getHeight() + var9.topMargin + var9.bottomMargin) {
            var4 = var5 - var4;
         } else {
            var4 = var5;
         }

         int var8 = var1.bottom;
         if (var8 > var4 && var1.top > var3) {
            if (var1.height() > var7) {
               var2 = var1.top - var3;
            } else {
               var2 = var1.bottom - var4;
            }

            var2 = Math.min(var2, var10.getBottom() + var9.bottomMargin - var5);
         } else {
            var2 = var6;
            if (var1.top < var3) {
               var2 = var6;
               if (var8 < var4) {
                  if (var1.height() > var7) {
                     var2 = 0 - (var4 - var1.bottom);
                  } else {
                     var2 = 0 - (var3 - var1.top);
                  }

                  var2 = Math.max(var2, -this.getScrollY());
               }
            }
         }

         return var2;
      }
   }

   public final boolean hasNestedScrollingParent() {
      s var2 = this.z;
      boolean var1 = false;
      if (var2.c(0) != null) {
         var1 = true;
      }

      return var1;
   }

   public final boolean i(int var1, int var2, int var3, int[] var4, int[] var5) {
      s var14 = this.z;
      boolean var10 = var14.d;
      boolean var9 = false;
      boolean var8 = var9;
      if (var10) {
         ViewParent var13 = var14.c(var3);
         if (var13 == null) {
            var8 = var9;
         } else if (var1 == 0 && var2 == 0) {
            var8 = var9;
            if (var5 != null) {
               var5[0] = 0;
               var5[1] = 0;
               var8 = var9;
            }
         } else {
            NestedScrollView var12 = var14.c;
            int var6;
            int var7;
            if (var5 != null) {
               var12.getLocationInWindow(var5);
               var6 = var5[0];
               var7 = var5[1];
            } else {
               var6 = 0;
               var7 = 0;
            }

            int[] var11 = var4;
            if (var4 == null) {
               if (var14.e == null) {
                  var14.e = new int[2];
               }

               var11 = var14.e;
            }

            var11[0] = 0;
            var11[1] = 0;
            if (var13 instanceof t) {
               ((t)var13).a(var1, var2, var11, var3);
            } else if (var3 == 0) {
               try {
                  var13.onNestedPreScroll(var12, var1, var2, var11);
               } catch (AbstractMethodError var15) {
                  StringBuilder var16 = new StringBuilder("ViewParent ");
                  var16.append(var13);
                  var16.append(" does not implement interface method onNestedPreScroll");
                  Log.e("ViewParentCompat", var16.toString(), var15);
               }
            }

            if (var5 != null) {
               var12.getLocationInWindow(var5);
               var5[0] -= var6;
               var5[1] -= var7;
            }

            if (var11[0] == 0) {
               var8 = var9;
               if (var11[1] == 0) {
                  return var8;
               }
            }

            var8 = true;
         }
      }

      return var8;
   }

   public final boolean isNestedScrollingEnabled() {
      return this.z.d;
   }

   public final boolean j(KeyEvent var1) {
      this.c.setEmpty();
      int var3 = this.getChildCount();
      boolean var6 = false;
      boolean var5 = false;
      short var2 = 130;
      boolean var4;
      View var7;
      if (var3 > 0) {
         var7 = this.getChildAt(0);
         FrameLayout.LayoutParams var8 = (FrameLayout.LayoutParams)var7.getLayoutParams();
         if (var7.getHeight() + var8.topMargin + var8.bottomMargin > this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()) {
            var4 = var5;
            if (var1.getAction() == 0) {
               var3 = var1.getKeyCode();
               if (var3 != 19) {
                  if (var3 != 20) {
                     if (var3 != 62) {
                        if (var3 != 92) {
                           if (var3 != 93) {
                              if (var3 != 122) {
                                 if (var3 != 123) {
                                    var4 = var5;
                                 } else {
                                    this.r(130);
                                    var4 = var5;
                                 }
                              } else {
                                 this.r(33);
                                 var4 = var5;
                              }
                           } else {
                              var4 = this.l(130);
                           }
                        } else {
                           var4 = this.l(33);
                        }
                     } else {
                        if (var1.isShiftPressed()) {
                           var2 = 33;
                        }

                        this.r(var2);
                        var4 = var5;
                     }
                  } else if (var1.isAltPressed()) {
                     var4 = this.l(130);
                  } else {
                     var4 = this.g(130);
                  }
               } else if (var1.isAltPressed()) {
                  var4 = this.l(33);
               } else {
                  var4 = this.g(33);
               }
            }

            return var4;
         }
      }

      var4 = var6;
      if (this.isFocused()) {
         var4 = var6;
         if (var1.getKeyCode() != 4) {
            var7 = this.findFocus();
            View var9 = var7;
            if (var7 == this) {
               var9 = null;
            }

            var9 = FocusFinder.getInstance().findNextFocus(this, var9, 130);
            var4 = var6;
            if (var9 != null) {
               var4 = var6;
               if (var9 != this) {
                  var4 = var6;
                  if (var9.requestFocus(130)) {
                     var4 = true;
                  }
               }
            }
         }
      }

      return var4;
   }

   public final void k(int var1) {
      if (this.getChildCount() > 0) {
         this.d.fling(this.getScrollX(), this.getScrollY(), 0, var1, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
         this.w(2, 1);
         this.w = this.getScrollY();
         this.postInvalidateOnAnimation();
         if (VERSION.SDK_INT >= 35) {
            androidx.core.widget.f.a(this, Math.abs(this.d.getCurrVelocity()));
         }
      }

   }

   public final boolean l(int var1) {
      boolean var2;
      if (var1 == 130) {
         var2 = true;
      } else {
         var2 = false;
      }

      int var3 = this.getHeight();
      Rect var6 = this.c;
      var6.top = 0;
      var6.bottom = var3;
      if (var2) {
         int var8 = this.getChildCount();
         if (var8 > 0) {
            View var5 = this.getChildAt(var8 - 1);
            FrameLayout.LayoutParams var7 = (FrameLayout.LayoutParams)var5.getLayoutParams();
            var8 = var5.getBottom();
            int var4 = var7.bottomMargin;
            var8 = this.getPaddingBottom() + var8 + var4;
            var6.bottom = var8;
            var6.top = var8 - var3;
         }
      }

      return this.s(var1, var6.top, var6.bottom);
   }

   public final void measureChild(View var1, int var2, int var3) {
      ViewGroup.LayoutParams var4 = var1.getLayoutParams();
      var3 = this.getPaddingLeft();
      var1.measure(ViewGroup.getChildMeasureSpec(var2, this.getPaddingRight() + var3, var4.width), MeasureSpec.makeMeasureSpec(0, 0));
   }

   public final void measureChildWithMargins(View var1, int var2, int var3, int var4, int var5) {
      ViewGroup.MarginLayoutParams var6 = (ViewGroup.MarginLayoutParams)var1.getLayoutParams();
      var4 = this.getPaddingLeft();
      var1.measure(ViewGroup.getChildMeasureSpec(var2, this.getPaddingRight() + var4 + var6.leftMargin + var6.rightMargin + var3, var6.width), MeasureSpec.makeMeasureSpec(var6.topMargin + var6.bottomMargin, 0));
   }

   public final boolean n(View var1, int var2, int var3) {
      Rect var5 = this.c;
      var1.getDrawingRect(var5);
      this.offsetDescendantRectToMyCoords(var1, var5);
      boolean var4;
      if (var5.bottom + var2 >= this.getScrollY() && var5.top - var2 <= this.getScrollY() + var3) {
         var4 = true;
      } else {
         var4 = false;
      }

      return var4;
   }

   public final void o(int var1, int var2, int[] var3) {
      int var4 = this.getScrollY();
      this.scrollBy(0, var1);
      var4 = this.getScrollY() - var4;
      if (var3 != null) {
         var3[1] += var4;
      }

      this.z.b(0, var4, 0, var1 - var4, (int[])null, var2, var3);
   }

   public final void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.j = false;
   }

   public final boolean onGenericMotionEvent(MotionEvent var1) {
      if (var1.getAction() == 8 && !this.l) {
         boolean var6;
         if ((var1.getSource() & 2) == 2) {
            var6 = true;
         } else {
            var6 = false;
         }

         float var2;
         byte var7;
         int var27;
         if (var6) {
            var2 = var1.getAxisValue(9);
            var27 = (int)var1.getX();
            var7 = 9;
         } else if ((var1.getSource() & 4194304) == 4194304) {
            var2 = var1.getAxisValue(26);
            var27 = this.getWidth() / 2;
            var7 = 26;
         } else {
            var2 = 0.0F;
            var27 = 0;
            var7 = 0;
         }

         if (var2 != 0.0F) {
            int var8 = (int)(this.getVerticalScrollFactorCompat() * var2);
            boolean var17;
            if ((var1.getSource() & 8194) == 8194) {
               var17 = true;
            } else {
               var17 = false;
            }

            this.t(-var8, var7, var1, var27, 1, var17);
            if (var7 != 0) {
               D.j var18 = this.B;
               var18.getClass();
               int var11 = var1.getSource();
               int var10 = var1.getDeviceId();
               var27 = var18.f;
               int[] var19 = var18.h;
               int var9;
               if (var27 == var11 && var18.g == var10 && var18.e == var7) {
                  var6 = false;
               } else {
                  Context var21 = var18.a;
                  ViewConfiguration var20 = ViewConfiguration.get(var21);
                  var8 = var1.getDeviceId();
                  var27 = var1.getSource();
                  var9 = VERSION.SDK_INT;
                  int var12;
                  InputDevice var22;
                  if (var9 >= 34) {
                     var12 = V.a;
                     var27 = D.C.f(var20, var8, var7, var27);
                  } else {
                     label232: {
                        var12 = V.a;
                        var22 = InputDevice.getDevice(var8);
                        if (var22 != null && var22.getMotionRange(var7, var27) != null) {
                           Resources var31 = var21.getResources();
                           if (var27 == 4194304 && var7 == 26) {
                              var27 = var31.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android");
                           } else {
                              var27 = -1;
                           }

                           Objects.requireNonNull(var20);
                           if (var27 == -1) {
                              var27 = var20.getScaledMinimumFlingVelocity();
                              break label232;
                           }

                           if (var27 != 0) {
                              var8 = var31.getDimensionPixelSize(var27);
                              var27 = var8;
                              if (var8 >= 0) {
                                 break label232;
                              }
                           }
                        }

                        var27 = Integer.MAX_VALUE;
                     }
                  }

                  var19[0] = var27;
                  var27 = var1.getDeviceId();
                  var8 = var1.getSource();
                  if (var9 >= 34) {
                     var27 = D.C.e(var20, var27, var7, var8);
                  } else {
                     var22 = InputDevice.getDevice(var27);
                     if (var22 != null && var22.getMotionRange(var7, var8) != null) {
                        var6 = true;
                     } else {
                        var6 = false;
                     }

                     var9 = Integer.MIN_VALUE;
                     if (!var6) {
                        var27 = var9;
                     } else {
                        Resources var29 = var21.getResources();
                        if (var8 == 4194304 && var7 == 26) {
                           var8 = var29.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
                        } else {
                           var8 = -1;
                        }

                        Objects.requireNonNull(var20);
                        if (var8 != -1) {
                           var27 = var9;
                           if (var8 != 0) {
                              var27 = var29.getDimensionPixelSize(var8);
                              if (var27 < 0) {
                                 var27 = var9;
                              }
                           }
                        } else {
                           var27 = var20.getScaledMaximumFlingVelocity();
                        }
                     }
                  }

                  var19[1] = var27;
                  var18.f = var11;
                  var18.g = var10;
                  var18.e = var7;
                  var6 = true;
               }

               if (var19[0] == Integer.MAX_VALUE) {
                  VelocityTracker var23 = var18.c;
                  if (var23 != null) {
                     var23.recycle();
                     var18.c = null;
                  }
               } else {
                  if (var18.c == null) {
                     var18.c = VelocityTracker.obtain();
                  }

                  VelocityTracker var28 = var18.c;
                  Map var30 = D.D.a;
                  var28.addMovement(var1);
                  long var13;
                  if (VERSION.SDK_INT < 34 && var1.getSource() == 4194304) {
                     var30 = D.D.a;
                     if (!var30.containsKey(var28)) {
                        var30.put(var28, new E());
                     }

                     E var34 = (E)var30.get(var28);
                     var34.getClass();
                     var13 = var1.getEventTime();
                     var8 = var34.d;
                     long[] var32 = var34.b;
                     if (var8 != 0 && var13 - var32[var34.e] > 40L) {
                        var34.d = 0;
                        var34.c = 0.0F;
                     }

                     var8 = (var34.e + 1) % 20;
                     var34.e = var8;
                     var9 = var34.d;
                     if (var9 != 20) {
                        var34.d = var9 + 1;
                     }

                     var2 = var1.getAxisValue(26);
                     var34.a[var8] = var2;
                     var32[var34.e] = var13;
                  }

                  var28.computeCurrentVelocity(1000, Float.MAX_VALUE);
                  E var33 = (E)D.D.a.get(var28);
                  float var3;
                  if (var33 != null) {
                     label195: {
                        var8 = var33.d;
                        if (var8 >= 2) {
                           var9 = var33.e;
                           var8 = (var9 + 20 - (var8 - 1)) % 20;
                           long[] var35 = var33.b;
                           long var15 = var35[var9];

                           while(true) {
                              var13 = var35[var8];
                              if (var15 - var13 <= 100L) {
                                 var9 = var33.d;
                                 if (var9 >= 2) {
                                    float[] var24 = var33.a;
                                    if (var9 != 2) {
                                       var2 = 0.0F;
                                       var9 = 0;
                                       var10 = 0;

                                       while(true) {
                                          var11 = var33.d;
                                          var3 = 1.0F;
                                          if (var9 >= var11 - 1) {
                                             if (var2 < 0.0F) {
                                                var3 = -1.0F;
                                             }

                                             var2 = (float)Math.sqrt((double)(Math.abs(var2) * 2.0F)) * var3;
                                             break label195;
                                          }

                                          var11 = var9 + var8;
                                          var13 = var35[var11 % 20];
                                          var11 = (var11 + 1) % 20;
                                          if (var35[var11] != var13) {
                                             ++var10;
                                             if (var2 < 0.0F) {
                                                var3 = -1.0F;
                                             }

                                             float var4 = (float)Math.sqrt((double)(Math.abs(var2) * 2.0F));
                                             float var5 = var24[var11] / (float)(var35[var11] - var13);
                                             var3 = Math.abs(var5) * (var5 - var3 * var4) + var2;
                                             var2 = var3;
                                             if (var10 == 1) {
                                                var2 = var3 * 0.5F;
                                             }
                                          }

                                          ++var9;
                                       }
                                    }

                                    var8 = (var8 + 1) % 20;
                                    var15 = var35[var8];
                                    if (var13 != var15) {
                                       var2 = var24[var8] / (float)(var15 - var13);
                                       break label195;
                                    }
                                 }
                                 break;
                              }

                              --var33.d;
                              var8 = (var8 + 1) % 20;
                           }
                        }

                        var2 = 0.0F;
                     }

                     var2 *= (float)1000;
                     var33.c = var2;
                     if (var2 < -Math.abs(Float.MAX_VALUE)) {
                        var33.c = -Math.abs(Float.MAX_VALUE);
                     } else if (var33.c > Math.abs(Float.MAX_VALUE)) {
                        var33.c = Math.abs(Float.MAX_VALUE);
                     }
                  }

                  if (VERSION.SDK_INT >= 34) {
                     var2 = D.C.b(var28, var7);
                  } else if (var7 == 0) {
                     var2 = var28.getXVelocity();
                  } else if (var7 == 1) {
                     var2 = var28.getYVelocity();
                  } else {
                     E var25 = (E)D.D.a.get(var28);
                     if (var25 != null && var7 == 26) {
                        var2 = var25.c;
                     } else {
                        var2 = 0.0F;
                     }
                  }

                  NestedScrollView var26 = (NestedScrollView)var18.b.b;
                  var3 = var2 * -var26.getVerticalScrollFactorCompat();
                  var2 = Math.signum(var3);
                  if (var6 || var2 != Math.signum(var18.d) && var2 != 0.0F) {
                     var26.d.abortAnimation();
                  }

                  if (!(Math.abs(var3) < (float)var19[0])) {
                     var27 = var19[1];
                     var2 = Math.max((float)(-var27), Math.min(var3, (float)var27));
                     if (var2 == 0.0F) {
                        var2 = 0.0F;
                     } else {
                        var26.d.abortAnimation();
                        var26.k((int)var2);
                     }

                     var18.d = var2;
                  }
               }
            }

            return true;
         }
      }

      return false;
   }

   public final boolean onInterceptTouchEvent(MotionEvent var1) {
      int var2 = var1.getAction();
      boolean var7 = true;
      boolean var6 = true;
      if (var2 == 2 && this.l) {
         return true;
      } else {
         var2 &= 255;
         int var3;
         VelocityTracker var9;
         if (var2 != 0) {
            if (var2 != 1) {
               if (var2 == 2) {
                  var2 = this.s;
                  if (var2 != -1) {
                     var3 = var1.findPointerIndex(var2);
                     if (var3 == -1) {
                        StringBuilder var10 = new StringBuilder("Invalid pointerId=");
                        var10.append(var2);
                        var10.append(" in onInterceptTouchEvent");
                        Log.e("NestedScrollView", var10.toString());
                     } else {
                        var2 = (int)var1.getY(var3);
                        if (Math.abs(var2 - this.h) > this.p && (2 & this.getNestedScrollAxes()) == 0) {
                           this.l = true;
                           this.h = var2;
                           if (this.m == null) {
                              this.m = VelocityTracker.obtain();
                           }

                           this.m.addMovement(var1);
                           this.v = 0;
                           ViewParent var11 = this.getParent();
                           if (var11 != null) {
                              var11.requestDisallowInterceptTouchEvent(true);
                           }

                           return this.l;
                        }
                     }

                     return this.l;
                  }

                  return this.l;
               }

               if (var2 != 3) {
                  if (var2 == 6) {
                     this.p(var1);
                  }

                  return this.l;
               }
            }

            this.l = false;
            this.s = -1;
            var9 = this.m;
            if (var9 != null) {
               var9.recycle();
               this.m = null;
            }

            if (this.d.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
               this.postInvalidateOnAnimation();
            }

            this.y(0);
         } else {
            var3 = (int)var1.getY();
            var2 = (int)var1.getX();
            boolean var5;
            if (this.getChildCount() > 0) {
               int var4 = this.getScrollY();
               View var8 = this.getChildAt(0);
               if (var3 >= var8.getTop() - var4 && var3 < var8.getBottom() - var4 && var2 >= var8.getLeft() && var2 < var8.getRight()) {
                  this.h = var3;
                  this.s = var1.getPointerId(0);
                  VelocityTracker var12 = this.m;
                  if (var12 == null) {
                     this.m = VelocityTracker.obtain();
                  } else {
                     var12.clear();
                  }

                  this.m.addMovement(var1);
                  this.d.computeScrollOffset();
                  var5 = var6;
                  if (!this.x(var1)) {
                     if (!this.d.isFinished()) {
                        var5 = var6;
                     } else {
                        var5 = false;
                     }
                  }

                  this.l = var5;
                  this.w(2, 0);
                  return this.l;
               }
            }

            var5 = var7;
            if (!this.x(var1)) {
               if (!this.d.isFinished()) {
                  var5 = var7;
               } else {
                  var5 = false;
               }
            }

            this.l = var5;
            var9 = this.m;
            if (var9 != null) {
               var9.recycle();
               this.m = null;
            }
         }

         return this.l;
      }
   }

   public final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      byte var6 = 0;
      this.i = false;
      View var7 = this.k;
      if (var7 != null && m(var7, this)) {
         var7 = this.k;
         Rect var8 = this.c;
         var7.getDrawingRect(var8);
         this.offsetDescendantRectToMyCoords(var7, var8);
         var2 = this.h(var8);
         if (var2 != 0) {
            this.scrollBy(0, var2);
         }
      }

      this.k = null;
      if (!this.j) {
         if (this.x != null) {
            this.scrollTo(this.getScrollX(), this.x.a);
            this.x = null;
         }

         if (this.getChildCount() > 0) {
            var7 = this.getChildAt(0);
            FrameLayout.LayoutParams var9 = (FrameLayout.LayoutParams)var7.getLayoutParams();
            var4 = var7.getMeasuredHeight() + var9.topMargin + var9.bottomMargin;
         } else {
            var4 = 0;
         }

         var5 = var5 - var3 - this.getPaddingTop() - this.getPaddingBottom();
         var3 = this.getScrollY();
         var2 = var6;
         if (var5 < var4) {
            if (var3 < 0) {
               var2 = var6;
            } else if (var5 + var3 > var4) {
               var2 = var4 - var5;
            } else {
               var2 = var3;
            }
         }

         if (var2 != var3) {
            this.scrollTo(this.getScrollX(), var2);
         }
      }

      this.scrollTo(this.getScrollX(), this.getScrollY());
      this.j = true;
   }

   public final void onMeasure(int var1, int var2) {
      super.onMeasure(var1, var2);
      if (this.n) {
         if (MeasureSpec.getMode(var2) != 0) {
            if (this.getChildCount() > 0) {
               View var5 = this.getChildAt(0);
               FrameLayout.LayoutParams var4 = (FrameLayout.LayoutParams)var5.getLayoutParams();
               int var3 = var5.getMeasuredHeight();
               var2 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom() - var4.topMargin - var4.bottomMargin;
               if (var3 < var2) {
                  var3 = this.getPaddingLeft();
                  var5.measure(ViewGroup.getChildMeasureSpec(var1, this.getPaddingRight() + var3 + var4.leftMargin + var4.rightMargin, var4.width), MeasureSpec.makeMeasureSpec(var2, 1073741824));
               }
            }

         }
      }
   }

   public final boolean onNestedFling(View var1, float var2, float var3, boolean var4) {
      if (!var4) {
         this.dispatchNestedFling(0.0F, var3, true);
         this.k((int)var3);
         return true;
      } else {
         return false;
      }
   }

   public final boolean onNestedPreFling(View var1, float var2, float var3) {
      return this.z.a(var2, var3);
   }

   public final void onNestedPreScroll(View var1, int var2, int var3, int[] var4) {
      this.i(var2, var3, 0, var4, (int[])null);
   }

   public final void onNestedScroll(View var1, int var2, int var3, int var4, int var5) {
      this.o(var5, 0, (int[])null);
   }

   public final void onNestedScrollAccepted(View var1, View var2, int var3) {
      this.b(var1, var2, var3, 0);
   }

   public final void onOverScrolled(int var1, int var2, boolean var3, boolean var4) {
      super.scrollTo(var1, var2);
   }

   public final boolean onRequestFocusInDescendants(int var1, Rect var2) {
      int var3;
      if (var1 == 2) {
         var3 = 130;
      } else {
         var3 = var1;
         if (var1 == 1) {
            var3 = 33;
         }
      }

      View var4;
      if (var2 == null) {
         var4 = FocusFinder.getInstance().findNextFocus(this, (View)null, var3);
      } else {
         var4 = FocusFinder.getInstance().findNextFocusFromRect(this, var2, var3);
      }

      if (var4 == null) {
         return false;
      } else {
         return !this.n(var4, 0, this.getHeight()) ? false : var4.requestFocus(var3, var2);
      }
   }

   public final void onRestoreInstanceState(Parcelable var1) {
      if (!(var1 instanceof SavedState)) {
         super.onRestoreInstanceState(var1);
      } else {
         SavedState var2 = (SavedState)var1;
         super.onRestoreInstanceState(var2.getSuperState());
         this.x = var2;
         this.requestLayout();
      }
   }

   public final Parcelable onSaveInstanceState() {
      View.BaseSavedState var1 = new View.BaseSavedState(super.onSaveInstanceState());
      var1.a = this.getScrollY();
      return var1;
   }

   public final void onScrollChanged(int var1, int var2, int var3, int var4) {
      super.onScrollChanged(var1, var2, var3, var4);
   }

   public final void onSizeChanged(int var1, int var2, int var3, int var4) {
      super.onSizeChanged(var1, var2, var3, var4);
      View var6 = this.findFocus();
      if (var6 != null && this != var6 && this.n(var6, 0, var4)) {
         Rect var5 = this.c;
         var6.getDrawingRect(var5);
         this.offsetDescendantRectToMyCoords(var6, var5);
         var1 = this.h(var5);
         if (var1 != 0) {
            if (this.o) {
               this.v(0, var1, false);
            } else {
               this.scrollBy(0, var1);
            }
         }
      }

   }

   public final boolean onStartNestedScroll(View var1, View var2, int var3) {
      return this.f(var1, var2, var3, 0);
   }

   public final void onStopNestedScroll(View var1) {
      this.c(var1, 0);
   }

   public final boolean onTouchEvent(MotionEvent var1) {
      if (this.m == null) {
         this.m = VelocityTracker.obtain();
      }

      int var5 = var1.getActionMasked();
      if (var5 == 0) {
         this.v = 0;
      }

      MotionEvent var9 = MotionEvent.obtain(var1);
      float var3 = (float)this.v;
      float var2 = 0.0F;
      var9.offsetLocation(0.0F, var3);
      int var6;
      VelocityTracker var12;
      ViewParent var14;
      if (var5 != 0) {
         EdgeEffect var11 = this.f;
         EdgeEffect var10 = this.e;
         if (var5 != 1) {
            if (var5 != 2) {
               if (var5 != 3) {
                  if (var5 != 5) {
                     if (var5 == 6) {
                        this.p(var1);
                        this.h = (int)var1.getY(var1.findPointerIndex(this.s));
                     }
                  } else {
                     var5 = var1.getActionIndex();
                     this.h = (int)var1.getY(var5);
                     this.s = var1.getPointerId(var5);
                  }
               } else {
                  if (this.l && this.getChildCount() > 0 && this.d.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                     this.postInvalidateOnAnimation();
                  }

                  this.s = -1;
                  this.l = false;
                  var12 = this.m;
                  if (var12 != null) {
                     var12.recycle();
                     this.m = null;
                  }

                  this.y(0);
                  this.e.onRelease();
                  this.f.onRelease();
               }
            } else {
               int var8 = var1.findPointerIndex(this.s);
               if (var8 == -1) {
                  StringBuilder var13 = new StringBuilder("Invalid pointerId=");
                  var13.append(this.s);
                  var13.append(" in onTouchEvent");
                  Log.e("NestedScrollView", var13.toString());
               } else {
                  int var7 = (int)var1.getY(var8);
                  var5 = this.h - var7;
                  float var4 = var1.getX(var8) / (float)this.getWidth();
                  var3 = (float)var5 / (float)this.getHeight();
                  if (C.b.m(var10) != 0.0F) {
                     var3 = -C.b.z(var10, -var3, var4);
                     var2 = var3;
                     if (C.b.m(var10) == 0.0F) {
                        var10.onRelease();
                        var2 = var3;
                     }
                  } else if (C.b.m(var11) != 0.0F) {
                     var3 = C.b.z(var11, var3, 1.0F - var4);
                     var2 = var3;
                     if (C.b.m(var11) == 0.0F) {
                        var11.onRelease();
                        var2 = var3;
                     }
                  }

                  var6 = Math.round(var2 * (float)this.getHeight());
                  if (var6 != 0) {
                     this.invalidate();
                  }

                  var6 = var5 - var6;
                  var5 = var6;
                  if (!this.l) {
                     var5 = var6;
                     if (Math.abs(var6) > this.p) {
                        var14 = this.getParent();
                        if (var14 != null) {
                           var14.requestDisallowInterceptTouchEvent(true);
                        }

                        this.l = true;
                        if (var6 > 0) {
                           var5 = var6 - this.p;
                        } else {
                           var5 = var6 + this.p;
                        }
                     }
                  }

                  if (this.l) {
                     var5 = this.t(var5, 1, var1, (int)var1.getX(var8), 0, false);
                     this.h = var7 - var5;
                     this.v += var5;
                  }
               }
            }
         } else {
            var12 = this.m;
            var12.computeCurrentVelocity(1000, (float)this.r);
            var5 = (int)var12.getYVelocity(this.s);
            if (Math.abs(var5) >= this.q) {
               if (C.b.m(var10) != 0.0F) {
                  if (this.u(var10, var5)) {
                     var10.onAbsorb(var5);
                  } else {
                     this.k(-var5);
                  }
               } else if (C.b.m(var11) != 0.0F) {
                  var5 = -var5;
                  if (this.u(var11, var5)) {
                     var11.onAbsorb(var5);
                  } else {
                     this.k(var5);
                  }
               } else {
                  var5 = -var5;
                  var2 = (float)var5;
                  if (!this.z.a(0.0F, var2)) {
                     this.dispatchNestedFling(0.0F, var2, true);
                     this.k(var5);
                  }
               }
            } else if (this.d.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
               this.postInvalidateOnAnimation();
            }

            this.s = -1;
            this.l = false;
            var12 = this.m;
            if (var12 != null) {
               var12.recycle();
               this.m = null;
            }

            this.y(0);
            this.e.onRelease();
            this.f.onRelease();
         }
      } else {
         if (this.getChildCount() == 0) {
            return false;
         }

         if (this.l) {
            var14 = this.getParent();
            if (var14 != null) {
               var14.requestDisallowInterceptTouchEvent(true);
            }
         }

         if (!this.d.isFinished()) {
            this.d.abortAnimation();
            this.y(1);
         }

         var6 = (int)var1.getY();
         var5 = var1.getPointerId(0);
         this.h = var6;
         this.s = var5;
         this.w(2, 0);
      }

      var12 = this.m;
      if (var12 != null) {
         var12.addMovement(var9);
      }

      var9.recycle();
      return true;
   }

   public final void p(MotionEvent var1) {
      int var2 = var1.getActionIndex();
      if (var1.getPointerId(var2) == this.s) {
         byte var4;
         if (var2 == 0) {
            var4 = 1;
         } else {
            var4 = 0;
         }

         this.h = (int)var1.getY(var4);
         this.s = var1.getPointerId(var4);
         VelocityTracker var3 = this.m;
         if (var3 != null) {
            var3.clear();
         }
      }

   }

   public final boolean q(int var1, int var2, int var3, int var4) {
      this.getOverScrollMode();
      super.computeHorizontalScrollRange();
      super.computeHorizontalScrollExtent();
      this.computeVerticalScrollRange();
      super.computeVerticalScrollExtent();
      boolean var6 = true;
      var3 += var1;
      boolean var7;
      if (var2 <= 0 && var2 >= 0) {
         var7 = false;
      } else {
         var2 = 0;
         var7 = true;
      }

      boolean var8;
      label33: {
         if (var3 <= var4) {
            if (var3 >= 0) {
               var4 = var3;
               var8 = false;
               break label33;
            }

            var4 = 0;
         }

         var8 = true;
      }

      if (var8 && this.z.c(1) == null) {
         this.d.springBack(var2, var4, 0, 0, 0, this.getScrollRange());
      }

      super.scrollTo(var2, var4);
      boolean var5 = var6;
      if (!var7) {
         if (var8) {
            var5 = var6;
         } else {
            var5 = false;
         }
      }

      return var5;
   }

   public final void r(int var1) {
      boolean var2;
      if (var1 == 130) {
         var2 = true;
      } else {
         var2 = false;
      }

      int var3 = this.getHeight();
      Rect var6 = this.c;
      int var8;
      if (var2) {
         var6.top = this.getScrollY() + var3;
         var8 = this.getChildCount();
         if (var8 > 0) {
            View var7 = this.getChildAt(var8 - 1);
            FrameLayout.LayoutParams var5 = (FrameLayout.LayoutParams)var7.getLayoutParams();
            var8 = var7.getBottom();
            int var4 = var5.bottomMargin;
            var8 = this.getPaddingBottom() + var8 + var4;
            if (var6.top + var3 > var8) {
               var6.top = var8 - var3;
            }
         }
      } else {
         var8 = this.getScrollY() - var3;
         var6.top = var8;
         if (var8 < 0) {
            var6.top = 0;
         }
      }

      var8 = var6.top;
      var3 += var8;
      var6.bottom = var3;
      this.s(var1, var8, var3);
   }

   public final void requestChildFocus(View var1, View var2) {
      if (!this.i) {
         Rect var4 = this.c;
         var2.getDrawingRect(var4);
         this.offsetDescendantRectToMyCoords(var2, var4);
         int var3 = this.h(var4);
         if (var3 != 0) {
            this.scrollBy(0, var3);
         }
      } else {
         this.k = var2;
      }

      super.requestChildFocus(var1, var2);
   }

   public final boolean requestChildRectangleOnScreen(View var1, Rect var2, boolean var3) {
      var2.offset(var1.getLeft() - var1.getScrollX(), var1.getTop() - var1.getScrollY());
      int var4 = this.h(var2);
      boolean var5;
      if (var4 != 0) {
         var5 = true;
      } else {
         var5 = false;
      }

      if (var5) {
         if (var3) {
            this.scrollBy(0, var4);
         } else {
            this.v(0, var4, false);
         }
      }

      return var5;
   }

   public final void requestDisallowInterceptTouchEvent(boolean var1) {
      if (var1) {
         VelocityTracker var2 = this.m;
         if (var2 != null) {
            var2.recycle();
            this.m = null;
         }
      }

      super.requestDisallowInterceptTouchEvent(var1);
   }

   public final void requestLayout() {
      this.i = true;
      super.requestLayout();
   }

   public final boolean s(int var1, int var2, int var3) {
      int var4 = this.getHeight();
      int var10 = this.getScrollY();
      int var11 = var4 + var10;
      boolean var6;
      if (var1 == 33) {
         var6 = true;
      } else {
         var6 = false;
      }

      ArrayList var18 = this.getFocusables(2);
      int var12 = var18.size();
      Object var17 = null;
      int var7 = 0;

      boolean var5;
      for(boolean var8 = false; var7 < var12; var8 = var5) {
         View var16 = (View)var18.get(var7);
         int var9 = var16.getTop();
         int var13 = var16.getBottom();
         Object var15 = var17;
         var5 = var8;
         if (var2 < var13) {
            var15 = var17;
            var5 = var8;
            if (var9 < var3) {
               boolean var19;
               if (var2 < var9 && var13 < var3) {
                  var19 = true;
               } else {
                  var19 = false;
               }

               if (var17 == null) {
                  var15 = var16;
                  var5 = var19;
               } else {
                  label107: {
                     boolean var20;
                     if ((!var6 || var9 >= ((View)var17).getTop()) && (var6 || var13 <= ((View)var17).getBottom())) {
                        var20 = false;
                     } else {
                        var20 = true;
                     }

                     if (var8) {
                        var15 = var17;
                        var5 = var8;
                        if (!var19) {
                           break label107;
                        }

                        var15 = var17;
                        var5 = var8;
                        if (!var20) {
                           break label107;
                        }
                     } else {
                        if (var19) {
                           var15 = var16;
                           var5 = true;
                           break label107;
                        }

                        var15 = var17;
                        var5 = var8;
                        if (!var20) {
                           break label107;
                        }
                     }

                     var15 = var16;
                     var5 = var8;
                  }
               }
            }
         }

         ++var7;
         var17 = var15;
      }

      if (var17 == null) {
         var17 = this;
      }

      boolean var14;
      if (var2 >= var10 && var3 <= var11) {
         var14 = false;
      } else {
         if (var6) {
            var2 -= var10;
         } else {
            var2 = var3 - var11;
         }

         this.t(var2, -1, (MotionEvent)null, 0, 1, true);
         var14 = true;
      }

      if (var17 != this.findFocus()) {
         ((View)var17).requestFocus(var1);
      }

      return var14;
   }

   public final void scrollTo(int var1, int var2) {
      if (this.getChildCount() > 0) {
         View var9 = this.getChildAt(0);
         FrameLayout.LayoutParams var8 = (FrameLayout.LayoutParams)var9.getLayoutParams();
         int var7 = this.getWidth() - this.getPaddingLeft() - this.getPaddingRight();
         int var6 = var9.getWidth() + var8.leftMargin + var8.rightMargin;
         int var4 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
         int var5 = var9.getHeight() + var8.topMargin + var8.bottomMargin;
         int var3;
         if (var7 < var6 && var1 >= 0) {
            var3 = var1;
            if (var7 + var1 > var6) {
               var3 = var6 - var7;
            }
         } else {
            var3 = 0;
         }

         if (var4 < var5 && var2 >= 0) {
            var1 = var2;
            if (var4 + var2 > var5) {
               var1 = var5 - var4;
            }
         } else {
            var1 = 0;
         }

         if (var3 != this.getScrollX() || var1 != this.getScrollY()) {
            super.scrollTo(var3, var1);
         }
      }

   }

   public void setFillViewport(boolean var1) {
      if (var1 != this.n) {
         this.n = var1;
         this.requestLayout();
      }

   }

   public void setNestedScrollingEnabled(boolean var1) {
      s var2 = this.z;
      if (var2.d) {
         WeakHashMap var3 = T.a;
         L.i(var2.c);
      }

      var2.d = var1;
   }

   public void setOnScrollChangeListener(g var1) {
   }

   public void setSmoothScrollingEnabled(boolean var1) {
      this.o = var1;
   }

   public final boolean shouldDelayChildPressedState() {
      return true;
   }

   public final boolean startNestedScroll(int var1) {
      return this.w(var1, 0);
   }

   public final void stopNestedScroll() {
      this.y(0);
   }

   public final int t(int var1, int var2, MotionEvent var3, int var4, int var5, boolean var6) {
      if (var5 == 1) {
         this.w(2, var5);
      }

      int[] var16 = this.t;
      boolean var15 = this.i(0, var1, var5, this.u, var16);
      int[] var17 = this.u;
      int[] var18 = this.t;
      int var7;
      int var8;
      if (var15) {
         var8 = var1 - var17[1];
         var7 = var18[1];
      } else {
         var7 = 0;
         var8 = var1;
      }

      int var11 = this.getScrollY();
      int var10 = this.getScrollRange();
      var1 = this.getOverScrollMode();
      boolean var9;
      if ((var1 == 0 || var1 == 1 && this.getScrollRange() > 0) && !var6) {
         var9 = true;
      } else {
         var9 = false;
      }

      boolean var19;
      if (this.q(var8, 0, var11, var10) && this.z.c(var5) == null) {
         var19 = true;
      } else {
         var19 = false;
      }

      int var12 = this.getScrollY() - var11;
      if (var3 != null && var12 != 0) {
         B var21 = this.getScrollFeedbackProvider();
         int var14 = var3.getDeviceId();
         int var13 = var3.getSource();
         var21.a.b(var14, var13, var2, var12);
      }

      var17[1] = 0;
      this.z.b(0, var12, 0, var8 - var12, this.t, var5, var17);
      var12 = var18[1];
      var8 -= var17[1];
      var11 += var8;
      EdgeEffect var23 = this.f;
      EdgeEffect var22 = this.e;
      B var24;
      if (var11 < 0) {
         if (var9) {
            C.b.z(var22, (float)(-var8) / (float)this.getHeight(), (float)var4 / (float)this.getWidth());
            if (var3 != null) {
               var24 = this.getScrollFeedbackProvider();
               var4 = var3.getDeviceId();
               var8 = var3.getSource();
               var24.a.a(var4, var8, var2, true);
            }

            if (!var23.isFinished()) {
               var23.onRelease();
            }
         }
      } else if (var11 > var10 && var9) {
         C.b.z(var23, (float)var8 / (float)this.getHeight(), 1.0F - (float)var4 / (float)this.getWidth());
         if (var3 != null) {
            var24 = this.getScrollFeedbackProvider();
            var8 = var3.getDeviceId();
            var4 = var3.getSource();
            var24.a.a(var8, var4, var2, false);
         }

         if (!var22.isFinished()) {
            var22.onRelease();
         }
      }

      if (!var22.isFinished() || !var23.isFinished()) {
         this.postInvalidateOnAnimation();
         var19 = false;
      }

      if (var19 && var5 == 0) {
         VelocityTracker var20 = this.m;
         if (var20 != null) {
            var20.clear();
         }
      }

      if (var5 == 1) {
         this.y(var5);
         var22.onRelease();
         var23.onRelease();
      }

      return var7 + var12;
   }

   public final boolean u(EdgeEffect var1, int var2) {
      boolean var13 = true;
      if (var2 > 0) {
         return true;
      } else {
         float var9 = C.b.m(var1);
         float var11 = (float)this.getHeight();
         float var10 = (float)Math.abs(-var2);
         float var12 = this.a * 0.015F;
         double var5 = Math.log((double)(var10 * 0.35F / var12));
         double var7 = (double)C;
         double var3 = (double)var12;
         if (!((float)(Math.exp(var7 / (var7 - 1.0) * var5) * var3) < var9 * var11)) {
            var13 = false;
         }

         return var13;
      }
   }

   public final void v(int var1, int var2, boolean var3) {
      if (this.getChildCount() != 0) {
         if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250L) {
            View var11 = this.getChildAt(0);
            FrameLayout.LayoutParams var10 = (FrameLayout.LayoutParams)var11.getLayoutParams();
            int var9 = var11.getHeight();
            int var6 = var10.topMargin;
            int var8 = var10.bottomMargin;
            int var5 = this.getHeight();
            int var4 = this.getPaddingTop();
            int var7 = this.getPaddingBottom();
            var1 = this.getScrollY();
            var2 = Math.max(0, Math.min(var2 + var1, Math.max(0, var9 + var6 + var8 - (var5 - var4 - var7))));
            this.d.startScroll(this.getScrollX(), var1, 0, var2 - var1, 250);
            if (var3) {
               this.w(2, 1);
            } else {
               this.y(1);
            }

            this.w = this.getScrollY();
            this.postInvalidateOnAnimation();
         } else {
            if (!this.d.isFinished()) {
               this.d.abortAnimation();
               this.y(1);
            }

            this.scrollBy(var1, var2);
         }

         this.b = AnimationUtils.currentAnimationTimeMillis();
      }
   }

   public final boolean w(int var1, int var2) {
      s var10 = this.z;
      ViewParent var7 = var10.c(var2);
      boolean var5 = false;
      boolean var3;
      if (var7 != null) {
         var3 = true;
      } else {
         var3 = false;
      }

      boolean var4;
      if (!var3) {
         var4 = var5;
         if (!var10.d) {
            return var4;
         }

         NestedScrollView var9 = var10.c;
         var7 = var9.getParent();
         Object var8 = var9;

         while(true) {
            var4 = var5;
            if (var7 == null) {
               return var4;
            }

            boolean var6 = var7 instanceof t;
            if (var6) {
               var4 = ((t)var7).f((View)var8, var9, var1, var2);
            } else {
               label75: {
                  if (var2 == 0) {
                     try {
                        var4 = var7.onStartNestedScroll((View)var8, var9, var1);
                        break label75;
                     } catch (AbstractMethodError var14) {
                        StringBuilder var12 = new StringBuilder("ViewParent ");
                        var12.append(var7);
                        var12.append(" does not implement interface method onStartNestedScroll");
                        Log.e("ViewParentCompat", var12.toString(), var14);
                     }
                  }

                  var4 = false;
               }
            }

            if (var4) {
               if (var2 != 0) {
                  if (var2 == 1) {
                     var10.b = var7;
                  }
               } else {
                  var10.a = var7;
               }

               if (var6) {
                  ((t)var7).b((View)var8, var9, var1, var2);
               } else if (var2 == 0) {
                  try {
                     var7.onNestedScrollAccepted((View)var8, var9, var1);
                  } catch (AbstractMethodError var13) {
                     StringBuilder var15 = new StringBuilder("ViewParent ");
                     var15.append(var7);
                     var15.append(" does not implement interface method onNestedScrollAccepted");
                     Log.e("ViewParentCompat", var15.toString(), var13);
                  }
               }
               break;
            }

            if (var7 instanceof View) {
               var8 = (View)var7;
            }

            var7 = var7.getParent();
         }
      }

      var4 = true;
      return var4;
   }

   public final boolean x(MotionEvent var1) {
      EdgeEffect var5 = this.e;
      float var2 = C.b.m(var5);
      boolean var4 = true;
      boolean var3;
      if (var2 != 0.0F) {
         C.b.z(var5, 0.0F, var1.getX() / (float)this.getWidth());
         var3 = true;
      } else {
         var3 = false;
      }

      var5 = this.f;
      if (C.b.m(var5) != 0.0F) {
         C.b.z(var5, 0.0F, 1.0F - var1.getX() / (float)this.getWidth());
         var3 = var4;
      }

      return var3;
   }

   public final void y(int var1) {
      s var3 = this.z;
      ViewParent var4 = var3.c(var1);
      if (var4 != null) {
         boolean var2 = var4 instanceof t;
         NestedScrollView var5 = var3.c;
         if (var2) {
            ((t)var4).c(var5, var1);
         } else if (var1 == 0) {
            try {
               var4.onStopNestedScroll(var5);
            } catch (AbstractMethodError var7) {
               StringBuilder var6 = new StringBuilder("ViewParent ");
               var6.append(var4);
               var6.append(" does not implement interface method onStopNestedScroll");
               Log.e("ViewParentCompat", var6.toString(), var7);
            }
         }

         if (var1 != 0) {
            if (var1 == 1) {
               var3.b = null;
            }
         } else {
            var3.a = null;
         }
      }

   }

   public static class SavedState extends View.BaseSavedState {
      public static final Parcelable.Creator CREATOR = new Object();
      public int a;

      public SavedState(Parcel var1) {
         super(var1);
         this.a = var1.readInt();
      }

      public final String toString() {
         StringBuilder var1 = new StringBuilder("HorizontalScrollView.SavedState{");
         var1.append(Integer.toHexString(System.identityHashCode(this)));
         var1.append(" scrollPosition=");
         var1.append(this.a);
         var1.append("}");
         return var1.toString();
      }

      public void writeToParcel(Parcel var1, int var2) {
         super.writeToParcel(var1, var2);
         var1.writeInt(this.a);
      }
   }
}
