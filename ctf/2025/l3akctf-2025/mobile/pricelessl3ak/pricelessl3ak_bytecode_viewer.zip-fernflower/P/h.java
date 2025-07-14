package P;

import B.b;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Build.VERSION;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;

public final class h implements Choreographer.FrameCallback {
   public final ProfileInstallerInitializer a;
   public final Context b;

   // $FF: synthetic method
   public h(ProfileInstallerInitializer var1, Context var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void doFrame(long var1) {
      this.a.getClass();
      Handler var4;
      if (VERSION.SDK_INT >= 28) {
         var4 = B.b.c(Looper.getMainLooper());
      } else {
         var4 = new Handler(Looper.getMainLooper());
      }

      int var3 = (new Random()).nextInt(Math.max(1000, 1));
      var4.postDelayed(new i(this.b, 0), (long)(var3 + 5000));
   }
}
