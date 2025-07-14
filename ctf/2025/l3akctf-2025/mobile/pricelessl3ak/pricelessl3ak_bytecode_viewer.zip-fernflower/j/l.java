package j;

import D.U;
import D.V;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class l implements Menu {
   public static final int[] y = new int[]{1, 4, 5, 3, 2, 0};
   public final Context a;
   public final Resources b;
   public boolean c;
   public final boolean d;
   public j e;
   public final ArrayList f;
   public final ArrayList g;
   public boolean h;
   public final ArrayList i;
   public final ArrayList j;
   public boolean k;
   public int l;
   public CharSequence m;
   public Drawable n;
   public View o;
   public boolean p;
   public boolean q;
   public boolean r;
   public boolean s;
   public final ArrayList t;
   public final CopyOnWriteArrayList u;
   public n v;
   public boolean w;
   public boolean x;

   public l(Context var1) {
      boolean var5 = false;
      this.l = 0;
      this.p = false;
      this.q = false;
      this.r = false;
      this.s = false;
      this.t = new ArrayList();
      this.u = new CopyOnWriteArrayList();
      this.w = false;
      this.a = var1;
      Resources var6 = var1.getResources();
      this.b = var6;
      this.f = new ArrayList();
      this.g = new ArrayList();
      this.h = true;
      this.i = new ArrayList();
      this.j = new ArrayList();
      this.k = true;
      boolean var4 = var5;
      if (var6.getConfiguration().keyboard != 1) {
         ViewConfiguration var8 = ViewConfiguration.get(var1);
         int var2 = V.a;
         boolean var3;
         if (VERSION.SDK_INT >= 28) {
            var3 = U.f(var8);
         } else {
            Resources var7 = var1.getResources();
            var2 = var7.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
            if (var2 != 0 && var7.getBoolean(var2)) {
               var3 = true;
            } else {
               var3 = false;
            }
         }

         var4 = var5;
         if (var3) {
            var4 = true;
         }
      }

      this.d = var4;
   }

   public final n a(int var1, int var2, int var3, CharSequence var4) {
      int var5 = (-65536 & var3) >> 16;
      if (var5 >= 0 && var5 < 6) {
         var5 = y[var5] << 16 | '\uffff' & var3;
         n var6 = new n(this, var1, var2, var3, var5, var4, this.l);
         ArrayList var7 = this.f;
         var1 = var7.size() - 1;

         while(true) {
            if (var1 < 0) {
               var1 = 0;
               break;
            }

            if (((n)var7.get(var1)).d <= var5) {
               ++var1;
               break;
            }

            --var1;
         }

         var7.add(var1, var6);
         this.p(true);
         return var6;
      } else {
         throw new IllegalArgumentException("order does not contain a valid category.");
      }
   }

   public final MenuItem add(int var1) {
      return this.a(0, 0, 0, this.b.getString(var1));
   }

   public final MenuItem add(int var1, int var2, int var3, int var4) {
      return this.a(var1, var2, var3, this.b.getString(var4));
   }

   public final MenuItem add(int var1, int var2, int var3, CharSequence var4) {
      return this.a(var1, var2, var3, var4);
   }

   public final MenuItem add(CharSequence var1) {
      return this.a(0, 0, 0, var1);
   }

   public final int addIntentOptions(int var1, int var2, int var3, ComponentName var4, Intent[] var5, Intent var6, int var7, MenuItem[] var8) {
      PackageManager var12 = this.a.getPackageManager();
      byte var11 = 0;
      List var14 = var12.queryIntentActivityOptions(var4, var5, var6, 0);
      int var9;
      if (var14 != null) {
         var9 = var14.size();
      } else {
         var9 = 0;
      }

      int var10 = var11;
      if ((var7 & 1) == 0) {
         this.removeGroup(var1);
         var10 = var11;
      }

      for(; var10 < var9; ++var10) {
         ResolveInfo var13 = (ResolveInfo)var14.get(var10);
         var7 = var13.specificIndex;
         Intent var16;
         if (var7 < 0) {
            var16 = var6;
         } else {
            var16 = var5[var7];
         }

         var16 = new Intent(var16);
         ActivityInfo var15 = var13.activityInfo;
         var16.setComponent(new ComponentName(var15.applicationInfo.packageName, var15.name));
         n var17 = this.a(var1, var2, var3, var13.loadLabel(var12));
         var17.setIcon(var13.loadIcon(var12));
         var17.g = var16;
         if (var8 != null) {
            var7 = var13.specificIndex;
            if (var7 >= 0) {
               var8[var7] = var17;
            }
         }
      }

      return var9;
   }

   public final SubMenu addSubMenu(int var1) {
      return this.addSubMenu(0, 0, 0, this.b.getString(var1));
   }

   public final SubMenu addSubMenu(int var1, int var2, int var3, int var4) {
      return this.addSubMenu(var1, var2, var3, this.b.getString(var4));
   }

   public final SubMenu addSubMenu(int var1, int var2, int var3, CharSequence var4) {
      n var6 = this.a(var1, var2, var3, var4);
      D var5 = new D(this.a, this, var6);
      var6.o = var5;
      var5.setHeaderTitle(var6.e);
      return var5;
   }

   public final SubMenu addSubMenu(CharSequence var1) {
      return this.addSubMenu(0, 0, 0, var1);
   }

   public final void b(x var1, Context var2) {
      this.u.add(new WeakReference(var1));
      var1.e(var2, this);
      this.k = true;
   }

   public final void c(boolean var1) {
      if (!this.s) {
         this.s = true;
         CopyOnWriteArrayList var2 = this.u;
         Iterator var4 = var2.iterator();

         while(var4.hasNext()) {
            WeakReference var5 = (WeakReference)var4.next();
            x var3 = (x)var5.get();
            if (var3 == null) {
               var2.remove(var5);
            } else {
               var3.a(this, var1);
            }
         }

         this.s = false;
      }
   }

   public final void clear() {
      n var1 = this.v;
      if (var1 != null) {
         this.d(var1);
      }

      this.f.clear();
      this.p(true);
   }

   public final void clearHeader() {
      this.n = null;
      this.m = null;
      this.o = null;
      this.p(false);
   }

   public final void close() {
      this.c(true);
   }

   public boolean d(n var1) {
      CopyOnWriteArrayList var9 = this.u;
      boolean var5 = var9.isEmpty();
      boolean var4 = false;
      boolean var3 = false;
      boolean var2 = var4;
      if (!var5) {
         if (this.v != var1) {
            var2 = var4;
         } else {
            this.w();
            Iterator var7 = var9.iterator();
            var2 = var3;

            while(true) {
               var3 = var2;
               if (!var7.hasNext()) {
                  break;
               }

               WeakReference var8 = (WeakReference)var7.next();
               x var6 = (x)var8.get();
               if (var6 == null) {
                  var9.remove(var8);
               } else {
                  var3 = var6.d(var1);
                  var2 = var3;
                  if (var3) {
                     break;
                  }
               }
            }

            this.v();
            var2 = var3;
            if (var3) {
               this.v = null;
               var2 = var3;
            }
         }
      }

      return var2;
   }

   public boolean e(l var1, MenuItem var2) {
      j var4 = this.e;
      boolean var3;
      if (var4 != null && var4.k(var1, var2)) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public boolean f(n var1) {
      CopyOnWriteArrayList var7 = this.u;
      boolean var3 = var7.isEmpty();
      boolean var2 = false;
      if (var3) {
         return false;
      } else {
         this.w();
         Iterator var6 = var7.iterator();

         while(true) {
            var3 = var2;
            if (!var6.hasNext()) {
               break;
            }

            WeakReference var4 = (WeakReference)var6.next();
            x var5 = (x)var4.get();
            if (var5 == null) {
               var7.remove(var4);
            } else {
               var3 = var5.j(var1);
               var2 = var3;
               if (var3) {
                  break;
               }
            }
         }

         this.v();
         if (var3) {
            this.v = var1;
         }

         return var3;
      }
   }

   public final MenuItem findItem(int var1) {
      ArrayList var4 = this.f;
      int var3 = var4.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         n var5 = (n)var4.get(var2);
         if (var5.a == var1) {
            return var5;
         }

         if (var5.hasSubMenu()) {
            MenuItem var6 = var5.o.findItem(var1);
            if (var6 != null) {
               return var6;
            }
         }
      }

      return null;
   }

   public final n g(int var1, KeyEvent var2) {
      ArrayList var8 = this.t;
      var8.clear();
      this.h(var8, var1, var2);
      if (var8.isEmpty()) {
         return null;
      } else {
         int var6 = var2.getMetaState();
         KeyCharacterMap.KeyData var9 = new KeyCharacterMap.KeyData();
         var2.getKeyData(var9);
         int var5 = var8.size();
         if (var5 == 1) {
            return (n)var8.get(0);
         } else {
            boolean var7 = this.n();

            for(int var3 = 0; var3 < var5; ++var3) {
               n var10 = (n)var8.get(var3);
               char var4;
               if (var7) {
                  var4 = var10.j;
               } else {
                  var4 = var10.h;
               }

               char[] var11 = var9.meta;
               if (var4 == var11[0] && (var6 & 2) == 0 || var4 == var11[2] && (var6 & 2) != 0 || var7 && var4 == '\b' && var1 == 67) {
                  return var10;
               }
            }

            return null;
         }
      }
   }

   public final MenuItem getItem(int var1) {
      return (MenuItem)this.f.get(var1);
   }

   public final void h(ArrayList var1, int var2, KeyEvent var3) {
      boolean var9 = this.n();
      int var7 = var3.getModifiers();
      KeyCharacterMap.KeyData var10 = new KeyCharacterMap.KeyData();
      if (var3.getKeyData(var10) || var2 == 67) {
         ArrayList var11 = this.f;
         int var8 = var11.size();

         for(int var4 = 0; var4 < var8; ++var4) {
            n var12 = (n)var11.get(var4);
            if (var12.hasSubMenu()) {
               var12.o.h(var1, var2, var3);
            }

            char var5;
            if (var9) {
               var5 = var12.j;
            } else {
               var5 = var12.h;
            }

            int var6;
            if (var9) {
               var6 = var12.k;
            } else {
               var6 = var12.i;
            }

            if ((var7 & 69647) == (var6 & 69647) && var5 != 0) {
               char[] var13 = var10.meta;
               if ((var5 == var13[0] || var5 == var13[2] || var9 && var5 == '\b' && var2 == 67) && var12.isEnabled()) {
                  var1.add(var12);
               }
            }
         }

      }
   }

   public final boolean hasVisibleItems() {
      if (this.x) {
         return true;
      } else {
         ArrayList var3 = this.f;
         int var2 = var3.size();

         for(int var1 = 0; var1 < var2; ++var1) {
            if (((n)var3.get(var1)).isVisible()) {
               return true;
            }
         }

         return false;
      }
   }

   public final void i() {
      ArrayList var3 = this.l();
      if (this.k) {
         CopyOnWriteArrayList var5 = this.u;
         Iterator var7 = var5.iterator();
         boolean var1 = false;

         while(var7.hasNext()) {
            WeakReference var4 = (WeakReference)var7.next();
            x var6 = (x)var4.get();
            if (var6 == null) {
               var5.remove(var4);
            } else {
               var1 |= var6.f();
            }
         }

         ArrayList var11 = this.i;
         ArrayList var9 = this.j;
         if (var1) {
            var11.clear();
            var9.clear();
            int var2 = var3.size();

            for(int var8 = 0; var8 < var2; ++var8) {
               n var10 = (n)var3.get(var8);
               if (var10.f()) {
                  var11.add(var10);
               } else {
                  var9.add(var10);
               }
            }
         } else {
            var11.clear();
            var9.clear();
            var9.addAll(this.l());
         }

         this.k = false;
      }
   }

   public final boolean isShortcutKey(int var1, KeyEvent var2) {
      boolean var3;
      if (this.g(var1, var2) != null) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public String j() {
      return "android:menu:actionviewstates";
   }

   public l k() {
      return this;
   }

   public final ArrayList l() {
      boolean var3 = this.h;
      ArrayList var6 = this.g;
      if (!var3) {
         return var6;
      } else {
         var6.clear();
         ArrayList var5 = this.f;
         int var2 = var5.size();

         for(int var1 = 0; var1 < var2; ++var1) {
            n var4 = (n)var5.get(var1);
            if (var4.isVisible()) {
               var6.add(var4);
            }
         }

         this.h = false;
         this.k = true;
         return var6;
      }
   }

   public boolean m() {
      return this.w;
   }

   public boolean n() {
      return this.c;
   }

   public boolean o() {
      return this.d;
   }

   public final void p(boolean var1) {
      if (!this.p) {
         if (var1) {
            this.h = true;
            this.k = true;
         }

         CopyOnWriteArrayList var4 = this.u;
         if (!var4.isEmpty()) {
            this.w();
            Iterator var5 = var4.iterator();

            while(var5.hasNext()) {
               WeakReference var2 = (WeakReference)var5.next();
               x var3 = (x)var2.get();
               if (var3 == null) {
                  var4.remove(var2);
               } else {
                  var3.c();
               }
            }

            this.v();
         }
      } else {
         this.q = true;
         if (var1) {
            this.r = true;
         }
      }

   }

   public final boolean performIdentifierAction(int var1, int var2) {
      return this.q(this.findItem(var1), (x)null, var2);
   }

   public final boolean performShortcut(int var1, KeyEvent var2, int var3) {
      n var5 = this.g(var1, var2);
      boolean var4;
      if (var5 != null) {
         var4 = this.q(var5, (x)null, var3);
      } else {
         var4 = false;
      }

      if ((var3 & 2) != 0) {
         this.c(true);
      }

      return var4;
   }

   public final boolean q(MenuItem var1, x var2, int var3) {
      n var12 = (n)var1;
      boolean var7 = false;
      boolean var6 = false;
      if (var12 != null && var12.isEnabled()) {
         boolean var5;
         o var15;
         label117: {
            MenuItem.OnMenuItemClickListener var8 = var12.p;
            if (var8 == null || !var8.onMenuItemClick(var12)) {
               l var9 = var12.n;
               if (!var9.e(var9, var12)) {
                  label112: {
                     Intent var14 = var12.g;
                     if (var14 != null) {
                        try {
                           var9.a.startActivity(var14);
                           break label112;
                        } catch (ActivityNotFoundException var11) {
                           Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", var11);
                        }
                     }

                     var15 = var12.A;
                     if (var15 == null || !var15.b.onPerformDefaultAction()) {
                        var5 = false;
                        break label117;
                     }
                  }
               }
            }

            var5 = true;
         }

         var15 = var12.A;
         boolean var4;
         if (var15 != null && var15.b.hasSubMenu()) {
            var4 = true;
         } else {
            var4 = false;
         }

         if (var12.e()) {
            var5 |= var12.expandActionView();
            var6 = var5;
            if (var5) {
               this.c(true);
               var6 = var5;
            }
         } else if (!var12.hasSubMenu() && !var4) {
            var6 = var5;
            if ((var3 & 1) == 0) {
               this.c(true);
               var6 = var5;
            }
         } else {
            if ((var3 & 4) == 0) {
               this.c(false);
            }

            if (!var12.hasSubMenu()) {
               D var16 = new D(this.a, this, var12);
               var12.o = var16;
               var16.setHeaderTitle(var12.e);
            }

            D var13 = var12.o;
            if (var4) {
               s var18 = var15.c;
               var15.b.onPrepareSubMenu(var13);
            }

            CopyOnWriteArrayList var17 = this.u;
            if (!var17.isEmpty()) {
               if (var2 != null) {
                  var6 = var2.i(var13);
               }

               Iterator var10 = var17.iterator();

               while(true) {
                  var7 = var6;
                  if (!var10.hasNext()) {
                     break;
                  }

                  WeakReference var19 = (WeakReference)var10.next();
                  var2 = (x)var19.get();
                  if (var2 == null) {
                     var17.remove(var19);
                  } else if (!var6) {
                     var6 = var2.i(var13);
                  }
               }
            }

            var5 |= var7;
            var6 = var5;
            if (!var5) {
               this.c(true);
               var6 = var5;
            }
         }

         return var6;
      } else {
         return false;
      }
   }

   public final void r(x var1) {
      CopyOnWriteArrayList var2 = this.u;
      Iterator var5 = var2.iterator();

      while(true) {
         x var3;
         WeakReference var4;
         do {
            if (!var5.hasNext()) {
               return;
            }

            var4 = (WeakReference)var5.next();
            var3 = (x)var4.get();
         } while(var3 != null && var3 != var1);

         var2.remove(var4);
      }
   }

   public final void removeGroup(int var1) {
      ArrayList var6 = this.f;
      int var4 = var6.size();
      int var3 = 0;
      int var2 = 0;

      while(true) {
         if (var2 >= var4) {
            var2 = -1;
            break;
         }

         if (((n)var6.get(var2)).b == var1) {
            break;
         }

         ++var2;
      }

      if (var2 >= 0) {
         for(var4 = var6.size(); var3 < var4 - var2 && ((n)var6.get(var2)).b == var1; ++var3) {
            if (var2 >= 0) {
               ArrayList var5 = this.f;
               if (var2 < var5.size()) {
                  var5.remove(var2);
               }
            }
         }

         this.p(true);
      }

   }

   public final void removeItem(int var1) {
      ArrayList var4 = this.f;
      int var3 = var4.size();
      int var2 = 0;

      while(true) {
         if (var2 >= var3) {
            var2 = -1;
            break;
         }

         if (((n)var4.get(var2)).a == var1) {
            break;
         }

         ++var2;
      }

      if (var2 >= 0) {
         var4 = this.f;
         if (var2 < var4.size()) {
            var4.remove(var2);
            this.p(true);
         }
      }

   }

   public final void s(Bundle var1) {
      if (var1 != null) {
         SparseArray var4 = var1.getSparseParcelableArray(this.j());
         int var3 = this.f.size();

         int var2;
         for(var2 = 0; var2 < var3; ++var2) {
            MenuItem var5 = this.getItem(var2);
            View var6 = var5.getActionView();
            if (var6 != null && var6.getId() != -1) {
               var6.restoreHierarchyState(var4);
            }

            if (var5.hasSubMenu()) {
               ((D)var5.getSubMenu()).s(var1);
            }
         }

         var2 = var1.getInt("android:menu:expandedactionview");
         if (var2 > 0) {
            MenuItem var7 = this.findItem(var2);
            if (var7 != null) {
               var7.expandActionView();
            }
         }

      }
   }

   public final void setGroupCheckable(int var1, boolean var2, boolean var3) {
      ArrayList var9 = this.f;
      int var6 = var9.size();

      for(int var4 = 0; var4 < var6; ++var4) {
         n var8 = (n)var9.get(var4);
         if (var8.b == var1) {
            int var7 = var8.x;
            byte var5;
            if (var3) {
               var5 = 4;
            } else {
               var5 = 0;
            }

            var8.x = var7 & -5 | var5;
            var8.setCheckable(var2);
         }
      }

   }

   public void setGroupDividerEnabled(boolean var1) {
      this.w = var1;
   }

   public final void setGroupEnabled(int var1, boolean var2) {
      ArrayList var6 = this.f;
      int var4 = var6.size();

      for(int var3 = 0; var3 < var4; ++var3) {
         n var5 = (n)var6.get(var3);
         if (var5.b == var1) {
            var5.setEnabled(var2);
         }
      }

   }

   public final void setGroupVisible(int var1, boolean var2) {
      ArrayList var10 = this.f;
      int var6 = var10.size();
      int var4 = 0;

      boolean var3;
      boolean var5;
      for(var3 = false; var4 < var6; var3 = var5) {
         n var9 = (n)var10.get(var4);
         var5 = var3;
         if (var9.b == var1) {
            int var7 = var9.x;
            byte var11;
            if (var2) {
               var11 = 0;
            } else {
               var11 = 8;
            }

            int var8 = var7 & -9 | var11;
            var9.x = var8;
            var5 = var3;
            if (var7 != var8) {
               var5 = true;
            }
         }

         ++var4;
      }

      if (var3) {
         this.p(true);
      }

   }

   public void setQwertyMode(boolean var1) {
      this.c = var1;
      this.p(false);
   }

   public final int size() {
      return this.f.size();
   }

   public final void t(Bundle var1) {
      int var3 = this.f.size();
      SparseArray var5 = null;

      SparseArray var6;
      for(int var2 = 0; var2 < var3; var5 = var6) {
         MenuItem var8 = this.getItem(var2);
         View var7 = var8.getActionView();
         var6 = var5;
         if (var7 != null) {
            var6 = var5;
            if (var7.getId() != -1) {
               SparseArray var4 = var5;
               if (var5 == null) {
                  var4 = new SparseArray();
               }

               var7.saveHierarchyState(var4);
               var6 = var4;
               if (var8.isActionViewExpanded()) {
                  var1.putInt("android:menu:expandedactionview", var8.getItemId());
                  var6 = var4;
               }
            }
         }

         if (var8.hasSubMenu()) {
            ((D)var8.getSubMenu()).t(var1);
         }

         ++var2;
      }

      if (var5 != null) {
         var1.putSparseParcelableArray(this.j(), var5);
      }

   }

   public final void u(int var1, CharSequence var2, int var3, Drawable var4, View var5) {
      if (var5 != null) {
         this.o = var5;
         this.m = null;
         this.n = null;
      } else {
         if (var1 > 0) {
            this.m = this.b.getText(var1);
         } else if (var2 != null) {
            this.m = var2;
         }

         if (var3 > 0) {
            this.n = this.a.getDrawable(var3);
         } else if (var4 != null) {
            this.n = var4;
         }

         this.o = null;
      }

      this.p(false);
   }

   public final void v() {
      this.p = false;
      if (this.q) {
         this.q = false;
         this.p(this.r);
      }

   }

   public final void w() {
      if (!this.p) {
         this.p = true;
         this.q = false;
         this.r = false;
      }

   }
}
