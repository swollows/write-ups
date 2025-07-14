package P;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.PackageInfoFlags;

public abstract class j {
   public static PackageInfo a(PackageManager var0, Context var1) {
      return var0.getPackageInfo(var1.getPackageName(), PackageInfoFlags.of(0L));
   }
}
