package android.support.v4.app;

import V.b;
import androidx.core.app.RemoteActionCompat;

public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
   public static RemoteActionCompat read(b var0) {
      return androidx.core.app.RemoteActionCompatParcelizer.read(var0);
   }

   public static void write(RemoteActionCompat var0, b var1) {
      androidx.core.app.RemoteActionCompatParcelizer.write(var0, var1);
   }
}
