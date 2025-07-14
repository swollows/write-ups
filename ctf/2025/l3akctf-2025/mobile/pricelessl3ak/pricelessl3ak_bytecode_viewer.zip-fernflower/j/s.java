package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.app.D;
import java.lang.reflect.Method;

public final class s extends D implements MenuItem {
   public final y.a c;
   public Method d;

   public s(Context var1, y.a var2) {
      super(var1);
      if (var2 != null) {
         this.c = var2;
      } else {
         throw new IllegalArgumentException("Wrapped Object can not be null.");
      }
   }

   public final boolean collapseActionView() {
      return this.c.collapseActionView();
   }

   public final boolean expandActionView() {
      return this.c.expandActionView();
   }

   public final ActionProvider getActionProvider() {
      o var1 = this.c.b();
      return var1 != null ? var1.b : null;
   }

   public final View getActionView() {
      View var2 = this.c.getActionView();
      View var1 = var2;
      if (var2 instanceof p) {
         var1 = (View)((p)var2).a;
      }

      return var1;
   }

   public final int getAlphabeticModifiers() {
      return this.c.getAlphabeticModifiers();
   }

   public final char getAlphabeticShortcut() {
      return this.c.getAlphabeticShortcut();
   }

   public final CharSequence getContentDescription() {
      return this.c.getContentDescription();
   }

   public final int getGroupId() {
      return this.c.getGroupId();
   }

   public final Drawable getIcon() {
      return this.c.getIcon();
   }

   public final ColorStateList getIconTintList() {
      return this.c.getIconTintList();
   }

   public final PorterDuff.Mode getIconTintMode() {
      return this.c.getIconTintMode();
   }

   public final Intent getIntent() {
      return this.c.getIntent();
   }

   public final int getItemId() {
      return this.c.getItemId();
   }

   public final ContextMenu.ContextMenuInfo getMenuInfo() {
      return this.c.getMenuInfo();
   }

   public final int getNumericModifiers() {
      return this.c.getNumericModifiers();
   }

   public final char getNumericShortcut() {
      return this.c.getNumericShortcut();
   }

   public final int getOrder() {
      return this.c.getOrder();
   }

   public final SubMenu getSubMenu() {
      return this.c.getSubMenu();
   }

   public final CharSequence getTitle() {
      return this.c.getTitle();
   }

   public final CharSequence getTitleCondensed() {
      return this.c.getTitleCondensed();
   }

   public final CharSequence getTooltipText() {
      return this.c.getTooltipText();
   }

   public final boolean hasSubMenu() {
      return this.c.hasSubMenu();
   }

   public final boolean isActionViewExpanded() {
      return this.c.isActionViewExpanded();
   }

   public final boolean isCheckable() {
      return this.c.isCheckable();
   }

   public final boolean isChecked() {
      return this.c.isChecked();
   }

   public final boolean isEnabled() {
      return this.c.isEnabled();
   }

   public final boolean isVisible() {
      return this.c.isVisible();
   }

   public final MenuItem setActionProvider(ActionProvider var1) {
      o var2 = new o(this, var1);
      o var3;
      if (var1 != null) {
         var3 = var2;
      } else {
         var3 = null;
      }

      this.c.a(var3);
      return this;
   }

   public final MenuItem setActionView(int var1) {
      y.a var3 = this.c;
      var3.setActionView(var1);
      View var2 = var3.getActionView();
      if (var2 instanceof CollapsibleActionView) {
         var3.setActionView(new p(var2));
      }

      return this;
   }

   public final MenuItem setActionView(View var1) {
      Object var2 = var1;
      if (var1 instanceof CollapsibleActionView) {
         var2 = new p(var1);
      }

      this.c.setActionView((View)var2);
      return this;
   }

   public final MenuItem setAlphabeticShortcut(char var1) {
      this.c.setAlphabeticShortcut(var1);
      return this;
   }

   public final MenuItem setAlphabeticShortcut(char var1, int var2) {
      this.c.setAlphabeticShortcut(var1, var2);
      return this;
   }

   public final MenuItem setCheckable(boolean var1) {
      this.c.setCheckable(var1);
      return this;
   }

   public final MenuItem setChecked(boolean var1) {
      this.c.setChecked(var1);
      return this;
   }

   public final MenuItem setContentDescription(CharSequence var1) {
      this.c.setContentDescription(var1);
      return this;
   }

   public final MenuItem setEnabled(boolean var1) {
      this.c.setEnabled(var1);
      return this;
   }

   public final MenuItem setIcon(int var1) {
      this.c.setIcon(var1);
      return this;
   }

   public final MenuItem setIcon(Drawable var1) {
      this.c.setIcon(var1);
      return this;
   }

   public final MenuItem setIconTintList(ColorStateList var1) {
      this.c.setIconTintList(var1);
      return this;
   }

   public final MenuItem setIconTintMode(PorterDuff.Mode var1) {
      this.c.setIconTintMode(var1);
      return this;
   }

   public final MenuItem setIntent(Intent var1) {
      this.c.setIntent(var1);
      return this;
   }

   public final MenuItem setNumericShortcut(char var1) {
      this.c.setNumericShortcut(var1);
      return this;
   }

   public final MenuItem setNumericShortcut(char var1, int var2) {
      this.c.setNumericShortcut(var1, var2);
      return this;
   }

   public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener var1) {
      q var2;
      if (var1 != null) {
         var2 = new q(this, var1);
      } else {
         var2 = null;
      }

      this.c.setOnActionExpandListener(var2);
      return this;
   }

   public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener var1) {
      r var2;
      if (var1 != null) {
         var2 = new r(this, var1);
      } else {
         var2 = null;
      }

      this.c.setOnMenuItemClickListener(var2);
      return this;
   }

   public final MenuItem setShortcut(char var1, char var2) {
      this.c.setShortcut(var1, var2);
      return this;
   }

   public final MenuItem setShortcut(char var1, char var2, int var3, int var4) {
      this.c.setShortcut(var1, var2, var3, var4);
      return this;
   }

   public final void setShowAsAction(int var1) {
      this.c.setShowAsAction(var1);
   }

   public final MenuItem setShowAsActionFlags(int var1) {
      this.c.setShowAsActionFlags(var1);
      return this;
   }

   public final MenuItem setTitle(int var1) {
      this.c.setTitle(var1);
      return this;
   }

   public final MenuItem setTitle(CharSequence var1) {
      this.c.setTitle(var1);
      return this;
   }

   public final MenuItem setTitleCondensed(CharSequence var1) {
      this.c.setTitleCondensed(var1);
      return this;
   }

   public final MenuItem setTooltipText(CharSequence var1) {
      this.c.setTooltipText(var1);
      return this;
   }

   public final MenuItem setVisible(boolean var1) {
      return this.c.setVisible(var1);
   }
}
