package androidx.appcompat.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.q1;
import java.util.ArrayList;

public abstract class k extends androidx.fragment.app.i implements l, t.j {
   private static final String DELEGATE_TAG = "androidx:appcompat";
   private r mDelegate;
   private Resources mResources;

   public void addContentView(View var1, ViewGroup.LayoutParams var2) {
      this.initializeViewTreeOwners();
      H var3 = (H)this.getDelegate();
      var3.x();
      ((ViewGroup)var3.A.findViewById(16908290)).addView(var1, var2);
      var3.m.a(var3.l.getCallback());
   }

   public void attachBaseContext(Context param1) {
      // $FF: Couldn't be decompiled
   }

   public void closeOptionsMenu() {
      a var1 = this.getSupportActionBar();
      if (this.getWindow().hasFeature(0) && (var1 == null || !var1.a())) {
         super.closeOptionsMenu();
      }

   }

   public boolean dispatchKeyEvent(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      a var3 = this.getSupportActionBar();
      return var2 == 82 && var3 != null && var3.j(var1) ? true : super.dispatchKeyEvent(var1);
   }

   public View findViewById(int var1) {
      H var2 = (H)this.getDelegate();
      var2.x();
      return var2.l.findViewById(var1);
   }

   public r getDelegate() {
      if (this.mDelegate == null) {
         p var1 = r.a;
         this.mDelegate = new H(this, (Window)null, this, this);
      }

      return this.mDelegate;
   }

   public b getDrawerToggleDelegate() {
      ((H)this.getDelegate()).getClass();
      return (b)(new Object());
   }

   public MenuInflater getMenuInflater() {
      H var2 = (H)this.getDelegate();
      if (var2.p == null) {
         var2.B();
         a var1 = var2.o;
         Context var3;
         if (var1 != null) {
            var3 = var1.e();
         } else {
            var3 = var2.k;
         }

         var2.p = new i.i(var3);
      }

      return var2.p;
   }

   public Resources getResources() {
      Resources var3 = this.mResources;
      if (var3 == null) {
         int var1 = q1.a;
      }

      Resources var2 = var3;
      if (var3 == null) {
         var2 = super.getResources();
      }

      return var2;
   }

   public a getSupportActionBar() {
      H var1 = (H)this.getDelegate();
      var1.B();
      return var1.o;
   }

   public Intent getSupportParentActivityIntent() {
      return t.c.a(this);
   }

   public void invalidateOptionsMenu() {
      this.getDelegate().b();
   }

   public void onConfigurationChanged(Configuration param1) {
      // $FF: Couldn't be decompiled
   }

   public void onContentChanged() {
      this.onSupportContentChanged();
   }

   public void onCreateSupportNavigateUpTaskStack(t.k var1) {
      var1.getClass();
      Intent var4 = this.getSupportParentActivityIntent();
      Intent var3 = var4;
      if (var4 == null) {
         var3 = t.c.a(this);
      }

      if (var3 != null) {
         ComponentName var5 = var3.getComponent();
         k var6 = var1.b;
         ComponentName var11 = var5;
         if (var5 == null) {
            var11 = var3.resolveActivity(var6.getPackageManager());
         }

         ArrayList var12 = var1.a;
         int var2 = var12.size();

         PackageManager.NameNotFoundException var10000;
         label34: {
            Intent var9;
            boolean var10001;
            try {
               var9 = t.c.b(var6, var11);
            } catch (PackageManager.NameNotFoundException var8) {
               var10000 = var8;
               var10001 = false;
               break label34;
            }

            while(true) {
               if (var9 == null) {
                  var12.add(var3);
                  return;
               }

               try {
                  var12.add(var2, var9);
                  var9 = t.c.b(var6, var9.getComponent());
               } catch (PackageManager.NameNotFoundException var7) {
                  var10000 = var7;
                  var10001 = false;
                  break;
               }
            }
         }

         PackageManager.NameNotFoundException var10 = var10000;
         Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
         throw new IllegalArgumentException(var10);
      }
   }

   public void onDestroy() {
      super.onDestroy();
      this.getDelegate().e();
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      if (VERSION.SDK_INT < 26 && !var2.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(var2.getMetaState()) && var2.getRepeatCount() == 0 && !KeyEvent.isModifierKey(var2.getKeyCode())) {
         Window var3 = this.getWindow();
         if (var3 != null && var3.getDecorView() != null && var3.getDecorView().dispatchKeyShortcutEvent(var2)) {
            return true;
         }
      }

      return super.onKeyDown(var1, var2);
   }

   public void onLocalesChanged(z.b var1) {
   }

   public final boolean onMenuItemSelected(int var1, MenuItem var2) {
      if (super.onMenuItemSelected(var1, var2)) {
         return true;
      } else {
         a var3 = this.getSupportActionBar();
         return var2.getItemId() == 16908332 && var3 != null && (var3.d() & 4) != 0 ? this.onSupportNavigateUp() : false;
      }
   }

   public boolean onMenuOpened(int var1, Menu var2) {
      return super.onMenuOpened(var1, var2);
   }

   public void onNightModeChanged(int var1) {
   }

   public void onPanelClosed(int var1, Menu var2) {
      super.onPanelClosed(var1, var2);
   }

   public void onPostCreate(Bundle var1) {
      super.onPostCreate(var1);
      ((H)this.getDelegate()).x();
   }

   public void onPostResume() {
      super.onPostResume();
      H var1 = (H)this.getDelegate();
      var1.B();
      a var2 = var1.o;
      if (var2 != null) {
         var2.m(true);
      }

   }

   public void onPrepareSupportNavigateUpTaskStack(t.k var1) {
   }

   public void onStart() {
      super.onStart();
      ((H)this.getDelegate()).o(true, false);
   }

   public void onStop() {
      super.onStop();
      H var1 = (H)this.getDelegate();
      var1.B();
      a var2 = var1.o;
      if (var2 != null) {
         var2.m(false);
      }

   }

   public void onSupportActionModeFinished(i.b var1) {
   }

   public void onSupportActionModeStarted(i.b var1) {
   }

   @Deprecated
   public void onSupportContentChanged() {
   }

   public boolean onSupportNavigateUp() {
      Intent var1 = this.getSupportParentActivityIntent();
      if (var1 != null) {
         if (this.supportShouldUpRecreateTask(var1)) {
            t.k var4 = new t.k(this);
            this.onCreateSupportNavigateUpTaskStack(var4);
            this.onPrepareSupportNavigateUpTaskStack(var4);
            ArrayList var2 = var4.a;
            if (var2.isEmpty()) {
               throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }

            Intent[] var5 = (Intent[])var2.toArray(new Intent[0]);
            var5[0] = (new Intent(var5[0])).addFlags(268484608);
            var4.b.startActivities(var5, (Bundle)null);

            try {
               this.finishAffinity();
            } catch (IllegalStateException var3) {
               this.finish();
            }
         } else {
            this.supportNavigateUpTo(var1);
         }

         return true;
      } else {
         return false;
      }
   }

   public void onTitleChanged(CharSequence var1, int var2) {
      super.onTitleChanged(var1, var2);
      this.getDelegate().m(var1);
   }

   public i.b onWindowStartingSupportActionMode(i.a var1) {
      return null;
   }

   public void openOptionsMenu() {
      a var1 = this.getSupportActionBar();
      if (this.getWindow().hasFeature(0) && (var1 == null || !var1.k())) {
         super.openOptionsMenu();
      }

   }

   public void setContentView(int var1) {
      this.initializeViewTreeOwners();
      this.getDelegate().h(var1);
   }

   public void setContentView(View var1) {
      this.initializeViewTreeOwners();
      this.getDelegate().j(var1);
   }

   public void setContentView(View var1, ViewGroup.LayoutParams var2) {
      this.initializeViewTreeOwners();
      this.getDelegate().l(var1, var2);
   }

   public void setSupportActionBar(Toolbar var1) {
      H var3 = (H)this.getDelegate();
      if (var3.j instanceof Activity) {
         var3.B();
         a var2 = var3.o;
         if (var2 instanceof V) {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
         }

         var3.p = null;
         if (var2 != null) {
            var2.h();
         }

         var3.o = null;
         if (var1 != null) {
            Object var4 = var3.j;
            CharSequence var5;
            if (var4 instanceof Activity) {
               var5 = ((Activity)var4).getTitle();
            } else {
               var5 = var3.q;
            }

            P var6 = new P(var1, var5, var3.m);
            var3.o = var6;
            var3.m.b = var6.c;
            var1.setBackInvokedCallbackEnabled(true);
         } else {
            var3.m.b = null;
         }

         var3.b();
      }

   }

   @Deprecated
   public void setSupportProgress(int var1) {
   }

   @Deprecated
   public void setSupportProgressBarIndeterminate(boolean var1) {
   }

   @Deprecated
   public void setSupportProgressBarIndeterminateVisibility(boolean var1) {
   }

   @Deprecated
   public void setSupportProgressBarVisibility(boolean var1) {
   }

   public void setTheme(int var1) {
      super.setTheme(var1);
      ((H)this.getDelegate()).T = var1;
   }

   public i.b startSupportActionMode(i.a var1) {
      return this.getDelegate().n(var1);
   }

   public void supportInvalidateOptionsMenu() {
      this.getDelegate().b();
   }

   public void supportNavigateUpTo(Intent var1) {
      this.navigateUpTo(var1);
   }

   public boolean supportRequestWindowFeature(int var1) {
      return this.getDelegate().g(var1);
   }

   public boolean supportShouldUpRecreateTask(Intent var1) {
      return this.shouldUpRecreateTask(var1);
   }
}
