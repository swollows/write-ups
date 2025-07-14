package t;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.util.Log;

public abstract class c {
   public static final Object a = new Object();

   public static Intent a(androidx.appcompat.app.k var0) {
      Intent var1 = var0.getParentActivityIntent();
      if (var1 != null) {
         return var1;
      } else {
         String var7;
         try {
            var7 = c(var0, var0.getComponentName());
         } catch (PackageManager.NameNotFoundException var4) {
            throw new IllegalArgumentException(var4);
         }

         if (var7 == null) {
            return null;
         } else {
            ComponentName var2 = new ComponentName(var0, var7);

            try {
               Intent var6;
               if (c(var0, var2) == null) {
                  var6 = Intent.makeMainActivity(var2);
               } else {
                  var6 = new Intent();
                  var6 = var6.setComponent(var2);
               }

               return var6;
            } catch (PackageManager.NameNotFoundException var3) {
               StringBuilder var5 = new StringBuilder("getParentActivityIntent: bad parentActivityName '");
               var5.append(var7);
               var5.append("' in manifest");
               Log.e("NavUtils", var5.toString());
               return null;
            }
         }
      }
   }

   public static Intent b(androidx.appcompat.app.k var0, ComponentName var1) {
      String var2 = c(var0, var1);
      if (var2 == null) {
         return null;
      } else {
         var1 = new ComponentName(var1.getPackageName(), var2);
         Intent var3;
         if (c(var0, var1) == null) {
            var3 = Intent.makeMainActivity(var1);
         } else {
            var3 = (new Intent()).setComponent(var1);
         }

         return var3;
      }
   }

   public static String c(Activity var0, ComponentName var1) {
      PackageManager var3 = var0.getPackageManager();
      int var2;
      if (VERSION.SDK_INT >= 29) {
         var2 = 269222528;
      } else {
         var2 = 787072;
      }

      ActivityInfo var7 = var3.getActivityInfo(var1, var2);
      String var4 = var7.parentActivityName;
      if (var4 != null) {
         return var4;
      } else {
         Bundle var5 = var7.metaData;
         if (var5 == null) {
            return null;
         } else {
            String var8 = var5.getString("android.support.PARENT_ACTIVITY");
            if (var8 == null) {
               return null;
            } else {
               var4 = var8;
               if (var8.charAt(0) == '.') {
                  StringBuilder var6 = new StringBuilder();
                  var6.append(var0.getPackageName());
                  var6.append(var8);
                  var4 = var6.toString();
               }

               return var4;
            }
         }
      }
   }

   public static void d(Context param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   public static String e(Context param0) {
      // $FF: Couldn't be decompiled
   }
}
