package androidx.profileinstaller;

import D.d;
import P.g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;
import java.io.Serializable;
import java.util.concurrent.Executor;

public class ProfileInstallReceiver extends BroadcastReceiver {
   public final void onReceive(Context var1, Intent var2) {
      if (var2 != null) {
         String var3 = var2.getAction();
         if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(var3)) {
            g.t(var1, (Executor)(new Object()), new d(7, this), true);
         } else {
            Bundle var7;
            d var9;
            if ("androidx.profileinstaller.action.SKIP_FILE".equals(var3)) {
               var7 = var2.getExtras();
               if (var7 != null) {
                  String var8 = var7.getString("EXTRA_SKIP_FILE_OPERATION");
                  if ("WRITE_SKIP_FILE".equals(var8)) {
                     var9 = new d(7, this);
                     String var4 = var1.getApplicationContext().getPackageName();
                     PackageManager var10 = var1.getPackageManager();

                     PackageInfo var11;
                     try {
                        var11 = var10.getPackageInfo(var4, 0);
                     } catch (PackageManager.NameNotFoundException var5) {
                        var9.m(7, var5);
                        return;
                     }

                     g.e(var11, var1.getFilesDir());
                     var9.m(10, (Serializable)null);
                  } else if ("DELETE_SKIP_FILE".equals(var8)) {
                     (new File(var1.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat")).delete();
                     Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                     this.setResultCode(11);
                  }
               }
            } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(var3)) {
               Process.sendSignal(Process.myPid(), 10);
               Log.d("ProfileInstaller", "");
               this.setResultCode(12);
            } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(var3)) {
               var7 = var2.getExtras();
               if (var7 != null) {
                  var3 = var7.getString("EXTRA_BENCHMARK_OPERATION");
                  var9 = new d(7, this);
                  if ("DROP_SHADER_CACHE".equals(var3)) {
                     File var6;
                     if (VERSION.SDK_INT >= 34) {
                        var6 = var1.createDeviceProtectedStorageContext().getCacheDir();
                     } else {
                        var6 = var1.createDeviceProtectedStorageContext().getCodeCacheDir();
                     }

                     if (g.c(var6)) {
                        var9.m(14, (Serializable)null);
                     } else {
                        var9.m(15, (Serializable)null);
                     }
                  } else {
                     var9.m(16, (Serializable)null);
                  }
               }
            }
         }

      }
   }
}
