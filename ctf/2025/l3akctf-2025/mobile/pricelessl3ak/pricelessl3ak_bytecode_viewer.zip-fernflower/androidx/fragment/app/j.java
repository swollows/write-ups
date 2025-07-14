package androidx.fragment.app;

import D.J;
import D.T;
import D.p0;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public final class j extends FrameLayout {
   public final ArrayList a;
   public final ArrayList b;
   public View.OnApplyWindowInsetsListener c;
   public boolean d;

   public j(Context var1, AttributeSet var2, t var3) {
      i0.d.e(var1, "context");
      i0.d.e(var2, "attrs");
      i0.d.e(var3, "fm");
      super(var1, var2);
      this.a = new ArrayList();
      this.b = new ArrayList();
      this.d = true;
      String var5 = var2.getClassAttribute();
      TypedArray var6 = var1.obtainStyledAttributes(var2, K.a.b, 0, 0);
      String var9 = var5;
      if (var5 == null) {
         var9 = var6.getString(0);
      }

      var5 = var6.getString(1);
      var6.recycle();
      int var4 = this.getId();
      var3.g();
      if (var9 != null) {
         if (var4 == -1) {
            String var8;
            if (var5 != null) {
               var8 = " with tag ".concat(var5);
            } else {
               var8 = "";
            }

            StringBuilder var10 = new StringBuilder("FragmentContainerView must have an android:id to add Fragment ");
            var10.append(var9);
            var10.append(var8);
            throw new IllegalStateException(var10.toString());
         } else {
            var1.getClassLoader();
            var3.t.a(var9);
            i0.d.d((Object)null, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            throw null;
         }
      } else {
         Iterator var7 = var3.c.b().iterator();
         if (var7.hasNext()) {
            var7.next().getClass();
            throw new ClassCastException();
         }
      }
   }

   public final void a(View var1) {
      if (this.b.contains(var1)) {
         this.a.add(var1);
      }

   }

   public final void addView(View var1, int var2, ViewGroup.LayoutParams var3) {
      i0.d.e(var1, "child");
      var1.getTag(2131230811);
      StringBuilder var4 = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
      var4.append(var1);
      var4.append(" is not associated with a Fragment.");
      throw new IllegalStateException(var4.toString().toString());
   }

   public final WindowInsets dispatchApplyWindowInsets(WindowInsets var1) {
      i0.d.e(var1, "insets");
      p0 var5 = p0.c(var1, (View)null);
      View.OnApplyWindowInsetsListener var4 = this.c;
      p0 var9;
      if (var4 != null) {
         WindowInsets var8 = var4.onApplyWindowInsets(this, var1);
         i0.d.d(var8, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
         var9 = p0.c(var8, (View)null);
      } else {
         WeakHashMap var10 = T.a;
         WindowInsets var7 = var5.b();
         var9 = var5;
         if (var7 != null) {
            WindowInsets var6 = J.b(this, var7);
            var9 = var5;
            if (!var6.equals(var7)) {
               var9 = p0.c(var6, this);
            }
         }
      }

      if (!var9.a.i()) {
         int var3 = this.getChildCount();

         for(int var2 = 0; var2 < var3; ++var2) {
            T.b(this.getChildAt(var2), var9);
         }
      }

      return var1;
   }

   public final void dispatchDraw(Canvas var1) {
      i0.d.e(var1, "canvas");
      if (this.d) {
         Iterator var2 = this.a.iterator();

         while(var2.hasNext()) {
            super.drawChild(var1, (View)var2.next(), this.getDrawingTime());
         }
      }

      super.dispatchDraw(var1);
   }

   public final boolean drawChild(Canvas var1, View var2, long var3) {
      i0.d.e(var1, "canvas");
      i0.d.e(var2, "child");
      if (this.d) {
         ArrayList var5 = this.a;
         if (!var5.isEmpty() && var5.contains(var2)) {
            return false;
         }
      }

      return super.drawChild(var1, var2, var3);
   }

   public final void endViewTransition(View var1) {
      i0.d.e(var1, "view");
      this.b.remove(var1);
      if (this.a.remove(var1)) {
         this.d = true;
      }

      super.endViewTransition(var1);
   }

   public final d getFragment() {
      Object var1 = this;

      while(var1 != null) {
         ((View)var1).getTag(2131230811);
         ViewParent var2 = ((View)var1).getParent();
         if (var2 instanceof View) {
            var1 = (View)var2;
         } else {
            var1 = null;
         }
      }

      Context var3 = this.getContext();

      i var4;
      while(true) {
         if (!(var3 instanceof ContextWrapper)) {
            var4 = null;
            break;
         }

         if (var3 instanceof i) {
            var4 = (i)var3;
            break;
         }

         var3 = ((ContextWrapper)var3).getBaseContext();
      }

      if (var4 != null) {
         t var6 = var4.getSupportFragmentManager();
         this.getId();
         var6.g();
         return null;
      } else {
         StringBuilder var5 = new StringBuilder("View ");
         var5.append(this);
         var5.append(" is not within a subclass of FragmentActivity.");
         throw new IllegalStateException(var5.toString());
      }
   }

   public final WindowInsets onApplyWindowInsets(WindowInsets var1) {
      i0.d.e(var1, "insets");
      return var1;
   }

   public final void removeAllViewsInLayout() {
      for(int var1 = this.getChildCount() - 1; -1 < var1; --var1) {
         View var2 = this.getChildAt(var1);
         i0.d.d(var2, "view");
         this.a(var2);
      }

      super.removeAllViewsInLayout();
   }

   public final void removeView(View var1) {
      i0.d.e(var1, "view");
      this.a(var1);
      super.removeView(var1);
   }

   public final void removeViewAt(int var1) {
      View var2 = this.getChildAt(var1);
      i0.d.d(var2, "view");
      this.a(var2);
      super.removeViewAt(var1);
   }

   public final void removeViewInLayout(View var1) {
      i0.d.e(var1, "view");
      this.a(var1);
      super.removeViewInLayout(var1);
   }

   public final void removeViews(int var1, int var2) {
      for(int var3 = var1; var3 < var1 + var2; ++var3) {
         View var4 = this.getChildAt(var3);
         i0.d.d(var4, "view");
         this.a(var4);
      }

      super.removeViews(var1, var2);
   }

   public final void removeViewsInLayout(int var1, int var2) {
      for(int var3 = var1; var3 < var1 + var2; ++var3) {
         View var4 = this.getChildAt(var3);
         i0.d.d(var4, "view");
         this.a(var4);
      }

      super.removeViewsInLayout(var1, var2);
   }

   public final void setDrawDisappearingViewsLast(boolean var1) {
      this.d = var1;
   }

   public void setLayoutTransition(LayoutTransition var1) {
      throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
   }

   public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener var1) {
      i0.d.e(var1, "listener");
      this.c = var1;
   }

   public final void startViewTransition(View var1) {
      i0.d.e(var1, "view");
      if (var1.getParent() == this) {
         this.b.add(var1);
      }

      super.startViewTransition(var1);
   }
}
