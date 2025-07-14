package j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Build.VERSION;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.G;
import androidx.appcompat.widget.L0;
import androidx.appcompat.widget.N0;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.O0;
import androidx.appcompat.widget.Q0;
import androidx.appcompat.widget.y0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public final class f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {
   public final Context b;
   public final int c;
   public final int d;
   public final boolean e;
   public final Handler f;
   public final ArrayList g = new ArrayList();
   public final ArrayList h = new ArrayList();
   public final O i = new O(2, this);
   public final c j = new c(this, 0);
   public final D.d k = new D.d(15, this);
   public int l;
   public int m;
   public View n;
   public View o;
   public int p;
   public boolean q;
   public boolean r;
   public int s;
   public int t;
   public boolean u;
   public boolean v;
   public w w;
   public ViewTreeObserver x;
   public u y;
   public boolean z;

   public f(Context var1, View var2, int var3, boolean var4) {
      byte var5 = 0;
      this.l = 0;
      this.m = 0;
      this.b = var1;
      this.n = var2;
      this.d = var3;
      this.e = var4;
      this.u = false;
      byte var7;
      if (var2.getLayoutDirection() == 1) {
         var7 = var5;
      } else {
         var7 = 1;
      }

      this.p = var7;
      Resources var6 = var1.getResources();
      this.c = Math.max(var6.getDisplayMetrics().widthPixels / 2, var6.getDimensionPixelSize(2131099671));
      this.f = new Handler();
   }

   public final void a(l var1, boolean var2) {
      ArrayList var6 = this.h;
      int var4 = var6.size();
      int var3 = 0;

      while(true) {
         if (var3 >= var4) {
            var3 = -1;
            break;
         }

         if (var1 == ((e)var6.get(var3)).b) {
            break;
         }

         ++var3;
      }

      if (var3 >= 0) {
         var4 = var3 + 1;
         if (var4 < var6.size()) {
            ((e)var6.get(var4)).b.c(false);
         }

         e var7 = (e)var6.remove(var3);
         var7.b.r(this);
         boolean var5 = this.z;
         Q0 var11 = var7.a;
         if (var5) {
            N0.b(var11.y, (Transition)null);
            var11.y.setAnimationStyle(0);
         }

         var11.dismiss();
         var4 = var6.size();
         if (var4 > 0) {
            this.p = ((e)var6.get(var4 - 1)).c;
         } else {
            byte var9;
            if (this.n.getLayoutDirection() == 1) {
               var9 = 0;
            } else {
               var9 = 1;
            }

            this.p = var9;
         }

         if (var4 == 0) {
            this.dismiss();
            w var10 = this.w;
            if (var10 != null) {
               var10.a(var1, true);
            }

            ViewTreeObserver var8 = this.x;
            if (var8 != null) {
               if (var8.isAlive()) {
                  this.x.removeGlobalOnLayoutListener(this.i);
               }

               this.x = null;
            }

            this.o.removeOnAttachStateChangeListener(this.j);
            this.y.onDismiss();
         } else if (var2) {
            ((e)var6.get(0)).b.c(false);
         }

      }
   }

   public final boolean b() {
      ArrayList var4 = this.h;
      int var1 = var4.size();
      boolean var3 = false;
      boolean var2 = var3;
      if (var1 > 0) {
         var2 = var3;
         if (((e)var4.get(0)).a.y.isShowing()) {
            var2 = true;
         }
      }

      return var2;
   }

   public final void c() {
      i var3;
      for(Iterator var2 = this.h.iterator(); var2.hasNext(); var3.notifyDataSetChanged()) {
         ListAdapter var1 = ((e)var2.next()).a.c.getAdapter();
         if (var1 instanceof HeaderViewListAdapter) {
            var3 = (i)((HeaderViewListAdapter)var1).getWrappedAdapter();
         } else {
            var3 = (i)var1;
         }
      }

   }

   public final void dismiss() {
      ArrayList var2 = this.h;
      int var1 = var2.size();
      if (var1 > 0) {
         e[] var3 = (e[])var2.toArray(new e[var1]);
         --var1;

         for(; var1 >= 0; --var1) {
            e var4 = var3[var1];
            if (var4.a.y.isShowing()) {
               var4.a.dismiss();
            }
         }
      }

   }

   public final boolean f() {
      return false;
   }

   public final y0 g() {
      ArrayList var1 = this.h;
      y0 var2;
      if (var1.isEmpty()) {
         var2 = null;
      } else {
         var2 = ((e)var1.get(var1.size() - 1)).a.c;
      }

      return var2;
   }

   public final void h(w var1) {
      this.w = var1;
   }

   public final boolean i(D var1) {
      Iterator var2 = this.h.iterator();

      e var3;
      do {
         if (!var2.hasNext()) {
            if (var1.hasVisibleItems()) {
               this.l(var1);
               w var4 = this.w;
               if (var4 != null) {
                  var4.c(var1);
               }

               return true;
            }

            return false;
         }

         var3 = (e)var2.next();
      } while(var1 != var3.b);

      var3.a.c.requestFocus();
      return true;
   }

   public final void k() {
      if (!this.b()) {
         ArrayList var2 = this.g;
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            this.v((l)var3.next());
         }

         var2.clear();
         View var4 = this.n;
         this.o = var4;
         if (var4 != null) {
            boolean var1;
            if (this.x == null) {
               var1 = true;
            } else {
               var1 = false;
            }

            ViewTreeObserver var5 = var4.getViewTreeObserver();
            this.x = var5;
            if (var1) {
               var5.addOnGlobalLayoutListener(this.i);
            }

            this.o.addOnAttachStateChangeListener(this.j);
         }

      }
   }

   public final void l(l var1) {
      var1.b(this, this.b);
      if (this.b()) {
         this.v(var1);
      } else {
         this.g.add(var1);
      }

   }

   public final void n(View var1) {
      if (this.n != var1) {
         this.n = var1;
         this.m = Gravity.getAbsoluteGravity(this.l, var1.getLayoutDirection());
      }

   }

   public final void o(boolean var1) {
      this.u = var1;
   }

   public final void onDismiss() {
      ArrayList var4 = this.h;
      int var2 = var4.size();
      int var1 = 0;

      e var3;
      while(true) {
         if (var1 >= var2) {
            var3 = null;
            break;
         }

         var3 = (e)var4.get(var1);
         if (!var3.a.y.isShowing()) {
            break;
         }

         ++var1;
      }

      if (var3 != null) {
         var3.b.c(false);
      }

   }

   public final boolean onKey(View var1, int var2, KeyEvent var3) {
      if (var3.getAction() == 1 && var2 == 82) {
         this.dismiss();
         return true;
      } else {
         return false;
      }
   }

   public final void p(int var1) {
      if (this.l != var1) {
         this.l = var1;
         this.m = Gravity.getAbsoluteGravity(var1, this.n.getLayoutDirection());
      }

   }

   public final void q(int var1) {
      this.q = true;
      this.s = var1;
   }

   public final void r(PopupWindow.OnDismissListener var1) {
      this.y = (u)var1;
   }

   public final void s(boolean var1) {
      this.v = var1;
   }

   public final void t(int var1) {
      this.r = true;
      this.t = var1;
   }

   public final void v(l var1) {
      Context var7 = this.b;
      LayoutInflater var10 = LayoutInflater.from(var7);
      i var6 = new i(var1, var10, this.e, 2131427339);
      if (!this.b() && this.u) {
         var6.c = true;
      } else if (this.b()) {
         var6.c = j.t.u(var1);
      }

      int var2;
      int var3;
      int var4;
      int var5;
      L0 var9;
      ArrayList var11;
      y0 var12;
      View var18;
      e var21;
      label146: {
         var5 = j.t.m(var6, var7, this.c);
         var9 = new L0(var7, (AttributeSet)null, this.d);
         var9.B = this.k;
         var9.p = this;
         var9.y.setOnDismissListener(this);
         var9.o = this.n;
         var9.l = this.m;
         var9.x = true;
         var9.y.setFocusable(true);
         var9.y.setInputMethodMode(2);
         var9.p(var6);
         var9.r(var5);
         var9.l = this.m;
         var11 = this.h;
         if (var11.size() > 0) {
            e var17 = (e)var11.get(var11.size() - 1);
            l var8 = var17.b;
            var3 = var8.f.size();
            var2 = 0;

            MenuItem var19;
            while(true) {
               if (var2 >= var3) {
                  var19 = null;
                  break;
               }

               var19 = var8.getItem(var2);
               if (var19.hasSubMenu() && var1 == var19.getSubMenu()) {
                  break;
               }

               ++var2;
            }

            if (var19 == null) {
               var8 = null;
               var21 = var17;
               var18 = var8;
               break label146;
            }

            var12 = var17.a.c;
            ListAdapter var22 = var12.getAdapter();
            i var24;
            if (var22 instanceof HeaderViewListAdapter) {
               HeaderViewListAdapter var23 = (HeaderViewListAdapter)var22;
               var3 = var23.getHeadersCount();
               var24 = (i)var23.getWrappedAdapter();
            } else {
               var24 = (i)var22;
               var3 = 0;
            }

            var4 = var24.getCount();
            var2 = 0;

            while(true) {
               if (var2 >= var4) {
                  var2 = -1;
                  break;
               }

               if (var19 == var24.b(var2)) {
                  break;
               }

               ++var2;
            }

            if (var2 == -1) {
               var21 = var17;
            } else {
               var2 = var2 + var3 - var12.getFirstVisiblePosition();
               var21 = var17;
               if (var2 >= 0) {
                  if (var2 < var12.getChildCount()) {
                     View var26 = var12.getChildAt(var2);
                     var21 = var17;
                     var18 = var26;
                     break label146;
                  }

                  var21 = var17;
               }
            }
         } else {
            var21 = null;
         }

         var18 = null;
      }

      if (var18 != null) {
         var2 = VERSION.SDK_INT;
         G var32 = var9.y;
         if (var2 <= 28) {
            Method var27 = Q0.C;
            if (var27 != null) {
               try {
                  var27.invoke(var32, Boolean.FALSE);
               } catch (Exception var14) {
                  Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
               }
            }
         } else {
            O0.a(var32, false);
         }

         byte var15;
         label116: {
            label115: {
               N0.a(var9.y, (Transition)null);
               var12 = ((e)var11.get(var11.size() - 1)).a.c;
               int[] var13 = new int[2];
               var12.getLocationOnScreen(var13);
               Rect var29 = new Rect();
               this.o.getWindowVisibleDisplayFrame(var29);
               if (this.p == 1) {
                  var2 = var13[0];
                  if (var12.getWidth() + var2 + var5 > var29.right) {
                     break label115;
                  }
               } else if (var13[0] - var5 >= 0) {
                  break label115;
               }

               var15 = 1;
               break label116;
            }

            var15 = 0;
         }

         boolean var16;
         if (var15 == 1) {
            var16 = true;
         } else {
            var16 = false;
         }

         this.p = var15;
         if (VERSION.SDK_INT >= 26) {
            var9.o = var18;
            var3 = 0;
            var4 = 0;
         } else {
            int[] var33 = new int[2];
            this.n.getLocationOnScreen(var33);
            int[] var30 = new int[2];
            var18.getLocationOnScreen(var30);
            if ((this.m & 7) == 5) {
               var3 = var33[0];
               var33[0] = this.n.getWidth() + var3;
               var3 = var30[0];
               var30[0] = var18.getWidth() + var3;
            }

            var4 = var30[0] - var33[0];
            var3 = var30[1] - var33[1];
         }

         label107: {
            if ((this.m & 5) == 5) {
               if (var16) {
                  var2 = var4 + var5;
                  break label107;
               }

               var5 = var18.getWidth();
            } else if (var16) {
               var2 = var4 + var18.getWidth();
               break label107;
            }

            var2 = var4 - var5;
         }

         var9.f = var2;
         var9.k = true;
         var9.j = true;
         var9.n(var3);
      } else {
         if (this.q) {
            var9.f = this.s;
         }

         if (this.r) {
            var9.n(this.t);
         }

         Rect var20 = super.a;
         if (var20 != null) {
            var20 = new Rect(var20);
         } else {
            var20 = null;
         }

         var9.w = var20;
      }

      var11.add(new e(var9, var1, this.p));
      var9.k();
      y0 var25 = var9.c;
      var25.setOnKeyListener(this);
      if (var21 == null && this.v && var1.m != null) {
         FrameLayout var28 = (FrameLayout)var10.inflate(2131427346, var25, false);
         TextView var31 = (TextView)var28.findViewById(16908310);
         var28.setEnabled(false);
         var31.setText(var1.m);
         var25.addHeaderView(var28, (Object)null, false);
         var9.k();
      }

   }
}
