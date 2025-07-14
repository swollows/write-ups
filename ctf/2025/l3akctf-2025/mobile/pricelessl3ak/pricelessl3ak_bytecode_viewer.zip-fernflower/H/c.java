package H;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

public final class c extends D.z {
   public final Signature[] c(PackageManager var1, String var2) {
      return var1.getPackageInfo(var2, 64).signatures;
   }
}
