package P;

import D.z;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;

public abstract class l {
   public static final r.h a = new Object();
   public static final Object b = new Object();
   public static z c = null;

   public static long a(Context var0) {
      PackageManager var1 = var0.getApplicationContext().getPackageManager();
      return VERSION.SDK_INT >= 33 ? j.a(var1, var0).lastUpdateTime : var1.getPackageInfo(var0.getPackageName(), 0).lastUpdateTime;
   }

   public static z b() {
      z var1 = new z(12);
      c = var1;
      r.h var0 = a;
      var0.getClass();
      if (r.g.f.c(var0, (Object)null, var1)) {
         r.g.b(var0);
      }

      return c;
   }

   public static void c(Context param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }
}
