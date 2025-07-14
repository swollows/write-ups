package androidx.appcompat.widget;

import D.T;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.O;
import androidx.customview.view.AbsSavedState;
import j.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public class Toolbar extends ViewGroup {
   public ColorStateList A;
   public boolean B;
   public boolean C;
   public final ArrayList D = new ArrayList();
   public final ArrayList E = new ArrayList();
   public final int[] F = new int[2];
   public final D.p G = new D.p(new c1(this, 1));
   public ArrayList H = new ArrayList();
   public h1 I;
   public final d1 J = new d1(this);
   public l1 K;
   public m L;
   public f1 M;
   public O N;
   public androidx.appcompat.app.N O;
   public boolean P;
   public OnBackInvokedCallback Q;
   public OnBackInvokedDispatcher R;
   public boolean S;
   public final A.b T = new A.b(4, this);
   public ActionMenuView a;
   public i0 b;
   public i0 c;
   public C d;
   public E e;
   public final Drawable f;
   public final CharSequence g;
   public C h;
   public View i;
   public Context j;
   public int k;
   public int l;
   public int m;
   public final int n;
   public final int o;
   public int p;
   public int q;
   public int r;
   public int s;
   public U0 t;
   public int u;
   public int v;
   public final int w = 8388627;
   public CharSequence x;
   public CharSequence y;
   public ColorStateList z;

   public Toolbar(Context var1, AttributeSet var2) {
      super(var1, var2, 2130903310);
      Context var7 = this.getContext();
      int[] var8 = g.a.w;
      X.h var13 = X.h.m(var7, var2, var8, 2130903310);
      D.T.h(this, var1, var8, var2, (TypedArray)var13.b, 2130903310);
      TypedArray var9 = (TypedArray)var13.b;
      this.l = var9.getResourceId(28, 0);
      this.m = var9.getResourceId(19, 0);
      this.w = var9.getInteger(0, 8388627);
      this.n = var9.getInteger(2, 48);
      int var4 = var9.getDimensionPixelOffset(22, 0);
      int var3 = var4;
      if (var9.hasValue(27)) {
         var3 = var9.getDimensionPixelOffset(27, var4);
      }

      this.s = var3;
      this.r = var3;
      this.q = var3;
      this.p = var3;
      var3 = var9.getDimensionPixelOffset(25, -1);
      if (var3 >= 0) {
         this.p = var3;
      }

      var3 = var9.getDimensionPixelOffset(24, -1);
      if (var3 >= 0) {
         this.q = var3;
      }

      var3 = var9.getDimensionPixelOffset(26, -1);
      if (var3 >= 0) {
         this.r = var3;
      }

      var3 = var9.getDimensionPixelOffset(23, -1);
      if (var3 >= 0) {
         this.s = var3;
      }

      this.o = var9.getDimensionPixelSize(13, -1);
      var4 = var9.getDimensionPixelOffset(9, Integer.MIN_VALUE);
      var3 = var9.getDimensionPixelOffset(5, Integer.MIN_VALUE);
      int var6 = var9.getDimensionPixelSize(7, 0);
      int var5 = var9.getDimensionPixelSize(8, 0);
      this.d();
      U0 var10 = this.t;
      var10.h = false;
      if (var6 != Integer.MIN_VALUE) {
         var10.e = var6;
         var10.a = var6;
      }

      if (var5 != Integer.MIN_VALUE) {
         var10.f = var5;
         var10.b = var5;
      }

      if (var4 != Integer.MIN_VALUE || var3 != Integer.MIN_VALUE) {
         var10.a(var4, var3);
      }

      this.u = var9.getDimensionPixelOffset(10, Integer.MIN_VALUE);
      this.v = var9.getDimensionPixelOffset(6, Integer.MIN_VALUE);
      this.f = var13.h(4);
      this.g = var9.getText(3);
      CharSequence var11 = var9.getText(21);
      if (!TextUtils.isEmpty(var11)) {
         this.setTitle(var11);
      }

      var11 = var9.getText(18);
      if (!TextUtils.isEmpty(var11)) {
         this.setSubtitle(var11);
      }

      this.j = this.getContext();
      this.setPopupTheme(var9.getResourceId(17, 0));
      Drawable var12 = var13.h(16);
      if (var12 != null) {
         this.setNavigationIcon(var12);
      }

      var11 = var9.getText(15);
      if (!TextUtils.isEmpty(var11)) {
         this.setNavigationContentDescription(var11);
      }

      var12 = var13.h(11);
      if (var12 != null) {
         this.setLogo(var12);
      }

      var11 = var9.getText(12);
      if (!TextUtils.isEmpty(var11)) {
         this.setLogoDescription(var11);
      }

      if (var9.hasValue(29)) {
         this.setTitleTextColor(var13.g(29));
      }

      if (var9.hasValue(20)) {
         this.setSubtitleTextColor(var13.g(20));
      }

      if (var9.hasValue(14)) {
         var3 = var9.getResourceId(14, 0);
         this.getMenuInflater().inflate(var3, this.getMenu());
      }

      var13.o();
   }

   private ArrayList getCurrentMenuItems() {
      ArrayList var3 = new ArrayList();
      Menu var2 = this.getMenu();

      for(int var1 = 0; var1 < var2.size(); ++var1) {
         var3.add(var2.getItem(var1));
      }

      return var3;
   }

   private MenuInflater getMenuInflater() {
      return new i.i(this.getContext());
   }

   public static g1 h() {
      ViewGroup.MarginLayoutParams var0 = new ViewGroup.MarginLayoutParams(-2, -2);
      var0.b = 0;
      var0.a = 8388627;
      return var0;
   }

   public static g1 i(ViewGroup.LayoutParams var0) {
      boolean var1 = var0 instanceof g1;
      g1 var2;
      g1 var3;
      if (var1) {
         var3 = (g1)var0;
         var2 = new g1(var3);
         var2.b = 0;
         var2.b = var3.b;
         return var2;
      } else if (var1) {
         var3 = new g1((g1)var0);
         var3.b = 0;
         return var3;
      } else if (var0 instanceof ViewGroup.MarginLayoutParams) {
         ViewGroup.MarginLayoutParams var4 = (ViewGroup.MarginLayoutParams)var0;
         var2 = new g1(var4);
         var2.b = 0;
         var2.leftMargin = var4.leftMargin;
         var2.topMargin = var4.topMargin;
         var2.rightMargin = var4.rightMargin;
         var2.bottomMargin = var4.bottomMargin;
         return var2;
      } else {
         var3 = new g1(var0);
         var3.b = 0;
         return var3;
      }
   }

   public static int k(View var0) {
      ViewGroup.MarginLayoutParams var2 = (ViewGroup.MarginLayoutParams)var0.getLayoutParams();
      int var1 = var2.getMarginStart();
      return var2.getMarginEnd() + var1;
   }

   public static int l(View var0) {
      ViewGroup.MarginLayoutParams var1 = (ViewGroup.MarginLayoutParams)var0.getLayoutParams();
      return var1.topMargin + var1.bottomMargin;
   }

   public final void a(ArrayList var1, int var2) {
      int var4 = this.getLayoutDirection();
      int var3 = 0;
      boolean var10;
      if (var4 == 1) {
         var10 = true;
      } else {
         var10 = false;
      }

      int var6 = this.getChildCount();
      int var5 = Gravity.getAbsoluteGravity(var2, this.getLayoutDirection());
      var1.clear();
      if (var10) {
         for(var3 = var6 - 1; var3 >= 0; --var3) {
            View var12 = this.getChildAt(var3);
            g1 var11 = (g1)var12.getLayoutParams();
            if (var11.b == 0 && this.t(var12)) {
               var2 = var11.a;
               var6 = this.getLayoutDirection();
               var4 = Gravity.getAbsoluteGravity(var2, var6) & 7;
               var2 = var4;
               if (var4 != 1) {
                  var2 = var4;
                  if (var4 != 3) {
                     var2 = var4;
                     if (var4 != 5) {
                        if (var6 == 1) {
                           var2 = 5;
                        } else {
                           var2 = 3;
                        }
                     }
                  }
               }

               if (var2 == var5) {
                  var1.add(var12);
               }
            }
         }
      } else {
         for(; var3 < var6; ++var3) {
            View var8 = this.getChildAt(var3);
            g1 var9 = (g1)var8.getLayoutParams();
            if (var9.b == 0 && this.t(var8)) {
               var2 = var9.a;
               int var7 = this.getLayoutDirection();
               var4 = Gravity.getAbsoluteGravity(var2, var7) & 7;
               var2 = var4;
               if (var4 != 1) {
                  var2 = var4;
                  if (var4 != 3) {
                     var2 = var4;
                     if (var4 != 5) {
                        if (var7 == 1) {
                           var2 = 5;
                        } else {
                           var2 = 3;
                        }
                     }
                  }
               }

               if (var2 == var5) {
                  var1.add(var8);
               }
            }
         }
      }

   }

   public final void b(View var1, boolean var2) {
      ViewGroup.LayoutParams var3 = var1.getLayoutParams();
      g1 var4;
      if (var3 == null) {
         var4 = h();
      } else if (!this.checkLayoutParams(var3)) {
         var4 = i(var3);
      } else {
         var4 = (g1)var3;
      }

      var4.b = 1;
      if (var2 && this.i != null) {
         var1.setLayoutParams(var4);
         this.E.add(var1);
      } else {
         this.addView(var1, var4);
      }

   }

   public final void c() {
      if (this.h == null) {
         C var1 = new C(this.getContext(), (AttributeSet)null, 2130903309);
         this.h = var1;
         var1.setImageDrawable(this.f);
         this.h.setContentDescription(this.g);
         g1 var2 = h();
         var2.a = this.n & 112 | 8388611;
         var2.b = 2;
         this.h.setLayoutParams(var2);
         this.h.setOnClickListener(new androidx.appcompat.app.c(2, this));
      }

   }

   public final boolean checkLayoutParams(ViewGroup.LayoutParams var1) {
      boolean var2;
      if (super.checkLayoutParams(var1) && var1 instanceof g1) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public final void d() {
      if (this.t == null) {
         Object var1 = new Object();
         ((U0)var1).a = 0;
         ((U0)var1).b = 0;
         ((U0)var1).c = Integer.MIN_VALUE;
         ((U0)var1).d = Integer.MIN_VALUE;
         ((U0)var1).e = 0;
         ((U0)var1).f = 0;
         ((U0)var1).g = false;
         ((U0)var1).h = false;
         this.t = (U0)var1;
      }

   }

   public final void e() {
      this.f();
      ActionMenuView var1 = this.a;
      if (var1.p == null) {
         j.l var2 = (j.l)var1.getMenu();
         if (this.M == null) {
            this.M = new f1(this);
         }

         this.a.setExpandedActionViewsExclusive(true);
         var2.b(this.M, this.j);
         this.v();
      }

   }

   public final void f() {
      if (this.a == null) {
         ActionMenuView var1 = new ActionMenuView(this.getContext(), (AttributeSet)null);
         this.a = var1;
         var1.setPopupTheme(this.k);
         this.a.setOnMenuItemClickListener(this.J);
         ActionMenuView var3 = this.a;
         O var4 = this.N;
         d1 var2 = new d1(this);
         var3.u = var4;
         var3.v = var2;
         g1 var5 = h();
         var5.a = this.n & 112 | 8388613;
         this.a.setLayoutParams(var5);
         this.b(this.a, false);
      }

   }

   public final void g() {
      if (this.d == null) {
         this.d = new C(this.getContext(), (AttributeSet)null, 2130903309);
         g1 var1 = h();
         var1.a = this.n & 112 | 8388611;
         this.d.setLayoutParams(var1);
      }

   }

   public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet var1) {
      Context var3 = this.getContext();
      ViewGroup.MarginLayoutParams var2 = new ViewGroup.MarginLayoutParams(var3, var1);
      var2.a = 0;
      TypedArray var4 = var3.obtainStyledAttributes(var1, g.a.b);
      var2.a = var4.getInt(0, 0);
      var4.recycle();
      var2.b = 0;
      return var2;
   }

   public CharSequence getCollapseContentDescription() {
      C var1 = this.h;
      CharSequence var2;
      if (var1 != null) {
         var2 = var1.getContentDescription();
      } else {
         var2 = null;
      }

      return var2;
   }

   public Drawable getCollapseIcon() {
      C var1 = this.h;
      Drawable var2;
      if (var1 != null) {
         var2 = var1.getDrawable();
      } else {
         var2 = null;
      }

      return var2;
   }

   public int getContentInsetEnd() {
      U0 var2 = this.t;
      int var1;
      if (var2 != null) {
         if (var2.g) {
            var1 = var2.a;
         } else {
            var1 = var2.b;
         }
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int getContentInsetEndWithActions() {
      int var1 = this.v;
      if (var1 == Integer.MIN_VALUE) {
         var1 = this.getContentInsetEnd();
      }

      return var1;
   }

   public int getContentInsetLeft() {
      U0 var2 = this.t;
      int var1;
      if (var2 != null) {
         var1 = var2.a;
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int getContentInsetRight() {
      U0 var2 = this.t;
      int var1;
      if (var2 != null) {
         var1 = var2.b;
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int getContentInsetStart() {
      U0 var2 = this.t;
      int var1;
      if (var2 != null) {
         if (var2.g) {
            var1 = var2.b;
         } else {
            var1 = var2.a;
         }
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int getContentInsetStartWithNavigation() {
      int var1 = this.u;
      if (var1 == Integer.MIN_VALUE) {
         var1 = this.getContentInsetStart();
      }

      return var1;
   }

   public int getCurrentContentInsetEnd() {
      ActionMenuView var2 = this.a;
      int var1;
      if (var2 != null) {
         j.l var3 = var2.p;
         if (var3 != null && var3.hasVisibleItems()) {
            var1 = Math.max(this.getContentInsetEnd(), Math.max(this.v, 0));
            return var1;
         }
      }

      var1 = this.getContentInsetEnd();
      return var1;
   }

   public int getCurrentContentInsetLeft() {
      int var1;
      if (this.getLayoutDirection() == 1) {
         var1 = this.getCurrentContentInsetEnd();
      } else {
         var1 = this.getCurrentContentInsetStart();
      }

      return var1;
   }

   public int getCurrentContentInsetRight() {
      int var1;
      if (this.getLayoutDirection() == 1) {
         var1 = this.getCurrentContentInsetStart();
      } else {
         var1 = this.getCurrentContentInsetEnd();
      }

      return var1;
   }

   public int getCurrentContentInsetStart() {
      int var1;
      if (this.getNavigationIcon() != null) {
         var1 = Math.max(this.getContentInsetStart(), Math.max(this.u, 0));
      } else {
         var1 = this.getContentInsetStart();
      }

      return var1;
   }

   public Drawable getLogo() {
      E var1 = this.e;
      Drawable var2;
      if (var1 != null) {
         var2 = var1.getDrawable();
      } else {
         var2 = null;
      }

      return var2;
   }

   public CharSequence getLogoDescription() {
      E var1 = this.e;
      CharSequence var2;
      if (var1 != null) {
         var2 = var1.getContentDescription();
      } else {
         var2 = null;
      }

      return var2;
   }

   public Menu getMenu() {
      this.e();
      return this.a.getMenu();
   }

   public View getNavButtonView() {
      return this.d;
   }

   public CharSequence getNavigationContentDescription() {
      C var1 = this.d;
      CharSequence var2;
      if (var1 != null) {
         var2 = var1.getContentDescription();
      } else {
         var2 = null;
      }

      return var2;
   }

   public Drawable getNavigationIcon() {
      C var1 = this.d;
      Drawable var2;
      if (var1 != null) {
         var2 = var1.getDrawable();
      } else {
         var2 = null;
      }

      return var2;
   }

   public m getOuterActionMenuPresenter() {
      return this.L;
   }

   public Drawable getOverflowIcon() {
      this.e();
      return this.a.getOverflowIcon();
   }

   public Context getPopupContext() {
      return this.j;
   }

   public int getPopupTheme() {
      return this.k;
   }

   public CharSequence getSubtitle() {
      return this.y;
   }

   public final TextView getSubtitleTextView() {
      return this.c;
   }

   public CharSequence getTitle() {
      return this.x;
   }

   public int getTitleMarginBottom() {
      return this.s;
   }

   public int getTitleMarginEnd() {
      return this.q;
   }

   public int getTitleMarginStart() {
      return this.p;
   }

   public int getTitleMarginTop() {
      return this.r;
   }

   public final TextView getTitleTextView() {
      return this.b;
   }

   public r0 getWrapper() {
      if (this.K == null) {
         this.K = new l1(this, true);
      }

      return this.K;
   }

   public final int j(View var1, int var2) {
      g1 var8 = (g1)var1.getLayoutParams();
      int var5 = var1.getMeasuredHeight();
      if (var2 > 0) {
         var2 = (var5 - var2) / 2;
      } else {
         var2 = 0;
      }

      int var4 = var8.a & 112;
      int var3 = var4;
      if (var4 != 16) {
         var3 = var4;
         if (var4 != 48) {
            var3 = var4;
            if (var4 != 80) {
               var3 = this.w & 112;
            }
         }
      }

      if (var3 != 48) {
         if (var3 != 80) {
            var4 = this.getPaddingTop();
            int var6 = this.getPaddingBottom();
            int var7 = this.getHeight();
            var3 = (var7 - var4 - var6 - var5) / 2;
            var2 = var8.topMargin;
            if (var3 >= var2) {
               var6 = var7 - var6 - var5 - var3 - var4;
               var5 = var8.bottomMargin;
               var2 = var3;
               if (var6 < var5) {
                  var2 = Math.max(0, var3 - (var5 - var6));
               }
            }

            return var4 + var2;
         } else {
            return this.getHeight() - this.getPaddingBottom() - var5 - var8.bottomMargin - var2;
         }
      } else {
         return this.getPaddingTop() - var2;
      }
   }

   public final void m() {
      Iterator var2 = this.H.iterator();

      while(var2.hasNext()) {
         MenuItem var1 = (MenuItem)var2.next();
         this.getMenu().removeItem(var1.getItemId());
      }

      this.getMenu();
      ArrayList var4 = this.getCurrentMenuItems();
      this.getMenuInflater();
      this.G.a();
      ArrayList var3 = this.getCurrentMenuItems();
      var3.removeAll(var4);
      this.H = var3;
   }

   public final boolean n(View var1) {
      boolean var2;
      if (var1.getParent() != this && !this.E.contains(var1)) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   public final boolean o() {
      ActionMenuView var2 = this.a;
      boolean var1;
      if (var2 != null) {
         m var3 = var2.t;
         if (var3 != null && var3.k()) {
            var1 = true;
            return var1;
         }
      }

      var1 = false;
      return var1;
   }

   public final void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.v();
   }

   public final void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.removeCallbacks(this.T);
      this.v();
   }

   public final boolean onHoverEvent(MotionEvent var1) {
      int var2 = var1.getActionMasked();
      if (var2 == 9) {
         this.C = false;
      }

      if (!this.C) {
         boolean var3 = super.onHoverEvent(var1);
         if (var2 == 9 && !var3) {
            this.C = true;
         }
      }

      if (var2 == 10 || var2 == 3) {
         this.C = false;
      }

      return true;
   }

   public final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      boolean var8;
      if (this.getLayoutDirection() == 1) {
         var8 = true;
      } else {
         var8 = false;
      }

      int var12 = this.getWidth();
      int var15 = this.getHeight();
      int var7 = this.getPaddingLeft();
      int var11 = this.getPaddingRight();
      int var13 = this.getPaddingTop();
      int var14 = this.getPaddingBottom();
      int var9 = var12 - var11;
      int[] var19 = this.F;
      var19[1] = 0;
      var19[0] = 0;
      WeakHashMap var17 = D.T.a;
      var2 = this.getMinimumHeight();
      int var6;
      if (var2 >= 0) {
         var6 = Math.min(var2, var5 - var3);
      } else {
         var6 = 0;
      }

      label197: {
         if (this.t(this.d)) {
            if (var8) {
               var5 = this.q(this.d, var9, var6, var19);
               var4 = var7;
               break label197;
            }

            var4 = this.p(this.d, var7, var6, var19);
         } else {
            var4 = var7;
         }

         var5 = var9;
      }

      var2 = var4;
      var3 = var5;
      if (this.t(this.h)) {
         if (var8) {
            var3 = this.q(this.h, var5, var6, var19);
            var2 = var4;
         } else {
            var2 = this.p(this.h, var4, var6, var19);
            var3 = var5;
         }
      }

      var5 = var2;
      var4 = var3;
      if (this.t(this.a)) {
         if (var8) {
            var5 = this.p(this.a, var2, var6, var19);
            var4 = var3;
         } else {
            var4 = this.q(this.a, var3, var6, var19);
            var5 = var2;
         }
      }

      var3 = this.getCurrentContentInsetLeft();
      var2 = this.getCurrentContentInsetRight();
      var19[0] = Math.max(0, var3 - var5);
      var19[1] = Math.max(0, var2 - (var9 - var4));
      var3 = Math.max(var5, var3);
      var4 = Math.min(var4, var9 - var2);
      var2 = var3;
      var5 = var4;
      if (this.t(this.i)) {
         if (var8) {
            var5 = this.q(this.i, var4, var6, var19);
            var2 = var3;
         } else {
            var2 = this.p(this.i, var3, var6, var19);
            var5 = var4;
         }
      }

      var3 = var2;
      var4 = var5;
      if (this.t(this.e)) {
         if (var8) {
            var4 = this.q(this.e, var5, var6, var19);
            var3 = var2;
         } else {
            var3 = this.p(this.e, var2, var6, var19);
            var4 = var5;
         }
      }

      var1 = this.t(this.b);
      boolean var16 = this.t(this.c);
      g1 var24;
      if (var1) {
         var24 = (g1)this.b.getLayoutParams();
         var2 = var24.topMargin;
         var5 = this.b.getMeasuredHeight();
         var2 = var24.bottomMargin + var5 + var2;
      } else {
         var2 = 0;
      }

      if (var16) {
         var24 = (g1)this.c.getLayoutParams();
         var5 = var24.topMargin;
         var2 += this.c.getMeasuredHeight() + var5 + var24.bottomMargin;
      }

      int var10;
      int var22;
      if (!var1 && !var16) {
         var2 = var3;
         var3 = var4;
      } else {
         i0 var25;
         if (var1) {
            var25 = this.b;
         } else {
            var25 = this.c;
         }

         i0 var18;
         if (var16) {
            var18 = this.c;
         } else {
            var18 = this.b;
         }

         var24 = (g1)var25.getLayoutParams();
         g1 var26 = (g1)var18.getLayoutParams();
         boolean var21;
         if ((!var1 || this.b.getMeasuredWidth() <= 0) && (!var16 || this.c.getMeasuredWidth() <= 0)) {
            var21 = false;
         } else {
            var21 = true;
         }

         var9 = this.w & 112;
         if (var9 != 48) {
            if (var9 != 80) {
               var9 = (var15 - var13 - var14 - var2) / 2;
               var10 = var24.topMargin + this.r;
               if (var9 < var10) {
                  var2 = var10;
               } else {
                  var10 = var15 - var14 - var2 - var9 - var13;
                  var15 = var24.bottomMargin;
                  var14 = this.s;
                  var2 = var9;
                  if (var10 < var15 + var14) {
                     var2 = Math.max(0, var9 - (var26.bottomMargin + var14 - var10));
                  }
               }

               var2 += var13;
            } else {
               var2 = var15 - var14 - var26.bottomMargin - this.s - var2;
            }
         } else {
            var2 = this.getPaddingTop() + var24.topMargin + this.r;
         }

         if (var8) {
            if (var21) {
               var22 = this.p;
            } else {
               var22 = 0;
            }

            var22 -= var19[1];
            var4 -= Math.max(0, var22);
            var19[1] = Math.max(0, -var22);
            if (var1) {
               var24 = (g1)this.b.getLayoutParams();
               var9 = var4 - this.b.getMeasuredWidth();
               var22 = this.b.getMeasuredHeight() + var2;
               this.b.layout(var9, var2, var4, var22);
               var2 = var9 - this.q;
               var9 = var22 + var24.bottomMargin;
            } else {
               var9 = var2;
               var2 = var4;
            }

            if (var16) {
               var9 += ((g1)this.c.getLayoutParams()).topMargin;
               var10 = this.c.getMeasuredWidth();
               var22 = this.c.getMeasuredHeight();
               this.c.layout(var4 - var10, var9, var4, var22 + var9);
               var22 = var4 - this.q;
            } else {
               var22 = var4;
            }

            if (var21) {
               var4 = Math.min(var2, var22);
            }

            var2 = var3;
            var3 = var4;
         } else {
            if (var21) {
               var22 = this.p;
            } else {
               var22 = 0;
            }

            var22 -= var19[0];
            var3 += Math.max(0, var22);
            var19[0] = Math.max(0, -var22);
            if (var1) {
               var24 = (g1)this.b.getLayoutParams();
               var22 = this.b.getMeasuredWidth() + var3;
               var9 = this.b.getMeasuredHeight() + var2;
               this.b.layout(var3, var2, var22, var9);
               var22 += this.q;
               var2 = var9 + var24.bottomMargin;
            } else {
               var22 = var3;
            }

            if (var16) {
               var10 = var2 + ((g1)this.c.getLayoutParams()).topMargin;
               var2 = this.c.getMeasuredWidth() + var3;
               var9 = this.c.getMeasuredHeight();
               this.c.layout(var3, var10, var2, var9 + var10);
               var9 = var2 + this.q;
            } else {
               var9 = var3;
            }

            var2 = var3;
            var3 = var4;
            if (var21) {
               var2 = Math.max(var22, var9);
               var3 = var4;
            }
         }
      }

      ArrayList var28 = this.D;
      this.a(var28, 3);
      var5 = var28.size();

      for(var4 = 0; var4 < var5; ++var4) {
         var2 = this.p((View)var28.get(var4), var2, var6, var19);
      }

      this.a(var28, 5);
      var5 = var28.size();

      for(var4 = 0; var4 < var5; ++var4) {
         var3 = this.q((View)var28.get(var4), var3, var6, var19);
      }

      this.a(var28, 1);
      var9 = var19[0];
      var22 = var19[1];
      var10 = var28.size();
      var5 = 0;

      for(var4 = 0; var5 < var10; ++var5) {
         View var27 = (View)var28.get(var5);
         g1 var20 = (g1)var27.getLayoutParams();
         var9 = var20.leftMargin - var9;
         var22 = var20.rightMargin - var22;
         var14 = Math.max(0, var9);
         var13 = Math.max(0, var22);
         var9 = Math.max(0, -var9);
         var22 = Math.max(0, -var22);
         var4 += var27.getMeasuredWidth() + var14 + var13;
      }

      byte var23 = 0;
      var7 = (var12 - var7 - var11) / 2 + var7 - var4 / 2;
      var4 += var7;
      if (var7 >= var2) {
         if (var4 > var3) {
            var2 = var7 - (var4 - var3);
         } else {
            var2 = var7;
         }
      }

      var4 = var28.size();

      for(var3 = var23; var3 < var4; ++var3) {
         var2 = this.p((View)var28.get(var3), var2, var6, var19);
      }

      var28.clear();
   }

   public final void onMeasure(int var1, int var2) {
      boolean var14 = t1.a;
      int var3 = this.getLayoutDirection();
      byte var10 = 0;
      int var7;
      int var8;
      if (var3 == 1) {
         var8 = 1;
         var7 = 0;
      } else {
         var7 = 1;
         var8 = 0;
      }

      int var4;
      int var5;
      int var6;
      if (this.t(this.d)) {
         this.s(this.d, var1, 0, var2, this.o);
         var3 = this.d.getMeasuredWidth();
         var3 += k(this.d);
         var4 = this.d.getMeasuredHeight();
         var6 = Math.max(0, l(this.d) + var4);
         var5 = View.combineMeasuredStates(0, this.d.getMeasuredState());
      } else {
         var3 = 0;
         var6 = 0;
         var5 = var6;
      }

      int var9 = var3;
      var4 = var6;
      var3 = var5;
      if (this.t(this.h)) {
         this.s(this.h, var1, 0, var2, this.o);
         var3 = this.h.getMeasuredWidth();
         var9 = k(this.h) + var3;
         var3 = this.h.getMeasuredHeight();
         var4 = Math.max(var6, l(this.h) + var3);
         var3 = View.combineMeasuredStates(var5, this.h.getMeasuredState());
      }

      var5 = this.getCurrentContentInsetStart();
      int var11 = Math.max(var5, var9);
      var5 = Math.max(0, var5 - var9);
      int[] var15 = this.F;
      var15[var8] = var5;
      if (this.t(this.a)) {
         this.s(this.a, var1, var11, var2, this.o);
         var5 = this.a.getMeasuredWidth();
         var5 += k(this.a);
         var6 = this.a.getMeasuredHeight();
         var6 = Math.max(var4, l(this.a) + var6);
         var3 = View.combineMeasuredStates(var3, this.a.getMeasuredState());
         var4 = var5;
         var5 = var6;
      } else {
         byte var17 = 0;
         var5 = var4;
         var4 = var17;
      }

      var6 = this.getCurrentContentInsetEnd();
      var9 = var11 + Math.max(var6, var4);
      var15[var7] = Math.max(0, var6 - var4);
      var8 = var9;
      var6 = var5;
      var4 = var3;
      if (this.t(this.i)) {
         var8 = var9 + this.r(this.i, var1, var9, var2, 0, var15);
         var4 = this.i.getMeasuredHeight();
         var6 = Math.max(var5, l(this.i) + var4);
         var4 = View.combineMeasuredStates(var3, this.i.getMeasuredState());
      }

      var7 = var8;
      var5 = var6;
      var3 = var4;
      if (this.t(this.e)) {
         var7 = var8 + this.r(this.e, var1, var8, var2, 0, var15);
         var3 = this.e.getMeasuredHeight();
         var5 = Math.max(var6, l(this.e) + var3);
         var3 = View.combineMeasuredStates(var4, this.e.getMeasuredState());
      }

      var11 = this.getChildCount();
      var4 = 0;

      for(var6 = var5; var4 < var11; var3 = var5) {
         View var16 = this.getChildAt(var4);
         var9 = var7;
         var8 = var6;
         var5 = var3;
         if (((g1)var16.getLayoutParams()).b == 0) {
            if (!this.t(var16)) {
               var9 = var7;
               var8 = var6;
               var5 = var3;
            } else {
               var9 = var7 + this.r(var16, var1, var7, var2, 0, var15);
               var5 = var16.getMeasuredHeight();
               var8 = Math.max(var6, l(var16) + var5);
               var5 = View.combineMeasuredStates(var3, var16.getMeasuredState());
            }
         }

         ++var4;
         var7 = var9;
         var6 = var8;
      }

      var11 = this.r + this.s;
      var9 = this.p + this.q;
      if (this.t(this.b)) {
         this.r(this.b, var1, var7 + var9, var2, var11, var15);
         var8 = this.b.getMeasuredWidth();
         var5 = k(this.b);
         int var12 = this.b.getMeasuredHeight();
         int var13 = l(this.b);
         var4 = View.combineMeasuredStates(var3, this.b.getMeasuredState());
         var3 = var13 + var12;
         var5 += var8;
      } else {
         byte var18 = 0;
         var4 = var3;
         var5 = 0;
         var3 = var18;
      }

      if (this.t(this.c)) {
         var5 = Math.max(var5, this.r(this.c, var1, var7 + var9, var2, var3 + var11, var15));
         var8 = this.c.getMeasuredHeight();
         var3 += l(this.c) + var8;
         var4 = View.combineMeasuredStates(var4, this.c.getMeasuredState());
      }

      label72: {
         var8 = Math.max(var6, var3);
         var11 = this.getPaddingLeft();
         var9 = this.getPaddingRight();
         var6 = this.getPaddingTop();
         var3 = this.getPaddingBottom();
         var5 = View.resolveSizeAndState(Math.max(var9 + var11 + var7 + var5, this.getSuggestedMinimumWidth()), var1, -16777216 & var4);
         var3 = View.resolveSizeAndState(Math.max(var3 + var6 + var8, this.getSuggestedMinimumHeight()), var2, var4 << 16);
         if (this.P) {
            var4 = this.getChildCount();
            var1 = 0;

            while(true) {
               var2 = var10;
               if (var1 >= var4) {
                  break label72;
               }

               View var19 = this.getChildAt(var1);
               if (this.t(var19) && var19.getMeasuredWidth() > 0 && var19.getMeasuredHeight() > 0) {
                  break;
               }

               ++var1;
            }
         }

         var2 = var3;
      }

      this.setMeasuredDimension(var5, var2);
   }

   public final void onRestoreInstanceState(Parcelable var1) {
      if (!(var1 instanceof SavedState)) {
         super.onRestoreInstanceState(var1);
      } else {
         SavedState var3 = (SavedState)var1;
         super.onRestoreInstanceState(var3.a);
         ActionMenuView var4 = this.a;
         j.l var5;
         if (var4 != null) {
            var5 = var4.p;
         } else {
            var5 = null;
         }

         int var2 = var3.c;
         if (var2 != 0 && this.M != null && var5 != null) {
            MenuItem var6 = var5.findItem(var2);
            if (var6 != null) {
               var6.expandActionView();
            }
         }

         if (var3.d) {
            A.b var7 = this.T;
            this.removeCallbacks(var7);
            this.post(var7);
         }

      }
   }

   public final void onRtlPropertiesChanged(int var1) {
      super.onRtlPropertiesChanged(var1);
      this.d();
      U0 var3 = this.t;
      boolean var2 = true;
      if (var1 != 1) {
         var2 = false;
      }

      if (var2 != var3.g) {
         var3.g = var2;
         if (var3.h) {
            if (var2) {
               var1 = var3.d;
               if (var1 == Integer.MIN_VALUE) {
                  var1 = var3.e;
               }

               var3.a = var1;
               var1 = var3.c;
               if (var1 == Integer.MIN_VALUE) {
                  var1 = var3.f;
               }

               var3.b = var1;
            } else {
               var1 = var3.c;
               if (var1 == Integer.MIN_VALUE) {
                  var1 = var3.e;
               }

               var3.a = var1;
               var1 = var3.d;
               if (var1 == Integer.MIN_VALUE) {
                  var1 = var3.f;
               }

               var3.b = var1;
            }
         } else {
            var3.a = var3.e;
            var3.b = var3.f;
         }
      }

   }

   public final Parcelable onSaveInstanceState() {
      AbsSavedState var1 = new AbsSavedState(super.onSaveInstanceState());
      f1 var2 = this.M;
      if (var2 != null) {
         n var3 = var2.b;
         if (var3 != null) {
            var1.c = var3.a;
         }
      }

      var1.d = this.o();
      return var1;
   }

   public final boolean onTouchEvent(MotionEvent var1) {
      int var2 = var1.getActionMasked();
      if (var2 == 0) {
         this.B = false;
      }

      if (!this.B) {
         boolean var3 = super.onTouchEvent(var1);
         if (var2 == 0 && !var3) {
            this.B = true;
         }
      }

      if (var2 == 1 || var2 == 3) {
         this.B = false;
      }

      return true;
   }

   public final int p(View var1, int var2, int var3, int[] var4) {
      g1 var6 = (g1)var1.getLayoutParams();
      int var5 = var6.leftMargin - var4[0];
      var2 += Math.max(0, var5);
      var4[0] = Math.max(0, -var5);
      var5 = this.j(var1, var3);
      var3 = var1.getMeasuredWidth();
      var1.layout(var2, var5, var2 + var3, var1.getMeasuredHeight() + var5);
      return var3 + var6.rightMargin + var2;
   }

   public final int q(View var1, int var2, int var3, int[] var4) {
      g1 var6 = (g1)var1.getLayoutParams();
      int var5 = var6.rightMargin - var4[1];
      var2 -= Math.max(0, var5);
      var4[1] = Math.max(0, -var5);
      var5 = this.j(var1, var3);
      var3 = var1.getMeasuredWidth();
      var1.layout(var2 - var3, var5, var2, var1.getMeasuredHeight() + var5);
      return var2 - (var3 + var6.leftMargin);
   }

   public final int r(View var1, int var2, int var3, int var4, int var5, int[] var6) {
      ViewGroup.MarginLayoutParams var10 = (ViewGroup.MarginLayoutParams)var1.getLayoutParams();
      int var8 = var10.leftMargin - var6[0];
      int var9 = var10.rightMargin - var6[1];
      int var7 = Math.max(0, var8);
      var7 += Math.max(0, var9);
      var6[0] = Math.max(0, -var8);
      var6[1] = Math.max(0, -var9);
      var8 = this.getPaddingLeft();
      var3 = ViewGroup.getChildMeasureSpec(var2, this.getPaddingRight() + var8 + var7 + var3, var10.width);
      var2 = this.getPaddingTop();
      var1.measure(var3, ViewGroup.getChildMeasureSpec(var4, this.getPaddingBottom() + var2 + var10.topMargin + var10.bottomMargin + var5, var10.height));
      return var1.getMeasuredWidth() + var7;
   }

   public final void s(View var1, int var2, int var3, int var4, int var5) {
      ViewGroup.MarginLayoutParams var7 = (ViewGroup.MarginLayoutParams)var1.getLayoutParams();
      int var6 = this.getPaddingLeft();
      var6 = ViewGroup.getChildMeasureSpec(var2, this.getPaddingRight() + var6 + var7.leftMargin + var7.rightMargin + var3, var7.width);
      var2 = this.getPaddingTop();
      var3 = ViewGroup.getChildMeasureSpec(var4, this.getPaddingBottom() + var2 + var7.topMargin + var7.bottomMargin, var7.height);
      var4 = MeasureSpec.getMode(var3);
      var2 = var3;
      if (var4 != 1073741824) {
         var2 = var3;
         if (var5 >= 0) {
            var2 = var5;
            if (var4 != 0) {
               var2 = Math.min(MeasureSpec.getSize(var3), var5);
            }

            var2 = MeasureSpec.makeMeasureSpec(var2, 1073741824);
         }
      }

      var1.measure(var6, var2);
   }

   public void setBackInvokedCallbackEnabled(boolean var1) {
      if (this.S != var1) {
         this.S = var1;
         this.v();
      }

   }

   public void setCollapseContentDescription(int var1) {
      CharSequence var2;
      if (var1 != 0) {
         var2 = this.getContext().getText(var1);
      } else {
         var2 = null;
      }

      this.setCollapseContentDescription(var2);
   }

   public void setCollapseContentDescription(CharSequence var1) {
      if (!TextUtils.isEmpty(var1)) {
         this.c();
      }

      C var2 = this.h;
      if (var2 != null) {
         var2.setContentDescription(var1);
      }

   }

   public void setCollapseIcon(int var1) {
      this.setCollapseIcon(C.b.n(this.getContext(), var1));
   }

   public void setCollapseIcon(Drawable var1) {
      if (var1 != null) {
         this.c();
         this.h.setImageDrawable(var1);
      } else {
         C var2 = this.h;
         if (var2 != null) {
            var2.setImageDrawable(this.f);
         }
      }

   }

   public void setCollapsible(boolean var1) {
      this.P = var1;
      this.requestLayout();
   }

   public void setContentInsetEndWithActions(int var1) {
      int var2 = var1;
      if (var1 < 0) {
         var2 = Integer.MIN_VALUE;
      }

      if (var2 != this.v) {
         this.v = var2;
         if (this.getNavigationIcon() != null) {
            this.requestLayout();
         }
      }

   }

   public void setContentInsetStartWithNavigation(int var1) {
      int var2 = var1;
      if (var1 < 0) {
         var2 = Integer.MIN_VALUE;
      }

      if (var2 != this.u) {
         this.u = var2;
         if (this.getNavigationIcon() != null) {
            this.requestLayout();
         }
      }

   }

   public void setLogo(int var1) {
      this.setLogo(C.b.n(this.getContext(), var1));
   }

   public void setLogo(Drawable var1) {
      E var2;
      if (var1 != null) {
         if (this.e == null) {
            this.e = new E(this.getContext(), (AttributeSet)null, 0);
         }

         if (!this.n(this.e)) {
            this.b(this.e, true);
         }
      } else {
         var2 = this.e;
         if (var2 != null && this.n(var2)) {
            this.removeView(this.e);
            this.E.remove(this.e);
         }
      }

      var2 = this.e;
      if (var2 != null) {
         var2.setImageDrawable(var1);
      }

   }

   public void setLogoDescription(int var1) {
      this.setLogoDescription(this.getContext().getText(var1));
   }

   public void setLogoDescription(CharSequence var1) {
      if (!TextUtils.isEmpty(var1) && this.e == null) {
         this.e = new E(this.getContext(), (AttributeSet)null, 0);
      }

      E var2 = this.e;
      if (var2 != null) {
         var2.setContentDescription(var1);
      }

   }

   public void setNavigationContentDescription(int var1) {
      CharSequence var2;
      if (var1 != 0) {
         var2 = this.getContext().getText(var1);
      } else {
         var2 = null;
      }

      this.setNavigationContentDescription(var2);
   }

   public void setNavigationContentDescription(CharSequence var1) {
      if (!TextUtils.isEmpty(var1)) {
         this.g();
      }

      C var2 = this.d;
      if (var2 != null) {
         var2.setContentDescription(var1);
         C.b.H(this.d, var1);
      }

   }

   public void setNavigationIcon(int var1) {
      this.setNavigationIcon(C.b.n(this.getContext(), var1));
   }

   public void setNavigationIcon(Drawable var1) {
      C var2;
      if (var1 != null) {
         this.g();
         if (!this.n(this.d)) {
            this.b(this.d, true);
         }
      } else {
         var2 = this.d;
         if (var2 != null && this.n(var2)) {
            this.removeView(this.d);
            this.E.remove(this.d);
         }
      }

      var2 = this.d;
      if (var2 != null) {
         var2.setImageDrawable(var1);
      }

   }

   public void setNavigationOnClickListener(View.OnClickListener var1) {
      this.g();
      this.d.setOnClickListener(var1);
   }

   public void setOnMenuItemClickListener(h1 var1) {
      this.I = var1;
   }

   public void setOverflowIcon(Drawable var1) {
      this.e();
      this.a.setOverflowIcon(var1);
   }

   public void setPopupTheme(int var1) {
      if (this.k != var1) {
         this.k = var1;
         if (var1 == 0) {
            this.j = this.getContext();
         } else {
            this.j = new ContextThemeWrapper(this.getContext(), var1);
         }
      }

   }

   public void setSubtitle(int var1) {
      this.setSubtitle(this.getContext().getText(var1));
   }

   public void setSubtitle(CharSequence var1) {
      i0 var3;
      if (!TextUtils.isEmpty(var1)) {
         if (this.c == null) {
            Context var4 = this.getContext();
            var3 = new i0(var4, (AttributeSet)null);
            this.c = var3;
            var3.setSingleLine();
            this.c.setEllipsize(TruncateAt.END);
            int var2 = this.m;
            if (var2 != 0) {
               this.c.setTextAppearance(var4, var2);
            }

            ColorStateList var5 = this.A;
            if (var5 != null) {
               this.c.setTextColor(var5);
            }
         }

         if (!this.n(this.c)) {
            this.b(this.c, true);
         }
      } else {
         var3 = this.c;
         if (var3 != null && this.n(var3)) {
            this.removeView(this.c);
            this.E.remove(this.c);
         }
      }

      var3 = this.c;
      if (var3 != null) {
         var3.setText(var1);
      }

      this.y = var1;
   }

   public void setSubtitleTextColor(int var1) {
      this.setSubtitleTextColor(ColorStateList.valueOf(var1));
   }

   public void setSubtitleTextColor(ColorStateList var1) {
      this.A = var1;
      i0 var2 = this.c;
      if (var2 != null) {
         var2.setTextColor(var1);
      }

   }

   public void setTitle(int var1) {
      this.setTitle(this.getContext().getText(var1));
   }

   public void setTitle(CharSequence var1) {
      i0 var3;
      if (!TextUtils.isEmpty(var1)) {
         if (this.b == null) {
            Context var4 = this.getContext();
            var3 = new i0(var4, (AttributeSet)null);
            this.b = var3;
            var3.setSingleLine();
            this.b.setEllipsize(TruncateAt.END);
            int var2 = this.l;
            if (var2 != 0) {
               this.b.setTextAppearance(var4, var2);
            }

            ColorStateList var5 = this.z;
            if (var5 != null) {
               this.b.setTextColor(var5);
            }
         }

         if (!this.n(this.b)) {
            this.b(this.b, true);
         }
      } else {
         var3 = this.b;
         if (var3 != null && this.n(var3)) {
            this.removeView(this.b);
            this.E.remove(this.b);
         }
      }

      var3 = this.b;
      if (var3 != null) {
         var3.setText(var1);
      }

      this.x = var1;
   }

   public void setTitleMarginBottom(int var1) {
      this.s = var1;
      this.requestLayout();
   }

   public void setTitleMarginEnd(int var1) {
      this.q = var1;
      this.requestLayout();
   }

   public void setTitleMarginStart(int var1) {
      this.p = var1;
      this.requestLayout();
   }

   public void setTitleMarginTop(int var1) {
      this.r = var1;
      this.requestLayout();
   }

   public void setTitleTextColor(int var1) {
      this.setTitleTextColor(ColorStateList.valueOf(var1));
   }

   public void setTitleTextColor(ColorStateList var1) {
      this.z = var1;
      i0 var2 = this.b;
      if (var2 != null) {
         var2.setTextColor(var1);
      }

   }

   public final boolean t(View var1) {
      boolean var2;
      if (var1 != null && var1.getParent() == this && var1.getVisibility() != 8) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public final boolean u() {
      ActionMenuView var2 = this.a;
      boolean var1;
      if (var2 != null) {
         m var3 = var2.t;
         if (var3 != null && var3.l()) {
            var1 = true;
            return var1;
         }
      }

      var1 = false;
      return var1;
   }

   public final void v() {
      if (VERSION.SDK_INT >= 33) {
         OnBackInvokedDispatcher var2 = e1.a(this);
         f1 var3 = this.M;
         boolean var1;
         if (var3 != null && var3.b != null && var2 != null && this.isAttachedToWindow() && this.S) {
            var1 = true;
         } else {
            var1 = false;
         }

         if (var1 && this.R == null) {
            if (this.Q == null) {
               this.Q = e1.b(new c1(this, 0));
            }

            e1.c(var2, this.Q);
            this.R = var2;
         } else if (!var1) {
            var2 = this.R;
            if (var2 != null) {
               e1.d(var2, this.Q);
               this.R = null;
            }
         }
      }

   }

   public static class SavedState extends AbsSavedState {
      public static final Parcelable.Creator CREATOR = new Object();
      public int c;
      public boolean d;

      public SavedState(Parcel var1) {
         this(var1, (ClassLoader)null);
      }

      public SavedState(Parcel var1, ClassLoader var2) {
         super(var1, var2);
         this.c = var1.readInt();
         boolean var3;
         if (var1.readInt() != 0) {
            var3 = true;
         } else {
            var3 = false;
         }

         this.d = var3;
      }

      public void writeToParcel(Parcel var1, int var2) {
         super.writeToParcel(var1, var2);
         var1.writeInt(this.c);
         var1.writeInt(this.d);
      }
   }
}
