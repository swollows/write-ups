package androidx.appcompat.widget;

import D.J;
import D.L;
import D.T;
import D.Y;
import D.f0;
import D.p0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.app.V;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

public class ActionBarOverlayLayout extends ViewGroup implements q0, D.t, D.u {
   public static final int[] C = new int[]{2130903043, 16842841};
   public static final p0 D;
   public static final Rect E;
   public final D.v A;
   public final f B;
   public int a;
   public int b = 0;
   public ContentFrameLayout c;
   public ActionBarContainer d;
   public r0 e;
   public Drawable f;
   public boolean g;
   public boolean h;
   public boolean i;
   public boolean j;
   public int k;
   public int l;
   public final Rect m = new Rect();
   public final Rect n = new Rect();
   public final Rect o = new Rect();
   public final Rect p = new Rect();
   public p0 q;
   public p0 r;
   public p0 s;
   public p0 t;
   public d u;
   public OverScroller v;
   public ViewPropertyAnimator w;
   public final Y x;
   public final c y;
   public final c z;

   static {
      int var0 = VERSION.SDK_INT;
      Object var1;
      if (var0 >= 34) {
         var1 = new f0();
      } else if (var0 >= 30) {
         var1 = new D.e0();
      } else if (var0 >= 29) {
         var1 = new D.d0();
      } else {
         var1 = new D.b0();
      }

      ((D.g0)var1).d(w.c.a(0, 1, 0, 1));
      D = ((D.g0)var1).b();
      E = new Rect();
   }

   public ActionBarOverlayLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
      new Rect();
      new Rect();
      new Rect();
      new Rect();
      p0 var4 = p0.b;
      this.q = var4;
      this.r = var4;
      this.s = var4;
      this.t = var4;
      this.x = new Y(this);
      this.y = new c(this, 0);
      this.z = new c(this, 1);
      this.i(var1);
      this.A = (D.v)(new Object());
      View var3 = new View(var1);
      var3.setWillNotDraw(true);
      this.B = var3;
      this.addView(var3);
   }

   public static boolean g(View var0, Rect var1, boolean var2) {
      e var7 = (e)var0.getLayoutParams();
      int var4 = var7.leftMargin;
      int var3 = var1.left;
      boolean var6 = true;
      boolean var5;
      if (var4 != var3) {
         var7.leftMargin = var3;
         var5 = true;
      } else {
         var5 = false;
      }

      var4 = var7.topMargin;
      var3 = var1.top;
      if (var4 != var3) {
         var7.topMargin = var3;
         var5 = true;
      }

      var4 = var7.rightMargin;
      var3 = var1.right;
      if (var4 != var3) {
         var7.rightMargin = var3;
         var5 = true;
      }

      if (var2) {
         var4 = var7.bottomMargin;
         var3 = var1.bottom;
         if (var4 != var3) {
            var7.bottomMargin = var3;
            var5 = var6;
         }
      }

      return var5;
   }

   public final void a(int var1, int var2, int[] var3, int var4) {
   }

   public final void b(View var1, View var2, int var3, int var4) {
      if (var4 == 0) {
         this.onNestedScrollAccepted(var1, var2, var3);
      }

   }

   public final void c(View var1, int var2) {
      if (var2 == 0) {
         this.onStopNestedScroll(var1);
      }

   }

   public final boolean checkLayoutParams(ViewGroup.LayoutParams var1) {
      return var1 instanceof e;
   }

   public final void d(NestedScrollView var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      this.e(var1, var2, var3, var4, var5, var6);
   }

   public final void draw(Canvas var1) {
      super.draw(var1);
      if (this.f != null) {
         int var3;
         if (this.d.getVisibility() == 0) {
            float var2 = (float)this.d.getBottom();
            var3 = (int)(this.d.getTranslationY() + var2 + 0.5F);
         } else {
            var3 = 0;
         }

         this.f.setBounds(0, var3, this.getWidth(), this.f.getIntrinsicHeight() + var3);
         this.f.draw(var1);
      }

   }

   public final void e(NestedScrollView var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 == 0) {
         this.onNestedScroll(var1, var2, var3, var4, var5);
      }

   }

   public final boolean f(View var1, View var2, int var3, int var4) {
      boolean var5;
      if (var4 == 0 && this.onStartNestedScroll(var1, var2, var3)) {
         var5 = true;
      } else {
         var5 = false;
      }

      return var5;
   }

   public final boolean fitSystemWindows(Rect var1) {
      return super.fitSystemWindows(var1);
   }

   public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
      return new ViewGroup.MarginLayoutParams(-1, -1);
   }

   public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet var1) {
      return new ViewGroup.MarginLayoutParams(this.getContext(), var1);
   }

   public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams var1) {
      return new ViewGroup.MarginLayoutParams(var1);
   }

   public int getActionBarHideOffset() {
      ActionBarContainer var2 = this.d;
      int var1;
      if (var2 != null) {
         var1 = -((int)var2.getTranslationY());
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int getNestedScrollAxes() {
      D.v var2 = this.A;
      int var1 = var2.a;
      return var2.b | var1;
   }

   public CharSequence getTitle() {
      this.k();
      return ((l1)this.e).a.getTitle();
   }

   public final void h() {
      this.removeCallbacks(this.y);
      this.removeCallbacks(this.z);
      ViewPropertyAnimator var1 = this.w;
      if (var1 != null) {
         var1.cancel();
      }

   }

   public final void i(Context var1) {
      TypedArray var3 = this.getContext().getTheme().obtainStyledAttributes(C);
      boolean var2 = false;
      this.a = var3.getDimensionPixelSize(0, 0);
      Drawable var4 = var3.getDrawable(1);
      this.f = var4;
      if (var4 == null) {
         var2 = true;
      }

      this.setWillNotDraw(var2);
      var3.recycle();
      this.v = new OverScroller(var1);
   }

   public final void j(int var1) {
      this.k();
      if (var1 != 2) {
         if (var1 != 5) {
            if (var1 == 109) {
               this.setOverlayMode(true);
            }
         } else {
            ((l1)this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
         }
      } else {
         ((l1)this.e).getClass();
         Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
      }

   }

   public final void k() {
      if (this.c == null) {
         this.c = (ContentFrameLayout)this.findViewById(2131230760);
         this.d = (ActionBarContainer)this.findViewById(2131230761);
         View var1 = this.findViewById(2131230759);
         r0 var2;
         if (var1 instanceof r0) {
            var2 = (r0)var1;
         } else {
            if (!(var1 instanceof Toolbar)) {
               throw new IllegalStateException("Can't make a decor toolbar out of ".concat(var1.getClass().getSimpleName()));
            }

            var2 = ((Toolbar)var1).getWrapper();
         }

         this.e = var2;
      }

   }

   public final void l(j.l var1, j.w var2) {
      this.k();
      l1 var5 = (l1)this.e;
      m var4 = var5.m;
      Toolbar var3 = var5.a;
      if (var4 == null) {
         var5.m = new m(var3.getContext());
      }

      var4 = var5.m;
      var4.e = var2;
      if (var1 != null || var3.a != null) {
         var3.f();
         j.l var6 = var3.a.p;
         if (var6 != var1) {
            if (var6 != null) {
               var6.r(var3.L);
               var6.r(var3.M);
            }

            if (var3.M == null) {
               var3.M = new f1(var3);
            }

            var4.q = true;
            if (var1 != null) {
               var1.b(var4, var3.j);
               var1.b(var3.M, var3.j);
            } else {
               var4.e(var3.j, (j.l)null);
               var3.M.e(var3.j, (j.l)null);
               var4.c();
               var3.M.c();
            }

            var3.a.setPopupTheme(var3.k);
            var3.a.setPresenter(var4);
            var3.L = var4;
            var3.v();
         }
      }

   }

   public final WindowInsets onApplyWindowInsets(WindowInsets var1) {
      this.k();
      p0 var5 = p0.c(var1, this);
      D.o0 var7 = var5.a;
      Rect var6 = new Rect(var7.g().a, var7.g().b, var7.g().c, var7.g().d);
      boolean var2 = g(this.d, var6, false);
      WeakHashMap var9 = T.a;
      var6 = this.m;
      L.b(this, var5, var6);
      var5 = var7.h(var6.left, var6.top, var6.right, var6.bottom);
      this.q = var5;
      boolean var4 = this.r.equals(var5);
      boolean var3 = true;
      if (!var4) {
         this.r = this.q;
         var2 = true;
      }

      Rect var8 = this.n;
      if (!var8.equals(var6)) {
         var8.set(var6);
         var2 = var3;
      }

      if (var2) {
         this.requestLayout();
      }

      return var7.a().a.c().a.b().b();
   }

   public final void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      this.i(this.getContext());
      WeakHashMap var2 = T.a;
      J.c(this);
   }

   public final void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.h();
   }

   public final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      var4 = this.getChildCount();
      var3 = this.getPaddingLeft();
      var5 = this.getPaddingTop();

      for(var2 = 0; var2 < var4; ++var2) {
         View var10 = this.getChildAt(var2);
         if (var10.getVisibility() != 8) {
            e var11 = (e)var10.getLayoutParams();
            int var7 = var10.getMeasuredWidth();
            int var6 = var10.getMeasuredHeight();
            int var8 = var11.leftMargin + var3;
            int var9 = var11.topMargin + var5;
            var10.layout(var8, var9, var7 + var8, var6 + var9);
         }
      }

   }

   public final void onMeasure(int var1, int var2) {
      this.k();
      this.measureChildWithMargins(this.d, var1, 0, var2, 0);
      e var9 = (e)this.d.getLayoutParams();
      int var8 = Math.max(0, this.d.getMeasuredWidth() + var9.leftMargin + var9.rightMargin);
      int var7 = Math.max(0, this.d.getMeasuredHeight() + var9.topMargin + var9.bottomMargin);
      int var6 = View.combineMeasuredStates(0, this.d.getMeasuredState());
      WeakHashMap var14 = T.a;
      boolean var4;
      if ((this.getWindowSystemUiVisibility() & 256) != 0) {
         var4 = true;
      } else {
         var4 = false;
      }

      int var3;
      int var5;
      if (var4) {
         var5 = this.a;
         var3 = var5;
         if (this.h) {
            var3 = var5;
            if (this.d.getTabContainer() != null) {
               var3 = var5 + this.a;
            }
         }
      } else if (this.d.getVisibility() != 8) {
         var3 = this.d.getMeasuredHeight();
      } else {
         var3 = 0;
      }

      Rect var10;
      p0 var16;
      label49: {
         Rect var15 = this.m;
         var10 = this.o;
         var10.set(var15);
         this.s = this.q;
         if (!this.g && !var4) {
            f var12 = this.B;
            p0 var11 = D;
            var15 = this.p;
            L.b(var12, var11, var15);
            if (!var15.equals(E)) {
               var10.top += var3;
               var10.bottom = var10.bottom;
               this.s = this.s.a.h(0, var3, 0, 0);
               break label49;
            }
         }

         w.c var18 = w.c.a(this.s.a.g().a, this.s.a.g().b + var3, this.s.a.g().c, this.s.a.g().d);
         var16 = this.s;
         var3 = VERSION.SDK_INT;
         Object var17;
         if (var3 >= 34) {
            var17 = new f0(var16);
         } else if (var3 >= 30) {
            var17 = new D.e0(var16);
         } else if (var3 >= 29) {
            var17 = new D.d0(var16);
         } else {
            var17 = new D.b0(var16);
         }

         ((D.g0)var17).d(var18);
         this.s = ((D.g0)var17).b();
      }

      g(this.c, var10, true);
      if (!this.t.equals(this.s)) {
         var16 = this.s;
         this.t = var16;
         T.b(this.c, var16);
      }

      this.measureChildWithMargins(this.c, var1, 0, var2, 0);
      var9 = (e)this.c.getLayoutParams();
      var3 = Math.max(var8, this.c.getMeasuredWidth() + var9.leftMargin + var9.rightMargin);
      var5 = Math.max(var7, this.c.getMeasuredHeight() + var9.topMargin + var9.bottomMargin);
      var6 = View.combineMeasuredStates(var6, this.c.getMeasuredState());
      int var13 = this.getPaddingLeft();
      var7 = this.getPaddingRight();
      var8 = this.getPaddingTop();
      var5 = Math.max(this.getPaddingBottom() + var8 + var5, this.getSuggestedMinimumHeight());
      this.setMeasuredDimension(View.resolveSizeAndState(Math.max(var7 + var13 + var3, this.getSuggestedMinimumWidth()), var1, var6), View.resolveSizeAndState(var5, var2, var6 << 16));
   }

   public final boolean onNestedFling(View var1, float var2, float var3, boolean var4) {
      if (this.i && var4) {
         this.v.fling(0, 0, 0, (int)var3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
         if (this.v.getFinalY() > this.d.getHeight()) {
            this.h();
            this.z.run();
         } else {
            this.h();
            this.y.run();
         }

         this.j = true;
         return true;
      } else {
         return false;
      }
   }

   public final boolean onNestedPreFling(View var1, float var2, float var3) {
      return false;
   }

   public final void onNestedPreScroll(View var1, int var2, int var3, int[] var4) {
   }

   public final void onNestedScroll(View var1, int var2, int var3, int var4, int var5) {
      var2 = this.k + var3;
      this.k = var2;
      this.setActionBarHideOffset(var2);
   }

   public final void onNestedScrollAccepted(View var1, View var2, int var3) {
      this.A.a = var3;
      this.k = this.getActionBarHideOffset();
      this.h();
      d var4 = this.u;
      if (var4 != null) {
         V var5 = (V)var4;
         i.j var6 = var5.s;
         if (var6 != null) {
            var6.a();
            var5.s = null;
         }
      }

   }

   public final boolean onStartNestedScroll(View var1, View var2, int var3) {
      return (var3 & 2) != 0 && this.d.getVisibility() == 0 ? this.i : false;
   }

   public final void onStopNestedScroll(View var1) {
      if (this.i && !this.j) {
         if (this.k <= this.d.getHeight()) {
            this.h();
            this.postDelayed(this.y, 600L);
         } else {
            this.h();
            this.postDelayed(this.z, 600L);
         }
      }

   }

   public final void onWindowSystemUiVisibilityChanged(int var1) {
      super.onWindowSystemUiVisibilityChanged(var1);
      this.k();
      int var4 = this.l;
      this.l = var1;
      boolean var2;
      if ((var1 & 4) == 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      boolean var3;
      if ((var1 & 256) != 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      d var5 = this.u;
      if (var5 != null) {
         V var6 = (V)var5;
         var6.o = var3 ^ true;
         if (!var2 && var3) {
            if (!var6.p) {
               var6.p = true;
               var6.s(true);
            }
         } else if (var6.p) {
            var6.p = false;
            var6.s(true);
         }
      }

      if (((var4 ^ var1) & 256) != 0 && this.u != null) {
         WeakHashMap var7 = T.a;
         J.c(this);
      }

   }

   public final void onWindowVisibilityChanged(int var1) {
      super.onWindowVisibilityChanged(var1);
      this.b = var1;
      d var2 = this.u;
      if (var2 != null) {
         ((V)var2).n = var1;
      }

   }

   public void setActionBarHideOffset(int var1) {
      this.h();
      var1 = Math.max(0, Math.min(var1, this.d.getHeight()));
      this.d.setTranslationY((float)(-var1));
   }

   public void setActionBarVisibilityCallback(d var1) {
      this.u = var1;
      if (this.getWindowToken() != null) {
         var1 = this.u;
         int var2 = this.b;
         ((V)var1).n = var2;
         var2 = this.l;
         if (var2 != 0) {
            this.onWindowSystemUiVisibilityChanged(var2);
            WeakHashMap var3 = T.a;
            J.c(this);
         }
      }

   }

   public void setHasNonEmbeddedTabs(boolean var1) {
      this.h = var1;
   }

   public void setHideOnContentScrollEnabled(boolean var1) {
      if (var1 != this.i) {
         this.i = var1;
         if (!var1) {
            this.h();
            this.setActionBarHideOffset(0);
         }
      }

   }

   public void setIcon(int var1) {
      this.k();
      l1 var3 = (l1)this.e;
      Drawable var2;
      if (var1 != 0) {
         var2 = C.b.n(var3.a.getContext(), var1);
      } else {
         var2 = null;
      }

      var3.d = var2;
      var3.c();
   }

   public void setIcon(Drawable var1) {
      this.k();
      l1 var2 = (l1)this.e;
      var2.d = var1;
      var2.c();
   }

   public void setLogo(int var1) {
      this.k();
      l1 var3 = (l1)this.e;
      Drawable var2;
      if (var1 != 0) {
         var2 = C.b.n(var3.a.getContext(), var1);
      } else {
         var2 = null;
      }

      var3.e = var2;
      var3.c();
   }

   public void setOverlayMode(boolean var1) {
      this.g = var1;
   }

   public void setShowingForActionMode(boolean var1) {
   }

   public void setUiOptions(int var1) {
   }

   public void setWindowCallback(Window.Callback var1) {
      this.k();
      ((l1)this.e).k = var1;
   }

   public void setWindowTitle(CharSequence var1) {
      this.k();
      l1 var3 = (l1)this.e;
      if (!var3.g) {
         var3.h = var1;
         if ((var3.b & 8) != 0) {
            Toolbar var2 = var3.a;
            var2.setTitle(var1);
            if (var3.g) {
               T.j(var2.getRootView(), var1);
            }
         }
      }

   }

   public final boolean shouldDelayChildPressedState() {
      return false;
   }
}
