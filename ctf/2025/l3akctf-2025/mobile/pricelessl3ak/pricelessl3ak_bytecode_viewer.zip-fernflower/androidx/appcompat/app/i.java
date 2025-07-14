package androidx.appcompat.app;

import D.M;
import D.T;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

public final class i extends Dialog implements DialogInterface, l, androidx.lifecycle.u, Q.h {
   public androidx.lifecycle.w a;
   public final Q.g b;
   public final b.t c;
   public H d;
   public final I e;
   public final h f;

   public i(ContextThemeWrapper var1, int var2) {
      var2 = h(var1, var2);
      int var3;
      if (var2 == 0) {
         TypedValue var4 = new TypedValue();
         var1.getTheme().resolveAttribute(2130903144, var4, true);
         var3 = var4.resourceId;
      } else {
         var3 = var2;
      }

      super(var1, var3);
      this.b = new Q.g(new R.a(this, new Q.f(this, 0)));
      this.c = new b.t(new H.s(3, this));
      this.e = new I(this);
      r var6 = this.b();
      var3 = var2;
      if (var2 == 0) {
         TypedValue var5 = new TypedValue();
         var1.getTheme().resolveAttribute(2130903144, var5, true);
         var3 = var5.resourceId;
      }

      ((H)var6).T = var3;
      var6.d();
      this.f = new h(this.getContext(), this, this.getWindow());
   }

   public static void a(i var0) {
      var0.onBackPressed();
   }

   public static int h(Context var0, int var1) {
      if ((var1 >>> 24 & 255) >= 1) {
         return var1;
      } else {
         TypedValue var2 = new TypedValue();
         var0.getTheme().resolveAttribute(2130903079, var2, true);
         return var2.resourceId;
      }
   }

   public final void addContentView(View var1, ViewGroup.LayoutParams var2) {
      this.d();
      H var3 = (H)this.b();
      var3.x();
      ((ViewGroup)var3.A.findViewById(16908290)).addView(var1, var2);
      var3.m.a(var3.l.getCallback());
   }

   public final r b() {
      if (this.d == null) {
         p var1 = r.a;
         this.d = new H(this.getContext(), this.getWindow(), this, this);
      }

      return this.d;
   }

   public final androidx.lifecycle.w c() {
      androidx.lifecycle.w var2 = this.a;
      androidx.lifecycle.w var1 = var2;
      if (var2 == null) {
         var1 = new androidx.lifecycle.w(this);
         this.a = var1;
      }

      return var1;
   }

   public final void d() {
      Window var1 = this.getWindow();
      i0.d.b(var1);
      View var2 = var1.getDecorView();
      i0.d.d(var2, "window!!.decorView");
      var2.setTag(2131230907, this);
      var1 = this.getWindow();
      i0.d.b(var1);
      var2 = var1.getDecorView();
      i0.d.d(var2, "window!!.decorView");
      var2.setTag(2131230908, this);
      var1 = this.getWindow();
      i0.d.b(var1);
      var2 = var1.getDecorView();
      i0.d.d(var2, "window!!.decorView");
      var2.setTag(2131230909, this);
   }

   public final void dismiss() {
      super.dismiss();
      this.b().e();
   }

   public final boolean dispatchKeyEvent(KeyEvent var1) {
      View var2 = this.getWindow().getDecorView();
      return C.b.k(this.e, var2, this, var1);
   }

   public final void e(Bundle var1) {
      this.b().a();
      this.f(var1);
      this.b().d();
   }

   public final void f(Bundle var1) {
      super.onCreate(var1);
      if (VERSION.SDK_INT >= 33) {
         OnBackInvokedDispatcher var2 = E.c.d(this);
         i0.d.d(var2, "onBackInvokedDispatcher");
         b.t var3 = this.c;
         var3.e = var2;
         var3.c(var3.g);
      }

      this.b.a(var1);
      this.c().e(androidx.lifecycle.n.ON_CREATE);
   }

   public final View findViewById(int var1) {
      H var2 = (H)this.b();
      var2.x();
      return var2.l.findViewById(var1);
   }

   public final void g() {
      this.c().e(androidx.lifecycle.n.ON_DESTROY);
      this.a = null;
      super.onStop();
   }

   public final androidx.lifecycle.p getLifecycle() {
      return this.c();
   }

   public final Q.e getSavedStateRegistry() {
      return this.b.b;
   }

   public final void i(CharSequence var1) {
      super.setTitle(var1);
      this.b().m(var1);
   }

   public final void invalidateOptionsMenu() {
      this.b().b();
   }

   public final boolean j(KeyEvent var1) {
      return super.dispatchKeyEvent(var1);
   }

   public final void onBackPressed() {
      this.c.b();
   }

   public final void onCreate(Bundle var1) {
      byte var7 = 2;
      this.e(var1);
      h var10 = this.f;
      var10.b.setContentView(var10.q);
      Window var11 = var10.c;
      View var18 = var11.findViewById(2131230840);
      View var13 = var18.findViewById(2131230901);
      View var12 = var18.findViewById(2131230796);
      View var14 = var18.findViewById(2131230786);
      ViewGroup var19 = (ViewGroup)var18.findViewById(2131230798);
      var11.setFlags(131072, 131072);
      var19.setVisibility(8);
      View var17 = var19.findViewById(2131230901);
      View var16 = var19.findViewById(2131230796);
      View var15 = var19.findViewById(2131230786);
      ViewGroup var28 = h.a(var17, var13);
      ViewGroup var27 = h.a(var16, var12);
      ViewGroup var29 = h.a(var15, var14);
      NestedScrollView var31 = (NestedScrollView)var11.findViewById(2131230852);
      var10.i = var31;
      var31.setFocusable(false);
      var10.i.setNestedScrollingEnabled(false);
      TextView var32 = (TextView)var27.findViewById(16908299);
      var10.m = var32;
      int var2;
      if (var32 != null) {
         var32.setVisibility(8);
         var10.i.removeView(var10.m);
         if (var10.e != null) {
            ViewGroup var33 = (ViewGroup)var10.i.getParent();
            var2 = var33.indexOfChild(var10.i);
            var33.removeViewAt(var2);
            var33.addView(var10.e, var2, new ViewGroup.LayoutParams(-1, -1));
         } else {
            var27.setVisibility(8);
         }
      }

      Button var34 = (Button)var29.findViewById(16908313);
      var10.f = var34;
      c var35 = var10.w;
      var34.setOnClickListener(var35);
      if (TextUtils.isEmpty((CharSequence)null)) {
         var10.f.setVisibility(8);
         var2 = 0;
      } else {
         var10.f.setText((CharSequence)null);
         var10.f.setVisibility(0);
         var2 = 1;
      }

      var34 = (Button)var29.findViewById(16908314);
      var10.g = var34;
      var34.setOnClickListener(var35);
      if (TextUtils.isEmpty((CharSequence)null)) {
         var10.g.setVisibility(8);
      } else {
         var10.g.setText((CharSequence)null);
         var10.g.setVisibility(0);
         var2 |= 2;
      }

      var34 = (Button)var29.findViewById(16908315);
      var10.h = var34;
      var34.setOnClickListener(var35);
      if (TextUtils.isEmpty((CharSequence)null)) {
         var10.h.setVisibility(8);
      } else {
         var10.h.setText((CharSequence)null);
         var10.h.setVisibility(0);
         var2 |= 4;
      }

      TypedValue var36 = new TypedValue();
      var10.a.getTheme().resolveAttribute(2130903077, var36, true);
      if (var36.data != 0) {
         Button var37;
         LinearLayout.LayoutParams var38;
         if (var2 == 1) {
            var37 = var10.f;
            var38 = (LinearLayout.LayoutParams)var37.getLayoutParams();
            var38.gravity = 1;
            var38.weight = 0.5F;
            var37.setLayoutParams(var38);
         } else if (var2 == 2) {
            var37 = var10.g;
            var38 = (LinearLayout.LayoutParams)var37.getLayoutParams();
            var38.gravity = 1;
            var38.weight = 0.5F;
            var37.setLayoutParams(var38);
         } else if (var2 == 4) {
            var34 = var10.h;
            LinearLayout.LayoutParams var39 = (LinearLayout.LayoutParams)var34.getLayoutParams();
            var39.gravity = 1;
            var39.weight = 0.5F;
            var34.setLayoutParams(var39);
         }
      }

      if (var2 == 0) {
         var29.setVisibility(8);
      }

      if (var10.n != null) {
         ViewGroup.LayoutParams var40 = new ViewGroup.LayoutParams(-1, -2);
         var28.addView(var10.n, 0, var40);
         var11.findViewById(2131230899).setVisibility(8);
      } else {
         var10.k = (ImageView)var11.findViewById(16908294);
         if (!TextUtils.isEmpty(var10.d) && var10.u) {
            var32 = (TextView)var11.findViewById(2131230779);
            var10.l = var32;
            var32.setText(var10.d);
            Drawable var41 = var10.j;
            if (var41 != null) {
               var10.k.setImageDrawable(var41);
            } else {
               var10.l.setPadding(var10.k.getPaddingLeft(), var10.k.getPaddingTop(), var10.k.getPaddingRight(), var10.k.getPaddingBottom());
               var10.k.setVisibility(8);
            }
         } else {
            var11.findViewById(2131230899).setVisibility(8);
            var10.k.setVisibility(8);
            var28.setVisibility(8);
         }
      }

      boolean var3;
      if (var19.getVisibility() != 8) {
         var3 = true;
      } else {
         var3 = false;
      }

      byte var24;
      if (var28 != null && var28.getVisibility() != 8) {
         var24 = 1;
      } else {
         var24 = 0;
      }

      boolean var4;
      if (var29.getVisibility() != 8) {
         var4 = true;
      } else {
         var4 = false;
      }

      if (!var4) {
         var18 = var27.findViewById(2131230894);
         if (var18 != null) {
            var18.setVisibility(0);
         }
      }

      if (var24 != 0) {
         NestedScrollView var20 = var10.i;
         if (var20 != null) {
            var20.setClipToPadding(true);
         }

         if (var10.e != null) {
            var18 = var28.findViewById(2131230898);
         } else {
            var18 = null;
         }

         if (var18 != null) {
            var18.setVisibility(0);
         }
      } else {
         var18 = var27.findViewById(2131230895);
         if (var18 != null) {
            var18.setVisibility(0);
         }
      }

      AlertController$RecycleListView var21 = var10.e;
      if (var21 != null) {
         var21.getClass();
         if (!var4 || var24 == 0) {
            int var8 = var21.getPaddingLeft();
            int var5;
            if (var24 != 0) {
               var5 = var21.getPaddingTop();
            } else {
               var5 = var21.a;
            }

            int var9 = var21.getPaddingRight();
            int var6;
            if (var4) {
               var6 = var21.getPaddingBottom();
            } else {
               var6 = var21.b;
            }

            var21.setPadding(var8, var5, var9, var6);
         }
      }

      if (!var3) {
         Object var23 = var10.e;
         if (var23 == null) {
            var23 = var10.i;
         }

         if (var23 != null) {
            byte var22;
            if (var4) {
               var22 = var7;
            } else {
               var22 = 0;
            }

            var13 = var11.findViewById(2131230851);
            View var25 = var11.findViewById(2131230850);
            WeakHashMap var30 = T.a;
            M.b((View)var23, var22 | var24, 3);
            if (var13 != null) {
               var27.removeView(var13);
            }

            if (var25 != null) {
               var27.removeView(var25);
            }
         }
      }

      var21 = var10.e;
      if (var21 != null) {
         ListAdapter var26 = var10.o;
         if (var26 != null) {
            var21.setAdapter(var26);
            var2 = var10.p;
            if (var2 > -1) {
               var21.setItemChecked(var2, true);
               var21.setSelection(var2);
            }
         }
      }

   }

   public final boolean onKeyDown(int var1, KeyEvent var2) {
      NestedScrollView var3 = this.f.i;
      return var3 != null && var3.j(var2) ? true : super.onKeyDown(var1, var2);
   }

   public final boolean onKeyUp(int var1, KeyEvent var2) {
      NestedScrollView var3 = this.f.i;
      return var3 != null && var3.j(var2) ? true : super.onKeyUp(var1, var2);
   }

   public final Bundle onSaveInstanceState() {
      Bundle var1 = super.onSaveInstanceState();
      i0.d.d(var1, "super.onSaveInstanceState()");
      this.b.b(var1);
      return var1;
   }

   public final void onStart() {
      super.onStart();
      this.c().e(androidx.lifecycle.n.ON_RESUME);
   }

   public final void onStop() {
      this.g();
      H var1 = (H)this.b();
      var1.B();
      a var2 = var1.o;
      if (var2 != null) {
         var2.m(false);
      }

   }

   public final void onSupportActionModeFinished(b var1) {
   }

   public final void onSupportActionModeStarted(b var1) {
   }

   public final b onWindowStartingSupportActionMode(a var1) {
      return null;
   }

   public final void setContentView(int var1) {
      this.d();
      this.b().h(var1);
   }

   public final void setContentView(View var1) {
      this.d();
      this.b().j(var1);
   }

   public final void setContentView(View var1, ViewGroup.LayoutParams var2) {
      this.d();
      this.b().l(var1, var2);
   }

   public final void setTitle(int var1) {
      super.setTitle(var1);
      this.b().m(this.getContext().getString(var1));
   }

   public final void setTitle(CharSequence var1) {
      this.i(var1);
      h var2 = this.f;
      var2.d = var1;
      TextView var3 = var2.l;
      if (var3 != null) {
         var3.setText(var1);
      }

   }
}
