package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public final class i implements ActionMode.Callback {
   public final ActionMode.Callback a;
   public final TextView b;
   public Class c;
   public Method d;
   public boolean e;
   public boolean f;

   public i(ActionMode.Callback var1, TextView var2) {
      this.a = var1;
      this.b = var2;
      this.f = false;
   }

   public final boolean onActionItemClicked(ActionMode var1, MenuItem var2) {
      return this.a.onActionItemClicked(var1, var2);
   }

   public final boolean onCreateActionMode(ActionMode var1, Menu var2) {
      return this.a.onCreateActionMode(var1, var2);
   }

   public final void onDestroyActionMode(ActionMode var1) {
      this.a.onDestroyActionMode(var1);
   }

   public final boolean onPrepareActionMode(ActionMode var1, Menu var2) {
      TextView var6 = this.b;
      Context var8 = var6.getContext();
      PackageManager var7 = var8.getPackageManager();
      if (!this.f) {
         this.f = true;

         try {
            Class var5 = Class.forName("com.android.internal.view.menu.MenuBuilder");
            this.c = var5;
            this.d = var5.getDeclaredMethod("removeItemAt", Integer.TYPE);
            this.e = true;
         } catch (NoSuchMethodException | ClassNotFoundException var12) {
            this.c = null;
            this.d = null;
            this.e = false;
         }
      }

      Method var17;
      boolean var10001;
      label127: {
         try {
            if (this.e && this.c.isInstance(var2)) {
               var17 = this.d;
               break label127;
            }
         } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException var16) {
            var10001 = false;
            return this.a.onPrepareActionMode(var1, var2);
         }

         try {
            var17 = var2.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
         } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException var15) {
            var10001 = false;
            return this.a.onPrepareActionMode(var1, var2);
         }
      }

      int var3;
      try {
         var3 = var2.size();
      } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException var14) {
         var10001 = false;
         return this.a.onPrepareActionMode(var1, var2);
      }

      --var3;

      for(; var3 >= 0; --var3) {
         try {
            MenuItem var9 = var2.getItem(var3);
            if (var9.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(var9.getIntent().getAction())) {
               var17.invoke(var2, var3);
            }
         } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException var13) {
            var10001 = false;
            return this.a.onPrepareActionMode(var1, var2);
         }
      }

      ArrayList var18 = new ArrayList();
      if (var8 instanceof Activity) {
         Iterator var10 = var7.queryIntentActivities((new Intent()).setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0).iterator();

         label82:
         while(true) {
            ResolveInfo var20;
            while(true) {
               if (!var10.hasNext()) {
                  break label82;
               }

               var20 = (ResolveInfo)var10.next();
               if (var8.getPackageName().equals(var20.activityInfo.packageName)) {
                  break;
               }

               ActivityInfo var11 = var20.activityInfo;
               if (var11.exported) {
                  String var24 = var11.permission;
                  if (var24 == null || var8.checkSelfPermission(var24) == 0) {
                     break;
                  }
               }
            }

            var18.add(var20);
         }
      }

      for(var3 = 0; var3 < var18.size(); ++var3) {
         ResolveInfo var22 = (ResolveInfo)var18.get(var3);
         MenuItem var19 = var2.add(0, 0, var3 + 100, var22.loadLabel(var7));
         Intent var21 = (new Intent()).setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
         boolean var4;
         if (var6 instanceof Editable && var6.onCheckIsTextEditor() && var6.isEnabled()) {
            var4 = true;
         } else {
            var4 = false;
         }

         var21 = var21.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", var4 ^ true);
         ActivityInfo var23 = var22.activityInfo;
         var19.setIntent(var21.setClassName(var23.packageName, var23.name)).setShowAsAction(1);
      }

      return this.a.onPrepareActionMode(var1, var2);
   }
}
