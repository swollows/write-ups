package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class a implements y.a {
   public CharSequence a;
   public CharSequence b;
   public Intent c;
   public char d;
   public int e;
   public char f;
   public int g;
   public Drawable h;
   public Context i;
   public CharSequence j;
   public CharSequence k;
   public ColorStateList l;
   public PorterDuff.Mode m;
   public boolean n;
   public boolean o;
   public int p;

   public final y.a a(o var1) {
      throw new UnsupportedOperationException();
   }

   public final o b() {
      return null;
   }

   public final void c() {
      Drawable var1 = this.h;
      if (var1 != null && (this.n || this.o)) {
         this.h = var1;
         var1 = var1.mutate();
         this.h = var1;
         if (this.n) {
            var1.setTintList(this.l);
         }

         if (this.o) {
            this.h.setTintMode(this.m);
         }
      }

   }

   public final boolean collapseActionView() {
      return false;
   }

   public final boolean expandActionView() {
      return false;
   }

   public final ActionProvider getActionProvider() {
      throw new UnsupportedOperationException();
   }

   public final View getActionView() {
      return null;
   }

   public final int getAlphabeticModifiers() {
      return this.g;
   }

   public final char getAlphabeticShortcut() {
      return this.f;
   }

   public final CharSequence getContentDescription() {
      return this.j;
   }

   public final int getGroupId() {
      return 0;
   }

   public final Drawable getIcon() {
      return this.h;
   }

   public final ColorStateList getIconTintList() {
      return this.l;
   }

   public final PorterDuff.Mode getIconTintMode() {
      return this.m;
   }

   public final Intent getIntent() {
      return this.c;
   }

   public final int getItemId() {
      return 16908332;
   }

   public final ContextMenu.ContextMenuInfo getMenuInfo() {
      return null;
   }

   public final int getNumericModifiers() {
      return this.e;
   }

   public final char getNumericShortcut() {
      return this.d;
   }

   public final int getOrder() {
      return 0;
   }

   public final SubMenu getSubMenu() {
      return null;
   }

   public final CharSequence getTitle() {
      return this.a;
   }

   public final CharSequence getTitleCondensed() {
      CharSequence var1 = this.b;
      if (var1 == null) {
         var1 = this.a;
      }

      return var1;
   }

   public final CharSequence getTooltipText() {
      return this.k;
   }

   public final boolean hasSubMenu() {
      return false;
   }

   public final boolean isActionViewExpanded() {
      return false;
   }

   public final boolean isCheckable() {
      int var1 = this.p;
      boolean var2 = true;
      if ((var1 & 1) == 0) {
         var2 = false;
      }

      return var2;
   }

   public final boolean isChecked() {
      boolean var1;
      if ((this.p & 2) != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final boolean isEnabled() {
      boolean var1;
      if ((this.p & 16) != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final boolean isVisible() {
      boolean var1;
      if ((this.p & 8) == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final MenuItem setActionProvider(ActionProvider var1) {
      throw new UnsupportedOperationException();
   }

   public final MenuItem setActionView(int var1) {
      throw new UnsupportedOperationException();
   }

   public final MenuItem setActionView(View var1) {
      throw new UnsupportedOperationException();
   }

   public final MenuItem setAlphabeticShortcut(char var1) {
      this.f = Character.toLowerCase(var1);
      return this;
   }

   public final MenuItem setAlphabeticShortcut(char var1, int var2) {
      this.f = Character.toLowerCase(var1);
      this.g = KeyEvent.normalizeMetaState(var2);
      return this;
   }

   public final MenuItem setCheckable(boolean var1) {
      this.p = var1 | this.p & -2;
      return this;
   }

   public final MenuItem setChecked(boolean var1) {
      int var3 = this.p;
      byte var2;
      if (var1) {
         var2 = 2;
      } else {
         var2 = 0;
      }

      this.p = var2 | var3 & -3;
      return this;
   }

   public final MenuItem setContentDescription(CharSequence var1) {
      this.j = var1;
      return this;
   }

   public final y.a setContentDescription(CharSequence var1) {
      this.j = var1;
      return this;
   }

   public final MenuItem setEnabled(boolean var1) {
      int var3 = this.p;
      byte var2;
      if (var1) {
         var2 = 16;
      } else {
         var2 = 0;
      }

      this.p = var2 | var3 & -17;
      return this;
   }

   public final MenuItem setIcon(int var1) {
      this.h = this.i.getDrawable(var1);
      this.c();
      return this;
   }

   public final MenuItem setIcon(Drawable var1) {
      this.h = var1;
      this.c();
      return this;
   }

   public final MenuItem setIconTintList(ColorStateList var1) {
      this.l = var1;
      this.n = true;
      this.c();
      return this;
   }

   public final MenuItem setIconTintMode(PorterDuff.Mode var1) {
      this.m = var1;
      this.o = true;
      this.c();
      return this;
   }

   public final MenuItem setIntent(Intent var1) {
      this.c = var1;
      return this;
   }

   public final MenuItem setNumericShortcut(char var1) {
      this.d = var1;
      return this;
   }

   public final MenuItem setNumericShortcut(char var1, int var2) {
      this.d = var1;
      this.e = KeyEvent.normalizeMetaState(var2);
      return this;
   }

   public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener var1) {
      throw new UnsupportedOperationException();
   }

   public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener var1) {
      return this;
   }

   public final MenuItem setShortcut(char var1, char var2) {
      this.d = var1;
      this.f = Character.toLowerCase(var2);
      return this;
   }

   public final MenuItem setShortcut(char var1, char var2, int var3, int var4) {
      this.d = var1;
      this.e = KeyEvent.normalizeMetaState(var3);
      this.f = Character.toLowerCase(var2);
      this.g = KeyEvent.normalizeMetaState(var4);
      return this;
   }

   public final void setShowAsAction(int var1) {
   }

   public final MenuItem setShowAsActionFlags(int var1) {
      return this;
   }

   public final MenuItem setTitle(int var1) {
      this.a = this.i.getResources().getString(var1);
      return this;
   }

   public final MenuItem setTitle(CharSequence var1) {
      this.a = var1;
      return this;
   }

   public final MenuItem setTitleCondensed(CharSequence var1) {
      this.b = var1;
      return this;
   }

   public final MenuItem setTooltipText(CharSequence var1) {
      this.k = var1;
      return this;
   }

   public final y.a setTooltipText(CharSequence var1) {
      this.k = var1;
      return this;
   }

   public final MenuItem setVisible(boolean var1) {
      int var3 = this.p;
      byte var2 = 8;
      if (var1) {
         var2 = 0;
      }

      this.p = var3 & 8 | var2;
      return this;
   }
}
