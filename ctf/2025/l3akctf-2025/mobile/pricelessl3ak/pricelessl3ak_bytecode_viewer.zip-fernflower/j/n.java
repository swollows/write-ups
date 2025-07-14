package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

public final class n implements y.a {
   public o A;
   public MenuItem.OnActionExpandListener B;
   public boolean C = false;
   public final int a;
   public final int b;
   public final int c;
   public final int d;
   public CharSequence e;
   public CharSequence f;
   public Intent g;
   public char h;
   public int i = 4096;
   public char j;
   public int k = 4096;
   public Drawable l;
   public int m = 0;
   public final l n;
   public D o;
   public MenuItem.OnMenuItemClickListener p;
   public CharSequence q;
   public CharSequence r;
   public ColorStateList s = null;
   public PorterDuff.Mode t = null;
   public boolean u = false;
   public boolean v = false;
   public boolean w = false;
   public int x = 16;
   public int y;
   public View z;

   public n(l var1, int var2, int var3, int var4, int var5, CharSequence var6, int var7) {
      this.n = var1;
      this.a = var3;
      this.b = var2;
      this.c = var4;
      this.d = var5;
      this.e = var6;
      this.y = var7;
   }

   public static void c(StringBuilder var0, int var1, int var2, String var3) {
      if ((var1 & var2) == var2) {
         var0.append(var3);
      }

   }

   public final y.a a(o var1) {
      this.z = null;
      this.A = var1;
      this.n.p(true);
      var1 = this.A;
      if (var1 != null) {
         var1.a = new D.d(16, this);
         var1.b.setVisibilityListener(var1);
      }

      return this;
   }

   public final o b() {
      return this.A;
   }

   public final boolean collapseActionView() {
      if ((this.y & 8) == 0) {
         return false;
      } else if (this.z == null) {
         return true;
      } else {
         MenuItem.OnActionExpandListener var1 = this.B;
         return var1 != null && !var1.onMenuItemActionCollapse(this) ? false : this.n.d(this);
      }
   }

   public final Drawable d(Drawable var1) {
      Drawable var2 = var1;
      if (var1 != null) {
         var2 = var1;
         if (this.w) {
            if (!this.u) {
               var2 = var1;
               if (!this.v) {
                  return var2;
               }
            }

            var2 = var1.mutate();
            if (this.u) {
               var2.setTintList(this.s);
            }

            if (this.v) {
               var2.setTintMode(this.t);
            }

            this.w = false;
         }
      }

      return var2;
   }

   public final boolean e() {
      int var1 = this.y;
      boolean var3 = false;
      boolean var2 = var3;
      if ((var1 & 8) != 0) {
         if (this.z == null) {
            o var4 = this.A;
            if (var4 != null) {
               this.z = var4.b.onCreateActionView(this);
            }
         }

         var2 = var3;
         if (this.z != null) {
            var2 = true;
         }
      }

      return var2;
   }

   public final boolean expandActionView() {
      if (!this.e()) {
         return false;
      } else {
         MenuItem.OnActionExpandListener var1 = this.B;
         return var1 != null && !var1.onMenuItemActionExpand(this) ? false : this.n.f(this);
      }
   }

   public final boolean f() {
      boolean var1;
      if ((this.x & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final void g(boolean var1) {
      if (var1) {
         this.x |= 32;
      } else {
         this.x &= -33;
      }

   }

   public final ActionProvider getActionProvider() {
      throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
   }

   public final View getActionView() {
      View var1 = this.z;
      if (var1 != null) {
         return var1;
      } else {
         o var2 = this.A;
         if (var2 != null) {
            var1 = var2.b.onCreateActionView(this);
            this.z = var1;
            return var1;
         } else {
            return null;
         }
      }
   }

   public final int getAlphabeticModifiers() {
      return this.k;
   }

   public final char getAlphabeticShortcut() {
      return this.j;
   }

   public final CharSequence getContentDescription() {
      return this.q;
   }

   public final int getGroupId() {
      return this.b;
   }

   public final Drawable getIcon() {
      Drawable var2 = this.l;
      if (var2 != null) {
         return this.d(var2);
      } else {
         int var1 = this.m;
         if (var1 != 0) {
            var2 = C.b.n(this.n.a, var1);
            this.m = 0;
            this.l = var2;
            return this.d(var2);
         } else {
            return null;
         }
      }
   }

   public final ColorStateList getIconTintList() {
      return this.s;
   }

   public final PorterDuff.Mode getIconTintMode() {
      return this.t;
   }

   public final Intent getIntent() {
      return this.g;
   }

   public final int getItemId() {
      return this.a;
   }

   public final ContextMenu.ContextMenuInfo getMenuInfo() {
      return null;
   }

   public final int getNumericModifiers() {
      return this.i;
   }

   public final char getNumericShortcut() {
      return this.h;
   }

   public final int getOrder() {
      return this.c;
   }

   public final SubMenu getSubMenu() {
      return this.o;
   }

   public final CharSequence getTitle() {
      return this.e;
   }

   public final CharSequence getTitleCondensed() {
      CharSequence var1 = this.f;
      if (var1 == null) {
         var1 = this.e;
      }

      return var1;
   }

   public final CharSequence getTooltipText() {
      return this.r;
   }

   public final boolean hasSubMenu() {
      boolean var1;
      if (this.o != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final boolean isActionViewExpanded() {
      return this.C;
   }

   public final boolean isCheckable() {
      int var1 = this.x;
      boolean var2 = true;
      if ((var1 & 1) != 1) {
         var2 = false;
      }

      return var2;
   }

   public final boolean isChecked() {
      boolean var1;
      if ((this.x & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final boolean isEnabled() {
      boolean var1;
      if ((this.x & 16) != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final boolean isVisible() {
      o var3 = this.A;
      boolean var1 = false;
      boolean var2 = false;
      if (var3 != null && var3.b.overridesItemVisibility()) {
         var1 = var2;
         if ((this.x & 8) == 0) {
            var1 = var2;
            if (this.A.b.isVisible()) {
               var1 = true;
            }
         }

         return var1;
      } else {
         if ((this.x & 8) == 0) {
            var1 = true;
         }

         return var1;
      }
   }

   public final MenuItem setActionProvider(ActionProvider var1) {
      throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
   }

   public final MenuItem setActionView(int var1) {
      Context var2 = this.n.a;
      View var3 = LayoutInflater.from(var2).inflate(var1, new LinearLayout(var2), false);
      this.z = var3;
      this.A = null;
      if (var3 != null && var3.getId() == -1) {
         var1 = this.a;
         if (var1 > 0) {
            var3.setId(var1);
         }
      }

      l var4 = this.n;
      var4.k = true;
      var4.p(true);
      return this;
   }

   public final MenuItem setActionView(View var1) {
      this.z = var1;
      this.A = null;
      if (var1 != null && var1.getId() == -1) {
         int var2 = this.a;
         if (var2 > 0) {
            var1.setId(var2);
         }
      }

      l var3 = this.n;
      var3.k = true;
      var3.p(true);
      return this;
   }

   public final MenuItem setAlphabeticShortcut(char var1) {
      if (this.j == var1) {
         return this;
      } else {
         this.j = Character.toLowerCase(var1);
         this.n.p(false);
         return this;
      }
   }

   public final MenuItem setAlphabeticShortcut(char var1, int var2) {
      if (this.j == var1 && this.k == var2) {
         return this;
      } else {
         this.j = Character.toLowerCase(var1);
         this.k = KeyEvent.normalizeMetaState(var2);
         this.n.p(false);
         return this;
      }
   }

   public final MenuItem setCheckable(boolean var1) {
      int var2 = this.x;
      int var3 = var1 | var2 & -2;
      this.x = var3;
      if (var2 != var3) {
         this.n.p(false);
      }

      return this;
   }

   public final MenuItem setChecked(boolean var1) {
      int var3 = this.x;
      int var2 = 2;
      if ((var3 & 4) != 0) {
         l var7 = this.n;
         var7.getClass();
         ArrayList var6 = var7.f;
         int var4 = var6.size();
         var7.w();

         for(var2 = 0; var2 < var4; ++var2) {
            n var8 = (n)var6.get(var2);
            if (var8.b == this.b && (var8.x & 4) != 0 && var8.isCheckable()) {
               boolean var9;
               if (var8 == this) {
                  var9 = true;
               } else {
                  var9 = false;
               }

               int var5 = var8.x;
               byte var10;
               if (var9) {
                  var10 = 2;
               } else {
                  var10 = 0;
               }

               var3 = var10 | var5 & -3;
               var8.x = var3;
               if (var5 != var3) {
                  var8.n.p(false);
               }
            }
         }

         var7.v();
      } else {
         if (!var1) {
            var2 = 0;
         }

         var2 |= var3 & -3;
         this.x = var2;
         if (var3 != var2) {
            this.n.p(false);
         }
      }

      return this;
   }

   public final y.a setContentDescription(CharSequence var1) {
      this.q = var1;
      this.n.p(false);
      return this;
   }

   public final MenuItem setEnabled(boolean var1) {
      if (var1) {
         this.x |= 16;
      } else {
         this.x &= -17;
      }

      this.n.p(false);
      return this;
   }

   public final MenuItem setIcon(int var1) {
      this.l = null;
      this.m = var1;
      this.w = true;
      this.n.p(false);
      return this;
   }

   public final MenuItem setIcon(Drawable var1) {
      this.m = 0;
      this.l = var1;
      this.w = true;
      this.n.p(false);
      return this;
   }

   public final MenuItem setIconTintList(ColorStateList var1) {
      this.s = var1;
      this.u = true;
      this.w = true;
      this.n.p(false);
      return this;
   }

   public final MenuItem setIconTintMode(PorterDuff.Mode var1) {
      this.t = var1;
      this.v = true;
      this.w = true;
      this.n.p(false);
      return this;
   }

   public final MenuItem setIntent(Intent var1) {
      this.g = var1;
      return this;
   }

   public final MenuItem setNumericShortcut(char var1) {
      if (this.h == var1) {
         return this;
      } else {
         this.h = var1;
         this.n.p(false);
         return this;
      }
   }

   public final MenuItem setNumericShortcut(char var1, int var2) {
      if (this.h == var1 && this.i == var2) {
         return this;
      } else {
         this.h = var1;
         this.i = KeyEvent.normalizeMetaState(var2);
         this.n.p(false);
         return this;
      }
   }

   public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener var1) {
      this.B = var1;
      return this;
   }

   public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener var1) {
      this.p = var1;
      return this;
   }

   public final MenuItem setShortcut(char var1, char var2) {
      this.h = var1;
      this.j = Character.toLowerCase(var2);
      this.n.p(false);
      return this;
   }

   public final MenuItem setShortcut(char var1, char var2, int var3, int var4) {
      this.h = var1;
      this.i = KeyEvent.normalizeMetaState(var3);
      this.j = Character.toLowerCase(var2);
      this.k = KeyEvent.normalizeMetaState(var4);
      this.n.p(false);
      return this;
   }

   public final void setShowAsAction(int var1) {
      int var2 = var1 & 3;
      if (var2 != 0 && var2 != 1 && var2 != 2) {
         throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
      } else {
         this.y = var1;
         l var3 = this.n;
         var3.k = true;
         var3.p(true);
      }
   }

   public final MenuItem setShowAsActionFlags(int var1) {
      this.setShowAsAction(var1);
      return this;
   }

   public final MenuItem setTitle(int var1) {
      this.setTitle(this.n.a.getString(var1));
      return this;
   }

   public final MenuItem setTitle(CharSequence var1) {
      this.e = var1;
      this.n.p(false);
      D var2 = this.o;
      if (var2 != null) {
         var2.setHeaderTitle(var1);
      }

      return this;
   }

   public final MenuItem setTitleCondensed(CharSequence var1) {
      this.f = var1;
      this.n.p(false);
      return this;
   }

   public final y.a setTooltipText(CharSequence var1) {
      this.r = var1;
      this.n.p(false);
      return this;
   }

   public final MenuItem setVisible(boolean var1) {
      int var3 = this.x;
      int var2;
      if (var1) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var2 |= var3 & -9;
      this.x = var2;
      if (var3 != var2) {
         l var4 = this.n;
         var4.h = true;
         var4.p(true);
      }

      return this;
   }

   public final String toString() {
      CharSequence var1 = this.e;
      String var2;
      if (var1 != null) {
         var2 = var1.toString();
      } else {
         var2 = null;
      }

      return var2;
   }
}
