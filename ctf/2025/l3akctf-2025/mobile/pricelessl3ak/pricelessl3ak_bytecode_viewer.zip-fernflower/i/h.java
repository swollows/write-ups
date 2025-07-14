package i;

import D.q;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import j.n;
import j.o;
import j.s;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import y.a;

public final class h {
   public CharSequence A;
   public CharSequence B;
   public ColorStateList C;
   public PorterDuff.Mode D;
   public final i E;
   public final Menu a;
   public int b;
   public int c;
   public int d;
   public int e;
   public boolean f;
   public boolean g;
   public boolean h;
   public int i;
   public int j;
   public CharSequence k;
   public CharSequence l;
   public int m;
   public char n;
   public int o;
   public char p;
   public int q;
   public int r;
   public boolean s;
   public boolean t;
   public boolean u;
   public int v;
   public int w;
   public String x;
   public String y;
   public o z;

   public h(i var1, Menu var2) {
      this.E = var1;
      this.C = null;
      this.D = null;
      this.a = var2;
      this.b = 0;
      this.c = 0;
      this.d = 0;
      this.e = 0;
      this.f = true;
      this.g = true;
   }

   public final Object a(String var1, Class[] var2, Object[] var3) {
      try {
         Constructor var5 = Class.forName(var1, false, this.E.c.getClassLoader()).getConstructor(var2);
         var5.setAccessible(true);
         Object var6 = var5.newInstance(var3);
         return var6;
      } catch (Exception var4) {
         StringBuilder var7 = new StringBuilder("Cannot instantiate class: ");
         var7.append(var1);
         Log.w("SupportMenuInflater", var7.toString(), var4);
         return null;
      }
   }

   public final void b(MenuItem var1) {
      MenuItem var6 = var1.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
      int var4 = this.r;
      boolean var3 = false;
      boolean var5;
      if (var4 >= 1) {
         var5 = true;
      } else {
         var5 = false;
      }

      var6.setCheckable(var5).setTitleCondensed(this.l).setIcon(this.m);
      var4 = this.v;
      if (var4 >= 0) {
         var1.setShowAsAction(var4);
      }

      String var7 = this.y;
      i var15 = this.E;
      if (var7 != null) {
         if (var15.c.isRestricted()) {
            throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
         }

         if (var15.d == null) {
            var15.d = i.i.a(var15.c);
         }

         Object var8 = var15.d;
         var7 = this.y;
         Object var9 = new Object();
         ((g)var9).a = var8;
         Class var22 = var8.getClass();

         try {
            ((g)var9).b = var22.getMethod(var7, i.g.c);
         } catch (Exception var10) {
            StringBuilder var16 = new StringBuilder("Couldn't resolve menu item onClick handler ");
            var16.append(var7);
            var16.append(" in class ");
            var16.append(var22.getName());
            InflateException var17 = new InflateException(var16.toString());
            var17.initCause(var10);
            throw var17;
         }

         var1.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)var9);
      }

      if (this.r >= 2) {
         if (var1 instanceof n) {
            n var19 = (n)var1;
            var19.x = var19.x & -5 | 4;
         } else if (var1 instanceof s) {
            label136: {
               s var25 = (s)var1;

               Exception var10000;
               label137: {
                  boolean var10001;
                  Method var21;
                  try {
                     var21 = var25.d;
                  } catch (Exception var13) {
                     var10000 = var13;
                     var10001 = false;
                     break label137;
                  }

                  a var27 = var25.c;
                  if (var21 == null) {
                     try {
                        var25.d = var27.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                     } catch (Exception var12) {
                        var10000 = var12;
                        var10001 = false;
                        break label137;
                     }
                  }

                  try {
                     var25.d.invoke(var27, Boolean.TRUE);
                     break label136;
                  } catch (Exception var11) {
                     var10000 = var11;
                     var10001 = false;
                  }
               }

               Exception var23 = var10000;
               Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", var23);
            }
         }
      }

      var7 = this.x;
      if (var7 != null) {
         var1.setActionView((View)this.a(var7, i.i.e, var15.a));
         var3 = true;
      }

      var4 = this.w;
      if (var4 > 0) {
         if (!var3) {
            var1.setActionView(var4);
         } else {
            Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
         }
      }

      o var18 = this.z;
      if (var18 != null) {
         if (var1 instanceof a) {
            ((a)var1).a(var18);
         } else {
            Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
         }
      }

      CharSequence var20 = this.A;
      var5 = var1 instanceof a;
      if (var5) {
         ((a)var1).setContentDescription(var20);
      } else if (VERSION.SDK_INT >= 26) {
         D.q.b(var1, var20);
      }

      var20 = this.B;
      if (var5) {
         ((a)var1).setTooltipText(var20);
      } else if (VERSION.SDK_INT >= 26) {
         D.q.f(var1, var20);
      }

      char var2 = this.n;
      int var14 = this.o;
      if (var5) {
         ((a)var1).setAlphabeticShortcut(var2, var14);
      } else if (VERSION.SDK_INT >= 26) {
         D.q.a(var1, var2, var14);
      }

      var2 = this.p;
      var14 = this.q;
      if (var5) {
         ((a)var1).setNumericShortcut(var2, var14);
      } else if (VERSION.SDK_INT >= 26) {
         D.q.e(var1, var2, var14);
      }

      PorterDuff.Mode var24 = this.D;
      if (var24 != null) {
         if (var5) {
            ((a)var1).setIconTintMode(var24);
         } else if (VERSION.SDK_INT >= 26) {
            D.q.d(var1, var24);
         }
      }

      ColorStateList var26 = this.C;
      if (var26 != null) {
         if (var5) {
            ((a)var1).setIconTintList(var26);
         } else if (VERSION.SDK_INT >= 26) {
            D.q.c(var1, var26);
         }
      }

   }
}
