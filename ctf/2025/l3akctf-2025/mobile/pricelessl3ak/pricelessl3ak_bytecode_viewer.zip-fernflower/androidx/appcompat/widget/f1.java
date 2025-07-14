package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import j.n;
import java.util.ArrayList;

public final class f1 implements j.x {
   public j.l a;
   public n b;
   public final Toolbar c;

   public f1(Toolbar var1) {
      this.c = var1;
   }

   public final void a(j.l var1, boolean var2) {
   }

   public final void c() {
      if (this.b != null) {
         j.l var3 = this.a;
         if (var3 != null) {
            int var2 = var3.f.size();

            for(int var1 = 0; var1 < var2; ++var1) {
               if (this.a.getItem(var1) == this.b) {
                  return;
               }
            }
         }

         this.d(this.b);
      }

   }

   public final boolean d(n var1) {
      Toolbar var3 = this.c;
      View var4 = var3.i;
      if (var4 instanceof i.c) {
         ((j.p)((i.c)var4)).a.onActionViewCollapsed();
      }

      var3.removeView(var3.i);
      var3.removeView(var3.h);
      var3.i = null;
      ArrayList var5 = var3.E;

      for(int var2 = var5.size() - 1; var2 >= 0; --var2) {
         var3.addView((View)var5.get(var2));
      }

      var5.clear();
      this.b = null;
      var3.requestLayout();
      var1.C = false;
      var1.n.p(false);
      var3.v();
      return true;
   }

   public final void e(Context var1, j.l var2) {
      j.l var4 = this.a;
      if (var4 != null) {
         n var3 = this.b;
         if (var3 != null) {
            var4.d(var3);
         }
      }

      this.a = var2;
   }

   public final boolean f() {
      return false;
   }

   public final boolean i(j.D var1) {
      return false;
   }

   public final boolean j(n var1) {
      Toolbar var3 = this.c;
      var3.c();
      ViewParent var4 = var3.h.getParent();
      if (var4 != var3) {
         if (var4 instanceof ViewGroup) {
            ((ViewGroup)var4).removeView(var3.h);
         }

         var3.addView(var3.h);
      }

      View var6 = var1.getActionView();
      var3.i = var6;
      this.b = var1;
      var4 = var6.getParent();
      if (var4 != var3) {
         if (var4 instanceof ViewGroup) {
            ((ViewGroup)var4).removeView(var3.i);
         }

         g1 var7 = Toolbar.h();
         var7.a = var3.n & 112 | 8388611;
         var7.b = 2;
         var3.i.setLayoutParams(var7);
         var3.addView(var3.i);
      }

      for(int var2 = var3.getChildCount() - 1; var2 >= 0; --var2) {
         var6 = var3.getChildAt(var2);
         if (((g1)var6.getLayoutParams()).b != 2 && var6 != var3.a) {
            var3.removeViewAt(var2);
            var3.E.add(var6);
         }
      }

      var3.requestLayout();
      var1.C = true;
      var1.n.p(false);
      View var5 = var3.i;
      if (var5 instanceof i.c) {
         ((j.p)((i.c)var5)).a.onActionViewExpanded();
      }

      var3.v();
      return true;
   }
}
